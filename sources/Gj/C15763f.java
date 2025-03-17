package GJ;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010(\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004BC\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R&\u0010\t\u001a\u0014\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010¨\u0006\u0012"}, d2 = {"LGJ/f;", "T", "R", "E", "LGJ/h;", "sequence", "Lkotlin/Function1;", "transformer", "", "iterator", "<init>", "(LGJ/h;LnI/l;LnI/l;)V", "()Ljava/util/Iterator;", "a", "LGJ/h;", "b", "LnI/l;", "c", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GJ.f  reason: case insensitive filesystem */
public final class C15763f<T, R, E> implements C15765h<E> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15765h<T> f134735a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<T, R> f134736b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17642l<R, Iterator<E>> f134737c;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0004R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR*\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"GJ/f$a", "", "", "c", "()Z", "next", "()Ljava/lang/Object;", "hasNext", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "b", "getItemIterator", "setItemIterator", "(Ljava/util/Iterator;)V", "itemIterator", "", "I", "getState", "()I", "setState", "(I)V", "state", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GJ.f$a */
    public static final class a implements Iterator<E>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f134738a;

        /* renamed from: b  reason: collision with root package name */
        private Iterator<? extends E> f134739b;

        /* renamed from: c  reason: collision with root package name */
        private int f134740c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15763f<T, R, E> f134741d;

        a(C15763f<T, R, E> fVar) {
            this.f134741d = fVar;
            this.f134738a = fVar.f134735a.iterator();
        }

        private final boolean c() {
            Iterator<? extends E> it = this.f134739b;
            if (it == null || !it.hasNext()) {
                while (this.f134738a.hasNext()) {
                    Iterator<? extends E> it2 = (Iterator) this.f134741d.f134737c.invoke(this.f134741d.f134736b.invoke(this.f134738a.next()));
                    if (it2.hasNext()) {
                        this.f134739b = it2;
                        this.f134740c = 1;
                        return true;
                    }
                }
                this.f134740c = 2;
                this.f134739b = null;
                return false;
            }
            this.f134740c = 1;
            return true;
        }

        public boolean hasNext() {
            int i10 = this.f134740c;
            if (i10 == 1) {
                return true;
            }
            if (i10 == 2) {
                return false;
            }
            return c();
        }

        public E next() {
            int i10 = this.f134740c;
            if (i10 == 2) {
                throw new NoSuchElementException();
            } else if (i10 != 0 || c()) {
                this.f134740c = 0;
                Iterator<? extends E> it = this.f134739b;
                C17542s.g(it);
                return it.next();
            } else {
                throw new NoSuchElementException();
            }
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C15763f(C15765h<? extends T> hVar, C17642l<? super T, ? extends R> lVar, C17642l<? super R, ? extends Iterator<? extends E>> lVar2) {
        C17542s.j(hVar, "sequence");
        C17542s.j(lVar, "transformer");
        C17542s.j(lVar2, "iterator");
        this.f134735a = hVar;
        this.f134736b = lVar;
        this.f134737c = lVar2;
    }

    public Iterator<E> iterator() {
        return new a(this);
    }
}
