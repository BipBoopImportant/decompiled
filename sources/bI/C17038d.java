package bI;

import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001aG\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002 \u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a/\u0010\n\u001a\u00020\u0007\"\f\b\u0000\u0010\u0000*\u0006\u0012\u0002\b\u00030\u00052\b\u0010\u0001\u001a\u0004\u0018\u00018\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a[\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u0004\b\u0000\u0010\u000026\u0010\u0006\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u00040\u0003\"\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fj\n\u0012\u0006\u0012\u0004\u0018\u00018\u0000`\r\"\b\b\u0000\u0010\u0000*\u00020\u00102\u001a\u0010\u0011\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000\fj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a-\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00028\u00000\fj\b\u0012\u0004\u0012\u00028\u0000`\r\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"T", "a", "b", "", "Lkotlin/Function1;", "", "selectors", "", "f", "(Ljava/lang/Object;Ljava/lang/Object;[LnI/l;)I", "e", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)I", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "c", "([LnI/l;)Ljava/util/Comparator;", "", "comparator", "h", "(Ljava/util/Comparator;)Ljava/util/Comparator;", "g", "()Ljava/util/Comparator;", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: bI.d  reason: case insensitive filesystem */
class C17038d {
    public static <T> Comparator<T> c(C17642l<? super T, ? extends Comparable<?>>... lVarArr) {
        C17542s.j(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            return new C17037c(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    /* access modifiers changed from: private */
    public static final int d(C17642l[] lVarArr, Object obj, Object obj2) {
        return f(obj, obj2, lVarArr);
    }

    public static <T extends Comparable<?>> int e(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return t10.compareTo(t11);
    }

    private static final <T> int f(T t10, T t11, C17642l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (C17642l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int e10 = C17035a.e((Comparable) lVar.invoke(t10), (Comparable) lVar.invoke(t11));
            if (e10 != 0) {
                return e10;
            }
        }
        return 0;
    }

    public static <T extends Comparable<? super T>> Comparator<T> g() {
        C17041g gVar = C17041g.f141163a;
        C17542s.h(gVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>");
        return gVar;
    }

    public static <T> Comparator<T> h(Comparator<? super T> comparator) {
        C17542s.j(comparator, "comparator");
        return new C17036b(comparator);
    }

    /* access modifiers changed from: private */
    public static final int i(Comparator comparator, Object obj, Object obj2) {
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }
}
