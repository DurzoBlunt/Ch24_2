import static org.junit.Assert.*;

public class MyLinkedListTest {
    @org.junit.Test
    public void contains() throws Exception {
        MyLinkedList newList = new MyLinkedList();
        newList.add("Bob");
        newList.add("Jake");
        newList.add("Fred");
        assertTrue(newList.contains("Fred"));
    }

    @org.junit.Test
    public void get() throws Exception {
        MyLinkedList newList = new MyLinkedList();
        newList.add("Bob");
        newList.add("Jake");
        newList.add("Fred");
        assertEquals("Jake", newList.get(1));
    }

    @org.junit.Test
    public void indexOf() throws Exception {
        MyLinkedList newList = new MyLinkedList();
        newList.add("Bob");
        newList.add("Jake");
        newList.add("Fred");
        assertEquals(2, newList.indexOf("Fred"));
        assertEquals(-1, newList.indexOf("Dog"));
    }

    @org.junit.Test
    public void lastIndexOf() throws Exception {
        MyLinkedList newList = new MyLinkedList();
        newList.add("Bob");
        newList.add("Jake");
        newList.add("Fred");
        assertEquals(2, newList.lastIndexOf("Fred"));
        assertEquals(-1, newList.lastIndexOf("Dog"));
    }

    @org.junit.Test
    public void set() throws Exception {
        MyLinkedList newList = new MyLinkedList();
        newList.add("Bob");
        newList.add("Jake");
        newList.add("Fred");
        newList.set(2,"John");
        assertEquals("John", newList.get(2));
    }

}