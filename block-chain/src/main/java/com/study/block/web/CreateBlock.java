package com.study.block.web;

import com.study.block.dto.Block;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/create")
public class CreateBlock {

    public List<Block> chainList = new ArrayList<Block>();

    public int difficulty = 2;

    public static void main(String[] args) {
        CreateBlock createBlock = new CreateBlock();
        createBlock.createChainlist();
    }


    /**
     * @return
     */
    @PostMapping("/createchainlist")
    public int createChainlist () {
        // 创世区块的上一个区块hash值为0
        System.out.println("正在创建一个区块");
        Block firstBlock = new Block("first block","0");
        this.createBlock(firstBlock);
        System.out.println("创建完毕");
        System.out.println("block1 hash is :" + firstBlock.getHash());

        Block secondBlock = new Block("second block",firstBlock.getHash());
        this.createBlock(secondBlock);
        System.out.println("block2 hash is :" + secondBlock.getHash());

        Block thirdBlock = new Block("thirdBlock block",secondBlock.getHash());
        this.createBlock(thirdBlock);
        System.out.println("block3 hash is :" + thirdBlock.getHash());

        return chainList.size();
    }


    public void createBlock(Block block) {
        block.mineBlock(difficulty);
        chainList.add(block);
    }
}
