package l5;

import androidx.work.WorkerParameters;

public final /* synthetic */ class L implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ M f54626a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8528y f54627b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ WorkerParameters.a f54628c;

    public /* synthetic */ L(M m10, C8528y yVar, WorkerParameters.a aVar) {
        this.f54626a = m10;
        this.f54627b = yVar;
        this.f54628c = aVar;
    }

    public final void run() {
        M.g(this.f54626a, this.f54627b, this.f54628c);
    }
}
