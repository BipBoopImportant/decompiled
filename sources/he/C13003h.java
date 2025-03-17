package HE;

import com.optimizely.ab.config.IdKeyMapped;
import java.util.List;
import java.util.Map;

/* renamed from: HE.h  reason: case insensitive filesystem */
public class C13003h implements IdKeyMapped {

    /* renamed from: a  reason: collision with root package name */
    private String f110712a;

    /* renamed from: b  reason: collision with root package name */
    private String f110713b;

    /* renamed from: c  reason: collision with root package name */
    private List<C13002g> f110714c;

    /* renamed from: d  reason: collision with root package name */
    private List<C13002g> f110715d;
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    private Map<String, C13002g> f110716e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, C13004i> f110717f;

    public C13003h(String str, String str2, Map<String, C13002g> map, Map<String, C13004i> map2, List<C13002g> list, List<C13002g> list2) {
        this.f110712a = str;
        this.f110713b = str2;
        this.f110716e = map;
        this.f110717f = map2;
        this.f110715d = list;
        this.f110714c = list2;
    }

    public List<C13002g> a() {
        return this.f110714c;
    }

    public List<C13002g> b() {
        return this.f110715d;
    }

    @Deprecated
    public Map<String, C13002g> c() {
        return this.f110716e;
    }

    public Map<String, C13004i> d() {
        return this.f110717f;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13003h hVar = (C13003h) obj;
        return this.f110712a.equals(hVar.getId()) && this.f110713b.equals(hVar.getKey()) && this.f110716e.equals(hVar.c()) && this.f110717f.equals(hVar.d()) && this.f110715d.equals(hVar.b()) && this.f110714c.equals(hVar.a());
    }

    public String getId() {
        return this.f110712a;
    }

    public String getKey() {
        return this.f110713b;
    }

    public int hashCode() {
        return (this.f110712a.hashCode() * 31) + this.f110716e.hashCode() + this.f110717f.hashCode() + this.f110715d.hashCode() + this.f110714c.hashCode();
    }
}
