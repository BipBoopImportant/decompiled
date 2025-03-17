package jy;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import gy.C14522a;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rw.c;
import x4.C;
import x4.C8951o;
import x4.I;
import x4.v;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljy/c;", "Lgy/a;", "<init>", "()V", "Lx4/o;", "navController", "LXH/N;", "b", "(Lx4/o;)V", "Lx4/C;", "navOptions", "a", "(Lx4/o;Lx4/C;)V", "", "c", "()Ljava/lang/String;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jy.c  reason: case insensitive filesystem */
public final class C14656c implements C14522a {
    public void a(C8951o oVar, C c10) {
        char c11;
        C17542s.j(oVar, "navController");
        v J10 = oVar.J();
        String str = null;
        char c12 = '$';
        Class<C14656c> cls = C14656c.class;
        if (!C17542s.e(J10 != null ? J10.C() : null, "region/select")) {
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Launching region selection.", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c12, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str3 = str5;
                str2 = str4;
                c12 = '$';
            }
            C8951o.g0(oVar, "region/select", c10, (I.a) null, 4, (Object) null);
            return;
        }
        e eVar2 = e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str6 = null;
        String str7 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str6 == null) {
                String a11 = C11818a.a("The region selection is already launched.", (Throwable) null);
                if (a11 != null) {
                    str6 = C11820c.a(a11);
                } else {
                    return;
                }
            }
            if (str7 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                c11 = '$';
                String o13 = C15854t.o1(C15854t.s1(name2, '$', str, 2, str), '.', str, 2, str);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c11 = '$';
            }
            char c13 = c11;
            bVar2.a(eVar2, str7, false, (Throwable) null, str6);
            str = null;
        }
    }

    public void b(C8951o oVar) {
        C17542s.j(oVar, "navController");
        C8951o.g0(oVar, "region/settings", c.f28698a.c().a(), (I.a) null, 4, (Object) null);
    }

    public String c() {
        return "ikea://navigation/region/settings";
    }
}
