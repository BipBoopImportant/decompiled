package M8;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LM8/e;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "b", "REQUEST", "RESPONSE", "REQUEST_RESPONSE", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum e {
    REQUEST("request"),
    RESPONSE("response"),
    REQUEST_RESPONSE("request-response");
    
    private final String value;

    private e(String str) {
        this.value = str;
    }

    public final String b() {
        return this.value;
    }

    public String toString() {
        return this.value;
    }
}
