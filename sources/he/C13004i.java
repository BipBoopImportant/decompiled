package HE;

import com.optimizely.ab.config.IdKeyMapped;

/* renamed from: HE.i  reason: case insensitive filesystem */
public class C13004i implements IdKeyMapped {

    /* renamed from: a  reason: collision with root package name */
    private String f110718a;

    /* renamed from: b  reason: collision with root package name */
    private String f110719b;

    /* renamed from: c  reason: collision with root package name */
    private String f110720c;

    /* renamed from: d  reason: collision with root package name */
    private String f110721d;

    public C13004i(String str, String str2, String str3, String str4) {
        this.f110718a = str;
        this.f110719b = str2;
        this.f110720c = str3;
        this.f110721d = str4;
    }

    public String a() {
        return this.f110721d;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13004i iVar = (C13004i) obj;
        return this.f110718a.equals(iVar.getId()) && this.f110721d.equals(iVar.a());
    }

    public String getId() {
        return this.f110718a;
    }

    public String getKey() {
        return this.f110719b;
    }

    public int hashCode() {
        return (this.f110718a.hashCode() * 31) + this.f110721d.hashCode();
    }
}
