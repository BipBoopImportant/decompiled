package Ae;

import HJ.C15854t;
import XH.v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0019\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R<\u0010\u001c\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0019j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004`\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001d"}, d2 = {"LAe/t;", "LAe/i;", "<init>", "()V", "LXH/v;", "", "keyValue", "LXH/N;", "a", "(LXH/v;)V", "retailCode", "c", "(Ljava/lang/String;)LAe/t;", "storeId", "d", "userValue", "e", "languageCode", "b", "installationId", "l", "(Ljava/lang/String;)LAe/i;", "", "g", "()Ljava/util/List;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "userPropertiesList", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements i {

    /* renamed from: b  reason: collision with root package name */
    public static final a f58690b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<v<String, String>> f58691a = new ArrayList<>();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"LAe/t$a;", "", "<init>", "()V", "", "MARKET_KEY", "Ljava/lang/String;", "STORE_KEY", "LANGUAGE_KEY", "USER_TYPE_KEY", "AB_TEST_KEY", "IKEA_INSTALLATION_ID", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final void a(v<String, String> vVar) {
        String str;
        Class<t> cls;
        v<String, String> vVar2 = vVar;
        e eVar = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            cls = t.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Add user property: " + vVar.c() + " with value: " + vVar.d(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        if (vVar.c().length() > 24 || vVar.d().length() > 36) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("User property max char length exceeded in " + vVar2);
            e eVar2 = e.ERROR;
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
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str7, false, illegalArgumentException, str6);
            }
            ArrayList<v<String, String>> arrayList3 = this.f58691a;
            c cVar = c.f58680a;
            arrayList3.add(new v(cVar.b(vVar.c()), cVar.c(vVar.d())));
            return;
        }
        this.f58691a.add(vVar2);
    }

    /* renamed from: b */
    public t h(String str) {
        if (!(str == null || str.length() == 0)) {
            a(new v("language", str));
        }
        return this;
    }

    /* renamed from: c */
    public t j(String str) {
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
                String a10 = C11818a.a("Set user property market: " + str, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = t.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        if (!(str == null || str.length() == 0)) {
            a(new v("market", str));
        }
        return this;
    }

    /* renamed from: d */
    public t k(String str) {
        C17542s.j(str, "storeId");
        a(new v(PlaceTypes.STORE, str));
        return this;
    }

    /* renamed from: e */
    public t i(String str) {
        C17542s.j(str, "userValue");
        a(new v("user_type", str));
        return this;
    }

    public List<v<String, String>> g() {
        return this.f58691a;
    }

    public i l(String str) {
        C17542s.j(str, "installationId");
        a(new v("ikea_installation_id", str));
        return this;
    }
}
