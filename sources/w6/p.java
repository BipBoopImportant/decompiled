package w6;

import java.util.concurrent.atomic.AtomicBoolean;

public final /* synthetic */ class p implements w {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f57274a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AtomicBoolean f57275b;

    public /* synthetic */ p(String str, AtomicBoolean atomicBoolean) {
        this.f57274a = str;
        this.f57275b = atomicBoolean;
    }

    public final void onResult(Object obj) {
        r.G(this.f57274a, this.f57275b, (Throwable) obj);
    }
}
