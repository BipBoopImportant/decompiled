package androidx.media3.exoplayer;

import G3.C6477A;
import G3.C6503x;
import android.util.Pair;
import androidx.media3.exoplayer.q0;

public final /* synthetic */ class h0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.a f22759a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f22760b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6503x f22761c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6477A f22762d;

    public /* synthetic */ h0(q0.a aVar, Pair pair, C6503x xVar, C6477A a10) {
        this.f22759a = aVar;
        this.f22760b = pair;
        this.f22761c = xVar;
        this.f22762d = a10;
    }

    public final void run() {
        this.f22759a.Z(this.f22760b, this.f22761c, this.f22762d);
    }
}
