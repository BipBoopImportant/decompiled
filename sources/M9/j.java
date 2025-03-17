package m9;

import WH.C16729a;
import android.content.Context;
import n9.b;
import v9.C8903a;

public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<Context> f55042a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<C8903a> f55043b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<C8903a> f55044c;

    public j(C16729a<Context> aVar, C16729a<C8903a> aVar2, C16729a<C8903a> aVar3) {
        this.f55042a = aVar;
        this.f55043b = aVar2;
        this.f55044c = aVar3;
    }

    public static j a(C16729a<Context> aVar, C16729a<C8903a> aVar2, C16729a<C8903a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, C8903a aVar, C8903a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public i get() {
        return c(this.f55042a.get(), this.f55043b.get(), this.f55044c.get());
    }
}
