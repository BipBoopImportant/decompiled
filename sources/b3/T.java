package B3;

import android.os.Handler;
import java.util.concurrent.Executor;

public final /* synthetic */ class T implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Handler f32980a;

    public /* synthetic */ T(Handler handler) {
        this.f32980a = handler;
    }

    public final void execute(Runnable runnable) {
        this.f32980a.post(runnable);
    }
}
