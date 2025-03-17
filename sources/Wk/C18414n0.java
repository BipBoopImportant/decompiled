package wK;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "label", "", "enabled", "LXH/N;", "b", "(Ljava/lang/String;ZLU0/m;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.n0  reason: case insensitive filesystem */
public final class C18414n0 {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(java.lang.String r29, boolean r30, U0.C4889m r31, int r32, int r33) {
        /*
            r2 = r29
            r0 = -349715248(0xffffffffeb27c4d0, float:-2.0282003E26)
            r1 = r31
            U0.m r3 = r1.k(r0)
            r1 = r33 & 1
            if (r1 == 0) goto L_0x0012
            r1 = r32 | 6
            goto L_0x0024
        L_0x0012:
            r1 = r32 & 6
            if (r1 != 0) goto L_0x0022
            boolean r1 = r3.V(r2)
            if (r1 == 0) goto L_0x001e
            r1 = 4
            goto L_0x001f
        L_0x001e:
            r1 = 2
        L_0x001f:
            r1 = r32 | r1
            goto L_0x0024
        L_0x0022:
            r1 = r32
        L_0x0024:
            r4 = r33 & 2
            if (r4 == 0) goto L_0x002e
            r1 = r1 | 48
        L_0x002a:
            r5 = r30
        L_0x002c:
            r6 = r1
            goto L_0x0041
        L_0x002e:
            r5 = r32 & 48
            if (r5 != 0) goto L_0x002a
            r5 = r30
            boolean r6 = r3.b(r5)
            if (r6 == 0) goto L_0x003d
            r6 = 32
            goto L_0x003f
        L_0x003d:
            r6 = 16
        L_0x003f:
            r1 = r1 | r6
            goto L_0x002c
        L_0x0041:
            r1 = r6 & 19
            r7 = 18
            if (r1 != r7) goto L_0x0055
            boolean r1 = r3.l()
            if (r1 != 0) goto L_0x004e
            goto L_0x0055
        L_0x004e:
            r3.L()
            r28 = r3
            goto L_0x0102
        L_0x0055:
            if (r4 == 0) goto L_0x005b
            r1 = 1
            r25 = r1
            goto L_0x005d
        L_0x005b:
            r25 = r5
        L_0x005d:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0069
            r1 = -1
            java.lang.String r4 = "net.ikea.skapa.ui.components.Caption (Caption.kt:19)"
            U0.C4895p.S(r0, r6, r1, r4)
        L_0x0069:
            if (r2 == 0) goto L_0x0071
            boolean r0 = HJ.C15854t.v0(r29)
            if (r0 == 0) goto L_0x0075
        L_0x0071:
            r28 = r3
            goto L_0x00f7
        L_0x0075:
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            tK.u r0 = tK.C18029u.f147649a
            float r1 = r0.f()
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r7, r1)
            r4 = 0
            s0.C5844O.a(r1, r3, r4)
            tK.v r1 = tK.C18030v.f147664a
            int r4 = tK.C18030v.f147665b
            tK.w r5 = r1.b(r3, r4)
            tK.c r5 = r5.a()
            N1.Y r20 = r5.c()
            if (r25 == 0) goto L_0x00ab
            r5 = -1074697375(0xffffffffbff16b61, float:-1.8860894)
            r3.W(r5)
            tK.h r1 = r1.a(r3, r4)
            long r4 = r1.I0()
        L_0x00a5:
            r3.P()
            r26 = r4
            goto L_0x00ba
        L_0x00ab:
            r5 = -1074696215(0xffffffffbff16fe9, float:-1.8862277)
            r3.W(r5)
            tK.h r1 = r1.a(r3, r4)
            long r4 = r1.K()
            goto L_0x00a5
        L_0x00ba:
            Y1.j$a r1 = Y1.j.f14783b
            int r4 = r1.f()
            float r8 = r0.g()
            r12 = 14
            r13 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            Y1.j r12 = Y1.j.h(r4)
            r22 = r6 & 14
            r23 = 0
            r24 = 65016(0xfdf8, float:9.1107E-41)
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r0 = r29
            r28 = r3
            r2 = r26
            r21 = r28
            O0.d1.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
        L_0x00f7:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0100
            U0.C4895p.R()
        L_0x0100:
            r5 = r25
        L_0x0102:
            U0.Y0 r0 = r28.n()
            if (r0 == 0) goto L_0x0116
            wK.m0 r1 = new wK.m0
            r2 = r29
            r3 = r32
            r4 = r33
            r1.<init>(r2, r5, r3, r4)
            r0.a(r1)
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.C18414n0.b(java.lang.String, boolean, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, boolean z10, int i10, int i11, C4889m mVar, int i12) {
        b(str, z10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
