package com.techreturners.exercise005;

public class Exercise005 {
    public boolean isPangram(String input) {
        if(input == null) return false;

        boolean allLettersPresent = true;
        String lowerInput = input.toLowerCase();

        for (char alphabet = 'a'; alphabet <= 'z'; alphabet++) {
            if (!lowerInput.contains(String.valueOf(alphabet))) {
                allLettersPresent = false;
                break;
            }
        }

        return allLettersPresent;
    }
}



