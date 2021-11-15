package com.company;

import java.io.ObjectStreamException;

public class NegArray {
    private int startIndex;
    private int arr[];

    public NegArray(int startIndex, int endIndex) {
        this.startIndex = startIndex;
        arr = new int[(endIndex - startIndex)];
    }

    public void SetValue(int value, int index) {
        this.arr[index - this.startIndex] = value;
    }

    public int GetValue(int index) {
        return this.arr[index - this.startIndex];
    }
}
