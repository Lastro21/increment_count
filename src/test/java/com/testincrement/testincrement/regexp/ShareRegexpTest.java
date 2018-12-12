package com.testincrement.testincrement.regexp;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ShareRegexpTest {

    @Test
    public void whenRegexpInputMaxValueCountStringOfString() {
        ShareRegexp shareRegexp = new ShareRegexp();
        assertThat(shareRegexp.regexpInputMaxValueCount("any_string"), is(false));
    }
    @Test
    public void whenRegexpInputMaxValueCountStringOfNumber() {
        ShareRegexp shareRegexp = new ShareRegexp();
        assertThat(shareRegexp.regexpInputMaxValueCount("4465"), is(true));
    }

}