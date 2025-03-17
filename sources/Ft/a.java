package Ft;

import Gt.a;
import XH.t;
import kD.h;
import kD.o;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LkD/o;", "LGt/a;", "a", "(LkD/o;)LGt/a;", "instore-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ft.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C1576a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f81056a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kD.o$a[] r0 = kD.o.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kD.o$a r1 = kD.o.a.FAMILY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kD.o$a r1 = kD.o.a.REGULAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kD.o$a r1 = kD.o.a.GUEST     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f81056a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Ft.a.C1576a.<clinit>():void");
        }
    }

    public static final Gt.a a(o oVar) {
        String str;
        C17542s.j(oVar, "<this>");
        String str2 = null;
        if (oVar.b() == null) {
            return null;
        }
        int i10 = C1576a.f81056a[oVar.c().ordinal()];
        if (i10 == 1) {
            h b10 = oVar.b();
            String d10 = b10 != null ? b10.d() : null;
            h b11 = oVar.b();
            if (b11 != null) {
                str2 = b11.f();
            }
            String str3 = d10 + " " + str2;
            h b12 = oVar.b();
            if (b12 == null || (str = b12.c()) == null) {
                str = "";
            }
            return new a.C1584a(str3, str);
        } else if (i10 == 2) {
            return a.c.f81207a;
        } else {
            if (i10 == 3) {
                return a.b.f81206a;
            }
            throw new t();
        }
    }
}
