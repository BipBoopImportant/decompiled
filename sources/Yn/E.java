package Yn;

import E1.I;
import G1.C4504g;
import HJ.C15854t;
import IC.C13023e;
import KJ.C15987c;
import L1.v;
import L1.x;
import N1.P;
import Nn.C10800c;
import Nn.C10813p;
import Nn.M;
import Nn.O;
import Nn.u;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13569b1;
import SC.C13573c1;
import SC.C13585f1;
import SC.C13589g1;
import SC.C13607l;
import SC.C13611m;
import SC.K0;
import SC.L;
import SC.N;
import SC.R0;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import Wn.o;
import XH.C16807N;
import XH.t;
import Y1.f;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.core.logger.DslKt;
import gs.e;
import ho.C11374a;
import i1.C5437c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.C11435a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lo.j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import r0.m;
import rv.C11849b;
import s0.C5862h;
import tK.C18029u;
import tK.C18030v;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001a?\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\u00102\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a_\u0010\u001f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\r0\u001b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0003¢\u0006\u0004\b\u001f\u0010 \u001a5\u0010!\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0003¢\u0006\u0004\b!\u0010\"\u001a%\u0010$\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\r0\u0013H\u0003¢\u0006\u0004\b$\u0010%\u001a9\u0010*\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0018\u0010)\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\r0\u001bH\u0003¢\u0006\u0004\b*\u0010+\u001a9\u0010.\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\r0,H\u0003¢\u0006\u0004\b.\u0010/\u001a\u0017\u00102\u001a\u00020\r2\u0006\u00101\u001a\u000200H\u0003¢\u0006\u0004\b2\u00103\u001a?\u00107\u001a\u00020\r2\u0006\u00104\u001a\u00020\u00172\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0,2\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\r0,H\u0003¢\u0006\u0004\b7\u00108\u001a)\u0010<\u001a\u00020\r2\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u0002092\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0003¢\u0006\u0004\b<\u0010=\u001a'\u0010B\u001a\u00020(2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"LWn/o;", "deliveryDetailsAnalytics", "Llo/j;", "model", "Lho/a$a;", "type", "LKJ/c;", "LYn/F;", "itemsInDelivery", "LYn/j;", "callbacks", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "x", "(LWn/o;Llo/j;Lho/a$a;LKJ/c;LYn/j;Landroidx/compose/ui/d;LU0/m;II)V", "LYn/k;", "z", "(Llo/j;Lho/a$a;LKJ/c;LYn/k;Landroidx/compose/ui/d;LU0/m;II)V", "Lkotlin/Function0;", "onAddToCalendarClicked", "q", "(LnI/a;LU0/m;I)V", "LNn/c;", "capabilities", "", "allowChangeTimeSlot", "Lkotlin/Function2;", "", "LNn/O;", "onChangeTimeSlotClicked", "K", "(Llo/j;Lho/a$a;LKJ/c;ZLnI/p;LnI/a;LU0/m;I)V", "N", "(Lho/a$a;LKJ/c;LnI/a;LU0/m;I)V", "onChangeDeliveryMethodClicked", "I", "(Llo/j;LnI/a;LU0/m;I)V", "Llo/j$a;", "deliveryLocationUiState", "", "onChangePickupPointClicked", "F", "(Llo/j;Llo/j$a;LnI/p;LU0/m;I)V", "Lkotlin/Function1;", "onDeliveryItemsClicked", "B", "(Llo/j;LKJ/c;LnI/l;LU0/m;I)V", "Ljo/a;", "deliveryArrangementHolder", "P", "(Ljo/a;LU0/m;I)V", "capabilityHolder", "onCapabilityCheckChanged", "onCapabilityQuestionClicked", "s", "(LNn/c;LnI/l;LnI/l;LU0/m;I)V", "LIC/e;", "text", "contentDescription", "u", "(LIC/e;LIC/e;Landroidx/compose/ui/d;LU0/m;II)V", "LNn/p;", "deliveryServiceType", "LNn/u;", "fulfillmentServiceType", "S", "(LNn/p;LNn/u;Lho/a$a;)I", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class E {

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R,\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR&\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u0006\u0010\u000fR&\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR,\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00050\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0007\u001a\u0004\b\u0015\u0010\tR&\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0017\u0010\u000fR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u0011\u0010\u001bR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00198\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b\r\u0010\u001b¨\u0006\u001e"}, d2 = {"Yn/E$a", "LYn/k;", "Lkotlin/Function2;", "", "", "LXH/N;", "a", "LnI/p;", "e", "()LnI/p;", "onChangePickupPointClicked", "Lkotlin/Function1;", "LNn/c;", "b", "LnI/l;", "()LnI/l;", "onCapabilityCheckChanged", "c", "g", "onCapabilityQuestionClicked", "LNn/O;", "d", "onChangeTimeSlotClicked", "f", "onDeliveryItemsClicked", "Lkotlin/Function0;", "LnI/a;", "()LnI/a;", "onAddToCalendarClicked", "onChangeDeliveryMethodClicked", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C10996k {

        /* renamed from: a  reason: collision with root package name */
        private final p<String, Integer, C16807N> f89324a;

        /* renamed from: b  reason: collision with root package name */
        private final C17642l<C10800c, C16807N> f89325b;

        /* renamed from: c  reason: collision with root package name */
        private final C17642l<C10800c, C16807N> f89326c;

        /* renamed from: d  reason: collision with root package name */
        private final p<String, O, C16807N> f89327d;

        /* renamed from: e  reason: collision with root package name */
        private final C17642l<String, C16807N> f89328e;

        /* renamed from: f  reason: collision with root package name */
        private final C17631a<C16807N> f89329f;

        /* renamed from: g  reason: collision with root package name */
        private final C17631a<C16807N> f89330g;

        a(C10995j jVar, j jVar2, o oVar) {
            this.f89324a = jVar.e();
            this.f89325b = new B(jVar2, jVar, oVar, this);
            this.f89326c = new C(jVar);
            this.f89327d = new D(jVar, oVar);
            this.f89328e = jVar.g();
            this.f89329f = jVar.a();
            this.f89330g = jVar.d();
        }

        /* access modifiers changed from: private */
        public static final C16807N k(j jVar, C10995j jVar2, o oVar, a aVar, C10800c cVar) {
            C17542s.j(cVar, "capabilityHolder");
            C11435a a10 = jVar.a();
            M i10 = a10.i();
            if (i10 != null) {
                Iterable<C10800c> a11 = i10.a();
                ArrayList arrayList = new ArrayList(C16877v.y(a11, 10));
                for (C10800c cVar2 : a11) {
                    if (cVar.b() == cVar2.b()) {
                        cVar2 = cVar;
                    }
                    arrayList.add(cVar2);
                }
                jVar2.b().invoke(a10.d(), i10.e(), arrayList);
                oVar.c(jVar.a().k().name(), cVar);
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Time slot is null. We can only edit a selected time slot");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList2.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList2) {
                    if (str == null) {
                        String a12 = C11818a.a((String) null, illegalStateException);
                        if (a12 == null) {
                            break;
                        }
                        str = C11820c.a(a12);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = aVar.getClass().getName();
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
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N l(C10995j jVar, C10800c cVar) {
            C17542s.j(cVar, "it");
            jVar.c().invoke(cVar);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C10995j jVar, o oVar, String str, O o10) {
            C17542s.j(str, "id");
            C17542s.j(o10, "timeWindow");
            jVar.f().invoke(str, o10);
            oVar.a();
            return C16807N.f139792a;
        }

        public C17642l<C10800c, C16807N> a() {
            return this.f89325b;
        }

        public C17631a<C16807N> b() {
            return this.f89330g;
        }

        public C17631a<C16807N> c() {
            return this.f89329f;
        }

        public p<String, O, C16807N> d() {
            return this.f89327d;
        }

        public p<String, Integer, C16807N> e() {
            return this.f89324a;
        }

        public C17642l<String, C16807N> f() {
            return this.f89328e;
        }

        public C17642l<C10800c, C16807N> g() {
            return this.f89326c;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j f89331a;

        b(j jVar) {
            this.f89331a = jVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1946473350, i11, -1, "com.ingka.ikea.checkout.impl.compose.DeliveryMethodDetails.<anonymous> (DeliveryArrangementContent.kt:395)");
                }
                C13607l.j(this.f89331a.e(), C13679b.a.c.f116681a, (androidx.compose.ui.d) null, C18030v.f147664a.a(mVar, C18030v.f147665b).I0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262132);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11374a.C2202a f89332a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<C10800c> f89333b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f89334c;

        c(C11374a.C2202a aVar, C15987c<C10800c> cVar, C17631a<C16807N> aVar2) {
            this.f89332a = aVar;
            this.f89333b = cVar;
            this.f89334c = aVar2;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-546209014, i10, -1, "com.ingka.ikea.checkout.impl.compose.DeliveryTime.<anonymous> (DeliveryArrangementContent.kt:327)");
                }
                E.N(this.f89332a, this.f89333b, this.f89334c, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f89335a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f89336b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f89337c;

        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|(2:19|20)|21|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|51) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|(2:5|6)|7|9|10|(2:11|12)|13|(2:15|16)|17|19|20|21|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|51) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|(2:1|2)|3|5|6|7|9|10|(2:11|12)|13|15|16|17|19|20|21|(2:23|24)|25|(2:27|28)|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|51) */
        /* JADX WARNING: Can't wrap try/catch for region: R(43:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|(2:23|24)|25|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|51) */
        /* JADX WARNING: Can't wrap try/catch for region: R(44:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|19|20|21|23|24|25|27|28|29|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|51) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0077 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x007f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x0098 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00a2 */
        static {
            /*
                ho.a$a[] r0 = ho.C11374a.C2202a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                ho.a$a r2 = ho.C11374a.C2202a.CHECKOUT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                ho.a$a r3 = ho.C11374a.C2202a.CONFIRMATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f89335a = r0
                Nn.p[] r0 = Nn.C10813p.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.p r3 = Nn.C10813p.HOME     // Catch:{ NoSuchFieldError -> 0x002a }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r0[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                Nn.p r3 = Nn.C10813p.PICKUP     // Catch:{ NoSuchFieldError -> 0x0032 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0032 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0032 }
            L_0x0032:
                r3 = 3
                Nn.p r4 = Nn.C10813p.PICKUP_STORE     // Catch:{ NoSuchFieldError -> 0x003b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003b }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x003b }
            L_0x003b:
                r4 = 4
                Nn.p r5 = Nn.C10813p.CLICK_AND_COLLECT_STORE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                r5 = 5
                Nn.p r6 = Nn.C10813p.CLICK_AND_COLLECT_NEAR_YOU     // Catch:{ NoSuchFieldError -> 0x004d }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                r6 = 6
                Nn.p r7 = Nn.C10813p.LOCKER     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r7] = r6     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                f89336b = r0
                Nn.u[] r0 = Nn.u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.u r7 = Nn.u.STANDARD_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0067 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0067 }
                r0[r7] = r1     // Catch:{ NoSuchFieldError -> 0x0067 }
            L_0x0067:
                Nn.u r1 = Nn.u.CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x006f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                Nn.u r1 = Nn.u.EXPRESS_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x0077 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0077 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0077 }
            L_0x0077:
                Nn.u r1 = Nn.u.EXPRESS_CURBSIDE_RANGE_OF_DAYS     // Catch:{ NoSuchFieldError -> 0x007f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                Nn.u r1 = Nn.u.STANDARD     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                Nn.u r1 = Nn.u.CURBSIDE     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                Nn.u r1 = Nn.u.EXPRESS     // Catch:{ NoSuchFieldError -> 0x0098 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0098 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0098 }
            L_0x0098:
                Nn.u r1 = Nn.u.EXPRESS_CURBSIDE     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                Nn.u r1 = Nn.u.LOCKER     // Catch:{ NoSuchFieldError -> 0x00ac }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ac }
            L_0x00ac:
                f89337c = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yn.E.d.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A(j jVar, C11374a.C2202a aVar, C15987c cVar, C10996k kVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        z(jVar, aVar, cVar, kVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void B(lo.j r40, KJ.C15987c<Yn.F> r41, nI.C17642l<? super java.lang.String, XH.C16807N> r42, U0.C4889m r43, int r44) {
        /*
            r0 = r40
            r1 = r41
            r2 = r42
            r3 = r44
            r4 = 48
            r5 = -1020460744(0xffffffffc32d0138, float:-173.00476)
            r6 = r43
            U0.m r15 = r6.k(r5)
            r6 = r3 & 6
            if (r6 != 0) goto L_0x0022
            boolean r6 = r15.F(r0)
            if (r6 == 0) goto L_0x001f
            r6 = 4
            goto L_0x0020
        L_0x001f:
            r6 = 2
        L_0x0020:
            r6 = r6 | r3
            goto L_0x0023
        L_0x0022:
            r6 = r3
        L_0x0023:
            r7 = r3 & 48
            if (r7 != 0) goto L_0x0033
            boolean r7 = r15.V(r1)
            if (r7 == 0) goto L_0x0030
            r7 = 32
            goto L_0x0032
        L_0x0030:
            r7 = 16
        L_0x0032:
            r6 = r6 | r7
        L_0x0033:
            r7 = r3 & 384(0x180, float:5.38E-43)
            r8 = 256(0x100, float:3.59E-43)
            if (r7 != 0) goto L_0x0044
            boolean r7 = r15.F(r2)
            if (r7 == 0) goto L_0x0041
            r7 = r8
            goto L_0x0043
        L_0x0041:
            r7 = 128(0x80, float:1.794E-43)
        L_0x0043:
            r6 = r6 | r7
        L_0x0044:
            r13 = r6
            r6 = r13 & 147(0x93, float:2.06E-43)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L_0x0058
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x0052
            goto L_0x0058
        L_0x0052:
            r15.L()
            r5 = r15
            goto L_0x0454
        L_0x0058:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0064
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.checkout.impl.compose.DeliveryItemsDetails (DeliveryArrangementContent.kt:466)"
            U0.C4895p.S(r5, r13, r6, r7)
        L_0x0064:
            java.util.Iterator r5 = r41.iterator()
            r11 = 0
            r12 = r11
        L_0x006a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x007c
            java.lang.Object r6 = r5.next()
            Yn.F r6 = (Yn.F) r6
            int r6 = r6.c()
            int r12 = r12 + r6
            goto L_0x006a
        L_0x007c:
            int r5 = rv.C11848a.f102159b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            java.lang.String r18 = J1.j.a(r5, r12, r6, r15, r11)
            r5 = -111466848(0xfffffffff95b26a0, float:-7.1118526E34)
            r15.W(r5)
            r5 = r13 & 896(0x380, float:1.256E-42)
            r9 = 1
            if (r5 != r8) goto L_0x0097
            r5 = r9
            goto L_0x0098
        L_0x0097:
            r5 = r11
        L_0x0098:
            boolean r6 = r15.F(r0)
            r5 = r5 | r6
            java.lang.Object r6 = r15.D()
            if (r5 != 0) goto L_0x00ab
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x00b3
        L_0x00ab:
            Yn.t r6 = new Yn.t
            r6.<init>(r2, r0)
            r15.u(r6)
        L_0x00b3:
            r20 = r6
            nI.a r20 = (nI.C17631a) r20
            r15.P()
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r6 = 0
            r10 = 0
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r5, r6, r9, r10)
            androidx.compose.ui.d r7 = TC.e.i(r7)
            java.lang.String r8 = "DELIVERY_ITEMS_DETAILS"
            androidx.compose.ui.d r7 = androidx.compose.ui.platform.C5116k1.a(r7, r8)
            tK.u r32 = tK.C18029u.f147649a
            float r8 = r32.a()
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.k(r7, r6, r8, r9, r10)
            r21 = 5
            r22 = 0
            r17 = 0
            r19 = 0
            androidx.compose.ui.d r6 = androidx.compose.foundation.d.d(r16, r17, r18, r19, r20, r21, r22)
            i1.c$a r33 = i1.C5437c.f24302a
            i1.c$c r7 = r33.i()
            androidx.compose.foundation.layout.d r8 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r10 = r8.f()
            E1.I r4 = androidx.compose.foundation.layout.G.b(r10, r7, r15, r4)
            int r7 = U0.C4883j.a(r15, r11)
            U0.y r10 = r15.s()
            androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r15, r6)
            G1.g$a r34 = G1.C4504g.f6515W
            nI.a r14 = r34.a()
            U0.f r17 = r15.m()
            if (r17 != 0) goto L_0x010d
            U0.C4883j.c()
        L_0x010d:
            r15.I()
            boolean r17 = r15.i()
            if (r17 == 0) goto L_0x011a
            r15.p(r14)
            goto L_0x011d
        L_0x011a:
            r15.t()
        L_0x011d:
            U0.m r14 = U0.F1.a(r15)
            nI.p r9 = r34.c()
            U0.F1.c(r14, r4, r9)
            nI.p r4 = r34.e()
            U0.F1.c(r14, r10, r4)
            nI.p r4 = r34.b()
            boolean r9 = r14.i()
            if (r9 != 0) goto L_0x0147
            java.lang.Object r9 = r14.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
            if (r9 != 0) goto L_0x0155
        L_0x0147:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            r14.u(r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r14.w(r7, r4)
        L_0x0155:
            nI.p r4 = r34.d()
            U0.F1.c(r14, r6, r4)
            s0.N r21 = s0.C5843N.f28726a
            r25 = 2
            r26 = 0
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 0
            r22 = r5
            androidx.compose.ui.d r4 = s0.C5842M.e(r21, r22, r23, r24, r25, r26)
            androidx.compose.foundation.layout.d$m r6 = r8.g()
            i1.c$b r7 = r33.k()
            E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r7, r15, r11)
            int r7 = U0.C4883j.a(r15, r11)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r4)
            nI.a r9 = r34.a()
            U0.f r10 = r15.m()
            if (r10 != 0) goto L_0x0191
            U0.C4883j.c()
        L_0x0191:
            r15.I()
            boolean r10 = r15.i()
            if (r10 == 0) goto L_0x019e
            r15.p(r9)
            goto L_0x01a1
        L_0x019e:
            r15.t()
        L_0x01a1:
            U0.m r9 = U0.F1.a(r15)
            nI.p r10 = r34.c()
            U0.F1.c(r9, r6, r10)
            nI.p r6 = r34.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r34.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x01cb
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x01d9
        L_0x01cb:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x01d9:
            nI.p r6 = r34.d()
            U0.F1.c(r9, r4, r6)
            s0.h r4 = s0.C5862h.f28810a
            r4 = -397977120(0xffffffffe84759e0, float:-3.7656353E24)
            r15.W(r4)
            int r4 = r40.l()
            r9 = 1
            if (r4 <= r9) goto L_0x024b
            java.lang.String r4 = "SHIPMENT_DETAILS"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r5, r4)
            int r4 = rv.C11849b.f102183F0
            int r6 = r40.d()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            int r7 = r40.l()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r6 = J1.j.c(r4, r6, r15, r11)
            TC.b$a$c r7 = TC.C13679b.a.c.f116681a
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r17 = 0
            r4 = r9
            r14 = 0
            r9 = r17
            r4 = r11
            r35 = r12
            r11 = r17
            r17 = 0
            r36 = r13
            r13 = r17
            r14 = r17
            r16 = 0
            r37 = r15
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 432(0x1b0, float:6.05E-43)
            r28 = r37
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0252
        L_0x024b:
            r4 = r11
            r35 = r12
            r36 = r13
            r37 = r15
        L_0x0252:
            r37.P()
            java.lang.String r6 = "DELIVERY_TYPE_DETAILS"
            androidx.compose.ui.d r8 = androidx.compose.ui.platform.C5116k1.a(r5, r6)
            U0.I0 r6 = androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.g()
            r15 = r37
            java.lang.Object r6 = r15.Q(r6)
            android.content.Context r6 = (android.content.Context) r6
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r7 = "getResources(...)"
            kotlin.jvm.internal.C17542s.i(r6, r7)
            java.lang.String r6 = r0.g(r6)
            TC.b$b$f r7 = TC.C13679b.C2857b.f.f116688a
            tK.v r14 = tK.C18030v.f147664a
            int r13 = tK.C18030v.f147665b
            tK.h r9 = r14.a(r15, r13)
            long r9 = r9.I0()
            r30 = 0
            r31 = 262128(0x3fff0, float:3.6732E-40)
            r11 = 0
            r16 = 0
            r38 = r13
            r13 = r16
            r39 = r14
            r14 = r16
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 432(0x1b0, float:6.05E-43)
            r28 = r37
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r37.x()
            i1.c r6 = r33.o()
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r4)
            r15 = r37
            int r7 = U0.C4883j.a(r15, r4)
            U0.y r8 = r15.s()
            androidx.compose.ui.d r9 = androidx.compose.ui.c.e(r15, r5)
            nI.a r10 = r34.a()
            U0.f r11 = r15.m()
            if (r11 != 0) goto L_0x02d6
            U0.C4883j.c()
        L_0x02d6:
            r15.I()
            boolean r11 = r15.i()
            if (r11 == 0) goto L_0x02e3
            r15.p(r10)
            goto L_0x02e6
        L_0x02e3:
            r15.t()
        L_0x02e6:
            U0.m r10 = U0.F1.a(r15)
            nI.p r11 = r34.c()
            U0.F1.c(r10, r6, r11)
            nI.p r6 = r34.e()
            U0.F1.c(r10, r8, r6)
            nI.p r6 = r34.b()
            boolean r8 = r10.i()
            if (r8 != 0) goto L_0x0310
            java.lang.Object r8 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x031e
        L_0x0310:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r10.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.w(r7, r6)
        L_0x031e:
            nI.p r6 = r34.d()
            U0.F1.c(r10, r9, r6)
            androidx.compose.foundation.layout.j r6 = androidx.compose.foundation.layout.C5079j.f18125a
            r6 = -397943633(0xffffffffe847dcaf, float:-3.7752873E24)
            r15.W(r6)
            r6 = r36 & 112(0x70, float:1.57E-43)
            r7 = 32
            if (r6 != r7) goto L_0x0335
            r11 = 1
            goto L_0x0336
        L_0x0335:
            r11 = r4
        L_0x0336:
            java.lang.Object r6 = r15.D()
            if (r11 != 0) goto L_0x0344
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r6 != r7) goto L_0x034c
        L_0x0344:
            Yn.u r6 = new Yn.u
            r6.<init>(r1)
            r15.u(r6)
        L_0x034c:
            nI.l r6 = (nI.C17642l) r6
            r15.P()
            gs.e r6 = gs.f.a(r6, r15, r4)
            E1.k$a r7 = E1.C4478k.f5915a
            E1.k r13 = r7.f()
            java.lang.String r7 = "ITEM_THUMBNAIL_TEST_TAG"
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r5, r7)
            r7 = 50
            float r14 = (float) r7
            float r7 = c2.h.B(r14)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.t(r5, r7)
            A0.f r7 = A0.g.h()
            androidx.compose.ui.d r5 = m1.e.a(r5, r7)
            r7 = 1
            float r8 = (float) r7
            float r7 = c2.h.B(r8)
            r9 = r38
            r8 = r39
            tK.h r8 = r8.a(r15, r9)
            long r8 = r8.p0()
            A0.f r10 = A0.g.h()
            androidx.compose.ui.d r5 = n0.C5599e.g(r5, r7, r8, r10)
            float r7 = r32.j()
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.i(r5, r7)
            r5 = 12582960(0xc00030, float:1.7632483E-38)
            int r7 = gs.e.f97946h
            r18 = r7 | r5
            r19 = 0
            r20 = 1912(0x778, float:2.679E-42)
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r5 = 0
            r16 = 0
            r17 = 0
            r21 = r14
            r14 = r5
            r5 = r15
            r15 = r16
            r16 = r17
            r17 = r5
            gs.C11352b.b(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r6 = -397912608(0xffffffffe84855e0, float:-3.7842296E24)
            r5.W(r6)
            int r6 = r41.size()
            r7 = 1
            if (r6 <= r7) goto L_0x0438
            java.util.Iterator r6 = r41.iterator()
            r11 = r4
        L_0x03ca:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x03dc
            java.lang.Object r4 = r6.next()
            Yn.F r4 = (Yn.F) r4
            int r4 = r4.c()
            int r11 = r11 + r4
            goto L_0x03ca
        L_0x03dc:
            int r11 = r11 - r7
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            float r4 = c2.h.B(r21)
            tK.u r6 = tK.C18029u.f147649a
            float r6 = r6.a()
            float r4 = r4 - r6
            float r13 = c2.h.B(r4)
            r17 = 14
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            androidx.compose.ui.d r8 = androidx.compose.foundation.layout.D.m(r12, r13, r14, r15, r16, r17, r18)
            IC.e$b r6 = new IC.e$b
            java.lang.Integer r4 = java.lang.Integer.valueOf(r11)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r7 = 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r7)
            java.lang.String r7 = "+%s"
            java.lang.String r4 = java.lang.String.format(r7, r4)
            java.lang.String r7 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r4, r7)
            r6.<init>(r4)
            IC.e$c r7 = new IC.e$c
            int r4 = rv.C11848a.f102160c
            int r9 = IC.C13020b.a(r35)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r35)
            java.util.List r10 = YH.C16877v.e(r10)
            r11 = 0
            r7.<init>(r4, r9, r10, r11)
            int r4 = IC.C13023e.b.f110934c
            int r9 = IC.C13023e.c.f110936f
            int r9 = r9 << 3
            r10 = r4 | r9
            r11 = 0
            r9 = r5
            u(r6, r7, r8, r9, r10, r11)
        L_0x0438:
            r5.P()
            r5.x()
            r5.x()
            r11 = 0
            r12 = 7
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = r5
            SC.C13643u0.c(r6, r7, r8, r10, r11, r12)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0454
            U0.C4895p.R()
        L_0x0454:
            U0.Y0 r4 = r5.n()
            if (r4 == 0) goto L_0x0462
            Yn.v r5 = new Yn.v
            r5.<init>(r0, r1, r2, r3)
            r4.a(r5)
        L_0x0462:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yn.E.B(lo.j, KJ.c, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N C(C17642l lVar, j jVar) {
        lVar.invoke(jVar.a().d());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C15987c cVar, e.a aVar) {
        String str;
        Object obj;
        boolean z10;
        C17542s.j(aVar, "$this$ikeaImageRequest");
        Iterator it = cVar.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String a10 = ((F) obj).a();
            if (a10 == null || a10.length() == 0) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (!z10) {
                break;
            }
        }
        F f10 = (F) obj;
        if (f10 != null) {
            str = f10.a();
        }
        aVar.j(str);
        aVar.i(Boolean.TRUE);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(j jVar, C15987c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        B(jVar, cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void F(j jVar, j.a aVar, p<? super String, ? super Integer, C16807N> pVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a aVar2;
        j jVar2 = jVar;
        j.a aVar3 = aVar;
        p<? super String, ? super Integer, C16807N> pVar2 = pVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1921878698);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(jVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= (i12 & 64) == 0 ? k10.V(aVar3) : k10.F(aVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(pVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1921878698, i11, -1, "com.ingka.ikea.checkout.impl.compose.DeliveryLocation (DeliveryArrangementContent.kt:428)");
            }
            C13569b1 b1Var = aVar.a() ? C13569b1.d.f116148b : C13569b1.g.f116154b;
            androidx.compose.ui.d a10 = C5116k1.a(androidx.compose.ui.d.f18749a, "DELIVERY_LOCATION");
            C13023e c10 = aVar.c();
            int i13 = C13023e.f110931a;
            String a11 = c10.a(k10, i13);
            String a12 = aVar.b().a(k10, i13);
            C13573c1.a aVar4 = new C13573c1.a(C18146a.f148086I6, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null);
            C13589g1 g1Var = C13589g1.Medium;
            k10.W(1008677268);
            if (!C17542s.e(b1Var, C13569b1.g.f116154b)) {
                k10.W(1008679363);
                boolean F10 = ((i11 & 896) == 256) | k10.F(jVar2);
                Object D10 = k10.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new A(pVar2, jVar2);
                    k10.u(D10);
                }
                aVar2 = (C17631a) D10;
                k10.P();
            } else {
                aVar2 = null;
            }
            k10.P();
            String str = a11;
            C17631a aVar5 = aVar2;
            androidx.compose.ui.d dVar = a10;
            mVar2 = k10;
            C13585f1.c(str, aVar5, dVar, a12, aVar4, b1Var, (String) null, (p<? super C4889m, ? super Integer, C16807N>) null, g1Var, 0.0f, true, false, (m) null, mVar2, (C13573c1.a.f116164f << 12) | 100663680 | (C13569b1.f116141a << 15), 6, 6848);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10998m(jVar2, aVar3, pVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N G(p pVar, j jVar) {
        pVar.invoke(jVar.i(), Integer.valueOf(jVar.d()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N H(j jVar, j.a aVar, p pVar, int i10, C4889m mVar, int i11) {
        F(jVar, aVar, pVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void I(j jVar, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        j jVar2 = jVar;
        C17631a<C16807N> aVar2 = aVar;
        C4889m k10 = mVar.k(-587785016);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.F(jVar2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-587785016, i11, -1, "com.ingka.ikea.checkout.impl.compose.DeliveryMethodDetails (DeliveryArrangementContent.kt:381)");
            }
            int g10 = Co.c.g(jVar.j(), jVar.h(), jVar.a().k());
            int f10 = Co.c.f(jVar.j());
            k10.W(293664582);
            String e10 = jVar.e();
            C5264a e11 = (e10 == null || e10.length() == 0) ? null : c1.c.e(-1946473350, true, new b(jVar2), k10, 54);
            k10.P();
            androidx.compose.ui.d a10 = C5116k1.a(androidx.compose.ui.d.f18749a, "DELIVERY_METHOD_DETAILS");
            String b10 = J1.j.b(g10, k10, 0);
            String b11 = J1.j.b(C11849b.f102267a0, k10, 0);
            C13573c1.a aVar3 = r15;
            C13573c1.a aVar4 = new C13573c1.a(f10, (String) null, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null);
            mVar2 = k10;
            C13585f1.c(b10, aVar, a10, b11, aVar3, C13569b1.d.f116148b, (String) null, e11, C13589g1.Medium, 0.0f, true, false, (m) null, mVar2, (i11 & 112) | 100663680 | (C13573c1.a.f116164f << 12) | (C13569b1.d.f116149c << 15), 6, 6720);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11010z(jVar2, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N J(j jVar, C17631a aVar, int i10, C4889m mVar, int i11) {
        I(jVar, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void K(j jVar, C11374a.C2202a aVar, C15987c<C10800c> cVar, boolean z10, p<? super String, ? super O, C16807N> pVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C13569b1 b1Var;
        C17631a aVar3;
        j jVar2 = jVar;
        C11374a.C2202a aVar4 = aVar;
        C15987c<C10800c> cVar2 = cVar;
        boolean z11 = z10;
        p<? super String, ? super O, C16807N> pVar2 = pVar;
        C17631a<C16807N> aVar5 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(-654868308);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(jVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(aVar4) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(cVar2) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.b(z11) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(pVar2) ? 16384 : 8192;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.F(aVar5) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        }
        if ((74899 & i11) != 74898 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-654868308, i11, -1, "com.ingka.ikea.checkout.impl.compose.DeliveryTime (DeliveryArrangementContent.kt:274)");
            }
            int S10 = S(jVar.j(), jVar.h(), aVar4);
            List<M> b10 = jVar.a().j().b();
            boolean z12 = false;
            int size = b10 != null ? b10.size() : 0;
            String c10 = J1.j.c(Oo.b.f84654h, new Object[]{J1.j.b(jVar.f(), k10, 0)}, k10, 0);
            if (z11) {
                int i13 = d.f89335a[aVar.ordinal()];
                if (i13 == 1) {
                    b1Var = size == 1 ? C13569b1.g.f116154b : C13569b1.d.f116148b;
                } else if (i13 == 2) {
                    b1Var = C13569b1.g.f116154b;
                } else {
                    throw new t();
                }
            } else {
                b1Var = C13569b1.g.f116154b;
            }
            C13569b1 b1Var2 = b1Var;
            androidx.compose.ui.d a10 = C5116k1.a(androidx.compose.ui.d.f18749a, "DELIVERY_TIME");
            String b11 = jVar.b();
            if (b11 == null) {
                b11 = "";
            }
            String b12 = J1.j.b(S10, k10, 0);
            C13573c1.a aVar6 = new C13573c1.a(C18146a.f148290W0, c10, (C5437c.C0386c) null, (C5747v0) null, 12, (DefaultConstructorMarker) null);
            C13589g1 g1Var = C13589g1.Medium;
            k10.W(1203538106);
            if (!C17542s.e(b1Var2, C13569b1.g.f116154b)) {
                k10.W(1203540201);
                if ((i11 & 57344) == 16384) {
                    z12 = true;
                }
                boolean F10 = k10.F(jVar2) | z12;
                Object D10 = k10.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C11008x(pVar2, jVar2);
                    k10.u(D10);
                }
                aVar3 = (C17631a) D10;
                k10.P();
            } else {
                aVar3 = null;
            }
            k10.P();
            mVar2 = k10;
            C13585f1.c(b11, aVar3, a10, b12, aVar6, b1Var2, (String) null, c1.c.e(-546209014, true, new c(aVar4, cVar2, aVar5), k10, 54), g1Var, 0.0f, true, false, (m) null, mVar2, (C13573c1.a.f116164f << 12) | 113246592 | (C13569b1.f116141a << 15), 6, 6720);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11009y(jVar, aVar, cVar, z10, pVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N L(p pVar, j jVar) {
        pVar.invoke(jVar.a().d(), jVar.a().j());
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(j jVar, C11374a.C2202a aVar, C15987c cVar, boolean z10, p pVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        K(jVar, aVar, cVar, z10, pVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void N(C11374a.C2202a aVar, C15987c<C10800c> cVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-393091824);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-393091824, i11, -1, "com.ingka.ikea.checkout.impl.compose.DeliveryTimeAddons (DeliveryArrangementContent.kt:351)");
            }
            d.a aVar3 = androidx.compose.ui.d.f18749a;
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar3);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(1966273734);
            C11374a.C2202a aVar5 = C11374a.C2202a.CHECKOUT;
            if (aVar != aVar5) {
                if (aVar == C11374a.C2202a.CONFIRMATION) {
                    q(aVar2, k10, (i11 >> 6) & 14);
                } else {
                    throw new t();
                }
            }
            k10.P();
            k10.W(1966281667);
            if (aVar != aVar5) {
                if (aVar != C11374a.C2202a.CONFIRMATION) {
                    throw new t();
                } else if (cVar != null) {
                    for (C10800c cVar2 : cVar) {
                        k10.W(1966293002);
                        if (cVar2.a()) {
                            C10991f.l(cVar2.b(), (androidx.compose.ui.d) null, k10, 0, 2);
                        }
                        k10.P();
                    }
                }
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11002q(aVar, cVar, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C11374a.C2202a aVar, C15987c cVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        N(aVar, cVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void P(C11435a aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(-1575975489);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1575975489, i11, -1, "com.ingka.ikea.checkout.impl.compose.PrimeTimeSlotDisclaimer (DeliveryArrangementContent.kt:572)");
            }
            C13023e g10 = aVar.g();
            if (g10 != null) {
                R0.e(g10.a(k10, C13023e.f110931a), C13611m.INFORMATIVE, false, D.m(TC.e.i(C5116k1.a(androidx.compose.ui.d.f18749a, "PRIME_TIME_SLOT_DISCLAIMER")), 0.0f, 0.0f, 0.0f, C18029u.f147649a.j(), 7, (Object) null), (String) null, true, k10, 197040, 16);
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11007w(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(C11435a aVar, int i10, C4889m mVar, int i11) {
        P(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final int S(C10813p pVar, u uVar, C11374a.C2202a aVar) {
        C17542s.j(pVar, "deliveryServiceType");
        C17542s.j(uVar, "fulfillmentServiceType");
        C17542s.j(aVar, "type");
        switch (d.f89337c[uVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                return C11849b.f102262Z;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                switch (d.f89336b[pVar.ordinal()]) {
                    case 1:
                        int i10 = d.f89335a[aVar.ordinal()];
                        if (i10 == 1) {
                            return C11849b.f102258Y;
                        }
                        if (i10 == 2) {
                            return C11849b.f102250W;
                        }
                        throw new t();
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        int i11 = d.f89335a[aVar.ordinal()];
                        if (i11 == 1) {
                            return C11849b.f102254X;
                        }
                        if (i11 == 2) {
                            return C11849b.f102246V;
                        }
                        throw new t();
                    default:
                        throw new t();
                }
            default:
                throw new t();
        }
    }

    private static final void q(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-1333880158);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1333880158, i11, -1, "com.ingka.ikea.checkout.impl.compose.AddToCalendarButton (DeliveryArrangementContent.kt:252)");
            }
            L.b(J1.j.b(C11849b.f102354u2, k10, 0), D.m(C5116k1.a(androidx.compose.ui.d.f18749a, "ADD_TO_CALENDAR"), 0.0f, C18029u.f147649a.a(), 0.0f, 0.0f, 13, (Object) null), false, N.Secondary, SC.M.Small, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i11 << 27) & 1879048192) | 27648, 484);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new r(aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C17631a aVar, int i10, C4889m mVar, int i11) {
        q(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void s(C10800c cVar, C17642l<? super C10800c, C16807N> lVar, C17642l<? super C10800c, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(189663920);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(lVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(189663920, i11, -1, "com.ingka.ikea.checkout.impl.compose.Capability (DeliveryArrangementContent.kt:596)");
            }
            C10991f.f(cVar, lVar, lVar2, D.k(TC.e.i(C5116k1.a(androidx.compose.ui.d.f18749a, "DELIVERY_CAPABILITY")), 0.0f, h.B((float) 16), 1, (Object) null), k10, i11 & 1022, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10999n(cVar, lVar, lVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N t(C10800c cVar, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        s(cVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void u(IC.C13023e r28, IC.C13023e r29, androidx.compose.ui.d r30, U0.C4889m r31, int r32, int r33) {
        /*
            r0 = r28
            r15 = r29
            r14 = r32
            r1 = 4
            r2 = 70836124(0x438df9c, float:2.1731772E-36)
            r3 = r31
            U0.m r12 = r3.k(r2)
            r3 = 1
            r4 = r33 & 1
            r5 = 2
            if (r4 == 0) goto L_0x0019
            r4 = r14 | 6
            goto L_0x0032
        L_0x0019:
            r4 = r14 & 6
            if (r4 != 0) goto L_0x0031
            r4 = r14 & 8
            if (r4 != 0) goto L_0x0026
            boolean r4 = r12.V(r0)
            goto L_0x002a
        L_0x0026:
            boolean r4 = r12.F(r0)
        L_0x002a:
            if (r4 == 0) goto L_0x002e
            r4 = r1
            goto L_0x002f
        L_0x002e:
            r4 = r5
        L_0x002f:
            r4 = r4 | r14
            goto L_0x0032
        L_0x0031:
            r4 = r14
        L_0x0032:
            r6 = r33 & 2
            if (r6 == 0) goto L_0x0039
            r4 = r4 | 48
            goto L_0x0052
        L_0x0039:
            r6 = r14 & 48
            if (r6 != 0) goto L_0x0052
            r6 = r14 & 64
            if (r6 != 0) goto L_0x0046
            boolean r6 = r12.V(r15)
            goto L_0x004a
        L_0x0046:
            boolean r6 = r12.F(r15)
        L_0x004a:
            if (r6 == 0) goto L_0x004f
            r6 = 32
            goto L_0x0051
        L_0x004f:
            r6 = 16
        L_0x0051:
            r4 = r4 | r6
        L_0x0052:
            r1 = r33 & 4
            if (r1 == 0) goto L_0x005b
            r4 = r4 | 384(0x180, float:5.38E-43)
        L_0x0058:
            r6 = r30
            goto L_0x006d
        L_0x005b:
            r6 = r14 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0058
            r6 = r30
            boolean r7 = r12.V(r6)
            if (r7 == 0) goto L_0x006a
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x006c
        L_0x006a:
            r7 = 128(0x80, float:1.794E-43)
        L_0x006c:
            r4 = r4 | r7
        L_0x006d:
            r7 = r4 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L_0x0082
            boolean r7 = r12.l()
            if (r7 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            r12.L()
            r3 = r6
            r27 = r12
            goto L_0x01dc
        L_0x0082:
            if (r1 == 0) goto L_0x0088
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r10 = r1
            goto L_0x0089
        L_0x0088:
            r10 = r6
        L_0x0089:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0095
            r1 = -1
            java.lang.String r6 = "com.ingka.ikea.checkout.impl.compose.CircleText (DeliveryArrangementContent.kt:615)"
            U0.C4895p.S(r2, r4, r1, r6)
        L_0x0095:
            java.lang.String r1 = "ADDITIONAL_ITEMS_TEST_TAG"
            androidx.compose.ui.d r1 = androidx.compose.ui.platform.C5116k1.a(r10, r1)
            A0.f r2 = A0.g.h()
            androidx.compose.ui.d r1 = m1.e.a(r1, r2)
            r2 = 50
            float r2 = (float) r2
            float r2 = c2.h.B(r2)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.t(r1, r2)
            float r2 = (float) r3
            float r2 = c2.h.B(r2)
            tK.v r6 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            tK.h r8 = r6.a(r12, r7)
            long r8 = r8.p0()
            A0.f r11 = A0.g.h()
            androidx.compose.ui.d r1 = n0.C5599e.g(r1, r2, r8, r11)
            r2 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r9 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.C5074e.b(r1, r2, r8, r5, r9)
            tK.h r1 = r6.a(r12, r7)
            long r17 = r1.k0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            i1.c$a r2 = i1.C5437c.f24302a
            i1.c r2 = r2.e()
            E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r8)
            int r5 = U0.C4883j.a(r12, r8)
            U0.y r6 = r12.s()
            androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r12, r1)
            G1.g$a r7 = G1.C4504g.f6515W
            nI.a r11 = r7.a()
            U0.f r13 = r12.m()
            if (r13 != 0) goto L_0x0106
            U0.C4883j.c()
        L_0x0106:
            r12.I()
            boolean r13 = r12.i()
            if (r13 == 0) goto L_0x0113
            r12.p(r11)
            goto L_0x0116
        L_0x0113:
            r12.t()
        L_0x0116:
            U0.m r11 = U0.F1.a(r12)
            nI.p r13 = r7.c()
            U0.F1.c(r11, r2, r13)
            nI.p r2 = r7.e()
            U0.F1.c(r11, r6, r2)
            nI.p r2 = r7.b()
            boolean r6 = r11.i()
            if (r6 != 0) goto L_0x0140
            java.lang.Object r6 = r11.D()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r13)
            if (r6 != 0) goto L_0x014e
        L_0x0140:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r11.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r11.w(r5, r2)
        L_0x014e:
            nI.p r2 = r7.d()
            U0.F1.c(r11, r1, r2)
            androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
            int r5 = IC.C13023e.f110931a
            int r1 = r4 >> 3
            r1 = r1 & 14
            r1 = r1 | r5
            java.lang.String r1 = r15.a(r12, r1)
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            r6 = 1517884752(0x5a791550, float:1.75276756E16)
            r12.W(r6)
            boolean r6 = r12.V(r1)
            java.lang.Object r7 = r12.D()
            if (r6 != 0) goto L_0x017c
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x0184
        L_0x017c:
            Yn.o r7 = new Yn.o
            r7.<init>(r1)
            r12.u(r7)
        L_0x0184:
            nI.l r7 = (nI.C17642l) r7
            r12.P()
            androidx.compose.ui.d r2 = L1.o.d(r2, r8, r7, r3, r9)
            Y1.j$a r1 = Y1.j.f14783b
            int r3 = r1.a()
            TC.b$b$c r1 = TC.C13679b.C2857b.c.f116685a
            Y1.j r13 = Y1.j.h(r3)
            r3 = r5 | 48
            r4 = r4 & 14
            r23 = r3 | r4
            r24 = 0
            r25 = 261112(0x3fbf8, float:3.65896E-40)
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r16 = 0
            r26 = r10
            r10 = r16
            r16 = 0
            r27 = r12
            r12 = r16
            r14 = r16
            r16 = 0
            r15 = r16
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r0 = r28
            r22 = r27
            SC.C13607l.i(r0, r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r27.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01da
            U0.C4895p.R()
        L_0x01da:
            r3 = r26
        L_0x01dc:
            U0.Y0 r6 = r27.n()
            if (r6 == 0) goto L_0x01f3
            Yn.p r7 = new Yn.p
            r0 = r7
            r1 = r28
            r2 = r29
            r4 = r32
            r5 = r33
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yn.E.u(IC.e, IC.e, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N v(String str, x xVar) {
        C17542s.j(xVar, "$this$semantics");
        v.d0(xVar, str);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(C13023e eVar, C13023e eVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        u(eVar, eVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void x(Wn.o r17, lo.j r18, ho.C11374a.C2202a r19, KJ.C15987c<Yn.F> r20, Yn.C10995j r21, androidx.compose.ui.d r22, U0.C4889m r23, int r24, int r25) {
        /*
            r1 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            r13 = r21
            r14 = r24
            java.lang.String r0 = "deliveryDetailsAnalytics"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "model"
            kotlin.jvm.internal.C17542s.j(r10, r0)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "itemsInDelivery"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "callbacks"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 1446615527(0x563999e7, float:5.1017664E13)
            r2 = r23
            U0.m r15 = r2.k(r0)
            r2 = r25 & 1
            if (r2 == 0) goto L_0x0035
            r2 = r14 | 6
            goto L_0x004e
        L_0x0035:
            r2 = r14 & 6
            if (r2 != 0) goto L_0x004d
            r2 = r14 & 8
            if (r2 != 0) goto L_0x0042
            boolean r2 = r15.V(r1)
            goto L_0x0046
        L_0x0042:
            boolean r2 = r15.F(r1)
        L_0x0046:
            if (r2 == 0) goto L_0x004a
            r2 = 4
            goto L_0x004b
        L_0x004a:
            r2 = 2
        L_0x004b:
            r2 = r2 | r14
            goto L_0x004e
        L_0x004d:
            r2 = r14
        L_0x004e:
            r3 = r25 & 2
            if (r3 == 0) goto L_0x0055
            r2 = r2 | 48
            goto L_0x0065
        L_0x0055:
            r3 = r14 & 48
            if (r3 != 0) goto L_0x0065
            boolean r3 = r15.F(r10)
            if (r3 == 0) goto L_0x0062
            r3 = 32
            goto L_0x0064
        L_0x0062:
            r3 = 16
        L_0x0064:
            r2 = r2 | r3
        L_0x0065:
            r3 = r25 & 4
            if (r3 == 0) goto L_0x006c
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L_0x007c
        L_0x006c:
            r3 = r14 & 384(0x180, float:5.38E-43)
            if (r3 != 0) goto L_0x007c
            boolean r3 = r15.V(r11)
            if (r3 == 0) goto L_0x0079
            r3 = 256(0x100, float:3.59E-43)
            goto L_0x007b
        L_0x0079:
            r3 = 128(0x80, float:1.794E-43)
        L_0x007b:
            r2 = r2 | r3
        L_0x007c:
            r3 = r25 & 8
            if (r3 == 0) goto L_0x0083
            r2 = r2 | 3072(0xc00, float:4.305E-42)
            goto L_0x0093
        L_0x0083:
            r3 = r14 & 3072(0xc00, float:4.305E-42)
            if (r3 != 0) goto L_0x0093
            boolean r3 = r15.V(r12)
            if (r3 == 0) goto L_0x0090
            r3 = 2048(0x800, float:2.87E-42)
            goto L_0x0092
        L_0x0090:
            r3 = 1024(0x400, float:1.435E-42)
        L_0x0092:
            r2 = r2 | r3
        L_0x0093:
            r3 = r25 & 16
            if (r3 == 0) goto L_0x009a
            r2 = r2 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00aa
        L_0x009a:
            r3 = r14 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00aa
            boolean r3 = r15.V(r13)
            if (r3 == 0) goto L_0x00a7
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a9
        L_0x00a7:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a9:
            r2 = r2 | r3
        L_0x00aa:
            r3 = r25 & 32
            r4 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00b4
            r2 = r2 | r4
        L_0x00b1:
            r4 = r22
            goto L_0x00c5
        L_0x00b4:
            r4 = r4 & r14
            if (r4 != 0) goto L_0x00b1
            r4 = r22
            boolean r5 = r15.V(r4)
            if (r5 == 0) goto L_0x00c2
            r5 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c4
        L_0x00c2:
            r5 = 65536(0x10000, float:9.18355E-41)
        L_0x00c4:
            r2 = r2 | r5
        L_0x00c5:
            r5 = 74899(0x12493, float:1.04956E-40)
            r5 = r5 & r2
            r6 = 74898(0x12492, float:1.04954E-40)
            if (r5 != r6) goto L_0x00da
            boolean r5 = r15.l()
            if (r5 != 0) goto L_0x00d5
            goto L_0x00da
        L_0x00d5:
            r15.L()
            r6 = r4
            goto L_0x0113
        L_0x00da:
            if (r3 == 0) goto L_0x00e1
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            r16 = r3
            goto L_0x00e3
        L_0x00e1:
            r16 = r4
        L_0x00e3:
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x00ef
            r3 = -1
            java.lang.String r4 = "com.ingka.ikea.checkout.impl.compose.DeliveryArrangementContent (DeliveryArrangementContent.kt:97)"
            U0.C4895p.S(r0, r2, r3, r4)
        L_0x00ef:
            Yn.E$a r5 = new Yn.E$a
            r5.<init>(r13, r10, r1)
            int r0 = r2 >> 3
            r2 = 58366(0xe3fe, float:8.1788E-41)
            r8 = r0 & r2
            r9 = 0
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = r16
            r7 = r15
            z(r2, r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0111
            U0.C4895p.R()
        L_0x0111:
            r6 = r16
        L_0x0113:
            U0.Y0 r9 = r15.n()
            if (r9 == 0) goto L_0x0130
            Yn.l r15 = new Yn.l
            r0 = r15
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.a(r15)
        L_0x0130:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yn.E.x(Wn.o, lo.j, ho.a$a, KJ.c, Yn.j, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N y(o oVar, j jVar, C11374a.C2202a aVar, C15987c cVar, C10995j jVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        x(oVar, jVar, aVar, cVar, jVar2, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void z(lo.j r17, ho.C11374a.C2202a r18, KJ.C15987c<Yn.F> r19, Yn.C10996k r20, androidx.compose.ui.d r21, U0.C4889m r22, int r23, int r24) {
        /*
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            r12 = r23
            r0 = 16
            r1 = 2
            r2 = 4
            r3 = -1531921764(0xffffffffa4b0ba9c, float:-7.664396E-17)
            r4 = r22
            U0.m r13 = r4.k(r3)
            r4 = r24 & 1
            if (r4 == 0) goto L_0x001e
            r4 = r12 | 6
            goto L_0x002e
        L_0x001e:
            r4 = r12 & 6
            if (r4 != 0) goto L_0x002d
            boolean r4 = r13.F(r8)
            if (r4 == 0) goto L_0x002a
            r4 = r2
            goto L_0x002b
        L_0x002a:
            r4 = r1
        L_0x002b:
            r4 = r4 | r12
            goto L_0x002e
        L_0x002d:
            r4 = r12
        L_0x002e:
            r1 = r24 & 2
            if (r1 == 0) goto L_0x0035
            r4 = r4 | 48
            goto L_0x0044
        L_0x0035:
            r1 = r12 & 48
            if (r1 != 0) goto L_0x0044
            boolean r1 = r13.V(r9)
            if (r1 == 0) goto L_0x0042
            r1 = 32
            goto L_0x0043
        L_0x0042:
            r1 = r0
        L_0x0043:
            r4 = r4 | r1
        L_0x0044:
            r1 = r24 & 4
            if (r1 == 0) goto L_0x004b
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x005b
        L_0x004b:
            r1 = r12 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x005b
            boolean r1 = r13.V(r10)
            if (r1 == 0) goto L_0x0058
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x005a
        L_0x0058:
            r1 = 128(0x80, float:1.794E-43)
        L_0x005a:
            r4 = r4 | r1
        L_0x005b:
            r1 = r24 & 8
            if (r1 == 0) goto L_0x0062
            r4 = r4 | 3072(0xc00, float:4.305E-42)
            goto L_0x007b
        L_0x0062:
            r1 = r12 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x007b
            r1 = r12 & 4096(0x1000, float:5.74E-42)
            if (r1 != 0) goto L_0x006f
            boolean r1 = r13.V(r11)
            goto L_0x0073
        L_0x006f:
            boolean r1 = r13.F(r11)
        L_0x0073:
            if (r1 == 0) goto L_0x0078
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x007a
        L_0x0078:
            r1 = 1024(0x400, float:1.435E-42)
        L_0x007a:
            r4 = r4 | r1
        L_0x007b:
            r0 = r24 & 16
            if (r0 == 0) goto L_0x0084
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
        L_0x0081:
            r1 = r21
            goto L_0x0096
        L_0x0084:
            r1 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r1 != 0) goto L_0x0081
            r1 = r21
            boolean r2 = r13.V(r1)
            if (r2 == 0) goto L_0x0093
            r2 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0095
        L_0x0093:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0095:
            r4 = r4 | r2
        L_0x0096:
            r2 = r4 & 9363(0x2493, float:1.312E-41)
            r5 = 9362(0x2492, float:1.3119E-41)
            if (r2 != r5) goto L_0x00a9
            boolean r2 = r13.l()
            if (r2 != 0) goto L_0x00a3
            goto L_0x00a9
        L_0x00a3:
            r13.L()
            r5 = r1
            goto L_0x0218
        L_0x00a9:
            if (r0 == 0) goto L_0x00af
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r14 = r0
            goto L_0x00b0
        L_0x00af:
            r14 = r1
        L_0x00b0:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00bc
            r0 = -1
            java.lang.String r1 = "com.ingka.ikea.checkout.impl.compose.DeliveryArrangementContentImpl (DeliveryArrangementContent.kt:191)"
            U0.C4895p.S(r3, r4, r0, r1)
        L_0x00bc:
            androidx.compose.foundation.layout.d r0 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r0 = r0.g()
            i1.c$a r1 = i1.C5437c.f24302a
            i1.c$b r1 = r1.k()
            r15 = 0
            E1.I r0 = androidx.compose.foundation.layout.C5080k.a(r0, r1, r13, r15)
            int r1 = U0.C4883j.a(r13, r15)
            U0.y r2 = r13.s()
            androidx.compose.ui.d r3 = androidx.compose.ui.c.e(r13, r14)
            G1.g$a r5 = G1.C4504g.f6515W
            nI.a r6 = r5.a()
            U0.f r7 = r13.m()
            if (r7 != 0) goto L_0x00e8
            U0.C4883j.c()
        L_0x00e8:
            r13.I()
            boolean r7 = r13.i()
            if (r7 == 0) goto L_0x00f5
            r13.p(r6)
            goto L_0x00f8
        L_0x00f5:
            r13.t()
        L_0x00f8:
            U0.m r6 = U0.F1.a(r13)
            nI.p r7 = r5.c()
            U0.F1.c(r6, r0, r7)
            nI.p r0 = r5.e()
            U0.F1.c(r6, r2, r0)
            nI.p r0 = r5.b()
            boolean r2 = r6.i()
            if (r2 != 0) goto L_0x0122
            java.lang.Object r2 = r6.D()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r7)
            if (r2 != 0) goto L_0x0130
        L_0x0122:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r6.u(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.w(r1, r0)
        L_0x0130:
            nI.p r0 = r5.d()
            U0.F1.c(r6, r3, r0)
            s0.h r0 = s0.C5862h.f28810a
            nI.l r0 = r20.f()
            r1 = r4 & 14
            int r2 = r4 >> 3
            r2 = r2 & 112(0x70, float:1.57E-43)
            r2 = r2 | r1
            B(r8, r10, r0, r13, r2)
            r0 = 1423990986(0x54e060ca, float:7.7095722E12)
            r13.W(r0)
            boolean r0 = r17.k()
            if (r0 == 0) goto L_0x015a
            nI.a r0 = r20.b()
            I(r8, r0, r13, r1)
        L_0x015a:
            r13.P()
            lo.j$a r0 = r17.c()
            r2 = 1423999244(0x54e0810c, float:7.7139018E12)
            r13.W(r2)
            if (r0 != 0) goto L_0x016a
            goto L_0x0176
        L_0x016a:
            nI.p r2 = r20.e()
            int r3 = IC.C13023e.f110931a
            int r3 = r3 << 3
            r1 = r1 | r3
            F(r8, r0, r2, r13, r1)
        L_0x0176:
            r13.P()
            jo.a r0 = r17.a()
            Nn.O r0 = r0.j()
            boolean r3 = r0.a()
            jo.a r0 = r17.a()
            Nn.M r0 = r0.i()
            r16 = 0
            if (r0 == 0) goto L_0x019f
            java.util.List r0 = r0.a()
            if (r0 == 0) goto L_0x019f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            KJ.c r0 = KJ.C15985a.h(r0)
            r2 = r0
            goto L_0x01a1
        L_0x019f:
            r2 = r16
        L_0x01a1:
            nI.p r5 = r20.d()
            nI.a r6 = r20.c()
            r7 = r4 & 126(0x7e, float:1.77E-43)
            r0 = r17
            r1 = r18
            r4 = r5
            r5 = r6
            r6 = r13
            K(r0, r1, r2, r3, r4, r5, r6, r7)
            r0 = 1424021554(0x54e0d832, float:7.7255986E12)
            r13.W(r0)
            boolean r0 = r17.m()
            if (r0 != 0) goto L_0x01c8
            jo.a r0 = r17.a()
            P(r0, r13, r15)
        L_0x01c8:
            r13.P()
            r0 = 1424031246(0x54e0fe0e, float:7.73068E12)
            r13.W(r0)
            ho.a$a r0 = ho.C11374a.C2202a.CHECKOUT
            if (r9 != r0) goto L_0x0204
            jo.a r0 = r17.a()
            Nn.M r0 = r0.i()
            if (r0 == 0) goto L_0x01e3
            java.util.List r16 = r0.a()
        L_0x01e3:
            if (r16 != 0) goto L_0x01e6
            goto L_0x0208
        L_0x01e6:
            java.lang.Iterable r16 = (java.lang.Iterable) r16
            java.util.Iterator r0 = r16.iterator()
        L_0x01ec:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0208
            java.lang.Object r1 = r0.next()
            Nn.c r1 = (Nn.C10800c) r1
            nI.l r2 = r20.a()
            nI.l r3 = r20.g()
            s(r1, r2, r3, r13, r15)
            goto L_0x01ec
        L_0x0204:
            ho.a$a r0 = ho.C11374a.C2202a.CONFIRMATION
            if (r9 != r0) goto L_0x0234
        L_0x0208:
            r13.P()
            r13.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0217
            U0.C4895p.R()
        L_0x0217:
            r5 = r14
        L_0x0218:
            U0.Y0 r13 = r13.n()
            if (r13 == 0) goto L_0x0233
            Yn.s r14 = new Yn.s
            r0 = r14
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r13.a(r14)
        L_0x0233:
            return
        L_0x0234:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Yn.E.z(lo.j, ho.a$a, KJ.c, Yn.k, androidx.compose.ui.d, U0.m, int, int):void");
    }
}
