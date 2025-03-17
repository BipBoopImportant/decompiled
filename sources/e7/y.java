package E7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

class y {

    /* renamed from: a  reason: collision with root package name */
    private boolean f35226a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f35227b = new Handler(Looper.getMainLooper(), new a());

    private static final class a implements Handler.Callback {
        a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            ((v) message.obj).c();
            return true;
        }
    }

    y() {
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(v<?> vVar, boolean z10) {
        try {
            if (!this.f35226a) {
                if (!z10) {
                    this.f35226a = true;
                    vVar.c();
                    this.f35226a = false;
                }
            }
            this.f35227b.obtainMessage(1, vVar).sendToTarget();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
