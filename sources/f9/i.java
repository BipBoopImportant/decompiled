package F9;

import android.os.Looper;
import android.os.Message;
import ba.C7089f;

final class i extends C7089f {

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ C6471c f35579b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    i(C6471c cVar, Looper looper) {
        super(looper);
        this.f35579b = cVar;
    }

    public final void handleMessage(Message message) {
        C6471c.g(this.f35579b, message);
    }
}
