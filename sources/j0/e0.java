package j0;

import YH.U;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lj0/c0;", "LYH/U;", "a", "(Lj0/c0;)LYH/U;", "", "b", "(Lj0/c0;)Ljava/util/Iterator;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e0 {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\r\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"j0/e0$a", "LYH/U;", "", "hasNext", "()Z", "", "c", "()I", "a", "I", "getIndex", "setIndex", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends U {

        /* renamed from: a  reason: collision with root package name */
        private int f24610a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0<T> f24611b;

        a(c0<T> c0Var) {
            this.f24611b = c0Var;
        }

        public int c() {
            c0<T> c0Var = this.f24611b;
            int i10 = this.f24610a;
            this.f24610a = i10 + 1;
            return c0Var.k(i10);
        }

        public boolean hasNext() {
            return this.f24610a < this.f24611b.o();
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"j0/e0$b", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "", "a", "I", "getIndex", "()I", "setIndex", "(I)V", "index", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f24612a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c0<T> f24613b;

        b(c0<T> c0Var) {
            this.f24613b = c0Var;
        }

        public boolean hasNext() {
            return this.f24612a < this.f24613b.o();
        }

        public T next() {
            c0<T> c0Var = this.f24613b;
            int i10 = this.f24612a;
            this.f24612a = i10 + 1;
            return c0Var.p(i10);
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public static final <T> U a(c0<T> c0Var) {
        C17542s.j(c0Var, "<this>");
        return new a(c0Var);
    }

    public static final <T> Iterator<T> b(c0<T> c0Var) {
        C17542s.j(c0Var, "<this>");
        return new b(c0Var);
    }
}
