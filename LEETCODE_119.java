import java.util.*;
public class LEETCODE_119{
       public List<Integer> getRow(int rowIndex) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        long ans=1;
        for(int col=0;col<rowIndex;col++){
            ans=ans*(rowIndex-col);
            ans= ans/(col+1);
            list.add((int)ans); 
          }
          return list;
    }
}
//In Java, an int is like a container that can only hold numbers up to 2.14 billion (2,147,483,647).

// In your formula, you multiply before you divide:ans = ans * (rowIndex - col);ans = ans / (col + 1);

// Here is what happens when rowIndex = 30 and col = 14:

// The valid number (145422675): Before this step, ans is 145,422,675. That easily fits inside the int container.

// The overflow (-131213633): Next, you multiply 145,422,675 * 16, which equals 2,326,762,800.

// Why it turns negative: Because 2.32 billion is larger than 2.14 billion, 
// the int container overflows. In Java, when an int goes past its maximum limit,
//  it wraps around to the negative side (like a car odometer rolling over), 
// turning into a corrupted negative number (-1,968,204,496).
//  When you divide that broken negative number by 15, you get -131,213,633 instead of the right answer (155,117,520).

// The fix: Making ans a long gives you a much bigger temporary container (up to 9 quintillion)
//  so the multiplication doesn't spill over before the division brings the number back down.