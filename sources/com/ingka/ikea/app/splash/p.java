package com.ingka.ikea.app.splash;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\n¨\u0006\f"}, d2 = {"Lcom/ingka/ikea/app/splash/p;", "Lcom/ingka/ikea/app/splash/o;", "<init>", "()V", "LXH/N;", "a", "", "b", "()Z", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "shouldShowSplashScreen", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements o {

    /* renamed from: a  reason: collision with root package name */
    private AtomicBoolean f92505a = new AtomicBoolean(true);

    public void a() {
        this.f92505a.set(false);
    }

    public boolean b() {
        return this.f92505a.get();
    }
}
