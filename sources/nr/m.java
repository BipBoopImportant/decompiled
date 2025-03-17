package nr;

import Iq.b;
import Jq.c;
import Jq.d;
import KJ.C15985a;
import KJ.C15990f;
import Qq.g;
import Qq.i;
import Qq.k;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import nr.j;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnr/m;", "Lnr/j;", "LJq/c;", "repository", "LIq/b;", "mapper", "<init>", "(LJq/c;LIq/b;)V", "LJq/d;", "LQq/k;", "resource", "Lnr/j$a$b;", "d", "(LJq/d;)Lnr/j$a$b;", "LQq/i;", "interactions", "Lnr/j$a$a;", "c", "(LJq/d;)Lnr/j$a$a;", "LTJ/g;", "Lnr/j$a;", "invoke", "()LTJ/g;", "a", "LJq/c;", "b", "LIq/b;", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements j {

    /* renamed from: a  reason: collision with root package name */
    private final c f100067a;

    /* renamed from: b  reason: collision with root package name */
    private final b f100068b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LJq/d;", "LQq/k;", "rewardsData", "LQq/i;", "interactionsData", "Lnr/j$a;", "<anonymous>", "(LJq/d;LJq/d;)Lnr/j$a;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.familyrewards.implementation.usecase.GetRewardsContentFlowUseCaseImpl$invoke$1", f = "GetRewardsContentFlowUseCase.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements q<d<k>, d<i>, C17164e<? super j.a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f100069c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f100070d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f100071e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ m f100072f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(m mVar, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f100072f = mVar;
        }

        /* renamed from: i */
        public final Object invoke(d<k> dVar, d<i> dVar2, C17164e<? super j.a> eVar) {
            a aVar = new a(this.f100072f, eVar);
            aVar.f100070d = dVar;
            aVar.f100071e = dVar2;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f100069c == 0) {
                y.b(obj);
                return new j.a(this.f100072f.d((d) this.f100070d), this.f100072f.c((d) this.f100071e));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m(c cVar, b bVar) {
        C17542s.j(cVar, "repository");
        C17542s.j(bVar, "mapper");
        this.f100067a = cVar;
        this.f100068b = bVar;
    }

    /* access modifiers changed from: private */
    public final j.a.C2312a c(d<i> dVar) {
        if ((dVar instanceof d.a) || (dVar instanceof d.b)) {
            return j.a.C2312a.C2313a.b.f100059a;
        }
        if (dVar instanceof d.c) {
            return j.a.C2312a.b.f100060a;
        }
        if (dVar instanceof d.C1628d) {
            d.C1628d dVar2 = (d.C1628d) dVar;
            return new j.a.C2312a.C2313a.C2314a(((i) dVar2.a()).a(), C15985a.l(((i) dVar2.a()).b()));
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public final j.a.b d(d<k> dVar) {
        if ((dVar instanceof d.a) || (dVar instanceof d.b)) {
            return l.f100066a;
        }
        if (dVar instanceof d.c) {
            return j.a.b.C2315a.f100061a;
        }
        if (dVar instanceof d.C1628d) {
            k kVar = (k) ((d.C1628d) dVar).a();
            int e10 = kVar.e();
            Iterable<g.b> f10 = kVar.f();
            b bVar = this.f100068b;
            ArrayList arrayList = new ArrayList(C16877v.y(f10, 10));
            for (g.b c10 : f10) {
                arrayList.add(bVar.c(c10));
            }
            C15990f l10 = C15985a.l(arrayList);
            Iterable<g.a> d10 = kVar.d();
            b bVar2 = this.f100068b;
            ArrayList arrayList2 = new ArrayList(C16877v.y(d10, 10));
            for (g.a d11 : d10) {
                arrayList2.add(bVar2.d(d11));
            }
            C15990f l11 = C15985a.l(arrayList2);
            Iterable<g.c> g10 = kVar.g();
            b bVar3 = this.f100068b;
            ArrayList arrayList3 = new ArrayList(C16877v.y(g10, 10));
            for (g.c b10 : g10) {
                arrayList3.add(bVar3.b(b10));
            }
            return new k(e10, l10, l11, C15985a.l(arrayList3));
        }
        throw new t();
    }

    public C16532g<j.a> invoke() {
        return C16534i.n(C16534i.s(this.f100067a.f((c.a) null)), C16534i.s(this.f100067a.d()), new a(this, (C17164e<? super a>) null));
    }
}
