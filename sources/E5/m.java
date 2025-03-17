package E5;

import XH.t;
import YH.g0;
import java.util.Set;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b\"\u0018\u0010\r\u001a\u00020\u0003*\u00020\n8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0018\u0010\u000e\u001a\u00020\u0003*\u00020\n8@X\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\f¨\u0006\u000f"}, d2 = {"LE5/k;", "", "mimeType", "", "c", "(LE5/k;Ljava/lang/String;)Z", "", "a", "Ljava/util/Set;", "RESPECT_PERFORMANCE_MIME_TYPES", "LE5/i;", "b", "(LE5/i;)Z", "isSwapped", "isRotated", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f34890a = g0.h("image/jpeg", "image/webp", "image/heic", "image/heif");

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34891a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                E5.k[] r0 = E5.k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                E5.k r1 = E5.k.RESPECT_PERFORMANCE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                E5.k r1 = E5.k.IGNORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                E5.k r1 = E5.k.RESPECT_ALL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f34891a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E5.m.a.<clinit>():void");
        }
    }

    public static final boolean a(i iVar) {
        return iVar.a() > 0;
    }

    public static final boolean b(i iVar) {
        return iVar.a() == 90 || iVar.a() == 270;
    }

    public static final boolean c(k kVar, String str) {
        int i10 = a.f34891a[kVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return false;
            }
            if (i10 != 3) {
                throw new t();
            }
        } else if (str == null || !f34890a.contains(str)) {
            return false;
        }
        return true;
    }
}
