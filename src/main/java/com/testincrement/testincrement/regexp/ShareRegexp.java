package com.testincrement.testincrement.regexp;


import java.util.regex.Pattern;

/**
 * This pattern for input parameters {@link com.testincrement.testincrement.controllers.SetMaxValueController}
 */
final public class ShareRegexp {

    private static final Pattern PATTERN = Pattern.compile("[0-9]{1,10}");

    public ShareRegexp() {
    }

    /**
     * @param str parameter pass from input on client side
     * @return boolean value
     */
    public boolean regexpInputMaxValueCount(String str) {
        return PATTERN.matcher(str)
                .matches();
    }
}
