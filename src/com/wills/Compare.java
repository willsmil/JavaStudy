package com.wills;

/**
 * Created by 18240 on 2018/3/8.
 */
public class Compare {
    public static void main(String[] args) {
        String string1 = "122";
        String string2 = "12213222";

        int len1 = string1.length();
        int len2 = string2.length();
        int len = len2 - len1;
        int left = 0;
        int right = len1 - 1;
        while(true){
            if (left == right){
                System.out.println("str3 does not exit!");
                break;
            }
            if(len >= right - left){
                System.out.println("the left index is " + (left+1));
                System.out.println("the right index is " + (right+1));
                break;
            }
            int mid = (left + right)/2;
            if(string1.charAt(mid) == string2.charAt(mid)){
                if(string1.substring(left,mid).equals(string2.substring(left,mid))){
                    //中间相等，前面相等，str3在后面
                    left = mid + 1;
                    continue;
                }else {
                    //中间相等，前面不等，str3在前面
                    right = mid + len - 1;
                    continue;
                }
            }else{
                //中间不等，
                right = mid + len - 1;
                continue;
            }
        }
    }
}