package androidx.camera.core.impl;

import android.util.Size;
import java.util.Map;

/* renamed from: androidx.camera.core.impl.o  reason: case insensitive filesystem */
final class C5038o extends f1 {

    /* renamed from: a  reason: collision with root package name */
    private final Size f16966a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Integer, Size> f16967b;

    /* renamed from: c  reason: collision with root package name */
    private final Size f16968c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<Integer, Size> f16969d;

    /* renamed from: e  reason: collision with root package name */
    private final Size f16970e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<Integer, Size> f16971f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, Size> f16972g;

    C5038o(Size size, Map<Integer, Size> map, Size size2, Map<Integer, Size> map2, Size size3, Map<Integer, Size> map3, Map<Integer, Size> map4) {
        if (size != null) {
            this.f16966a = size;
            if (map != null) {
                this.f16967b = map;
                if (size2 != null) {
                    this.f16968c = size2;
                    if (map2 != null) {
                        this.f16969d = map2;
                        if (size3 != null) {
                            this.f16970e = size3;
                            if (map3 != null) {
                                this.f16971f = map3;
                                if (map4 != null) {
                                    this.f16972g = map4;
                                    return;
                                }
                                throw new NullPointerException("Null ultraMaximumSizeMap");
                            }
                            throw new NullPointerException("Null maximumSizeMap");
                        }
                        throw new NullPointerException("Null recordSize");
                    }
                    throw new NullPointerException("Null s1440pSizeMap");
                }
                throw new NullPointerException("Null previewSize");
            }
            throw new NullPointerException("Null s720pSizeMap");
        }
        throw new NullPointerException("Null analysisSize");
    }

    public Size b() {
        return this.f16966a;
    }

    public Map<Integer, Size> d() {
        return this.f16971f;
    }

    public Size e() {
        return this.f16968c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f16966a.equals(f1Var.b()) && this.f16967b.equals(f1Var.j()) && this.f16968c.equals(f1Var.e()) && this.f16969d.equals(f1Var.h()) && this.f16970e.equals(f1Var.f()) && this.f16971f.equals(f1Var.d()) && this.f16972g.equals(f1Var.l());
    }

    public Size f() {
        return this.f16970e;
    }

    public Map<Integer, Size> h() {
        return this.f16969d;
    }

    public int hashCode() {
        return ((((((((((((this.f16966a.hashCode() ^ 1000003) * 1000003) ^ this.f16967b.hashCode()) * 1000003) ^ this.f16968c.hashCode()) * 1000003) ^ this.f16969d.hashCode()) * 1000003) ^ this.f16970e.hashCode()) * 1000003) ^ this.f16971f.hashCode()) * 1000003) ^ this.f16972g.hashCode();
    }

    public Map<Integer, Size> j() {
        return this.f16967b;
    }

    public Map<Integer, Size> l() {
        return this.f16972g;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f16966a + ", s720pSizeMap=" + this.f16967b + ", previewSize=" + this.f16968c + ", s1440pSizeMap=" + this.f16969d + ", recordSize=" + this.f16970e + ", maximumSizeMap=" + this.f16971f + ", ultraMaximumSizeMap=" + this.f16972g + "}";
    }
}
