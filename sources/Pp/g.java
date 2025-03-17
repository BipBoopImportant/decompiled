package Pp;

import Op.C10828d;
import Pp.d;
import XH.t;
import YH.C16877v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qx.C14957b;
import qx.c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"LPp/g;", "", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "", "isFamilyItem", "LPp/d$a$b;", "priceType", "", "price", "basePrice", "LOp/d$l;", "a", "(ZLPp/d$a$b;DLjava/lang/Double;)LOp/d$l;", "LIl/a;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f85681a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85682a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Pp.d$a$b[] r0 = Pp.d.a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Pp.d$a$b r1 = Pp.d.a.b.NEW_LOWER_PRICE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Pp.d$a$b r1 = Pp.d.a.b.TRO     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f85682a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pp.g.a.<clinit>():void");
        }
    }

    public g(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f85681a = aVar;
    }

    public final C10828d.l a(boolean z10, d.a.b bVar, double d10, Double d11) {
        if (z10) {
            return new C10828d.l.b(new C10828d.l.e(d11 != null ? C14957b.a(d11.doubleValue(), this.f85681a.s()) : null, C14957b.a(d10, this.f85681a.s()), C16877v.n(), (String) null));
        }
        int i10 = bVar == null ? -1 : a.f85682a[bVar.ordinal()];
        if (i10 == -1) {
            return new C10828d.l.f(new C10828d.l.e((c) null, C14957b.a(d10, this.f85681a.s()), C16877v.n(), (String) null));
        }
        if (i10 == 1) {
            return new C10828d.l.c(new C10828d.l.e(d11 != null ? C14957b.a(d11.doubleValue(), this.f85681a.s()) : null, C14957b.a(d10, this.f85681a.s()), C16877v.n(), (String) null));
        } else if (i10 == 2) {
            return new C10828d.l.g(new C10828d.l.e(d11 != null ? C14957b.a(d11.doubleValue(), this.f85681a.s()) : null, C14957b.a(d10, this.f85681a.s()), C16877v.n(), (String) null));
        } else {
            throw new t();
        }
    }
}
