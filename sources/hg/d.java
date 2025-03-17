package Hg;

import Ae.e;
import Us.a;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"LHg/d;", "LUs/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "Lx4/o;", "navController", "", "filter", "inspirationId", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "LAe/e;", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f60976a;

    public d(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f60976a = eVar;
    }

    public void a(C8951o oVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/inspire/feed?&filter={filter}&inspirationId={inspirationId}")).buildUpon();
        if (str != null) {
            buildUpon.appendQueryParameter("filter", str);
        }
        if (str2 != null) {
            buildUpon.appendQueryParameter("inspirationId", str2);
        }
        Uri build = buildUpon.build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }
}
