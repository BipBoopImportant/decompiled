package ii;

import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J(\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H¦\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lii/z0;", "", "", "urlFor3dModel", "itemNo", "errorString", "LXH/N;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f74778a = a.f74779a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lii/z0$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "a", "(Landroid/content/Context;)Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f74779a = new a();

        private a() {
        }

        public final boolean a(Context context) {
            C17542s.j(context, "context");
            PackageManager packageManager = context.getPackageManager();
            C17542s.i(packageManager, "getPackageManager(...)");
            return D0.c(packageManager, "com.google.android.googlequicksearchbox");
        }
    }

    void a(String str, String str2, String str3);
}
