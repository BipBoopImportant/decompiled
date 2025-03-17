package Hc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f60745b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f60746a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f60745b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f60745b;
                    if (dVar == null) {
                        dVar = new d();
                        f60745b = dVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set<f> b() {
        Set<f> unmodifiableSet;
        synchronized (this.f60746a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f60746a);
        }
        return unmodifiableSet;
    }
}
