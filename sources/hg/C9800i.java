package hg;

import Bx.a;
import EB.C12832d;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import O0.J0;
import Op.a1;
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
import UJ.C16619l;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.base.ProductKey;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ig.C9845a;
import ip.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.C11550a;
import lm.b;
import nI.C17631a;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sf.C10242c;
import sf.C10243d;
import tf.C10253a;
import ug.k;

@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001:\u0004pqrsBQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J-\u0010,\u001a\u00020*2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J5\u00100\u001a\u00020*2\u0014\u0010)\u001a\u0010\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0018\u00010&2\u0006\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u00020*H\u0002¢\u0006\u0004\b0\u00101J/\u00104\u001a\u00020\u001a2\u0006\u00102\u001a\u00020(2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u00020!H\u0002¢\u0006\u0004\b4\u00105J/\u0010<\u001a\u0004\u0018\u00010\u00182\b\u00107\u001a\u0004\u0018\u0001062\b\u00109\u001a\u0004\u0018\u0001082\b\u0010;\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b<\u0010=J\u0013\u0010>\u001a\u00020**\u000206H\u0002¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CJ%\u0010D\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u00103\u001a\u00020!¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u001a¢\u0006\u0004\bF\u0010GR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR \u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0W0V8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001c\u0010]\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010[0V8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010YR\u001c\u0010`\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010^0V8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010YR\u001d\u0010g\u001a\b\u0012\u0004\u0012\u00020b0a8\u0006¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u0014\u0010j\u001a\u00020*8BX\u0004¢\u0006\u0006\u001a\u0004\bh\u0010iR\u0014\u0010l\u001a\u00020*8BX\u0004¢\u0006\u0006\u001a\u0004\bk\u0010iR\u0014\u0010o\u001a\u0002068BX\u0004¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006t"}, d2 = {"Lhg/i;", "Landroidx/lifecycle/f0;", "Llm/a;", "backInStockApi", "Llm/f;", "backInStockNotificationAnalytics", "Ltf/a;", "killSwitchRepository", "LIl/a;", "appConfigApi", "Lsf/c;", "appUserDataRepository", "LaA/a;", "sessionManager", "Lug/k;", "labsFeatures", "LLn/h;", "cartRepository", "Lig/a;", "getCartItemAvailabilityUseCase", "<init>", "(Llm/a;Llm/f;Ltf/a;LIl/a;Lsf/c;LaA/a;Lug/k;LLn/h;Lig/a;)V", "Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "Llm/a$c;", "fulfilmentOption", "LXH/N;", "Z", "(Lcom/ingka/ikea/app/base/ProductKey;Llm/a$c;)V", "LLn/d;", "cartItem", "O", "(LLn/d;)V", "", "productNo", "X", "(Ljava/lang/String;)V", "K", "Lip/l;", "Lig/a$a;", "", "availability", "", "isUpdatingCart", "T", "(Lip/l;Z)Z", "hasUnavailableItems", "loading", "Y", "(Lip/l;ZZ)Z", "throwable", "productName", "P", "(Ljava/lang/Throwable;Llm/a$c;Lcom/ingka/ikea/app/base/ProductKey;Ljava/lang/String;)V", "Lsf/d;", "preferredDeliveryOption", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LEB/d;", "storeSelection", "L", "(Lsf/d;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;LEB/d;)Llm/a$c;", "Q", "(Lsf/d;)Z", "Lhg/i$a;", "action", "U", "(Lhg/i$a;)V", "W", "(Llm/a$c;Lcom/ingka/ikea/app/base/ProductKey;Ljava/lang/String;)V", "V", "()V", "m", "Llm/a;", "n", "Llm/f;", "o", "Ltf/a;", "p", "LIl/a;", "q", "Lsf/c;", "r", "LaA/a;", "s", "Lug/k;", "LTJ/B;", "", "t", "LTJ/B;", "backInStockNotificationSignUps", "Lhg/i$c;", "u", "navigationEvent", "Lhg/i$b;", "v", "snackbarMessage", "LTJ/P;", "Lhg/i$d;", "w", "LTJ/P;", "N", "()LTJ/P;", "unavailableItemsUiState", "S", "()Z", "isHomeDeliveryBackInStockEnabled", "R", "isClickAndCollectBackInStockEnabled", "M", "()Lsf/d;", "preferredDelivery", "a", "c", "b", "d", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hg.i  reason: case insensitive filesystem */
public final class C9800i extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C11550a f73652m;

    /* renamed from: n  reason: collision with root package name */
    private final lm.f f73653n;

    /* renamed from: o  reason: collision with root package name */
    private final C10253a f73654o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Il.a f73655p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C10242c f73656q;

    /* renamed from: r  reason: collision with root package name */
    private final C13909a f73657r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final k f73658s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<List<String>> f73659t;

    /* renamed from: u  reason: collision with root package name */
    private final C16505B<c> f73660u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<b> f73661v;

    /* renamed from: w  reason: collision with root package name */
    private final C16519P<d> f73662w;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lhg/i$a;", "", "<init>", "()V", "a", "Lhg/i$a$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.i$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhg/i$a$a;", "Lhg/i$a;", "LLn/d;", "item", "<init>", "(LLn/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLn/d;", "()LLn/d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.i$a$a  reason: collision with other inner class name */
        public static final class C1288a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Ln.d f73663a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1288a(Ln.d dVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(dVar, "item");
                this.f73663a = dVar;
            }

            public final Ln.d a() {
                return this.f73663a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1288a) && C17542s.e(this.f73663a, ((C1288a) obj).f73663a);
            }

            public int hashCode() {
                return this.f73663a.hashCode();
            }

            public String toString() {
                Ln.d dVar = this.f73663a;
                return "SignUpBackInStock(item=" + dVar + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lhg/i$c;", "", "<init>", "()V", "c", "a", "b", "Lhg/i$c$a;", "Lhg/i$c$b;", "Lhg/i$c$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.i$c */
    public static abstract class c {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lhg/i$c$a;", "Lhg/i$c;", "Llm/a$c;", "fulfilmentOption", "Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "<init>", "(Llm/a$c;Lcom/ingka/ikea/app/base/ProductKey;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llm/a$c;", "()Llm/a$c;", "b", "Lcom/ingka/ikea/app/base/ProductKey;", "()Lcom/ingka/ikea/app/base/ProductKey;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.i$c$a */
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final C11550a.c f73672a;

            /* renamed from: b  reason: collision with root package name */
            private final ProductKey f73673b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C11550a.c cVar, ProductKey productKey) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, "fulfilmentOption");
                C17542s.j(productKey, "productKey");
                this.f73672a = cVar;
                this.f73673b = productKey;
            }

            public final C11550a.c a() {
                return this.f73672a;
            }

            public final ProductKey b() {
                return this.f73673b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f73672a, aVar.f73672a) && C17542s.e(this.f73673b, aVar.f73673b);
            }

            public int hashCode() {
                return (this.f73672a.hashCode() * 31) + this.f73673b.hashCode();
            }

            public String toString() {
                C11550a.c cVar = this.f73672a;
                ProductKey productKey = this.f73673b;
                return "OpenBackInStockExplanation(fulfilmentOption=" + cVar + ", productKey=" + productKey + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhg/i$c$b;", "Lhg/i$c;", "Llm/a$c;", "fulfilmentOption", "", "productTitle", "Lcom/ingka/ikea/app/base/ProductKey;", "productKey", "<init>", "(Llm/a$c;Ljava/lang/String;Lcom/ingka/ikea/app/base/ProductKey;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llm/a$c;", "()Llm/a$c;", "b", "Ljava/lang/String;", "c", "Lcom/ingka/ikea/app/base/ProductKey;", "()Lcom/ingka/ikea/app/base/ProductKey;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.i$c$b */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final C11550a.c f73674a;

            /* renamed from: b  reason: collision with root package name */
            private final String f73675b;

            /* renamed from: c  reason: collision with root package name */
            private final ProductKey f73676c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C11550a.c cVar, String str, ProductKey productKey) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, "fulfilmentOption");
                C17542s.j(str, "productTitle");
                C17542s.j(productKey, "productKey");
                this.f73674a = cVar;
                this.f73675b = str;
                this.f73676c = productKey;
            }

            public final C11550a.c a() {
                return this.f73674a;
            }

            public final ProductKey b() {
                return this.f73676c;
            }

            public final String c() {
                return this.f73675b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f73674a, bVar.f73674a) && C17542s.e(this.f73675b, bVar.f73675b) && C17542s.e(this.f73676c, bVar.f73676c);
            }

            public int hashCode() {
                return (((this.f73674a.hashCode() * 31) + this.f73675b.hashCode()) * 31) + this.f73676c.hashCode();
            }

            public String toString() {
                C11550a.c cVar = this.f73674a;
                String str = this.f73675b;
                ProductKey productKey = this.f73676c;
                return "OpenLegacyBackInStock(fulfilmentOption=" + cVar + ", productTitle=" + str + ", productKey=" + productKey + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lhg/i$c$c;", "Lhg/i$c;", "LBx/a$a;", "promotionMode", "<init>", "(LBx/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LBx/a$a;", "getPromotionMode", "()LBx/a$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.i$c$c  reason: collision with other inner class name */
        public static final class C1290c extends c {

            /* renamed from: a  reason: collision with root package name */
            private final a.C2584a f73677a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1290c(a.C2584a aVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(aVar, "promotionMode");
                this.f73677a = aVar;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1290c) && this.f73677a == ((C1290c) obj).f73677a;
            }

            public int hashCode() {
                return this.f73677a.hashCode();
            }

            public String toString() {
                a.C2584a aVar = this.f73677a;
                return "ShowLoginSignupPromotion(promotionMode=" + aVar + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.i$e */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f73685a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                sf.d[] r0 = sf.C10243d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                sf.d r1 = sf.C10243d.HOME     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                sf.d r1 = sf.C10243d.CLICK_AND_COLLECT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f73685a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.C9800i.e.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"hg/i$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.i$f */
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C9800i f73686a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ProductKey f73687b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C11550a.c f73688c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f73689d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, C9800i iVar, ProductKey productKey, C11550a.c cVar, String str) {
            super(aVar);
            this.f73686a = iVar;
            this.f73687b = productKey;
            this.f73688c = cVar;
            this.f73689d = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C9800i iVar2 = this.f73686a;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Unable to register back in stock push", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = iVar2.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f73686a.K(this.f73687b.getProductNo());
            this.f73686a.P(th2, this.f73688c, this.f73687b, this.f73689d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.CartItemsAvailabilityViewModel$registerBackInStockPushNotification$3", f = "CartItemsAvailabilityViewModel.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: hg.i$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f73690c;

        /* renamed from: d  reason: collision with root package name */
        Object f73691d;

        /* renamed from: e  reason: collision with root package name */
        Object f73692e;

        /* renamed from: f  reason: collision with root package name */
        int f73693f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C9800i f73694g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ ProductKey f73695h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C11550a.c f73696i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C9800i iVar, ProductKey productKey, C11550a.c cVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f73694g = iVar;
            this.f73695h = productKey;
            this.f73696i = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f73694g, this.f73695h, this.f73696i, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f73693f;
            if (i10 == 0) {
                y.b(obj);
                C11550a k10 = this.f73694g.f73652m;
                String productNo = this.f73695h.getProductNo();
                String productType = this.f73695h.getProductType();
                C11550a.c cVar = this.f73696i;
                this.f73690c = k10;
                this.f73691d = productNo;
                this.f73692e = productType;
                this.f73693f = 1;
                obj = C11550a.b.a(k10, cVar, (C11550a.C2253a) null, productNo, productType, this, 2, (Object) null);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str = (String) this.f73692e;
                String str2 = (String) this.f73691d;
                C11550a aVar = (C11550a) this.f73690c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int intValue = ((Number) obj).intValue();
            this.f73694g.K(this.f73695h.getProductNo());
            this.f73694g.f73661v.setValue(new b(C13026h.a(intValue), J0.Indefinite, (b.a) null, 4, (DefaultConstructorMarker) null));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.i$h */
    public static final class h implements C16532g<d> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f73697a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C9800i f73698b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: hg.i$h$a */
        static final class a extends C17544u implements C17631a<Object[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f73699c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C16532g[] gVarArr) {
                super(0);
                this.f73699c = gVarArr;
            }

            /* renamed from: b */
            public final Object[] invoke() {
                return new Object[this.f73699c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.CartItemsAvailabilityViewModel$special$$inlined$combine$1$3", f = "CartItemsAvailabilityViewModel.kt", l = {238}, m = "invokeSuspend")
        /* renamed from: hg.i$h$b */
        public static final class b extends l implements q<C16533h<? super d>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f73700c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f73701d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f73702e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C9800i f73703f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17164e eVar, C9800i iVar) {
                super(3, eVar);
                this.f73703f = iVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super d> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar, this.f73703f);
                bVar.f73701d = hVar;
                bVar.f73702e = objArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
                r11 = hg.C9794c.p((r11 = r10.b()), r6, true, hg.C9800i.E(r0.f73703f));
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r27) {
                /*
                    r26 = this;
                    r0 = r26
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f73700c
                    r3 = 1
                    if (r2 == 0) goto L_0x001a
                    if (r2 != r3) goto L_0x0012
                    XH.y.b(r27)
                    goto L_0x0239
                L_0x0012:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x001a:
                    XH.y.b(r27)
                    java.lang.Object r2 = r0.f73701d
                    TJ.h r2 = (TJ.C16533h) r2
                    java.lang.Object r4 = r0.f73702e
                    java.lang.Object[] r4 = (java.lang.Object[]) r4
                    r5 = 0
                    r6 = r4[r5]
                    r7 = r4[r3]
                    r8 = 2
                    r9 = r4[r8]
                    r10 = 3
                    r10 = r4[r10]
                    r11 = 4
                    r11 = r4[r11]
                    r12 = 5
                    r4 = r4[r12]
                    r19 = r4
                    hg.i$b r19 = (hg.C9800i.b) r19
                    r18 = r11
                    hg.i$c r18 = (hg.C9800i.c) r18
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    r10.booleanValue()
                    java.util.List r9 = (java.util.List) r9
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r4 = r7.booleanValue()
                    ip.l r6 = (ip.l) r6
                    if (r6 == 0) goto L_0x0076
                    boolean r10 = r6 instanceof ip.l.a
                    if (r10 == 0) goto L_0x0054
                    goto L_0x0076
                L_0x0054:
                    boolean r10 = r6 instanceof ip.l.b
                    if (r10 == 0) goto L_0x0062
                    r10 = r6
                    ip.l$b r10 = (ip.l.b) r10
                    java.lang.Object r10 = r10.a()
                    ig.a$a r10 = (ig.C9845a.C1326a) r10
                    goto L_0x0077
                L_0x0062:
                    boolean r10 = r6 instanceof ip.l.c
                    if (r10 == 0) goto L_0x0070
                    r10 = r6
                    ip.l$c r10 = (ip.l.c) r10
                    java.lang.Object r10 = r10.a()
                    ig.a$a r10 = (ig.C9845a.C1326a) r10
                    goto L_0x0077
                L_0x0070:
                    XH.t r1 = new XH.t
                    r1.<init>()
                    throw r1
                L_0x0076:
                    r10 = 0
                L_0x0077:
                    if (r10 == 0) goto L_0x0094
                    java.util.List r11 = r10.b()
                    if (r11 == 0) goto L_0x0094
                    hg.i r12 = r0.f73703f
                    sf.d r12 = r12.M()
                    java.util.Map r11 = hg.C9794c.p(r11, r6, r3, r12)
                    if (r11 == 0) goto L_0x0094
                    hg.J$a r12 = hg.J.a.UNAVAILABLE
                    java.lang.Object r11 = r11.get(r12)
                    java.util.List r11 = (java.util.List) r11
                    goto L_0x0095
                L_0x0094:
                    r11 = 0
                L_0x0095:
                    r12 = r11
                    java.util.Collection r12 = (java.util.Collection) r12
                    if (r12 == 0) goto L_0x00a3
                    boolean r12 = r12.isEmpty()
                    if (r12 == 0) goto L_0x00a1
                    goto L_0x00a3
                L_0x00a1:
                    r12 = r5
                    goto L_0x00a4
                L_0x00a3:
                    r12 = r3
                L_0x00a4:
                    r12 = r12 ^ r3
                    if (r10 == 0) goto L_0x00b6
                    java.util.List r13 = r10.b()
                    if (r13 == 0) goto L_0x00b6
                    int r13 = r13.size()
                    java.lang.Integer r13 = kotlin.coroutines.jvm.internal.b.e(r13)
                    goto L_0x00b7
                L_0x00b6:
                    r13 = 0
                L_0x00b7:
                    if (r11 == 0) goto L_0x00be
                    int r14 = r11.size()
                    goto L_0x00bf
                L_0x00be:
                    r14 = r5
                L_0x00bf:
                    ip.i.c(r13, r14)
                    hg.i r13 = r0.f73703f
                    boolean r13 = r13.T(r6, r4)
                    hg.i r4 = r0.f73703f
                    boolean r4 = r4.Y(r6, r12, r13)
                    hg.i r6 = r0.f73703f
                    qv.e r12 = qv.e.DEBUG
                    qv.d r14 = qv.d.f102012a
                    java.util.List r14 = r14.a()
                    java.lang.Iterable r14 = (java.lang.Iterable) r14
                    java.util.ArrayList r15 = new java.util.ArrayList
                    r15.<init>()
                    java.util.Iterator r14 = r14.iterator()
                L_0x00e3:
                    boolean r16 = r14.hasNext()
                    if (r16 == 0) goto L_0x00fb
                    java.lang.Object r3 = r14.next()
                    r7 = r3
                    qv.b r7 = (qv.C11819b) r7
                    boolean r7 = r7.b(r12, r5)
                    if (r7 == 0) goto L_0x00f9
                    r15.add(r3)
                L_0x00f9:
                    r3 = 1
                    goto L_0x00e3
                L_0x00fb:
                    java.util.Iterator r3 = r15.iterator()
                    r5 = 0
                    r7 = 0
                L_0x0101:
                    boolean r14 = r3.hasNext()
                    if (r14 == 0) goto L_0x0129
                    java.lang.Object r14 = r3.next()
                    r20 = r14
                    qv.b r20 = (qv.C11819b) r20
                    r14 = 0
                    if (r5 != 0) goto L_0x0130
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r15 = "Unavailable items, should pop back stack: "
                    r5.append(r15)
                    r5.append(r4)
                    java.lang.String r5 = r5.toString()
                    java.lang.String r5 = qv.C11818a.a(r5, r14)
                    if (r5 != 0) goto L_0x012c
                L_0x0129:
                    r14 = 0
                    goto L_0x019a
                L_0x012c:
                    java.lang.String r5 = qv.C11820c.a(r5)
                L_0x0130:
                    if (r7 != 0) goto L_0x0184
                    java.lang.Class r7 = r6.getClass()
                    java.lang.String r7 = r7.getName()
                    kotlin.jvm.internal.C17542s.g(r7)
                    r15 = 36
                    r14 = 0
                    java.lang.String r15 = HJ.C15854t.s1(r7, r15, r14, r8, r14)
                    r27 = r3
                    r3 = 46
                    java.lang.String r3 = HJ.C15854t.o1(r15, r3, r14, r8, r14)
                    int r15 = r3.length()
                    if (r15 != 0) goto L_0x0153
                    goto L_0x0159
                L_0x0153:
                    java.lang.String r7 = "Kt"
                    java.lang.String r7 = HJ.C15854t.P0(r3, r7)
                L_0x0159:
                    java.lang.Thread r3 = java.lang.Thread.currentThread()
                    java.lang.String r3 = r3.getName()
                    java.lang.String r15 = "main"
                    r8 = 1
                    boolean r3 = HJ.C15854t.b0(r3, r15, r8)
                    if (r3 == 0) goto L_0x016d
                    java.lang.String r3 = "m"
                    goto L_0x016f
                L_0x016d:
                    java.lang.String r3 = "b"
                L_0x016f:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r3)
                    java.lang.String r3 = "|"
                    r8.append(r3)
                    r8.append(r7)
                    java.lang.String r7 = r8.toString()
                    goto L_0x0187
                L_0x0184:
                    r27 = r3
                    r14 = 0
                L_0x0187:
                    r23 = 0
                    r21 = r12
                    r22 = r7
                    r3 = 0
                    r24 = r3
                    r25 = r5
                    r20.a(r21, r22, r23, r24, r25)
                    r3 = r27
                    r8 = 2
                    goto L_0x0101
                L_0x019a:
                    if (r11 == 0) goto L_0x01f9
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.ArrayList r3 = new java.util.ArrayList
                    r5 = 10
                    int r5 = YH.C16877v.y(r11, r5)
                    r3.<init>(r5)
                    java.util.Iterator r5 = r11.iterator()
                L_0x01ad:
                    boolean r6 = r5.hasNext()
                    if (r6 == 0) goto L_0x01f7
                    java.lang.Object r6 = r5.next()
                    hg.h r6 = (hg.C9799h) r6
                    Ln.d r20 = r6.b()
                    hg.i r7 = r0.f73703f
                    Il.a r7 = r7.f73655p
                    kp.d r21 = r7.s()
                    hg.i r7 = r0.f73703f
                    sf.d r8 = r7.M()
                    boolean r22 = r7.Q(r8)
                    Ln.d r7 = r6.b()
                    java.lang.String r7 = r7.j()
                    boolean r23 = r9.contains(r7)
                    hg.i r7 = r0.f73703f
                    Il.a r7 = r7.f73655p
                    boolean r24 = r7.w()
                    hg.J r6 = r6.a()
                    int r25 = r6.a()
                    Op.a1 r6 = hg.C9801j.a(r20, r21, r22, r23, r24, r25)
                    r3.add(r6)
                    goto L_0x01ad
                L_0x01f7:
                    r15 = r3
                    goto L_0x01fe
                L_0x01f9:
                    java.util.List r3 = YH.C16877v.n()
                    goto L_0x01f7
                L_0x01fe:
                    if (r10 == 0) goto L_0x021b
                    hg.i r3 = r0.f73703f
                    sf.d r5 = r3.M()
                    hg.i r6 = r0.f73703f
                    sf.c r6 = r6.f73656q
                    com.ingka.ikea.app.base.UserPostalCodeAddress r6 = r6.l()
                    EB.d r7 = r10.d()
                    lm.a$c r3 = r3.L(r5, r6, r7)
                    r16 = r3
                    goto L_0x021d
                L_0x021b:
                    r16 = r14
                L_0x021d:
                    hg.i r3 = r0.f73703f
                    ug.k r3 = r3.f73658s
                    boolean r14 = r3.m()
                    hg.i$d r3 = new hg.i$d
                    r12 = r3
                    r17 = r4
                    r12.<init>(r13, r14, r15, r16, r17, r18, r19)
                    r4 = 1
                    r0.f73700c = r4
                    java.lang.Object r2 = r2.emit(r3, r0)
                    if (r2 != r1) goto L_0x0239
                    return r1
                L_0x0239:
                    XH.N r1 = XH.C16807N.f139792a
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: hg.C9800i.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public h(C16532g[] gVarArr, C9800i iVar) {
            this.f73697a = gVarArr;
            this.f73698b = iVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f73697a;
            Object a10 = C16619l.a(hVar, gVarArr, new a(gVarArr), new b((C17164e) null, this.f73698b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    public C9800i(C11550a aVar, lm.f fVar, C10253a aVar2, Il.a aVar3, C10242c cVar, C13909a aVar4, k kVar, Ln.h hVar, C9845a aVar5) {
        C11550a aVar6 = aVar;
        lm.f fVar2 = fVar;
        C10253a aVar7 = aVar2;
        Il.a aVar8 = aVar3;
        C10242c cVar2 = cVar;
        C13909a aVar9 = aVar4;
        k kVar2 = kVar;
        C17542s.j(aVar6, "backInStockApi");
        C17542s.j(fVar2, "backInStockNotificationAnalytics");
        C17542s.j(aVar7, "killSwitchRepository");
        C17542s.j(aVar8, "appConfigApi");
        C17542s.j(cVar2, "appUserDataRepository");
        C17542s.j(aVar9, "sessionManager");
        C17542s.j(kVar2, "labsFeatures");
        C17542s.j(hVar, "cartRepository");
        C17542s.j(aVar5, "getCartItemAvailabilityUseCase");
        this.f73652m = aVar6;
        this.f73653n = fVar2;
        this.f73654o = aVar7;
        this.f73655p = aVar8;
        this.f73656q = cVar2;
        this.f73657r = aVar9;
        this.f73658s = kVar2;
        C16505B<List<String>> a10 = C16521S.a(C16877v.n());
        this.f73659t = a10;
        C16505B<c> a11 = C16521S.a(null);
        this.f73660u = a11;
        C16505B<b> a12 = C16521S.a(null);
        this.f73661v = a12;
        this.f73662w = C16534i.c0(new h(new C16532g[]{aVar5.invoke(), hVar.k(), a10, aVar2.L(), a11, a12}, this), g0.a(this), ip.f.a(), new d(true, false, (List) null, (C11550a.c) null, false, (c) null, (b) null, 126, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final void K(String str) {
        List<String> value;
        C16505B<List<String>> b10 = this.f73659t;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C16877v.S0(value, str)));
    }

    /* access modifiers changed from: private */
    public final C11550a.c L(C10243d dVar, UserPostalCodeAddress userPostalCodeAddress, C12832d dVar2) {
        String str;
        char c10;
        String d10;
        int i10 = dVar == null ? -1 : e.f73685a[dVar.ordinal()];
        String str2 = null;
        if (i10 != -1) {
            String str3 = DslKt.INDICATOR_BACKGROUND;
            char c11 = '$';
            Class<C9800i> cls = C9800i.class;
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new t();
                } else if (dVar2 != null) {
                    return new C11550a.c.b(dVar2.e(), dVar2.getName());
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("No store selected for click and collect?");
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
                            if (a10 == null) {
                                return null;
                            }
                            str4 = C11820c.a(a10);
                        }
                        String str6 = str4;
                        if (str5 == null) {
                            String name = cls.getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str7 = str5;
                        bVar.a(eVar, str7, false, illegalStateException, str6);
                        str5 = str7;
                        str4 = str6;
                        eVar = eVar;
                        c11 = '$';
                    }
                    return null;
                }
            } else if (userPostalCodeAddress != null && (d10 = userPostalCodeAddress.d()) != null) {
                return new C11550a.c.C2258c(d10, userPostalCodeAddress.c());
            } else {
                IllegalStateException illegalStateException2 = new IllegalStateException("No zip code selected for home delivery?");
                qv.e eVar2 = qv.e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str8 == null) {
                        String a11 = C11818a.a(str2, illegalStateException2);
                        if (a11 == null) {
                            break;
                        }
                        str8 = C11820c.a(a11);
                    }
                    if (str9 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        c10 = '$';
                        str = str3;
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', str2, 2, str2), '.', str2, 2, str2);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    } else {
                        str = str3;
                        c10 = '$';
                    }
                    String str10 = str9;
                    char c12 = c10;
                    bVar2.a(eVar2, str10, false, illegalStateException2, str8);
                    str9 = str10;
                    str3 = str;
                    str2 = null;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public final C10243d M() {
        C10243d q10 = this.f73656q.q();
        return q10 == null ? C10243d.HOME : q10;
    }

    private final void O(Ln.d dVar) {
        String str;
        String str2;
        if (!this.f73657r.isLoggedIn()) {
            this.f73660u.setValue(new c.C1290c(a.C2584a.BACK_IN_STOCK_NOTIFICATIONS));
            return;
        }
        C11550a.c a10 = this.f73662w.getValue().a();
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        Class<C9800i> cls = C9800i.class;
        if (a10 == null || C15854t.v0(a10.a())) {
            String str5 = str3;
            String str6 = str4;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Fulfilment has not set storeId or zipCode correctly");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar : arrayList) {
                if (str7 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 != null) {
                        str7 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str8 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str6 : str5) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str8, false, illegalArgumentException, str7);
            }
            return;
        }
        ProductKey productKey = new ProductKey(dVar.j(), dVar.k());
        boolean b10 = this.f73652m.b();
        qv.e eVar2 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList2 = new ArrayList<>();
        for (Object next2 : qv.d.f102012a.a()) {
            if (((C11819b) next2).b(eVar2, false)) {
                arrayList2.add(next2);
            }
        }
        String str9 = null;
        String str10 = null;
        for (C11819b bVar2 : arrayList2) {
            if (str9 == null) {
                String a12 = C11818a.a("Handle back in stock, using push: " + b10, (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str9 = C11820c.a(a12);
            }
            if (str10 == null) {
                String name2 = cls.getName();
                C17542s.g(name2);
                str = str3;
                str2 = str4;
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                str10 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str2 : str) + DslKt.INDICATOR_SEPARATOR + name2;
            } else {
                str = str3;
                str2 = str4;
            }
            qv.e eVar3 = eVar2;
            bVar2.a(eVar3, str10, false, (Throwable) null, str9);
            eVar2 = eVar3;
            str3 = str;
            str4 = str2;
        }
        if (!b10) {
            this.f73660u.setValue(new c.b(a10, dVar.i().i(), productKey));
        } else if (this.f73652m.d()) {
            this.f73660u.setValue(new c.a(a10, productKey));
        } else {
            W(a10, productKey, dVar.i().i());
        }
        Z(productKey, a10);
    }

    /* access modifiers changed from: private */
    public final void P(Throwable th2, C11550a.c cVar, ProductKey productKey, String str) {
        lm.b bVar = th2 instanceof lm.b ? (lm.b) th2 : null;
        if (bVar instanceof b.e) {
            this.f73660u.setValue(new c.b(cVar, str, productKey));
        } else if ((bVar instanceof b.f) || (bVar instanceof b.d) || (bVar instanceof b.c) || (bVar instanceof b.C2260b)) {
            boolean z10 = th2 instanceof b.C2260b;
            C11550a aVar = this.f73652m;
            C17542s.h(th2, "null cannot be cast to non-null type com.ingka.ikea.backinstock.BackInStockException");
            C13023e a10 = aVar.a((lm.b) th2, cVar, str);
            if (z10) {
                this.f73661v.setValue(new b(a10, J0.Long, new b.a.C1289a(C13026h.a(Oo.b.f84719m9), productKey.getProductNo(), Interaction$Component.BACK_IN_STOCK_NOTIFY_ME)));
            } else {
                this.f73661v.setValue(new b(a10, J0.Indefinite, (b.a) null, 4, (DefaultConstructorMarker) null));
            }
        } else if (C17542s.e(bVar, b.a.f99215a) || bVar == null) {
            this.f73661v.setValue(new b(C13026h.a(Oo.b.f84398I0), J0.Indefinite, (b.a) null, 4, (DefaultConstructorMarker) null));
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final boolean Q(C10243d dVar) {
        int i10 = e.f73685a[dVar.ordinal()];
        if (i10 == 1) {
            return S();
        }
        if (i10 == 2) {
            return R();
        }
        throw new t();
    }

    private final boolean R() {
        return this.f73654o.d();
    }

    private final boolean S() {
        return this.f73654o.k();
    }

    /* access modifiers changed from: private */
    public final boolean T(ip.l<C9845a.C1326a, Throwable> lVar, boolean z10) {
        return z10 || (lVar instanceof l.b);
    }

    private final void X(String str) {
        List<String> value;
        C16505B<List<String>> b10 = this.f73659t;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C16877v.W0(value, str)));
    }

    /* access modifiers changed from: private */
    public final boolean Y(ip.l<C9845a.C1326a, Throwable> lVar, boolean z10, boolean z11) {
        if (!(lVar instanceof l.b) && lVar != null) {
            if ((lVar instanceof l.a) || (lVar instanceof l.c)) {
                return !z10 && !z11;
            }
            throw new t();
        }
    }

    private final void Z(ProductKey productKey, C11550a.c cVar) {
        this.f73653n.a(productKey.getProductNo(), cVar, "cart_unavailable_item");
    }

    public final C16519P<d> N() {
        return this.f73662w;
    }

    public final void U(a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.C1288a) {
            O(((a.C1288a) aVar).a());
            return;
        }
        throw new t();
    }

    public final void V() {
        this.f73660u.setValue(null);
    }

    public final void W(C11550a.c cVar, ProductKey productKey, String str) {
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(productKey, "productKey");
        C17542s.j(str, "productName");
        if (cVar.a().length() == 0) {
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Trying to register for back in stock with a blank storeId or zipCode", (Throwable) null);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                if (str3 == null) {
                    String name = C9800i.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str3, false, (Throwable) null, str2);
            }
            return;
        }
        X(productKey.getProductNo());
        F0 unused = C16314k.d(g0.a(this), new f(N.f137593c0, this, productKey, cVar, str), (T) null, new g(this, productKey, cVar, (C17164e<? super g>) null), 2, (Object) null);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lhg/i$b;", "", "LIC/e;", "message", "LO0/J0;", "duration", "Lhg/i$b$a;", "action", "<init>", "(LIC/e;LO0/J0;Lhg/i$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "c", "()LIC/e;", "b", "LO0/J0;", "()LO0/J0;", "Lhg/i$b$a;", "()Lhg/i$b$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.i$b */
    public static final class b {

        /* renamed from: d  reason: collision with root package name */
        public static final int f73664d = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f73665a;

        /* renamed from: b  reason: collision with root package name */
        private final J0 f73666b;

        /* renamed from: c  reason: collision with root package name */
        private final a f73667c;

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lhg/i$b$a;", "", "<init>", "()V", "a", "Lhg/i$b$a$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hg.i$b$a */
        public static abstract class a {

            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lhg/i$b$a$a;", "Lhg/i$b$a;", "LIC/e;", "text", "", "itemNo", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "<init>", "(LIC/e;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "c", "()LIC/e;", "b", "Ljava/lang/String;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hg.i$b$a$a  reason: collision with other inner class name */
            public static final class C1289a extends a {

                /* renamed from: d  reason: collision with root package name */
                public static final int f73668d = C13023e.f110931a;

                /* renamed from: a  reason: collision with root package name */
                private final C13023e f73669a;

                /* renamed from: b  reason: collision with root package name */
                private final String f73670b;

                /* renamed from: c  reason: collision with root package name */
                private final Interaction$Component f73671c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1289a(C13023e eVar, String str, Interaction$Component interaction$Component) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(eVar, "text");
                    C17542s.j(str, "itemNo");
                    C17542s.j(interaction$Component, "component");
                    this.f73669a = eVar;
                    this.f73670b = str;
                    this.f73671c = interaction$Component;
                }

                public final Interaction$Component a() {
                    return this.f73671c;
                }

                public final String b() {
                    return this.f73670b;
                }

                public final C13023e c() {
                    return this.f73669a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1289a)) {
                        return false;
                    }
                    C1289a aVar = (C1289a) obj;
                    return C17542s.e(this.f73669a, aVar.f73669a) && C17542s.e(this.f73670b, aVar.f73670b) && this.f73671c == aVar.f73671c;
                }

                public int hashCode() {
                    return (((this.f73669a.hashCode() * 31) + this.f73670b.hashCode()) * 31) + this.f73671c.hashCode();
                }

                public String toString() {
                    C13023e eVar = this.f73669a;
                    String str = this.f73670b;
                    Interaction$Component interaction$Component = this.f73671c;
                    return "OpenPipPage(text=" + eVar + ", itemNo=" + str + ", component=" + interaction$Component + ")";
                }
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public b(C13023e eVar, J0 j02, a aVar) {
            C17542s.j(eVar, "message");
            C17542s.j(j02, "duration");
            this.f73665a = eVar;
            this.f73666b = j02;
            this.f73667c = aVar;
        }

        public final a a() {
            return this.f73667c;
        }

        public final J0 b() {
            return this.f73666b;
        }

        public final C13023e c() {
            return this.f73665a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f73665a, bVar.f73665a) && this.f73666b == bVar.f73666b && C17542s.e(this.f73667c, bVar.f73667c);
        }

        public int hashCode() {
            int hashCode = ((this.f73665a.hashCode() * 31) + this.f73666b.hashCode()) * 31;
            a aVar = this.f73667c;
            return hashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            C13023e eVar = this.f73665a;
            J0 j02 = this.f73666b;
            a aVar = this.f73667c;
            return "Message(message=" + eVar + ", duration=" + j02 + ", action=" + aVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C13023e eVar, J0 j02, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(eVar, j02, (i10 & 4) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001e\u0010!R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001a\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010&\u001a\u0004\b\"\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006+"}, d2 = {"Lhg/i$d;", "", "", "loading", "showReplacementRecommendations", "", "LOp/a1;", "items", "Llm/a$c;", "backInStockFulfilmentOption", "popBackStack", "Lhg/i$c;", "navigationEvent", "Lhg/i$b;", "snackbarMessage", "<init>", "(ZZLjava/util/List;Llm/a$c;ZLhg/i$c;Lhg/i$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "f", "Ljava/util/List;", "()Ljava/util/List;", "d", "Llm/a$c;", "()Llm/a$c;", "e", "Lhg/i$c;", "()Lhg/i$c;", "g", "Lhg/i$b;", "()Lhg/i$b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: hg.i$d */
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f73678a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f73679b;

        /* renamed from: c  reason: collision with root package name */
        private final List<a1> f73680c;

        /* renamed from: d  reason: collision with root package name */
        private final C11550a.c f73681d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f73682e;

        /* renamed from: f  reason: collision with root package name */
        private final c f73683f;

        /* renamed from: g  reason: collision with root package name */
        private final b f73684g;

        public d(boolean z10, boolean z11, List<a1> list, C11550a.c cVar, boolean z12, c cVar2, b bVar) {
            C17542s.j(list, "items");
            this.f73678a = z10;
            this.f73679b = z11;
            this.f73680c = list;
            this.f73681d = cVar;
            this.f73682e = z12;
            this.f73683f = cVar2;
            this.f73684g = bVar;
        }

        public final C11550a.c a() {
            return this.f73681d;
        }

        public final List<a1> b() {
            return this.f73680c;
        }

        public final boolean c() {
            return this.f73678a;
        }

        public final c d() {
            return this.f73683f;
        }

        public final boolean e() {
            return this.f73682e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f73678a == dVar.f73678a && this.f73679b == dVar.f73679b && C17542s.e(this.f73680c, dVar.f73680c) && C17542s.e(this.f73681d, dVar.f73681d) && this.f73682e == dVar.f73682e && C17542s.e(this.f73683f, dVar.f73683f) && C17542s.e(this.f73684g, dVar.f73684g);
        }

        public final boolean f() {
            return this.f73679b;
        }

        public final b g() {
            return this.f73684g;
        }

        public int hashCode() {
            int hashCode = ((((Boolean.hashCode(this.f73678a) * 31) + Boolean.hashCode(this.f73679b)) * 31) + this.f73680c.hashCode()) * 31;
            C11550a.c cVar = this.f73681d;
            int i10 = 0;
            int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.f73682e)) * 31;
            c cVar2 = this.f73683f;
            int hashCode3 = (hashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
            b bVar = this.f73684g;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            boolean z10 = this.f73678a;
            boolean z11 = this.f73679b;
            List<a1> list = this.f73680c;
            C11550a.c cVar = this.f73681d;
            boolean z12 = this.f73682e;
            c cVar2 = this.f73683f;
            b bVar = this.f73684g;
            return "UiState(loading=" + z10 + ", showReplacementRecommendations=" + z11 + ", items=" + list + ", backInStockFulfilmentOption=" + cVar + ", popBackStack=" + z12 + ", navigationEvent=" + cVar2 + ", snackbarMessage=" + bVar + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ d(boolean r8, boolean r9, java.util.List r10, lm.C11550a.c r11, boolean r12, hg.C9800i.c r13, hg.C9800i.b r14, int r15, kotlin.jvm.internal.DefaultConstructorMarker r16) {
            /*
                r7 = this;
                r0 = r15 & 2
                r1 = 0
                if (r0 == 0) goto L_0x0007
                r0 = r1
                goto L_0x0008
            L_0x0007:
                r0 = r9
            L_0x0008:
                r2 = r15 & 4
                if (r2 == 0) goto L_0x0011
                java.util.List r2 = YH.C16877v.n()
                goto L_0x0012
            L_0x0011:
                r2 = r10
            L_0x0012:
                r3 = r15 & 8
                r4 = 0
                if (r3 == 0) goto L_0x0019
                r3 = r4
                goto L_0x001a
            L_0x0019:
                r3 = r11
            L_0x001a:
                r5 = r15 & 16
                if (r5 == 0) goto L_0x001f
                goto L_0x0020
            L_0x001f:
                r1 = r12
            L_0x0020:
                r5 = r15 & 32
                if (r5 == 0) goto L_0x0026
                r5 = r4
                goto L_0x0027
            L_0x0026:
                r5 = r13
            L_0x0027:
                r6 = r15 & 64
                if (r6 == 0) goto L_0x002c
                goto L_0x002d
            L_0x002c:
                r4 = r14
            L_0x002d:
                r9 = r7
                r10 = r8
                r11 = r0
                r12 = r2
                r13 = r3
                r14 = r1
                r15 = r5
                r16 = r4
                r9.<init>(r10, r11, r12, r13, r14, r15, r16)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.C9800i.d.<init>(boolean, boolean, java.util.List, lm.a$c, boolean, hg.i$c, hg.i$b, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
