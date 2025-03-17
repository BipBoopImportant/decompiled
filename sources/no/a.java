package No;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0018\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0019"}, d2 = {"LNo/a;", "", "", "title", "description", "productsPLId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "Z", "()Z", "hasData", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f84168a;

    /* renamed from: b  reason: collision with root package name */
    private final String f84169b;

    /* renamed from: c  reason: collision with root package name */
    private final String f84170c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f84171d;

    public a(String str, String str2, String str3) {
        this.f84168a = str;
        this.f84169b = str2;
        this.f84170c = str3;
        this.f84171d = (str == null && str2 == null && str3 == null) ? false : true;
    }

    public final String a() {
        return this.f84169b;
    }

    public final boolean b() {
        return this.f84171d;
    }

    public final String c() {
        return this.f84170c;
    }

    public final String d() {
        return this.f84168a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return C17542s.e(this.f84168a, aVar.f84168a) && C17542s.e(this.f84169b, aVar.f84169b) && C17542s.e(this.f84170c, aVar.f84170c);
    }

    public int hashCode() {
        String str = this.f84168a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84169b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f84170c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f84168a;
        String str2 = this.f84169b;
        String str3 = this.f84170c;
        return "CarouselTitleUiModel(title=" + str + ", description=" + str2 + ", productsPLId=" + str3 + ")";
    }
}
