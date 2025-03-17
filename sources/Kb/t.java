package Kb;

import java.util.Map;
import jc.C9894a;
import jc.C9895b;

public final /* synthetic */ class t implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Map.Entry f61472a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C9894a f61473b;

    public /* synthetic */ t(Map.Entry entry, C9894a aVar) {
        this.f61472a = entry;
        this.f61473b = aVar;
    }

    public final void run() {
        ((C9895b) this.f61472a.getKey()).a(this.f61473b);
    }
}
