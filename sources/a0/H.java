package a0;

import X.c;
import androidx.camera.core.impl.H0;
import java.util.Map;

public final /* synthetic */ class H implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f15036a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f15037b;

    public /* synthetic */ H(Map.Entry entry, c cVar) {
        this.f15036a = entry;
        this.f15037b = cVar;
    }

    public final void run() {
        ((H0.a) this.f15036a.getKey()).a(this.f15037b);
    }
}
