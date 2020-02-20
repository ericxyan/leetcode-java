import java.util.ArrayList;
import java.util.List;

/**
 * AddTwoNumbers
 */
public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

        public String toString() {
            String rs = val + "->";
            while (next != null) {
                rs += next.val + "->";
                next = next.next;
            }
            return rs;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return bruteForce(l1, l2);
    }

    public static ListNode bruteForce(ListNode l1, ListNode l2) {
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        while(l1 != null) {
            listA.add(0, String.valueOf(l1.val));
            l1 = l1.next;
        }
        while(l2 != null) {
            listB.add(0, String.valueOf(l2.val));
            l2 = l2.next;
        }
        int a = Integer.parseInt(String.join("", listA));
        int b = Integer.parseInt(String.join("", listB));
        int c = a + b;
        System.out.println(c);
        String[] sum = String.valueOf(c).split("");
        ListNode rsHead = new ListNode(0);
        ListNode rs = rsHead;
        for (int i = sum.length - 1; i >= 0; i--) {
            System.out.println(sum[i]);
            if(i == sum.length - 1) {
                rs.val = Integer.parseInt(sum[i]);
            } else {
                rs.next = new ListNode(Integer.parseInt(sum[i]));
                rs = rs.next;
            }
        }
        return rsHead;
    }

    public static void main(String[] args) {
        /**
         * Case 1 Input: (2 -> 4 -> 3) + (5 -> 6 -> 6) Output: 7 -> 0 -> 0 -> 1
         * Explanation: 342 + 665 = 1007.
         */
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(6);

        ListNode rs = addTwoNumbers(l1, l2);
        System.out.println(rs);

        /**
         * Case 2 Input: (2 -> 4) + (5 -> 6 -> 6) Output: 7 -> 0 -> 0 -> 1 Explanation:
         * 42 + 665 = 707.
         */

        /**
         * Case 3 Input: (2 -> 4 -> 3) + (5 -> 6) Output: 7 -> 0 -> 0 -> 1 Explanation:
         * 342 + 65 = 407.
         */
    }
}