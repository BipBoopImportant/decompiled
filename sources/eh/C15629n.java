package EH;

import JH.y;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LEH/n;", "LEH/l;", "LJH/y;", "", "", "", "values", "<init>", "(Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.n  reason: case insensitive filesystem */
public final class C15629n extends y implements C15627l {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15629n(Map<String, ? extends List<String>> map) {
        super(true, map);
        C17542s.j(map, "values");
    }

    public String toString() {
        return "Headers " + a();
    }
}
