package nh;

import HJ.C15854t;
import XH.t;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.Media;
import com.sugarcube.core.logger.DslKt;
import iq.C11411a;
import iq.C11412b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import li.a;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rq.C11841a;
import x4.C8951o;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 ¨\u0006!"}, d2 = {"Lnh/a;", "Lli/a;", "Liq/a;", "energyLabelNavigation", "LEo/a;", "chromeCustomTabsApi", "Lrq/a;", "enlargeImagesNavigation", "<init>", "(Liq/a;LEo/a;Lrq/a;)V", "Lx4/o;", "navController", "", "itemNo", "LXH/N;", "a", "(Lx4/o;Ljava/lang/String;)V", "Lcom/ingka/ikea/core/model/Link;", "link", "Landroid/content/Context;", "context", "b", "(Lx4/o;Lcom/ingka/ikea/core/model/Link;Landroid/content/Context;)V", "", "Lcom/ingka/ikea/core/model/Media;", "mediaList", "", "index", "c", "(Lx4/o;Ljava/util/List;I)V", "Liq/a;", "LEo/a;", "Lrq/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: nh.a  reason: case insensitive filesystem */
public final class C10096a implements a {

    /* renamed from: a  reason: collision with root package name */
    private final C11411a f75623a;

    /* renamed from: b  reason: collision with root package name */
    private final Eo.a f75624b;

    /* renamed from: c  reason: collision with root package name */
    private final C11841a f75625c;

    public C10096a(C11411a aVar, Eo.a aVar2, C11841a aVar3) {
        C17542s.j(aVar, "energyLabelNavigation");
        C17542s.j(aVar2, "chromeCustomTabsApi");
        C17542s.j(aVar3, "enlargeImagesNavigation");
        this.f75623a = aVar;
        this.f75624b = aVar2;
        this.f75625c = aVar3;
    }

    public void a(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C11411a.C2225a.a(this.f75623a, oVar, str, (C11412b) null, 4, (Object) null);
    }

    public void b(C8951o oVar, Link link, Context context) {
        C17542s.j(oVar, "navController");
        C17542s.j(link, "link");
        C17542s.j(context, "context");
        if (link instanceof Link.External) {
            this.f75624b.a(context, ((Link.External) link).e());
        } else if (link instanceof Link.Deeplink) {
            try {
                Uri parse = Uri.parse(((Link.Deeplink) link).e());
                C17542s.i(parse, "parse(...)");
                oVar.X(parse);
            } catch (ActivityNotFoundException e10) {
                IllegalStateException illegalStateException = new IllegalStateException("No Activity found to handle Intent with url: " + ((Link.Deeplink) link).e(), e10);
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
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = C10096a.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
            }
        } else {
            throw new t();
        }
    }

    public void c(C8951o oVar, List<? extends Media> list, int i10) {
        C17542s.j(oVar, "navController");
        C17542s.j(list, "mediaList");
        this.f75625c.e(oVar, (Media[]) list.toArray(new Media[0]), i10);
    }
}
