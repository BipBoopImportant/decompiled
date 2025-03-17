package Ag;

import Ae.e;
import android.content.Context;
import eb.c;
import eb.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wg.C10367a;
import wg.C10368b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b!\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LAg/a;", "", "a", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0960a f58749a = new C0960a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LAg/a$a;", "", "<init>", "()V", "LAe/e;", "analytics", "Lwg/a;", "a", "(LAe/e;)Lwg/a;", "Landroid/content/Context;", "context", "Leb/c;", "b", "(Landroid/content/Context;)Leb/c;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ag.a$a  reason: collision with other inner class name */
    public static final class C0960a {
        public /* synthetic */ C0960a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C10367a a(e eVar) {
            C17542s.j(eVar, "analytics");
            return new C10368b(eVar);
        }

        public final c b(Context context) {
            C17542s.j(context, "context");
            c a10 = d.a(context);
            C17542s.i(a10, "create(...)");
            return a10;
        }

        private C0960a() {
        }
    }
}
