package Ps;

import com.ingka.ikea.core.model.Image;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u0017\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001c\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b\u001d\u0010#¨\u0006$"}, d2 = {"LPs/c;", "", "", "messageId", "title", "body", "", "createdAt", "", "data", "Lcom/ingka/ikea/core/model/Image;", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lcom/ingka/ikea/core/model/Image;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "f", "c", "d", "J", "()J", "Ljava/util/Map;", "()Ljava/util/Map;", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "inboxrepository_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f85775a;

    /* renamed from: b  reason: collision with root package name */
    private final String f85776b;

    /* renamed from: c  reason: collision with root package name */
    private final String f85777c;

    /* renamed from: d  reason: collision with root package name */
    private final long f85778d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f85779e;

    /* renamed from: f  reason: collision with root package name */
    private final Image f85780f;

    public c(String str, String str2, String str3, long j10, Map<String, String> map, Image image) {
        C17542s.j(str, "messageId");
        C17542s.j(str2, "title");
        C17542s.j(str3, "body");
        C17542s.j(map, "data");
        this.f85775a = str;
        this.f85776b = str2;
        this.f85777c = str3;
        this.f85778d = j10;
        this.f85779e = map;
        this.f85780f = image;
    }

    public final String a() {
        return this.f85777c;
    }

    public final long b() {
        return this.f85778d;
    }

    public final Map<String, String> c() {
        return this.f85779e;
    }

    public final Image d() {
        return this.f85780f;
    }

    public final String e() {
        return this.f85775a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f85775a, cVar.f85775a) && C17542s.e(this.f85776b, cVar.f85776b) && C17542s.e(this.f85777c, cVar.f85777c) && this.f85778d == cVar.f85778d && C17542s.e(this.f85779e, cVar.f85779e) && C17542s.e(this.f85780f, cVar.f85780f);
    }

    public final String f() {
        return this.f85776b;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f85775a.hashCode() * 31) + this.f85776b.hashCode()) * 31) + this.f85777c.hashCode()) * 31) + Long.hashCode(this.f85778d)) * 31) + this.f85779e.hashCode()) * 31;
        Image image = this.f85780f;
        return hashCode + (image == null ? 0 : image.hashCode());
    }

    public String toString() {
        String str = this.f85775a;
        String str2 = this.f85776b;
        String str3 = this.f85777c;
        long j10 = this.f85778d;
        Map<String, String> map = this.f85779e;
        Image image = this.f85780f;
        return "InboxMessage(messageId=" + str + ", title=" + str2 + ", body=" + str3 + ", createdAt=" + j10 + ", data=" + map + ", image=" + image + ")";
    }
}
