package Tb;

import Tb.G;

final class D extends G.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f63446a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63447b;

    /* renamed from: c  reason: collision with root package name */
    private final int f63448c;

    /* renamed from: d  reason: collision with root package name */
    private final long f63449d;

    /* renamed from: e  reason: collision with root package name */
    private final long f63450e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f63451f;

    /* renamed from: g  reason: collision with root package name */
    private final int f63452g;

    /* renamed from: h  reason: collision with root package name */
    private final String f63453h;

    /* renamed from: i  reason: collision with root package name */
    private final String f63454i;

    D(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f63446a = i10;
        if (str != null) {
            this.f63447b = str;
            this.f63448c = i11;
            this.f63449d = j10;
            this.f63450e = j11;
            this.f63451f = z10;
            this.f63452g = i12;
            if (str2 != null) {
                this.f63453h = str2;
                if (str3 != null) {
                    this.f63454i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public int a() {
        return this.f63446a;
    }

    public int b() {
        return this.f63448c;
    }

    public long d() {
        return this.f63450e;
    }

    public boolean e() {
        return this.f63451f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G.b)) {
            return false;
        }
        G.b bVar = (G.b) obj;
        return this.f63446a == bVar.a() && this.f63447b.equals(bVar.g()) && this.f63448c == bVar.b() && this.f63449d == bVar.j() && this.f63450e == bVar.d() && this.f63451f == bVar.e() && this.f63452g == bVar.i() && this.f63453h.equals(bVar.f()) && this.f63454i.equals(bVar.h());
    }

    public String f() {
        return this.f63453h;
    }

    public String g() {
        return this.f63447b;
    }

    public String h() {
        return this.f63454i;
    }

    public int hashCode() {
        long j10 = this.f63449d;
        long j11 = this.f63450e;
        return ((((((((((((((((this.f63446a ^ 1000003) * 1000003) ^ this.f63447b.hashCode()) * 1000003) ^ this.f63448c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f63451f ? 1231 : 1237)) * 1000003) ^ this.f63452g) * 1000003) ^ this.f63453h.hashCode()) * 1000003) ^ this.f63454i.hashCode();
    }

    public int i() {
        return this.f63452g;
    }

    public long j() {
        return this.f63449d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f63446a + ", model=" + this.f63447b + ", availableProcessors=" + this.f63448c + ", totalRam=" + this.f63449d + ", diskSpace=" + this.f63450e + ", isEmulator=" + this.f63451f + ", state=" + this.f63452g + ", manufacturer=" + this.f63453h + ", modelClass=" + this.f63454i + "}";
    }
}
