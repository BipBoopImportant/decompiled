package B0;

import E1.H;
import E1.I;
import E1.J;
import E1.K;
import E1.a0;
import XH.C16807N;
import XH.v;
import c2.C5267b;
import c2.c;
import c2.n;
import c2.o;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import o1.C5669i;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\u000f*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LB0/i0;", "LE1/I;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "", "Lo1/i;", "placements", "<init>", "(LnI/a;LnI/a;)V", "LE1/K;", "LE1/H;", "measurables", "Lc2/b;", "constraints", "LE1/J;", "i", "(LE1/K;Ljava/util/List;J)LE1/J;", "a", "LnI/a;", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i0 implements I {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<Boolean> f4902a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<List<C5669i>> f4903b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<v<a0, n>> f4904c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List<v<a0, C17631a<n>>> f4905d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(List<? extends v<? extends a0, n>> list, List<? extends v<? extends a0, ? extends C17631a<n>>> list2) {
            super(1);
            this.f4904c = list;
            this.f4905d = list2;
        }

        public final void a(a0.a aVar) {
            List<v<a0, n>> list = this.f4904c;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    v vVar = list.get(i10);
                    a0.a.k(aVar, (a0) vVar.a(), ((n) vVar.b()).n(), 0.0f, 2, (Object) null);
                }
            }
            List<v<a0, C17631a<n>>> list2 = this.f4905d;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    v vVar2 = list2.get(i11);
                    a0 a0Var = (a0) vVar2.a();
                    C17631a aVar2 = (C17631a) vVar2.b();
                    a0.a.k(aVar, a0Var, aVar2 != null ? ((n) aVar2.invoke()).n() : n.f23044b.a(), 0.0f, 2, (Object) null);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public i0(C17631a<Boolean> aVar, C17631a<? extends List<C5669i>> aVar2) {
        this.f4902a = aVar;
        this.f4903b = aVar2;
    }

    public J i(K k10, List<? extends H> list, long j10) {
        List<? extends H> list2 = list;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list2.get(i10);
            if (!(((H) obj).h() instanceof m0)) {
                arrayList.add(obj);
            }
        }
        List invoke = this.f4903b.invoke();
        ArrayList arrayList2 = null;
        if (invoke != null) {
            ArrayList arrayList3 = new ArrayList(invoke.size());
            int size2 = invoke.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C5669i iVar = (C5669i) invoke.get(i11);
                v vVar = iVar != null ? new v(((H) arrayList.get(i11)).i0(c.b(0, (int) ((float) Math.floor((double) iVar.t())), 0, (int) ((float) Math.floor((double) iVar.n())), 5, (Object) null)), n.b(o.a(Math.round(iVar.o()), Math.round(iVar.r())))) : null;
                if (vVar != null) {
                    arrayList3.add(vVar);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            Object obj2 = list2.get(i12);
            if (((H) obj2).h() instanceof m0) {
                arrayList4.add(obj2);
            }
        }
        return K.v0(k10, C5267b.l(j10), C5267b.k(j10), (Map) null, new a(arrayList2, C4360d.i(arrayList4, this.f4902a)), 4, (Object) null);
    }
}
