package ArrayCoding;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'missingNumbers' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER_ARRAY brr
     */

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        List<Integer> missingNumbers=new ArrayList<>();
        for(int ar:arr){
            freq.put(ar,freq.getOrDefault(ar, 0)+1);
        }
        for(int br:brr){
            if(!freq.containsKey(br)){
                missingNumbers.add(br);
            }
        }
        return missingNumbers;

    }

    public static void main(String[] args) {
        List<Integer>num1=new ArrayList<>(Arrays.asList(203 ,204, 205, 206, 207, 208 ,203 ,204 ,205, 206));
        List<Integer>num2=new ArrayList<>(Arrays.asList(203, 204, 204 ,205 ,206 ,207 ,205 ,208, 203 ,206 ,205, 206 ,204));
        System.out.println(missingNumbers(num1,num2));
    }

}


