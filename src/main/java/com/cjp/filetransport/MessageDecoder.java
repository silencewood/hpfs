package com.cjp.filetransport;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;

//*********************************************************************
//系统名称：DBRDR
//Copyright(C)2000-2016 NARI Information and Communication Technology
//Branch. All rights reserved.
//版本信息：DBRDR-V1.000
//#作者：陈建培$权重：100%#
//版本                     日期              作者       变更记录
//DBRDR-V1.000           2017/2/4            陈建培　     新建
//*********************************************************************
public class MessageDecoder extends LengthFieldBasedFrameDecoder{

    public MessageDecoder(int maxFrameLength, int lengthFieldOffset,
                               int lengthFieldLength,int lengthAdjustment, int initialBytesToStrip) {
        super(maxFrameLength, lengthFieldOffset, lengthFieldLength, lengthAdjustment, initialBytesToStrip);
    }


    public Object decode(ChannelHandlerContext ctx, ByteBuf in) throws Exception{
        ByteBuf frame = (ByteBuf)super.decode(ctx, in);
        if(frame == null){
            return null;
        }

        Message message = new Message();
        Header header = new Header();
        header.setMagic(frame.readInt());
        header.setMajorVersion(frame.readByte());
        header.setMinorVersion(frame.readByte());
        header.setLength(frame.readInt());
        header.setSessionID(frame.readLong());
        header.setType(frame.readByte());
        header.setBlockNumber(frame.readInt());
        header.setBlockSize(frame.readInt());

        if(frame.readableBytes() > 0){
            message.setBody(frame.duplicate());
        }
        message.setHeader(header);
        return message;
    }
}
