package com.Java_WordSearchGame.game;

import java.util.Random;
import java.util.ArrayList;

public class Game {

    public static boolean overlap(Words w, Board gameBoard){
        int size = w.getSize();
        ArrayList<Integer> directions = new ArrayList<Integer>(w.getDirections());
        int row = w.getLocationRow();
        int col = w.getLocationCol();
        String letters = w.getWord();
        int dir = w.getDirection();

        if (dir == 0){
            for (int i=0; i < size; i++){
                if (gameBoard.checkEmptyOrSame(row-i, col, letters.charAt(i)) == false){
                    return true;
                }
            }
        }

        else if (dir == 1){
            for (int i=0; i < size; i++){
                if (gameBoard.checkEmptyOrSame(row-i, col+i, letters.charAt(i)) == false){
                    return true;
                }
            }
        }

        else if (dir == 2){
            for (int i=0; i < size; i++){
                if (gameBoard.checkEmptyOrSame(row, col+i, letters.charAt(i)) == false){
                    return true;
                }
            }
        }

        else if (dir == 3){
            for (int i=0; i < size; i++){
                if (gameBoard.checkEmptyOrSame(row+i, col+i, letters.charAt(i)) == false){
                    return true;
                }
            }
        }

        else if (dir == 4){
            for (int i=0; i < size; i++){
                if (gameBoard.checkEmptyOrSame(row+i, col, letters.charAt(i)) == false){
                    return true;
                }
            }
        }

        else if (dir == 5){
            for (int i=0; i < size; i++){
                if (gameBoard.checkEmptyOrSame(row+i, col-i, letters.charAt(i)) == false){
                    return true;
                }
            }
        }

        else if (dir == 6){
            for (int i=0; i < size; i++){
                if (gameBoard.checkEmptyOrSame(row, col-i, letters.charAt(i)) == false){
                    return true;
                }
            }
        }

        else {
            for (int i=0; i < size; i++){
                if (gameBoard.checkEmptyOrSame(row-i, col-i, letters.charAt(i)) == false){
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Board gameBoard = new Board();

        ArrayList<Integer> directions = new ArrayList<Integer>();

        Random r = new Random();
        int dir;
        int row;
        int col;
        int counter;

        Words objectivec = new Words("OBJECTIVEC", 10);
        gameBoard.addWord(objectivec);

        Words variable = new Words("VARIABLE", 8);

        if (overlap(variable, gameBoard) == true){
            directions = variable.getDirections();

            while(overlap(variable, gameBoard) == true){

                dir = variable.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    variable = null;
                    variable = new Words("VARIABLE", 8);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = variable.getLocationRow();
                    col = variable.getLocationCol();
                    variable = null;
                    variable = new Words("VARIABLE", 8, col, row, dir, directions);
                }
            }
            gameBoard.addWord(variable);
        }

        else{
            gameBoard.addWord(variable);
        }

        Words mobile = new Words("MOBILE", 6);

        if (overlap(mobile, gameBoard) == true){
            directions = mobile.getDirections();

            while(overlap(mobile, gameBoard) == true){
                dir = mobile.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    mobile = null;
                    mobile = new Words("MOBILE", 6);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = mobile.getLocationRow();
                    col = mobile.getLocationCol();
                    mobile = null;
                    mobile = new Words("MOBILE", 6, col, row, dir, directions);
                }
            }
            gameBoard.addWord(mobile);
        }

        else{
            gameBoard.addWord(mobile);
        }

        Words kotlin = new Words("KOTLIN", 6);

        if (overlap(kotlin, gameBoard) == true){
            directions = kotlin.getDirections();

            while(overlap(kotlin, gameBoard) == true){
                dir = kotlin.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    kotlin = null;
                    kotlin = new Words("KOTLIN", 6);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = kotlin.getLocationRow();
                    col = kotlin.getLocationCol();
                    kotlin = null;
                    kotlin = new Words("KOTLIN", 6, col, row, dir, directions);
                }
            }
            gameBoard.addWord(kotlin);
        }

        else{
            gameBoard.addWord(kotlin);
        }

        Words swift = new Words("SWIFT", 5);

        if (overlap(swift, gameBoard) == true){
            directions = swift.getDirections();

            while(overlap(swift, gameBoard) == true){
                dir = swift.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    swift = null;
                    swift = new Words("SWIFT", 5);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = swift.getLocationRow();
                    col = swift.getLocationCol();
                    swift = null;
                    swift = new Words("SWIFT", 5, col, row, dir, directions);
                }
            }
            gameBoard.addWord(swift);
        }

        else{
            gameBoard.addWord(swift);
        }

        Words java = new Words("JAVA", 4);

        if (overlap(java, gameBoard) == true){
            directions = java.getDirections();

            while(overlap(java, gameBoard) == true){
                dir = java.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    java = null;
                    java = new Words("JAVA", 4);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = java.getLocationRow();
                    col = java.getLocationCol();
                    java = null;
                    java = new Words("JAVA", 4, col, row, dir, directions);
                }
            }
            gameBoard.addWord(java);
        }

        else{
            gameBoard.addWord(java);
        }

        gameBoard.fillUp();

        System.out.println();
        System.out.println("Welcome to Word Search Game!");
        System.out.println("Try to find the following words: OBJECTIVEC, JAVA, SWIFT, KOTLIN, VARIABLE, MOBILE");
        System.out.println();

        for (int i=0; i< 10; i++){
            for (int j=0; j<10; j++){
                System.out.print(gameBoard.getValue(i, j)+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
