package YH;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\r\b\u0007\u0018\u0000 T*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001KB\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0006J\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\f\u0010\u0006J\u0017\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ%\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001c\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u001bJ\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010\u0007J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00028\u0000¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b&\u0010%J\r\u0010'\u001a\u00028\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b(\u0010%J\u0015\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b*\u0010+J\u0015\u0010,\u001a\u00020\t2\u0006\u0010)\u001a\u00028\u0000¢\u0006\u0004\b,\u0010+J\r\u0010-\u001a\u00028\u0000¢\u0006\u0004\b-\u0010%J\u000f\u0010.\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b.\u0010%J\r\u0010/\u001a\u00028\u0000¢\u0006\u0004\b/\u0010%J\u000f\u0010\u0001\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0001\u0010%J\u0017\u00100\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b0\u00102J\u001d\u00103\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b3\u00104J%\u00103\u001a\u00020!2\u0006\u0010\r\u001a\u00020\u00032\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b3\u00105J\u0018\u00106\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J \u00108\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0002¢\u0006\u0004\b:\u00101J\u0017\u0010;\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00032\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b=\u0010<J\u0017\u0010>\u001a\u00020!2\u0006\u0010)\u001a\u00028\u0000H\u0016¢\u0006\u0004\b>\u00101J\u0017\u0010?\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b?\u00107J\u001d\u0010@\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\b@\u00104J\u001d\u0010A\u001a\u00020!2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0016¢\u0006\u0004\bA\u00104J\u000f\u0010B\u001a\u00020\tH\u0016¢\u0006\u0004\bB\u0010\u0007J)\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00010D\"\u0004\b\u0001\u0010C2\f\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00010DH\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0DH\u0016¢\u0006\u0004\bF\u0010IJ\u001f\u0010J\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003H\u0014¢\u0006\u0004\bJ\u0010\u001bR\u0016\u0010M\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010H0D8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010NR$\u0010S\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bK\u0010R¨\u0006U"}, d2 = {"LYH/m;", "E", "LYH/h;", "", "initialCapacity", "<init>", "(I)V", "()V", "minCapacity", "LXH/N;", "p", "newCapacity", "k", "index", "B", "(I)I", "x", "s", "m", "internalIndex", "", "elements", "i", "(ILjava/util/Collection;)V", "fromIndex", "toIndex", "F", "(II)V", "G", "internalFromIndex", "internalToIndex", "A", "C", "", "isEmpty", "()Z", "first", "()Ljava/lang/Object;", "q", "last", "t", "element", "addFirst", "(Ljava/lang/Object;)V", "addLast", "removeFirst", "D", "removeLast", "add", "(Ljava/lang/Object;)Z", "(ILjava/lang/Object;)V", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "contains", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "remove", "b", "removeAll", "retainAll", "clear", "T", "", "array", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "", "()[Ljava/lang/Object;", "removeRange", "a", "I", "head", "[Ljava/lang/Object;", "elementData", "value", "c", "()I", "size", "d", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.m  reason: case insensitive filesystem */
public final class C16869m<E> extends C16864h<E> {

    /* renamed from: d  reason: collision with root package name */
    public static final a f140464d = new a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    private static final Object[] f140465e = new Object[0];

    /* renamed from: a  reason: collision with root package name */
    private int f140466a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f140467b;

