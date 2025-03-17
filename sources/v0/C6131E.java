package v0;

import g1.C5353v;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import oI.C17693a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010*\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0017\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0016¢\u0006\u0004\b\u0005\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001b\u0010\u0015J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u001d\u0010\u001fJ&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0000¢\u0006\u0004\b(\u0010'R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00108\u0016X\u0005¢\u0006\u0006\u001a\u0004\b)\u0010+¨\u0006-"}, d2 = {"Lv0/E;", "", "Lv0/E$a;", "", "items", "<init>", "(Ljava/util/List;)V", "()V", "element", "", "b", "(Lv0/E$a;)Z", "", "elements", "containsAll", "(Ljava/util/Collection;)Z", "", "index", "i", "(I)Lv0/E$a;", "k", "(Lv0/E$a;)I", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "m", "", "listIterator", "()Ljava/util/ListIterator;", "(I)Ljava/util/ListIterator;", "fromIndex", "toIndex", "subList", "(II)Ljava/util/List;", "item", "LXH/N;", "p", "(Lv0/E$a;)V", "q", "a", "Ljava/util/List;", "()I", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: v0.E  reason: case insensitive filesystem */
public final class C6131E implements List<a>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f30803a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003R\u0014\u0010\b\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0001\u0001\tø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lv0/E$a;", "", "getKey", "()Ljava/lang/Object;", "key", "", "getIndex", "()I", "index", "Lv0/C;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: v0.E$a */
    public interface a {
        int getIndex();

        Object getKey();
    }

    private C6131E(List<a> list) {
        this.f30803a = list;
    }

    public int a() {
        return this.f30803a.size();
    }

    public /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i10, Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean b(a aVar) {
        return this.f30803a.contains(aVar);
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return b((a) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f30803a.containsAll(collection);
    }

    /* renamed from: i */
    public a get(int i10) {
        return this.f30803a.get(i10);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        return k((a) obj);
    }

    public boolean isEmpty() {
        return this.f30803a.isEmpty();
    }

    public Iterator<a> iterator() {
        return this.f30803a.iterator();
    }

    public int k(a aVar) {
        return this.f30803a.indexOf(aVar);
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof a)) {
            return -1;
        }
        return m((a) obj);
    }

    public ListIterator<a> listIterator() {
        return this.f30803a.listIterator();
    }

    public int m(a aVar) {
        return this.f30803a.lastIndexOf(aVar);
    }

    public final void p(a aVar) {
        this.f30803a.add(aVar);
    }

    public final void q(a aVar) {
        this.f30803a.remove(aVar);
    }

    public /* bridge */ /* synthetic */ Object remove(int i10) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<a> unaryOperator) {
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

    public void sort(Comparator<? super a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<a> subList(int i10, int i11) {
        return this.f30803a.subList(i10, i11);
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<a> listIterator(int i10) {
        return this.f30803a.listIterator(i10);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        return C17534j.b(this, tArr);
    }

    public C6131E() {
        this(new C5353v());
    }
}
