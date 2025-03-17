package QL;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: QL.a  reason: case insensitive filesystem */
final class C16358a implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f137731a = new Handler(Looper.getMainLooper());

    C16358a() {
    }

    public void execute(Runnable runnable) {
        this.f137731a.post(runnable);
    }
}
