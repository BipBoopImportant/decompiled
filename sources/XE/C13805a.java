package XE;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0016\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\f¨\u0006\u001f"}, d2 = {"LXE/a;", "", "", "roomName", "subtitle", "", "iconResId", "Landroid/net/Uri;", "destinationDeeplinkUri", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/net/Uri;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "getSubtitle", "Ljava/lang/Integer;", "getIconResId", "()Ljava/lang/Integer;", "d", "Landroid/net/Uri;", "()Landroid/net/Uri;", "destinationDeeplink", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: XE.a  reason: case insensitive filesystem */
public final class C13805a {

    /* renamed from: a  reason: collision with root package name */
    private final String f117805a;

    /* renamed from: b  reason: collision with root package name */
    private final String f117806b;

    /* renamed from: c  reason: collision with root package name */
    private final Integer f117807c;

    /* renamed from: d  reason: collision with root package name */
    private final Uri f117808d;

    public C13805a(String str, String str2, Integer num, Uri uri) {
        C17542s.j(uri, "destinationDeeplinkUri");
        this.f117805a = str;
        this.f117806b = str2;
        this.f117807c = num;
        this.f117808d = uri;
    }

    public final String a() {
        String uri = this.f117808d.toString();
        C17542s.i(uri, "toString(...)");
        return uri;
    }

    public final Uri b() {
        return this.f117808d;
    }

    public final String c() {
        return this.f117805a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13805a)) {
            return false;
        }
        C13805a aVar = (C13805a) obj;
        return C17542s.e(this.f117805a, aVar.f117805a) && C17542s.e(this.f117806b, aVar.f117806b) && C17542s.e(this.f117807c, aVar.f117807c) && C17542s.e(this.f117808d, aVar.f117808d);
    }

    public int hashCode() {
        String str = this.f117805a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f117806b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f117807c;
        if (num != null) {
            i10 = num.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f117808d.hashCode();
    }

    public String toString() {
        String str = this.f117805a;
        String str2 = this.f117806b;
        Integer num = this.f117807c;
        Uri uri = this.f117808d;
        return "EntryAction(roomName=" + str + ", subtitle=" + str2 + ", iconResId=" + num + ", destinationDeeplinkUri=" + uri + ")";
    }
}
