package pk;

import Ae.k;
import De.a;
import EB.C12832d;
import FB.C12860a;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15989e;
import Nd.c;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import YH.C16877v;
import YH.X;
import aA.C13909a;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ListDetails;
import com.sugarcube.app.base.data.source.CatalogRepository;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gB.C14500b;
import gB.C14503e;
import gB.C14505g;
import jB.C14613b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import lk.C11547a;
import mk.C11577a;
import nI.C17642l;
import pk.C11723b;
import pk.C11724c;
import pk.j;
import pk.q;
import pk.r;
import pk.s;
import pu.C11780d;
import qk.C11788a;
import qk.C11789b;
import qk.C11790c;
import qk.C11792e;
import qk.C11793f;
import qk.C11794g;
import qk.i;
import qk.j;
import rk.C11829b;
import sk.C11860c;
import sp.C11879a;
import x4.O;

@Metadata(d1 = {"\u0000ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B©\u0001\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+¢\u0006\u0004\b-\u0010.J\u0017\u00102\u001a\u0002012\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J-\u0010=\u001a\u0002012\u0006\u00107\u001a\u0002062\f\u0010:\u001a\b\u0012\u0004\u0012\u000209082\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u0002012\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u000201H\u0002¢\u0006\u0004\bA\u00105J\u000f\u0010B\u001a\u000201H\u0002¢\u0006\u0004\bB\u00105J\u000f\u0010C\u001a\u000201H\u0002¢\u0006\u0004\bC\u00105J\u000f\u0010D\u001a\u000201H\u0002¢\u0006\u0004\bD\u00105J\u000f\u0010E\u001a\u000201H\u0002¢\u0006\u0004\bE\u00105J\u000f\u0010F\u001a\u000201H\u0002¢\u0006\u0004\bF\u00105J\u0017\u0010H\u001a\u0002012\u0006\u0010G\u001a\u000206H\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u000201H\u0002¢\u0006\u0004\bJ\u00105J\u0017\u0010M\u001a\u0002012\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u000201H\u0002¢\u0006\u0004\bO\u00105J\u000f\u0010P\u001a\u000201H\u0002¢\u0006\u0004\bP\u00105J\u000f\u0010Q\u001a\u000201H\u0002¢\u0006\u0004\bQ\u00105J\u0017\u0010S\u001a\u0002012\u0006\u0010R\u001a\u00020KH\u0002¢\u0006\u0004\bS\u0010NJ\u000f\u0010T\u001a\u000201H\u0002¢\u0006\u0004\bT\u00105J\u0017\u0010U\u001a\u0002012\u0006\u0010R\u001a\u00020KH\u0002¢\u0006\u0004\bU\u0010NJ\u0017\u0010V\u001a\u0002012\u0006\u0010R\u001a\u00020KH\u0002¢\u0006\u0004\bV\u0010NJ\u001f\u0010X\u001a\u0002012\u0006\u0010R\u001a\u00020K2\u0006\u0010W\u001a\u00020KH\u0002¢\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001a\u0002012\u0006\u0010Z\u001a\u00020KH\u0002¢\u0006\u0004\b[\u0010NJ \u0010_\u001a\u00020^2\u0006\u0010R\u001a\u00020K2\u0006\u0010]\u001a\u00020\\H@¢\u0006\u0004\b_\u0010`J\u001f\u0010a\u001a\u0002012\u0006\u0010R\u001a\u00020K2\u0006\u0010]\u001a\u00020\\H\u0002¢\u0006\u0004\ba\u0010bJ\u0017\u0010c\u001a\u0002012\u0006\u0010R\u001a\u00020KH\u0002¢\u0006\u0004\bc\u0010NJ\u001f\u0010f\u001a\u0002012\u0006\u0010R\u001a\u00020K2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u0002012\u0006\u0010R\u001a\u00020KH\u0002¢\u0006\u0004\bh\u0010NJ\u0017\u0010i\u001a\u0002012\u0006\u0010R\u001a\u00020KH\u0002¢\u0006\u0004\bi\u0010NJ\u000f\u0010j\u001a\u000201H\u0002¢\u0006\u0004\bj\u00105J\u000f\u0010k\u001a\u000201H\u0002¢\u0006\u0004\bk\u00105J\u000f\u0010l\u001a\u000201H\u0002¢\u0006\u0004\bl\u00105J#\u0010o\u001a\u0002012\u0012\u0010n\u001a\u000e\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u0002010mH\u0002¢\u0006\u0004\bo\u0010pJ\u0017\u0010q\u001a\u0002012\u0006\u00100\u001a\u00020\u0003H\u0016¢\u0006\u0004\bq\u0010rR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u0014\u001a\u00020\u00138\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0001R\u0016\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u001a\u001a\u00020\u00198\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\u001e\u001a\u00020\u001d8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010\"\u001a\u00020!8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010$\u001a\u00020#8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010&\u001a\u00020%8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010*\u001a\u00020)8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0016\u0010,\u001a\u00020+8\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001e\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020\u00040\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R&\u0010¦\u0001\u001a\t\u0012\u0004\u0012\u00020\u00040¡\u00018\u0016X\u0004¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R \u0010¨\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u0001060\u00018\u0002X\u0004¢\u0006\b\n\u0006\b§\u0001\u0010\u0001R\u001e\u0010¬\u0001\u001a\t\u0012\u0004\u0012\u0002060©\u00018\u0002X\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001e\u0010®\u0001\u001a\t\u0012\u0004\u0012\u00020;0\u00018\u0002X\u0004¢\u0006\b\n\u0006\b­\u0001\u0010\u0001R\u0013\u0010W\u001a\u00020K8F¢\u0006\b\u001a\u0006\b¯\u0001\u0010°\u0001¨\u0006±\u0001"}, d2 = {"Lpk/v;", "Landroidx/lifecycle/f0;", "Lsp/a;", "Lpk/c;", "Lpk/s;", "Landroidx/lifecycle/U;", "savedStateHandle", "LFB/a;", "localStoreSelectionRepository", "Lpk/a;", "contentItemsMapper", "LjB/b;", "shoppingListRepository", "Lqk/c;", "copyAllItemsToCartUseCase", "Lqk/j;", "shareListUseCase", "Lqk/i;", "shareItemUseCase", "Lpk/b;", "removeProductHelper", "Lqk/b;", "checkWayfindingAvailabilityUseCase", "Lqk/f;", "getListProductsUseCase", "Lqk/g;", "notifyWhenBackInStockUseCase", "Lqk/e;", "getListPriceUseCase", "Lqk/a;", "addItemToCartUseCase", "Llk/a;", "shoppingListDetailsAnalytics", "LaA/a;", "sessionManager", "Lpu/d;", "storeModeIntegration", "Lmk/a;", "shoppingListRecommendationsOrchestrator", "LNd/c;", "abTesting", "Lsk/c;", "similarItemsOrchestrator", "Lrk/b;", "similarItemsAnalytics", "<init>", "(Landroidx/lifecycle/U;LFB/a;Lpk/a;LjB/b;Lqk/c;Lqk/j;Lqk/i;Lpk/b;Lqk/b;Lqk/f;Lqk/g;Lqk/e;Lqk/a;Llk/a;LaA/a;Lpu/d;Lmk/a;LNd/c;Lsk/c;Lrk/b;)V", "Lpk/c$a;", "action", "LXH/N;", "n0", "(Lpk/c$a;)V", "g0", "()V", "", "inStoreModeEnabled", "", "Lpk/i;", "items", "Lpk/r;", "listMode", "i0", "(ZLjava/util/List;Lpk/r;)V", "d0", "(Lpk/r;)V", "h0", "e0", "l0", "m0", "c0", "r0", "currentlyEnabled", "A0", "(Z)V", "z0", "", "newName", "w0", "(Ljava/lang/String;)V", "Z", "v0", "X", "itemNo", "V", "y0", "x0", "s0", "listId", "p0", "(Ljava/lang/String;Ljava/lang/String;)V", "itemName", "q0", "LAe/k;", "actionType", "Lpk/s$i;", "Y", "(Ljava/lang/String;LAe/k;LdI/e;)Ljava/lang/Object;", "a0", "(Ljava/lang/String;LAe/k;)V", "b0", "", "newQuantity", "E0", "(Ljava/lang/String;I)V", "o0", "D0", "W", "B0", "j0", "Lkotlin/Function1;", "body", "C0", "(LnI/l;)V", "t0", "(Lpk/c;)V", "m", "LFB/a;", "n", "Lpk/a;", "o", "LjB/b;", "p", "Lqk/c;", "q", "Lqk/j;", "r", "Lqk/i;", "s", "Lpk/b;", "t", "Lqk/b;", "u", "Lqk/f;", "v", "Lqk/g;", "w", "Lqk/e;", "x", "Lqk/a;", "y", "Llk/a;", "z", "LaA/a;", "A", "Lpu/d;", "B", "Lmk/a;", "C", "LNd/c;", "D", "Lsk/c;", "E", "Lrk/b;", "Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails;", "F", "Lcom/ingka/ikea/app/shoppinglist/navigation/ShoppingListsRoutes$ListDetails;", "route", "LTJ/B;", "G", "LTJ/B;", "_state", "LTJ/P;", "H", "LTJ/P;", "getState", "()LTJ/P;", "state", "I", "_toggleOnlineOrStoreModeFlow", "LTJ/g;", "J", "LTJ/g;", "toggleOnlineOrStoreModeFlow", "K", "toggleListOrInspirationFlow", "f0", "()Ljava/lang/String;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v extends f0 implements C11879a<C11724c, s> {
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final C11780d f101135A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final C11577a f101136B;

    /* renamed from: C  reason: collision with root package name */
    private final c f101137C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final C11860c f101138D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final C11829b f101139E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public final ShoppingListsRoutes$ListDetails f101140F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public final C16505B<s> f101141G;

    /* renamed from: H  reason: collision with root package name */
    private final C16519P<s> f101142H;
    /* access modifiers changed from: private */

    /* renamed from: I  reason: collision with root package name */
    public final C16505B<Boolean> f101143I;
    /* access modifiers changed from: private */

    /* renamed from: J  reason: collision with root package name */
    public final C16532g<Boolean> f101144J;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public final C16505B<r> f101145K = C16521S.a(r.b.f101025a);

    /* renamed from: m  reason: collision with root package name */
    private final C12860a f101146m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C11722a f101147n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C14613b f101148o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C11790c f101149p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final j f101150q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final i f101151r;

    /* renamed from: s  reason: collision with root package name */
    private final C11723b f101152s;

    /* renamed from: t  reason: collision with root package name */
    private final C11789b f101153t;

    /* renamed from: u  reason: collision with root package name */
    private final C11793f f101154u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C11794g f101155v;

    /* renamed from: w  reason: collision with root package name */
    private final C11792e f101156w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final C11788a f101157x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final C11547a f101158y;

    /* renamed from: z  reason: collision with root package name */
    private final C13909a f101159z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$onAction$18", f = "ShoppingListDetailsViewModel.kt", l = {275}, m = "invokeSuspend")
    static final class A extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101160c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f101161d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        A(v vVar, C17164e<? super A> eVar) {
            super(2, eVar);
            this.f101161d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new A(this.f101161d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((A) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101160c;
            if (i10 == 0) {
                XH.y.b(obj);
                C11860c O10 = this.f101161d.f101138D;
                this.f101160c = 1;
                if (O10.v(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"pk/v$B", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class B extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f101162a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public B(N.a aVar, v vVar) {
            super(aVar);
            this.f101162a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            s.j.a aVar;
            C16505B S10 = this.f101162a.f101141G;
            do {
                value = S10.getValue();
                aVar = r4;
                s.j.a aVar2 = new s.j.a(th2);
            } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, aVar, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147418047, (Object) null)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$renameList$3", f = "ShoppingListDetailsViewModel.kt", l = {515}, m = "invokeSuspend")
    static final class C extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101163c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f101164d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f101165e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C(v vVar, String str, C17164e<? super C> eVar) {
            super(2, eVar);
            this.f101164d = vVar;
            this.f101165e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C(this.f101164d, this.f101165e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f101163c;
            if (i10 == 0) {
                XH.y.b(obj);
                C14613b M10 = this.f101164d.f101148o;
                String f02 = this.f101164d.f0();
                String str = this.f101165e;
                this.f101163c = 1;
                if (M10.c(f02, str, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B S10 = this.f101164d.f101141G;
            do {
                value = S10.getValue();
            } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147418047, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$shareItem$2", f = "ShoppingListDetailsViewModel.kt", l = {599}, m = "invokeSuspend")
    static final class D extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101166c;

        /* renamed from: d  reason: collision with root package name */
        Object f101167d;

        /* renamed from: e  reason: collision with root package name */
        Object f101168e;

        /* renamed from: f  reason: collision with root package name */
        Object f101169f;

        /* renamed from: g  reason: collision with root package name */
        Object f101170g;

        /* renamed from: h  reason: collision with root package name */
        int f101171h;

        /* renamed from: i  reason: collision with root package name */
        int f101172i;

        /* renamed from: j  reason: collision with root package name */
        int f101173j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ v f101174k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f101175l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        D(v vVar, String str, C17164e<? super D> eVar) {
            super(2, eVar);
            this.f101174k = vVar;
            this.f101175l = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new D(this.f101174k, this.f101175l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((D) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0067 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00b3  */
        public final java.lang.Object invokeSuspend(java.lang.Object r46) {
            /*
                r45 = this;
                r0 = r45
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f101173j
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r4) goto L_0x0029
                int r2 = r0.f101171h
                java.lang.Object r5 = r0.f101170g
                pk.s r5 = (pk.s) r5
                java.lang.Object r6 = r0.f101169f
                java.lang.Object r7 = r0.f101168e
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r0.f101167d
                pk.v r8 = (pk.v) r8
                java.lang.Object r9 = r0.f101166c
                TJ.B r9 = (TJ.C16505B) r9
                XH.y.b(r46)
                r10 = r46
            L_0x0027:
                r11 = r5
                goto L_0x0068
            L_0x0029:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0031:
                XH.y.b(r46)
                pk.v r2 = r0.f101174k
                TJ.B r2 = r2.f101141G
                pk.v r5 = r0.f101174k
                java.lang.String r6 = r0.f101175l
                r9 = r2
                r2 = r3
                r8 = r5
                r7 = r6
            L_0x0042:
                java.lang.Object r6 = r9.getValue()
                r5 = r6
                pk.s r5 = (pk.s) r5
                qk.i r10 = r8.f101151r
                java.lang.String r11 = r8.f0()
                r0.f101166c = r9
                r0.f101167d = r8
                r0.f101168e = r7
                r0.f101169f = r6
                r0.f101170g = r5
                r0.f101171h = r2
                r0.f101172i = r3
                r0.f101173j = r4
                java.lang.Object r10 = r10.b(r7, r11, r0)
                if (r10 != r1) goto L_0x0027
                return r1
            L_0x0068:
                r32 = r10
                pk.s$l r32 = (pk.s.l) r32
                r43 = 2146435007(0x7fefffbf, float:NaN)
                r44 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                pk.s r5 = pk.s.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
                boolean r5 = r9.e(r6, r5)
                if (r5 == 0) goto L_0x0042
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pk.v.D.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$shareList$2", f = "ShoppingListDetailsViewModel.kt", l = {587}, m = "invokeSuspend")
    static final class E extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101176c;

        /* renamed from: d  reason: collision with root package name */
        Object f101177d;

        /* renamed from: e  reason: collision with root package name */
        Object f101178e;

        /* renamed from: f  reason: collision with root package name */
        Object f101179f;

        /* renamed from: g  reason: collision with root package name */
        int f101180g;

        /* renamed from: h  reason: collision with root package name */
        int f101181h;

        /* renamed from: i  reason: collision with root package name */
        int f101182i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ v f101183j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        E(v vVar, C17164e<? super E> eVar) {
            super(2, eVar);
            this.f101183j = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new E(this.f101183j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((E) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x005e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00a9  */
        public final java.lang.Object invokeSuspend(java.lang.Object r45) {
            /*
                r44 = this;
                r0 = r44
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f101182i
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x002d
                if (r2 != r4) goto L_0x0025
                int r2 = r0.f101180g
                java.lang.Object r5 = r0.f101179f
                pk.s r5 = (pk.s) r5
                java.lang.Object r6 = r0.f101178e
                java.lang.Object r7 = r0.f101177d
                pk.v r7 = (pk.v) r7
                java.lang.Object r8 = r0.f101176c
                TJ.B r8 = (TJ.C16505B) r8
                XH.y.b(r45)
                r9 = r45
            L_0x0023:
                r10 = r5
                goto L_0x005f
            L_0x0025:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002d:
                XH.y.b(r45)
                pk.v r2 = r0.f101183j
                TJ.B r2 = r2.f101141G
                pk.v r5 = r0.f101183j
                r8 = r2
                r2 = r3
                r7 = r5
            L_0x003b:
                java.lang.Object r6 = r8.getValue()
                r5 = r6
                pk.s r5 = (pk.s) r5
                qk.j r9 = r7.f101150q
                java.lang.String r10 = r7.f0()
                r0.f101176c = r8
                r0.f101177d = r7
                r0.f101178e = r6
                r0.f101179f = r5
                r0.f101180g = r2
                r0.f101181h = r3
                r0.f101182i = r4
                java.lang.Object r9 = r9.b(r10, r0)
                if (r9 != r1) goto L_0x0023
                return r1
            L_0x005f:
                r30 = r9
                pk.s$m r30 = (pk.s.m) r30
                r42 = 2146959295(0x7ff7ffbf, float:NaN)
                r43 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                pk.s r5 = pk.s.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
                boolean r5 = r8.e(r6, r5)
                if (r5 == 0) goto L_0x003b
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pk.v.E.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgB/e;", "list", "LXH/N;", "<anonymous>", "(LgB/e;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$showRenameList$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class F extends l implements nI.p<C14503e, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101184c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101185d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101186e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        F(v vVar, C17164e<? super F> eVar) {
            super(2, eVar);
            this.f101186e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            F f10 = new F(this.f101186e, eVar);
            f10.f101185d = obj;
            return f10;
        }

        /* renamed from: i */
        public final Object invoke(C14503e eVar, C17164e<? super C16807N> eVar2) {
            return ((F) create(eVar, eVar2)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            s.j.b bVar;
            C17187b.f();
            if (this.f101184c == 0) {
                XH.y.b(obj);
                C14503e eVar = (C14503e) this.f101185d;
                C16505B S10 = this.f101186e.f101141G;
                do {
                    value = S10.getValue();
                    bVar = r5;
                    s.j.b bVar2 = new s.j.b(eVar.b());
                } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, bVar, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147418111, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LEB/d;", "store", "LXH/N;", "<anonymous>", "(LEB/d;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$toggleInStoreMode$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class G extends l implements nI.p<C12832d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101187c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101188d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101189e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f101190f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        G(v vVar, boolean z10, C17164e<? super G> eVar) {
            super(2, eVar);
            this.f101189e = vVar;
            this.f101190f = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            G g10 = new G(this.f101189e, this.f101190f, eVar);
            g10.f101188d = obj;
            return g10;
        }

        /* renamed from: i */
        public final Object invoke(C12832d dVar, C17164e<? super C16807N> eVar) {
            return ((G) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f101187c == 0) {
                XH.y.b(obj);
                C12832d dVar = (C12832d) this.f101188d;
                if (dVar == null || dVar.getName().length() == 0) {
                    C16505B S10 = this.f101189e.f101141G;
                    do {
                        value = S10.getValue();
                    } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, s.k.f101106a, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2113929215, (Object) null)));
                } else {
                    boolean z10 = !this.f101190f;
                    this.f101189e.f101143I.setValue(b.a(z10));
                    this.f101189e.f101158y.c(z10);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$toggleOnlineOrStoreModeFlow$1", f = "ShoppingListDetailsViewModel.kt", l = {97, 99, 102}, m = "invokeSuspend")
    static final class H extends l implements nI.p<C16533h<? super Boolean>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f101191c;

        /* renamed from: d  reason: collision with root package name */
        boolean f101192d;

        /* renamed from: e  reason: collision with root package name */
        boolean f101193e;

        /* renamed from: f  reason: collision with root package name */
        int f101194f;

        /* renamed from: g  reason: collision with root package name */
        private /* synthetic */ Object f101195g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ v f101196h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        H(v vVar, C17164e<? super H> eVar) {
            super(2, eVar);
            this.f101196h = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            H h10 = new H(this.f101196h, eVar);
            h10.f101195g = obj;
            return h10;
        }

        public final Object invoke(C16533h<? super Boolean> hVar, C17164e<? super C16807N> eVar) {
            return ((H) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r5.f101194f
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r4) goto L_0x0022
                if (r1 == r3) goto L_0x001a
                if (r1 != r2) goto L_0x0012
                goto L_0x001a
            L_0x0012:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L_0x001a:
                java.lang.Object r0 = r5.f101195g
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r6)
                goto L_0x0083
            L_0x0022:
                java.lang.Object r1 = r5.f101195g
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r6)
                goto L_0x0047
            L_0x002a:
                XH.y.b(r6)
                java.lang.Object r6 = r5.f101195g
                r1 = r6
                TJ.h r1 = (TJ.C16533h) r1
                pk.v r6 = r5.f101196h
                pu.d r6 = r6.f101135A
                TJ.g r6 = r6.isEnabled()
                r5.f101195g = r1
                r5.f101194f = r4
                java.lang.Object r6 = TJ.C16534i.B(r6, r5)
                if (r6 != r0) goto L_0x0047
                return r0
            L_0x0047:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != r4) goto L_0x0062
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.b.a(r4)
                r5.f101195g = r1
                r5.f101191c = r6
                r5.f101192d = r6
                r5.f101194f = r3
                java.lang.Object r6 = r1.emit(r2, r5)
                if (r6 != r0) goto L_0x0083
                return r0
            L_0x0062:
                if (r6 != 0) goto L_0x0086
                pk.v r3 = r5.f101196h
                com.ingka.ikea.app.shoppinglist.navigation.ShoppingListsRoutes$ListDetails r3 = r3.f101140F
                boolean r3 = r3.b()
                java.lang.Boolean r4 = kotlin.coroutines.jvm.internal.b.a(r3)
                r5.f101195g = r1
                r5.f101191c = r6
                r5.f101192d = r6
                r5.f101193e = r3
                r5.f101194f = r2
                java.lang.Object r6 = r1.emit(r4, r5)
                if (r6 != r0) goto L_0x0083
                return r0
            L_0x0083:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x0086:
                XH.t r6 = new XH.t
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: pk.v.H.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class I implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101197a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101198a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$trackContentsquareListState$$inlined$map$1$2", f = "ShoppingListDetailsViewModel.kt", l = {50}, m = "emit")
            /* renamed from: pk.v$I$a$a  reason: collision with other inner class name */
            public static final class C2379a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101199c;

                /* renamed from: d  reason: collision with root package name */
                int f101200d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101201e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2379a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101201e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101199c = obj;
                    this.f101200d |= Integer.MIN_VALUE;
                    return this.f101201e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101198a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pk.v.I.a.C2379a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    pk.v$I$a$a r0 = (pk.v.I.a.C2379a) r0
                    int r1 = r0.f101200d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101200d = r1
                    goto L_0x0018
                L_0x0013:
                    pk.v$I$a$a r0 = new pk.v$I$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101199c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101200d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004c
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101198a
                    java.util.List r5 = (java.util.List) r5
                    java.util.Collection r5 = (java.util.Collection) r5
                    boolean r5 = r5.isEmpty()
                    r5 = r5 ^ r3
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f101200d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pk.v.I.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public I(C16532g gVar) {
            this.f101197a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101197a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isPopulated", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$trackContentsquareListState$2", f = "ShoppingListDetailsViewModel.kt", l = {755}, m = "invokeSuspend")
    static final class J extends l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        boolean f101202c;

        /* renamed from: d  reason: collision with root package name */
        Object f101203d;

        /* renamed from: e  reason: collision with root package name */
        int f101204e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f101205f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f101206g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        J(v vVar, C17164e<? super J> eVar) {
            super(2, eVar);
            this.f101206g = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            J j10 = new J(this.f101206g, eVar);
            j10.f101205f = ((Boolean) obj).booleanValue();
            return j10;
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((J) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            C11547a aVar;
            boolean z10;
            Object f10 = C17187b.f();
            int i10 = this.f101204e;
            if (i10 == 0) {
                XH.y.b(obj);
                boolean z11 = this.f101205f;
                aVar = this.f101206g.f101158y;
                C16532g R10 = this.f101206g.f101144J;
                this.f101203d = aVar;
                this.f101205f = z11;
                this.f101202c = z11;
                this.f101204e = 1;
                Object B10 = C16534i.B(R10, this);
                if (B10 == f10) {
                    return f10;
                }
                z10 = z11;
                obj = B10;
            } else if (i10 == 1) {
                z10 = this.f101202c;
                aVar = (C11547a) this.f101203d;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar.a(z10, ((Boolean) obj).booleanValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class K implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101207a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101208a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$trackWithStoreId$$inlined$map$1$2", f = "ShoppingListDetailsViewModel.kt", l = {50}, m = "emit")
            /* renamed from: pk.v$K$a$a  reason: collision with other inner class name */
            public static final class C2380a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101209c;

                /* renamed from: d  reason: collision with root package name */
                int f101210d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101211e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2380a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101211e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101209c = obj;
                    this.f101210d |= Integer.MIN_VALUE;
                    return this.f101211e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101208a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pk.v.K.a.C2380a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    pk.v$K$a$a r0 = (pk.v.K.a.C2380a) r0
                    int r1 = r0.f101210d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101210d = r1
                    goto L_0x0018
                L_0x0013:
                    pk.v$K$a$a r0 = new pk.v$K$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101209c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101210d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101208a
                    EB.d r5 = (EB.C12832d) r5
                    java.lang.String r5 = r5.e()
                    r0.f101210d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pk.v.K.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public K(C16532g gVar) {
            this.f101207a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101207a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "storeId", "LXH/N;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$trackWithStoreId$2", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class L extends l implements nI.p<String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101212c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101213d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f101214e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        L(C17642l<? super String, C16807N> lVar, C17164e<? super L> eVar) {
            super(2, eVar);
            this.f101214e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            L l10 = new L(this.f101214e, eVar);
            l10.f101213d = obj;
            return l10;
        }

        /* renamed from: i */
        public final Object invoke(String str, C17164e<? super C16807N> eVar) {
            return ((L) create(str, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101212c == 0) {
                XH.y.b(obj);
                this.f101214e.invoke((String) this.f101213d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$updateItemQuantity$2", f = "ShoppingListDetailsViewModel.kt", l = {697}, m = "invokeSuspend")
    static final class M extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101215c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f101216d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f101217e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        M(v vVar, String str, C17164e<? super M> eVar) {
            super(2, eVar);
            this.f101216d = vVar;
            this.f101217e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new M(this.f101216d, this.f101217e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((M) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f101215c;
            if (i10 == 0) {
                XH.y.b(obj);
                v vVar = this.f101216d;
                String str = this.f101217e;
                k kVar = k.OVERFLOW;
                this.f101215c = 1;
                obj2 = vVar.Y(str, kVar, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.i iVar = (s.i) obj2;
            C16505B S10 = this.f101216d.f101141G;
            do {
                value = S10.getValue();
            } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, iVar, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2143289343, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgB/g;", "item", "LXH/N;", "<anonymous>", "(LgB/g;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$updateItemQuantity$3", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class N extends l implements nI.p<C14505g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101218c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101219d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101220e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f101221f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        N(v vVar, int i10, C17164e<? super N> eVar) {
            super(2, eVar);
            this.f101220e = vVar;
            this.f101221f = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            N n10 = new N(this.f101220e, this.f101221f, eVar);
            n10.f101219d = obj;
            return n10;
        }

        /* renamed from: i */
        public final Object invoke(C14505g gVar, C17164e<? super C16807N> eVar) {
            return ((N) create(gVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101218c == 0) {
                XH.y.b(obj);
                this.f101220e.f101148o.o(this.f101220e.f0(), ((C14505g) this.f101219d).b(), this.f101221f);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$addToCart$2", f = "ShoppingListDetailsViewModel.kt", l = {572}, m = "invokeSuspend")
    /* renamed from: pk.v$a  reason: case insensitive filesystem */
    static final class C11742a extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101222c;

        /* renamed from: d  reason: collision with root package name */
        Object f101223d;

        /* renamed from: e  reason: collision with root package name */
        Object f101224e;

        /* renamed from: f  reason: collision with root package name */
        Object f101225f;

        /* renamed from: g  reason: collision with root package name */
        Object f101226g;

        /* renamed from: h  reason: collision with root package name */
        int f101227h;

        /* renamed from: i  reason: collision with root package name */
        int f101228i;

        /* renamed from: j  reason: collision with root package name */
        int f101229j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ v f101230k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f101231l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11742a(v vVar, String str, C17164e<? super C11742a> eVar) {
            super(2, eVar);
            this.f101230k = vVar;
            this.f101231l = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C11742a(this.f101230k, this.f101231l, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C11742a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0067 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00bf  */
        public final java.lang.Object invokeSuspend(java.lang.Object r46) {
            /*
                r45 = this;
                r0 = r45
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f101229j
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r4) goto L_0x0029
                int r2 = r0.f101227h
                java.lang.Object r5 = r0.f101226g
                pk.s r5 = (pk.s) r5
                java.lang.Object r6 = r0.f101225f
                java.lang.Object r7 = r0.f101224e
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r8 = r0.f101223d
                pk.v r8 = (pk.v) r8
                java.lang.Object r9 = r0.f101222c
                TJ.B r9 = (TJ.C16505B) r9
                XH.y.b(r46)
                r10 = r46
            L_0x0027:
                r11 = r5
                goto L_0x0068
            L_0x0029:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0031:
                XH.y.b(r46)
                pk.v r2 = r0.f101230k
                TJ.B r2 = r2.f101141G
                pk.v r5 = r0.f101230k
                java.lang.String r6 = r0.f101231l
                r9 = r2
                r2 = r3
                r8 = r5
                r7 = r6
            L_0x0042:
                java.lang.Object r6 = r9.getValue()
                r5 = r6
                pk.s r5 = (pk.s) r5
                qk.a r10 = r8.f101157x
                java.lang.String r11 = r8.f0()
                r0.f101222c = r9
                r0.f101223d = r8
                r0.f101224e = r7
                r0.f101225f = r6
                r0.f101226g = r5
                r0.f101227h = r2
                r0.f101228i = r3
                r0.f101229j = r4
                java.lang.Object r10 = r10.b(r7, r11, r0)
                if (r10 != r1) goto L_0x0027
                return r1
            L_0x0068:
                r30 = r10
                pk.s$a r30 = (pk.s.a) r30
                KJ.e r5 = r11.e()
                java.util.Set r5 = YH.g0.j(r5, r7)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                KJ.h r20 = KJ.C15985a.n(r5)
                r43 = 2147221247(0x7ffbfeff, float:NaN)
                r44 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                pk.s r5 = pk.s.b(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
                boolean r5 = r9.e(r6, r5)
                if (r5 == 0) goto L_0x0042
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pk.v.C11742a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.v$b  reason: case insensitive filesystem */
    public static final class C11743b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101232a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: pk.v$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101233a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$checkShouldExitListDetails$$inlined$filter$1$2", f = "ShoppingListDetailsViewModel.kt", l = {50}, m = "emit")
            /* renamed from: pk.v$b$a$a  reason: collision with other inner class name */
            public static final class C2381a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101234c;

                /* renamed from: d  reason: collision with root package name */
                int f101235d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101236e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2381a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101236e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101234c = obj;
                    this.f101235d |= Integer.MIN_VALUE;
                    return this.f101236e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101233a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pk.v.C11743b.a.C2381a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    pk.v$b$a$a r0 = (pk.v.C11743b.a.C2381a) r0
                    int r1 = r0.f101235d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101235d = r1
                    goto L_0x0018
                L_0x0013:
                    pk.v$b$a$a r0 = new pk.v$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101234c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101235d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101233a
                    r2 = r5
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    if (r2 != 0) goto L_0x0048
                    r0.f101235d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pk.v.C11743b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C11743b(C16532g gVar) {
            this.f101232a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101232a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$checkShouldExitListDetails$2", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pk.v$c  reason: case insensitive filesystem */
    static final class C11744c extends l implements nI.p<Boolean, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101237c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f101238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11744c(v vVar, C17164e<? super C11744c> eVar) {
            super(2, eVar);
            this.f101238d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C11744c(this.f101238d, eVar);
        }

        public final Object i(boolean z10, C17164e<? super C16807N> eVar) {
            return ((C11744c) create(Boolean.valueOf(z10), eVar)).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return i(((Boolean) obj).booleanValue(), (C17164e) obj2);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f101237c == 0) {
                XH.y.b(obj);
                C16505B S10 = this.f101238d.f101141G;
                do {
                    value = S10.getValue();
                } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, true, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483615, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$copyAllItemsToCart$2", f = "ShoppingListDetailsViewModel.kt", l = {555}, m = "invokeSuspend")
    /* renamed from: pk.v$d  reason: case insensitive filesystem */
    static final class C11745d extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101239c;

        /* renamed from: d  reason: collision with root package name */
        Object f101240d;

        /* renamed from: e  reason: collision with root package name */
        Object f101241e;

        /* renamed from: f  reason: collision with root package name */
        Object f101242f;

        /* renamed from: g  reason: collision with root package name */
        int f101243g;

        /* renamed from: h  reason: collision with root package name */
        int f101244h;

        /* renamed from: i  reason: collision with root package name */
        int f101245i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ v f101246j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11745d(v vVar, C17164e<? super C11745d> eVar) {
            super(2, eVar);
            this.f101246j = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C11745d(this.f101246j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C11745d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x005e A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00a9  */
        public final java.lang.Object invokeSuspend(java.lang.Object r45) {
            /*
                r44 = this;
                r0 = r44
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f101245i
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x002d
                if (r2 != r4) goto L_0x0025
                int r2 = r0.f101243g
                java.lang.Object r5 = r0.f101242f
                pk.s r5 = (pk.s) r5
                java.lang.Object r6 = r0.f101241e
                java.lang.Object r7 = r0.f101240d
                pk.v r7 = (pk.v) r7
                java.lang.Object r8 = r0.f101239c
                TJ.B r8 = (TJ.C16505B) r8
                XH.y.b(r45)
                r9 = r45
            L_0x0023:
                r10 = r5
                goto L_0x005f
            L_0x0025:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002d:
                XH.y.b(r45)
                pk.v r2 = r0.f101246j
                TJ.B r2 = r2.f101141G
                pk.v r5 = r0.f101246j
                r8 = r2
                r2 = r3
                r7 = r5
            L_0x003b:
                java.lang.Object r6 = r8.getValue()
                r5 = r6
                pk.s r5 = (pk.s) r5
                qk.c r9 = r7.f101149p
                java.lang.String r10 = r7.f0()
                r0.f101239c = r8
                r0.f101240d = r7
                r0.f101241e = r6
                r0.f101242f = r5
                r0.f101243g = r2
                r0.f101244h = r3
                r0.f101245i = r4
                java.lang.Object r9 = r9.b(r10, r0)
                if (r9 != r1) goto L_0x0023
                return r1
            L_0x005f:
                r29 = r9
                pk.s$a r29 = (pk.s.a) r29
                r42 = 2147221439(0x7ffbffbf, float:NaN)
                r43 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r17 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
                r37 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                pk.s r5 = pk.s.b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
                boolean r5 = r8.e(r6, r5)
                if (r5 == 0) goto L_0x003b
                XH.N r1 = XH.C16807N.f139792a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: pk.v.C11745d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"pk/v$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.v$e  reason: case insensitive filesystem */
    public static final class C11746e extends C17160a implements QJ.N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v f101247a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11746e(N.a aVar, v vVar) {
            super(aVar);
            this.f101247a = vVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            s.e.a aVar;
            C16505B S10 = this.f101247a.f101141G;
            do {
                value = S10.getValue();
                aVar = r4;
                s.e.a aVar2 = new s.e.a(th2);
            } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, aVar, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147352511, (Object) null)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$deleteList$3", f = "ShoppingListDetailsViewModel.kt", l = {535}, m = "invokeSuspend")
    /* renamed from: pk.v$f  reason: case insensitive filesystem */
    static final class C11747f extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101248c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f101249d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11747f(v vVar, C17164e<? super C11747f> eVar) {
            super(2, eVar);
            this.f101249d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C11747f(this.f101249d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C11747f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f101248c;
            if (i10 == 0) {
                XH.y.b(obj);
                C14613b M10 = this.f101249d.f101148o;
                String f02 = this.f101249d.f0();
                this.f101248c = 1;
                if (M10.d(f02, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C16505B S10 = this.f101249d.f101141G;
            do {
                value = S10.getValue();
            } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, s.e.c.f101078a, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147352511, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$deleteProduct$1", f = "ShoppingListDetailsViewModel.kt", l = {670}, m = "invokeSuspend")
    /* renamed from: pk.v$g  reason: case insensitive filesystem */
    static final class C11748g extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101250c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f101251d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f101252e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ k f101253f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11748g(v vVar, String str, k kVar, C17164e<? super C11748g> eVar) {
            super(2, eVar);
            this.f101251d = vVar;
            this.f101252e = str;
            this.f101253f = kVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C11748g(this.f101251d, this.f101252e, this.f101253f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C11748g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f101250c;
            if (i10 == 0) {
                XH.y.b(obj);
                v vVar = this.f101251d;
                String str = this.f101252e;
                k kVar = this.f101253f;
                this.f101250c = 1;
                obj2 = vVar.Y(str, kVar, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.i iVar = (s.i) obj2;
            C16505B S10 = this.f101251d.f101141G;
            do {
                value = S10.getValue();
            } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, iVar, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2143289343, (Object) null)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgB/g;", "item", "LXH/N;", "<anonymous>", "(LgB/g;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$displayQuantityPicker$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pk.v$h  reason: case insensitive filesystem */
    static final class C11749h extends l implements nI.p<C14505g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101254c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101255d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101256e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11749h(v vVar, C17164e<? super C11749h> eVar) {
            super(2, eVar);
            this.f101256e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C11749h hVar = new C11749h(this.f101256e, eVar);
            hVar.f101255d = obj;
            return hVar;
        }

        /* renamed from: i */
        public final Object invoke(C14505g gVar, C17164e<? super C16807N> eVar) {
            return ((C11749h) create(gVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            s.c cVar;
            C17187b.f();
            if (this.f101254c == 0) {
                XH.y.b(obj);
                C14505g gVar = (C14505g) this.f101255d;
                C16505B S10 = this.f101256e.f101141G;
                do {
                    value = S10.getValue();
                    cVar = r5;
                    s.c cVar2 = new s.c(gVar.b(), gVar.g());
                } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, cVar, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2139095039, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pk.v$i  reason: case insensitive filesystem */
    /* synthetic */ class C11750i extends kotlin.jvm.internal.E {
        C11750i(Object obj) {
            super(obj, C16519P.class, "value", "getValue()Ljava/lang/Object;", 0);
        }

        public Object get() {
            return ((C16519P) this.receiver).getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lpk/s;", "updateStateFunc", "LXH/N;", "<anonymous>", "(LnI/l;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getInspirationData$2", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pk.v$j  reason: case insensitive filesystem */
    static final class C11751j extends l implements nI.p<C17642l<? super s, ? extends s>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101257c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101258d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101259e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11751j(v vVar, C17164e<? super C11751j> eVar) {
            super(2, eVar);
            this.f101259e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C11751j jVar = new C11751j(this.f101259e, eVar);
            jVar.f101258d = obj;
            return jVar;
        }

        /* renamed from: i */
        public final Object invoke(C17642l<? super s, s> lVar, C17164e<? super C16807N> eVar) {
            return ((C11751j) create(lVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f101257c == 0) {
                XH.y.b(obj);
                C17642l lVar = (C17642l) this.f101258d;
                C16505B S10 = this.f101259e.f101141G;
                do {
                    value = S10.getValue();
                } while (!S10.e(value, lVar.invoke(value)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "LgB/g;", "items", "LgB/e;", "shoppingList", "LXH/v;", "<anonymous>", "(Ljava/util/List;LgB/e;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getListHeaderState$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pk.v$k  reason: case insensitive filesystem */
    static final class C11752k extends l implements nI.q<List<? extends C14505g>, C14503e, C17164e<? super XH.v<? extends List<? extends C14505g>, ? extends C14503e>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101260c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101261d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101262e;

        C11752k(C17164e<? super C11752k> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(List<C14505g> list, C14503e eVar, C17164e<? super XH.v<? extends List<C14505g>, C14503e>> eVar2) {
            C11752k kVar = new C11752k(eVar2);
            kVar.f101261d = list;
            kVar.f101262e = eVar;
            return kVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101260c == 0) {
                XH.y.b(obj);
                return C16796C.a((List) this.f101261d, (C14503e) this.f101262e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"LXH/v;", "", "LgB/g;", "LgB/e;", "<destruct>", "LXH/N;", "<anonymous>", "(LXH/v;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getListHeaderState$2", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pk.v$l  reason: case insensitive filesystem */
    static final class C11753l extends l implements nI.p<XH.v<? extends List<? extends C14505g>, ? extends C14503e>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101263c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101264d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101265e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11753l(v vVar, C17164e<? super C11753l> eVar) {
            super(2, eVar);
            this.f101265e = vVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(v vVar, String str, k kVar, boolean z10) {
            r rVar;
            Object value;
            if (z10) {
                rVar = vVar.getState().getValue().m();
            } else {
                C16505B Q10 = vVar.f101145K;
                r.b bVar = r.b.f101025a;
                Q10.setValue(bVar);
                rVar = bVar;
            }
            C16505B S10 = vVar.f101141G;
            do {
                value = S10.getValue();
            } while (!S10.e(value, s.b((s) value, kVar, z10, false, str, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, rVar, (s.h) null, (s.d) null, (s.b) null, 2013265908, (Object) null)));
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C11753l lVar = new C11753l(this.f101265e, eVar);
            lVar.f101264d = obj;
            return lVar;
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101263c == 0) {
                XH.y.b(obj);
                XH.v vVar = (XH.v) this.f101264d;
                this.f101265e.f101147n.m(((C14503e) vVar.b()).b(), (List) vVar.a(), new w(this.f101265e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: j */
        public final Object invoke(XH.v<? extends List<C14505g>, C14503e> vVar, C17164e<? super C16807N> eVar) {
            return ((C11753l) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "inStoreModeEnabled", "Lpk/r;", "listMode", "", "Lpk/i;", "items", "LXH/N;", "<anonymous>", "(ZLpk/r;Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getListItems$2", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pk.v$m  reason: case insensitive filesystem */
    static final class C11754m extends l implements nI.r<Boolean, r, List<? extends i>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101266c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f101267d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101268e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f101269f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f101270g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11754m(v vVar, C17164e<? super C11754m> eVar) {
            super(4, eVar);
            this.f101270g = vVar;
        }

        public final Object i(boolean z10, r rVar, List<i> list, C17164e<? super C16807N> eVar) {
            C11754m mVar = new C11754m(this.f101270g, eVar);
            mVar.f101267d = z10;
            mVar.f101268e = rVar;
            mVar.f101269f = list;
            return mVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101266c == 0) {
                XH.y.b(obj);
                boolean z10 = this.f101267d;
                r rVar = (r) this.f101268e;
                List list = (List) this.f101269f;
                if (C17542s.e(rVar, r.b.f101025a)) {
                    this.f101270g.i0(z10, list, rVar);
                } else if (C17542s.e(rVar, r.a.f101024a)) {
                    this.f101270g.d0(rVar);
                } else {
                    throw new XH.t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return i(((Boolean) obj).booleanValue(), (r) obj2, (List) obj3, (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpk/m;", "priceItem", "LXH/N;", "<anonymous>", "(Lpk/m;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getPriceData$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pk.v$n  reason: case insensitive filesystem */
    static final class C11755n extends l implements nI.p<m, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101271c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101272d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101273e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C11755n(v vVar, C17164e<? super C11755n> eVar) {
            super(2, eVar);
            this.f101273e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C11755n nVar = new C11755n(this.f101273e, eVar);
            nVar.f101272d = obj;
            return nVar;
        }

        /* renamed from: i */
        public final Object invoke(m mVar, C17164e<? super C16807N> eVar) {
            return ((C11755n) create(mVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101271c == 0) {
                XH.y.b(obj);
                m mVar = (m) this.f101272d;
                C16505B S10 = this.f101273e.f101141G;
                while (true) {
                    Object value = S10.getValue();
                    C16505B b10 = S10;
                    if (b10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, mVar, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147479551, (Object) null))) {
                        return C16807N.f139792a;
                    }
                    S10 = b10;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function1;", "Lpk/s;", "updateStateFunc", "LXH/N;", "<anonymous>", "(LnI/l;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getSimilarItems$2", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class o extends l implements nI.p<C17642l<? super s, ? extends s>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101274c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101275d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101276e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        o(v vVar, C17164e<? super o> eVar) {
            super(2, eVar);
            this.f101276e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            o oVar = new o(this.f101276e, eVar);
            oVar.f101275d = obj;
            return oVar;
        }

        /* renamed from: i */
        public final Object invoke(C17642l<? super s, s> lVar, C17164e<? super C16807N> eVar) {
            return ((o) create(lVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f101274c == 0) {
                XH.y.b(obj);
                C17642l lVar = (C17642l) this.f101275d;
                C16505B S10 = this.f101276e.f101141G;
                do {
                    value = S10.getValue();
                } while (!S10.e(value, lVar.invoke(value)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101277a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101278a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getStoreData$$inlined$map$1$2", f = "ShoppingListDetailsViewModel.kt", l = {50}, m = "emit")
            /* renamed from: pk.v$p$a$a  reason: collision with other inner class name */
            public static final class C2382a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101279c;

                /* renamed from: d  reason: collision with root package name */
                int f101280d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101281e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2382a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101281e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101279c = obj;
                    this.f101280d |= Integer.MIN_VALUE;
                    return this.f101281e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101278a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pk.v.p.a.C2382a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    pk.v$p$a$a r0 = (pk.v.p.a.C2382a) r0
                    int r1 = r0.f101280d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101280d = r1
                    goto L_0x0018
                L_0x0013:
                    pk.v$p$a$a r0 = new pk.v$p$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101279c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101280d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004c
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101278a
                    java.util.List r5 = (java.util.List) r5
                    java.util.Collection r5 = (java.util.Collection) r5
                    boolean r5 = r5.isEmpty()
                    r5 = r5 ^ r3
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f101280d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004c
                    return r1
                L_0x004c:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pk.v.p.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public p(C16532g gVar) {
            this.f101277a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101277a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "hasItems", "inStoreEnabled", "LEB/d;", "store", "LXH/N;", "<anonymous>", "(ZZLEB/d;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getStoreData$2", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class q extends l implements nI.r<Boolean, Boolean, C12832d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101282c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f101283d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f101284e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f101285f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ v f101286g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        q(v vVar, C17164e<? super q> eVar) {
            super(4, eVar);
            this.f101286g = vVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(v vVar, n nVar, o oVar, boolean z10) {
            Object value;
            C16505B S10 = vVar.f101141G;
            do {
                value = S10.getValue();
            } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, z10, false, false, false, (C15989e) null, (j) null, nVar, (q) null, (m) null, oVar, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147474415, (Object) null)));
            return C16807N.f139792a;
        }

        public final Object invokeSuspend(Object obj) {
            C12832d dVar;
            C17187b.f();
            if (this.f101282c == 0) {
                XH.y.b(obj);
                boolean z10 = this.f101283d;
                boolean z11 = this.f101284e;
                C12832d dVar2 = (C12832d) this.f101285f;
                C11722a C10 = this.f101286g.f101147n;
                if (dVar2 != null) {
                    if (dVar2.getName().length() > 0) {
                        dVar = dVar2;
                        C10.r(z11, z10, dVar, ((s) this.f101286g.f101141G.getValue()).m(), new x(this.f101286g));
                        return C16807N.f139792a;
                    }
                }
                dVar = null;
                C10.r(z11, z10, dVar, ((s) this.f101286g.f101141G.getValue()).m(), new x(this.f101286g));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object j(boolean z10, boolean z11, C12832d dVar, C17164e<? super C16807N> eVar) {
            q qVar = new q(this.f101286g, eVar);
            qVar.f101283d = z10;
            qVar.f101284e = z11;
            qVar.f101285f = dVar;
            return qVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            return j(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (C12832d) obj3, (C17164e) obj4);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lpk/s$o;", "wayfindingData", "LXH/N;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$getWayfindingData$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class r extends l implements nI.p<List<? extends s.o>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101287c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101288d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101289e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        r(v vVar, C17164e<? super r> eVar) {
            super(2, eVar);
            this.f101289e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            r rVar = new r(this.f101289e, eVar);
            rVar.f101288d = obj;
            return rVar;
        }

        /* renamed from: i */
        public final Object invoke(List<s.o> list, C17164e<? super C16807N> eVar) {
            return ((r) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f101287c == 0) {
                XH.y.b(obj);
                List list = (List) this.f101288d;
                C16505B S10 = this.f101289e.f101141G;
                do {
                    value = S10.getValue();
                } while (!S10.e(value, s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, C15985a.l(list), (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147467263, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$handleBackInStockNotification$2", f = "ShoppingListDetailsViewModel.kt", l = {722}, m = "invokeSuspend")
    static final class s extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101290c;

        /* renamed from: d  reason: collision with root package name */
        Object f101291d;

        /* renamed from: e  reason: collision with root package name */
        Object f101292e;

        /* renamed from: f  reason: collision with root package name */
        Object f101293f;

        /* renamed from: g  reason: collision with root package name */
        Object f101294g;

        /* renamed from: h  reason: collision with root package name */
        Object f101295h;

        /* renamed from: i  reason: collision with root package name */
        int f101296i;

        /* renamed from: j  reason: collision with root package name */
        int f101297j;

        /* renamed from: k  reason: collision with root package name */
        int f101298k;

        /* renamed from: l  reason: collision with root package name */
        int f101299l;

        /* renamed from: m  reason: collision with root package name */
        int f101300m;

        /* renamed from: n  reason: collision with root package name */
        int f101301n;

        /* renamed from: o  reason: collision with root package name */
        int f101302o;

        /* renamed from: p  reason: collision with root package name */
        int f101303p;

        /* renamed from: q  reason: collision with root package name */
        int f101304q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ v f101305r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ String f101306s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        s(v vVar, String str, C17164e<? super s> eVar) {
            super(2, eVar);
            this.f101305r = vVar;
            this.f101306s = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new s(this.f101305r, this.f101306s, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((s) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x00a5  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x00a8  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x00aa  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x00ad  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x00b4  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x00b7  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00c2  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x00c5  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0110  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r49) {
            /*
                r48 = this;
                r0 = r48
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f101304q
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x004e
                if (r2 != r3) goto L_0x0046
                int r2 = r0.f101303p
                int r5 = r0.f101302o
                int r6 = r0.f101301n
                int r7 = r0.f101300m
                int r8 = r0.f101299l
                int r9 = r0.f101298k
                int r10 = r0.f101296i
                java.lang.Object r11 = r0.f101295h
                pk.s r11 = (pk.s) r11
                java.lang.Object r12 = r0.f101294g
                pk.s r12 = (pk.s) r12
                java.lang.Object r12 = r0.f101293f
                java.lang.Object r13 = r0.f101292e
                java.lang.String r13 = (java.lang.String) r13
                java.lang.Object r14 = r0.f101291d
                pk.v r14 = (pk.v) r14
                java.lang.Object r15 = r0.f101290c
                TJ.B r15 = (TJ.C16505B) r15
                XH.y.b(r49)
                r46 = r13
                r47 = r14
                r14 = r15
                r15 = r12
                r12 = r11
                r11 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r2
                r2 = r49
                goto L_0x00a1
            L_0x0046:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x004e:
                XH.y.b(r49)
                pk.v r2 = r0.f101305r
                TJ.B r2 = r2.f101141G
                pk.v r5 = r0.f101305r
                java.lang.String r6 = r0.f101306s
                r15 = r2
                r10 = r4
                r14 = r5
                r13 = r6
            L_0x005f:
                java.lang.Object r12 = r15.getValue()
                r11 = r12
                pk.s r11 = (pk.s) r11
                qk.g r2 = r14.f101155v
                java.lang.String r5 = r14.f0()
                r0.f101290c = r15
                r0.f101291d = r14
                r0.f101292e = r13
                r0.f101293f = r12
                r0.f101294g = r11
                r0.f101295h = r11
                r0.f101296i = r10
                r0.f101297j = r4
                r0.f101298k = r4
                r0.f101299l = r4
                r0.f101300m = r4
                r0.f101301n = r4
                r0.f101302o = r4
                r0.f101303p = r4
                r0.f101304q = r3
                java.lang.Object r2 = r2.b(r13, r5, r0)
                if (r2 != r1) goto L_0x0093
                return r1
            L_0x0093:
                r5 = r4
                r6 = r5
                r7 = r6
                r8 = r7
                r9 = r8
                r46 = r13
                r47 = r14
                r14 = r15
                r15 = r12
                r12 = r11
                r11 = r10
                r10 = r9
            L_0x00a1:
                if (r5 == 0) goto L_0x00a5
                r5 = r3
                goto L_0x00a6
            L_0x00a5:
                r5 = r4
            L_0x00a6:
                if (r6 == 0) goto L_0x00aa
                r6 = r3
                goto L_0x00ab
            L_0x00aa:
                r6 = r4
            L_0x00ab:
                if (r7 == 0) goto L_0x00b0
                r17 = r3
                goto L_0x00b2
            L_0x00b0:
                r17 = r4
            L_0x00b2:
                if (r8 == 0) goto L_0x00b7
                r18 = r3
                goto L_0x00b9
            L_0x00b7:
                r18 = r4
            L_0x00b9:
                if (r9 == 0) goto L_0x00be
                r19 = r3
                goto L_0x00c0
            L_0x00be:
                r19 = r4
            L_0x00c0:
                if (r10 == 0) goto L_0x00c5
                r20 = r3
                goto L_0x00c7
            L_0x00c5:
                r20 = r4
            L_0x00c7:
                r37 = r2
                pk.s$g r37 = (pk.s.g) r37
                r44 = 2130706367(0x7effffbf, float:1.7014052E38)
                r45 = 0
                r13 = 0
                r16 = 0
                r21 = 0
                r22 = 0
                r23 = 0
                r24 = 0
                r25 = 0
                r26 = 0
                r27 = 0
                r28 = 0
                r29 = 0
                r30 = 0
                r31 = 0
                r32 = 0
                r33 = 0
                r34 = 0
                r35 = 0
                r36 = 0
                r38 = 0
                r39 = 0
                r40 = 0
                r41 = 0
                r42 = 0
                r43 = 0
                r2 = r14
                r14 = r5
                r5 = r15
                r15 = r6
                pk.s r6 = pk.s.b(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
                boolean r5 = r2.e(r5, r6)
                if (r5 == 0) goto L_0x0110
                XH.N r1 = XH.C16807N.f139792a
                return r1
            L_0x0110:
                r15 = r2
                r10 = r11
                r13 = r46
                r14 = r47
                goto L_0x005f
            */
            throw new UnsupportedOperationException("Method not decompiled: pk.v.s.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LgB/g;", "item", "LgB/e;", "list", "LXH/v;", "<anonymous>", "(LgB/g;LgB/e;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$handleItemMoved$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class t extends l implements nI.q<C14505g, C14503e, C17164e<? super XH.v<? extends C14505g, ? extends C14503e>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101307c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101308d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101309e;

        t(C17164e<? super t> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C14505g gVar, C14503e eVar, C17164e<? super XH.v<C14505g, C14503e>> eVar2) {
            t tVar = new t(eVar2);
            tVar.f101308d = gVar;
            tVar.f101309e = eVar;
            return tVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101307c == 0) {
                XH.y.b(obj);
                return C16796C.a((C14505g) this.f101308d, (C14503e) this.f101309e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LXH/v;", "LgB/g;", "LgB/e;", "<destruct>", "LXH/N;", "<anonymous>", "(LXH/v;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$handleItemMoved$2", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class u extends l implements nI.p<XH.v<? extends C14505g, ? extends C14503e>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101310c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101311d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101312e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        u(v vVar, C17164e<? super u> eVar) {
            super(2, eVar);
            this.f101312e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            u uVar = new u(this.f101312e, eVar);
            uVar.f101311d = obj;
            return uVar;
        }

        /* renamed from: i */
        public final Object invoke(XH.v<C14505g, C14503e> vVar, C17164e<? super C16807N> eVar) {
            return ((u) create(vVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            s sVar;
            String f10;
            C17187b.f();
            if (this.f101310c == 0) {
                XH.y.b(obj);
                XH.v vVar = (XH.v) this.f101311d;
                C14505g gVar = (C14505g) vVar.a();
                C14503e eVar = (C14503e) vVar.b();
                this.f101312e.f101148o.l(this.f101312e.f0(), new C14613b.C3151b(gVar.b(), gVar.g()), (a) null, (k) null);
                C16505B S10 = this.f101312e.f101141G;
                do {
                    value = S10.getValue();
                    sVar = (s) value;
                    C14500b f11 = gVar.f();
                    f10 = f11 != null ? f11.f() : null;
                    if (f10 == null) {
                        f10 = "";
                    }
                } while (!S10.e(value, s.b(sVar, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, new s.f.a(f10, eVar.b()), (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2145386495, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lpk/r;", "mode", "LXH/N;", "<anonymous>", "(Lpk/r;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$initiateInspirationTabSeenFlow$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: pk.v$v  reason: collision with other inner class name */
    static final class C2383v extends l implements nI.p<r, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101313c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101314d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101315e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2383v(v vVar, C17164e<? super C2383v> eVar) {
            super(2, eVar);
            this.f101315e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2383v vVar = new C2383v(this.f101315e, eVar);
            vVar.f101314d = obj;
            return vVar;
        }

        /* renamed from: i */
        public final Object invoke(r rVar, C17164e<? super C16807N> eVar) {
            return ((C2383v) create(rVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101313c == 0) {
                XH.y.b(obj);
                if (((r) this.f101314d) instanceof r.a) {
                    this.f101315e.f101136B.i();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LgB/g;", "item", "LXH/N;", "<anonymous>", "(LgB/g;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$moveItem$1", f = "ShoppingListDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    static final class w extends l implements nI.p<C14505g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101316c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101317d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ v f101318e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        w(v vVar, C17164e<? super w> eVar) {
            super(2, eVar);
            this.f101318e = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            w wVar = new w(this.f101318e, eVar);
            wVar.f101317d = obj;
            return wVar;
        }

        /* renamed from: i */
        public final Object invoke(C14505g gVar, C17164e<? super C16807N> eVar) {
            return ((w) create(gVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            s sVar;
            String b10;
            String f10;
            C17187b.f();
            if (this.f101316c == 0) {
                XH.y.b(obj);
                C14505g gVar = (C14505g) this.f101317d;
                C16505B S10 = this.f101318e.f101141G;
                do {
                    value = S10.getValue();
                    sVar = (s) value;
                    b10 = gVar.b();
                    C14500b f11 = gVar.f();
                    f10 = f11 != null ? f11.f() : null;
                    if (f10 == null) {
                        f10 = "";
                    }
                } while (!S10.e(value, s.b(sVar, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, new s.f.b(b10, f10, gVar.g()), (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2145386495, (Object) null)));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$onAction$15", f = "ShoppingListDetailsViewModel.kt", l = {216}, m = "invokeSuspend")
    static final class x extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101319c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f101320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        x(v vVar, C17164e<? super x> eVar) {
            super(2, eVar);
            this.f101320d = vVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new x(this.f101320d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((x) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101319c;
            if (i10 == 0) {
                XH.y.b(obj);
                C11577a L10 = this.f101320d.f101136B;
                this.f101319c = 1;
                if (L10.h(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$onAction$16", f = "ShoppingListDetailsViewModel.kt", l = {250}, m = "invokeSuspend")
    static final class y extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101321c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ v f101322d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11724c f101323e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        y(v vVar, C11724c cVar, C17164e<? super y> eVar) {
            super(2, eVar);
            this.f101322d = vVar;
            this.f101323e = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new y(this.f101322d, this.f101323e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((y) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f101321c;
            if (i10 == 0) {
                XH.y.b(obj);
                C11860c O10 = this.f101322d.f101138D;
                String f02 = this.f101322d.f0();
                String c10 = ((e) this.f101323e).c();
                String b10 = ((e) this.f101323e).b();
                boolean a10 = ((e) this.f101323e).a();
                this.f101321c = 1;
                obj = O10.r(f02, c10, b10, a10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C17642l lVar = (C17642l) obj;
            C16505B S10 = this.f101322d.f101141G;
            do {
                value = S10.getValue();
            } while (!S10.e(value, lVar.invoke(value)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.ShoppingListDetailsViewModel$onAction$17", f = "ShoppingListDetailsViewModel.kt", l = {261}, m = "invokeSuspend")
    static final class z extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f101324c;

        /* renamed from: d  reason: collision with root package name */
        Object f101325d;

        /* renamed from: e  reason: collision with root package name */
        Object f101326e;

        /* renamed from: f  reason: collision with root package name */
        int f101327f;

        /* renamed from: g  reason: collision with root package name */
        int f101328g;

        /* renamed from: h  reason: collision with root package name */
        int f101329h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ v f101330i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C11724c f101331j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        z(v vVar, C11724c cVar, C17164e<? super z> eVar) {
            super(2, eVar);
            this.f101330i = vVar;
            this.f101331j = cVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(v vVar, C11724c cVar, String str) {
            g gVar = (g) cVar;
            vVar.f101139E.c(str, gVar.a());
            vVar.f101139E.a(str, gVar.a());
            return C16807N.f139792a;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new z(this.f101330i, this.f101331j, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((z) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            s b10;
            Object f10 = C17187b.f();
            int i10 = this.f101329h;
            if (i10 == 0) {
                XH.y.b(obj);
                C16505B S10 = this.f101330i.f101141G;
                do {
                    value = S10.getValue();
                    b10 = s.b((s) value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, s.n.d.f101121a, (r) null, (s.h) null, (s.d) null, (s.b) null, 2080374783, (Object) null);
                } while (!S10.e(value, b10));
                C11860c O10 = this.f101330i.f101138D;
                String a10 = ((g) this.f101331j).a();
                this.f101324c = S10;
                this.f101325d = value;
                this.f101326e = b10;
                this.f101327f = 0;
                this.f101328g = 0;
                this.f101329h = 1;
                if (O10.o(a10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                s sVar = (s) this.f101326e;
                C16505B b11 = (C16505B) this.f101324c;
                XH.y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            v vVar = this.f101330i;
            vVar.C0(new y(vVar, this.f101331j));
            return C16807N.f139792a;
        }
    }

    public v(U u10, C12860a aVar, C11722a aVar2, C14613b bVar, C11790c cVar, j jVar, i iVar, C11723b bVar2, C11789b bVar3, C11793f fVar, C11794g gVar, C11792e eVar, C11788a aVar3, C11547a aVar4, C13909a aVar5, C11780d dVar, C11577a aVar6, c cVar2, C11860c cVar3, C11829b bVar4) {
        C12860a aVar7 = aVar;
        C11722a aVar8 = aVar2;
        C14613b bVar5 = bVar;
        C11790c cVar4 = cVar;
        j jVar2 = jVar;
        i iVar2 = iVar;
        C11723b bVar6 = bVar2;
        C11789b bVar7 = bVar3;
        C11793f fVar2 = fVar;
        C11794g gVar2 = gVar;
        C11792e eVar2 = eVar;
        C11788a aVar9 = aVar3;
        C11547a aVar10 = aVar4;
        C13909a aVar11 = aVar5;
        C11780d dVar2 = dVar;
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar7, "localStoreSelectionRepository");
        C17542s.j(aVar8, "contentItemsMapper");
        C17542s.j(bVar5, "shoppingListRepository");
        C17542s.j(cVar4, "copyAllItemsToCartUseCase");
        C17542s.j(jVar2, "shareListUseCase");
        C17542s.j(iVar2, "shareItemUseCase");
        C17542s.j(bVar6, "removeProductHelper");
        C17542s.j(bVar7, "checkWayfindingAvailabilityUseCase");
        C17542s.j(fVar2, "getListProductsUseCase");
        C17542s.j(gVar2, "notifyWhenBackInStockUseCase");
        C17542s.j(eVar2, "getListPriceUseCase");
        C17542s.j(aVar9, "addItemToCartUseCase");
        C17542s.j(aVar10, "shoppingListDetailsAnalytics");
        C17542s.j(aVar11, "sessionManager");
        C17542s.j(dVar, "storeModeIntegration");
        C17542s.j(aVar6, "shoppingListRecommendationsOrchestrator");
        C17542s.j(cVar2, "abTesting");
        C17542s.j(cVar3, "similarItemsOrchestrator");
        C17542s.j(bVar4, "similarItemsAnalytics");
        this.f101146m = aVar7;
        this.f101147n = aVar8;
        this.f101148o = bVar5;
        this.f101149p = cVar4;
        this.f101150q = jVar2;
        this.f101151r = iVar2;
        this.f101152s = bVar6;
        this.f101153t = bVar7;
        this.f101154u = fVar2;
        this.f101155v = gVar2;
        this.f101156w = eVar2;
        this.f101157x = aVar9;
        this.f101158y = aVar10;
        this.f101159z = aVar11;
        this.f101135A = dVar;
        this.f101136B = aVar6;
        this.f101137C = cVar2;
        this.f101138D = cVar3;
        this.f101139E = bVar4;
        U u11 = u10;
        this.f101140F = (ShoppingListsRoutes$ListDetails) O.a(u11, P.b(ShoppingListsRoutes$ListDetails.class), X.j());
        C16505B<s> a10 = C16521S.a(new s((k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, Integer.MAX_VALUE, (DefaultConstructorMarker) null));
        this.f101141G = a10;
        this.f101142H = a10;
        C16505B<Boolean> a11 = C16521S.a(null);
        this.f101143I = a11;
        this.f101144J = C16534i.A(C16534i.S(a11, new H(this, (C17164e<? super H>) null)));
        aVar10.f(f0());
        bVar5.s(f0());
        m0();
        l0();
        g0();
        h0();
        e0();
        r0();
        c0();
        W();
        B0();
        j0();
    }

    private final void A0(boolean z10) {
        C16534i.M(C16534i.R(C16534i.e0(this.f101146m.b(), 1), new G(this, z10, (C17164e<? super G>) null)), g0.a(this));
    }

    private final void B0() {
        C16534i.M(C16534i.R(new I(C16534i.e0(this.f101148o.m(f0()), 1)), new J(this, (C17164e<? super J>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final void C0(C17642l<? super String, C16807N> lVar) {
        C16534i.M(C16534i.R(C16534i.e0(new K(C16534i.A(this.f101146m.b())), 1), new L(lVar, (C17164e<? super L>) null)), g0.a(this));
    }

    private final void D0(String str) {
        C16505B<s> b10 = this.f101141G;
        while (true) {
            s value = b10.getValue();
            if (b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2143289343, (Object) null))) {
                this.f101152s.d(f0(), str);
                return;
            }
            String str2 = str;
        }
    }

    private final void E0(String str, int i10) {
        s value;
        String str2 = str;
        int i11 = i10;
        C16505B<s> b10 = this.f101141G;
        do {
            value = b10.getValue();
        } while (!b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2139095039, (Object) null)));
        if (i11 == 0) {
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new M(this, str2, (C17164e<? super M>) null), 3, (Object) null);
        } else {
            C16534i.M(C16534i.R(C16534i.e0(this.f101148o.b(f0(), str2), 1), new N(this, i11, (C17164e<? super N>) null)), g0.a(this));
        }
    }

    private final void V(String str) {
        s value;
        s sVar;
        String str2 = str;
        C16505B<s> b10 = this.f101141G;
        do {
            value = b10.getValue();
            sVar = value;
        } while (!b10.e(value, s.b(sVar, (k) null, false, false, (String) null, false, false, false, false, C15985a.n(YH.g0.l(sVar.e(), str2)), (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483391, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C11742a(this, str2, (C17164e<? super C11742a>) null), 3, (Object) null);
    }

    private final void W() {
        C16534i.M(C16534i.R(new C11743b(this.f101159z.n()), new C11744c(this, (C17164e<? super C11744c>) null)), g0.a(this));
    }

    private final void X() {
        s value;
        C16505B<s> b10 = this.f101141G;
        do {
            value = b10.getValue();
        } while (!b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, true, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483583, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C11745d(this, (C17164e<? super C11745d>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final Object Y(String str, k kVar, C17164e<? super s.i> eVar) {
        return this.f101152s.c(new C11723b.a(f0(), str, kVar), eVar);
    }

    private final void Z() {
        s value;
        C16505B<s> b10 = this.f101141G;
        do {
            value = b10.getValue();
        } while (!b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, true, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483583, (Object) null)));
        F0 unused = C16314k.d(g0.a(this), new C11746e(QJ.N.f137593c0, this), (T) null, new C11747f(this, (C17164e<? super C11747f>) null), 2, (Object) null);
    }

    private final void a0(String str, k kVar) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new C11748g(this, str, kVar, (C17164e<? super C11748g>) null), 3, (Object) null);
    }

    private final void b0(String str) {
        C16534i.M(C16534i.R(C16534i.e0(this.f101148o.b(f0(), str), 1), new C11749h(this, (C17164e<? super C11749h>) null)), g0.a(this));
    }

    private final void c0() {
        C16534i.M(C16534i.R(this.f101136B.g(f0(), new C11750i(getState())), new C11751j(this, (C17164e<? super C11751j>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final void d0(r rVar) {
        s value;
        C16505B<s> b10 = this.f101141G;
        do {
            value = b10.getValue();
        } while (!b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, j.a.f100957a, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, rVar, (s.h) null, (s.d) null, (s.b) null, 2013265403, (Object) null)));
    }

    private final void e0() {
        C16534i.M(C16534i.N(C16534i.n(this.f101148o.m(f0()), this.f101148o.e(f0()), new C11752k((C17164e<? super C11752k>) null)), new C11753l(this, (C17164e<? super C11753l>) null)), g0.a(this));
    }

    private final void g0() {
        s value;
        C16505B<s> b10 = this.f101141G;
        do {
            value = b10.getValue();
        } while (!b10.e(value, s.b(value, (k) null, false, true, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483643, (Object) null)));
        C16534i.M(C16534i.m(this.f101144J, this.f101145K, this.f101154u.d(f0()), new C11754m(this, (C17164e<? super C11754m>) null)), g0.a(this));
    }

    private final void h0() {
        C16534i.M(C16534i.R(this.f101156w.c(f0()), new C11755n(this, (C17164e<? super C11755n>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public final void i0(boolean z10, List<i> list, r rVar) {
        q qVar;
        boolean z11 = z10;
        if (z11) {
            qVar = new q.b(C15985a.h(list));
        } else if (!z11) {
            List<T> n10 = C16877v.n();
            for (i b10 : list) {
                n10 = C16877v.V0(n10, b10.b());
            }
            qVar = new q.a(C15985a.h(n10));
        } else {
            throw new XH.t();
        }
        j jVar = j.c.f100959a;
        if (!list.isEmpty()) {
            jVar = null;
        }
        if (jVar == null) {
            jVar = j.b.f100958a;
        }
        C16505B<s> b11 = this.f101141G;
        while (true) {
            s value = b11.getValue();
            C16505B<s> b12 = b11;
            if (!b12.e(value, s.b(value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, jVar, (n) null, qVar, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, rVar, (s.h) null, (s.d) null, (s.b) null, 2013263355, (Object) null))) {
                b11 = b12;
            } else {
                return;
            }
        }
    }

    private final void j0() {
        C16534i.M(C16534i.R(this.f101138D.p(f0(), new t(this)), new o(this, (C17164e<? super o>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public static final s k0(v vVar) {
        return vVar.f101141G.getValue();
    }

    private final void l0() {
        C16534i.M(C16534i.m(C16534i.s(new p(this.f101148o.m(f0()))), this.f101144J, this.f101146m.b(), new q(this, (C17164e<? super q>) null)), g0.a(this));
    }

    private final void m0() {
        C16534i.M(C16534i.R(this.f101153t.e(f0()), new r(this, (C17164e<? super r>) null)), g0.a(this));
    }

    private final void n0(C11724c.C11725a aVar) {
        s value;
        s value2;
        s.b.C2377b bVar;
        s value3;
        s.b.a aVar2;
        C11724c.C11725a aVar3 = aVar;
        if (aVar3 instanceof C11724c.C11725a.C2372a) {
            c.a.a(this.f101137C, "sl_add_to_wishlist", (Map) null, (Map) null, 6, (Object) null);
            C16505B<s> b10 = this.f101141G;
            do {
                value3 = b10.getValue();
                C11724c.C11725a.C2372a aVar4 = (C11724c.C11725a.C2372a) aVar3;
                aVar2 = r8;
                s.b.a aVar5 = new s.b.a(aVar4.a(), aVar4.c(), aVar4.b());
            } while (!b10.e(value3, s.b(value3, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, aVar2, CatalogRepository.FETCH_FLAG_ALL, (Object) null)));
        } else if (aVar3 instanceof C11724c.C11725a.b) {
            C16505B<s> b11 = this.f101141G;
            do {
                value2 = b11.getValue();
                bVar = r5;
                C11724c.C11725a.b bVar2 = (C11724c.C11725a.b) aVar3;
                s.b.C2377b bVar3 = new s.b.C2377b(bVar2.a(), bVar2.c(), bVar2.b());
            } while (!b11.e(value2, s.b(value2, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, bVar, CatalogRepository.FETCH_FLAG_ALL, (Object) null)));
        } else if (C17542s.e(aVar3, C11724c.C11725a.C2373c.f100916a)) {
            C16505B<s> b12 = this.f101141G;
            do {
                value = b12.getValue();
            } while (!b12.e(value, s.b(value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, CatalogRepository.FETCH_FLAG_ALL, (Object) null)));
        } else {
            throw new XH.t();
        }
    }

    private final void o0(String str) {
        C16505B<s> b10 = this.f101141G;
        while (true) {
            s value = b10.getValue();
            if (b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, true, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483583, (Object) null))) {
                F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new s(this, str, (C17164e<? super s>) null), 3, (Object) null);
                return;
            }
            String str2 = str;
        }
    }

    private final void p0(String str, String str2) {
        C16534i.M(C16534i.R(C16534i.e0(C16534i.n(this.f101148o.b(f0(), str), this.f101148o.e(str2), new t((C17164e<? super t>) null)), 1), new u(this, (C17164e<? super u>) null)), g0.a(this));
    }

    private final void q0(String str) {
        s value;
        s.f.c cVar;
        C16505B<s> b10 = this.f101141G;
        do {
            value = b10.getValue();
            cVar = r4;
            s.f.c cVar2 = new s.f.c(str);
        } while (!b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, cVar, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2145386495, (Object) null)));
    }

    private final void r0() {
        C16534i.M(C16534i.R(this.f101145K, new C2383v(this, (C17164e<? super C2383v>) null)), g0.a(this));
    }

    private final void s0(String str) {
        C16534i.M(C16534i.R(C16534i.e0(this.f101148o.b(f0(), str), 1), new w(this, (C17164e<? super w>) null)), g0.a(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N u0(v vVar, C11724c cVar, String str) {
        C17542s.j(str, "storeId");
        vVar.f101139E.b(str, ((C11724c.y) cVar).a());
        return C16807N.f139792a;
    }

    private final void v0() {
        s value;
        C16505B<s> b10 = this.f101141G;
        do {
            value = b10.getValue();
        } while (!b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483519, (Object) null)));
        this.f101148o.n(f0());
    }

    private final void w0(String str) {
        C16505B<s> b10 = this.f101141G;
        while (true) {
            s value = b10.getValue();
            if (b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, true, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483583, (Object) null))) {
                F0 unused = C16314k.d(g0.a(this), new B(QJ.N.f137593c0, this), (T) null, new C(this, str, (C17164e<? super C>) null), 2, (Object) null);
                return;
            }
            String str2 = str;
        }
    }

    private final void x0(String str) {
        C16505B<s> b10 = this.f101141G;
        while (true) {
            s value = b10.getValue();
            if (b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, true, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483583, (Object) null))) {
                F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new D(this, str, (C17164e<? super D>) null), 3, (Object) null);
                return;
            }
            String str2 = str;
        }
    }

    private final void y0() {
        s value;
        if (!getState().getValue().i()) {
            C16505B<s> b10 = this.f101141G;
            do {
                value = b10.getValue();
            } while (!b10.e(value, s.b(value, (k) null, false, false, (String) null, false, false, true, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483583, (Object) null)));
            F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new E(this, (C17164e<? super E>) null), 3, (Object) null);
        }
    }

    private final void z0() {
        C16534i.M(C16534i.R(C16534i.e0(this.f101148o.e(f0()), 1), new F(this, (C17164e<? super F>) null)), g0.a(this));
    }

    public final String f0() {
        return this.f101140F.a();
    }

    public C16519P<s> getState() {
        return this.f101142H;
    }

    public void t0(C11724c cVar) {
        s value;
        s value2;
        s value3;
        s value4;
        s.g.e eVar;
        s value5;
        s value6;
        s value7;
        s value8;
        s value9;
        s value10;
        s value11;
        s value12;
        s value13;
        s value14;
        s value15;
        s value16;
        C11724c cVar2 = cVar;
        C17542s.j(cVar2, "action");
        if (cVar2 instanceof C11724c.P) {
            A0(((C11724c.P) cVar2).a());
            C16807N n10 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.u) {
            w0(((C11724c.u) cVar2).a());
            C16807N n11 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.I.f100901a)) {
            z0();
            C16807N n12 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C11733j.f100926a)) {
            C16505B<s> b10 = this.f101141G;
            do {
                value16 = b10.getValue();
            } while (!b10.e(value16, s.b(value16, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147418111, (Object) null)));
            C16807N n13 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C11732i.f100925a)) {
            C16505B<s> b11 = this.f101141G;
            do {
                value15 = b11.getValue();
            } while (!b11.e(value15, s.b(value15, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147352575, (Object) null)));
            C16807N n14 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C11736m.f100929a)) {
            C16505B<s> b12 = this.f101141G;
            do {
                value14 = b12.getValue();
            } while (!b12.e(value14, s.b(value14, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, s.e.b.f101077a, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147352575, (Object) null)));
            C16807N n15 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C11737n.f100930a)) {
            Z();
            C16807N n16 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C.f100894a)) {
            C16505B<s> b13 = this.f101141G;
            do {
                value13 = b13.getValue();
            } while (!b13.e(value13, s.b(value13, (k) null, false, false, (String) null, false, false, false, true, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483519, (Object) null)));
            C16807N n17 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.D.f100895a)) {
            v0();
            C16807N n18 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.E.f100896a)) {
            C16505B<s> b14 = this.f101141G;
            do {
                value12 = b14.getValue();
            } while (!b14.e(value12, s.b(value12, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147483519, (Object) null)));
            C16807N n19 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C11734k.f100927a)) {
            X();
            C16807N n20 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C11735l.f100928a)) {
            C16505B<s> b15 = this.f101141G;
            do {
                value11 = b15.getValue();
            } while (!b15.e(value11, s.b(value11, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2147221503, (Object) null)));
            C16807N n21 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.N.f100906a)) {
            y0();
            C16807N n22 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.O.f100907a)) {
            C16505B<s> b16 = this.f101141G;
            do {
                value10 = b16.getValue();
            } while (!b16.e(value10, s.b(value10, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2146959359, (Object) null)));
            C16807N n23 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.L) {
            x0(((C11724c.L) cVar2).a());
            C16807N n24 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.M.f100905a)) {
            C16505B<s> b17 = this.f101141G;
            do {
                value9 = b17.getValue();
            } while (!b17.e(value9, s.b(value9, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2146435071, (Object) null)));
            C16807N n25 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.C11740q) {
            s0(((C11724c.C11740q) cVar2).a());
            C16807N n26 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.r.f100935a)) {
            C16505B<s> b18 = this.f101141G;
            do {
                value8 = b18.getValue();
            } while (!b18.e(value8, s.b(value8, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2145386495, (Object) null)));
            C16807N n27 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.t) {
            C11724c.t tVar = (C11724c.t) cVar2;
            p0(tVar.a(), tVar.b());
            C16807N n28 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.s) {
            q0(((C11724c.s) cVar2).a());
            C16807N n29 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.F) {
            C11724c.F f10 = (C11724c.F) cVar2;
            a0(f10.b(), f10.a());
            C16807N n30 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.H) {
            D0(((C11724c.H) cVar2).a());
            C16807N n31 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.G.f100899a)) {
            C16505B<s> b19 = this.f101141G;
            do {
                value7 = b19.getValue();
            } while (!b19.e(value7, s.b(value7, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2143289343, (Object) null)));
            C16807N n32 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.C11727d) {
            b0(((C11724c.C11727d) cVar2).a());
            C16807N n33 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C11728e.f100920a)) {
            C16505B<s> b20 = this.f101141G;
            do {
                value6 = b20.getValue();
            } while (!b20.e(value6, s.b(value6, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2139095039, (Object) null)));
            C16807N n34 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.C11729f) {
            C11724c.C11729f fVar = (C11724c.C11729f) cVar2;
            E0(fVar.a(), fVar.b());
            C16807N n35 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.v) {
            o0(((C11724c.v) cVar2).a());
            C16807N n36 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.w.f100941a)) {
            C16505B<s> b21 = this.f101141G;
            do {
                value5 = b21.getValue();
            } while (!b21.e(value5, s.b(value5, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2130706431, (Object) null)));
            C16807N n37 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.x) {
            C16505B<s> b22 = this.f101141G;
            do {
                value4 = b22.getValue();
                eVar = r5;
                s.g.e eVar2 = new s.g.e(((C11724c.x) cVar2).a());
            } while (!b22.e(value4, s.b(value4, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, eVar, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2130706431, (Object) null)));
            C16807N n38 = C16807N.f139792a;
        } else if (cVar2 instanceof C11724c.C11726b) {
            V(((C11724c.C11726b) cVar2).a());
            C16807N n39 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.C11730g.f100923a)) {
            this.f101158y.d();
            C16807N n40 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.z.f100945a)) {
            this.f101158y.i();
            C16807N n41 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.K.f100903a)) {
            C16505B<s> b23 = this.f101141G;
            do {
                value3 = b23.getValue();
            } while (!b23.e(value3, s.b(value3, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2113929215, (Object) null)));
            C16807N n42 = C16807N.f139792a;
        } else if (C17542s.e(cVar2, C11724c.A.f100892a)) {
            this.f101158y.k();
            C16807N n43 = C16807N.f139792a;
        } else {
            r rVar = null;
            if (cVar2 instanceof C11724c.Q) {
                r.b bVar = r.b.f101025a;
                if (C17542s.e(((C11724c.Q) cVar2).a(), bVar)) {
                    rVar = bVar;
                }
                if (rVar == null) {
                    rVar = r.a.f101024a;
                }
                this.f101145K.setValue(rVar);
                this.f101158y.e(rVar);
                if (rVar instanceof r.a) {
                    c.a.a(this.f101137C, "sl_inspiration_tab_clicked", (Map) null, (Map) null, 6, (Object) null);
                }
                C16807N n44 = C16807N.f139792a;
            } else if (C17542s.e(cVar2, C11724c.J.f100902a)) {
                F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new x(this, (C17164e<? super x>) null), 3, (Object) null);
            } else if (cVar2 instanceof C11724c.C11725a) {
                n0((C11724c.C11725a) cVar2);
                C16807N n45 = C16807N.f139792a;
            } else if (cVar2 instanceof C11724c.C11739p) {
                C11724c.C11739p pVar = (C11724c.C11739p) cVar2;
                this.f101158y.g(pVar.b(), pVar.a());
                C16807N n46 = C16807N.f139792a;
            } else if (C17542s.e(cVar2, C11724c.B.f100893a)) {
                this.f101158y.l();
                C16807N n47 = C16807N.f139792a;
            } else if (C17542s.e(cVar2, C11724c.C11738o.f100931a)) {
                this.f101158y.h();
                C16807N n48 = C16807N.f139792a;
            } else if (cVar2 instanceof C11724c.C2374c) {
                this.f101158y.b(((C11724c.C2374c) cVar2).a());
                C16807N n49 = C16807N.f139792a;
            } else if (cVar2 instanceof C11724c.C11731h) {
                this.f101158y.j(((C11724c.C11731h) cVar2).a());
                C16807N n50 = C16807N.f139792a;
            } else if (C17542s.e(cVar2, C11741d.f100946a)) {
                C17642l<s, s> j10 = this.f101138D.j();
                C16505B<s> b24 = this.f101141G;
                do {
                    value2 = b24.getValue();
                } while (!b24.e(value2, j10.invoke(value2)));
                C16807N n51 = C16807N.f139792a;
            } else if (cVar2 instanceof e) {
                F0 unused2 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new y(this, cVar2, (C17164e<? super y>) null), 3, (Object) null);
            } else if (cVar2 instanceof g) {
                F0 unused3 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new z(this, cVar2, (C17164e<? super z>) null), 3, (Object) null);
            } else if (C17542s.e(cVar2, h.f100952a)) {
                F0 unused4 = C16314k.d(g0.a(this), (C17168i) null, (T) null, new A(this, (C17164e<? super A>) null), 3, (Object) null);
            } else if (C17542s.e(cVar2, f.f100950a)) {
                C16505B<s> b25 = this.f101141G;
                do {
                    value = b25.getValue();
                } while (!b25.e(value, s.b(value, (k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (j) null, (n) null, (q) null, (m) null, (o) null, (C15987c) null, (l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, (s.n) null, (r) null, (s.h) null, (s.d) null, (s.b) null, 2080374783, (Object) null)));
                C16807N n52 = C16807N.f139792a;
            } else if (cVar2 instanceof C11724c.y) {
                C0(new u(this, cVar2));
                C16807N n53 = C16807N.f139792a;
            } else {
                throw new XH.t();
            }
        }
    }
}
