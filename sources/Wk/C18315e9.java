package wK;

import U0.C4889m;
import U0.C4895p;
import android.content.res.Configuration;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LwK/e9;", "", "<init>", "()V", "Landroid/content/res/Configuration;", "configuration", "", "b", "(Landroid/content/res/Configuration;LU0/m;I)Z", "Lc2/h;", "F", "a", "()F", "DefaultPadding", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.e9  reason: case insensitive filesystem */
final class C18315e9 {

    /* renamed from: a  reason: collision with root package name */
    public static final C18315e9 f150805a = new C18315e9();

    /* renamed from: b  reason: collision with root package name */
    private static final float f150806b = h.B((float) 0);

    private C18315e9() {
    }

    public final float a() {
        return f150806b;
    }

    public final boolean b(Configuration configuration, C4889m mVar, int i10) {
        C17542s.j(configuration, "configuration");
        mVar.W(1975238175);
        if (C4895p.J()) {
            C4895p.S(1975238175, i10, -1, "net.ikea.skapa.ui.components.SheetM3Props.isSmallScreenLandscape (SheetM3.kt:196)");
        }
        boolean z10 = configuration.smallestScreenWidthDp > 600 && configuration.orientation == 2;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return z10;
    }
}
