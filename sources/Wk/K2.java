package wK;

import HJ.C15854t;
import J1.e;
import L1.i;
import L1.o;
import L1.v;
import L1.x;
import N1.E;
import N1.P;
import N1.Y;
import O0.V;
import O0.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.a;
import Y1.h;
import Y1.j;
import Y1.k;
import Y1.q;
import Y1.s;
import Y1.t;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.c;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.C5534c;
import nI.C17631a;
import nI.C17642l;
import o1.C5662b;
import o1.C5668h;
import o1.C5673m;
import o1.C5674n;
import p1.C5747v0;
import p1.C5749w0;
import p1.V0;
import p1.g1;
import r0.m;
import r1.f;
import r1.g;
import s0.C5842M;
import s0.C5844O;
import sK.C17950a;
import t1.C5942c;
import tK.C18014e;
import tK.C18029u;
import tK.C18030v;
import vK.C18205e;
import yK.C18744a;

@Metadata(d1 = {"\u0000X\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0001\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a=\u0010\u0018\u001a\u00020\u0005*\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u001d\u001a\u00020\u0005*\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001e\u001aU\u0010!\u001a\u00020\t*\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b!\u0010\"¨\u0006'²\u0006\f\u0010#\u001a\u00020\u00048\nX\u0002²\u0006\f\u0010$\u001a\u00020\u00048\nX\u0002²\u0006\f\u0010\u001c\u001a\u00020\u001b8\nX\u0002²\u0006\f\u0010&\u001a\u00020%8\nX\u0002"}, d2 = {"", "value", "label", "Lkotlin/Function1;", "", "LXH/N;", "onClick", "expanded", "onClickContentDescription", "Landroidx/compose/ui/d;", "modifier", "", "iconId", "helperText", "enabled", "selected", "active", "Lr0/m;", "interactionSource", "LwK/N;", "state", "q", "(Ljava/lang/String;Ljava/lang/String;LnI/l;ZLjava/lang/String;Landroidx/compose/ui/d;Ljava/lang/Integer;Ljava/lang/String;ZZZLr0/m;LwK/N;LU0/m;III)V", "Ls0/M;", "k", "(Ls0/M;ZLjava/lang/Integer;ZLjava/lang/String;ZLU0/m;I)V", "Lr1/f;", "Lp1/v0;", "borderColor", "y", "(Lr1/f;ZJ)V", "Lkotlin/Function0;", "hint", "z", "(Landroidx/compose/ui/d;ZLjava/lang/String;LnI/a;LwK/N;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/compose/ui/d;", "isSelectBoxFocused", "hover", "", "rotate", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class K2 {
    /* access modifiers changed from: private */
    public static final C16807N A(boolean z10, String str, C18245N n10, String str2, String str3, String str4, C17631a aVar, x xVar) {
        C17542s.j(xVar, "$this$clearAndSetSemantics");
        if (!z10) {
            v.l(xVar);
        }
        v.A(xVar, str, new J2(aVar));
        if (C18255Y.K(n10)) {
            v.d0(xVar, str2 + ", " + str3 + ".");
            if (str4 != null) {
                v.o(xVar, str4);
            }
        } else {
            if (str4 == null) {
                str4 = "";
            }
            v.d0(xVar, C15854t.B1(str2 + ", " + str3 + ". " + str4).toString());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean B(C17631a aVar) {
        aVar.invoke();
        return true;
    }

    private static final void k(C5842M m10, boolean z10, Integer num, boolean z11, String str, boolean z12, C4889m mVar, int i10) {
        int i11;
        A1<Float> a12;
        long K10;
        boolean z13 = z10;
        Integer num2 = num;
        boolean z14 = z11;
        boolean z15 = z12;
        int i12 = i10;
        C4889m k10 = mVar.k(-328020674);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(m10) ? 4 : 2) | i12;
        } else {
            C5842M m11 = m10;
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.b(z13) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(num2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.b(z14) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        String str2 = str;
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(str2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.b(z15) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        int i13 = i11;
        if ((74899 & i13) != 74898 || !k10.l()) {
            int i14 = -1;
            if (C4895p.J()) {
                C4895p.S(-328020674, i13, -1, "net.ikea.skapa.ui.components.DropdownBox (Dropdown.kt:169)");
            }
            if (!C18205e.f(k10, 0)) {
                i14 = 1;
            }
            float f10 = z13 ? ((float) i14) * 180.0f : 0.0f;
            L2 l22 = L2.f149761a;
            L2 l23 = l22;
            int i15 = i13;
            A1<Float> d10 = C5534c.d(f10, l22.b(), 0.0f, "Dropdown expand", (C17642l<? super Float, C16807N>) null, k10, 3072, 20);
            k10.W(-1672533908);
            if (num2 == null) {
                a12 = d10;
            } else {
                C5942c c10 = e.c(num.intValue(), k10, (i15 >> 6) & 14);
                k10.W(-1672530061);
                long i16 = z14 ? C5747v0.f27350b.i() : C18030v.f147664a.a(k10, C18030v.f147665b).K();
                k10.P();
                d.a aVar = d.f18749a;
                d t10 = J.t(aVar, C18744a.f());
                k10.W(2074515613);
                Object D10 = k10.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new E2();
                    k10.u(D10);
                }
                k10.P();
                a12 = d10;
                V.a(c10, (String) null, o.d(t10, false, (C17642l) D10, 1, (Object) null), i16, k10, 48, 0);
                C5844O.a(J.y(aVar, C18029u.f147649a.f()), k10, 0);
                C16807N n10 = C16807N.f139792a;
            }
            k10.P();
            C18030v vVar = C18030v.f147664a;
            int i17 = C18030v.f147665b;
            int i18 = i15 >> 12;
            Y c11 = Y.c(vVar.b(k10, i17).a().a(), l23.a(z14, z15, k10, ((i15 >> 9) & 14) | 384 | (i18 & 112)), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (a) null, (Y1.o) null, (U1.e) null, 0, (k) null, (g1) null, (g) null, 0, 0, 0, (q) null, (E) null, (h) null, 0, 0, (s) null, 16777214, (Object) null);
            int b10 = t.f14827a.b();
            d.a aVar2 = d.f18749a;
            d.a aVar3 = aVar2;
            int i19 = i17;
            C18030v vVar2 = vVar;
            d1.b(str, C5842M.e(m10, aVar2, 1.0f, false, 2, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, b10, false, 1, 0, (C17642l<? super P, C16807N>) null, c11, k10, i18 & 14, 3120, 55292);
            C5844O.a(J.y(aVar3, C18029u.f147649a.a()), k10, 0);
            C5942c c12 = e.c(C17950a.f147147I, k10, 0);
            if (z14) {
                k10.W(-1672506731);
                K10 = vVar2.a(k10, i19).G0();
            } else {
                k10.W(-1672505571);
                K10 = vVar2.a(k10, i19).K();
            }
            k10.P();
            long j10 = K10;
            d t11 = J.t(aVar3, C18744a.f());
            k10.W(-1672502333);
            Object D11 = k10.D();
            C4889m.a aVar4 = C4889m.f14007a;
            if (D11 == aVar4.a()) {
                D11 = new F2();
                k10.u(D11);
            }
            k10.P();
            d d11 = o.d(t11, false, (C17642l) D11, 1, (Object) null);
            k10.W(-1672500609);
            A1<Float> a13 = a12;
            boolean V10 = k10.V(a13);
            Object D12 = k10.D();
            if (V10 || D12 == aVar4.a()) {
                D12 = new G2(a13);
                k10.u(D12);
            }
            k10.P();
            V.a(c12, (String) null, b.a(d11, (C17642l) D12), j10, k10, 48, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new H2(m10, z10, num, z11, str, z12, i10));
        }
    }

    private static final float l(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N m(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.l0(xVar, i.f8936b.d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.l0(xVar, i.f8936b.d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(A1 a12, c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.l(l(a12));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C5842M m10, boolean z10, Integer num, boolean z11, String str, boolean z12, int i10, C4889m mVar, int i11) {
        k(m10, z10, num, z11, str, z12, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: nI.a} */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0285, code lost:
        if (r11 == U0.C4889m.f14007a.a()) goto L_0x028a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01ce  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x058f  */
    /* JADX WARNING: Removed duplicated region for block: B:256:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void q(java.lang.String r57, java.lang.String r58, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r59, boolean r60, java.lang.String r61, androidx.compose.ui.d r62, java.lang.Integer r63, java.lang.String r64, boolean r65, boolean r66, boolean r67, r0.m r68, wK.C18245N r69, U0.C4889m r70, int r71, int r72, int r73) {
        /*
            r1 = r57
            r0 = r58
            r4 = r59
            r5 = r71
            r2 = r72
            r15 = r73
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            r14 = 256(0x100, float:3.59E-43)
            r9 = 128(0x80, float:1.794E-43)
            r10 = 32
            r11 = 16
            r13 = 48
            r27 = 6
            java.lang.String r12 = "value"
            kotlin.jvm.internal.C17542s.j(r1, r12)
            java.lang.String r12 = "label"
            kotlin.jvm.internal.C17542s.j(r0, r12)
            java.lang.String r12 = "onClick"
            kotlin.jvm.internal.C17542s.j(r4, r12)
            r12 = -1567496290(0xffffffffa291e79e, float:-3.9547563E-18)
            r8 = r70
            U0.m r8 = r8.k(r12)
            r12 = 1
            r18 = r15 & 1
            r12 = 2
            r7 = 4
            if (r18 == 0) goto L_0x003c
            r18 = r5 | 6
            goto L_0x0050
        L_0x003c:
            r18 = r5 & 6
            if (r18 != 0) goto L_0x004e
            boolean r18 = r8.V(r1)
            if (r18 == 0) goto L_0x0049
            r18 = r7
            goto L_0x004b
        L_0x0049:
            r18 = r12
        L_0x004b:
            r18 = r5 | r18
            goto L_0x0050
        L_0x004e:
            r18 = r5
        L_0x0050:
            r20 = r15 & 2
            if (r20 == 0) goto L_0x0059
            r18 = r18 | 48
        L_0x0056:
            r12 = r18
            goto L_0x006b
        L_0x0059:
            r20 = r5 & 48
            if (r20 != 0) goto L_0x0056
            boolean r20 = r8.V(r0)
            if (r20 == 0) goto L_0x0066
            r20 = r10
            goto L_0x0068
        L_0x0066:
            r20 = r11
        L_0x0068:
            r18 = r18 | r20
            goto L_0x0056
        L_0x006b:
            r18 = r15 & 4
            if (r18 == 0) goto L_0x0072
            r12 = r12 | 384(0x180, float:5.38E-43)
            goto L_0x0080
        L_0x0072:
            r7 = r5 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0080
            boolean r7 = r8.F(r4)
            if (r7 == 0) goto L_0x007e
            r7 = r14
            goto L_0x007f
        L_0x007e:
            r7 = r9
        L_0x007f:
            r12 = r12 | r7
        L_0x0080:
            r7 = r15 & 8
            if (r7 == 0) goto L_0x0089
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0086:
            r7 = r60
            goto L_0x009c
        L_0x0089:
            r7 = r5 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x0086
            r7 = r60
            boolean r21 = r8.b(r7)
            if (r21 == 0) goto L_0x0098
            r21 = 2048(0x800, float:2.87E-42)
            goto L_0x009a
        L_0x0098:
            r21 = 1024(0x400, float:1.435E-42)
        L_0x009a:
            r12 = r12 | r21
        L_0x009c:
            r21 = r15 & 16
            if (r21 == 0) goto L_0x00a5
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x00a2:
            r11 = r61
            goto L_0x00b8
        L_0x00a5:
            r11 = r5 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L_0x00a2
            r11 = r61
            boolean r22 = r8.V(r11)
            if (r22 == 0) goto L_0x00b4
            r22 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00b6
        L_0x00b4:
            r22 = 8192(0x2000, float:1.14794E-41)
        L_0x00b6:
            r12 = r12 | r22
        L_0x00b8:
            r22 = r15 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r22 == 0) goto L_0x00c3
            r12 = r12 | r23
            r10 = r62
            goto L_0x00d6
        L_0x00c3:
            r23 = r5 & r23
            r10 = r62
            if (r23 != 0) goto L_0x00d6
            boolean r24 = r8.V(r10)
            if (r24 == 0) goto L_0x00d2
            r24 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00d4
        L_0x00d2:
            r24 = 65536(0x10000, float:9.18355E-41)
        L_0x00d4:
            r12 = r12 | r24
        L_0x00d6:
            r24 = r15 & 64
            r25 = 1572864(0x180000, float:2.204052E-39)
            if (r24 == 0) goto L_0x00e1
            r12 = r12 | r25
            r13 = r63
            goto L_0x00f4
        L_0x00e1:
            r25 = r5 & r25
            r13 = r63
            if (r25 != 0) goto L_0x00f4
            boolean r25 = r8.V(r13)
            if (r25 == 0) goto L_0x00f0
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00f2
        L_0x00f0:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00f2:
            r12 = r12 | r25
        L_0x00f4:
            r3 = r15 & 128(0x80, float:1.794E-43)
            r26 = 12582912(0xc00000, float:1.7632415E-38)
            if (r3 == 0) goto L_0x00ff
            r12 = r12 | r26
            r9 = r64
            goto L_0x0112
        L_0x00ff:
            r26 = r5 & r26
            r9 = r64
            if (r26 != 0) goto L_0x0112
            boolean r29 = r8.V(r9)
            if (r29 == 0) goto L_0x010e
            r29 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x0110
        L_0x010e:
            r29 = 4194304(0x400000, float:5.877472E-39)
        L_0x0110:
            r12 = r12 | r29
        L_0x0112:
            r0 = r15 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x011a
            r12 = r12 | r6
        L_0x0117:
            r6 = r65
            goto L_0x012c
        L_0x011a:
            r6 = r6 & r5
            if (r6 != 0) goto L_0x0117
            r6 = r65
            boolean r29 = r8.b(r6)
            if (r29 == 0) goto L_0x0128
            r29 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x012a
        L_0x0128:
            r29 = 33554432(0x2000000, float:9.403955E-38)
        L_0x012a:
            r12 = r12 | r29
        L_0x012c:
            r14 = r15 & 512(0x200, float:7.175E-43)
            r25 = 805306368(0x30000000, float:4.656613E-10)
            if (r14 == 0) goto L_0x0137
        L_0x0132:
            r12 = r12 | r25
        L_0x0134:
            r1 = 1024(0x400, float:1.435E-42)
            goto L_0x0149
        L_0x0137:
            r25 = r5 & r25
            r1 = r66
            if (r25 != 0) goto L_0x0134
            boolean r25 = r8.b(r1)
            if (r25 == 0) goto L_0x0146
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0132
        L_0x0146:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x0132
        L_0x0149:
            r1 = r1 & r15
            if (r1 == 0) goto L_0x0151
            r19 = r2 | 6
        L_0x014e:
            r5 = 2048(0x800, float:2.87E-42)
            goto L_0x0168
        L_0x0151:
            r19 = r2 & 6
            r5 = r67
            if (r19 != 0) goto L_0x0165
            boolean r19 = r8.b(r5)
            if (r19 == 0) goto L_0x0160
            r19 = 4
            goto L_0x0162
        L_0x0160:
            r19 = 2
        L_0x0162:
            r19 = r2 | r19
            goto L_0x014e
        L_0x0165:
            r19 = r2
            goto L_0x014e
        L_0x0168:
            r5 = r5 & r15
            r16 = 48
            if (r5 == 0) goto L_0x0172
            r19 = r19 | 48
        L_0x016f:
            r6 = r19
            goto L_0x0186
        L_0x0172:
            r25 = r2 & 48
            r6 = r68
            if (r25 != 0) goto L_0x016f
            boolean r16 = r8.V(r6)
            if (r16 == 0) goto L_0x0181
            r21 = 32
            goto L_0x0183
        L_0x0181:
            r21 = 16
        L_0x0183:
            r19 = r19 | r21
            goto L_0x016f
        L_0x0186:
            r7 = r15 & 4096(0x1000, float:5.74E-42)
            if (r7 == 0) goto L_0x018f
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x018c:
            r9 = r69
            goto L_0x01a2
        L_0x018f:
            r9 = r2 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x018c
            r9 = r69
            boolean r16 = r8.V(r9)
            if (r16 == 0) goto L_0x019e
            r26 = 256(0x100, float:3.59E-43)
            goto L_0x01a0
        L_0x019e:
            r26 = 128(0x80, float:1.794E-43)
        L_0x01a0:
            r6 = r6 | r26
        L_0x01a2:
            r16 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r12 & r16
            r9 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r9) goto L_0x01ce
            r2 = r6 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r2 != r9) goto L_0x01ce
            boolean r2 = r8.l()
            if (r2 != 0) goto L_0x01b9
            goto L_0x01ce
        L_0x01b9:
            r8.L()
            r9 = r65
            r11 = r67
            r12 = r68
            r49 = r69
            r7 = r4
            r6 = r8
            r50 = r10
            r8 = r64
            r10 = r66
            goto L_0x0589
        L_0x01ce:
            if (r22 == 0) goto L_0x01d3
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x01d4
        L_0x01d3:
            r2 = r10
        L_0x01d4:
            if (r24 == 0) goto L_0x01d9
            r30 = 0
            goto L_0x01db
        L_0x01d9:
            r30 = r13
        L_0x01db:
            if (r3 == 0) goto L_0x01e0
            r31 = 0
            goto L_0x01e2
        L_0x01e0:
            r31 = r64
        L_0x01e2:
            if (r0 == 0) goto L_0x01e6
            r0 = 1
            goto L_0x01e8
        L_0x01e6:
            r0 = r65
        L_0x01e8:
            if (r14 == 0) goto L_0x01ed
            r41 = 0
            goto L_0x01ef
        L_0x01ed:
            r41 = r66
        L_0x01ef:
            if (r1 == 0) goto L_0x01f3
            r1 = 0
            goto L_0x01f5
        L_0x01f3:
            r1 = r67
        L_0x01f5:
            if (r5 == 0) goto L_0x0217
            r3 = 1658944915(0x62e17d93, float:2.079783E21)
            r8.W(r3)
            java.lang.Object r3 = r8.D()
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r3 != r5) goto L_0x0210
            r0.m r3 = r0.l.a()
            r8.u(r3)
        L_0x0210:
            r0.m r3 = (r0.m) r3
            r8.P()
            r5 = r3
            goto L_0x0219
        L_0x0217:
            r5 = r68
        L_0x0219:
            if (r7 == 0) goto L_0x021f
            wK.N r3 = wK.C18245N.Default
            r14 = r3
            goto L_0x0221
        L_0x021f:
            r14 = r69
        L_0x0221:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x022f
            java.lang.String r3 = "net.ikea.skapa.ui.components.DropdownLayout (Dropdown.kt:116)"
            r7 = -1567496290(0xffffffffa291e79e, float:-3.9547563E-18)
            U0.C4895p.S(r7, r12, r6, r3)
        L_0x022f:
            int r3 = r6 >> 3
            r3 = r3 & 14
            U0.A1 r9 = r0.C5814f.a(r5, r8, r3)
            U0.A1 r32 = r0.i.a(r5, r8, r3)
            if (r0 == 0) goto L_0x0240
            wK.M2 r3 = wK.M2.Enabled
            goto L_0x0242
        L_0x0240:
            wK.M2 r3 = wK.M2.Disabled
        L_0x0242:
            boolean r7 = u(r9)
            if (r7 != 0) goto L_0x024d
            if (r1 == 0) goto L_0x024b
            goto L_0x024d
        L_0x024b:
            r7 = 0
            goto L_0x024e
        L_0x024d:
            r7 = 1
        L_0x024e:
            r10 = r6 & 896(0x380, float:1.256E-42)
            U0.A1 r10 = wK.C18255Y.F(r3, r7, r14, r8, r10)
            i1.c$a r42 = i1.C5437c.f24302a
            i1.c$b r3 = r42.k()
            s0.z r7 = s0.C5880z.Max
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.x.b(r2, r7)
            s0.z r13 = s0.C5880z.Min
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.x.a(r7, r13)
            r13 = 1658966749(0x62e1d2dd, float:2.0828559E21)
            r8.W(r13)
            r13 = r12 & 896(0x380, float:1.256E-42)
            r11 = 256(0x100, float:3.59E-43)
            if (r13 != r11) goto L_0x0275
            r19 = 1
            goto L_0x0277
        L_0x0275:
            r19 = 0
        L_0x0277:
            java.lang.Object r11 = r8.D()
            if (r19 != 0) goto L_0x0288
            U0.m$a r19 = U0.C4889m.f14007a
            r22 = r2
            java.lang.Object r2 = r19.a()
            if (r11 != r2) goto L_0x0292
            goto L_0x028a
        L_0x0288:
            r22 = r2
        L_0x028a:
            wK.A2 r11 = new wK.A2
            r11.<init>(r4)
            r8.u(r11)
        L_0x0292:
            r2 = r11
            nI.a r2 = (nI.C17631a) r2
            r8.P()
            r62 = r7
            r63 = r0
            r64 = r61
            r65 = r2
            r66 = r14
            r67 = r58
            r68 = r57
            r69 = r31
            androidx.compose.ui.d r2 = z(r62, r63, r64, r65, r66, r67, r68, r69)
            androidx.compose.foundation.layout.d r43 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r43.g()
            r11 = 48
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r7, r3, r8, r11)
            r11 = 0
            int r7 = U0.C4883j.a(r8, r11)
            U0.y r11 = r8.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r8, r2)
            G1.g$a r44 = G1.C4504g.f6515W
            nI.a r4 = r44.a()
            U0.f r19 = r8.m()
            if (r19 != 0) goto L_0x02d4
            U0.C4883j.c()
        L_0x02d4:
            r8.I()
            boolean r19 = r8.i()
            if (r19 == 0) goto L_0x02e1
            r8.p(r4)
            goto L_0x02e4
        L_0x02e1:
            r8.t()
        L_0x02e4:
            U0.m r4 = U0.F1.a(r8)
            r23 = r5
            nI.p r5 = r44.c()
            U0.F1.c(r4, r3, r5)
            nI.p r3 = r44.e()
            U0.F1.c(r4, r11, r3)
            nI.p r3 = r44.b()
            boolean r5 = r4.i()
            if (r5 != 0) goto L_0x0310
            java.lang.Object r5 = r4.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r11)
            if (r5 != 0) goto L_0x031e
        L_0x0310:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)
            r4.w(r5, r3)
        L_0x031e:
            nI.p r3 = r44.d()
            U0.F1.c(r4, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            tK.v r4 = tK.C18030v.f147664a
            int r5 = tK.C18030v.f147665b
            tK.w r2 = r4.b(r8, r5)
            tK.c r2 = r2.a()
            N1.Y r33 = r2.b()
            if (r0 == 0) goto L_0x034d
            r2 = -579380169(0xffffffffdd775c37, float:-1.11401137E18)
            r8.W(r2)
            tK.h r2 = r4.a(r8, r5)
            long r2 = r2.H0()
        L_0x0347:
            r8.P()
            r34 = r2
            goto L_0x035c
        L_0x034d:
            r2 = -579379009(0xffffffffdd7760bf, float:-1.11409108E18)
            r8.W(r2)
            tK.h r2 = r4.a(r8, r5)
            long r2 = r2.K()
            goto L_0x0347
        L_0x035c:
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = 2
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            r7 = 7
            r11 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r62 = r2
            r63 = r19
            r64 = r20
            r65 = r21
            r66 = r3
            r67 = r7
            r68 = r11
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r62, r63, r64, r65, r66, r67, r68)
            int r7 = r12 >> 3
            r7 = r7 & 14
            r19 = 48
            r24 = r7 | 48
            r25 = 0
            r26 = 65528(0xfff8, float:9.1824E-41)
            r20 = 0
            r28 = r6
            r11 = 4
            r6 = r20
            r18 = 0
            r45 = r8
            r8 = r18
            r46 = r9
            r9 = r18
            r47 = r10
            r10 = r18
            r29 = r12
            r16 = 0
            r17 = 256(0x100, float:3.59E-43)
            r11 = r20
            r48 = r13
            r13 = r18
            r16 = 0
            r49 = r14
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r51 = r2
            r50 = r22
            r2 = r58
            r53 = r4
            r54 = r5
            r52 = r23
            r4 = r34
            r22 = r33
            r23 = r45
            O0.d1.b(r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            tK.u r2 = tK.C18029u.f147649a
            float r3 = r2.h()
            r4 = r51
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r4, r3)
            r5 = r52
            androidx.compose.ui.d r3 = androidx.compose.foundation.FocusableKt.b(r3, r0, r5)
            boolean r6 = v(r32)
            androidx.compose.ui.d r32 = zK.C18756a.i(r3, r6, r0)
            r3 = -579362976(0xffffffffdd779f60, float:-1.11519286E18)
            r6 = r45
            r6.W(r3)
            r3 = r48
            r7 = 256(0x100, float:3.59E-43)
            if (r3 != r7) goto L_0x03ff
            r12 = 1
            goto L_0x0400
        L_0x03ff:
            r12 = 0
        L_0x0400:
            java.lang.Object r3 = r6.D()
            if (r12 != 0) goto L_0x0412
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r3 != r7) goto L_0x040f
            goto L_0x0412
        L_0x040f:
            r7 = r59
            goto L_0x041c
        L_0x0412:
            wK.B2 r3 = new wK.B2
            r7 = r59
            r3.<init>(r7)
            r6.u(r3)
        L_0x041c:
            r38 = r3
            nI.a r38 = (nI.C17631a) r38
            r6.P()
            r39 = 24
            r40 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            r33 = r5
            r35 = r0
            androidx.compose.ui.d r3 = androidx.compose.foundation.d.b(r32, r33, r34, r35, r36, r37, r38, r39, r40)
            r8 = r53
            r9 = r54
            tK.h r8 = r8.a(r6, r9)
            long r8 = r8.k0()
            tK.d r10 = tK.C18013d.f147437a
            A0.f r10 = r10.e()
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.c(r3, r8, r10)
            r8 = -579356875(0xffffffffdd77b735, float:-1.11561212E18)
            r6.W(r8)
            r8 = r46
            boolean r9 = r6.V(r8)
            r10 = r28 & 14
            r11 = 4
            if (r10 != r11) goto L_0x045e
            r12 = 1
            goto L_0x045f
        L_0x045e:
            r12 = 0
        L_0x045f:
            r9 = r9 | r12
            r10 = r47
            boolean r11 = r6.V(r10)
            r9 = r9 | r11
            java.lang.Object r11 = r6.D()
            if (r9 != 0) goto L_0x0475
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r11 != r9) goto L_0x047d
        L_0x0475:
            wK.C2 r11 = new wK.C2
            r11.<init>(r1, r8, r10)
            r6.u(r11)
        L_0x047d:
            nI.l r11 = (nI.C17642l) r11
            r6.P()
            androidx.compose.ui.d r3 = androidx.compose.ui.draw.b.b(r3, r11)
            float r8 = r2.j()
            float r9 = r2.f()
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.j(r3, r8, r9)
            r8 = 0
            r9 = 1
            r10 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.h(r3, r8, r9, r10)
            i1.c$c r8 = r42.i()
            androidx.compose.foundation.layout.d$e r9 = r43.f()
            r10 = 48
            E1.I r8 = androidx.compose.foundation.layout.G.b(r9, r8, r6, r10)
            r9 = 0
            int r10 = U0.C4883j.a(r6, r9)
            U0.y r11 = r6.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r6, r3)
            nI.a r12 = r44.a()
            U0.f r13 = r6.m()
            if (r13 != 0) goto L_0x04c1
            U0.C4883j.c()
        L_0x04c1:
            r6.I()
            boolean r13 = r6.i()
            if (r13 == 0) goto L_0x04ce
            r6.p(r12)
            goto L_0x04d1
        L_0x04ce:
            r6.t()
        L_0x04d1:
            U0.m r12 = U0.F1.a(r6)
            nI.p r13 = r44.c()
            U0.F1.c(r12, r8, r13)
            nI.p r8 = r44.e()
            U0.F1.c(r12, r11, r8)
            nI.p r8 = r44.b()
            boolean r11 = r12.i()
            if (r11 != 0) goto L_0x04fb
            java.lang.Object r11 = r12.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r13)
            if (r11 != 0) goto L_0x0509
        L_0x04fb:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r12.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r12.w(r10, r8)
        L_0x0509:
            nI.p r8 = r44.d()
            U0.F1.c(r12, r3, r8)
            s0.N r3 = s0.C5843N.f28726a
            int r8 = r29 >> 6
            r8 = r8 & 112(0x70, float:1.57E-43)
            r8 = r27 | r8
            int r10 = r29 >> 12
            r11 = r10 & 896(0x380, float:1.256E-42)
            r8 = r8 | r11
            int r11 = r29 >> 15
            r11 = r11 & 7168(0x1c00, float:1.0045E-41)
            r8 = r8 | r11
            int r11 = r29 << 12
            r12 = 57344(0xe000, float:8.0356E-41)
            r11 = r11 & r12
            r8 = r8 | r11
            r11 = 458752(0x70000, float:6.42848E-40)
            r10 = r10 & r11
            r8 = r8 | r10
            r62 = r3
            r63 = r60
            r64 = r30
            r65 = r0
            r66 = r57
            r67 = r41
            r68 = r6
            r69 = r8
            k(r62, r63, r64, r65, r66, r67, r68, r69)
            r6.x()
            r3 = -579344333(0xffffffffdd77e833, float:-1.116474E18)
            r6.W(r3)
            if (r0 == 0) goto L_0x0571
            float r2 = r2.f()
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.i(r4, r2)
            s0.C5844O.a(r2, r6, r9)
            if (r31 != 0) goto L_0x0559
            goto L_0x0571
        L_0x0559:
            wK.Z2 r2 = wK.C18255Y.O(r49)
            r3 = 0
            r4 = 4
            r8 = 0
            r62 = r31
            r63 = r2
            r64 = r8
            r65 = r6
            r66 = r3
            r67 = r4
            wK.W2.l(r62, r63, r64, r65, r66, r67)
            XH.N r2 = XH.C16807N.f139792a
        L_0x0571:
            r6.P()
            r6.x()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0580
            U0.C4895p.R()
        L_0x0580:
            r9 = r0
            r11 = r1
            r12 = r5
            r13 = r30
            r8 = r31
            r10 = r41
        L_0x0589:
            U0.Y0 r15 = r6.n()
            if (r15 == 0) goto L_0x05b5
            wK.D2 r14 = new wK.D2
            r0 = r14
            r1 = r57
            r2 = r58
            r3 = r59
            r4 = r60
            r5 = r61
            r6 = r50
            r7 = r13
            r13 = r49
            r55 = r14
            r14 = r71
            r56 = r15
            r15 = r72
            r16 = r73
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r55
            r0 = r56
            r0.a(r1)
        L_0x05b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wK.K2.q(java.lang.String, java.lang.String, nI.l, boolean, java.lang.String, androidx.compose.ui.d, java.lang.Integer, java.lang.String, boolean, boolean, boolean, r0.m, wK.N, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(boolean z10, A1 a12, A1 a13, f fVar) {
        C17542s.j(fVar, "$this$drawBehind");
        y(fVar, u(a12) || z10, w(a13));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(C17642l lVar) {
        lVar.invoke(Boolean.TRUE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t(String str, String str2, C17642l lVar, boolean z10, String str3, d dVar, Integer num, String str4, boolean z11, boolean z12, boolean z13, m mVar, C18245N n10, int i10, int i11, int i12, C4889m mVar2, int i13) {
        q(str, str2, lVar, z10, str3, dVar, num, str4, z11, z12, z13, mVar, n10, mVar2, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    private static final boolean u(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean v(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final long w(A1<C5747v0> a12) {
        return a12.getValue().y();
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C17642l lVar) {
        lVar.invoke(Boolean.TRUE);
        return C16807N.f139792a;
    }

    private static final void y(f fVar, boolean z10, long j10) {
        f fVar2 = fVar;
        C18014e eVar = C18014e.f147445a;
        float ceil = (float) Math.ceil((double) fVar2.H1(z10 ? eVar.a() : eVar.b()));
        float f10 = ceil / ((float) 2);
        f.L1(fVar, j10, C5668h.a(f10, f10), C5674n.a(C5673m.l(fVar.b()) - ceil, C5673m.i(fVar.b()) - ceil), C5662b.b(fVar2.H1(c2.h.B((float) 4)), 0.0f, 2, (Object) null), new r1.k(ceil, 0.0f, 0, 0, (V0) null, 30, (DefaultConstructorMarker) null), 0.0f, (C5749w0) null, 0, 224, (Object) null);
    }

    public static final d z(d dVar, boolean z10, String str, C17631a<C16807N> aVar, C18245N n10, String str2, String str3, String str4) {
        d dVar2 = dVar;
        C17542s.j(dVar, "<this>");
        C17542s.j(aVar, "onClick");
        C18245N n11 = n10;
        C17542s.j(n10, "state");
        String str5 = str2;
        C17542s.j(str2, "label");
        String str6 = str3;
        C17542s.j(str6, "hint");
        return o.a(dVar, new I2(z10, str, n11, str5, str6, str4, aVar));
    }
}
