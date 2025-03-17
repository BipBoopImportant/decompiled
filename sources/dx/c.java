package dx;

import XH.C16807N;
import android.net.Uri;
import ax.d;
import cx.C14323a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C8951o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldx/c;", "Lax/d;", "Lcx/a;", "popularTimesAnalyticsImpl", "<init>", "(Lcx/a;)V", "Lx4/o;", "navController", "", "storeId", "source", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "Lcx/a;", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements d {

    /* renamed from: a  reason: collision with root package name */
    private final C14323a f126193a;

    public c(C14323a aVar) {
        C17542s.j(aVar, "popularTimesAnalyticsImpl");
        this.f126193a = aVar;
    }

    public void a(C8951o oVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "storeId");
        C17542s.j(str2, "source");
        Uri build = Uri.parse(ow.c.b("ikea://navigation/store/populartimes?storeId={storeId}")).buildUpon().appendQueryParameter("storeId", str).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
        C16807N n10 = C16807N.f139792a;
        this.f126193a.a(str, str2);
    }
}
