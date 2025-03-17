package androidx.camera.core.impl;

import C.C4417z;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.impl.p1;
import java.util.List;

/* renamed from: androidx.camera.core.impl.b  reason: case insensitive filesystem */
final class C5012b extends C5010a {

    /* renamed from: a  reason: collision with root package name */
    private final e1 f16839a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16840b;

    /* renamed from: c  reason: collision with root package name */
    private final Size f16841c;

    /* renamed from: d  reason: collision with root package name */
    private final C4417z f16842d;

    /* renamed from: e  reason: collision with root package name */
    private final List<p1.b> f16843e;

    /* renamed from: f  reason: collision with root package name */
    private final X f16844f;

    /* renamed from: g  reason: collision with root package name */
    private final Range<Integer> f16845g;

    C5012b(e1 e1Var, int i10, Size size, C4417z zVar, List<p1.b> list, X x10, Range<Integer> range) {
        if (e1Var != null) {
            this.f16839a = e1Var;
            this.f16840b = i10;
            if (size != null) {
                this.f16841c = size;
                if (zVar != null) {
                    this.f16842d = zVar;
                    if (list != null) {
                        this.f16843e = list;
                        this.f16844f = x10;
                        this.f16845g = range;
                        return;
                    }
                    throw new NullPointerException("Null captureTypes");
                }
                throw new NullPointerException("Null dynamicRange");
            }
            throw new NullPointerException("Null size");
        }
        throw new NullPointerException("Null surfaceConfig");
    }

    public List<p1.b> b() {
        return this.f16843e;
    }

    public C4417z c() {
        return this.f16842d;
    }

    public int d() {
        return this.f16840b;
    }

    public X e() {
        return this.f16844f;
    }

    public boolean equals(Object obj) {
        X x10;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5010a)) {
            return false;
        }
        C5010a aVar = (C5010a) obj;
        if (this.f16839a.equals(aVar.g()) && this.f16840b == aVar.d() && this.f16841c.equals(aVar.f()) && this.f16842d.equals(aVar.c()) && this.f16843e.equals(aVar.b()) && ((x10 = this.f16844f) != null ? x10.equals(aVar.e()) : aVar.e() == null)) {
            Range<Integer> range = this.f16845g;
            if (range == null) {
                if (aVar.h() == null) {
                    return true;
                }
            } else if (range.equals(aVar.h())) {
                return true;
            }
        }
        return false;
    }

    public Size f() {
        return this.f16841c;
    }

    public e1 g() {
        return this.f16839a;
    }

    public Range<Integer> h() {
        return this.f16845g;
    }

    public int hashCode() {
        int hashCode = (((((((((this.f16839a.hashCode() ^ 1000003) * 1000003) ^ this.f16840b) * 1000003) ^ this.f16841c.hashCode()) * 1000003) ^ this.f16842d.hashCode()) * 1000003) ^ this.f16843e.hashCode()) * 1000003;
        X x10 = this.f16844f;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (x10 == null ? 0 : x10.hashCode())) * 1000003;
        Range<Integer> range = this.f16845g;
        if (range != null) {
            i10 = range.hashCode();
        }
        return hashCode2 ^ i10;
    }

    public String toString() {
        return "AttachedSurfaceInfo{surfaceConfig=" + this.f16839a + ", imageFormat=" + this.f16840b + ", size=" + this.f16841c + ", dynamicRange=" + this.f16842d + ", captureTypes=" + this.f16843e + ", implementationOptions=" + this.f16844f + ", targetFrameRate=" + this.f16845g + "}";
    }
}
