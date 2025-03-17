package I1;

import XH.t;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LI1/b;", "", "", "id", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "order", "j", "m", "titleResource", "Copy", "Paste", "Cut", "SelectAll", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public enum b {
    Copy(0),
    Paste(1),
    Cut(2),
    SelectAll(3);
    

    /* renamed from: id  reason: collision with root package name */
    private final int f8556id;
    private final int order;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f8557a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                I1.b[] r0 = I1.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                I1.b r1 = I1.b.Copy     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                I1.b r1 = I1.b.Paste     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                I1.b r1 = I1.b.Cut     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                I1.b r1 = I1.b.SelectAll     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f8557a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: I1.b.a.<clinit>():void");
        }
    }

    private b(int i10) {
        this.f8556id = i10;
        this.order = i10;
    }

    public final int b() {
        return this.f8556id;
    }

    public final int j() {
        return this.order;
    }

    public final int m() {
        int i10 = a.f8557a[ordinal()];
        if (i10 == 1) {
            return 17039361;
        }
        if (i10 == 2) {
            return 17039371;
        }
        if (i10 == 3) {
            return 17039363;
        }
        if (i10 == 4) {
            return 17039373;
        }
        throw new t();
    }
}
