package YH;

import ZH.C16997b;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0005H\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u00052\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00052\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0013\u001a\u00020\t2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a3\u0010\u001b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u001a0\u0014\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00142\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"T", "element", "", "e", "(Ljava/lang/Object;)Ljava/util/List;", "E", "", "c", "()Ljava/util/List;", "", "capacity", "d", "(I)Ljava/util/List;", "builder", "a", "(Ljava/util/List;)Ljava/util/List;", "", "f", "(Ljava/lang/Iterable;)Ljava/util/List;", "collectionSize", "", "array", "g", "(I[Ljava/lang/Object;)[Ljava/lang/Object;", "", "isVarargs", "", "b", "([Ljava/lang/Object;Z)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: YH.w  reason: case insensitive filesystem */
class C16878w {
    public static <E> List<E> a(List<E> list) {
        C17542s.j(list, "builder");
        return ((C16997b) list).D();
    }

    public static final <T> Object[] b(T[] tArr, boolean z10) {
        C17542s.j(tArr, "<this>");
        Class<Object[]> cls = Object[].class;
        if (z10 && C17542s.e(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C17542s.i(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static <E> List<E> c() {
        return new C16997b(0, 1, (DefaultConstructorMarker) null);
    }

    public static <E> List<E> d(int i10) {
        return new C16997b(i10);
    }

    public static <T> List<T> e(T t10) {
        List<T> singletonList = Collections.singletonList(t10);
        C17542s.i(singletonList, "singletonList(...)");
        return singletonList;
    }

    public static <T> List<T> f(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        List<T> v12 = C16877v.v1(iterable);
        Collections.shuffle(v12);
        return v12;
    }

    public static <T> T[] g(int i10, T[] tArr) {
        C17542s.j(tArr, "array");
        if (i10 < tArr.length) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
