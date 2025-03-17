package V5;

import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ*\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001c*\u00020\u001b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010#\u001a\u00028\u0000\"\n\b\u0000\u0010\u001f*\u0004\u0018\u00010\u00102\u0006\u0010 \u001a\u00028\u00002\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000!H\u0001¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010%¨\u0006&"}, d2 = {"LV5/h;", "LdI/i;", "delegate", "<init>", "(LdI/i;)V", "old", "new", "a", "(LdI/i;LdI/i;)LV5/h;", "LdI/i$c;", "key", "minusKey", "(LdI/i$c;)LdI/i;", "context", "plus", "(LdI/i;)LdI/i;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "LdI/i$b;", "E", "get", "(LdI/i$c;)LdI/i$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "LdI/i;", "coil-compose-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h implements C17168i {

    /* renamed from: a  reason: collision with root package name */
    private final C17168i f40443a;

    public h(C17168i iVar) {
        this.f40443a = iVar;
    }

    public abstract h a(C17168i iVar, C17168i iVar2);

    public boolean equals(Object obj) {
        return C17542s.e(this.f40443a, obj);
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        return this.f40443a.fold(r10, pVar);
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        return this.f40443a.get(cVar);
    }

    public int hashCode() {
        return this.f40443a.hashCode();
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        return a(this, this.f40443a.minusKey(cVar));
    }

    public C17168i plus(C17168i iVar) {
        return a(this, this.f40443a.plus(iVar));
    }

    public String toString() {
        return "ForwardingCoroutineContext(delegate=" + this.f40443a + ')';
    }
}
