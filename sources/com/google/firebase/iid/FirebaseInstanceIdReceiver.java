package com.google.firebase.iid;

import F9.C6469a;
import F9.C6470b;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.messaging.C9555m;
import com.google.firebase.messaging.H;
import java.util.concurrent.ExecutionException;
import xa.C8974o;

public final class FirebaseInstanceIdReceiver extends C6470b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    public int b(Context context, C6469a aVar) {
        try {
            return ((Integer) C8974o.a(new C9555m(context).k(aVar.x()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    public void c(Context context, Bundle bundle) {
        Intent f10 = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (H.D(f10)) {
            H.v(f10);
        }
    }
}
