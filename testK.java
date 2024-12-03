class node{
        int data;
        node prev;
        node next;

        public node(int data){
            this.data = data;
            prev=null;
            next=null;
        }
}

public class testK {
    

    static node head = null;
    static node tail = null;

    static void insertAtBeginning(int data){
        node newnode = new node(data);
        if(head==null){
            head = newnode;
            tail = newnode;
        }else{
            newnode.next = head;
            head.prev = newnode;
            head = newnode;
        }
    }

    static void insertAtEnd(int data){
        node newnode = new node(data);
        if(tail==null){
            insertAtBeginning(data);
        }else{
            tail.next = newnode;
            newnode.prev = tail;
            tail = newnode;
        }

    }

    static void insertAtPosition(int data,int position){
        node newnode = new node(data);
        int count=1;
        if(position==count){
            insertAtBeginning(data);
        }else{
            node curNode = head;
            while(curNode != null && count<position){
                curNode = curNode.next;
                count++;
            }
            if(position>count){
                System.out.println("incorrect position");
            }else{
            if(curNode == null){
                insertAtEnd(data);
            }else{
                newnode.prev = curNode.prev;
                newnode.next = curNode;
                curNode.prev.next=newnode;
                curNode.prev=newnode;
            }}
        }
    }

    static void deleteAtBeginning(){
        if(head == null){
            System.out.println("list is empty");
        }else{
            head.next.prev=null;
            head=head.next;
        }
    }

    static void deleteAtEnd(){
        if(head == null){
            System.out.println("list is empty");
        }else{
            tail.prev.next=null;
            tail=tail.prev;
        }
    }

    static void deleteAtSpecificPosition(int position){
        int count=1;
        if(head==null){
            System.out.println("list is empty");
        }
        if(position==count){
            deleteAtBeginning();
        }else{
            node curNode=head;
            while(curNode!=null && count!=position){
                curNode=curNode.next;
                count++;
            }
            if(count!=position){
                System.out.println("incorrect position");
            }else{
                curNode.prev.next=curNode.next;
                curNode.next.prev=curNode.prev;
                curNode.prev=null;
                curNode.next=null;
            }
        }

    }

    static void displayDoublyLinkedList(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            node cunode = head;
            while(cunode!=null){
                System.out.print("<--"+cunode.data+"-->");
                cunode = cunode.next;
            }
            System.out.println();
        }
    }

    static void displayDoublyLinkedList2(){
        if(tail==null){
            System.out.println("List is empty");
        }else{
            node cunode = tail;
            while(cunode!=null){
                System.out.print("<--"+cunode.data+"-->");
                cunode = cunode.prev;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        insertAtBeginning(8);
        insertAtBeginning(0);
        insertAtBeginning(7);
        insertAtEnd(1);
        insertAtEnd(2);
        displayDoublyLinkedList();
        //insertAtPosition(5, 7);
        // deleteAtBeginning();
        // deleteAtEnd();
        deleteAtSpecificPosition(5);
        displayDoublyLinkedList();
        displayDoublyLinkedList2();
    }
}
