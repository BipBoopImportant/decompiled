package vk;

import IC.C13023e;
import KJ.C15987c;
import KJ.C15989e;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import XH.C16807N;
import YH.C16877v;
import androidx.compose.foundation.layout.J;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import m0.N;
import nI.C17631a;
import nI.C17642l;
import pk.q;
import pk.s;
import u0.C5968C;
import u0.C5972G;
import u0.C5974I;
import u0.C5979c;
import u0.C5987k;
import u0.C5991o;
import u0.C5993q;
import uk.C1;
import uk.C12056w;
import uk.C12060y;
import vk.C12134F;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0001\u0010\u0012\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a­\u0001\u0010\u001b\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001aE\u0010\"\u001a\u00020\u000b*\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b\"\u0010#\u001ai\u0010)\u001a\u00020\u000b*\u00020\u00002\u0006\u0010%\u001a\u00020$2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tH\u0002¢\u0006\u0004\b)\u0010*\u001a+\u0010/\u001a\u00020+*\u00020+2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010,\u001a\u00020'2\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100\u001a#\u00103\u001a\u00020\u000b*\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b3\u00104\u001a1\u00108\u001a\u00020\u000b*\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u0010\u0006\u001a\u00020\u00052\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001fH\u0002¢\u0006\u0004\b8\u00109\u001a)\u0010=\u001a\u00020\u000b2\u0006\u0010:\u001a\u00020'2\u0006\u0010;\u001a\u00020\u00192\b\b\u0002\u0010<\u001a\u00020+H\u0003¢\u0006\u0004\b=\u0010>\u001aM\u0010@\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010?\u001a\u0004\u0018\u00010'2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000b0\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\u001f2\b\b\u0002\u0010<\u001a\u00020+H\u0003¢\u0006\u0004\b@\u0010A¨\u0006B"}, d2 = {"Lu0/C;", "Lpk/s;", "state", "LT0/c;", "windowSize", "", "columns", "Lu0/I;", "lazyGridState", "Lkotlin/Function1;", "Luk/w;", "LXH/N;", "onScreenAction", "Lpk/l;", "onItemOptionsClick", "onRemoveItemClick", "onItemClick", "onOutOfStockItemSeen", "C", "(Lu0/C;Lpk/s;LT0/c;ILu0/I;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;)V", "Lpk/q$b;", "products", "LKJ/c;", "Lpk/s$o;", "productsWayfindingData", "", "inStoreModeEnabled", "s", "(Lu0/C;Lpk/q$b;LKJ/c;ZLT0/c;ILu0/I;LnI/l;LnI/l;LnI/l;LnI/l;LnI/l;)V", "Lpk/n;", "instoreToggleOnlineOr", "Lkotlin/Function0;", "onChangeStoreClick", "onInStoreModeToggled", "w", "(Lu0/C;Lpk/n;ILnI/a;LnI/l;)V", "Lpk/q$a;", "onlineProducts", "LKJ/e;", "", "addToCartInProgressProducts", "y", "(Lu0/C;Lpk/q$a;LKJ/e;LT0/c;ILu0/I;LnI/l;LnI/l;)V", "Landroidx/compose/ui/d;", "key", "Lc2/d;", "density", "I", "(Landroidx/compose/ui/d;Lu0/I;Ljava/lang/String;Lc2/d;)Landroidx/compose/ui/d;", "Lpk/m;", "listTotalPrice", "G", "(Lu0/C;Lpk/m;I)V", "Lpk/o;", "planStoreVisit", "onPlanVisitClick", "A", "(Lu0/C;Lpk/o;ILnI/a;)V", "name", "hasTopPadding", "modifier", "m", "(Ljava/lang/String;ZLandroidx/compose/ui/d;LU0/m;II)V", "storeName", "o", "(ZLjava/lang/String;LnI/l;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "shoppinglist-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements nI.q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pk.i f104983a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f104984b;

        a(pk.i iVar, int i10) {
            this.f104983a = iVar;
            this.f104984b = i10;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 6) == 0) {
                i10 |= mVar.V(oVar) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(841778979, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.addDepartmentWithProductItems.<anonymous>.<anonymous> (ShoppingListUi.kt:129)");
                }
                v1.m(this.f104983a.a().a().a(mVar, C13023e.f110931a), this.f104984b != 0, C5991o.b(oVar, androidx.compose.ui.d.f18749a, (N) null, (N) null, (N) null, 7, (Object) null), mVar, 0, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<pk.l, C16807N> f104985a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pk.l f104986b;

        b(C17642l<? super pk.l, C16807N> lVar, pk.l lVar2) {
            this.f104985a = lVar;
            this.f104986b = lVar2;
        }

        public final void a() {
            this.f104985a.invoke(this.f104986b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements C17642l<pk.l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f104987a;

        c(C17642l<? super C12056w, C16807N> lVar) {
            this.f104987a = lVar;
        }

        public final void a(pk.l lVar) {
            C17542s.j(lVar, "it");
            this.f104987a.invoke(new C12056w.c(lVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pk.l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d implements C17642l<s.o, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f104988a;

        d(C17642l<? super C12056w, C16807N> lVar) {
            this.f104988a = lVar;
        }

        public final void a(s.o oVar) {
            C17542s.j(oVar, "it");
            this.f104988a.invoke(new C12056w.g(oVar, false));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((s.o) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<pk.l, C16807N> f104989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pk.l f104990b;

        e(C17642l<? super pk.l, C16807N> lVar, pk.l lVar2) {
            this.f104989a = lVar;
            this.f104990b = lVar2;
        }

        public final void a() {
            this.f104989a.invoke(this.f104990b);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f104991a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pk.l f104992b;

        f(C17642l<? super C12056w, C16807N> lVar, pk.l lVar2) {
            this.f104991a = lVar;
            this.f104992b = lVar2;
        }

        public final void a() {
            this.f104991a.invoke(new C12060y(this.f104992b));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements C17642l<pk.l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f104993a;

        g(C17642l<? super C12056w, C16807N> lVar) {
            this.f104993a = lVar;
        }

        public final void a(pk.l lVar) {
            C17542s.j(lVar, "it");
            this.f104993a.invoke(new C12056w.e(lVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pk.l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f104994a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pk.l f104995b;

        h(C17642l<? super C12056w, C16807N> lVar, pk.l lVar2) {
            this.f104994a = lVar;
            this.f104995b = lVar2;
        }

        public final void a() {
            this.f104994a.invoke(new C12056w.j(this.f104995b.j()));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i implements C17631a<C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f104996a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ pk.l f104997b;

        i(C17642l<? super C12056w, C16807N> lVar, pk.l lVar2) {
            this.f104996a = lVar;
            this.f104997b = lVar2;
        }

        public final void a() {
            this.f104996a.invoke(new C12056w.m(this.f104997b));
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.p f104998c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f104999d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(nI.p pVar, List list) {
            super(1);
            this.f104998c = pVar;
            this.f104999d = list;
        }

        public final Object a(int i10) {
            return this.f104998c.invoke(Integer.valueOf(i10), this.f104999d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/q;", "", "it", "Lu0/c;", "a", "(Lu0/q;I)J"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements nI.p<C5993q, Integer, C5979c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.q f105000c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f105001d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(nI.q qVar, List list) {
            super(2);
            this.f105000c = qVar;
            this.f105001d = list;
        }

        public final long a(C5993q qVar, int i10) {
            return ((C5979c) this.f105000c.invoke(qVar, Integer.valueOf(i10), this.f105001d.get(i10))).g();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return C5979c.a(a((C5993q) obj, ((Number) obj2).intValue()));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class l extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f105002c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public l(List list) {
            super(1);
            this.f105002c = list;
        }

        public final Object a(int i10) {
            pk.l lVar = (pk.l) this.f105002c.get(i10);
            return "ListProductItem";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/o;", "", "it", "LXH/N;", "a", "(Lu0/o;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class m extends C17544u implements nI.r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f105003c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5974I f105004d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l f105005e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C15987c f105006f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ T0.c f105007g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ pk.i f105008h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ boolean f105009i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l f105010j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l f105011k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ C17642l f105012l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ C17642l f105013m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public m(List list, C5974I i10, C17642l lVar, C15987c cVar, T0.c cVar2, pk.i iVar, boolean z10, C17642l lVar2, C17642l lVar3, C17642l lVar4, C17642l lVar5) {
            super(4);
            this.f105003c = list;
            this.f105004d = i10;
            this.f105005e = lVar;
            this.f105006f = cVar;
            this.f105007g = cVar2;
            this.f105008h = iVar;
            this.f105009i = z10;
            this.f105010j = lVar2;
            this.f105011k = lVar3;
            this.f105012l = lVar4;
            this.f105013m = lVar5;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v0, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(u0.C5991o r24, int r25, U0.C4889m r26, int r27) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                r15 = r26
                r2 = r27 & 6
                r9 = r24
                if (r2 != 0) goto L_0x0018
                boolean r2 = r15.V(r9)
                if (r2 == 0) goto L_0x0014
                r2 = 4
                goto L_0x0015
            L_0x0014:
                r2 = 2
            L_0x0015:
                r2 = r27 | r2
                goto L_0x001a
            L_0x0018:
                r2 = r27
            L_0x001a:
                r3 = r27 & 48
                if (r3 != 0) goto L_0x002a
                boolean r3 = r15.d(r1)
                if (r3 == 0) goto L_0x0027
                r3 = 32
                goto L_0x0029
            L_0x0027:
                r3 = 16
            L_0x0029:
                r2 = r2 | r3
            L_0x002a:
                r3 = r2 & 147(0x93, float:2.06E-43)
                r4 = 146(0x92, float:2.05E-43)
                if (r3 != r4) goto L_0x003c
                boolean r3 = r26.l()
                if (r3 != 0) goto L_0x0037
                goto L_0x003c
            L_0x0037:
                r26.L()
                goto L_0x0268
            L_0x003c:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x004b
                r3 = -1
                java.lang.String r4 = "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)"
                r5 = 1229287273(0x49456f69, float:808694.56)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x004b:
                java.util.List r2 = r0.f105003c
                java.lang.Object r2 = r2.get(r1)
                r10 = r2
                pk.l r10 = (pk.l) r10
                r2 = 815519414(0x309bd6b6, float:1.1338759E-9)
                r15.W(r2)
                r2 = -804978734(0xffffffffd004ffd2, float:-8.9254318E9)
                r15.W(r2)
                pk.l$a r2 = r10.c()
                boolean r2 = r2 instanceof pk.l.a.c
                if (r2 == 0) goto L_0x00ad
                vk.F$b r2 = vk.C12134F.f104492b
                vk.F$h r2 = new vk.F$h
                r2.<init>(r10)
                java.lang.String r2 = r2.f104493a
                u0.I r3 = r0.f105004d
                r4 = -804969889(0xffffffffd005225f, float:-8.9344891E9)
                r15.W(r4)
                nI.l r4 = r0.f105005e
                boolean r4 = r15.V(r4)
                boolean r5 = r15.F(r10)
                r4 = r4 | r5
                java.lang.Object r5 = r26.D()
                if (r4 != 0) goto L_0x0094
                U0.m$a r4 = U0.C4889m.f14007a
                java.lang.Object r4 = r4.a()
                if (r5 != r4) goto L_0x009e
            L_0x0094:
                vk.v1$b r5 = new vk.v1$b
                nI.l r4 = r0.f105005e
                r5.<init>(r4, r10)
                r15.u(r5)
            L_0x009e:
                r4 = r5
                nI.a r4 = (nI.C17631a) r4
                r26.P()
                r7 = 3072(0xc00, float:4.305E-42)
                r8 = 0
                r5 = 0
                r6 = r26
                pl.d.e(r2, r3, r4, r5, r6, r7, r8)
            L_0x00ad:
                r26.P()
                KJ.c r2 = r0.f105006f
                java.util.Iterator r2 = r2.iterator()
            L_0x00b6:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00d2
                java.lang.Object r3 = r2.next()
                r4 = r3
                pk.s$o r4 = (pk.s.o) r4
                java.lang.String r4 = r4.b()
                java.lang.String r5 = r10.j()
                boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r5)
                if (r4 == 0) goto L_0x00b6
                goto L_0x00d3
            L_0x00d2:
                r3 = 0
            L_0x00d3:
                r11 = r3
                pk.s$o r11 = (pk.s.o) r11
                T0.c r2 = r0.f105007g
                int r2 = r2.b()
                boolean r12 = Xo.g.b(r2)
                pk.i r2 = r0.f105008h
                KJ.c r2 = r2.b()
                int r2 = r2.size()
                r3 = 1
                int r2 = r2 - r3
                if (r1 >= r2) goto L_0x00f1
                r16 = r3
                goto L_0x00f4
            L_0x00f1:
                r1 = 0
                r16 = r1
            L_0x00f4:
                androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
                r8 = 7
                r1 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r24
                r9 = r1
                androidx.compose.ui.d r14 = u0.C5991o.b(r3, r4, r5, r6, r7, r8, r9)
                boolean r2 = r0.f105009i
                r1 = -804950665(0xffffffffd0056d77, float:-8.9541745E9)
                r15.W(r1)
                nI.l r1 = r0.f105010j
                boolean r1 = r15.V(r1)
                java.lang.Object r3 = r26.D()
                if (r1 != 0) goto L_0x011e
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x0128
            L_0x011e:
                vk.v1$c r3 = new vk.v1$c
                nI.l r1 = r0.f105010j
                r3.<init>(r1)
                r15.u(r3)
            L_0x0128:
                r5 = r3
                nI.l r5 = (nI.C17642l) r5
                r26.P()
                r1 = -804945516(0xffffffffd0058194, float:-8.959447E9)
                r15.W(r1)
                nI.l r1 = r0.f105010j
                boolean r1 = r15.V(r1)
                java.lang.Object r3 = r26.D()
                if (r1 != 0) goto L_0x0148
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x0152
            L_0x0148:
                vk.v1$d r3 = new vk.v1$d
                nI.l r1 = r0.f105010j
                r3.<init>(r1)
                r15.u(r3)
            L_0x0152:
                r6 = r3
                nI.l r6 = (nI.C17642l) r6
                r26.P()
                r1 = -804940451(0xffffffffd005955d, float:-8.9646336E9)
                r15.W(r1)
                nI.l r1 = r0.f105011k
                boolean r1 = r15.V(r1)
                boolean r3 = r15.F(r10)
                r1 = r1 | r3
                java.lang.Object r3 = r26.D()
                if (r1 != 0) goto L_0x0177
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x0181
            L_0x0177:
                vk.v1$e r3 = new vk.v1$e
                nI.l r1 = r0.f105011k
                r3.<init>(r1, r10)
                r15.u(r3)
            L_0x0181:
                r7 = r3
                nI.a r7 = (nI.C17631a) r7
                r26.P()
                nI.l r8 = r0.f105012l
                r1 = -804935977(0xffffffffd005a6d7, float:-8.969215E9)
                r15.W(r1)
                nI.l r1 = r0.f105010j
                boolean r1 = r15.V(r1)
                boolean r3 = r15.F(r10)
                r1 = r1 | r3
                java.lang.Object r3 = r26.D()
                if (r1 != 0) goto L_0x01a8
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x01b2
            L_0x01a8:
                vk.v1$f r3 = new vk.v1$f
                nI.l r1 = r0.f105010j
                r3.<init>(r1, r10)
                r15.u(r3)
            L_0x01b2:
                r9 = r3
                nI.a r9 = (nI.C17631a) r9
                r26.P()
                r1 = -804928359(0xffffffffd005c499, float:-8.9770158E9)
                r15.W(r1)
                nI.l r1 = r0.f105010j
                boolean r1 = r15.V(r1)
                java.lang.Object r3 = r26.D()
                if (r1 != 0) goto L_0x01d2
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x01dc
            L_0x01d2:
                vk.v1$g r3 = new vk.v1$g
                nI.l r1 = r0.f105010j
                r3.<init>(r1)
                r15.u(r3)
            L_0x01dc:
                r20 = r3
                nI.l r20 = (nI.C17642l) r20
                r26.P()
                r1 = -804921228(0xffffffffd005e074, float:-8.984318E9)
                r15.W(r1)
                nI.l r1 = r0.f105010j
                boolean r1 = r15.V(r1)
                boolean r3 = r15.F(r10)
                r1 = r1 | r3
                java.lang.Object r3 = r26.D()
                if (r1 != 0) goto L_0x0202
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x020c
            L_0x0202:
                vk.v1$h r3 = new vk.v1$h
                nI.l r1 = r0.f105010j
                r3.<init>(r1, r10)
                r15.u(r3)
            L_0x020c:
                r21 = r3
                nI.a r21 = (nI.C17631a) r21
                r26.P()
                nI.l r4 = r0.f105013m
                r1 = -804912454(0xffffffffd00602ba, float:-8.9933025E9)
                r15.W(r1)
                nI.l r1 = r0.f105010j
                boolean r1 = r15.V(r1)
                boolean r3 = r15.F(r10)
                r1 = r1 | r3
                java.lang.Object r3 = r26.D()
                if (r1 != 0) goto L_0x0234
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r3 != r1) goto L_0x023e
            L_0x0234:
                vk.v1$i r3 = new vk.v1$i
                nI.l r1 = r0.f105010j
                r3.<init>(r1, r10)
                r15.u(r3)
            L_0x023e:
                r13 = r3
                nI.a r13 = (nI.C17631a) r13
                r26.P()
                r18 = 0
                r19 = 0
                r17 = 0
                r1 = r10
                r3 = r11
                r22 = r4
                r4 = r12
                r10 = r20
                r11 = r21
                r12 = r22
                r15 = r16
                r16 = r26
                vk.C12169r0.H(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                r26.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0268
                U0.C4895p.R()
            L_0x0268:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vk.v1.m.a(u0.o, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5991o) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements nI.q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pk.n f105014a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f105015b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f105016c;

        n(pk.n nVar, C17642l<? super Boolean, C16807N> lVar, C17631a<C16807N> aVar) {
            this.f105014a = nVar;
            this.f105015b = lVar;
            this.f105016c = aVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(578302046, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.addInStoreToggleItem.<anonymous> (ShoppingListUi.kt:205)");
                }
                v1.o(this.f105014a.a(), this.f105014a.b(), this.f105015b, this.f105016c, (androidx.compose.ui.d) null, mVar, 0, 16);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class o extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ nI.p f105017c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f105018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public o(nI.p pVar, List list) {
            super(1);
            this.f105017c = pVar;
            this.f105018d = list;
        }

        public final Object a(int i10) {
            return this.f105017c.invoke(Integer.valueOf(i10), this.f105018d.get(i10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
    public static final class p extends C17544u implements C17642l<Integer, Object> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f105019c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public p(List list) {
            super(1);
            this.f105019c = list;
        }

        public final Object a(int i10) {
            pk.l lVar = (pk.l) this.f105019c.get(i10);
            return "OnlineItem";
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lu0/o;", "", "it", "LXH/N;", "a", "(Lu0/o;ILU0/m;I)V"}, k = 3, mv = {2, 1, 0})
    public static final class q extends C17544u implements nI.r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f105020c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f105021d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q.a f105022e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f105023f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C5974I f105024g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C15989e f105025h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ T0.c f105026i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C17642l f105027j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C17642l f105028k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public q(List list, int i10, q.a aVar, int i11, C5974I i12, C15989e eVar, T0.c cVar, C17642l lVar, C17642l lVar2) {
            super(4);
            this.f105020c = list;
            this.f105021d = i10;
            this.f105022e = aVar;
            this.f105023f = i11;
            this.f105024g = i12;
            this.f105025h = eVar;
            this.f105026i = cVar;
            this.f105027j = lVar;
            this.f105028k = lVar2;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(u0.C5991o r20, int r21, U0.C4889m r22, int r23) {
            /*
                r19 = this;
                r0 = r19
                r1 = r21
                r15 = r22
                r2 = 1
                r3 = r23 & 6
                if (r3 != 0) goto L_0x0019
                r3 = r20
                boolean r4 = r15.V(r3)
                if (r4 == 0) goto L_0x0015
                r4 = 4
                goto L_0x0016
            L_0x0015:
                r4 = 2
            L_0x0016:
                r4 = r23 | r4
                goto L_0x001d
            L_0x0019:
                r3 = r20
                r4 = r23
            L_0x001d:
                r5 = r23 & 48
                if (r5 != 0) goto L_0x002d
                boolean r5 = r15.d(r1)
                if (r5 == 0) goto L_0x002a
                r5 = 32
                goto L_0x002c
            L_0x002a:
                r5 = 16
            L_0x002c:
                r4 = r4 | r5
            L_0x002d:
                r5 = r4 & 147(0x93, float:2.06E-43)
                r6 = 146(0x92, float:2.05E-43)
                if (r5 != r6) goto L_0x003f
                boolean r5 = r22.l()
                if (r5 != 0) goto L_0x003a
                goto L_0x003f
            L_0x003a:
                r22.L()
                goto L_0x0177
            L_0x003f:
                boolean r5 = U0.C4895p.J()
                if (r5 == 0) goto L_0x004e
                r5 = -1
                java.lang.String r6 = "androidx.compose.foundation.lazy.grid.itemsIndexed.<anonymous> (LazyGridDsl.kt:498)"
                r7 = 1229287273(0x49456f69, float:808694.56)
                U0.C4895p.S(r7, r4, r5, r6)
            L_0x004e:
                java.util.List r4 = r0.f105020c
                java.lang.Object r4 = r4.get(r1)
                r11 = r4
                pk.l r11 = (pk.l) r11
                r4 = 1449931197(0x566c31bd, float:6.4924592E13)
                r15.W(r4)
                U0.I0 r4 = androidx.compose.ui.platform.C5100f0.e()
                java.lang.Object r4 = r15.Q(r4)
                c2.d r4 = (c2.d) r4
                int r5 = r1 + 1
                int r6 = r0.f105021d
                int r5 = r5 % r6
                r6 = 0
                if (r5 != 0) goto L_0x0071
                r5 = r2
                goto L_0x0072
            L_0x0071:
                r5 = r6
            L_0x0072:
                pk.q$a r7 = r0.f105022e
                KJ.c r7 = r7.a()
                int r7 = YH.C16877v.p(r7)
                if (r1 >= r7) goto L_0x0082
                if (r5 != 0) goto L_0x0082
                r12 = r2
                goto L_0x0083
            L_0x0082:
                r12 = r6
            L_0x0083:
                int r5 = r0.f105023f
                if (r1 >= r5) goto L_0x0089
                r13 = r2
                goto L_0x008a
            L_0x0089:
                r13 = r6
            L_0x008a:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                u0.I r2 = r0.f105024g
                vk.F$b r5 = vk.C12134F.f104492b
                vk.F$h r5 = new vk.F$h
                r5.<init>(r11)
                java.lang.String r5 = r5.f104493a
                androidx.compose.ui.d r5 = vk.v1.I(r1, r2, r5, r4)
                r9 = 7
                r10 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r4 = r20
                androidx.compose.ui.d r14 = u0.C5991o.b(r4, r5, r6, r7, r8, r9, r10)
                KJ.e r2 = r0.f105025h
                T0.c r3 = r0.f105026i
                r1 = 46784429(0x2c9dfad, float:2.966268E-37)
                r15.W(r1)
                nI.l r1 = r0.f105027j
                boolean r1 = r15.V(r1)
                java.lang.Object r4 = r22.D()
                if (r1 != 0) goto L_0x00c6
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r4 != r1) goto L_0x00d0
            L_0x00c6:
                vk.v1$r r4 = new vk.v1$r
                nI.l r1 = r0.f105027j
                r4.<init>(r1)
                r15.u(r4)
            L_0x00d0:
                r6 = r4
                nI.l r6 = (nI.C17642l) r6
                r22.P()
                nI.l r7 = r0.f105028k
                r1 = 46797755(0x2ca13bb, float:2.9692557E-37)
                r15.W(r1)
                nI.l r1 = r0.f105027j
                boolean r1 = r15.V(r1)
                java.lang.Object r4 = r22.D()
                if (r1 != 0) goto L_0x00f2
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r4 != r1) goto L_0x00fc
            L_0x00f2:
                vk.v1$s r4 = new vk.v1$s
                nI.l r1 = r0.f105027j
                r4.<init>(r1)
                r15.u(r4)
            L_0x00fc:
                r8 = r4
                nI.l r8 = (nI.C17642l) r8
                r22.P()
                r1 = 46800899(0x2ca2003, float:2.9699606E-37)
                r15.W(r1)
                nI.l r1 = r0.f105027j
                boolean r1 = r15.V(r1)
                java.lang.Object r4 = r22.D()
                if (r1 != 0) goto L_0x011c
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r4 != r1) goto L_0x0126
            L_0x011c:
                vk.v1$t r4 = new vk.v1$t
                nI.l r1 = r0.f105027j
                r4.<init>(r1)
                r15.u(r4)
            L_0x0126:
                r9 = r4
                nI.l r9 = (nI.C17642l) r9
                r22.P()
                r1 = 46805380(0x2ca3184, float:2.9709653E-37)
                r15.W(r1)
                nI.l r1 = r0.f105027j
                boolean r1 = r15.V(r1)
                java.lang.Object r4 = r22.D()
                if (r1 != 0) goto L_0x0146
                U0.m$a r1 = U0.C4889m.f14007a
                java.lang.Object r1 = r1.a()
                if (r4 != r1) goto L_0x0150
            L_0x0146:
                vk.v1$u r4 = new vk.v1$u
                nI.l r1 = r0.f105027j
                r4.<init>(r1)
                r15.u(r4)
            L_0x0150:
                r10 = r4
                nI.l r10 = (nI.C17642l) r10
                r22.P()
                r16 = 0
                r17 = 0
                r18 = 0
                r1 = r11
                r4 = r13
                r5 = r12
                r11 = r14
                r12 = r22
                r13 = r18
                r14 = r16
                r15 = r17
                vk.V0.m(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                r22.P()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0177
                U0.C4895p.R()
            L_0x0177:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: vk.v1.q.a(u0.o, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((C5991o) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class r implements C17642l<pk.l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f105029a;

        r(C17642l<? super C12056w, C16807N> lVar) {
            this.f105029a = lVar;
        }

        public final void a(pk.l lVar) {
            C17542s.j(lVar, "it");
            this.f105029a.invoke(new C12056w.l(new C1(lVar.j(), Interaction$Component.SHOPPING_LIST_DETAILS, true)));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pk.l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class s implements C17642l<pk.l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f105030a;

        s(C17642l<? super C12056w, C16807N> lVar) {
            this.f105030a = lVar;
        }

        public final void a(pk.l lVar) {
            C17542s.j(lVar, "it");
            this.f105030a.invoke(new C12056w.a(lVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pk.l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class t implements C17642l<pk.l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f105031a;

        t(C17642l<? super C12056w, C16807N> lVar) {
            this.f105031a = lVar;
        }

        public final void a(pk.l lVar) {
            C17542s.j(lVar, "it");
            this.f105031a.invoke(new C12056w.c(lVar));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pk.l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class u implements C17642l<pk.l, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<C12056w, C16807N> f105032a;

        u(C17642l<? super C12056w, C16807N> lVar) {
            this.f105032a = lVar;
        }

        public final void a(pk.l lVar) {
            C17542s.j(lVar, "it");
            this.f105032a.invoke(new C12056w.j(lVar.j()));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((pk.l) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class v implements nI.q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pk.o f105033a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f105034b;

        v(pk.o oVar, C17631a<C16807N> aVar) {
            this.f105033a = oVar;
            this.f105034b = aVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-583717813, i10, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.addPlanStoreVisitItem.<anonymous> (ShoppingListUi.kt:321)");
                }
                X0.b(this.f105033a.a(), this.f105034b, (androidx.compose.ui.d) null, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class w implements nI.q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ pk.m f105035a;

        w(pk.m mVar) {
            this.f105035a = mVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            int i11;
            C5991o oVar2 = oVar;
            C17542s.j(oVar2, "$this$item");
            C4889m mVar2 = mVar;
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(oVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1419238439, i11, -1, "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.addTotalPriceItem.<anonymous> (ShoppingListUi.kt:300)");
                }
                x1.b(this.f105035a.d(), this.f105035a.c(), this.f105035a.b(), this.f105035a.e(), this.f105035a.a(), C5991o.b(oVar, androidx.compose.ui.d.f18749a, (N) null, (N) null, (N) null, 7, (Object) null), mVar, 0, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final void A(C5968C c10, pk.o oVar, int i10, C17631a<C16807N> aVar) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(new C12134F.m(oVar).f104493a, new p1(i10), "PlanStoreVisit", c1.c.c(-583717813, true, new v(oVar, aVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c B(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    public static final void C(C5968C c10, pk.s sVar, T0.c cVar, int i10, C5974I i11, C17642l<? super C12056w, C16807N> lVar, C17642l<? super pk.l, C16807N> lVar2, C17642l<? super pk.l, C16807N> lVar3, C17642l<? super pk.l, C16807N> lVar4, C17642l<? super pk.l, C16807N> lVar5) {
        C5968C c11 = c10;
        int i12 = i10;
        C17642l<? super C12056w, C16807N> lVar6 = lVar;
        C17542s.j(c11, "<this>");
        C17542s.j(sVar, "state");
        C17542s.j(cVar, "windowSize");
        C17542s.j(i11, "lazyGridState");
        C17542s.j(lVar6, "onScreenAction");
        C17542s.j(lVar2, "onItemOptionsClick");
        C17542s.j(lVar3, "onRemoveItemClick");
        C17542s.j(lVar4, "onItemClick");
        C17542s.j(lVar5, "onOutOfStockItemSeen");
        if (sVar.s() != null) {
            w(c11, sVar.s(), i12, new j1(lVar6), new m1(lVar6));
        }
        pk.q u10 = sVar.u();
        if (u10 instanceof q.b) {
            q.b bVar = (q.b) u10;
            if (!bVar.a().isEmpty()) {
                C15987c<s.o> v10 = sVar.v();
                pk.n s10 = sVar.s();
                s(c10, bVar, v10, s10 != null ? s10.a() : false, cVar, i10, i11, lVar, lVar2, lVar3, lVar4, lVar5);
            }
        } else if (u10 instanceof q.a) {
            q.a aVar = (q.a) u10;
            if (!aVar.a().isEmpty()) {
                y(c10, aVar, sVar.e(), cVar, i10, i11, lVar, lVar2);
            }
        } else {
            throw new XH.t();
        }
        if (sVar.o() != null) {
            G(c11, sVar.o(), i12);
        }
        if (sVar.t() != null) {
            A(c11, sVar.t(), i12, new n1(lVar6));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N D(C17642l lVar) {
        lVar.invoke(C12056w.d.f103793a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E(C17642l lVar, boolean z10) {
        lVar.invoke(new C12056w.v(z10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C17642l lVar) {
        lVar.invoke(C12056w.n.f103804a);
        return C16807N.f139792a;
    }

    private static final void G(C5968C c10, pk.m mVar, int i10) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(C12134F.i.f104502c.f104493a, new u1(i10), "ListTotalPrice", c1.c.c(-1419238439, true, new w(mVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c H(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    public static final androidx.compose.ui.d I(androidx.compose.ui.d dVar, C5974I i10, String str, c2.d dVar2) {
        Integer num;
        Object obj;
        C17542s.j(dVar, "<this>");
        C17542s.j(i10, "lazyGridState");
        C17542s.j(str, "key");
        C17542s.j(dVar2, "density");
        Iterator it = i10.v().i().iterator();
        while (true) {
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C5987k) obj).getKey(), str)) {
                break;
            }
        }
        C5987k kVar = (C5987k) obj;
        Integer valueOf = kVar != null ? Integer.valueOf(kVar.g()) : null;
        ArrayList arrayList = new ArrayList();
        for (Object next : i10.v().i()) {
            int g10 = ((C5987k) next).g();
            if (valueOf != null && g10 == valueOf.intValue()) {
                arrayList.add(next);
            }
        }
        if (arrayList.size() == 1) {
            return dVar;
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Integer valueOf2 = Integer.valueOf(c2.r.g(((C5987k) it2.next()).a()));
            loop2:
            while (true) {
                num = valueOf2;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop2;
                    }
                    valueOf2 = Integer.valueOf(c2.r.g(((C5987k) it2.next()).a()));
                    if (num.compareTo(valueOf2) < 0) {
                    }
                }
            }
        }
        return J.i(dVar, num != null ? dVar2.H(num.intValue()) : c2.h.f23031b.c());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(java.lang.String r32, boolean r33, androidx.compose.ui.d r34, U0.C4889m r35, int r36, int r37) {
        /*
            r2 = r33
            r4 = r36
            r0 = 2
            r1 = 4
            r3 = 6
            r5 = -29354136(0xfffffffffe401768, float:-6.3833327E37)
            r6 = r35
            U0.m r6 = r6.k(r5)
            r7 = 1
            r8 = r37 & 1
            if (r8 == 0) goto L_0x001a
            r8 = r4 | 6
            r15 = r32
            goto L_0x002c
        L_0x001a:
            r8 = r4 & 6
            r15 = r32
            if (r8 != 0) goto L_0x002b
            boolean r8 = r6.V(r15)
            if (r8 == 0) goto L_0x0028
            r8 = r1
            goto L_0x0029
        L_0x0028:
            r8 = r0
        L_0x0029:
            r8 = r8 | r4
            goto L_0x002c
        L_0x002b:
            r8 = r4
        L_0x002c:
            r0 = r37 & 2
            if (r0 == 0) goto L_0x0033
            r8 = r8 | 48
            goto L_0x0043
        L_0x0033:
            r0 = r4 & 48
            if (r0 != 0) goto L_0x0043
            boolean r0 = r6.b(r2)
            if (r0 == 0) goto L_0x0040
            r0 = 32
            goto L_0x0042
        L_0x0040:
            r0 = 16
        L_0x0042:
            r8 = r8 | r0
        L_0x0043:
            r0 = r37 & 4
            if (r0 == 0) goto L_0x004d
            r8 = r8 | 384(0x180, float:5.38E-43)
        L_0x0049:
            r1 = r34
        L_0x004b:
            r9 = r8
            goto L_0x0060
        L_0x004d:
            r1 = r4 & 384(0x180, float:5.38E-43)
            if (r1 != 0) goto L_0x0049
            r1 = r34
            boolean r9 = r6.V(r1)
            if (r9 == 0) goto L_0x005c
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r9 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r8 = r8 | r9
            goto L_0x004b
        L_0x0060:
            r8 = r9 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r8 != r10) goto L_0x0074
            boolean r8 = r6.l()
            if (r8 != 0) goto L_0x006d
            goto L_0x0074
        L_0x006d:
            r6.L()
            r3 = r1
            r1 = r6
            goto L_0x01a3
        L_0x0074:
            if (r0 == 0) goto L_0x0079
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            goto L_0x007a
        L_0x0079:
            r0 = r1
        L_0x007a:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0086
            r1 = -1
            java.lang.String r8 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.DepartmentNameItem (ShoppingListUi.kt:333)"
            U0.C4895p.S(r5, r9, r1, r8)
        L_0x0086:
            r1 = 0
            r5 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.h(r0, r1, r7, r5)
            tK.v r8 = tK.C18030v.f147664a
            int r10 = tK.C18030v.f147665b
            tK.h r11 = r8.a(r6, r10)
            long r17 = r11.k0()
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r11 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            androidx.compose.foundation.layout.d r12 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r12 = r12.g()
            i1.c$a r13 = i1.C5437c.f24302a
            i1.c$b r13 = r13.k()
            r14 = 0
            E1.I r12 = androidx.compose.foundation.layout.C5080k.a(r12, r13, r6, r14)
            int r13 = U0.C4883j.a(r6, r14)
            U0.y r3 = r6.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r6, r11)
            G1.g$a r17 = G1.C4504g.f6515W
            nI.a r14 = r17.a()
            U0.f r18 = r6.m()
            if (r18 != 0) goto L_0x00ce
            U0.C4883j.c()
        L_0x00ce:
            r6.I()
            boolean r18 = r6.i()
            if (r18 == 0) goto L_0x00db
            r6.p(r14)
            goto L_0x00de
        L_0x00db:
            r6.t()
        L_0x00de:
            U0.m r14 = U0.F1.a(r6)
            nI.p r1 = r17.c()
            U0.F1.c(r14, r12, r1)
            nI.p r1 = r17.e()
            U0.F1.c(r14, r3, r1)
            nI.p r1 = r17.b()
            boolean r3 = r14.i()
            if (r3 != 0) goto L_0x0108
            java.lang.Object r3 = r14.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r12)
            if (r3 != 0) goto L_0x0116
        L_0x0108:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r14.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r13)
            r14.w(r3, r1)
        L_0x0116:
            nI.p r1 = r17.d()
            U0.F1.c(r14, r11, r1)
            s0.h r1 = s0.C5862h.f28810a
            r1 = 1951707105(0x7454afe1, float:6.740321E31)
            r6.W(r1)
            if (r2 == 0) goto L_0x014f
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r3 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r3, r7, r5)
            r3 = 12
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r17 = androidx.compose.foundation.layout.J.i(r1, r3)
            tK.h r1 = r8.a(r6, r10)
            long r18 = r1.l0()
            r21 = 2
            r22 = 0
            r20 = 0
            androidx.compose.ui.d r1 = androidx.compose.foundation.b.d(r17, r18, r20, r21, r22)
            r3 = 0
            s0.C5844O.a(r1, r6, r3)
        L_0x014f:
            r6.P()
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            r3 = 24
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.J.i(r1, r3)
            r5 = 6
            s0.C5844O.a(r3, r6, r5)
            TC.b$b$b r7 = TC.C13679b.C2857b.C2858b.f116684a
            androidx.compose.ui.d r8 = TC.e.i(r1)
            r1 = r9 & 14
            r29 = r1 | 48
            r30 = 0
            r31 = 262136(0x3fff8, float:3.67331E-40)
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r1 = 0
            r15 = r1
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
            r1 = r6
            r6 = r32
            r28 = r1
            SC.C13607l.j(r6, r7, r8, r9, r11, r13, r14, r15, r16, r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            r1.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x01a2
            U0.C4895p.R()
        L_0x01a2:
            r3 = r0
        L_0x01a3:
            U0.Y0 r6 = r1.n()
            if (r6 == 0) goto L_0x01ba
            vk.k1 r7 = new vk.k1
            r0 = r7
            r1 = r32
            r2 = r33
            r4 = r36
            r5 = r37
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.v1.m(java.lang.String, boolean, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N n(String str, boolean z10, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        m(str, z10, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void o(boolean r17, java.lang.String r18, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r19, nI.C17631a<XH.C16807N> r20, androidx.compose.ui.d r21, U0.C4889m r22, int r23, int r24) {
        /*
            r6 = r23
            r0 = -448375662(0xffffffffe5465492, float:-5.853679E22)
            r1 = r22
            U0.m r1 = r1.k(r0)
            r2 = r24 & 1
            if (r2 == 0) goto L_0x0015
            r2 = r6 | 6
            r3 = r2
            r2 = r17
            goto L_0x0029
        L_0x0015:
            r2 = r6 & 6
            if (r2 != 0) goto L_0x0026
            r2 = r17
            boolean r3 = r1.b(r2)
            if (r3 == 0) goto L_0x0023
            r3 = 4
            goto L_0x0024
        L_0x0023:
            r3 = 2
        L_0x0024:
            r3 = r3 | r6
            goto L_0x0029
        L_0x0026:
            r2 = r17
            r3 = r6
        L_0x0029:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0032
            r3 = r3 | 48
        L_0x002f:
            r4 = r18
            goto L_0x0044
        L_0x0032:
            r4 = r6 & 48
            if (r4 != 0) goto L_0x002f
            r4 = r18
            boolean r5 = r1.V(r4)
            if (r5 == 0) goto L_0x0041
            r5 = 32
            goto L_0x0043
        L_0x0041:
            r5 = 16
        L_0x0043:
            r3 = r3 | r5
        L_0x0044:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x004d
            r3 = r3 | 384(0x180, float:5.38E-43)
        L_0x004a:
            r5 = r19
            goto L_0x005f
        L_0x004d:
            r5 = r6 & 384(0x180, float:5.38E-43)
            if (r5 != 0) goto L_0x004a
            r5 = r19
            boolean r7 = r1.F(r5)
            if (r7 == 0) goto L_0x005c
            r7 = 256(0x100, float:3.59E-43)
            goto L_0x005e
        L_0x005c:
            r7 = 128(0x80, float:1.794E-43)
        L_0x005e:
            r3 = r3 | r7
        L_0x005f:
            r7 = r24 & 8
            if (r7 == 0) goto L_0x0068
            r3 = r3 | 3072(0xc00, float:4.305E-42)
            r15 = r20
            goto L_0x007a
        L_0x0068:
            r7 = r6 & 3072(0xc00, float:4.305E-42)
            r15 = r20
            if (r7 != 0) goto L_0x007a
            boolean r7 = r1.F(r15)
            if (r7 == 0) goto L_0x0077
            r7 = 2048(0x800, float:2.87E-42)
            goto L_0x0079
        L_0x0077:
            r7 = 1024(0x400, float:1.435E-42)
        L_0x0079:
            r3 = r3 | r7
        L_0x007a:
            r7 = r24 & 16
            if (r7 == 0) goto L_0x0083
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L_0x0080:
            r8 = r21
            goto L_0x0095
        L_0x0083:
            r8 = r6 & 24576(0x6000, float:3.4438E-41)
            if (r8 != 0) goto L_0x0080
            r8 = r21
            boolean r9 = r1.V(r8)
            if (r9 == 0) goto L_0x0092
            r9 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0094
        L_0x0092:
            r9 = 8192(0x2000, float:1.14794E-41)
        L_0x0094:
            r3 = r3 | r9
        L_0x0095:
            r9 = r3 & 9363(0x2493, float:1.312E-41)
            r10 = 9362(0x2492, float:1.3119E-41)
            if (r9 != r10) goto L_0x00a6
            boolean r9 = r1.l()
            if (r9 != 0) goto L_0x00a2
            goto L_0x00a6
        L_0x00a2:
            r1.L()
            goto L_0x00ea
        L_0x00a6:
            if (r7 == 0) goto L_0x00ad
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r16 = r7
            goto L_0x00af
        L_0x00ad:
            r16 = r8
        L_0x00af:
            boolean r7 = U0.C4895p.J()
            if (r7 == 0) goto L_0x00bb
            r7 = -1
            java.lang.String r8 = "com.ingka.ikea.app.shoppinglist.listdetails.ui.composables.InStoreToggleItem (ShoppingListUi.kt:363)"
            U0.C4895p.S(r0, r3, r7, r8)
        L_0x00bb:
            int r0 = r3 >> 3
            r0 = r0 & 14
            int r7 = r3 << 3
            r7 = r7 & 112(0x70, float:1.57E-43)
            r0 = r0 | r7
            r7 = r3 & 896(0x380, float:1.256E-42)
            r0 = r0 | r7
            r7 = r3 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r7
            r7 = 57344(0xe000, float:8.0356E-41)
            r3 = r3 & r7
            r13 = r0 | r3
            r14 = 0
            r7 = r18
            r8 = r17
            r9 = r19
            r10 = r20
            r11 = r16
            r12 = r1
            vk.C12131C.b(r7, r8, r9, r10, r11, r12, r13, r14)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00e8
            U0.C4895p.R()
        L_0x00e8:
            r8 = r16
        L_0x00ea:
            U0.Y0 r9 = r1.n()
            if (r9 == 0) goto L_0x0106
            vk.l1 r10 = new vk.l1
            r0 = r10
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r8
            r6 = r23
            r7 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r9.a(r10)
        L_0x0106:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vk.v1.o(boolean, java.lang.String, nI.l, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N p(boolean z10, String str, C17642l lVar, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        o(z10, str, lVar, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void s(C5968C c10, q.b bVar, C15987c<s.o> cVar, boolean z10, T0.c cVar2, int i10, C5974I i11, C17642l<? super C12056w, C16807N> lVar, C17642l<? super pk.l, C16807N> lVar2, C17642l<? super pk.l, C16807N> lVar3, C17642l<? super pk.l, C16807N> lVar4, C17642l<? super pk.l, C16807N> lVar5) {
        int i12 = i10;
        int i13 = 0;
        for (T next : bVar.a()) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C16877v.x();
            }
            pk.i iVar = (pk.i) next;
            if (!iVar.b().isEmpty()) {
                C12134F.b bVar2 = C12134F.f104492b;
                c10.d(new C12134F.d(iVar.a()).f104493a, new r1(i12), "DepartmentName", c1.c.c(841778979, true, new a(iVar, i13)));
                C15987c<pk.l> b10 = iVar.b();
                s1 s1Var = new s1();
                t1 t1Var = new t1(i12);
                int size = b10.size();
                j jVar = new j(s1Var, b10);
                k kVar = new k(t1Var, b10);
                l lVar6 = new l(b10);
                m mVar = r6;
                m mVar2 = new m(b10, i11, lVar5, cVar, cVar2, iVar, z10, lVar, lVar2, lVar3, lVar4);
                c10.h(size, jVar, kVar, lVar6, c1.c.c(1229287273, true, mVar));
            }
            i12 = i10;
            i13 = i14;
        }
    }

    /* access modifiers changed from: private */
    public static final C5979c t(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    /* access modifiers changed from: private */
    public static final Object u(int i10, pk.l lVar) {
        C17542s.j(lVar, "product");
        C12134F.b bVar = C12134F.f104492b;
        return new C12134F.h(lVar).f104493a;
    }

    /* access modifiers changed from: private */
    public static final C5979c v(int i10, C5993q qVar, int i11, pk.l lVar) {
        C17542s.j(qVar, "$this$itemsIndexed");
        C17542s.j(lVar, "<unused var>");
        return C5979c.a(C5972G.a(i10));
    }

    private static final void w(C5968C c10, pk.n nVar, int i10, C17631a<C16807N> aVar, C17642l<? super Boolean, C16807N> lVar) {
        C12134F.b bVar = C12134F.f104492b;
        c10.d(C12134F.e.f104498c.f104493a, new q1(i10), "InStoreToggle", c1.c.c(578302046, true, new n(nVar, lVar, aVar)));
    }

    /* access modifiers changed from: private */
    public static final C5979c x(int i10, C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(i10));
    }

    private static final void y(C5968C c10, q.a aVar, C15989e<String> eVar, T0.c cVar, int i10, C5974I i11, C17642l<? super C12056w, C16807N> lVar, C17642l<? super pk.l, C16807N> lVar2) {
        int size = (aVar.a().size() % i10 != 0 ? (aVar.a().size() % i10 != 0 ? (aVar.a().size() / i10) + 1 : aVar.a().size() / i10) * i10 : aVar.a().size()) - i10;
        C15987c<pk.l> a10 = aVar.a();
        c10.h(a10.size(), new o(new o1(), a10), (nI.p<? super C5993q, ? super Integer, C5979c>) null, new p(a10), c1.c.c(1229287273, true, new q(a10, i10, aVar, size, i11, eVar, cVar, lVar, lVar2)));
    }

    /* access modifiers changed from: private */
    public static final Object z(int i10, pk.l lVar) {
        C17542s.j(lVar, "item");
        C12134F.b bVar = C12134F.f104492b;
        return new C12134F.h(lVar).f104493a;
    }
}
