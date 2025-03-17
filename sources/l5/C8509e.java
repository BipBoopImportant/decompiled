package l5;

import D2.i;
import android.os.Handler;
import android.os.Looper;
import androidx.work.L;

/* renamed from: l5.e  reason: case insensitive filesystem */
public class C8509e implements L {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f54716a = i.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.f54716a.removeCallbacks(runnable);
    }

    public void b(long j10, Runnable runnable) {
        this.f54716a.postDelayed(runnable, j10);
    }
}
