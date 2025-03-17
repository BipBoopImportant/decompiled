package androidx.media3.exoplayer;

import G3.C6477A;
import G3.C6503x;
import android.util.Pair;
import androidx.media3.exoplayer.q0;

public final /* synthetic */ class f0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.a f22734a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f22735b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6503x f22736c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6477A f22737d;

    public /* synthetic */ f0(q0.a aVar, Pair pair, C6503x xVar, C6477A a10) {
        this.f22734a = aVar;
        this.f22735b = pair;
        this.f22736c = xVar;
        this.f22737d = a10;
    }

    public final void run() {
        this.f22734a.W(this.f22735b, this.f22736c, this.f22737d);
    }
}
