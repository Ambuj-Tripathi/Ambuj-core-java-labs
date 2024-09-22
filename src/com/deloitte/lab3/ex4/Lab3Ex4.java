package com.deloitte.lab3.ex4;

public class Lab3Ex4 {
    public static int modifyNumber(int number) {
        String numStr = Integer.toString(number);
        StringBuffer modified = new StringBuffer();

        for (int i = 0; i < numStr.length() - 1; i++) {
            int diff = Math.abs(Character.getNumericValue(numStr.charAt(i)) - Character.getNumericValue(numStr.charAt(i + 1)));
            modified.append(diff);
        }

        modified.append(numStr.charAt(numStr.length() - 1)); // Append the last digit
        return Integer.parseInt(modified.toString());
    }

    public static void main(String[] args) {
        int number = 45862;
        int result = modifyNumber(number);
        System.out.println("Modified Number: " + result);
    }
}
