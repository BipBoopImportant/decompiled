package eb;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import xa.C8972m;

final class g extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C8972m f72572a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    g(h hVar, Handler handler, C8972m mVar) {
        super(handler);
        this.f72572a = mVar;
    }

    public final void onReceiveResult(int i10, Bundle bundle) {
        this.f72572a.e(null);
    }
}
