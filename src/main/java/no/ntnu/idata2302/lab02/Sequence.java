/*
 * This file is part of NTNU's IDATA2302 Lab02.
 *
 * Copyright (C) NTNU 2022
 * All rights reserved.
 *
 */
package no.ntnu.idata2302.lab02;

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
    public int getIndexMyArray(int i) {
        return this.myArray[i];
    }

    /**
     * Copy the element from the array to a new array list.
     * @param intArray the new arraylist that you want to copy the element from the array to.
     */
    public void updateArray(int[] intArray) {
        int i = 0;
        while (i < this.getLength()) {
            intArray[i] = this.getIndexMyArray(i); i++;
        }
    }

    /**
     * Add element to the array.
     * @param element what element you want to add to the array.
     */
    public void insert ( int element) {
        if (myArray.length == this.capacity) {
            this.capacity = this.capacity * 2;
            if (length < this.capacity) {
                length++;
                int[] intArray = new int[this.getCapacity()];
                this.updateArray(intArray);
                intArray[this.getLength() - 1] = element;
                myArray = intArray;
            } else {
                throw new IllegalArgumentException("Something whent wrong.");
            }
        }
    }

    /**
     *
     * @param index
     * @param item
     */
    public void remove ( int index, int item){

    }

    public void search ( int item){
        // TODO
    }

}
