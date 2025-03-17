package MI;

import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import YH.X;
import cJ.C17066c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: MI.G  reason: case insensitive filesystem */
public final class C16046G {

    /* renamed from: a  reason: collision with root package name */
    private final C16054O f136279a;

    /* renamed from: b  reason: collision with root package name */
    private final C16054O f136280b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<C17066c, C16054O> f136281c;

    /* renamed from: d  reason: collision with root package name */
    private final C16824o f136282d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f136283e;

    public C16046G(C16054O o10, C16054O o11, Map<C17066c, ? extends C16054O> map) {
        C17542s.j(o10, "globalLevel");
        C17542s.j(map, "userDefinedLevelForSpecificAnnotation");
        this.f136279a = o10;
        this.f136280b = o11;
        this.f136281c = map;
        this.f136282d = C16825p.b(new C16045F(this));
        C16054O o12 = C16054O.IGNORE;
        this.f136283e = o10 == o12 && o11 == o12 && map.isEmpty();
    }

    /* access modifiers changed from: private */
    public static final String[] b(C16046G g10) {
        List c10 = C16877v.c();
        c10.add(g10.f136279a.b());
        C16054O o10 = g10.f136280b;
        if (o10 != null) {
            c10.add("under-migration:" + o10.b());
        }
        for (Map.Entry next : g10.f136281c.entrySet()) {
            c10.add('@' + next.getKey() + ':' + ((C16054O) next.getValue()).b());
        }
        return (String[]) C16877v.a(c10).toArray(new String[0]);
    }

    public final C16054O c() {
        return this.f136279a;
    }

    public final C16054O d() {
        return this.f136280b;
    }

    public final Map<C17066c, C16054O> e() {
        return this.f136281c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16046G)) {
            return false;
        }
        C16046G g10 = (C16046G) obj;
        return this.f136279a == g10.f136279a && this.f136280b == g10.f136280b && C17542s.e(this.f136281c, g10.f136281c);
    }

    public final boolean f() {
        return this.f136283e;
    }

    public int hashCode() {
        int hashCode = this.f136279a.hashCode() * 31;
        C16054O o10 = this.f136280b;
        return ((hashCode + (o10 == null ? 0 : o10.hashCode())) * 31) + this.f136281c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f136279a + ", migrationLevel=" + this.f136280b + ", userDefinedLevelForSpecificAnnotation=" + this.f136281c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16046G(C16054O o10, C16054O o11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? null : o11, (i10 & 4) != 0 ? X.j() : map);
    }
}
