package com.deepak.interview;

import java.util.Arrays;

public class VmWareTest {


        // Validate String if it a Valid IPv4 and IPv6 address
        // "2001:0db8:85a3:0000:0000:8a2e:0370:7334" -> HexDigits: 0 to f, 8 segments
        // "2001:0db8:85a3:::8a2e:0370:7334" -> Also Valid
        // "2001:0db8:85a3:00:0:8a2e:0370:7334" -> Also Valid
        // ":0db8:85a3:::8a2e:0370:" -> Invalid
        // ":0db8:85a3:0000:0000:8a2e:0370:8a2e" -> Invalid
        // "125.125.125.125" ->  4 Segments: 0 to 255
        // "125.125.05.125" ->  Invalid
        // "125.125.5.125" ->  Valid
        // "0.0.0.0" -> Valid
        // "0.1.1.1" -> Valid

        // Must not rely on NumberFormatException

        // Utility Method
        public static boolean isNumericDigit(char c) {
            // Returns true for 0-9, else false: O(1) Time Complexity, O(1) Space Complexity
            return Character.isDigit(c);
        }

        public static boolean isHexDigit(char c) {
            // Returns true for 0-9 and a-f or A-F, else false: O(1) Time Complexity, O(1) Space Complexity
            switch (c) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                    return true;
            }
            return isNumericDigit(c);
        }

        // Implement this
        public static boolean isValidIpAddress(String str) {

            if(str == null || str.isEmpty() ){
                return false;
            }

            if(str.charAt(0)=='.' || str.charAt(0)== ':' ||
                    str.charAt(str.length()-1)=='.'|| str.charAt(str.length()-1)==':'){
                return false;
            }
            if(str.contains(".")){
                return checkIPV4(str);
            }else if(str.contains(":")){
                return  checkIPV6(str);
            }
            //String zeroTo255 = "{\\d{1.2}}";
            return false;
        }

        public static boolean checkIPV4(String str){
            boolean check = false;
            boolean result = false;
            String[] ipV4 = str.split("\\.");
            if(ipV4.length != 4){
                return false;
            }else{
                for(String s : ipV4){
                    if(s.isEmpty()){
                        return false;
                    }

                    for(char c : s.toCharArray()){
                        result = isNumericDigit(c);
                        if(!result){
                            check = true;
                            break;
                        }
                    }
                    if(check){
                        break;
                    }else{
                        if(s.charAt(0)== '0' && s.length()>1){
                            return false;
                        }
                        int num = Integer.parseInt(s);
                        if(num>255){
                            return false;
                        }
                    }

                }

            }

            return result;

        }

        public static boolean checkIPV6(String str){
            boolean check = false;
            boolean result = false;
            String[] ipV6 = str.split("\\:");
            if(ipV6.length != 8){
                return false;
            }else{
                for(String s : ipV6){
                    for(char c : s.toCharArray()){
                        result = isHexDigit(c);
                        if(!result){
                            check = true;
                            break;
                        }
                    }
                    if(check){
                        break;
                    }
                }


            }

        return result;
    }

    public static void main(String[] args) {
        Arrays.asList(
                // Valid
                "2001:0db8:85a3:0000:0000:8a2e:0370:7334",
                "2001:0db8:85a3:::8a2e:0370:7334",
                "2001:0db8:85a3:00:0:8a2e:0370:7334",
                "125.125.125.125",
                "125.125.5.125",
                "0.0.0.0",
                "0.1.1.1",
                "125.125.100.125",

                // Invalid
                "Line",
                "125.125.05.125",
                "125.125..125",
                ".125.05.",
                "125.125.500.125",
                "125.125.444.125",
                "125.125.1234.125",
                "125.125.5.125.125.125.5.125",
                "0.1a.1.1",
                "2001:0db8:85a3:0000:0000:8a2e:0370:7334:2001:0db8:85a3:0000:0000:8a2e:0370:7334",
                "m001:0db8:85a3:0000:0000:8a2e:0370:7334",
                ":0db8:85a3:::8a2e:0370:",
                ":0db8:85a3:0000:0000:8a2e:0370:8a2e",
                "    ",
                null,
                "",
                "  0.0.0.0  ",
                "  2001:0db8:85a3:::8a2e:0370:7334  "
        ).forEach(str -> {
            String msg = "\"" + str + "\" -> " + String.valueOf(isValidIpAddress(str));
            System.out.println(msg);
        });
    }
}
