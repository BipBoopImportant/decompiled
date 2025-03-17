package Mw;

import Ae.e;
import HJ.C15854t;
import Nn.F;
import Rg.a;
import Rg.b;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u000e2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"LMw/b;", "LMw/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "", "d", "(Z)Ljava/lang/String;", "LNn/F;", "paymentTransaction", "LRg/a;", "type", "LXH/N;", "c", "(LNn/F;LRg/a;)V", "success", "a", "(Z)V", "", "paymentBrands", "b", "(Ljava/util/List;)V", "LAe/e;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mw.b  reason: case insensitive filesystem */
public final class C13212b implements C13211a {

    /* renamed from: a  reason: collision with root package name */
    private final e f112046a;

    public C13212b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f112046a = eVar;
    }

    private final String d(boolean z10) {
        return z10 ? "SUCCESS" : "FAILURE";
    }

    public void a(boolean z10) {
        this.f112046a.track(b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "submit_express_address"), C16796C.a("checkout_option_value", d(z10)), C16796C.a("checkout_step", 2)));
    }

    public void b(List<String> list) {
        String str;
        C17542s.j(list, "paymentBrands");
        if (list.size() > 1) {
            str = "COMBINED_CARDS";
        } else if (list.size() == 1) {
            str = (String) C16877v.y0(list);
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Empty payment brands");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C13212b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalArgumentException, str4);
                str2 = str4;
                str3 = str5;
            }
            str = null;
        }
        this.f112046a.track(b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "payment_provider"), C16796C.a("checkout_option_value", str), C16796C.a("checkout_step", 2)));
    }

    public void c(F f10, a aVar) {
        String str;
        String str2;
        String b10;
        C17542s.j(aVar, "type");
        String str3 = "UNAVAILABLE";
        if (f10 == null || (str = f10.e()) == null) {
            str = str3;
        }
        if (f10 != null && f10.g()) {
            str2 = "SUCCESS";
        } else if (f10 == null || (str2 = f10.c()) == null) {
            str2 = str3;
        }
        String str4 = str + " - " + str2;
        if (!(f10 == null || (b10 = f10.b()) == null)) {
            str3 = b10;
        }
        this.f112046a.track(b.CHECKOUT_PROGRESS.b(), X.m(C16796C.a("checkout_option", "payment_response_feedback"), C16796C.a("checkout_option_value", str4), C16796C.a("payment_provider", str3), C16796C.a("checkout_step", 2), C16796C.a("checkout_type", aVar.a())));
    }
}
