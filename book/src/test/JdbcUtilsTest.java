package test;

import org.junit.Test;
import utils.JdbcUtils;

/**
 * @author YANG
 * @create 2021-07-15 16:45
 */
public class JdbcUtilsTest {

    @Test
    public void testJdbcUtils(){
        System.out.println(JdbcUtils.getConnection());
    }


}
