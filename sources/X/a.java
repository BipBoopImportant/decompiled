package X;

import androidx.camera.core.impl.C5031k0;
import java.util.List;

final class a extends g {

    /* renamed from: a  reason: collision with root package name */
    private final int f14665a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14666b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C5031k0.a> f14667c;

    /* renamed from: d  reason: collision with root package name */
    private final List<C5031k0.c> f14668d;

    /* renamed from: e  reason: collision with root package name */
    private final C5031k0.a f14669e;

    /* renamed from: f  reason: collision with root package name */
    private final C5031k0.c f14670f;

    a(int i10, int i11, List<C5031k0.a> list, List<C5031k0.c> list2, C5031k0.a aVar, C5031k0.c cVar) {
        this.f14665a = i10;
        this.f14666b = i11;
        if (list != null) {
            this.f14667c = list;
            if (list2 != null) {
                this.f14668d = list2;
                this.f14669e = aVar;
                if (cVar != null) {
                    this.f14670f = cVar;
                    return;
                }
                throw new NullPointerException("Null defaultVideoProfile");
            }
            throw new NullPointerException("Null videoProfiles");
        }
        throw new NullPointerException("Null audioProfiles");
    }

    public int a() {
        return this.f14665a;
    }

    public List<C5031k0.c> b() {
        return this.f14668d;
    }

    public int e() {
        return this.f14666b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        r1 = r4.f14669e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof X.g
            r2 = 0
            if (r1 == 0) goto L_0x0057
            X.g r5 = (X.g) r5
            int r1 = r4.f14665a
            int r3 = r5.a()
            if (r1 != r3) goto L_0x0055
            int r1 = r4.f14666b
            int r3 = r5.e()
            if (r1 != r3) goto L_0x0055
            java.util.List<androidx.camera.core.impl.k0$a> r1 = r4.f14667c
            java.util.List r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            java.util.List<androidx.camera.core.impl.k0$c> r1 = r4.f14668d
            java.util.List r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
            androidx.camera.core.impl.k0$a r1 = r4.f14669e
            if (r1 != 0) goto L_0x003e
            androidx.camera.core.impl.k0$a r1 = r5.j()
            if (r1 != 0) goto L_0x0055
            goto L_0x0048
        L_0x003e:
            androidx.camera.core.impl.k0$a r3 = r5.j()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0055
        L_0x0048:
            androidx.camera.core.impl.k0$c r1 = r4.f14670f
            androidx.camera.core.impl.k0$c r5 = r5.k()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r0 = r2
        L_0x0056:
            return r0
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.a.equals(java.lang.Object):boolean");
    }

    public List<C5031k0.a> f() {
        return this.f14667c;
    }

    public int hashCode() {
        int hashCode = (((((((this.f14665a ^ 1000003) * 1000003) ^ this.f14666b) * 1000003) ^ this.f14667c.hashCode()) * 1000003) ^ this.f14668d.hashCode()) * 1000003;
        C5031k0.a aVar = this.f14669e;
        return ((hashCode ^ (aVar == null ? 0 : aVar.hashCode())) * 1000003) ^ this.f14670f.hashCode();
    }

    public C5031k0.a j() {
        return this.f14669e;
    }

    public C5031k0.c k() {
        return this.f14670f;
    }

    public String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f14665a + ", recommendedFileFormat=" + this.f14666b + ", audioProfiles=" + this.f14667c + ", videoProfiles=" + this.f14668d + ", defaultAudioProfile=" + this.f14669e + ", defaultVideoProfile=" + this.f14670f + "}";
    }
}
