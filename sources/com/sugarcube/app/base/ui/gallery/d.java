package com.sugarcube.app.base.ui.gallery;

import DF.C12754C;
import E1.I;
import G1.C4504g;
import JF.C13115w;
import KJ.C15987c;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.C16818i;
import XH.y;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.lifecycle.L;
import c2.h;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.ui.gallery.i;
import com.sugarcube.core.network.models.Composition;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import java.util.List;
import java.util.Locale;
import kF.C14683D;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5843N;
import wK.I4;
import wK.J4;
import wK.X4;
import xF.B0;

@Metadata(d1 = {"\u0000`\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001aC\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\b\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001ag\u0010\u0019\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000f2\"\u0010\u0015\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00000\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a5\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a=\u0010%\u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000fH\u0003¢\u0006\u0004\b%\u0010&¨\u0006-²\u0006\f\u0010'\u001a\u00020\u00008\nX\u0002²\u0006\u0012\u0010!\u001a\b\u0012\u0004\u0012\u00020 0(8\nX\u0002²\u0006\f\u0010$\u001a\u00020\u00008\nX\u0002²\u0006\f\u0010)\u001a\u00020\u00008\nX\u0002²\u0006\u000e\u0010\u0003\u001a\u00020\u00008\n@\nX\u0002²\u0006\u000e\u0010+\u001a\u00020*8\n@\nX\u0002²\u0006\f\u0010,\u001a\u00020\u00008\nX\u0002"}, d2 = {"", "isLoggedIn", "isEditEnabled", "isSaving", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/ui/gallery/i;", "LXH/N;", "onAction", "operationInProgress", "v", "(ZZZLnI/l;ZLU0/m;I)V", "t", "(LU0/m;I)V", "Lcom/sugarcube/core/network/models/Composition;", "composition", "Lkotlin/Function0;", "addAllItemsToCart", "Lkotlin/Function2;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LdI/e;", "", "addItemToCart", "addItemToFav", "LDF/C;", "viewModel", "D", "(Lcom/sugarcube/core/network/models/Composition;LnI/a;LnI/p;LnI/l;LDF/C;LU0/m;I)V", "isUnsupportedComposition", "onCopyDesktopLink", "q", "(ZLcom/sugarcube/core/network/models/Composition;LnI/l;LU0/m;I)V", "LKJ/c;", "LkF/D;", "products", "Ljava/util/Locale;", "locale", "addRoomInProgress", "L", "(LKJ/c;Ljava/util/Locale;ZLnI/a;LU0/m;II)V", "isFetchInProgress", "", "favoritesEnabled", "", "count", "deleteState", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, d2 = {"<anonymous>", "", "catalogItem", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.sugarcube.app.base.ui.gallery.GalleryOverflowSheetKt$ProductList$1$2$1$1", f = "GalleryOverflowSheet.kt", l = {869}, m = "invokeSuspend")
    static final class a extends l implements p<CachedCatalogItem, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f124374c;

        /* renamed from: d  reason: collision with root package name */
        Object f124375d;

        /* renamed from: e  reason: collision with root package name */
        Object f124376e;

        /* renamed from: f  reason: collision with root package name */
        int f124377f;

        /* renamed from: g  reason: collision with root package name */
        int f124378g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f124379h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ p<CachedCatalogItem, C17164e<? super Boolean>, Object> f124380i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super CachedCatalogItem, ? super C17164e<? super Boolean>, ? extends Object> pVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f124380i = pVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f124380i, eVar);
            aVar.f124379h = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(CachedCatalogItem cachedCatalogItem, C17164e<? super Boolean> eVar) {
            return ((a) create(cachedCatalogItem, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f124378g;
            boolean z10 = false;
            if (i10 == 0) {
                y.b(obj);
                CachedCatalogItem cachedCatalogItem = (CachedCatalogItem) this.f124379h;
                if (cachedCatalogItem != null) {
                    p<CachedCatalogItem, C17164e<? super Boolean>, Object> pVar = this.f124380i;
                    this.f124379h = cachedCatalogItem;
                    this.f124374c = cachedCatalogItem;
                    this.f124375d = pVar;
                    this.f124376e = cachedCatalogItem;
                    this.f124377f = 0;
                    this.f124378g = 1;
                    obj = pVar.invoke(cachedCatalogItem, this);
                    if (obj == f10) {
                        return f10;
                    }
                }
                return kotlin.coroutines.jvm.internal.b.a(z10);
            } else if (i10 == 1) {
                CachedCatalogItem cachedCatalogItem2 = (CachedCatalogItem) this.f124376e;
                p pVar2 = (p) this.f124375d;
                CachedCatalogItem cachedCatalogItem3 = (CachedCatalogItem) this.f124374c;
                CachedCatalogItem cachedCatalogItem4 = (CachedCatalogItem) this.f124379h;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                z10 = true;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f124381a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f124381a = lVar;
        }

        public final C16818i<?> c() {
            return this.f124381a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f124381a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(C17642l lVar) {
        lVar.invoke(i.c.f124423a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C17642l lVar) {
        lVar.invoke(i.f.f124426a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(boolean z10, boolean z11, boolean z12, C17642l lVar, boolean z13, int i10, C4889m mVar, int i11) {
        v(z10, z11, z12, lVar, z13, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: nI.p} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void D(com.sugarcube.core.network.models.Composition r33, nI.C17631a<XH.C16807N> r34, nI.p<? super com.sugarcube.app.base.data.database.CachedCatalogItem, ? super dI.C17164e<? super java.lang.Boolean>, ? extends java.lang.Object> r35, nI.C17642l<? super com.sugarcube.app.base.data.database.CachedCatalogItem, java.lang.Boolean> r36, DF.C12754C r37, U0.C4889m r38, int r39) {
        /*
            r1 = r33
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r39
            r0 = 1
            r2 = 48
            r7 = 1765501514(0x693b6a4a, float:1.4160692E25)
            r8 = r38
            U0.m r15 = r8.k(r7)
            r8 = r6 & 6
            if (r8 != 0) goto L_0x0025
            boolean r8 = r15.F(r1)
            if (r8 == 0) goto L_0x0022
            r8 = 4
            goto L_0x0023
        L_0x0022:
            r8 = 2
        L_0x0023:
            r8 = r8 | r6
            goto L_0x0026
        L_0x0025:
            r8 = r6
        L_0x0026:
            r10 = r6 & 48
            r14 = r34
            if (r10 != 0) goto L_0x0038
            boolean r10 = r15.F(r14)
            if (r10 == 0) goto L_0x0035
            r10 = 32
            goto L_0x0037
        L_0x0035:
            r10 = 16
        L_0x0037:
            r8 = r8 | r10
        L_0x0038:
            r10 = r6 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x0048
            boolean r10 = r15.F(r3)
            if (r10 == 0) goto L_0x0045
            r10 = 256(0x100, float:3.59E-43)
            goto L_0x0047
        L_0x0045:
            r10 = 128(0x80, float:1.794E-43)
        L_0x0047:
            r8 = r8 | r10
        L_0x0048:
            r10 = r6 & 3072(0xc00, float:4.305E-42)
            if (r10 != 0) goto L_0x0058
            boolean r10 = r15.F(r4)
            if (r10 == 0) goto L_0x0055
            r10 = 2048(0x800, float:2.87E-42)
            goto L_0x0057
        L_0x0055:
            r10 = 1024(0x400, float:1.435E-42)
        L_0x0057:
            r8 = r8 | r10
        L_0x0058:
            r10 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r10 != 0) goto L_0x0068
            boolean r10 = r15.F(r5)
            if (r10 == 0) goto L_0x0065
            r10 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0067
        L_0x0065:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0067:
            r8 = r8 | r10
        L_0x0068:
            r12 = r8
            r8 = r12 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r8 != r10) goto L_0x007c
            boolean r8 = r15.l()
            if (r8 != 0) goto L_0x0076
            goto L_0x007c
        L_0x0076:
            r15.L()
            r6 = r15
            goto L_0x0348
        L_0x007c:
            boolean r8 = U0.C4895p.J()
            if (r8 == 0) goto L_0x0088
            r8 = -1
            java.lang.String r10 = "com.sugarcube.app.base.ui.gallery.ProductList (GalleryOverflowSheet.kt:839)"
            U0.C4895p.S(r7, r12, r8, r10)
        L_0x0088:
            androidx.lifecycle.F r7 = r37.o1()
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            U0.A1 r7 = d1.b.b(r7, r8, r15, r2)
            androidx.lifecycle.K r10 = r37.b1()
            java.util.List r11 = YH.C16877v.n()
            U0.A1 r16 = d1.b.b(r10, r11, r15, r2)
            androidx.lifecycle.F r10 = r37.S0()
            U0.A1 r10 = d1.b.b(r10, r8, r15, r2)
            androidx.lifecycle.F r11 = r37.e1()
            U0.A1 r2 = d1.b.b(r11, r8, r15, r2)
            U0.I0 r8 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r8 = r15.Q(r8)
            android.content.Context r8 = (android.content.Context) r8
            androidx.compose.ui.d$a r11 = androidx.compose.ui.d.f18749a
            r14 = 0
            r9 = 0
            androidx.compose.ui.d r13 = androidx.compose.foundation.layout.J.f(r11, r14, r0, r9)
            r0 = 420(0x1a4, float:5.89E-43)
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r6 = 2
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.k(r13, r0, r14, r6, r9)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r6 = r6.g()
            i1.c$a r19 = i1.C5437c.f24302a
            i1.c$b r13 = r19.k()
            r14 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r13, r15, r14)
            int r13 = U0.C4883j.a(r15, r14)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r15, r0)
            G1.g$a r22 = G1.C4504g.f6515W
            nI.a r14 = r22.a()
            U0.f r24 = r15.m()
            if (r24 != 0) goto L_0x00f8
            U0.C4883j.c()
        L_0x00f8:
            r15.I()
            boolean r24 = r15.i()
            if (r24 == 0) goto L_0x0105
            r15.p(r14)
            goto L_0x0108
        L_0x0105:
            r15.t()
        L_0x0108:
            U0.m r14 = U0.F1.a(r15)
            r24 = r11
            nI.p r11 = r22.c()
            U0.F1.c(r14, r6, r11)
            nI.p r6 = r22.e()
            U0.F1.c(r14, r9, r6)
            nI.p r6 = r22.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x0134
            java.lang.Object r9 = r14.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r13)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0142
        L_0x0134:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r14.u(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r14.w(r9, r6)
        L_0x0142:
            nI.p r6 = r22.d()
            U0.F1.c(r14, r0, r6)
            s0.h r0 = s0.C5862h.f28810a
            boolean r0 = r37.a2()
            r6 = 1786029705(0x6a74a689, float:7.3941085E25)
            r15.W(r6)
            boolean r6 = r15.F(r8)
            boolean r9 = r15.F(r5)
            r6 = r6 | r9
            java.lang.Object r9 = r15.D()
            if (r6 != 0) goto L_0x016c
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r9 != r6) goto L_0x0174
        L_0x016c:
            xF.s0 r9 = new xF.s0
            r9.<init>(r8, r5)
            r15.u(r9)
        L_0x0174:
            nI.l r9 = (nI.C17642l) r9
            r15.P()
            int r6 = r12 << 3
            r6 = r6 & 112(0x70, float:1.57E-43)
            q(r0, r1, r9, r15, r6)
            boolean r0 = E(r7)
            if (r0 == 0) goto L_0x01a0
            java.util.List r0 = F(r16)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01a0
            r0 = -467457017(0xffffffffe4232c07, float:-1.2039967E22)
            r15.W(r0)
            r0 = 0
            t(r15, r0)
            r15.P()
            r6 = r15
            goto L_0x033c
        L_0x01a0:
            r0 = 0
            r6 = -467361630(0xffffffffe424a0a2, float:-1.2147363E22)
            r15.W(r6)
            java.util.List r6 = F(r16)
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r6 = r6.isEmpty()
            r7 = 25
            if (r6 != 0) goto L_0x02df
            r6 = -467334102(0xffffffffe4250c2a, float:-1.2178357E22)
            r15.W(r6)
            java.util.List r6 = F(r16)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            KJ.c r8 = KJ.C15985a.h(r6)
            OE.q r6 = r37.M1()
            java.util.Locale r9 = r6.getLocale()
            boolean r10 = G(r10)
            int r6 = r12 << 6
            r13 = r6 & 7168(0x1c00, float:1.0045E-41)
            r14 = 0
            r6 = 0
            r11 = r34
            r0 = r12
            r12 = r15
            r6 = 0
            L(r8, r9, r10, r11, r12, r13, r14)
            java.util.List r8 = F(r16)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r17 = r8.iterator()
            r14 = r6
        L_0x01ea:
            boolean r8 = r17.hasNext()
            if (r8 == 0) goto L_0x02da
            java.lang.Object r8 = r17.next()
            r9 = 1
            int r19 = r14 + 1
            if (r14 >= 0) goto L_0x01fc
            YH.C16877v.x()
        L_0x01fc:
            r9 = r8
            kF.D r9 = (kF.C14683D) r9
            androidx.lifecycle.F r8 = r37.d1()
            U0.A1 r8 = d1.b.a(r8, r15, r6)
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L_0x0213
            java.util.List r8 = YH.C16877v.n()
        L_0x0213:
            androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
            float r11 = (float) r7
            float r11 = c2.h.B(r11)
            r7 = 1
            r12 = 0
            r13 = 0
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.k(r10, r13, r11, r7, r12)
            r7 = -1801773530(0xffffffff949b1e26, float:-1.5662892E-26)
            r15.W(r7)
            boolean r7 = r15.F(r3)
            java.lang.Object r11 = r15.D()
            if (r7 != 0) goto L_0x0239
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r11 != r7) goto L_0x0242
        L_0x0239:
            com.sugarcube.app.base.ui.gallery.d$a r11 = new com.sugarcube.app.base.ui.gallery.d$a
            r7 = 0
            r11.<init>(r3, r7)
            r15.u(r11)
        L_0x0242:
            r7 = r11
            nI.p r7 = (nI.p) r7
            r15.P()
            r11 = -1801766471(0xffffffff949b39b9, float:-1.5673768E-26)
            r15.W(r11)
            r11 = r0 & 7168(0x1c00, float:1.0045E-41)
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 != r12) goto L_0x0256
            r11 = 1
            goto L_0x0257
        L_0x0256:
            r11 = r6
        L_0x0257:
            java.lang.Object r12 = r15.D()
            if (r11 != 0) goto L_0x0265
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r12 != r11) goto L_0x026d
        L_0x0265:
            xF.z0 r12 = new xF.z0
            r12.<init>(r4)
            r15.u(r12)
        L_0x026d:
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            boolean r11 = H(r2)
            if (r11 == 0) goto L_0x027a
            r11 = r12
            goto L_0x027b
        L_0x027a:
            r11 = 0
        L_0x027b:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            com.sugarcube.app.base.data.database.CachedCatalogItem r12 = r9.a()
            if (r12 == 0) goto L_0x028e
            com.sugarcube.core.network.models.CatalogItem r12 = r12.getCatalogItem()
            if (r12 == 0) goto L_0x028e
            java.lang.String r12 = r12.getLocalItemNumber()
            goto L_0x028f
        L_0x028e:
            r12 = 0
        L_0x028f:
            boolean r12 = YH.C16877v.l0(r8, r12)
            r22 = 6
            r23 = 0
            r8 = r10
            r10 = r7
            r7 = 2048(0x800, float:2.87E-42)
            r7 = r13
            r13 = r15
            r7 = r14
            r14 = r22
            r6 = r15
            r15 = r23
            kF.C14687H.d(r8, r9, r10, r11, r12, r13, r14, r15)
            r8 = 1786075828(0x6a755ab4, float:7.415379E25)
            r6.W(r8)
            java.util.List r8 = F(r16)
            int r8 = r8.size()
            r9 = 1
            int r8 = r8 - r9
            if (r7 >= r8) goto L_0x02cf
            p1.v0$a r7 = p1.C5747v0.f27350b
            long r9 = r7.d()
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            float r7 = (float) r7
            float r11 = c2.h.B(r7)
            r14 = 432(0x1b0, float:6.05E-43)
            r15 = 9
            r8 = 0
            r12 = 0
            r13 = r6
            I0.B.a(r8, r9, r11, r12, r13, r14, r15)
        L_0x02cf:
            r6.P()
            r15 = r6
            r14 = r19
            r6 = 0
            r7 = 25
            goto L_0x01ea
        L_0x02da:
            r6 = r15
            r6.P()
            goto L_0x0339
        L_0x02df:
            r6 = r15
            r0 = -466054019(0xffffffffe438947d, float:-1.3619602E22)
            r6.W(r0)
            int r0 = OE.n.f113193E1
            r2 = 0
            java.lang.String r8 = J1.j.b(r0, r6, r2)
            r0 = 22
            long r12 = c2.w.i(r0)
            r0 = 25
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r7 = r24
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.i(r7, r0)
            r7 = 0
            r9 = 0
            r10 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r0, r7, r10, r9)
            i1.c$b r7 = r19.g()
            r10 = 2
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.G(r0, r7, r2, r10, r9)
            r31 = 0
            r32 = 131060(0x1fff4, float:1.83654E-40)
            r10 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r30 = 3120(0xc30, float:4.372E-42)
            r29 = r6
            I0.b1.b(r8, r9, r10, r12, r14, r15, r16, r17, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            r6.P()
        L_0x0339:
            r6.P()
        L_0x033c:
            r6.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0348
            U0.C4895p.R()
        L_0x0348:
            U0.Y0 r7 = r6.n()
            if (r7 == 0) goto L_0x0363
            xF.A0 r8 = new xF.A0
            r0 = r8
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0363:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.d.D(com.sugarcube.core.network.models.Composition, nI.a, nI.p, nI.l, DF.C, U0.m, int):void");
    }

    private static final boolean E(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final List<C14683D> F(A1<? extends List<C14683D>> a12) {
        return (List) a12.getValue();
    }

    private static final boolean G(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    private static final boolean H(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N I(Context context, C12754C c10, Composition composition) {
        C17542s.j(composition, "composition");
        C13115w.b(context, c10.M1(), composition);
        c10.p1().j();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean J(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        return cachedCatalogItem != null && ((Boolean) lVar.invoke(cachedCatalogItem)).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N K(Composition composition, C17631a aVar, p pVar, C17642l lVar, C12754C c10, int i10, C4889m mVar, int i11) {
        D(composition, aVar, pVar, lVar, c10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x03d8  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void L(KJ.C15987c<kF.C14683D> r37, java.util.Locale r38, boolean r39, nI.C17631a<XH.C16807N> r40, U0.C4889m r41, int r42, int r43) {
        /*
            r5 = r42
            r0 = 2
            r1 = 4
            r2 = 6
            r3 = -1180572929(0xffffffffb9a1e2ff, float:-3.0877438E-4)
            r4 = r41
            U0.m r4 = r4.k(r3)
            r15 = 1
            r6 = r43 & 1
            if (r6 == 0) goto L_0x0018
            r6 = r5 | 6
            r14 = r37
            goto L_0x002a
        L_0x0018:
            r6 = r5 & 6
            r14 = r37
            if (r6 != 0) goto L_0x0029
            boolean r6 = r4.F(r14)
            if (r6 == 0) goto L_0x0026
            r6 = r1
            goto L_0x0027
        L_0x0026:
            r6 = r0
        L_0x0027:
            r6 = r6 | r5
            goto L_0x002a
        L_0x0029:
            r6 = r5
        L_0x002a:
            r0 = r43 & 2
            if (r0 == 0) goto L_0x0033
            r6 = r6 | 48
        L_0x0030:
            r0 = r38
            goto L_0x0045
        L_0x0033:
            r0 = r5 & 48
            if (r0 != 0) goto L_0x0030
            r0 = r38
            boolean r7 = r4.F(r0)
            if (r7 == 0) goto L_0x0042
            r7 = 32
            goto L_0x0044
        L_0x0042:
            r7 = 16
        L_0x0044:
            r6 = r6 | r7
        L_0x0045:
            r1 = r43 & 4
            if (r1 == 0) goto L_0x004e
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x004b:
            r1 = r39
            goto L_0x0060
        L_0x004e:
            r1 = r5 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x004b
            r1 = r39
            boolean r7 = r4.b(r1)
            if (r7 == 0) goto L_0x005d
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005f
        L_0x005d:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005f:
            r6 = r6 | r7
        L_0x0060:
            r7 = r43 & 8
            if (r7 == 0) goto L_0x006a
            r6 = r6 | 3072(0xc00, float:4.305E-42)
        L_0x0066:
            r8 = r40
        L_0x0068:
            r9 = r6
            goto L_0x007d
        L_0x006a:
            r8 = r5 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0066
            r8 = r40
            boolean r9 = r4.F(r8)
            if (r9 == 0) goto L_0x0079
            r9 = 2048(0x800, float:2.87E-42)
            goto L_0x007b
        L_0x0079:
            r9 = 1024(0x400, float:1.435E-42)
        L_0x007b:
            r6 = r6 | r9
            goto L_0x0068
        L_0x007d:
            r6 = r9 & 1171(0x493, float:1.641E-42)
            r10 = 1170(0x492, float:1.64E-42)
            if (r6 != r10) goto L_0x008f
            boolean r6 = r4.l()
            if (r6 != 0) goto L_0x008a
            goto L_0x008f
        L_0x008a:
            r4.L()
            goto L_0x03d2
        L_0x008f:
            if (r7 == 0) goto L_0x00b2
            r6 = -1216400314(0xffffffffb77f3446, float:-1.5211355E-5)
            r4.W(r6)
            java.lang.Object r6 = r4.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x00ab
            xF.C0 r6 = new xF.C0
            r6.<init>()
            r4.u(r6)
        L_0x00ab:
            nI.a r6 = (nI.C17631a) r6
            r4.P()
            r7 = r6
            goto L_0x00b3
        L_0x00b2:
            r7 = r8
        L_0x00b3:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00bf
            r6 = -1
            java.lang.String r8 = "com.sugarcube.app.base.ui.gallery.ProductListHeader (GalleryOverflowSheet.kt:951)"
            U0.C4895p.S(r3, r9, r6, r8)
        L_0x00bf:
            U0.I0 r3 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r3 = r4.Q(r3)
            android.content.Context r3 = (android.content.Context) r3
            android.content.res.Resources r3 = r3.getResources()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r8 = r37.iterator()
        L_0x00d6:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x00f8
            java.lang.Object r10 = r8.next()
            kF.D r10 = (kF.C14683D) r10
            lF.a r10 = r10.f()
            if (r10 == 0) goto L_0x00f1
            float r10 = r10.g()
            java.lang.Float r11 = java.lang.Float.valueOf(r10)
            goto L_0x00f2
        L_0x00f1:
            r11 = 0
        L_0x00f2:
            if (r11 == 0) goto L_0x00d6
            r6.add(r11)
            goto L_0x00d6
        L_0x00f8:
            float r6 = YH.C16877v.j1(r6)
            lF.a r31 = new lF.a
            java.lang.String r17 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r38.getCountry()
            java.lang.String r8 = "getCountry(...)"
            kotlin.jvm.internal.C17542s.i(r6, r8)
            java.lang.String r8 = r38.getLanguage()
            java.lang.String r10 = "getLanguage(...)"
            kotlin.jvm.internal.C17542s.i(r8, r10)
            r22 = 24
            r23 = 0
            r20 = 0
            r21 = 0
            r16 = r31
            r18 = r6
            r19 = r8
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            androidx.compose.ui.d$a r8 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r10 = r6.g()
            i1.c$a r13 = i1.C5437c.f24302a
            i1.c$b r12 = r13.k()
            r14 = 0
            E1.I r10 = androidx.compose.foundation.layout.C5080k.a(r10, r12, r4, r14)
            int r12 = U0.C4883j.a(r4, r14)
            U0.y r14 = r4.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r4, r8)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r11 = r17.a()
            U0.f r19 = r4.m()
            if (r19 != 0) goto L_0x0153
            U0.C4883j.c()
        L_0x0153:
            r4.I()
            boolean r19 = r4.i()
            if (r19 == 0) goto L_0x0160
            r4.p(r11)
            goto L_0x0163
        L_0x0160:
            r4.t()
        L_0x0163:
            U0.m r11 = U0.F1.a(r4)
            nI.p r15 = r17.c()
            U0.F1.c(r11, r10, r15)
            nI.p r10 = r17.e()
            U0.F1.c(r11, r14, r10)
            nI.p r10 = r17.b()
            boolean r14 = r11.i()
            if (r14 != 0) goto L_0x018d
            java.lang.Object r14 = r11.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
            boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r15)
            if (r14 != 0) goto L_0x019b
        L_0x018d:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            r11.u(r14)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.w(r12, r10)
        L_0x019b:
            nI.p r10 = r17.d()
            U0.F1.c(r11, r2, r10)
            s0.h r2 = s0.C5862h.f28810a
            r2 = 0
            r10 = 0
            r15 = 1
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.h(r8, r2, r15, r10)
            r12 = 25
            float r12 = (float) r12
            float r12 = c2.h.B(r12)
            r14 = 15
            float r14 = (float) r14
            float r10 = c2.h.B(r14)
            r15 = 12
            float r15 = (float) r15
            float r2 = c2.h.B(r15)
            float r0 = c2.h.B(r15)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.l(r11, r2, r12, r0, r10)
            androidx.compose.foundation.layout.d$f r2 = r6.d()
            i1.c$c r10 = r13.l()
            r11 = 6
            E1.I r2 = androidx.compose.foundation.layout.G.b(r2, r10, r4, r11)
            r10 = 0
            int r11 = U0.C4883j.a(r4, r10)
            U0.y r10 = r4.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r4, r0)
            nI.a r12 = r17.a()
            U0.f r16 = r4.m()
            if (r16 != 0) goto L_0x01ef
            U0.C4883j.c()
        L_0x01ef:
            r4.I()
            boolean r16 = r4.i()
            if (r16 == 0) goto L_0x01fc
            r4.p(r12)
            goto L_0x01ff
        L_0x01fc:
            r4.t()
        L_0x01ff:
            U0.m r12 = U0.F1.a(r4)
            nI.p r1 = r17.c()
            U0.F1.c(r12, r2, r1)
            nI.p r1 = r17.e()
            U0.F1.c(r12, r10, r1)
            nI.p r1 = r17.b()
            boolean r2 = r12.i()
            if (r2 != 0) goto L_0x0229
            java.lang.Object r2 = r12.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r10)
            if (r2 != 0) goto L_0x0237
        L_0x0229:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r12.u(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
            r12.w(r2, r1)
        L_0x0237:
            nI.p r1 = r17.d()
            U0.F1.c(r12, r0, r1)
            s0.N r24 = s0.C5843N.f28726a
            r28 = 2
            r29 = 0
            r26 = 1065353216(0x3f800000, float:1.0)
            r27 = 0
            r25 = r8
            androidx.compose.ui.d r0 = s0.C5842M.e(r24, r25, r26, r27, r28, r29)
            androidx.compose.foundation.layout.d$m r1 = r6.g()
            i1.c$b r2 = r13.k()
            r6 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r4, r6)
            int r2 = U0.C4883j.a(r4, r6)
            U0.y r6 = r4.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r4, r0)
            nI.a r10 = r17.a()
            U0.f r11 = r4.m()
            if (r11 != 0) goto L_0x0274
            U0.C4883j.c()
        L_0x0274:
            r4.I()
            boolean r11 = r4.i()
            if (r11 == 0) goto L_0x0281
            r4.p(r10)
            goto L_0x0284
        L_0x0281:
            r4.t()
        L_0x0284:
            U0.m r10 = U0.F1.a(r4)
            nI.p r11 = r17.c()
            U0.F1.c(r10, r1, r11)
            nI.p r1 = r17.e()
            U0.F1.c(r10, r6, r1)
            nI.p r1 = r17.b()
            boolean r6 = r10.i()
            if (r6 != 0) goto L_0x02ae
            java.lang.Object r6 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r11)
            if (r6 != 0) goto L_0x02bc
        L_0x02ae:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r10.u(r6)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r10.w(r2, r1)
        L_0x02bc:
            nI.p r1 = r17.d()
            U0.F1.c(r10, r0, r1)
            int r0 = OE.n.f113196E4
            java.lang.String r0 = r3.getString(r0)
            r6 = r0
            java.lang.String r1 = "getString(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)
            S1.C$a r0 = S1.C.f13316b
            S1.C r13 = r0.a()
            r0 = 18
            long r10 = c2.w.i(r0)
            r0 = 0
            r2 = 0
            rF.b r12 = rF.C15002a.a(r4, r2)
            long r16 = r12.f()
            r2 = r8
            r12 = r9
            r8 = r16
            r29 = 0
            r30 = 131026(0x1ffd2, float:1.83607E-40)
            r16 = 0
            r32 = r7
            r7 = r16
            r33 = r12
            r12 = r16
            r35 = r14
            r34 = 0
            r14 = r16
            r16 = 0
            r36 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 199680(0x30c00, float:2.79811E-40)
            r27 = r4
            I0.b1.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r4.x()
            java.lang.String r6 = r31.e()
            java.lang.String r7 = r31.d()
            java.lang.String r8 = r31.a()
            wK.t2 r9 = r31.c()
            wK.r2 r12 = r31.b()
            wK.h7 r10 = wK.C18349h7.Size600
            wK.i7 r13 = wK.C18361i7.SingleSize
            r24 = 32544(0x7f20, float:4.5604E-41)
            r11 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 12607488(0xc06000, float:1.7666854E-38)
            r21 = r4
            wK.C18540x6.f(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r4.x()
            float r6 = c2.h.B(r36)
            float r7 = c2.h.B(r35)
            float r8 = c2.h.B(r36)
            r9 = 40
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.l(r2, r7, r8, r6, r9)
            r6 = 1
            r7 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r2, r7, r6, r0)
            int r0 = OE.n.f113321Z3
            java.lang.String r0 = r3.getString(r0)
            kotlin.jvm.internal.C17542s.i(r0, r1)
            wK.l0$b r9 = wK.C18390l0.b.f151150b
            r1 = 1818853818(0x6c6981ba, float:1.1291693E27)
            r4.W(r1)
            r1 = r33
            r2 = r1 & 7168(0x1c00, float:1.0045E-41)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x0387
            r15 = r6
            goto L_0x0389
        L_0x0387:
            r15 = r34
        L_0x0389:
            java.lang.Object r2 = r4.D()
            if (r15 != 0) goto L_0x039b
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x0398
            goto L_0x039b
        L_0x0398:
            r3 = r32
            goto L_0x03a5
        L_0x039b:
            xF.D0 r2 = new xF.D0
            r3 = r32
            r2.<init>(r3)
            r4.u(r2)
        L_0x03a5:
            r15 = r2
            nI.a r15 = (nI.C17631a) r15
            r4.P()
            int r2 = wK.C18390l0.b.f151151c
            int r2 = r2 << 9
            r6 = 458752(0x70000, float:6.42848E-40)
            int r1 = r1 << 9
            r1 = r1 & r6
            r17 = r2 | r1
            r18 = 468(0x1d4, float:6.56E-43)
            r8 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r6 = r0
            r11 = r39
            r16 = r4
            wK.C18342h0.f(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03d1
            U0.C4895p.R()
        L_0x03d1:
            r8 = r3
        L_0x03d2:
            U0.Y0 r7 = r4.n()
            if (r7 == 0) goto L_0x03ec
            xF.E0 r9 = new xF.E0
            r0 = r9
            r1 = r37
            r2 = r38
            r3 = r39
            r4 = r8
            r5 = r42
            r6 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r9)
        L_0x03ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.d.L(KJ.c, java.util.Locale, boolean, nI.a, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N M() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C15987c cVar, Locale locale, boolean z10, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        L(cVar, locale, z10, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void q(boolean r33, com.sugarcube.core.network.models.Composition r34, nI.C17642l<? super com.sugarcube.core.network.models.Composition, XH.C16807N> r35, U0.C4889m r36, int r37) {
        /*
            r0 = r33
            r1 = r34
            r2 = r35
            r3 = r37
            r4 = 48
            r5 = 479105213(0x1c8e90bd, float:9.434186E-22)
            r6 = r36
            U0.m r15 = r6.k(r5)
            r14 = 6
            r6 = r3 & 6
            if (r6 != 0) goto L_0x0023
            boolean r6 = r15.b(r0)
            if (r6 == 0) goto L_0x0020
            r6 = 4
            goto L_0x0021
        L_0x0020:
            r6 = 2
        L_0x0021:
            r6 = r6 | r3
            goto L_0x0024
        L_0x0023:
            r6 = r3
        L_0x0024:
            r7 = r3 & 48
            if (r7 != 0) goto L_0x0034
            boolean r7 = r15.F(r1)
            if (r7 == 0) goto L_0x0031
            r7 = 32
            goto L_0x0033
        L_0x0031:
            r7 = 16
        L_0x0033:
            r6 = r6 | r7
        L_0x0034:
            r7 = r3 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0045
            boolean r7 = r15.F(r2)
            if (r7 == 0) goto L_0x0042
            r7 = r8
            goto L_0x0044
        L_0x0042:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r6 = r6 | r7
        L_0x0045:
            r7 = r6 & 147(0x93, float:2.06E-43)
            r9 = 146(0x92, float:2.05E-43)
            if (r7 != r9) goto L_0x0059
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0052
            goto L_0x0059
        L_0x0052:
            r15.L()
            r31 = r15
            goto L_0x02a5
        L_0x0059:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0065
            r7 = -1
            java.lang.String r9 = "com.sugarcube.app.base.ui.gallery.EditOnWeb (GalleryOverflowSheet.kt:901)"
            U0.C4895p.S(r5, r6, r7, r9)
        L_0x0065:
            U0.I0 r5 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            java.lang.Object r5 = r15.Q(r5)
            android.content.Context r5 = (android.content.Context) r5
            android.content.res.Resources r5 = r5.getResources()
            if (r0 == 0) goto L_0x029a
            androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
            androidx.compose.foundation.layout.d r23 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r23.g()
            i1.c$a r24 = i1.C5437c.f24302a
            i1.c$b r9 = r24.k()
            r12 = 0
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r9, r15, r12)
            int r9 = U0.C4883j.a(r15, r12)
            U0.y r10 = r15.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r15, r13)
            G1.g$a r25 = G1.C4504g.f6515W
            nI.a r12 = r25.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00a3
            U0.C4883j.c()
        L_0x00a3:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00b0
            r15.p(r12)
            goto L_0x00b3
        L_0x00b0:
            r15.t()
        L_0x00b3:
            U0.m r12 = U0.F1.a(r15)
            nI.p r14 = r25.c()
            U0.F1.c(r12, r7, r14)
            nI.p r7 = r25.e()
            U0.F1.c(r12, r10, r7)
            nI.p r7 = r25.b()
            boolean r10 = r12.i()
            if (r10 != 0) goto L_0x00dd
            java.lang.Object r10 = r12.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r10 = kotlin.jvm.internal.C17542s.e(r10, r14)
            if (r10 != 0) goto L_0x00eb
        L_0x00dd:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            r12.u(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r7)
        L_0x00eb:
            nI.p r7 = r25.d()
            U0.F1.c(r12, r11, r7)
            s0.h r7 = s0.C5862h.f28810a
            r7 = 12
            float r14 = (float) r7
            float r19 = c2.h.B(r14)
            r7 = 15
            float r12 = (float) r7
            float r17 = c2.h.B(r12)
            float r18 = c2.h.B(r14)
            r21 = 8
            r22 = 0
            r20 = 0
            r16 = r13
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r9 = 0
            r10 = 0
            r11 = 1
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r7, r9, r11, r10)
            int r9 = OE.n.f113428p
            java.lang.String r9 = r5.getString(r9)
            java.lang.String r10 = "getString(...)"
            kotlin.jvm.internal.C17542s.i(r9, r10)
            int r16 = com.sugarcube.common.R.drawable.sc_ic_hyperlink
            java.lang.Integer r16 = java.lang.Integer.valueOf(r16)
            r11 = 1469336562(0x57944bf2, float:3.26107807E14)
            r15.W(r11)
            boolean r11 = r15.F(r1)
            r6 = r6 & 896(0x380, float:1.256E-42)
            if (r6 != r8) goto L_0x013b
            r17 = 1
            goto L_0x013d
        L_0x013b:
            r17 = 0
        L_0x013d:
            r6 = r11 | r17
            java.lang.Object r8 = r15.D()
            if (r6 != 0) goto L_0x014d
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r8 != r6) goto L_0x0155
        L_0x014d:
            xF.F0 r8 = new xF.F0
            r8.<init>(r1, r2)
            r15.u(r8)
        L_0x0155:
            r17 = r8
            nI.a r17 = (nI.C17631a) r17
            r15.P()
            r18 = 0
            r19 = 444(0x1bc, float:6.22E-43)
            r8 = 0
            r11 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r27 = 0
            r6 = r9
            r9 = r11
            r11 = r10
            r10 = r20
            r31 = r11
            r11 = r21
            r20 = r12
            r12 = r16
            r36 = r13
            r13 = r22
            r21 = r14
            r14 = r27
            r32 = r15
            r15 = r17
            r16 = r32
            r17 = r18
            r18 = r19
            wK.C18342h0.f(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            float r19 = c2.h.B(r21)
            float r17 = c2.h.B(r20)
            float r18 = c2.h.B(r20)
            r21 = 8
            r20 = 0
            r16 = r36
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            i1.c$c r7 = r24.i()
            androidx.compose.foundation.layout.d$e r8 = r23.f()
            r15 = r32
            E1.I r4 = androidx.compose.foundation.layout.G.b(r8, r7, r15, r4)
            r7 = 0
            int r8 = U0.C4883j.a(r15, r7)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            nI.a r10 = r25.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x01ca
            U0.C4883j.c()
        L_0x01ca:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x01d7
            r15.p(r10)
            goto L_0x01da
        L_0x01d7:
            r15.t()
        L_0x01da:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r25.c()
            U0.F1.c(r10, r4, r11)
            nI.p r4 = r25.e()
            U0.F1.c(r10, r9, r4)
            nI.p r4 = r25.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x0204
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0212
        L_0x0204:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.w(r8, r4)
        L_0x0212:
            nI.p r4 = r25.d()
            U0.F1.c(r10, r6, r4)
            s0.N r4 = s0.C5843N.f28726a
            uK.c r4 = uK.C18148c.InformationCircle
            int r4 = r4.m()
            t1.c r6 = J1.e.c(r4, r15, r7)
            tK.v r4 = tK.C18030v.f147664a
            int r14 = tK.C18030v.f147665b
            tK.h r7 = r4.a(r15, r14)
            long r9 = r7.J0()
            r12 = 48
            r13 = 4
            java.lang.String r7 = ""
            r8 = 0
            r11 = r15
            I0.Y.a(r6, r7, r8, r9, r11, r12, r13)
            r6 = 8
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            r7 = r36
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.J.y(r7, r6)
            r7 = 6
            s0.C5844O.a(r6, r15, r7)
            int r6 = OE.n.f113384i4
            java.lang.String r5 = r5.getString(r6)
            r6 = r5
            r7 = r31
            kotlin.jvm.internal.C17542s.i(r5, r7)
            tK.w r5 = r4.b(r15, r14)
            tK.c r5 = r5.a()
            N1.Y r26 = r5.c()
            tK.h r4 = r4.a(r15, r14)
            long r8 = r4.J0()
            r29 = 0
            r30 = 65530(0xfffa, float:9.1827E-41)
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r4 = 0
            r31 = r15
            r15 = r4
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r28 = 0
            r27 = r31
            I0.b1.b(r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r31.x()
            r31.x()
            goto L_0x029c
        L_0x029a:
            r31 = r15
        L_0x029c:
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x02a5
            U0.C4895p.R()
        L_0x02a5:
            U0.Y0 r4 = r31.n()
            if (r4 == 0) goto L_0x02b3
            xF.G0 r5 = new xF.G0
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x02b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.d.q(boolean, com.sugarcube.core.network.models.Composition, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r(Composition composition, C17642l lVar) {
        if (composition != null) {
            lVar.invoke(composition);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(boolean z10, Composition composition, C17642l lVar, int i10, C4889m mVar, int i11) {
        q(z10, composition, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void t(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-235885942);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-235885942, i10, -1, "com.sugarcube.app.base.ui.gallery.LoadingView (GalleryOverflowSheet.kt:815)");
            }
            androidx.compose.ui.d i11 = D.i(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), h.B((float) 25));
            I b10 = G.b(C5073d.f18068a.b(), C5437c.f24302a.i(), k10, 54);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, i11);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
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
            F1.c(a12, b10, aVar.c());
            F1.c(a12, s10, aVar.e());
            p<C4504g, Integer, C16807N> b11 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar.d());
            C5843N n10 = C5843N.f28726a;
            X4.q((androidx.compose.ui.d) null, (J4) null, I4.Large, k10, 384, 3);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new B0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(int i10, C4889m mVar, int i11) {
        t(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v14, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void v(boolean r33, boolean r34, boolean r35, nI.C17642l<? super com.sugarcube.app.base.ui.gallery.i, XH.C16807N> r36, boolean r37, U0.C4889m r38, int r39) {
        /*
            r1 = r33
            r2 = r34
            r4 = r36
            r5 = r37
            r6 = r39
            r0 = 1630789379(0x6133df03, float:2.073773E20)
            r3 = r38
            U0.m r3 = r3.k(r0)
            r7 = r6 & 6
            if (r7 != 0) goto L_0x0022
            boolean r7 = r3.b(r1)
            if (r7 == 0) goto L_0x001f
            r7 = 4
            goto L_0x0020
        L_0x001f:
            r7 = 2
        L_0x0020:
            r7 = r7 | r6
            goto L_0x0023
        L_0x0022:
            r7 = r6
        L_0x0023:
            r8 = r6 & 48
            if (r8 != 0) goto L_0x0033
            boolean r8 = r3.b(r2)
            if (r8 == 0) goto L_0x0030
            r8 = 32
            goto L_0x0032
        L_0x0030:
            r8 = 16
        L_0x0032:
            r7 = r7 | r8
        L_0x0033:
            r8 = r6 & 384(0x180, float:5.38E-43)
            r15 = r35
            if (r8 != 0) goto L_0x0045
            boolean r8 = r3.b(r15)
            if (r8 == 0) goto L_0x0042
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x0044
        L_0x0042:
            r8 = 128(0x80, float:1.794E-43)
        L_0x0044:
            r7 = r7 | r8
        L_0x0045:
            r8 = r6 & 3072(0xc00, float:4.305E-42)
            if (r8 != 0) goto L_0x0055
            boolean r8 = r3.F(r4)
            if (r8 == 0) goto L_0x0052
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0054
        L_0x0052:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0054:
            r7 = r7 | r8
        L_0x0055:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0065
            boolean r8 = r3.b(r5)
            if (r8 == 0) goto L_0x0062
            r8 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0064
        L_0x0062:
            r8 = 8192(0x2000, float:1.14794E-41)
        L_0x0064:
            r7 = r7 | r8
        L_0x0065:
            r13 = r7
            r7 = r13 & 9363(0x2493, float:1.312E-41)
            r8 = 9362(0x2492, float:1.3119E-41)
            if (r7 != r8) goto L_0x0078
            boolean r7 = r3.l()
            if (r7 != 0) goto L_0x0073
            goto L_0x0078
        L_0x0073:
            r3.L()
            goto L_0x03cd
        L_0x0078:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x0084
            r7 = -1
            java.lang.String r8 = "com.sugarcube.app.base.ui.gallery.OverflowActions (GalleryOverflowSheet.kt:729)"
            U0.C4895p.S(r0, r13, r7, r8)
        L_0x0084:
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r7 = 0
            r8 = 0
            r12 = 1
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r0, r7, r12, r8)
            r8 = 8
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.i(r7, r8)
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            r11 = 12
            float r9 = (float) r11
            float r9 = c2.h.B(r9)
            androidx.compose.foundation.layout.d$f r8 = r8.n(r9)
            i1.c$a r9 = i1.C5437c.f24302a
            i1.c$c r9 = r9.l()
            r10 = 6
            E1.I r8 = androidx.compose.foundation.layout.G.b(r8, r9, r3, r10)
            r10 = 0
            int r9 = U0.C4883j.a(r3, r10)
            U0.y r11 = r3.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r3, r7)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r12 = r16.a()
            U0.f r17 = r3.m()
            if (r17 != 0) goto L_0x00cc
            U0.C4883j.c()
        L_0x00cc:
            r3.I()
            boolean r17 = r3.i()
            if (r17 == 0) goto L_0x00d9
            r3.p(r12)
            goto L_0x00dc
        L_0x00d9:
            r3.t()
        L_0x00dc:
            U0.m r12 = U0.F1.a(r3)
            nI.p r14 = r16.c()
            U0.F1.c(r12, r8, r14)
            nI.p r8 = r16.e()
            U0.F1.c(r12, r11, r8)
            nI.p r8 = r16.b()
            boolean r11 = r12.i()
            if (r11 != 0) goto L_0x0106
            java.lang.Object r11 = r12.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r9)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r14)
            if (r11 != 0) goto L_0x0114
        L_0x0106:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            r12.u(r11)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r12.w(r9, r8)
        L_0x0114:
            nI.p r8 = r16.d()
            U0.F1.c(r12, r7, r8)
            s0.N r24 = s0.C5843N.f28726a
            if (r1 == 0) goto L_0x020b
            r7 = 875358974(0x342ceafe, float:1.6104238E-7)
            r3.W(r7)
            r20 = 2
            r21 = 0
            r18 = 1065353216(0x3f800000, float:1.0)
            r19 = 0
            r16 = r24
            r17 = r0
            androidx.compose.ui.d r14 = s0.C5842M.e(r16, r17, r18, r19, r20, r21)
            int r7 = OE.n.f113372h
            java.lang.String r16 = J1.j.b(r7, r3, r10)
            wK.l0$f r17 = wK.C18390l0.f.f151159b
            r7 = 1967907707(0x754be37b, float:2.584595E32)
            r3.W(r7)
            r12 = r13 & 7168(0x1c00, float:1.0045E-41)
            r11 = 2048(0x800, float:2.87E-42)
            if (r12 != r11) goto L_0x014b
            r7 = 1
            goto L_0x014c
        L_0x014b:
            r7 = r10
        L_0x014c:
            java.lang.Object r8 = r3.D()
            if (r7 != 0) goto L_0x015a
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0162
        L_0x015a:
            xF.H0 r8 = new xF.H0
            r8.<init>(r4)
            r3.u(r8)
        L_0x0162:
            r9 = r8
            nI.a r9 = (nI.C17631a) r9
            r3.P()
            r18 = 0
            r19 = 1
            r7 = 0
            r10 = r3
            r20 = r11
            r11 = r18
            r26 = r12
            r21 = 1
            r12 = r19
            nI.a r18 = JF.C13113u.b(r7, r9, r10, r11, r12)
            int r7 = wK.C18390l0.f.f151160c
            int r19 = r7 << 9
            r22 = 500(0x1f4, float:7.0E-43)
            r9 = 0
            r11 = 0
            r12 = 0
            r23 = 0
            r27 = 0
            r28 = 0
            r7 = r16
            r8 = r14
            r10 = r17
            r14 = r13
            r13 = r23
            r29 = r14
            r14 = r27
            r15 = r28
            r16 = r18
            r17 = r3
            r18 = r19
            r19 = r22
            wK.C18342h0.f(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r19 = 2
            r20 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r15 = r24
            r16 = r0
            androidx.compose.ui.d r8 = s0.C5842M.e(r15, r16, r17, r18, r19, r20)
            int r0 = OE.n.f113263Q
            r15 = 0
            java.lang.String r7 = J1.j.b(r0, r3, r15)
            wK.l0$b r10 = wK.C18390l0.b.f151150b
            r0 = 1967919696(0x754c1250, float:2.586914E32)
            r3.W(r0)
            r0 = r26
            r14 = 2048(0x800, float:2.87E-42)
            if (r0 != r14) goto L_0x01cd
            r12 = r21
            goto L_0x01ce
        L_0x01cd:
            r12 = r15
        L_0x01ce:
            java.lang.Object r0 = r3.D()
            if (r12 != 0) goto L_0x01dc
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r0 != r9) goto L_0x01e4
        L_0x01dc:
            xF.t0 r0 = new xF.t0
            r0.<init>(r4)
            r3.u(r0)
        L_0x01e4:
            r16 = r0
            nI.a r16 = (nI.C17631a) r16
            r3.P()
            int r0 = wK.C18390l0.b.f151151c
            int r0 = r0 << 9
            r9 = 458752(0x70000, float:6.42848E-40)
            r11 = r29
            int r11 = r11 << 9
            r9 = r9 & r11
            r18 = r0 | r9
            r19 = 468(0x1d4, float:6.56E-43)
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r12 = r35
            r17 = r3
            wK.C18342h0.f(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.P()
            goto L_0x03c1
        L_0x020b:
            r15 = r10
            r11 = r13
            r14 = 2048(0x800, float:2.87E-42)
            r21 = 1
            r7 = 876131680(0x3438b560, float:1.7202319E-7)
            r3.W(r7)
            uK.c r7 = uK.C18148c.TrashCan
            int r13 = r7.m()
            wK.m3$e r19 = wK.C18405m3.e.f151246b
            int r7 = OE.n.f113365g
            java.lang.String r16 = J1.j.b(r7, r3, r15)
            r17 = r5 ^ 1
            r7 = 1967934106(0x754c4a9a, float:2.5897013E32)
            r3.W(r7)
            r12 = r11 & 7168(0x1c00, float:1.0045E-41)
            if (r12 != r14) goto L_0x0234
            r7 = r21
            goto L_0x0235
        L_0x0234:
            r7 = r15
        L_0x0235:
            java.lang.Object r8 = r3.D()
            if (r7 != 0) goto L_0x0243
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x024b
        L_0x0243:
            xF.u0 r8 = new xF.u0
            r8.<init>(r4)
            r3.u(r8)
        L_0x024b:
            r9 = r8
            nI.a r9 = (nI.C17631a) r9
            r3.P()
            r11 = 0
            r18 = 1
            r7 = 0
            r10 = r3
            r20 = 12
            r30 = r12
            r12 = r18
            nI.a r18 = JF.C13113u.b(r7, r9, r10, r11, r12)
            int r22 = wK.C18405m3.e.f151247c
            int r23 = r22 << 12
            r25 = 228(0xe4, float:3.2E-43)
            r9 = 0
            r12 = 0
            r26 = 0
            r27 = 0
            r7 = r13
            r8 = r16
            r10 = r17
            r11 = r19
            r13 = r26
            r14 = r27
            r15 = r18
            r16 = r3
            r17 = r23
            r18 = r25
            wK.C18357i3.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            uK.c r7 = uK.C18148c.Copy
            int r13 = r7.m()
            int r7 = OE.n.f113407m
            r15 = 0
            java.lang.String r14 = J1.j.b(r7, r3, r15)
            r16 = r5 ^ 1
            r7 = 1967948893(0x754c845d, float:2.5925615E32)
            r3.W(r7)
            r11 = r30
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 != r12) goto L_0x02a1
            r7 = r21
            goto L_0x02a2
        L_0x02a1:
            r7 = r15
        L_0x02a2:
            java.lang.Object r8 = r3.D()
            if (r7 != 0) goto L_0x02b0
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x02b8
        L_0x02b0:
            xF.v0 r8 = new xF.v0
            r8.<init>(r4)
            r3.u(r8)
        L_0x02b8:
            r9 = r8
            nI.a r9 = (nI.C17631a) r9
            r3.P()
            r17 = 0
            r18 = 1
            r7 = 0
            r10 = r3
            r31 = r11
            r11 = r17
            r1 = r12
            r12 = r18
            nI.a r17 = JF.C13113u.b(r7, r9, r10, r11, r12)
            int r18 = r22 << 12
            r23 = 228(0xe4, float:3.2E-43)
            r9 = 0
            r12 = 0
            r25 = 0
            r26 = 0
            r7 = r13
            r8 = r14
            r10 = r16
            r11 = r19
            r13 = r25
            r14 = r26
            r1 = r15
            r15 = r17
            r16 = r3
            r17 = r18
            r18 = r23
            wK.C18357i3.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            uK.c r7 = uK.C18148c.ArrowUpFromBase
            int r13 = r7.m()
            int r7 = OE.n.f113287U
            java.lang.String r14 = J1.j.b(r7, r3, r1)
            r15 = r5 ^ 1
            r7 = 1967963993(0x754cbf59, float:2.5954823E32)
            r3.W(r7)
            r12 = r31
            r7 = 2048(0x800, float:2.87E-42)
            if (r12 != r7) goto L_0x030d
            r7 = r21
            goto L_0x030e
        L_0x030d:
            r7 = r1
        L_0x030e:
            java.lang.Object r8 = r3.D()
            if (r7 != 0) goto L_0x031c
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r8 != r7) goto L_0x0324
        L_0x031c:
            xF.w0 r8 = new xF.w0
            r8.<init>(r4)
            r3.u(r8)
        L_0x0324:
            r9 = r8
            nI.a r9 = (nI.C17631a) r9
            r3.P()
            r11 = 0
            r16 = 1
            r7 = 0
            r10 = r3
            r32 = r12
            r12 = r16
            nI.a r16 = JF.C13113u.b(r7, r9, r10, r11, r12)
            int r17 = r22 << 12
            r18 = 228(0xe4, float:3.2E-43)
            r9 = 0
            r12 = 0
            r20 = 0
            r22 = 0
            r7 = r13
            r8 = r14
            r10 = r15
            r11 = r19
            r13 = r20
            r14 = r22
            r15 = r16
            r16 = r3
            wK.C18357i3.c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x03be
            r19 = 2
            r20 = 0
            r17 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            r15 = r24
            r16 = r0
            androidx.compose.ui.d r0 = s0.C5842M.e(r15, r16, r17, r18, r19, r20)
            int r7 = OE.n.f113421o
            java.lang.String r13 = J1.j.b(r7, r3, r1)
            wK.l0$d r14 = wK.C18390l0.d.f151153b
            r15 = r5 ^ 1
            r7 = 1967979456(0x754cfbc0, float:2.5984733E32)
            r3.W(r7)
            r8 = r32
            r7 = 2048(0x800, float:2.87E-42)
            if (r8 != r7) goto L_0x037d
            r12 = r21
            goto L_0x037e
        L_0x037d:
            r12 = r1
        L_0x037e:
            java.lang.Object r1 = r3.D()
            if (r12 != 0) goto L_0x038c
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r1 != r7) goto L_0x0394
        L_0x038c:
            xF.x0 r1 = new xF.x0
            r1.<init>(r4)
            r3.u(r1)
        L_0x0394:
            r9 = r1
            nI.a r9 = (nI.C17631a) r9
            r3.P()
            r11 = 0
            r12 = 1
            r7 = 0
            r10 = r3
            nI.a r16 = JF.C13113u.b(r7, r9, r10, r11, r12)
            int r1 = wK.C18390l0.d.f151154c
            int r18 = r1 << 9
            r19 = 496(0x1f0, float:6.95E-43)
            r11 = 0
            r12 = 0
            r1 = 0
            r17 = 0
            r20 = 0
            r7 = r13
            r8 = r0
            r9 = r15
            r10 = r14
            r13 = r1
            r14 = r17
            r15 = r20
            r17 = r3
            wK.C18342h0.f(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x03be:
            r3.P()
        L_0x03c1:
            r3.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03cd
            U0.C4895p.R()
        L_0x03cd:
            U0.Y0 r7 = r3.n()
            if (r7 == 0) goto L_0x03e8
            xF.y0 r8 = new xF.y0
            r0 = r8
            r1 = r33
            r2 = r34
            r3 = r35
            r4 = r36
            r5 = r37
            r6 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x03e8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.gallery.d.v(boolean, boolean, boolean, nI.l, boolean, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C17642l lVar) {
        lVar.invoke(i.b.f124422a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(C17642l lVar) {
        lVar.invoke(i.d.f124424a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N y(C17642l lVar) {
        lVar.invoke(i.e.f124425a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N z(C17642l lVar) {
        lVar.invoke(i.a.f124421a);
        return C16807N.f139792a;
    }
}
