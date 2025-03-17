package GJ;

import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u0018\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00028\u0000H@¢\u0006\u0004\b\u0012\u0010\u0013J\u001e\u0010\u0015\u001a\u00020\u00052\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001f\u001a\u00060\u001bj\u0002`\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010$R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"LGJ/i;", "T", "LGJ/j;", "", "LdI/e;", "LXH/N;", "<init>", "()V", "l", "()Ljava/lang/Object;", "", "k", "()Ljava/lang/Throwable;", "", "hasNext", "()Z", "next", "value", "d", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "iterator", "i", "(Ljava/util/Iterator;LdI/e;)Ljava/lang/Object;", "LXH/x;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "Lkotlin/sequences/State;", "a", "I", "state", "b", "Ljava/lang/Object;", "nextValue", "c", "Ljava/util/Iterator;", "nextIterator", "LdI/e;", "getNextStep", "()LdI/e;", "m", "(LdI/e;)V", "nextStep", "LdI/i;", "getContext", "()LdI/i;", "context", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GJ.i  reason: case insensitive filesystem */
final class C15766i<T> extends C15767j<T> implements Iterator<T>, C17164e<C16807N>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private int f134747a;

    /* renamed from: b  reason: collision with root package name */
    private T f134748b;

    /* renamed from: c  reason: collision with root package name */
    private Iterator<? extends T> f134749c;

    /* renamed from: d  reason: collision with root package name */
    private C17164e<? super C16807N> f134750d;

    private final Throwable k() {
        int i10 = this.f134747a;
        if (i10 == 4) {
            return new NoSuchElementException();
        }
        if (i10 == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f134747a);
    }

    private final T l() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    public Object d(T t10, C17164e<? super C16807N> eVar) {
        this.f134748b = t10;
        this.f134747a = 3;
        this.f134750d = eVar;
        Object f10 = C17187b.f();
        if (f10 == C17187b.f()) {
            h.c(eVar);
        }
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public C17168i getContext() {
        return C17169j.f142968a;
    }

    public boolean hasNext() {
        while (true) {
            int i10 = this.f134747a;
            if (i10 != 0) {
                if (i10 == 1) {
                    Iterator<? extends T> it = this.f134749c;
                    C17542s.g(it);
                    if (it.hasNext()) {
                        this.f134747a = 2;
                        return true;
                    }
                    this.f134749c = null;
                } else if (i10 == 2 || i10 == 3) {
                    return true;
                } else {
                    if (i10 == 4) {
                        return false;
                    }
                    throw k();
                }
            }
            this.f134747a = 5;
            C17164e<? super C16807N> eVar = this.f134750d;
            C17542s.g(eVar);
            this.f134750d = null;
            x.a aVar = x.f139812b;
            eVar.resumeWith(x.b(C16807N.f139792a));
        }
    }

    public Object i(Iterator<? extends T> it, C17164e<? super C16807N> eVar) {
        if (!it.hasNext()) {
            return C16807N.f139792a;
        }
        this.f134749c = it;
        this.f134747a = 2;
        this.f134750d = eVar;
        Object f10 = C17187b.f();
        if (f10 == C17187b.f()) {
            h.c(eVar);
        }
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    public final void m(C17164e<? super C16807N> eVar) {
        this.f134750d = eVar;
    }

    public T next() {
        int i10 = this.f134747a;
        if (i10 == 0 || i10 == 1) {
            return l();
        }
        if (i10 == 2) {
            this.f134747a = 1;
            Iterator<? extends T> it = this.f134749c;
            C17542s.g(it);
            return it.next();
        } else if (i10 == 3) {
            this.f134747a = 0;
            T t10 = this.f134748b;
            this.f134748b = null;
            return t10;
        } else {
            throw k();
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void resumeWith(Object obj) {
        y.b(obj);
        this.f134747a = 4;
    }
}
