package ph;

import Eo.a;
import HJ.C15854t;
import XH.t;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rx.C15004a;
import rx.C15005b;
import uy.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lph/a;", "Luy/c;", "LEo/a;", "chromeCustomTabsApi", "LZw/a;", "pipNavigation", "Lrx/b;", "productConfiguratorNavigation", "<init>", "(LEo/a;LZw/a;Lrx/b;)V", "Landroid/content/Context;", "context", "Lx4/o;", "navController", "Lcom/ingka/ikea/core/model/Link;", "link", "LXH/N;", "b", "(Landroid/content/Context;Lx4/o;Lcom/ingka/ikea/core/model/Link;)V", "", "itemNo", "g", "(Lx4/o;Ljava/lang/String;)V", "a", "LEo/a;", "LZw/a;", "c", "Lrx/b;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ph.a  reason: case insensitive filesystem */
public final class C10155a implements c {

    /* renamed from: a  reason: collision with root package name */
    private final a f75953a;

    /* renamed from: b  reason: collision with root package name */
    private final Zw.a f75954b;

    /* renamed from: c  reason: collision with root package name */
    private final C15005b f75955c;

    public C10155a(a aVar, Zw.a aVar2, C15005b bVar) {
        C17542s.j(aVar, "chromeCustomTabsApi");
        C17542s.j(aVar2, "pipNavigation");
        C17542s.j(bVar, "productConfiguratorNavigation");
        this.f75953a = aVar;
        this.f75954b = aVar2;
        this.f75955c = bVar;
    }

    public void a(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        this.f75955c.h(oVar, str, C15004a.LIST_CART_ACTIONS);
    }

    public void b(Context context, C8951o oVar, Link link) {
        C17542s.j(context, "context");
        C17542s.j(oVar, "navController");
        C17542s.j(link, "link");
        if (link instanceof Link.External) {
            this.f75953a.a(context, ((Link.External) link).e());
        } else if (link instanceof Link.Deeplink) {
            try {
                Uri parse = Uri.parse(((Link.Deeplink) link).e());
                C17542s.i(parse, "parse(...)");
                oVar.X(parse);
            } catch (ActivityNotFoundException e10) {
                e eVar = e.ERROR;
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
                        String a10 = C11818a.a("No Activity found to handle Intent with url: " + ((Link.Deeplink) link).e(), e10);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = C10155a.class.getName();
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
        } else {
            throw new t();
        }
    }

    public void g(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        this.f75954b.a(oVar, str, Interaction$Component.ROOM);
    }
}
