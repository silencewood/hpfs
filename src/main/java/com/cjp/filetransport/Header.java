package com.cjp.filetransport;

//*********************************************************************
//系统名称：文件传输
//Copyright(C)2000-2016 NARI Information and Communication Technology
//Branch. All rights reserved.
//版本信息：DBRDR-V1.000
//#作者：陈建培$权重：100%#
//版本                     日期              作者       变更记录
//V1.000           2017/2/3            陈建培　     新建
//*********************************************************************
public class Header {
    /**
     * magic number HPFS
     */
    private int magic = 0x48504653;
    /**
     * major version
     */
    private byte majorVersion = 0x01;

    /**
     * minor version
     */
    private byte minorVersion = 0x01;

    /**
     * message length include body
     */
    private int length;

    /**
     * session id
     */
    private long sessionID;

    /**
     * message type
     * 1.握手请求
     * 2.握手应答
     * 3.心跳请求
     * 4.心跳应答
     * 5.开始传输文件
     * 6.开始传输文件应答
     * 7.传输文件数据
     * 8.传输文件数据应答
     * 9.文件结束
     * 10.文件结束应答
     * 11.文件传输错误
     */
    private byte type;
    /**
     * block number
     */
    private int blockNumber;

    /**
     * block size
     */
    private int blockSize;

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public byte getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(byte majorVersion) {
        this.majorVersion = majorVersion;
    }

    public byte getMinorVersion() {
        return minorVersion;
    }

    public void setMinorVersion(byte minorVersion) {
        this.minorVersion = minorVersion;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public long getSessionID() {
        return sessionID;
    }

    public void setSessionID(long sessionID) {
        this.sessionID = sessionID;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public int getBlockNumber() {
        return blockNumber;
    }

    public void setBlockNumber(int blockNumber) {
        this.blockNumber = blockNumber;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public String toString() {
        return "Header [magic=" + magic + ", majorVersion=" + majorVersion + "," +
                " minorVersion" + minorVersion + ", " + "length=" + length +
                ", sessionID=" + sessionID + ", type=" + type + "blockNumber, =" +
                blockNumber + ", blockSize=" + blockSize + "]";
    }
}
