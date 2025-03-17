package G3;

import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.u;
import g4.C7870f;
import t3.C5950a;

/* renamed from: G3.c  reason: case insensitive filesystem */
public final class C6483c implements O {

    /* renamed from: a  reason: collision with root package name */
    private final u f35828a;

    /* renamed from: b  reason: collision with root package name */
    private C6678p f35829b;

    /* renamed from: c  reason: collision with root package name */
    private C6679q f35830c;

    public C6483c(u uVar) {
        this.f35828a = uVar;
    }

    public void a(long j10, long j11) {
        ((C6678p) C5950a.e(this.f35829b)).a(j10, j11);
    }

    public void b() {
        C6678p pVar = this.f35829b;
        if (pVar != null) {
            C6678p d10 = pVar.d();
            if (d10 instanceof C7870f) {
                ((C7870f) d10).l();
            }
        }
    }

    public int c(I i10) {
        return ((C6678p) C5950a.e(this.f35829b)).j((C6679q) C5950a.e(this.f35830c), i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        if (r0.getPosition() != r11) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0078, code lost:
        if (r0.getPosition() != r11) goto L_0x0050;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d(q3.C5799j r8, android.net.Uri r9, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r10, long r11, long r13, N3.r r15) {
        /*
            r7 = this;
            N3.i r6 = new N3.i
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.f35830c = r6
            N3.p r8 = r7.f35829b
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            N3.u r8 = r7.f35828a
            N3.p[] r8 = r8.d(r9, r10)
            int r10 = r8.length
            kb.v$a r10 = kb.C9967v.x(r10)
            int r13 = r8.length
            r14 = 0
            r0 = 1
            if (r13 != r0) goto L_0x0025
            r8 = r8[r14]
            r7.f35829b = r8
            goto L_0x0082
        L_0x0025:
            int r13 = r8.length
            r1 = r14
        L_0x0027:
            if (r1 >= r13) goto L_0x007e
            r2 = r8[r1]
            boolean r3 = r2.h(r6)     // Catch:{ EOFException -> 0x006e, all -> 0x003a }
            if (r3 == 0) goto L_0x003c
            r7.f35829b = r2     // Catch:{ EOFException -> 0x006e, all -> 0x003a }
            t3.C5950a.g(r0)
            r6.f()
            goto L_0x007e
        L_0x003a:
            r8 = move-exception
            goto L_0x005a
        L_0x003c:
            java.util.List r2 = r2.i()     // Catch:{ EOFException -> 0x006e, all -> 0x003a }
            r10.j(r2)     // Catch:{ EOFException -> 0x006e, all -> 0x003a }
            N3.p r2 = r7.f35829b
            if (r2 != 0) goto L_0x0052
            long r2 = r6.getPosition()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0050
            goto L_0x0052
        L_0x0050:
            r2 = r14
            goto L_0x0053
        L_0x0052:
            r2 = r0
        L_0x0053:
            t3.C5950a.g(r2)
            r6.f()
            goto L_0x007b
        L_0x005a:
            N3.p r9 = r7.f35829b
            if (r9 != 0) goto L_0x0066
            long r9 = r6.getPosition()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x0067
        L_0x0066:
            r14 = r0
        L_0x0067:
            t3.C5950a.g(r14)
            r6.f()
            throw r8
        L_0x006e:
            N3.p r2 = r7.f35829b
            if (r2 != 0) goto L_0x0052
            long r2 = r6.getPosition()
            int r2 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r2 != 0) goto L_0x0050
            goto L_0x0052
        L_0x007b:
            int r1 = r1 + 1
            goto L_0x0027
        L_0x007e:
            N3.p r11 = r7.f35829b
            if (r11 == 0) goto L_0x0088
        L_0x0082:
            N3.p r8 = r7.f35829b
            r8.b(r15)
            return
        L_0x0088:
            G3.l0 r11 = new G3.l0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "None of the available extractors ("
            r12.append(r13)
            java.lang.String r13 = ", "
            jb.g r13 = jb.g.g(r13)
            kb.v r8 = kb.C9967v.B(r8)
            G3.b r14 = new G3.b
            r14.<init>()
            java.util.List r8 = kb.C9925E.h(r8, r14)
            java.lang.String r8 = r13.d(r8)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            java.lang.Object r9 = t3.C5950a.e(r9)
            android.net.Uri r9 = (android.net.Uri) r9
            kb.v r10 = r10.k()
            r11.<init>(r8, r9, r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.C6483c.d(q3.j, android.net.Uri, java.util.Map, long, long, N3.r):void");
    }

    public long e() {
        C6679q qVar = this.f35830c;
        if (qVar != null) {
            return qVar.getPosition();
        }
        return -1;
    }

    public void release() {
        C6678p pVar = this.f35829b;
        if (pVar != null) {
            pVar.release();
            this.f35829b = null;
        }
        this.f35830c = null;
    }
}
