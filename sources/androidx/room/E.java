package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.F;
import androidx.room.r;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o.C5647c;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t\u0012\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010'\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010-\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u00100\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R\u0017\u00103\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R\u0017\u00109\u001a\u0002048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010;\u001a\u0002048\u0006¢\u0006\f\n\u0004\b:\u00106\u001a\u0004\b\u0018\u00108R\u0011\u0010>\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010=¨\u0006?"}, d2 = {"Landroidx/room/E;", "T", "Landroidx/lifecycle/F;", "Landroidx/room/x;", "database", "Landroidx/room/p;", "container", "", "inTransaction", "Ljava/util/concurrent/Callable;", "computeFunction", "", "", "tableNames", "<init>", "(Landroidx/room/x;Landroidx/room/p;ZLjava/util/concurrent/Callable;[Ljava/lang/String;)V", "LXH/N;", "onActive", "()V", "onInactive", "c", "Landroidx/room/x;", "getDatabase", "()Landroidx/room/x;", "d", "Landroidx/room/p;", "e", "Z", "getInTransaction", "()Z", "f", "Ljava/util/concurrent/Callable;", "getComputeFunction", "()Ljava/util/concurrent/Callable;", "Landroidx/room/r$c;", "g", "Landroidx/room/r$c;", "getObserver", "()Landroidx/room/r$c;", "observer", "Ljava/util/concurrent/atomic/AtomicBoolean;", "h", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getInvalid", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "invalid", "i", "getComputing", "computing", "j", "getRegisteredObserver", "registeredObserver", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "getRefreshRunnable", "()Ljava/lang/Runnable;", "refreshRunnable", "l", "invalidationRunnable", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "queryExecutor", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"RestrictedApi"})
public final class E<T> extends F<T> {

    /* renamed from: c  reason: collision with root package name */
    private final x f44220c;

    /* renamed from: d  reason: collision with root package name */
    private final p f44221d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f44222e;

    /* renamed from: f  reason: collision with root package name */
    private final Callable<T> f44223f;

    /* renamed from: g  reason: collision with root package name */
    private final r.c f44224g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f44225h = new AtomicBoolean(true);

    /* renamed from: i  reason: collision with root package name */
    private final AtomicBoolean f44226i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f44227j = new AtomicBoolean(false);

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f44228k = new C(this);

    /* renamed from: l  reason: collision with root package name */
    private final Runnable f44229l = new D(this);

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/room/E$a", "Landroidx/room/r$c;", "", "", "tables", "LXH/N;", "c", "(Ljava/util/Set;)V", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends r.c {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ E<T> f44230b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(String[] strArr, E<T> e10) {
            super(strArr);
            this.f44230b = e10;
        }

        public void c(Set<String> set) {
            C17542s.j(set, "tables");
            C5647c.h().b(this.f44230b.d());
        }
    }

    public E(x xVar, p pVar, boolean z10, Callable<T> callable, String[] strArr) {
        C17542s.j(xVar, "database");
        C17542s.j(pVar, "container");
        C17542s.j(callable, "computeFunction");
        C17542s.j(strArr, "tableNames");
        this.f44220c = xVar;
        this.f44221d = pVar;
        this.f44222e = z10;
        this.f44223f = callable;
        this.f44224g = new a(strArr, this);
    }

    /* access modifiers changed from: private */
    public static final void f(E e10) {
        C17542s.j(e10, "this$0");
        boolean hasActiveObservers = e10.hasActiveObservers();
        if (e10.f44225h.compareAndSet(false, true) && hasActiveObservers) {
            e10.e().execute(e10.f44228k);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(androidx.room.E r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f44227j
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x001a
            androidx.room.x r0 = r5.f44220c
            androidx.room.r r0 = r0.getInvalidationTracker()
            androidx.room.r$c r3 = r5.f44224g
            r0.d(r3)
        L_0x001a:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f44226i
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0050
            r0 = 0
            r3 = r1
        L_0x0024:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.f44225h     // Catch:{ all -> 0x0034 }
            boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0034 }
            if (r4 == 0) goto L_0x003f
            java.util.concurrent.Callable<T> r0 = r5.f44223f     // Catch:{ Exception -> 0x0036 }
            java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x0036 }
            r3 = r2
            goto L_0x0024
        L_0x0034:
            r0 = move-exception
            goto L_0x004a
        L_0x0036:
            r0 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "Exception while computing database live data."
            r2.<init>(r3, r0)     // Catch:{ all -> 0x0034 }
            throw r2     // Catch:{ all -> 0x0034 }
        L_0x003f:
            if (r3 == 0) goto L_0x0044
            r5.postValue(r0)     // Catch:{ all -> 0x0034 }
        L_0x0044:
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f44226i
            r0.set(r1)
            goto L_0x0051
        L_0x004a:
            java.util.concurrent.atomic.AtomicBoolean r5 = r5.f44226i
            r5.set(r1)
            throw r0
        L_0x0050:
            r3 = r1
        L_0x0051:
            if (r3 == 0) goto L_0x005b
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.f44225h
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001a
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.E.g(androidx.room.E):void");
    }

    public final Runnable d() {
        return this.f44229l;
    }

    public final Executor e() {
        return this.f44222e ? this.f44220c.getTransactionExecutor() : this.f44220c.getQueryExecutor();
    }

    /* access modifiers changed from: protected */
    public void onActive() {
        super.onActive();
        p pVar = this.f44221d;
        C17542s.h(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        pVar.b(this);
        e().execute(this.f44228k);
    }

    /* access modifiers changed from: protected */
    public void onInactive() {
        super.onInactive();
        p pVar = this.f44221d;
        C17542s.h(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        pVar.c(this);
    }
}
