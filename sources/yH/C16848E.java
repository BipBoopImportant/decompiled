package YH;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001aC\u0010\n\u001a\u00028\u0000\"\u0010\b\u0000\u0010\b*\n\u0012\u0006\b\u0000\u0012\u00028\u00010\u0007\"\u0004\b\u0001\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\t\u001a\u00028\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001d\u0010\u000f\u001a\u00020\u000e\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"R", "", "Ljava/lang/Class;", "klass", "", "a0", "(Ljava/lang/Iterable;Ljava/lang/Class;)Ljava/util/List;", "", "C", "destination", "b0", "(Ljava/lang/Iterable;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "T", "", "LXH/N;", "c0", "(Ljava/util/List;)V", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: YH.E  reason: case insensitive filesystem */
class C16848E extends C16847D {
    public static <R> List<R> a0(Iterable<?> iterable, Class<R> cls) {
        C17542s.j(iterable, "<this>");
        C17542s.j(cls, "klass");
        return (List) b0(iterable, new ArrayList(), cls);
    }

    public static final <C extends Collection<? super R>, R> C b0(Iterable<?> iterable, C c10, Class<R> cls) {
        C17542s.j(iterable, "<this>");
        C17542s.j(c10, "destination");
        C17542s.j(cls, "klass");
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                c10.add(next);
            }
        }
        return c10;
    }

    public static <T> void c0(List<T> list) {
        C17542s.j(list, "<this>");
        Collections.reverse(list);
    }
}
