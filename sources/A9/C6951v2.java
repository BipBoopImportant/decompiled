package a9;

import com.contentsquare.android.sdk.W;
import d9.C;
import d9.C7759e;
import d9.C7761g;
import d9.F;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.v2  reason: case insensitive filesystem */
public final class C6951v2 extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final W f42899b;

    public C6951v2(W w10) {
        C17542s.j(w10, "event");
        this.f42899b = w10;
        b(w10.f47741j);
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7759e.a aVar = C7759e.f50780b;
        C.a s10 = C.s();
        C17542s.i(s10, "newBuilder()");
        C7759e a11 = aVar.a(s10);
        String str = this.f42899b.f47195m;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        a11.e(str);
        String str3 = this.f42899b.f47196n;
        if (str3 != null) {
            str2 = str3;
        }
        a11.d(str2);
        Long l10 = this.f42899b.f47197o;
        a11.f(l10 != null ? l10.longValue() : 0);
        a11.c(a11.b(), this.f42899b.f47198p);
        a11.g(this.f42899b.f47741j);
        a10.e(a11.a());
        return a10.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6951v2) && C17542s.e(this.f42899b, ((C6951v2) obj).f42899b);
    }

    public final int hashCode() {
        return this.f42899b.hashCode();
    }

    public final String toString() {
        return "CustomErrorSrEvent(event=" + this.f42899b + ')';
    }
}
