package E0;

import java.util.function.IntConsumer;

/* renamed from: E0.b  reason: case insensitive filesystem */
public final /* synthetic */ class C4444b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IntConsumer f5699a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f5700b;

    public /* synthetic */ C4444b(IntConsumer intConsumer, int i10) {
        this.f5699a = intConsumer;
        this.f5700b = i10;
    }

    public final void run() {
        C4445c.c(this.f5699a, this.f5700b);
    }
}
