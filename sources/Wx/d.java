package wx;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018¨\u0006\u001c"}, d2 = {"Lwx/d;", "Lwx/c;", "", "text", "", "selected", "imageUrl", "itemNo", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "c", "()Ljava/lang/String;", "b", "a", "()Z", "d", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "Z", "getSelected", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f131770a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f131771b;

    /* renamed from: c  reason: collision with root package name */
    private final String f131772c;

    /* renamed from: d  reason: collision with root package name */
    private final String f131773d;

    public d(String str, boolean z10, String str2, String str3) {
        C17542s.j(str, "text");
        C17542s.j(str2, "imageUrl");
        C17542s.j(str3, "itemNo");
        this.f131770a = str;
        this.f131771b = z10;
        this.f131772c = str2;
        this.f131773d = str3;
    }

    public boolean a() {
        return this.f131771b;
    }

    public String b() {
        return this.f131770a;
    }

    public String c() {
        return this.f131773d;
    }

    public final String d() {
        return C15194b.b(this.f131772c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f131770a, dVar.f131770a) && this.f131771b == dVar.f131771b && C17542s.e(this.f131772c, dVar.f131772c) && C17542s.e(this.f131773d, dVar.f131773d);
    }

    public int hashCode() {
        return (((((this.f131770a.hashCode() * 31) + Boolean.hashCode(this.f131771b)) * 31) + this.f131772c.hashCode()) * 31) + this.f131773d.hashCode();
    }

    public String toString() {
        String str = this.f131770a;
        boolean z10 = this.f131771b;
        String str2 = this.f131772c;
        String str3 = this.f131773d;
        return "ValueImageRepresentation(text=" + str + ", selected=" + z10 + ", imageUrl=" + str2 + ", itemNo=" + str3 + ")";
    }
}
