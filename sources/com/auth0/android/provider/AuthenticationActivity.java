package com.auth0.android.provider;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.auth0.android.request.internal.e;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import hb.l;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t7.C8837b;
import u7.C8885b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u0000  2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0017\u0010\u0003J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u0011¢\u0006\u0004\b \u0010\tJ\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0010¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&R\u0018\u0010)\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010(¨\u0006*"}, d2 = {"Lcom/auth0/android/provider/AuthenticationActivity;", "Landroid/app/Activity;", "<init>", "()V", "LXH/N;", "d", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/os/Bundle;", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "savedInstanceState", "onCreate", "onResume", "onDestroy", "Landroid/content/Context;", "context", "Lcom/auth0/android/provider/i;", "options", "Lcom/auth0/android/provider/h;", "a", "(Landroid/content/Context;Lcom/auth0/android/provider/i;)Lcom/auth0/android/provider/h;", "result", "c", "Lt7/b;", "ex", "b", "(Lt7/b;)V", "", "Z", "intentLaunched", "Lcom/auth0/android/provider/h;", "customTabsController", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AuthenticationActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    public static final a f46313c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private boolean f46314a;

    /* renamed from: b  reason: collision with root package name */
    private h f46315b;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/auth0/android/provider/AuthenticationActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "authorizeUri", "", "launchAsTwa", "Lcom/auth0/android/provider/i;", "options", "LXH/N;", "a", "(Landroid/content/Context;Landroid/net/Uri;ZLcom/auth0/android/provider/i;)V", "", "EXTRA_AUTHORIZE_URI", "Ljava/lang/String;", "EXTRA_CT_OPTIONS", "EXTRA_INTENT_LAUNCHED", "EXTRA_LAUNCH_AS_TWA", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, Uri uri, boolean z10, i iVar) {
            C17542s.j(context, "context");
            C17542s.j(uri, "authorizeUri");
            C17542s.j(iVar, "options");
            Intent intent = new Intent(context, AuthenticationActivity.class);
            intent.putExtra("com.auth0.android.EXTRA_AUTHORIZE_URI", uri);
            intent.putExtra("com.auth0.android.EXTRA_LAUNCH_AS_TWA", z10);
            intent.putExtra("com.auth0.android.EXTRA_CT_OPTIONS", iVar);
            intent.addFlags(67108864);
            context.startActivity(intent);
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"com/auth0/android/provider/AuthenticationActivity$b", "Lu7/b;", "Lt7/b;", "error", "LXH/N;", "a", "(Lt7/b;)V", "auth0_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements C8885b<C8837b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AuthenticationActivity f46316a;

        b(AuthenticationActivity authenticationActivity) {
            this.f46316a = authenticationActivity;
        }

        /* renamed from: a */
        public void apply(C8837b bVar) {
            C17542s.j(bVar, UiComponentContainer.RESULT_ERROR);
            this.f46316a.b(bVar);
        }
    }

    private final void d() {
        Bundle extras = getIntent().getExtras();
        C17542s.g(extras);
        Uri uri = (Uri) extras.getParcelable("com.auth0.android.EXTRA_AUTHORIZE_URI");
        Parcelable parcelable = extras.getParcelable("com.auth0.android.EXTRA_CT_OPTIONS");
        C17542s.g(parcelable);
        boolean z10 = extras.getBoolean("com.auth0.android.EXTRA_LAUNCH_AS_TWA", false);
        h a10 = a(this, (i) parcelable);
        this.f46315b = a10;
        C17542s.g(a10);
        a10.e();
        h hVar = this.f46315b;
        C17542s.g(hVar);
        C17542s.g(uri);
        hVar.i(uri, z10, e.f46448c.a(), new b(this));
    }

    public h a(Context context, i iVar) {
        C17542s.j(context, "context");
        C17542s.j(iVar, "options");
        return new h(context, iVar, new l(context));
    }

    public void b(C8837b bVar) {
        C17542s.j(bVar, "ex");
        p.f46388a.b(bVar);
        finish();
    }

    public void c(Intent intent) {
        p.e(intent);
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i11 == 0) {
            intent = new Intent();
        }
        c(intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f46314a = bundle.getBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", false);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        h hVar = this.f46315b;
        if (hVar != null) {
            C17542s.g(hVar);
            hVar.j();
            this.f46315b = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (!this.f46314a && intent.getExtras() == null) {
            finish();
        } else if (!this.f46314a) {
            this.f46314a = true;
            d();
        } else {
            if (intent.getData() == null) {
                setResult(0);
            }
            c(intent);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        C17542s.j(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.auth0.android.EXTRA_INTENT_LAUNCHED", this.f46314a);
    }
}
