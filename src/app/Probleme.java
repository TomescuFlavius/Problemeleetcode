package app;

import java.util.List;

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

    //58
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
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



}


