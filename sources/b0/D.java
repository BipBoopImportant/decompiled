package B0;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import XH.v;
import c2.C5267b;
import c2.n;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u000e\u001a\u00020\r*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LB0/D;", "LE1/I;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "<init>", "(LnI/a;)V", "LE1/K;", "", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "a", "LnI/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class D implements I {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C17631a<Boolean> f4523a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<H> f4524c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ D f4525d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List<? extends H> list, D d10) {
            super(1);
            this.f4524c = list;
            this.f4525d = d10;
        }

        public final void a(a0.a aVar) {
            List h10 = C4360d.i(this.f4524c, this.f4525d.f4523a);
            if (h10 != null) {
                int size = h10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    v vVar = (v) h10.get(i10);
                    a0 a0Var = (a0) vVar.a();
                    C17631a aVar2 = (C17631a) vVar.b();
                    a0.a.k(aVar, a0Var, aVar2 != null ? ((n) aVar2.invoke()).n() : n.f23044b.a(), 0.0f, 2, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public D(C17631a<Boolean> aVar) {
        this.f4523a = aVar;
    }

    public J i(K k10, List<? extends H> list, long j10) {
        return K.v0(k10, C5267b.l(j10), C5267b.k(j10), (Map) null, new a(list, this), 4, (Object) null);
    }
}
