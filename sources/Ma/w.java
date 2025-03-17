package ma;

import Ba.C6381e;
import Ba.C6385i;
import Ba.C6386j;
import Ba.M;
import G9.C6521b;
import K9.C6607e;
import K9.C6610h;
import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import xa.C8972m;

public final class w extends C6610h {

    /* renamed from: I  reason: collision with root package name */
    private final Context f55066I;

    /* renamed from: J  reason: collision with root package name */
    private final int f55067J;

    /* renamed from: K  reason: collision with root package name */
    private final String f55068K;

    /* renamed from: L  reason: collision with root package name */
    private final int f55069L;

    /* renamed from: M  reason: collision with root package name */
    private final boolean f55070M;

    public w(Context context, Looper looper, C6607e eVar, g.a aVar, g.b bVar, int i10, int i11, boolean z10) {
        super(context, looper, 4, eVar, aVar, bVar);
        this.f55066I = context;
        this.f55067J = i10;
        Account a10 = eVar.a();
        this.f55068K = a10 != null ? a10.name : null;
        this.f55069L = i11;
        this.f55070M = z10;
    }

    private final Bundle o0() {
        String packageName = this.f55066I.getPackageName();
        Bundle bundle = new Bundle();
        bundle.putInt("com.google.android.gms.wallet.EXTRA_ENVIRONMENT", this.f55067J);
        bundle.putBoolean("com.google.android.gms.wallet.EXTRA_USING_ANDROID_PAY_BRAND", this.f55070M);
        bundle.putString("androidPackageName", packageName);
        String str = this.f55068K;
        if (!TextUtils.isEmpty(str)) {
            bundle.putParcelable("com.google.android.gms.wallet.EXTRA_BUYER_ACCOUNT", new Account(str, "com.google"));
        }
        bundle.putInt("com.google.android.gms.wallet.EXTRA_THEME", this.f55069L);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.wallet.internal.IOwService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.wallet.service.BIND";
    }

    public final boolean O() {
        return true;
    }

    public final boolean S() {
        return true;
    }

    public final int m() {
        return 12600000;
    }

    public final void m0(C6381e eVar, C8972m mVar) {
        u uVar = new u(mVar);
        try {
            ((p) D()).L3(eVar, o0(), uVar);
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e10);
            uVar.Q1(Status.f47985h, false, Bundle.EMPTY);
        }
    }

    public final void n0(C6386j jVar, C8972m mVar) {
        Bundle o02 = o0();
        o02.putBoolean("com.google.android.gms.wallet.EXTRA_USING_AUTO_RESOLVABLE_RESULT", true);
        v vVar = new v(mVar);
        try {
            ((p) D()).M3(jVar, o02, vVar);
        } catch (RemoteException e10) {
            Log.e("WalletClientImpl", "RemoteException getting payment data", e10);
            vVar.A0(Status.f47985h, (C6385i) null, Bundle.EMPTY);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wallet.internal.IOwService");
        return queryLocalInterface instanceof p ? (p) queryLocalInterface : new p(iBinder);
    }

    public final C6521b[] v() {
        return M.f33291i;
    }
}
