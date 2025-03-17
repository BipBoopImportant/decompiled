package YH;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oI.C17693a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b'\u0018\u0000 \u000e*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u000eB\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LYH/k;", "E", "LYH/b;", "", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YH.k  reason: case insensitive filesystem */
public abstract class C16867k<E> extends C16858b<E> implements Set<E>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f140451a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u000b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LYH/k$a;", "", "<init>", "()V", "", "c", "", "b", "(Ljava/util/Collection;)I", "", "other", "", "a", "(Ljava/util/Set;Ljava/util/Set;)Z", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YH.k$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Set<?> set, Set<?> set2) {
            C17542s.j(set, "c");
            C17542s.j(set2, "other");
            if (set.size() != set2.size()) {
                return false;
            }
            return set.containsAll(set2);
        }

        public final int b(Collection<?> collection) {
            C17542s.j(collection, "c");
            Iterator<?> it = collection.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                i10 += next != null ? next.hashCode() : 0;
            }
            return i10;
        }

        private a() {
        }
    }

    protected C16867k() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        return f140451a.a(this, (Set) obj);
    }

    public int hashCode() {
        return f140451a.b(this);
    }
}
