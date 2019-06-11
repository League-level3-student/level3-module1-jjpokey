package _01_IntroToArrayLists;


/** Copyright The League of Amazing Programmers 2013-2017
 *    Level 3
 *    A Murder of Crows
 *    Duration=.00
 *    Platform=Eclipse
 *    Type=Recipe
 *    Objectives=n/a
*/

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class _03_WhoStolenDiamond {

    ArrayList<Crow> theMurder = new ArrayList<Crow>();

    public static void main(String[] args) {
        _03_WhoStolenDiamond murderOfCrows = new _03_WhoStolenDiamond();
        murderOfCrows.initializeCrows();
        murderOfCrows.findTheDiamond();
    }

    private void findTheDiamond() {
    	int storage = 0;
        /*
         * 1. One of the Crows has eaten the diamond. You need to search through the stomach of each Crow, 
         * then print the name of the guilty Crow.
         */
        for(int c = 0; c < theMurder.size(); c++) {
        	
        	ArrayList<String> findStomachContents = theMurder.get(c).getStomachContents(); 
        	//System.out.println(findStomachContents);
        	if(findStomachContents.contains("diamond")) {
        		System.out.println(theMurder.get(c).getName() + " stole the diamond");
        		storage = c;

        		
        	}
        	
        	
        }
        /* 2. How many innocent crows had to die before the diamond was found? */
        System.out.println(storage + 1 + " famous people were accused before the diamond was found...");
    }

    private void initializeCrows() {
        theMurder.add(new Crow("Will Smith"));
        theMurder.add(new Crow("Adam Sandlers"));
        theMurder.add(new Crow("Justin Beiber"));
        theMurder.add(new Crow("Howie Mandel"));
        theMurder.add(new Crow("Kevin Hart"));
        hideTheDiamond();
    }

    private void hideTheDiamond() {
        int randomness = new Random().nextInt(theMurder.size());
        theMurder.get(randomness).getStomachContents().add("diamond");
    }
}

class Crow {
    private String name;
    private ArrayList<String> stomachContents = new ArrayList<String>();

    public Crow(String name) {
        this.name = name;
        fillCrowsStomach();
    }

    private void fillCrowsStomach() {
        for (int i = 0; i < 10; i++)
            this.stomachContents.add(getRandomCrowFood());
    }

    private String getRandomCrowFood() {
        int randomness = new Random().nextInt(4);
        if (randomness == 0) return "carrion";
        else if (randomness == 1)return "snail";
        else if (randomness == 2)return "acorn";
        else if (randomness == 3)return "spider";
        else return "grub";
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getStomachContents() {
        return stomachContents;
    }

}

