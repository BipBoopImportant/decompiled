package Ec;

import android.content.Context;
import com.google.firebase.perf.session.SessionManager;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SessionManager f60181a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f60182b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a f60183c;

    public /* synthetic */ c(SessionManager sessionManager, Context context, a aVar) {
        this.f60181a = sessionManager;
        this.f60182b = context;
        this.f60183c = aVar;
    }

    public final void run() {
        this.f60181a.lambda$setApplicationContext$0(this.f60182b, this.f60183c);
    }
}
