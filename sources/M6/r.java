package M6;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u0000 \u00062\u00020\u0001:\u0003\u0006\u000f\u0013J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"LM6/r;", "", "LM6/r$c;", "E", "LM6/r$d;", "key", "a", "(LM6/r$d;)LM6/r$c;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "context", "c", "(LM6/r;)LM6/r;", "b", "(LM6/r$d;)LM6/r;", "d", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface r {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38607a = a.f38609a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f38608b = m.f38597c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001¨\u0006\u0007"}, d2 = {"LM6/r$a;", "", "<init>", "()V", "LM6/r;", "Empty", "LM6/r;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f38609a = new a();

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class b {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LM6/r;", "acc", "LM6/r$c;", "element", "a", "(LM6/r;LM6/r$c;)LM6/r;"}, k = 3, mv = {1, 5, 1})
        static final class a extends C17544u implements p<r, c, r> {

            /* renamed from: c  reason: collision with root package name */
            public static final a f38610c = new a();

            a() {
                super(2);
            }

            /* renamed from: a */
            public final r invoke(r rVar, c cVar) {
                C17542s.j(rVar, "acc");
                C17542s.j(cVar, "element");
                r b10 = rVar.b(cVar.getKey());
                return b10 == m.f38597c ? cVar : new h(b10, cVar);
            }
        }

        public static r a(r rVar, r rVar2) {
            C17542s.j(rVar2, "context");
            return rVar2 == m.f38597c ? rVar : (r) rVar2.fold(rVar, a.f38610c);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LM6/r$c;", "LM6/r;", "E", "LM6/r$d;", "key", "a", "(LM6/r$d;)LM6/r$c;", "getKey", "()LM6/r$d;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface c extends r {

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class a {
            public static <R> R a(c cVar, R r10, p<? super R, ? super c, ? extends R> pVar) {
                C17542s.j(pVar, "operation");
                return pVar.invoke(r10, cVar);
            }

            public static <E extends c> E b(c cVar, d<E> dVar) {
                C17542s.j(dVar, "key");
                if (!C17542s.e(cVar.getKey(), dVar)) {
                    return null;
                }
                C17542s.h(cVar, "null cannot be cast to non-null type E of com.apollographql.apollo3.api.ExecutionContext.Element.get");
                return cVar;
            }

            public static r c(c cVar, d<?> dVar) {
                C17542s.j(dVar, "key");
                return C17542s.e(cVar.getKey(), dVar) ? m.f38597c : cVar;
            }

            public static r d(c cVar, r rVar) {
                C17542s.j(rVar, "context");
                return b.a(cVar, rVar);
            }
        }

        <E extends c> E a(d<E> dVar);

        d<?> getKey();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LM6/r$d;", "LM6/r$c;", "E", "", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface d<E extends c> {
    }

    <E extends c> E a(d<E> dVar);

    r b(d<?> dVar);

    r c(r rVar);

    <R> R fold(R r10, p<? super R, ? super c, ? extends R> pVar);
}
