package JH;

import YH.C16877v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17534j;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import oI.C17693a;
import oI.C17698f;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n*\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\n*\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0011J\u001d\u0010\u0019\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u001d\u0010\u001a\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0018\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001b\u0010\u0011J\u001d\u0010\u001c\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\nH\u0016¢\u0006\u0004\b\u001c\u0010\u0014J\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010\u0011J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u001a\u00102\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b+\u0010$¨\u00063"}, d2 = {"LJH/o;", "From", "To", "", "delegate", "Lkotlin/Function1;", "convertTo", "convert", "<init>", "(Ljava/util/Set;LnI/l;LnI/l;)V", "", "k", "(Ljava/util/Collection;)Ljava/util/Collection;", "m", "element", "", "add", "(Ljava/lang/Object;)Z", "elements", "addAll", "(Ljava/util/Collection;)Z", "LXH/N;", "clear", "()V", "remove", "removeAll", "retainAll", "contains", "containsAll", "isEmpty", "()Z", "", "iterator", "()Ljava/util/Iterator;", "", "hashCode", "()I", "", "other", "equals", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/Set;", "b", "LnI/l;", "c", "d", "I", "size", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class o<From, To> implements Set<To>, C17698f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Set<From> f135722a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<From, To> f135723b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<To, From> f135724c;

    /* renamed from: d  reason: collision with root package name */
    private final int f135725d;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00018\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"JH/o$a", "", "", "hasNext", "()Z", "next", "()Ljava/lang/Object;", "LXH/N;", "remove", "()V", "a", "Ljava/util/Iterator;", "getDelegateIterator", "()Ljava/util/Iterator;", "delegateIterator", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Iterator<To>, C17693a {

        /* renamed from: a  reason: collision with root package name */
        private final Iterator<From> f135726a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o<From, To> f135727b;

        a(o<From, To> oVar) {
            this.f135727b = oVar;
            this.f135726a = oVar.f135722a.iterator();
        }

        public boolean hasNext() {
            return this.f135726a.hasNext();
        }

        public To next() {
            return this.f135727b.f135723b.invoke(this.f135726a.next());
        }

        public void remove() {
            this.f135726a.remove();
        }
    }

    public o(Set<From> set, C17642l<? super From, ? extends To> lVar, C17642l<? super To, ? extends From> lVar2) {
        C17542s.j(set, "delegate");
        C17542s.j(lVar, "convertTo");
        C17542s.j(lVar2, "convert");
        this.f135722a = set;
        this.f135723b = lVar;
        this.f135724c = lVar2;
        this.f135725d = set.size();
    }

    public int a() {
        return this.f135725d;
    }

    public boolean add(To to2) {
        return this.f135722a.add(this.f135724c.invoke(to2));
    }

    public boolean addAll(Collection<? extends To> collection) {
        C17542s.j(collection, "elements");
        return this.f135722a.addAll(k(collection));
    }

    public void clear() {
        this.f135722a.clear();
    }

    public boolean contains(Object obj) {
        return this.f135722a.contains(this.f135724c.invoke(obj));
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return this.f135722a.containsAll(k(collection));
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Set)) {
            return false;
        }
        Collection m10 = m(this.f135722a);
        return ((Set) obj).containsAll(m10) && m10.containsAll((Collection) obj);
    }

    public int hashCode() {
        return this.f135722a.hashCode();
    }

    public boolean isEmpty() {
        return this.f135722a.isEmpty();
    }

    public Iterator<To> iterator() {
        return new a(this);
    }

    public Collection<From> k(Collection<? extends To> collection) {
        C17542s.j(collection, "<this>");
        Iterable<Object> iterable = collection;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(this.f135724c.invoke(invoke));
        }
        return arrayList;
    }

    public Collection<To> m(Collection<? extends From> collection) {
        C17542s.j(collection, "<this>");
        Iterable<Object> iterable = collection;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(this.f135723b.invoke(invoke));
        }
        return arrayList;
    }

    public boolean remove(Object obj) {
        return this.f135722a.remove(this.f135724c.invoke(obj));
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return this.f135722a.removeAll(k(collection));
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        C17542s.j(collection, "elements");
        return this.f135722a.retainAll(k(collection));
    }

    public final /* bridge */ int size() {
        return a();
    }

    public Object[] toArray() {
        return C17534j.a(this);
    }

    public String toString() {
        return m(this.f135722a).toString();
    }

    public <T> T[] toArray(T[] tArr) {
        C17542s.j(tArr, "array");
        return C17534j.b(this, tArr);
    }
}
