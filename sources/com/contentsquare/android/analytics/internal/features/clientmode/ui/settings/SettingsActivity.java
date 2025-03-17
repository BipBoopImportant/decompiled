package com.contentsquare.android.analytics.internal.features.clientmode.ui.settings;

import D8.c;
import E8.b;
import XH.C16814e;
import a9.E4;
import a9.J1;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import b8.m;
import b8.n;
import b8.o;
import com.contentsquare.android.analytics.internal.features.clientmode.ui.developer.DeveloperActivationActivity;
import com.contentsquare.android.sdk.C7130i0;
import com.contentsquare.android.sdk.D;
import com.contentsquare.android.sdk.V5;
import g.C5312a;
import g.C5314c;
import g8.C7894a;
import g8.C7895b;
import g8.C7896c;
import h.C5406d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/contentsquare/android/analytics/internal/features/clientmode/ui/settings/SettingsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroidx/fragment/app/FragmentManager$p;", "<init>", "()V", "library_release"}, k = 1, mv = {1, 8, 0})
public final class SettingsActivity extends AppCompatActivity implements FragmentManager.p {

    /* renamed from: B  reason: collision with root package name */
    public static final /* synthetic */ int f46658B = 0;

    /* renamed from: A  reason: collision with root package name */
    public final C5314c<Intent> f46659A;

    /* renamed from: v  reason: collision with root package name */
    public int f46660v;

    /* renamed from: w  reason: collision with root package name */
    public final J1 f46661w = new J1();

    /* renamed from: x  reason: collision with root package name */
    public E4 f46662x;

    /* renamed from: y  reason: collision with root package name */
    public C7130i0 f46663y;

    /* renamed from: z  reason: collision with root package name */
    public ScrollView f46664z;

    public SettingsActivity() {
        C5314c<Intent> registerForActivityResult = registerForActivityResult(new C5406d(), new C7896c(this));
        C17542s.i(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f46659A = registerForActivityResult;
    }

    public static final void x(SettingsActivity settingsActivity, View view) {
        C17542s.j(settingsActivity, "this$0");
        settingsActivity.onBackPressed();
    }

    public static final void y(SettingsActivity settingsActivity, C5312a aVar) {
        C17542s.j(settingsActivity, "this$0");
        C17542s.j(aVar, "result");
        if (aVar.b() == -1) {
            settingsActivity.recreate();
        }
    }

    public static final void z(SettingsActivity settingsActivity, View view) {
        C17542s.j(settingsActivity, "this$0");
        settingsActivity.f46660v++;
        C7130i0 i0Var = settingsActivity.f46663y;
        if (i0Var == null) {
            C17542s.z("settingsViewModel");
            i0Var = null;
        }
        if (!i0Var.f47431a.b(b.DEVELOPER_MODE_ACTIVATION_STATE, false) && settingsActivity.f46660v == 10) {
            settingsActivity.f46659A.a(new Intent(settingsActivity, DeveloperActivationActivity.class));
        }
    }

    public final void a() {
        String string = getResources().getString(o.f45601h, new Object[]{"4.36.0"});
        C17542s.i(string, "resources.getString(R.st…BuildConfig.VERSION_NAME)");
        ((TextView) findViewById(m.f45564i)).setText(string);
        ((RelativeLayout) findViewById(m.f45551V)).setOnClickListener(new C7895b(this));
    }

    public final void n0() {
        ScrollView scrollView = this.f46664z;
        if (scrollView == null) {
            C17542s.z("scrollView");
            scrollView = null;
        }
        scrollView.scrollTo(0, 0);
    }

    @C16814e
    public final void onBackPressed() {
        if (getSupportFragmentManager().z0() > 0) {
            getSupportFragmentManager().s1();
            return;
        }
        super.onBackPressed();
        E4 e42 = this.f46662x;
        if (e42 == null) {
            C17542s.z("navigator");
            e42 = null;
        }
        View a10 = e42.f41981b.a();
        if (a10 != null) {
            a10.setVisibility(0);
        }
        e42.f41985f = 1;
    }

    public final void onCreate(Bundle bundle) {
        J1 j12 = this.f46661w;
        Application application = getApplication();
        C17542s.i(application, "application");
        j12.getClass();
        C17542s.j(application, "application");
        C7130i0 i0Var = new C7130i0(application);
        C17542s.j(i0Var, "<set-?>");
        this.f46663y = i0Var;
        c cVar = D.f46936e;
        Application application2 = getApplication();
        C17542s.i(application2, "application");
        E4 e42 = D.a.a(application2).f46939b;
        C17542s.j(e42, "<set-?>");
        this.f46662x = e42;
        super.onCreate(bundle);
        setContentView(n.f45590i);
        View findViewById = findViewById(m.f45552W);
        C17542s.i(findViewById, "findViewById(R.id.settings_scrollview)");
        this.f46664z = (ScrollView) findViewById;
        Toolbar toolbar = (Toolbar) findViewById(m.f45553X);
        setSupportActionBar(toolbar);
        if (bundle == null) {
            getSupportFragmentManager().s().s(m.f45559d, new V5()).l();
        }
        getSupportFragmentManager().n(this);
        C17542s.i(toolbar, "settingsToolbar");
        w(toolbar);
        a();
    }

    public final void onResume() {
        super.onResume();
        this.f46660v = 0;
        E4 e42 = this.f46662x;
        C7130i0 i0Var = null;
        if (e42 == null) {
            C17542s.z("navigator");
            e42 = null;
        }
        View a10 = e42.f41981b.a();
        if (a10 != null) {
            a10.setVisibility(8);
        }
        e42.f41985f = 2;
        C7130i0 i0Var2 = this.f46663y;
        if (i0Var2 != null) {
            i0Var = i0Var2;
        } else {
            C17542s.z("settingsViewModel");
        }
        if (!i0Var.f47431a.b(b.CLIENT_MODE_ACTIVATION_STATE, false)) {
            finish();
        }
    }

    public final void w(Toolbar toolbar) {
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.t(true);
        }
        a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.u(true);
        }
        toolbar.setNavigationOnClickListener(new C7894a(this));
    }
}
