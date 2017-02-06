package com.cjp.filetransport;

import io.netty.buffer.ByteBuf;

//*********************************************************************
//系统名称：DBRDR
//Copyright(C)2000-2016 NARI Information and Communication Technology
//Branch. All rights reserved.
//版本信息：DBRDR-V1.000
//#作者：陈建培$权重：100%#
//版本                     日期              作者       变更记录
//DBRDR-V1.000           2017/2/3            陈建培　     新建
//*********************************************************************
public class Message {
    private Header header;
    private ByteBuf body;

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public ByteBuf getBody() {
        return body;
    }

    public void setBody(ByteBuf body) {
        this.body = body;
    }

    public String toString(){
        return "Message [header=" + header + "]";
    }
}
