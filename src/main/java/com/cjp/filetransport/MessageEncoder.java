package com.cjp.filetransport;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

//*********************************************************************
//系统名称：DBRDR
//Copyright(C)2000-2016 NARI Information and Communication Technology
//Branch. All rights reserved.
//版本信息：DBRDR-V1.000
//#作者：陈建培$权重：100%#
//版本                     日期              作者       变更记录
//DBRDR-V1.000           2017/2/4            陈建培　     新建
//*********************************************************************
public class MessageEncoder extends MessageToByteEncoder<Message>{
    @Override
    protected void encode(ChannelHandlerContext ctx, Message msg, ByteBuf out) throws Exception {

        if(msg == null || msg.getHeader() == null){
            throw new Exception("The encode message is null");
        }
        Header header = msg.getHeader();
        out.writeInt(header.getMagic());
        out.writeByte(header.getMajorVersion());
        out.writeByte(header.getMinorVersion());
        out.writeInt(header.getLength());
        out.writeLong(header.getSessionID());
        out.writeByte(header.getType());
        out.writeInt(header.getBlockNumber());
        out.writeInt(header.getBlockSize());
        if (msg.getBody() != null){
            out.writeBytes(msg.getBody());
        }
        int length = out.readableBytes();
        out.setInt(6,length);
    }
}
