package dI;

import dI.C17165f;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\bg\u0018\u00002\u00020\u0001:\u0002\u0013\u0014J*\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\t\u001a\u00028\u00002\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00002\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H&¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"LdI/i;", "", "LdI/i$b;", "E", "LdI/i$c;", "key", "get", "(LdI/i$c;)LdI/i$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "context", "plus", "(LdI/i;)LdI/i;", "minusKey", "(LdI/i$c;)LdI/i;", "c", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dI.i  reason: case insensitive filesystem */
public interface C17168i {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dI.i$a */
    public static final class a {
        public static C17168i b(C17168i iVar, C17168i iVar2) {
            C17542s.j(iVar2, "context");
            return iVar2 == C17169j.f142968a ? iVar : (C17168i) iVar2.fold(iVar, new C17167h());
        }

        /* access modifiers changed from: private */
        public static C17168i c(C17168i iVar, b bVar) {
            C17163d dVar;
            C17542s.j(iVar, "acc");
            C17542s.j(bVar, "element");
            C17168i minusKey = iVar.minusKey(bVar.getKey());
            C17169j jVar = C17169j.f142968a;
            if (minusKey == jVar) {
                return bVar;
            }
            C17165f.b bVar2 = C17165f.f142966s0;
            C17165f fVar = (C17165f) minusKey.get(bVar2);
            if (fVar == null) {
                dVar = new C17163d(minusKey, bVar);
            } else {
                C17168i minusKey2 = minusKey.minusKey(bVar2);
                if (minusKey2 == jVar) {
                    return new C17163d(bVar, fVar);
                }
                dVar = new C17163d(new C17163d(minusKey2, bVar), fVar);
            }
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J*\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0002*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\b\u001a\u00028\u00002\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00028\u00000\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LdI/i$b;", "LdI/i;", "E", "LdI/i$c;", "key", "get", "(LdI/i$c;)LdI/i$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "minusKey", "(LdI/i$c;)LdI/i;", "getKey", "()LdI/i$c;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dI.i$b */
    public interface b extends C17168i {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: dI.i$b$a */
        public static final class a {
            public static <R> R a(b bVar, R r10, p<? super R, ? super b, ? extends R> pVar) {
                C17542s.j(pVar, "operation");
                return pVar.invoke(r10, bVar);
            }

            public static <E extends b> E b(b bVar, c<E> cVar) {
                C17542s.j(cVar, "key");
                if (!C17542s.e(bVar.getKey(), cVar)) {
                    return null;
                }
                C17542s.h(bVar, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return bVar;
            }

            public static C17168i c(b bVar, c<?> cVar) {
                C17542s.j(cVar, "key");
                return C17542s.e(bVar.getKey(), cVar) ? C17169j.f142968a : bVar;
            }

            public static C17168i d(b bVar, C17168i iVar) {
                C17542s.j(iVar, "context");
                return a.b(bVar, iVar);
            }
        }

        <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

        <E extends b> E get(c<E> cVar);

        c<?> getKey();

        C17168i minusKey(c<?> cVar);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"LdI/i$c;", "LdI/i$b;", "E", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: dI.i$c */
    public interface c<E extends b> {
    }

    <R> R fold(R r10, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    C17168i minusKey(c<?> cVar);

    C17168i plus(C17168i iVar);
}
