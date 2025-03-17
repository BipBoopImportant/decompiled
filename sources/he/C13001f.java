package HE;

import com.optimizely.ab.config.IdKeyMapped;
import java.util.List;

/* renamed from: HE.f  reason: case insensitive filesystem */
public class C13001f implements IdKeyMapped {

    /* renamed from: a  reason: collision with root package name */
    private String f110705a;

    /* renamed from: b  reason: collision with root package name */
    private String f110706b;

    /* renamed from: c  reason: collision with root package name */
    private List<String> f110707c;

    public C13001f(String str, String str2, List<String> list) {
        this.f110705a = str;
        this.f110706b = str2;
        this.f110707c = list;
    }

    public List<String> a() {
        return this.f110707c;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13001f fVar = (C13001f) obj;
        return this.f110705a.equals(fVar.getId()) && this.f110706b.equals(fVar.getKey()) && this.f110707c.equals(fVar.a());
    }

    public String getId() {
        return this.f110705a;
    }

    public String getKey() {
        return this.f110706b;
    }

    public int hashCode() {
        return (this.f110705a.hashCode() * 31) + this.f110707c.hashCode();
    }
}
