package Pp;

import IC.C13023e;
import IC.C13026h;
import Oo.b;
import Pp.d;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qx.C14956a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LPp/h;", "", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "LPp/d$a;", "item", "LIC/e;", "a", "(LPp/d$a;)LIC/e;", "LIl/a;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Il.a f85683a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85684a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                Pp.d$a$c$b[] r0 = Pp.d.a.c.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Pp.d$a$c$b r1 = Pp.d.a.c.b.METER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Pp.d$a$c$b r1 = Pp.d.a.c.b.PIECE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f85684a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Pp.h.a.<clinit>():void");
        }
    }

    public h(Il.a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f85683a = aVar;
    }

    public final C13023e a(d.a aVar) {
        C17542s.j(aVar, "item");
        if (aVar.l() <= 1) {
            return null;
        }
        String b10 = C14956a.f130484a.b(aVar.f(), this.f85683a.s());
        int i10 = a.f85684a[aVar.i().i().ordinal()];
        if (i10 == 1) {
            return null;
        }
        if (i10 == 2) {
            return C13026h.b(b.f84516T8, b10);
        }
        throw new t();
    }
}
