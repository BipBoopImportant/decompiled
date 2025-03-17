package com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay;

import D8.c;
import QJ.F0;
import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.view.View;
import android.view.WindowManager;
import com.contentsquare.android.sdk.C7114a0;
import com.contentsquare.android.sdk.C7161y;
import com.contentsquare.android.sdk.D;
import com.contentsquare.android.sdk.I;
import com.contentsquare.android.sdk.c1;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/contentsquare/android/analytics/internal/features/clientmode/ui/overlay/OverlayService;", "Landroid/app/Service;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class OverlayService extends Service {

    /* renamed from: a  reason: collision with root package name */
    public final c f46618a = new c("OverlayService");

    /* renamed from: b  reason: collision with root package name */
    public C7161y f46619b;

    /* renamed from: c  reason: collision with root package name */
    public a f46620c;

    public final void a() {
        c1 c1Var;
        c1 c1Var2;
        a aVar = this.f46620c;
        if (aVar == null) {
            C17542s.z("overlayLayoutManager");
            aVar = null;
        }
        if (aVar.a().getWindowToken() != null) {
            aVar.f46623c.removeView(aVar.a());
        }
        C7114a0 a0Var = aVar.f46629i;
        if (!(a0Var == null || (c1Var2 = a0Var.f47280d) == null)) {
            c1Var2.dismiss();
        }
        aVar.f46629i = null;
        I i10 = aVar.f46628h;
        if (!(i10 == null || (c1Var = i10.f47001c) == null)) {
            c1Var.dismiss();
        }
        aVar.f46628h = null;
        a aVar2 = this.f46620c;
        if (aVar2 == null) {
            C17542s.z("overlayLayoutManager");
            aVar2 = null;
        }
        aVar2.f46632l = null;
        F0 f02 = aVar2.f46633m;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
        }
        aVar2.f46633m = null;
        C7161y yVar = this.f46619b;
        if (yVar != null) {
            J0.i(yVar.f47727k, (CancellationException) null, 1, (Object) null);
        }
    }

    public final IBinder onBind(Intent intent) {
        C17542s.j(intent, "intent");
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        Object systemService = getApplication().getSystemService("window");
        if ((systemService instanceof WindowManager ? (WindowManager) systemService : null) == null) {
            stopSelf();
            return;
        }
        c cVar = D.f46936e;
        Application application = getApplication();
        C17542s.i(application, "this.application");
        this.f46619b = D.a.a(application).f46941d;
        Application application2 = getApplication();
        C17542s.i(application2, "application");
        a aVar = D.a.a(application2).f46938a;
        aVar.d();
        C17542s.j(aVar, "<set-?>");
        this.f46620c = aVar;
        View a10 = aVar.a();
        if (a10 != null) {
            a10.setVisibility(0);
        }
        aVar.f46632l = new d(this);
    }

    public final void onDestroy() {
        this.f46618a.l("OnDestroy : ClientModeService is being destroyed");
        a();
        super.onDestroy();
    }

    public final void onTaskRemoved(Intent intent) {
        C17542s.j(intent, "rootIntent");
        a();
        stopSelf();
        super.onTaskRemoved(intent);
    }
}
