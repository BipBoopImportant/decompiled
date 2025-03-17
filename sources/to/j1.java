package to;

import HJ.C15854t;
import Ur.a;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import tI.C17978n;
import uI.C18059h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "LUr/a$b$a$c;", "options", "Lto/z0;", "a", "(Ljava/util/List;)Lto/z0;", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j1 {

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"to/j1$a", "Lto/z0;", "", "idType", "input", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "country", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C11978z0 {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map<String, C18059h<Boolean>> f103164a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Map<String, C18059h<Boolean>> f103165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Map<String, C18059h<Boolean>> f103166c;

        a(Map<String, ? extends C18059h<Boolean>> map, Map<String, ? extends C18059h<Boolean>> map2, Map<String, ? extends C18059h<Boolean>> map3) {
            this.f103164a = map;
            this.f103165b = map2;
            this.f103166c = map3;
        }

        public boolean a(String str, String str2) {
            C17542s.j(str, "idType");
            C17542s.j(str2, "input");
            C18059h hVar = this.f103164a.get(str);
            boolean z10 = false;
            if (hVar != null && ((Boolean) ((C17642l) hVar).invoke(str2)).booleanValue()) {
                z10 = true;
            }
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a("Google Pay - validateInput(type: " + str + "): " + z10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str3 = str5;
                str4 = str6;
            }
            return z10;
        }

        public boolean b(String str, String str2, String str3) {
            C17542s.j(str, "idType");
            C17542s.j(str2, "input");
            C18059h hVar = this.f103166c.get(str);
            boolean z10 = false;
            if (hVar != null && ((Boolean) ((p) hVar).invoke(str2, str3)).booleanValue()) {
                z10 = true;
            }
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a("Google Pay - validateSelection(idType: " + str + "): " + z10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str5;
                bVar.a(eVar, str7, false, (Throwable) null, str6);
                str4 = str6;
                str5 = str7;
            }
            return z10;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<String, Boolean> {
        b(Object obj) {
            super(1, obj, a.b.C1860a.c.class, "validateCountry", "validateCountry(Ljava/lang/String;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(((a.b.C1860a.c) this.receiver).e(str));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17642l<String, Boolean> {
        c(Object obj) {
            super(1, obj, a.b.C1860a.c.class, "validateInput", "validateInput(Ljava/lang/String;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(String str) {
            C17542s.j(str, "p0");
            return Boolean.valueOf(((a.b.C1860a.c) this.receiver).f(str));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements p<String, String, Boolean> {
        d(Object obj) {
            super(2, obj, a.b.C1860a.c.class, "validateSelection", "validateSelection(Ljava/lang/String;Ljava/lang/String;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(String str, String str2) {
            C17542s.j(str, "p0");
            return Boolean.valueOf(((a.b.C1860a.c) this.receiver).g(str, str2));
        }
    }

    public static final C11978z0 a(List<a.b.C1860a.c> list) {
        C17542s.j(list, "options");
        Iterable<a.b.C1860a.c> iterable = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (a.b.C1860a.c cVar : iterable) {
            v a10 = C16796C.a(cVar.d(), new c(cVar));
            linkedHashMap.put(a10.c(), a10.d());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (a.b.C1860a.c cVar2 : iterable) {
            v a11 = C16796C.a(cVar2.d(), new b(cVar2));
            linkedHashMap2.put(a11.c(), a11.d());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (a.b.C1860a.c cVar3 : iterable) {
            v a12 = C16796C.a(cVar3.d(), new d(cVar3));
            linkedHashMap3.put(a12.c(), a12.d());
        }
        return new a(linkedHashMap, linkedHashMap2, linkedHashMap3);
    }
}
