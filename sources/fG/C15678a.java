package FG;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\tJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"LFG/a;", "", "", "name", "Landroid/net/Uri;", "thumbnail", "<init>", "(Ljava/lang/String;Landroid/net/Uri;)V", "a", "()Ljava/lang/String;", "b", "()Landroid/net/Uri;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getName", "Landroid/net/Uri;", "getThumbnail", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FG.a  reason: case insensitive filesystem */
public final class C15678a {

    /* renamed from: a  reason: collision with root package name */
    private final String f134296a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f134297b;

    public C15678a(String str, Uri uri) {
        C17542s.j(str, "name");
        this.f134296a = str;
        this.f134297b = uri;
    }

    public final String a() {
        return this.f134296a;
    }

    public final Uri b() {
        return this.f134297b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15678a)) {
            return false;
        }
        C15678a aVar = (C15678a) obj;
        return C17542s.e(this.f134296a, aVar.f134296a) && C17542s.e(this.f134297b, aVar.f134297b);
    }

    public int hashCode() {
        int hashCode = this.f134296a.hashCode() * 31;
        Uri uri = this.f134297b;
        return hashCode + (uri == null ? 0 : uri.hashCode());
    }

    public String toString() {
        String str = this.f134296a;
        Uri uri = this.f134297b;
        return "VariantAndImage(name=" + str + ", thumbnail=" + uri + ")";
    }
}
