package com.geekbrains.hometask2;

import java.util.Arrays;
import java.util.Random;

public class MyArr {
    private int[] arr;
    private int size;

    public static void main(String[] args) {

        int[] myArr = new int[100000];
        Random random = new Random();
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(myArr));
    }

    public MyArr(int size) {
        this.size = size;
        this.arr = new int[size];
    }

    public void sortBubble() {
        int out, in;
        for (out = this.size - 1; out >= 1; out--) {
            for (in = 0; in < out; in++) {
                if (this.arr[in] > this.arr[in + 1]) {
                    change(in, in + 1);
                }
            }
        }
    }

    private void change(int a, int b) {
        int tmp = this.arr[a];
        this.arr[a] = this.arr[b];
        this.arr[b] = tmp;
    }

    public void sortSelect() {
        int out, in, mark;
        for (out = 0; out < this.size; out++) {
            mark = out;
            for (in = out + 1; in < this.size; in++) {
                if (this.arr[in] < this.arr[mark]) {
                    mark = in;
                }
            }
            change(out, mark);
        }
    }

    public void sortInsert() {
        int in, out;
        for (out = 1; out < this.size; out++) {
            int temp = this.arr[out];
            in = out;
            while (in > 0 && this.arr[in - 1] >= temp) {
                this.arr[in] = this.arr[in - 1];
                --in;
            }
            this.arr[in] = temp;
        }


    }

}
