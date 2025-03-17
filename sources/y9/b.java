package Y9;

import H9.C6530d;
import H9.C6539m;
import K9.C6607e;
import K9.C6610h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.d;
import z9.C9038b;
import z9.C9039c;

public final class b extends C6610h {

    /* renamed from: I  reason: collision with root package name */
    private final Bundle f41045I;

    public b(Context context, Looper looper, C6607e eVar, C9039c cVar, C6530d dVar, C6539m mVar) {
        super(context, looper, 16, eVar, dVar, mVar);
        this.f41045I = cVar == null ? new Bundle() : cVar.a();
    }

    /* access modifiers changed from: protected */
    public final Bundle A() {
        return this.f41045I;
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.auth.service.START";
    }

    public final boolean S() {
        return true;
    }

    public final boolean g() {
        C6607e j02 = j0();
        return !TextUtils.isEmpty(j02.b()) && !j02.e(C9038b.f58563a).isEmpty();
    }

    public final int m() {
        return d.f48050a;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof c ? (c) queryLocalInterface : new c(iBinder);
    }
}
