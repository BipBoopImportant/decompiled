package F9;

import android.util.Log;
import java.io.IOException;
import xa.C8972m;

/* renamed from: F9.g  reason: case insensitive filesystem */
public final /* synthetic */ class C6475g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C8972m f35575a;

    public /* synthetic */ C6475g(C8972m mVar) {
        this.f35575a = mVar;
    }

    public final void run() {
        if (this.f35575a.d(new IOException("TIMEOUT"))) {
            Log.w("Rpc", "No response");
        }
    }
}
