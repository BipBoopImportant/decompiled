package w3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class u {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, String> f31506a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f31507b;

    public synchronized Map<String, String> a() {
        try {
            if (this.f31507b == null) {
                this.f31507b = Collections.unmodifiableMap(new HashMap(this.f31506a));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f31507b;
    }
}
