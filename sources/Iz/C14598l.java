package iz;

import XH.t;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoCheckoutStatusResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.StatusStringsResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"Liz/l;", "", "Liz/q;", "statusMapper", "<init>", "(Liz/q;)V", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel;", "response", "Lrz/C;", "a", "(Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel;)Lrz/C;", "Liz/q;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.l  reason: case insensitive filesystem */
public final class C14598l {

    /* renamed from: a  reason: collision with root package name */
    private final C14603q f127780a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: iz.l$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f127781a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                rz.C$a[] r0 = rz.C.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rz.C$a r1 = rz.C.a.PAYMENT_UNKNOWN_STATUS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                rz.C$a r1 = rz.C.a.PAYMENT_COMPLETED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                rz.C$a r1 = rz.C.a.PAYMENT_WAITING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                rz.C$a r1 = rz.C.a.PAYMENT_IN_PROGRESS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                rz.C$a r1 = rz.C.a.PAYMENT_ABORTED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                rz.C$a r1 = rz.C.a.PAYMENT_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f127781a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: iz.C14598l.a.<clinit>():void");
        }
    }

    public C14598l(C14603q qVar) {
        C17542s.j(qVar, "statusMapper");
        this.f127780a = qVar;
    }

    public final C a(ScanAndGoCheckoutStatusResponseDataModel scanAndGoCheckoutStatusResponseDataModel) {
        C17542s.j(scanAndGoCheckoutStatusResponseDataModel, "response");
        C14603q qVar = this.f127780a;
        String b10 = scanAndGoCheckoutStatusResponseDataModel.b();
        if (b10 != null) {
            C.a a10 = qVar.a(b10);
            String str = null;
            switch (a.f127781a[a10.ordinal()]) {
                case 1:
                    StatusStringsResponse c10 = scanAndGoCheckoutStatusResponseDataModel.c();
                    if (c10 != null) {
                        str = c10.a();
                    }
                    if (str != null) {
                        return new C.b.c(str);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                case 2:
                    StatusStringsResponse c11 = scanAndGoCheckoutStatusResponseDataModel.c();
                    if (c11 != null) {
                        String a11 = scanAndGoCheckoutStatusResponseDataModel.a();
                        String str2 = a11 == null ? "" : a11;
                        String d10 = c11.d();
                        if (d10 != null) {
                            String b11 = c11.b();
                            if (b11 != null) {
                                String f10 = c11.f();
                                String str3 = f10 == null ? "" : f10;
                                String e10 = c11.e();
                                return new C.c(str2, d10, b11, str3, e10 == null ? "" : e10);
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                case 3:
                    return C.e.f130717a;
                case 4:
                    StatusStringsResponse c12 = scanAndGoCheckoutStatusResponseDataModel.c();
                    if (c12 != null) {
                        String d11 = c12.d();
                        if (d11 != null) {
                            String b12 = c12.b();
                            if (b12 != null) {
                                String c13 = c12.c();
                                if (c13 != null) {
                                    return new C.d(d11, b12, c13);
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                case 5:
                    StatusStringsResponse c14 = scanAndGoCheckoutStatusResponseDataModel.c();
                    if (c14 != null) {
                        str = c14.a();
                    }
                    if (str != null) {
                        return new C.b.a(str);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                case 6:
                    StatusStringsResponse c15 = scanAndGoCheckoutStatusResponseDataModel.c();
                    if (c15 != null) {
                        str = c15.a();
                    }
                    if (str != null) {
                        return new C.b.C3232b(str);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                default:
                    throw new t();
            }
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
