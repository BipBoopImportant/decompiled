package dI;

import dI.C17168i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J*\u0010\u0015\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00172\u0006\u0010\u0018\u001a\u00028\u00002\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u00020\u00012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\f2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\tH\u0016¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010)¨\u0006*"}, d2 = {"LdI/d;", "LdI/i;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "left", "LdI/i$b;", "element", "<init>", "(LdI/i;LdI/i$b;)V", "", "k", "()I", "", "b", "(LdI/i$b;)Z", "context", "j", "(LdI/d;)Z", "E", "LdI/i$c;", "key", "get", "(LdI/i$c;)LdI/i$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "minusKey", "(LdI/i$c;)LdI/i;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "a", "LdI/i;", "LdI/i$b;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dI.d  reason: case insensitive filesystem */
public final class C17163d implements C17168i, Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f142964a;

    /* renamed from: b  reason: collision with root package name */
    private final C17168i.b f142965b;

    public C17163d(C17168i iVar, C17168i.b bVar) {
        C17542s.j(iVar, "left");
        C17542s.j(bVar, "element");
        this.f142964a = iVar;
        this.f142965b = bVar;
    }

    private final boolean b(C17168i.b bVar) {
        return C17542s.e(get(bVar.getKey()), bVar);
    }

    private final boolean j(C17163d dVar) {
        while (b(dVar.f142965b)) {
            C17168i iVar = dVar.f142964a;
            if (iVar instanceof C17163d) {
                dVar = (C17163d) iVar;
            } else {
                C17542s.h(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((C17168i.b) iVar);
            }
        }
        return false;
    }

    private final int k() {
        int i10 = 2;
        C17163d dVar = this;
        while (true) {
            C17168i iVar = dVar.f142964a;
            dVar = iVar instanceof C17163d ? (C17163d) iVar : null;
            if (dVar == null) {
                return i10;
            }
            i10++;
        }
    }

    /* access modifiers changed from: private */
    public static final String m(String str, C17168i.b bVar) {
        C17542s.j(str, "acc");
        C17542s.j(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C17163d) {
                C17163d dVar = (C17163d) obj;
                if (dVar.k() != k() || !dVar.j(this)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        C17542s.j(pVar, "operation");
        return pVar.invoke(this.f142964a.fold(r10, pVar), this.f142965b);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        C17542s.j(cVar, "key");
        C17163d dVar = this;
        while (true) {
            E e10 = dVar.f142965b.get(cVar);
            if (e10 != null) {
                return e10;
            }
            C17168i iVar = dVar.f142964a;
            if (!(iVar instanceof C17163d)) {
                return iVar.get(cVar);
            }
            dVar = (C17163d) iVar;
        }
    }

    public int hashCode() {
        return this.f142964a.hashCode() + this.f142965b.hashCode();
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        C17542s.j(cVar, "key");
        if (this.f142965b.get(cVar) != null) {
            return this.f142964a;
        }
        C17168i minusKey = this.f142964a.minusKey(cVar);
        return minusKey == this.f142964a ? this : minusKey == C17169j.f142968a ? this.f142965b : new C17163d(minusKey, this.f142965b);
    }

    public C17168i plus(C17168i iVar) {
        return C17168i.a.b(this, iVar);
    }

    public String toString() {
        return '[' + ((String) fold("", new C17162c())) + ']';
    }
}
