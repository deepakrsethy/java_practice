package com.deepak.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class NikeIndiaCodingTest {
    /**
     * Iterate through each line of input.
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        Map<Integer, Integer> dataset1 = new HashMap<Integer, Integer>();
        Map<Integer, Integer> dataset2 = new HashMap<Integer, Integer>();
        boolean result = false;

        while ((line = in.readLine()) != null) {

            //ignore headers
            if(line.equals("year,state,month,number")){
                continue;
            }
            if(line.equals("year,number")){
                continue;
            }
            //split the lines into String array
            String[] input = line.trim().split(",");

            //arrays with size 4 belongs to dataset 1 and arrays with size 2 belongs to dataset 2
            if(input.length == 4){
                int key = Integer.parseInt(input[0]);
                int newValue = Integer.parseInt(input[3]);
                if(dataset1.containsKey(key)){
                    int oldValue= dataset1.get(key);
                    dataset1.put(key, oldValue+newValue);
                }else{
                    dataset1.put(key, newValue);
                }

            }else if(input.length == 2){
                int key = Integer.parseInt(input[0]);
                int newValue = Integer.parseInt(input[1]);
                dataset2.put(key, newValue);
            }
        }

        //both the dataset need to have same keys otherwise return false
        if(dataset1.keySet().size() == dataset2.keySet().size()){
            for(int i : dataset2.keySet()){
                if(dataset1.get(i).equals(dataset2.get(i))){
                    result = true;
                }else{
                    result = false;
                }
            }
        }

        if(result){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}