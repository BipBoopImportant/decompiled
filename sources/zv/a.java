package Zv;

import HJ.C15854t;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import p0.C5685c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a7\u0010\b\u001a\u00020\u0007*\u00020\u00002\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\"$\u0010\u0018\u001a\u00020\u0013*\b\u0012\u0004\u0012\u00020\u00120\u00118@X\u0004¢\u0006\f\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015\"$\u0010\u001d\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00120\u00118@X\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Landroidx/lifecycle/f0;", "Lkotlin/Function2;", "LQJ/Q;", "LdI/e;", "LXH/N;", "", "block", "LQJ/F0;", "e", "(Landroidx/lifecycle/f0;LnI/p;)LQJ/F0;", "", "a", "(Ljava/lang/String;)Ljava/lang/String;", "", "widthInPx", "b", "(Ljava/lang/String;I)Ljava/lang/String;", "Lp0/c;", "LKv/d;", "", "c", "(Lp0/c;)F", "getContentStateProgress$annotations", "(Lp0/c;)V", "contentStateProgress", "", "d", "(Lp0/c;)Z", "isAtTarget$annotations", "isAtTarget", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Zv/a$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zv.a$a  reason: collision with other inner class name */
    public static final class C0730a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0 f41426a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0730a(N.a aVar, f0 f0Var) {
            super(aVar);
            this.f41426a = f0Var;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f0 f0Var = this.f41426a;
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = f0Var.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public static final String a(String str) {
        C17542s.j(str, "<this>");
        return b(str, 1080);
    }

    public static final String b(String str, int i10) {
        C17542s.j(str, "<this>");
        return str + "?imwidth=" + i10;
    }

    public static final float c(C5685c<Kv.d> cVar) {
        C17542s.j(cVar, "<this>");
        if (cVar.n().a() == 0) {
            return 0.0f;
        }
        return cVar.z(Kv.d.Floating, Kv.d.Docked);
    }

    public static final boolean d(C5685c<Kv.d> cVar) {
        C17542s.j(cVar, "<this>");
        return c(cVar) == 1.0f;
    }

    public static final F0 e(f0 f0Var, p<? super Q, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        C17542s.j(f0Var, "<this>");
        C17542s.j(pVar, "block");
        return C16314k.d(g0.a(f0Var), new C0730a(N.f137593c0, f0Var), (T) null, pVar, 2, (Object) null);
    }
}
