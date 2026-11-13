public class LEETCODE_58 {
     public int lengthOfLastWord(String s) {
       s=s.trim() ;// It eliminates spaces, tabs, and newlines at
             //  the beginning and end of a string.
             //  Spaces located between words in the middle remain untouched
       int count=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
            count=0;
        }
        else{
            count++;
        }
       }
       return count;
    }
    public static void main(String[] args) {
        String text = "   Hello, World!   ";
        String trimmedText = text.trim();

        System.out.println("Original: '" + text + "'");       // Output: '   Hello, World!   '
        System.out.println("Trimmed:  '" + trimmedText + "'"); // Output: 'Hello, World!'
    }
}
