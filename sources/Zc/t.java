package Zc;

import Vc.a;
import java.util.concurrent.Callable;
import xa.C8972m;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f65137a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8972m f65138b;

    public /* synthetic */ t(Callable callable, C8972m mVar) {
        this.f65137a = callable;
        this.f65138b = mVar;
    }

    public final void run() {
        Callable callable = this.f65137a;
        C8972m mVar = this.f65138b;
        try {
            mVar.c(callable.call());
        } catch (a e10) {
            mVar.b(e10);
        } catch (Exception e11) {
            mVar.b(new a("Internal error has occurred when executing ML Kit tasks", 13, e11));
        }
    }
}
