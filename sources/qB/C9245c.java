package Qb;

import Qb.L;

/* renamed from: Qb.c  reason: case insensitive filesystem */
final class C9245c extends L.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f62968a;

    /* renamed from: b  reason: collision with root package name */
    private final String f62969b;

    /* renamed from: c  reason: collision with root package name */
    private final String f62970c;

    C9245c(String str, String str2, String str3) {
        if (str != null) {
            this.f62968a = str;
            this.f62969b = str2;
            this.f62970c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    public String c() {
        return this.f62968a;
    }

    public String d() {
        return this.f62970c;
    }

    public String e() {
        return this.f62969b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof L.a)) {
            return false;
        }
        L.a aVar = (L.a) obj;
        if (this.f62968a.equals(aVar.c()) && ((str = this.f62969b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f62970c;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f62968a.hashCode() ^ 1000003) * 1000003;
        String str = this.f62969b;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f62970c;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f62968a + ", firebaseInstallationId=" + this.f62969b + ", firebaseAuthenticationToken=" + this.f62970c + "}";
    }
}
