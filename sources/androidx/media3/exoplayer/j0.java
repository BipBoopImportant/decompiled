package androidx.media3.exoplayer;

import G3.C6477A;
import G3.C6503x;
import android.util.Pair;
import androidx.media3.exoplayer.q0;

public final /* synthetic */ class j0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.a f22790a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f22791b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6503x f22792c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6477A f22793d;

    public /* synthetic */ j0(q0.a aVar, Pair pair, C6503x xVar, C6477A a10) {
        this.f22790a = aVar;
        this.f22791b = pair;
        this.f22792c = xVar;
        this.f22793d = a10;
    }

    public final void run() {
        this.f22790a.X(this.f22791b, this.f22792c, this.f22793d);
    }
}
