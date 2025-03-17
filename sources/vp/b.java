package Vp;

import Ae.e;
import Ae.g;
import Ae.q;
import HJ.C15854t;
import XH.C16796C;
import XH.t;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.analytics.Interaction$ContextComponent;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u000eJ'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u000bJ%\u0010\"\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u00062\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00068\u0002XD¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006)"}, d2 = {"LVp/b;", "LVp/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "", "storyId", "storyTitle", "LXH/N;", "k", "(Ljava/lang/String;Ljava/lang/String;)V", "campaignId", "c", "(Ljava/lang/String;)V", "roomName", "g", "h", "()V", "l", "f", "itemNo", "i", "referenceMediaId", "Lkp/i$a;", "imageType", "visualMessageId", "e", "(Ljava/lang/String;Lkp/i$a;Ljava/lang/String;)V", "categoryId", "j", "id", "", "itemNos", "d", "(Ljava/lang/String;Ljava/util/List;)V", "a", "LAe/e;", "b", "Ljava/lang/String;", "screenName", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f88730a;

    /* renamed from: b  reason: collision with root package name */
    private final String f88731b = "discover";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f88732a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                kp.i$a[] r0 = kp.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kp.i$a r1 = kp.i.a.REGULAR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kp.i$a r1 = kp.i.a.SHOPPABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kp.i$a r1 = kp.i.a.USER_CONTENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kp.i$a r1 = kp.i.a.VIDEO     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f88732a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Vp.b.a.<clinit>():void");
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f88730a = eVar;
    }

    public void c(String str) {
        C17542s.j(str, "campaignId");
        g.a.c(this.f88730a, str, (String) null, (Map) null, Interaction$Component.CAMPAIGN_CAROUSEL, (e.b) null, 22, (Object) null);
    }

    public void d(String str, List<String> list) {
        C17542s.j(str, "id");
        C17542s.j(list, "itemNos");
        g.a.d(this.f88730a, str, list, "rec_panel", Interaction$Component.RECOMMENDED_OFFERS_CAROUSEL, (Map) null, 16, (Object) null);
    }

    public void e(String str, i.a aVar, String str2) {
        q qVar;
        C17542s.j(str, "referenceMediaId");
        C17542s.j(aVar, "imageType");
        C17542s.j(str2, "visualMessageId");
        int i10 = a.f88732a[aVar.ordinal()];
        if (i10 == 1) {
            qVar = q.REGULAR;
        } else if (i10 == 2) {
            qVar = q.SHOPPABLE;
        } else if (i10 == 3) {
            qVar = q.VUGC;
        } else if (i10 == 4) {
            IllegalStateException illegalStateException = new IllegalStateException("Video should not be clickable.");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, illegalStateException, str5);
                str3 = str5;
                str4 = str6;
            }
            return;
        } else {
            throw new t();
        }
        g.a.c(this.f88730a, str, qVar.b(), (Map) null, Interaction$Component.IMAGE_CAROUSEL, new e.b(this.f88731b, (String) null, (String) null, Interaction$ContextComponent.VISUAL_MESSAGE, str2, 6, (DefaultConstructorMarker) null), 4, (Object) null);
    }

    public void f() {
        e.c.b(this.f88730a, Interaction$Component.DISCOVER_SEE_ALL_OFFERS, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void g(String str) {
        C17542s.j(str, "roomName");
        e.c.b(this.f88730a, Interaction$Component.INSPIRE_ROOM_CAROUSEL, (String) null, X.f(C16796C.a("component_value", str)), (e.b) null, 10, (Object) null);
    }

    public void h() {
        e.c.b(this.f88730a, Interaction$Component.INSPIRE_FEED_BUTTON, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }

    public void i(String str) {
        C17542s.j(str, "itemNo");
        String str2 = str;
        g.a.a(this.f88730a, str2, X.f(C16796C.a("app_location", "discover")), Interaction$Component.RECOMMENDED_OFFERS_CAROUSEL, (String) null, (e.b) null, 24, (Object) null);
    }

    public void j(String str, String str2) {
        C17542s.j(str, "categoryId");
        C17542s.j(str2, "visualMessageId");
        g.a.b(this.f88730a, str, (Map) null, Interaction$Component.ACTION_HEADER, new e.b(this.f88731b, (String) null, (String) null, Interaction$ContextComponent.VISUAL_MESSAGE, str2, 6, (DefaultConstructorMarker) null), 2, (Object) null);
    }

    public void k(String str, String str2) {
        C17542s.j(str, "storyId");
        C17542s.j(str2, "storyTitle");
        e.c.b(this.f88730a, Interaction$Component.STORY_DETAIL_BUTTON, (String) null, X.m(C16796C.a("component_value", str), C16796C.a("purpose", str2)), (e.b) null, 10, (Object) null);
    }

    public void l() {
        e.c.b(this.f88730a, Interaction$Component.GEOMAGICAL_ENTRY_POINT, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }
}
