package Ae;

import XH.v;
import android.app.Activity;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\u0007\u001a\u00020\u00062\u0018\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\u00042\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000fH&¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00062\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000fH&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LAe/f;", "", "", "LXH/v;", "", "userProperties", "LXH/N;", "c", "(Ljava/util/List;)V", "Landroid/app/Activity;", "activity", "viewName", "e", "(Landroid/app/Activity;Ljava/lang/String;)V", "eventKey", "", "values", "track", "(Ljava/lang/String;Ljava/util/Map;)V", "icmId", "a", "(Ljava/lang/String;)V", "i", "(Ljava/util/Map;)V", "LAe/i;", "h", "()LAe/i;", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(f fVar, String str, Map map, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 2) != 0) {
                    map = null;
                }
                fVar.track(str, map);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
    }

    void a(String str);

    void c(List<v<String, String>> list);

    void e(Activity activity, String str);

    i h();

    void i(Map<String, ? extends Object> map);

    void track(String str, Map<String, ? extends Object> map);
}
