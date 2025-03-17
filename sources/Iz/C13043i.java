package Iz;

import HJ.C15854t;
import android.annotation.SuppressLint;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lx4/o;", "LXH/N;", "a", "(Lx4/o;)V", "scanandgo-api_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.i  reason: case insensitive filesystem */
public final class C13043i {
    @SuppressLint({"RestrictedApi"})
    public static final void a(C8951o oVar) {
        Object obj;
        char c10;
        char c11;
        C17542s.j(oVar, "<this>");
        ArrayList arrayList = new ArrayList();
        for (C8948l e10 : oVar.G().getValue()) {
            String C10 = e10.e().C();
            if (C10 != null) {
                arrayList.add(C10);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C15854t.d0((String) obj, "scanandgo", false, 2, (Object) null)) {
                break;
            }
        }
        String str = (String) obj;
        char c12 = '$';
        if (str != null) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList2.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList2) {
                if (str2 == null) {
                    String a10 = C11818a.a("Will pop inclusive to " + str, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = oVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c12, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
                c12 = '$';
            }
            C8951o.o0(oVar, str, true, false, 4, (Object) null);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Could not find rout " + "scanandgo");
        e eVar2 = e.WARN;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next2 : d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList3.add(next2);
            }
        }
        String str6 = null;
        String str7 = null;
        for (C11819b bVar2 : arrayList3) {
            if (str6 == null) {
                String a11 = C11818a.a((String) null, illegalStateException);
                if (a11 == null) {
                    break;
                }
                str6 = C11820c.a(a11);
            }
            if (str7 == null) {
                String name2 = oVar.getClass().getName();
                C17542s.g(name2);
                c10 = '$';
                c11 = 2;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                c10 = '$';
                c11 = 2;
            }
            String str8 = str7;
            char c13 = c10;
            char c14 = c11;
            bVar2.a(eVar2, str8, false, illegalStateException, str6);
            str7 = str8;
            C8951o oVar2 = oVar;
        }
        oVar.k0();
    }
}
