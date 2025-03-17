package rh;

import Eo.a;
import HJ.C15854t;
import ZB.C13877e;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import ax.d;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import x4.C8951o;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lrh/a;", "LZB/e;", "Lax/d;", "popularTimesNavigation", "LEo/a;", "customTabsApi", "Lam/d;", "deviceIntentProvider", "<init>", "(Lax/d;LEo/a;Lam/d;)V", "Lx4/o;", "navController", "", "storeId", "LXH/N;", "j", "(Lx4/o;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "url", "a", "(Landroid/content/Context;Ljava/lang/String;)V", "b", "c", "(Landroid/content/Context;)V", "Lax/d;", "LEo/a;", "Lam/d;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rh.a  reason: case insensitive filesystem */
public final class C10221a implements C13877e {

    /* renamed from: a  reason: collision with root package name */
    private final d f76466a;

    /* renamed from: b  reason: collision with root package name */
    private final a f76467b;

    /* renamed from: c  reason: collision with root package name */
    private final am.d f76468c;

    public C10221a(d dVar, a aVar, am.d dVar2) {
        C17542s.j(dVar, "popularTimesNavigation");
        C17542s.j(aVar, "customTabsApi");
        C17542s.j(dVar2, "deviceIntentProvider");
        this.f76466a = dVar;
        this.f76467b = aVar;
        this.f76468c = dVar2;
    }

    public void a(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "url");
        this.f76467b.a(context, str);
    }

    public void b(Context context, String str) {
        C17542s.j(context, "context");
        C17542s.j(str, "url");
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e10) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Failed to open direction url", e10);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = C10221a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
        }
    }

    public void c(Context context) {
        C17542s.j(context, "context");
        try {
            context.startActivity(this.f76468c.c());
        } catch (Exception e10) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Failed to open app settings", e10);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C10221a.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, e10, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    public void j(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "storeId");
        this.f76466a.a(oVar, str, "store_details_page");
    }
}
