public class Node {

    Node next = null;
    Node previous = null;

    private String data;

    public Node(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}
