package HE;

/* renamed from: HE.b  reason: case insensitive filesystem */
public class C12997b {

    /* renamed from: a  reason: collision with root package name */
    private String f110686a;

    /* renamed from: b  reason: collision with root package name */
    private String f110687b;

    /* renamed from: c  reason: collision with root package name */
    private String f110688c;

    public C12997b(String str, String str2, String str3) {
        this.f110686a = str;
        this.f110687b = str2;
        this.f110688c = str3;
    }

    public String a() {
        return this.f110688c;
    }

    public String b() {
        return this.f110686a;
    }

    public String c() {
        return this.f110687b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C12997b bVar = (C12997b) obj;
        return this.f110686a.equals(bVar.b()) && this.f110687b.equals(bVar.c()) && this.f110688c.equals(bVar.a());
    }

    public int hashCode() {
        return (this.f110686a.hashCode() * 31) + this.f110688c.hashCode();
    }
}
