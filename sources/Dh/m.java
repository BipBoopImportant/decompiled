package Dh;

import IC.C13023e;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.h;
import gs.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.q;
import t1.C5942c;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aQ\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aO\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u0002"}, d2 = {"LIC/e;", "eyebrow", "title", "description", "", "imageUrl", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "LXH/N;", "eyeBrowContent", "l", "(LIC/e;LIC/e;LIC/e;Ljava/lang/String;Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "Lt1/c;", "imagePainter", "m", "(LIC/e;LIC/e;LIC/e;Lt1/c;Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "text", "q", "(Ljava/lang/String;LU0/m;I)V", "i", "(LIC/e;Landroidx/compose/ui/d;LU0/m;II)V", "Lc2/h;", "x", "(LU0/m;I)F", "a", "F", "ImageHeight", "LTC/b;", "titleStyle", "onboarding_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final float f59219a = h.B((float) 376);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<String, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13023e f59220a;

        a(C13023e eVar) {
            this.f59220a = eVar;
        }

        public final void a(String str, C4889m mVar, int i10) {
            C17542s.j(str, "it");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1706639253, i10, -1, "com.ingka.ikea.app.onboarding.composables.OnboardingPageWithImage.<anonymous> (OnboardingPageWithImage.kt:63)");
                }
                m.i(this.f59220a, (d) null, mVar, C13023e.f110931a, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<String, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13023e f59221a;

        b(C13023e eVar) {
            this.f59221a = eVar;
        }

        public final void a(String str, C4889m mVar, int i10) {
            C17542s.j(str, "it");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(572980497, i10, -1, "com.ingka.ikea.app.onboarding.composables.OnboardingPageWithImage.<anonymous> (OnboardingPageWithImage.kt:109)");
                }
                m.i(this.f59221a, (d) null, mVar, C13023e.f110931a, 2);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((String) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(IC.C13023e r32, androidx.compose.ui.d r33, U0.C4889m r34, int r35, int r36) {
        /*
            r0 = r32
            r1 = r35
            r2 = r36
            r3 = 1417513078(0x547d8876, float:4.35566464E12)
            r4 = r34
            U0.m r4 = r4.k(r3)
            r5 = r2 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r1 | 6
            goto L_0x002f
        L_0x0016:
            r5 = r1 & 6
            if (r5 != 0) goto L_0x002e
            r5 = r1 & 8
            if (r5 != 0) goto L_0x0023
            boolean r5 = r4.V(r0)
            goto L_0x0027
        L_0x0023:
            boolean r5 = r4.F(r0)
        L_0x0027:
            if (r5 == 0) goto L_0x002b
            r5 = 4
            goto L_0x002c
        L_0x002b:
            r5 = 2
        L_0x002c:
            r5 = r5 | r1
            goto L_0x002f
        L_0x002e:
            r5 = r1
        L_0x002f:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x0038
            r5 = r5 | 48
        L_0x0035:
            r7 = r33
            goto L_0x004a
        L_0x0038:
            r7 = r1 & 48
            if (r7 != 0) goto L_0x0035
            r7 = r33
            boolean r8 = r4.V(r7)
            if (r8 == 0) goto L_0x0047
            r8 = 32
            goto L_0x0049
        L_0x0047:
            r8 = 16
        L_0x0049:
            r5 = r5 | r8
        L_0x004a:
            r8 = r5 & 19
            r9 = 18
            if (r8 != r9) goto L_0x005e
            boolean r8 = r4.l()
            if (r8 != 0) goto L_0x0057
            goto L_0x005e
        L_0x0057:
            r4.L()
            r31 = r4
            goto L_0x00f1
        L_0x005e:
            if (r6 == 0) goto L_0x0064
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r14 = r6
            goto L_0x0065
        L_0x0064:
            r14 = r7
        L_0x0065:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0071
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.app.onboarding.composables.EyebrowText (OnboardingPageWithImage.kt:186)"
            U0.C4895p.S(r3, r5, r6, r7)
        L_0x0071:
            int r3 = IC.C13023e.f110931a
            r5 = r5 & 14
            r3 = r3 | r5
            java.lang.String r3 = r0.a(r4, r3)
            int r5 = r3.length()
            if (r5 != 0) goto L_0x0082
            r5 = 1
            goto L_0x0083
        L_0x0082:
            r5 = 0
        L_0x0083:
            if (r5 == 0) goto L_0x009d
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x008e
            U0.C4895p.R()
        L_0x008e:
            U0.Y0 r3 = r4.n()
            if (r3 == 0) goto L_0x009c
            Dh.h r4 = new Dh.h
            r4.<init>(r0, r14, r1, r2)
            r3.a(r4)
        L_0x009c:
            return
        L_0x009d:
            tK.u r5 = tK.C18029u.f147649a
            float r9 = r5.j()
            r12 = 13
            r13 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r7 = r14
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r7, r8, r9, r10, r11, r12, r13)
            TC.b$b$f r5 = TC.C13679b.C2857b.f.f116688a
            tK.v r7 = tK.C18030v.f147664a
            int r8 = tK.C18030v.f147665b
            tK.h r7 = r7.a(r4, r8)
            long r7 = r7.N()
            r28 = 0
            r29 = 262128(0x3fff0, float:3.6732E-40)
            r9 = 0
            r11 = 0
            r12 = 0
            r15 = 0
            r30 = r14
            r14 = r15
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 48
            r31 = r4
            r4 = r3
            r26 = r31
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00ef
            U0.C4895p.R()
        L_0x00ef:
            r7 = r30
        L_0x00f1:
            U0.Y0 r3 = r31.n()
            if (r3 == 0) goto L_0x00ff
            Dh.i r4 = new Dh.i
            r4.<init>(r0, r7, r1, r2)
            r3.a(r4)
        L_0x00ff:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.m.i(IC.e, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C13023e eVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        i(eVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C13023e eVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        i(eVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void l(IC.C13023e r17, IC.C13023e r18, IC.C13023e r19, java.lang.String r20, androidx.compose.ui.d r21, nI.q<? super java.lang.String, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r9 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r24
            java.lang.String r0 = "eyebrow"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            java.lang.String r0 = "title"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "description"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            r0 = 501071398(0x1dddbe26, float:5.869482E-21)
            r1 = r23
            U0.m r14 = r1.k(r0)
            r1 = r25 & 1
            if (r1 == 0) goto L_0x0029
            r1 = r13 | 6
            goto L_0x0042
        L_0x0029:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0041
            r1 = r13 & 8
            if (r1 != 0) goto L_0x0036
            boolean r1 = r14.V(r9)
            goto L_0x003a
        L_0x0036:
            boolean r1 = r14.F(r9)
        L_0x003a:
            if (r1 == 0) goto L_0x003e
            r1 = 4
            goto L_0x003f
        L_0x003e:
            r1 = 2
        L_0x003f:
            r1 = r1 | r13
            goto L_0x0042
        L_0x0041:
            r1 = r13
        L_0x0042:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0049
            r1 = r1 | 48
            goto L_0x0062
        L_0x0049:
            r2 = r13 & 48
            if (r2 != 0) goto L_0x0062
            r2 = r13 & 64
            if (r2 != 0) goto L_0x0056
            boolean r2 = r14.V(r10)
            goto L_0x005a
        L_0x0056:
            boolean r2 = r14.F(r10)
        L_0x005a:
            if (r2 == 0) goto L_0x005f
            r2 = 32
            goto L_0x0061
        L_0x005f:
            r2 = 16
        L_0x0061:
            r1 = r1 | r2
        L_0x0062:
            r2 = r25 & 4
            if (r2 == 0) goto L_0x0069
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0082
        L_0x0069:
            r2 = r13 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0082
            r2 = r13 & 512(0x200, float:7.175E-43)
            if (r2 != 0) goto L_0x0076
            boolean r2 = r14.V(r11)
            goto L_0x007a
        L_0x0076:
            boolean r2 = r14.F(r11)
        L_0x007a:
            if (r2 == 0) goto L_0x007f
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0081
        L_0x007f:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0081:
            r1 = r1 | r2
        L_0x0082:
            r2 = r25 & 8
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x008b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
            goto L_0x009a
        L_0x008b:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x009a
            boolean r2 = r14.V(r12)
            if (r2 == 0) goto L_0x0097
            r2 = r3
            goto L_0x0099
        L_0x0097:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0099:
            r1 = r1 | r2
        L_0x009a:
            r2 = r25 & 16
            if (r2 == 0) goto L_0x00a3
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x00a0:
            r4 = r21
            goto L_0x00b5
        L_0x00a3:
            r4 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r4 != 0) goto L_0x00a0
            r4 = r21
            boolean r5 = r14.V(r4)
            if (r5 == 0) goto L_0x00b2
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b4
        L_0x00b2:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x00b4:
            r1 = r1 | r5
        L_0x00b5:
            r5 = r25 & 32
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00c0
            r1 = r1 | r6
        L_0x00bc:
            r6 = r22
        L_0x00be:
            r7 = r1
            goto L_0x00d2
        L_0x00c0:
            r6 = r6 & r13
            if (r6 != 0) goto L_0x00bc
            r6 = r22
            boolean r7 = r14.F(r6)
            if (r7 == 0) goto L_0x00ce
            r7 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d0
        L_0x00ce:
            r7 = 65536(0x10000, float:9.18355E-41)
        L_0x00d0:
            r1 = r1 | r7
            goto L_0x00be
        L_0x00d2:
            r1 = 74899(0x12493, float:1.04956E-40)
            r1 = r1 & r7
            r8 = 74898(0x12492, float:1.04954E-40)
            if (r1 != r8) goto L_0x00e8
            boolean r1 = r14.l()
            if (r1 != 0) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            r14.L()
            r5 = r4
            goto L_0x01ad
        L_0x00e8:
            if (r2 == 0) goto L_0x00ee
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r15 = r1
            goto L_0x00ef
        L_0x00ee:
            r15 = r4
        L_0x00ef:
            r1 = 1
            if (r5 == 0) goto L_0x0103
            Dh.m$a r2 = new Dh.m$a
            r2.<init>(r9)
            r4 = 54
            r5 = 1706639253(0x65b93f95, float:1.09351335E23)
            c1.a r2 = c1.c.e(r5, r1, r2, r14, r4)
            r16 = r2
            goto L_0x0105
        L_0x0103:
            r16 = r6
        L_0x0105:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0111
            r2 = -1
            java.lang.String r4 = "com.ingka.ikea.app.onboarding.composables.OnboardingPageWithImage (OnboardingPageWithImage.kt:65)"
            U0.C4895p.S(r0, r7, r2, r4)
        L_0x0111:
            U0.I0 r0 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.f()
            java.lang.Object r0 = r14.Q(r0)
            android.content.res.Configuration r0 = (android.content.res.Configuration) r0
            r2 = 0
            float r4 = x(r14, r2)
            U0.I0 r5 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r5 = r14.Q(r5)
            c2.d r5 = (c2.d) r5
            gs.e$b r6 = new gs.e$b
            int r0 = r0.screenWidthDp
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            int r0 = r5.K0(r0)
            int r4 = r5.K0(r4)
            r6.<init>(r0, r4)
            r0 = 1444598190(0x561ad1ae, float:4.255634E13)
            r14.W(r0)
            r0 = r7 & 7168(0x1c00, float:1.0045E-41)
            if (r0 != r3) goto L_0x0149
            goto L_0x014a
        L_0x0149:
            r1 = r2
        L_0x014a:
            boolean r0 = r14.F(r6)
            r0 = r0 | r1
            java.lang.Object r1 = r14.D()
            if (r0 != 0) goto L_0x015d
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r1 != r0) goto L_0x0165
        L_0x015d:
            Dh.e r1 = new Dh.e
            r1.<init>(r12, r6)
            r14.u(r1)
        L_0x0165:
            nI.l r1 = (nI.C17642l) r1
            r14.P()
            gs.e r1 = gs.f.a(r1, r14, r2)
            int r5 = gs.e.f97946h
            r6 = 6
            r2 = 0
            r3 = 0
            r4 = r14
            t1.c r3 = gs.d.c(r1, r2, r3, r4, r5, r6)
            int r0 = IC.C13023e.f110931a
            r1 = r7 & 14
            r1 = r1 | r0
            int r2 = r0 << 3
            r1 = r1 | r2
            r2 = r7 & 112(0x70, float:1.57E-43)
            r1 = r1 | r2
            int r0 = r0 << 6
            r0 = r0 | r1
            r1 = r7 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r7
            r0 = r0 | r1
            r1 = 458752(0x70000, float:6.42848E-40)
            r1 = r1 & r7
            r7 = r0 | r1
            r8 = 0
            r0 = r17
            r1 = r18
            r2 = r19
            r4 = r15
            r5 = r16
            r6 = r14
            m(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01aa
            U0.C4895p.R()
        L_0x01aa:
            r5 = r15
            r6 = r16
        L_0x01ad:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x01c8
            Dh.f r15 = new Dh.f
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r14.a(r15)
        L_0x01c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.m.l(IC.e, IC.e, IC.e, java.lang.String, androidx.compose.ui.d, nI.q, U0.m, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:117:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(IC.C13023e r44, IC.C13023e r45, IC.C13023e r46, t1.C5942c r47, androidx.compose.ui.d r48, nI.q<? super java.lang.String, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r49, U0.C4889m r50, int r51, int r52) {
        /*
            r1 = r44
            r2 = r45
            r3 = r46
            r14 = r47
            r15 = r51
            r0 = 16
            r4 = 32
            r5 = 2
            r6 = 4
            java.lang.String r7 = "eyebrow"
            kotlin.jvm.internal.C17542s.j(r1, r7)
            java.lang.String r7 = "title"
            kotlin.jvm.internal.C17542s.j(r2, r7)
            java.lang.String r7 = "description"
            kotlin.jvm.internal.C17542s.j(r3, r7)
            java.lang.String r7 = "imagePainter"
            kotlin.jvm.internal.C17542s.j(r14, r7)
            r7 = 1855082656(0x6e9250a0, float:2.264114E28)
            r8 = r50
            U0.m r13 = r8.k(r7)
            r12 = 1
            r8 = r52 & 1
            if (r8 == 0) goto L_0x0035
            r8 = r15 | 6
            goto L_0x004e
        L_0x0035:
            r8 = r15 & 6
            if (r8 != 0) goto L_0x004d
            r8 = r15 & 8
            if (r8 != 0) goto L_0x0042
            boolean r8 = r13.V(r1)
            goto L_0x0046
        L_0x0042:
            boolean r8 = r13.F(r1)
        L_0x0046:
            if (r8 == 0) goto L_0x004a
            r8 = r6
            goto L_0x004b
        L_0x004a:
            r8 = r5
        L_0x004b:
            r8 = r8 | r15
            goto L_0x004e
        L_0x004d:
            r8 = r15
        L_0x004e:
            r5 = r52 & 2
            if (r5 == 0) goto L_0x0055
            r8 = r8 | 48
            goto L_0x006c
        L_0x0055:
            r5 = r15 & 48
            if (r5 != 0) goto L_0x006c
            r5 = r15 & 64
            if (r5 != 0) goto L_0x0062
            boolean r5 = r13.V(r2)
            goto L_0x0066
        L_0x0062:
            boolean r5 = r13.F(r2)
        L_0x0066:
            if (r5 == 0) goto L_0x006a
            r5 = r4
            goto L_0x006b
        L_0x006a:
            r5 = r0
        L_0x006b:
            r8 = r8 | r5
        L_0x006c:
            r5 = r52 & 4
            if (r5 == 0) goto L_0x0073
            r8 = r8 | 384(0x180, float:5.38E-43)
            goto L_0x008c
        L_0x0073:
            r5 = r15 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x008c
            r5 = r15 & 512(0x200, float:7.175E-43)
            if (r5 != 0) goto L_0x0080
            boolean r5 = r13.V(r3)
            goto L_0x0084
        L_0x0080:
            boolean r5 = r13.F(r3)
        L_0x0084:
            if (r5 == 0) goto L_0x0089
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x008b
        L_0x0089:
            r5 = 128(0x80, float:1.794E-43)
        L_0x008b:
            r8 = r8 | r5
        L_0x008c:
            r5 = r52 & 8
            if (r5 == 0) goto L_0x0093
            r8 = r8 | 3072(0xc00, float:4.305E-42)
            goto L_0x00a3
        L_0x0093:
            r5 = r15 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r13.F(r14)
            if (r5 == 0) goto L_0x00a0
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x00a2
        L_0x00a0:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x00a2:
            r8 = r8 | r5
        L_0x00a3:
            r0 = r52 & 16
            if (r0 == 0) goto L_0x00ac
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x00a9:
            r5 = r48
            goto L_0x00be
        L_0x00ac:
            r5 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x00a9
            r5 = r48
            boolean r6 = r13.V(r5)
            if (r6 == 0) goto L_0x00bb
            r6 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00bd
        L_0x00bb:
            r6 = 8192(0x2000, float:1.14794E-41)
        L_0x00bd:
            r8 = r8 | r6
        L_0x00be:
            r4 = r52 & 32
            r6 = 196608(0x30000, float:2.75506E-40)
            if (r4 == 0) goto L_0x00c9
            r8 = r8 | r6
        L_0x00c5:
            r6 = r49
        L_0x00c7:
            r11 = r8
            goto L_0x00db
        L_0x00c9:
            r6 = r6 & r15
            if (r6 != 0) goto L_0x00c5
            r6 = r49
            boolean r9 = r13.F(r6)
            if (r9 == 0) goto L_0x00d7
            r9 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d9
        L_0x00d7:
            r9 = 65536(0x10000, float:9.18355E-41)
        L_0x00d9:
            r8 = r8 | r9
            goto L_0x00c7
        L_0x00db:
            r8 = 74899(0x12493, float:1.04956E-40)
            r8 = r8 & r11
            r9 = 74898(0x12492, float:1.04954E-40)
            if (r8 != r9) goto L_0x00f1
            boolean r8 = r13.l()
            if (r8 != 0) goto L_0x00eb
            goto L_0x00f1
        L_0x00eb:
            r13.L()
            r0 = r13
            goto L_0x030b
        L_0x00f1:
            if (r0 == 0) goto L_0x00f6
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x00f7
        L_0x00f6:
            r0 = r5
        L_0x00f7:
            if (r4 == 0) goto L_0x0109
            Dh.m$b r4 = new Dh.m$b
            r4.<init>(r1)
            r5 = 54
            r6 = 572980497(0x2226fd11, float:2.2631167E-18)
            c1.a r4 = c1.c.e(r6, r12, r4, r13, r5)
            r10 = r4
            goto L_0x010a
        L_0x0109:
            r10 = r6
        L_0x010a:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0116
            r4 = -1
            java.lang.String r5 = "com.ingka.ikea.app.onboarding.composables.OnboardingPageWithImage (OnboardingPageWithImage.kt:111)"
            U0.C4895p.S(r7, r11, r4, r5)
        L_0x0116:
            r9 = 0
            r8 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r0, r9, r12, r8)
            androidx.compose.foundation.layout.d r16 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r5 = r16.g()
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c$b r6 = r17.k()
            r7 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5080k.a(r5, r6, r13, r7)
            int r6 = U0.C4883j.a(r13, r7)
            U0.y r7 = r13.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r13, r4)
            G1.g$a r18 = G1.C4504g.f6515W
            nI.a r8 = r18.a()
            U0.f r19 = r13.m()
            if (r19 != 0) goto L_0x0148
            U0.C4883j.c()
        L_0x0148:
            r13.I()
            boolean r19 = r13.i()
            if (r19 == 0) goto L_0x0155
            r13.p(r8)
            goto L_0x0158
        L_0x0155:
            r13.t()
        L_0x0158:
            U0.m r8 = U0.F1.a(r13)
            nI.p r9 = r18.c()
            U0.F1.c(r8, r5, r9)
            nI.p r5 = r18.e()
            U0.F1.c(r8, r7, r5)
            nI.p r5 = r18.b()
            boolean r7 = r8.i()
            if (r7 != 0) goto L_0x0182
            java.lang.Object r7 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r9)
            if (r7 != 0) goto L_0x0190
        L_0x0182:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.w(r6, r5)
        L_0x0190:
            nI.p r5 = r18.d()
            U0.F1.c(r8, r4, r5)
            s0.h r4 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r7 = 0
            r8 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r9, r8, r12, r7)
            r5 = 1056964608(0x3f000000, float:0.5)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.c(r4, r5)
            E1.k$a r4 = E1.C4478k.f5915a
            E1.k r19 = r4.a()
            int r4 = r11 >> 9
            r4 = r4 & 14
            r5 = r4 | 25008(0x61b0, float:3.5044E-41)
            r20 = 104(0x68, float:1.46E-43)
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r4 = r47
            r25 = r5
            r5 = r21
            r21 = r7
            r7 = r22
            r21 = r8
            r8 = r19
            r42 = r9
            r9 = r23
            r43 = r10
            r10 = r24
            r26 = r11
            r11 = r13
            r12 = r25
            r48 = r0
            r0 = r13
            r13 = r20
            n0.C5583F.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r7 = r42
            r4 = 1
            r5 = 0
            r6 = 0
            androidx.compose.ui.d r19 = androidx.compose.foundation.layout.J.h(r7, r5, r4, r6)
            r5 = 0
            androidx.compose.foundation.o r20 = androidx.compose.foundation.m.c(r5, r0, r5, r4)
            r24 = 14
            r25 = 0
            r21 = 0
            r23 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.m.f(r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.ui.d r19 = TC.e.i(r4)
            tK.u r4 = tK.C18029u.f147649a
            float r21 = r4.a()
            r24 = 13
            r20 = 0
            r22 = 0
            r23 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r19, r20, r21, r22, r23, r24, r25)
            androidx.compose.foundation.layout.d$m r8 = r16.g()
            i1.c$b r9 = r17.k()
            E1.I r8 = androidx.compose.foundation.layout.C5080k.a(r8, r9, r0, r5)
            int r9 = U0.C4883j.a(r0, r5)
            U0.y r10 = r0.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r0, r6)
            nI.a r11 = r18.a()
            U0.f r12 = r0.m()
            if (r12 != 0) goto L_0x0235
            U0.C4883j.c()
        L_0x0235:
            r0.I()
            boolean r12 = r0.i()
            if (r12 == 0) goto L_0x0242
            r0.p(r11)
            goto L_0x0245
        L_0x0242:
            r0.t()
        L_0x0245:
            U0.m r11 = U0.F1.a(r0)
            nI.p r12 = r18.c()
            U0.F1.c(r11, r8, r12)
            nI.p r8 = r18.e()
            U0.F1.c(r11, r10, r8)
            nI.p r8 = r18.b()
            boolean r10 = r11.i()
            if (r10 != 0) goto L_0x026f
            java.lang.Object r10 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r12)
            if (r10 != 0) goto L_0x027d
        L_0x026f:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r11.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r11.w(r9, r8)
        L_0x027d:
            nI.p r8 = r18.d()
            U0.F1.c(r11, r6, r8)
            int r6 = IC.C13023e.f110931a
            r8 = r26 & 14
            r8 = r8 | r6
            java.lang.String r8 = r1.a(r0, r8)
            int r9 = r26 >> 12
            r9 = r9 & 112(0x70, float:1.57E-43)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = r43
            r10.invoke(r8, r0, r9)
            int r8 = r26 >> 3
            r8 = r8 & 14
            r8 = r8 | r6
            java.lang.String r8 = r2.a(r0, r8)
            q(r8, r0, r5)
            float r21 = r4.a()
            float r23 = r4.d()
            r24 = 5
            r25 = 0
            r20 = 0
            r22 = 0
            r19 = r7
            androidx.compose.ui.d r18 = androidx.compose.foundation.layout.D.m(r19, r20, r21, r22, r23, r24, r25)
            int r4 = r26 >> 6
            r4 = r4 & 14
            r4 = r4 | r6
            java.lang.String r16 = r3.a(r0, r4)
            TC.b$a$b r17 = TC.C13679b.a.C2856b.f116680a
            tK.v r4 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.h r4 = r4.a(r0, r5)
            long r19 = r4.H0()
            r40 = 0
            r41 = 262128(0x3fff0, float:3.6732E-40)
            r21 = 0
            r23 = 0
            r24 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r39 = 48
            r38 = r0
            SC.C13607l.j(r16, r17, r18, r19, r21, r23, r24, r25, r26, r28, r29, r30, r31, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r0.x()
            r0.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0308
            U0.C4895p.R()
        L_0x0308:
            r5 = r48
            r6 = r10
        L_0x030b:
            U0.Y0 r9 = r0.n()
            if (r9 == 0) goto L_0x0326
            Dh.g r10 = new Dh.g
            r0 = r10
            r1 = r44
            r2 = r45
            r3 = r46
            r4 = r47
            r7 = r51
            r8 = r52
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r10)
        L_0x0326:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dh.m.m(IC.e, IC.e, IC.e, t1.c, androidx.compose.ui.d, nI.q, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N n(String str, e.b bVar, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(str);
        aVar.m(bVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C13023e eVar, C13023e eVar2, C13023e eVar3, String str, d dVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        l(eVar, eVar2, eVar3, str, dVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C13023e eVar, C13023e eVar2, C13023e eVar3, C5942c cVar, d dVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        m(eVar, eVar2, eVar3, cVar, dVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void q(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        int i12 = i10;
        C4889m k10 = mVar.k(450806038);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(450806038, i11, -1, "com.ingka.ikea.app.onboarding.composables.TitleText (OnboardingPageWithImage.kt:159)");
            }
            if (str.length() == 0) {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new j(str2, i12));
                    return;
                }
                return;
            }
            C13679b.C2857b.a aVar = C13679b.C2857b.a.f116683a;
            C13679b.C2857b.C2858b bVar = C13679b.C2857b.C2858b.f116684a;
            k10.W(-1256727029);
            Object D10 = k10.D();
            C4889m.a aVar2 = C4889m.f14007a;
            if (D10 == aVar2.a()) {
                D10 = u1.e(aVar, (o1) null, 2, (Object) null);
                k10.u(D10);
            }
            C4899r0 r0Var = (C4899r0) D10;
            k10.P();
            d m10 = D.m(d.f18749a, 0.0f, C18029u.f147649a.j(), 0.0f, 0.0f, 13, (Object) null);
            C13679b v10 = v(r0Var);
            long G02 = C18030v.f147664a.a(k10, C18030v.f147665b).G0();
            k10.W(-1256718822);
            Object D11 = k10.D();
            if (D11 == aVar2.a()) {
                D11 = new k(bVar, r0Var);
                k10.u(D11);
            }
            k10.P();
            int i13 = i11 & 14;
            C13679b bVar2 = v10;
            mVar2 = k10;
            C13607l.j(str, bVar2, m10, G02, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l) D11, mVar2, i13, 12582912, 131056);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new l(str, i10));
        }
    }

    private static final void r(C4899r0<C13679b> r0Var, C13679b bVar) {
        r0Var.setValue(bVar);
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C13679b.C2857b.C2858b bVar, C4899r0 r0Var, P p10) {
        C17542s.j(p10, "textLayoutResult");
        if (p10.n() > 2) {
            r(r0Var, bVar);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(String str, int i10, C4889m mVar, int i11) {
        q(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u(String str, int i10, C4889m mVar, int i11) {
        q(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final C13679b v(C4899r0<C13679b> r0Var) {
        return r0Var.getValue();
    }

    private static final float x(C4889m mVar, int i10) {
        mVar.W(-92482939);
        if (C4895p.J()) {
            C4895p.S(-92482939, i10, -1, "com.ingka.ikea.app.onboarding.composables.getImageContentHeight (OnboardingPageWithImage.kt:202)");
        }
        float B10 = h.B(Math.min(h.B(h.B((float) ((Configuration) mVar.Q(AndroidCompositionLocals_androidKt.f())).screenHeightDp) / ((float) 2)), f59219a));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return B10;
    }
}
