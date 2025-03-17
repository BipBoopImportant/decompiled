package KK;

import HK.C15864d;
import XH.C16807N;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\"\u0010$\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'\"\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\"\u00101\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010 \u001a\u0004\b%\u0010\u0017\"\u0004\b0\u0010#¨\u00062"}, d2 = {"LKK/d;", "", "LKK/e;", "taskRunner", "", "name", "<init>", "(LKK/e;Ljava/lang/String;)V", "LKK/a;", "task", "", "delayNanos", "LXH/N;", "i", "(LKK/a;J)V", "", "recurrence", "k", "(LKK/a;JZ)Z", "a", "()V", "n", "b", "()Z", "toString", "()Ljava/lang/String;", "LKK/e;", "h", "()LKK/e;", "Ljava/lang/String;", "f", "c", "Z", "g", "setShutdown$okhttp", "(Z)V", "shutdown", "d", "LKK/a;", "()LKK/a;", "l", "(LKK/a;)V", "activeTask", "", "e", "Ljava/util/List;", "()Ljava/util/List;", "futureTasks", "m", "cancelActiveTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: KK.d  reason: case insensitive filesystem */
public final class C15996d {

    /* renamed from: a  reason: collision with root package name */
    private final e f135920a;

    /* renamed from: b  reason: collision with root package name */
    private final String f135921b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f135922c;

    /* renamed from: d  reason: collision with root package name */
    private C15993a f135923d;

    /* renamed from: e  reason: collision with root package name */
    private final List<C15993a> f135924e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private boolean f135925f;

    public C15996d(e eVar, String str) {
        C17542s.j(eVar, "taskRunner");
        C17542s.j(str, "name");
        this.f135920a = eVar;
        this.f135921b = str;
    }

    public static /* synthetic */ void j(C15996d dVar, C15993a aVar, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        dVar.i(aVar, j10);
    }

    public final void a() {
        if (!C15864d.f135363h || !Thread.holdsLock(this)) {
            synchronized (this.f135920a) {
                try {
                    if (b()) {
                        this.f135920a.h(this);
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final boolean b() {
        C15993a aVar = this.f135923d;
        if (aVar != null) {
            C17542s.g(aVar);
            if (aVar.a()) {
                this.f135925f = true;
            }
        }
        boolean z10 = false;
        for (int size = this.f135924e.size() - 1; -1 < size; size--) {
            if (this.f135924e.get(size).a()) {
                C15993a aVar2 = this.f135924e.get(size);
                if (e.f135926h.a().isLoggable(Level.FINE)) {
                    C15994b.c(aVar2, this, "canceled");
                }
                this.f135924e.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    public final C15993a c() {
        return this.f135923d;
    }

    public final boolean d() {
        return this.f135925f;
    }

    public final List<C15993a> e() {
        return this.f135924e;
    }

    public final String f() {
        return this.f135921b;
    }

    public final boolean g() {
        return this.f135922c;
    }

    public final e h() {
        return this.f135920a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(KK.C15993a r3, long r4) {
        /*
            r2 = this;
            java.lang.String r0 = "task"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            KK.e r0 = r2.f135920a
            monitor-enter(r0)
            boolean r1 = r2.f135922c     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0043
            boolean r4 = r3.a()     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x002a
            KK.e$b r4 = KK.e.f135926h     // Catch:{ all -> 0x0026 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0026 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = "schedule canceled (queue is shutdown)"
            KK.C15994b.c(r3, r2, r4)     // Catch:{ all -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            r3 = move-exception
            goto L_0x0053
        L_0x0028:
            monitor-exit(r0)
            return
        L_0x002a:
            KK.e$b r4 = KK.e.f135926h     // Catch:{ all -> 0x0026 }
            java.util.logging.Logger r4 = r4.a()     // Catch:{ all -> 0x0026 }
            java.util.logging.Level r5 = java.util.logging.Level.FINE     // Catch:{ all -> 0x0026 }
            boolean r4 = r4.isLoggable(r5)     // Catch:{ all -> 0x0026 }
            if (r4 == 0) goto L_0x003d
            java.lang.String r4 = "schedule failed (queue is shutdown)"
            KK.C15994b.c(r3, r2, r4)     // Catch:{ all -> 0x0026 }
        L_0x003d:
            java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x0026 }
            r3.<init>()     // Catch:{ all -> 0x0026 }
            throw r3     // Catch:{ all -> 0x0026 }
        L_0x0043:
            r1 = 0
            boolean r3 = r2.k(r3, r4, r1)     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x004f
            KK.e r3 = r2.f135920a     // Catch:{ all -> 0x0026 }
            r3.h(r2)     // Catch:{ all -> 0x0026 }
        L_0x004f:
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x0026 }
            monitor-exit(r0)
            return
        L_0x0053:
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: KK.C15996d.i(KK.a, long):void");
    }

    public final boolean k(C15993a aVar, long j10, boolean z10) {
        String str;
        C17542s.j(aVar, "task");
        aVar.e(this);
        long b10 = this.f135920a.g().b();
        long j11 = b10 + j10;
        int indexOf = this.f135924e.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.c() <= j11) {
                if (e.f135926h.a().isLoggable(Level.FINE)) {
                    C15994b.c(aVar, this, "already scheduled");
                }
                return false;
            }
            this.f135924e.remove(indexOf);
        }
        aVar.g(j11);
        if (e.f135926h.a().isLoggable(Level.FINE)) {
            if (z10) {
                str = "run again after " + C15994b.b(j11 - b10);
            } else {
                str = "scheduled after " + C15994b.b(j11 - b10);
            }
            C15994b.c(aVar, this, str);
        }
        Iterator<C15993a> it = this.f135924e.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                i10 = -1;
                break;
            } else if (it.next().c() - b10 > j10) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            i10 = this.f135924e.size();
        }
        this.f135924e.add(i10, aVar);
        return i10 == 0;
    }

    public final void l(C15993a aVar) {
        this.f135923d = aVar;
    }

    public final void m(boolean z10) {
        this.f135925f = z10;
    }

    public final void n() {
        if (!C15864d.f135363h || !Thread.holdsLock(this)) {
            synchronized (this.f135920a) {
                try {
                    this.f135922c = true;
                    if (b()) {
                        this.f135920a.h(this);
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public String toString() {
        return this.f135921b;
    }
}
