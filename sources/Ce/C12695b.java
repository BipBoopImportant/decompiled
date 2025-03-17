package CE;

import CE.C12694a;
import java.util.concurrent.ThreadFactory;

/* renamed from: CE.b  reason: case insensitive filesystem */
public final /* synthetic */ class C12695b implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ThreadFactory f108408a;

    public /* synthetic */ C12695b(ThreadFactory threadFactory) {
        this.f108408a = threadFactory;
    }

    public final Thread newThread(Runnable runnable) {
        return C12694a.b.d(this.f108408a, runnable);
    }
}
