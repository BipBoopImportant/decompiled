package r9;

import WH.C16729a;
import android.content.Context;
import n9.b;
import n9.d;
import s9.f;
import s9.x;
import t9.C8856d;
import v9.C8903a;

public final class i implements b<x> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<Context> f55799a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<C8856d> f55800b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<f> f55801c;

    /* renamed from: d  reason: collision with root package name */
    private final C16729a<C8903a> f55802d;

    public i(C16729a<Context> aVar, C16729a<C8856d> aVar2, C16729a<f> aVar3, C16729a<C8903a> aVar4) {
        this.f55799a = aVar;
        this.f55800b = aVar2;
        this.f55801c = aVar3;
        this.f55802d = aVar4;
    }

    public static i a(C16729a<Context> aVar, C16729a<C8856d> aVar2, C16729a<f> aVar3, C16729a<C8903a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static x c(Context context, C8856d dVar, f fVar, C8903a aVar) {
        return (x) d.d(h.a(context, dVar, fVar, aVar));
    }

    /* renamed from: b */
    public x get() {
        return c(this.f55799a.get(), this.f55800b.get(), this.f55801c.get(), this.f55802d.get());
    }
}
