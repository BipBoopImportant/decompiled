package androidx.work;

import androidx.concurrent.futures.c;

/* renamed from: androidx.work.w  reason: case insensitive filesystem */
public final /* synthetic */ class C7053w implements c.C0320c {
    public final Object a(c.a aVar) {
        return aVar.f(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
    }
}
