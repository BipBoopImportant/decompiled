package androidx.emoji2.text;

import java.util.concurrent.ThreadFactory;

public final /* synthetic */ class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21540a;

    public /* synthetic */ a(String str) {
        this.f21540a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return c.c(this.f21540a, runnable);
    }
}
