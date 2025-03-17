package GJ;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B)\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LGJ/z;", "T", "LGJ/h;", "sequence", "Lkotlin/Function1;", "", "predicate", "<init>", "(LGJ/h;LnI/l;)V", "", "iterator", "()Ljava/util/Iterator;", "a", "LGJ/h;", "b", "LnI/l;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z<T> implements C15765h<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15765h<T> f134773a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<T, Boolean> f134774b;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u0004\u0018\u00018\u00008\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"GJ/z$a", "", "LXH/N;", "c", "()V", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "b", "I", "getNextState", "()I", "setNextState", "(I)V", "nextState", "Ljava/lang/Object;", "getNextItem", "setNextItem", "(Ljava/lang/Object;)V", "nextItem", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f134775a;

        /* renamed from: b  reason: collision with root package name */
        private int f134776b = -1;

        /* renamed from: c  reason: collision with root package name */
        private T f134777c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ z<T> f134778d;

        a(z<T> zVar) {
            this.f134778d = zVar;
            this.f134775a = zVar.f134773a.iterator();
        }

        private final void c() {
            if (this.f134775a.hasNext()) {
                T next = this.f134775a.next();
                if (((Boolean) this.f134778d.f134774b.invoke(next)).booleanValue()) {
                    this.f134776b = 1;
                    this.f134777c = next;
                    return;
                }
            }
            this.f134776b = 0;
        }

        public boolean hasNext() {
            if (this.f134776b == -1) {
                c();
            }
            return this.f134776b == 1;
        }

        public T next() {
            if (this.f134776b == -1) {
                c();
            }
            if (this.f134776b != 0) {
                T t10 = this.f134777c;
                this.f134777c = null;
                this.f134776b = -1;
                return t10;
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public z(C15765h<? extends T> hVar, C17642l<? super T, Boolean> lVar) {
        C17542s.j(hVar, "sequence");
        C17542s.j(lVar, "predicate");
        this.f134773a = hVar;
        this.f134774b = lVar;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
