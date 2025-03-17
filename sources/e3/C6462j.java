package E3;

import E3.C6455c;
import E3.N;
import E3.q;
import android.content.Context;
import q3.A;
import t3.N;

/* renamed from: E3.j  reason: case insensitive filesystem */
public final class C6462j implements q.b {

    /* renamed from: a  reason: collision with root package name */
    private final Context f34806a;

    /* renamed from: b  reason: collision with root package name */
    private int f34807b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f34808c = false;

    public C6462j(Context context) {
        this.f34806a = context;
    }

    private boolean b() {
        int i10 = N.f29462a;
        if (i10 >= 31) {
            return true;
        }
        Context context = this.f34806a;
        return context != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen");
    }

    public q a(q.a aVar) {
        int i10;
        if (N.f29462a < 23 || ((i10 = this.f34807b) != 1 && (i10 != 0 || !b()))) {
            return new N.b().a(aVar);
        }
        int k10 = A.k(aVar.f34816c.f28244o);
        t3.q.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + t3.N.r0(k10));
        C6455c.b bVar = new C6455c.b(k10);
        bVar.e(this.f34808c);
        return bVar.a(aVar);
    }
}
