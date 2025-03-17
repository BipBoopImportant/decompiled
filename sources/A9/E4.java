package a9;

import E8.c;
import G8.g;
import X8.b;
import android.app.Application;
import android.content.Intent;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayService;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.a;
import kotlin.jvm.internal.C17542s;

public final class E4 {

    /* renamed from: a  reason: collision with root package name */
    public final Application f41980a;

    /* renamed from: b  reason: collision with root package name */
    public final a f41981b;

    /* renamed from: c  reason: collision with root package name */
    public final c f41982c;

    /* renamed from: d  reason: collision with root package name */
    public final C6786a4 f41983d;

    /* renamed from: e  reason: collision with root package name */
    public final D8.c f41984e = new D8.c("ClientModeNavigator");

    /* renamed from: f  reason: collision with root package name */
    public int f41985f;

    public E4(Application application, a aVar, c cVar, C6786a4 a4Var) {
        C17542s.j(application, "applicationContext");
        C17542s.j(aVar, "overlayLayoutManager");
        C17542s.j(cVar, "preferencesStore");
        C17542s.j(a4Var, "drawOverlaysChecker");
        this.f41980a = application;
        this.f41981b = aVar;
        this.f41982c = cVar;
        this.f41983d = a4Var;
    }

    public final boolean a() {
        if (this.f41983d.a(this.f41980a)) {
            this.f41984e.j("Client mode enabled");
            b.j(this.f41980a).l().a();
            g.m(this.f41980a, new Intent(this.f41980a, OverlayService.class));
            this.f41985f = 1;
            return true;
        }
        this.f41984e.f("Cannot enable cs-in-app, permission not granted.");
        return false;
    }
}
