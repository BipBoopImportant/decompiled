package Qq;

import com.ingka.ikea.core.model.Image;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0017\u001a\u0004\b\u001f\u0010\u000eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u0017\u001a\u0004\b%\u0010\u000eR\u001a\u0010)\u001a\u00020&8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b$\u0010(¨\u0006*"}, d2 = {"LQq/r;", "LQq/h;", "", "id", "title", "", "keys", "frequency", "Lcom/ingka/ikea/core/model/Image;", "image", "readMoreUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "i", "c", "I", "h", "d", "g", "e", "Lcom/ingka/ikea/core/model/Image;", "k", "()Lcom/ingka/ikea/core/model/Image;", "f", "getReadMoreUrl", "", "J", "()J", "stableId", "familyrewards-datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends h {

    /* renamed from: a  reason: collision with root package name */
    private final String f86204a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86205b;

    /* renamed from: c  reason: collision with root package name */
    private final int f86206c;

    /* renamed from: d  reason: collision with root package name */
    private final String f86207d;

    /* renamed from: e  reason: collision with root package name */
    private final Image f86208e;

    /* renamed from: f  reason: collision with root package name */
    private final String f86209f;

    /* renamed from: g  reason: collision with root package name */
    private final long f86210g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(String str, String str2, int i10, String str3, Image image, String str4) {
        super((DefaultConstructorMarker) null);
        C17542s.j(str, "id");
        C17542s.j(str2, "title");
        C17542s.j(str3, "frequency");
        this.f86204a = str;
        this.f86205b = str2;
        this.f86206c = i10;
        this.f86207d = str3;
        this.f86208e = image;
        this.f86209f = str4;
        U u10 = new U(3);
        u10.a(P.b(r.class));
        u10.a(str);
        u10.b(new Object[0]);
        this.f86210g = (long) Objects.hash(u10.d(new Object[u10.c()]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return C17542s.e(this.f86204a, rVar.f86204a) && C17542s.e(this.f86205b, rVar.f86205b) && this.f86206c == rVar.f86206c && C17542s.e(this.f86207d, rVar.f86207d) && C17542s.e(this.f86208e, rVar.f86208e) && C17542s.e(this.f86209f, rVar.f86209f);
    }

    public long f() {
        return this.f86210g;
    }

    public final String g() {
        return this.f86207d;
    }

    public final int h() {
        return this.f86206c;
    }

    public int hashCode() {
        int hashCode = ((((((this.f86204a.hashCode() * 31) + this.f86205b.hashCode()) * 31) + Integer.hashCode(this.f86206c)) * 31) + this.f86207d.hashCode()) * 31;
        Image image = this.f86208e;
        int i10 = 0;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str = this.f86209f;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public final String i() {
        return this.f86205b;
    }

    public final Image k() {
        return this.f86208e;
    }

    public String toString() {
        String str = this.f86204a;
        String str2 = this.f86205b;
        int i10 = this.f86206c;
        String str3 = this.f86207d;
        Image image = this.f86208e;
        String str4 = this.f86209f;
        return "RewardingInteraction(id=" + str + ", title=" + str2 + ", keys=" + i10 + ", frequency=" + str3 + ", image=" + image + ", readMoreUrl=" + str4 + ")";
    }
}
