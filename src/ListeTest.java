import org.junit.Test;

import static org.junit.Assert.*;

public class ListeTest {

    Liste liste = new Liste();

    @Test
    public void empty() {


        assertEquals(true,liste.empty());

        liste.insertFromHead("palle");
        assertEquals(false,liste.empty());
    }

    @Test
    public void testForEn() {

        assertEquals(false,liste.onlyOne());

        liste.insertFromHead("ib");
        assertEquals(true,liste.onlyOne());

        liste.insertFromHead("preben");
        assertNotEquals(false,liste.onlyOne());
    }

    @Test
    public void insertFromHead() {

        Node node = new Node("1");

        assertEquals(node,liste.insertFromHead(node));

    }




}