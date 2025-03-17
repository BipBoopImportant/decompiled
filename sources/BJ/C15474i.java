package BJ;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

/* renamed from: BJ.i  reason: case insensitive filesystem */
public final class C15474i extends C15468c {

    /* renamed from: a  reason: collision with root package name */
    public static final C15474i f133321a = new C15474i();

    /* renamed from: BJ.i$a */
    public static final class a implements Iterator, C17693a {
        a() {
        }

        /* renamed from: c */
        public Void next() {
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return false;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    private C15474i() {
        super((DefaultConstructorMarker) null);
    }

    public int a() {
        return 0;
    }

    /* renamed from: i */
    public Void get(int i10) {
        return null;
    }

    public Iterator iterator() {
        return new a();
    }

    /* renamed from: k */
    public void b(int i10, Void voidR) {
        C17542s.j(voidR, "value");
        throw new IllegalStateException();
    }
}
