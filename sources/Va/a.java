package va;

import C9.c;
import K9.C6604c;
import K9.C6607e;
import K9.C6610h;
import K9.C6620s;
import K9.S;
import K9.U;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.d;
import ua.f;

public class a extends C6610h<g> implements f {

    /* renamed from: M  reason: collision with root package name */
    public static final /* synthetic */ int f56964M = 0;

    /* renamed from: I  reason: collision with root package name */
    private final boolean f56965I = true;

    /* renamed from: J  reason: collision with root package name */
    private final C6607e f56966J;

    /* renamed from: K  reason: collision with root package name */
    private final Bundle f56967K;

    /* renamed from: L  reason: collision with root package name */
    private final Integer f56968L;

    public a(Context context, Looper looper, boolean z10, C6607e eVar, Bundle bundle, g.a aVar, g.b bVar) {
        super(context, looper, 44, eVar, aVar, bVar);
        this.f56966J = eVar;
        this.f56967K = bundle;
        this.f56968L = eVar.i();
    }

    public static Bundle m0(C6607e eVar) {
        eVar.h();
        Integer i10 = eVar.i();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.a());
        if (i10 != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", i10.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final Bundle A() {
        if (!y().getPackageName().equals(this.f56966J.f())) {
            this.f56967K.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f56966J.f());
        }
        return this.f56967K;
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.signin.service.START";
    }

    public final boolean g() {
        return this.f56965I;
    }

    public final void h() {
        j(new C6604c.d());
    }

    public final int m() {
        return d.f48050a;
    }

    public final void p(f fVar) {
        C6620s.m(fVar, "Expecting a valid ISignInCallbacks");
        try {
            Account c10 = this.f56966J.c();
            ((g) D()).L3(new j(1, new S(c10, ((Integer) C6620s.l(this.f56968L)).intValue(), "<<default account>>".equals(c10.name) ? c.b(y()).c() : null)), fVar);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                fVar.v0(new l(1, new ConnectionResult(8, (PendingIntent) null), (U) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
