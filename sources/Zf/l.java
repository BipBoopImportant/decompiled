package Zf;

import Zf.k;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow.c;
import rw.g;
import x4.C;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0015JI\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\"R\"\u0010*\u001a\u00020$8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)¨\u0006+"}, d2 = {"LZf/l;", "LZf/k;", "<init>", "()V", "Lx4/o;", "navController", "", "autoNavigate", "Lx4/C;", "navOptions", "LXH/N;", "h", "(Lx4/o;ZLx4/C;)V", "", "menuType", "itemNo", "g", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Lx4/C;)V", "a", "()Ljava/lang/String;", "i", "(Lx4/o;)V", "k", "l", "j", "title", "description", "badge", "buttonText", "imageUrl", "imageContentDescription", "b", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "(Lx4/o;Ljava/lang/String;)V", "f", "LZf/k$a;", "LZf/k$a;", "e", "()LZf/k$a;", "d", "(LZf/k$a;)V", "lastActiveCartType", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k {

    /* renamed from: b  reason: collision with root package name */
    public static final a f65214b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f65215c = 8;

    /* renamed from: a  reason: collision with root package name */
    private k.a f65216a = k.a.ONLINE_CART;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LZf/l$a;", "", "<init>", "()V", "Landroid/net/Uri;", "deepLink", "a", "(Landroid/net/Uri;)Landroid/net/Uri;", "", "DEEP_LINK_HOST", "Ljava/lang/String;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Uri a(Uri uri) {
            C17542s.j(uri, "deepLink");
            if (!C17542s.e("cart", uri.getHost())) {
                return null;
            }
            Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/cart/cart?view={view}&autoNavigate={autoNavigate}")).buildUpon();
            C17542s.i(buildUpon, "buildUpon(...)");
            return g.a(g.a(buildUpon, "view", uri.getQueryParameter("view")), "autoNavigate", "false").build();
        }

        private a() {
        }
    }

    public String a() {
        return "ikea://navigation/cart/cart?view={view}&autoNavigate={autoNavigate}";
    }

    public void b(C8951o oVar, String str, String str2, String str3, String str4, String str5, String str6) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "title");
        C17542s.j(str2, "description");
        C17542s.j(str3, "badge");
        C17542s.j(str4, "buttonText");
        C17542s.j(str5, "imageUrl");
        Uri.Builder appendQueryParameter = Uri.parse(c.b(o.f65242a.a())).buildUpon().appendQueryParameter("readMoreTitle", str).appendQueryParameter("readMoreDescription", str2);
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        Uri build = g.a(appendQueryParameter, "readMoreImageContentDescription", str6).appendQueryParameter("readMoreImageUrl", str5).appendQueryParameter("readMoreBadge", str3).appendQueryParameter("buttonText", str4).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void c(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        Uri build = Uri.parse(c.b("ikea://navigation/cart/cartItemAvailability?itemNo={itemNo}")).buildUpon().appendQueryParameter("itemNo", str).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void d(k.a aVar) {
        C17542s.j(aVar, "<set-?>");
        this.f65216a = aVar;
    }

    public k.a e() {
        return this.f65216a;
    }

    public void f(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        Uri build = Uri.parse(c.b("ikea://navigation/cart/cartItemReplacementRecommendations?itemNo={itemNo}")).buildUpon().appendQueryParameter("itemNo", str).build();
        C17542s.i(build, "build(...)");
        oVar.X(build);
    }

    public void g(C8951o oVar, String str, String str2, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "menuType");
        C17542s.j(str2, "itemNo");
        Uri build = Uri.parse(c.b("ikea://navigation/cart/cartItemAvailability?menuType={menuType}&itemNo={itemNo}")).buildUpon().appendQueryParameter("menuType", str).appendQueryParameter("itemNo", str2).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }

    public void h(C8951o oVar, boolean z10, C c10) {
        C17542s.j(oVar, "navController");
        Uri build = Uri.parse(c.b(a())).buildUpon().appendQueryParameter("autoNavigate", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }

    public void i(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse(c.b("ikea://navigation/cart/unavailableItems"));
        C17542s.i(parse, "parse(...)");
        oVar.X(parse);
    }

    public void j(C8951o oVar) {
        C17542s.j(oVar, "navController");
        C8951o.g0(oVar, "cart/assemblyDetails", rw.c.f28698a.d().a(), (I.a) null, 4, (Object) null);
    }

    public void k(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse("ikea://navigation/cart/discount");
        C17542s.i(parse, "parse(...)");
        oVar.X(c.a(parse));
    }

    public void l(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse("ikea://navigation/cart/availability");
        C17542s.i(parse, "parse(...)");
        oVar.X(c.a(parse));
    }
}
