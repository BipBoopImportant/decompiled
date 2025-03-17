package YH;

import ZH.C17003h;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0006\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a)\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"T", "element", "", "c", "(Ljava/lang/Object;)Ljava/util/Set;", "E", "", "b", "()Ljava/util/Set;", "builder", "a", "(Ljava/util/Set;)Ljava/util/Set;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/SetsKt")
class h0 {
    public static <E> Set<E> a(Set<E> set) {
        C17542s.j(set, "builder");
        return ((C17003h) set).b();
    }

    public static <E> Set<E> b() {
        return new C17003h();
    }

    public static <T> Set<T> c(T t10) {
        Set<T> singleton = Collections.singleton(t10);
        C17542s.i(singleton, "singleton(...)");
        return singleton;
    }
}
