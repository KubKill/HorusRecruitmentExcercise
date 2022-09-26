package com.company.testClasses;

import com.company.Block;
import com.company.CompositeBloc;

import java.util.ArrayList;
import java.util.List;

public class BigBrickElement implements CompositeBloc {
    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public String getMaterial() {
        return "clay";
    }

    @Override
    public List<Block> getBlocks() {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new Brick());
        blocks.add(new Brick());
        return blocks;
    }
}
