package l5;

import java.util.concurrent.Callable;
import l5.W;

public final /* synthetic */ class X implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W.b f54709a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ W f54710b;

    public /* synthetic */ X(W.b bVar, W w10) {
        this.f54709a = bVar;
        this.f54710b = w10;
    }

    public final Object call() {
        return W.c.j(this.f54709a, this.f54710b);
    }
}
