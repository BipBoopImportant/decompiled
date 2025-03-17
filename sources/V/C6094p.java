package v;

import androidx.camera.core.impl.C5040p;
import java.util.concurrent.Executor;

/* renamed from: v.p  reason: case insensitive filesystem */
public final /* synthetic */ class C6094p implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6109u f30641a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f30642b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C5040p f30643c;

    public /* synthetic */ C6094p(C6109u uVar, Executor executor, C5040p pVar) {
        this.f30641a = uVar;
        this.f30642b = executor;
        this.f30643c = pVar;
    }

    public final void run() {
        this.f30641a.d0(this.f30642b, this.f30643c);
    }
}
