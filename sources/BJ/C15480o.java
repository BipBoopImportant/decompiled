package BJ;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

/* renamed from: BJ.o  reason: case insensitive filesystem */
public final class C15480o<T> extends C15468c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f133330a;

    /* renamed from: b  reason: collision with root package name */
    private final int f133331b;

    /* renamed from: BJ.o$a */
    public static final class a implements Iterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f133332a = true;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15480o<T> f133333b;

        a(C15480o<T> oVar) {
            this.f133333b = oVar;
        }

        public boolean hasNext() {
            return this.f133332a;
        }

        public T next() {
            if (this.f133332a) {
                this.f133332a = false;
                return this.f133333b.k();
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15480o(T t10, int i10) {
        super((DefaultConstructorMarker) null);
        C17542s.j(t10, "value");
        this.f133330a = t10;
        this.f133331b = i10;
    }

    public int a() {
        return 1;
    }

    public void b(int i10, T t10) {
        C17542s.j(t10, "value");
        throw new IllegalStateException();
    }

    public T get(int i10) {
        if (i10 == this.f133331b) {
            return this.f133330a;
        }
        return null;
    }

    public final int i() {
        return this.f133331b;
    }

    public Iterator<T> iterator() {
        return new a(this);
    }

    public final T k() {
        return this.f133330a;
    }
}
