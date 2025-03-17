package A3;

import A3.C6300b;
import A3.u1;
import G3.C6479C;
import android.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import jb.r;
import q3.J;
import t3.C5950a;
import t3.N;

/* renamed from: A3.r0  reason: case insensitive filesystem */
public final class C6332r0 implements u1 {

    /* renamed from: i  reason: collision with root package name */
    public static final r<String> f32603i = new C6331q0();

    /* renamed from: j  reason: collision with root package name */
    private static final Random f32604j = new Random();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final J.c f32605a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final J.b f32606b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, a> f32607c;

    /* renamed from: d  reason: collision with root package name */
    private final r<String> f32608d;

    /* renamed from: e  reason: collision with root package name */
    private u1.a f32609e;

    /* renamed from: f  reason: collision with root package name */
    private J f32610f;

    /* renamed from: g  reason: collision with root package name */
    private String f32611g;

    /* renamed from: h  reason: collision with root package name */
    private long f32612h;

    /* renamed from: A3.r0$a */
    private final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f32613a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public int f32614b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public long f32615c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public C6479C.b f32616d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public boolean f32617e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f32618f;

        public a(String str, int i10, C6479C.b bVar) {
            this.f32613a = str;
            this.f32614b = i10;
            this.f32615c = bVar == null ? -1 : bVar.f35623d;
            if (bVar != null && bVar.b()) {
                this.f32616d = bVar;
            }
        }

        private int l(J j10, J j11, int i10) {
            if (i10 < j10.p()) {
                j10.n(i10, C6332r0.this.f32605a);
                for (int i11 = C6332r0.this.f32605a.f27938n; i11 <= C6332r0.this.f32605a.f27939o; i11++) {
                    int b10 = j11.b(j10.m(i11));
                    if (b10 != -1) {
                        return j11.f(b10, C6332r0.this.f32606b).f27904c;
                    }
                }
                return -1;
            } else if (i10 < j11.p()) {
                return i10;
            } else {
                return -1;
            }
        }

        public boolean i(int i10, C6479C.b bVar) {
            if (bVar == null) {
                return i10 == this.f32614b;
            }
            C6479C.b bVar2 = this.f32616d;
            return bVar2 == null ? !bVar.b() && bVar.f35623d == this.f32615c : bVar.f35623d == bVar2.f35623d && bVar.f35621b == bVar2.f35621b && bVar.f35622c == bVar2.f35622c;
        }

        public boolean j(C6300b.a aVar) {
            C6479C.b bVar = aVar.f32517d;
            if (bVar == null) {
                return this.f32614b != aVar.f32516c;
            }
            long j10 = this.f32615c;
            if (j10 == -1) {
                return false;
            }
            if (bVar.f35623d > j10) {
                return true;
            }
            if (this.f32616d == null) {
                return false;
            }
            int b10 = aVar.f32515b.b(bVar.f35620a);
            int b11 = aVar.f32515b.b(this.f32616d.f35620a);
            C6479C.b bVar2 = aVar.f32517d;
            if (bVar2.f35623d < this.f32616d.f35623d || b10 < b11) {
                return false;
            }
            if (b10 > b11) {
                return true;
            }
            if (bVar2.b()) {
                C6479C.b bVar3 = aVar.f32517d;
                int i10 = bVar3.f35621b;
                int i11 = bVar3.f35622c;
                C6479C.b bVar4 = this.f32616d;
                int i12 = bVar4.f35621b;
                if (i10 <= i12) {
                    return i10 == i12 && i11 > bVar4.f35622c;
                }
                return true;
            }
            int i13 = aVar.f32517d.f35624e;
            return i13 == -1 || i13 > this.f32616d.f35621b;
        }

        public void k(int i10, C6479C.b bVar) {
            if (this.f32615c == -1 && i10 == this.f32614b && bVar != null && bVar.f35623d >= C6332r0.this.n()) {
                this.f32615c = bVar.f35623d;
            }
        }

