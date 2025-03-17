package GJ;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010(\n\u0002\b\t\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\fJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"LGJ/x;", "T", "LGJ/h;", "LGJ/c;", "sequence", "", "startIndex", "endIndex", "<init>", "(LGJ/h;II)V", "n", "a", "(I)LGJ/h;", "b", "", "iterator", "()Ljava/util/Iterator;", "LGJ/h;", "I", "c", "f", "()I", "count", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x<T> implements C15765h<T>, C15760c<T> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C15765h<T> f134763a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final int f134764b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final int f134765c;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"GJ/x$a", "", "LXH/N;", "c", "()V", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "a", "Ljava/util/Iterator;", "getIterator", "()Ljava/util/Iterator;", "iterator", "", "b", "I", "getPosition", "()I", "setPosition", "(I)V", "position", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<T> f134766a;

        /* renamed from: b  reason: collision with root package name */
        private int f134767b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ x<T> f134768c;

        a(x<T> xVar) {
            this.f134768c = xVar;
            this.f134766a = xVar.f134763a.iterator();
        }

        private final void c() {
            while (this.f134767b < this.f134768c.f134764b && this.f134766a.hasNext()) {
                this.f134766a.next();
                this.f134767b++;
            }
        }

        public boolean hasNext() {
            c();
            return this.f134767b < this.f134768c.f134765c && this.f134766a.hasNext();
        }

        public T next() {
            c();
            if (this.f134767b < this.f134768c.f134765c) {
                this.f134767b++;
                return this.f134766a.next();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public x(C15765h<? extends T> hVar, int i10, int i11) {
        C17542s.j(hVar, "sequence");
        this.f134763a = hVar;
        this.f134764b = i10;
        this.f134765c = i11;
        if (i10 < 0) {
            throw new IllegalArgumentException(("startIndex should be non-negative, but is " + i10).toString());
        } else if (i11 < 0) {
            throw new IllegalArgumentException(("endIndex should be non-negative, but is " + i11).toString());
        } else if (i11 < i10) {
            throw new IllegalArgumentException(("endIndex should be not less than startIndex, but was " + i11 + " < " + i10).toString());
        }
    }

    private final int f() {
        return this.f134765c - this.f134764b;
    }

    public C15765h<T> a(int i10) {
        return i10 >= f() ? C15768k.j() : new x(this.f134763a, this.f134764b + i10, this.f134765c);
    }

    public C15765h<T> b(int i10) {
        if (i10 >= f()) {
            return this;
        }
        C15765h<T> hVar = this.f134763a;
        int i11 = this.f134764b;
        return new x(hVar, i11, i10 + i11);
    }

    public Iterator<T> iterator() {
        return new a(this);
    }
}
