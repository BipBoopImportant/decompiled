package C9;

import K9.C6607e;
import K9.C6610h;
import Z9.b;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.d;

public final class i extends C6610h {

    /* renamed from: I  reason: collision with root package name */
    private final GoogleSignInOptions f33787I;

    public i(Context context, Looper looper, C6607e eVar, GoogleSignInOptions googleSignInOptions, g.a aVar, g.b bVar) {
        super(context, looper, 91, eVar, aVar, bVar);
        GoogleSignInOptions.a aVar2 = googleSignInOptions != null ? new GoogleSignInOptions.a(googleSignInOptions) : new GoogleSignInOptions.a();
        aVar2.e(b.a());
        if (!eVar.d().isEmpty()) {
            for (Scope d10 : eVar.d()) {
                aVar2.d(d10, new Scope[0]);
            }
        }
        this.f33787I = aVar2.a();
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    public final int m() {
        return d.f48050a;
    }

    public final GoogleSignInOptions m0() {
        return this.f33787I;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof u ? (u) queryLocalInterface : new u(iBinder);
    }
}
