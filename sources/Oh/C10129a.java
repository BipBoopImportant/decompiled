package oh;

import Bn.k;
import HJ.C15854t;
import PA.C13331a;
import QA.C13352d;
import XH.t;
import Zw.a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import iq.C11411a;
import iq.C11412b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11519a;
import on.C11687b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rq.C11841a;
import rx.C15004a;
import rx.C15005b;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001BY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010&\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b(\u0010)J'\u0010.\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00101\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00100\u001a\u00020\u001aH\u0016¢\u0006\u0004\b1\u00102J'\u00105\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u001a2\u0006\u0010#\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J-\u0010<\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\f\u00109\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010?\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010>\u001a\u00020\u001aH\u0016¢\u0006\u0004\b?\u00102J\u001f\u0010A\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u001aH\u0016¢\u0006\u0004\bA\u00102J'\u0010C\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010B\u001a\u00020$H\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ'\u0010K\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010@\u001a\u00020\u001a2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bK\u0010LJ'\u0010O\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010N\u001a\u00020M2\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010SR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010TR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010UR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010VR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010WR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010XR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010YR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010ZR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010[¨\u0006\\"}, d2 = {"Loh/a;", "LBn/k;", "Lon/b;", "plpNavigation", "LZw/a;", "pipNavigation", "LIo/a;", "commercialContentNavigation", "LPA/a;", "shoppableImageNavigation", "Lrq/a;", "enlargeImagesNavigation", "LQA/d;", "shoppingListNavigation", "Liq/a;", "energyLabelNavigation", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "listPickerNavigation", "Lrx/b;", "productConfiguratorNavigation", "LEo/a;", "chromeCustomTabs", "<init>", "(Lon/b;LZw/a;LIo/a;LPA/a;Lrq/a;LQA/d;Liq/a;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;Lrx/b;LEo/a;)V", "Lx4/o;", "navController", "", "categoryId", "categoryTitle", "LXH/N;", "m", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;)V", "id", "fallbackTitle", "Lon/b$e;", "type", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "k", "(Lx4/o;Ljava/lang/String;Ljava/lang/String;Lon/b$e;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "f", "(Lx4/o;)V", "Lkp/a;", "campaign", "Landroid/content/Context;", "context", "n", "(Lx4/o;Lkp/a;Landroid/content/Context;)V", "storyId", "d", "(Lx4/o;Ljava/lang/String;)V", "shoppableImageId", "LPA/a$b;", "j", "(Lx4/o;Ljava/lang/String;LPA/a$b;)V", "", "Lcom/ingka/ikea/core/model/Media;", "images", "", "index", "e", "(Lx4/o;[Lcom/ingka/ikea/core/model/Media;I)V", "listId", "i", "itemNo", "c", "sourceComponent", "g", "(Lx4/o;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;", "operation", "l", "(Lx4/o;Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$Operation;)V", "Lrx/a;", "mode", "h", "(Lx4/o;Ljava/lang/String;Lrx/a;)V", "Lcom/ingka/ikea/core/model/Link;", "link", "b", "(Lx4/o;Lcom/ingka/ikea/core/model/Link;Landroid/content/Context;)V", "a", "Lon/b;", "LZw/a;", "LIo/a;", "LPA/a;", "Lrq/a;", "LQA/d;", "Liq/a;", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation;", "Lrx/b;", "LEo/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oh.a  reason: case insensitive filesystem */
public final class C10129a implements k {

    /* renamed from: a  reason: collision with root package name */
    private final C11687b f75749a;

    /* renamed from: b  reason: collision with root package name */
    private final a f75750b;

    /* renamed from: c  reason: collision with root package name */
    private final Io.a f75751c;

    /* renamed from: d  reason: collision with root package name */
    private final C13331a f75752d;

    /* renamed from: e  reason: collision with root package name */
    private final C11841a f75753e;

    /* renamed from: f  reason: collision with root package name */
    private final C13352d f75754f;

    /* renamed from: g  reason: collision with root package name */
    private final C11411a f75755g;

    /* renamed from: h  reason: collision with root package name */
    private final ListPickerNavigation f75756h;

    /* renamed from: i  reason: collision with root package name */
    private final C15005b f75757i;

    /* renamed from: j  reason: collision with root package name */
    private final Eo.a f75758j;

