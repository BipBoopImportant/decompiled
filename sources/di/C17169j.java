package dI;

import dI.C17168i;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\u0006\u0010\r\u001a\u00028\u00002\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u00000\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u00020\u00012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LdI/j;", "LdI/i;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "LdI/i$b;", "E", "LdI/i$c;", "key", "get", "(LdI/i$c;)LdI/i$b;", "R", "initial", "Lkotlin/Function2;", "operation", "fold", "(Ljava/lang/Object;LnI/p;)Ljava/lang/Object;", "context", "plus", "(LdI/i;)LdI/i;", "minusKey", "(LdI/i$c;)LdI/i;", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: dI.j  reason: case insensitive filesystem */
public final class C17169j implements C17168i, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final C17169j f142968a = new C17169j();

    private C17169j() {
    }

    public <R> R fold(R r10, p<? super R, ? super C17168i.b, ? extends R> pVar) {
        C17542s.j(pVar, "operation");
        return r10;
    }

    public <E extends C17168i.b> E get(C17168i.c<E> cVar) {
        C17542s.j(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public C17168i minusKey(C17168i.c<?> cVar) {
        C17542s.j(cVar, "key");
        return this;
    }

    public C17168i plus(C17168i iVar) {
        C17542s.j(iVar, "context");
        return iVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
