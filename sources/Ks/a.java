package Ks;

import Ms.g;
import Ms.m;
import QJ.M;
import R2.h;
import W2.f;
import android.content.Context;
import com.ingka.ikea.inboxrepository.impl.data.InboxDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LKs/a;", "", "a", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1657a f83112a = new C1657a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LKs/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LQJ/M;", "dispatcher", "LR2/h;", "LW2/f;", "b", "(Landroid/content/Context;LQJ/M;)LR2/h;", "c", "LIs/a;", "a", "(Landroid/content/Context;)LIs/a;", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ks.a$a  reason: collision with other inner class name */
    public static final class C1657a {
        public /* synthetic */ C1657a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Is.a a(Context context) {
            C17542s.j(context, "context");
            return InboxDatabase.f96134a.a(context).a();
        }

        public final h<f> b(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcher");
            return g.f83704c.b(context, m10);
        }

        public final h<f> c(Context context, M m10) {
            C17542s.j(context, "context");
            C17542s.j(m10, "dispatcher");
            return m.f83720f.b(context, m10);
        }

        private C1657a() {
        }
    }
}
