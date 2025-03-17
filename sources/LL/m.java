package Ll;

import Ml.d;
import com.optimizely.ab.config.FeatureVariable;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LLl/m;", "", "<init>", "()V", "", "json", "LMl/d;", "a", "(Ljava/lang/String;)LMl/d;", "alignment", "b", "(LMl/d;)Ljava/lang/String;", "appconfig-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {
    public final d a(String str) {
        C17542s.j(str, FeatureVariable.JSON_TYPE);
        return n.b(str);
    }

    public final String b(d dVar) {
        C17542s.j(dVar, "alignment");
        return dVar.j();
    }
}
