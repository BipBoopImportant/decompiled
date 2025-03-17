package Sp;

import Ae.e;
import Ae.r;
import Qp.b;
import Rp.g;
import Rp.i;
import android.content.Context;
import android.os.Build;
import androidx.activity.j;
import androidx.lifecycle.C5222z;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LSp/a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LQp/a;", "a", "(Landroid/content/Context;)LQp/a;", "detectScreenshotRepository", "", "LAe/r;", "routeToScreenMappers", "LAe/e;", "analytics", "LEe/a;", "analyticsEnabledUseCase", "LQp/b;", "b", "(LQp/a;Ljava/util/Set;LAe/e;LEe/a;)LQp/b;", "detectscreenshotrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87316a = new a();

    private a() {
    }

    public final Qp.a a(Context context) {
        C17542s.j(context, "context");
        j jVar = context instanceof j ? (j) context : null;
        if (jVar != null) {
            return Build.VERSION.SDK_INT >= 34 ? new g(jVar, jVar.getLifecycle(), C5222z.a(jVar)) : Rp.j.f86972a;
        }
        String f10 = P.b(context.getClass()).f();
        throw new IllegalArgumentException("Expected ComponentActivity, but was " + f10);
    }

    public final b b(Qp.a aVar, Set<r> set, e eVar, Ee.a aVar2) {
        C17542s.j(aVar, "detectScreenshotRepository");
        C17542s.j(set, "routeToScreenMappers");
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar2, "analyticsEnabledUseCase");
        return new i(aVar, set, eVar, aVar2);
    }
}
