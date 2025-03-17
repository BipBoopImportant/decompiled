package g1;

import U0.C0;
import XH.C16820k;
import YH.U;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.M;
import oI.C17693a;
import oI.C17696d;
import tI.C17978n;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010+\n\u0002\b\u0018\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001f\u0010\u0019J\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010\u0010J\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\"\u0010#J\u001d\u0010\"\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\"\u0010\u0014J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\fJ\u0015\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b&\u0010(J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010\u0010J\u001d\u0010*\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b*\u0010\u0014J\u0017\u0010+\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0005H\u0016¢\u0006\u0004\b+\u0010\u0017J\u001d\u0010,\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b,\u0010\u0014J \u0010-\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.J%\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b/\u00100R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u00105R\u0016\u00108\u001a\u00020\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u00105R$\u0010<\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0016@RX\u000e¢\u0006\f\n\u0004\b:\u00105\u001a\u0004\b1\u0010;¨\u0006="}, d2 = {"Lg1/J;", "T", "", "Lg1/v;", "parentList", "", "fromIndex", "toIndex", "<init>", "(Lg1/v;II)V", "LXH/N;", "i", "()V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "lastIndexOf", "add", "(ILjava/lang/Object;)V", "addAll", "(ILjava/util/Collection;)Z", "clear", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "remove", "removeAll", "b", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "(II)Ljava/util/List;", "a", "Lg1/v;", "getParentList", "()Lg1/v;", "I", "offset", "c", "structure", "<set-?>", "d", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g1.J  reason: case insensitive filesystem */
final class C5329J<T> implements List<T>, C17696d {

    /* renamed from: a  reason: collision with root package name */
    private final C5353v<T> f23351a;

    /* renamed from: b  reason: collision with root package name */
    private final int f23352b;

    /* renamed from: c  reason: collision with root package name */
    private int f23353c;

    /* renamed from: d  reason: collision with root package name */
    private int f23354d;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0010+\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0001\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\tJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0013\u0010\u000e¨\u0006\u0014"}, d2 = {"g1/J$a", "", "", "hasPrevious", "()Z", "", "nextIndex", "()I", "previous", "()Ljava/lang/Object;", "previousIndex", "element", "", "c", "(Ljava/lang/Object;)Ljava/lang/Void;", "hasNext", "next", "d", "()Ljava/lang/Void;", "f", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: g1.J$a */
    public static final class a implements ListIterator<T>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ M f23355a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5329J<T> f23356b;

        a(M m10, C5329J<T> j10) {
            this.f23355a = m10;
            this.f23356b = j10;
        }

        /* renamed from: c */
        public Void add(T t10) {
            Void unused = C5354w.f();
            throw new C16820k();
        }

        /* renamed from: d */
        public Void remove() {
            Void unused = C5354w.f();
            throw new C16820k();
        }

        /* renamed from: f */
        public Void set(T t10) {
            Void unused = C5354w.f();
            throw new C16820k();
        }

        public boolean hasNext() {
            return this.f23355a.f144346a < this.f23356b.size() - 1;
        }

        public boolean hasPrevious() {
            return this.f23355a.f144346a >= 0;
        }

        public T next() {
            int i10 = this.f23355a.f144346a + 1;
            C5354w.g(i10, this.f23356b.size());
            this.f23355a.f144346a = i10;
            return this.f23356b.get(i10);
        }

        public int nextIndex() {
            return this.f23355a.f144346a + 1;
        }

        public T previous() {
            int i10 = this.f23355a.f144346a;
            C5354w.g(i10, this.f23356b.size());
            this.f23355a.f144346a = i10 - 1;
            return this.f23356b.get(i10);
        }

        public int previousIndex() {
            return this.f23355a.f144346a;
        }
    }

    public C5329J(C5353v<T> vVar, int i10, int i11) {
        this.f23351a = vVar;
        this.f23352b = i10;
        this.f23353c = vVar.k();
        this.f23354d = i11 - i10;
    }

    private final void i() {
        if (this.f23351a.k() != this.f23353c) {
            throw new ConcurrentModificationException();
        }
    }

    public int a() {
        return this.f23354d;
    }

    public boolean add(T t10) {
        i();
        this.f23351a.add(this.f23352b + size(), t10);
        this.f23354d = size() + 1;
        this.f23353c = this.f23351a.k();
        return true;
    }

    public boolean addAll(int i10, Collection<? extends T> collection) {
        i();
        boolean addAll = this.f23351a.addAll(i10 + this.f23352b, collection);
        if (addAll) {
            this.f23354d = size() + collection.size();
            this.f23353c = this.f23351a.k();
        }
        return addAll;
    }

    public T b(int i10) {
        i();
        T remove = this.f23351a.remove(this.f23352b + i10);
        this.f23354d = size() - 1;
        this.f23353c = this.f23351a.k();
        return remove;
    }

    public void clear() {
        if (size() > 0) {
            i();
            C5353v<T> vVar = this.f23351a;
            int i10 = this.f23352b;
            vVar.t(i10, size() + i10);
            this.f23354d = 0;
            this.f23353c = this.f23351a.k();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        Iterable<Object> iterable = collection;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public T get(int i10) {
        i();
        C5354w.g(i10, size());
        return this.f23351a.get(this.f23352b + i10);
    }

    public int indexOf(Object obj) {
        i();
        int i10 = this.f23352b;
        Iterator it = C17978n.w(i10, size() + i10).iterator();
        while (it.hasNext()) {
            int c10 = ((U) it).c();
            if (C17542s.e(obj, this.f23351a.get(c10))) {
                return c10 - this.f23352b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<T> iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        i();
        int size = this.f23352b + size();
        while (true) {
            size--;
            if (size < this.f23352b) {
                return -1;
            }
            if (C17542s.e(obj, this.f23351a.get(size))) {
                return size - this.f23352b;
            }
        }
    }

    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    public final /* bridge */ T remove(int i10) {
        return b(i10);
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z10 = false;
            while (true) {
                if (!it.hasNext()) {
                    return z10;
                }
                if (remove((Object) it.next()) || z10) {
                    z10 = true;
                }
            }
        }
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        i();
        C5353v<T> vVar = this.f23351a;
        int i10 = this.f23352b;
        int x10 = vVar.x(collection, i10, size() + i10);
        if (x10 > 0) {
            this.f23353c = this.f23351a.k();
            this.f23354d = size() - x10;
        }
        return x10 > 0;
    }

    public T set(int i10, T t10) {
        C5354w.g(i10, size());
        i();
        T t11 = this.f23351a.set(i10 + this.f23352b, t10);
        this.f23353c = this.f23351a.k();
        return t11;
    }

    public final /* bridge */ int size() {
        return a();
    }

    public List<T> subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            C0.a("fromIndex or toIndex are out of bounds");
        }
        i();
        C5353v<T> vVar = this.f23351a;
        int i12 = this.f23352b;
        return new C5329J(vVar, i10 + i12, i11 + i12);
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public ListIterator<T> listIterator(int i10) {
        i();
        M m10 = new M();
        m10.f144346a = i10 - 1;
        return new a(m10, this);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public <T> T[] toArray(T[] tArr) {
        return C17534j.b(this, tArr);
    }

    public void add(int i10, T t10) {
        i();
        this.f23351a.add(this.f23352b + i10, t10);
        this.f23354d = size() + 1;
        this.f23353c = this.f23351a.k();
    }

    public boolean addAll(Collection<? extends T> collection) {
        return addAll(size(), collection);
    }
}
