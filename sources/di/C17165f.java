package dI;

import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \n2\u00020\u0001:\u0001\u000bJ)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"LdI/f;", "LdI/i$b;", "T", "LdI/e;", "continuation", "f0", "(LdI/e;)LdI/e;", "LXH/N;", "t", "(LdI/e;)V", "s0", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dI.f  reason: case insensitive filesystem */
public interface C17165f extends C17168i.b {

    /* renamed from: s0  reason: collision with root package name */
    public static final b f142966s0 = b.f142967a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dI.f$a */
    public static final class a {
        public static <E extends C17168i.b> E a(C17165f fVar, C17168i.c<E> cVar) {
            E b10;
            C17542s.j(cVar, "key");
            if (cVar instanceof C17161b) {
                C17161b bVar = (C17161b) cVar;
                if (!bVar.a(fVar.getKey()) || (b10 = bVar.b(fVar)) == null) {
                    return null;
                }
                return b10;
            } else if (C17165f.f142966s0 != cVar) {
                return null;
            } else {
                C17542s.h(fVar, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return fVar;
            }
        }

        public static C17168i b(C17165f fVar, C17168i.c<?> cVar) {
            C17542s.j(cVar, "key");
            if (!(cVar instanceof C17161b)) {
                return C17165f.f142966s0 == cVar ? C17169j.f142968a : fVar;
            }
            C17161b bVar = (C17161b) cVar;
            return (!bVar.a(fVar.getKey()) || bVar.b(fVar) == null) ? fVar : C17169j.f142968a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LdI/f$b;", "LdI/i$c;", "LdI/f;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dI.f$b */
    public static final class b implements C17168i.c<C17165f> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f142967a = new b();

        private b() {
        }
    }

    <T> C17164e<T> f0(C17164e<? super T> eVar);

    void t(C17164e<?> eVar);
}
