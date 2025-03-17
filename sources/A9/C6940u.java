package a9;

import com.contentsquare.android.sdk.C7115b;
import d9.C7761g;
import d9.C7769o;
import d9.F;
import d9.K;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.u  reason: case insensitive filesystem */
public final class C6940u extends C6921r4 {

    /* renamed from: b  reason: collision with root package name */
    public final C7115b f42878b;

    public C6940u(C7115b bVar) {
        C17542s.j(bVar, "event");
        this.f42878b = bVar;
        b(bVar.f47741j);
    }

    public final F c() {
        C7761g a10 = C6810d4.a("newBuilder()", C7761g.f50784b);
        C7769o.a aVar = C7769o.f50811b;
        K.a r10 = K.r();
        C17542s.i(r10, "newBuilder()");
        C7769o a11 = aVar.a(r10);
        String str = this.f42878b.f47286m;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        a11.f(str);
        String str3 = this.f42878b.f47287n;
        if (str3 == null) {
            str3 = str2;
        }
        a11.d(str3);
        String str4 = this.f42878b.f47288o;
        if (str4 == null) {
            str4 = str2;
        }
        a11.g(str4);
        Integer num = this.f42878b.f47289p;
        int i10 = 0;
        a11.b(num != null ? num.intValue() : 0);
        Integer num2 = this.f42878b.f47290q;
        if (num2 != null) {
            i10 = num2.intValue();
        }
        a11.e(i10);
        String str5 = this.f42878b.f47291r;
        if (str5 != null) {
            str2 = str5;
        }
        a11.c(str2);
        Long l10 = this.f42878b.f47292s;
        a11.h(l10 != null ? l10.longValue() : 0);
        a11.i(this.f42878b.f47741j);
        a10.i(a11.a());
        return a10.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6940u) && C17542s.e(this.f42878b, ((C6940u) obj).f42878b);
    }

    public final int hashCode() {
        return this.f42878b.hashCode();
    }

    public final String toString() {
        return "JsErrorSrEvent(event=" + this.f42878b + ')';
    }
}
