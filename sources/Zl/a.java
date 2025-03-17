package Zl;

import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import rw.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LZl/a;", "", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1929a f89961a = C1929a.f89962a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZl/a$a;", "", "<init>", "()V", "", "message", "", "failedUri", "Landroid/net/Uri;", "a", "(Ljava/lang/Integer;Ljava/lang/String;)Landroid/net/Uri;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zl.a$a  reason: collision with other inner class name */
    public static final class C1929a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C1929a f89962a = new C1929a();

        private C1929a() {
        }

        public static /* synthetic */ Uri b(C1929a aVar, Integer num, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                num = null;
            }
            if ((i10 & 2) != 0) {
                str = null;
            }
            return aVar.a(num, str);
        }

        public final Uri a(Integer num, String str) {
            Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/applinkError?errorMessage={errorMessage}&contentUri={contentUri}&openInBrowser={openInBrowser}")).buildUpon();
            C17542s.i(buildUpon, "buildUpon(...)");
            Uri build = g.a(g.a(buildUpon, "errorMessage", String.valueOf(num)), "contentUri", str).build();
            C17542s.i(build, "build(...)");
            return build;
        }
    }

    boolean a(Uri uri);

    Object b(Uri uri, C17164e<? super Uri> eVar);
}
