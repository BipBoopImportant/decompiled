package MK;

import GK.C15804w;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000f¨\u0006\u0010"}, d2 = {"LMK/b;", "LGK/w;", "", "forWebSocket", "<init>", "(Z)V", "", "code", "a", "(I)Z", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "Z", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: MK.b  reason: case insensitive filesystem */
public final class C16089b implements C15804w {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f136454a;

    public C16089b(boolean z10) {
        this.f136454a = z10;
    }

    private final boolean a(int i10) {
        if (i10 == 100) {
            return true;
        }
        return 102 <= i10 && i10 < 200;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0097, code lost:
        if (r3.f() == false) goto L_0x0099;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00aa A[SYNTHETIC, Splitter:B:41:0x00aa] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e5 A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0120 A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012f A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0169 A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016e A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0176 A[Catch:{ IOException -> 0x00b8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public GK.C15776D intercept(GK.C15804w.a r14) {
        /*
            r13 = this;
            java.lang.String r0 = "Connection"
            java.lang.String r1 = "close"
            java.lang.String r2 = "chain"
            kotlin.jvm.internal.C17542s.j(r14, r2)
            MK.g r14 = (MK.g) r14
            LK.c r2 = r14.j()
            kotlin.jvm.internal.C17542s.g(r2)
            GK.B r14 = r14.l()
            GK.C r3 = r14.a()
            long r4 = java.lang.System.currentTimeMillis()
            r6 = 0
            r7 = 1
            r8 = 0
            r2.w(r14)     // Catch:{ IOException -> 0x004d }
            java.lang.String r9 = r14.h()     // Catch:{ IOException -> 0x004d }
            boolean r9 = MK.f.b(r9)     // Catch:{ IOException -> 0x004d }
            if (r9 == 0) goto L_0x008c
            if (r3 == 0) goto L_0x008c
            java.lang.String r9 = "100-continue"
            java.lang.String r10 = "Expect"
            java.lang.String r10 = r14.d(r10)     // Catch:{ IOException -> 0x004d }
            boolean r9 = HJ.C15854t.H(r9, r10, r7)     // Catch:{ IOException -> 0x004d }
            if (r9 == 0) goto L_0x0051
            r2.f()     // Catch:{ IOException -> 0x004d }
            GK.D$a r9 = r2.r(r7)     // Catch:{ IOException -> 0x004d }
            r2.t()     // Catch:{ IOException -> 0x004a }
            r10 = r6
            goto L_0x0053
        L_0x004a:
            r3 = move-exception
            r10 = r7
            goto L_0x009e
        L_0x004d:
            r3 = move-exception
            r10 = r7
            r9 = r8
            goto L_0x009e
        L_0x0051:
            r10 = r7
            r9 = r8
        L_0x0053:
            if (r9 != 0) goto L_0x007b
            boolean r11 = r3.f()     // Catch:{ IOException -> 0x006a }
            if (r11 == 0) goto L_0x006c
            r2.f()     // Catch:{ IOException -> 0x006a }
            WK.L r11 = r2.c(r14, r7)     // Catch:{ IOException -> 0x006a }
            WK.f r11 = WK.y.c(r11)     // Catch:{ IOException -> 0x006a }
            r3.h(r11)     // Catch:{ IOException -> 0x006a }
            goto L_0x0091
        L_0x006a:
            r3 = move-exception
            goto L_0x009e
        L_0x006c:
            WK.L r11 = r2.c(r14, r6)     // Catch:{ IOException -> 0x006a }
            WK.f r11 = WK.y.c(r11)     // Catch:{ IOException -> 0x006a }
            r3.h(r11)     // Catch:{ IOException -> 0x006a }
            r11.close()     // Catch:{ IOException -> 0x006a }
            goto L_0x0091
        L_0x007b:
            r2.p()     // Catch:{ IOException -> 0x006a }
            LK.f r11 = r2.h()     // Catch:{ IOException -> 0x006a }
            boolean r11 = r11.x()     // Catch:{ IOException -> 0x006a }
            if (r11 != 0) goto L_0x0091
            r2.o()     // Catch:{ IOException -> 0x006a }
            goto L_0x0091
        L_0x008c:
            r2.p()     // Catch:{ IOException -> 0x004d }
            r10 = r7
            r9 = r8
        L_0x0091:
            if (r3 == 0) goto L_0x0099
            boolean r3 = r3.f()     // Catch:{ IOException -> 0x006a }
            if (r3 != 0) goto L_0x009c
        L_0x0099:
            r2.e()     // Catch:{ IOException -> 0x006a }
        L_0x009c:
            r3 = r8
            goto L_0x00a8
        L_0x009e:
            boolean r11 = r3 instanceof OK.C16171a
            if (r11 != 0) goto L_0x01ac
            boolean r11 = r2.k()
            if (r11 == 0) goto L_0x01ab
        L_0x00a8:
            if (r9 != 0) goto L_0x00bb
            GK.D$a r9 = r2.r(r6)     // Catch:{ IOException -> 0x00b8 }
            kotlin.jvm.internal.C17542s.g(r9)     // Catch:{ IOException -> 0x00b8 }
            if (r10 == 0) goto L_0x00bb
            r2.t()     // Catch:{ IOException -> 0x00b8 }
            r10 = r6
            goto L_0x00bb
        L_0x00b8:
            r14 = move-exception
            goto L_0x01a4
        L_0x00bb:
            GK.D$a r9 = r9.r(r14)     // Catch:{ IOException -> 0x00b8 }
            LK.f r11 = r2.h()     // Catch:{ IOException -> 0x00b8 }
            GK.t r11 = r11.b()     // Catch:{ IOException -> 0x00b8 }
            GK.D$a r9 = r9.i(r11)     // Catch:{ IOException -> 0x00b8 }
            GK.D$a r9 = r9.s(r4)     // Catch:{ IOException -> 0x00b8 }
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00b8 }
            GK.D$a r9 = r9.q(r11)     // Catch:{ IOException -> 0x00b8 }
            GK.D r9 = r9.c()     // Catch:{ IOException -> 0x00b8 }
            int r11 = r9.g()     // Catch:{ IOException -> 0x00b8 }
            boolean r12 = r13.a(r11)     // Catch:{ IOException -> 0x00b8 }
            if (r12 == 0) goto L_0x0115
            GK.D$a r6 = r2.r(r6)     // Catch:{ IOException -> 0x00b8 }
            kotlin.jvm.internal.C17542s.g(r6)     // Catch:{ IOException -> 0x00b8 }
            if (r10 == 0) goto L_0x00f1
            r2.t()     // Catch:{ IOException -> 0x00b8 }
        L_0x00f1:
            GK.D$a r14 = r6.r(r14)     // Catch:{ IOException -> 0x00b8 }
            LK.f r6 = r2.h()     // Catch:{ IOException -> 0x00b8 }
            GK.t r6 = r6.b()     // Catch:{ IOException -> 0x00b8 }
            GK.D$a r14 = r14.i(r6)     // Catch:{ IOException -> 0x00b8 }
            GK.D$a r14 = r14.s(r4)     // Catch:{ IOException -> 0x00b8 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x00b8 }
            GK.D$a r14 = r14.q(r4)     // Catch:{ IOException -> 0x00b8 }
            GK.D r9 = r14.c()     // Catch:{ IOException -> 0x00b8 }
            int r11 = r9.g()     // Catch:{ IOException -> 0x00b8 }
        L_0x0115:
            r2.s(r9)     // Catch:{ IOException -> 0x00b8 }
            boolean r14 = r13.f136454a     // Catch:{ IOException -> 0x00b8 }
            if (r14 == 0) goto L_0x012f
            r14 = 101(0x65, float:1.42E-43)
            if (r11 != r14) goto L_0x012f
            GK.D$a r14 = r9.u()     // Catch:{ IOException -> 0x00b8 }
            GK.E r4 = HK.C15864d.f135358c     // Catch:{ IOException -> 0x00b8 }
            GK.D$a r14 = r14.b(r4)     // Catch:{ IOException -> 0x00b8 }
            GK.D r14 = r14.c()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x013f
        L_0x012f:
            GK.D$a r14 = r9.u()     // Catch:{ IOException -> 0x00b8 }
            GK.E r4 = r2.q(r9)     // Catch:{ IOException -> 0x00b8 }
            GK.D$a r14 = r14.b(r4)     // Catch:{ IOException -> 0x00b8 }
            GK.D r14 = r14.c()     // Catch:{ IOException -> 0x00b8 }
        L_0x013f:
            GK.B r4 = r14.z()     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r4 = r4.d(r0)     // Catch:{ IOException -> 0x00b8 }
            boolean r4 = HJ.C15854t.H(r1, r4, r7)     // Catch:{ IOException -> 0x00b8 }
            if (r4 != 0) goto L_0x0158
            r4 = 2
            java.lang.String r0 = GK.C15776D.o(r14, r0, r8, r4, r8)     // Catch:{ IOException -> 0x00b8 }
            boolean r0 = HJ.C15854t.H(r1, r0, r7)     // Catch:{ IOException -> 0x00b8 }
            if (r0 == 0) goto L_0x015b
        L_0x0158:
            r2.o()     // Catch:{ IOException -> 0x00b8 }
        L_0x015b:
            r0 = 204(0xcc, float:2.86E-43)
            if (r11 == r0) goto L_0x0163
            r0 = 205(0xcd, float:2.87E-43)
            if (r11 != r0) goto L_0x01a3
        L_0x0163:
            GK.E r0 = r14.c()     // Catch:{ IOException -> 0x00b8 }
            if (r0 == 0) goto L_0x016e
            long r0 = r0.g()     // Catch:{ IOException -> 0x00b8 }
            goto L_0x0170
        L_0x016e:
            r0 = -1
        L_0x0170:
            r4 = 0
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01a3
            java.net.ProtocolException r0 = new java.net.ProtocolException     // Catch:{ IOException -> 0x00b8 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b8 }
            r1.<init>()     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r2 = "HTTP "
            r1.append(r2)     // Catch:{ IOException -> 0x00b8 }
            r1.append(r11)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r2 = " had non-zero Content-Length: "
            r1.append(r2)     // Catch:{ IOException -> 0x00b8 }
            GK.E r14 = r14.c()     // Catch:{ IOException -> 0x00b8 }
            if (r14 == 0) goto L_0x0198
            long r4 = r14.g()     // Catch:{ IOException -> 0x00b8 }
            java.lang.Long r8 = java.lang.Long.valueOf(r4)     // Catch:{ IOException -> 0x00b8 }
        L_0x0198:
            r1.append(r8)     // Catch:{ IOException -> 0x00b8 }
            java.lang.String r14 = r1.toString()     // Catch:{ IOException -> 0x00b8 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x00b8 }
            throw r0     // Catch:{ IOException -> 0x00b8 }
        L_0x01a3:
            return r14
        L_0x01a4:
            if (r3 == 0) goto L_0x01aa
            XH.C16816g.a(r3, r14)
            throw r3
        L_0x01aa:
            throw r14
        L_0x01ab:
            throw r3
        L_0x01ac:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: MK.C16089b.intercept(GK.w$a):GK.D");
    }
}
