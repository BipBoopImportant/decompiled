package Xw;

import android.content.Context;
import android.location.LocationManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXw/e;", "", "a", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f117811a = a.f117812a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LXw/e$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/location/LocationManager;", "a", "(Landroid/content/Context;)Landroid/location/LocationManager;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f117812a = new a();

        private a() {
        }

        public final LocationManager a(Context context) {
            C17542s.j(context, "context");
            Object systemService = context.getSystemService(LocationManager.class);
            C17542s.i(systemService, "getSystemService(...)");
            return (LocationManager) systemService;
        }
    }
}
