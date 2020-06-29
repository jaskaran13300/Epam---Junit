import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringTestTest {

    @Test
    void getString(){
        StringTest t=new StringTest("ABCD");
        assertEquals("BCD",t.fun());
    }
@Test
    void getString1(){
        StringTest t=new StringTest("AACD");
        assertEquals("CD",t.fun());
    }
    @Test
    void getString2(){
        StringTest t=new StringTest("BACD");
        assertEquals("BCD",t.fun());
    }
    @Test
    void getString3(){
        StringTest t=new StringTest("BBAA");
        assertEquals("BBAA",t.fun());
    }
    @Test
    void getString4(){
        StringTest t=new StringTest("AABAA");
        assertEquals("BAA",t.fun());
    }

    @Test
    void getString5(){
        StringTest t=new StringTest("A");
        assertEquals("",t.fun());
    }
    @Test
    void getString6(){
        StringTest t=new StringTest("G");
        assertEquals("G",t.fun());
    }
    @Test
    void getString7(){
        StringTest t=new StringTest("AA");
        assertEquals("",t.fun());
    }
    }

