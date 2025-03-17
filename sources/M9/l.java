package m9;

import WH.C16729a;
import android.content.Context;
import n9.b;

public final class l implements b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<Context> f55050a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<i> f55051b;

    public l(C16729a<Context> aVar, C16729a<i> aVar2) {
        this.f55050a = aVar;
        this.f55051b = aVar2;
    }

    public static l a(C16729a<Context> aVar, C16729a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b */
    public k get() {
        return c(this.f55050a.get(), this.f55051b.get());
    }
}
