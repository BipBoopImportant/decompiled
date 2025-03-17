package t9;

import WH.C16729a;
import android.content.Context;
import n9.b;

public final class X implements b<W> {

    /* renamed from: a  reason: collision with root package name */
    private final C16729a<Context> f56705a;

    /* renamed from: b  reason: collision with root package name */
    private final C16729a<String> f56706b;

    /* renamed from: c  reason: collision with root package name */
    private final C16729a<Integer> f56707c;

    public X(C16729a<Context> aVar, C16729a<String> aVar2, C16729a<Integer> aVar3) {
        this.f56705a = aVar;
        this.f56706b = aVar2;
        this.f56707c = aVar3;
    }

    public static X a(C16729a<Context> aVar, C16729a<String> aVar2, C16729a<Integer> aVar3) {
        return new X(aVar, aVar2, aVar3);
    }

    public static W c(Context context, String str, int i10) {
        return new W(context, str, i10);
    }

    /* renamed from: b */
    public W get() {
        return c(this.f56705a.get(), this.f56706b.get(), this.f56707c.get().intValue());
    }
}
