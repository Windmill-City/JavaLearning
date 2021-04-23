/**
 * Implementation of a linked List, which can only contains int values
 */
public class MyLink {
    /**
     * The first element of the linked list, which holding reference of next element
     */
    Node head = null;

    /**
     * Test the linked list
     * @param args unused
     */
    public static void main(String[] args) {
        MyLink list = new MyLink();
        list.addNode(5);
        list.addNode(3);
        list.addNode(1);
        list.addNode(2);
        list.addNode(55);
        list.addNode(36);
        System.out.println("linkLength:" + list.length());
        System.out.println("head.data:" + list.head.data);
        list.printList();
        list.deleteNode(4);
        System.out.println("After deleteNode(4):");
        list.printList();
    }

    /**
     * Insert a node to the tail of the list
     *
     * @param d the data value of the inserted node
     */
    public void addNode(int d) {
        //Create the new node's instance here
        Node newNode = new Node(d);
        //Check if the list has no node in it
        if (head == null) {
            //if so, we assign the new node as the first node
            head = newNode;
            return;
        }
        //We insert the node after the current head
        //Lets search for the latest node
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        //Assign the new node at the tail
        tmp.next = newNode;
    }

    /**
     * Delete the node at the index
     *
     * @param index the to remove node's index
     * @return if the node has removed
     */
    public boolean deleteNode(int index) {
        //We cant remove the head node
        //neither the node not in the list
        if (index < 1 || index > length()) {
            return false;
        }
        //remove the node next to the head
        if (index == 1) {
            head = head.next;
            return true;
        }
        //Search the list for the correspond node
        int i = 1;
        Node preNode = head;
        Node curNode = preNode.next;
        while (curNode != null) {
            //Node founded, lets remove it
            if (i == index) {
                //Cleanup the reference
                preNode.next = curNode.next;
                return true;
            }
            //Search for next node
            preNode = curNode;
            curNode = curNode.next;
            i++;
        }
        return false;
    }

    /**
     * Get the length of the list
     *
     * @return the length of the list
     */
    public int length() {
        int length = 0;
        Node tmp = head;
        while (tmp != null) {
            //selfAdd the length if a node presents
            length++;
            tmp = tmp.next;
        }
        return length;
    }

    /**
     * Delete the correspond node in the list
     *
     * @param n the node to delete
     * @return if the node has successful deleted
     */
    public boolean deleteNode11(Node n) {
        //We cant delete a null node nor the node that have no next element
        if (n == null || n.next == null) {
            return false;
        }
        //We don't delete the node directly, but just delete the data of the node
        //We swap the data of the node and the next node
        //and remove next node, so it seems we have deleted the node
        int tmp = n.data;
        n.data = n.next.data;
        n.next.data = tmp;
        n.next = n.next.next;
        System.out.println("删除成功！");
        return true;
    }

    /**
     * Print out all the data in the list
     */
    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    /**
     * Reverse the order of the whole list
     *
     * @param head the head of the list to reverse
     * @return the reversed list's head
     */
    public Node ReverseIteratively(Node head) {
        Node pReversedHead = head;
        Node pNode = head;
        Node pPrev = null;
        while (pNode != null) {
            Node pNext = pNode.next;
            if (pNext == null) {
                pReversedHead = pNode;
            }
            //Make the current node ref's previous node
            pNode.next = pPrev;
            //Current node will be the next node of the pNext node
            pPrev = pNode;
            //pNext node is the next Current node, and it will point to the Current node in next cycle
            pNode = pNext;
        }
        this.head = pReversedHead;
        return this.head;
    }

    /**
     * Find the middle value of the list
     * <p>
     * Imagine two people walking on the list
     * when A walk foreword two step, B walk one step
     * when A reaches the end of the list, B just reached half
     *
     * @param head unused
     * @return the middle node of the list
     */
    public Node SearchMid(Node head) {
        //Search from the first element
        Node p = this.head, q = this.head;
        //Check if the p node can step foreword two node
        //if possible, the q node step foreword one node, step by step then we will reach the middle node
        while (p != null && p.next != null && p.next.next != null) {
            p = p.next.next;
            q = q.next;
        }
        System.out.println("Mid:" + q.data);
        return q;
    }


    /**
     * Find the kth node from the bottom
     *
     * @param head where we consider the first element of the list
     * @param k    the kth
     * @return the founded node or null if out of range
     */
    public Node findElem(Node head, int k) {
        if (k < 1 || k > this.length()) {
            return null;
        }
        Node p1 = head;
        Node p2 = head;
        //Move forward k steps
        for (int i = 0; i < k; i++)
            p1 = p1.next;
        //Move the p2 list.length - k steps forward
        while (p1 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    /**
     * Sort the list from least to most
     * it seem's like a selection sort
     *
     * @return the sorted list's head
     */
    public Node orderList() {
        Node nextNode = null;
        int tmp = 0;
        Node curNode = head;
        // FIXME: May produce NullPointerException if the head is null
        while (curNode.next != null) {
            nextNode = curNode.next;
            while (nextNode != null) {
                //Swap data if current node's data > next's
                //then we will have the least value a the front
                if (curNode.data > nextNode.data) {
                    tmp = curNode.data;
                    curNode.data = nextNode.data;
                    nextNode.data = tmp;
                }
                nextNode = nextNode.next;
            }
            //Sort next node
            curNode = curNode.next;
        }
        return head;
    }

    /**
     * Delete the duplicated data nodes in the list
     * @param head where we start to delete
     */
    public void deleteDuplicate(Node head) {
        Node p = head;
        while (p != null) {
            Node q = p;
            //Compare the value with current, if any same data presents, remove it
            while (q.next != null) {
                if (p.data == q.next.data) {
                    q.next = q.next.next;
                } else
                    q = q.next;
            }
            p = p.next;
        }

    }

    /**
     * Print the data in the list reversely
     * @param pListHead where we consider the head of the list
     */
    public void printListReversely(Node pListHead) {
        if (pListHead != null) {
            //Call this method recursively to print reversely
            printListReversely(pListHead.next);
            System.out.println("printListReversely:" + pListHead.data);
        }
    }

    /**
     * Search the list if any loop in the list
     * @param head where we start to search
     * @return if the list start from the head has any loop
     */
    public boolean IsLoop(Node head) {
        Node fast = head, slow = head;
        if (fast == null) {
            //the start point is null, just return false
            return false;
        }
        //Fast pointer and slow pointer walk through the list
        //if they walk into a loop, the fast point will catch up the slow one
        //if the list has no loop, the fast pointer will reach null
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                System.out.println("该链表有环");
                return true;
            }
        }
        //Always false when reach here
        return !(fast == null || fast.next == null);
    }

    /**
     * Find where the loop start
     * @param head where we consider the start of the list
     * @return the loop's start node or null if no loop in list
     */
    public Node FindLoopPort(Node head) {
        Node fast = head, slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            //We found the list contains loop
            if (slow == fast)
                break;
        }
        if (fast == null || fast.next == null)
            //the list has no loop
            return null;
        //Search from the start point
        slow = head;
        //When slow == fast, then it is the start point of the loop
        //the start point is the endpoint of the loop which closer to the head
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    /**
     * The node class of the linked list
     * with a reference to next node and a field that holds the data value of type int
     */
    @SuppressWarnings("InnerClassMayBeStatic")
    class Node {
        /**
         * Reference of next node
         */
        Node next = null;
        /**
         * Field that holds the data value of type int
         */
        int data;

        /**
         * Constructor method of the Node class
         *
         * @param data the data value of the node
         */
        public Node(int data) {
            //assign data value here
            this.data = data;
        }
    }
}