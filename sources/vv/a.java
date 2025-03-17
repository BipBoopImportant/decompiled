package Vv;

import Zl.b;
import android.content.UriMatcher;
import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow.c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u000f2\u00020\u0001:\u0001\nB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00040\u00042\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0010"}, d2 = {"LVv/a;", "LZl/a;", "<init>", "()V", "Landroid/net/Uri;", "uri", "kotlin.jvm.PlatformType", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "c", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zl.a {

    /* renamed from: c  reason: collision with root package name */
    public static final C0670a f40499c = new C0670a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f40500d = 8;

    /* renamed from: b  reason: collision with root package name */
    private final UriMatcher f40501b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LVv/a$a;", "", "<init>", "()V", "", "MEMBERSHIP", "I", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Vv.a$a  reason: collision with other inner class name */
    public static final class C0670a {
        public /* synthetic */ C0670a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0670a() {
        }
    }

    public a() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("www.ikea.com", "/ikeaapp/membership", 1);
        uriMatcher.addURI("membership", "/open", 1);
        this.f40501b = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return b.a(this.f40501b, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        return this.f40501b.match(uri) == 1 ? c.a(Uri.parse("ikea://navigation/membership/membership_page")) : Uri.EMPTY;
    }
}
