package com.google.firebase.messaging;

import F9.C6469a;
import F9.C6471c;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ExecutorService;

public class FirebaseMessagingService extends C9550h {

    /* renamed from: g  reason: collision with root package name */
    private static final Queue<String> f68336g = new ArrayDeque(10);

    /* renamed from: f  reason: collision with root package name */
    private C6471c f68337f;

    private boolean l(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Queue<String> queue = f68336g;
        if (!queue.contains(str)) {
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(str);
            return false;
        } else if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        } else {
            Log.d("FirebaseMessaging", "Received duplicate message: " + str);
            return true;
        }
    }

    private void m(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = new Bundle();
        }
        extras.remove("androidx.content.wakelockid");
        if (J.t(extras)) {
            J j10 = new J(extras);
            ExecutorService e10 = C9556n.e();
            try {
                if (!new C9547e(this, j10, e10).a()) {
                    e10.shutdown();
                    if (H.D(intent)) {
                        H.w(intent);
                    }
                } else {
                    return;
                }
            } finally {
                e10.shutdown();
            }
        }
        r(new S(extras));
    }

    private String n(Intent intent) {
        String stringExtra = intent.getStringExtra("google.message_id");
        return stringExtra == null ? intent.getStringExtra("message_id") : stringExtra;
    }

    private C6471c o(Context context) {
        if (this.f68337f == null) {
            this.f68337f = new C6471c(context.getApplicationContext());
        }
        return this.f68337f;
    }

    private void p(Intent intent) {
        if (!l(intent.getStringExtra("google.message_id"))) {
            v(intent);
        }
        o(this).b(new C6469a(intent));
    }

    private void v(Intent intent) {
        String stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        char c10 = 65535;
        switch (stringExtra.hashCode()) {
            case -2062414158:
                if (stringExtra.equals("deleted_messages")) {
                    c10 = 0;
                    break;
                }
                break;
            case 102161:
                if (stringExtra.equals("gcm")) {
                    c10 = 1;
                    break;
                }
                break;
            case 814694033:
                if (stringExtra.equals("send_error")) {
                    c10 = 2;
                    break;
                }
                break;
            case 814800675:
                if (stringExtra.equals("send_event")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                q();
                return;
            case 1:
                H.y(intent);
                m(intent);
                return;
            case 2:
                u(n(intent), new W(intent.getStringExtra(UiComponentContainer.RESULT_ERROR)));
                return;
            case 3:
                s(intent.getStringExtra("google.message_id"));
                return;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: " + stringExtra);
                return;
        }
    }

    /* access modifiers changed from: protected */
    public Intent e(Intent intent) {
        return X.b().c();
    }

    public void f(Intent intent) {
        String action = intent.getAction();
        if ("com.google.android.c2dm.intent.RECEIVE".equals(action) || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
            p(intent);
        } else if ("com.google.firebase.messaging.NEW_TOKEN".equals(action)) {
            t(intent.getStringExtra("token"));
        } else {
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
        }
    }

    public void q() {
    }

    public void r(S s10) {
    }

    @Deprecated
    public void s(String str) {
    }

    public void t(String str) {
    }

    @Deprecated
    public void u(String str, Exception exc) {
    }
}
