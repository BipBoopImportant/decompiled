package androidx.media3.exoplayer;

import android.util.Pair;
import androidx.media3.exoplayer.q0;

public final /* synthetic */ class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.a f22810a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f22811b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f22812c;

    public /* synthetic */ n0(q0.a aVar, Pair pair, int i10) {
        this.f22810a = aVar;
        this.f22811b = pair;
        this.f22812c = i10;
    }

    public final void run() {
        this.f22810a.S(this.f22811b, this.f22812c);
    }
}
