package dI;

import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LdI/a;", "LdI/i$b;", "LdI/i$c;", "key", "<init>", "(LdI/i$c;)V", "LdI/i$c;", "getKey", "()LdI/i$c;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dI.a  reason: case insensitive filesystem */
public abstract class C17160a implements C17168i.b {
    private final C17168i.c<?> key;

    public C17160a(C17168i.c<?> cVar) {
        C17542s.j(cVar, "key");
        this.key = cVar;
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return C17168i.b.a.a(this, r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return C17168i.b.a.b(this, cVar);
    }

    public C17168i.c<?> getKey() {
        return this.key;
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return C17168i.b.a.c(this, cVar);
    }

    public C17168i plus(C17168i iVar) {
        return C17168i.b.a.d(this, iVar);
    }
}
