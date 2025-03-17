package Z9;

import K9.C6607e;
import K9.C6610h;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g;
import z9.C9042f;
import z9.C9043g;

public final class f extends C6610h {

    /* renamed from: I  reason: collision with root package name */
    private final C9043g f41425I;

    public f(Context context, Looper looper, C6607e eVar, C9043g gVar, g.a aVar, g.b bVar) {
        super(context, looper, 68, eVar, aVar, bVar);
        C9042f fVar = new C9042f(gVar == null ? C9043g.f58571d : gVar);
        fVar.a(b.a());
        this.f41425I = new C9043g(fVar);
    }

    /* access modifiers changed from: protected */
    public final Bundle A() {
        return this.f41425I.a();
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final int m() {
        return 12800000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new g(iBinder);
    }
}
