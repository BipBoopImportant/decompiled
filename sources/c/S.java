package C;

import C.U;
import java.util.concurrent.Executor;

public final /* synthetic */ class S implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U f5267a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ U.g f5268b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Executor f5269c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ U.f f5270d;

    public /* synthetic */ S(U u10, U.g gVar, Executor executor, U.f fVar) {
        this.f5267a = u10;
        this.f5268b = gVar;
        this.f5269c = executor;
        this.f5270d = fVar;
    }

    public final void run() {
        this.f5267a.B0(this.f5268b, this.f5269c, this.f5270d);
    }
}
