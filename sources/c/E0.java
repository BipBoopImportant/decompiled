package C;

import C.G0;
import H2.a;
import android.view.Surface;

public final /* synthetic */ class E0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f5194a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Surface f5195b;

    public /* synthetic */ E0(a aVar, Surface surface) {
        this.f5194a = aVar;
        this.f5195b = surface;
    }

    public final void run() {
        this.f5194a.accept(G0.g.c(3, this.f5195b));
    }
}
