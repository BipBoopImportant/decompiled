package Zx;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001a\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u000f¨\u0006$"}, d2 = {"LZx/a;", "", "", "title", "body", "imageUrl", "messageId", "", "sentTime", "", "data", "purpose", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "c", "d", "e", "J", "()J", "Ljava/util/Map;", "()Ljava/util/Map;", "g", "getPurpose", "pushnotification_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f118440a;

    /* renamed from: b  reason: collision with root package name */
    private final String f118441b;

    /* renamed from: c  reason: collision with root package name */
    private final String f118442c;

    /* renamed from: d  reason: collision with root package name */
    private final String f118443d;

    /* renamed from: e  reason: collision with root package name */
    private final long f118444e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f118445f;

    /* renamed from: g  reason: collision with root package name */
    private final String f118446g;

    public a(String str, String str2, String str3, String str4, long j10, Map<String, String> map, String str5) {
        C17542s.j(str, "title");
        C17542s.j(str2, "body");
        C17542s.j(str4, "messageId");
        C17542s.j(map, "data");
        C17542s.j(str5, "purpose");
        this.f118440a = str;
        this.f118441b = str2;
        this.f118442c = str3;
        this.f118443d = str4;
        this.f118444e = j10;
        this.f118445f = map;
        this.f118446g = str5;
    }

    public final String a() {
        return this.f118441b;
    }

    public final Map<String, String> b() {
        return this.f118445f;
    }

    public final String c() {
        return this.f118442c;
    }

    public final String d() {
        return this.f118443d;
    }

    public final long e() {
        return this.f118444e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f118440a, aVar.f118440a) && C17542s.e(this.f118441b, aVar.f118441b) && C17542s.e(this.f118442c, aVar.f118442c) && C17542s.e(this.f118443d, aVar.f118443d) && this.f118444e == aVar.f118444e && C17542s.e(this.f118445f, aVar.f118445f) && C17542s.e(this.f118446g, aVar.f118446g);
    }

    public final String f() {
        return this.f118440a;
    }

    public int hashCode() {
        int hashCode = ((this.f118440a.hashCode() * 31) + this.f118441b.hashCode()) * 31;
        String str = this.f118442c;
        return ((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f118443d.hashCode()) * 31) + Long.hashCode(this.f118444e)) * 31) + this.f118445f.hashCode()) * 31) + this.f118446g.hashCode();
    }

    public String toString() {
        String str = this.f118440a;
        String str2 = this.f118441b;
        String str3 = this.f118442c;
        String str4 = this.f118443d;
        long j10 = this.f118444e;
        Map<String, String> map = this.f118445f;
        String str5 = this.f118446g;
        return "PushNotification(title=" + str + ", body=" + str2 + ", imageUrl=" + str3 + ", messageId=" + str4 + ", sentTime=" + j10 + ", data=" + map + ", purpose=" + str5 + ")";
    }
}
