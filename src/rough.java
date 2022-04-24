// Java code​​​​​​‌​​‌‌​​​‌‌‌‌​‌‌‌‌‌​‌‌‌​‌‌ below
import java.util.*;
import java.io.*;
import java.nio.*;
import java.math.*;

class rough {
    public static void main(String[] args){
        String string = "ew rwe f dff s fd f";
        System.out.println(reshape(3, string));
    }

    public static String reshape(int n, String str) {
        str = str.replace(" ", "");
        char[] arr = str.toCharArray();
        StringBuilder strFinal = new StringBuilder();
        int i = 0;
        for(char ch: arr){
            strFinal.append(ch);
            i++;
            if(i>=n){
                strFinal.append('\n');
                i = 0;
            }
        }
        str = strFinal.toString();
        return str;
    }
	
}