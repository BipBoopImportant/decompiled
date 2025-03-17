package sg;

import HJ.C15854t;
import Lg.d;
import XH.C16807N;
import XH.t;
import XH.v;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.FragmentManager;
import com.google.android.libraries.places.api.model.Place;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import me.C10038a;
import nI.C17642l;
import qg.C10192b;
import qg.i;
import qg.x;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0001\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\b2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0001\u0010 \u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b \u0010!J=\u0010$\u001a\u00020\u001a2\u0012\u0010\u0013\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u00112\u0018\u0010#\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\"0\u0011H\u0002¢\u0006\u0004\b$\u0010%J\u0001\u0010+\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u0013\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0012\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\n\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u0018\u001a\u00020\b2\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lsg/e;", "", "<init>", "()V", "Lme/a;", "addressPickerNavigation", "Lqg/b$a;", "addressPickerBoundary", "", "currentValue", "countryCode", "Lme/a$b;", "cursorSelection", "", "enableAddStreetNumber", "", "pickerData", "", "Lqg/i;", "activeFields", "Landroidx/fragment/app/t;", "activity", "LLg/d;", "adapter", "componentValue", "Lkotlin/Function1;", "LXH/N;", "callback", "f", "(Lme/a;Lqg/b$a;Ljava/lang/String;Ljava/lang/String;Lme/a$b;ZLjava/util/Map;Ljava/util/List;Landroidx/fragment/app/t;LLg/d;Ljava/lang/String;LnI/l;)V", "Lme/a$a$b;", "cursorFocus", "d", "(Lme/a;Ljava/lang/String;Lme/a$a$b;ZLjava/util/Map;Ljava/util/List;LLg/d;Landroidx/fragment/app/t;Ljava/lang/String;LnI/l;)V", "LXH/v;", "pairs", "g", "(Ljava/util/List;Ljava/util/List;)V", "fragmentActivity", "Lqg/b$d;", "cursorFocusMode", "Lqg/b$b;", "pickerType", "c", "(Lme/a;Landroidx/fragment/app/t;LLg/d;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lqg/b$a;Lqg/b$d;Lqg/b$b;Ljava/lang/String;LnI/l;)V", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f76537a = new e();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f76538a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f76539b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        static {
            /*
                qg.b$d[] r0 = qg.C10192b.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                qg.b$d r2 = qg.C10192b.d.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                qg.b$d r3 = qg.C10192b.d.END     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f76538a = r0
                qg.b$b[] r0 = qg.C10192b.C1401b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                qg.b$b r3 = qg.C10192b.C1401b.GOOGLE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                qg.b$b r1 = qg.C10192b.C1401b.ADDRESS_LOOKUP     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                f76539b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.e.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"sg/e$b", "Lme/a$c;", "", "addressString", "Lcom/google/android/libraries/places/api/model/Place;", "place", "LXH/N;", "b", "(Ljava/lang/String;Lcom/google/android/libraries/places/api/model/Place;)V", "c", "(Ljava/lang/String;)V", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C10038a.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Map<String, String> f76540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List<i<?>> f76541b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f76542c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f76543d;

        b(Map<String, String> map, List<? extends i<?>> list, d dVar, C17642l<? super String, C16807N> lVar) {
            this.f76540a = map;
            this.f76541b = list;
            this.f76542c = dVar;
            this.f76543d = lVar;
        }

        public void b(String str, Place place) {
            C17542s.j(str, "addressString");
            C17542s.j(place, "place");
            List<v<String, String>> a10 = a(this.f76540a, place);
            if (!a10.isEmpty()) {
                e.f76537a.g(this.f76541b, a10);
                this.f76542c.notifyDataSetChanged();
            }
            this.f76543d.invoke(str);
        }

        public void c(String str) {
            C17542s.j(str, "addressString");
            this.f76543d.invoke(str);
        }
    }

    private e() {
    }

    private final void d(C10038a aVar, String str, C10038a.C1374a.b bVar, boolean z10, Map<String, String> map, List<? extends i<?>> list, d dVar, C5191t tVar, String str2, C17642l<? super String, C16807N> lVar) {
        FragmentManager supportFragmentManager = tVar.getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        Map<String, String> map2 = map;
        aVar.a(supportFragmentManager, new C10038a.C1374a.C1375a(str, (String) null, false, bVar, z10, 2, (DefaultConstructorMarker) null), (String) null, str2, new d(map, list, dVar, lVar));
    }

    /* access modifiers changed from: private */
    public static final C16807N e(Map map, List list, d dVar, C17642l lVar, C10038a.d dVar2) {
        C17542s.j(dVar2, "postalCodeAddress");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            v vVar = C17542s.e((String) entry.getKey(), "addressLookupZipCodeKey") ? new v((String) entry.getValue(), dVar2.c()) : null;
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        if (!arrayList.isEmpty()) {
            f76537a.g(list, arrayList);
            dVar.notifyDataSetChanged();
        }
        lVar.invoke(dVar2.b());
        return C16807N.f139792a;
    }

    private final void f(C10038a aVar, C10192b.a aVar2, String str, String str2, C10038a.b bVar, boolean z10, Map<String, String> map, List<? extends i<?>> list, C5191t tVar, d dVar, String str3, C17642l<? super String, C16807N> lVar) {
        FragmentManager supportFragmentManager = tVar.getSupportFragmentManager();
        C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
        aVar.c(supportFragmentManager, str2, aVar2 != null ? aVar2.a() : null, str, aVar2 != null ? aVar2.b() : false, z10, bVar, new b(map, list, dVar, lVar), str3);
    }

    /* access modifiers changed from: private */
    public final void g(List<? extends i<?>> list, List<v<String, String>> list2) {
        x xVar;
        Object obj;
        Collection collection = list;
        if (collection != null && !collection.isEmpty()) {
            for (v vVar : list2) {
                String str = (String) vVar.c();
                String str2 = (String) vVar.d();
                Iterator it = list.iterator();
                while (true) {
                    xVar = null;
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (C17542s.e(((i) obj).e(), str)) {
                        break;
                    }
                }
                i iVar = (i) obj;
                if (iVar != null) {
                    if (iVar instanceof x) {
                        xVar = (x) iVar;
                    }
                    if (xVar != null) {
                        xVar.r(str2);
                    }
                }
            }
        }
    }

    public final void c(C10038a aVar, C5191t tVar, d dVar, List<? extends i<?>> list, String str, Map<String, String> map, String str2, C10192b.a aVar2, C10192b.d dVar2, C10192b.C1401b bVar, String str3, C17642l<? super String, C16807N> lVar) {
        String str4;
        Class<e> cls;
        C10038a.b bVar2;
        C10038a.C1374a.b bVar3;
        C10038a.C1374a.b bVar4;
        C10038a.b bVar5;
        Iterator it;
        C10192b.C1401b bVar6 = bVar;
        C17542s.j(aVar, "addressPickerNavigation");
        C17542s.j(dVar, "adapter");
        C17542s.j(map, "pickerData");
        C17542s.j(str2, "countryCode");
        C17542s.j(bVar6, "pickerType");
        C17542s.j(str3, "componentValue");
        C17542s.j(lVar, "callback");
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        String str5 = null;
        String str6 = null;
        while (true) {
            boolean hasNext = it2.hasNext();
            str4 = DslKt.INDICATOR_BACKGROUND;
            cls = e.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar7 = (C11819b) it2.next();
            if (str5 == null) {
                String a10 = C11818a.a("showAddressPicker, pickerType: " + bVar6, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str5 = C11820c.a(a10);
            }
            if (str6 == null) {
                String name = cls.getName();
                C17542s.g(name);
                it = it2;
                String str7 = name;
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                String P02 = o12.length() == 0 ? str7 : C15854t.P0(o12, "Kt");
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str4 = DslKt.INDICATOR_MAIN;
                }
                str6 = str4 + DslKt.INDICATOR_SEPARATOR + P02;
            } else {
                it = it2;
            }
            bVar7.a(eVar, str6, false, (Throwable) null, str5);
            C10038a aVar3 = aVar;
            it2 = it;
            bVar6 = bVar;
        }
        if (tVar == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unable to show address picker, no activity");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar8 : arrayList2) {
                if (str8 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 != null) {
                        str8 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str9 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar8.a(eVar2, str9, false, illegalArgumentException, str8);
            }
        } else if (tVar.isFinishing()) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Unable to show address picker, activity finishing");
            qv.e eVar3 = qv.e.WARN;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str10 = null;
            String str11 = null;
            for (C11819b bVar9 : arrayList3) {
                if (str11 == null) {
                    String a12 = C11818a.a((String) null, illegalArgumentException2);
                    if (a12 != null) {
                        str11 = C11820c.a(a12);
                    } else {
                        return;
                    }
                }
                if (str10 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str4) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar9.a(eVar3, str10, false, illegalArgumentException2, str11);
            }
        } else {
            int i10 = dVar2 == null ? -1 : a.f76538a[dVar2.ordinal()];
            if (i10 != -1) {
                if (i10 == 1) {
                    bVar5 = C10038a.b.START;
                } else if (i10 == 2) {
                    bVar5 = C10038a.b.END;
                } else {
                    throw new t();
                }
                bVar2 = bVar5;
            } else {
                bVar2 = null;
            }
            int i11 = dVar2 == null ? -1 : a.f76538a[dVar2.ordinal()];
            if (i11 != -1) {
                if (i11 == 1) {
                    bVar4 = C10038a.C1374a.b.START;
                } else if (i11 == 2) {
                    bVar4 = C10038a.C1374a.b.END;
                } else {
                    throw new t();
                }
                bVar3 = bVar4;
            } else {
                bVar3 = null;
            }
            boolean z10 = bVar3 != null;
            int i12 = a.f76539b[bVar.ordinal()];
            if (i12 == 1) {
                f(aVar, aVar2, str, str2, bVar2, z10, map, list, tVar, dVar, str3, lVar);
            } else if (i12 == 2) {
                d(aVar, str2, bVar3, z10, map, list, dVar, tVar, str3, lVar);
            } else {
                throw new t();
            }
        }
    }
}
