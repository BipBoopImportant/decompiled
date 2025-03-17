package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5601g;
import n0.C5602h;
import p1.C5747v0;
import tK.C18014e;
import tK.C18017h;
import tK.C18030v;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0014¨\u0006!"}, d2 = {"LwK/U3;", "", "LwK/O8;", "style", "", "enabled", "", "selectedIndex", "<init>", "(LwK/O8;ZI)V", "Lp1/v0;", "a", "(LU0/m;I)J", "Ln0/g;", "b", "(LU0/m;I)Ln0/g;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "LwK/O8;", "getStyle", "()LwK/O8;", "Z", "getEnabled", "()Z", "c", "I", "getSelectedIndex", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class U3 {

    /* renamed from: a  reason: collision with root package name */
    private final O8 f150251a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f150252b;

    /* renamed from: c  reason: collision with root package name */
    private final int f150253c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150254a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wK.O8[] r0 = wK.O8.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.O8 r1 = wK.O8.Regular     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.O8 r1 = wK.O8.Subtle     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f150254a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.U3.a.<clinit>():void");
        }
    }

    public U3(O8 o82, boolean z10, int i10) {
        C17542s.j(o82, "style");
        this.f150251a = o82;
        this.f150252b = z10;
        this.f150253c = i10;
    }

    public final long a(C4889m mVar, int i10) {
        long j10;
        mVar.W(207132127);
        if (C4895p.J()) {
            C4895p.S(207132127, i10, -1, "net.ikea.skapa.ui.components.ItemBackgroundStyle.selectedBackgroundColor (SegmentedControl.kt:549)");
        }
        C18017h a10 = C18030v.f147664a.a(mVar, C18030v.f147665b);
        int i11 = a.f150254a[this.f150251a.ordinal()];
        if (i11 == 1) {
            j10 = this.f150252b ? a10.p0() : a10.K();
        } else if (i11 == 2) {
            j10 = this.f150252b ? a10.k0() : a10.M();
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return j10;
    }

    public final C5601g b(C4889m mVar, int i10) {
        mVar.W(1115232489);
        if (C4895p.J()) {
            C4895p.S(1115232489, i10, -1, "net.ikea.skapa.ui.components.ItemBackgroundStyle.selectedItemBorderColor (SegmentedControl.kt:557)");
        }
        C18017h a10 = C18030v.f147664a.a(mVar, C18030v.f147665b);
        C5601g a11 = (this.f150251a != O8.Subtle || this.f150253c == -1) ? C5602h.a(h.B((float) 0), C5747v0.f27350b.h()) : this.f150252b ? C5602h.a(C18014e.f147445a.b(), a10.p0()) : C5602h.a(C18014e.f147445a.b(), a10.K());
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return a11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U3)) {
            return false;
        }
        U3 u32 = (U3) obj;
        return this.f150251a == u32.f150251a && this.f150252b == u32.f150252b && this.f150253c == u32.f150253c;
    }

    public int hashCode() {
        return (((this.f150251a.hashCode() * 31) + Boolean.hashCode(this.f150252b)) * 31) + Integer.hashCode(this.f150253c);
    }

    public String toString() {
        O8 o82 = this.f150251a;
        boolean z10 = this.f150252b;
        int i10 = this.f150253c;
        return "ItemBackgroundStyle(style=" + o82 + ", enabled=" + z10 + ", selectedIndex=" + i10 + ")";
    }
}
