package k4;

import kb.C9935O;
import kb.C9967v;
import s3.a;
import t3.C5950a;
import t3.N;

/* renamed from: k4.g  reason: case insensitive filesystem */
public final class C8423g implements C8427k {

    /* renamed from: c  reason: collision with root package name */
    private static final C9935O<C8421e> f54104c = C9935O.d().f(new C8422f());

    /* renamed from: a  reason: collision with root package name */
    private final C9967v<C9967v<a>> f54105a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f54106b;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00d4 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8423g(java.util.List<k4.C8421e> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = 2
            r2 = 0
            r17.<init>()
            int r3 = r18.size()
            r4 = 1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != r4) goto L_0x004c
            java.lang.Object r3 = kb.C9922B.f(r18)
            k4.e r3 = (k4.C8421e) r3
            long r7 = r3.f54101b
            long r7 = f(r7)
            long r9 = r3.f54102c
            int r5 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x0034
            kb.v<s3.a> r1 = r3.f54100a
            kb.v r1 = kb.C9967v.F(r1)
            r0.f54105a = r1
            long[] r1 = new long[r4]
            r1[r2] = r7
            r0.f54106b = r1
            goto L_0x004b
        L_0x0034:
            kb.v<s3.a> r5 = r3.f54100a
            kb.v r6 = kb.C9967v.E()
            kb.v r5 = kb.C9967v.G(r5, r6)
            r0.f54105a = r5
            long r5 = r3.f54102c
            long r5 = r5 + r7
            long[] r1 = new long[r1]
            r1[r2] = r7
            r1[r4] = r5
            r0.f54106b = r1
        L_0x004b:
            return
        L_0x004c:
            int r3 = r18.size()
            int r3 = r3 * r1
            long[] r1 = new long[r3]
            r0.f54106b = r1
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Arrays.fill(r1, r7)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            kb.O<k4.e> r3 = f54104c
            r7 = r18
            kb.v r3 = kb.C9967v.M(r3, r7)
            r7 = r2
        L_0x006b:
            int r8 = r3.size()
            if (r2 >= r8) goto L_0x00d6
            java.lang.Object r8 = r3.get(r2)
            k4.e r8 = (k4.C8421e) r8
            long r9 = r8.f54101b
            long r9 = f(r9)
            long r11 = r8.f54102c
            long r11 = r11 + r9
            if (r7 == 0) goto L_0x00b4
            long[] r13 = r0.f54106b
            int r14 = r7 + -1
            r15 = r13[r14]
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 >= 0) goto L_0x008d
            goto L_0x00b4
        L_0x008d:
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 != 0) goto L_0x00a3
            java.lang.Object r13 = r1.get(r14)
            kb.v r13 = (kb.C9967v) r13
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L_0x00a3
            kb.v<s3.a> r9 = r8.f54100a
            r1.set(r14, r9)
            goto L_0x00c0
        L_0x00a3:
            java.lang.String r13 = "CuesWithTimingSubtitle"
            java.lang.String r15 = "Truncating unsupported overlapping cues."
            t3.q.h(r13, r15)
            long[] r13 = r0.f54106b
            r13[r14] = r9
            kb.v<s3.a> r9 = r8.f54100a
            r1.set(r14, r9)
            goto L_0x00c0
        L_0x00b4:
            long[] r13 = r0.f54106b
            int r14 = r7 + 1
            r13[r7] = r9
            kb.v<s3.a> r7 = r8.f54100a
            r1.add(r7)
            r7 = r14
        L_0x00c0:
            long r8 = r8.f54102c
            int r8 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x00d4
            long[] r8 = r0.f54106b
            int r9 = r7 + 1
            r8[r7] = r11
            kb.v r7 = kb.C9967v.E()
            r1.add(r7)
            r7 = r9
        L_0x00d4:
            int r2 = r2 + r4
            goto L_0x006b
        L_0x00d6:
            kb.v r1 = kb.C9967v.A(r1)
            r0.f54105a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C8423g.<init>(java.util.List):void");
    }

    private static long f(long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        return j10;
    }

    public int a(long j10) {
        int e10 = N.e(this.f54106b, j10, false, false);
        if (e10 < this.f54105a.size()) {
            return e10;
        }
        return -1;
    }

    /* renamed from: d */
    public C9967v<a> b(long j10) {
        int h10 = N.h(this.f54106b, j10, true, false);
        return h10 == -1 ? C9967v.E() : this.f54105a.get(h10);
    }

    public long j(int i10) {
        C5950a.a(i10 < this.f54105a.size());
        return this.f54106b[i10];
    }

    public int m() {
        return this.f54105a.size();
    }
}
