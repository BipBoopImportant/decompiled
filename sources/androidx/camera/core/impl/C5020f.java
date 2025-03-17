package androidx.camera.core.impl;

import androidx.camera.core.impl.C5031k0;
import java.util.List;

/* renamed from: androidx.camera.core.impl.f  reason: case insensitive filesystem */
final class C5020f extends C5031k0.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f16892a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16893b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C5031k0.a> f16894c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C5031k0.c> f16895d;

    C5020f(int i10, int i11, List<C5031k0.a> list, List<C5031k0.c> list2) {
        this.f16892a = i10;
        this.f16893b = i11;
        if (list != null) {
            this.f16894c = list;
            if (list2 != null) {
                this.f16895d = list2;
                return;
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    public int a() {
        return this.f16892a;
    }

    public List<C5031k0.c> b() {
        return this.f16895d;
    }

    public int e() {
        return this.f16893b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5031k0.b)) {
            return false;
        }
        C5031k0.b bVar = (C5031k0.b) obj;
        return this.f16892a == bVar.a() && this.f16893b == bVar.e() && this.f16894c.equals(bVar.f()) && this.f16895d.equals(bVar.b());
    }

    public List<C5031k0.a> f() {
        return this.f16894c;
    }

    public int hashCode() {
        return ((((((this.f16892a ^ 1000003) * 1000003) ^ this.f16893b) * 1000003) ^ this.f16894c.hashCode()) * 1000003) ^ this.f16895d.hashCode();
    }

    public String toString() {
        return "ImmutableEncoderProfilesProxy{defaultDurationSeconds=" + this.f16892a + ", recommendedFileFormat=" + this.f16893b + ", audioProfiles=" + this.f16894c + ", videoProfiles=" + this.f16895d + "}";
    }
}
