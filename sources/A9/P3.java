package a9;

import SJ.C16428d;
import SJ.C16434j;
import SJ.C16437m;
import TJ.C16532g;
import TJ.C16534i;
import com.contentsquare.android.internal.core.telemetry.event.a;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

public final class P3<T extends a> {

    /* renamed from: a  reason: collision with root package name */
    public final C16434j<T> f42202a;

    /* renamed from: b  reason: collision with root package name */
    public final C16532g<T> f42203b;

    public P3() {
        C16434j<T> b10 = C16437m.b(10, C16428d.DROP_LATEST, (C17642l) null, 4, (Object) null);
        this.f42202a = b10;
        this.f42203b = C16534i.V(b10);
    }

    public final C16532g<T> a() {
        return this.f42203b;
    }

    public final void b(T t10) {
        C17542s.j(t10, "event");
        this.f42202a.k(t10);
    }
}
