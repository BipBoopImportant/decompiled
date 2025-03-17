package SC;

import XH.t;
import fI.C17221b;
import kotlin.Metadata;
import wK.C18311e5;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"LSC/r1;", "", "<init>", "(Ljava/lang/String;I)V", "LwK/e5;", "b", "()LwK/e5;", "Qr", "Barcode", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.r1  reason: case insensitive filesystem */
public enum C13632r1 {
    Qr,
    Barcode;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.r1$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116414a = null;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                SC.r1[] r0 = SC.C13632r1.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.r1 r1 = SC.C13632r1.Qr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.r1 r1 = SC.C13632r1.Barcode     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f116414a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.C13632r1.a.<clinit>():void");
        }
    }

    static {
        C13632r1[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    public final C18311e5 b() {
        int i10 = a.f116414a[ordinal()];
        if (i10 == 1) {
            return C18311e5.QR;
        }
        if (i10 == 2) {
            return C18311e5.Barcode;
        }
        throw new t();
    }
}
