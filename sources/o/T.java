package O;

import java.util.Map;

public final /* synthetic */ class T implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ W f9578a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ N f9579b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f9580c;

    public /* synthetic */ T(W w10, N n10, Map.Entry entry) {
        this.f9578a = w10;
        this.f9579b = n10;
        this.f9580c = entry;
    }

    public final void run() {
        this.f9578a.g(this.f9579b, this.f9580c);
    }
}
