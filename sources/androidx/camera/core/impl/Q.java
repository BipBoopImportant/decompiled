package androidx.camera.core.impl;

import C.C4391e0;
import C.C4400j;
import D.a;
import H2.i;
import androidx.camera.core.impl.J;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

public final class Q implements a.C0035a {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f16764a = new StringBuilder();

    /* renamed from: b  reason: collision with root package name */
    private final Object f16765b;

    /* renamed from: c  reason: collision with root package name */
    private int f16766c;

    /* renamed from: d  reason: collision with root package name */
    private final D.a f16767d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<C4400j, a> f16768e;

    /* renamed from: f  reason: collision with root package name */
    private int f16769f;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private J.a f16770a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f16771b;

        /* renamed from: c  reason: collision with root package name */
        private final b f16772c;

        /* renamed from: d  reason: collision with root package name */
        private final c f16773d;

        a(J.a aVar, Executor executor, b bVar, c cVar) {
            this.f16770a = aVar;
            this.f16771b = executor;
            this.f16772c = bVar;
            this.f16773d = cVar;
        }

        /* access modifiers changed from: package-private */
        public J.a a() {
            return this.f16770a;
        }

        /* access modifiers changed from: package-private */
        public void b() {
            try {
                Executor executor = this.f16771b;
                b bVar = this.f16772c;
                Objects.requireNonNull(bVar);
                executor.execute(new P(bVar));
            } catch (RejectedExecutionException e10) {
                C4391e0.d("CameraStateRegistry", "Unable to notify camera to configure.", e10);
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            try {
                Executor executor = this.f16771b;
                c cVar = this.f16773d;
                Objects.requireNonNull(cVar);
                executor.execute(new O(cVar));
            } catch (RejectedExecutionException e10) {
                C4391e0.d("CameraStateRegistry", "Unable to notify camera to open.", e10);
            }
        }

        /* access modifiers changed from: package-private */
        public J.a d(J.a aVar) {
            J.a aVar2 = this.f16770a;
            this.f16770a = aVar;
            return aVar2;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public Q(D.a aVar, int i10) {
        Object obj = new Object();
        this.f16765b = obj;
        this.f16768e = new HashMap();
        this.f16766c = i10;
        synchronized (obj) {
            this.f16767d = aVar;
            this.f16769f = this.f16766c;
        }
    }

    private a b(String str) {
        for (C4400j next : this.f16768e.keySet()) {
            if (str.equals(((I) next.b()).d())) {
                return this.f16768e.get(next);
            }
        }
        return null;
    }

    private static boolean d(J.a aVar) {
        return aVar != null && aVar.b();
    }

    private void f() {
        if (C4391e0.f("CameraStateRegistry")) {
            this.f16764a.setLength(0);
            this.f16764a.append("Recalculating open cameras:\n");
            this.f16764a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{"Camera", "State"}));
            this.f16764a.append("-------------------------------------------------------------------\n");
        }
        int i10 = 0;
        for (Map.Entry next : this.f16768e.entrySet()) {
            if (C4391e0.f("CameraStateRegistry")) {
                this.f16764a.append(String.format(Locale.US, "%-45s%-22s\n", new Object[]{((C4400j) next.getKey()).toString(), ((a) next.getValue()).a() != null ? ((a) next.getValue()).a().toString() : "UNKNOWN"}));
            }
            if (d(((a) next.getValue()).a())) {
                i10++;
            }
        }
        if (C4391e0.f("CameraStateRegistry")) {
            this.f16764a.append("-------------------------------------------------------------------\n");
            this.f16764a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", new Object[]{Integer.valueOf(i10), Integer.valueOf(this.f16766c)}));
            C4391e0.a("CameraStateRegistry", this.f16764a.toString());
        }
        this.f16769f = Math.max(this.f16766c - i10, 0);
    }

    private static void h(C4400j jVar, J.a aVar) {
        if (V4.a.h()) {
            V4.a.j("CX:State[" + jVar + "]", aVar.ordinal());
        }
    }

    private J.a k(C4400j jVar) {
        a remove = this.f16768e.remove(jVar);
        if (remove == null) {
            return null;
        }
        f();
        return remove.a();
    }

