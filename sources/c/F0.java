package C;

import C.G0;
import H2.a;
import android.view.Surface;

public final /* synthetic */ class F0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f5196a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Surface f5197b;

    public /* synthetic */ F0(a aVar, Surface surface) {
        this.f5196a = aVar;
        this.f5197b = surface;
    }

    public final void run() {
        this.f5196a.accept(G0.g.c(4, this.f5197b));
    }
}
