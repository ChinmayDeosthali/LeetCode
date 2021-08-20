class MyLinkedList 
{
    
    int length;
    ListNode head;
    class ListNode
    {
        int val;
        ListNode next;
        ListNode(int val)
        {
            this.val = val;
        }
    }
    
    /** Initialize your data structure here. */
    public MyLinkedList() 
    {
        this.length = 0;
        this.head = null;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) 
    {
        if(index < 0 || index > length - 1) return -1;
        ListNode traverse_node = this.head;
        for(int i = 0; i < index; i++)
        {
            traverse_node = traverse_node.next;
        }
        return traverse_node.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) 
    {
        ListNode new_head_node = new ListNode(val);
        new_head_node.next = this.head;
        this.head = new_head_node;
        this.length++; 
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) 
    {
        if(this.length == 0) addAtHead(val);
        else
        {    
            ListNode traverse_node = this.head;
            for(int i = 0; i < this.length-1; i++)
            {
                traverse_node = traverse_node.next;
            }
            ListNode new_tail_node = new ListNode(val);
            traverse_node.next = new_tail_node;
            this.length++;
        }
        
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) 
    {
        if(index == 0) addAtHead(val);
        else if(index == length) addAtTail(val);
        else if(index < length && index > 0)
        {
            ListNode traverse_node = this.head;
            for(int i = 0; i < index-1; i++)
            {
                traverse_node = traverse_node.next;
            }
            ListNode new_node = new ListNode(val);
            new_node.next = traverse_node.next;
            traverse_node.next = new_node;
            this.length++;
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index)
    {
        if(index == 0)
        {
            this.head = this.head.next;
            this.length--;
        }
            
        if(index > 0 && index < length)
        {
            ListNode traverse_node = this.head;
            for(int i = 0; i < index-1; i++)
            {
                traverse_node = traverse_node.next;
            }
            traverse_node.next = traverse_node.next.next;
            this.length--;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */