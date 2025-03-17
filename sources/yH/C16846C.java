package YH;

import GJ.C15765h;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.W;
import nI.C17642l;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u001d\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\n\u001a-\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\u000b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\n¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0010\u0010\u0006\u001a-\u0010\u0011\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0000\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0011\u0010\u0006\u001a1\u0010\u0015\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a1\u0010\u0017\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b\u0017\u0010\u0016\u001a;\u0010\u0019\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00122\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001d\u001a\u001f\u0010\u001f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b\u001f\u0010\u001d\u001a!\u0010 \u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0007¢\u0006\u0004\b \u0010\u001d\u001a1\u0010!\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0013¢\u0006\u0004\b!\u0010\"\u001a;\u0010#\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00132\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010$¨\u0006%"}, d2 = {"T", "", "", "elements", "", "E", "(Ljava/util/Collection;Ljava/lang/Iterable;)Z", "LGJ/h;", "D", "(Ljava/util/Collection;LGJ/h;)Z", "", "F", "(Ljava/util/Collection;[Ljava/lang/Object;)Z", "", "G", "(Ljava/lang/Iterable;)Ljava/util/Collection;", "K", "R", "", "Lkotlin/Function1;", "predicate", "J", "(Ljava/lang/Iterable;LnI/l;)Z", "Q", "predicateResultToRemove", "H", "(Ljava/lang/Iterable;LnI/l;Z)Z", "", "M", "(Ljava/util/List;)Ljava/lang/Object;", "N", "O", "P", "L", "(Ljava/util/List;LnI/l;)Z", "I", "(Ljava/util/List;LnI/l;Z)Z", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: YH.C  reason: case insensitive filesystem */
class C16846C extends C16845B {
    public static <T> boolean D(Collection<? super T> collection, C15765h<? extends T> hVar) {
        C17542s.j(collection, "<this>");
        C17542s.j(hVar, "elements");
        boolean z10 = false;
        for (Object add : hVar) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean E(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C17542s.j(collection, "<this>");
        C17542s.j(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z10 = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z10 = true;
            }
        }
        return z10;
    }

    public static <T> boolean F(Collection<? super T> collection, T[] tArr) {
        C17542s.j(collection, "<this>");
        C17542s.j(tArr, "elements");
        return collection.addAll(C16870n.f(tArr));
    }

    public static final <T> Collection<T> G(Iterable<? extends T> iterable) {
        C17542s.j(iterable, "<this>");
        boolean z10 = iterable instanceof Collection;
        List<? extends T> list = iterable;
        if (!z10) {
            list = C16877v.t1(iterable);
        }
        return list;
    }

    private static final <T> boolean H(Iterable<? extends T> iterable, C17642l<? super T, Boolean> lVar, boolean z10) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z10) {
                it.remove();
                z11 = true;
            }
        }
        return z11;
    }

    private static final <T> boolean I(List<T> list, C17642l<? super T, Boolean> lVar, boolean z10) {
        int i10;
        if (!(list instanceof RandomAccess)) {
            C17542s.h(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return H(W.b(list), lVar, z10);
        }
        int p10 = C16877v.p(list);
        if (p10 >= 0) {
            int i11 = 0;
            i10 = 0;
            while (true) {
                T t10 = list.get(i11);
                if (lVar.invoke(t10).booleanValue() != z10) {
                    if (i10 != i11) {
                        list.set(i10, t10);
                    }
                    i10++;
                }
                if (i11 == p10) {
                    break;
                }
                i11++;
            }
        } else {
            i10 = 0;
        }
        if (i10 >= list.size()) {
            return false;
        }
        int p11 = C16877v.p(list);
        if (i10 > p11) {
            return true;
        }
        while (true) {
            list.remove(p11);
            if (p11 == i10) {
                return true;
            }
            p11--;
        }
    }

    public static <T> boolean J(Iterable<? extends T> iterable, C17642l<? super T, Boolean> lVar) {
        C17542s.j(iterable, "<this>");
        C17542s.j(lVar, "predicate");
        return H(iterable, lVar, true);
    }

    public static final <T> boolean K(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C17542s.j(collection, "<this>");
        C17542s.j(iterable, "elements");
        return collection.removeAll(G(iterable));
    }

    public static <T> boolean L(List<T> list, C17642l<? super T, Boolean> lVar) {
        C17542s.j(list, "<this>");
        C17542s.j(lVar, "predicate");
        return I(list, lVar, true);
    }

    public static <T> T M(List<T> list) {
        C17542s.j(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T N(List<T> list) {
        C17542s.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static <T> T O(List<T> list) {
        C17542s.j(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C16877v.p(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static <T> T P(List<T> list) {
        C17542s.j(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(C16877v.p(list));
    }

    public static <T> boolean Q(Iterable<? extends T> iterable, C17642l<? super T, Boolean> lVar) {
        C17542s.j(iterable, "<this>");
        C17542s.j(lVar, "predicate");
        return H(iterable, lVar, false);
    }

    public static final <T> boolean R(Collection<? super T> collection, Iterable<? extends T> iterable) {
        C17542s.j(collection, "<this>");
        C17542s.j(iterable, "elements");
        return collection.retainAll(G(iterable));
    }
}
