package jD;

import am.h;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u001f\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006\u001c"}, d2 = {"LjD/i;", "LjD/c;", "", "timeout", "Ljava/util/concurrent/TimeUnit;", "unit", "Lam/h;", "time", "<init>", "(JLjava/util/concurrent/TimeUnit;Lam/h;)V", "(JLjava/util/concurrent/TimeUnit;)V", "", "key", "", "updateState", "c", "(Ljava/lang/String;Z)Z", "a", "(Ljava/lang/String;)Z", "includePartial", "LXH/N;", "b", "(Ljava/lang/String;Z)V", "Lam/h;", "", "Ljava/util/Map;", "timestamps", "J", "useraccount-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jD.i  reason: case insensitive filesystem */
public final class C14627i implements C14621c {

    /* renamed from: a  reason: collision with root package name */
    private final h f127893a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, Long> f127894b;

    /* renamed from: c  reason: collision with root package name */
    private final long f127895c;

    public C14627i(long j10, TimeUnit timeUnit, h hVar) {
        C17542s.j(timeUnit, "unit");
        C17542s.j(hVar, "time");
        this.f127893a = hVar;
        this.f127894b = new LinkedHashMap();
        this.f127895c = timeUnit.toMillis(j10);
    }

    private final boolean c(String str, boolean z10) {
        long c10 = this.f127893a.c();
        Long l10 = this.f127894b.get(str);
        boolean z11 = true;
        if (l10 != null && c10 - l10.longValue() <= this.f127895c) {
            z11 = false;
        }
        if (z10) {
            this.f127894b.put(str, Long.valueOf(c10));
        }
        return z11;
    }

    public synchronized boolean a(String str) {
        C17542s.j(str, "key");
        return c(str, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0059, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(java.lang.String r7, boolean r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r7, r0)     // Catch:{ all -> 0x003b }
            boolean r0 = HJ.C15854t.v0(r7)     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x000e
            monitor-exit(r6)
            return
        L_0x000e:
            if (r8 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.lang.Long> r8 = r6.f127894b     // Catch:{ all -> 0x003b }
            java.util.Set r8 = r8.keySet()     // Catch:{ all -> 0x003b }
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch:{ all -> 0x003b }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003b }
            r0.<init>()     // Catch:{ all -> 0x003b }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x003b }
        L_0x0021:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x003b }
            if (r1 == 0) goto L_0x003d
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x003b }
            r2 = r1
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x003b }
            r3 = 2
            r4 = 0
            r5 = 0
            boolean r2 = HJ.C15854t.W(r2, r7, r5, r3, r4)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x0021
            r0.add(r1)     // Catch:{ all -> 0x003b }
            goto L_0x0021
        L_0x003b:
            r7 = move-exception
            goto L_0x005a
        L_0x003d:
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x003b }
        L_0x0041:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x003b }
            if (r8 == 0) goto L_0x0058
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x003b }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x003b }
            java.util.Map<java.lang.String, java.lang.Long> r0 = r6.f127894b     // Catch:{ all -> 0x003b }
            r0.remove(r8)     // Catch:{ all -> 0x003b }
            goto L_0x0041
        L_0x0053:
            java.util.Map<java.lang.String, java.lang.Long> r8 = r6.f127894b     // Catch:{ all -> 0x003b }
            r8.remove(r7)     // Catch:{ all -> 0x003b }
        L_0x0058:
            monitor-exit(r6)
            return
        L_0x005a:
            monitor-exit(r6)     // Catch:{ all -> 0x003b }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jD.C14627i.b(java.lang.String, boolean):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C14627i(long j10, TimeUnit timeUnit) {
        this(j10, timeUnit, h.f90337a);
        C17542s.j(timeUnit, "unit");
    }
}
