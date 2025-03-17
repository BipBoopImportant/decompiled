package Sg;

import Nn.C10813p;
import Ur.a;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LSg/a;", "", "<init>", "()V", "LNn/p;", "deliveryServiceType", "LUr/a$a;", "b", "(LNn/p;)LUr/a$a;", "", "a", "(LNn/p;)Z", "common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f63419a = new a();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Sg.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C1091a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f63420a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f63421b;

        /* JADX WARNING: Can't wrap try/catch for region: R(20:0|(2:1|2)|3|5|6|7|8|9|10|11|12|13|14|15|17|18|19|20|21|23) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0022 */
        static {
            /*
                Nn.p[] r0 = Nn.C10813p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                Nn.p r2 = Nn.C10813p.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                Nn.p r3 = Nn.C10813p.PICKUP     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nn.p r3 = Nn.C10813p.PICKUP_STORE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r4 = 3
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Nn.p r3 = Nn.C10813p.CLICK_AND_COLLECT_STORE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r4 = 4
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Nn.p r3 = Nn.C10813p.CLICK_AND_COLLECT_NEAR_YOU     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r4 = 5
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                Nn.p r3 = Nn.C10813p.LOCKER     // Catch:{ NoSuchFieldError -> 0x003d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r4 = 6
                r0[r3] = r4     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f63420a = r0
                Ur.a$a[] r0 = Ur.a.C1858a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Ur.a$a r3 = Ur.a.C1858a.HOME     // Catch:{ NoSuchFieldError -> 0x004e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                Ur.a$a r1 = Ur.a.C1858a.COLLECT     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                f63421b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Sg.a.C1091a.<clinit>():void");
        }
    }

    private a() {
    }

    public final boolean a(C10813p pVar) {
        C17542s.j(pVar, "deliveryServiceType");
        a.C1858a b10 = b(pVar);
        int i10 = b10 == null ? -1 : C1091a.f63421b[b10.ordinal()];
        if (i10 == -1) {
            return false;
        }
        if (i10 == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new t();
    }

    public final a.C1858a b(C10813p pVar) {
        switch (pVar == null ? -1 : C1091a.f63420a[pVar.ordinal()]) {
            case -1:
                return null;
            case 1:
                return a.C1858a.HOME;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return a.C1858a.COLLECT;
            default:
                throw new t();
        }
    }
}
