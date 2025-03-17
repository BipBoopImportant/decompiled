package YG;

import E1.I;
import FG.p;
import G1.C4504g;
import QJ.Q;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.decorate.v2.internal.ui.surface.a;
import dI.C17164e;
import eI.C17187b;
import i1.C5437c;
import kF.C14689J;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import lF.C14768a;
import n0.C5607m;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import p0.s;
import p1.C5747v0;
import p1.i1;
import s0.C5834E;
import t0.C5934A;
import t0.C5935B;
import t0.C5937b;
import t0.C5938c;
import t0.x;
import tK.C18030v;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\r\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00152\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0019\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u001a\u0010\u001b\u001aO\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u001c2\u0018\u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u00152\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0003¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"LYG/l;", "state", "Landroidx/compose/ui/d;", "modifier", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "cachedCatalogItem", "Lkotlin/Function1;", "", "LlF/a;", "getFormattedPrice", "Lcom/sugarcube/decorate/v2/internal/ui/surface/a$f0;", "LXH/N;", "onEvent", "t", "(LYG/l;Landroidx/compose/ui/d;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;LnI/l;LnI/l;LU0/m;II)V", "LFG/p$b;", "colorVariants", "LFG/p$d;", "sizeVariants", "LFG/p$a;", "bedBaseVariants", "Lkotlin/Function2;", "Lcom/sugarcube/core/network/models/CatalogItem;", "", "onVariantSelected", "isLoading", "k", "(LFG/p$b;LFG/p$d;LFG/p$a;LnI/p;LnI/l;ZLU0/m;I)V", "LFG/p;", "n", "(LFG/p;LnI/p;Landroidx/compose/ui/d;LnI/l;LU0/m;II)V", "v2_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p.b f140389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nI.p<CatalogItem, Boolean, C16807N> f140390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C14768a> f140391c;

        a(p.b bVar, nI.p<? super CatalogItem, ? super Boolean, C16807N> pVar, C17642l<? super Float, C14768a> lVar) {
            this.f140389a = bVar;
            this.f140390b = pVar;
            this.f140391c = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2007928608, i10, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantListSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VariantsStripe.kt:140)");
                }
                k.n(this.f140389a, this.f140390b, (androidx.compose.ui.d) null, this.f140391c, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p.d f140392a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nI.p<CatalogItem, Boolean, C16807N> f140393b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C14768a> f140394c;

        b(p.d dVar, nI.p<? super CatalogItem, ? super Boolean, C16807N> pVar, C17642l<? super Float, C14768a> lVar) {
            this.f140392a = dVar;
            this.f140393b = pVar;
            this.f140394c = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1903396905, i10, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantListSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VariantsStripe.kt:151)");
                }
                k.n(this.f140392a, this.f140393b, (androidx.compose.ui.d) null, this.f140394c, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p.a f140395a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ nI.p<CatalogItem, Boolean, C16807N> f140396b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Float, C14768a> f140397c;

        c(p.a aVar, nI.p<? super CatalogItem, ? super Boolean, C16807N> pVar, C17642l<? super Float, C14768a> lVar) {
            this.f140395a = aVar;
            this.f140396b = pVar;
            this.f140397c = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(91567847, i10, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantListSection.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (VariantsStripe.kt:162)");
                }
                k.n(this.f140395a, this.f140396b, (androidx.compose.ui.d) null, this.f140397c, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantsStripeKt$VariantsStripe$2$1", f = "VariantsStripe.kt", l = {}, m = "invokeSuspend")
    static final class d extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f140398c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<a.f0, C16807N> f140399d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CachedCatalogItem f140400e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C17642l<? super a.f0, C16807N> lVar, CachedCatalogItem cachedCatalogItem, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f140399d = lVar;
            this.f140400e = cachedCatalogItem;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f140399d, this.f140400e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f140398c == 0) {
                y.b(obj);
                this.f140399d.invoke(new a.f0.C3479a(this.f140400e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    private static final void k(p.b bVar, p.d dVar, p.a aVar, nI.p<? super CatalogItem, ? super Boolean, C16807N> pVar, C17642l<? super Float, C14768a> lVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        long l02;
        p.b bVar2 = bVar;
        p.d dVar2 = dVar;
        p.a aVar2 = aVar;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(2069061173);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(dVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        nI.p<? super CatalogItem, ? super Boolean, C16807N> pVar2 = pVar;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17642l<? super Float, C14768a> lVar2 = lVar;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.b(z11) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2069061173, i11, -1, "com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantListSection (VariantsStripe.kt:119)");
            }
            C5934A c10 = C5935B.c(0, 0, k10, 0, 3);
            if (C5607m.a(k10, 0)) {
                k10.W(268699710);
                l02 = C18030v.f147664a.a(k10, C18030v.f147665b).k0();
            } else {
                k10.W(268700734);
                l02 = C18030v.f147664a.a(k10, C18030v.f147665b).l0();
            }
            k10.P();
            long j10 = l02;
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            C5437c.a aVar4 = C5437c.f24302a;
            I h10 = C5077h.h(aVar4.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar3);
            C4504g.a aVar5 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar5.a();
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
            F1.c(a12, h10, aVar5.c());
            F1.c(a12, s10, aVar5.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar5.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar5.d());
            C5079j jVar = C5079j.f18125a;
            androidx.compose.ui.d d10 = J.d(androidx.compose.foundation.b.d(J.y(aVar3, h.B((float) 100)), C5747v0.o(j10, 0.7f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (i1) null, 2, (Object) null), 0.0f, 1, (Object) null);
            C5834E b11 = D.b(h.B((float) 8), h.B((float) 16));
            C5437c.b g10 = aVar4.g();
            k10.W(915867893);
            boolean F10 = k10.F(bVar2) | ((i11 & 7168) == 2048) | ((i11 & 57344) == 16384) | k10.F(dVar2) | k10.F(aVar2);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                d dVar3 = r0;
                d dVar4 = new d(bVar, dVar, aVar, pVar, lVar);
                k10.u(dVar3);
                D10 = dVar3;
            }
            k10.P();
            d.a aVar6 = aVar3;
            C5079j jVar2 = jVar;
            mVar2 = k10;
            C5937b.a(d10, c10, b11, false, (C5073d.m) null, g10, (s) null, false, (C17642l) D10, mVar2, 196992, 216);
            mVar2.W(915900152);
            if (z11) {
                C14689J.b(jVar2.a(J.h(aVar6, 0.0f, 1, (Object) null), aVar4.b()), mVar2, 0, 0);
            }
            mVar2.P();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new e(bVar, dVar, aVar, pVar, lVar, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(p.b bVar, p.d dVar, p.a aVar, nI.p pVar, C17642l lVar, x xVar) {
        C17542s.j(xVar, "$this$LazyColumn");
        if (bVar != null) {
            x.i(xVar, (Object) null, (Object) null, c1.c.c(2007928608, true, new a(bVar, pVar, lVar)), 3, (Object) null);
        }
        if (dVar != null) {
            x.i(xVar, (Object) null, (Object) null, c1.c.c(1903396905, true, new b(dVar, pVar, lVar)), 3, (Object) null);
        }
        if (aVar != null) {
            x.i(xVar, (Object) null, (Object) null, c1.c.c(91567847, true, new c(aVar, pVar, lVar)), 3, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N m(p.b bVar, p.d dVar, p.a aVar, nI.p pVar, C17642l lVar, boolean z10, int i10, C4889m mVar, int i11) {
        k(bVar, dVar, aVar, pVar, lVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: nI.a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void n(FG.p r67, nI.p<? super com.sugarcube.core.network.models.CatalogItem, ? super java.lang.Boolean, XH.C16807N> r68, androidx.compose.ui.d r69, nI.C17642l<? super java.lang.Float, lF.C14768a> r70, U0.C4889m r71, int r72, int r73) {
        /*
            r1 = r67
            r2 = r68
            r4 = r70
            r5 = r72
            r0 = 8
            r3 = 2
            r6 = 48
            r7 = 6
            r8 = -538786204(0xffffffffdfe2c664, float:-3.2681716E19)
            r9 = r71
            U0.m r15 = r9.k(r8)
            r13 = 1
            r9 = r73 & 1
            r14 = 4
            if (r9 == 0) goto L_0x0020
            r9 = r5 | 6
            goto L_0x0030
        L_0x0020:
            r9 = r5 & 6
            if (r9 != 0) goto L_0x002f
            boolean r9 = r15.F(r1)
            if (r9 == 0) goto L_0x002c
            r9 = r14
            goto L_0x002d
        L_0x002c:
            r9 = r3
        L_0x002d:
            r9 = r9 | r5
            goto L_0x0030
        L_0x002f:
            r9 = r5
        L_0x0030:
            r3 = r73 & 2
            if (r3 == 0) goto L_0x0036
            r9 = r9 | r6
            goto L_0x0046
        L_0x0036:
            r3 = r5 & 48
            if (r3 != 0) goto L_0x0046
            boolean r3 = r15.F(r2)
            if (r3 == 0) goto L_0x0043
            r3 = 32
            goto L_0x0045
        L_0x0043:
            r3 = 16
        L_0x0045:
            r9 = r9 | r3
        L_0x0046:
            r3 = r73 & 4
            if (r3 == 0) goto L_0x004f
            r9 = r9 | 384(0x180, float:5.38E-43)
        L_0x004c:
            r10 = r69
            goto L_0x0061
        L_0x004f:
            r10 = r5 & 384(0x180, float:5.38E-43)
            if (r10 != 0) goto L_0x004c
            r10 = r69
            boolean r12 = r15.V(r10)
            if (r12 == 0) goto L_0x005e
            r12 = 256(0x100, float:3.59E-43)
            goto L_0x0060
        L_0x005e:
            r12 = 128(0x80, float:1.794E-43)
        L_0x0060:
            r9 = r9 | r12
        L_0x0061:
            r12 = r73 & 8
            if (r12 == 0) goto L_0x0069
            r9 = r9 | 3072(0xc00, float:4.305E-42)
        L_0x0067:
            r12 = r9
            goto L_0x007a
        L_0x0069:
            r12 = r5 & 3072(0xc00, float:4.305E-42)
            if (r12 != 0) goto L_0x0067
            boolean r12 = r15.F(r4)
            if (r12 == 0) goto L_0x0076
            r12 = 2048(0x800, float:2.87E-42)
            goto L_0x0078
        L_0x0076:
            r12 = 1024(0x400, float:1.435E-42)
        L_0x0078:
            r9 = r9 | r12
            goto L_0x0067
        L_0x007a:
            r9 = r12 & 1171(0x493, float:1.641E-42)
            r11 = 1170(0x492, float:1.64E-42)
            if (r9 != r11) goto L_0x008e
            boolean r9 = r15.l()
            if (r9 != 0) goto L_0x0087
            goto L_0x008e
        L_0x0087:
            r15.L()
            r3 = r10
            r8 = r15
            goto L_0x0480
        L_0x008e:
            if (r3 == 0) goto L_0x0093
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            goto L_0x0094
        L_0x0093:
            r3 = r10
        L_0x0094:
            boolean r9 = U0.C4895p.J()
            if (r9 == 0) goto L_0x00a0
            r9 = -1
            java.lang.String r10 = "com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantListSubSection (VariantsStripe.kt:187)"
            U0.C4895p.S(r8, r12, r9, r10)
        L_0x00a0:
            java.util.List r8 = r67.i()
            java.util.Collection r8 = (java.util.Collection) r8
            if (r8 == 0) goto L_0x00ae
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L_0x00b1
        L_0x00ae:
            r8 = r15
            goto L_0x04a9
        L_0x00b1:
            i1.c$a r8 = i1.C5437c.f24302a
            i1.c$b r9 = r8.g()
            androidx.compose.foundation.layout.d r11 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r10 = r11.g()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r10, r9, r15, r6)
            r9 = 0
            int r10 = U0.C4883j.a(r15, r9)
            U0.y r14 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r3)
            G1.g$a r34 = G1.C4504g.f6515W
            nI.a r9 = r34.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00dd
            U0.C4883j.c()
        L_0x00dd:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00ea
            r15.p(r9)
            goto L_0x00ed
        L_0x00ea:
            r15.t()
        L_0x00ed:
            U0.m r9 = U0.F1.a(r15)
            nI.p r13 = r34.c()
            U0.F1.c(r9, r6, r13)
            nI.p r6 = r34.e()
            U0.F1.c(r9, r14, r6)
            nI.p r6 = r34.b()
            boolean r13 = r9.i()
            if (r13 != 0) goto L_0x0117
            java.lang.Object r13 = r9.D()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r10)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r14)
            if (r13 != 0) goto L_0x0125
        L_0x0117:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r9.u(r13)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r9.w(r10, r6)
        L_0x0125:
            nI.p r6 = r34.d()
            U0.F1.c(r9, r7, r6)
            s0.h r6 = s0.C5862h.f28810a
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            float r0 = (float) r0
            float r0 = c2.h.B(r0)
            r7 = 0
            r9 = 0
            r13 = 1
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.k(r6, r7, r0, r13, r9)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.h(r0, r7, r13, r9)
            int r0 = r67.h()
            r7 = 0
            java.lang.String r9 = J1.j.b(r0, r15, r7)
            r0 = r7
            Y1.j$a r7 = Y1.j.f14783b
            int r7 = r7.a()
            tK.v r14 = tK.C18030v.f147664a
            int r13 = tK.C18030v.f147665b
            tK.w r16 = r14.b(r15, r13)
            tK.c r16 = r16.a()
            N1.Y r35 = r16.c()
            r16 = 10
            long r38 = c2.w.i(r16)
            r65 = 16777213(0xfffffd, float:2.3509883E-38)
            r66 = 0
            r36 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r45 = 0
            r47 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r52 = 0
            r53 = 0
            r54 = 0
            r55 = 0
            r56 = 0
            r57 = 0
            r59 = 0
            r60 = 0
            r61 = 0
            r62 = 0
            r63 = 0
            r64 = 0
            N1.Y r29 = N1.Y.c(r35, r36, r38, r40, r41, r42, r43, r44, r45, r47, r48, r49, r50, r52, r53, r54, r55, r56, r57, r59, r60, r61, r62, r63, r64, r65, r66)
            S1.C$a r16 = S1.C.f13316b
            S1.C r16 = r16.a()
            tK.h r13 = r14.a(r15, r13)
            long r13 = r13.G0()
            r0 = r11
            r35 = r12
            r11 = r13
            Y1.j r21 = Y1.j.h(r7)
            r32 = 0
            r33 = 64984(0xfdd8, float:9.1062E-41)
            r13 = 0
            r7 = 4
            r17 = 0
            r36 = r15
            r15 = r17
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r31 = 196656(0x30030, float:2.75574E-40)
            r30 = r36
            O0.d1.b(r9, r10, r11, r13, r15, r16, r17, r18, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.foundation.layout.d$f r0 = r0.n(r7)
            i1.c$b r7 = r8.k()
            r8 = r36
            r9 = 6
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r7, r8, r9)
            r7 = 0
            int r9 = U0.C4883j.a(r8, r7)
            U0.y r7 = r8.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r8, r6)
            nI.a r10 = r34.a()
            U0.f r11 = r8.m()
            if (r11 != 0) goto L_0x0207
            U0.C4883j.c()
        L_0x0207:
            r8.I()
            boolean r11 = r8.i()
            if (r11 == 0) goto L_0x0214
            r8.p(r10)
            goto L_0x0217
        L_0x0214:
            r8.t()
        L_0x0217:
            U0.m r10 = U0.F1.a(r8)
            nI.p r11 = r34.c()
            U0.F1.c(r10, r0, r11)
            nI.p r0 = r34.e()
            U0.F1.c(r10, r7, r0)
            nI.p r0 = r34.b()
            boolean r7 = r10.i()
            if (r7 != 0) goto L_0x0241
            java.lang.Object r7 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x024f
        L_0x0241:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.u(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
            r10.w(r7, r0)
        L_0x024f:
            nI.p r0 = r34.d()
            U0.F1.c(r10, r6, r0)
            boolean r0 = r1 instanceof FG.p.b
            if (r0 == 0) goto L_0x02fc
            r0 = -1995857301(0xffffffff8909a26b, float:-1.6567144E-33)
            r8.W(r0)
            r0 = r1
            FG.p$b r0 = (FG.p.b) r0
            java.util.List r0 = r0.l()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r9 = 0
        L_0x026e:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x02f7
            java.lang.Object r6 = r0.next()
            r7 = 1
            int r21 = r9 + 1
            if (r9 >= 0) goto L_0x0280
            YH.C16877v.x()
        L_0x0280:
            FG.a r6 = (FG.C15678a) r6
            java.lang.String r7 = r6.a()
            android.net.Uri r10 = r6.b()
            boolean r14 = r1.j(r9)
            r6 = 628360288(0x25740460, float:2.1165109E-16)
            r8.W(r6)
            if (r10 != 0) goto L_0x0299
            r7 = 32
            goto L_0x02f0
        L_0x0299:
            int r6 = r67.f()
            if (r9 != r6) goto L_0x02a1
            r11 = 1
            goto L_0x02a2
        L_0x02a1:
            r11 = 0
        L_0x02a2:
            IG.u r16 = IG.C15888u.LARGE
            r6 = -1852108020(0xffffffff919b130c, float:-2.4466427E-28)
            r8.W(r6)
            boolean r6 = r8.F(r1)
            boolean r12 = r8.d(r9)
            r6 = r6 | r12
            r12 = r35 & 112(0x70, float:1.57E-43)
            r15 = 32
            if (r12 != r15) goto L_0x02bb
            r13 = 1
            goto L_0x02bc
        L_0x02bb:
            r13 = 0
        L_0x02bc:
            r6 = r6 | r13
            boolean r12 = r8.b(r14)
            r6 = r6 | r12
            java.lang.Object r12 = r8.D()
            if (r6 != 0) goto L_0x02d0
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r12 != r6) goto L_0x02d8
        L_0x02d0:
            YG.g r12 = new YG.g
            r12.<init>(r1, r9, r2, r14)
            r8.u(r12)
        L_0x02d8:
            r17 = r12
            nI.a r17 = (nI.C17631a) r17
            r8.P()
            r19 = 1572864(0x180000, float:2.204052E-39)
            r20 = 40
            r12 = 0
            r6 = 0
            r9 = r7
            r7 = r15
            r15 = r6
            r18 = r8
            IG.C15887t.g(r9, r10, r11, r12, r14, r15, r16, r17, r18, r19, r20)
            XH.N r6 = XH.C16807N.f139792a
        L_0x02f0:
            r8.P()
            r9 = r21
            goto L_0x026e
        L_0x02f7:
            r8.P()
            goto L_0x046f
        L_0x02fc:
            r7 = 32
            boolean r0 = r1 instanceof FG.p.d
            if (r0 == 0) goto L_0x03b4
            r0 = -1994817034(0xffffffff891981f6, float:-1.8477812E-33)
            r8.W(r0)
            r0 = r1
            FG.p$d r0 = (FG.p.d) r0
            java.util.List r0 = r0.l()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r9 = 0
        L_0x0316:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x03af
            java.lang.Object r6 = r0.next()
            r10 = 1
            int r18 = r9 + 1
            if (r9 >= 0) goto L_0x0328
            YH.C16877v.x()
        L_0x0328:
            XH.v r6 = (XH.v) r6
            java.lang.Object r10 = r6.a()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r6.b()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            boolean r12 = r1.j(r9)
            r11 = 628394764(0x25748b0c, float:2.1210737E-16)
            r8.W(r11)
            if (r10 != 0) goto L_0x034d
            int r10 = OE.n.f113253O1
            r11 = 0
            java.lang.String r10 = J1.j.b(r10, r8, r11)
        L_0x034d:
            r8.P()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object r6 = r4.invoke(r6)
            lF.a r6 = (lF.C14768a) r6
            java.lang.String r6 = r6.f()
            int r11 = r67.f()
            if (r9 != r11) goto L_0x0366
            r11 = 1
            goto L_0x0367
        L_0x0366:
            r11 = 0
        L_0x0367:
            IG.v r13 = IG.C15889v.STACKED
            r14 = 407112865(0x18440ca1, float:2.5338782E-24)
            r8.W(r14)
            boolean r14 = r8.F(r1)
            boolean r15 = r8.d(r9)
            r14 = r14 | r15
            r15 = r35 & 112(0x70, float:1.57E-43)
            if (r15 != r7) goto L_0x037e
            r15 = 1
            goto L_0x037f
        L_0x037e:
            r15 = 0
        L_0x037f:
            r14 = r14 | r15
            boolean r15 = r8.b(r12)
            r14 = r14 | r15
            java.lang.Object r15 = r8.D()
            if (r14 != 0) goto L_0x0393
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r14 = r14.a()
            if (r15 != r14) goto L_0x039b
        L_0x0393:
            YG.h r15 = new YG.h
            r15.<init>(r1, r9, r2, r12)
            r8.u(r15)
        L_0x039b:
            r14 = r15
            nI.a r14 = (nI.C17631a) r14
            r8.P()
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 0
            r9 = r10
            r10 = r6
            r15 = r8
            IG.C15887t.i(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = r18
            goto L_0x0316
        L_0x03af:
            r8.P()
            goto L_0x046f
        L_0x03b4:
            boolean r0 = r1 instanceof FG.p.a
            if (r0 == 0) goto L_0x049a
            r0 = -1993811146(0xffffffff8928db36, float:-2.0325337E-33)
            r8.W(r0)
            r0 = r1
            FG.p$a r0 = (FG.p.a) r0
            java.util.List r0 = r0.l()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r9 = 0
        L_0x03cc:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x046c
            java.lang.Object r6 = r0.next()
            r18 = 1
            int r19 = r9 + 1
            if (r9 >= 0) goto L_0x03df
            YH.C16877v.x()
        L_0x03df:
            XH.v r6 = (XH.v) r6
            java.lang.Object r10 = r6.a()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r6.b()
            java.lang.Number r6 = (java.lang.Number) r6
            float r6 = r6.floatValue()
            boolean r12 = r1.j(r9)
            r11 = 628427212(0x257509cc, float:2.1253682E-16)
            r8.W(r11)
            if (r10 != 0) goto L_0x0405
            int r10 = OE.n.f113253O1
            r15 = 0
            java.lang.String r10 = J1.j.b(r10, r8, r15)
            goto L_0x0406
        L_0x0405:
            r15 = 0
        L_0x0406:
            r8.P()
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            java.lang.Object r6 = r4.invoke(r6)
            lF.a r6 = (lF.C14768a) r6
            java.lang.String r6 = r6.f()
            int r11 = r67.f()
            if (r9 != r11) goto L_0x0420
            r11 = r18
            goto L_0x0421
        L_0x0420:
            r11 = r15
        L_0x0421:
            IG.v r13 = IG.C15889v.STACKED
            r14 = 407145313(0x18448b61, float:2.5402775E-24)
            r8.W(r14)
            boolean r14 = r8.F(r1)
            boolean r16 = r8.d(r9)
            r14 = r14 | r16
            r15 = r35 & 112(0x70, float:1.57E-43)
            if (r15 != r7) goto L_0x043a
            r15 = r18
            goto L_0x043b
        L_0x043a:
            r15 = 0
        L_0x043b:
            r14 = r14 | r15
            boolean r15 = r8.b(r12)
            r14 = r14 | r15
            java.lang.Object r15 = r8.D()
            if (r14 != 0) goto L_0x044f
            U0.m$a r14 = U0.C4889m.f14007a
            java.lang.Object r14 = r14.a()
            if (r15 != r14) goto L_0x0457
        L_0x044f:
            YG.i r15 = new YG.i
            r15.<init>(r1, r9, r2, r12)
            r8.u(r15)
        L_0x0457:
            r14 = r15
            nI.a r14 = (nI.C17631a) r14
            r8.P()
            r16 = 24576(0x6000, float:3.4438E-41)
            r17 = 0
            r9 = r10
            r10 = r6
            r6 = 0
            r15 = r8
            IG.C15887t.i(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r9 = r19
            goto L_0x03cc
        L_0x046c:
            r8.P()
        L_0x046f:
            r8.x()
            r8.x()
            XH.N r0 = XH.C16807N.f139792a
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0480
            U0.C4895p.R()
        L_0x0480:
            U0.Y0 r7 = r8.n()
            if (r7 == 0) goto L_0x0499
            YG.j r8 = new YG.j
            r0 = r8
            r1 = r67
            r2 = r68
            r4 = r70
            r5 = r72
            r6 = r73
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x0499:
            return
        L_0x049a:
            r0 = 628352982(0x2573e7d6, float:2.1155439E-16)
            r8.W(r0)
            r8.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x04a9:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x04b2
            U0.C4895p.R()
        L_0x04b2:
            U0.Y0 r7 = r8.n()
            if (r7 == 0) goto L_0x04cb
            YG.f r8 = new YG.f
            r0 = r8
            r1 = r67
            r2 = r68
            r4 = r70
            r5 = r72
            r6 = r73
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x04cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: YG.k.n(FG.p, nI.p, androidx.compose.ui.d, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N o(p pVar, nI.p pVar2, androidx.compose.ui.d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        n(pVar, pVar2, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(p pVar, int i10, nI.p pVar2, boolean z10) {
        pVar2.invoke(pVar.c(i10), Boolean.valueOf(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(p pVar, int i10, nI.p pVar2, boolean z10) {
        pVar2.invoke(pVar.c(i10), Boolean.valueOf(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N r(p pVar, int i10, nI.p pVar2, boolean z10) {
        pVar2.invoke(pVar.c(i10), Boolean.valueOf(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(p pVar, nI.p pVar2, androidx.compose.ui.d dVar, C17642l lVar, int i10, int i11, C4889m mVar, int i12) {
        n(pVar, pVar2, dVar, lVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: nI.p} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(YG.l r18, androidx.compose.ui.d r19, com.sugarcube.app.base.data.database.CachedCatalogItem r20, nI.C17642l<? super java.lang.Float, lF.C14768a> r21, nI.C17642l<? super com.sugarcube.decorate.v2.internal.ui.surface.a.f0, XH.C16807N> r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r18
            r3 = r20
            r12 = r21
            r13 = r22
            r14 = r24
            r0 = 16
            r2 = 2
            r4 = 4
            java.lang.String r5 = "getFormattedPrice"
            kotlin.jvm.internal.C17542s.j(r12, r5)
            java.lang.String r5 = "onEvent"
            kotlin.jvm.internal.C17542s.j(r13, r5)
            r5 = -1586479492(0xffffffffa1703e7c, float:-8.139786E-19)
            r6 = r23
            U0.m r15 = r6.k(r5)
            r6 = 1
            r7 = r25 & 1
            if (r7 == 0) goto L_0x0029
            r7 = r14 | 6
            goto L_0x0039
        L_0x0029:
            r7 = r14 & 6
            if (r7 != 0) goto L_0x0038
            boolean r7 = r15.V(r1)
            if (r7 == 0) goto L_0x0035
            r7 = r4
            goto L_0x0036
        L_0x0035:
            r7 = r2
        L_0x0036:
            r7 = r7 | r14
            goto L_0x0039
        L_0x0038:
            r7 = r14
        L_0x0039:
            r2 = r25 & 2
            if (r2 == 0) goto L_0x0042
            r7 = r7 | 48
        L_0x003f:
            r8 = r19
            goto L_0x0053
        L_0x0042:
            r8 = r14 & 48
            if (r8 != 0) goto L_0x003f
            r8 = r19
            boolean r9 = r15.V(r8)
            if (r9 == 0) goto L_0x0051
            r9 = 32
            goto L_0x0052
        L_0x0051:
            r9 = r0
        L_0x0052:
            r7 = r7 | r9
        L_0x0053:
            r4 = r25 & 4
            r9 = 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L_0x005c
            r7 = r7 | 384(0x180, float:5.38E-43)
            goto L_0x006b
        L_0x005c:
            r4 = r14 & 384(0x180, float:5.38E-43)
            if (r4 != 0) goto L_0x006b
            boolean r4 = r15.V(r3)
            if (r4 == 0) goto L_0x0068
            r4 = r9
            goto L_0x006a
        L_0x0068:
            r4 = 128(0x80, float:1.794E-43)
        L_0x006a:
            r7 = r7 | r4
        L_0x006b:
            r4 = r25 & 8
            if (r4 == 0) goto L_0x0072
            r7 = r7 | 3072(0xc00, float:4.305E-42)
            goto L_0x0082
        L_0x0072:
            r4 = r14 & 3072(0xc00, float:4.305E-42)
            if (r4 != 0) goto L_0x0082
            boolean r4 = r15.F(r12)
            if (r4 == 0) goto L_0x007f
            r4 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r4 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r7 = r7 | r4
        L_0x0082:
            r0 = r25 & 16
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x008b
            r7 = r7 | 24576(0x6000, float:3.4438E-41)
            goto L_0x009a
        L_0x008b:
            r0 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r0 != 0) goto L_0x009a
            boolean r0 = r15.F(r13)
            if (r0 == 0) goto L_0x0097
            r0 = r4
            goto L_0x0099
        L_0x0097:
            r0 = 8192(0x2000, float:1.14794E-41)
        L_0x0099:
            r7 = r7 | r0
        L_0x009a:
            r0 = r7 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r0 != r10) goto L_0x00ad
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x00a7
            goto L_0x00ad
        L_0x00a7:
            r15.L()
            r2 = r8
            goto L_0x027e
        L_0x00ad:
            if (r2 == 0) goto L_0x00b3
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r2 = r0
            goto L_0x00b4
        L_0x00b3:
            r2 = r8
        L_0x00b4:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00c0
            r0 = -1
            java.lang.String r8 = "com.sugarcube.decorate.v2.internal.ui.toolbars.variants.VariantsStripe (VariantsStripe.kt:62)"
            U0.C4895p.S(r5, r7, r0, r8)
        L_0x00c0:
            if (r3 != 0) goto L_0x00e7
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00cb
            U0.C4895p.R()
        L_0x00cb:
            U0.Y0 r8 = r15.n()
            if (r8 == 0) goto L_0x00e6
            YG.a r9 = new YG.a
            r0 = r9
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x00e6:
            return
        L_0x00e7:
            r0 = 1480771154(0x5842c652, float:8.5662814E14)
            r15.W(r0)
            r0 = 57344(0xe000, float:8.0356E-41)
            r5 = r7 & r0
            r8 = 0
            if (r5 != r4) goto L_0x00f7
            r10 = r6
            goto L_0x00f8
        L_0x00f7:
            r10 = r8
        L_0x00f8:
            r11 = r7 & 896(0x380, float:1.256E-42)
            if (r11 != r9) goto L_0x00fe
            r9 = r6
            goto L_0x00ff
        L_0x00fe:
            r9 = r8
        L_0x00ff:
            r9 = r9 | r10
            java.lang.Object r10 = r15.D()
            r11 = 0
            if (r9 != 0) goto L_0x010f
            U0.m$a r9 = U0.C4889m.f14007a
            java.lang.Object r9 = r9.a()
            if (r10 != r9) goto L_0x0117
        L_0x010f:
            YG.k$d r10 = new YG.k$d
            r10.<init>(r13, r3, r11)
            r15.u(r10)
        L_0x0117:
            nI.p r10 = (nI.p) r10
            r15.P()
            int r9 = r7 >> 6
            r9 = r9 & 14
            U0.P.g(r3, r10, r15, r9)
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            r10 = 100
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.y(r9, r10)
            r10 = 0
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.J.d(r9, r10, r6, r11)
            androidx.compose.ui.d r9 = r2.s(r9)
            androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r10 = r10.g()
            i1.c$a r11 = i1.C5437c.f24302a
            i1.c$b r11 = r11.k()
            E1.I r10 = androidx.compose.foundation.layout.C5080k.a(r10, r11, r15, r8)
            int r11 = U0.C4883j.a(r15, r8)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r9)
            G1.g$a r16 = G1.C4504g.f6515W
            nI.a r0 = r16.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x0164
            U0.C4883j.c()
        L_0x0164:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x0171
            r15.p(r0)
            goto L_0x0174
        L_0x0171:
            r15.t()
        L_0x0174:
            U0.m r0 = U0.F1.a(r15)
            nI.p r4 = r16.c()
            U0.F1.c(r0, r10, r4)
            nI.p r4 = r16.e()
            U0.F1.c(r0, r6, r4)
            nI.p r4 = r16.b()
            boolean r6 = r0.i()
            if (r6 != 0) goto L_0x019e
            java.lang.Object r6 = r0.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r10)
            if (r6 != 0) goto L_0x01ac
        L_0x019e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r0.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r0.w(r6, r4)
        L_0x01ac:
            nI.p r4 = r16.d()
            U0.F1.c(r0, r9, r4)
            s0.h r0 = s0.C5862h.f28810a
            boolean r0 = r1 instanceof YG.l.a
            if (r0 == 0) goto L_0x01d9
            r0 = 1469088051(0x57908133, float:3.17769162E14)
            r15.W(r0)
            r0 = r1
            YG.l$a r0 = (YG.l.a) r0
            int r6 = r0.a()
            rF.b r0 = rF.C15002a.a(r15, r8)
            long r7 = r0.e()
            r10 = 0
            r11 = 0
            r9 = r15
            zG.h.c(r6, r7, r9, r10, r11)
            r15.P()
            goto L_0x0272
        L_0x01d9:
            boolean r0 = r1 instanceof YG.l.b
            if (r0 == 0) goto L_0x0267
            r0 = 1469362277(0x5794b065, float:3.26970659E14)
            r15.W(r0)
            r0 = r1
            YG.l$b r0 = (YG.l.b) r0
            FG.k r4 = r0.d()
            if (r4 != 0) goto L_0x0206
            r0 = -1122090439(0xffffffffbd1e4239, float:-0.038637374)
            r15.W(r0)
            int r6 = OE.n.f113193E1
            rF.b r0 = rF.C15002a.a(r15, r8)
            long r7 = r0.e()
            r10 = 0
            r11 = 0
            r9 = r15
            zG.h.c(r6, r7, r9, r10, r11)
            r15.P()
            goto L_0x0263
        L_0x0206:
            r4 = -1121821514(0xffffffffbd225cb6, float:-0.039639197)
            r15.W(r4)
            FG.k r4 = r0.d()
            FG.p$b r4 = r4.b()
            FG.k r6 = r0.d()
            FG.p$d r6 = r6.c()
            FG.k r9 = r0.d()
            FG.p$a r9 = r9.a()
            r10 = -1283104279(0xffffffffb38561e9, float:-6.211105E-8)
            r15.W(r10)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r5 != r10) goto L_0x022f
            r8 = 1
        L_0x022f:
            java.lang.Object r5 = r15.D()
            if (r8 != 0) goto L_0x023d
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r5 != r8) goto L_0x0245
        L_0x023d:
            YG.b r5 = new YG.b
            r5.<init>(r13)
            r15.u(r5)
        L_0x0245:
            r8 = r5
            nI.p r8 = (nI.p) r8
            r15.P()
            boolean r0 = r0.c()
            int r5 = r7 << 3
            r7 = 57344(0xe000, float:8.0356E-41)
            r11 = r5 & r7
            r5 = r6
            r6 = r9
            r7 = r8
            r8 = r21
            r9 = r0
            r10 = r15
            k(r4, r5, r6, r7, r8, r9, r10, r11)
            r15.P()
        L_0x0263:
            r15.P()
            goto L_0x0272
        L_0x0267:
            if (r1 != 0) goto L_0x029a
            r0 = 1470382642(0x57a44232, float:3.61208427E14)
            r15.W(r0)
            r15.P()
        L_0x0272:
            r15.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x027e
            U0.C4895p.R()
        L_0x027e:
            U0.Y0 r8 = r15.n()
            if (r8 == 0) goto L_0x0299
            YG.c r9 = new YG.c
            r0 = r9
            r1 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r24
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.a(r9)
        L_0x0299:
            return
        L_0x029a:
            r0 = 2125598569(0x7eb20f69, float:1.183413E38)
            r15.W(r0)
            r15.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: YG.k.t(YG.l, androidx.compose.ui.d, com.sugarcube.app.base.data.database.CachedCatalogItem, nI.l, nI.l, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N u(l lVar, androidx.compose.ui.d dVar, CachedCatalogItem cachedCatalogItem, C17642l lVar2, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        t(lVar, dVar, cachedCatalogItem, lVar2, lVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(C17642l lVar, CatalogItem catalogItem, boolean z10) {
        C17542s.j(catalogItem, "item");
        lVar.invoke(new a.f0.b(RF.q.a(catalogItem), z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(l lVar, androidx.compose.ui.d dVar, CachedCatalogItem cachedCatalogItem, C17642l lVar2, C17642l lVar3, int i10, int i11, C4889m mVar, int i12) {
        t(lVar, dVar, cachedCatalogItem, lVar2, lVar3, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}
