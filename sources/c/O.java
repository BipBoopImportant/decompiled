package C;

import C.U;
import java.util.concurrent.Executor;

public final /* synthetic */ class O implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ U f5263a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f5264b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ U.e f5265c;

    public /* synthetic */ O(U u10, Executor executor, U.e eVar) {
        this.f5263a = u10;
        this.f5264b = executor;
        this.f5265c = eVar;
    }

    public final void run() {
        this.f5263a.A0(this.f5264b, this.f5265c);
    }
}
