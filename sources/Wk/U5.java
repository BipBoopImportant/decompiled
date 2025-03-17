package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import androidx.compose.foundation.layout.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import s0.C5834E;
import tK.C18029u;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LwK/U5;", "", "<init>", "()V", "LwK/F5;", "buttonAlignment", "LwK/V5;", "a", "(LwK/F5;LU0/m;I)LwK/V5;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class U5 {

    /* renamed from: a  reason: collision with root package name */
    public static final U5 f150255a = new U5();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150256a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                wK.F5[] r0 = wK.F5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.F5 r1 = wK.F5.SideBySide     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.F5 r1 = wK.F5.Stacked     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f150256a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.U5.a.<clinit>():void");
        }
    }

    private U5() {
    }

    public final V5 a(F5 f52, C4889m mVar, int i10) {
        V5 v52;
        C17542s.j(f52, "buttonAlignment");
        mVar.W(145793872);
        if (C4895p.J()) {
            C4895p.S(145793872, i10, -1, "net.ikea.skapa.ui.components.ModalsActionFooterProp.style (ModalsActionFooter.kt:85)");
        }
        C18029u uVar = C18029u.f147649a;
        C5834E b10 = D.b(uVar.a(), uVar.c());
        int i11 = a.f150256a[f52.ordinal()];
        if (i11 == 1) {
            v52 = new V5(b10, uVar.l(), (DefaultConstructorMarker) null);
        } else if (i11 == 2) {
            v52 = new V5(b10, uVar.j(), (DefaultConstructorMarker) null);
        } else {
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return v52;
    }
}
