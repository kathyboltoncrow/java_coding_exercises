package com.techreturners.exercise005;

public class Exercise005 {
    public boolean isPangram(String input) {
        System.out.println(input);
        boolean allLettersPresent = true;
        String lowerInput = input.toLowerCase();
        System.out.println(lowerInput);

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            if (!lowerInput.contains(String.valueOf(alphabet))) {
                allLettersPresent = false;
                break;
            }
        }

        return allLettersPresent;
    }

}



