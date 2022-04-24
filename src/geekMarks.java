// https://practice.geeksforgeeks.org/problems/geek-and-his-marks-1611824243/0/?category[]=Searching&category[]=Searching&page=1&query=category[]Searchingpage1category[]Searching

import java.util.*;
import java.lang.*;
import java.io.*;

class geekMarks{
    public static void main (String[] args) {
        Scanner scan  = new Scanner(System.in);
        int no_of_testCase = scan.nextInt();
        int i = 0;
        int[] ans = new int[no_of_testCase];
        while(i< no_of_testCase){
            int no_of_students = scan.nextInt();
            int[] marks = new int[no_of_students];
            int geek_marks = scan.nextInt();
            for(int j = 0; j<no_of_students; j++){
                marks[j] = scan.nextInt();
            }
            int count = 0;
            for(int j = 0; j<no_of_students; j++){
                if(marks[j]> geek_marks){
                    count ++;
                }
            }
            ans[i] = count;
            i++;
        }

        for(int num: ans){
            System.out.println(num);
        }

    }
}