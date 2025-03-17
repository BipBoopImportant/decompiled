package Tl;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LTl/b;", "", "Landroid/net/Uri;", "appLink", "webFallbackLink", "<init>", "(Landroid/net/Uri;Landroid/net/Uri;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/net/Uri;", "()Landroid/net/Uri;", "b", "linkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f87729a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f87730b;

    public b(Uri uri, Uri uri2) {
        C17542s.j(uri, "appLink");
        C17542s.j(uri2, "webFallbackLink");
        this.f87729a = uri;
        this.f87730b = uri2;
    }

    public final Uri a() {
        return this.f87729a;
    }

    public final Uri b() {
        return this.f87730b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f87729a, bVar.f87729a) && C17542s.e(this.f87730b, bVar.f87730b);
    }

    public int hashCode() {
        return (this.f87729a.hashCode() * 31) + this.f87730b.hashCode();
    }

    public String toString() {
        Uri uri = this.f87729a;
        Uri uri2 = this.f87730b;
        return "LinkItUris(appLink=" + uri + ", webFallbackLink=" + uri2 + ")";
    }
}
