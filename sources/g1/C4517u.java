package G1;

import XH.C16807N;
import YH.C16870n;
import YH.C16877v;
import androidx.compose.ui.d;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import oI.C17693a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0010\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029\u000eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0015\u0010\b\u001a\u00020\u0007H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u0004J\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0004J\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0017\u0010\u0018J3\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0015¢\u0006\u0004\b\u001b\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010!\u001a\u00020\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\rJ\u0016\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00020*H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b-\u0010(J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020.2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b/\u00101J%\u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020#H\u0016¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0005¢\u0006\u0004\b6\u0010\u0004R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u000108078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010=R\u0016\u0010A\u001a\u00020#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010E\u001a\u00020#2\u0006\u0010B\u001a\u00020#8\u0016@RX\u000e¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\b9\u0010DR\"\u0010K\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010\r\"\u0004\bI\u0010J\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"LG1/u;", "", "Landroidx/compose/ui/d$c;", "<init>", "()V", "LXH/N;", "G", "LG1/q;", "s", "()J", "q", "", "A", "()Z", "b", "", "distanceFromEdge", "isInLayer", "E", "(FZ)Z", "node", "Lkotlin/Function0;", "childHitTest", "B", "(Landroidx/compose/ui/d$c;ZLnI/a;)V", "C", "(Landroidx/compose/ui/d$c;FZLnI/a;)V", "H", "element", "p", "(Landroidx/compose/ui/d$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "t", "(I)Landroidx/compose/ui/d$c;", "D", "(Landroidx/compose/ui/d$c;)I", "isEmpty", "", "iterator", "()Ljava/util/Iterator;", "F", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "clear", "", "", "a", "[Ljava/lang/Object;", "values", "", "[J", "distanceFromEdgeAndInLayer", "c", "I", "hitDepth", "<set-?>", "d", "()I", "size", "e", "Z", "x", "setShouldSharePointerInputWithSibling", "(Z)V", "shouldSharePointerInputWithSibling", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.u  reason: case insensitive filesystem */
public final class C4517u implements List<d.c>, C17693a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Object[] f6579a = new Object[16];

    /* renamed from: b  reason: collision with root package name */
    private long[] f6580b = new long[16];
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f6581c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f6582d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6583e = true;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\n\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u000e\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001c\u0010\u001eJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b#\u0010&¨\u0006)"}, d2 = {"LG1/u$b;", "", "Landroidx/compose/ui/d$c;", "", "minIndex", "maxIndex", "<init>", "(LG1/u;II)V", "element", "", "b", "(Landroidx/compose/ui/d$c;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "index", "i", "(I)Landroidx/compose/ui/d$c;", "k", "(Landroidx/compose/ui/d$c;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "m", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "a", "I", "getMinIndex", "()I", "getMaxIndex", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.u$b */
    private final class b implements List<d.c>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final int f6588a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6589b;

        public b(int i10, int i11) {
            this.f6588a = i10;
            this.f6589b = i11;
        }

        public int a() {
            return this.f6589b - this.f6588a;
        }

        public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i10, Collection<? extends d.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean b(d.c cVar) {
            return indexOf(cVar) != -1;
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ boolean contains(Object obj) {
            if (!(obj instanceof d.c)) {
                return false;
            }
            return b((d.c) obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains((d.c) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: i */
        public d.c get(int i10) {
            Object obj = C4517u.this.f6579a[i10 + this.f6588a];
            C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (d.c) obj;
        }

        public final /* bridge */ int indexOf(Object obj) {
            if (!(obj instanceof d.c)) {
                return -1;
            }
            return k((d.c) obj);
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        public Iterator<d.c> iterator() {
            C4517u uVar = C4517u.this;
            int i10 = this.f6588a;
            return new a(i10, i10, this.f6589b);
        }

        public int k(d.c cVar) {
            int i10 = this.f6588a;
            int i11 = this.f6589b;
            if (i10 > i11) {
                return -1;
            }
            while (!C17542s.e(C4517u.this.f6579a[i10], cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10++;
            }
            return i10 - this.f6588a;
        }

        public final /* bridge */ int lastIndexOf(Object obj) {
            if (!(obj instanceof d.c)) {
                return -1;
            }
            return m((d.c) obj);
        }

        public ListIterator<d.c> listIterator() {
            C4517u uVar = C4517u.this;
            int i10 = this.f6588a;
            return new a(i10, i10, this.f6589b);
        }

        public int m(d.c cVar) {
            int i10 = this.f6589b;
            int i11 = this.f6588a;
            if (i11 > i10) {
                return -1;
            }
            while (!C17542s.e(C4517u.this.f6579a[i10], cVar)) {
                if (i10 == i11) {
                    return -1;
                }
                i10--;
            }
            return i10 - this.f6588a;
        }

        public /* bridge */ /* synthetic */ Object remove(int i10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator<d.c> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return a();
        }

        public void sort(Comparator<? super d.c> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public List<d.c> subList(int i10, int i11) {
            C4517u uVar = C4517u.this;
            int i12 = this.f6588a;
            return new b(i10 + i12, i12 + i11);
        }

        public Object[] toArray() {
            return C17534j.a(this);
        }

        public /* bridge */ /* synthetic */ boolean add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends d.c> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public ListIterator<d.c> listIterator(int i10) {
            C4517u uVar = C4517u.this;
            int i11 = this.f6588a;
            return new a(i10 + i11, i11, this.f6589b);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public <T> T[] toArray(T[] tArr) {
            return C17534j.b(this, tArr);
        }
    }

    private final void G() {
        int i10 = this.f6581c + 1;
        int p10 = C16877v.p(this);
        if (i10 <= p10) {
            while (true) {
                this.f6579a[i10] = null;
                if (i10 == p10) {
                    break;
                }
                i10++;
            }
        }
        this.f6582d = this.f6581c + 1;
    }

    private final void q() {
        int i10 = this.f6581c;
        Object[] objArr = this.f6579a;
        if (i10 >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            C17542s.i(copyOf, "copyOf(this, newSize)");
            this.f6579a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f6580b, length);
            C17542s.i(copyOf2, "copyOf(this, newSize)");
            this.f6580b = copyOf2;
        }
    }

    private final long s() {
        long b10 = C4518v.a(Float.POSITIVE_INFINITY, false);
        int i10 = this.f6581c + 1;
        int p10 = C16877v.p(this);
        if (i10 <= p10) {
            while (true) {
                long b11 = C4514q.b(this.f6580b[i10]);
                if (C4514q.a(b11, b10) < 0) {
                    b10 = b11;
                }
                if (C4514q.c(b10) >= 0.0f || !C4514q.d(b10)) {
                    if (i10 == p10) {
                        break;
                    }
                    i10++;
                } else {
                    return b10;
                }
            }
        }
        return b10;
    }

    public final boolean A() {
        long s10 = s();
        return C4514q.c(s10) < 0.0f && C4514q.d(s10);
    }

    public final void B(d.c cVar, boolean z10, C17631a<C16807N> aVar) {
        C(cVar, -1.0f, z10, aVar);
        C4498c0 b22 = cVar.b2();
        if (b22 != null && !b22.q3()) {
            this.f6583e = false;
        }
    }

    public final void C(d.c cVar, float f10, boolean z10, C17631a<C16807N> aVar) {
        int i10 = this.f6581c;
        this.f6581c = i10 + 1;
        q();
        Object[] objArr = this.f6579a;
        int i11 = this.f6581c;
        objArr[i11] = cVar;
        this.f6580b[i11] = C4518v.a(f10, z10);
        G();
        aVar.invoke();
        this.f6581c = i10;
    }

    public int D(d.c cVar) {
        int p10 = C16877v.p(this);
        if (p10 < 0) {
            return -1;
        }
        int i10 = 0;
        while (!C17542s.e(this.f6579a[i10], cVar)) {
            if (i10 == p10) {
                return -1;
            }
            i10++;
        }
        return i10;
    }

    public final boolean E(float f10, boolean z10) {
        if (this.f6581c == C16877v.p(this)) {
            return true;
        }
        return C4514q.a(s(), C4518v.a(f10, z10)) > 0;
    }

    public int F(d.c cVar) {
        for (int p10 = C16877v.p(this); -1 < p10; p10--) {
            if (C17542s.e(this.f6579a[p10], cVar)) {
                return p10;
            }
        }
        return -1;
    }

    public final void H(d.c cVar, float f10, boolean z10, C17631a<C16807N> aVar) {
        if (this.f6581c == C16877v.p(this)) {
            C(cVar, f10, z10, aVar);
            if (this.f6581c + 1 == C16877v.p(this)) {
                G();
                return;
            }
            return;
        }
        long s10 = s();
        int i10 = this.f6581c;
        this.f6581c = C16877v.p(this);
        C(cVar, f10, z10, aVar);
        if (this.f6581c + 1 < C16877v.p(this) && C4514q.a(s10, s()) > 0) {
            int i11 = this.f6581c + 1;
            int i12 = i10 + 1;
            Object[] objArr = this.f6579a;
            C16870n.n(objArr, objArr, i12, i11, size());
            long[] jArr = this.f6580b;
            C16870n.m(jArr, jArr, i12, i11, size());
            this.f6581c = ((size() + i10) - this.f6581c) - 1;
        }
        G();
        this.f6581c = i10;
    }

    public int a() {
        return this.f6582d;
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends d.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void b() {
        this.f6581c = size() - 1;
    }

    public final void clear() {
        this.f6581c = -1;
        G();
        this.f6583e = true;
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof d.c)) {
            return false;
        }
        return p((d.c) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((d.c) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof d.c)) {
            return -1;
        }
        return D((d.c) obj);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Iterator<d.c> iterator() {
        return new a(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof d.c)) {
            return -1;
        }
        return F((d.c) obj);
    }

    public ListIterator<d.c> listIterator() {
        return new a(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public boolean p(d.c cVar) {
        return indexOf(cVar) != -1;
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<d.c> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public void sort(Comparator<? super d.c> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<d.c> subList(int i10, int i11) {
        return new b(i10, i11);
    }

    /* renamed from: t */
    public d.c get(int i10) {
        Object obj = this.f6579a[i10];
        C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (d.c) obj;
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public final boolean x() {
        return this.f6583e;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends d.c> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<d.c> listIterator(int i10) {
        return new a(this, i10, 0, 0, 6, (DefaultConstructorMarker) null);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        return C17534j.b(this, tArr);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001a\u0010\u0010¨\u0006\u001b"}, d2 = {"LG1/u$a;", "", "Landroidx/compose/ui/d$c;", "", "index", "minIndex", "maxIndex", "<init>", "(LG1/u;III)V", "", "hasNext", "()Z", "hasPrevious", "c", "()Landroidx/compose/ui/d$c;", "nextIndex", "()I", "d", "previousIndex", "a", "I", "getIndex", "setIndex", "(I)V", "b", "getMinIndex", "getMaxIndex", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.u$a */
    private final class a implements ListIterator<d.c>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private int f6584a;

        /* renamed from: b  reason: collision with root package name */
        private final int f6585b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6586c;

        public a(int i10, int i11, int i12) {
            this.f6584a = i10;
            this.f6585b = i11;
            this.f6586c = i12;
        }

        public /* bridge */ /* synthetic */ void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: c */
        public d.c next() {
            Object[] k10 = C4517u.this.f6579a;
            int i10 = this.f6584a;
            this.f6584a = i10 + 1;
            Object obj = k10[i10];
            C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (d.c) obj;
        }

        /* renamed from: d */
        public d.c previous() {
            Object[] k10 = C4517u.this.f6579a;
            int i10 = this.f6584a - 1;
            this.f6584a = i10;
            Object obj = k10[i10];
            C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
            return (d.c) obj;
        }

        public boolean hasNext() {
            return this.f6584a < this.f6586c;
        }

        public boolean hasPrevious() {
            return this.f6584a > this.f6585b;
        }

        public int nextIndex() {
            return this.f6584a - this.f6585b;
        }

        public int previousIndex() {
            return (this.f6584a - this.f6585b) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public /* bridge */ /* synthetic */ void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C4517u uVar, int i10, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? 0 : i11, (i13 & 4) != 0 ? uVar.size() : i12);
        }
    }
}
