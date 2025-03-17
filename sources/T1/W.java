package T1;

import android.view.Choreographer;

public final /* synthetic */ class W implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f13569a;

    public /* synthetic */ W(Runnable runnable) {
        this.f13569a = runnable;
    }

    public final void doFrame(long j10) {
        X.f(this.f13569a, j10);
    }
}
