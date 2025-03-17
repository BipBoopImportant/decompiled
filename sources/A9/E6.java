package a9;

import YH.C16877v;
import d9.F;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import v8.b;

public final class E6 {

    /* renamed from: c  reason: collision with root package name */
    public static final List<Integer> f41987c = C16877v.q(25, 26, 21, Integer.valueOf(F.b.CUSTOM_ERROR.d()), Integer.valueOf(F.b.JS_ERROR.d()), Integer.valueOf(F.b.NETWORK_REQUEST_METRIC.d()));

    /* renamed from: a  reason: collision with root package name */
    public final b f41988a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedHashMap f41989b = new LinkedHashMap();

    public E6(b bVar) {
        C17542s.j(bVar, "screenViewTracker");
        this.f41988a = bVar;
    }

    public final boolean a(int i10) {
        if (!f41987c.contains(Integer.valueOf(i10))) {
            return false;
        }
        if (this.f41988a.c()) {
            this.f41989b.clear();
            this.f41988a.e();
        }
        Integer num = (Integer) this.f41989b.get(Integer.valueOf(i10));
        return (num != null ? num.intValue() : 0) >= 20;
    }
}
