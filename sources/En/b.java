package En;

import En.c;
import HJ.C15854t;
import XH.x;
import cp.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LEn/b;", "LEn/a;", "Lcp/e;", "uriParser", "<init>", "(Lcp/e;)V", "", "url", "LEn/c;", "a", "(Ljava/lang/String;)LEn/c;", "Lcp/e;", "getUriParser", "()Lcp/e;", "b", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f80738b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f80739c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f80740a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LEn/b$a;", "", "<init>", "()V", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "uriParser");
        this.f80740a = eVar;
    }

    public c a(String str) {
        Map<String, String> c10;
        if (str != null) {
            Map<String, String> map = null;
            if (C15854t.W(str, "https://www.ikea.com/ikeaapp/_placeholder", false, 2, (Object) null)) {
                Object a10 = this.f80740a.a(str);
                e.a aVar = (e.a) (x.g(a10) ? null : a10);
                d a11 = d.Companion.a((aVar == null || (c10 = aVar.c()) == null) ? null : c10.get("action"));
                if (x.g(a10)) {
                    a10 = null;
                }
                e.a aVar2 = (e.a) a10;
                if (aVar2 != null) {
                    map = aVar2.c();
                }
                return a11.m(map);
            }
        }
        return c.b.f80742a;
    }
}
