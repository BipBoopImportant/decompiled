package GJ;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011¨\u0006\u0012"}, d2 = {"LGJ/y;", "T", "LGJ/h;", "LGJ/c;", "sequence", "", "count", "<init>", "(LGJ/h;I)V", "n", "a", "(I)LGJ/h;", "b", "", "iterator", "()Ljava/util/Iterator;", "LGJ/h;", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y<T> implements C15765h<T>, C15760c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15765h<T> f134769a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f134770b;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"GJ/y$a", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "", "a", "I", "getLeft", "()I", "setLeft", "(I)V", "left", "b", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f134771a;

        /* renamed from: b  reason: collision with root package name */
        private final Iterator<T> f134772b;

        a(y<T> yVar) {
            this.f134771a = yVar.f134770b;
            this.f134772b = yVar.f134769a.iterator();
        }

        public boolean hasNext() {
            return this.f134771a > 0 && this.f134772b.hasNext();
        }

        public T next() {
            int i10 = this.f134771a;
            if (i10 != 0) {
                this.f134771a = i10 - 1;
                return this.f134772b.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public y(C15765h<? extends T> hVar, int i10) {
        C17542s.j(hVar, "sequence");
        this.f134769a = hVar;
        this.f134770b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException(("count must be non-negative, but was " + i10 + '.').toString());
        }
    }

    public C15765h<T> a(int i10) {
        int i11 = this.f134770b;
        return i10 >= i11 ? C15768k.j() : new x(this.f134769a, i10, i11);
    }

    public C15765h<T> b(int i10) {
        return i10 >= this.f134770b ? this : new y(this.f134769a, i10);
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
