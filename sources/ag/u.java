package AG;

import A0.g;
import E1.C4478k;
import E1.I;
import G1.C4504g;
import N1.P;
import O0.S;
import O0.U;
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
import U0.Y0;
import U5.e;
import U5.s;
import XH.C16807N;
import Y1.j;
import Y1.k;
import Y1.t;
import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import i1.C5437c;
import k6.C8441h;
import k6.C8442i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lF.C14768a;
import m1.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5749w0;
import p1.i1;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5861g;
import s0.C5862h;
import t1.C5942c;
import tK.C18030v;
import wK.C18349h7;
import wK.C18361i7;
import wK.C18385k7;
import wK.C18437p;
import wK.C18464r2;
import wK.C18476s2;
import wK.C18540x6;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aW\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\f\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "product", "LlF/a;", "priceData", "Lkotlin/Function1;", "LXH/N;", "onItemSelected", "Lkotlin/Function0;", "onFavorite", "onBedDisclaimerClicked", "g", "(Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LlF/a;LnI/l;LnI/a;LnI/a;LU0/m;II)V", "e", "(LnI/a;LnI/a;LU0/m;I)V", "", "productName", "Landroid/net/Uri;", "imageUrl", "j", "(Ljava/lang/String;Landroid/net/Uri;LU0/m;I)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5861g, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f132913a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f132914b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f132915c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14768a f132916d;

        a(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, CachedCatalogItem cachedCatalogItem, C14768a aVar3) {
            this.f132913a = aVar;
            this.f132914b = aVar2;
            this.f132915c = cachedCatalogItem;
            this.f132916d = aVar3;
        }

        public final void a(C5861g gVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(gVar, "$this$Card");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-709037593, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.ProductCard.<anonymous> (ProductCard.kt:85)");
                }
                d.a aVar = d.f18749a;
                d i12 = D.i(J.C(J.z(aVar, h.B((float) 190), h.B((float) 250)), (C5437c.C0386c) null, false, 3, (Object) null), h.B((float) 12));
                C5437c.b k10 = C5437c.f24302a.k();
                C17631a<C16807N> aVar2 = this.f132913a;
                C17631a<C16807N> aVar3 = this.f132914b;
                CachedCatalogItem cachedCatalogItem = this.f132915c;
                C14768a aVar4 = this.f132916d;
                I a10 = C5080k.a(C5073d.f18068a.g(), k10, mVar2, 48);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, i12);
                C4504g.a aVar5 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar5.a();
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
                F1.c(a13, a10, aVar5.c());
                F1.c(a13, s10, aVar5.e());
                p<C4504g, Integer, C16807N> b10 = aVar5.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar5.d());
                C5862h hVar = C5862h.f28810a;
                u.e(aVar2, aVar3, mVar2, 0);
                String name = cachedCatalogItem.getName();
                Uri thumbUrl = cachedCatalogItem.getCatalogItem().getThumbUrl();
                if (thumbUrl == null) {
                    thumbUrl = Uri.EMPTY;
                }
                C17542s.g(thumbUrl);
                u.j(name, thumbUrl, mVar2, 0);
                float f10 = (float) 8;
                C5844O.a(J.i(aVar, h.B(f10)), mVar2, 6);
                d a14 = C5116k1.a(aVar, "PRODUCT_CARD_TITLE_TEST_TAG");
                String name2 = cachedCatalogItem.getName();
                C18030v vVar = C18030v.f147664a;
                int i13 = C18030v.f147665b;
                int i14 = i13;
                C18030v vVar2 = vVar;
                float f11 = f10;
                C14768a aVar6 = aVar4;
                d.a aVar7 = aVar;
                d1.b(name2, a14, vVar.a(mVar2, i13).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, t.f14827a.b(), false, 1, 0, (C17642l<? super P, C16807N>) null, vVar.b(mVar2, i13).c().e(), mVar, 48, 3120, 55288);
                String description = cachedCatalogItem.getCatalogItem().getDescription();
                if (description == null) {
                    description = "";
                }
                C4889m mVar3 = mVar;
                zG.j.b(description, vVar2.b(mVar3, i14).a().b(), 0, mVar, 0, 4);
                d.a aVar8 = aVar7;
                C5844O.a(J.i(aVar8, h.B(f11)), mVar3, 6);
                d a15 = C5116k1.a(aVar8, "PRODUCT_CARD_PRICE_TEST_TAG");
                C18349h7 h7Var = C18349h7.Medium;
                C18540x6.f(aVar6.e(), aVar6.d(), aVar6.a(), aVar6.c(), h7Var, (C18385k7) null, (C18464r2) null, (C18361i7) null, (String) null, a15, (C18437p) null, (C18437p) null, (String) null, (String) null, (C18476s2) null, mVar, 805330944, 0, 32224);
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

    /* access modifiers changed from: private */
    public static final void e(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1090990915);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1090990915, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.ActionsRow (ProductCard.kt:134)");
            }
            d.a aVar3 = d.f18749a;
            d h10 = J.h(aVar3, 0.0f, 1, (Object) null);
            I b10 = G.b(C5073d.f18068a.c(), C5437c.f24302a.l(), k10, 6);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar4.c());
            F1.c(a12, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b11 = aVar4.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar4.d());
            C5844O.a(C5842M.e(C5843N.f28726a, aVar3, 1.0f, false, 2, (Object) null), k10, 0);
            k10.W(-443877040);
            if (aVar2 != null) {
                U.a(aVar2, C5116k1.a(aVar3, "PRODUCT_CARD_INFO_BUTTON_TEST_TAG"), false, (S) null, (m) null, C15403k.f132873a.a(), k10, 196656, 28);
            }
            k10.P();
            k10.W(-443861017);
            if (aVar != null) {
                U.a(aVar, C5116k1.a(aVar3, "PRODUCT_CARD_FAV_BUTTON_TEST_TAG"), false, (S) null, (m) null, C15403k.f132873a.b(), k10, 196656, 28);
            }
            k10.P();
            k10.W(-443842638);
            if (aVar2 == null && aVar == null) {
                C5844O.a(J.i(aVar3, h.B((float) 48)), k10, 6);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new t(aVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        e(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(com.sugarcube.app.base.data.database.CachedCatalogItem r26, lF.C14768a r27, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, XH.C16807N> r28, nI.C17631a<XH.C16807N> r29, nI.C17631a<XH.C16807N> r30, U0.C4889m r31, int r32, int r33) {
        /*
            r1 = r26
            r2 = r27
            r3 = r28
            r6 = r32
            java.lang.String r0 = "product"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "priceData"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onItemSelected"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            r0 = -2016360075(0xffffffff87d0c975, float:-3.1414767E-34)
            r4 = r31
            U0.m r4 = r4.k(r0)
            r5 = r33 & 1
            r7 = 4
            if (r5 == 0) goto L_0x0028
            r5 = r6 | 6
            goto L_0x0038
        L_0x0028:
            r5 = r6 & 6
            if (r5 != 0) goto L_0x0037
            boolean r5 = r4.V(r1)
            if (r5 == 0) goto L_0x0034
            r5 = r7
            goto L_0x0035
        L_0x0034:
            r5 = 2
        L_0x0035:
            r5 = r5 | r6
            goto L_0x0038
        L_0x0037:
            r5 = r6
        L_0x0038:
            r8 = r33 & 2
            if (r8 == 0) goto L_0x003f
            r5 = r5 | 48
            goto L_0x004f
        L_0x003f:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x004f
            boolean r8 = r4.V(r2)
            if (r8 == 0) goto L_0x004c
            r8 = 32
            goto L_0x004e
        L_0x004c:
            r8 = 16
        L_0x004e:
            r5 = r5 | r8
        L_0x004f:
            r8 = r33 & 4
            r9 = 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L_0x0058
            r5 = r5 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0058:
            r8 = r6 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0067
            boolean r8 = r4.F(r3)
            if (r8 == 0) goto L_0x0064
            r8 = r9
            goto L_0x0066
        L_0x0064:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r5 = r5 | r8
        L_0x0067:
            r8 = r33 & 8
            if (r8 == 0) goto L_0x0070
            r5 = r5 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r10 = r29
            goto L_0x0082
        L_0x0070:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x006d
            r10 = r29
            boolean r11 = r4.F(r10)
            if (r11 == 0) goto L_0x007f
            r11 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r11 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r5 = r5 | r11
        L_0x0082:
            r11 = r33 & 16
            if (r11 == 0) goto L_0x008b
            r5 = r5 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r12 = r30
            goto L_0x009d
        L_0x008b:
            r12 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r12 != 0) goto L_0x0088
            r12 = r30
            boolean r13 = r4.F(r12)
            if (r13 == 0) goto L_0x009a
            r13 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r13 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r5 = r5 | r13
        L_0x009d:
            r13 = r5 & 9363(0x2493, float:1.312E-41)
            r14 = 9362(0x2492, float:1.3119E-41)
            if (r13 != r14) goto L_0x00b0
            boolean r13 = r4.l()
            if (r13 != 0) goto L_0x00aa
            goto L_0x00b0
        L_0x00aa:
            r4.L()
            r5 = r12
            goto L_0x0182
        L_0x00b0:
            r13 = 0
            if (r8 == 0) goto L_0x00b5
            r14 = r13
            goto L_0x00b6
        L_0x00b5:
            r14 = r10
        L_0x00b6:
            if (r11 == 0) goto L_0x00ba
            r15 = r13
            goto L_0x00bb
        L_0x00ba:
            r15 = r12
        L_0x00bb:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x00c7
            r8 = -1
            java.lang.String r10 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.ProductCard (ProductCard.kt:72)"
            U0.C4895p.S(r0, r5, r8, r10)
        L_0x00c7:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r8 = 3
            r12 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.E(r0, r13, r12, r8, r13)
            r0 = 1765459816(0x693ac768, float:1.4112617E25)
            r4.W(r0)
            r0 = r5 & 896(0x380, float:1.256E-42)
            r13 = 1
            if (r0 != r9) goto L_0x00dc
            r0 = r13
            goto L_0x00dd
        L_0x00dc:
            r0 = r12
        L_0x00dd:
            r5 = r5 & 14
            if (r5 != r7) goto L_0x00e3
            r5 = r13
            goto L_0x00e4
        L_0x00e3:
            r5 = r12
        L_0x00e4:
            r0 = r0 | r5
            java.lang.Object r5 = r4.D()
            if (r0 != 0) goto L_0x00f3
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r5 != r0) goto L_0x00fb
        L_0x00f3:
            AG.q r5 = new AG.q
            r5.<init>(r3, r1)
            r4.u(r5)
        L_0x00fb:
            r20 = r5
            nI.a r20 = (nI.C17631a) r20
            r4.P()
            r21 = 7
            r22 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r5 = "PRODUCT_CARD_TEST_TAG"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r5)
            O0.q r5 = O0.C4748q.f11441a
            rF.b r7 = rF.C15002a.a(r4, r12)
            long r8 = r7.p()
            int r19 = O0.C4748q.f11442b
            int r17 = r19 << 12
            r18 = 14
            r10 = 0
            r20 = 0
            r22 = 0
            r7 = r5
            r12 = r20
            r24 = r14
            r25 = r15
            r14 = r22
            r16 = r4
            O0.p r17 = r7.b(r8, r10, r12, r14, r16, r17, r18)
            r7 = 0
            float r7 = (float) r7
            float r8 = c2.h.B(r7)
            int r7 = r19 << 18
            r15 = r7 | 6
            r16 = 62
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r7 = r5
            r14 = r4
            O0.r r10 = r7.c(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            AG.u$a r5 = new AG.u$a
            r15 = r24
            r14 = r25
            r5.<init>(r15, r14, r1, r2)
            r7 = 54
            r8 = -709037593(0xffffffffd5bcf1e7, float:-2.59683936E13)
            r9 = 1
            c1.a r12 = c1.c.e(r8, r9, r5, r4, r7)
            r5 = 196608(0x30000, float:2.75506E-40)
            r16 = 18
            r8 = 0
            r11 = 0
            r7 = r0
            r9 = r17
            r13 = r4
            r0 = r14
            r14 = r5
            r5 = r15
            r15 = r16
            O0.C4751s.a(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0180
            U0.C4895p.R()
        L_0x0180:
            r10 = r5
            r5 = r0
        L_0x0182:
            U0.Y0 r8 = r4.n()
            if (r8 == 0) goto L_0x019c
            AG.r r9 = new AG.r
            r0 = r9
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r10
            r6 = r32
            r7 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x019c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: AG.u.g(com.sugarcube.app.base.data.database.CachedCatalogItem, lF.a, nI.l, nI.a, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N h(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        lVar.invoke(cachedCatalogItem);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i(CachedCatalogItem cachedCatalogItem, C14768a aVar, C17642l lVar, C17631a aVar2, C17631a aVar3, int i10, int i11, C4889m mVar, int i12) {
        g(cachedCatalogItem, aVar, lVar, aVar2, aVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void j(String str, Uri uri, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        Uri uri2 = uri;
        C4889m k10 = mVar.k(-733179211);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(uri2) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-733179211, i12, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.common.drawer.ProductImage (ProductCard.kt:175)");
            }
            d.a aVar = d.f18749a;
            d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            I b10 = G.b(C5073d.f18068a.b(), C5437c.f24302a.l(), k10, 6);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            float f10 = (float) 8;
            mVar2 = k10;
            s.b(C8442i.a(new C8441h.a((Context) k10.Q(AndroidCompositionLocals_androidKt.g())).e(uri2), true).c(), str, C5116k1.a(J.t(D.i(b.d(e.a(aVar, g.e(h.B(f10))), C18030v.f147664a.a(k10, C18030v.f147665b).F0(), (i1) null, 2, (Object) null), h.B(f10)), h.B((float) 100)), "PRODUCT_CARD_IMAGE_TEST_TAG"), J1.e.c(C13316h.f112845a, k10, 0), (C5942c) null, (C5942c) null, (C17642l<? super e.c.C0658c, C16807N>) null, (C17642l<? super e.c.d, C16807N>) null, (C17642l<? super e.c.b, C16807N>) null, (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, 0, false, mVar2, (i12 << 3) & 112, 0, 32752);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new s(str, uri, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(String str, Uri uri, int i10, C4889m mVar, int i11) {
        j(str, uri, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
