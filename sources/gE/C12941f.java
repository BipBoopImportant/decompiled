package GE;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: GE.f  reason: case insensitive filesystem */
public class C12941f<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f110493c = LoggerFactory.getLogger((Class<?>) C12941f.class);

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, C12940e<T>> f110494a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f110495b;

    public C12941f() {
        this(new AtomicInteger());
    }

    public int a(C12940e<T> eVar) {
        synchronized (this.f110494a) {
            try {
                for (C12940e<T> equals : this.f110494a.values()) {
                    if (equals.equals(eVar)) {
                        f110493c.warn("Notification listener was already added");
                        return -1;
                    }
                }
                int incrementAndGet = this.f110495b.incrementAndGet();
                this.f110494a.put(Integer.valueOf(incrementAndGet), eVar);
                return incrementAndGet;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:6|7|8|10|11|19|16|4) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x000d, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0025 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(T r7) {
        /*
            r6 = this;
            java.util.Map<java.lang.Integer, GE.e<T>> r0 = r6.f110494a
            monitor-enter(r0)
            java.util.Map<java.lang.Integer, GE.e<T>> r1 = r6.f110494a     // Catch:{ all -> 0x0023 }
            java.util.Set r1 = r1.entrySet()     // Catch:{ all -> 0x0023 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0023 }
        L_0x000d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0035
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0023 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ all -> 0x0023 }
            java.lang.Object r3 = r2.getValue()     // Catch:{ Exception -> 0x0025 }
            GE.e r3 = (GE.C12940e) r3     // Catch:{ Exception -> 0x0025 }
            r3.a(r7)     // Catch:{ Exception -> 0x0025 }
            goto L_0x000d
        L_0x0023:
            r7 = move-exception
            goto L_0x0037
        L_0x0025:
            org.slf4j.Logger r3 = f110493c     // Catch:{ all -> 0x0023 }
            java.lang.String r4 = "Catching exception sending notification for class: {}, handler: {}"
            java.lang.Class r5 = r7.getClass()     // Catch:{ all -> 0x0023 }
            java.lang.Object r2 = r2.getKey()     // Catch:{ all -> 0x0023 }
            r3.warn((java.lang.String) r4, (java.lang.Object) r5, (java.lang.Object) r2)     // Catch:{ all -> 0x0023 }
            goto L_0x000d
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            return
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: GE.C12941f.b(java.lang.Object):void");
    }

    public int c() {
        return this.f110494a.size();
    }

    public C12941f(AtomicInteger atomicInteger) {
        this.f110494a = Collections.synchronizedMap(new LinkedHashMap());
        this.f110495b = atomicInteger;
    }
}
