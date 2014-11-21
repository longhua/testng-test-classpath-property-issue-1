package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

/**
 * @author LongHua Huang (longhua1984@gmail.com)
 */
public class SimpleTest2 {

    @Test
    public void test1() {
        System.out.println("SimpleTest2.test1");
        assertFalse(true);
    }

    @Test
    public void test2() {
        System.out.println("SimpleTest2.test2");
        assertFalse(false);
    }
}
