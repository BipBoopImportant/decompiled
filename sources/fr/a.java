package Fr;

import Ae.e;
import YH.C16877v;
import YH.X;
import YH.g0;
import com.sugarcube.core.analytics.IAnalyticsEngine;
import com.sugarcube.core.analytics.entities.LoggedInUser;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.C10089a;
import ne.C10090b;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u0000 \u00192\u00060\u0001j\u0002`\u0002:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"LFr/a;", "Lcom/sugarcube/core/analytics/IAnalyticsEngine;", "Lcom/sugarcube/app/base/IAnalyticsEngine;", "LAe/e;", "analytics", "Lne/a;", "adjustTracker", "<init>", "(LAe/e;Lne/a;)V", "", "eventName", "", "", "properties", "LXH/N;", "track", "(Ljava/lang/String;Ljava/util/Map;)V", "a", "LAe/e;", "b", "Lne/a;", "", "c", "Ljava/util/List;", "trackedEvents", "d", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements IAnalyticsEngine {

    /* renamed from: d  reason: collision with root package name */
    public static final C1573a f81041d = new C1573a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f81042e = 8;

    /* renamed from: f  reason: collision with root package name */
    private static final Set<String> f81043f = g0.h("KreativEntry.SearchTab.Open", "KreativEntry.HomeTab.Open", "KreativEntry.ProfileTab.Open", "KreativEntry.Open");

    /* renamed from: a  reason: collision with root package name */
    private final e f81044a;

    /* renamed from: b  reason: collision with root package name */
    private final C10089a f81045b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f81046c = C16877v.q("KreativEntry.Open", "Capture.SelectRoom.Start", "Capture.Intro.Complete", "Capture.Result", "Capture.Feedback.Submit", "Capture.Feedback.Exit", "Design.Open.Start", "Design.Room.AddProduct", "Gallery.DesignSheet.AddToBag", "Gallery.DesignSheet.AddAllToBag", "Design.BuyScreen.AddToBag", "Design.BuyScreen.AddAllToBag", "Design.Pip.AddToBag", "Design.Room.SwapProduct", "Design.Room.Exit", "Design.Menu.Save", "Design.Menu.AddToBag", "Design.Menu.Buy", "Design.Feedback.Submit", "Design.Feedback.Exit", "Gallery.DesignList.ViewItems", "Gallery.DesignViewer.ViewItems", "Gallery.DesignFeedback.Submit");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0016"}, d2 = {"LFr/a$a;", "", "<init>", "()V", "", "DESIGN_OPEN_START", "Ljava/lang/String;", "ROOM_SOURCE_KEY", "ROOM_SOURCE_SHOWROOM_VALUE", "ROOM_SOURCE_USER_CAPTURE_VALUE", "KREATIV_OPEN_DEBUG_TOKEN", "KREATIV_OPEN_RELEASE_TOKEN", "", "openEvents", "Ljava/util/Set;", "KREATIV_DESIGN_OPEN_SHOWROOM_DEBUG_TOKEN", "KREATIV_DESIGN_OPEN_SHOWROOM_RELEASE_TOKEN", "KREATIV_DESIGN_OPEN_USER_CAPTURE_DEBUG_TOKEN", "KREATIV_DESIGN_OPEN_USER_CAPTURE_RELEASE_TOKEN", "c", "a", "b", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fr.a$a  reason: collision with other inner class name */
    public static final class C1573a {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"LFr/a$a$a;", "Lne/b;", "<init>", "()V", "", "f", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "debugToken", "g", "c", "releaseToken", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fr.a$a$a  reason: collision with other inner class name */
        public static final class C1574a extends C10090b {

            /* renamed from: e  reason: collision with root package name */
            public static final C1574a f81047e = new C1574a();

            /* renamed from: f  reason: collision with root package name */
            private static final String f81048f = "p6kljr";

            /* renamed from: g  reason: collision with root package name */
            private static final String f81049g = "4tv3ln";

            private C1574a() {
            }

            public String b() {
                return f81048f;
            }

            public String c() {
                return f81049g;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"LFr/a$a$b;", "Lne/b;", "<init>", "()V", "", "f", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "debugToken", "g", "c", "releaseToken", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fr.a$a$b */
        public static final class b extends C10090b {

            /* renamed from: e  reason: collision with root package name */
            public static final b f81050e = new b();

            /* renamed from: f  reason: collision with root package name */
            private static final String f81051f = "u0nlv0";

            /* renamed from: g  reason: collision with root package name */
            private static final String f81052g = "r1m9a1";

            private b() {
            }

            public String b() {
                return f81051f;
            }

            public String c() {
                return f81052g;
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\u00020\u00048\u0016XD¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"LFr/a$a$c;", "Lne/b;", "<init>", "()V", "", "f", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "debugToken", "g", "c", "releaseToken", "geomagical-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fr.a$a$c */
        public static final class c extends C10090b {

            /* renamed from: e  reason: collision with root package name */
            public static final c f81053e = new c();

            /* renamed from: f  reason: collision with root package name */
            private static final String f81054f = "3i61vt";

            /* renamed from: g  reason: collision with root package name */
            private static final String f81055g = "4buv2x";

            private c() {
            }

            public String b() {
                return f81054f;
            }

            public String c() {
                return f81055g;
            }
        }

        public /* synthetic */ C1573a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1573a() {
        }
    }

    public a(e eVar, C10089a aVar) {
        e eVar2 = eVar;
        C10089a aVar2 = aVar;
        C17542s.j(eVar2, "analytics");
        C17542s.j(aVar2, "adjustTracker");
        this.f81044a = eVar2;
        this.f81045b = aVar2;
    }

    public void associateUser(LoggedInUser loggedInUser, boolean z10) {
        IAnalyticsEngine.DefaultImpls.associateUser(this, loggedInUser, z10);
    }

    public void disassociateUser() {
        IAnalyticsEngine.DefaultImpls.disassociateUser(this);
    }

    public void track(String str, Map<String, ? extends Object> map) {
        C17542s.j(str, "eventName");
        C17542s.j(map, "properties");
        if (this.f81046c.contains(str)) {
            Map<String, ? extends Object> z10 = X.z(map);
            z10.put("component", str);
            this.f81044a.track("geomagical_event", z10);
        }
        if (f81043f.contains(str)) {
            this.f81045b.a(C1573a.c.f81053e);
        }
        if (C17542s.e("Design.Open.Start", str)) {
            Object obj = map.get("RoomSource");
            if (C17542s.e(obj, "Showroom")) {
                this.f81045b.a(C1573a.C1574a.f81047e);
            } else if (C17542s.e(obj, "UserCaptured")) {
                this.f81045b.a(C1573a.b.f81050e);
            }
        }
    }

    public boolean trackAlways() {
        return IAnalyticsEngine.DefaultImpls.trackAlways(this);
    }
}
