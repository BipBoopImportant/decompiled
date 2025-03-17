package Rx;

import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import pv.C11782b;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J%\u0010\u0006\u001a\u00020\u00052\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0001\u0002\u0016\u0017¨\u0006\u0018"}, d2 = {"LRx/b;", "", "", "", "data", "Lpv/b;", "e", "(Ljava/util/Map;)Lpv/b;", "g", "(Ljava/util/Map;)Ljava/util/Map;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "c", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "analyticsComponent", "", "h", "()I", "notificationVisibility", "", "f", "()Z", "sendPushAnalytics", "LRx/a;", "LRx/c;", "pushnotification_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ C11782b a(b bVar, Map map, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    map = X.j();
                }
                return bVar.e(map);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNotificationChannel");
        }
    }

    Interaction$Component c();

    C11782b e(Map<String, String> map);

    boolean f();

    Map<String, String> g(Map<String, String> map);

    int h();
}
