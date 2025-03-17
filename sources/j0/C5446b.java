package j0;

import YH.C16870n;
import YH.C16877v;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k0.C5489a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17694b;
import oI.C17698f;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00015B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u0007J\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0010J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0010J\u0015\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0017J\u0015\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0001\u0010 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00010\u001d¢\u0006\u0004\b\u001e\u0010\"J\u001a\u0010$\u001a\u00020\u000e2\b\u0010#\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\u0004H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0002¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b/\u00100J\u001d\u00101\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b1\u00100J\u001d\u00102\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b2\u00100J\u001d\u00103\u001a\u00020\u000e2\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0016¢\u0006\u0004\b3\u00100R\"\u0010;\u001a\u0002048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001d8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u0010?R\"\u0010D\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010&\"\u0004\bC\u0010\u0007R\u0014\u0010E\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b5\u0010&¨\u0006F"}, d2 = {"Lj0/b;", "E", "", "", "", "capacity", "<init>", "(I)V", "LXH/N;", "clear", "()V", "minimumCapacity", "b", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "key", "indexOf", "(Ljava/lang/Object;)I", "index", "x", "(I)Ljava/lang/Object;", "isEmpty", "()Z", "add", "remove", "p", "", "toArray", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "iterator", "()Ljava/util/Iterator;", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "addAll", "removeAll", "retainAll", "", "a", "[I", "k", "()[I", "s", "([I)V", "hashes", "[Ljava/lang/Object;", "i", "q", "([Ljava/lang/Object;)V", "c", "I", "m", "t", "_size", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.b  reason: case insensitive filesystem */
public final class C5446b<E> implements Collection<E>, Set<E>, C17694b, C17698f {

    /* renamed from: a  reason: collision with root package name */
    private int[] f24594a;

    /* renamed from: b  reason: collision with root package name */
    private Object[] f24595b;

    /* renamed from: c  reason: collision with root package name */
    private int f24596c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj0/b$a;", "Lj0/j;", "<init>", "(Lj0/b;)V", "", "index", "c", "(I)Ljava/lang/Object;", "LXH/N;", "d", "(I)V", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j0.b$a */
    private final class a extends C5454j<E> {
        public a() {
            super(C5446b.this.m());
        }

        /* access modifiers changed from: protected */
        public E c(int i10) {
            return C5446b.this.x(i10);
        }

        /* access modifiers changed from: protected */
        public void d(int i10) {
            C5446b.this.p(i10);
        }
    }

    public C5446b() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public int a() {
        return this.f24596c;
    }

    public boolean add(E e10) {
        int i10;
        int i11;
        E e11 = e10;
        int m10 = m();
        boolean z10 = false;
        if (e11 == null) {
            i11 = C5448d.d(this);
            i10 = 0;
        } else {
            int hashCode = e10.hashCode();
            i10 = hashCode;
            i11 = C5448d.c(this, e11, hashCode);
        }
        if (i11 >= 0) {
            return false;
        }
        int i12 = ~i11;
        if (m10 >= k().length) {
            int i13 = 8;
            if (m10 >= 8) {
                i13 = (m10 >> 1) + m10;
            } else if (m10 < 4) {
                i13 = 4;
            }
            int[] k10 = k();
            Object[] i14 = i();
            C5448d.a(this, i13);
            if (m10 == m()) {
                if (k().length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    C16870n.q(k10, k(), 0, 0, k10.length, 6, (Object) null);
                    C16870n.r(i14, i(), 0, 0, i14.length, 6, (Object) null);
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i12 < m10) {
            int i15 = i12 + 1;
            C16870n.l(k(), k(), i15, i12, m10);
            C16870n.n(i(), i(), i15, i12, m10);
        }
        if (m10 != m() || i12 >= k().length) {
            throw new ConcurrentModificationException();
        }
        k()[i12] = i10;
        i()[i12] = e11;
        t(m() + 1);
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        C17542s.j(collection, "elements");
        b(m() + collection.size());
        boolean z10 = false;
        for (Object add : collection) {
            z10 |= add(add);
        }
        return z10;
    }

    public final void b(int i10) {
        int m10 = m();
        if (k().length < i10) {
            int[] k10 = k();
            Object[] i11 = i();
            C5448d.a(this, i10);
            if (m() > 0) {
                C16870n.q(k10, k(), 0, 0, m(), 6, (Object) null);
                C16870n.r(i11, i(), 0, 0, m(), 6, (Object) null);
            }
        }
        if (m() != m10) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        if (m() != 0) {
            s(C5489a.f24990a);
            q(C5489a.f24992c);
            t(0);
        }
        if (m() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && size() == ((Set) obj).size()) {
            try {
                int m10 = m();
                int i10 = 0;
                while (i10 < m10) {
                    if (((Set) obj).contains(x(i10))) {
                        i10++;
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public int hashCode() {
        int[] k10 = k();
        int m10 = m();
        int i10 = 0;
        for (int i11 = 0; i11 < m10; i11++) {
            i10 += k10[i11];
        }
        return i10;
    }

    public final Object[] i() {
        return this.f24595b;
    }

    public final int indexOf(Object obj) {
        return obj == null ? C5448d.d(this) : C5448d.c(this, obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return m() <= 0;
    }

    public Iterator<E> iterator() {
        return new a();
    }

    public final int[] k() {
        return this.f24594a;
    }

    public final int m() {
        return this.f24596c;
    }

    public final E p(int i10) {
        int m10 = m();
        E e10 = i()[i10];
        if (m10 <= 1) {
            clear();
        } else {
            int i11 = m10 - 1;
            int i12 = 8;
            if (k().length <= 8 || m() >= k().length / 3) {
                if (i10 < i11) {
                    int i13 = i10 + 1;
                    C16870n.l(k(), k(), i10, i13, m10);
                    C16870n.n(i(), i(), i10, i13, m10);
                }
                i()[i11] = null;
            } else {
                if (m() > 8) {
                    i12 = m() + (m() >> 1);
                }
                int[] k10 = k();
                Object[] i14 = i();
                C5448d.a(this, i12);
                if (i10 > 0) {
                    int i15 = i10;
                    C16870n.q(k10, k(), 0, 0, i15, 6, (Object) null);
                    C16870n.r(i14, i(), 0, 0, i15, 6, (Object) null);
                }
                if (i10 < i11) {
                    int i16 = i10 + 1;
                    C16870n.l(k10, k(), i10, i16, m10);
                    C16870n.n(i14, i(), i10, i16, m10);
                }
            }
            if (m10 == m()) {
                t(i11);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return e10;
    }

    public final void q(Object[] objArr) {
        C17542s.j(objArr, "<set-?>");
        this.f24595b = objArr;
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        p(indexOf);
        return true;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        boolean z10 = false;
        for (Object remove : collection) {
            z10 |= remove(remove);
        }
        return z10;
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        boolean z10 = false;
        for (int m10 = m() - 1; -1 < m10; m10--) {
            if (!C16877v.l0(collection, i()[m10])) {
                p(m10);
                z10 = true;
            }
        }
        return z10;
    }

    public final void s(int[] iArr) {
        C17542s.j(iArr, "<set-?>");
        this.f24594a = iArr;
    }

    public final /* bridge */ int size() {
        return a();
    }

    public final void t(int i10) {
        this.f24596c = i10;
    }

    public final Object[] toArray() {
        return C16870n.u(this.f24595b, 0, this.f24596c);
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(m() * 14);
        sb2.append('{');
        int m10 = m();
        for (int i10 = 0; i10 < m10; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object x10 = x(i10);
            if (x10 != this) {
                sb2.append(x10);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final E x(int i10) {
        return i()[i10];
    }

    public C5446b(int i10) {
        this.f24594a = C5489a.f24990a;
        this.f24595b = C5489a.f24992c;
        if (i10 > 0) {
            C5448d.a(this, i10);
        }
    }

    public final <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        T[] a10 = C5447c.a(tArr, this.f24596c);
        C16870n.n(this.f24595b, a10, 0, 0, this.f24596c);
        C17542s.i(a10, "result");
        return a10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5446b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }
}
