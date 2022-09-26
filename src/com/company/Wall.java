package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private List<Block> blocks = new ArrayList<>();

    @Override
    public Optional findBlockByColor(String color) {
        Block blockFound = null;

        for (Block block :
                blocks) {
            if (block instanceof CompositeBloc compositeBlock) {
                for (Block blockFromComposite :
                        compositeBlock.getBlocks()) {
                    if (blockFromComposite.getColor().equals(color)) {
                        blockFound = block;
                        break;
                    }
                }
            } else {
                if (block.getColor().equals(color)) {
                    blockFound = block;
                    break;
                }
            }
        }

        return (blockFound == null) ? Optional.empty() : Optional.of(blockFound);
    }


    @Override
    public List findBlocksByMaterial(String material) {
        List<Block> blocksFound = new ArrayList<>();

        for (Block block :
                blocks) {
            if (block instanceof CompositeBloc compositeBlock) {
                for (Block blockFromComposite :
                        compositeBlock.getBlocks()) {
                    if (blockFromComposite.getMaterial().equals(material)) {
                        blocksFound.add(block);
                    }
                }
            } else {
                if (block.getMaterial().equals(material)) blocksFound.add(block);
            }
        }

        return (blocksFound.isEmpty()) ? null : blocksFound;
    }

    @Override
    public int count() {
        int blockCounter = 0;

        for (Block block:
             blocks) {
            if (block instanceof CompositeBloc compositeBlock) {
                blockCounter += compositeBlock.getBlocks().size();
            } else blockCounter += 1;
        }

        return blockCounter;
    }

    public void addBlock(Block block) {
        blocks.add(block);
    };
}
