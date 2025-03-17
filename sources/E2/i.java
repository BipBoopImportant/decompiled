package E2;

import C.F;
import E2.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import j0.C5444A;
import j0.b0;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

class i {

    /* renamed from: a  reason: collision with root package name */
    static final C5444A<String, Typeface> f5976a = new C5444A<>(16);

    /* renamed from: b  reason: collision with root package name */
    private static final ExecutorService f5977b = l.a("fonts-androidx", 10, 10000);

    /* renamed from: c  reason: collision with root package name */
    static final Object f5978c = new Object();

    /* renamed from: d  reason: collision with root package name */
    static final b0<String, ArrayList<H2.a<e>>> f5979d = new b0<>();

    class a implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5980a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f5981b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ e f5982c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5983d;

        a(String str, Context context, e eVar, int i10) {
            this.f5980a = str;
            this.f5981b = context;
            this.f5982c = eVar;
            this.f5983d = i10;
        }

        /* renamed from: a */
        public e call() {
            return i.c(this.f5980a, this.f5981b, F.a(new Object[]{this.f5982c}), this.f5983d);
        }
    }

    class b implements H2.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f5984a;

        b(a aVar) {
            this.f5984a = aVar;
        }

        /* renamed from: a */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f5984a.b(eVar);
        }
    }

    class c implements Callable<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f5986b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f5987c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5988d;

        c(String str, Context context, List list, int i10) {
            this.f5985a = str;
            this.f5986b = context;
            this.f5987c = list;
            this.f5988d = i10;
        }

        /* renamed from: a */
        public e call() {
            try {
                return i.c(this.f5985a, this.f5986b, this.f5987c, this.f5988d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements H2.a<e> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5989a;

        d(String str) {
            this.f5989a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            r0 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            if (r0 >= r2.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0020, code lost:
            ((H2.a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
            return;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(E2.i.e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = E2.i.f5978c
                monitor-enter(r0)
                j0.b0<java.lang.String, java.util.ArrayList<H2.a<E2.i$e>>> r1 = E2.i.f5979d     // Catch:{ all -> 0x0011 }
                java.lang.String r2 = r4.f5989a     // Catch:{ all -> 0x0011 }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x0011 }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x0011 }
                if (r2 != 0) goto L_0x0013
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0011:
                r5 = move-exception
                goto L_0x002d
            L_0x0013:
                java.lang.String r3 = r4.f5989a     // Catch:{ all -> 0x0011 }
                r1.remove(r3)     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                r0 = 0
            L_0x001a:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002c
                java.lang.Object r1 = r2.get(r0)
                H2.a r1 = (H2.a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: E2.i.d.accept(E2.i$e):void");
        }
    }

    private static String a(List<e> list, int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < list.size(); i11++) {
            sb2.append(list.get(i11).d());
            sb2.append("-");
            sb2.append(i10);
            if (i11 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    @SuppressLint({"WrongConstant"})
    private static int b(k.a aVar) {
        int i10 = 1;
        if (aVar.e() != 0) {
            return aVar.e() != 1 ? -3 : -2;
        }
        k.b[] c10 = aVar.c();
        if (!(c10 == null || c10.length == 0)) {
            int length = c10.length;
            i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                int b10 = c10[i11].b();
                if (b10 == 0) {
                    i11++;
                } else if (b10 < 0) {
                    return -3;
                } else {
                    return b10;
                }
            }
        }
        return i10;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r4 = new E2.i.e(-1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        V4.a.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006c, code lost:
        return r4;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0063 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static E2.i.e c(java.lang.String r4, android.content.Context r5, java.util.List<E2.e> r6, int r7) {
        /*
            java.lang.String r0 = "getFontSync"
            V4.a.c(r0)
            j0.A<java.lang.String, android.graphics.Typeface> r0 = f5976a     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r0.d(r4)     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            E2.i$e r4 = new E2.i$e     // Catch:{ all -> 0x0018 }
            r4.<init>((android.graphics.Typeface) r1)     // Catch:{ all -> 0x0018 }
            V4.a.f()
            return r4
        L_0x0018:
            r4 = move-exception
            goto L_0x006d
        L_0x001a:
            r1 = 0
            E2.k$a r6 = E2.d.e(r5, r6, r1)     // Catch:{ NameNotFoundException -> 0x0063 }
            int r2 = b(r6)     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x002e
            E2.i$e r4 = new E2.i$e     // Catch:{ all -> 0x0018 }
            r4.<init>((int) r2)     // Catch:{ all -> 0x0018 }
            V4.a.f()
            return r4
        L_0x002e:
            boolean r2 = r6.f()     // Catch:{ all -> 0x0018 }
            if (r2 == 0) goto L_0x0043
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0018 }
            r3 = 29
            if (r2 < r3) goto L_0x0043
            java.util.List r6 = r6.d()     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r5 = x2.i.c(r5, r1, r6, r7)     // Catch:{ all -> 0x0018 }
            goto L_0x004b
        L_0x0043:
            E2.k$b[] r6 = r6.c()     // Catch:{ all -> 0x0018 }
            android.graphics.Typeface r5 = x2.i.b(r5, r1, r6, r7)     // Catch:{ all -> 0x0018 }
        L_0x004b:
            if (r5 == 0) goto L_0x0059
            r0.f(r4, r5)     // Catch:{ all -> 0x0018 }
            E2.i$e r4 = new E2.i$e     // Catch:{ all -> 0x0018 }
            r4.<init>((android.graphics.Typeface) r5)     // Catch:{ all -> 0x0018 }
            V4.a.f()
            return r4
        L_0x0059:
            E2.i$e r4 = new E2.i$e     // Catch:{ all -> 0x0018 }
            r5 = -3
            r4.<init>((int) r5)     // Catch:{ all -> 0x0018 }
            V4.a.f()
            return r4
        L_0x0063:
            E2.i$e r4 = new E2.i$e     // Catch:{ all -> 0x0018 }
            r5 = -1
            r4.<init>((int) r5)     // Catch:{ all -> 0x0018 }
            V4.a.f()
            return r4
        L_0x006d:
            V4.a.f()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.i.c(java.lang.String, android.content.Context, java.util.List, int):E2.i$e");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r9 = new E2.i.c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        if (r8 != null) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r8 = f5977b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0046, code lost:
        E2.l.c(r8, r9, new E2.i.d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface d(android.content.Context r5, java.util.List<E2.e> r6, int r7, java.util.concurrent.Executor r8, E2.a r9) {
        /*
            java.lang.String r0 = a(r6, r7)
            j0.A<java.lang.String, android.graphics.Typeface> r1 = f5976a
            java.lang.Object r1 = r1.d(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            E2.i$e r5 = new E2.i$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.b(r5)
            return r1
        L_0x0017:
            E2.i$b r1 = new E2.i$b
            r1.<init>(r9)
            java.lang.Object r9 = f5978c
            monitor-enter(r9)
            j0.b0<java.lang.String, java.util.ArrayList<H2.a<E2.i$e>>> r2 = f5979d     // Catch:{ all -> 0x002f }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x002f }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x002f }
            r4 = 0
            if (r3 == 0) goto L_0x0031
            r3.add(r1)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            return r4
        L_0x002f:
            r5 = move-exception
            goto L_0x004f
        L_0x0031:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x002f }
            r3.<init>()     // Catch:{ all -> 0x002f }
            r3.add(r1)     // Catch:{ all -> 0x002f }
            r2.put(r0, r3)     // Catch:{ all -> 0x002f }
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            E2.i$c r9 = new E2.i$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0046
            java.util.concurrent.ExecutorService r8 = f5977b
        L_0x0046:
            E2.i$d r5 = new E2.i$d
            r5.<init>(r0)
            E2.l.c(r8, r9, r5)
            return r4
        L_0x004f:
            monitor-exit(r9)     // Catch:{ all -> 0x002f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.i.d(android.content.Context, java.util.List, int, java.util.concurrent.Executor, E2.a):android.graphics.Typeface");
    }

    static Typeface e(Context context, e eVar, a aVar, int i10, int i11) {
        String a10 = a(F.a(new Object[]{eVar}), i10);
        Typeface d10 = f5976a.d(a10);
        if (d10 != null) {
            aVar.b(new e(d10));
            return d10;
        } else if (i11 == -1) {
            e c10 = c(a10, context, F.a(new Object[]{eVar}), i10);
            aVar.b(c10);
            return c10.f5990a;
        } else {
            try {
                e eVar2 = (e) l.d(f5977b, new a(a10, context, eVar, i10), i11);
                aVar.b(eVar2);
                return eVar2.f5990a;
            } catch (InterruptedException unused) {
                aVar.b(new e(-3));
                return null;
            }
        }
    }

    static final class e {

        /* renamed from: a  reason: collision with root package name */
        final Typeface f5990a;

        /* renamed from: b  reason: collision with root package name */
        final int f5991b;

        e(int i10) {
            this.f5990a = null;
            this.f5991b = i10;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        public boolean a() {
            return this.f5991b == 0;
        }

        @SuppressLint({"WrongConstant"})
        e(Typeface typeface) {
            this.f5990a = typeface;
            this.f5991b = 0;
        }
    }
}
