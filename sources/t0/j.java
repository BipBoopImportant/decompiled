package t0;

import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.q;
import nI.r;
import v0.C6149o;
import v0.I;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ]\u0010\u0011\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00042\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00042\u0018\u0010\u0010\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0013\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u0004H\u0017¢\u0006\u0004\b\u0015\u0010\u0014R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001dR\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lt0/j;", "Lv0/o;", "Lt0/i;", "Lt0/x;", "Lkotlin/Function1;", "LXH/N;", "content", "<init>", "(LnI/l;)V", "", "count", "", "key", "contentType", "Lkotlin/Function2;", "Lt0/c;", "itemContent", "e", "(ILnI/l;LnI/l;LnI/r;)V", "b", "(Ljava/lang/Object;Ljava/lang/Object;LnI/q;)V", "k", "Lv0/I;", "a", "Lv0/I;", "r", "()Lv0/I;", "intervals", "", "Ljava/util/List;", "_headerIndexes", "", "q", "()Ljava/util/List;", "headerIndexes", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j extends C6149o<i> implements x {

    /* renamed from: a  reason: collision with root package name */
    private final I<i> f29194a = new I<>();

    /* renamed from: b  reason: collision with root package name */
    private List<Integer> f29195b;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "<anonymous parameter 0>", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f29196c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Object obj) {
            super(1);
            this.f29196c = obj;
        }

        public final Object a(int i10) {
            return this.f29196c;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f29197c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Object obj) {
            super(1);
            this.f29197c = obj;
        }

        public final Object a(int i10) {
            return this.f29197c;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lt0/c;", "", "it", "LXH/N;", "a", "(Lt0/c;ILU0/m;I)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements r<C5938c, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ q<C5938c, C4889m, Integer, C16807N> f29198c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(q<? super C5938c, ? super C4889m, ? super Integer, C16807N> qVar) {
            super(4);
            this.f29198c = qVar;
        }

        public final void a(C5938c cVar, int i10, C4889m mVar, int i11) {
            if ((i11 & 6) == 0) {
                i11 |= mVar.V(cVar) ? 4 : 2;
            }
            if ((i11 & 131) != 130 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1010194746, i11, -1, "androidx.compose.foundation.lazy.LazyListIntervalContent.item.<anonymous> (LazyListIntervalContent.kt:58)");
                }
                this.f29198c.invoke(cVar, mVar, Integer.valueOf(i11 & 14));
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5938c) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    public j(C17642l<? super x, C16807N> lVar) {
        lVar.invoke(this);
    }

    public void b(Object obj, Object obj2, q<? super C5938c, ? super C4889m, ? super Integer, C16807N> qVar) {
        n().c(1, new i(obj != null ? new a(obj) : null, new b(obj2), c1.c.c(-1010194746, true, new c(qVar))));
    }

    public void e(int i10, C17642l<? super Integer, ? extends Object> lVar, C17642l<? super Integer, ? extends Object> lVar2, r<? super C5938c, ? super Integer, ? super C4889m, ? super Integer, C16807N> rVar) {
        n().c(i10, new i(lVar, lVar2, rVar));
    }

    public void k(Object obj, Object obj2, q<? super C5938c, ? super C4889m, ? super Integer, C16807N> qVar) {
        List list = this.f29195b;
        if (list == null) {
            list = new ArrayList();
            this.f29195b = list;
        }
        list.add(Integer.valueOf(n().a()));
        b(obj, obj2, qVar);
    }

    public final List<Integer> q() {
        List<Integer> list = this.f29195b;
        return list == null ? C16877v.n() : list;
    }

    /* renamed from: r */
    public I<i> n() {
        return this.f29194a;
    }
}
