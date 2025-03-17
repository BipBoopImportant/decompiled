package uG;

import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.t;
import XH.y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.decorate.v2.internal.ui.surface.a;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import l0.e;
import nI.C17642l;
import nI.p;
import nI.q;
import uG.C18048l;
import zG.C18748b;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001as\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aC\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\tj\u0002`\n\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u0002"}, d2 = {"LuG/l;", "uiState", "Lcom/sugarcube/core/network/models/RoomType;", "roomType", "Lkotlin/Function1;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "LXH/N;", "onItemSelected", "onBedDisclaimerClicked", "", "Lcom/sugarcube/app/base/ui/compose/util/ScrollDirection;", "onScrollDirection", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$c;", "onEvent", "i", "(LuG/l;Lcom/sugarcube/core/network/models/RoomType;LnI/l;LnI/l;LnI/l;LnI/l;LU0/m;I)V", "LzG/b;", "l", "(LuG/l;LnI/l;LnI/l;LU0/m;I)V", "", "showFilters", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: uG.i  reason: case insensitive filesystem */
public final class C18045i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseDrawerKt$BrowseDrawer$1$1", f = "BrowseDrawer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: uG.i$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f147709c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<a.C17123c, C16807N> f147710d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ RoomType f147711e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super a.C17123c, C16807N> lVar, RoomType roomType, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f147710d = lVar;
            this.f147711e = roomType;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f147710d, this.f147711e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f147709c == 0) {
                y.b(obj);
                this.f147710d.invoke(new a.C17123c.b(this.f147711e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uG.i$b */
    static final class b implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C18048l.b f147712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C18748b, C16807N> f147713b;

        b(C18048l.b bVar, C17642l<? super C18748b, C16807N> lVar) {
            this.f147712a = bVar;
            this.f147713b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N e(C17642l lVar, QuickFilter quickFilter) {
            C17542s.j(quickFilter, "selectedFilter");
            lVar.invoke(new C18748b.C4329b(quickFilter));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final String f(QuickFilter quickFilter) {
            C17542s.j(quickFilter, "it");
            String label = quickFilter.getLabel();
            return label == null ? "" : label;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void c(l0.e r10, U0.C4889m r11, int r12) {
            /*
                r9 = this;
                java.lang.String r0 = "$this$AnimatedVisibility"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x0014
                r10 = -1
                java.lang.String r0 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseDrawerContent.<anonymous>.<anonymous>.<anonymous> (BrowseDrawer.kt:99)"
                r1 = 527294372(0x1f6ddfa4, float:5.0371693E-20)
                U0.C4895p.S(r1, r12, r10, r0)
            L_0x0014:
                androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                r10 = 16
                float r10 = (float) r10
                float r3 = c2.h.B(r10)
                float r5 = c2.h.B(r10)
                r10 = 8
                float r10 = (float) r10
                float r6 = c2.h.B(r10)
                r7 = 2
                r8 = 0
                r4 = 0
                androidx.compose.ui.d r10 = androidx.compose.foundation.layout.D.m(r2, r3, r4, r5, r6, r7, r8)
                uG.l$b r12 = r9.f147712a
                nI.l<zG.b, XH.N> r0 = r9.f147713b
                androidx.compose.foundation.layout.d r1 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r1 = r1.g()
                i1.c$a r2 = i1.C5437c.f24302a
                i1.c$b r2 = r2.k()
                r3 = 0
                E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r11, r3)
                int r2 = U0.C4883j.a(r11, r3)
                U0.y r3 = r11.s()
                androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r11, r10)
                G1.g$a r4 = G1.C4504g.f6515W
                nI.a r5 = r4.a()
                U0.f r6 = r11.m()
                if (r6 != 0) goto L_0x005f
                U0.C4883j.c()
            L_0x005f:
                r11.I()
                boolean r6 = r11.i()
                if (r6 == 0) goto L_0x006c
                r11.p(r5)
                goto L_0x006f
            L_0x006c:
                r11.t()
            L_0x006f:
                U0.m r5 = U0.F1.a(r11)
                nI.p r6 = r4.c()
                U0.F1.c(r5, r1, r6)
                nI.p r1 = r4.e()
                U0.F1.c(r5, r3, r1)
                nI.p r1 = r4.b()
                boolean r3 = r5.i()
                if (r3 != 0) goto L_0x0099
                java.lang.Object r3 = r5.D()
                java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
                if (r3 != 0) goto L_0x00a7
            L_0x0099:
                java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                r5.u(r3)
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r5.w(r2, r1)
            L_0x00a7:
                nI.p r1 = r4.d()
                U0.F1.c(r5, r10, r1)
                s0.h r10 = s0.C5862h.f28810a
                KJ.c r1 = r12.d()
                com.sugarcube.core.network.models.QuickFilter r4 = r12.g()
                r10 = 794976844(0x2f62624c, float:2.0589502E-10)
                r11.W(r10)
                boolean r10 = r11.V(r0)
                java.lang.Object r12 = r11.D()
                if (r10 != 0) goto L_0x00d0
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r12 != r10) goto L_0x00d8
            L_0x00d0:
                uG.j r12 = new uG.j
                r12.<init>(r0)
                r11.u(r12)
            L_0x00d8:
                r2 = r12
                nI.l r2 = (nI.C17642l) r2
                r11.P()
                r10 = 794982300(0x2f62779c, float:2.0597074E-10)
                r11.W(r10)
                java.lang.Object r10 = r11.D()
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r10 != r12) goto L_0x00f8
                uG.k r10 = new uG.k
                r10.<init>()
                r11.u(r10)
            L_0x00f8:
                r5 = r10
                nI.l r5 = (nI.C17642l) r5
                r11.P()
                r7 = 24576(0x6000, float:3.4438E-41)
                r8 = 4
                r3 = 0
                r6 = r11
                wG.C18211d.d(r1, r2, r3, r4, r5, r6, r7, r8)
                r11.x()
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x0112
                U0.C4895p.R()
            L_0x0112:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uG.C18045i.b.c(l0.e, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void i(C18048l lVar, RoomType roomType, C17642l<? super CachedCatalogItem, C16807N> lVar2, C17642l<? super CachedCatalogItem, C16807N> lVar3, C17642l<? super Integer, C16807N> lVar4, C17642l<? super a.C17123c, C16807N> lVar5, C4889m mVar, int i10) {
        int i11;
        C18048l lVar6 = lVar;
        RoomType roomType2 = roomType;
        C17642l<? super CachedCatalogItem, C16807N> lVar7 = lVar2;
        C17642l<? super CachedCatalogItem, C16807N> lVar8 = lVar3;
        C17642l<? super Integer, C16807N> lVar9 = lVar4;
        C17642l<? super a.C17123c, C16807N> lVar10 = lVar5;
        int i12 = i10;
        C17542s.j(lVar6, "uiState");
        C17542s.j(roomType2, "roomType");
        C17542s.j(lVar7, "onItemSelected");
        C17542s.j(lVar8, "onBedDisclaimerClicked");
        C17542s.j(lVar9, "onScrollDirection");
        C17542s.j(lVar10, "onEvent");
        C4889m k10 = mVar.k(1792520644);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(lVar6) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(roomType2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar7) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar8) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar9) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(lVar10) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1792520644, i11, -1, "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseDrawer (BrowseDrawer.kt:52)");
            }
            C18048l.b bVar = lVar6 instanceof C18048l.b ? (C18048l.b) lVar6 : null;
            QuickFilter g10 = bVar != null ? bVar.g() : null;
            k10.W(215961631);
            int i13 = 458752 & i11;
            boolean z10 = false;
            int i14 = i11 & 112;
            boolean z11 = (i13 == 131072) | (i14 == 32);
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                D10 = new a(lVar10, roomType2, (C17164e<? super a>) null);
                k10.u(D10);
            }
            k10.P();
            P.f(roomType2, g10, (p) D10, k10, (i11 >> 3) & 14);
            k10.W(215968498);
            boolean z12 = (i13 == 131072) | ((i11 & 896) == 256) | (i14 == 32);
            if ((i11 & 7168) == 2048) {
                z10 = true;
            }
            boolean z13 = z12 | z10;
            Object D11 = k10.D();
            if (z13 || D11 == C4889m.f14007a.a()) {
                D11 = new C18037a(lVar10, lVar7, roomType2, lVar8);
                k10.u(D11);
            }
            k10.P();
            l(lVar6, lVar9, (C17642l) D11, k10, (i11 & 14) | ((i11 >> 9) & 112));
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18038b(lVar, roomType, lVar2, lVar3, lVar4, lVar5, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C17642l lVar, C17642l lVar2, RoomType roomType, C17642l lVar3, C18748b bVar) {
        C17542s.j(bVar, "event");
        if (bVar instanceof C18748b.C4329b) {
            lVar.invoke(new a.C17123c.C3477a(((C18748b.C4329b) bVar).a()));
        } else if (bVar instanceof C18748b.c) {
            lVar2.invoke(((C18748b.c) bVar).a());
        } else if (C17542s.e(bVar, C18748b.d.f152769a)) {
            lVar.invoke(new a.C17123c.C3478c(roomType));
        } else if (bVar instanceof C18748b.a) {
            lVar3.invoke(((C18748b.a) bVar).a());
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N k(C18048l lVar, RoomType roomType, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17642l lVar5, int i10, C4889m mVar, int i11) {
        i(lVar, roomType, lVar2, lVar3, lVar4, lVar5, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void l(uG.C18048l r25, nI.C17642l<? super java.lang.Integer, XH.C16807N> r26, nI.C17642l<? super zG.C18748b, XH.C16807N> r27, U0.C4889m r28, int r29) {
        /*
            r0 = r25
            r15 = r26
            r14 = r27
            r13 = r29
            r1 = 379522552(0x169f0df8, float:2.569665E-25)
            r2 = r28
            U0.m r12 = r2.k(r1)
            r2 = r13 & 6
            if (r2 != 0) goto L_0x0020
            boolean r2 = r12.V(r0)
            if (r2 == 0) goto L_0x001d
            r2 = 4
            goto L_0x001e
        L_0x001d:
            r2 = 2
        L_0x001e:
            r2 = r2 | r13
            goto L_0x0021
        L_0x0020:
            r2 = r13
        L_0x0021:
            r3 = r13 & 48
            if (r3 != 0) goto L_0x0031
            boolean r3 = r12.F(r15)
            if (r3 == 0) goto L_0x002e
            r3 = 32
            goto L_0x0030
        L_0x002e:
            r3 = 16
        L_0x0030:
            r2 = r2 | r3
        L_0x0031:
            r3 = r13 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x0041
            boolean r3 = r12.F(r14)
            if (r3 == 0) goto L_0x003e
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x0040
        L_0x003e:
            r3 = 128(0x80, float:1.794E-43)
        L_0x0040:
            r2 = r2 | r3
        L_0x0041:
            r10 = r2
            r2 = r10 & 147(0x93, float:2.06E-43)
            r3 = 146(0x92, float:2.05E-43)
            if (r2 != r3) goto L_0x0055
            boolean r2 = r12.l()
            if (r2 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            r12.L()
            r8 = r12
            goto L_0x02db
        L_0x0055:
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x0061
            r2 = -1
            java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.catalog.ui.catalog.browse.BrowseDrawerContent (BrowseDrawer.kt:89)"
            U0.C4895p.S(r1, r10, r2, r3)
        L_0x0061:
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 1108010755(0x420ae703, float:34.725597)
            r12.W(r3)
            java.lang.Object r3 = r12.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r4 = r16.a()
            if (r3 != r4) goto L_0x007e
            uG.c r3 = new uG.c
            r3.<init>()
            r12.u(r3)
        L_0x007e:
            r5 = r3
            nI.a r5 = (nI.C17631a) r5
            r12.P()
            r7 = 3072(0xc00, float:4.305E-42)
            r8 = 6
            r3 = 0
            r4 = 0
            r6 = r12
            java.lang.Object r2 = f1.C5301c.e(r2, r3, r4, r5, r6, r7, r8)
            r9 = r2
            U0.r0 r9 = (U0.C4899r0) r9
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r3 = 0
            r8 = 1
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.f(r2, r3, r8, r4)
            rF.b r2 = rF.C15002a.a(r12, r1)
            long r18 = r2.p()
            r21 = 2
            r22 = 0
            r20 = 0
            androidx.compose.ui.d r2 = androidx.compose.foundation.b.d(r17, r18, r20, r21, r22)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r3 = r3.g()
            i1.c$a r5 = i1.C5437c.f24302a
            i1.c$b r5 = r5.k()
            E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r5, r12, r1)
            int r5 = U0.C4883j.a(r12, r1)
            U0.y r6 = r12.s()
            androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r12, r2)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r4 = r7.a()
            U0.f r17 = r12.m()
            if (r17 != 0) goto L_0x00d6
            U0.C4883j.c()
        L_0x00d6:
            r12.I()
            boolean r17 = r12.i()
            if (r17 == 0) goto L_0x00e3
            r12.p(r4)
            goto L_0x00e6
        L_0x00e3:
            r12.t()
        L_0x00e6:
            U0.m r4 = U0.F1.a(r12)
            nI.p r11 = r7.c()
            U0.F1.c(r4, r3, r11)
            nI.p r3 = r7.e()
            U0.F1.c(r4, r6, r3)
            nI.p r3 = r7.b()
            boolean r6 = r4.i()
            if (r6 != 0) goto L_0x0110
            java.lang.Object r6 = r4.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r11)
            if (r6 != 0) goto L_0x011e
        L_0x0110:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r4.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.w(r5, r3)
        L_0x011e:
            nI.p r3 = r7.d()
            U0.F1.c(r4, r2, r3)
            s0.h r2 = s0.C5862h.f28810a
            boolean r11 = r0 instanceof uG.C18048l.b
            if (r11 == 0) goto L_0x012f
            r4 = r0
            uG.l$b r4 = (uG.C18048l.b) r4
            goto L_0x0130
        L_0x012f:
            r4 = 0
        L_0x0130:
            r3 = 776885593(0x2e4e5559, float:4.691478E-11)
            r12.W(r3)
            if (r4 != 0) goto L_0x0141
            r21 = r8
            r23 = r9
            r24 = r10
            r17 = r11
            goto L_0x016e
        L_0x0141:
            boolean r3 = s(r9)
            uG.i$b r5 = new uG.i$b
            r5.<init>(r4, r14)
            r4 = 54
            r6 = 527294372(0x1f6ddfa4, float:5.0371693E-20)
            c1.a r18 = c1.c.e(r6, r8, r5, r12, r4)
            r19 = 1572870(0x180006, float:2.20406E-39)
            r20 = 30
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r21 = r8
            r8 = r18
            r23 = r9
            r9 = r12
            r24 = r10
            r10 = r19
            r17 = r11
            r11 = r20
            l0.d.e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x016e:
            r12.P()
            if (r17 == 0) goto L_0x02a9
            r2 = -1685510570(0xffffffff9b892656, float:-2.2689523E-22)
            r12.W(r2)
            r2 = r0
            uG.l$b r2 = (uG.C18048l.b) r2
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x019a
            r2 = -1685480097(0xffffffff9b899d5f, float:-2.2766447E-22)
            r12.W(r2)
            rF.b r2 = rF.C15002a.a(r12, r1)
            long r2 = r2.p()
            zG.l.b(r2, r12, r1)
            r12.P()
            r28 = r12
            goto L_0x02a3
        L_0x019a:
            r3 = -1685253456(0xffffffff9b8d12b0, float:-2.333857E-22)
            r12.W(r3)
            java.util.List r3 = r2.e()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01c7
            r2 = -1685236933(0xffffffff9b8d533b, float:-2.338028E-22)
            r12.W(r2)
            int r2 = OE.n.f113193E1
            rF.b r1 = rF.C15002a.a(r12, r1)
            long r3 = r1.p()
            r6 = 0
            r7 = 0
            r5 = r12
            zG.h.c(r2, r3, r5, r6, r7)
            r12.P()
            r28 = r12
            goto L_0x02a0
        L_0x01c7:
            r3 = -1684895561(0xffffffff9b9288b7, float:-2.4242024E-22)
            r12.W(r3)
            java.util.List r3 = r2.e()
            boolean r4 = r2.i()
            java.lang.String r5 = r2.c()
            java.lang.String r6 = r2.f()
            r2 = 776952947(0x2e4f5c73, float:4.7148462E-11)
            r12.W(r2)
            r2 = r24
            r7 = r2 & 896(0x380, float:1.256E-42)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != r8) goto L_0x01ee
            r9 = r21
            goto L_0x01ef
        L_0x01ee:
            r9 = r1
        L_0x01ef:
            java.lang.Object r10 = r12.D()
            if (r9 != 0) goto L_0x01fb
            java.lang.Object r9 = r16.a()
            if (r10 != r9) goto L_0x0203
        L_0x01fb:
            uG.d r10 = new uG.d
            r10.<init>(r14)
            r12.u(r10)
        L_0x0203:
            r9 = r10
            nI.a r9 = (nI.C17631a) r9
            r12.P()
            r10 = 776941457(0x2e4f2f91, float:4.71086E-11)
            r12.W(r10)
            if (r7 != r8) goto L_0x0214
            r10 = r21
            goto L_0x0215
        L_0x0214:
            r10 = r1
        L_0x0215:
            java.lang.Object r11 = r12.D()
            if (r10 != 0) goto L_0x0221
            java.lang.Object r10 = r16.a()
            if (r11 != r10) goto L_0x0229
        L_0x0221:
            uG.e r11 = new uG.e
            r11.<init>(r14)
            r12.u(r11)
        L_0x0229:
            r10 = r11
            nI.l r10 = (nI.C17642l) r10
            r12.P()
            r11 = 776947561(0x2e4f4769, float:4.7129776E-11)
            r12.W(r11)
            if (r7 != r8) goto L_0x0239
            r1 = r21
        L_0x0239:
            java.lang.Object r7 = r12.D()
            if (r1 != 0) goto L_0x0245
            java.lang.Object r1 = r16.a()
            if (r7 != r1) goto L_0x024d
        L_0x0245:
            uG.f r7 = new uG.f
            r7.<init>(r14)
            r12.u(r7)
        L_0x024d:
            r11 = r7
            nI.l r11 = (nI.C17642l) r11
            r12.P()
            r1 = 776957925(0x2e4f6fe5, float:4.7165733E-11)
            r12.W(r1)
            r1 = r23
            boolean r7 = r12.V(r1)
            java.lang.Object r8 = r12.D()
            if (r7 != 0) goto L_0x026b
            java.lang.Object r7 = r16.a()
            if (r8 != r7) goto L_0x0273
        L_0x026b:
            uG.g r8 = new uG.g
            r8.<init>(r1)
            r12.u(r8)
        L_0x0273:
            r16 = r8
            nI.l r16 = (nI.C17642l) r16
            r12.P()
            int r1 = r2 << 24
            r2 = 1879048192(0x70000000, float:1.58456325E29)
            r17 = r1 & r2
            r18 = 0
            r19 = 144(0x90, float:2.02E-43)
            r7 = 0
            r8 = 0
            r1 = r3
            r2 = r4
            r3 = r5
            r4 = r6
            r5 = r7
            r6 = r9
            r7 = r10
            r9 = r11
            r10 = r26
            r11 = r16
            r28 = r12
            r13 = r17
            r14 = r18
            r15 = r19
            AG.C15394b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r28.P()
        L_0x02a0:
            r28.P()
        L_0x02a3:
            r28.P()
            r8 = r28
            goto L_0x02cf
        L_0x02a9:
            r28 = r12
            boolean r2 = r0 instanceof uG.C18048l.a
            if (r2 == 0) goto L_0x02f0
            r2 = -1683894478(0xffffffff9ba1cf32, float:-2.6769113E-22)
            r8 = r28
            r8.W(r2)
            r2 = r0
            uG.l$a r2 = (uG.C18048l.a) r2
            int r2 = r2.a()
            rF.b r1 = rF.C15002a.a(r8, r1)
            long r3 = r1.p()
            r6 = 0
            r7 = 0
            r5 = r8
            zG.h.c(r2, r3, r5, r6, r7)
            r8.P()
        L_0x02cf:
            r8.x()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x02db
            U0.C4895p.R()
        L_0x02db:
            U0.Y0 r1 = r8.n()
            if (r1 == 0) goto L_0x02ef
            uG.h r2 = new uG.h
            r3 = r26
            r4 = r27
            r5 = r29
            r2.<init>(r0, r3, r4, r5)
            r1.a(r2)
        L_0x02ef:
            return
        L_0x02f0:
            r8 = r28
            r0 = 776911134(0x2e4eb91e, float:4.7003394E-11)
            r8.W(r0)
            r8.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uG.C18045i.l(uG.l, nI.l, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N m(C17642l lVar) {
        lVar.invoke(C18748b.d.f152769a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N n(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "selectedItem");
        lVar.invoke(new C18748b.c(cachedCatalogItem));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C17642l lVar, CachedCatalogItem cachedCatalogItem) {
        C17542s.j(cachedCatalogItem, "item");
        lVar.invoke(new C18748b.a(cachedCatalogItem));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C4899r0 r0Var, boolean z10) {
        t(r0Var, z10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C18048l lVar, C17642l lVar2, C17642l lVar3, int i10, C4889m mVar, int i11) {
        l(lVar, lVar2, lVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C4899r0 r() {
        return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
    }

    private static final boolean s(C4899r0<Boolean> r0Var) {
        return r0Var.getValue().booleanValue();
    }

    private static final void t(C4899r0<Boolean> r0Var, boolean z10) {
        r0Var.setValue(Boolean.valueOf(z10));
    }
}
