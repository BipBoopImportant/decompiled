package ea;

import H9.C6536j;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;
import na.A;

final class H extends A {

    /* renamed from: a  reason: collision with root package name */
    private final D f50907a;

    H(D d10) {
        this.f50907a = d10;
    }

    /* access modifiers changed from: package-private */
    public final H K3(C6536j jVar) {
        this.f50907a.a(jVar);
        return this;
    }

    public final void L1(LocationResult locationResult) {
        this.f50907a.zza().c(new E(this, locationResult));
    }

    /* access modifiers changed from: package-private */
    public final void L3() {
        this.f50907a.zza().a();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ D M3() {
        return this.f50907a;
    }

    public final void h0(LocationAvailability locationAvailability) {
        this.f50907a.zza().c(new F(this, locationAvailability));
    }

    public final void i() {
        this.f50907a.zza().c(new G(this));
    }
}
