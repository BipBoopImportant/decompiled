package GJ;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00020\u0003\"\u0004\b\u0002\u0010\f2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\t0\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LGJ/A;", "T", "R", "LGJ/h;", "sequence", "Lkotlin/Function1;", "transformer", "<init>", "(LGJ/h;LnI/l;)V", "", "iterator", "()Ljava/util/Iterator;", "E", "e", "(LnI/l;)LGJ/h;", "a", "LGJ/h;", "b", "LnI/l;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GJ.A  reason: case insensitive filesystem */
public final class C15757A<T, R> implements C15765h<R> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15765h<T> f134718a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<T, R> f134719b;

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"GJ/A$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GJ.A$a */
    public static final class a implements Iterator<R>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f134720a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15757A<T, R> f134721b;

        a(C15757A<T, R> a10) {
            this.f134721b = a10;
            this.f134720a = a10.f134718a.iterator();
        }

        public boolean hasNext() {
            return this.f134720a.hasNext();
        }

        public R next() {
            return this.f134721b.f134719b.invoke(this.f134720a.next());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15757A(C15765h<? extends T> hVar, C17642l<? super T, ? extends R> lVar) {
        C17542s.j(hVar, "sequence");
        C17542s.j(lVar, "transformer");
        this.f134718a = hVar;
        this.f134719b = lVar;
    }

    public final <E> C15765h<E> e(C17642l<? super R, ? extends Iterator<? extends E>> lVar) {
        C17542s.j(lVar, "iterator");
        return new C15763f(this.f134718a, this.f134719b, lVar);
    }

    public Iterator<R> iterator() {
        return new a(this);
    }
}
