package Xw;

import Yw.f;
import android.content.Context;
import androidx.activity.j;
import g.C5316e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import na.g;
import na.m;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LXw/a;", "", "a", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2918a f117809a = C2918a.f117810a;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LXw/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lna/m;", "c", "(Landroid/content/Context;)Lna/m;", "LYw/f$a;", "b", "()LYw/f$a;", "activity", "Lg/e;", "a", "(Landroid/content/Context;)Lg/e;", "permissions_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Xw.a$a  reason: collision with other inner class name */
    public static final class C2918a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C2918a f117810a = new C2918a();

        private C2918a() {
        }

        public final C5316e a(Context context) {
            C5316e activityResultRegistry;
            C17542s.j(context, "activity");
            j jVar = context instanceof j ? (j) context : null;
            if (jVar != null && (activityResultRegistry = jVar.getActivityResultRegistry()) != null) {
                return activityResultRegistry;
            }
            String simpleName = context.getClass().getSimpleName();
            throw new IllegalArgumentException("Expected context is ComponentActivity, but was " + simpleName);
        }

        public final f.a b() {
            return new f.a();
        }

        public final m c(Context context) {
            C17542s.j(context, "context");
            m d10 = g.d(context);
            C17542s.i(d10, "getSettingsClient(...)");
            return d10;
        }
    }
}
