package v;

import androidx.camera.core.impl.p1;

public class b2 {

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30514a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.core.impl.p1$b[] r0 = androidx.camera.core.impl.p1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30514a = r0
                androidx.camera.core.impl.p1$b r1 = androidx.camera.core.impl.p1.b.IMAGE_CAPTURE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30514a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.p1$b r1 = androidx.camera.core.impl.p1.b.VIDEO_CAPTURE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30514a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.p1$b r1 = androidx.camera.core.impl.p1.b.STREAM_SHARING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30514a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.impl.p1$b r1 = androidx.camera.core.impl.p1.b.PREVIEW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30514a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.core.impl.p1$b r1 = androidx.camera.core.impl.p1.b.IMAGE_ANALYSIS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v.b2.a.<clinit>():void");
        }
    }

    public static int a(p1.b bVar, int i10) {
        int i11 = a.f30514a[bVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? 1 : 3 : i10 == 2 ? 5 : 2;
    }

    public static int b(p1.b bVar, int i10) {
        int i11 = a.f30514a[bVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? 1 : 3 : i10 == 2 ? 5 : 1;
    }
}
