package Leetcode_Questions;
/*
3295. Report Spam Message
- Medium
You are given an array of strings message and an array of strings bannedWords.
An array of words is considered spam if there are at least two words in it that exactly match any word in bannedWords.

Return true if the array message is spam, and false otherwise.
Example 1:

Input: message = ["hello","world","leetcode"], bannedWords = ["world","hello"]

Output: true

Explanation:

The words "hello" and "world" from the message array both appear in the bannedWords array

 */


import java.util.HashSet;
public class Day1 {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<bannedWords.length;i++){
            set.add(bannedWords[i]);
        }
        int c = 0;
        for(int i=0;i<message.length;i++){
            if(set.contains(message[i])){
                c++;
            }
        }
        if(c>1){
            return true;
        }
        return false;
    }





}



