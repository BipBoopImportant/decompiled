package S1;

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
import oI.C17693a;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bH\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u0014J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u001b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u001c\u0010\u001eJ&\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000fH\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u000fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u000f8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b0\u0010(¨\u00062"}, d2 = {"LS1/s;", "LS1/k;", "", "LS1/l;", "fonts", "<init>", "(Ljava/util/List;)V", "element", "", "q", "(LS1/l;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "s", "(I)LS1/l;", "x", "(LS1/l;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "A", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "h", "Ljava/util/List;", "t", "()Ljava/util/List;", "a", "size", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: S1.s  reason: case insensitive filesystem */
public final class C4825s extends C4818k implements List<C4819l>, C17693a {

    /* renamed from: h  reason: collision with root package name */
    private final List<C4819l> f13436h;

    public C4825s(List<? extends C4819l> list) {
        super((DefaultConstructorMarker) null);
        this.f13436h = list;
        if (list.isEmpty()) {
            throw new IllegalStateException("At least one font should be passed to FontFamily");
        }
    }

    public int A(C4819l lVar) {
        return this.f13436h.lastIndexOf(lVar);
    }

    public int a() {
        return this.f13436h.size();
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends C4819l> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C4819l)) {
            return false;
        }
        return q((C4819l) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f13436h.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4825s) && C17542s.e(this.f13436h, ((C4825s) obj).f13436h);
    }

    public int hashCode() {
        return this.f13436h.hashCode();
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C4819l)) {
            return -1;
        }
        return x((C4819l) obj);
    }

    public boolean isEmpty() {
        return this.f13436h.isEmpty();
    }

    public Iterator<C4819l> iterator() {
        return this.f13436h.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C4819l)) {
            return -1;
        }
        return A((C4819l) obj);
    }

    public ListIterator<C4819l> listIterator() {
        return this.f13436h.listIterator();
    }

    public boolean q(C4819l lVar) {
        return this.f13436h.contains(lVar);
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C4819l> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: s */
    public C4819l get(int i10) {
        return this.f13436h.get(i10);
    }

    public /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public void sort(Comparator<? super C4819l> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<C4819l> subList(int i10, int i11) {
        return this.f13436h.subList(i10, i11);
    }

    public final List<C4819l> t() {
        return this.f13436h;
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public String toString() {
        return "FontListFontFamily(fonts=" + this.f13436h + ')';
    }

    public int x(C4819l lVar) {
        return this.f13436h.indexOf(lVar);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C4819l> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<C4819l> listIterator(int i10) {
        return this.f13436h.listIterator(i10);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        return C17534j.b(this, tArr);
    }
}