        public boolean m(J j10, J j11) {
            int l10 = l(j10, j11, this.f32614b);
            this.f32614b = l10;
            if (l10 == -1) {
                return false;
            }
            C6479C.b bVar = this.f32616d;
            if (bVar == null) {
                return true;
            }
            return j11.b(bVar.f35620a) != -1;
        }
    }

    public C6332r0() {
        this(f32603i);
    }

    private void l(a aVar) {
        if (aVar.f32615c != -1) {
            this.f32612h = aVar.f32615c;
        }
        this.f32611g = null;
    }

    /* access modifiers changed from: private */
    public static String m() {
        byte[] bArr = new byte[12];
        f32604j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    /* access modifiers changed from: private */
    public long n() {
        a aVar = this.f32607c.get(this.f32611g);
        return (aVar == null || aVar.f32615c == -1) ? this.f32612h + 1 : aVar.f32615c;
    }

    private a o(int i10, C6479C.b bVar) {
        int i11;
        a aVar = null;
        long j10 = Long.MAX_VALUE;
        for (a next : this.f32607c.values()) {
            next.k(i10, bVar);
            if (next.i(i10, bVar)) {
                long b10 = next.f32615c;
                if (b10 == -1 || b10 < j10) {
                    aVar = next;
                    j10 = b10;
                } else if (!(i11 != 0 || ((a) N.i(aVar)).f32616d == null || next.f32616d == null)) {
                    aVar = next;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = this.f32608d.get();
        a aVar2 = new a(str, i10, bVar);
        this.f32607c.put(str, aVar2);
        return aVar2;
    }

    private void p(C6300b.a aVar) {
        if (aVar.f32515b.q()) {
            String str = this.f32611g;
            if (str != null) {
                l((a) C5950a.e(this.f32607c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = this.f32607c.get(this.f32611g);
        a o10 = o(aVar.f32516c, aVar.f32517d);
        this.f32611g = o10.f32613a;
        b(aVar);
        C6479C.b bVar = aVar.f32517d;
        if (bVar != null && bVar.b()) {
            if (aVar2 == null || aVar2.f32615c != aVar.f32517d.f35623d || aVar2.f32616d == null || aVar2.f32616d.f35621b != aVar.f32517d.f35621b || aVar2.f32616d.f35622c != aVar.f32517d.f35622c) {
                C6479C.b bVar2 = aVar.f32517d;
                this.f32609e.o(aVar, o(aVar.f32516c, new C6479C.b(bVar2.f35620a, bVar2.f35623d)).f32613a, o10.f32613a);
            }
        }
    }

    public synchronized String a() {
        return this.f32611g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b(A3.C6300b.a r25) {
        /*
            r24 = this;
            r1 = r24
            r0 = r25
            monitor-enter(r24)
            A3.u1$a r2 = r1.f32609e     // Catch:{ all -> 0x0044 }
            t3.C5950a.e(r2)     // Catch:{ all -> 0x0044 }
            q3.J r2 = r0.f32515b     // Catch:{ all -> 0x0044 }
            boolean r2 = r2.q()     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0014
            monitor-exit(r24)
            return
        L_0x0014:
            G3.C$b r2 = r0.f32517d     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0047
            long r2 = r2.f35623d     // Catch:{ all -> 0x0044 }
            long r4 = r24.n()     // Catch:{ all -> 0x0044 }
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x0024
            monitor-exit(r24)
            return
        L_0x0024:
            java.util.HashMap<java.lang.String, A3.r0$a> r2 = r1.f32607c     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r1.f32611g     // Catch:{ all -> 0x0044 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x0044 }
            A3.r0$a r2 = (A3.C6332r0.a) r2     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0047
            long r3 = r2.f32615c     // Catch:{ all -> 0x0044 }
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0047
            int r2 = r2.f32614b     // Catch:{ all -> 0x0044 }
            int r3 = r0.f32516c     // Catch:{ all -> 0x0044 }
            if (r2 == r3) goto L_0x0047
            monitor-exit(r24)
            return
        L_0x0044:
            r0 = move-exception
            goto L_0x0115
        L_0x0047:
            int r2 = r0.f32516c     // Catch:{ all -> 0x0044 }
            G3.C$b r3 = r0.f32517d     // Catch:{ all -> 0x0044 }
            A3.r0$a r2 = r1.o(r2, r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r1.f32611g     // Catch:{ all -> 0x0044 }
            if (r3 != 0) goto L_0x0059
            java.lang.String r3 = r2.f32613a     // Catch:{ all -> 0x0044 }
            r1.f32611g = r3     // Catch:{ all -> 0x0044 }
        L_0x0059:
            G3.C$b r3 = r0.f32517d     // Catch:{ all -> 0x0044 }
            r4 = 1
            if (r3 == 0) goto L_0x00d6
            boolean r3 = r3.b()     // Catch:{ all -> 0x0044 }
            if (r3 == 0) goto L_0x00d6
            G3.C$b r10 = new G3.C$b     // Catch:{ all -> 0x0044 }
            G3.C$b r3 = r0.f32517d     // Catch:{ all -> 0x0044 }
            java.lang.Object r5 = r3.f35620a     // Catch:{ all -> 0x0044 }
            long r6 = r3.f35623d     // Catch:{ all -> 0x0044 }
            int r3 = r3.f35621b     // Catch:{ all -> 0x0044 }
            r10.<init>(r5, r6, r3)     // Catch:{ all -> 0x0044 }
            int r3 = r0.f32516c     // Catch:{ all -> 0x0044 }
            A3.r0$a r3 = r1.o(r3, r10)     // Catch:{ all -> 0x0044 }
            boolean r5 = r3.f32617e     // Catch:{ all -> 0x0044 }
            if (r5 != 0) goto L_0x00d6
            boolean unused = r3.f32617e = r4     // Catch:{ all -> 0x0044 }
            q3.J r5 = r0.f32515b     // Catch:{ all -> 0x0044 }
            G3.C$b r6 = r0.f32517d     // Catch:{ all -> 0x0044 }
            java.lang.Object r6 = r6.f35620a     // Catch:{ all -> 0x0044 }
            q3.J$b r7 = r1.f32606b     // Catch:{ all -> 0x0044 }
            r5.h(r6, r7)     // Catch:{ all -> 0x0044 }
            q3.J$b r5 = r1.f32606b     // Catch:{ all -> 0x0044 }
            G3.C$b r6 = r0.f32517d     // Catch:{ all -> 0x0044 }
            int r6 = r6.f35621b     // Catch:{ all -> 0x0044 }
            long r5 = r5.f(r6)     // Catch:{ all -> 0x0044 }
            long r5 = t3.N.q1(r5)     // Catch:{ all -> 0x0044 }
            q3.J$b r7 = r1.f32606b     // Catch:{ all -> 0x0044 }
            long r7 = r7.m()     // Catch:{ all -> 0x0044 }
            long r5 = r5 + r7
            r7 = 0
            long r11 = java.lang.Math.max(r7, r5)     // Catch:{ all -> 0x0044 }
            A3.b$a r15 = new A3.b$a     // Catch:{ all -> 0x0044 }
            long r6 = r0.f32514a     // Catch:{ all -> 0x0044 }
            q3.J r8 = r0.f32515b     // Catch:{ all -> 0x0044 }
            int r9 = r0.f32516c     // Catch:{ all -> 0x0044 }
            q3.J r13 = r0.f32519f     // Catch:{ all -> 0x0044 }
            int r14 = r0.f32520g     // Catch:{ all -> 0x0044 }
            G3.C$b r5 = r0.f32521h     // Catch:{ all -> 0x0044 }
            r16 = r5
            long r4 = r0.f32522i     // Catch:{ all -> 0x0044 }
            r20 = r2
            r21 = r3
            long r2 = r0.f32523j     // Catch:{ all -> 0x0044 }
            r22 = r4
            r4 = r16
            r16 = r22
            r5 = r15
            r0 = r15
            r15 = r4
            r18 = r2
            r5.<init>(r6, r8, r9, r10, r11, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0044 }
            A3.u1$a r2 = r1.f32609e     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r21.f32613a     // Catch:{ all -> 0x0044 }
            r2.e0(r0, r3)     // Catch:{ all -> 0x0044 }
            goto L_0x00d8
        L_0x00d6:
            r20 = r2
        L_0x00d8:
            boolean r0 = r20.f32617e     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x00f0
            r0 = r20
            r2 = 1
            boolean unused = r0.f32617e = r2     // Catch:{ all -> 0x0044 }
            A3.u1$a r2 = r1.f32609e     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r0.f32613a     // Catch:{ all -> 0x0044 }
            r4 = r25
            r2.e0(r4, r3)     // Catch:{ all -> 0x0044 }
            goto L_0x00f4
        L_0x00f0:
            r4 = r25
            r0 = r20
        L_0x00f4:
            java.lang.String r2 = r0.f32613a     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r1.f32611g     // Catch:{ all -> 0x0044 }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0113
            boolean r2 = r0.f32618f     // Catch:{ all -> 0x0044 }
            if (r2 != 0) goto L_0x0113
            r2 = 1
            boolean unused = r0.f32618f = r2     // Catch:{ all -> 0x0044 }
            A3.u1$a r2 = r1.f32609e     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r0.f32613a     // Catch:{ all -> 0x0044 }
            r2.v(r4, r0)     // Catch:{ all -> 0x0044 }
        L_0x0113:
            monitor-exit(r24)
            return
        L_0x0115:
            monitor-exit(r24)     // Catch:{ all -> 0x0044 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: A3.C6332r0.b(A3.b$a):void");
    }

    public synchronized String c(J j10, C6479C.b bVar) {
        return o(j10.h(bVar.f35620a, this.f32606b).f27904c, bVar).f32613a;
    }

    public void d(u1.a aVar) {
        this.f32609e = aVar;
    }

    public synchronized void e(C6300b.a aVar) {
        try {
            C5950a.e(this.f32609e);
            J j10 = this.f32610f;
            this.f32610f = aVar.f32515b;
            Iterator<a> it = this.f32607c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.m(j10, this.f32610f)) {
                    if (next.j(aVar)) {
                    }
                }
                it.remove();
                if (next.f32617e) {
                    if (next.f32613a.equals(this.f32611g)) {
                        l(next);
                    }
                    this.f32609e.u(aVar, next.f32613a, false);
                }
            }
            p(aVar);
        } finally {
            while (true) {
            }
        }
    }

    public synchronized void f(C6300b.a aVar) {
        u1.a aVar2;
        try {
            String str = this.f32611g;
            if (str != null) {
                l((a) C5950a.e(this.f32607c.get(str)));
            }
            Iterator<a> it = this.f32607c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                it.remove();
                if (next.f32617e && (aVar2 = this.f32609e) != null) {
                    aVar2.u(aVar, next.f32613a, false);
                }
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void g(C6300b.a aVar, int i10) {
        try {
            C5950a.e(this.f32609e);
            boolean z10 = i10 == 0;
            Iterator<a> it = this.f32607c.values().iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.j(aVar)) {
                    it.remove();
                    if (next.f32617e) {
                        boolean equals = next.f32613a.equals(this.f32611g);
                        boolean z11 = z10 && equals && next.f32618f;
                        if (equals) {
                            l(next);
                        }
                        this.f32609e.u(aVar, next.f32613a, z11);
                    }
                }
            }
            p(aVar);
        } finally {
            while (true) {
            }
        }
    }

    public C6332r0(r<String> rVar) {
        this.f32608d = rVar;
        this.f32605a = new J.c();
        this.f32606b = new J.b();
        this.f32607c = new HashMap<>();
        this.f32610f = J.f27893a;
        this.f32612h = -1;
    }
}
