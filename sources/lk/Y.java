package lK;

import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LkK/c;", "json", "LlK/u;", "reader", "", "buffer", "LlK/X;", "a", "(LkK/c;LlK/u;[C)LlK/X;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Y {
    public static final X a(C17514c cVar, C17589u uVar, char[] cArr) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(uVar, "reader");
        C17542s.j(cArr, "buffer");
        return !cVar.g().a() ? new X(uVar, cArr) : new Z(uVar, cArr);
    }
}
