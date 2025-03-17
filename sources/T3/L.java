package t3;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class L implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f29460a;

    public /* synthetic */ L(String str) {
        this.f29460a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return N.L0(this.f29460a, runnable);
    }
}
