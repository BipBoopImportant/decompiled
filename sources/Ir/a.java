package Ir;

import Gr.f;
import Rx.c;
import android.net.Uri;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import com.sugarcube.app.base.external.notification.FilterNotificationParamsUseCase;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pv.C11782b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\r\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0016XD¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0016XD¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LIr/a;", "LRx/c;", "Lcom/sugarcube/app/base/external/notification/FilterNotificationParamsUseCase;", "filterNotificationParamsUseCase", "<init>", "(Lcom/sugarcube/app/base/external/notification/FilterNotificationParamsUseCase;)V", "", "", "data", "Lpv/b;", "e", "(Ljava/util/Map;)Lpv/b;", "messageId", "i", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "g", "(Ljava/util/Map;)Ljava/util/Map;", "a", "Lcom/sugarcube/app/base/external/notification/FilterNotificationParamsUseCase;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "b", "Lcom/ingka/ikea/analytics/Interaction$Component;", "c", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "analyticsComponent", "", "I", "h", "()I", "notificationVisibility", "", "d", "Z", "f", "()Z", "sendPushAnalytics", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final FilterNotificationParamsUseCase f81994a;

    /* renamed from: b  reason: collision with root package name */
    private final Interaction$Component f81995b = Interaction$Component.GEOMAGICAL_MY_ROOMS;

    /* renamed from: c  reason: collision with root package name */
    private final int f81996c = 1;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f81997d;

    public a(FilterNotificationParamsUseCase filterNotificationParamsUseCase) {
        C17542s.j(filterNotificationParamsUseCase, "filterNotificationParamsUseCase");
        this.f81994a = filterNotificationParamsUseCase;
    }

    public Interaction$Component c() {
        return this.f81995b;
    }

    public C11782b e(Map<String, String> map) {
        C17542s.j(map, "data");
        return C11782b.d.f101389c;
    }

    public boolean f() {
        return this.f81997d;
    }

    public Map<String, String> g(Map<String, String> map) {
        C17542s.j(map, "data");
        return map;
    }

    public int h() {
        return this.f81996c;
    }

    public String i(Map<String, String> map, String str) {
        C17542s.j(map, "data");
        C17542s.j(str, "messageId");
        Uri.Builder buildUpon = Uri.parse(ow.c.b(f.f81200a.a())).buildUpon();
        for (Map.Entry entry : this.f81994a.execute(map).entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        buildUpon.appendQueryParameter("source", OpeningSource.Push.INSTANCE.getKey());
        String uri = buildUpon.build().toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }
}
