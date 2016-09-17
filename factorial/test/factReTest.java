import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by gaurav on 13-09-2016.
 */
public class factReTest {
    @Test
    public void fact() throws Exception {
        factRe obj = new factRe();
        assertEquals(24,obj.fact(4));

    }

} 