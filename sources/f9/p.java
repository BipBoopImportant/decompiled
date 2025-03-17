package F9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final /* synthetic */ class p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6470b f35586a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f35587b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f35588c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ boolean f35589d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f35590e;

    public /* synthetic */ p(C6470b bVar, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f35586a = bVar;
        this.f35587b = intent;
        this.f35588c = context;
        this.f35589d = z10;
        this.f35590e = pendingResult;
    }

    public final void run() {
        this.f35586a.d(this.f35587b, this.f35588c, this.f35589d, this.f35590e);
    }
}
