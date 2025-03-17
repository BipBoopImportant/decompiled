package HE;

import com.optimizely.ab.config.IdKeyMapped;

/* renamed from: HE.a  reason: case insensitive filesystem */
public class C12996a implements IdKeyMapped {

    /* renamed from: a  reason: collision with root package name */
    private String f110684a;

    /* renamed from: b  reason: collision with root package name */
    private String f110685b;

    public C12996a(String str, String str2) {
        this.f110684a = str;
        this.f110685b = str2;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C12996a aVar = (C12996a) obj;
        return this.f110684a.equals(aVar.getId()) && this.f110685b.equals(aVar.getKey());
    }

    public String getId() {
        return this.f110684a;
    }

    public String getKey() {
        return this.f110685b;
    }

    public int hashCode() {
        return (this.f110684a.hashCode() * 31) + this.f110685b.hashCode();
    }
}
