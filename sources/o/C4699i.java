package O;

import androidx.concurrent.futures.c;

/* renamed from: O.i  reason: case insensitive filesystem */
public final /* synthetic */ class C4699i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c.a f9620a;

    public /* synthetic */ C4699i(c.a aVar) {
        this.f9620a = aVar;
    }

    public final void run() {
        this.f9620a.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
    }
}
