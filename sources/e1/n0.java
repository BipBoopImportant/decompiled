package E1;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"LE1/n0;", "", "LE1/n0$a;", "slotIds", "LXH/N;", "a", "(LE1/n0$a;)V", "slotId", "reusableSlotId", "", "b", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface n0 {

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0000\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u001b\b\u0000\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0003¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\u00020\b2\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0011\u0010\nJ\u0018\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\nJ\u001d\u0010\u0017\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0017\u0010\rJ\u001d\u0010\u0018\u001a\u00020\b2\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006!"}, d2 = {"LE1/n0$a;", "", "", "", "set", "<init>", "(Ljava/util/Set;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "elements", "containsAll", "(Ljava/util/Collection;)Z", "isEmpty", "()Z", "slotId", "b", "", "iterator", "()Ljava/util/Iterator;", "remove", "slotIds", "removeAll", "retainAll", "LXH/N;", "clear", "()V", "a", "Ljava/util/Set;", "", "()I", "size", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Collection<Object>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Object> f5948a;

        public a(Set<Object> set) {
            this.f5948a = set;
        }

        public int a() {
            return this.f5948a.size();
        }

        public boolean addAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public final boolean add(Object obj) {
            return this.f5948a.add(obj);
        }

        public final void clear() {
            this.f5948a.clear();
        }

        public boolean contains(Object obj) {
            return this.f5948a.contains(obj);
        }

        public boolean containsAll(Collection<? extends Object> collection) {
            return this.f5948a.containsAll(collection);
        }

        public boolean isEmpty() {
            return this.f5948a.isEmpty();
        }

        public Iterator<Object> iterator() {
            return this.f5948a.iterator();
        }

        public final boolean remove(Object obj) {
            return this.f5948a.remove(obj);
        }

        public final boolean removeAll(Collection<? extends Object> collection) {
            return this.f5948a.remove(collection);
        }

        public boolean removeIf(Predicate<? super Object> predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean retainAll(Collection<? extends Object> collection) {
            return this.f5948a.retainAll(collection);
        }

        public final /* bridge */ int size() {
            return a();
        }

        public Object[] toArray() {
            return C17534j.a(this);
        }

        public <T> T[] toArray(T[] tArr) {
            return C17534j.b(this, tArr);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(Set set, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? new LinkedHashSet() : set);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
