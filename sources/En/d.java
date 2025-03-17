package En;

import En.c;
import fI.C17220a;
import fI.C17221b;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0013\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\t\u001a\u00020\b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LEn/d;", "", "", "action", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "", "queries", "LEn/c;", "m", "(Ljava/util/Map;)LEn/c;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Companion", "a", "EXPLORE", "UNKNOWN", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum d {
    ;
    
    public static final a Companion = null;
    private final String action;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LEn/d$a;", "", "<init>", "()V", "", "action", "LEn/d;", "a", "(Ljava/lang/String;)LEn/d;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(String str) {
            T t10;
            Iterator<T> it = d.j().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C17542s.e(((d) t10).b(), str)) {
                    break;
                }
            }
            d dVar = (d) t10;
            return dVar == null ? d.UNKNOWN : dVar;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/ingka/ikea/browseandsearch/plp/impl/usecase/webview/RedirectAction.EXPLORE", "LEn/d;", "", "", "queries", "LEn/c$a;", "n", "(Ljava/util/Map;)LEn/c$a;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class b extends d {
        b(String str, int i10) {
            super(str, i10, "explore", (DefaultConstructorMarker) null);
        }

        /* renamed from: n */
        public c.a m(Map<String, String> map) {
            return new c.a("placeholder");
        }
    }

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/ingka/ikea/browseandsearch/plp/impl/usecase/webview/RedirectAction.UNKNOWN", "LEn/d;", "", "", "queries", "LEn/c$b;", "n", "(Ljava/util/Map;)LEn/c$b;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class c extends d {
        c(String str, int i10) {
            super(str, i10, (String) null, (DefaultConstructorMarker) null);
        }

        /* renamed from: n */
        public c.b m(Map<String, String> map) {
            return c.b.f80742a;
        }
    }

    static {
        d[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    public static C17220a<d> j() {
        return $ENTRIES;
    }

    public final String b() {
        return this.action;
    }

    public abstract c m(Map<String, String> map);

    private d(String str) {
        this.action = str;
    }
}
