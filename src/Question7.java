
public class Question7 {
	static Node head1, head2;  

    
    int getNode() 
    { 
        int count1 = getCount(head1); 
        int count2 = getCount(head2); 
        int d; 
  
        if (count1 > count2) { 
            d = count1 - count2; 
            return intesection(d, head1, head2); 
        } 
        else { 
            d = count2 - count1; 
            return intesection(d, head2, head1); 
        } 
    } 
    
    
    int intesection(int d, Node node1, Node node2) 
    { 
        int i; 
        Node current1 = node1; 
        Node current2 = node2; 
        for (i = 0; i < d; i++) { 
            if (current1 == null) { 
                return -1; 
            } 
            current1 = current1.next; 
        } 
        while (current1 != null && current2 != null) { 
            if (current1.data == current2.data) { 
                return current1.data; 
            } 
            current1 = current1.next; 
            current2 = current2.next; 
        } 
  
        return -1; 
    } 
  
    int getCount(Node node) 
    { 
        Node current = node; 
        int count = 0; 
  
        while (current != null) { 
            count++; 
            current = current.next; 
        } 
  
        return count; 
    } 
    
    
    public static void main(String[] args) 
    { 
        Question7 list = new Question7(); 
  
        list.head1 = new Node(2); 
        list.head1.next = new Node(4); 
        list.head1.next.next = new Node(5); 
        list.head1.next.next.next = new Node(9); 
        list.head1.next.next.next.next = new Node(12); 
  
        list.head2 = new Node(4); 
        list.head2.next = new Node(9); 
        list.head2.next.next = new Node(11); 
  
        System.out.println("The intersection is " + list.getNode()); 
    } 
    
}
