package gz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0019"}, d2 = {"Lgz/b;", "", "", "title", "coupon", "", "rawValue", "<init>", "(Ljava/lang/String;Ljava/lang/String;D)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "D", "()D", "d", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gz.b  reason: case insensitive filesystem */
public final class C14524b {

    /* renamed from: d  reason: collision with root package name */
    public static final a f127383d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f127384a;

    /* renamed from: b  reason: collision with root package name */
    private final String f127385b;

    /* renamed from: c  reason: collision with root package name */
    private final double f127386c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgz/b$a;", "", "<init>", "()V", "", "TABLE_NAME", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gz.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C14524b(String str, String str2, double d10) {
        C17542s.j(str, "title");
        this.f127384a = str;
        this.f127385b = str2;
        this.f127386c = d10;
    }

    public final String a() {
        return this.f127385b;
    }

    public final double b() {
        return this.f127386c;
    }

    public final String c() {
        return this.f127384a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14524b)) {
            return false;
        }
        C14524b bVar = (C14524b) obj;
        return C17542s.e(this.f127384a, bVar.f127384a) && C17542s.e(this.f127385b, bVar.f127385b) && Double.compare(this.f127386c, bVar.f127386c) == 0;
    }

    public int hashCode() {
        int hashCode = this.f127384a.hashCode() * 31;
        String str = this.f127385b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.f127386c);
    }

    public String toString() {
        String str = this.f127384a;
        String str2 = this.f127385b;
        double d10 = this.f127386c;
        return "ScanAndGoCartDiscountsEntity(title=" + str + ", coupon=" + str2 + ", rawValue=" + d10 + ")";
    }
}
