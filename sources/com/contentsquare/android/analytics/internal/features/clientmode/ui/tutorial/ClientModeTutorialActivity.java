package com.contentsquare.android.analytics.internal.features.clientmode.ui.tutorial;

import D8.c;
import E8.b;
import XH.C16814e;
import a9.C6786a4;
import a9.E4;
import a9.E5;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import b8.m;
import b8.n;
import b8.o;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.overlay.OverlayService;
import com.contentsquare.android.sdk.D;
import i8.C8218a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/contentsquare/android/analytics/internal/features/clientmode/ui/tutorial/ClientModeTutorialActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class ClientModeTutorialActivity extends AppCompatActivity {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f46673y = 0;

    /* renamed from: v  reason: collision with root package name */
    public E4 f46674v;

    /* renamed from: w  reason: collision with root package name */
    public E5 f46675w;

    /* renamed from: x  reason: collision with root package name */
    public final C6786a4 f46676x = new C6786a4();

    public static final void w(ClientModeTutorialActivity clientModeTutorialActivity, View view) {
        C17542s.j(clientModeTutorialActivity, "this$0");
        clientModeTutorialActivity.a();
    }

    public final void a() {
        E5 e52 = this.f46675w;
        E5 e53 = null;
        if (e52 == null) {
            C17542s.z("clientModeTutorialViewModel");
            e52 = null;
        }
        e52.f41986a.h(b.CLIENT_MODE_TUTORIAL, false);
        E4 e42 = this.f46674v;
        if (e42 == null) {
            C17542s.z("navigator");
            e42 = null;
        }
        if (e42.a()) {
            E5 e54 = this.f46675w;
            if (e54 == null) {
                C17542s.z("clientModeTutorialViewModel");
                e54 = null;
            }
            e54.f41986a.h(b.CLIENT_MODE_ACTIVATION_STATE, true);
            E5 e55 = this.f46675w;
            if (e55 != null) {
                e53 = e55;
            } else {
                C17542s.z("clientModeTutorialViewModel");
            }
            e53.f41986a.h(b.LOCAL_LOG_VISUALIZER_MODE, true);
            finish();
            return;
        }
        startActivityForResult(new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + getPackageName())), 2084);
    }

    @C16814e
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        C6786a4 a4Var = this.f46676x;
        Context applicationContext = getApplicationContext();
        C17542s.i(applicationContext, "applicationContext");
        if (!a4Var.a(applicationContext)) {
            int i12 = o.f45594a;
            C17542s.j(this, "context");
            Toast.makeText(this, i12, 0).show();
            E4 e42 = this.f46674v;
            if (e42 == null) {
                C17542s.z("navigator");
                e42 = null;
            }
            X8.b.j(e42.f41980a).l().a();
            e42.f41980a.stopService(new Intent(e42.f41980a, OverlayService.class));
            e42.f41985f = 2;
            finish();
            return;
        }
        a();
    }

    @C16814e
    public final void onBackPressed() {
        super.onBackPressed();
        a();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c cVar = D.f46936e;
        Application application = getApplication();
        C17542s.i(application, "application");
        E4 e42 = D.a.a(application).f46939b;
        C17542s.j(e42, "<set-?>");
        this.f46674v = e42;
        Application application2 = getApplication();
        C17542s.i(application2, "application");
        E5 e52 = new E5(application2);
        C17542s.j(e52, "<set-?>");
        this.f46675w = e52;
        setContentView(n.f45582a);
        findViewById(m.f45548S).setOnClickListener(new C8218a(this));
    }
}
