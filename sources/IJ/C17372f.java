package iJ;

import cJ.C17065b;
import kotlin.jvm.internal.C17542s;

/* renamed from: iJ.f  reason: case insensitive filesystem */
public final class C17372f {

    /* renamed from: a  reason: collision with root package name */
    private final C17065b f143500a;

    /* renamed from: b  reason: collision with root package name */
    private final int f143501b;

    public C17372f(C17065b bVar, int i10) {
        C17542s.j(bVar, "classId");
        this.f143500a = bVar;
        this.f143501b = i10;
    }

    public final C17065b a() {
        return this.f143500a;
    }

    public final int b() {
        return this.f143501b;
    }

    public final int c() {
        return this.f143501b;
    }

    public final C17065b d() {
        return this.f143500a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17372f)) {
            return false;
        }
        C17372f fVar = (C17372f) obj;
        return C17542s.e(this.f143500a, fVar.f143500a) && this.f143501b == fVar.f143501b;
    }

    public int hashCode() {
        return (this.f143500a.hashCode() * 31) + Integer.hashCode(this.f143501b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f143501b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f143500a);
        int i12 = this.f143501b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
