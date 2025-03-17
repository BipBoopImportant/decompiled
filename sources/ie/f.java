package IE;

import JE.C13078a;
import com.optimizely.ab.d;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f110955a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f110956b;

    /* renamed from: c  reason: collision with root package name */
    private final C13078a f110957c;

    /* renamed from: d  reason: collision with root package name */
    private final String f110958d;

    /* renamed from: e  reason: collision with root package name */
    private final String f110959e;

    /* renamed from: f  reason: collision with root package name */
    private final d f110960f;

    /* renamed from: g  reason: collision with root package name */
    private List<String> f110961g;

    public f(String str, boolean z10, C13078a aVar, String str2, String str3, d dVar, List<String> list) {
        this.f110955a = str;
        this.f110956b = z10;
        this.f110957c = aVar;
        this.f110958d = str2;
        this.f110959e = str3;
        this.f110960f = dVar;
        this.f110961g = list;
    }

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static f i(String str, d dVar, String str2) {
        return new f((String) null, false, new C13078a((Map<String, Object>) Collections.emptyMap()), (String) null, str, dVar, Arrays.asList(new String[]{str2}));
    }

    public boolean b() {
        return this.f110956b;
    }

    public String c() {
        return this.f110959e;
    }

    public List<String> d() {
        return this.f110961g;
    }

    public String e() {
        return this.f110958d;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        f fVar = (f) obj;
        return a(this.f110955a, fVar.h()) && a(Boolean.valueOf(this.f110956b), Boolean.valueOf(fVar.b())) && a(this.f110957c, fVar.g()) && a(this.f110958d, fVar.e()) && a(this.f110959e, fVar.c()) && a(this.f110960f, fVar.f()) && a(this.f110961g, fVar.d());
    }

    public d f() {
        return this.f110960f;
    }

    public C13078a g() {
        return this.f110957c;
    }

    public String h() {
        return this.f110955a;
    }

    public int hashCode() {
        String str = this.f110955a;
        int i10 = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + (this.f110956b ? 1 : 0)) * 31) + this.f110957c.hashCode()) * 31;
        String str2 = this.f110958d;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return ((((((hashCode + i10) * 31) + this.f110959e.hashCode()) * 31) + this.f110960f.hashCode()) * 31) + this.f110961g.hashCode();
    }

    public String toString() {
        return "OptimizelyDecision {variationKey='" + this.f110955a + '\'' + ", enabled='" + this.f110956b + '\'' + ", variables='" + this.f110957c + '\'' + ", ruleKey='" + this.f110958d + '\'' + ", flagKey='" + this.f110959e + '\'' + ", userContext='" + this.f110960f + '\'' + ", enabled='" + this.f110956b + '\'' + ", reasons='" + this.f110961g + '\'' + '}';
    }
}
