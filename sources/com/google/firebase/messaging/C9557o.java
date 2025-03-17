package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.o  reason: case insensitive filesystem */
class C9557o implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<String> f68478a = new ArrayDeque(10);

    C9557o() {
    }

    private void a(Intent intent) {
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String h10 = H.h(extras);
                if (!TextUtils.isEmpty(h10)) {
                    if (!this.f68478a.contains(h10)) {
                        this.f68478a.add(h10);
                    } else {
                        return;
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e10) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e10);
        }
        if (H.E(bundle)) {
            H.x(bundle);
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent != null) {
            a(intent);
        }
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
    }

    public void onActivityStopped(Activity activity) {
    }
}
