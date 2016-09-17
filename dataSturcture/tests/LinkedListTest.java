import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gaurav on 17-09-2016.
 */
public class LinkedListTest {
    LinkedList obj =new LinkedList();


    @Test
    public void countIndex() throws Exception {
        obj.addNode(new Node(1));
        obj.addNode(new Node(2));
        obj.addNode(new Node(3));
        assertEquals(3,obj.countIndex());
        obj.printLink();
        System.out.println();
        obj.addAtN(new Node(8),2);
        obj.printLink();
        System.out.println();
        assertEquals(4,obj.countIndex());
        obj.delNode(3);
        assertEquals(3,obj.countIndex());
        obj.printLink();
        System.out.println();
        obj.delNode(1);
        assertEquals(2,obj.countIndex());
        obj.printLink();
        System.out.println();
    }
}