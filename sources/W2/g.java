package W2;

import W2.f;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\u0007\u001a\u00020\u00062\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003\"\u0006\u0012\u0002\b\u00030\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LW2/f;", "a", "()LW2/f;", "", "LW2/f$b;", "pairs", "LW2/c;", "b", "([LW2/f$b;)LW2/c;", "datastore-preferences-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class g {
    public static final f a() {
        return new c((Map) null, true, 1, (DefaultConstructorMarker) null);
    }

    public static final c b(f.b<?>... bVarArr) {
        C17542s.j(bVarArr, "pairs");
        c cVar = new c((Map) null, false, 1, (DefaultConstructorMarker) null);
        cVar.h((f.b[]) Arrays.copyOf(bVarArr, bVarArr.length));
        return cVar;
    }
}
