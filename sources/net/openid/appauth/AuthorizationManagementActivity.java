package net.openid.appauth;

import AK.C15445b;
import AK.C15446c;
import DK.C15581a;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import net.openid.appauth.d;
import org.json.JSONException;

public class AuthorizationManagementActivity extends AppCompatActivity {

    /* renamed from: v  reason: collision with root package name */
    private boolean f144973v = false;

    /* renamed from: w  reason: collision with root package name */
    private Intent f144974w;

    /* renamed from: x  reason: collision with root package name */
    private C15445b f144975x;

    /* renamed from: y  reason: collision with root package name */
    private PendingIntent f144976y;

    /* renamed from: z  reason: collision with root package name */
    private PendingIntent f144977z;

    private Intent A(Uri uri) {
        if (uri.getQueryParameterNames().contains(UiComponentContainer.RESULT_ERROR)) {
            return d.j(uri).n();
        }
        C15446c d10 = e.d(this.f144975x, uri);
        if ((this.f144975x.getState() != null || d10.a() == null) && (this.f144975x.getState() == null || this.f144975x.getState().equals(d10.a()))) {
            return d10.d();
        }
        C15581a.g("State returned in authorization response (%s) does not match state from request (%s) - discarding response", d10.a(), this.f144975x.getState());
        return d.a.f144999j.n();
    }

    private void B(Bundle bundle) {
        if (bundle == null) {
            C15581a.g("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f144974w = (Intent) bundle.getParcelable("authIntent");
        this.f144973v = bundle.getBoolean("authStarted", false);
        this.f144976y = (PendingIntent) bundle.getParcelable("completeIntent");
        this.f144977z = (PendingIntent) bundle.getParcelable("cancelIntent");
        C15445b bVar = null;
        try {
            String string = bundle.getString("authRequest", (String) null);
            String string2 = bundle.getString("authRequestType", (String) null);
            if (string != null) {
                bVar = e.b(string, string2);
            }
            this.f144975x = bVar;
        } catch (JSONException unused) {
            t0(this.f144977z, d.a.f144990a.n(), 0);
        }
    }

    private void q0() {
        C15581a.a("Authorization flow canceled by user", new Object[0]);
        t0(this.f144977z, d.l(d.b.f145002b, (Throwable) null).n(), 0);
    }

    private void r0() {
        Uri data = getIntent().getData();
        Intent A10 = A(data);
        if (A10 == null) {
            C15581a.c("Failed to extract OAuth2 response from redirect", new Object[0]);
            return;
        }
        A10.setData(data);
        t0(this.f144976y, A10, -1);
    }

    private void s0() {
        C15581a.a("Authorization flow canceled due to missing browser", new Object[0]);
        t0(this.f144977z, d.l(d.b.f145003c, (Throwable) null).n(), 0);
    }

    private void t0(PendingIntent pendingIntent, Intent intent, int i10) {
        if (pendingIntent != null) {
            try {
                pendingIntent.send(this, 0, intent);
            } catch (PendingIntent.CanceledException e10) {
                C15581a.c("Failed to send cancel intent", e10);
            }
        } else {
            setResult(i10, intent);
        }
    }

    private static Intent w(Context context) {
        return new Intent(context, AuthorizationManagementActivity.class);
    }

    public static Intent x(Context context, Uri uri) {
        Intent w10 = w(context);
        w10.setData(uri);
        w10.addFlags(603979776);
        return w10;
    }

    public static Intent y(Context context, C15445b bVar, Intent intent) {
        return z(context, bVar, intent, (PendingIntent) null, (PendingIntent) null);
    }

    public static Intent z(Context context, C15445b bVar, Intent intent, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Intent w10 = w(context);
        w10.putExtra("authIntent", intent);
        w10.putExtra("authRequest", bVar.b());
        w10.putExtra("authRequestType", e.c(bVar));
        w10.putExtra("completeIntent", pendingIntent);
        w10.putExtra("cancelIntent", pendingIntent2);
        return w10;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            B(getIntent().getExtras());
        } else {
            B(bundle);
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
        if (!this.f144973v) {
            try {
                startActivity(this.f144974w);
                this.f144973v = true;
            } catch (ActivityNotFoundException unused) {
                s0();
                finish();
            }
        } else {
            if (getIntent().getData() != null) {
                r0();
            } else {
                q0();
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("authStarted", this.f144973v);
        bundle.putParcelable("authIntent", this.f144974w);
        bundle.putString("authRequest", this.f144975x.b());
        bundle.putString("authRequestType", e.c(this.f144975x));
        bundle.putParcelable("completeIntent", this.f144976y);
        bundle.putParcelable("cancelIntent", this.f144977z);
    }
}
