package androidx.media3.exoplayer;

import G3.C6477A;
import G3.C6503x;
import android.util.Pair;
import androidx.media3.exoplayer.q0;
import java.io.IOException;

public final /* synthetic */ class k0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q0.a f22796a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Pair f22797b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C6503x f22798c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ C6477A f22799d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ IOException f22800e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ boolean f22801f;

    public /* synthetic */ k0(q0.a aVar, Pair pair, C6503x xVar, C6477A a10, IOException iOException, boolean z10) {
        this.f22796a = aVar;
        this.f22797b = pair;
        this.f22798c = xVar;
        this.f22799d = a10;
        this.f22800e = iOException;
        this.f22801f = z10;
    }

    public final void run() {
        this.f22796a.Y(this.f22797b, this.f22798c, this.f22799d, this.f22800e, this.f22801f);
    }
}
