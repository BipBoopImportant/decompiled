package yG;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import J1.e;
import O0.d1;
import OE.C13316h;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U5.e;
import U5.s;
import XH.C16807N;
import Y1.j;
import Y1.k;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.h;
import com.sugarcube.core.network.models.CatalogCategory;
import i1.C5437c;
import k6.C8441h;
import k6.C8442i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5749w0;
import rF.C15002a;
import s0.C5843N;
import s0.C5861g;
import s0.C5862h;
import t1.C5942c;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogCategory;", "category", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "c", "(Lcom/sugarcube/core/network/models/CatalogCategory;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class P {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CatalogCategory f152606a;

        a(CatalogCategory catalogCategory) {
            this.f152606a = catalogCategory;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(gVar, "$this$Card");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-509763801, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.categories.CategoryItem.<anonymous> (CategoryItem.kt:56)");
                }
                C5437c.a aVar = C5437c.f24302a;
                C5437c.b g10 = aVar.g();
                C5073d dVar = C5073d.f18068a;
                C5073d.f b10 = dVar.b();
                CatalogCategory catalogCategory = this.f152606a;
                d.a aVar2 = d.f18749a;
                I a10 = C5080k.a(b10, g10, mVar2, 54);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, aVar2);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b11 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b11);
                }
                F1.c(a13, e10, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                d i12 = J.i(J.h(aVar2, 0.0f, 1, (Object) null), h.B((float) 135));
                C8441h c10 = C8442i.a(new C8441h.a((Context) mVar2.Q(AndroidCompositionLocals_androidKt.g())).e(catalogCategory.getImageUrl()), true).c();
                C4478k b12 = C4478k.f5915a.b();
                String name = catalogCategory.getName();
                CatalogCategory catalogCategory2 = catalogCategory;
                C4889m mVar3 = mVar;
                s.b(c10, name == null ? "" : name, i12, e.c(C13316h.f112845a, mVar2, 0), (C5942c) null, (C5942c) null, (C17642l<? super e.c.C0658c, C16807N>) null, (C17642l<? super e.c.d, C16807N>) null, (C17642l<? super e.c.b, C16807N>) null, (C5437c) null, b12, 0.0f, (C5749w0) null, 0, false, mVar3, 384, 6, 31728);
                d i13 = D.i(J.i(J.h(aVar2, 0.0f, 1, (Object) null), h.B((float) 96)), h.B((float) 12));
                I b13 = G.b(dVar.f(), aVar.i(), mVar3, 54);
                int a14 = C4883j.a(mVar3, 0);
                C4912y s11 = mVar.s();
                d e11 = c.e(mVar3, i13);
                C17631a<C4504g> a15 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar3.p(a15);
                } else {
                    mVar.t();
                }
                C4889m a16 = F1.a(mVar);
                F1.c(a16, b13, aVar3.c());
                F1.c(a16, s11, aVar3.e());
                p<C4504g, Integer, C16807N> b14 = aVar3.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b14);
                }
                F1.c(a16, e11, aVar3.d());
                C5843N n10 = C5843N.f28726a;
                String name2 = catalogCategory2.getName();
                if (name2 == null) {
                    name2 = "";
                }
                d1.b(name2, (d) null, C15002a.a(mVar3, 0).f(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, C18030v.f147664a.b(mVar3, C18030v.f147665b).a().c(), mVar, 0, 0, 65530);
                mVar.x();
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(com.sugarcube.core.network.models.CatalogCategory r23, androidx.compose.ui.d r24, nI.C17642l<? super com.sugarcube.core.network.models.CatalogCategory, XH.C16807N> r25, U0.C4889m r26, int r27, int r28) {
        /*
            r1 = r23
            r3 = r25
            r4 = r27
            java.lang.String r0 = "category"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r0 = -660862542(0xffffffffd89c09b2, float:-1.37252364E15)
            r2 = r26
            U0.m r2 = r2.k(r0)
            r5 = r28 & 1
            if (r5 == 0) goto L_0x0020
            r5 = r4 | 6
            goto L_0x0030
        L_0x0020:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x002f
            boolean r5 = r2.F(r1)
            if (r5 == 0) goto L_0x002c
            r5 = 4
            goto L_0x002d
        L_0x002c:
            r5 = 2
        L_0x002d:
            r5 = r5 | r4
            goto L_0x0030
        L_0x002f:
            r5 = r4
        L_0x0030:
            r6 = r28 & 2
            if (r6 == 0) goto L_0x0039
            r5 = r5 | 48
        L_0x0036:
            r7 = r24
            goto L_0x004b
        L_0x0039:
            r7 = r4 & 48
            if (r7 != 0) goto L_0x0036
            r7 = r24
            boolean r8 = r2.V(r7)
            if (r8 == 0) goto L_0x0048
            r8 = 32
            goto L_0x004a
        L_0x0048:
            r8 = 16
        L_0x004a:
            r5 = r5 | r8
        L_0x004b:
            r8 = r28 & 4
            r15 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0055
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0053:
            r14 = r5
            goto L_0x0065
        L_0x0055:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0053
            boolean r8 = r2.F(r3)
            if (r8 == 0) goto L_0x0061
            r8 = r15
            goto L_0x0063
        L_0x0061:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0063:
            r5 = r5 | r8
            goto L_0x0053
        L_0x0065:
            r5 = r14 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r5 != r8) goto L_0x0079
            boolean r5 = r2.l()
            if (r5 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r2.L()
            r22 = r7
            goto L_0x0141
        L_0x0079:
            if (r6 == 0) goto L_0x007f
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r13 = r5
            goto L_0x0080
        L_0x007f:
            r13 = r7
        L_0x0080:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x008c
            r5 = -1
            java.lang.String r6 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.categories.CategoryItem (CategoryItem.kt:42)"
            U0.C4895p.S(r0, r14, r5, r6)
        L_0x008c:
            r0 = 167(0xa7, float:2.34E-43)
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r13, r0)
            r5 = 207(0xcf, float:2.9E-43)
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.i(r0, r5)
            p1.i1 r17 = p1.c1.a()
            O0.q r16 = O0.C4748q.f11441a
            r12 = 0
            float r5 = (float) r12
            float r6 = c2.h.B(r5)
            int r18 = O0.C4748q.f11442b
            int r5 = r18 << 18
            r19 = r5 | 6
            r20 = 62
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r5 = r16
            r12 = r2
            r22 = r13
            r13 = r19
            r4 = r14
            r14 = r20
            O0.r r19 = r5.c(r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r14 = 0
            rF.b r5 = rF.C15002a.a(r2, r14)
            long r6 = r5.p()
            int r18 = r18 << 12
            r20 = 14
            r8 = 0
            r10 = 0
            r12 = 0
            r5 = r16
            r21 = r14
            r14 = r2
            r15 = r18
            r16 = r20
            O0.p r9 = r5.b(r6, r8, r10, r12, r14, r15, r16)
            r5 = -1644953429(0xffffffff9df400ab, float:-6.4586953E-21)
            r2.W(r5)
            r4 = r4 & 896(0x380, float:1.256E-42)
            r12 = 1
            r5 = 256(0x100, float:3.59E-43)
            if (r4 != r5) goto L_0x00f8
            r21 = r12
        L_0x00f8:
            boolean r4 = r2.F(r1)
            r4 = r21 | r4
            java.lang.Object r5 = r2.D()
            if (r4 != 0) goto L_0x010c
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x0114
        L_0x010c:
            yG.N r5 = new yG.N
            r5.<init>(r3, r1)
            r2.u(r5)
        L_0x0114:
            nI.a r5 = (nI.C17631a) r5
            r2.P()
            yG.P$a r4 = new yG.P$a
            r4.<init>(r1)
            r6 = 54
            r7 = -509763801(0xffffffffe19d9f27, float:-3.6345087E20)
            c1.a r13 = c1.c.e(r7, r12, r4, r2, r6)
            r15 = 100666368(0x6000c00, float:2.408294E-35)
            r16 = 196(0xc4, float:2.75E-43)
            r7 = 0
            r11 = 0
            r12 = 0
            r6 = r0
            r8 = r17
            r10 = r19
            r14 = r2
            O0.C4751s.b(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0141
            U0.C4895p.R()
        L_0x0141:
            U0.Y0 r6 = r2.n()
            if (r6 == 0) goto L_0x015a
            yG.O r7 = new yG.O
            r0 = r7
            r1 = r23
            r2 = r22
            r3 = r25
            r4 = r27
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x015a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.P.c(com.sugarcube.core.network.models.CatalogCategory, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, CatalogCategory catalogCategory) {
        lVar.invoke(catalogCategory);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(CatalogCategory catalogCategory, d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        c(catalogCategory, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
