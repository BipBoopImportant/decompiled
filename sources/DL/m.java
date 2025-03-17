package Dl;

import KJ.C15987c;
import L1.v;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c2.h;
import gs.e;
import gs.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.r;
import t0.C5938c;
import t0.x;
import uK.C18146a;
import ul.C12064a;
import ul.C12065b;
import ul.c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\u001a=\u0010\b\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001aE\u0010\u000f\u001a\u00020\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017²\u0006\u000e\u0010\u0016\u001a\u00020\u00158\n@\nX\u0002"}, d2 = {"LKJ/c;", "LDl/b;", "thumbnails", "Lkotlin/Function1;", "LXH/N;", "onThumbnailClicked", "Landroidx/compose/ui/d;", "modifier", "k", "(LKJ/c;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "Lc2/h;", "thumbnailSize", "thumbnailSpacing", "LDl/n;", "style", "n", "(LKJ/c;Landroidx/compose/ui/d;FFLDl/n;LU0/m;II)V", "item", "onClick", "v", "(LDl/b;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "", "fullWidth", "uicomposables_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class a extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f79817c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l f79818d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(List list, C17642l lVar) {
            super(4);
            this.f79817c = list;
            this.f79818d = lVar;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (mVar.V(cVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i12 & 147) != 146 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-632812321, i12, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                mVar.W(2072574593);
                m.v((b) this.f79817c.get(i10), this.f79818d, J.t(d.f18749a, h.B((float) 66)), mVar, 384, 0);
                mVar.P();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(KJ.C15987c<Dl.b> r18, nI.C17642l<? super Dl.b, XH.C16807N> r19, androidx.compose.ui.d r20, U0.C4889m r21, int r22, int r23) {
        /*
            r1 = r18
            r2 = r19
            r4 = r22
            java.lang.String r0 = "thumbnails"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            r0 = -759503670(0xffffffffd2bae4ca, float:-4.0135118E11)
            r3 = r21
            U0.m r3 = r3.k(r0)
            r5 = r23 & 1
            r6 = 4
            if (r5 == 0) goto L_0x001c
            r5 = r4 | 6
            goto L_0x002c
        L_0x001c:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x002b
            boolean r5 = r3.V(r1)
            if (r5 == 0) goto L_0x0028
            r5 = r6
            goto L_0x0029
        L_0x0028:
            r5 = 2
        L_0x0029:
            r5 = r5 | r4
            goto L_0x002c
        L_0x002b:
            r5 = r4
        L_0x002c:
            r7 = r23 & 2
            r8 = 32
            if (r7 == 0) goto L_0x0035
            r5 = r5 | 48
            goto L_0x0044
        L_0x0035:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0044
            boolean r7 = r3.F(r2)
            if (r7 == 0) goto L_0x0041
            r7 = r8
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r5 = r5 | r7
        L_0x0044:
            r7 = r23 & 4
            if (r7 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r20
            goto L_0x005f
        L_0x004d:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r20
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r10
        L_0x005f:
            r10 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0071
            boolean r10 = r3.l()
            if (r10 != 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r3.L()
            goto L_0x00f2
        L_0x0071:
            if (r7 == 0) goto L_0x0077
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x0078
        L_0x0077:
            r15 = r9
        L_0x0078:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0084
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.app.uicomposables.views.HorizontalImageContent (HorizontalImageContent.kt:68)"
            U0.C4895p.S(r0, r5, r7, r9)
        L_0x0084:
            r0 = 0
            r7 = 0
            r9 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r15, r0, r9, r7)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            r10 = 8
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            androidx.compose.foundation.layout.d$f r10 = r7.n(r10)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r11 = r7.i()
            r7 = -1447725378(0xffffffffa9b576be, float:-8.058613E-14)
            r3.W(r7)
            r7 = r5 & 14
            r12 = 0
            if (r7 != r6) goto L_0x00ab
            r6 = r9
            goto L_0x00ac
        L_0x00ab:
            r6 = r12
        L_0x00ac:
            r5 = r5 & 112(0x70, float:1.57E-43)
            if (r5 != r8) goto L_0x00b1
            goto L_0x00b2
        L_0x00b1:
            r9 = r12
        L_0x00b2:
            r5 = r6 | r9
            java.lang.Object r6 = r3.D()
            if (r5 != 0) goto L_0x00c2
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00ca
        L_0x00c2:
            Dl.h r6 = new Dl.h
            r6.<init>(r1, r2)
            r3.u(r6)
        L_0x00ca:
            r13 = r6
            nI.l r13 = (nI.C17642l) r13
            r3.P()
            r16 = 221184(0x36000, float:3.09945E-40)
            r17 = 206(0xce, float:2.89E-43)
            r6 = 0
            r7 = 0
            r8 = 0
            r12 = 0
            r14 = 0
            r5 = r0
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r14
            r14 = r3
            r0 = r15
            r15 = r16
            r16 = r17
            t0.C5937b.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00f1
            U0.C4895p.R()
        L_0x00f1:
            r9 = r0
        L_0x00f2:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x010a
            Dl.i r7 = new Dl.i
            r0 = r7
            r1 = r18
            r2 = r19
            r3 = r9
            r4 = r22
            r5 = r23
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dl.m.k(KJ.c, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(C15987c cVar, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyRow");
        c cVar2 = c.f103844a;
        xVar.e(cVar.size(), new C12064a(new ul.d("HorizontalImageContent"), cVar), new C12065b(cVar2, cVar), c1.c.c(-632812321, true, new a(cVar, lVar)));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C15987c cVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        k(cVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x040b  */
    /* JADX WARNING: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(KJ.C15987c<Dl.b> r34, androidx.compose.ui.d r35, float r36, float r37, Dl.n r38, U0.C4889m r39, int r40, int r41) {
        /*
            r1 = r34
            r6 = r40
            r0 = 8
            r2 = 16
            r3 = 2
            r4 = 4
            r5 = 48
            java.lang.String r7 = "thumbnails"
            kotlin.jvm.internal.C17542s.j(r1, r7)
            r7 = -751833167(0xffffffffd32fefb1, float:-7.5564063E11)
            r8 = r39
            U0.m r15 = r8.k(r7)
            r14 = 1
            r8 = r41 & 1
            if (r8 == 0) goto L_0x0022
            r8 = r6 | 6
            goto L_0x0032
        L_0x0022:
            r8 = r6 & 6
            if (r8 != 0) goto L_0x0031
            boolean r8 = r15.V(r1)
            if (r8 == 0) goto L_0x002e
            r8 = r4
            goto L_0x002f
        L_0x002e:
            r8 = r3
        L_0x002f:
            r8 = r8 | r6
            goto L_0x0032
        L_0x0031:
            r8 = r6
        L_0x0032:
            r3 = r41 & 2
            if (r3 == 0) goto L_0x003a
            r8 = r8 | r5
        L_0x0037:
            r9 = r35
            goto L_0x004b
        L_0x003a:
            r9 = r6 & 48
            if (r9 != 0) goto L_0x0037
            r9 = r35
            boolean r10 = r15.V(r9)
            if (r10 == 0) goto L_0x0049
            r10 = 32
            goto L_0x004a
        L_0x0049:
            r10 = r2
        L_0x004a:
            r8 = r8 | r10
        L_0x004b:
            r4 = r41 & 4
            if (r4 == 0) goto L_0x0054
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0051:
            r10 = r36
            goto L_0x0066
        L_0x0054:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0051
            r10 = r36
            boolean r11 = r15.c(r10)
            if (r11 == 0) goto L_0x0063
            r11 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r11 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r8 = r8 | r11
        L_0x0066:
            r11 = r41 & 8
            if (r11 == 0) goto L_0x006f
            r8 = r8 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r12 = r37
            goto L_0x0081
        L_0x006f:
            r12 = r6 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x006c
            r12 = r37
            boolean r13 = r15.c(r12)
            if (r13 == 0) goto L_0x007e
            r13 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r13 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r8 = r8 | r13
        L_0x0081:
            r2 = r41 & 16
            if (r2 == 0) goto L_0x008a
            r8 = r8 | 24576(0x6000, float:3.4438E-41)
        L_0x0087:
            r13 = r38
            goto L_0x009d
        L_0x008a:
            r13 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0087
            r13 = r38
            boolean r16 = r15.V(r13)
            if (r16 == 0) goto L_0x0099
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009b
        L_0x0099:
            r16 = 8192(0x2000, float:1.14794E-41)
        L_0x009b:
            r8 = r8 | r16
        L_0x009d:
            r5 = r8 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r5 != r14) goto L_0x00b4
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x00aa
            goto L_0x00b4
        L_0x00aa:
            r15.L()
            r2 = r9
            r3 = r10
            r4 = r12
            r5 = r13
            r7 = r15
            goto L_0x0405
        L_0x00b4:
            if (r3 == 0) goto L_0x00b9
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x00ba
        L_0x00b9:
            r3 = r9
        L_0x00ba:
            if (r4 == 0) goto L_0x00c4
            r4 = 56
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            goto L_0x00c5
        L_0x00c4:
            r4 = r10
        L_0x00c5:
            if (r11 == 0) goto L_0x00cd
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            goto L_0x00ce
        L_0x00cd:
            r0 = r12
        L_0x00ce:
            if (r2 == 0) goto L_0x00d3
            Dl.n r2 = Dl.n.CIRCLE_BORDER
            goto L_0x00d4
        L_0x00d3:
            r2 = r13
        L_0x00d4:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x00e0
            r5 = -1
            java.lang.String r9 = "com.ingka.ikea.app.uicomposables.views.HorizontalImageContentFullWidth (HorizontalImageContent.kt:101)"
            U0.C4895p.S(r7, r8, r5, r9)
        L_0x00e0:
            r5 = 694779968(0x29698040, float:5.1847632E-14)
            r15.W(r5)
            java.lang.Object r5 = r15.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r8 = r7.a()
            r14 = 0
            if (r5 != r8) goto L_0x00fa
            U0.o0 r5 = U0.C4877g1.a(r14)
            r15.u(r5)
        L_0x00fa:
            U0.o0 r5 = (U0.C4894o0) r5
            r15.P()
            U0.I0 r8 = androidx.compose.ui.platform.C5100f0.e()
            java.lang.Object r8 = r15.Q(r8)
            c2.d r8 = (c2.d) r8
            int r9 = s(r5)
            float r9 = (float) r9
            float r10 = r4 + r0
            float r10 = c2.h.B(r10)
            float r8 = r8.H1(r10)
            float r9 = r9 / r8
            int r8 = (int) r9
            int r9 = r34.size()
            if (r9 <= r8) goto L_0x0123
            r23 = 1
            goto L_0x0125
        L_0x0123:
            r23 = r14
        L_0x0125:
            if (r23 == 0) goto L_0x0133
            r9 = 1
            int r10 = r8 + -1
            int r10 = java.lang.Math.max(r10, r9)
            java.util.List r9 = YH.C16877v.k1(r1, r10)
            goto L_0x0134
        L_0x0133:
            r9 = r1
        L_0x0134:
            int r10 = r34.size()
            int r11 = r9.size()
            int r13 = r10 - r11
            int r10 = r34.size()
            if (r10 < r8) goto L_0x014b
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r8 = r8.d()
            goto L_0x0151
        L_0x014b:
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r8 = r8.n(r0)
        L_0x0151:
            int r10 = Oo.a.f84313h
            int r11 = r34.size()
            int r12 = r34.size()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r10 = J1.j.a(r10, r11, r12, r15, r14)
            java.lang.String r11 = "HorizontalImageContentTestTags.CONTAINER"
            androidx.compose.ui.d r11 = androidx.compose.ui.platform.C5116k1.a(r3, r11)
            r12 = 0
            r35 = r13
            r13 = 0
            r14 = 1
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.h(r11, r12, r14, r13)
            r12 = 694814119(0x296a05a7, float:5.196334E-14)
            r15.W(r12)
            boolean r12 = r15.V(r10)
            java.lang.Object r14 = r15.D()
            if (r12 != 0) goto L_0x018c
            java.lang.Object r12 = r7.a()
            if (r14 != r12) goto L_0x0194
        L_0x018c:
            Dl.c r14 = new Dl.c
            r14.<init>(r10)
            r15.u(r14)
        L_0x0194:
            nI.l r14 = (nI.C17642l) r14
            r15.P()
            r10 = 1
            androidx.compose.ui.d r11 = L1.o.c(r11, r10, r14)
            r10 = 694816279(0x296a0e17, float:5.197066E-14)
            r15.W(r10)
            java.lang.Object r10 = r15.D()
            java.lang.Object r7 = r7.a()
            if (r10 != r7) goto L_0x01b6
            Dl.d r10 = new Dl.d
            r10.<init>(r5)
            r15.u(r10)
        L_0x01b6:
            nI.l r10 = (nI.C17642l) r10
            r15.P()
            androidx.compose.ui.d r5 = androidx.compose.ui.layout.g.a(r11, r10)
            i1.c$a r7 = i1.C5437c.f24302a
            i1.c$c r7 = r7.i()
            r10 = 48
            E1.I r7 = androidx.compose.foundation.layout.G.b(r8, r7, r15, r10)
            r8 = 0
            int r10 = U0.C4883j.a(r15, r8)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            G1.g$a r11 = G1.C4504g.f6515W
            nI.a r12 = r11.a()
            U0.f r14 = r15.m()
            if (r14 != 0) goto L_0x01e7
            U0.C4883j.c()
        L_0x01e7:
            r15.I()
            boolean r14 = r15.i()
            if (r14 == 0) goto L_0x01f4
            r15.p(r12)
            goto L_0x01f7
        L_0x01f4:
            r15.t()
        L_0x01f7:
            U0.m r12 = U0.F1.a(r15)
            nI.p r14 = r11.c()
            U0.F1.c(r12, r7, r14)
            nI.p r7 = r11.e()
            U0.F1.c(r12, r8, r7)
            nI.p r7 = r11.b()
            boolean r8 = r12.i()
            if (r8 != 0) goto L_0x0221
            java.lang.Object r8 = r12.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r14)
            if (r8 != 0) goto L_0x022f
        L_0x0221:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r12.u(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r12.w(r8, r7)
        L_0x022f:
            nI.p r7 = r11.d()
            U0.F1.c(r12, r5, r7)
            s0.N r5 = s0.C5843N.f28726a
            r5 = 327340251(0x1382d0db, float:3.302256E-27)
            r15.W(r5)
            Dl.n r5 = Dl.n.CIRCLE_BORDER
            if (r2 != r5) goto L_0x0267
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            A0.f r7 = A0.g.h()
            androidx.compose.ui.d r5 = m1.e.a(r5, r7)
            r7 = 1
            float r8 = (float) r7
            float r8 = c2.h.B(r8)
            tK.v r10 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r10 = r10.a(r15, r11)
            long r10 = r10.m0()
            A0.f r12 = A0.g.h()
            androidx.compose.ui.d r5 = n0.C5599e.g(r5, r8, r10, r12)
            goto L_0x026e
        L_0x0267:
            r7 = 1
            Dl.n r5 = Dl.n.NONE
            if (r2 != r5) goto L_0x041b
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
        L_0x026e:
            r15.P()
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.J.t(r8, r4)
            androidx.compose.ui.d r5 = r8.s(r5)
            r8 = 327358704(0x138318f0, float:3.309364E-27)
            r15.W(r8)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r24 = r9.iterator()
        L_0x0287:
            boolean r8 = r24.hasNext()
            if (r8 == 0) goto L_0x02f4
            java.lang.Object r8 = r24.next()
            Dl.b r8 = (Dl.b) r8
            r9 = 1911787114(0x71f38e6a, float:2.4120648E30)
            r15.W(r9)
            boolean r9 = r15.V(r8)
            java.lang.Object r10 = r15.D()
            if (r9 != 0) goto L_0x02ab
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x02b3
        L_0x02ab:
            Dl.e r10 = new Dl.e
            r10.<init>(r8)
            r15.u(r10)
        L_0x02b3:
            nI.l r10 = (nI.C17642l) r10
            r15.P()
            r14 = 0
            gs.e r9 = gs.f.a(r10, r15, r14)
            java.lang.String r10 = r8.g()
            int r20 = gs.e.f97946h
            r21 = 0
            r22 = 2040(0x7f8, float:2.859E-42)
            r11 = 0
            r12 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r25 = 0
            r26 = 0
            r8 = r9
            r9 = r10
            r10 = r5
            r7 = r35
            r13 = r16
            r14 = r17
            r35 = r15
            r15 = r18
            r16 = r19
            r17 = r25
            r18 = r26
            r19 = r35
            gs.C11352b.b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            r15 = r35
            r35 = r7
            r7 = 1
            r13 = 0
            goto L_0x0287
        L_0x02f4:
            r7 = r35
            r35 = r15
            r35.P()
            r8 = 327373185(0x13835181, float:3.314942E-27)
            r15.W(r8)
            if (r23 == 0) goto L_0x03f1
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c r8 = r8.e()
            r9 = 0
            E1.I r8 = androidx.compose.foundation.layout.C5077h.h(r8, r9)
            int r10 = U0.C4883j.a(r15, r9)
            U0.y r11 = r15.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r15, r5)
            G1.g$a r12 = G1.C4504g.f6515W
            nI.a r13 = r12.a()
            U0.f r14 = r15.m()
            if (r14 != 0) goto L_0x0329
            U0.C4883j.c()
        L_0x0329:
            r15.I()
            boolean r14 = r15.i()
            if (r14 == 0) goto L_0x0336
            r15.p(r13)
            goto L_0x0339
        L_0x0336:
            r15.t()
        L_0x0339:
            U0.m r13 = U0.F1.a(r15)
            nI.p r14 = r12.c()
            U0.F1.c(r13, r8, r14)
            nI.p r8 = r12.e()
            U0.F1.c(r13, r11, r8)
            nI.p r8 = r12.b()
            boolean r11 = r13.i()
            if (r11 != 0) goto L_0x0363
            java.lang.Object r11 = r13.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x0371
        L_0x0363:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r13.u(r11)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r13.w(r10, r8)
        L_0x0371:
            nI.p r8 = r12.d()
            U0.F1.c(r13, r5, r8)
            androidx.compose.foundation.layout.j r5 = androidx.compose.foundation.layout.C5079j.f18125a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r8 = 1911805259(0x71f3d54b, float:2.4148068E30)
            r15.W(r8)
            java.lang.Object r8 = r15.D()
            U0.m$a r10 = U0.C4889m.f14007a
            java.lang.Object r10 = r10.a()
            if (r8 != r10) goto L_0x0396
            Dl.f r8 = new Dl.f
            r8.<init>()
            r15.u(r8)
        L_0x0396:
            nI.l r8 = (nI.C17642l) r8
            r15.P()
            r10 = 1
            r11 = 0
            androidx.compose.ui.d r5 = L1.o.d(r5, r9, r8, r10, r11)
            java.lang.String r8 = "HorizontalImageContentTestTags.ADDITIONAL_ITEMS"
            androidx.compose.ui.d r10 = androidx.compose.ui.platform.C5116k1.a(r5, r8)
            Y1.j$a r5 = Y1.j.f14783b
            int r5 = r5.a()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "+"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            TC.b$a$a r9 = TC.C13679b.a.C2855a.f116679a
            Y1.j r21 = Y1.j.h(r5)
            r32 = 0
            r33 = 261112(0x3fbf8, float:3.65896E-40)
            r11 = 0
            r13 = 0
            r5 = 0
            r7 = r15
            r15 = r5
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 48
            r30 = r7
            SC.C13607l.j(r8, r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r23, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            r7.x()
            goto L_0x03f2
        L_0x03f1:
            r7 = r15
        L_0x03f2:
            r7.P()
            r7.x()
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0401
            U0.C4895p.R()
        L_0x0401:
            r5 = r2
            r2 = r3
            r3 = r4
            r4 = r0
        L_0x0405:
            U0.Y0 r8 = r7.n()
            if (r8 == 0) goto L_0x041a
            Dl.g r9 = new Dl.g
            r0 = r9
            r1 = r34
            r6 = r40
            r7 = r41
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x041a:
            return
        L_0x041b:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Dl.m.n(KJ.c, androidx.compose.ui.d, float, float, Dl.n, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C4894o0 o0Var, c2.r rVar) {
        t(o0Var, c2.r.h(rVar.k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(b bVar, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(bVar.i());
        aVar.k(Integer.valueOf(C18146a.f148160N5));
        aVar.l(h.a.XXXS);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(L1.x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.z(xVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C15987c cVar, d dVar, float f10, float f11, n nVar, int i10, int i11, C4889m mVar, int i12) {
        n(cVar, dVar, f10, f11, nVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final int s(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void t(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N u(String str, L1.x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(Dl.b r23, nI.C17642l<? super Dl.b, XH.C16807N> r24, androidx.compose.ui.d r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r23
            r2 = r24
            r4 = r27
            java.lang.String r0 = "item"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            r0 = -475310760(0xffffffffe3ab5558, float:-6.321086E21)
            r3 = r26
            U0.m r3 = r3.k(r0)
            r5 = r28 & 1
            r6 = 4
            if (r5 == 0) goto L_0x001c
            r5 = r4 | 6
            goto L_0x002c
        L_0x001c:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x002b
            boolean r5 = r3.V(r1)
            if (r5 == 0) goto L_0x0028
            r5 = r6
            goto L_0x0029
        L_0x0028:
            r5 = 2
        L_0x0029:
            r5 = r5 | r4
            goto L_0x002c
        L_0x002b:
            r5 = r4
        L_0x002c:
            r7 = r28 & 2
            r8 = 32
            if (r7 == 0) goto L_0x0035
            r5 = r5 | 48
            goto L_0x0044
        L_0x0035:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0044
            boolean r7 = r3.F(r2)
            if (r7 == 0) goto L_0x0041
            r7 = r8
            goto L_0x0043
        L_0x0041:
            r7 = 16
        L_0x0043:
            r5 = r5 | r7
        L_0x0044:
            r7 = r28 & 4
            if (r7 == 0) goto L_0x004d
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r9 = r25
            goto L_0x005f
        L_0x004d:
            r9 = r4 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x004a
            r9 = r25
            boolean r10 = r3.V(r9)
            if (r10 == 0) goto L_0x005c
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r10 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r5 = r5 | r10
        L_0x005f:
            r10 = r5 & 147(0x93, float:2.06E-43)
            r11 = 146(0x92, float:2.05E-43)
            if (r10 != r11) goto L_0x0071
            boolean r10 = r3.l()
            if (r10 != 0) goto L_0x006c
            goto L_0x0071
        L_0x006c:
            r3.L()
            goto L_0x0152
        L_0x0071:
            if (r7 == 0) goto L_0x0077
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r15 = r7
            goto L_0x0078
        L_0x0077:
            r15 = r9
        L_0x0078:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0084
            r7 = -1
            java.lang.String r9 = "com.ingka.ikea.app.uicomposables.views.HorizontalProductImage (HorizontalImageContent.kt:209)"
            U0.C4895p.S(r0, r5, r7, r9)
        L_0x0084:
            java.lang.String r0 = "THUMBNAIL"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r15, r0)
            A0.f r7 = A0.g.h()
            androidx.compose.ui.d r0 = m1.e.a(r0, r7)
            r7 = 1
            float r9 = (float) r7
            float r9 = c2.h.B(r9)
            tK.v r10 = tK.C18030v.f147664a
            int r11 = tK.C18030v.f147665b
            tK.h r10 = r10.a(r3, r11)
            long r10 = r10.m0()
            A0.f r12 = A0.g.h()
            androidx.compose.ui.d r0 = n0.C5599e.g(r0, r9, r10, r12)
            r9 = 1333191567(0x4f76e38f, float:4.14210842E9)
            r3.W(r9)
            r9 = 0
            if (r2 == 0) goto L_0x00f8
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            r10 = 1333193726(0x4f76ebfe, float:4.14266112E9)
            r3.W(r10)
            r10 = r5 & 112(0x70, float:1.57E-43)
            if (r10 != r8) goto L_0x00c3
            r8 = r7
            goto L_0x00c4
        L_0x00c3:
            r8 = r9
        L_0x00c4:
            r10 = r5 & 14
            if (r10 != r6) goto L_0x00ca
            r10 = r7
            goto L_0x00cb
        L_0x00ca:
            r10 = r9
        L_0x00cb:
            r8 = r8 | r10
            java.lang.Object r10 = r3.D()
            if (r8 != 0) goto L_0x00da
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r10 != r8) goto L_0x00e2
        L_0x00da:
            Dl.j r10 = new Dl.j
            r10.<init>(r2, r1)
            r3.u(r10)
        L_0x00e2:
            r20 = r10
            nI.a r20 = (nI.C17631a) r20
            r3.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x00fa
        L_0x00f8:
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
        L_0x00fa:
            r3.P()
            androidx.compose.ui.d r0 = r0.s(r8)
            r8 = 1333198552(0x4f76fed8, float:4.14389658E9)
            r3.W(r8)
            r5 = r5 & 14
            if (r5 != r6) goto L_0x010c
            goto L_0x010d
        L_0x010c:
            r7 = r9
        L_0x010d:
            java.lang.Object r5 = r3.D()
            if (r7 != 0) goto L_0x011b
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r5 != r6) goto L_0x0123
        L_0x011b:
            Dl.k r5 = new Dl.k
            r5.<init>(r1)
            r3.u(r5)
        L_0x0123:
            nI.l r5 = (nI.C17642l) r5
            r3.P()
            gs.e r5 = gs.f.a(r5, r3, r9)
            java.lang.String r6 = r23.g()
            int r17 = gs.e.f97946h
            r18 = 0
            r19 = 2040(0x7f8, float:2.859E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r7 = r0
            r0 = r15
            r15 = r16
            r16 = r3
            gs.C11352b.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0151
            U0.C4895p.R()
        L_0x0151:
            r9 = r0
        L_0x0152:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x016a
            Dl.l r7 = new Dl.l
            r0 = r7
            r1 = r23
            r2 = r24
            r3 = r9
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Dl.m.v(Dl.b, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C17642l lVar, b bVar) {
        lVar.invoke(bVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(b bVar, e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j(bVar.i());
        aVar.k(Integer.valueOf(bVar.h()));
        aVar.l(h.a.XXXS);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(b bVar, C17642l lVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        v(bVar, lVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
