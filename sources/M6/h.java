package M6;

import M6.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0012\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LM6/h;", "LM6/r;", "left", "LM6/r$c;", "element", "<init>", "(LM6/r;LM6/r$c;)V", "E", "LM6/r$d;", "key", "a", "(LM6/r$d;)LM6/r$c;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "b", "(LM6/r$d;)LM6/r;", "c", "LM6/r;", "d", "LM6/r$c;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class h implements r {

    /* renamed from: c  reason: collision with root package name */
    private final r f38583c;

    /* renamed from: d  reason: collision with root package name */
    private final r.c f38584d;

    public h(r rVar, r.c cVar) {
        C17542s.j(rVar, "left");
        C17542s.j(cVar, "element");
        this.f38583c = rVar;
        this.f38584d = cVar;
    }

    public <E extends r.c> E a(r.d<E> dVar) {
        C17542s.j(dVar, "key");
        h hVar = this;
        while (true) {
            E a10 = hVar.f38584d.a(dVar);
            if (a10 != null) {
                return a10;
            }
            r rVar = hVar.f38583c;
            if (!(rVar instanceof h)) {
                return rVar.a(dVar);
            }
            hVar = (h) rVar;
        }
    }

    public r b(r.d<?> dVar) {
        C17542s.j(dVar, "key");
        if (this.f38584d.a(dVar) != null) {
            return this.f38583c;
        }
        r b10 = this.f38583c.b(dVar);
        return b10 == this.f38583c ? this : b10 == m.f38597c ? this.f38584d : new h(b10, this.f38584d);
    }

    public r c(r rVar) {
        return r.b.a(this, rVar);
    }

    public <R> R fold(R r10, p<? super R, ? super r.c, ? extends R> pVar) {
        C17542s.j(pVar, "operation");
        return pVar.invoke(this.f38583c.fold(r10, pVar), this.f38584d);
    }
}
