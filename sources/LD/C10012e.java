package ld;

import java.util.Map;
import md.C10037a;
import od.C10105b;
import qd.C10187a;
import sd.C10233b;
import sd.C10235d;
import sd.C10237f;
import sd.h;
import sd.j;
import sd.k;
import sd.l;
import sd.o;
import sd.s;
import td.C10250a;
import vd.C10304a;

/* renamed from: ld.e  reason: case insensitive filesystem */
public final class C10012e implements g {

    /* renamed from: ld.e$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f75213a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(3:25|26|28)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                ld.a[] r0 = ld.C10008a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f75213a = r0
                ld.a r1 = ld.C10008a.EAN_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x001d }
                ld.a r1 = ld.C10008a.UPC_E     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ld.a r1 = ld.C10008a.EAN_13     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x0033 }
                ld.a r1 = ld.C10008a.UPC_A     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x003e }
                ld.a r1 = ld.C10008a.QR_CODE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x0049 }
                ld.a r1 = ld.C10008a.CODE_39     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x0054 }
                ld.a r1 = ld.C10008a.CODE_93     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x0060 }
                ld.a r1 = ld.C10008a.CODE_128     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x006c }
                ld.a r1 = ld.C10008a.ITF     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x0078 }
                ld.a r1 = ld.C10008a.PDF_417     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x0084 }
                ld.a r1 = ld.C10008a.CODABAR     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x0090 }
                ld.a r1 = ld.C10008a.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f75213a     // Catch:{ NoSuchFieldError -> 0x009c }
                ld.a r1 = ld.C10008a.AZTEC     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ld.C10012e.a.<clinit>():void");
        }
    }

    public C10105b a(String str, C10008a aVar, int i10, int i11, Map<C10010c, ?> map) {
        g kVar;
        switch (a.f75213a[aVar.ordinal()]) {
            case 1:
                kVar = new k();
                break;
            case 2:
                kVar = new s();
                break;
            case 3:
                kVar = new j();
                break;
            case 4:
                kVar = new o();
                break;
            case 5:
                kVar = new C10304a();
                break;
            case 6:
                kVar = new C10237f();
                break;
            case 7:
                kVar = new h();
                break;
            case 8:
                kVar = new C10235d();
                break;
            case 9:
                kVar = new l();
                break;
            case 10:
                kVar = new C10250a();
                break;
            case 11:
                kVar = new C10233b();
                break;
            case 12:
                kVar = new C10187a();
                break;
            case 13:
                kVar = new C10037a();
                break;
            default:
                throw new IllegalArgumentException("No encoder available for format " + aVar);
        }
        return kVar.a(str, aVar, i10, i11, map);
    }
}
