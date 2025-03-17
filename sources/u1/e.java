package U1;

import YH.C16877v;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\b\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\rJ\u001d\u0010\u000f\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010\u001b¨\u0006'"}, d2 = {"LU1/e;", "", "LU1/d;", "", "localeList", "<init>", "(Ljava/util/List;)V", "", "i", "k", "(I)LU1/d;", "element", "", "(LU1/d;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "m", "()Ljava/util/List;", "b", "I", "size", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements Collection<d>, C17693a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f14214c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final e f14215d = new e(C16877v.n());

    /* renamed from: a  reason: collision with root package name */
    private final List<d> f14216a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14217b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"LU1/e$a;", "", "<init>", "()V", "LU1/e;", "Empty", "LU1/e;", "b", "()LU1/e;", "a", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a() {
            return g.a().a();
        }

        public final e b() {
            return e.f14215d;
        }

        private a() {
        }
    }

    public e(List<d> list) {
        this.f14216a = list;
        this.f14217b = list.size();
    }

    public int a() {
        return this.f14217b;
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends d> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i((d) obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        return this.f14216a.containsAll(collection);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && C17542s.e(this.f14216a, ((e) obj).f14216a);
    }

    public int hashCode() {
        return this.f14216a.hashCode();
    }

    public boolean i(d dVar) {
        return this.f14216a.contains(dVar);
    }

    public boolean isEmpty() {
        return this.f14216a.isEmpty();
    }

    public Iterator<d> iterator() {
        return this.f14216a.iterator();
    }

    public final d k(int i10) {
        return this.f14216a.get(i10);
    }

    public final List<d> m() {
        return this.f14216a;
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super d> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f14216a + ')';
    }

    public <T> T[] toArray(T[] tArr) {
        return C17534j.b(this, tArr);
    }
}
