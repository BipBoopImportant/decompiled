package SC;

import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wK.H9;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LSC/u;", "LwK/H9;", "a", "(LSC/u;)LwK/H9;", "skapa_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.v  reason: case insensitive filesystem */
public final class C13646v {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.v$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116463a;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                SC.u[] r0 = SC.C13642u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                SC.u r1 = SC.C13642u.Ratio4by3     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                SC.u r1 = SC.C13642u.Ratio16by9     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                SC.u r1 = SC.C13642u.Ratio1by1     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                SC.u r1 = SC.C13642u.Ratio6by7     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                SC.u r1 = SC.C13642u.Ratio3by4     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                SC.u r1 = SC.C13642u.Ratio4by5     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                SC.u r1 = SC.C13642u.Ratio9by16     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f116463a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: SC.C13646v.a.<clinit>():void");
        }
    }

    public static final H9 a(C13642u uVar) {
        C17542s.j(uVar, "<this>");
        switch (a.f116463a[uVar.ordinal()]) {
            case 1:
                return H9.Ratio4by3;
            case 2:
                return H9.Ratio16by9;
            case 3:
                return H9.Ratio1by1;
            case 4:
                return H9.Ratio6by7;
            case 5:
                return H9.Ratio3by4;
            case 6:
                return H9.Ratio4by5;
            case 7:
                return H9.Ratio9by16;
            default:
                throw new t();
        }
    }
}
