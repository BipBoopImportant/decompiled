package F9;

import R9.b;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import ba.C7088e;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: F9.b  reason: case insensitive filesystem */
public abstract class C6470b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    private static SoftReference f35560a;

    /* renamed from: b  reason: collision with root package name */
    private static SoftReference f35561b;

    private final int e(Context context, Intent intent) {
        PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException unused) {
                Log.e("CloudMessagingReceiver", "Notification pending intent canceled");
            }
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            extras.remove("pending_intent");
        } else {
            extras = new Bundle();
        }
        if (Objects.equals(intent.getAction(), "com.google.firebase.messaging.NOTIFICATION_DISMISS")) {
            c(context, extras);
            return -1;
        }
        Log.e("CloudMessagingReceiver", "Unknown notification action");
        return 500;
    }

    /* access modifiers changed from: protected */
    public Executor a() {
        ExecutorService executorService;
        synchronized (C6470b.class) {
            try {
                SoftReference softReference = f35560a;
                executorService = softReference != null ? (ExecutorService) softReference.get() : null;
                if (executorService == null) {
                    C7088e.a();
                    executorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new b("firebase-iid-executor")));
                    f35560a = new SoftReference(executorService);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return executorService;
    }

    /* access modifiers changed from: protected */
    public abstract int b(Context context, C6469a aVar);

    /* access modifiers changed from: protected */
    public void c(Context context, Bundle bundle) {
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d(Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        int i10;
        Intent intent2 = intent;
        Context context2 = context;
        BroadcastReceiver.PendingResult pendingResult2 = pendingResult;
        try {
            Parcelable parcelableExtra = intent2.getParcelableExtra("wrapped_intent");
            Executor executor = null;
            Intent intent3 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent3 != null) {
                i10 = e(context2, intent3);
            } else if (intent.getExtras() == null) {
                i10 = 500;
            } else {
                C6469a aVar = new C6469a(intent2);
                CountDownLatch countDownLatch = new CountDownLatch(1);
                synchronized (C6470b.class) {
                    SoftReference softReference = f35561b;
                    if (softReference != null) {
                        executor = (Executor) softReference.get();
                    }
                    if (executor == null) {
                        C7088e.a();
                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b("pscm-ack-executor"));
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                        executor = Executors.unconfigurableExecutorService(threadPoolExecutor);
                        f35561b = new SoftReference(executor);
                    }
                }
                executor.execute(new o(context2, aVar, countDownLatch));
                int b10 = b(context2, aVar);
                try {
                    if (!countDownLatch.await(TimeUnit.SECONDS.toMillis(1), TimeUnit.MILLISECONDS)) {
                        Log.w("CloudMessagingReceiver", "Message ack timed out");
                    }
                } catch (InterruptedException e10) {
                    Log.w("CloudMessagingReceiver", "Message ack failed: ".concat(e10.toString()));
                }
                i10 = b10;
            }
            if (z10 && pendingResult2 != null) {
                pendingResult2.setResultCode(i10);
            }
            if (pendingResult2 != null) {
                pendingResult.finish();
            }
        } catch (Throwable th2) {
            if (pendingResult2 != null) {
                pendingResult.finish();
            }
            throw th2;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a().execute(new p(this, intent, context, isOrderedBroadcast(), goAsync()));
        }
    }
}
