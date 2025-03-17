package YH;

import bI.C17035a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import tI.C17974j;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a-\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\f\u0010\n\u001a7\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00028\u00000\rj\b\u0012\u0004\u0012\u00028\u0000`\u000e\"\u0004\b\u0000\u0010\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u00028\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a5\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0000*\u00020\u00112\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001\"\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0015\u0010\n\u001a%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001aG\u0010\u001c\u001a\u00020\u0019\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0018*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00052\b\u0010\u0012\u001a\u0004\u0018\u00018\u00002\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001d\u001aE\u0010 \u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00192\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001e¢\u0006\u0004\b \u0010!\u001a'\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020#H\u0001¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020#H\u0001¢\u0006\u0004\b(\u0010'\"\u0019\u0010,\u001a\u00020)*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b*\u0010+\"!\u0010/\u001a\u00020\u0019\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00058F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"T", "", "", "i", "([Ljava/lang/Object;)Ljava/util/Collection;", "", "n", "()Ljava/util/List;", "elements", "q", "([Ljava/lang/Object;)Ljava/util/List;", "", "t", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "h", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "", "element", "r", "(Ljava/lang/Object;)Ljava/util/List;", "s", "u", "(Ljava/util/List;)Ljava/util/List;", "", "", "fromIndex", "toIndex", "k", "(Ljava/util/List;Ljava/lang/Comparable;II)I", "Lkotlin/Function1;", "comparison", "j", "(Ljava/util/List;IILnI/l;)I", "size", "LXH/N;", "v", "(III)V", "x", "()V", "w", "LtI/j;", "o", "(Ljava/util/Collection;)LtI/j;", "indices", "p", "(Ljava/util/List;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: YH.x  reason: case insensitive filesystem */
class C16879x extends C16878w {
    public static <T> ArrayList<T> h(T... tArr) {
        C17542s.j(tArr, "elements");
        return tArr.length == 0 ? new ArrayList<>() : new ArrayList<>(new C16868l(tArr, true));
    }

    public static final <T> Collection<T> i(T[] tArr) {
        C17542s.j(tArr, "<this>");
        return new C16868l(tArr, false);
    }

    public static <T> int j(List<? extends T> list, int i10, int i11, C17642l<? super T, Integer> lVar) {
        C17542s.j(list, "<this>");
        C17542s.j(lVar, "comparison");
        v(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int intValue = lVar.invoke(list.get(i13)).intValue();
            if (intValue < 0) {
                i10 = i13 + 1;
            } else if (intValue <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final <T extends Comparable<? super T>> int k(List<? extends T> list, T t10, int i10, int i11) {
        C17542s.j(list, "<this>");
        v(list.size(), i10, i11);
        int i12 = i11 - 1;
        while (i10 <= i12) {
            int i13 = (i10 + i12) >>> 1;
            int e10 = C17035a.e((Comparable) list.get(i13), t10);
            if (e10 < 0) {
                i10 = i13 + 1;
            } else if (e10 <= 0) {
                return i13;
            } else {
                i12 = i13 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static /* synthetic */ int l(List list, int i10, int i11, C17642l lVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = list.size();
        }
        return C16877v.j(list, i10, i11, lVar);
    }

    public static /* synthetic */ int m(List list, Comparable comparable, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = list.size();
        }
        return k(list, comparable, i10, i11);
    }

    public static <T> List<T> n() {
        return C16853J.f140418a;
    }

    public static C17974j o(Collection<?> collection) {
        C17542s.j(collection, "<this>");
        return new C17974j(0, collection.size() - 1);
    }

    public static <T> int p(List<? extends T> list) {
        C17542s.j(list, "<this>");
        return list.size() - 1;
    }

    public static <T> List<T> q(T... tArr) {
        C17542s.j(tArr, "elements");
        return tArr.length > 0 ? C16870n.f(tArr) : C16877v.n();
    }

    public static <T> List<T> r(T t10) {
        return t10 != null ? C16877v.e(t10) : C16877v.n();
    }

    public static <T> List<T> s(T... tArr) {
        C17542s.j(tArr, "elements");
        return C16870n.d0(tArr);
    }

    public static <T> List<T> t(T... tArr) {
        C17542s.j(tArr, "elements");
        return tArr.length == 0 ? new ArrayList() : new ArrayList(new C16868l(tArr, true));
    }

    public static final <T> List<T> u(List<? extends T> list) {
        C17542s.j(list, "<this>");
        int size = list.size();
        return size != 0 ? size != 1 ? list : C16877v.e(list.get(0)) : C16877v.n();
    }

    private static final void v(int i10, int i11, int i12) {
        if (i11 > i12) {
            throw new IllegalArgumentException("fromIndex (" + i11 + ") is greater than toIndex (" + i12 + ").");
        } else if (i11 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i11 + ") is less than zero.");
        } else if (i12 > i10) {
            throw new IndexOutOfBoundsException("toIndex (" + i12 + ") is greater than size (" + i10 + ").");
        }
    }

    public static void w() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void x() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
