package ut;

import Es.a;
import GB.C12916a;
import Gt.a;
import Gt.c;
import Gt.d;
import Gt.e;
import Gt.f;
import IC.C13023e;
import IC.C13026h;
import It.A;
import It.B;
import It.C;
import It.C10750m;
import It.C10752o;
import It.p;
import It.s;
import It.w;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import Mm.h;
import Op.C10832f;
import XH.C16796C;
import XH.v;
import Xt.b;
import YH.C16877v;
import YH.X;
import bI.C17035a;
import java.util.Comparator;
import java.util.List;
import jt.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vB.C15128a;
import vB.C15129b;
import zt.C12554a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010$\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\n8\u0006¢\u0006\f\n\u0004\b&\u0010\r\u001a\u0004\b\u0005\u0010'R\u0017\u0010.\u001a\u00020)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010:\u001a\u0002058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010@\u001a\u00020;8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010F\u001a\u00020A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020H0G8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010S\u001a\u00020N8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0017\u0010Y\u001a\u00020T8\u0006¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Lut/p0;", "", "<init>", "()V", "LGt/a$a;", "b", "LGt/a$a;", "getUserInfoFamily", "()LGt/a$a;", "userInfoFamily", "", "LGt/f$a;", "c", "Ljava/util/List;", "amenityOpeningHours", "LGt/f$c;", "d", "LGt/f$c;", "storeOpeningHours", "LGt/f;", "e", "LGt/f;", "a", "()LGt/f;", "storeDetails", "LGt/d;", "f", "LGt/d;", "getPopularTimesLiveData", "()LGt/d;", "popularTimesLiveData", "Lzt/a;", "g", "Lzt/a;", "getFoodMobileData", "()Lzt/a;", "foodMobileData", "LXt/a;", "h", "()Ljava/util/List;", "storeEventUiModels", "LXt/b;", "i", "LXt/b;", "getStoreEventUiState", "()LXt/b;", "storeEventUiState", "LvB/b;", "j", "LvB/b;", "getCarouselShoppingListState", "()LvB/b;", "carouselShoppingListState", "LSt/a;", "k", "LSt/a;", "getStoreEventDetailsUiModel", "()LSt/a;", "storeEventDetailsUiModel", "LvB/a;", "l", "LvB/a;", "getCarouselShoppingList", "()LvB/a;", "carouselShoppingList", "LIt/B$b;", "m", "LIt/B$b;", "getOnboardingUiState", "()LIt/B$b;", "onboardingUiState", "LKJ/f;", "LIt/C;", "n", "LKJ/f;", "getShortcuts", "()LKJ/f;", "shortcuts", "LMt/a;", "o", "LMt/a;", "getBeverageBenefitUiModel", "()LMt/a;", "beverageBenefitUiModel", "LIt/B$c;", "p", "LIt/B$c;", "getStoreSelectedUiState", "()LIt/B$c;", "storeSelectedUiState", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final p0 f104306a = new p0();

    /* renamed from: b  reason: collision with root package name */
    private static final a.C1584a f104307b = new a.C1584a("FirstName LastName", "012345678907523245");

    /* renamed from: c  reason: collision with root package name */
    private static final List<f.a> f104308c;

    /* renamed from: d  reason: collision with root package name */
    private static final f.c f104309d;

    /* renamed from: e  reason: collision with root package name */
    private static final f f104310e;

    /* renamed from: f  reason: collision with root package name */
    private static final d f104311f = new d(C13026h.c("Not busy"), C13026h.c("Now, not busy"));

    /* renamed from: g  reason: collision with root package name */
    private static final C12554a f104312g = new C12554a("", true, true, (String) null, "123");

    /* renamed from: h  reason: collision with root package name */
    private static final List<Xt.a> f104313h;

    /* renamed from: i  reason: collision with root package name */
    private static final b f104314i;

    /* renamed from: j  reason: collision with root package name */
    private static final C15129b f104315j;

    /* renamed from: k  reason: collision with root package name */
    private static final St.a f104316k = new St.a(C13026h.c("Småland Summer Activities"), C13026h.c("Småland have planned themed weeks meaning they will be running activities related to the theme!"), C13026h.c("Week commencing 24/7/23 - Mythical creatures Week commencing 31/7/23 - At the seaside Week commencing 7/8/23 - The zoo \nWeek commencing 14/8/23 - People who help us Week commencing 21/8/23 - Fairytales \n Week commencing 28/8/23 - Transport and travel Week commencing 4/9/23 - Weather \n\nSome of the activities include: Animal masks Collages, sticking and gluing Creating jellyfishes, ice creams, Sticking and gluing, suncatchers, rainbows, raindrops Creating vehicles out of shapes Tuff trays with cars and road, train tracks etc Mala Dough animals \n\nSessions throughout summer will run from 10am - 6pm for 45 minutes (during opening hours - see below). Sessions run on the hour. Registration for each individual session begins 15 minutes before the session starts. E.g. for the 12pm session, registration require onsite on the day and will will begin at 11:45am. \n\nVisit our Småland creche at the top of the first escalator! Opening Times Monday - Saturday 10am to 6pm Sunday 10am - 4pm"), (String) null, C16796C.a(C13026h.c("FREE"), C13026h.c("FREE - No registration needed")), C13026h.c("IKEA Family"), C13026h.c("Mon, 24 Jul 11:00 – Sun, 10 Sept 22:00"), C13026h.c("2 more sessions"), C13026h.c("To claim your spot, register for this event before Friday, 25 Aug 10:30"), true, true, true, true, "time slot id", new b.f.a.C2236f(new b.f.a.C2236f.C2237a.C2238a(42)));

    /* renamed from: l  reason: collision with root package name */
    private static final C15128a f104317l;

    /* renamed from: m  reason: collision with root package name */
    private static final B.b f104318m = new B.b(0, C15985a.b(new c(1000, Gh.a.SQUARE, C13026h.c("Im a title"), C13026h.c("Im the category"), "", (Gh.d) null, new Gh.c(""), 32, (DefaultConstructorMarker) null)));

    /* renamed from: n  reason: collision with root package name */
    private static final C15990f<C> f104319n;

    /* renamed from: o  reason: collision with root package name */
    private static final Mt.a f104320o;

    /* renamed from: p  reason: collision with root package name */
    private static final B.c f104321p;

    /* renamed from: q  reason: collision with root package name */
    public static final int f104322q = 8;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        public final int compare(T t10, T t11) {
            A.h.a aVar = A.h.a.f82051a;
            return C17035a.e(Integer.valueOf(((A) t10).a(aVar)), Integer.valueOf(((A) t11).a(aVar)));
        }
    }

    static {
        v<Integer, C13023e> a10 = Ft.d.a(C12916a.C2641a.RESTAURANT);
        int intValue = a10.a().intValue();
        f.a aVar = new f.a(true, C13026h.c("Open until 09:30"), a10.b(), intValue);
        v<Integer, C13023e> a11 = Ft.d.a(C12916a.C2641a.BISTRO);
        int intValue2 = a11.a().intValue();
        f.a aVar2 = new f.a(true, C13026h.c("Open until 09:30"), a11.b(), intValue2);
        v<Integer, C13023e> a12 = Ft.d.a(C12916a.C2641a.CLICK_AND_COLLECT);
        int intValue3 = a12.a().intValue();
        f.a aVar3 = new f.a(true, C13026h.c("Open between 09:30 - 13:00, 14:00 - 21:00"), a12.b(), intValue3);
        v<Integer, C13023e> a13 = Ft.d.a(C12916a.C2641a.PLAY_AREA);
        int intValue4 = a13.a().intValue();
        List<f.a> q10 = C16877v.q(aVar, aVar2, aVar3, new f.a(true, C13026h.c("Closed"), a13.b(), intValue4));
        f104308c = q10;
        v<Integer, C13023e> a14 = Ft.d.a(C12916a.C2641a.STORE);
        int intValue5 = a14.a().intValue();
        f.c cVar = new f.c(true, C13026h.c("Open until 09:30"), C13026h.c("9 PM"), new f.b(C13026h.c("Closed"), C13026h.c("Opens 10am")), a14.b(), intValue5);
        f104309d = cVar;
        f fVar = new f("1234", "Helsingborg", false, cVar, q10, false);
        f104310e = fVar;
        Xt.a aVar4 = new Xt.a("1", C13026h.c("Småland Summer Activities, with a longer name"), C13026h.c("Småland have planned themes weeks meaning they will be running activities, but a really really long line"), C13026h.c("22 Jul"), "https://www.ikea.com/global/assets/customer-service/store-events/event-images/en_gb-20230601-1690191278169-5880.webp", 0, C13026h.c("IKEA Family"), C16796C.a(C13026h.c("FREE"), C13026h.c("FREE - No registration needed")), true, false);
        Xt.a aVar5 = new Xt.a("2", C13026h.c("Småland Summer Activities, with a longer name"), C13026h.c("Småland have planned themes weeks meaning they will be running activities, but a really really long line"), C13026h.c("22 Jul"), "https://www.ikea.com/global/assets/customer-service/store-events/event-images/es_es-20230601-1690805575116-1371.webp", 3, C13026h.c("IKEA Family"), C16796C.a(C13026h.c("FREE"), C13026h.c("FREE - No registration needed")), false, false);
        C13023e c10 = C13026h.c("Småland Summer Activities, with a longer name");
        C13023e c11 = C13026h.c("Småland have planned themes weeks meaning they will be running activities, but a really really long line");
        Xt.a aVar6 = r12;
        Xt.a aVar7 = new Xt.a("3", c10, c11, C13026h.c("22 Jul"), "https://www.ikea.com/global/assets/customer-service/store-events/event-images/es_es-20230703-1692780952030-4630.webp", 0, C13026h.c("IKEA Family"), C16796C.a(C13026h.c("FREE"), C13026h.c("FREE - No registration needed")), false, false);
        List<Xt.a> q11 = C16877v.q(aVar4, aVar5, aVar6, new Xt.a("4", C13026h.c("Småland Summer Activities, with a longer name"), C13026h.c("Småland have planned themes weeks meaning they will be running activities, but a really really long line"), C13026h.c("22 Jul - 10 Sept"), "https://www.ikea.com/global/assets/customer-service/store-events/event-images/en_gb-20230601-1690191278169-5880.webp", 0, C13026h.c("IKEA Family"), C16796C.a(C13026h.c("FREE"), C13026h.c("FREE - No registration needed")), false, false));
        f104313h = q11;
        Xt.b bVar = new Xt.b("IKEA Haarlem", C15985a.l(q11), false, 4, (DefaultConstructorMarker) null);
        f104314i = bVar;
        C15129b bVar2 = new C15129b(C15985a.a(), X.j());
        f104315j = bVar2;
        Boolean bool = Boolean.TRUE;
        f104317l = new C15128a("id", "Kitchen stuff and useful storage space improvements", (String) null, C15985a.b(new C15128a.b("12345", (String) null, bool), new C15128a.b("67890", (String) null, bool), new C15128a.b("1230908", (String) null, Boolean.FALSE)), true);
        String str = "";
        C15990f<C> b10 = C15985a.b(C.e.f82103a, new C.d("445"), new C.c("123"), new C.a(str, (String) null, true, "123"), new C.h("123"));
        f104319n = b10;
        Mt.a aVar8 = new Mt.a(C13026h.c("IKEA Family benefit"), C13026h.c("Join today and enjoy a free hot drink!"), C13026h.c("Learn more"), C13026h.c("Join for free"), new Mm.a("2", "", Mm.c.INSTANT_BENEFIT, "Free hot drink", "As an IKEA Family member we'd like you to really feel like family. \nTake a break and enjoy a free cup of coffee or tea every time you visit the \nstore. Join today so you are ready for your next visit!", "Relax with a free hot drink. Monday to Friday.", C16877v.n(), new h("calendar", str), (Mm.b) null));
        f104320o = aVar8;
        C10750m mVar = new C10750m(C13026h.c("IKEA Malmö"), C16877v.e(new s.b(a.b.f80780a)));
        p pVar = new p(fVar, new d(C13026h.c("Not busy"), C13026h.c("Now, not busy")), b10);
        C10750m mVar2 = mVar;
        p pVar2 = pVar;
        f104321p = new B.c("123", mVar2, C15985a.l(C16877v.g1(C16877v.q(new A.b(C16877v.q(new C10752o.b(C13026h.c("Alien invasion"), C13026h.c("Today at 11:00 - 12:00"), str, "test url"), new C10752o.a(str, "123"))), new A.e(a.b.f81206a), new A.i(aVar8), new A.f(bVar2), new A.j(bVar), new A.a(C16877v.n()), new A.k(C16877v.e(C10832f.f85163a.d()), false), new A.g(new e(C13026h.c("Discover IKEA Malmö"), C13026h.c("Learn more")))), new a())), pVar2, new w(true, false, false, 6, (DefaultConstructorMarker) null), false, (Throwable) null, (C15987c) null, (It.v) null, (Mt.a) null, 960, (DefaultConstructorMarker) null);
    }

    private p0() {
    }

    public final f a() {
        return f104310e;
    }

    public final List<Xt.a> b() {
        return f104313h;
    }
}
