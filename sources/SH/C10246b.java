package sh;

import GK.C15774B;
import GK.C15776D;
import GK.C15804w;
import HJ.C15854t;
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

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lsh/b;", "LGK/w;", "<init>", "()V", "LGK/w$a;", "chain", "LGK/D;", "intercept", "(LGK/w$a;)LGK/D;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sh.b  reason: case insensitive filesystem */
public final class C10246b implements C15804w {
    public C15776D intercept(C15804w.a aVar) {
        C15804w.a aVar2 = aVar;
        C17542s.j(aVar2, "chain");
        C15774B t10 = aVar.t();
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str = null;
        String str2 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            String str3 = DslKt.INDICATOR_BACKGROUND;
            Class<C10246b> cls = C10246b.class;
            if (hasNext) {
                C11819b bVar = (C11819b) it.next();
                if (str == null) {
                    String a10 = C11818a.a("Request --> " + t10.h() + " " + t10.k(), (Throwable) null);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    }
                }
                String str4 = str;
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                        str3 = DslKt.INDICATOR_MAIN;
                    }
                    str2 = str3 + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str2;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str = str4;
                str2 = str5;
            }
            try {
                C15776D b10 = aVar2.b(t10);
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
                    if (str7 == null) {
                        String a11 = C11818a.a("Response <-- " + b10.g() + " " + b10.z().k(), (Throwable) null);
                        if (a11 == null) {
                            break;
                        }
                        str7 = C11820c.a(a11);
                    }
                    if (str6 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str6, false, (Throwable) null, str7);
                }
                return b10;
            } catch (Exception e10) {
                Exception exc = e10;
                e eVar3 = e.DEBUG;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar3 : arrayList3) {
                    if (str8 == null) {
                        String a12 = C11818a.a("Request failed: " + exc.getMessage(), (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str8 = C11820c.a(a12);
                    }
                    if (str9 == null) {
                        String name3 = cls.getName();
                        C17542s.g(name3);
                        String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o14.length() != 0) {
                            name3 = C15854t.P0(o14, "Kt");
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + name3;
                    }
                    bVar3.a(eVar3, str9, false, (Throwable) null, str8);
                }
                throw exc;
            }
        }
    }
}
