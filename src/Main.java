public class Main {

    public static void main(String[] args) {
	// write your code here

        Liste liste = new Liste();

        String [] strings = {"1","2","3","4","5","6","7","8","9"};

        liste.multiInsert(strings);

        System.out.println(liste.prepareForPrint());



//        Liste liste1 = liste.removeMulti(4);
//        System.out.println(liste1.prepareForPrint());

       // System.out.println(liste.prepareForPrint());



      liste.removeNode(liste.findeNode("6"));

        System.out.println(liste.prepareForPrint());

    }

}
