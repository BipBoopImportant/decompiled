package aF;

import HJ.C15854t;
import YH.C16877v;
import android.content.UriMatcher;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.sugarcube.app.base.data.analytics.OpeningSource;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\u0006B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H@¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\u000e"}, d2 = {"LaF/X;", "", "<init>", "()V", "Landroid/net/Uri;", "uri", "a", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "b", "(Landroid/net/Uri;)Z", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aF.X  reason: case insensitive filesystem */
public final class C13960X {

    /* renamed from: b  reason: collision with root package name */
    public static final a f118795b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f118796c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final UriMatcher f118797a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"LaF/X$a;", "", "<init>", "()V", "", "MATCH", "I", "LEGACY_MATCH", "LEGACY_EXTERNAL_MATCH", "SHARE_LINK_MATCH", "SHARE_LINK_MATCH_LONG", "KREATIV_MATCH", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: aF.X$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C13960X() {
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("www.ikea.com", "/design-lab/share/*", 4);
        uriMatcher.addURI("www.ikea.com", "/design-lab/share/*/", 5);
        uriMatcher.addURI("www.ikea.com", "/design-lab/*", 3);
        uriMatcher.addURI("www.ikea.com", "/ikeaapp/design-lab/*", 1);
        uriMatcher.addURI("design-lab", "/*", 2);
        uriMatcher.addURI("kreativ", "gallery/open", 6);
        this.f118797a = uriMatcher;
    }

    public final Object a(Uri uri, C17164e<? super Uri> eVar) {
        Uri uri2;
        int match = this.f118797a.match(uri);
        if (match == 1) {
            String uri3 = uri.toString();
            C17542s.i(uri3, "toString(...)");
            uri2 = Uri.parse(C15854t.Q(uri3, "https://www.ikea.com/ikeaapp/", "ikea://", false, 4, (Object) null));
        } else if (match == 3) {
            String uri4 = uri.toString();
            C17542s.i(uri4, "toString(...)");
            uri2 = Uri.parse(C15854t.Q(uri4, "https://www.ikea.com/", "ikea://", false, 4, (Object) null));
        } else if (match == 4 || match == 5) {
            String uri5 = uri.toString();
            C17542s.i(uri5, "toString(...)");
            String uri6 = uri.toString();
            C17542s.i(uri6, "toString(...)");
            uri2 = Uri.parse(C15854t.Q(uri6, (String) C16877v.w0(C15854t.Y0(uri5, new String[]{"design-lab/share/"}, false, 0, 6, (Object) null)), "ikea://", false, 4, (Object) null));
        } else if (match != 6) {
            uri2 = uri;
        } else {
            String uri7 = uri.toString();
            C17542s.i(uri7, "toString(...)");
            uri2 = Uri.parse(C15854t.Q(uri7, "kreativ/gallery/open", "design-lab/gallery", false, 4, (Object) null));
        }
        Uri.Builder buildUpon = uri2.buildUpon();
        if (uri2.getQueryParameter("source") == null) {
            buildUpon.appendQueryParameter("source", OpeningSource.Link.key);
        }
        buildUpon.appendQueryParameter(Constants.DEEPLINK, uri.toString());
        Uri build = buildUpon.build();
        C17542s.g(build);
        return build;
    }

    public final boolean b(Uri uri) {
        C17542s.j(uri, "uri");
        return this.f118797a.match(uri) != -1;
    }
}
