package com.cjp.filetransport;

//*********************************************************************
//系统名称：DBRDR
//Copyright(C)2000-2016 NARI Information and Communication Technology
//Branch. All rights reserved.
//版本信息：DBRDR-V1.000
//#作者：陈建培$权重：100%#
//版本                     日期              作者       变更记录
//DBRDR-V1.000           2017/2/4            陈建培　     新建
//*********************************************************************
public class MessageType {

    /**
     * 1.握手请求
     */
    public final byte TYPE_LOGIN_REQUEST = 1;
    /**
     * 2.握手应答
     */
    public final byte TYPE_LOGIN_RESPONSE = 2;
    /**
     * 3.心跳请求
     */
    public final byte TYPE_HEARTBEAT_REQUEST = 3;
    /**
     * 4.心跳应答
     */
    public final byte TYPE_HEARTBEAT_RESPONSE = 4;
    /**
     * 5.开始传输文件
     */
    public final byte TYPE_TRANS_START_REQUEST = 5;
    /**
     * 6.开始传输文件应答
     */
    public final byte TYPE_TRANS_START_RESPONSE = 6;
    /**
     * 7.传输文件数据
     */
    public final byte TYPE_TRANS_DATA_REQUEST = 7;
    /**
     * 8.传输文件数据应答
     */
    public final byte TYPE_TRANS_DATA_RESPONSE = 8;
    /**
     * 9.文件结束
     */
    public final byte TYPE_TRANS_END_RESQUEST = 9;

    /**
     * 10.文件结束应答
     */
    public final byte TYPE_TRANS_END_RESPONSE = 10;
    /**
     * 11.文件传输错误
     */
    public final byte TYPE_TRANS_ERROR = 11;
}
