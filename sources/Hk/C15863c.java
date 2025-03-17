package HK;

import java.util.concurrent.ThreadFactory;

/* renamed from: HK.c  reason: case insensitive filesystem */
public final /* synthetic */ class C15863c implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f135354a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f135355b;

    public /* synthetic */ C15863c(String str, boolean z10) {
        this.f135354a = str;
        this.f135355b = z10;
    }

    public final Thread newThread(Runnable runnable) {
        return C15864d.P(this.f135354a, this.f135355b, runnable);
    }
}
