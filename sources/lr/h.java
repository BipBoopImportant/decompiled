package lr;

import Hq.a;
import Hq.b;
import android.net.Uri;
import android.os.Bundle;
import com.ingka.ikea.familyrewards.implementation.fragment.RewardsDetailsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Llr/h;", "LHq/a;", "<init>", "()V", "Lx4/o;", "navController", "LXH/N;", "f", "(Lx4/o;)V", "", "rewardId", "requestKey", "b", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Bundle;", "bundle", "LHq/b;", "d", "(Landroid/os/Bundle;)LHq/b;", "", "showGreeting", "a", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Z)V", "e", "c", "familyrewards-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements a {
    public void a(C8951o oVar, String str, String str2, boolean z10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "rewardId");
        C17542s.j(str2, "requestKey");
        Uri build = Uri.parse(c.b("ikea://navigation/familyRewards/claim?rewardId={rewardId}&requestKey={requestKey}")).buildUpon().appendQueryParameter("rewardId", str).appendQueryParameter("requestKey", str2).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void b(C8951o oVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "rewardId");
        C17542s.j(str2, "requestKey");
        Uri build = Uri.parse(c.b("ikea://navigation/familyRewards/details?rewardId={rewardId}&requestKey={requestKey}")).buildUpon().appendQueryParameter("rewardId", str).appendQueryParameter("requestKey", str2).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void c(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri build = Uri.parse(c.b("ikea://navigation/familyRewards/rewards?show_collect_points={show_collect_points}")).buildUpon().appendQueryParameter("show_collect_points", "true").build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public b d(Bundle bundle) {
        C17542s.j(bundle, "bundle");
        return RewardsDetailsFragment.f95917Y.a(bundle);
    }

    public void e(C8951o oVar) {
        C17542s.j(oVar, "navController");
        oVar.X(Uri.parse(c.b("ikea://navigation/familyRewards/history")));
    }

    public void f(C8951o oVar) {
        C17542s.j(oVar, "navController");
        oVar.Y(Uri.parse("ikea://navigation/familyRewards/rewards?show_collect_points={show_collect_points}"), rw.c.f28698a.c().a());
    }
}
