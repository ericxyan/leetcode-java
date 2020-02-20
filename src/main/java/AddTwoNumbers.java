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
        return l1;
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