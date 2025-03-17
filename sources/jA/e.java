package ja;

import K9.C6607e;
import K9.C6610h;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g;

public final class e extends C6610h<b> {
    public e(Context context, Looper looper, C6607e eVar, g.a aVar, g.b bVar) {
        super(context, looper, 51, eVar, aVar, bVar);
    }

    /* access modifiers changed from: protected */
    public final String E() {
        return "com.google.android.gms.phenotype.internal.IPhenotypeService";
    }

    /* access modifiers changed from: protected */
    public final String F() {
        return "com.google.android.gms.phenotype.service.START";
    }

    public final int m() {
        return 11925000;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ IInterface s(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.phenotype.internal.IPhenotypeService");
        return queryLocalInterface instanceof b ? (b) queryLocalInterface : new c(iBinder);
    }
}
