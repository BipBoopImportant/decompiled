package androidx.window.layout.adapter.sidecar;

import XH.C16807N;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import d5.k;
import g5.C7872a;
import i5.C8211c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 %2\u00020\u0001:\u0003\u0017\u0015%B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b;", "Lg5/a;", "Landroidx/window/layout/adapter/sidecar/a;", "windowExtension", "<init>", "(Landroidx/window/layout/adapter/sidecar/a;)V", "Landroid/app/Activity;", "activity", "", "h", "(Landroid/app/Activity;)Z", "LXH/N;", "f", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "LH2/a;", "Lf5/k;", "callback", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;LH2/a;)V", "a", "(LH2/a;)V", "Landroidx/window/layout/adapter/sidecar/a;", "getWindowExtension", "()Landroidx/window/layout/adapter/sidecar/a;", "setWindowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/adapter/sidecar/b$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "g", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "windowLayoutChangeCallbacks", "c", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements C7872a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f45044c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static volatile b f45045d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final ReentrantLock f45046e = new ReentrantLock();

    /* renamed from: a  reason: collision with root package name */
    private a f45047a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<c> f45048b = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/adapter/sidecar/b;", "a", "(Landroid/content/Context;)Landroidx/window/layout/adapter/sidecar/b;", "Landroidx/window/layout/adapter/sidecar/a;", "b", "(Landroid/content/Context;)Landroidx/window/layout/adapter/sidecar/a;", "Ld5/k;", "sidecarVersion", "", "c", "(Ld5/k;)Z", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "globalInstance", "Landroidx/window/layout/adapter/sidecar/b;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Context context) {
            C17542s.j(context, "context");
            if (b.f45045d == null) {
                ReentrantLock d10 = b.f45046e;
                d10.lock();
                try {
                    if (b.f45045d == null) {
                        b.f45045d = new b(b.f45044c.b(context));
                    }
                    C16807N n10 = C16807N.f139792a;
                    d10.unlock();
                } catch (Throwable th2) {
                    d10.unlock();
                    throw th2;
                }
            }
            b c10 = b.f45045d;
            C17542s.g(c10);
            return c10;
        }

        public final a b(Context context) {
            C17542s.j(context, "context");
            try {
                if (!c(SidecarCompat.f45032f.c())) {
                    return null;
                }
                SidecarCompat sidecarCompat = new SidecarCompat(context);
                if (!sidecarCompat.n()) {
                    return null;
                }
                return sidecarCompat;
            } catch (Throwable unused) {
                return null;
            }
        }

        public final boolean c(k kVar) {
            return kVar != null && kVar.compareTo(k.f50750f.a()) >= 0;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "<init>", "(Landroidx/window/layout/adapter/sidecar/b;)V", "Landroid/app/Activity;", "activity", "Lf5/k;", "newLayout", "LXH/N;", "a", "(Landroid/app/Activity;Lf5/k;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.layout.adapter.sidecar.b$b  reason: collision with other inner class name */
    public final class C0775b implements a.C0774a {
        public C0775b() {
        }

        public void a(Activity activity, f5.k kVar) {
            C17542s.j(activity, "activity");
            C17542s.j(kVar, "newLayout");
            Iterator<c> it = b.this.g().iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (C17542s.e(next.d(), activity)) {
                    next.b(kVar);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$c;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "LH2/a;", "Lf5/k;", "callback", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;LH2/a;)V", "newLayoutInfo", "LXH/N;", "b", "(Lf5/k;)V", "a", "Landroid/app/Activity;", "d", "()Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "c", "LH2/a;", "e", "()LH2/a;", "Lf5/k;", "f", "()Lf5/k;", "setLastInfo", "lastInfo", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Activity f45050a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f45051b;

        /* renamed from: c  reason: collision with root package name */
        private final H2.a<f5.k> f45052c;

        /* renamed from: d  reason: collision with root package name */
        private f5.k f45053d;

        public c(Activity activity, Executor executor, H2.a<f5.k> aVar) {
            C17542s.j(activity, "activity");
            C17542s.j(executor, "executor");
            C17542s.j(aVar, "callback");
            this.f45050a = activity;
            this.f45051b = executor;
            this.f45052c = aVar;
        }

        /* access modifiers changed from: private */
        public static final void c(c cVar, f5.k kVar) {
            C17542s.j(cVar, "this$0");
            C17542s.j(kVar, "$newLayoutInfo");
            cVar.f45052c.accept(kVar);
        }

        public final void b(f5.k kVar) {
            C17542s.j(kVar, "newLayoutInfo");
            this.f45053d = kVar;
            this.f45051b.execute(new C8211c(this, kVar));
        }

        public final Activity d() {
            return this.f45050a;
        }

        public final H2.a<f5.k> e() {
            return this.f45052c;
        }

        public final f5.k f() {
            return this.f45053d;
        }
    }

    public b(a aVar) {
        this.f45047a = aVar;
        a aVar2 = this.f45047a;
        if (aVar2 != null) {
            aVar2.a(new C0775b());
        }
    }

    private final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f45048b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            for (c d10 : copyOnWriteArrayList) {
                if (C17542s.e(d10.d(), activity)) {
                    return;
                }
            }
        }
        a aVar = this.f45047a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    private final boolean h(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f45048b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        for (c d10 : copyOnWriteArrayList) {
            if (C17542s.e(d10.d(), activity)) {
                return true;
            }
        }
        return false;
    }

    public void a(H2.a<f5.k> aVar) {
        C17542s.j(aVar, "callback");
        synchronized (f45046e) {
            try {
                if (this.f45047a != null) {
                    ArrayList<c> arrayList = new ArrayList<>();
                    Iterator<c> it = this.f45048b.iterator();
                    while (it.hasNext()) {
                        c next = it.next();
                        if (next.e() == aVar) {
                            C17542s.i(next, "callbackWrapper");
                            arrayList.add(next);
                        }
                    }
                    this.f45048b.removeAll(arrayList);
                    for (c d10 : arrayList) {
                        f(d10.d());
                    }
                    C16807N n10 = C16807N.f139792a;
                }
            } finally {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [XH.N] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r6, java.util.concurrent.Executor r7, H2.a<f5.k> r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "executor"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            boolean r0 = r6 instanceof android.app.Activity
            r1 = 0
            if (r0 == 0) goto L_0x0017
            android.app.Activity r6 = (android.app.Activity) r6
            goto L_0x0018
        L_0x0017:
            r6 = r1
        L_0x0018:
            if (r6 == 0) goto L_0x0081
            java.util.concurrent.locks.ReentrantLock r0 = f45046e
            r0.lock()
            androidx.window.layout.adapter.sidecar.a r2 = r5.f45047a     // Catch:{ all -> 0x0033 }
            if (r2 != 0) goto L_0x0035
            f5.k r6 = new f5.k     // Catch:{ all -> 0x0033 }
            java.util.List r7 = YH.C16877v.n()     // Catch:{ all -> 0x0033 }
            r6.<init>(r7)     // Catch:{ all -> 0x0033 }
            r8.accept(r6)     // Catch:{ all -> 0x0033 }
            r0.unlock()
            return
        L_0x0033:
            r6 = move-exception
            goto L_0x007d
        L_0x0035:
            boolean r3 = r5.h(r6)     // Catch:{ all -> 0x0033 }
            androidx.window.layout.adapter.sidecar.b$c r4 = new androidx.window.layout.adapter.sidecar.b$c     // Catch:{ all -> 0x0033 }
            r4.<init>(r6, r7, r8)     // Catch:{ all -> 0x0033 }
            java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.adapter.sidecar.b$c> r7 = r5.f45048b     // Catch:{ all -> 0x0033 }
            r7.add(r4)     // Catch:{ all -> 0x0033 }
            if (r3 != 0) goto L_0x0049
            r2.b(r6)     // Catch:{ all -> 0x0033 }
            goto L_0x0075
        L_0x0049:
            java.util.concurrent.CopyOnWriteArrayList<androidx.window.layout.adapter.sidecar.b$c> r7 = r5.f45048b     // Catch:{ all -> 0x0033 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0033 }
        L_0x004f:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0067
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0033 }
            r3 = r2
            androidx.window.layout.adapter.sidecar.b$c r3 = (androidx.window.layout.adapter.sidecar.b.c) r3     // Catch:{ all -> 0x0033 }
            android.app.Activity r3 = r3.d()     // Catch:{ all -> 0x0033 }
            boolean r3 = kotlin.jvm.internal.C17542s.e(r6, r3)     // Catch:{ all -> 0x0033 }
            if (r3 == 0) goto L_0x004f
            goto L_0x0068
        L_0x0067:
            r2 = r1
        L_0x0068:
            androidx.window.layout.adapter.sidecar.b$c r2 = (androidx.window.layout.adapter.sidecar.b.c) r2     // Catch:{ all -> 0x0033 }
            if (r2 == 0) goto L_0x0070
            f5.k r1 = r2.f()     // Catch:{ all -> 0x0033 }
        L_0x0070:
            if (r1 == 0) goto L_0x0075
            r4.b(r1)     // Catch:{ all -> 0x0033 }
        L_0x0075:
            XH.N r6 = XH.C16807N.f139792a     // Catch:{ all -> 0x0033 }
            r0.unlock()
            XH.N r1 = XH.C16807N.f139792a
            goto L_0x0081
        L_0x007d:
            r0.unlock()
            throw r6
        L_0x0081:
            if (r1 != 0) goto L_0x008f
            f5.k r6 = new f5.k
            java.util.List r7 = YH.C16877v.n()
            r6.<init>(r7)
            r8.accept(r6)
        L_0x008f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.adapter.sidecar.b.b(android.content.Context, java.util.concurrent.Executor, H2.a):void");
    }

    public final CopyOnWriteArrayList<c> g() {
        return this.f45048b;
    }
}
