package gz;

import Sy.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.O;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001c"}, d2 = {"Lgz/f;", "", "", "barcode", "Lrz/O;", "scanType", "LSy/a$b;", "productAssortmentSpecialType", "<init>", "(Ljava/lang/String;Lrz/O;LSy/a$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lrz/O;", "c", "()Lrz/O;", "LSy/a$b;", "()LSy/a$b;", "d", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f127419d = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f127420a;

    /* renamed from: b  reason: collision with root package name */
    private final O f127421b;

    /* renamed from: c  reason: collision with root package name */
    private final a.b f127422c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgz/f$a;", "", "<init>", "()V", "", "TABLE_NAME", "Ljava/lang/String;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public f(String str, O o10, a.b bVar) {
        C17542s.j(str, "barcode");
        this.f127420a = str;
        this.f127421b = o10;
        this.f127422c = bVar;
    }

    public final String a() {
        return this.f127420a;
    }

    public final a.b b() {
        return this.f127422c;
    }

    public final O c() {
        return this.f127421b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f127420a, fVar.f127420a) && this.f127421b == fVar.f127421b && this.f127422c == fVar.f127422c;
    }

    public int hashCode() {
        int hashCode = this.f127420a.hashCode() * 31;
        O o10 = this.f127421b;
        int i10 = 0;
        int hashCode2 = (hashCode + (o10 == null ? 0 : o10.hashCode())) * 31;
        a.b bVar = this.f127422c;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f127420a;
        O o10 = this.f127421b;
        a.b bVar = this.f127422c;
        return "ScanTypeDatabaseModel(barcode=" + str + ", scanType=" + o10 + ", productAssortmentSpecialType=" + bVar + ")";
    }
}
