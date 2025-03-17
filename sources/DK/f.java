package Dk;

import Cw.C12727a;
import To.a;
import XD.C13804b;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ!\u0010\u0010\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ!\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\u0012\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"LDk/f;", "LCw/a;", "LTo/a;", "dataConsentNavigation", "LXD/b;", "welcomeNavigation", "<init>", "(LTo/a;LXD/b;)V", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "b", "(Lx4/o;Lx4/C;)V", "e", "d", "c", "a", "LTo/a;", "LXD/b;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements C12727a {

    /* renamed from: a  reason: collision with root package name */
    private final a f79782a;

    /* renamed from: b  reason: collision with root package name */
    private final C13804b f79783b;

    public f(a aVar, C13804b bVar) {
        C17542s.j(aVar, "dataConsentNavigation");
        C17542s.j(bVar, "welcomeNavigation");
        this.f79782a = aVar;
        this.f79783b = bVar;
    }

    public void a(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        this.f79783b.a(oVar, c10);
    }

    public void b(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        this.f79782a.b(oVar, c10);
    }

    public void c(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        oVar.Y(Uri.parse("ikea://navigation/onboarding/enablePush"), c10);
    }

    public void d(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        this.f79783b.b(oVar, c10);
    }

    public void e(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        oVar.Y(Uri.parse("ikea://navigation/onboarding/features"), c10);
    }
}
