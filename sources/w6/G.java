package w6;

public enum G {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f57231a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w6.G[] r0 = w6.G.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f57231a = r0
                w6.G r1 = w6.G.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f57231a     // Catch:{ NoSuchFieldError -> 0x001d }
                w6.G r1 = w6.G.SOFTWARE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f57231a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w6.G r1 = w6.G.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w6.G.a.<clinit>():void");
        }
    }

    public boolean b(int i10, boolean z10, int i11) {
        int i12 = a.f57231a[ordinal()];
        if (i12 == 1) {
            return false;
        }
        if (i12 == 2) {
            return true;
        }
        if ((!z10 || i10 >= 28) && i11 <= 4) {
            return i10 <= 25;
        }
        return true;
    }
}
