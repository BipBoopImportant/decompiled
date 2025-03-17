package mg;

import GK.C15784c;
import GK.C15804w;
import XH.C16807N;
import YH.C16877v;
import YH.g0;
import a7.C6747b;
import a7.C6748c;
import android.content.Context;
import b7.C7075a;
import ck.C11141a;
import java.io.File;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sh.C10246b;
import sh.C10247c;
import tw.b;
import tw.e;
import tw.q;
import tw.r;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u000e\b\u0001\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\u00162\b\b\u0001\u0010\u0018\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ5\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e2\u000e\b\u0001\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0001\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b \u0010!¨\u0006#"}, d2 = {"Lmg/G;", "", "<init>", "()V", "", "LGK/w;", "e", "()Ljava/util/Set;", "Lsh/c;", "localizationInterceptor", "Lsh/b;", "basicLoggingInterceptor", "Ltw/q;", "userAgentFactory", "", "c", "(Lsh/c;Lsh/b;Ltw/q;)Ljava/util/List;", "i", "()Ltw/q;", "list", "f", "(Ljava/util/List;)Ljava/util/List;", "Landroid/content/Context;", "context", "botManagerInterceptor", "g", "(Landroid/content/Context;LGK/w;)Ljava/util/List;", "debugInterceptors", "baseInterceptors", "b", "(Ljava/util/Set;Ljava/util/List;)Ljava/util/List;", "LGK/c;", "d", "(Landroid/content/Context;)LGK/c;", "a", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class G {

    /* renamed from: a  reason: collision with root package name */
    public static final a f75383a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lmg/G$a;", "", "<init>", "()V", "", "KILO_BYTES", "I", "", "RETROFIT_CACHE_SIZE", "J", "", "ANDROID", "Ljava/lang/String;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(Context context, C6747b bVar) {
        C17542s.j(bVar, "$this$certificateTransparencyInterceptor");
        bVar.e(new C11141a());
        bVar.d(new C7075a(context));
        return C16807N.f139792a;
    }

    public final List<C15804w> b(Set<C15804w> set, List<C15804w> list) {
        C17542s.j(set, "debugInterceptors");
        C17542s.j(list, "baseInterceptors");
        return C16877v.V0(list, set);
    }

    public final List<C15804w> c(C10247c cVar, C10246b bVar, q qVar) {
        C17542s.j(cVar, "localizationInterceptor");
        C17542s.j(bVar, "basicLoggingInterceptor");
        C17542s.j(qVar, "userAgentFactory");
        return C16877v.q(new b(13854, qVar.a()), cVar, new e("4.11.0", "android", 13854), bVar);
    }

    public final C15784c d(Context context) {
        C17542s.j(context, "context");
        File cacheDir = context.getCacheDir();
        C17542s.i(cacheDir, "getCacheDir(...)");
        return new C15784c(cacheDir, 104857600);
    }

    public final Set<C15804w> e() {
        return g0.d();
    }

    public final List<C15804w> f(List<C15804w> list) {
        C17542s.j(list, "list");
        return C16877v.t1(list);
    }

    public final List<C15804w> g(Context context, C15804w wVar) {
        C17542s.j(context, "context");
        C17542s.j(wVar, "botManagerInterceptor");
        return C16877v.q(C6748c.a(new F(context)), wVar);
    }

    public final q i() {
        return new r(13854, "4.11.0");
    }
}
