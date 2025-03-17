package com.sugarcube.app.base.debug;

import E1.I;
import G1.C4504g;
import I0.C4592x0;
import I0.C4596z0;
import I0.G0;
import O0.C4724e;
import O0.S;
import O0.U;
import O0.e1;
import O0.g1;
import RE.C13524b;
import RE.V;
import RE.W;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.p1;
import VE.C13759a;
import XH.C16796C;
import XH.C16807N;
import XH.C16818i;
import XH.t;
import YH.C16877v;
import YH.X;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.lifecycle.K;
import androidx.lifecycle.L;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.data.feature.ConfigItemGroup;
import com.sugarcube.app.base.data.feature.ConfigItems;
import com.sugarcube.app.base.data.feature.ConfigState;
import com.sugarcube.app.base.debug.b;
import dI.C17168i;
import i1.C5437c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p0.s;
import p1.i1;
import r0.m;
import s0.C5834E;
import s0.C5842M;
import s0.C5848T;
import s0.C5861g;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001ae\u0010\u0016\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r0\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\"\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"*\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\f\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onClick", "Lkotlin/Function1;", "Ls0/E;", "content", "e", "(LnI/a;LnI/q;LU0/m;I)V", "", "Lcom/sugarcube/app/base/debug/b;", "uiItems", "", "", "LTJ/g;", "Lcom/sugarcube/app/base/data/feature/ConfigState;", "flows", "Landroidx/lifecycle/K;", "", "suggestKill", "Lcom/sugarcube/app/base/debug/a;", "onAction", "innerPadding", "c", "(Ljava/util/List;Ljava/util/Map;Landroidx/lifecycle/K;LnI/l;Ls0/E;LU0/m;I)V", "a", "Ljava/util/List;", "previewItems", "b", "Ljava/util/Map;", "previewFlows", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final List<b> f123045a;

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, C16532g<ConfigState<?>>> f123046b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f123047a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.debug.n$a$a  reason: collision with other inner class name */
        static final class C3029a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f123048a;

            C3029a(C17631a<C16807N> aVar) {
                this.f123048a = aVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-992844334, i10, -1, "com.sugarcube.app.base.debug.DebugTopAppBar.<anonymous>.<anonymous> (DebugFragment.kt:339)");
                    }
                    U.a(this.f123048a, (d) null, false, (S) null, (m) null, C13524b.f115478a.b(), mVar, ImageMetadata.EDGE_MODE, 30);
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

        a(C17631a<C16807N> aVar) {
            this.f123047a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(811299225, i11, -1, "com.sugarcube.app.base.debug.DebugTopAppBar.<anonymous> (DebugFragment.kt:331)");
                }
                p<C4889m, Integer, C16807N> a10 = C13524b.f115478a.a();
                C5264a e10 = c1.c.e(-992844334, true, new C3029a(this.f123047a), mVar2, 54);
                C18030v vVar = C18030v.f147664a;
                int i12 = C18030v.f147665b;
                C4724e.a(a10, (d) null, e10, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, 0.0f, (C5848T) null, new e1(vVar.a(mVar2, i12).k0(), vVar.a(mVar2, i12).k0(), vVar.a(mVar2, i12).G0(), vVar.a(mVar2, i12).G0(), vVar.a(mVar2, i12).G0(), (DefaultConstructorMarker) null), (g1) null, mVar, 390, 186);
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
    static final class b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q<C5834E, C4889m, Integer, C16807N> f123049a;

        b(q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar) {
            this.f123049a = qVar;
        }

        public final void a(C5834E e10, C4889m mVar, int i10) {
            C17542s.j(e10, "innerPadding");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(e10) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1925944832, i10, -1, "com.sugarcube.app.base.debug.DebugTopAppBar.<anonymous> (DebugFragment.kt:360)");
                }
                this.f123049a.invoke(e10, mVar, Integer.valueOf(i10 & 14));
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f123050a;

        c(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f123050a = lVar;
        }

        public final C16818i<?> c() {
            return this.f123050a;
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
            this.f123050a.invoke(obj);
        }
    }

    static {
        b.f fVar = new b.f("Network");
        C13759a.c cVar = C13759a.c.f117437i;
        b.d dVar = new b.d(C16521S.a(cVar), C16877v.q(cVar, C13759a.b.f117436i));
        b.f fVar2 = new b.f("Configuration");
        b.e eVar = new b.e(ConfigItemGroup.UserFlow.INSTANCE, C16877v.n());
        ConfigItems.TestConfigItem testConfigItem = ConfigItems.TestConfigItem.INSTANCE;
        f123045a = C16877v.q(fVar, dVar, fVar2, eVar, new b.j(testConfigItem));
        f123046b = X.f(C16796C.a(testConfigItem.getMeta().getLocalKey(), C16534i.K(new ConfigState[0])));
    }

    public static final void c(List<? extends b> list, Map<String, ? extends C16532g<? extends ConfigState<?>>> map, K<Boolean> k10, C17642l<? super a, C16807N> lVar, C5834E e10, C4889m mVar, int i10) {
        int i11;
        boolean z10;
        List<? extends b> list2 = list;
        Map<String, ? extends C16532g<? extends ConfigState<?>>> map2 = map;
        K<Boolean> k11 = k10;
        C17642l<? super a, C16807N> lVar2 = lVar;
        C5834E e11 = e10;
        int i12 = i10;
        C17542s.j(list2, "uiItems");
        C17542s.j(map2, "flows");
        C17542s.j(k11, "suggestKill");
        C17542s.j(lVar2, "onAction");
        C17542s.j(e11, "innerPadding");
        C4889m k12 = mVar.k(260544149);
        if ((i12 & 6) == 0) {
            i11 = (k12.F(list2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k12.F(map2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k12.F(k11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k12.F(lVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k12.V(e11) ? 16384 : 8192;
        }
        int i13 = i11;
        if ((i13 & 9363) != 9362 || !k12.l()) {
            if (C4895p.J()) {
                C4895p.S(260544149, i13, -1, "com.sugarcube.app.base.debug.DebugScreen (DebugFragment.kt:371)");
            }
            d.a aVar = d.f18749a;
            d h10 = D.h(J.d(aVar, 0.0f, 1, (Object) null), e11);
            C5073d dVar = C5073d.f18068a;
            C5073d.m g10 = dVar.g();
            C5437c.a aVar2 = C5437c.f24302a;
            I a10 = C5080k.a(g10, aVar2.k(), k12, 0);
            int a11 = C4883j.a(k12, 0);
            C4912y s10 = k12.s();
            d e12 = androidx.compose.ui.c.e(k12, h10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar3.a();
            if (k12.m() == null) {
                C4883j.c();
            }
            k12.I();
            if (k12.i()) {
                k12.p(a12);
            } else {
                k12.t();
            }
            C4889m a13 = F1.a(k12);
            F1.c(a13, a10, aVar3.c());
            F1.c(a13, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e12, aVar3.d());
            C5862h hVar = C5862h.f28810a;
            C5073d.f n10 = dVar.n(h.B((float) 4));
            float f10 = (float) 24;
            d m10 = D.m(C5861g.c(hVar, androidx.compose.foundation.m.f(aVar, androidx.compose.foundation.m.c(0, k12, 0, 1), false, (s) null, false, 14, (Object) null), 1.0f, false, 2, (Object) null), h.B(f10), 0.0f, h.B(f10), h.B(f10), 2, (Object) null);
            I a14 = C5080k.a(n10, aVar2.k(), k12, 6);
            int a15 = C4883j.a(k12, 0);
            C4912y s11 = k12.s();
            d e13 = androidx.compose.ui.c.e(k12, m10);
            C17631a<C4504g> a16 = aVar3.a();
            if (k12.m() == null) {
                C4883j.c();
            }
            k12.I();
            if (k12.i()) {
                k12.p(a16);
            } else {
                k12.t();
            }
            C4889m a17 = F1.a(k12);
            F1.c(a17, a14, aVar3.c());
            F1.c(a17, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e13, aVar3.d());
            k12.W(-674168011);
            for (b bVar : list2) {
                if (bVar instanceof b.f) {
                    k12.W(1070146957);
                    z10 = false;
                    c.s0((b.f) bVar, k12, 0);
                    k12.P();
                } else {
                    z10 = false;
                    if (bVar instanceof b.e) {
                        k12.W(1070148860);
                        c.p0((b.e) bVar, lVar2, k12, (i13 >> 6) & 112);
                        k12.P();
                    } else if (bVar instanceof b.a) {
                        k12.W(1070151394);
                        c.R((b.a) bVar, lVar2, k12, (i13 >> 6) & 112);
                        k12.P();
                    } else if (bVar instanceof b.C3027b) {
                        k12.W(-1184947347);
                        b.C3027b bVar2 = (b.C3027b) bVar;
                        Object obj = map2.get(bVar2.a().getMeta().getLocalKey());
                        C17542s.h(obj, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.sugarcube.app.base.data.feature.ConfigState<kotlin.Boolean>>");
                        c.T(bVar2, p1.a((C16532g) obj, null, (C17168i) null, k12, 48, 2), lVar2, k12, (i13 >> 3) & 896);
                        k12.P();
                    } else if (bVar instanceof b.g) {
                        k12.W(-1184651607);
                        b.g gVar = (b.g) bVar;
                        Object obj2 = map2.get(gVar.a().getMeta().getLocalKey());
                        C17542s.h(obj2, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.sugarcube.app.base.data.feature.ConfigState<java.lang.Integer>>");
                        c.B0(gVar, p1.a((C16532g) obj2, null, (C17168i) null, k12, 48, 2), lVar2, k12, (i13 >> 3) & 896);
                        k12.P();
                    } else if (bVar instanceof b.c) {
                        k12.W(-1184383829);
                        b.c cVar = (b.c) bVar;
                        Object obj3 = map2.get(cVar.a().getMeta().getLocalKey());
                        C17542s.h(obj3, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.sugarcube.app.base.data.feature.ConfigState<kotlin.Double>>");
                        c.Z(cVar, p1.a((C16532g) obj3, null, (C17168i) null, k12, 48, 2), lVar2, k12, (i13 >> 3) & 896);
                        k12.P();
                    } else if (bVar instanceof b.i) {
                        k12.W(-1184115927);
                        b.i iVar = (b.i) bVar;
                        Object obj4 = map2.get(iVar.a().getMeta().getLocalKey());
                        C17542s.h(obj4, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.sugarcube.app.base.data.feature.ConfigState<kotlin.String>>");
                        c.R0(iVar, p1.a((C16532g) obj4, null, (C17168i) null, k12, 48, 2), lVar2, k12, (i13 >> 3) & 896);
                        k12.P();
                    } else if (bVar instanceof b.j) {
                        k12.W(-1183848149);
                        b.j jVar = (b.j) bVar;
                        Object obj5 = map2.get(jVar.a().getMeta().getLocalKey());
                        C17542s.h(obj5, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.sugarcube.app.base.data.feature.ConfigState<kotlin.String>>");
                        c.Y0(jVar, p1.a((C16532g) obj5, null, (C17168i) null, k12, 48, 2), lVar2, k12, (i13 >> 3) & 896);
                        k12.P();
                    } else if (bVar instanceof b.h) {
                        k12.W(-1183578759);
                        b.h hVar2 = (b.h) bVar;
                        Object obj6 = map2.get(hVar2.a().getMeta().getLocalKey());
                        C17542s.h(obj6, "null cannot be cast to non-null type kotlinx.coroutines.flow.Flow<com.sugarcube.app.base.data.feature.ConfigState<com.sugarcube.app.base.data.feature.ConfigItem.ObjectListValue>>");
                        c.K0(hVar2, p1.a((C16532g) obj6, null, (C17168i) null, k12, 48, 2), lVar2, k12, (i13 >> 3) & 896);
                        k12.P();
                    } else if (bVar instanceof b.d) {
                        k12.W(-1183261350);
                        c.j0((b.d) bVar, lVar2, k12, (i13 >> 6) & 112);
                        k12.P();
                    } else {
                        k12.W(1070147140);
                        k12.P();
                        throw new t();
                    }
                }
                boolean z11 = z10;
            }
            k12.P();
            k12.x();
            c.f1(k11, lVar2, k12, (i13 >> 6) & 126);
            k12.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k12.L();
        }
        Y0 n11 = k12.n();
        if (n11 != null) {
            n11.a(new W(list, map, k10, lVar, e10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(List list, Map map, K k10, C17642l lVar, C5834E e10, int i10, C4889m mVar, int i11) {
        c(list, map, k10, lVar, e10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void e(C17631a<C16807N> aVar, q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a<C16807N> aVar2 = aVar;
        q<? super C5834E, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        int i12 = i10;
        C17542s.j(aVar2, "onClick");
        C17542s.j(qVar2, "content");
        C4889m k10 = mVar.k(685008254);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(qVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(685008254, i11, -1, "com.sugarcube.app.base.debug.DebugTopAppBar (DebugFragment.kt:328)");
            }
            mVar2 = k10;
            C4592x0.a((d) null, (C4596z0) null, c1.c.e(811299225, true, new a(aVar2), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, (q<? super G0, ? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, 0, false, (q<? super C5861g, ? super C4889m, ? super Integer, C16807N>) null, false, (i1) null, 0.0f, 0, 0, 0, 0, 0, c1.c.e(1925944832, true, new b(qVar2), k10, 54), mVar2, 384, 12582912, 131067);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new V(aVar2, qVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17631a aVar, q qVar, int i10, C4889m mVar, int i11) {
        e(aVar, qVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
