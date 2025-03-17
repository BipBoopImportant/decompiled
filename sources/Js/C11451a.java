package js;

import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0017\u001a\u0004\b!\u0010\u000e¨\u0006\""}, d2 = {"Ljs/a;", "", "", "id", "title", "body", "createdAt", "updatedAt", "Lcom/ingka/ikea/core/model/Image;", "image", "purpose", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "getUpdatedAt", "f", "Lcom/ingka/ikea/core/model/Image;", "()Lcom/ingka/ikea/core/model/Image;", "g", "getPurpose", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: js.a  reason: case insensitive filesystem */
public final class C11451a {

    /* renamed from: a  reason: collision with root package name */
    private final String f98691a;

    /* renamed from: b  reason: collision with root package name */
    private final String f98692b;

    /* renamed from: c  reason: collision with root package name */
    private final String f98693c;

    /* renamed from: d  reason: collision with root package name */
    private final String f98694d;

    /* renamed from: e  reason: collision with root package name */
    private final String f98695e;

    /* renamed from: f  reason: collision with root package name */
    private final Image f98696f;

    /* renamed from: g  reason: collision with root package name */
    private final String f98697g;

    public C11451a(String str, String str2, String str3, String str4, String str5, Image image, String str6) {
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        C17542s.j(str3, "body");
        C17542s.j(str4, "createdAt");
        C17542s.j(str5, "updatedAt");
        C17542s.j(image, "image");
        C17542s.j(str6, "purpose");
        this.f98691a = str;
        this.f98692b = str2;
        this.f98693c = str3;
        this.f98694d = str4;
        this.f98695e = str5;
        this.f98696f = image;
        this.f98697g = str6;
    }

    public final String a() {
        return this.f98693c;
    }

    public final String b() {
        return this.f98694d;
    }

    public final String c() {
        return this.f98691a;
    }

    public final Image d() {
        return this.f98696f;
    }

    public final String e() {
        return this.f98692b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11451a)) {
            return false;
        }
        C11451a aVar = (C11451a) obj;
        return C17542s.e(this.f98691a, aVar.f98691a) && C17542s.e(this.f98692b, aVar.f98692b) && C17542s.e(this.f98693c, aVar.f98693c) && C17542s.e(this.f98694d, aVar.f98694d) && C17542s.e(this.f98695e, aVar.f98695e) && C17542s.e(this.f98696f, aVar.f98696f) && C17542s.e(this.f98697g, aVar.f98697g);
    }

    public int hashCode() {
        return (((((((((((this.f98691a.hashCode() * 31) + this.f98692b.hashCode()) * 31) + this.f98693c.hashCode()) * 31) + this.f98694d.hashCode()) * 31) + this.f98695e.hashCode()) * 31) + this.f98696f.hashCode()) * 31) + this.f98697g.hashCode();
    }

    public String toString() {
        String str = this.f98691a;
        String str2 = this.f98692b;
        String str3 = this.f98693c;
        String str4 = this.f98694d;
        String str5 = this.f98695e;
        Image image = this.f98696f;
        String str6 = this.f98697g;
        return "CommunicationPost(id=" + str + ", title=" + str2 + ", body=" + str3 + ", createdAt=" + str4 + ", updatedAt=" + str5 + ", image=" + image + ", purpose=" + str6 + ")";
    }
}
