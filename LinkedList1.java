public class LinkedList1 {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
   public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("llist is emplty");
            return;
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("null");

    }
    public void addMiddle(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i<idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode; 
        
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("empty");
            return Integer.MAX_VALUE;
        }else if(size==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }
        Node prev = head;
        for(int i =0;i<size-2;i++){
            prev = prev.next;

        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public int itrSerch(int key){
        Node temp =head;
        int i =0;
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp =temp.next;
            i++;
        }
        return -1;

    }
    public static void main(String[] args){
        LinkedList1 llist = new LinkedList1();
        llist.print();
        llist.addFirst(2);
        llist.print();
        llist.addFirst(1);
        llist.print();
        llist.addLast(3);
        llist.print();
        llist.addLast(4);
        llist.print();
        llist.addMiddle(9, 2);
        llist.print();
        System.out.println(llist.size);

        llist.removeFirst();
        llist.print();

        llist.removeLast();
        llist.print();
        
        System.out.println(llist.size);
        System.out.println(llist.itrSerch(4));
       
    }
}

