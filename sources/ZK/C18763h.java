package zK;

import U0.C4889m;
import U0.C4895p;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tK.C18014e;
import tK.C18017h;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006R\u0017\u0010\f\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LzK/h;", "", "<init>", "()V", "LzK/f;", "c", "(LU0/m;I)LzK/f;", "b", "Lc2/h;", "F", "a", "()F", "TotalBorderWidth", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zK.h  reason: case insensitive filesystem */
public final class C18763h {

    /* renamed from: a  reason: collision with root package name */
    public static final C18763h f152836a = new C18763h();

    /* renamed from: b  reason: collision with root package name */
    private static final float f152837b = h.B((float) 6);

    private C18763h() {
    }

    public final float a() {
        return f152837b;
    }

    public final C18761f b(C4889m mVar, int i10) {
        mVar.W(-858808230);
        if (C4895p.J()) {
            C4895p.S(-858808230, i10, -1, "net.ikea.skapa.ui.util.KeyboardNavigationProps.innerBorderStyle (AccessibilityHelper.kt:265)");
        }
        C18017h a10 = C18030v.f147664a.a(mVar, C18030v.f147665b);
        C18761f fVar = new C18761f(a10.k0(), a10.p0(), a10.F0(), a10.x0(), f152837b, (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return fVar;
    }

    public final C18761f c(C4889m mVar, int i10) {
        mVar.W(-1287612609);
        if (C4895p.J()) {
            C4895p.S(-1287612609, i10, -1, "net.ikea.skapa.ui.util.KeyboardNavigationProps.outerBorderStyle (AccessibilityHelper.kt:254)");
        }
        C18017h a10 = C18030v.f147664a.a(mVar, C18030v.f147665b);
        C18761f fVar = new C18761f(a10.p0(), a10.k0(), a10.x0(), a10.F0(), C18014e.f147445a.a(), (DefaultConstructorMarker) null);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return fVar;
    }
}
