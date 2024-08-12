package string;

public class isPalindrome {
    public boolean isPalindrome(String s) {

        //empty string init
        String palindrome = "";

        //traversing through the char array 
        for(char item : s.toCharArray()){
            //checking for alphanumeric
            if(Character.isDigit(item)||Character.isLetter(item)){
                //appending to the empty string
                palindrome+=item;
            }
        }

        //case conversion
        palindrome = palindrome.toLowerCase();

        //init pointers
        int left = 0;
        int right = palindrome.length()-1;

        while (left<=right) { 
            //check if the value at pointer left and right are same if not returning false 
            if(palindrome.charAt(left) != palindrome.charAt(right)){
                return false;
            }
            //else incrementing the left pointer and decreasing the right pointer
            left++;
            right--;
            
        }
        return true;
    }
    public static void main(String[] args) {
        isPalindrome Coffee = new isPalindrome();
        System.out.println(Coffee.isPalindrome("A man, a plan, a canal: Panama"));
        
    }
}
