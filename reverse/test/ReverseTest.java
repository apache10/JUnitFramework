import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gaurav on 13-09-2016.
 */
public class ReverseTest {
    @Test
    public void reverse() throws Exception {
        String str = "I am testing ";
        Reverse rev = new Reverse();
        assertEquals("testing am I ", rev.Reverse(str));

    }

}