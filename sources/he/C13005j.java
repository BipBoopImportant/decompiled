package HE;

import com.optimizely.ab.config.IdKeyMapped;
import java.util.Map;

/* renamed from: HE.j  reason: case insensitive filesystem */
public class C13005j implements IdKeyMapped {

    /* renamed from: a  reason: collision with root package name */
    private String f110722a;

    /* renamed from: b  reason: collision with root package name */
    private String f110723b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f110724c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, C13004i> f110725d;

    public C13005j(String str, String str2, Boolean bool, Map<String, C13004i> map) {
        this.f110722a = str;
        this.f110723b = str2;
        this.f110724c = bool;
        this.f110725d = map;
    }

    public Map<String, C13004i> a() {
        return this.f110725d;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13005j jVar = (C13005j) obj;
        return this.f110722a.equals(jVar.getId()) && this.f110723b.equals(jVar.getKey()) && this.f110725d.equals(jVar.a());
    }

    public String getId() {
        return this.f110722a;
    }

    public String getKey() {
        return this.f110723b;
    }

    public int hashCode() {
        return (this.f110722a.hashCode() * 31) + this.f110725d.hashCode();
    }
}
