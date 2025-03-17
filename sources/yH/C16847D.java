package YH;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17974j;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u001f\u0010\u0006\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0004\u001a#\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\u0004\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00000\nH\u0007¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"", "", "index", "X", "(Ljava/util/List;I)I", "Z", "Y", "T", "V", "(Ljava/util/List;)Ljava/util/List;", "", "W", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* renamed from: YH.D  reason: case insensitive filesystem */
class C16847D extends C16846C {
    public static <T> List<T> V(List<? extends T> list) {
        C17542s.j(list, "<this>");
        return new e0(list);
    }

    public static <T> List<T> W(List<T> list) {
        C17542s.j(list, "<this>");
        return new d0(list);
    }

    /* access modifiers changed from: private */
    public static final int X(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= C16877v.p(list)) {
            return C16877v.p(list) - i10;
        }
        throw new IndexOutOfBoundsException("Element index " + i10 + " must be in range [" + new C17974j(0, C16877v.p(list)) + "].");
    }

    /* access modifiers changed from: private */
    public static final int Y(List<?> list, int i10) {
        return C16877v.p(list) - i10;
    }

    /* access modifiers changed from: private */
    public static final int Z(List<?> list, int i10) {
        if (i10 >= 0 && i10 <= list.size()) {
            return list.size() - i10;
        }
        throw new IndexOutOfBoundsException("Position index " + i10 + " must be in range [" + new C17974j(0, list.size()) + "].");
    }
}
