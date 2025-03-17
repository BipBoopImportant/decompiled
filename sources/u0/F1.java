package U0;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import mI.C17604b;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\f\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000e\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u000f¢\u0006\u0004\b\u0010\u0010\u0011\u0001\u0004\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"LU0/F1;", "T", "", "LU0/m;", "composer", "a", "(LU0/m;)LU0/m;", "V", "value", "Lkotlin/Function2;", "LXH/N;", "block", "c", "(LU0/m;Ljava/lang/Object;LnI/p;)V", "d", "Lkotlin/Function1;", "b", "(LU0/m;LnI/l;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C17604b
public final class F1<T> {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u00028\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LXH/N;", "it", "a", "(Ljava/lang/Object;LXH/N;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements p<T, C16807N, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<T, C16807N> f13746c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17642l<? super T, C16807N> lVar) {
            super(2);
            this.f13746c = lVar;
        }

        public final void a(T t10, C16807N n10) {
            this.f13746c.invoke(t10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a(obj, (C16807N) obj2);
            return C16807N.f139792a;
        }
    }

    public static <T> C4889m a(C4889m mVar) {
        return mVar;
    }

    public static final void b(C4889m mVar, C17642l<? super T, C16807N> lVar) {
        if (mVar.i()) {
            mVar.w(C16807N.f139792a, new a(lVar));
        }
    }

    public static final <V> void c(C4889m mVar, V v10, p<? super T, ? super V, C16807N> pVar) {
        if (mVar.i() || !C17542s.e(mVar.D(), v10)) {
            mVar.u(v10);
            mVar.w(v10, pVar);
        }
    }

    public static final <V> void d(C4889m mVar, V v10, p<? super T, ? super V, C16807N> pVar) {
        boolean i10 = mVar.i();
        if (i10 || !C17542s.e(mVar.D(), v10)) {
            mVar.u(v10);
            if (!i10) {
                mVar.w(v10, pVar);
            }
        }
    }
}
