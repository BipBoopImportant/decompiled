package Fx;

import Cx.b;
import Ex.d;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.openid.appauth.h;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LFx/a;", "", "a", "publishersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C2629a f109978a = new C2629a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LFx/a$a;", "", "<init>", "()V", "LCx/b;", "c", "()LCx/b;", "Landroid/content/Context;", "context", "Lnet/openid/appauth/h;", "a", "(Landroid/content/Context;)Lnet/openid/appauth/h;", "LEx/d;", "b", "(Landroid/content/Context;)LEx/d;", "publishersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fx.a$a  reason: collision with other inner class name */
    public static final class C2629a {
        public /* synthetic */ C2629a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(Context context) {
            C17542s.j(context, "context");
            return new h(context);
        }

        public final d b(Context context) {
            C17542s.j(context, "context");
            return new d(context);
        }

        public final b c() {
            return new b();
        }

        private C2629a() {
        }
    }
}
