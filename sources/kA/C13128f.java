package KA;

import PA.C13331a;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LPA/a$b;", "type", "LKA/a;", "a", "(LPA/a$b;)LKA/a;", "shoppableimage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: KA.f  reason: case insensitive filesystem */
public final class C13128f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: KA.f$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f111506a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                PA.a$b[] r0 = PA.C13331a.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                PA.a$b r1 = PA.C13331a.b.SHOPPABLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                PA.a$b r1 = PA.C13331a.b.INSPIRATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                PA.a$b r1 = PA.C13331a.b.VUGC     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f111506a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: KA.C13128f.a.<clinit>():void");
        }
    }

    public static final C13123a a(C13331a.b bVar) {
        C17542s.j(bVar, "type");
        int i10 = a.f111506a[bVar.ordinal()];
        if (i10 == 1) {
            return C13123a.GENERAL_SHOPPABLE;
        }
        if (i10 == 2) {
            return C13123a.INSPIRE;
        }
        if (i10 == 3) {
            return C13123a.VUGC;
        }
        throw new t();
    }
}