    /* renamed from: c  reason: collision with root package name */
    private int f140468c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LYH/m$a;", "", "<init>", "()V", "", "emptyElementData", "[Ljava/lang/Object;", "", "defaultMinCapacity", "I", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.m$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C16869m(int i10) {
        Object[] objArr;
        if (i10 == 0) {
            objArr = f140465e;
        } else if (i10 > 0) {
            objArr = new Object[i10];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.f140467b = objArr;
    }

    private final void A(int i10, int i11) {
        if (i10 < i11) {
            C16870n.x(this.f140467b, null, i10, i11);
            return;
        }
        Object[] objArr = this.f140467b;
        C16870n.x(objArr, null, i10, objArr.length);
        C16870n.x(this.f140467b, null, 0, i11);
    }

    private final int B(int i10) {
        Object[] objArr = this.f140467b;
        return i10 >= objArr.length ? i10 - objArr.length : i10;
    }

    private final void C() {
        this.modCount++;
    }

    private final void F(int i10, int i11) {
        int B10 = B(this.f140466a + (i10 - 1));
        int B11 = B(this.f140466a + (i11 - 1));
        while (i10 > 0) {
            int i12 = B10 + 1;
            int min = Math.min(i10, Math.min(i12, B11 + 1));
            Object[] objArr = this.f140467b;
            int i13 = B11 - min;
            int i14 = B10 - min;
            C16870n.n(objArr, objArr, i13 + 1, i14 + 1, i12);
            B10 = x(i14);
            B11 = x(i13);
            i10 -= min;
        }
    }

    private final void G(int i10, int i11) {
        int B10 = B(this.f140466a + i11);
        int B11 = B(this.f140466a + i10);
        int size = size();
        while (true) {
            size -= i11;
            if (size > 0) {
                Object[] objArr = this.f140467b;
                i11 = Math.min(size, Math.min(objArr.length - B10, objArr.length - B11));
                Object[] objArr2 = this.f140467b;
                int i12 = B10 + i11;
                C16870n.n(objArr2, objArr2, B11, B10, i12);
                B10 = B(i12);
                B11 = B(B11 + i11);
            } else {
                return;
            }
        }
    }

    private final void i(int i10, Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        int length = this.f140467b.length;
        while (i10 < length && it.hasNext()) {
            this.f140467b[i10] = it.next();
            i10++;
        }
        int i11 = this.f140466a;
        for (int i12 = 0; i12 < i11 && it.hasNext(); i12++) {
            this.f140467b[i12] = it.next();
        }
        this.f140468c = size() + collection.size();
    }

    private final void k(int i10) {
        Object[] objArr = new Object[i10];
        Object[] objArr2 = this.f140467b;
        C16870n.n(objArr2, objArr, 0, this.f140466a, objArr2.length);
        Object[] objArr3 = this.f140467b;
        int length = objArr3.length;
        int i11 = this.f140466a;
        C16870n.n(objArr3, objArr, length - i11, 0, i11);
        this.f140466a = 0;
        this.f140467b = objArr;
    }

    private final int m(int i10) {
        return i10 == 0 ? C16870n.n0(this.f140467b) : i10 - 1;
    }

    private final void p(int i10) {
        if (i10 >= 0) {
            Object[] objArr = this.f140467b;
            if (i10 > objArr.length) {
                if (objArr == f140465e) {
                    this.f140467b = new Object[C17978n.e(i10, 10)];
                } else {
                    k(C16860d.f140429a.e(objArr.length, i10));
                }
            }
        } else {
            throw new IllegalStateException("Deque is too big.");
        }
    }

    private final int s(int i10) {
        if (i10 == C16870n.n0(this.f140467b)) {
            return 0;
        }
        return i10 + 1;
    }

    private final int x(int i10) {
        return i10 < 0 ? i10 + this.f140467b.length : i10;
    }

    public final E D() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E E() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public int a() {
        return this.f140468c;
    }

    public boolean add(E e10) {
        addLast(e10);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        C();
        p(size() + collection.size());
        i(B(this.f140466a + size()), collection);
        return true;
    }

    public final void addFirst(E e10) {
        C();
        p(size() + 1);
        int m10 = m(this.f140466a);
        this.f140466a = m10;
        this.f140467b[m10] = e10;
        this.f140468c = size() + 1;
    }

    public final void addLast(E e10) {
        C();
        p(size() + 1);
        this.f140467b[B(this.f140466a + size())] = e10;
        this.f140468c = size() + 1;
    }

    public E b(int i10) {
        C16860d.f140429a.b(i10, size());
        if (i10 == C16877v.p(this)) {
            return removeLast();
        }
        if (i10 == 0) {
            return removeFirst();
        }
        C();
        int B10 = B(this.f140466a + i10);
        E e10 = this.f140467b[B10];
        if (i10 < (size() >> 1)) {
            int i11 = this.f140466a;
            if (B10 >= i11) {
                Object[] objArr = this.f140467b;
                C16870n.n(objArr, objArr, i11 + 1, i11, B10);
            } else {
                Object[] objArr2 = this.f140467b;
                C16870n.n(objArr2, objArr2, 1, 0, B10);
                Object[] objArr3 = this.f140467b;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i12 = this.f140466a;
                C16870n.n(objArr3, objArr3, i12 + 1, i12, objArr3.length - 1);
            }
            Object[] objArr4 = this.f140467b;
            int i13 = this.f140466a;
            objArr4[i13] = null;
            this.f140466a = s(i13);
        } else {
            int B11 = B(this.f140466a + C16877v.p(this));
            if (B10 <= B11) {
                Object[] objArr5 = this.f140467b;
                C16870n.n(objArr5, objArr5, B10, B10 + 1, B11 + 1);
            } else {
                Object[] objArr6 = this.f140467b;
                C16870n.n(objArr6, objArr6, B10, B10 + 1, objArr6.length);
                Object[] objArr7 = this.f140467b;
                objArr7[objArr7.length - 1] = objArr7[0];
                C16870n.n(objArr7, objArr7, 0, 1, B11 + 1);
            }
            this.f140467b[B11] = null;
        }
        this.f140468c = size() - 1;
        return e10;
    }

    public void clear() {
        if (!isEmpty()) {
            C();
            A(this.f140466a, B(this.f140466a + size()));
        }
        this.f140466a = 0;
        this.f140468c = 0;
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f140467b[this.f140466a];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public E get(int i10) {
        C16860d.f140429a.b(i10, size());
        return this.f140467b[B(this.f140466a + i10)];
    }

    public int indexOf(Object obj) {
        int i10;
        int B10 = B(this.f140466a + size());
        int i11 = this.f140466a;
        if (i11 < B10) {
            while (i11 < B10) {
                if (C17542s.e(obj, this.f140467b[i11])) {
                    i10 = this.f140466a;
                } else {
                    i11++;
                }
            }
            return -1;
        } else if (i11 < B10) {
            return -1;
        } else {
            int length = this.f140467b.length;
            while (true) {
                if (i11 >= length) {
                    int i12 = 0;
                    while (i12 < B10) {
                        if (C17542s.e(obj, this.f140467b[i12])) {
                            i11 = i12 + this.f140467b.length;
                            i10 = this.f140466a;
                        } else {
                            i12++;
                        }
                    }
                    return -1;
                } else if (C17542s.e(obj, this.f140467b[i11])) {
                    i10 = this.f140466a;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return i11 - i10;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f140467b[B(this.f140466a + C16877v.p(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public int lastIndexOf(Object obj) {
        int i10;
        int i11;
        int B10 = B(this.f140466a + size());
        int i12 = this.f140466a;
        if (i12 < B10) {
            i10 = B10 - 1;
            if (i12 <= i10) {
                while (!C17542s.e(obj, this.f140467b[i10])) {
                    if (i10 != i12) {
                        i10--;
                    }
                }
                i11 = this.f140466a;
            }
            return -1;
        }
        if (i12 > B10) {
            int i13 = B10 - 1;
            while (true) {
                if (-1 >= i13) {
                    int n02 = C16870n.n0(this.f140467b);
                    int i14 = this.f140466a;
                    if (i14 <= n02) {
                        while (!C17542s.e(obj, this.f140467b[i10])) {
                            if (i10 != i14) {
                                n02 = i10 - 1;
                            }
                        }
                        i11 = this.f140466a;
                    }
                } else if (C17542s.e(obj, this.f140467b[i13])) {
                    i10 = i13 + this.f140467b.length;
                    i11 = this.f140466a;
                    break;
                } else {
                    i13--;
                }
            }
        }
        return -1;
        return i10 - i11;
    }

    public final E q() {
        if (isEmpty()) {
            return null;
        }
        return this.f140467b[this.f140466a];
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f140467b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f140466a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.B(r0)
            int r2 = r11.f140466a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f140467b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 != 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f140467b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f140467b
            YH.C16870n.x(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f140467b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f140467b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 != 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f140467b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.B(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f140467b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 != 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f140467b
            r2[r5] = r6
            int r5 = r11.s(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.C()
            int r12 = r11.f140466a
            int r5 = r5 - r12
            int r12 = r11.x(r5)
            r11.f140468c = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: YH.C16869m.removeAll(java.util.Collection):boolean");
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            C();
            E[] eArr = this.f140467b;
            int i10 = this.f140466a;
            E e10 = eArr[i10];
            eArr[i10] = null;
            this.f140466a = s(i10);
            this.f140468c = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLast() {
        if (!isEmpty()) {
            C();
            int B10 = B(this.f140466a + C16877v.p(this));
            E[] eArr = this.f140467b;
            E e10 = eArr[B10];
            eArr[B10] = null;
            this.f140468c = size() - 1;
            return e10;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    /* access modifiers changed from: protected */
    public void removeRange(int i10, int i11) {
        C16860d.f140429a.d(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 != 0) {
            if (i12 == size()) {
                clear();
            } else if (i12 == 1) {
                remove(i10);
            } else {
                C();
                if (i10 < size() - i11) {
                    F(i10, i11);
                    int B10 = B(this.f140466a + i12);
                    A(this.f140466a, B10);
                    this.f140466a = B10;
                } else {
                    G(i10, i11);
                    int B11 = B(this.f140466a + size());
                    A(x(B11 - i12), B11);
                }
                this.f140468c = size() - i12;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3, types: [int] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean retainAll(java.util.Collection<? extends java.lang.Object> r12) {
        /*
            r11 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            boolean r0 = r11.isEmpty()
            r1 = 0
            if (r0 != 0) goto L_0x0091
            java.lang.Object[] r0 = r11.f140467b
            int r0 = r0.length
            if (r0 != 0) goto L_0x0013
            goto L_0x0091
        L_0x0013:
            int r0 = r11.f140466a
            int r2 = r11.size()
            int r0 = r0 + r2
            int r0 = r11.B(r0)
            int r2 = r11.f140466a
            r3 = 0
            r4 = 1
            if (r2 >= r0) goto L_0x0043
            r5 = r2
        L_0x0025:
            if (r2 >= r0) goto L_0x003d
            java.lang.Object[] r6 = r11.f140467b
            r6 = r6[r2]
            boolean r7 = r12.contains(r6)
            if (r7 == 0) goto L_0x0039
            java.lang.Object[] r7 = r11.f140467b
            int r8 = r5 + 1
            r7[r5] = r6
            r5 = r8
            goto L_0x003a
        L_0x0039:
            r1 = r4
        L_0x003a:
            int r2 = r2 + 1
            goto L_0x0025
        L_0x003d:
            java.lang.Object[] r12 = r11.f140467b
            YH.C16870n.x(r12, r3, r5, r0)
            goto L_0x0083
        L_0x0043:
            java.lang.Object[] r5 = r11.f140467b
            int r5 = r5.length
            r7 = r1
            r6 = r2
        L_0x0048:
            if (r2 >= r5) goto L_0x0062
            java.lang.Object[] r8 = r11.f140467b
            r9 = r8[r2]
            r8[r2] = r3
            boolean r8 = r12.contains(r9)
            if (r8 == 0) goto L_0x005e
            java.lang.Object[] r8 = r11.f140467b
            int r10 = r6 + 1
            r8[r6] = r9
            r6 = r10
            goto L_0x005f
        L_0x005e:
            r7 = r4
        L_0x005f:
            int r2 = r2 + 1
            goto L_0x0048
        L_0x0062:
            int r2 = r11.B(r6)
            r5 = r2
        L_0x0067:
            if (r1 >= r0) goto L_0x0082
            java.lang.Object[] r2 = r11.f140467b
            r6 = r2[r1]
            r2[r1] = r3
            boolean r2 = r12.contains(r6)
            if (r2 == 0) goto L_0x007e
            java.lang.Object[] r2 = r11.f140467b
            r2[r5] = r6
            int r5 = r11.s(r5)
            goto L_0x007f
        L_0x007e:
            r7 = r4
        L_0x007f:
            int r1 = r1 + 1
            goto L_0x0067
        L_0x0082:
            r1 = r7
        L_0x0083:
            if (r1 == 0) goto L_0x0091
            r11.C()
            int r12 = r11.f140466a
            int r5 = r5 - r12
            int r12 = r11.x(r5)
            r11.f140468c = r12
        L_0x0091:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: YH.C16869m.retainAll(java.util.Collection):boolean");
    }

    public E set(int i10, E e10) {
        C16860d.f140429a.b(i10, size());
        int B10 = B(this.f140466a + i10);
        E[] eArr = this.f140467b;
        E e11 = eArr[B10];
        eArr[B10] = e10;
        return e11;
    }

    public final E t() {
        if (isEmpty()) {
            return null;
        }
        return this.f140467b[B(this.f140466a + C16877v.p(this))];
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        if (tArr.length < size()) {
            tArr = C16871o.a(tArr, size());
        }
        int B10 = B(this.f140466a + size());
        int i10 = this.f140466a;
        if (i10 < B10) {
            C16870n.r(this.f140467b, tArr, 0, i10, B10, 2, (Object) null);
        } else if (!isEmpty()) {
            Object[] objArr = this.f140467b;
            C16870n.n(objArr, tArr, 0, this.f140466a, objArr.length);
            Object[] objArr2 = this.f140467b;
            C16870n.n(objArr2, tArr, objArr2.length - this.f140466a, 0, B10);
        }
        return C16877v.g(size(), tArr);
    }

    public void add(int i10, E e10) {
        C16860d.f140429a.c(i10, size());
        if (i10 == size()) {
            addLast(e10);
        } else if (i10 == 0) {
            addFirst(e10);
        } else {
            C();
            p(size() + 1);
            int B10 = B(this.f140466a + i10);
            if (i10 < ((size() + 1) >> 1)) {
                int m10 = m(B10);
                int m11 = m(this.f140466a);
                int i11 = this.f140466a;
                if (m10 >= i11) {
                    Object[] objArr = this.f140467b;
                    objArr[m11] = objArr[i11];
                    C16870n.n(objArr, objArr, i11, i11 + 1, m10 + 1);
                } else {
                    Object[] objArr2 = this.f140467b;
                    C16870n.n(objArr2, objArr2, i11 - 1, i11, objArr2.length);
                    Object[] objArr3 = this.f140467b;
                    objArr3[objArr3.length - 1] = objArr3[0];
                    C16870n.n(objArr3, objArr3, 0, 1, m10 + 1);
                }
                this.f140467b[m10] = e10;
                this.f140466a = m11;
            } else {
                int B11 = B(this.f140466a + size());
                if (B10 < B11) {
                    Object[] objArr4 = this.f140467b;
                    C16870n.n(objArr4, objArr4, B10 + 1, B10, B11);
                } else {
                    Object[] objArr5 = this.f140467b;
                    C16870n.n(objArr5, objArr5, 1, 0, B11);
                    Object[] objArr6 = this.f140467b;
                    objArr6[0] = objArr6[objArr6.length - 1];
                    C16870n.n(objArr6, objArr6, B10 + 1, B10, objArr6.length - 1);
                }
                this.f140467b[B10] = e10;
            }
            this.f140468c = size() + 1;
        }
    }

    public boolean addAll(int i10, Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        C16860d.f140429a.c(i10, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i10 == size()) {
            return addAll(collection);
        }
        C();
        p(size() + collection.size());
        int B10 = B(this.f140466a + size());
        int B11 = B(this.f140466a + i10);
        int size = collection.size();
        if (i10 < ((size() + 1) >> 1)) {
            int i11 = this.f140466a;
            int i12 = i11 - size;
            if (B11 < i11) {
                Object[] objArr = this.f140467b;
                C16870n.n(objArr, objArr, i12, i11, objArr.length);
                if (size >= B11) {
                    Object[] objArr2 = this.f140467b;
                    C16870n.n(objArr2, objArr2, objArr2.length - size, 0, B11);
                } else {
                    Object[] objArr3 = this.f140467b;
                    C16870n.n(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f140467b;
                    C16870n.n(objArr4, objArr4, 0, size, B11);
                }
            } else if (i12 >= 0) {
                Object[] objArr5 = this.f140467b;
                C16870n.n(objArr5, objArr5, i12, i11, B11);
            } else {
                Object[] objArr6 = this.f140467b;
                i12 += objArr6.length;
                int i13 = B11 - i11;
                int length = objArr6.length - i12;
                if (length >= i13) {
                    C16870n.n(objArr6, objArr6, i12, i11, B11);
                } else {
                    C16870n.n(objArr6, objArr6, i12, i11, i11 + length);
                    Object[] objArr7 = this.f140467b;
                    C16870n.n(objArr7, objArr7, 0, this.f140466a + length, B11);
                }
            }
            this.f140466a = i12;
            i(x(B11 - size), collection);
        } else {
            int i14 = B11 + size;
            if (B11 < B10) {
                int i15 = size + B10;
                Object[] objArr8 = this.f140467b;
                if (i15 <= objArr8.length) {
                    C16870n.n(objArr8, objArr8, i14, B11, B10);
                } else if (i14 >= objArr8.length) {
                    C16870n.n(objArr8, objArr8, i14 - objArr8.length, B11, B10);
                } else {
                    int length2 = B10 - (i15 - objArr8.length);
                    C16870n.n(objArr8, objArr8, 0, length2, B10);
                    Object[] objArr9 = this.f140467b;
                    C16870n.n(objArr9, objArr9, i14, B11, length2);
                }
            } else {
                Object[] objArr10 = this.f140467b;
                C16870n.n(objArr10, objArr10, size, 0, B10);
                Object[] objArr11 = this.f140467b;
                if (i14 >= objArr11.length) {
                    C16870n.n(objArr11, objArr11, i14 - objArr11.length, B11, objArr11.length);
                } else {
                    C16870n.n(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f140467b;
                    C16870n.n(objArr12, objArr12, i14, B11, objArr12.length - size);
                }
            }
            i(B11, collection);
        }
        return true;
    }

    public C16869m() {
        this.f140467b = f140465e;
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
