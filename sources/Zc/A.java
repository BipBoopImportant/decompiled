package Zc;

import java.util.concurrent.Callable;
import xa.C8960a;
import xa.C8961b;
import xa.C8972m;

public final /* synthetic */ class A implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C9402k f65070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8960a f65071b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C8961b f65072c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Callable f65073d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ C8972m f65074e;

    public /* synthetic */ A(C9402k kVar, C8960a aVar, C8961b bVar, Callable callable, C8972m mVar) {
        this.f65070a = kVar;
        this.f65071b = aVar;
        this.f65072c = bVar;
        this.f65073d = callable;
        this.f65074e = mVar;
    }

    public final void run() {
        this.f65070a.g(this.f65071b, this.f65072c, this.f65073d, this.f65074e);
    }
}
