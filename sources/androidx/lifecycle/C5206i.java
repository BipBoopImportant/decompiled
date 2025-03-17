package androidx.lifecycle;

import androidx.lifecycle.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/i;", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/h;", "defaultLifecycleObserver", "lifecycleEventObserver", "<init>", "(Landroidx/lifecycle/h;Landroidx/lifecycle/v;)V", "Landroidx/lifecycle/y;", "source", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "a", "Landroidx/lifecycle/h;", "b", "Landroidx/lifecycle/v;", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.i  reason: case insensitive filesystem */
public final class C5206i implements C5218v {

    /* renamed from: a  reason: collision with root package name */
    private final C5205h f22288a;

    /* renamed from: b  reason: collision with root package name */
    private final C5218v f22289b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.i$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f22290a;

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
                androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                f22290a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C5206i.a.<clinit>():void");
        }
    }

    public C5206i(C5205h hVar, C5218v vVar) {
        C17542s.j(hVar, "defaultLifecycleObserver");
        this.f22288a = hVar;
        this.f22289b = vVar;
    }

    public void e(C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        switch (a.f22290a[aVar.ordinal()]) {
            case 1:
                this.f22288a.c(yVar);
                break;
            case 2:
                this.f22288a.onStart(yVar);
                break;
            case 3:
                this.f22288a.onResume(yVar);
                break;
            case 4:
                this.f22288a.onPause(yVar);
                break;
            case 5:
                this.f22288a.onStop(yVar);
                break;
            case 6:
                this.f22288a.onDestroy(yVar);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        C5218v vVar = this.f22289b;
        if (vVar != null) {
            vVar.e(yVar, aVar);
        }
    }
}
