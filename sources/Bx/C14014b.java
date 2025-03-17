package bx;

import GB.d;
import XH.C16796C;
import XH.t;
import XH.v;
import ax.C13989a;
import ax.C13991c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbx/b;", "Lax/c;", "<init>", "()V", "", "liveBusyness", "Lax/a;", "a", "(I)Lax/a;", "populartimes-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: bx.b  reason: case insensitive filesystem */
public final class C14014b implements C13991c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: bx.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f118985a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                GB.d[] r0 = GB.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                GB.d r1 = GB.d.NotBusy     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                GB.d r1 = GB.d.LittleBusy     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                GB.d r1 = GB.d.Busy     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f118985a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bx.C14014b.a.<clinit>():void");
        }
    }

    public C13989a a(int i10) {
        v vVar;
        int i11 = a.f118985a[d.Companion.a((float) i10).ordinal()];
        if (i11 == 1) {
            vVar = C16796C.a(Integer.valueOf(e.f119008q), Integer.valueOf(e.f118997f));
        } else if (i11 == 2) {
            vVar = C16796C.a(Integer.valueOf(e.f119006o), Integer.valueOf(e.f118996e));
        } else if (i11 == 3) {
            vVar = C16796C.a(Integer.valueOf(e.f119003l), Integer.valueOf(e.f118995d));
        } else {
            throw new t();
        }
        return new C13989a(((Number) vVar.a()).intValue(), ((Number) vVar.b()).intValue());
    }
}
