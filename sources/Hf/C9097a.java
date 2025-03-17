package Hf;

import Gf.c;
import J1.j;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import Y1.f;
import Y1.k;
import YH.C16877v;
import androidx.compose.ui.d;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import wf.C10366b;
import xf.h;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hf.a  reason: case insensitive filesystem */
public final class C9097a {

    /* renamed from: a  reason: collision with root package name */
    public static final C9097a f60882a = new C9097a();

    /* renamed from: b  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f60883b = c.c(127248395, false, C1000a.f60885a);

    /* renamed from: c  reason: collision with root package name */
    private static p<C4889m, Integer, C16807N> f60884c = c.c(-1367321015, false, b.f60886a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Hf.a$a  reason: collision with other inner class name */
    static final class C1000a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final C1000a f60885a = new C1000a();

        C1000a() {
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(127248395, i11, -1, "com.ingka.ikea.app.browseandsearch.searchv2.compose.ComposableSingletons$RecentSearchesFlowRowKt.lambda-1.<anonymous> (RecentSearchesFlowRow.kt:119)");
                }
                C13607l.j(j.b(C10366b.f77651l, mVar, 0), C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
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
    /* renamed from: Hf.a$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f60886a = new b();

        b() {
        }

        /* access modifiers changed from: private */
        public static final C16807N e(String str, c.j jVar, h hVar) {
            C17542s.j(str, "<unused var>");
            C17542s.j(jVar, "<unused var>");
            C17542s.j(hVar, "<unused var>");
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N f() {
            return C16807N.f139792a;
        }

        public final void c(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1367321015, i10, -1, "com.ingka.ikea.app.browseandsearch.searchv2.compose.ComposableSingletons$RecentSearchesFlowRowKt.lambda-2.<anonymous> (RecentSearchesFlowRow.kt:136)");
                }
                c.g gVar = (c.g) C16877v.w0(V.f60860a.b());
                mVar.W(-1481164161);
                Object D10 = mVar.D();
                C4889m.a aVar = C4889m.f14007a;
                if (D10 == aVar.a()) {
                    D10 = new C9098b();
                    mVar.u(D10);
                }
                q qVar = (q) D10;
                mVar.P();
                mVar.W(-1481162284);
                Object D11 = mVar.D();
                if (D11 == aVar.a()) {
                    D11 = new C9099c();
                    mVar.u(D11);
                }
                mVar.P();
                U.m(gVar, qVar, (C17631a) D11, mVar, 432);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            c((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public final p<C4889m, Integer, C16807N> a() {
        return f60883b;
    }
}
