package test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

/**
 * @author LongHua Huang (longhua1984@gmail.com)
 */
public class SimpleTest1 {

    @Test
    public void test1() {
        System.out.println("SimpleTest1.test1");
        assertFalse(true);
    }

    @Test
    public void test2() {
        System.out.println("SimpleTest1.test2");
        assertFalse(false);
    }
}
