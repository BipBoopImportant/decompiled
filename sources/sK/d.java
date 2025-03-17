package Sk;

import HJ.C15854t;
import am.C11070a;
import com.ingka.ikea.killswitch.model.KillSwitchConfig;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHB¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LSk/d;", "LSk/c;", "Ltf/a;", "killSwitchRepository", "Lam/a;", "appApi", "<init>", "(Ltf/a;Lam/a;)V", "", "a", "(LdI/e;)Ljava/lang/Object;", "Ltf/a;", "b", "Lam/a;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final C10253a f87198a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C11070a f87199b;

    public d(C10253a aVar, C11070a aVar2) {
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(aVar2, "appApi");
        this.f87198a = aVar;
        this.f87199b = aVar2;
    }

    private static final boolean c(KillSwitchConfig killSwitchConfig, d dVar) {
        String O10;
        if (killSwitchConfig == null || (O10 = killSwitchConfig.O()) == null) {
            return false;
        }
        return O10.equals(dVar.f87199b.a());
    }

    public Object a(C17164e<? super Boolean> eVar) {
        String str;
        KillSwitchConfig value = this.f87198a.I().getValue();
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = this.f87199b.a();
                if (value == null || (str = value.O()) == null) {
                    str = "-";
                }
                String a11 = C11818a.a("App Version: " + a10 + ", KillSwitch Version: " + str, (Throwable) null);
                if (a11 == null) {
                    break;
                }
                str2 = C11820c.a(a11);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = d.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar2, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        return !c(value, this) ? this.f87198a.f(eVar) : b.a(true);
    }
}
