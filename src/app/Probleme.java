package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Probleme {
    //26
    public int removeDuplicates(int[] num) {
        if(num.length == 0) return 0;
        int k = 1;
        for(int i = 1; i < num.length; i++) {
            if(num[i] != num[i-1]) {
                num[k] = num[i];
                k++;
            }
        }
        return k;
    }



    //27
    public int removeElement(int[] nums, int val) {
        int k=0;
        for(int i = 0; i <nums.length; i++) {
            if(nums[i] != val) {
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    //121
    public int maxProfit (int[] prices) {
        int maxProfit = 0;
        int minPrice = 100;
        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if(prices[i] > prices[i-1]) {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

    //9
    public boolean isPalindrom(int numar) {
        int pal=0;
        int nr=numar;
        while(numar>0){
            int x=numar%10;
            pal=pal*10+x;
            numar=numar/10;
        }
        if(nr!=pal) return false;
    else return true;
    }

//    88 You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
//    and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
//    Merge nums1 and nums2 into a single array sorted in non-decreasing order.
//    Example 1:
//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//    Output: [1,2,2,3,5,6]
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            }
            else {
                nums1[k--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
    }


    //14    Write a function to find the longest common prefix string amongst an array of strings.
    //
    //If there is no common prefix, return an empty string "".

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null)
            return "null";

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.length() == 0)
                    return "";
            }
        }

        return prefix;
    }

    //todo:1684
    public boolean isAInWords(char a, String words) {
            char[] character=new char[words.length()];
            for(int i=0;i<words.length();i++){
                character[i]=words.charAt(i);
            }
            for (int i=0;i<character.length;i++){
                if(character[i]==a){
                    return true;
                }
            }
            return false;
        }

    public boolean auLitereLaFel(String word1, String word2){
        for(int i=0; i<word1.length(); i++){
            if(!isAInWords(word1.charAt(i),word2)){
                return false;
            }
        }
        return true;
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int ct=0;
        for (int i=0;i<words.length;i++){
            if (auLitereLaFel(words[i],allowed)){
                ct++;
            }
        }
        return ct;
    }


    //todo:2000



    public String reversePrefix(String word, char ch) {
        int index = 0;
        String word1 = "";

        if (!word.contains(Character.toString(ch))) {
            return word;
        } else { index=word.indexOf(ch);
            for(int i = index; i>=0; i--){
                word1+=word.charAt(i);
            }
            for(int i = index+1; i<word.length();i++){
                word1+=word.charAt(i);
            }
            return word1;
        }
    }
    //todo:1480: running sum of 1d array


    public int[] runningSum(int[] nums) {
        int[]rezultat=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            rezultat[i]=sum;

        }
        return rezultat;

    }


    //TODO:2824. Count pairs whose sum is less than target

    public int countPairs(List<Integer> nums, int target) {
        int perechi =0;
        for(int i=0;i<nums.size();i++){
            for(int j=0;j<nums.size();j++){
                if(nums.get(i)==nums.get(j)&&i<j){
                    perechi++;
                }
            }
        }
        return perechi;

    }



    //todo: Length of last word

    public String lastWord(String sir){
            String[] word= sir.trim().split(" ");
            return word[word.length-1];

    }

    public int lengthOfLastWord(String s) {
        String cuv= lastWord(s);
        return cuv.length();
    }


    //TODO:387. First Unique Character in a String

    public int getIndexOfChar(char a,String s){

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==a){
                return i;
            }
        }
        return -1;
    }


        public int firstUniqChar(String s) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (s.indexOf(c) == s.lastIndexOf(c)) {
                    return i;
                }
            }
            return -1;
        }

    //TODO: 389.Find the Difference

    public int sumOfChars(String s){
        int sum=0;
        for(int i = 0; i<s.length();i++){
            sum+=s.charAt(i);
        }
        return sum;
    }


    public char findTheDifference(String s, String t) {
        int sumS=sumOfChars(s);
        int sumT=sumOfChars(t);
        return (char) (sumT-sumS);
    }




    //todo:392. Is Subsequence

    public int findCharFromIndex(String t, char c, int start){
        for(int i = start; i< t.length(); i++){
            if(t.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }

    public boolean isSubsequence(String s, String t) {
        int pozitie=0;
        for(int i=0;i<s.length();i++) {
            pozitie = findCharFromIndex(t, s.charAt(i), pozitie);
            if (pozitie == -1) {
                return false;
            }
            pozitie++;
        }
        return true;
    }


    //todo:409. Longest Palindrome

    public int[] frecventaLitera(String s){
        int [] freventa=new int[128];
        for (int i=0;i<s.length();i++){
            freventa[s.charAt(i)]++;
        }
        return freventa;
    }


    public int longestPalindrome(String s) {
        int [] freq= frecventaLitera(s);
        int length = 0;
        boolean oddFound = false;

        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0){
                length+=freq[i];
            }
            else{
                length+=freq[i]-1;
                oddFound=true;
            }
        }
        if (oddFound){
            length+=1;
        }
        return length;
    }

    private static int getValue(char roman) {
        switch (roman) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }

    public int romanToInt(String s) {

        int total = 0;
        int valoare=0;
        for(int i = s.length()-1; i>=0; i--){
            int current=getValue(s.charAt(i));
            if(current<valoare){
                total-=current;
            }
            else total+=current;
            valoare=current;
        }
        return total;

    }


    public void reverseString(char[] s) {

        int left=0;
        int right=s.length-1;
        while (left<right){
            char temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }


    public boolean canConstruct(String ransomNote, String magazine) {
        int gasit = 0;
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            int index = magazine.indexOf(c);

            if (index == -1) {
                return false;
            }
            magazine = magazine.substring(0, index) + magazine.substring(index + 1);
        }
        return true;
    }



    public List<Boolean>kidsWithCandies(int[]vector,int n){
        int max=-1;
        for(int i=0;i<vector.length;i++){
            if(vector[i]>max){
                max=vector[i];
            }
        }
        List<Boolean>lista=new ArrayList<>();
        for(int i=0;i<vector.length;i++){
            if(vector[i]+n>=max){
                lista.add(true);
            }
            else{
                lista.add(false);
            }
        }
        return lista;
    }




    public static int maximumWealth(int[][] accounts) {
        int max=-1;
        for(int i=0;i<accounts.length;i++){
            int suma=0;
            for (int j=0;j<accounts[i].length;j++){
                suma+=accounts[i][j];
                if(suma>max){
                    max=suma;
                }
            }
        }
        return max;
    }




}


