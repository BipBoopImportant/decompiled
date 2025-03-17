package IE;

/* renamed from: IE.a  reason: case insensitive filesystem */
public enum C13031a {
    SDK_NOT_READY("Optimizely SDK not configured properly yet."),
    FLAG_KEY_INVALID("No flag was found for key \"%s\"."),
    VARIABLE_VALUE_INVALID("Variable value for key \"%s\" is invalid or wrong type.");
    
    private String format;

    private C13031a(String str) {
        this.format = str;
    }

    public String a(Object... objArr) {
        return String.format(this.format, objArr);
    }
}
