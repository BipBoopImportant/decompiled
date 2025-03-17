package HE;

import java.util.List;
import java.util.Map;

/* renamed from: HE.c  reason: case insensitive filesystem */
public class C12998c {

    /* renamed from: a  reason: collision with root package name */
    private Map<String, C13002g> f110689a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, C13003h> f110690b;

    /* renamed from: c  reason: collision with root package name */
    private List<C12996a> f110691c;

    /* renamed from: d  reason: collision with root package name */
    private List<C13001f> f110692d;

    /* renamed from: e  reason: collision with root package name */
    private List<C12997b> f110693e;

    /* renamed from: f  reason: collision with root package name */
    private String f110694f;

    /* renamed from: g  reason: collision with root package name */
    private String f110695g;

    /* renamed from: h  reason: collision with root package name */
    private String f110696h;

    /* renamed from: i  reason: collision with root package name */
    private String f110697i;

    public C12998c(Map<String, C13002g> map, Map<String, C13003h> map2, String str, String str2, String str3, List<C12996a> list, List<C13001f> list2, List<C12997b> list3, String str4) {
        this.f110689a = map;
        this.f110690b = map2;
        this.f110694f = str;
        this.f110695g = str2 == null ? "" : str2;
        this.f110696h = str3 == null ? "" : str3;
        this.f110691c = list;
        this.f110692d = list2;
        this.f110693e = list3;
        this.f110697i = str4;
    }

    public List<C12996a> a() {
        return this.f110691c;
    }

    public List<C12997b> b() {
        return this.f110693e;
    }

    public List<C13001f> c() {
        return this.f110692d;
    }

    public Map<String, C13002g> d() {
        return this.f110689a;
    }

    public Map<String, C13003h> e() {
        return this.f110690b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C12998c cVar = (C12998c) obj;
        return this.f110694f.equals(cVar.f()) && this.f110689a.equals(cVar.d()) && this.f110690b.equals(cVar.e()) && this.f110691c.equals(cVar.a()) && this.f110692d.equals(cVar.c()) && this.f110693e.equals(cVar.b());
    }

    public String f() {
        return this.f110694f;
    }

    public int hashCode() {
        return (this.f110694f.hashCode() * 31) + this.f110689a.hashCode();
    }
}
