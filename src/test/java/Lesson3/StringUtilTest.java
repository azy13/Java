package Lesson3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringUtilTest {

    @Test
    public void testIsEmpty_nullString_returnTrue(){
        boolean result = StringUtil.isEmpty(null);
        Assertions.assertFalse(!result);
    }


}
