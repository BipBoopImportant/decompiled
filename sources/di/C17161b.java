package dI;

import dI.C17168i;
import dI.C17168i.b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00028\u00002\b\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0018\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"LdI/b;", "LdI/i$b;", "B", "E", "LdI/i$c;", "baseKey", "Lkotlin/Function1;", "safeCast", "<init>", "(LdI/i$c;LnI/l;)V", "element", "b", "(LdI/i$b;)LdI/i$b;", "key", "", "a", "(LdI/i$c;)Z", "LnI/l;", "LdI/i$c;", "topmostKey", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dI.b  reason: case insensitive filesystem */
public abstract class C17161b<B extends C17168i.b, E extends B> implements C17168i.c<E> {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C17168i.b, E> f142962a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i.c<?> f142963b;

    public C17161b(C17168i.c<B> cVar, C17642l<? super C17168i.b, ? extends E> lVar) {
        C17542s.j(cVar, "baseKey");
        C17542s.j(lVar, "safeCast");
        this.f142962a = lVar;
        this.f142963b = cVar instanceof C17161b ? ((C17161b) cVar).f142963b : cVar;
    }

    public final boolean a(C17168i.c<?> cVar) {
        C17542s.j(cVar, "key");
        return cVar == this || this.f142963b == cVar;
    }

    public final E b(C17168i.b bVar) {
        C17542s.j(bVar, "element");
        return (C17168i.b) this.f142962a.invoke(bVar);
    }
}
