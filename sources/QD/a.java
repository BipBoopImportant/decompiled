package Qd;

import CE.C12694a;
import Od.h;
import android.content.Context;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wE.C15186a;
import xE.C15216f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LQd/a;", "", "a", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1068a f63066a = C1068a.f63067a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQd/a$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "LxE/f;", "a", "(Landroid/content/Context;)LxE/f;", "abtesting-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qd.a$a  reason: collision with other inner class name */
    public static final class C1068a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C1068a f63067a = new C1068a();

        private C1068a() {
        }

        public final C15216f a(Context context) {
            C17542s.j(context, "context");
            String string = context.getString(h.f62156a);
            C17542s.i(string, "getString(...)");
            C15186a b10 = C15186a.b(context);
            C17542s.i(b10, "getInstance(...)");
            C12694a.b f10 = C12694a.l().e(1).f(b10);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C15216f a10 = C15216f.i().b(1, timeUnit).d(string).c(f10.g(Long.valueOf(timeUnit.toMillis(1))).b()).a(context);
            C17542s.i(a10, "build(...)");
            return a10;
        }
    }
}
