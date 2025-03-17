package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.q0;

public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.a f22803a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f22804b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Exception f22805c;

    public /* synthetic */ l0(q0.a aVar, Pair pair, Exception exc) {
        this.f22803a = aVar;
        this.f22804b = pair;
        this.f22805c = exc;
    }

    public final void run() {
        this.f22803a.T(this.f22804b, this.f22805c);
    }
}
