package Gg;

import Ae.e;
import Ae.g;
import Ae.q;
import HJ.C15854t;
import XH.t;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.analytics.Interaction$ContextComponent;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uq.C12078d;
import uq.g;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001fR\u0014\u0010!\u001a\u00020\b8\u0002XD¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006\""}, d2 = {"LGg/d;", "LGg/c;", "LAe/e;", "analytics", "Luq/d;", "episodAnalytics", "<init>", "(LAe/e;Luq/d;)V", "", "roomId", "LXH/N;", "c", "(Ljava/lang/String;)V", "inspirationCardId", "inspirationFilterId", "e", "(Ljava/lang/String;Ljava/lang/String;)V", "categoryId", "visualMessageId", "inspireFilterId", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "referenceMediaId", "Lkp/i$a;", "imageType", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkp/i$a;)V", "storyId", "storyTitle", "a", "LAe/e;", "Luq/d;", "Ljava/lang/String;", "screenName", "inspire-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final e f60726a;

    /* renamed from: b  reason: collision with root package name */
    private final C12078d f60727b;

    /* renamed from: c  reason: collision with root package name */
    private final String f60728c = "inspire";

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f60729a;

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
                f60729a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Gg.d.a.<clinit>():void");
        }
    }

    public d(e eVar, C12078d dVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(dVar, "episodAnalytics");
        this.f60726a = eVar;
        this.f60727b = dVar;
    }

    public void a(String str, String str2, String str3) {
        C17542s.j(str, "storyId");
        C17542s.j(str2, "storyTitle");
        C17542s.j(str3, "inspireFilterId");
        e.c.b(this.f60726a, Interaction$Component.STORY_CAROUSEL, str, (Map) null, new e.b(this.f60728c, str3, (String) null, (Interaction$ContextComponent) null, (String) null, 28, (DefaultConstructorMarker) null), 4, (Object) null);
    }

    public void b(String str, String str2, String str3, i.a aVar) {
        q qVar;
        C17542s.j(str, "referenceMediaId");
        C17542s.j(str2, "inspireFilterId");
        C17542s.j(str3, "visualMessageId");
        C17542s.j(aVar, "imageType");
        int i10 = a.f60729a[aVar.ordinal()];
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
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 != null) {
                        str4 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = d.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str5;
                bVar.a(eVar, str7, false, illegalStateException, str6);
                str4 = str6;
                str5 = str7;
            }
            return;
        } else {
            throw new t();
        }
        g.a.c(this.f60726a, str, qVar.b(), (Map) null, Interaction$Component.IMAGE_CAROUSEL, new e.b(this.f60728c, str2, (String) null, Interaction$ContextComponent.VISUAL_MESSAGE, str3, 4, (DefaultConstructorMarker) null), 4, (Object) null);
    }

    public void c(String str) {
        e.c.b(this.f60726a, Interaction$Component.FILTERS_BAR, str, (Map) null, new e.b(this.f60728c, (String) null, (String) null, (Interaction$ContextComponent) null, (String) null, 30, (DefaultConstructorMarker) null), 4, (Object) null);
    }

    public void d(String str, String str2, String str3) {
        C17542s.j(str, "categoryId");
        C17542s.j(str2, "visualMessageId");
        String str4 = str3;
        C17542s.j(str4, "inspireFilterId");
        e eVar = this.f60726a;
        e eVar2 = eVar;
        g.a.b(eVar2, str, (Map) null, Interaction$Component.ACTION_HEADER, new e.b(this.f60728c, str4, (String) null, Interaction$ContextComponent.VISUAL_MESSAGE, str2, 4, (DefaultConstructorMarker) null), 2, (Object) null);
    }

    public void e(String str, String str2) {
        C17542s.j(str, "inspirationCardId");
        C17542s.j(str2, "inspirationFilterId");
        e eVar = this.f60726a;
        Interaction$Component interaction$Component = Interaction$Component.INSPIRE_FEED;
        g.a.c(eVar, str, (String) null, (Map) null, interaction$Component, new e.b(this.f60728c, str2, (String) null, (Interaction$ContextComponent) null, (String) null, 28, (DefaultConstructorMarker) null), 6, (Object) null);
        this.f60727b.a(new g.i(str, interaction$Component.getValue(), interaction$Component.getValue()));
    }
}
