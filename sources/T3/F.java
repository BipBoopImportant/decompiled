package t3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import t3.C5962m;

final class F implements C5962m {

    /* renamed from: b  reason: collision with root package name */
    private static final List<b> f29448b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    private final Handler f29449a;

    private static final class b implements C5962m.a {

        /* renamed from: a  reason: collision with root package name */
        private Message f29450a;

        /* renamed from: b  reason: collision with root package name */
        private F f29451b;

        private b() {
        }

        private void b() {
            this.f29450a = null;
            this.f29451b = null;
            F.n(this);
        }

        public void a() {
            ((Message) C5950a.e(this.f29450a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) C5950a.e(this.f29450a));
            b();
            return sendMessageAtFrontOfQueue;
        }

        public b d(Message message, F f10) {
            this.f29450a = message;
            this.f29451b = f10;
            return this;
        }
    }

    public F(Handler handler) {
        this.f29449a = handler;
    }

    private static b m() {
        b bVar;
        List<b> list = f29448b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public static void n(b bVar) {
        List<b> list = f29448b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public C5962m.a a(int i10) {
        return m().d(this.f29449a.obtainMessage(i10), this);
    }

    public boolean b(int i10) {
        C5950a.a(i10 != 0);
        return this.f29449a.hasMessages(i10);
    }

    public boolean c(C5962m.a aVar) {
        return ((b) aVar).c(this.f29449a);
    }

    public C5962m.a d(int i10, Object obj) {
        return m().d(this.f29449a.obtainMessage(i10, obj), this);
    }

    public void e(Object obj) {
        this.f29449a.removeCallbacksAndMessages(obj);
    }

    public Looper f() {
        return this.f29449a.getLooper();
    }

    public C5962m.a g(int i10, int i11, int i12) {
        return m().d(this.f29449a.obtainMessage(i10, i11, i12), this);
    }

    public boolean h(Runnable runnable) {
        return this.f29449a.post(runnable);
    }

    public boolean i(int i10) {
        return this.f29449a.sendEmptyMessage(i10);
    }

    public boolean j(int i10, long j10) {
        return this.f29449a.sendEmptyMessageAtTime(i10, j10);
    }

    public void k(int i10) {
        C5950a.a(i10 != 0);
        this.f29449a.removeMessages(i10);
    }
}
