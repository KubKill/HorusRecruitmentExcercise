package com.company.testClasses;

import com.company.Block;

public class Brick implements Block {

    @Override
    public String getColor() {
        return "red";
    }

    @Override
    public String getMaterial() {
        return "clay";
    }
}
