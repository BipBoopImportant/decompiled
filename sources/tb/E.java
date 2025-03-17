package Tb;

import Tb.G;

final class E extends G.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f63455a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63456b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f63457c;

    E(String str, String str2, boolean z10) {
        if (str != null) {
            this.f63455a = str;
            if (str2 != null) {
                this.f63456b = str2;
                this.f63457c = z10;
                return;
            }
            throw new NullPointerException("Null osCodeName");
        }
        throw new NullPointerException("Null osRelease");
    }

    public boolean b() {
        return this.f63457c;
    }

    public String c() {
        return this.f63456b;
    }

    public String d() {
        return this.f63455a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.c)) {
            return false;
        }
        G.c cVar = (G.c) obj;
        return this.f63455a.equals(cVar.d()) && this.f63456b.equals(cVar.c()) && this.f63457c == cVar.b();
    }

    public int hashCode() {
        return ((((this.f63455a.hashCode() ^ 1000003) * 1000003) ^ this.f63456b.hashCode()) * 1000003) ^ (this.f63457c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f63455a + ", osCodeName=" + this.f63456b + ", isRooted=" + this.f63457c + "}";
    }
}
