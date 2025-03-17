package Gr;

import HJ.C15854t;
import Zl.b;
import aF.C13960X;
import android.content.UriMatcher;
import android.net.Uri;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"LGr/a;", "LZl/a;", "LaF/X;", "sugarcubeApplinkMapper", "<init>", "(LaF/X;)V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "LaF/X;", "Landroid/content/UriMatcher;", "c", "Landroid/content/UriMatcher;", "uriMatcher", "d", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zl.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C1581a f81193d = new C1581a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f81194e = 8;

    /* renamed from: b  reason: collision with root package name */
    private final C13960X f81195b;

    /* renamed from: c  reason: collision with root package name */
    private final UriMatcher f81196c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006XT¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"LGr/a$a;", "", "<init>", "()V", "", "KREATIV_MATCH", "I", "", "KREATIV_AUTHORITY", "Ljava/lang/String;", "KREATIV_PATH", "KREATIV_INTERNAL_PATH", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Gr.a$a  reason: collision with other inner class name */
    public static final class C1581a {
        public /* synthetic */ C1581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1581a() {
        }
    }

    public a(C13960X x10) {
        C17542s.j(x10, "sugarcubeApplinkMapper");
        this.f81195b = x10;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("kreativ", "gallery/open", 1);
        this.f81196c = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return b.a(this.f81196c, uri) || this.f81195b.b(uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        if (this.f81196c.match(uri) == 1) {
            String uri2 = uri.toString();
            C17542s.i(uri2, "toString(...)");
            uri = Uri.parse(C15854t.Q(uri2, "kreativ/gallery/open", "design-lab/gallery", false, 4, (Object) null));
        }
        return this.f81195b.a(uri, eVar);
    }
}
