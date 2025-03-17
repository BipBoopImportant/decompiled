package Se;

import Ae.e;
import Ae.r;
import Ae.s;
import HJ.C15854t;
import XH.C16796C;
import XH.C16824o;
import XH.C16825p;
import YH.C16877v;
import YH.X;
import android.app.Activity;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.U;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import tI.C17978n;
import x4.v;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u0019\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR3\u0010$\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u000b0\u001f0\u001e8BX\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0%8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001b¨\u0006("}, d2 = {"LSe/l;", "LAe/s;", "", "LAe/r;", "routeToScreenMappers", "LAe/e;", "analytics", "<init>", "(Ljava/util/Set;LAe/e;)V", "Lx4/v;", "destination", "", "g", "(Lx4/v;)Ljava/lang/String;", "Landroidx/lifecycle/r;", "route", "Landroid/app/Activity;", "activity", "viewName", "LXH/N;", "e", "(Landroidx/lifecycle/r;Ljava/lang/String;Landroid/app/Activity;Ljava/lang/String;)V", "lifecycle", "Landroidx/lifecycle/U;", "savedStateHandle", "a", "(Lx4/v;Landroid/app/Activity;Landroidx/lifecycle/r;Landroidx/lifecycle/U;)V", "Ljava/util/Set;", "b", "LAe/e;", "", "Lkotlin/Function1;", "c", "LXH/o;", "f", "()Ljava/util/Map;", "mapOfRoutesToNames", "", "d", "observerSetRoutes", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements s {

    /* renamed from: a  reason: collision with root package name */
    private final Set<r> f63406a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e f63407b;

    /* renamed from: c  reason: collision with root package name */
    private final C16824o f63408c = C16825p.b(new k(this));
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Set<String> f63409d = new LinkedHashSet();

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Se/l$a", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onResume", "(Landroidx/lifecycle/y;)V", "onDestroy", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ l f63410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f63411b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f63412c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f63413d;

        a(l lVar, Activity activity, String str, String str2) {
            this.f63410a = lVar;
            this.f63411b = activity;
            this.f63412c = str;
            this.f63413d = str2;
        }

        public void onDestroy(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f63410a.f63409d.remove(this.f63413d);
        }

        public void onResume(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f63410a.f63407b.e(this.f63411b, this.f63412c);
        }
    }

    public l(Set<r> set, e eVar) {
        C17542s.j(set, "routeToScreenMappers");
        C17542s.j(eVar, "analytics");
        this.f63406a = set;
        this.f63407b = eVar;
    }

    private final void e(androidx.lifecycle.r rVar, String str, Activity activity, String str2) {
        rVar.c(new a(this, activity, str2, str));
        this.f63409d.add(str);
    }

    private final Map<String, C17642l<U, String>> f() {
        return (Map) this.f63408c.getValue();
    }

    private final String g(v vVar) {
        return f().get(String.valueOf(vVar.x())) != null ? String.valueOf(vVar.x()) : vVar.C();
    }

    /* access modifiers changed from: private */
    public static final Map h(l lVar) {
        ArrayList<Map.Entry> arrayList = new ArrayList<>();
        for (r a10 : lVar.f63406a) {
            C16877v.E(arrayList, a10.a().entrySet());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(arrayList, 10)), 16));
        for (Map.Entry entry : arrayList) {
            XH.v a11 = C16796C.a(entry.getKey(), entry.getValue());
            linkedHashMap.put(a11.c(), a11.d());
        }
        return linkedHashMap;
    }

    public void a(v vVar, Activity activity, androidx.lifecycle.r rVar, U u10) {
        String str;
        C17542s.j(vVar, "destination");
        C17542s.j(rVar, "lifecycle");
        C17542s.j(u10, "savedStateHandle");
        String g10 = g(vVar);
        if (g10 != null && !this.f63409d.contains(g10)) {
            C17642l lVar = f().get(g10);
            if (lVar == null || (str = (String) lVar.invoke(u10)) == null) {
                str = g10;
            }
            if (C15854t.v0(str)) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Route " + g10 + ": screen name should not be empty string");
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
                        if (a10 != null) {
                            str2 = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    if (str3 == null) {
                        String name = l.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str3;
                    bVar.a(eVar, str4, false, illegalArgumentException, str2);
                    str3 = str4;
                }
                return;
            }
            e(rVar, g10, activity, str);
        }
    }
}
