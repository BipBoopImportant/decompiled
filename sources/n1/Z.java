package N1;

import Y1.l;
import c2.t;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"LN1/Y;", "start", "stop", "", "fraction", "c", "(LN1/Y;LN1/Y;F)LN1/Y;", "style", "Lc2/t;", "direction", "d", "(LN1/Y;Lc2/t;)LN1/Y;", "layoutDirection", "LY1/l;", "textDirection", "e", "(Lc2/t;I)I", "LN1/D;", "platformSpanStyle", "LN1/C;", "platformParagraphStyle", "LN1/E;", "b", "(LN1/D;LN1/C;)LN1/E;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Z {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9427a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                c2.t[] r0 = c2.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c2.t r1 = c2.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                c2.t r1 = c2.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f9427a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: N1.Z.a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final E b(D d10, C c10) {
        if (d10 == null && c10 == null) {
            return null;
        }
        return C4668c.a(d10, c10);
    }

    public static final Y c(Y y10, Y y11, float f10) {
        return new Y(H.c(y10.N(), y11.N(), f10), C4690z.b(y10.M(), y11.M(), f10));
    }

    public static final Y d(Y y10, t tVar) {
        return new Y(H.h(y10.y()), C4690z.e(y10.v(), tVar), y10.w());
    }

    public static final int e(t tVar, int i10) {
        l.a aVar = l.f14797b;
        if (l.j(i10, aVar.a())) {
            int i11 = a.f9427a[tVar.ordinal()];
            if (i11 == 1) {
                return aVar.b();
            }
            if (i11 == 2) {
                return aVar.c();
            }
            throw new XH.t();
        } else if (!l.j(i10, aVar.f())) {
            return i10;
        } else {
            int i12 = a.f9427a[tVar.ordinal()];
            if (i12 == 1) {
                return aVar.d();
            }
            if (i12 == 2) {
                return aVar.e();
            }
            throw new XH.t();
        }
    }
}
