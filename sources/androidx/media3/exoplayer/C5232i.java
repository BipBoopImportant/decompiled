package androidx.media3.exoplayer;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Handler;
import androidx.media3.exoplayer.y0;
import java.util.concurrent.Executor;
import kb.C9967v;
import t3.C5950a;
import t3.N;
import z3.C6286i;
import z3.C6287j;
import z3.p;

/* renamed from: androidx.media3.exoplayer.i  reason: case insensitive filesystem */
final class C5232i implements y0 {

    /* renamed from: f  reason: collision with root package name */
    private static final RouteDiscoveryPreference f22763f = C6286i.a(C9967v.E(), false).build();

    /* renamed from: a  reason: collision with root package name */
    private final MediaRouter2 f22764a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaRouter2$RouteCallback f22765b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f22766c;

    /* renamed from: d  reason: collision with root package name */
    private MediaRouter2$ControllerCallback f22767d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f22768e;

    /* renamed from: androidx.media3.exoplayer.i$a */
    class a extends MediaRouter2$RouteCallback {
        a() {
        }
    }

    /* renamed from: androidx.media3.exoplayer.i$b */
    class b implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f22770a;

        b(Handler handler) {
            this.f22770a = handler;
        }

        public void execute(Runnable runnable) {
            N.W0(this.f22770a, runnable);
        }
    }

    /* renamed from: androidx.media3.exoplayer.i$c */
    class c extends MediaRouter2$ControllerCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ y0.a f22772a;

        c(y0.a aVar) {
            this.f22772a = aVar;
        }

        public void onControllerUpdated(MediaRouter2.RoutingController routingController) {
            boolean b10 = C5232i.this.b();
            if (C5232i.this.f22768e != b10) {
                boolean unused = C5232i.this.f22768e = b10;
                this.f22772a.a(b10);
            }
        }
    }

    static {
        C6287j.a();
    }

    public C5232i(Context context, Handler handler) {
        this.f22764a = MediaRouter2.getInstance(context);
        this.f22766c = new b(handler);
    }

    private static boolean f(MediaRoute2Info mediaRoute2Info, int i10, boolean z10) {
        int a10 = mediaRoute2Info.getSuitabilityStatus();
        return a10 == 1 ? (i10 == 1 || i10 == 2) && z10 : a10 == 0;
    }

    public void a(y0.a aVar) {
        this.f22764a.registerRouteCallback(this.f22766c, this.f22765b, f22763f);
        c cVar = new c(aVar);
        this.f22767d = cVar;
        this.f22764a.registerControllerCallback(this.f22766c, cVar);
        this.f22768e = b();
    }

    public boolean b() {
        C5950a.j(this.f22767d, "SuitableOutputChecker is not enabled");
        int a10 = this.f22764a.getSystemController().getRoutingSessionInfo().getTransferReason();
        boolean a11 = this.f22764a.getSystemController().wasTransferInitiatedBySelf();
        for (Object a12 : this.f22764a.getSystemController().getSelectedRoutes()) {
            if (f(p.a(a12), a10, a11)) {
                return true;
            }
        }
        return false;
    }

    public void c() {
        C5950a.j(this.f22767d, "SuitableOutputChecker is not enabled");
        this.f22764a.unregisterControllerCallback(this.f22767d);
        this.f22767d = null;
        this.f22764a.unregisterRouteCallback(this.f22765b);
    }
}
