package app;

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


        //88?
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int []numfinal;
        for(int i = 0; i < m; i++) {
             numfinal = nums1;
        }
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


}

