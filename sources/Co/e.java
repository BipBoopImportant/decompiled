package Co;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Ur.a;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import rv.C11849b;
import to.C11970v0;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LCo/e;", "", "<init>", "()V", "", "acceptedTermsAndConditions", "acceptedPrivacyPolicy", "taxIdSelectionValid", "LUr/a$b$a;", "googlePayConfiguration", "Lto/v0;", "b", "(ZZZLUr/a$b$a;)Lto/v0;", "hasFiscalCode", "LIC/e;", "a", "(Z)LIC/e;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f79654a = new e();

    private e() {
    }

    public final C13023e a(boolean z10) {
        return z10 ? C13026h.a(C11849b.f102255X0) : C13026h.a(C11849b.f102251W0);
    }

    public final C11970v0 b(boolean z10, boolean z11, boolean z12, a.b.C1860a aVar) {
        boolean z13 = z10;
        C17542s.j(aVar, "googlePayConfiguration");
        boolean z14 = false;
        boolean z15 = !aVar.f() || z12;
        boolean z16 = z11 || aVar.h().a() == null;
        qv.e eVar = qv.e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a("Google Pay/requirements: terms = " + z13 + ", policy = " + z16 + ", id/tax = " + z15, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = e.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        if (z13 && z16 && z15) {
            z14 = true;
        }
        return new C11970v0(z14, aVar.c(), new C11970v0.a(aVar.a(), aVar.b()));
    }
}
