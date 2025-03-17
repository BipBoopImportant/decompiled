package Tx;

import QJ.F0;
import QJ.M;
import QJ.S;
import QJ.b1;
import R2.h;
import W2.e;
import W2.f;
import YH.C16877v;
import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LTx/b;", "", "a", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f116976a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00058\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LTx/b$a;", "", "<init>", "()V", "", "", "LRx/b;", "notificationFeatures", "", "LGs/a;", "d", "(Ljava/util/Map;)Ljava/util/Set;", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcherIO", "LR2/h;", "LW2/f;", "c", "(Landroid/content/Context;LQJ/M;)LR2/h;", "DATASTORE_NAME", "Ljava/lang/String;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public static final File b(Context context) {
            return V2.b.a(context, "push_notification_data_store");
        }

        public final h<f> c(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcherIO");
            return e.c(e.f14655a, (S2.b) null, (List) null, S.a(m10.plus(b1.b((F0) null, 1, (Object) null))), new a(context), 3, (Object) null);
        }

        public final Set<Gs.a> d(Map<String, Rx.b> map) {
            C17542s.j(map, "notificationFeatures");
            ArrayList arrayList = new ArrayList();
            for (Object next : map.values()) {
                if (next instanceof Gs.a) {
                    arrayList.add(next);
                }
            }
            return C16877v.y1(arrayList);
        }

        private a() {
        }
    }
}
