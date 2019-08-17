package com.github.excellent;
import java.util.*;
/**
 * @auther plg
 * @date 2019/8/16 18:30
 */
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(process(str));
    }
    public static String process(String str){
        if(str == null || str == ""){
            return -1 + "";
        }
        List<Integer> list = new ArrayList<>();
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] <= '9' && arr[i] >= '0'){
                int num = arr[i] - '0';
                list.add(num);
            }
        }
        if(list.size() == 0){
            return -1 + "";
        }
        Collections.sort(list);
        String ans = "";
        for(int i : list){
            ans += i;
        }
        return ans;
    }
}