    private J.a l(C4400j jVar, J.a aVar) {
        J.a d10 = ((a) i.h(this.f16768e.get(jVar), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        J.a aVar2 = J.a.OPENING;
        if (aVar == aVar2) {
            i.j(d(aVar) || d10 == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (d10 != aVar) {
            h(jVar, aVar);
            f();
        }
        return d10;
    }

    public void a(int i10, int i11) {
        synchronized (this.f16765b) {
            boolean z10 = true;
            this.f16766c = i11 == 2 ? 2 : 1;
            boolean z11 = i10 != 2 && i11 == 2;
            if (i10 != 2 || i11 == 2) {
                z10 = false;
            }
            if (z11 || z10) {
                f();
            }
        }
    }

    public boolean c() {
        synchronized (this.f16765b) {
            try {
                for (Map.Entry<C4400j, a> value : this.f16768e.entrySet()) {
                    if (((a) value.getValue()).a() == J.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x009f, code lost:
        if (r4 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a1, code lost:
        r7 = r4.values().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        if (r7.hasNext() == false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00af, code lost:
        ((androidx.camera.core.impl.Q.a) r7.next()).c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b9, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bb, code lost:
        r2.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void e(C.C4400j r7, androidx.camera.core.impl.J.a r8, boolean r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f16765b
            monitor-enter(r0)
            int r1 = r6.f16769f     // Catch:{ all -> 0x000e }
            androidx.camera.core.impl.J$a r2 = androidx.camera.core.impl.J.a.RELEASED     // Catch:{ all -> 0x000e }
            if (r8 != r2) goto L_0x0011
            androidx.camera.core.impl.J$a r2 = r6.k(r7)     // Catch:{ all -> 0x000e }
            goto L_0x0015
        L_0x000e:
            r7 = move-exception
            goto L_0x00bf
        L_0x0011:
            androidx.camera.core.impl.J$a r2 = r6.l(r7, r8)     // Catch:{ all -> 0x000e }
        L_0x0015:
            if (r2 != r8) goto L_0x0019
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            return
        L_0x0019:
            D.a r2 = r6.f16767d     // Catch:{ all -> 0x000e }
            int r2 = r2.c()     // Catch:{ all -> 0x000e }
            r3 = 2
            r4 = 0
            if (r2 != r3) goto L_0x003e
            androidx.camera.core.impl.J$a r2 = androidx.camera.core.impl.J.a.CONFIGURED     // Catch:{ all -> 0x000e }
            if (r8 != r2) goto L_0x003e
            C.p r2 = r7.b()     // Catch:{ all -> 0x000e }
            androidx.camera.core.impl.I r2 = (androidx.camera.core.impl.I) r2     // Catch:{ all -> 0x000e }
            java.lang.String r2 = r2.d()     // Catch:{ all -> 0x000e }
            D.a r3 = r6.f16767d     // Catch:{ all -> 0x000e }
            java.lang.String r2 = r3.a(r2)     // Catch:{ all -> 0x000e }
            if (r2 == 0) goto L_0x003e
            androidx.camera.core.impl.Q$a r2 = r6.b(r2)     // Catch:{ all -> 0x000e }
            goto L_0x003f
        L_0x003e:
            r2 = r4
        L_0x003f:
            r3 = 1
            if (r1 >= r3) goto L_0x007f
            int r1 = r6.f16769f     // Catch:{ all -> 0x000e }
            if (r1 <= 0) goto L_0x007f
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x000e }
            r4.<init>()     // Catch:{ all -> 0x000e }
            java.util.Map<C.j, androidx.camera.core.impl.Q$a> r8 = r6.f16768e     // Catch:{ all -> 0x000e }
            java.util.Set r8 = r8.entrySet()     // Catch:{ all -> 0x000e }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ all -> 0x000e }
        L_0x0055:
            boolean r1 = r8.hasNext()     // Catch:{ all -> 0x000e }
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r8.next()     // Catch:{ all -> 0x000e }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x000e }
            java.lang.Object r3 = r1.getValue()     // Catch:{ all -> 0x000e }
            androidx.camera.core.impl.Q$a r3 = (androidx.camera.core.impl.Q.a) r3     // Catch:{ all -> 0x000e }
            androidx.camera.core.impl.J$a r3 = r3.a()     // Catch:{ all -> 0x000e }
            androidx.camera.core.impl.J$a r5 = androidx.camera.core.impl.J.a.PENDING_OPEN     // Catch:{ all -> 0x000e }
            if (r3 != r5) goto L_0x0055
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x000e }
            C.j r3 = (C.C4400j) r3     // Catch:{ all -> 0x000e }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x000e }
            androidx.camera.core.impl.Q$a r1 = (androidx.camera.core.impl.Q.a) r1     // Catch:{ all -> 0x000e }
            r4.put(r3, r1)     // Catch:{ all -> 0x000e }
            goto L_0x0055
        L_0x007f:
            androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.PENDING_OPEN     // Catch:{ all -> 0x000e }
            if (r8 != r1) goto L_0x0097
            int r8 = r6.f16769f     // Catch:{ all -> 0x000e }
            if (r8 <= 0) goto L_0x0097
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x000e }
            r4.<init>()     // Catch:{ all -> 0x000e }
            java.util.Map<C.j, androidx.camera.core.impl.Q$a> r8 = r6.f16768e     // Catch:{ all -> 0x000e }
            java.lang.Object r8 = r8.get(r7)     // Catch:{ all -> 0x000e }
            androidx.camera.core.impl.Q$a r8 = (androidx.camera.core.impl.Q.a) r8     // Catch:{ all -> 0x000e }
            r4.put(r7, r8)     // Catch:{ all -> 0x000e }
        L_0x0097:
            if (r4 == 0) goto L_0x009e
            if (r9 != 0) goto L_0x009e
            r4.remove(r7)     // Catch:{ all -> 0x000e }
        L_0x009e:
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            if (r4 == 0) goto L_0x00b9
            java.util.Collection r7 = r4.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x00a9:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x00b9
            java.lang.Object r8 = r7.next()
            androidx.camera.core.impl.Q$a r8 = (androidx.camera.core.impl.Q.a) r8
            r8.c()
            goto L_0x00a9
        L_0x00b9:
            if (r2 == 0) goto L_0x00be
            r2.b()
        L_0x00be:
            return
        L_0x00bf:
            monitor-exit(r0)     // Catch:{ all -> 0x000e }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.Q.e(C.j, androidx.camera.core.impl.J$a, boolean):void");
    }

    public void g(C4400j jVar, Executor executor, b bVar, c cVar) {
        synchronized (this.f16765b) {
            i.j(!this.f16768e.containsKey(jVar), "Camera is already registered: " + jVar);
            this.f16768e.put(jVar, new a((J.a) null, executor, bVar, cVar));
        }
    }

    public boolean i(C4400j jVar) {
        boolean z10;
        synchronized (this.f16765b) {
            try {
                a aVar = (a) i.h(this.f16768e.get(jVar), "Camera must first be registered with registerCamera()");
                z10 = false;
                if (C4391e0.f("CameraStateRegistry")) {
                    this.f16764a.setLength(0);
                    this.f16764a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", new Object[]{jVar, Integer.valueOf(this.f16769f), Boolean.valueOf(d(aVar.a())), aVar.a()}));
                }
                if (this.f16769f > 0 || d(aVar.a())) {
                    J.a aVar2 = J.a.OPENING;
                    aVar.d(aVar2);
                    h(jVar, aVar2);
                    z10 = true;
                }
                if (C4391e0.f("CameraStateRegistry")) {
                    this.f16764a.append(String.format(Locale.US, " --> %s", new Object[]{z10 ? "SUCCESS" : "FAIL"}));
                    C4391e0.a("CameraStateRegistry", this.f16764a.toString());
                }
                if (z10) {
                    f();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005a, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047 A[Catch:{ all -> 0x000f }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0055 A[ADDED_TO_REGION, Catch:{ all -> 0x000f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f16765b
            monitor-enter(r0)
            D.a r1 = r5.f16767d     // Catch:{ all -> 0x000f }
            int r1 = r1.c()     // Catch:{ all -> 0x000f }
            r2 = 2
            r3 = 1
            if (r1 == r2) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r3
        L_0x000f:
            r6 = move-exception
            goto L_0x005b
        L_0x0011:
            androidx.camera.core.impl.Q$a r6 = r5.b(r6)     // Catch:{ all -> 0x000f }
            r1 = 0
            if (r6 == 0) goto L_0x001d
            androidx.camera.core.impl.J$a r6 = r6.a()     // Catch:{ all -> 0x000f }
            goto L_0x001e
        L_0x001d:
            r6 = r1
        L_0x001e:
            if (r7 == 0) goto L_0x0025
            androidx.camera.core.impl.Q$a r7 = r5.b(r7)     // Catch:{ all -> 0x000f }
            goto L_0x0026
        L_0x0025:
            r7 = r1
        L_0x0026:
            if (r7 == 0) goto L_0x002c
            androidx.camera.core.impl.J$a r1 = r7.a()     // Catch:{ all -> 0x000f }
        L_0x002c:
            androidx.camera.core.impl.J$a r7 = androidx.camera.core.impl.J.a.OPEN     // Catch:{ all -> 0x000f }
            boolean r2 = r7.equals(r6)     // Catch:{ all -> 0x000f }
            r4 = 0
            if (r2 != 0) goto L_0x0040
            androidx.camera.core.impl.J$a r2 = androidx.camera.core.impl.J.a.CONFIGURED     // Catch:{ all -> 0x000f }
            boolean r6 = r2.equals(r6)     // Catch:{ all -> 0x000f }
            if (r6 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r6 = r4
            goto L_0x0041
        L_0x0040:
            r6 = r3
        L_0x0041:
            boolean r7 = r7.equals(r1)     // Catch:{ all -> 0x000f }
            if (r7 != 0) goto L_0x0052
            androidx.camera.core.impl.J$a r7 = androidx.camera.core.impl.J.a.CONFIGURED     // Catch:{ all -> 0x000f }
            boolean r7 = r7.equals(r1)     // Catch:{ all -> 0x000f }
            if (r7 == 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r7 = r4
            goto L_0x0053
        L_0x0052:
            r7 = r3
        L_0x0053:
            if (r6 == 0) goto L_0x0058
            if (r7 == 0) goto L_0x0058
            goto L_0x0059
        L_0x0058:
            r3 = r4
        L_0x0059:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r3
        L_0x005b:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.Q.j(java.lang.String, java.lang.String):boolean");
    }
}
