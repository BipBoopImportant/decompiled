package f5;

import TJ.C16532g;
import XH.C16824o;
import XH.C16825p;
import XH.u;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.layout.adapter.sidecar.b;
import d5.d;
import g5.C7872a;
import h5.C7926a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import nI.C17631a;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lf5/f;", "", "Landroid/content/Context;", "context", "LTJ/g;", "Lf5/k;", "b", "(Landroid/content/Context;)LTJ/g;", "Landroid/app/Activity;", "activity", "a", "(Landroid/app/Activity;)LTJ/g;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f51140a = a.f51141a;

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002XD¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR#\u0010\u0015\u001a\u0004\u0018\u00010\u00118@X\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u000e\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lf5/f$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Lf5/f;", "d", "(Landroid/content/Context;)Lf5/f;", "", "b", "Z", "DEBUG", "", "c", "Ljava/lang/String;", "TAG", "Lg5/a;", "LXH/o;", "()Lg5/a;", "getExtensionBackend$window_release$annotations", "extensionBackend", "Lf5/g;", "e", "Lf5/g;", "decorator", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f51141a = new a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final boolean f51142b = false;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final String f51143c = P.b(f.class).f();

        /* renamed from: d  reason: collision with root package name */
        private static final C16824o<C7872a> f51144d = C16825p.b(C0841a.f51146c);

        /* renamed from: e  reason: collision with root package name */
        private static g f51145e = C7846b.f51112a;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg5/a;", "b", "()Lg5/a;"}, k = 3, mv = {1, 8, 0})
        /* renamed from: f5.f$a$a  reason: collision with other inner class name */
        static final class C0841a extends C17544u implements C17631a<C7872a> {

            /* renamed from: c  reason: collision with root package name */
            public static final C0841a f51146c = new C0841a();

            C0841a() {
                super(0);
            }

            /* renamed from: b */
            public final C7872a invoke() {
                WindowLayoutComponent g10;
                try {
                    ClassLoader classLoader = f.class.getClassLoader();
                    C7849e eVar = classLoader != null ? new C7849e(classLoader, new d(classLoader)) : null;
                    if (eVar == null || (g10 = eVar.g()) == null) {
                        return null;
                    }
                    C7926a.C0849a aVar = C7926a.f51637a;
                    C17542s.i(classLoader, "loader");
                    return aVar.a(g10, new d(classLoader));
                } catch (Throwable unused) {
                    if (!a.f51142b) {
                        return null;
                    }
                    Log.d(a.f51143c, "Failed to load WindowExtensions");
                    return null;
                }
            }
        }

        private a() {
        }

        public final C7872a c() {
            return f51144d.getValue();
        }

        public final f d(Context context) {
            C17542s.j(context, "context");
            C7872a c10 = c();
            if (c10 == null) {
                c10 = b.f45044c.a(context);
            }
            return f51145e.a(new i(p.f51170b, c10));
        }
    }

    C16532g<k> a(Activity activity);

    C16532g<k> b(Context context) {
        C17542s.j(context, "context");
        C16532g<k> gVar = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            gVar = a(activity);
        }
        if (gVar != null) {
            return gVar;
        }
        throw new u("Must override windowLayoutInfo(context) and provide an implementation.");
    }
}
