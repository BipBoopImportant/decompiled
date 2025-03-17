package SC;

import J1.j;
import O0.H0;
import O0.L0;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import nI.q;
import nI.r;
import uI.C18059h;
import wK.C18500u2;
import wK.Ga;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aC\u0010\u0011\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0005\u001a\u00020\u00042 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", "message", "LSC/q0;", "dismissParams", "Landroidx/compose/ui/d;", "modifier", "actionLabel", "Lkotlin/Function0;", "LXH/N;", "actionOnClick", "e", "(Ljava/lang/String;LSC/q0;Landroidx/compose/ui/d;Ljava/lang/String;LnI/a;LU0/m;II)V", "LO0/L0;", "snackbarHostState", "Lkotlin/Function2;", "LO0/H0;", "onShowSnackBar", "c", "(LO0/L0;Landroidx/compose/ui/d;LnI/r;LU0/m;II)V", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Y2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<H0, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r<H0, p<? super C4889m, ? super Integer, C16807N>, C4889m, Integer, C16807N> f116081a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: SC.Y2$a$a  reason: collision with other inner class name */
        static final class C2843a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ H0 f116082a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: SC.Y2$a$a$a  reason: collision with other inner class name */
            /* synthetic */ class C2844a extends C17540p implements C17631a<C16807N> {
                C2844a(Object obj) {
                    super(0, obj, H0.class, "performAction", "performAction()V", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    t();
                    return C16807N.f139792a;
                }

                public final void t() {
                    ((H0) this.receiver).c();
                }
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: SC.Y2$a$a$b */
            /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
                b(Object obj) {
                    super(0, obj, H0.class, "dismiss", "dismiss()V", 0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    t();
                    return C16807N.f139792a;
                }

                public final void t() {
                    ((H0) this.receiver).dismiss();
                }
            }

            C2843a(H0 h02) {
                this.f116082a = h02;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-112046289, i10, -1, "com.ingka.ikea.ui.skapa.SkapaSnackbarHostM3.<anonymous>.<anonymous> (SkapaToastSnackbar.kt:66)");
                    }
                    String b10 = this.f116082a.a().b();
                    H0 h02 = this.f116082a;
                    mVar.W(353837445);
                    boolean V10 = mVar.V(h02);
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C2844a(h02);
                        mVar.u(D10);
                    }
                    C18059h hVar = (C18059h) D10;
                    mVar.P();
                    if (b10 == null) {
                        hVar = null;
                    }
                    H0 h03 = this.f116082a;
                    mVar.W(353841983);
                    boolean V11 = mVar.V(h03);
                    Object D11 = mVar.D();
                    if (V11 || D11 == C4889m.f14007a.a()) {
                        D11 = new b(h03);
                        mVar.u(D11);
                    }
                    mVar.P();
                    C18500u2 u2Var = new C18500u2((C17631a) ((C18059h) D11), j.b(Oo.b.f84745p2, mVar, 0));
                    Ga.g(this.f116082a.a().getMessage(), C5116k1.a(e.j(d.f18749a), "skapa_toast_snackbar_toast"), u2Var, b10, (C17631a) hVar, mVar, C18500u2.f151671c << 6, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }
        }

        a(r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N> rVar) {
            this.f116081a = rVar;
        }

        public final void a(H0 h02, C4889m mVar, int i10) {
            C17542s.j(h02, "snackbarData");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(h02) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1199892181, i10, -1, "com.ingka.ikea.ui.skapa.SkapaSnackbarHostM3.<anonymous> (SkapaToastSnackbar.kt:65)");
                }
                this.f116081a.l(h02, c.e(-112046289, true, new C2843a(h02), mVar, 54), mVar, Integer.valueOf((i10 & 14) | 48));
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((H0) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(O0.L0 r7, androidx.compose.ui.d r8, nI.r<? super O0.H0, ? super nI.p<? super U0.C4889m, ? super java.lang.Integer, XH.C16807N>, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r9, U0.C4889m r10, int r11, int r12) {
        /*
            java.lang.String r0 = "snackbarHostState"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            r0 = -1297763390(0xffffffffb2a5b3c2, float:-1.9290272E-8)
            U0.m r10 = r10.k(r0)
            r1 = r12 & 1
            if (r1 == 0) goto L_0x0013
            r1 = r11 | 6
            goto L_0x0023
        L_0x0013:
            r1 = r11 & 6
            if (r1 != 0) goto L_0x0022
            boolean r1 = r10.V(r7)
            if (r1 == 0) goto L_0x001f
            r1 = 4
            goto L_0x0020
        L_0x001f:
            r1 = 2
        L_0x0020:
            r1 = r1 | r11
            goto L_0x0023
        L_0x0022:
            r1 = r11
        L_0x0023:
            r2 = r12 & 2
            if (r2 == 0) goto L_0x002a
            r1 = r1 | 48
            goto L_0x003a
        L_0x002a:
            r3 = r11 & 48
            if (r3 != 0) goto L_0x003a
            boolean r3 = r10.V(r8)
            if (r3 == 0) goto L_0x0037
            r3 = 32
            goto L_0x0039
        L_0x0037:
            r3 = 16
        L_0x0039:
            r1 = r1 | r3
        L_0x003a:
            r3 = r12 & 4
            if (r3 == 0) goto L_0x0041
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0051
        L_0x0041:
            r4 = r11 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0051
            boolean r4 = r10.F(r9)
            if (r4 == 0) goto L_0x004e
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0050
        L_0x004e:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0050:
            r1 = r1 | r4
        L_0x0051:
            r4 = r1 & 147(0x93, float:2.06E-43)
            r5 = 146(0x92, float:2.05E-43)
            if (r4 != r5) goto L_0x0064
            boolean r4 = r10.l()
            if (r4 != 0) goto L_0x005e
            goto L_0x0064
        L_0x005e:
            r10.L()
        L_0x0061:
            r3 = r8
            r4 = r9
            goto L_0x00a4
        L_0x0064:
            if (r2 == 0) goto L_0x0068
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
        L_0x0068:
            if (r3 == 0) goto L_0x0070
            SC.a r9 = SC.C13563a.f116101a
            nI.r r9 = r9.a()
        L_0x0070:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x007c
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.ui.skapa.SkapaSnackbarHostM3 (SkapaToastSnackbar.kt:60)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x007c:
            SC.Y2$a r0 = new SC.Y2$a
            r0.<init>(r9)
            r2 = 54
            r3 = 1199892181(0x4784e6d5, float:68045.664)
            r4 = 1
            c1.a r3 = c1.c.e(r3, r4, r0, r10, r2)
            r0 = r1 & 14
            r0 = r0 | 384(0x180, float:5.38E-43)
            r1 = r1 & 112(0x70, float:1.57E-43)
            r5 = r0 | r1
            r6 = 0
            r1 = r7
            r2 = r8
            r4 = r10
            O0.K0.b(r1, r2, r3, r4, r5, r6)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0061
            U0.C4895p.R()
            goto L_0x0061
        L_0x00a4:
            U0.Y0 r8 = r10.n()
            if (r8 == 0) goto L_0x00b6
            SC.W2 r9 = new SC.W2
            r1 = r9
            r2 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r8.a(r9)
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.Y2.c(O0.L0, androidx.compose.ui.d, nI.r, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(L0 l02, d dVar, r rVar, int i10, int i11, C4889m mVar, int i12) {
        c(l02, dVar, rVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r15, SC.C13628q0 r16, androidx.compose.ui.d r17, java.lang.String r18, nI.C17631a<XH.C16807N> r19, U0.C4889m r20, int r21, int r22) {
        /*
            r8 = r15
            r9 = r16
            r10 = r21
            java.lang.String r0 = "message"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "dismissParams"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            r0 = 811710184(0x3061b6e8, float:8.211445E-10)
            r1 = r20
            U0.m r11 = r1.k(r0)
            r1 = r22 & 1
            if (r1 == 0) goto L_0x001f
            r1 = r10 | 6
            goto L_0x002f
        L_0x001f:
            r1 = r10 & 6
            if (r1 != 0) goto L_0x002e
            boolean r1 = r11.V(r15)
            if (r1 == 0) goto L_0x002b
            r1 = 4
            goto L_0x002c
        L_0x002b:
            r1 = 2
        L_0x002c:
            r1 = r1 | r10
            goto L_0x002f
        L_0x002e:
            r1 = r10
        L_0x002f:
            r2 = r22 & 2
            if (r2 == 0) goto L_0x0036
            r1 = r1 | 48
            goto L_0x0046
        L_0x0036:
            r2 = r10 & 48
            if (r2 != 0) goto L_0x0046
            boolean r2 = r11.V(r9)
            if (r2 == 0) goto L_0x0043
            r2 = 32
            goto L_0x0045
        L_0x0043:
            r2 = 16
        L_0x0045:
            r1 = r1 | r2
        L_0x0046:
            r2 = r22 & 4
            if (r2 == 0) goto L_0x004f
            r1 = r1 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r3 = r17
            goto L_0x0061
        L_0x004f:
            r3 = r10 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x004c
            r3 = r17
            boolean r4 = r11.V(r3)
            if (r4 == 0) goto L_0x005e
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r1 = r1 | r4
        L_0x0061:
            r4 = r22 & 8
            if (r4 == 0) goto L_0x006a
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r5 = r18
            goto L_0x007c
        L_0x006a:
            r5 = r10 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0067
            r5 = r18
            boolean r6 = r11.V(r5)
            if (r6 == 0) goto L_0x0079
            r6 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r6 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r1 = r1 | r6
        L_0x007c:
            r6 = r22 & 16
            if (r6 == 0) goto L_0x0085
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0082:
            r7 = r19
            goto L_0x0097
        L_0x0085:
            r7 = r10 & 24576(0x6000, float:3.4438E-41)
            if (r7 != 0) goto L_0x0082
            r7 = r19
            boolean r12 = r11.F(r7)
            if (r12 == 0) goto L_0x0094
            r12 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0096
        L_0x0094:
            r12 = 8192(0x2000, float:1.14794E-41)
        L_0x0096:
            r1 = r1 | r12
        L_0x0097:
            r12 = r1 & 9363(0x2493, float:1.312E-41)
            r13 = 9362(0x2492, float:1.3119E-41)
            if (r12 != r13) goto L_0x00aa
            boolean r12 = r11.l()
            if (r12 != 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            r11.L()
            r4 = r5
            r5 = r7
            goto L_0x00f6
        L_0x00aa:
            if (r2 == 0) goto L_0x00b0
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r12 = r2
            goto L_0x00b1
        L_0x00b0:
            r12 = r3
        L_0x00b1:
            r2 = 0
            if (r4 == 0) goto L_0x00b6
            r13 = r2
            goto L_0x00b7
        L_0x00b6:
            r13 = r5
        L_0x00b7:
            if (r6 == 0) goto L_0x00bb
            r14 = r2
            goto L_0x00bc
        L_0x00bb:
            r14 = r7
        L_0x00bc:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x00c8
            r2 = -1
            java.lang.String r3 = "com.ingka.ikea.ui.skapa.SkapaToastSnackbar (SkapaToastSnackbar.kt:35)"
            U0.C4895p.S(r0, r1, r2, r3)
        L_0x00c8:
            wK.u2 r2 = SC.C13631r0.a(r16)
            r0 = r1 & 14
            int r3 = r1 >> 3
            r3 = r3 & 112(0x70, float:1.57E-43)
            r0 = r0 | r3
            int r3 = wK.C18500u2.f151671c
            int r3 = r3 << 6
            r0 = r0 | r3
            r3 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r3
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r6 = r0 | r1
            r7 = 0
            r0 = r15
            r1 = r12
            r3 = r13
            r4 = r14
            r5 = r11
            wK.Ga.g(r0, r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00f3
            U0.C4895p.R()
        L_0x00f3:
            r3 = r12
            r4 = r13
            r5 = r14
        L_0x00f6:
            U0.Y0 r11 = r11.n()
            if (r11 == 0) goto L_0x010c
            SC.X2 r12 = new SC.X2
            r0 = r12
            r1 = r15
            r2 = r16
            r6 = r21
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.a(r12)
        L_0x010c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: SC.Y2.e(java.lang.String, SC.q0, androidx.compose.ui.d, java.lang.String, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, C13628q0 q0Var, d dVar, String str2, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        e(str, q0Var, dVar, str2, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
