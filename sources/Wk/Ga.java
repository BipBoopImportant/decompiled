package wK;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16795B;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.c;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.M;
import nI.C17631a;
import nI.p;
import tI.C17978n;
import tK.C18029u;

@Metadata(d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aG\u0010\n\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aA\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00002\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001ac\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170#2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%\u001a!\u0010(\u001a\u00020\u00132\b\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010)\u001aG\u0010.\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010*\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u0015H\u0002¢\u0006\u0004\b.\u0010/\u001a1\u00102\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00002\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0003¢\u0006\u0004\b2\u00103¨\u00066²\u0006\f\u00104\u001a\u00020\u00138\nX\u0002²\u0006\f\u00105\u001a\u00020\u00138\nX\u0002"}, d2 = {"", "message", "Landroidx/compose/ui/d;", "modifier", "LwK/u2;", "dismissParams", "actionLabel", "Lkotlin/Function0;", "LXH/N;", "actionOnClick", "g", "(Ljava/lang/String;Landroidx/compose/ui/d;LwK/u2;Ljava/lang/String;LnI/a;LU0/m;II)V", "LwK/Ja;", "style", "n", "(LwK/Ja;Ljava/lang/String;LwK/u2;Ljava/lang/String;LnI/a;LU0/m;I)V", "LE1/I;", "z", "()LE1/I;", "", "isWrapped", "Lc2/b;", "contentConstraints", "", "actionWidth", "actionPadding", "A", "(ZJII)J", "wrappedTopPadding", "inlineBottomPadding", "messageHeight", "dismissButtonHeight", "height", "actionPlaceableHeight", "dismissYAxisHeight", "LXH/B;", "w", "(ZIIIIIII)LXH/B;", "LE1/a0;", "actionPlaceable", "y", "(LE1/a0;J)Z", "messagePlaceable", "actionHeight", "dismissPlaceable", "constraints", "v", "(ZLE1/a0;IIILE1/a0;J)I", "label", "onClick", "i", "(Landroidx/compose/ui/d;Ljava/lang/String;LnI/a;LU0/m;II)V", "pressed", "hover", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Ga {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Ja f149540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f149541b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C18500u2 f149542c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f149543d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f149544e;

        a(Ja ja2, String str, C18500u2 u2Var, String str2, C17631a<C16807N> aVar) {
            this.f149540a = ja2;
            this.f149541b = str;
            this.f149542c = u2Var;
            this.f149543d = str2;
            this.f149544e = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1529063097, i10, -1, "net.ikea.skapa.ui.components.Toast.<anonymous> (Toast.kt:75)");
                }
                Ga.n(this.f149540a, this.f149541b, this.f149542c, this.f149543d, this.f149544e, mVar, 0);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements I {

        /* renamed from: a  reason: collision with root package name */
        public static final b f149545a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N c(boolean z10, int i10, int i11, int i12, int i13, int i14, a0 a0Var, a0 a0Var2, M m10, a0 a0Var3, int i15, a0.a aVar) {
            M m11 = m10;
            C17542s.j(aVar, "$this$layout");
            C16795B x10 = Ga.x(z10, i10, i11, i12, i13, i14, a0Var != null ? a0Var.z0() : 0, 0, 128, (Object) null);
            int intValue = ((Number) x10.a()).intValue();
            int intValue2 = ((Number) x10.b()).intValue();
            int intValue3 = ((Number) x10.c()).intValue();
            a0.a.m(aVar, a0Var2, 0, intValue, 0.0f, 4, (Object) null);
            if (z10) {
                if (a0Var != null) {
                    a0.a.m(aVar, a0Var, 0, intValue2, 0.0f, 4, (Object) null);
                }
            } else if (a0Var != null) {
                a0.a.m(aVar, a0Var, m11.f144346a - ((a0Var3.E0() + a0Var.C0()) + i15), intValue2, 0.0f, 4, (Object) null);
            }
            a0.a.m(aVar, a0Var3, m11.f144346a - a0Var3.E0(), intValue3, 0.0f, 4, (Object) null);
            return C16807N.f139792a;
        }

        public final J i(K k10, List<? extends H> list, long j10) {
            Object obj;
            K k11 = k10;
            List<? extends H> list2 = list;
            C17542s.j(k11, "$this$MeasurePolicy");
            C17542s.j(list2, "measurables");
            C18029u uVar = C18029u.f147649a;
            int K02 = k11.K0(uVar.a());
            int K03 = k11.K0(uVar.l());
            int K04 = k11.K0(uVar.j());
            int K05 = k11.K0(uVar.f());
            Iterable<H> iterable = list2;
            for (H h10 : iterable) {
                if (androidx.compose.ui.layout.a.a(h10) == za.Dismiss) {
                    a0 i02 = h10.i0(c.b(0, 0, 0, 0, 15, (Object) null));
                    int C02 = i02.C0();
                    int z10 = i02.z();
                    long d10 = C5267b.d(j10, 0, C5267b.l(j10) - (C02 + K02), 0, 0, 12, (Object) null);
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (androidx.compose.ui.layout.a.a((H) obj) == za.Action) {
                            break;
                        }
                    }
                    H h11 = (H) obj;
                    a0 i03 = h11 != null ? h11.i0(d10) : null;
                    int i10 = 0;
                    int E02 = i03 != null ? i03.E0() : 0;
                    if (i03 != null) {
                        i10 = i03.z0();
                    }
                    boolean t10 = Ga.y(i03, d10);
                    long u10 = Ga.A(t10, d10, E02, K03);
                    for (H h12 : iterable) {
                        if (androidx.compose.ui.layout.a.a(h12) == za.Message) {
                            a0 i04 = h12.i0(u10);
                            int z11 = i04.z();
                            boolean z12 = t10;
                            int s10 = Ga.v(t10, i04, i10, K05, K04, i02, j10);
                            M m10 = new M();
                            int l10 = C5267b.l(j10);
                            m10.f144346a = l10;
                            int i11 = C17978n.i(l10, C5267b.l(j10));
                            m10.f144346a = i11;
                            return K.v0(k10, i11, s10, (Map) null, new Ha(z12, K05, K04, z11, z10, s10, i03, i04, m10, i02, K03), 4, (Object) null);
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
    }

    /* access modifiers changed from: private */
    public static final long A(boolean z10, long j10, int i10, int i11) {
        if (z10) {
            return j10;
        }
        return C5267b.d(j10, 0, C5267b.l(j10) - (i10 + i11), 0, 0, 13, (Object) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(java.lang.String r25, androidx.compose.ui.d r26, wK.C18500u2 r27, java.lang.String r28, nI.C17631a<XH.C16807N> r29, U0.C4889m r30, int r31, int r32) {
        /*
            r6 = r25
            r7 = r27
            r8 = r31
            java.lang.String r0 = "message"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            java.lang.String r0 = "dismissParams"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            r0 = 876114868(0x343873b4, float:1.7178428E-7)
            r1 = r30
            U0.m r15 = r1.k(r0)
            r1 = r32 & 1
            if (r1 == 0) goto L_0x0020
            r1 = r8 | 6
            goto L_0x0030
        L_0x0020:
            r1 = r8 & 6
            if (r1 != 0) goto L_0x002f
            boolean r1 = r15.V(r6)
            if (r1 == 0) goto L_0x002c
            r1 = 4
            goto L_0x002d
        L_0x002c:
            r1 = 2
        L_0x002d:
            r1 = r1 | r8
            goto L_0x0030
        L_0x002f:
            r1 = r8
        L_0x0030:
            r2 = r32 & 2
            if (r2 == 0) goto L_0x0039
            r1 = r1 | 48
        L_0x0036:
            r3 = r26
            goto L_0x004b
        L_0x0039:
            r3 = r8 & 48
            if (r3 != 0) goto L_0x0036
            r3 = r26
            boolean r4 = r15.V(r3)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r32 & 4
            if (r4 == 0) goto L_0x0052
            r1 = r1 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0052:
            r4 = r8 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x0062
            boolean r4 = r15.V(r7)
            if (r4 == 0) goto L_0x005f
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0061
        L_0x005f:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r1 = r1 | r4
        L_0x0062:
            r4 = r32 & 8
            if (r4 == 0) goto L_0x006b
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x0068:
            r5 = r28
            goto L_0x007d
        L_0x006b:
            r5 = r8 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0068
            r5 = r28
            boolean r9 = r15.V(r5)
            if (r9 == 0) goto L_0x007a
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007c
        L_0x007a:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007c:
            r1 = r1 | r9
        L_0x007d:
            r9 = r32 & 16
            if (r9 == 0) goto L_0x0087
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0083:
            r10 = r29
        L_0x0085:
            r11 = r1
            goto L_0x009a
        L_0x0087:
            r10 = r8 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0083
            r10 = r29
            boolean r11 = r15.F(r10)
            if (r11 == 0) goto L_0x0096
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0098
        L_0x0096:
            r11 = 8192(0x2000, float:1.14794E-41)
        L_0x0098:
            r1 = r1 | r11
            goto L_0x0085
        L_0x009a:
            r1 = r11 & 9363(0x2493, float:1.312E-41)
            r12 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r12) goto L_0x00b0
            boolean r1 = r15.l()
            if (r1 != 0) goto L_0x00a7
            goto L_0x00b0
        L_0x00a7:
            r15.L()
            r2 = r3
            r4 = r5
            r5 = r10
            r0 = r15
            goto L_0x0128
        L_0x00b0:
            if (r2 == 0) goto L_0x00b7
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r22 = r1
            goto L_0x00b9
        L_0x00b7:
            r22 = r3
        L_0x00b9:
            r1 = 0
            if (r4 == 0) goto L_0x00bf
            r23 = r1
            goto L_0x00c1
        L_0x00bf:
            r23 = r5
        L_0x00c1:
            if (r9 == 0) goto L_0x00c6
            r24 = r1
            goto L_0x00c8
        L_0x00c6:
            r24 = r10
        L_0x00c8:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x00d4
            r1 = -1
            java.lang.String r2 = "net.ikea.skapa.ui.components.Toast (Toast.kt:66)"
            U0.C4895p.S(r0, r11, r1, r2)
        L_0x00d4:
            wK.Ia r0 = wK.Ia.f149642a
            r1 = 6
            wK.Ja r1 = r0.b(r15, r1)
            long r12 = r1.a()
            A0.f r10 = r1.f()
            n0.g r17 = r1.b()
            wK.Ga$a r9 = new wK.Ga$a
            r0 = r9
            r2 = r25
            r3 = r27
            r4 = r23
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r0 = 54
            r1 = 1529063097(0x5b23a6b9, float:4.6063735E16)
            r2 = 1
            c1.a r18 = c1.c.e(r1, r2, r9, r15, r0)
            int r0 = r11 >> 3
            r0 = r0 & 14
            r1 = 12582912(0xc00000, float:1.7632415E-38)
            r20 = r0 | r1
            r21 = 56
            r0 = 0
            r2 = 0
            r16 = 0
            r9 = r22
            r11 = r12
            r13 = r0
            r0 = r15
            r15 = r2
            r19 = r0
            O0.P0.a(r9, r10, r11, r13, r15, r16, r17, r18, r19, r20, r21)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0122
            U0.C4895p.R()
        L_0x0122:
            r2 = r22
            r4 = r23
            r5 = r24
        L_0x0128:
            U0.Y0 r9 = r0.n()
            if (r9 == 0) goto L_0x013f
            wK.Aa r10 = new wK.Aa
            r0 = r10
            r1 = r25
            r3 = r27
            r6 = r31
            r7 = r32
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x013f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.Ga.g(java.lang.String, androidx.compose.ui.d, wK.u2, java.lang.String, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(String str, d dVar, C18500u2 u2Var, String str2, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        g(str, dVar, u2Var, str2, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void i(androidx.compose.ui.d r30, java.lang.String r31, nI.C17631a<XH.C16807N> r32, U0.C4889m r33, int r34, int r35) {
        /*
            r3 = r32
            r4 = r34
            r0 = 4
            r1 = 6
            r2 = 1365404541(0x51626b7d, float:6.0779123E10)
            r5 = r33
            U0.m r5 = r5.k(r2)
            r6 = 1
            r7 = r35 & 1
            r8 = 2
            if (r7 == 0) goto L_0x001b
            r9 = r4 | 6
            r10 = r9
            r9 = r30
            goto L_0x002f
        L_0x001b:
            r9 = r4 & 6
            if (r9 != 0) goto L_0x002c
            r9 = r30
            boolean r10 = r5.V(r9)
            if (r10 == 0) goto L_0x0029
            r10 = r0
            goto L_0x002a
        L_0x0029:
            r10 = r8
        L_0x002a:
            r10 = r10 | r4
            goto L_0x002f
        L_0x002c:
            r9 = r30
            r10 = r4
        L_0x002f:
            r11 = r35 & 2
            if (r11 == 0) goto L_0x0038
            r10 = r10 | 48
            r14 = r31
            goto L_0x004a
        L_0x0038:
            r11 = r4 & 48
            r14 = r31
            if (r11 != 0) goto L_0x004a
            boolean r11 = r5.V(r14)
            if (r11 == 0) goto L_0x0047
            r11 = 32
            goto L_0x0049
        L_0x0047:
            r11 = 16
        L_0x0049:
            r10 = r10 | r11
        L_0x004a:
            r0 = r35 & 4
            r11 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0053
            r10 = r10 | 384(0x180, float:5.38E-43)
            goto L_0x0062
        L_0x0053:
            r0 = r4 & 384(0x180, float:5.38E-43)
            if (r0 != 0) goto L_0x0062
            boolean r0 = r5.F(r3)
            if (r0 == 0) goto L_0x005f
            r0 = r11
            goto L_0x0061
        L_0x005f:
            r0 = 128(0x80, float:1.794E-43)
        L_0x0061:
            r10 = r10 | r0
        L_0x0062:
            r0 = r10 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            if (r0 != r12) goto L_0x0075
            boolean r0 = r5.l()
            if (r0 != 0) goto L_0x006f
            goto L_0x0075
        L_0x006f:
            r5.L()
            r1 = r5
            goto L_0x01fc
        L_0x0075:
            if (r7 == 0) goto L_0x007a
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x007b
        L_0x007a:
            r0 = r9
        L_0x007b:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0087
            r7 = -1
            java.lang.String r9 = "net.ikea.skapa.ui.components.ToastActionButton (Toast.kt:275)"
            U0.C4895p.S(r2, r10, r7, r9)
        L_0x0087:
            wK.Ia r2 = wK.Ia.f149642a
            wK.Ja r7 = r2.b(r5, r1)
            r9 = -974574651(0xffffffffc5e92bc5, float:-7461.471)
            r5.W(r9)
            java.lang.Object r9 = r5.D()
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r13 = r12.a()
            if (r9 != r13) goto L_0x00a6
            r0.m r9 = r0.l.a()
            r5.u(r9)
        L_0x00a6:
            r0.m r9 = (r0.m) r9
            r5.P()
            U0.A1 r13 = r0.C5814f.a(r9, r5, r1)
            U0.A1 r15 = r0.p.a(r9, r5, r1)
            U0.A1 r1 = r0.i.a(r9, r5, r1)
            boolean r15 = m(r15)
            if (r15 != 0) goto L_0x00cd
            boolean r15 = j(r1)
            if (r15 == 0) goto L_0x00c4
            goto L_0x00cd
        L_0x00c4:
            Y1.k$a r15 = Y1.k.f14792b
            Y1.k r15 = r15.c()
        L_0x00ca:
            r26 = r15
            goto L_0x00d4
        L_0x00cd:
            Y1.k$a r15 = Y1.k.f14792b
            Y1.k r15 = r15.d()
            goto L_0x00ca
        L_0x00d4:
            L1.i$a r15 = L1.i.f8936b
            int r15 = r15.a()
            L1.i r20 = L1.i.h(r15)
            r15 = -974558001(0xffffffffc5e96ccf, float:-7469.601)
            r5.W(r15)
            r15 = r10 & 896(0x380, float:1.256E-42)
            r6 = 0
            if (r15 != r11) goto L_0x00eb
            r11 = 1
            goto L_0x00ec
        L_0x00eb:
            r11 = r6
        L_0x00ec:
            java.lang.Object r15 = r5.D()
            if (r11 != 0) goto L_0x00f8
            java.lang.Object r11 = r12.a()
            if (r15 != r11) goto L_0x0100
        L_0x00f8:
            wK.Ea r15 = new wK.Ea
            r15.<init>(r3)
            r5.u(r15)
        L_0x0100:
            r21 = r15
            nI.a r21 = (nI.C17631a) r21
            r5.P()
            r22 = 12
            r23 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r15 = r0
            r16 = r9
            androidx.compose.ui.d r9 = androidx.compose.foundation.d.b(r15, r16, r17, r18, r19, r20, r21, r22, r23)
            boolean r1 = j(r1)
            r11 = 0
            androidx.compose.ui.d r1 = zK.C18756a.j(r9, r1, r6, r8, r11)
            float r2 = r2.a()
            r8 = 0
            r9 = 1
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.b(r1, r8, r2, r9, r11)
            r2 = 3
            androidx.compose.ui.d r1 = zK.C18766k.b(r1, r8, r8, r2, r11)
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c r8 = r8.e()
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r6)
            int r9 = U0.C4883j.a(r5, r6)
            U0.y r11 = r5.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r5, r1)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r15 = r12.a()
            U0.f r16 = r5.m()
            if (r16 != 0) goto L_0x0155
            U0.C4883j.c()
        L_0x0155:
            r5.I()
            boolean r16 = r5.i()
            if (r16 == 0) goto L_0x0162
            r5.p(r15)
            goto L_0x0165
        L_0x0162:
            r5.t()
        L_0x0165:
            U0.m r15 = U0.F1.a(r5)
            nI.p r2 = r12.c()
            U0.F1.c(r15, r8, r2)
            nI.p r2 = r12.e()
            U0.F1.c(r15, r11, r2)
            nI.p r2 = r12.b()
            boolean r8 = r15.i()
            if (r8 != 0) goto L_0x018f
            java.lang.Object r8 = r15.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x019d
        L_0x018f:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r15.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
            r15.w(r8, r2)
        L_0x019d:
            nI.p r2 = r12.d()
            U0.F1.c(r15, r1, r2)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
            float r1 = (float) r6
            float r1 = c2.h.B(r1)
            A0.f r18 = A0.g.e(r1)
            zK.g r19 = zK.C18762g.StaticInverse
            r23 = 112(0x70, float:1.57E-43)
            r24 = 0
            r17 = 1
            r20 = 0
            r21 = 0
            r22 = 0
            r16 = r13
            androidx.compose.ui.d r6 = zK.C18756a.b(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            N1.Y r25 = r7.c()
            r1 = 3
            int r1 = r10 >> 3
            r27 = r1 & 14
            r28 = 0
            r29 = 65276(0xfefc, float:9.1471E-41)
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r1 = 0
            r14 = r1
            r17 = 0
            r18 = 0
            r22 = 0
            r23 = 0
            r1 = r5
            r5 = r31
            r16 = r26
            r26 = r1
            O0.d1.b(r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r1.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01fb
            U0.C4895p.R()
        L_0x01fb:
            r9 = r0
        L_0x01fc:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x0214
            wK.Fa r7 = new wK.Fa
            r0 = r7
            r1 = r9
            r2 = r31
            r3 = r32
            r4 = r34
            r5 = r35
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x0214:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.Ga.i(androidx.compose.ui.d, java.lang.String, nI.a, U0.m, int, int):void");
    }

    private static final boolean j(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C17631a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N l(d dVar, String str, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        i(dVar, str, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final boolean m(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v1, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(wK.Ja r40, java.lang.String r41, wK.C18500u2 r42, java.lang.String r43, nI.C17631a<XH.C16807N> r44, U0.C4889m r45, int r46) {
        /*
            r3 = r42
            r10 = r43
            r11 = r44
            r12 = r46
            r0 = 1245140457(0x4a3755e9, float:3003770.2)
            r1 = r45
            U0.m r1 = r1.k(r0)
            r2 = r12 & 6
            if (r2 != 0) goto L_0x0022
            r2 = r40
            boolean r4 = r1.V(r2)
            if (r4 == 0) goto L_0x001f
            r4 = 4
            goto L_0x0020
        L_0x001f:
            r4 = 2
        L_0x0020:
            r4 = r4 | r12
            goto L_0x0025
        L_0x0022:
            r2 = r40
            r4 = r12
        L_0x0025:
            r5 = r12 & 48
            r9 = r41
            if (r5 != 0) goto L_0x0037
            boolean r5 = r1.V(r9)
            if (r5 == 0) goto L_0x0034
            r5 = 32
            goto L_0x0036
        L_0x0034:
            r5 = 16
        L_0x0036:
            r4 = r4 | r5
        L_0x0037:
            r5 = r12 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x0047
            boolean r5 = r1.V(r3)
            if (r5 == 0) goto L_0x0044
            r5 = 256(0x100, float:3.59E-43)
            goto L_0x0046
        L_0x0044:
            r5 = 128(0x80, float:1.794E-43)
        L_0x0046:
            r4 = r4 | r5
        L_0x0047:
            r5 = r12 & 3072(0xc00, float:4.305E-42)
            if (r5 != 0) goto L_0x0057
            boolean r5 = r1.V(r10)
            if (r5 == 0) goto L_0x0054
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0056
        L_0x0054:
            r5 = 1024(0x400, float:1.435E-42)
        L_0x0056:
            r4 = r4 | r5
        L_0x0057:
            r5 = r12 & 24576(0x6000, float:3.4438E-41)
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r5 != 0) goto L_0x0068
            boolean r5 = r1.F(r11)
            if (r5 == 0) goto L_0x0065
            r5 = r6
            goto L_0x0067
        L_0x0065:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r4 = r4 | r5
        L_0x0068:
            r7 = r4
            r4 = r7 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r4 != r5) goto L_0x007b
            boolean r4 = r1.l()
            if (r4 != 0) goto L_0x0076
            goto L_0x007b
        L_0x0076:
            r1.L()
            goto L_0x01ef
        L_0x007b:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0087
            r4 = -1
            java.lang.String r5 = "net.ikea.skapa.ui.components.ToastLayout (Toast.kt:92)"
            U0.C4895p.S(r0, r7, r4, r5)
        L_0x0087:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r4 = 0
            r5 = 0
            r13 = 1
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.h(r0, r4, r13, r5)
            s0.E r5 = r40.g()
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.h(r4, r5)
            E1.I r5 = z()
            r15 = 0
            int r14 = U0.C4883j.a(r1, r15)
            U0.y r8 = r1.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r1, r4)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r13 = r16.a()
            U0.f r17 = r1.m()
            if (r17 != 0) goto L_0x00b8
            U0.C4883j.c()
        L_0x00b8:
            r1.I()
            boolean r17 = r1.i()
            if (r17 == 0) goto L_0x00c5
            r1.p(r13)
            goto L_0x00c8
        L_0x00c5:
            r1.t()
        L_0x00c8:
            U0.m r13 = U0.F1.a(r1)
            nI.p r15 = r16.c()
            U0.F1.c(r13, r5, r15)
            nI.p r5 = r16.e()
            U0.F1.c(r13, r8, r5)
            nI.p r5 = r16.b()
            boolean r8 = r13.i()
            if (r8 != 0) goto L_0x00f2
            java.lang.Object r8 = r13.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r15)
            if (r8 != 0) goto L_0x0100
        L_0x00f2:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r13.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r14)
            r13.w(r8, r5)
        L_0x0100:
            nI.p r5 = r16.d()
            U0.F1.c(r13, r4, r5)
            wK.za r4 = wK.za.Message
            androidx.compose.ui.d r14 = androidx.compose.ui.layout.a.b(r0, r4)
            long r15 = r40.d()
            r38 = 0
            N1.Y r33 = r40.e()
            int r4 = r7 >> 3
            r4 = r4 & 14
            r35 = r4 | 48
            r36 = 0
            r37 = 65528(0xfff8, float:9.1824E-41)
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r39 = 1
            r13 = r41
            r34 = r1
            O0.d1.b(r13, r14, r15, r17, r19, r20, r21, r22, r24, r25, r26, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r4 = 1130933154(0x4368aba2, float:232.67044)
            r1.W(r4)
            if (r10 != 0) goto L_0x0151
            r14 = r7
            r15 = 256(0x100, float:3.59E-43)
            goto L_0x0195
        L_0x0151:
            wK.za r4 = wK.za.Action
            androidx.compose.ui.d r4 = androidx.compose.ui.layout.a.b(r0, r4)
            r5 = -1146549955(0xffffffffbba9093d, float:-0.005158572)
            r1.W(r5)
            r5 = 57344(0xe000, float:8.0356E-41)
            r5 = r5 & r7
            if (r5 != r6) goto L_0x0166
            r13 = r39
            goto L_0x0168
        L_0x0166:
            r13 = r38
        L_0x0168:
            java.lang.Object r5 = r1.D()
            if (r13 != 0) goto L_0x0176
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x017e
        L_0x0176:
            wK.Ba r5 = new wK.Ba
            r5.<init>(r11)
            r1.u(r5)
        L_0x017e:
            r6 = r5
            nI.a r6 = (nI.C17631a) r6
            r1.P()
            int r5 = r7 >> 6
            r5 = r5 & 112(0x70, float:1.57E-43)
            r8 = r5 | 6
            r13 = 0
            r5 = r43
            r14 = r7
            r7 = r1
            r15 = 256(0x100, float:3.59E-43)
            r9 = r13
            i(r4, r5, r6, r7, r8, r9)
        L_0x0195:
            r1.P()
            int r13 = sK.C17950a.f147160i
            wK.za r4 = wK.za.Dismiss
            androidx.compose.ui.d r0 = androidx.compose.ui.layout.a.b(r0, r4)
            java.lang.String r4 = r42.a()
            wK.m3$g$b r17 = wK.C18405m3.g.b.f151255b
            wK.k3 r18 = wK.C18381k3.Small
            r5 = 1130951807(0x4368f47f, float:232.95506)
            r1.W(r5)
            r5 = r14 & 896(0x380, float:1.256E-42)
            if (r5 != r15) goto L_0x01b4
            r38 = r39
        L_0x01b4:
            java.lang.Object r5 = r1.D()
            if (r38 != 0) goto L_0x01c2
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x01ca
        L_0x01c2:
            wK.Ca r5 = new wK.Ca
            r5.<init>(r3)
            r1.u(r5)
        L_0x01ca:
            r21 = r5
            nI.a r21 = (nI.C17631a) r21
            r1.P()
            r23 = 221568(0x36180, float:3.10483E-40)
            r24 = 200(0xc8, float:2.8E-43)
            r16 = 0
            r19 = 0
            r20 = 0
            r14 = r4
            r15 = r0
            r22 = r1
            wK.C18357i3.c(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01ef
            U0.C4895p.R()
        L_0x01ef:
            U0.Y0 r7 = r1.n()
            if (r7 == 0) goto L_0x020a
            wK.Da r8 = new wK.Da
            r0 = r8
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x020a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.Ga.n(wK.Ja, java.lang.String, wK.u2, java.lang.String, nI.a, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17631a aVar) {
        if (aVar != null) {
            aVar.invoke();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C18500u2 u2Var) {
        u2Var.b().invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(Ja ja2, String str, C18500u2 u2Var, String str2, C17631a aVar, int i10, C4889m mVar, int i11) {
        n(ja2, str, u2Var, str2, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int v(boolean z10, a0 a0Var, int i10, int i11, int i12, a0 a0Var2, long j10) {
        return C17978n.e(z10 ? Math.max(a0Var.z() + i10 + i11, a0Var2.z()) : Math.max(a0Var.z() + i12, Math.max(i10 + i12, a0Var2.z() + i12)), C5267b.m(j10));
    }

    private static final C16795B<Integer, Integer, Integer> w(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (z10) {
            return new C16795B<>(Integer.valueOf(i10), Integer.valueOf(i12 + i10), Integer.valueOf(i16));
        }
        int i17 = (i14 - i11) / 2;
        return new C16795B<>(Integer.valueOf(i17 - (i12 / 2)), Integer.valueOf(i17 - (i15 / 2)), Integer.valueOf(i16));
    }

    static /* synthetic */ C16795B x(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, Object obj) {
        return w(z10, i10, i11, i12, i13, i14, i15, (i17 & 128) != 0 ? ((i14 - i11) / 2) - (i13 / 2) : i16);
    }

    /* access modifiers changed from: private */
    public static final boolean y(a0 a0Var, long j10) {
        return (a0Var != null ? a0Var.E0() : 0) > C5267b.l(j10) / 3;
    }

    private static final I z() {
        return b.f149545a;
    }
}
