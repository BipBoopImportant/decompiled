package cx;

import Ae.e;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcx/b;", "Lcx/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "storeId", "location", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "b", "(Ljava/lang/String;)V", "LAe/e;", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cx.b  reason: case insensitive filesystem */
public final class C14324b implements C14323a {

    /* renamed from: a  reason: collision with root package name */
    private final e f126153a;

    public C14324b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f126153a = eVar;
    }

    public void a(String str, String str2) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "location");
        e.c.b(this.f126153a, Interaction$Component.POPULAR_TIMES_PLAN_YOUR_VISIT, (String) null, X.m(C16796C.a("store_id", str), C16796C.a("component_value", str2)), (e.b) null, 10, (Object) null);
    }

    public void b(String str) {
        C17542s.j(str, "storeId");
        e.c.b(this.f126153a, Interaction$Component.POPULAR_TIMES_CHANGE_DAY_IN_CHART, (String) null, X.f(C16796C.a("store_id", str)), (e.b) null, 10, (Object) null);
    }
}
