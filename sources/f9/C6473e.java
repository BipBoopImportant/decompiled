package F9;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import xa.C8962c;
import xa.C8971l;

/* renamed from: F9.e  reason: case insensitive filesystem */
public final /* synthetic */ class C6473e implements C8962c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C6473e f35573a = new C6473e();

    private /* synthetic */ C6473e() {
    }

    public final Object then(C8971l lVar) {
        if (lVar.q()) {
            return (Bundle) lVar.m();
        }
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Error making request: ".concat(String.valueOf(lVar.l())));
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", lVar.l());
    }
}
