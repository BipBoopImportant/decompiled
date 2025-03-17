package P;

import O.N;
import androidx.camera.core.impl.J;
import java.util.Map;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r f11806a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ J f11807b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ J f11808c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ N f11809d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ N f11810e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f11811f;

    public /* synthetic */ q(r rVar, J j10, J j11, N n10, N n11, Map.Entry entry) {
        this.f11806a = rVar;
        this.f11807b = j10;
        this.f11808c = j11;
        this.f11809d = n10;
        this.f11810e = n11;
        this.f11811f = entry;
    }

    public final void run() {
        this.f11806a.e(this.f11807b, this.f11808c, this.f11809d, this.f11810e, this.f11811f);
    }
}
