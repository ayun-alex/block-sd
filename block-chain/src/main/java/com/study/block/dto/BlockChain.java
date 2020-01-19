package com.study.block.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BlockChain {

    // 存储区块链
    private List<Object> chain;

    // 交易列表
    private List<Object> deals;

    public BlockChain() {
        this.chain = new ArrayList<Object>();
        this.deals = new ArrayList<Object>();
    }


    /**
     * Gets the value of chain.
     *
     * @return the value of chain
     */
    public List<Object> getChain() {
        return chain;
    }

    /**
     * Sets the chain.
     *
     * <p>You can use getChain() to get the value of chain</p>
     *
     * @param chain chain
     */
    public void setChain(List<Object> chain) {
        this.chain = chain;
    }

    /**
     * Gets the value of deals.
     *
     * @return the value of deals
     */
    public List<Object> getDeals() {
        return deals;
    }

    /**
     * Sets the deals.
     *
     * <p>You can use getDeals() to get the value of deals</p>
     *
     * @param deals deals
     */
    public void setDeals(List<Object> deals) {
        this.deals = deals;
    }

    public Object lastBlock() {
        return null;
    }

    public HashMap<String, Object> newBlock() {
        return null;
    }

    public int newTransactions() {
        return 0;
    }

    public static Object hash(HashMap<String, Object> block) {
        return null;
    }
}
