package S;

import G.q;
import androidx.camera.core.impl.C5037n0;
import androidx.camera.core.impl.I;
import java.util.UUID;

public class r extends C5037n0 {

    /* renamed from: b  reason: collision with root package name */
    private final String f12569b;

    /* renamed from: c  reason: collision with root package name */
    private int f12570c;

    r(I i10) {
        super(i10);
        this.f12569b = "virtual-" + i10.d() + "-" + UUID.randomUUID().toString();
    }

    public int c() {
        return o(0);
    }

    public String d() {
        return this.f12569b;
    }

    public int o(int i10) {
        return q.w(super.o(i10) - this.f12570c);
    }

    /* access modifiers changed from: package-private */
    public void r(int i10) {
        this.f12570c = i10;
    }
}
