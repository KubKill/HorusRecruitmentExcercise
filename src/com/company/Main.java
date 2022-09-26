package com.company;

import com.company.testClasses.BigBrickElement;
import com.company.testClasses.Brick;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Block b1 = new Brick();
        Block b2 = new Brick();
        Block bbe = new BigBrickElement();

        Wall wall = new Wall();
        wall.addBlock(b1);
        wall.addBlock(b2);
        wall.addBlock(bbe);

        System.out.println(wall.count());

        System.out.println(wall.findBlockByColor("red"));
        System.out.println(wall.findBlocksByMaterial("clay"));

        /*
        Poniżej przekazujemy zadanie z prośbą o analizę poniższego kodu i zaimplementowanie metod
        findBlockByColor, findBlocksByMaterial, count w klasie Wall - najchętniej unikając powielania kodu
        i umieszczając całą logikę w klasie Wall. Z uwzględnieniem w analizie i implementacji
        interfejsu CompositeBlock!
         */

        /*
        interface Structure {
        // zwraca dowolny element o podanym kolorze
        Optional findBlockByColor(String color);

        // zwraca wszystkie elementy z danego materiału
        List findBlocksByMaterial(String material);

        //zwraca liczbę wszystkich elementów tworzących strukturę
        int count();
        }

        public class Wall implements Structure {
        private List blocks;
        }

        interface Block {
        String getColor();
        String getMaterial();
        }

        interface CompositeBlock extends Block {
        List getBlocks();
    }
         */

    }
}
