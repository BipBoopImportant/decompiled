package YH;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a-\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\t\u0010\u0007\u001a7\u0010\f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\nj\b\u0012\u0004\u0012\u00028\u0000`\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\u00028\u0000¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "", "d", "()Ljava/util/Set;", "", "elements", "h", "([Ljava/lang/Object;)Ljava/util/Set;", "", "f", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "e", "([Ljava/lang/Object;)Ljava/util/LinkedHashSet;", "g", "(Ljava/util/Set;)Ljava/util/Set;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
class i0 extends h0 {
    public static <T> Set<T> d() {
        return C16855L.f140420a;
    }

    public static <T> LinkedHashSet<T> e(T... tArr) {
        C17542s.j(tArr, "elements");
        return (LinkedHashSet) C16874s.V0(tArr, new LinkedHashSet(X.e(tArr.length)));
    }

    public static <T> Set<T> f(T... tArr) {
        C17542s.j(tArr, "elements");
        return (Set) C16874s.V0(tArr, new LinkedHashSet(X.e(tArr.length)));
    }

    public static final <T> Set<T> g(Set<? extends T> set) {
        C17542s.j(set, "<this>");
        int size = set.size();
        return size != 0 ? size != 1 ? set : g0.c(set.iterator().next()) : g0.d();
    }

    public static <T> Set<T> h(T... tArr) {
        C17542s.j(tArr, "elements");
        return C16870n.o1(tArr);
    }
}
