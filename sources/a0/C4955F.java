package a0;

import a0.C4954E;
import androidx.camera.core.impl.H0;
import java.util.concurrent.Executor;

/* renamed from: a0.F  reason: case insensitive filesystem */
public final /* synthetic */ class C4955F implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C4954E.c f15032a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ H0.a f15033b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f15034c;

    public /* synthetic */ C4955F(C4954E.c cVar, H0.a aVar, Executor executor) {
        this.f15032a = cVar;
        this.f15033b = aVar;
        this.f15034c = executor;
    }

    public final void run() {
        this.f15032a.l(this.f15033b, this.f15034c);
    }
}
