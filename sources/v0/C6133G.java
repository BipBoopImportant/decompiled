package v0;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import YH.X;
import f1.C5301c;
import f1.C5303e;
import f1.C5305g;
import f1.C5306h;
import f1.C5308j;
import f1.C5309k;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Function1;", "Lf1/e;", "LXH/N;", "content", "a", "(LnI/q;LU0/m;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.G  reason: case insensitive filesystem */
public final class C6133G {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "a", "(LU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v0.G$a */
    static final class a extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6132F f30819c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q<C5303e, C4889m, Integer, C16807N> f30820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6132F f10, q<? super C5303e, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(2);
            this.f30819c = f10;
            this.f30820d = qVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1863926504, i10, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider.<anonymous> (LazySaveableStateHolder.kt:49)");
                }
                this.f30819c.i(C5305g.a(mVar, 0));
                this.f30820d.invoke(this.f30819c, mVar, 0);
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

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.G$b */
    static final class b extends C17544u implements p<C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<C5303e, C4889m, Integer, C16807N> f30821c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f30822d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(q<? super C5303e, ? super C4889m, ? super Integer, C16807N> qVar, int i10) {
            super(2);
            this.f30821c = qVar;
            this.f30822d = i10;
        }

        public final void a(C4889m mVar, int i10) {
            C6133G.a(this.f30821c, mVar, M0.a(this.f30822d | 1));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lv0/F;", "b", "()Lv0/F;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: v0.G$c */
    static final class c extends C17544u implements C17631a<C6132F> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5306h f30823c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5306h hVar) {
            super(0);
            this.f30823c = hVar;
        }

        /* renamed from: b */
        public final C6132F invoke() {
            return new C6132F(this.f30823c, X.j());
        }
    }

    public static final void a(q<? super C5303e, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(674185128);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(674185128, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolderProvider (LazySaveableStateHolder.kt:41)");
            }
            C5306h hVar = (C5306h) k10.Q(C5308j.d());
            Object[] objArr = {hVar};
            C5309k<C6132F, Map<String, List<Object>>> a10 = C6132F.f30804d.a(hVar);
            boolean F10 = k10.F(hVar);
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new c(hVar);
                k10.u(D10);
            }
            C6132F f10 = (C6132F) C5301c.e(objArr, a10, (String) null, (C17631a) D10, k10, 0, 4);
            C4910x.a(C5308j.d().d(f10), c1.c.e(1863926504, true, new a(f10, qVar), k10, 54), k10, J0.f13770i | 48);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new b(qVar, i10));
        }
    }
}
