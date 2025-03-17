package ha;

final class N0 implements S0 {

    /* renamed from: a  reason: collision with root package name */
    private final int f52055a;

    /* renamed from: b  reason: collision with root package name */
    private final R0 f52056b;

    N0(int i10, R0 r02) {
        this.f52055a = i10;
        this.f52056b = r02;
    }

    public final Class annotationType() {
        return S0.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof S0)) {
            return false;
        }
        S0 s02 = (S0) obj;
        return this.f52055a == s02.zza() && this.f52056b.equals(s02.zzb());
    }

    public final int hashCode() {
        return (this.f52055a ^ 14552422) + (this.f52056b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f52055a + "intEncoding=" + this.f52056b + ')';
    }

    public final int zza() {
        return this.f52055a;
    }

    public final R0 zzb() {
        return this.f52056b;
    }
}
