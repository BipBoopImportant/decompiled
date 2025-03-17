package HE;

import com.optimizely.ab.config.IdKeyMapped;
import java.util.Map;

/* renamed from: HE.g  reason: case insensitive filesystem */
public class C13002g implements IdKeyMapped {

    /* renamed from: a  reason: collision with root package name */
    private String f110708a;

    /* renamed from: b  reason: collision with root package name */
    private String f110709b;

    /* renamed from: c  reason: collision with root package name */
    private String f110710c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, C13005j> f110711d;

    public C13002g(String str, String str2, Map<String, C13005j> map, String str3) {
        this.f110708a = str;
        this.f110709b = str2;
        this.f110711d = map;
        this.f110710c = str3;
    }

    public String a() {
        return this.f110710c;
    }

    public Map<String, C13005j> b() {
        return this.f110711d;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13002g gVar = (C13002g) obj;
        return this.f110708a.equals(gVar.getId()) && this.f110709b.equals(gVar.getKey()) && this.f110711d.equals(gVar.b()) && this.f110710c.equals(gVar.a());
    }

    public String getId() {
        return this.f110708a;
    }

    public String getKey() {
        return this.f110709b;
    }

    public int hashCode() {
        return (this.f110708a.hashCode() * 31) + this.f110711d.hashCode();
    }
}
