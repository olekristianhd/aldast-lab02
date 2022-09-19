/*
 * This file is part of NTNU's IDATA2302 Lab02.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab02;

/**
 * Represent an array.
 *
 * @author Ole Kristian Dvergsdal
 * @version 1.0
 */
public class Sequence {

    private int capacity;
    private int length;
    private int[] myArray;

    public Sequence() {
        this.capacity = 100;
        this.length = 0;
        this.myArray = new int[capacity];
    }

    /**
     * Return the length of the sequence
     * @return length of sequence
     */
    public int getLength() {
        return length;
    }

    /**
     * Return the capacity of the sequence
     * @return capacity of sequence
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Return an element in the array from a given index
     * @param i the index that you want to return
     * @return element of a given index
     */
    public int getElementFromIndex(int i) {
        return this.myArray[i];
    }

    /**
     * Copy the element from the array to a new array list.
     * @param intArray the new arraylist that you want to copy the element from the array to.
     */
    public void updateArray(int[] intArray) {
        int i = 0;
        while (i < this.getLength()) {
            intArray[i] = this.getElementFromIndex(i); i++;
        }
    }

    /**
     * Add element to the sequence.
     * @param element what element you want to add to the array.
     */
    public void insert ( int element) {
        if (this.length == this.capacity) {
            this.capacity = this.capacity * 2;
        }
        length++;
        int[] intArray = new int[this.getCapacity()];
        this.updateArray(intArray);
        intArray[this.getLength() - 1] = element;
        myArray = intArray;
    }

    /**
     * Removes the last element from the sequence
     */
    public void delete (){
        if(this.length <= (1/(4*capacity))) {
            this.capacity = this.capacity/2;
        }
        int[] intArray = new int[this.getCapacity()];
        this.updateArray(intArray);
        intArray[this.getLength()-1] = 0;
        if(this.length > 0) {
            this.length --;
        }
        this.myArray = intArray;
    }


    /**
     * Returns the first index of a given item
     * @param item the item you want to find the index of in the sequence
     * @return index of the item in the sequence
     */
    public int search ( int item){
        int index = -1;
        for(int element : this.myArray) {
            if(item == this.getElementFromIndex(element)) {
                index = element;
                break;
            }
        }
        return index;
    }
}
