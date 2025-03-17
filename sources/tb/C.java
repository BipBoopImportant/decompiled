package Tb;

import Nb.f;
import Tb.G;

final class C extends G.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f63440a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63441b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63442c;

    /* renamed from: d  reason: collision with root package name */
    private final String f63443d;

    /* renamed from: e  reason: collision with root package name */
    private final int f63444e;

    /* renamed from: f  reason: collision with root package name */
    private final f f63445f;

    C(String str, String str2, String str3, String str4, int i10, f fVar) {
        if (str != null) {
            this.f63440a = str;
            if (str2 != null) {
                this.f63441b = str2;
                if (str3 != null) {
                    this.f63442c = str3;
                    if (str4 != null) {
                        this.f63443d = str4;
                        this.f63444e = i10;
                        if (fVar != null) {
                            this.f63445f = fVar;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public String a() {
        return this.f63440a;
    }

    public int c() {
        return this.f63444e;
    }

    public f d() {
        return this.f63445f;
    }

    public String e() {
        return this.f63443d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.a)) {
            return false;
        }
        G.a aVar = (G.a) obj;
        return this.f63440a.equals(aVar.a()) && this.f63441b.equals(aVar.f()) && this.f63442c.equals(aVar.g()) && this.f63443d.equals(aVar.e()) && this.f63444e == aVar.c() && this.f63445f.equals(aVar.d());
    }

    public String f() {
        return this.f63441b;
    }

    public String g() {
        return this.f63442c;
    }

    public int hashCode() {
        return ((((((((((this.f63440a.hashCode() ^ 1000003) * 1000003) ^ this.f63441b.hashCode()) * 1000003) ^ this.f63442c.hashCode()) * 1000003) ^ this.f63443d.hashCode()) * 1000003) ^ this.f63444e) * 1000003) ^ this.f63445f.hashCode();
    }

    public String toString() {
        return "AppData{appIdentifier=" + this.f63440a + ", versionCode=" + this.f63441b + ", versionName=" + this.f63442c + ", installUuid=" + this.f63443d + ", deliveryMechanism=" + this.f63444e + ", developmentPlatformProvider=" + this.f63445f + "}";
    }
}
