public class Stak {

    private Liste liste = new Liste();


    public Node push(String s) {

        return liste.insertFromHead(s);
    }

    public void udskriv() {

        System.out.println(liste.prepareForPrint());

    }



}
