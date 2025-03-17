package Xd;

import Ae.e;
import Ae.h;
import XH.C16796C;
import YH.X;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00022\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LXd/a;", "LAe/h;", "LXd/b;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "event", "", "", "", "values", "LXH/N;", "f", "(LXd/b;Ljava/util/Map;)V", "reasonCode", "g", "(LXd/b;Ljava/lang/String;)V", "a", "LAe/e;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements h<b> {

    /* renamed from: a  reason: collision with root package name */
    private final e f64798a;

    public a(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f64798a = eVar;
    }

    /* renamed from: f */
    public void b(b bVar, Map<String, ? extends Object> map) {
        C17542s.j(bVar, "event");
        this.f64798a.track(bVar.b(), map);
    }

    public void g(b bVar, String str) {
        C17542s.j(bVar, "event");
        C17542s.j(str, "reasonCode");
        this.f64798a.track(bVar.b(), X.f(C16796C.a("reason_code", str)));
    }
}
