package Y7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class h<T, Y> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<T, a<Y>> f41012a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    private final long f41013b;

    /* renamed from: c  reason: collision with root package name */
    private long f41014c;

    /* renamed from: d  reason: collision with root package name */
    private long f41015d;

    static final class a<Y> {

        /* renamed from: a  reason: collision with root package name */
        final Y f41016a;

        /* renamed from: b  reason: collision with root package name */
        final int f41017b;

        a(Y y10, int i10) {
            this.f41016a = y10;
            this.f41017b = i10;
        }
    }

    public h(long j10) {
        this.f41013b = j10;
        this.f41014c = j10;
    }

    private void f() {
        m(this.f41014c);
    }

    public void b() {
        m(0);
    }

    public synchronized Y g(T t10) {
        a aVar;
        aVar = this.f41012a.get(t10);
        return aVar != null ? aVar.f41016a : null;
    }

    public synchronized long h() {
        return this.f41014c;
    }

    /* access modifiers changed from: protected */
    public int i(Y y10) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void j(T t10, Y y10) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004b, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Y k(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.i(r9)     // Catch:{ all -> 0x0012 }
            long r1 = (long) r0     // Catch:{ all -> 0x0012 }
            long r3 = r7.f41014c     // Catch:{ all -> 0x0012 }
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L_0x0014
            r7.j(r8, r9)     // Catch:{ all -> 0x0012 }
            monitor-exit(r7)
            return r4
        L_0x0012:
            r8 = move-exception
            goto L_0x004c
        L_0x0014:
            if (r9 == 0) goto L_0x001b
            long r5 = r7.f41015d     // Catch:{ all -> 0x0012 }
            long r5 = r5 + r1
            r7.f41015d = r5     // Catch:{ all -> 0x0012 }
        L_0x001b:
            java.util.Map<T, Y7.h$a<Y>> r1 = r7.f41012a     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0021
            r2 = r4
            goto L_0x0026
        L_0x0021:
            Y7.h$a r2 = new Y7.h$a     // Catch:{ all -> 0x0012 }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x0012 }
        L_0x0026:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x0012 }
            Y7.h$a r0 = (Y7.h.a) r0     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x0043
            long r1 = r7.f41015d     // Catch:{ all -> 0x0012 }
            int r3 = r0.f41017b     // Catch:{ all -> 0x0012 }
            long r5 = (long) r3     // Catch:{ all -> 0x0012 }
            long r1 = r1 - r5
            r7.f41015d = r1     // Catch:{ all -> 0x0012 }
            Y r1 = r0.f41016a     // Catch:{ all -> 0x0012 }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0043
            Y r9 = r0.f41016a     // Catch:{ all -> 0x0012 }
            r7.j(r8, r9)     // Catch:{ all -> 0x0012 }
        L_0x0043:
            r7.f()     // Catch:{ all -> 0x0012 }
            if (r0 == 0) goto L_0x004a
            Y r4 = r0.f41016a     // Catch:{ all -> 0x0012 }
        L_0x004a:
            monitor-exit(r7)
            return r4
        L_0x004c:
            monitor-exit(r7)     // Catch:{ all -> 0x0012 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Y7.h.k(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public synchronized Y l(T t10) {
        a remove = this.f41012a.remove(t10);
        if (remove == null) {
            return null;
        }
        this.f41015d -= (long) remove.f41017b;
        return remove.f41016a;
    }

    /* access modifiers changed from: protected */
    public synchronized void m(long j10) {
        while (this.f41015d > j10) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f41012a.entrySet().iterator();
            Map.Entry next = it.next();
            a aVar = (a) next.getValue();
            this.f41015d -= (long) aVar.f41017b;
            Object key = next.getKey();
            it.remove();
            j(key, aVar.f41016a);
        }
    }
}
