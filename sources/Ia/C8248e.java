package ia;

/* renamed from: ia.e  reason: case insensitive filesystem */
final class C8248e implements C8283j {

    /* renamed from: a  reason: collision with root package name */
    private final int f53558a;

    /* renamed from: b  reason: collision with root package name */
    private final C8276i f53559b;

    C8248e(int i10, C8276i iVar) {
        this.f53558a = i10;
        this.f53559b = iVar;
    }

    public final Class annotationType() {
        return C8283j.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8283j)) {
            return false;
        }
        C8283j jVar = (C8283j) obj;
        return this.f53558a == jVar.zza() && this.f53559b.equals(jVar.zzb());
    }

    public final int hashCode() {
        return (this.f53558a ^ 14552422) + (this.f53559b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f53558a + "intEncoding=" + this.f53559b + ')';
    }

    public final int zza() {
        return this.f53558a;
    }

    public final C8276i zzb() {
        return this.f53559b;
    }
}
