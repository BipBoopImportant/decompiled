package androidx.profileinstaller;

import L4.c;
import L4.d;
import L4.e;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer implements T4.a<b> {

    private static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class b {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(Context context, long j10) {
        g(context);
    }

    /* access modifiers changed from: private */
    public static void k(Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new e(context));
    }

    public List<Class<? extends T4.a<?>>> a() {
        return Collections.emptyList();
    }

    /* renamed from: f */
    public b b(Context context) {
        Choreographer.getInstance().postFrameCallback(new c(this, context.getApplicationContext()));
        return new b();
    }

    /* access modifiers changed from: package-private */
    public void g(Context context) {
        (Build.VERSION.SDK_INT >= 28 ? a.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new d(context), (long) (new Random().nextInt(Math.max(1000, 1)) + 5000));
    }
}
