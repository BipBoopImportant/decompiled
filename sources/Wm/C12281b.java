package wm;

import XH.t;
import kotlin.Metadata;
import ld.C10008a;
import vm.C12190a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvm/a$a;", "Lld/a;", "b", "(Lvm/a$a;)Lld/a;", "barcode-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: wm.b  reason: case insensitive filesystem */
public final class C12281b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wm.b$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f105869a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                vm.a$a[] r0 = vm.C12190a.C2496a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vm.a$a r1 = vm.C12190a.C2496a.CODE_39     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                vm.a$a r1 = vm.C12190a.C2496a.CODE_128     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                vm.a$a r1 = vm.C12190a.C2496a.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                vm.a$a r1 = vm.C12190a.C2496a.ITF     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                vm.a$a r1 = vm.C12190a.C2496a.QR_CODE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f105869a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: wm.C12281b.a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final C10008a b(C12190a.C2496a aVar) {
        int i10 = a.f105869a[aVar.ordinal()];
        if (i10 == 1) {
            return C10008a.CODE_39;
        }
        if (i10 == 2) {
            return C10008a.CODE_39;
        }
        if (i10 == 3) {
            return C10008a.DATA_MATRIX;
        }
        if (i10 == 4) {
            return C10008a.ITF;
        }
        if (i10 == 5) {
            return C10008a.QR_CODE;
        }
        throw new t();
    }
}
