package t3;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class M implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29461a;

    public /* synthetic */ M(String str) {
        this.f29461a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return N.K0(this.f29461a, runnable);
    }
}
