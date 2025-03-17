package v;

import android.util.Size;
import androidx.camera.core.impl.X0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.List;
import v.C6036M;

/* renamed from: v.d  reason: case insensitive filesystem */
final class C6058d extends C6036M.k {

    /* renamed from: a  reason: collision with root package name */
    private final String f30523a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<?> f30524b;

    /* renamed from: c  reason: collision with root package name */
    private final X0 f30525c;

    /* renamed from: d  reason: collision with root package name */
    private final o1<?> f30526d;

    /* renamed from: e  reason: collision with root package name */
    private final Size f30527e;

    /* renamed from: f  reason: collision with root package name */
    private final c1 f30528f;

    /* renamed from: g  reason: collision with root package name */
    private final List<p1.b> f30529g;

    C6058d(String str, Class<?> cls, X0 x02, o1<?> o1Var, Size size, c1 c1Var, List<p1.b> list) {
        if (str != null) {
            this.f30523a = str;
            if (cls != null) {
                this.f30524b = cls;
                if (x02 != null) {
                    this.f30525c = x02;
                    if (o1Var != null) {
                        this.f30526d = o1Var;
                        this.f30527e = size;
                        this.f30528f = c1Var;
                        this.f30529g = list;
                        return;
                    }
                    throw new NullPointerException("Null useCaseConfig");
                }
                throw new NullPointerException("Null sessionConfig");
            }
            throw new NullPointerException("Null useCaseType");
        }
        throw new NullPointerException("Null useCaseId");
    }

    /* access modifiers changed from: package-private */
    public List<p1.b> c() {
        return this.f30529g;
    }

    /* access modifiers changed from: package-private */
    public X0 d() {
        return this.f30525c;
    }

    /* access modifiers changed from: package-private */
    public c1 e() {
        return this.f30528f;
    }

    public boolean equals(Object obj) {
        Size size;
        c1 c1Var;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6036M.k)) {
            return false;
        }
        C6036M.k kVar = (C6036M.k) obj;
        if (this.f30523a.equals(kVar.h()) && this.f30524b.equals(kVar.i()) && this.f30525c.equals(kVar.d()) && this.f30526d.equals(kVar.g()) && ((size = this.f30527e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((c1Var = this.f30528f) != null ? c1Var.equals(kVar.e()) : kVar.e() == null)) {
            List<p1.b> list = this.f30529g;
            if (list == null) {
                if (kVar.c() == null) {
                    return true;
                }
            } else if (list.equals(kVar.c())) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public Size f() {
        return this.f30527e;
    }

    /* access modifiers changed from: package-private */
    public o1<?> g() {
        return this.f30526d;
    }

    /* access modifiers changed from: package-private */
    public String h() {
        return this.f30523a;
    }

    public int hashCode() {
        int hashCode = (((((((this.f30523a.hashCode() ^ 1000003) * 1000003) ^ this.f30524b.hashCode()) * 1000003) ^ this.f30525c.hashCode()) * 1000003) ^ this.f30526d.hashCode()) * 1000003;
        Size size = this.f30527e;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        c1 c1Var = this.f30528f;
        int hashCode3 = (hashCode2 ^ (c1Var == null ? 0 : c1Var.hashCode())) * 1000003;
        List<p1.b> list = this.f30529g;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 ^ i10;
    }

    /* access modifiers changed from: package-private */
    public Class<?> i() {
        return this.f30524b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f30523a + ", useCaseType=" + this.f30524b + ", sessionConfig=" + this.f30525c + ", useCaseConfig=" + this.f30526d + ", surfaceResolution=" + this.f30527e + ", streamSpec=" + this.f30528f + ", captureTypes=" + this.f30529g + "}";
    }
}
