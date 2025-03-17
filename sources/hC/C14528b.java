package hC;

import U0.C4889m;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import gC.C14508a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LgC/a$a;", "data", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "b", "(LgC/a$a;Landroidx/compose/ui/d;LU0/m;II)V", "storedetails_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: hC.b  reason: case insensitive filesystem */
public final class C14528b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hC.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f127436a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                gC.a$a$a[] r0 = gC.C14508a.C3116a.C3117a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                gC.a$a$a r1 = gC.C14508a.C3116a.C3117a.CLOSED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                gC.a$a$a r1 = gC.C14508a.C3116a.C3117a.OPENS_SOON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                gC.a$a$a r1 = gC.C14508a.C3116a.C3117a.OPEN     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f127436a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hC.C14528b.a.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(gC.C14508a.C3116a r55, androidx.compose.ui.d r56, U0.C4889m r57, int r58, int r59) {
        /*
            r0 = r55
            r1 = r58
            r2 = r59
            java.lang.String r3 = "data"
            kotlin.jvm.internal.C17542s.j(r0, r3)
            r3 = 1495429173(0x59227035, float:2.85764495E15)
            r4 = r57
            U0.m r6 = r4.k(r3)
            r4 = r2 & 1
            r5 = 2
            if (r4 == 0) goto L_0x001c
            r4 = r1 | 6
            goto L_0x0035
        L_0x001c:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0034
            r4 = r1 & 8
            if (r4 != 0) goto L_0x0029
            boolean r4 = r6.V(r0)
            goto L_0x002d
        L_0x0029:
            boolean r4 = r6.F(r0)
        L_0x002d:
            if (r4 == 0) goto L_0x0031
            r4 = 4
            goto L_0x0032
        L_0x0031:
            r4 = r5
        L_0x0032:
            r4 = r4 | r1
            goto L_0x0035
        L_0x0034:
            r4 = r1
        L_0x0035:
            r7 = r2 & 2
            if (r7 == 0) goto L_0x003f
            r4 = r4 | 48
        L_0x003b:
            r8 = r56
        L_0x003d:
            r9 = r4
            goto L_0x0052
        L_0x003f:
            r8 = r1 & 48
            if (r8 != 0) goto L_0x003b
            r8 = r56
            boolean r9 = r6.V(r8)
            if (r9 == 0) goto L_0x004e
            r9 = 32
            goto L_0x0050
        L_0x004e:
            r9 = 16
        L_0x0050:
            r4 = r4 | r9
            goto L_0x003d
        L_0x0052:
            r4 = r9 & 19
            r10 = 18
            if (r4 != r10) goto L_0x0065
            boolean r4 = r6.l()
            if (r4 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r6.L()
            r3 = r6
            goto L_0x016c
        L_0x0065:
            if (r7 == 0) goto L_0x006c
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            r31 = r4
            goto L_0x006e
        L_0x006c:
            r31 = r8
        L_0x006e:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x007a
            r4 = -1
            java.lang.String r7 = "com.ingka.ikea.storedetails.presentation.ui.OpeningHoursHeader (OpeningHoursHeader.kt:32)"
            U0.C4895p.S(r3, r9, r4, r7)
        L_0x007a:
            IC.e r3 = r55.b()
            int r4 = IC.C13023e.f110931a
            java.lang.String r3 = r3.a(r6, r4)
            IC.e r7 = r55.a()
            java.lang.String r4 = r7.a(r6, r4)
            S1.C$a r7 = S1.C.f13316b
            S1.C r37 = r7.a()
            gC.a$a$a r7 = r55.c()
            int[] r8 = hC.C14528b.a.f127436a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            r10 = 3
            r8 = 1
            if (r7 == r8) goto L_0x00e3
            if (r7 == r5) goto L_0x00cd
            if (r7 != r10) goto L_0x00be
            r5 = -2020679526(0xffffffff878ee09a, float:-2.1497794E-34)
            r6.W(r5)
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r6, r7)
            long r7 = r5.w0()
            r6.P()
        L_0x00bb:
            r33 = r7
            goto L_0x00f9
        L_0x00be:
            r0 = -2020686487(0xffffffff878ec569, float:-2.1481813E-34)
            r6.W(r0)
            r6.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x00cd:
            r5 = -2020681735(0xffffffff878ed7f9, float:-2.1492723E-34)
            r6.W(r5)
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r6, r7)
            long r7 = r5.s0()
            r6.P()
            goto L_0x00bb
        L_0x00e3:
            r5 = -2020684166(0xffffffff878ece7a, float:-2.1487141E-34)
            r6.W(r5)
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r5 = r5.a(r6, r7)
            long r7 = r5.v0()
            r6.P()
            goto L_0x00bb
        L_0x00f9:
            N1.G r5 = new N1.G
            r32 = r5
            r53 = 65530(0xfffa, float:9.1827E-41)
            r54 = 0
            r35 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r49 = 0
            r50 = 0
            r51 = 0
            r52 = 0
            r32.<init>(r33, r35, r37, r38, r39, r40, r41, r42, r44, r45, r46, r47, r49, r50, r51, r52, r53, r54)
            N1.d r4 = IC.C13021c.e(r3, r4, r5)
            TC.b$a$b r5 = TC.C13679b.a.C2856b.f116680a
            tK.v r3 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r3 = r3.a(r6, r7)
            long r7 = r3.G0()
            int r3 = r9 << 3
            r3 = r3 & 896(0x380, float:1.256E-42)
            r28 = r3 | 48
            r29 = 0
            r30 = 524272(0x7fff0, float:7.34662E-40)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r3 = r6
            r6 = r31
            r27 = r3
            SC.C13607l.h(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x016a
            U0.C4895p.R()
        L_0x016a:
            r8 = r31
        L_0x016c:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x017a
            hC.a r4 = new hC.a
            r4.<init>(r0, r8, r1, r2)
            r3.a(r4)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hC.C14528b.b(gC.a$a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C14508a.C3116a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        b(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
