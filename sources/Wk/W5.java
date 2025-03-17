package wK;

import U0.C4889m;
import U0.C4895p;
import XH.t;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tK.C18029u;
import tK.C18030v;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\n\u0010\u000e¨\u0006\u0012"}, d2 = {"LwK/W5;", "", "<init>", "()V", "LwK/X5;", "variant", "LwK/Q5;", "c", "(LwK/X5;LU0/m;I)LwK/Q5;", "Lc2/h;", "b", "F", "compactHeight", "a", "()F", "resizeableIndicatorHeight", "d", "resizeableIndicatorWidth", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class W5 {

    /* renamed from: a  reason: collision with root package name */
    public static final W5 f150318a = new W5();

    /* renamed from: b  reason: collision with root package name */
    private static final float f150319b = h.B((float) 56);

    /* renamed from: c  reason: collision with root package name */
    private static final float f150320c = h.B((float) 5);

    /* renamed from: d  reason: collision with root package name */
    private static final float f150321d = h.B((float) 40);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f150322a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                wK.X5[] r0 = wK.X5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                wK.X5 r1 = wK.X5.Regular     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                wK.X5 r1 = wK.X5.Floating     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                wK.X5 r1 = wK.X5.Resizeable     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f150322a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wK.W5.a.<clinit>():void");
        }
    }

    private W5() {
    }

    public final float a() {
        return f150320c;
    }

    public final float b() {
        return f150321d;
    }

    public final Q5 c(X5 x52, C4889m mVar, int i10) {
        Q5 q52;
        C17542s.j(x52, "variant");
        mVar.W(-2051046893);
        if (C4895p.J()) {
            C4895p.S(-2051046893, i10, -1, "net.ikea.skapa.ui.components.ModalsHeaderProps.headerStyle (ModalHeader.kt:249)");
        }
        int i11 = a.f150322a[x52.ordinal()];
        if (i11 == 1) {
            mVar.W(1024812707);
            q52 = new Q5(f150319b, C18030v.f147664a.a(mVar, C18030v.f147665b).k(), h.B((float) 0), (DefaultConstructorMarker) null);
            mVar.P();
        } else if (i11 == 2) {
            mVar.W(1024819316);
            q52 = new Q5(f150319b, C18030v.f147664a.a(mVar, C18030v.f147665b).L0(), C18029u.f147649a.j(), (DefaultConstructorMarker) null);
            mVar.P();
        } else if (i11 == 3) {
            mVar.W(1024826523);
            C18029u uVar = C18029u.f147649a;
            q52 = new Q5(uVar.g(), C18030v.f147664a.a(mVar, C18030v.f147665b).k(), uVar.j(), (DefaultConstructorMarker) null);
            mVar.P();
        } else {
            mVar.W(1024811312);
            mVar.P();
            throw new t();
        }
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return q52;
    }
}