    public C10129a(C11687b bVar, a aVar, Io.a aVar2, C13331a aVar3, C11841a aVar4, C13352d dVar, C11411a aVar5, ListPickerNavigation listPickerNavigation, C15005b bVar2, Eo.a aVar6) {
        C17542s.j(bVar, "plpNavigation");
        C17542s.j(aVar, "pipNavigation");
        C17542s.j(aVar2, "commercialContentNavigation");
        C17542s.j(aVar3, "shoppableImageNavigation");
        C17542s.j(aVar4, "enlargeImagesNavigation");
        C17542s.j(dVar, "shoppingListNavigation");
        C17542s.j(aVar5, "energyLabelNavigation");
        C17542s.j(listPickerNavigation, "listPickerNavigation");
        C17542s.j(bVar2, "productConfiguratorNavigation");
        C17542s.j(aVar6, "chromeCustomTabs");
        this.f75749a = bVar;
        this.f75750b = aVar;
        this.f75751c = aVar2;
        this.f75752d = aVar3;
        this.f75753e = aVar4;
        this.f75754f = dVar;
        this.f75755g = aVar5;
        this.f75756h = listPickerNavigation;
        this.f75757i = bVar2;
        this.f75758j = aVar6;
    }

    public void b(C8951o oVar, Link link, Context context) {
        C17542s.j(oVar, "navController");
        C17542s.j(link, "link");
        C17542s.j(context, "context");
        if (link instanceof Link.External) {
            this.f75758j.a(context, ((Link.External) link).e());
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
                        String name = C10129a.class.getName();
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

    public void c(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C11411a.C2225a.a(this.f75755g, oVar, str, (C11412b) null, 4, (Object) null);
    }

    public void d(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "storyId");
        this.f75751c.d(oVar, str);
    }

    public void e(C8951o oVar, Media[] mediaArr, int i10) {
        C17542s.j(oVar, "navController");
        C17542s.j(mediaArr, "images");
        this.f75753e.e(oVar, mediaArr, 0);
    }

    public void f(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f75749a.f(oVar);
    }

    public void g(C8951o oVar, String str, Interaction$Component interaction$Component) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C17542s.j(interaction$Component, "sourceComponent");
        this.f75750b.a(oVar, str, interaction$Component);
    }

    public void h(C8951o oVar, String str, C15004a aVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C17542s.j(aVar, "mode");
        this.f75757i.h(oVar, str, C15004a.LIST_CART_ACTIONS);
    }

    public void i(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "listId");
        C13352d.a.a(this.f75754f, oVar, str, false, (C) null, 8, (Object) null);
    }

    public void j(C8951o oVar, String str, C13331a.b bVar) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "shoppableImageId");
        C17542s.j(bVar, "type");
        this.f75752d.j(oVar, str, bVar);
    }

    public void k(C8951o oVar, String str, String str2, C11687b.e eVar, Interaction$Component interaction$Component) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "id");
        C17542s.j(str2, "fallbackTitle");
        C11687b.e eVar2 = eVar;
        C17542s.j(eVar2, "type");
        Interaction$Component interaction$Component2 = interaction$Component;
        C17542s.j(interaction$Component2, "component");
        C11687b bVar = this.f75749a;
        C11687b.C2346b.b(bVar, str, str2, eVar2, interaction$Component2, oVar, (List) null, (List) null, (String) null, 224, (Object) null);
    }

    public void l(C8951o oVar, ListPickerNavigation.Operation operation) {
        C17542s.j(oVar, "navController");
        C17542s.j(operation, "operation");
        ListPickerNavigation.a.a(this.f75756h, oVar, operation, (String) null, 4, (Object) null);
    }

    public void m(C8951o oVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "categoryId");
        C17542s.j(str2, "categoryTitle");
        C11687b.C2346b.b(this.f75749a, str, str2, C11687b.e.CATEGORY, Interaction$Component.CATEGORIES_CAROUSEL, oVar, (List) null, (List) null, (String) null, 224, (Object) null);
    }

    public void n(C8951o oVar, C11519a aVar, Context context) {
        C17542s.j(oVar, "navController");
        C17542s.j(aVar, "campaign");
        C17542s.j(context, "context");
        if (aVar instanceof C11519a.C2243a) {
            C11519a.C2243a aVar2 = (C11519a.C2243a) aVar;
            C11687b.C2346b.b(this.f75749a, aVar2.getId(), aVar2.h(), C11687b.e.CAMPAIGNS, Interaction$Component.CAMPAIGN_CAROUSEL, oVar, (List) null, (List) null, (String) null, 224, (Object) null);
        } else if (aVar instanceof C11519a.b) {
            Link i10 = ((C11519a.b) aVar).i();
            if (i10 instanceof Link.External) {
                this.f75758j.a(context, ((Link.External) i10).e());
            } else if (i10 instanceof Link.Deeplink) {
                IllegalStateException illegalStateException = new IllegalStateException("We shouldn't get any deeplink campaigns: " + ((Link.Deeplink) i10).e());
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
                        String name = C10129a.class.getName();
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
            } else {
                throw new t();
            }
        } else {
            throw new t();
        }
    }
}
