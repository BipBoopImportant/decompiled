package P9;

import G9.C6521b;
import H9.C6530d;
import H9.C6539m;
import K9.C6607e;
import K9.C6610h;
import aa.k;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

public final class w extends C6610h {
    protected w(Context context, Looper looper, C6607e eVar, C6530d dVar, C6539m mVar) {
        super(context, looper, 308, eVar, dVar, mVar);
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    /* access modifiers changed from: protected */
    public final boolean I() {
        return true;
    }

    public final boolean S() {
        return true;
    }

    public final int m() {
        return 17895000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new i(iBinder);
    }

    public final C6521b[] v() {
        return k.f43000b;
    }
}
