package lK;

import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LkK/c;", "json", "", "source", "LlK/d0;", "a", "(LkK/c;Ljava/lang/String;)LlK/d0;", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e0 {
    public static final d0 a(C17514c cVar, String str) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        C17542s.j(str, "source");
        return !cVar.g().a() ? new d0(str) : new f0(str);
    }
}
