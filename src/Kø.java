public class Kø {

    private Liste liste = new Liste();

    public Node insert(String s) {

        return liste.insertFromHead(s);
    }



    public Node remove() {

        return liste.removeFromTail();
    }


    public void udskriv() {

        System.out.println(liste.prepareForPrint());
    }
}
