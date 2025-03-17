package Zf;

import Zl.b;
import android.content.UriMatcher;
import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000f"}, d2 = {"LZf/a;", "LZl/a;", "<init>", "()V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "c", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zl.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C1141a f65211c = new C1141a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f65212d = 8;

    /* renamed from: b  reason: collision with root package name */
    private final UriMatcher f65213b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LZf/a$a;", "", "<init>", "()V", "", "DYNAMIC_LINK_CONTENT", "I", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zf.a$a  reason: collision with other inner class name */
    public static final class C1141a {
        public /* synthetic */ C1141a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1141a() {
        }
    }

    public a() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("www.ikea.com", "/ikeaapp/cart", 1);
        uriMatcher.addURI("www.ikea.com", "/ikeaapp/cart/*", 1);
        uriMatcher.addURI("cart", (String) null, 2);
        this.f65213b = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return b.a(this.f65213b, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        int match = this.f65213b.match(uri);
        if (match == 1) {
            return c.a(Uri.parse("ikea://navigation/cart/cart?view={view}&autoNavigate={autoNavigate}"));
        }
        if (match != 2) {
            return c.a(Uri.parse("ikea://navigation/cart/cart?view={view}&autoNavigate={autoNavigate}"));
        }
        Uri a10 = l.f65214b.a(uri);
        if (a10 != null) {
            return a10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
