package gz;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15026t;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\nB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\r¨\u0006\u001a"}, d2 = {"Lgz/a;", "", "", "title", "aisle", "bin", "department", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lrz/t;", "a", "()Lrz/t;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "c", "d", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gz.a  reason: case insensitive filesystem */
public final class C14523a {

    /* renamed from: e  reason: collision with root package name */
    public static final C3132a f127378e = new C3132a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f127379a;

    /* renamed from: b  reason: collision with root package name */
    private final String f127380b;

    /* renamed from: c  reason: collision with root package name */
    private final String f127381c;

    /* renamed from: d  reason: collision with root package name */
    private final String f127382d;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lgz/a$a;", "", "<init>", "()V", "Lrz/t;", "itemLocation", "Lgz/a;", "a", "(Lrz/t;)Lgz/a;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gz.a$a  reason: collision with other inner class name */
    public static final class C3132a {
        public /* synthetic */ C3132a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C14523a a(C15026t tVar) {
            C17542s.j(tVar, "itemLocation");
            if (tVar instanceof C15026t.a) {
                C15026t.a aVar = (C15026t.a) tVar;
                return new C14523a(aVar.c(), aVar.a(), aVar.b(), (String) null, 8, (DefaultConstructorMarker) null);
            } else if (tVar instanceof C15026t.b) {
                C15026t.b bVar = (C15026t.b) tVar;
                return new C14523a(bVar.b(), (String) null, (String) null, bVar.a(), 6, (DefaultConstructorMarker) null);
            } else if (tVar instanceof C15026t.c) {
                return new C14523a((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            } else {
                throw new t();
            }
        }

        private C3132a() {
        }
    }

    public C14523a() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public final C15026t a() {
        return (this.f127379a.length() <= 0 || this.f127382d.length() <= 0) ? (this.f127379a.length() <= 0 || this.f127380b.length() <= 0 || this.f127381c.length() <= 0) ? C15026t.c.f130895a : new C15026t.a(this.f127379a, this.f127380b, this.f127381c) : new C15026t.b(this.f127379a, this.f127382d);
    }

    public final String b() {
        return this.f127380b;
    }

    public final String c() {
        return this.f127381c;
    }

    public final String d() {
        return this.f127382d;
    }

    public final String e() {
        return this.f127379a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14523a)) {
            return false;
        }
        C14523a aVar = (C14523a) obj;
        return C17542s.e(this.f127379a, aVar.f127379a) && C17542s.e(this.f127380b, aVar.f127380b) && C17542s.e(this.f127381c, aVar.f127381c) && C17542s.e(this.f127382d, aVar.f127382d);
    }

    public int hashCode() {
        return (((((this.f127379a.hashCode() * 31) + this.f127380b.hashCode()) * 31) + this.f127381c.hashCode()) * 31) + this.f127382d.hashCode();
    }

    public String toString() {
        String str = this.f127379a;
        String str2 = this.f127380b;
        String str3 = this.f127381c;
        String str4 = this.f127382d;
        return "ItemLocationModel(title=" + str + ", aisle=" + str2 + ", bin=" + str3 + ", department=" + str4 + ")";
    }

    public C14523a(String str, String str2, String str3, String str4) {
        C17542s.j(str, "title");
        C17542s.j(str2, "aisle");
        C17542s.j(str3, "bin");
        C17542s.j(str4, "department");
        this.f127379a = str;
        this.f127380b = str2;
        this.f127381c = str3;
        this.f127382d = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14523a(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? "" : str3, (i10 & 8) != 0 ? "" : str4);
    }
}
