package IC;

import IC.C13023e;
import YH.C16870n;
import com.optimizely.ab.config.FeatureVariable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a3\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\"\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0015\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u000eH\u0007¢\u0006\u0004\b\u0015\u0010\u0010¨\u0006\u0016"}, d2 = {"", "string", "LIC/e;", "c", "(Ljava/lang/String;)LIC/e;", "", "id", "a", "(I)LIC/e;", "", "", "args", "b", "(I[Ljava/lang/Object;)LIC/e;", "", "f", "(ILjava/util/List;)LIC/e;", "LIC/b;", "count", "d", "(II[Ljava/lang/Object;)LIC/e;", "e", "common_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: IC.h  reason: case insensitive filesystem */
public final class C13026h {
    public static final C13023e a(int i10) {
        return new C13023e.d(i10, (List) null, 2, (DefaultConstructorMarker) null);
    }

    public static final C13023e b(int i10, Object... objArr) {
        C17542s.j(objArr, "args");
        return new C13023e.d(i10, C16870n.c1(objArr));
    }

    public static final C13023e c(String str) {
        C17542s.j(str, FeatureVariable.STRING_TYPE);
        return new C13023e.b(str);
    }

    public static final C13023e d(int i10, int i11, Object... objArr) {
        C17542s.j(objArr, "args");
        return new C13023e.c(i10, i11, C16870n.c1(objArr), (DefaultConstructorMarker) null);
    }

    public static final C13023e e(int i10, List<? extends C13023e> list) {
        C17542s.j(list, "args");
        return new C13023e.a(i10, list);
    }

    public static final C13023e f(int i10, List<? extends Object> list) {
        C17542s.j(list, "args");
        return new C13023e.d(i10, list);
    }
}
