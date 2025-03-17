package bI;

import com.sugarcube.core.logger.DslKt;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000f\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\n\u0010\b\u001a\u00020\u0007\"\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "T", "a", "b", "k", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "other", "j", "(I[I)I", "kotlin-stdlib"}, k = 5, mv = {2, 1, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* renamed from: bI.e  reason: case insensitive filesystem */
class C17039e extends C17038d {
    public static int j(int i10, int... iArr) {
        C17542s.j(iArr, "other");
        for (int max : iArr) {
            i10 = Math.max(i10, max);
        }
        return i10;
    }

    public static <T extends Comparable<? super T>> T k(T t10, T t11) {
        C17542s.j(t10, "a");
        C17542s.j(t11, DslKt.INDICATOR_BACKGROUND);
        return t10.compareTo(t11) >= 0 ? t10 : t11;
    }
}
