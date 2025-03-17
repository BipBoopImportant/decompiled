package OJ;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import oI.C17693a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0013\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LOJ/e;", "E", "LOJ/d;", "", "LOJ/c;", "builder", "<init>", "(LOJ/c;)V", "LXH/N;", "i", "()V", "h", "next", "()Ljava/lang/Object;", "remove", "d", "LOJ/c;", "e", "Ljava/lang/Object;", "lastIteratedElement", "", "f", "Z", "nextWasInvoked", "", "g", "I", "expectedModCount", "kotlinx-collections-immutable"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: OJ.e  reason: case insensitive filesystem */
public final class C16170e<E> extends C16169d<E> implements Iterator<E>, C17693a {

    /* renamed from: d  reason: collision with root package name */
    private final C16168c<E> f136936d;

    /* renamed from: e  reason: collision with root package name */
    private E f136937e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f136938f;

    /* renamed from: g  reason: collision with root package name */
    private int f136939g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16170e(C16168c<E> cVar) {
        super(cVar.b(), cVar.i());
        C17542s.j(cVar, "builder");
        this.f136936d = cVar;
        this.f136939g = cVar.i().i();
    }

    private final void h() {
        if (this.f136936d.i().i() != this.f136939g) {
            throw new ConcurrentModificationException();
        }
    }

    private final void i() {
        if (!this.f136938f) {
            throw new IllegalStateException();
        }
    }

    public E next() {
        h();
        E next = super.next();
        this.f136937e = next;
        this.f136938f = true;
        return next;
    }

    public void remove() {
        i();
        C16168c<E> cVar = this.f136936d;
        W.a(cVar).remove(this.f136937e);
        this.f136937e = null;
        this.f136938f = false;
        this.f136939g = this.f136936d.i().i();
        f(d() - 1);
    }
}
