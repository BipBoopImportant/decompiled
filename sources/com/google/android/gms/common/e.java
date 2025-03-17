package com.google.android.gms.common;

import aa.j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

@SuppressLint({"HandlerLeak"})
final class e extends j {

    /* renamed from: b  reason: collision with root package name */
    private final Context f48069b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ a f48070c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(a aVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f48070c = aVar;
        this.f48069b = context.getApplicationContext();
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        a aVar = this.f48070c;
        int g10 = aVar.g(this.f48069b);
        if (aVar.j(g10)) {
            this.f48070c.p(this.f48069b, g10);
        }
    }
}
