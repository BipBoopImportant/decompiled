package x0;

import kotlin.Metadata;
import m0.C5546i;
import p0.C5689g;
import tI.C17978n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00178\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u001a¨\u0006\u001c"}, d2 = {"Lx0/j;", "Lp0/g;", "Lx0/C;", "pagerState", "defaultBringIntoViewSpec", "<init>", "(Lx0/C;Lp0/g;)V", "", "proposedOffsetMove", "c", "(F)F", "offset", "size", "containerSize", "a", "(FFF)F", "b", "Lx0/C;", "getPagerState", "()Lx0/C;", "Lp0/g;", "getDefaultBringIntoViewSpec", "()Lp0/g;", "Lm0/i;", "d", "Lm0/i;", "()Lm0/i;", "scrollAnimationSpec", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class j implements C5689g {

    /* renamed from: b  reason: collision with root package name */
    private final C6230C f31706b;

    /* renamed from: c  reason: collision with root package name */
    private final C5689g f31707c;

    /* renamed from: d  reason: collision with root package name */
    private final C5546i<Float> f31708d;

    public j(C6230C c10, C5689g gVar) {
        this.f31706b = c10;
        this.f31707c = gVar;
        this.f31708d = gVar.b();
    }

    private final float c(float f10) {
        float z10 = ((float) this.f31706b.z()) * ((float) -1);
        while (f10 > 0.0f && z10 < f10) {
            z10 += (float) this.f31706b.I();
        }
        while (f10 < 0.0f && z10 > f10) {
            z10 -= (float) this.f31706b.I();
        }
        return z10;
    }

    public float a(float f10, float f11, float f12) {
        float a10 = this.f31707c.a(f10, f11, f12);
        if (a10 != 0.0f) {
            return c(a10);
        }
        if (this.f31706b.z() == 0) {
            return 0.0f;
        }
        float z10 = ((float) this.f31706b.z()) * -1.0f;
        if (this.f31706b.B()) {
            z10 += (float) this.f31706b.I();
        }
        return C17978n.l(z10, -f12, f12);
    }

    public C5546i<Float> b() {
        return this.f31708d;
    }
}
