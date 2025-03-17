package Rw;

import HJ.C15854t;
import Nn.C10813p;
import Ow.C13323a;
import Sg.a;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LRw/d;", "LRw/c;", "LRw/a;", "getCheckoutSelectedDeliveryTypeUseCase", "<init>", "(LRw/a;)V", "", "checkoutId", "LOw/a$a$a;", "a", "(Ljava/lang/String;)LOw/a$a$a;", "LRw/a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Rw.d  reason: case insensitive filesystem */
public final class C13556d implements C13555c {

    /* renamed from: a  reason: collision with root package name */
    private final C13553a f115604a;

    public C13556d(C13553a aVar) {
        C17542s.j(aVar, "getCheckoutSelectedDeliveryTypeUseCase");
        this.f115604a = aVar;
    }

    public C13323a.C2787a.C2788a a(String str) {
        boolean z10;
        C17542s.j(str, "checkoutId");
        C10813p a10 = this.f115604a.a(str);
        if (a10 != null) {
            z10 = a.f63419a.a(a10);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("No delivery type available");
            e eVar = e.ERROR;
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
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str2 = C11820c.a(a11);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C13556d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, illegalStateException, str4);
                str2 = str4;
                str3 = str5;
            }
            z10 = false;
        }
        return new C13323a.C2787a.C2788a(z10);
    }
}
