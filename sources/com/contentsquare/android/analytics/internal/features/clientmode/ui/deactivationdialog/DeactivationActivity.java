package com.contentsquare.android.analytics.internal.features.clientmode.ui.deactivationdialog;

import E8.b;
import E8.c;
import a9.E4;
import a9.G2;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import b8.m;
import b8.n;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayService;
import com.contentsquare.android.sdk.D;
import d8.C7751a;
import d8.C7752b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/contentsquare/android/analytics/internal/features/clientmode/ui/deactivationdialog/DeactivationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class DeactivationActivity extends AppCompatActivity {

    /* renamed from: v  reason: collision with root package name */
    public E4 f46612v;

    /* renamed from: w  reason: collision with root package name */
    public G2 f46613w;

    public static final void w(DeactivationActivity deactivationActivity, View view) {
        C17542s.j(deactivationActivity, "this$0");
        G2 g22 = deactivationActivity.f46613w;
        E4 e42 = null;
        if (g22 == null) {
            C17542s.z("deactivationViewModel");
            g22 = null;
        }
        c cVar = g22.f42020a;
        cVar.h(b.CLIENT_MODE_ACTIVATION_STATE, false);
        cVar.h(b.LOCAL_LOG_VISUALIZER_MODE, false);
        cVar.h(b.DEVELOPER_MODE_ACTIVATION_STATE, false);
        cVar.h(b.LOCAL_SESSION_REPLAY_MODE, false);
        cVar.h(b.VERBOSE_LOG, false);
        cVar.j(b.CLIENT_MODE_LONG_SNAPSHOT_SCROLL_DELAY_MILLISECONDS, 0);
        cVar.h(b.CLIENT_MODE_SCREENGRAPH_OPTIMIZATION_MODE, false);
        cVar.h(b.DEVELOPER_OVERRIDE_FEATURE_FLAGS_ENABLED, false);
        E4 e43 = deactivationActivity.f46612v;
        if (e43 != null) {
            e42 = e43;
        } else {
            C17542s.z("navigator");
        }
        X8.b.j(e42.f41980a).l().a();
        e42.f41980a.stopService(new Intent(e42.f41980a, OverlayService.class));
        e42.f41985f = 2;
        deactivationActivity.finish();
    }

    public static final void x(DeactivationActivity deactivationActivity, View view) {
        C17542s.j(deactivationActivity, "this$0");
        deactivationActivity.finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Application application = getApplication();
        C17542s.i(application, "application");
        G2 g22 = new G2(application);
        C17542s.j(g22, "<set-?>");
        this.f46613w = g22;
        D8.c cVar = D.f46936e;
        Application application2 = getApplication();
        C17542s.i(application2, "application");
        E4 e42 = D.a.a(application2).f46939b;
        C17542s.j(e42, "<set-?>");
        this.f46612v = e42;
        setContentView(n.f45583b);
        findViewById(m.f45542M).setOnClickListener(new C7751a(this));
        findViewById(m.f45541L).setOnClickListener(new C7752b(this));
        setFinishOnTouchOutside(false);
    }
}
