package a9;

import com.contentsquare.android.internal.core.telemetry.event.AppLifeCycleEvent;
import com.contentsquare.android.internal.core.telemetry.event.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

public final class U {

    /* renamed from: a  reason: collision with root package name */
    public final C17631a<Long> f42314a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f42315b = new LinkedHashMap();

    /* renamed from: c  reason: collision with root package name */
    public long f42316c;

    public U(int i10) {
        O o10 = O.f42165a;
        C17542s.j(o10, "currentTime");
        this.f42314a = o10;
    }

    public final void a(AppLifeCycleEvent appLifeCycleEvent) {
        AppLifeCycleEvent appLifeCycleEvent2 = (AppLifeCycleEvent) this.f42315b.get(appLifeCycleEvent.f46815a);
        if (appLifeCycleEvent2 != null) {
            LinkedHashMap linkedHashMap = this.f42315b;
            String str = appLifeCycleEvent.f46815a;
            a b10 = appLifeCycleEvent2.b(appLifeCycleEvent);
            C17542s.h(b10, "null cannot be cast to non-null type com.contentsquare.android.internal.core.telemetry.event.AppLifeCycleEvent");
            linkedHashMap.put(str, (AppLifeCycleEvent) b10);
            return;
        }
        this.f42315b.put(appLifeCycleEvent.f46815a, appLifeCycleEvent);
    }
}
