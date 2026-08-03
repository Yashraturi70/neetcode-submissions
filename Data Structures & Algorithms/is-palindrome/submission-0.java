class Solution {
    public boolean isPalindrome(String s) {
        int l=0;int r=s.length()-1;
        s=s.toLowerCase();
        while(l<=r)
        {
            char left=s.charAt(l);
            char right=s.charAt(r);
            // System.out.println("left "+left+" right "+right);
            if(!Character.isLetterOrDigit(left))
            {
                l++;
                continue;
            }
            if(!Character.isLetterOrDigit(right))
            {
                r--;
                continue;
            }
            if(left!=right)
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
