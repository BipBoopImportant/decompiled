package Ie;

import Ae.e;
import Ae.f;
import XH.C16796C;
import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"LIe/b;", "LIe/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "componentValue", "", "e", "(Ljava/lang/String;)Ljava/util/Map;", "LXH/N;", "a", "()V", "d", "(Ljava/lang/String;)V", "b", "c", "LAe/e;", "addresspicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f61055a;

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f61055a = eVar;
    }

    private final Map<String, String> e(String str) {
        return X.f(C16796C.a("component", str));
    }

    public void a() {
        f.a.a(this.f61055a, "gplaces_create", (Map) null, 2, (Object) null);
    }

    public void b(String str) {
        C17542s.j(str, "componentValue");
        this.f61055a.track("gplaces_fetch_place", e(str));
    }

    public void c(String str) {
        C17542s.j(str, "componentValue");
        this.f61055a.track("gplaces_find_auto_complete_predictions", e(str));
    }

    public void d(String str) {
        C17542s.j(str, "componentValue");
        this.f61055a.track("gplaces_initialize", e(str));
    }
}
