package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tK.C18030v;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LwK/P1;", "", "LwK/V3;", "size", "", "enabled", "<init>", "(LwK/V3;Z)V", "Lp1/v0;", "a", "(LU0/m;I)J", "Lc2/h;", "b", "(LU0/m;I)F", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LwK/V3;", "getSize", "()LwK/V3;", "Z", "getEnabled", "()Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class P1 {

    /* renamed from: a  reason: collision with root package name */
    private final V3 f149932a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f149933b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f149934a;

        static {
            int[] iArr = new int[V3.values().length];
            try {
                iArr[V3.Small.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f149934a = iArr;
        }
    }

    public P1(V3 v32, boolean z10) {
        C17542s.j(v32, "size");
        this.f149932a = v32;
        this.f149933b = z10;
    }

    public final long a(C4889m mVar, int i10) {
        long j10;
        mVar.W(-234765776);
        if (C4895p.J()) {
            C4895p.S(-234765776, i10, -1, "net.ikea.skapa.ui.components.ComponentBorderStyle.borderColor (SegmentedControl.kt:531)");
        }
        boolean z10 = this.f149933b;
        if (z10) {
            mVar.W(-1526404982);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).n0();
            mVar.P();
        } else if (!z10) {
            mVar.W(-1526403562);
            j10 = C18030v.f147664a.a(mVar, C18030v.f147665b).K();
            mVar.P();
        } else {
            mVar.W(-1526406501);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j10;
    }

    public final float b(C4889m mVar, int i10) {
        mVar.W(1496147771);
        if (C4895p.J()) {
            C4895p.S(1496147771, i10, -1, "net.ikea.skapa.ui.components.ComponentBorderStyle.borderCornerRadius (SegmentedControl.kt:537)");
        }
        float B10 = a.f149934a[this.f149932a.ordinal()] == 1 ? h.B((float) 22) : h.B((float) 24);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return B10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof P1)) {
            return false;
        }
        P1 p12 = (P1) obj;
        return this.f149932a == p12.f149932a && this.f149933b == p12.f149933b;
    }

    public int hashCode() {
        return (this.f149932a.hashCode() * 31) + Boolean.hashCode(this.f149933b);
    }

    public String toString() {
        V3 v32 = this.f149932a;
        boolean z10 = this.f149933b;
        return "ComponentBorderStyle(size=" + v32 + ", enabled=" + z10 + ")";
    }
}
