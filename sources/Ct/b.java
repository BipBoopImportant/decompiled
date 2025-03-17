package Ct;

import HJ.C15854t;
import XH.x;
import cp.e;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LCt/b;", "LCt/a;", "Lcp/e;", "uriParser", "<init>", "(Lcp/e;)V", "", "url", "LCt/g;", "a", "(Ljava/lang/String;)LCt/g;", "Lcp/e;", "getUriParser", "()Lcp/e;", "b", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f79707b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f79708c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f79709a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LCt/b$a;", "", "<init>", "()V", "", "REDIRECT_URL", "Ljava/lang/String;", "ACTION", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "uriParser");
        this.f79709a = eVar;
    }

    public g a(String str) {
        Map<String, String> c10;
        if (str == null) {
            return g.UNKNOWN;
        }
        g gVar = g.UNKNOWN;
        String str2 = null;
        if (!C15854t.W(str, "https://www.ikea.com/ikeaapp/food_mobile", false, 2, (Object) null)) {
            return gVar;
        }
        Object a10 = this.f79709a.a(str);
        if (x.g(a10)) {
            a10 = null;
        }
        e.a aVar = (e.a) a10;
        if (!(aVar == null || (c10 = aVar.c()) == null)) {
            str2 = c10.get("action");
        }
        return g.Companion.a(str2);
    }
}
