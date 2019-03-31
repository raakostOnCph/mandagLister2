public class Liste {

    Node head = null;
    Node tail = null;

    
    public boolean isHead(Node n) {
        
        if (n == head) {
            return true;
        }
        return false;
    }

    public boolean isTail(Node n) {

        if (n == tail) {
            return true;
        }
        return false;
    }




    public void multiInsert( String[] strings) {
        for (int i = 0; i < strings.length; i++) {

            insertFromHead(strings[i]);
        }
    }


    public boolean empty() {

        if (head == null) {
            return true;
        }
        return false;
    }

    public boolean onlyOne() {

        if (head != null && head == tail) {
            return true;
        }
        return false;
    }


    public Node insertFromHead(String s) {
        return insertFromHead(new Node(s));
    }

    public Node insertFromHead(Node node) {

        if (empty()) {
            head= node;
            tail = node;
            return head;
        }

        node.next = head;
        head.previous = node;
        head = node;
        return head;

    }

    public String prepareForPrint() {

         String res="";

         Node node = head;

         while (node != null) {

             res += node.getData() + "\n";
             node = node.next;
         }

         return res;
    }



    public Node removeFromHead() {

         Node node = null;

         if (empty()) {
             return node;
         }

         Node temp = head;


         head = head.next;
         head.previous = null;
         temp.next = null;

         return temp;

    }

    public Liste removeMulti( int antal ){

         Liste nyListe = new Liste();

        for (int i = 0; i < antal ; i++) {

         nyListe.insertFromHead(removeFromHead());
        }

        return nyListe;

    }

    public Node findeNode(String s) {

         Node res= null;

         Node node = head;

         while (node != null) {

             if (node.getData().equalsIgnoreCase(s)) {
                 res = node;
                 break;
             }
             node = node.next;

         }

        return  res;
    }

    public Node removeNode(Node n) {

         Node res = null;
         
         
         

         if (n == null) {
             return  res;
         }
         if (isHead(n)) {
             return removeFromHead();
         }
         
         n.next.previous = n.previous;
         n.previous.next = n.next;

         n.next= null;
         n.previous = null;

         return n;
    }

    
    
    
}
