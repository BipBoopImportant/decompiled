package T1;

import android.view.Choreographer;
import java.util.concurrent.Executor;

public final /* synthetic */ class V implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Choreographer f13568a;

    public /* synthetic */ V(Choreographer choreographer) {
        this.f13568a = choreographer;
    }

    public final void execute(Runnable runnable) {
        X.e(this.f13568a, runnable);
    }
}
