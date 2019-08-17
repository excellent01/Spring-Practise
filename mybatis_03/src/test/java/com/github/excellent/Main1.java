package com.github.excellent;

import java.util.Scanner;

/**
 * @auther plg
 * @date 2019/8/16 18:46
 */
public class Main1 {
    public static void main(String[] args){

        int[] nums = new int[]{1,3,5,6,8,9,10};
        int index = process(nums,0,nums.length - 1,8);
        System.out.println(index);

    }

    public static int process(int[] arr,int l,int r,int key){
        if(l > r){
            return -1;
        }
        int mid = l + ((r - l) >> 1);
        if(arr[mid] == key){
            return mid + 1;
        }
        if(arr[mid] < key){
            return process(arr,mid + 1,r,key);
        }
        if(arr[mid] > key){
            return process(arr,l,mid - 1,key);
        }
        return -1;
    }
}
