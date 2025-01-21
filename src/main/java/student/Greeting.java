package student; // the "package", in java folder structure maters and creates packages.

/**
 * This class is a place holder which you will fully implement based on the javadoc
 * The greeting class stores the locality ID, locality name, and a string format of the greeting both ascii and unicode.
 * https://cs5004-khoury-lionelle.github.io/hello_world/student/package-summary.html
 */
public class Greeting {
    /** holds the name of the locality. */
    private String localityName;
    /** holds the int value of localityID.  */
    private int localityID;
    /** holds the Ascii greeting. */
    private String asciiGreeting;
    /** holds the Unicode greeting. */
    private String unicodeGreeting;
    /** holds the format string. */
    private String formatStr;
    /** holds the special case for locality name "China". */
    private final String edgeCase = "China";

    /**
     * Default greeting that creates "Hello, {name}!".
     * @param localityID      id of the locality
     * @param localityName    name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello");
    }

    /**
     * Greeting that creates a greeting with ascii and Unicode characters.
     * Assume the language is already using ascii letters only.
     * @param localityID      id of the locality
     * @param localityName    name of the locality
     * @param greeting   greeting using ascii characters
     */
    public Greeting(int localityID, String localityName, String greeting) {
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Greeting that creates a greeting with ascii and Unicode characters.
     * @param localityID      id of the locality
     * @param localityName    name of the locality
     * @param asciiGreeting   greeting using ascii characters
     * @param unicodeGreeting greeting using Unicode characters
     * @param formatStr       format string for the greeting
     */
    public Greeting(int localityID, String localityName, String asciiGreeting,
                    String unicodeGreeting, String formatStr) {
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * return the localityID.
     * @return the localityID
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * return the locality Name.
     * @return the locality Name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * return the Greeting in Ascii code format.
     * @return the Ascii format Greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * return the Greeting in Unicode format.
     * @return the Unicode format Greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * return format string with greeting string inserted based in locality name.
     * @return format String
     */
    public String getFormatStr() {
        if (localityName.equals(edgeCase)) { // Edge case when locality name is China, the format should be special.
            return String.format("%%s, %s!", unicodeGreeting);
        }
        return String.format(formatStr, unicodeGreeting, "%s");
    }

    /**
     * return format string with greeting string based on locality name and has ascii requirement or not.
     * @param asciiOnly require whether the greeting in ascii or not
     * @return format string with greeting string inserted
     */
    public String getFormatStr(boolean asciiOnly) {
        if (localityName.equals(edgeCase)) { // Edge case when locality name is China, the format should be special
            String greeting = asciiOnly ? asciiGreeting : unicodeGreeting;
            return String.format("%%s, %s!", greeting);
        }
        return String.format(formatStr, asciiOnly ? asciiGreeting : unicodeGreeting, "%s");
    }

    /**
     * generate a greeting string.
     * @return a format string contains localityID, localityName, asciiGreeting, unicodeGreeting
     */
    public String toString() {
        return String.format("{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting);
    }
}
