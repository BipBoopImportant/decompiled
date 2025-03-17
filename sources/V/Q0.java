package v;

import C.C4391e0;
import C.r;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.Q;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import java.util.Objects;

class Q0 {

    /* renamed from: a  reason: collision with root package name */
    private final Q f30369a;

    /* renamed from: b  reason: collision with root package name */
    private final K<r> f30370b;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30371a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.core.impl.J$a[] r0 = androidx.camera.core.impl.J.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30371a = r0
                androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.PENDING_OPEN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30371a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.OPENING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30371a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30371a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.CONFIGURED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30371a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.CLOSING     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30371a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.RELEASING     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30371a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.CLOSED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f30371a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.camera.core.impl.J$a r1 = androidx.camera.core.impl.J.a.RELEASED     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v.Q0.a.<clinit>():void");
        }
    }

    Q0(Q q10) {
        this.f30369a = q10;
        K<r> k10 = new K<>();
        this.f30370b = k10;
        k10.postValue(r.a(r.b.CLOSED));
    }

    private r b() {
        return this.f30369a.c() ? r.a(r.b.OPENING) : r.a(r.b.PENDING_OPEN);
    }

    public F<r> a() {
        return this.f30370b;
    }

    public void c(J.a aVar, r.a aVar2) {
        r rVar;
        switch (a.f30371a[aVar.ordinal()]) {
            case 1:
                rVar = b();
                break;
            case 2:
                rVar = r.b(r.b.OPENING, aVar2);
                break;
            case 3:
            case 4:
                rVar = r.b(r.b.OPEN, aVar2);
                break;
            case 5:
            case 6:
                rVar = r.b(r.b.CLOSING, aVar2);
                break;
            case 7:
            case 8:
                rVar = r.b(r.b.CLOSED, aVar2);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + aVar);
        }
        C4391e0.a("CameraStateMachine", "New public camera state " + rVar + " from " + aVar + " and " + aVar2);
        if (!Objects.equals(this.f30370b.getValue(), rVar)) {
            C4391e0.a("CameraStateMachine", "Publishing new public camera state " + rVar);
            this.f30370b.postValue(rVar);
        }
    }
}
