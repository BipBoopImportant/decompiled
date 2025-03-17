package EJ;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* renamed from: EJ.k  reason: case insensitive filesystem */
public class C15670k<E> extends AbstractList<E> implements RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    private int f134262a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Object f134263b;

    /* renamed from: EJ.k$b */
    private static class b<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private static final b f134264a = new b();

        private b() {
        }

        public static <T> b<T> a() {
            return f134264a;
        }

        public boolean hasNext() {
            return false;
        }

        public T next() {
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new IllegalStateException();
        }
    }

    /* renamed from: EJ.k$c */
    private class c extends d<E> {

        /* renamed from: b  reason: collision with root package name */
        private final int f134265b;

        public c() {
            super();
            this.f134265b = C15670k.this.modCount;
        }

        /* access modifiers changed from: protected */
        public void a() {
            if (C15670k.this.modCount != this.f134265b) {
                throw new ConcurrentModificationException("ModCount: " + C15670k.this.modCount + "; expected: " + this.f134265b);
            }
        }

        /* access modifiers changed from: protected */
        public E c() {
            return C15670k.this.f134263b;
        }

        public void remove() {
            a();
            C15670k.this.clear();
        }
    }

    /* renamed from: EJ.k$d */
    private static abstract class d<T> implements Iterator<T> {

        /* renamed from: a  reason: collision with root package name */
        private boolean f134267a;

        private d() {
        }

        /* access modifiers changed from: protected */
        public abstract void a();

        /* access modifiers changed from: protected */
        public abstract T c();

        public final boolean hasNext() {
            return !this.f134267a;
        }

        public final T next() {
            if (!this.f134267a) {
                this.f134267a = true;
                a();
                return c();
            }
            throw new NoSuchElementException();
        }
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3)];
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i10 == 2 || i10 == 3) {
            objArr[1] = "iterator";
        } else if (i10 == 5 || i10 == 6 || i10 == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i10) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6 || i10 == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean add(E e10) {
        int i10 = this.f134262a;
        if (i10 == 0) {
            this.f134263b = e10;
        } else if (i10 == 1) {
            this.f134263b = new Object[]{this.f134263b, e10};
        } else {
            Object[] objArr = (Object[]) this.f134263b;
            int length = objArr.length;
            if (i10 >= length) {
                int i11 = ((length * 3) / 2) + 1;
                int i12 = i10 + 1;
                if (i11 < i12) {
                    i11 = i12;
                }
                Object[] objArr2 = new Object[i11];
                this.f134263b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f134262a] = e10;
        }
        this.f134262a++;
        this.modCount++;
        return true;
    }

    public void clear() {
        this.f134263b = null;
        this.f134262a = 0;
        this.modCount++;
    }

    public E get(int i10) {
        int i11;
        if (i10 >= 0 && i10 < (i11 = this.f134262a)) {
            return i11 == 1 ? this.f134263b : ((Object[]) this.f134263b)[i10];
        }
        throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f134262a);
    }

    public Iterator<E> iterator() {
        int i10 = this.f134262a;
        if (i10 == 0) {
            b a10 = b.a();
            if (a10 == null) {
                b(2);
            }
            return a10;
        } else if (i10 == 1) {
            return new c();
        } else {
            Iterator<E> it = super.iterator();
            if (it == null) {
                b(3);
            }
            return it;
        }
    }

    public E remove(int i10) {
        int i11;
        E e10;
        if (i10 < 0 || i10 >= (i11 = this.f134262a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f134262a);
        }
        if (i11 == 1) {
            e10 = this.f134263b;
            this.f134263b = null;
        } else {
            E[] eArr = (Object[]) this.f134263b;
            E e11 = eArr[i10];
            if (i11 == 2) {
                this.f134263b = eArr[1 - i10];
            } else {
                int i12 = (i11 - i10) - 1;
                if (i12 > 0) {
                    System.arraycopy(eArr, i10 + 1, eArr, i10, i12);
                }
                eArr[this.f134262a - 1] = null;
            }
            e10 = e11;
        }
        this.f134262a--;
        this.modCount++;
        return e10;
    }

    public E set(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f134262a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f134262a);
        } else if (i11 == 1) {
            E e11 = this.f134263b;
            this.f134263b = e10;
            return e11;
        } else {
            E[] eArr = (Object[]) this.f134263b;
            E e12 = eArr[i10];
            eArr[i10] = e10;
            return e12;
        }
    }

    public int size() {
        return this.f134262a;
    }

    public void sort(Comparator<? super E> comparator) {
        int i10 = this.f134262a;
        if (i10 >= 2) {
            Arrays.sort((Object[]) this.f134263b, 0, i10, comparator);
        }
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr == null) {
            b(4);
        }
        int length = tArr.length;
        int i10 = this.f134262a;
        if (i10 == 1) {
            if (length != 0) {
                tArr[0] = this.f134263b;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), 1);
                tArr2[0] = this.f134263b;
                return tArr2;
            }
        } else if (length < i10) {
            T[] copyOf = Arrays.copyOf((Object[]) this.f134263b, i10, tArr.getClass());
            if (copyOf == null) {
                b(6);
            }
            return copyOf;
        } else if (i10 != 0) {
            System.arraycopy(this.f134263b, 0, tArr, 0, i10);
        }
        int i11 = this.f134262a;
        if (length > i11) {
            tArr[i11] = null;
        }
        return tArr;
    }

    public void add(int i10, E e10) {
        int i11;
        if (i10 < 0 || i10 > (i11 = this.f134262a)) {
            throw new IndexOutOfBoundsException("Index: " + i10 + ", Size: " + this.f134262a);
        }
        if (i11 == 0) {
            this.f134263b = e10;
        } else if (i11 == 1 && i10 == 0) {
            this.f134263b = new Object[]{e10, this.f134263b};
        } else {
            Object[] objArr = new Object[(i11 + 1)];
            if (i11 == 1) {
                objArr[0] = this.f134263b;
            } else {
                Object[] objArr2 = (Object[]) this.f134263b;
                System.arraycopy(objArr2, 0, objArr, 0, i10);
                System.arraycopy(objArr2, i10, objArr, i10 + 1, this.f134262a - i10);
            }
            objArr[i10] = e10;
            this.f134263b = objArr;
        }
        this.f134262a++;
        this.modCount++;
    }
}
