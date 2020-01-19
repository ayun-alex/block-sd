package com.study.block.dto;

import com.study.block.utils.Encrypt;
import com.study.block.utils.StringUtil;

import java.math.BigInteger;
import java.util.Date;

public class Block {

    // 本区块hash值
    private  String hash;

    // 上一区块hash值
    private String previousHash;

    // 数据
    private String data;

    // 时间戳
    private long timeStamp;

    // 随机数（用于工作量证明）
    private int nonce;

    public  Block (String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.timeStamp = new Date().getTime();
        this.hash = getCurrHahs();
    }

    public String  getCurrHahs() {
        String currHash = Encrypt.getSHA256(previousHash+Long.toString(timeStamp)+data + String.valueOf(nonce));
        return currHash;
    }

    //挖矿
    public void mineBlock(int difficulty) {
        //目标值，difficulty越大，下面计算量越大
        String target = StringUtil.getDificultyString(difficulty);
        //difficulty如果为5，那么target则为 00000
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce ++;
            hash = getCurrHahs();
        }
        System.out.println("创建区块:" + hash);
    }
    /**
     * Gets the value of hash.
     *
     * @return the value of hash
     */
    public String getHash() {
        return hash;
    }

    /**
     * Sets the hash.
     *
     * <p>You can use getHash() to get the value of hash</p>
     *
     * @param hash hash
     */
    public void setHash(String hash) {
        this.hash = hash;
    }

    /**
     * Gets the value of previousHash.
     *
     * @return the value of previousHash
     */
    public String getPreviousHash() {
        return previousHash;
    }

    /**
     * Sets the previousHash.
     *
     * <p>You can use getPreviousHash() to get the value of previousHash</p>
     *
     * @param previousHash previousHash
     */
    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    /**
     * Gets the value of data.
     *
     * @return the value of data
     */
    public String getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * <p>You can use getData() to get the value of data</p>
     *
     * @param data data
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Gets the value of timeStamp.
     *
     * @return the value of timeStamp
     */
    public long getTimeStamp() {
        return timeStamp;
    }

    /**
     * Sets the timeStamp.
     *
     * <p>You can use getTimeStamp() to get the value of timeStamp</p>
     *
     * @param timeStamp timeStamp
     */
    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
}
