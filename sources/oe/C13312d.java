package OE;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sugarcube.app.base.ShareIntentReceiver;
import com.sugarcube.app.base.ShareIntentReceiver_GeneratedInjector;
import jH.C17408e;
import mH.C17602e;

/* renamed from: OE.d  reason: case insensitive filesystem */
public abstract class C13312d extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f112800a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Object f112801b = new Object();

    /* access modifiers changed from: protected */
    public void a(Context context) {
        if (!this.f112800a) {
            synchronized (this.f112801b) {
                try {
                    if (!this.f112800a) {
                        ((ShareIntentReceiver_GeneratedInjector) C17408e.a(context)).injectShareIntentReceiver((ShareIntentReceiver) C17602e.a(this));
                        this.f112800a = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void onReceive(Context context, Intent intent) {
        a(context);
    }
}
