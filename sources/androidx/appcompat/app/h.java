package androidx.appcompat.app;

import androidx.appcompat.app.g;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g.c f15556a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f15557b;

    public /* synthetic */ h(g.c cVar, Runnable runnable) {
        this.f15556a = cVar;
        this.f15557b = runnable;
    }

    public final void run() {
        this.f15556a.b(this.f15557b);
    }
}
