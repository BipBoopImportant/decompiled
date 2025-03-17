package he;

import Ae.h;
import HJ.C15854t;
import Rd.a;
import Td.b;
import XH.C16807N;
import XH.x;
import XH.y;
import aA.C13909a;
import android.app.Activity;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u000eJ\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u000eJ\u001f\u0010\u001b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010%\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010'¨\u0006("}, d2 = {"Lhe/h;", "LRd/a;", "LaA/a;", "sessionManager", "LTd/a;", "accountAnalytics", "<init>", "(LaA/a;LTd/a;)V", "Lx4/o;", "navController", "Lx4/C;", "navOptions", "LXH/N;", "c", "(Lx4/o;Lx4/C;)V", "b", "Landroid/app/Activity;", "activity", "d", "(Landroid/app/Activity;)V", "e", "f", "(Lx4/o;)V", "g", "i", "", "success", "a", "(Lx4/o;Z)V", "", "addressId", "isDeletable", "k", "(Lx4/o;Ljava/lang/String;Z)V", "addressType", "j", "(Lx4/o;Ljava/lang/String;)V", "h", "LaA/a;", "LTd/a;", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: he.h  reason: case insensitive filesystem */
public final class C9782h implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C13909a f73575a;

    /* renamed from: b  reason: collision with root package name */
    private final Td.a f73576b;

    public C9782h(C13909a aVar, Td.a aVar2) {
        C17542s.j(aVar, "sessionManager");
        C17542s.j(aVar2, "accountAnalytics");
        this.f73575a = aVar;
        this.f73576b = aVar2;
    }

    public void a(C8951o oVar, boolean z10) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse("ikea://navigation/profile/account/delete/confirmation?success={success}");
        C17542s.i(parse, "parse(...)");
        Uri build = c.a(parse).buildUpon().appendQueryParameter("success", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.d().a());
    }

    public void b(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(c10, "navOptions");
        if (this.f73575a.isLoggedIn()) {
            Uri parse = Uri.parse("ikea://navigation/profile/account/communication_preferences");
            C17542s.i(parse, "parse(...)");
            oVar.Y(parse, c10);
        }
    }

    public void c(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(c10, "navOptions");
        Uri parse = Uri.parse("ikea://navigation/profile/account/address_list");
        C17542s.i(parse, "parse(...)");
        oVar.Y(parse, c10);
    }

    public void d(Activity activity) {
        Object obj;
        C17542s.j(activity, "activity");
        try {
            x.a aVar = x.f139812b;
            this.f73575a.g(activity);
            obj = x.b(C16807N.f139792a);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        Throwable e11 = x.e(obj);
        if (e11 != null) {
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Failed to open login", e11);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C9782h.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e11, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public void e(Activity activity) {
        Object obj;
        C17542s.j(activity, "activity");
        try {
            x.a aVar = x.f139812b;
            this.f73575a.e(activity);
            obj = x.b(C16807N.f139792a);
        } catch (CancellationException e10) {
            throw e10;
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        Throwable e11 = x.e(obj);
        if (e11 != null) {
            e eVar = e.WARN;
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
                    String a10 = C11818a.a("Failed to open signUp", e11);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C9782h.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e11, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public void f(C8951o oVar) {
        C17542s.j(oVar, "navController");
        Uri parse = Uri.parse("ikea://navigation/profile/account/upgrade");
        C17542s.i(parse, "parse(...)");
        oVar.Y(parse, rw.c.f28698a.c().a());
    }

    public void g(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(c10, "navOptions");
        Uri parse = Uri.parse("ikea://navigation/profile/account/change_password");
        C17542s.i(parse, "parse(...)");
        oVar.Y(parse, rw.c.f28698a.c().a());
    }

    public void h(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(c10, "navOptions");
        h.a.a(this.f73576b, b.PROFILE_EDIT_BEGIN, (Map) null, 2, (Object) null);
        Uri parse = Uri.parse("ikea://navigation/profile/account/edit_profile");
        C17542s.i(parse, "parse(...)");
        Uri build = c.a(parse).buildUpon().build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, c10);
    }

    public void i(C8951o oVar, C c10) {
        C17542s.j(oVar, "navController");
        C17542s.j(c10, "navOptions");
        Uri parse = Uri.parse("ikea://navigation/profile/account/delete");
        C17542s.i(parse, "parse(...)");
        oVar.Y(parse, c10);
    }

    public void j(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "addressType");
        h.a.a(this.f73576b, b.ADDRESS_CREATE_BEGIN, (Map) null, 2, (Object) null);
        Uri parse = Uri.parse("ikea://navigation/profile/account/create_address?addressType={addressType}");
        C17542s.i(parse, "parse(...)");
        Uri build = c.a(parse).buildUpon().appendQueryParameter("addressType", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.d().a());
    }

    public void k(C8951o oVar, String str, boolean z10) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "addressId");
        h.a.a(this.f73576b, b.ADDRESS_EDIT_BEGIN, (Map) null, 2, (Object) null);
        Uri parse = Uri.parse("ikea://navigation/profile/account/edit_address?deletable={deletable}&addressId={addressId}");
        C17542s.i(parse, "parse(...)");
        Uri build = c.a(parse).buildUpon().appendQueryParameter("addressId", str).appendQueryParameter("deletable", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.d().a());
    }
}
