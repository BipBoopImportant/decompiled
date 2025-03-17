package z3;

import android.os.HandlerThread;
import android.os.Looper;
import t3.C5950a;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final Object f32384a;

    /* renamed from: b  reason: collision with root package name */
    private Looper f32385b;

    /* renamed from: c  reason: collision with root package name */
    private HandlerThread f32386c;

    /* renamed from: d  reason: collision with root package name */
    private int f32387d;

    public G() {
        this((Looper) null);
    }

    public Looper a() {
        Looper looper;
        synchronized (this.f32384a) {
            try {
                if (this.f32385b == null) {
                    C5950a.g(this.f32387d == 0 && this.f32386c == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.f32386c = handlerThread;
                    handlerThread.start();
                    this.f32385b = this.f32386c.getLooper();
                }
                this.f32387d++;
                looper = this.f32385b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void b() {
        HandlerThread handlerThread;
        synchronized (this.f32384a) {
            try {
                C5950a.g(this.f32387d > 0);
                int i10 = this.f32387d - 1;
                this.f32387d = i10;
                if (i10 == 0 && (handlerThread = this.f32386c) != null) {
                    handlerThread.quit();
                    this.f32386c = null;
                    this.f32385b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public G(Looper looper) {
        this.f32384a = new Object();
        this.f32385b = looper;
        this.f32386c = null;
        this.f32387d = 0;
    }
}
