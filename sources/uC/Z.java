package Uc;

import android.os.Bundle;
import androidx.lifecycle.C5218v;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import com.google.android.gms.maps.MapView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\fJ\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019¨\u0006\u001b"}, d2 = {"LUc/Z;", "Landroidx/lifecycle/v;", "Lcom/google/android/gms/maps/MapView;", "mapView", "<init>", "(Lcom/google/android/gms/maps/MapView;)V", "Landroidx/lifecycle/r$b;", "targetState", "LXH/N;", "g", "(Landroidx/lifecycle/r$b;)V", "b", "()V", "h", "Landroidx/lifecycle/r$a;", "event", "a", "(Landroidx/lifecycle/r$a;)V", "Landroidx/lifecycle/y;", "source", "e", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "d", "f", "Lcom/google/android/gms/maps/MapView;", "Landroidx/lifecycle/r$b;", "currentLifecycleState", "maps-compose_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class Z implements C5218v {

    /* renamed from: a  reason: collision with root package name */
    private final MapView f64216a;

    /* renamed from: b  reason: collision with root package name */
    private r.b f64217b = r.b.INITIALIZED;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f64218a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                androidx.lifecycle.r$a[] r0 = androidx.lifecycle.r.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                androidx.lifecycle.r$a r1 = androidx.lifecycle.r.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f64218a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Uc.Z.a.<clinit>():void");
        }
    }

    public Z(MapView mapView) {
        C17542s.j(mapView, "mapView");
        this.f64216a = mapView;
    }

    private final void a(r.a aVar) {
        switch (a.f64218a[aVar.ordinal()]) {
            case 1:
                this.f64216a.c();
                break;
            case 2:
                this.f64216a.b(new Bundle());
                break;
            case 3:
                this.f64216a.h();
                break;
            case 4:
                this.f64216a.f();
                break;
            case 5:
                this.f64216a.e();
                break;
            case 6:
                this.f64216a.i();
                break;
            default:
                throw new IllegalStateException(("Unsupported lifecycle event: " + aVar).toString());
        }
        this.f64217b = aVar.j();
    }

    private final void b() {
        r.a a10 = r.a.Companion.a(this.f64217b);
        if (a10 != null) {
            a(a10);
            return;
        }
        throw new IllegalStateException(("no event down from " + this.f64217b).toString());
    }

    private final void g(r.b bVar) {
        while (true) {
            r.b bVar2 = this.f64217b;
            if (bVar2 == bVar) {
                return;
            }
            if (bVar2.compareTo(bVar) < 0) {
                h();
            } else if (this.f64217b.compareTo(bVar) > 0) {
                b();
            }
        }
    }

    private final void h() {
        r.a b10 = r.a.Companion.b(this.f64217b);
        if (b10 != null) {
            a(b10);
            return;
        }
        throw new IllegalStateException(("no event up from " + this.f64217b).toString());
    }

    public final void d() {
        r.b bVar = this.f64217b;
        r.b bVar2 = r.b.CREATED;
        if (bVar.compareTo(bVar2) > 0) {
            g(bVar2);
        }
    }

    public void e(C5221y yVar, r.a aVar) {
        C17542s.j(yVar, "source");
        C17542s.j(aVar, "event");
        if (a.f64218a[aVar.ordinal()] == 1) {
            d();
        } else {
            g(aVar.j());
        }
    }

    public final void f() {
        if (this.f64217b.compareTo(r.b.INITIALIZED) > 0) {
            g(r.b.DESTROYED);
        }
    }
}
