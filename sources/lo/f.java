package lo;

import HJ.C15854t;
import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import Nn.C10799b;
import Nn.C10803f;
import Nn.C10804g;
import Nn.C10811n;
import Nn.G;
import Nn.I;
import Nn.K;
import Nn.Q;
import Nn.x;
import QJ.F0;
import QJ.N;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import Vn.b;
import Wn.s;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import go.U;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lo.e;
import lo.w;
import lo.x;
import nI.p;
import nI.q;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11848a;
import rv.C11849b;
import tI.C17978n;

@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 02\u00020\u0001:\u0003nopB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0018*\b\u0012\u0004\u0012\u00020\u00190\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020!2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u0018¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020!2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001d\u0010*\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010-\u001a\u00020,¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u0004\u0018\u00010\u00102\u0006\u0010/\u001a\u00020\u001a¢\u0006\u0004\b0\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010>\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u00188\u0002@\u0002X.¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010I\u001a\u00020,8\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010FR\u0016\u0010M\u001a\u0004\u0018\u00010J8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010O0N8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00120S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001d\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00120W8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bC\u0010ZR\u0016\u0010^\u001a\u0004\u0018\u00010\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R \u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180N8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010QR\u001c\u0010b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0N8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010QR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0N8\u0002X\u0004¢\u0006\u0006\n\u0004\bc\u0010QR \u0010g\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180d8\u0002X\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020i0h8\u0006¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\b2\u0010l¨\u0006q"}, d2 = {"Llo/f;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LIl/a;", "appConfigApi", "LNn/x;", "checkoutRepository", "LWn/b;", "analytics", "LWn/d;", "checkoutDevAnalytics", "LVn/b;", "selectEarliestTimeWindowUseCase", "<init>", "(Landroidx/lifecycle/U;LIl/a;LNn/x;LWn/b;LWn/d;LVn/b;)V", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$e;", "pickUpPointDelivery", "Llo/w;", "H", "(Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$e;)Llo/w;", "Llo/e$a;", "J", "()Llo/e$a;", "", "Llo/f$c;", "", "selectedPickupPointId", "selectingPickupPointId", "Lgo/U;", "M", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "pickUpPointDeliveries", "LXH/N;", "L", "(Ljava/util/List;)V", "Llo/f$a;", "action", "N", "(Llo/f$a;)V", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "O", "(Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$e;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;)V", "", "K", "()Z", "pickupPointId", "G", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$e;", "m", "LIl/a;", "n", "LNn/x;", "o", "LWn/b;", "p", "LWn/d;", "q", "LVn/b;", "r", "Ljava/lang/String;", "checkoutId", "s", "Ljava/util/List;", "", "t", "I", "deliveryPart", "u", "Z", "showSelected", "v", "showDeliveryPriceExclVat", "LNn/K;", "w", "LNn/K;", "selectedDeliveryServiceHolder", "LTJ/B;", "Llo/x;", "x", "LTJ/B;", "error", "Lip/b;", "y", "Lip/b;", "_onPupSelected", "Landroidx/lifecycle/F;", "z", "Landroidx/lifecycle/F;", "()Landroidx/lifecycle/F;", "onPupSelected", "A", "Llo/e$a;", "splitDeliveryDetails", "B", "pickupPointsModels", "C", "chosenPickupPointId", "D", "LTJ/g;", "E", "LTJ/g;", "uiData", "LTJ/P;", "Llo/e;", "F", "LTJ/P;", "()LTJ/P;", "uiState", "a", "c", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends f0 {

    /* renamed from: G  reason: collision with root package name */
    public static final b f99344G = new b((DefaultConstructorMarker) null);

    /* renamed from: H  reason: collision with root package name */
    public static final int f99345H = 8;
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public final e.a f99346A;

    /* renamed from: B  reason: collision with root package name */
    private final C16505B<List<c>> f99347B;

    /* renamed from: C  reason: collision with root package name */
    private final C16505B<String> f99348C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final C16505B<String> f99349D;

    /* renamed from: E  reason: collision with root package name */
    private final C16532g<List<U>> f99350E;

    /* renamed from: F  reason: collision with root package name */
    private final C16519P<e> f99351F;

    /* renamed from: m  reason: collision with root package name */
    private final Il.a f99352m;

    /* renamed from: n  reason: collision with root package name */
    private final x f99353n;

    /* renamed from: o  reason: collision with root package name */
    private final Wn.b f99354o;

    /* renamed from: p  reason: collision with root package name */
    private final Wn.d f99355p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Vn.b f99356q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final String f99357r;

    /* renamed from: s  reason: collision with root package name */
    private List<ChangePickupPointBottomSheet.e> f99358s;

    /* renamed from: t  reason: collision with root package name */
    private final int f99359t;

    /* renamed from: u  reason: collision with root package name */
    private final boolean f99360u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f99361v;

    /* renamed from: w  reason: collision with root package name */
    private final K f99362w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final C16505B<x> f99363x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public final C11410b<w> f99364y;

    /* renamed from: z  reason: collision with root package name */
    private final F<w> f99365z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Llo/f$a;", "", "<init>", "()V", "b", "a", "Llo/f$a$a;", "Llo/f$a$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llo/f$a$a;", "Llo/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.f$a$a  reason: collision with other inner class name */
        public static final class C2271a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2271a f99366a = new C2271a();

            private C2271a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2271a);
            }

            public int hashCode() {
                return -677664458;
            }

            public String toString() {
                return "ErrorHandled";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Llo/f$a$b;", "Llo/f$a;", "", "pickupPointId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final String f99367a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "pickupPointId");
                this.f99367a = str;
            }

            public final String a() {
                return this.f99367a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f99367a, ((b) obj).f99367a);
            }

            public int hashCode() {
                return this.f99367a.hashCode();
            }

            public String toString() {
                String str = this.f99367a;
                return "SelectPickupPoint(pickupPointId=" + str + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llo/f$b;", "", "<init>", "()V", "", "ADDRESS_FORMAT", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Llo/f$c;", "", "LNn/n;", "deliveryPrice", "LNn/G;", "pickUpPointHolder", "", "selected", "", "LNn/Q;", "unavailableItems", "<init>", "(LNn/n;LNn/G;ZLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/n;", "()LNn/n;", "b", "LNn/G;", "()LNn/G;", "c", "Z", "()Z", "d", "Ljava/util/List;", "()Ljava/util/List;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final C10811n f99368a;

        /* renamed from: b  reason: collision with root package name */
        private final G f99369b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f99370c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Q> f99371d;

        public c(C10811n nVar, G g10, boolean z10, List<Q> list) {
            C17542s.j(g10, "pickUpPointHolder");
            C17542s.j(list, "unavailableItems");
            this.f99368a = nVar;
            this.f99369b = g10;
            this.f99370c = z10;
            this.f99371d = list;
        }

        public final C10811n a() {
            return this.f99368a;
        }

        public final G b() {
            return this.f99369b;
        }

        public final boolean c() {
            return this.f99370c;
        }

        public final List<Q> d() {
            return this.f99371d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f99368a, cVar.f99368a) && C17542s.e(this.f99369b, cVar.f99369b) && this.f99370c == cVar.f99370c && C17542s.e(this.f99371d, cVar.f99371d);
        }

        public int hashCode() {
            C10811n nVar = this.f99368a;
            return ((((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f99369b.hashCode()) * 31) + Boolean.hashCode(this.f99370c)) * 31) + this.f99371d.hashCode();
        }

        public String toString() {
            C10811n nVar = this.f99368a;
            G g10 = this.f99369b;
            boolean z10 = this.f99370c;
            List<Q> list = this.f99371d;
            return "PickupPointModel(deliveryPrice=" + nVar + ", pickUpPointHolder=" + g10 + ", selected=" + z10 + ", unavailableItems=" + list + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Boolean.valueOf(((c) t11).c()), Boolean.valueOf(((c) t10).c()));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e<T> implements Comparator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Comparator f99372a;

        public e(Comparator comparator) {
            this.f99372a = comparator;
        }

        public final int compare(T t10, T t11) {
            int compare = this.f99372a.compare(t10, t11);
            return compare != 0 ? compare : C17035a.e(((c) t10).b().b(), ((c) t11).b().b());
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"lo/f$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.f$f  reason: collision with other inner class name */
    public static final class C2272f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f99373a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2272f(N.a aVar, f fVar) {
            super(aVar);
            this.f99373a = fVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            f fVar = this.f99373a;
            qv.e eVar = qv.e.DEBUG;
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
                    String a10 = C11818a.a("Error putting delivery option", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = fVar.getClass().getName();
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
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangePickupPointViewModel$selectPickupPoint$2", f = "ChangePickupPointViewModel.kt", l = {193}, m = "invokeSuspend")
    static final class g extends l implements p<QJ.Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99374c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f f99375d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ChangePickupPointBottomSheet.e f99376e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ UserPostalCodeAddress f99377f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(f fVar, ChangePickupPointBottomSheet.e eVar, UserPostalCodeAddress userPostalCodeAddress, C17164e<? super g> eVar2) {
            super(2, eVar2);
            this.f99375d = fVar;
            this.f99376e = eVar;
            this.f99377f = userPostalCodeAddress;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f99375d, this.f99376e, this.f99377f, eVar);
        }

        public final Object invoke(QJ.Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f99374c;
            if (i10 == 0) {
                y.b(obj);
                Vn.b k10 = this.f99375d.f99356q;
                String h10 = this.f99375d.f99357r;
                b.C1881b.a aVar = new b.C1881b.a(this.f99376e.c(), this.f99376e.e(), this.f99376e.a());
                Map<String, String> b10 = this.f99377f.b();
                this.f99374c = 1;
                obj = k10.a(h10, aVar, b10, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.a aVar2 = (b.a) obj;
            if (C17542s.e(aVar2, b.a.C1880b.f88721a)) {
                this.f99375d.f99364y.postValue(this.f99375d.H(this.f99376e));
            } else if (aVar2 instanceof b.a.C1879a) {
                C16505B i11 = this.f99375d.f99363x;
                Throwable a10 = ((b.a.C1879a) aVar2).a();
                I i12 = a10 instanceof I ? (I) a10 : null;
                if (C17542s.e(i12, I.a.f83965a)) {
                    obj2 = x.b.f99455a;
                } else if (i12 == null) {
                    obj2 = x.a.f99454a;
                } else {
                    throw new t();
                }
                i11.setValue(obj2);
            } else {
                throw new t();
            }
            this.f99375d.f99349D.setValue(null);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "chosen", "selecting", "", "Llo/f$c;", "pickupPoints", "Lgo/U;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangePickupPointViewModel$uiData$1", f = "ChangePickupPointViewModel.kt", l = {}, m = "invokeSuspend")
    static final class h extends l implements r<String, String, List<? extends c>, C17164e<? super List<? extends U>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99378c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f99379d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99380e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f99381f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f f99382g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(f fVar, C17164e<? super h> eVar) {
            super(4, eVar);
            this.f99382g = fVar;
        }

        /* renamed from: i */
        public final Object l(String str, String str2, List<c> list, C17164e<? super List<U>> eVar) {
            h hVar = new h(this.f99382g, eVar);
            hVar.f99379d = str;
            hVar.f99380e = str2;
            hVar.f99381f = list;
            return hVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f99378c == 0) {
                y.b(obj);
                List list = (List) this.f99381f;
                return this.f99382g.M(list, (String) this.f99379d, (String) this.f99380e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lgo/U;", "pickupPoints", "Llo/x;", "error", "Llo/e;", "<anonymous>", "(Ljava/util/List;Llo/x;)Llo/e;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangePickupPointViewModel$uiState$1", f = "ChangePickupPointViewModel.kt", l = {}, m = "invokeSuspend")
    static final class i extends l implements q<List<? extends U>, x, C17164e<? super e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99383c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f99384d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99385e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f99386f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(f fVar, C17164e<? super i> eVar) {
            super(3, eVar);
            this.f99386f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(List<U> list, x xVar, C17164e<? super e> eVar) {
            i iVar = new i(this.f99386f, eVar);
            iVar.f99384d = list;
            iVar.f99385e = xVar;
            return iVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f99383c == 0) {
                y.b(obj);
                return new e(this.f99386f.K(), (List) this.f99384d, this.f99386f.f99346A, (x) this.f99385e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public f(androidx.lifecycle.U u10, Il.a aVar, Nn.x xVar, Wn.b bVar, Wn.d dVar, Vn.b bVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(bVar, "analytics");
        C17542s.j(dVar, "checkoutDevAnalytics");
        C17542s.j(bVar2, "selectEarliestTimeWindowUseCase");
        this.f99352m = aVar;
        this.f99353n = xVar;
        this.f99354o = bVar;
        this.f99355p = dVar;
        this.f99356q = bVar2;
        Object f10 = u10.f("checkout_id_key");
        if (f10 != null) {
            String str = (String) f10;
            this.f99357r = str;
            Integer num = (Integer) u10.f("delivery_part_id");
            boolean z10 = false;
            this.f99359t = num != null ? num.intValue() : 0;
            Boolean bool = (Boolean) u10.f("show_selected_id");
            this.f99360u = bool != null ? bool.booleanValue() : false;
            Boolean bool2 = (Boolean) u10.f("show_delivery_price_excl_vat_id");
            this.f99361v = bool2 != null ? bool2.booleanValue() : z10;
            C10803f s10 = xVar.s(str);
            this.f99362w = s10 != null ? s10.i() : null;
            C16505B<x> a10 = C16521S.a(null);
            this.f99363x = a10;
            C11410b<w> bVar3 = new C11410b<>();
            this.f99364y = bVar3;
            this.f99365z = bVar3;
            this.f99346A = J();
            C16505B<List<c>> a11 = C16521S.a(C16877v.n());
            this.f99347B = a11;
            C16505B<String> a12 = C16521S.a(null);
            this.f99348C = a12;
            C16505B<String> a13 = C16521S.a(null);
            this.f99349D = a13;
            C16532g<List<U>> m10 = C16534i.m(a12, a13, a11, new h(this, (C17164e<? super h>) null));
            this.f99350E = m10;
            this.f99351F = C16534i.c0(C16534i.n(m10, a10, new i(this, (C17164e<? super i>) null)), g0.a(this), ip.f.a(), new e(false, C16877v.n(), (e.a) null, (x) null, 8, (DefaultConstructorMarker) null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final w H(ChangePickupPointBottomSheet.e eVar) {
        List<K.b> a10;
        K.b bVar;
        List<K.b> a11;
        C10803f s10 = this.f99353n.s(this.f99357r);
        String str = null;
        K i10 = s10 != null ? s10.i() : null;
        int i11 = 0;
        if (!(i10 == null || (a11 = i10.a()) == null)) {
            Iterator<K.b> it = a11.iterator();
            int i12 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i12 = -1;
                    break;
                } else if (C17542s.e(it.next().a(), eVar.a())) {
                    break;
                } else {
                    i12++;
                }
            }
            i11 = C17978n.e(i12, 0);
        }
        int i13 = i11 + 1;
        if (!(i10 == null || (a10 = i10.a()) == null || (bVar = (K.b) C16877v.z0(a10, i13)) == null)) {
            str = bVar.a();
        }
        return str != null ? new w.b(eVar.c(), str, i13) : w.a.f99450a;
    }

    private final e.a J() {
        String str;
        List<K.b> a10;
        List<K.b> a11;
        K.b bVar;
        G d10;
        C10799b a12;
        if (this.f99359t <= 0) {
            return null;
        }
        C10803f s10 = this.f99353n.s(this.f99357r);
        List<C10804g> g10 = s10 != null ? s10.g() : null;
        K i10 = s10 != null ? s10.i() : null;
        if (i10 == null || (a11 = i10.a()) == null || (bVar = (K.b) C16877v.y0(a11)) == null || (d10 = bVar.d()) == null || (a12 = d10.a()) == null || (str = a12.f()) == null) {
            str = "";
        }
        Wn.d dVar = this.f99355p;
        if (g10 == null) {
            g10 = C16877v.n();
        }
        dVar.a(g10, str);
        int size = (i10 == null || (a10 = i10.a()) == null) ? 1 : a10.size();
        return new e.a(new C13023e.c(C11848a.f102158a, C13020b.a(size), C16877v.e(Integer.valueOf(size)), (DefaultConstructorMarker) null), C13026h.b(C11849b.f102296g0, Integer.valueOf(this.f99359t + 1), Integer.valueOf(size)));
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<go.U> M(java.util.List<lo.f.c> r12, java.lang.String r13, java.lang.String r14) {
        /*
            r11 = this;
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            int r1 = YH.C16877v.y(r12, r1)
            r0.<init>(r1)
            java.util.Iterator r12 = r12.iterator()
        L_0x0011:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x0116
            java.lang.Object r1 = r12.next()
            lo.f$c r1 = (lo.f.c) r1
            if (r13 == 0) goto L_0x002d
            Nn.G r2 = r1.b()
            java.lang.String r2 = r2.g()
            boolean r2 = kotlin.jvm.internal.C17542s.e(r2, r13)
        L_0x002b:
            r5 = r2
            goto L_0x0032
        L_0x002d:
            boolean r2 = r1.c()
            goto L_0x002b
        L_0x0032:
            Nn.G r2 = r1.b()
            java.lang.String r2 = r2.g()
            boolean r6 = kotlin.jvm.internal.C17542s.e(r14, r2)
            Nn.G r2 = r1.b()
            Nn.b r2 = r2.a()
            java.lang.String r2 = r2.c()
            Nn.G r3 = r1.b()
            Nn.b r3 = r3.a()
            java.lang.String r3 = r3.f()
            Nn.G r4 = r1.b()
            Nn.b r4 = r4.a()
            java.lang.String r4 = r4.d()
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            r3 = 3
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            java.lang.String r3 = "%s\n%s %s"
            java.lang.String r7 = java.lang.String.format(r3, r2)
            java.lang.String r2 = "format(...)"
            kotlin.jvm.internal.C17542s.i(r7, r2)
            java.util.List r2 = r1.d()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
            r8 = r3
        L_0x0082:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0099
            java.lang.Object r4 = r2.next()
            Nn.Q r4 = (Nn.Q) r4
            int r9 = r4.c()
            int r4 = r4.a()
            int r9 = r9 - r4
            int r8 = r8 + r9
            goto L_0x0082
        L_0x0099:
            java.util.List r2 = r1.d()
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            r4 = 1
            if (r2 != 0) goto L_0x00b4
            Nn.G r2 = r1.b()
            Nn.G$b r2 = r2.i()
            Nn.G$b r9 = Nn.G.b.NO
            if (r2 == r9) goto L_0x00b4
            r9 = r4
            goto L_0x00b5
        L_0x00b4:
            r9 = r3
        L_0x00b5:
            Nn.G r2 = r1.b()
            Nn.n r2 = r2.h()
            r3 = 0
            if (r2 == 0) goto L_0x00d8
            Nn.G r2 = r1.b()
            Nn.n r2 = r2.h()
            if (r2 == 0) goto L_0x00d6
            boolean r10 = r11.f99361v
            r4 = r4 ^ r10
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Double r2 = r2.c(r4)
            goto L_0x00e9
        L_0x00d6:
            r2 = r3
            goto L_0x00e9
        L_0x00d8:
            Nn.n r2 = r1.a()
            if (r2 == 0) goto L_0x00d6
            boolean r10 = r11.f99361v
            r4 = r4 ^ r10
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Double r2 = r2.c(r4)
        L_0x00e9:
            if (r2 == 0) goto L_0x0106
            double r2 = r2.doubleValue()
            RC.n$a r4 = new RC.n$a
            Il.a r10 = r11.f99352m
            kp.d r10 = r10.s()
            qx.c r2 = qx.C14957b.a(r2, r10)
            Il.a r3 = r11.f99352m
            kp.d r3 = r3.s()
            r4.<init>(r2, r3)
            r10 = r4
            goto L_0x0107
        L_0x0106:
            r10 = r3
        L_0x0107:
            go.U r2 = new go.U
            Nn.G r4 = r1.b()
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r0.add(r2)
            goto L_0x0011
        L_0x0116:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lo.f.M(java.util.List, java.lang.String, java.lang.String):java.util.List");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet.e G(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = "pickupPointId"
            kotlin.jvm.internal.C17542s.j(r5, r0)
            java.util.List<com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$e> r0 = r4.f99358s
            r1 = 0
            if (r0 != 0) goto L_0x0010
            java.lang.String r0 = "pickUpPointDeliveries"
            kotlin.jvm.internal.C17542s.z(r0)
            r0 = r1
        L_0x0010:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0032
            java.lang.Object r2 = r0.next()
            r3 = r2
            com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$e r3 = (com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet.e) r3
            Nn.G r3 = r3.e()
            java.lang.String r3 = r3.g()
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 == 0) goto L_0x0016
            r1 = r2
        L_0x0032:
            com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$e r1 = (com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet.e) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: lo.f.G(java.lang.String):com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$e");
    }

    public final F<w> I() {
        return this.f99365z;
    }

    public final boolean K() {
        boolean z10;
        Iterable value = this.f99347B.getValue();
        if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
            Iterator it = value.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((c) it.next()).b().a().e() == null) {
                        z10 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            return this.f99347B.getValue().isEmpty() && !z10;
        }
        z10 = false;
        if (this.f99347B.getValue().isEmpty()) {
        }
    }

    public final void L(List<ChangePickupPointBottomSheet.e> list) {
        boolean z10;
        K k10;
        List<K.b> a10;
        C17542s.j(list, "pickUpPointDeliveries");
        this.f99358s = list;
        C16505B<List<c>> b10 = this.f99347B;
        Iterable<ChangePickupPointBottomSheet.e> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ChangePickupPointBottomSheet.e eVar : iterable) {
            if (this.f99360u && (k10 = this.f99362w) != null && (a10 = k10.a()) != null) {
                Iterable iterable2 = a10;
                if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                    Iterator it = iterable2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        G d10 = ((K.b) it.next()).d();
                        if (C17542s.e(d10 != null ? d10.g() : null, eVar.e().g())) {
                            z10 = true;
                            break;
                        }
                    }
                }
            }
            z10 = false;
            arrayList.add(new c(eVar.b(), eVar.e(), z10, eVar.g()));
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : C16877v.g1(arrayList, new e(new d()))) {
            if (hashSet.add(((c) next).b().g())) {
                arrayList2.add(next);
            }
        }
        b10.setValue(arrayList2);
        this.f99354o.m(K());
    }

    public final void N(a aVar) {
        C17542s.j(aVar, "action");
        if (aVar instanceof a.b) {
            this.f99348C.setValue(((a.b) aVar).a());
            this.f99354o.r(s.LIST);
        } else if (C17542s.e(aVar, a.C2271a.f99366a)) {
            this.f99363x.setValue(null);
        } else {
            throw new t();
        }
    }

    public final void O(ChangePickupPointBottomSheet.e eVar, UserPostalCodeAddress userPostalCodeAddress) {
        C17542s.j(eVar, "pickUpPointDelivery");
        C17542s.j(userPostalCodeAddress, "postalCodeAddress");
        this.f99354o.g();
        this.f99349D.setValue(eVar.e().g());
        F0 unused = C16314k.d(g0.a(this), new C2272f(N.f137593c0, this), (T) null, new g(this, eVar, userPostalCodeAddress, (C17164e<? super g>) null), 2, (Object) null);
    }

    public final C16519P<e> m() {
        return this.f99351F;
    }
}
