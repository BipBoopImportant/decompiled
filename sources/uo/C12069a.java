package uo;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Il.a;
import Nn.C10803f;
import Nn.C10804g;
import Nn.K;
import Nn.w;
import Nn.x;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import RC.n;
import Rg.a;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import UJ.C16619l;
import Ur.a;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import Yn.E;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ho.C11374a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qx.C14957b;
import rv.C11849b;
import sv.C11892a;
import tf.C10253a;
import to.B;
import to.C0;
import to.C11938f;
import to.C11970v0;
import tv.C11996a;
import tv.C11997b;
import uK.C18146a;
import wo.C12294e;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 \u00012\u00020\u0001:\u0006\u0001\u0001\u0001BQ\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001eJ\u001d\u0010#\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010+\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,JK\u0010:\u001a\u0002092\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00101\u001a\u00020!2\u0006\u00103\u001a\u0002022\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u0001062\u0006\u00108\u001a\u00020!H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u001aH\u0002¢\u0006\u0004\b<\u0010\u001eJ\u000f\u0010=\u001a\u00020\u001aH\u0002¢\u0006\u0004\b=\u0010\u001eJ\u0017\u0010@\u001a\u00020\u001a2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u001b\u0010D\u001a\u00020-*\u00020B2\u0006\u0010C\u001a\u00020!H\u0002¢\u0006\u0004\bD\u0010EJ\u001d\u0010G\u001a\u0004\u0018\u00010F*\u00020B2\u0006\u0010C\u001a\u00020!H\u0002¢\u0006\u0004\bG\u0010HJ7\u0010O\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010I\u001a\u00020\u00182\b\u0010J\u001a\u0004\u0018\u00010\u00182\u0006\u0010K\u001a\u00020!2\u0006\u0010L\u001a\u00020!H\u0002¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0017\u0010_\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020!0`8\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001c\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010h0g8\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001060g8\u0002X\u0004¢\u0006\u0006\n\u0004\bl\u0010jR\u001c\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001040g8\u0002X\u0004¢\u0006\u0006\n\u0004\bm\u0010jR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020!0g8\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010jR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020/0g8\u0002X\u0004¢\u0006\u0006\n\u0004\bo\u0010jR\u001c\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010q0g8\u0002X\u0004¢\u0006\u0006\n\u0004\br\u0010jR\u001a\u0010u\u001a\b\u0012\u0004\u0012\u00020!0`8\u0002X\u0004¢\u0006\u0006\n\u0004\bt\u0010bR\u0016\u0010x\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u001c\u0010z\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010>0`8\u0002X\u0004¢\u0006\u0006\n\u0004\by\u0010bR\u001c\u0010|\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010-0`8\u0002X\u0004¢\u0006\u0006\n\u0004\b{\u0010bR\u001f\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002090}8\u0006¢\u0006\r\n\u0004\b~\u0010\u001a\u0005\bQ\u0010\u0001¨\u0006\u0001"}, d2 = {"Luo/a;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LNn/x;", "checkoutRepository", "LUr/a;", "googlePayUseCase", "Ltf/a;", "killsSwitch", "Lsv/a;", "mCommerceConfigRepository", "LIl/a;", "appConfigApi", "LWn/b;", "checkoutAnalytics", "Lqo/c;", "initiateExpressPaymentUseCase", "Lwo/e;", "trackOnlinePurchaseUseCase", "<init>", "(Landroidx/lifecycle/U;LNn/x;LUr/a;Ltf/a;Lsv/a;LIl/a;LWn/b;Lqo/c;Lwo/e;)V", "Lto/v0$a;", "data", "", "shopperResultUrlString", "LXH/N;", "R", "(Lto/v0$a;Ljava/lang/String;)V", "U", "()V", "S", "id", "", "checked", "X", "(Ljava/lang/String;Z)V", "Lto/F0;", "selection", "Y", "(Lto/F0;)V", "", "resultCode", "T", "(I)V", "Lto/B$a$a;", "selected", "Luo/a$c;", "terms", "taxIdSelectionValid", "LUr/a$b;", "googlePay", "LIC/e;", "snackbarMessage", "Lto/B$c;", "navigationEvent", "progressLoading", "Lto/B;", "O", "(Lto/B$a$a;Luo/a$c;ZLUr/a$b;LIC/e;Lto/B$c;Z)Lto/B;", "V", "L", "LNn/f;", "checkoutData", "W", "(LNn/f;)V", "LNn/K;", "showTotalExclTax", "M", "(LNn/K;Z)Lto/B$a$a;", "LRC/n;", "P", "(LNn/K;Z)LRC/n;", "termsAndConditionUrl", "privacyPolicyUrl", "acceptedTermsAndConditions", "acceptedPrivacyPolicy", "", "Lto/f;", "Q", "(Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/util/List;", "m", "LNn/x;", "n", "LIl/a;", "o", "LWn/b;", "p", "Lqo/c;", "q", "Lwo/e;", "r", "Ljava/lang/String;", "N", "()Ljava/lang/String;", "checkoutId", "LTJ/g;", "s", "LTJ/g;", "Luo/a$a;", "t", "Luo/a$a;", "analyticsData", "LTJ/B;", "LUr/a$a;", "u", "LTJ/B;", "deliveryType", "v", "w", "x", "y", "termsInput", "Luo/e;", "z", "taxIdSelectionInput", "A", "enabled", "B", "Z", "hasSentBeginCheckoutAnalytics", "C", "checkout", "D", "selectedCheckoutDetails", "LTJ/P;", "E", "LTJ/P;", "()LTJ/P;", "uiState", "F", "c", "a", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uo.a  reason: case insensitive filesystem */
public final class C12069a extends f0 {

    /* renamed from: F  reason: collision with root package name */
    public static final b f103903F = new b((DefaultConstructorMarker) null);

    /* renamed from: G  reason: collision with root package name */
    public static final int f103904G = 8;

    /* renamed from: H  reason: collision with root package name */
    private static final String f103905H = "PRIVACY_POLICY_ID";

    /* renamed from: I  reason: collision with root package name */
    private static final String f103906I = "TERMS_AND_CONDITIONS_ID";

    /* renamed from: A  reason: collision with root package name */
    private final C16532g<Boolean> f103907A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public boolean f103908B;

    /* renamed from: C  reason: collision with root package name */
    private final C16532g<C10803f> f103909C;

    /* renamed from: D  reason: collision with root package name */
    private final C16532g<B.a.C2452a> f103910D;

    /* renamed from: E  reason: collision with root package name */
    private final C16519P<B> f103911E;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final x f103912m;

    /* renamed from: n  reason: collision with root package name */
    private final a f103913n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Wn.b f103914o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final qo.c f103915p;

    /* renamed from: q  reason: collision with root package name */
    private final C12294e f103916q;

    /* renamed from: r  reason: collision with root package name */
    private final String f103917r;

    /* renamed from: s  reason: collision with root package name */
    private final C16532g<Boolean> f103918s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public C2471a f103919t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<a.C1858a> f103920u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<B.c> f103921v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C16505B<C13023e> f103922w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final C16505B<Boolean> f103923x;

    /* renamed from: y  reason: collision with root package name */
    private final C16505B<c> f103924y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final C16505B<e> f103925z;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Luo/a$a;", "", "", "LNn/g;", "items", "", "showTotalExclTax", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$a  reason: collision with other inner class name */
    private static final class C2471a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C10804g> f103926a;

        /* renamed from: b  reason: collision with root package name */
        private final Boolean f103927b;

        public C2471a(List<C10804g> list, Boolean bool) {
            C17542s.j(list, "items");
            this.f103926a = list;
            this.f103927b = bool;
        }

        public final List<C10804g> a() {
            return this.f103926a;
        }

        public final Boolean b() {
            return this.f103927b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2471a)) {
                return false;
            }
            C2471a aVar = (C2471a) obj;
            return C17542s.e(this.f103926a, aVar.f103926a) && C17542s.e(this.f103927b, aVar.f103927b);
        }

        public int hashCode() {
            int hashCode = this.f103926a.hashCode() * 31;
            Boolean bool = this.f103927b;
            return hashCode + (bool == null ? 0 : bool.hashCode());
        }

        public String toString() {
            List<C10804g> list = this.f103926a;
            Boolean bool = this.f103927b;
            return "AnalyticsData(items=" + list + ", showTotalExclTax=" + bool + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Luo/a$b;", "", "<init>", "()V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Luo/a$c;", "", "", "isPrivacyPolicyChecked", "isTermsAndConditionsChecked", "<init>", "(ZZ)V", "a", "(ZZ)Luo/a$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "()Z", "c", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f103928a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f103929b;

        public c(boolean z10, boolean z11) {
            this.f103928a = z10;
            this.f103929b = z11;
        }

        public final c a(boolean z10, boolean z11) {
            return new c(z10, z11);
        }

        public final boolean b() {
            return this.f103928a;
        }

        public final boolean c() {
            return this.f103929b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f103928a == cVar.f103928a && this.f103929b == cVar.f103929b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f103928a) * 31) + Boolean.hashCode(this.f103929b);
        }

        public String toString() {
            boolean z10 = this.f103928a;
            boolean z11 = this.f103929b;
            return "TermsState(isPrivacyPolicyChecked=" + z10 + ", isTermsAndConditionsChecked=" + z11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNn/f;", "checkoutData", "LXH/N;", "<anonymous>", "(LNn/f;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.presentation.viewmodel.CheckoutV2ViewModel$checkout$1", f = "CheckoutV2ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: uo.a$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<C10803f, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103930c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f103931d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12069a f103932e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C12069a aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f103932e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f103932e, eVar);
            dVar.f103931d = obj;
            return dVar;
        }

        /* renamed from: i */
        public final Object invoke(C10803f fVar, C17164e<? super C16807N> eVar) {
            return ((d) create(fVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            r0 = r5.i();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                eI.C17187b.f()
                int r0 = r4.f103930c
                if (r0 != 0) goto L_0x0045
                XH.y.b(r5)
                java.lang.Object r5 = r4.f103931d
                Nn.f r5 = (Nn.C10803f) r5
                if (r5 == 0) goto L_0x001b
                Nn.K r0 = r5.i()
                if (r0 == 0) goto L_0x001b
                Nn.p r0 = r0.c()
                goto L_0x001c
            L_0x001b:
                r0 = 0
            L_0x001c:
                uo.a r1 = r4.f103932e
                TJ.B r1 = r1.f103920u
            L_0x0022:
                java.lang.Object r2 = r1.getValue()
                r3 = r2
                Ur.a$a r3 = (Ur.a.C1858a) r3
                Sg.a r3 = Sg.a.f63419a
                Ur.a$a r3 = r3.b(r0)
                boolean r2 = r1.e(r2, r3)
                if (r2 == 0) goto L_0x0022
                if (r5 == 0) goto L_0x0042
                uo.a r0 = r4.f103932e
                boolean r1 = r0.f103908B
                if (r1 != 0) goto L_0x0042
                r0.W(r5)
            L_0x0042:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            L_0x0045:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: uo.C12069a.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"uo/a$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$e */
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C12069a f103933a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, C12069a aVar2) {
            super(aVar);
            this.f103933a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C12069a aVar = this.f103933a;
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
                    String a10 = C11818a.a("Error clearing payment session", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
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
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.presentation.viewmodel.CheckoutV2ViewModel$clearPaymentSession$2", f = "CheckoutV2ViewModel.kt", l = {396}, m = "invokeSuspend")
    /* renamed from: uo.a$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103934c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f103935d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C12069a f103936e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C12069a aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f103936e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f103936e, eVar);
            fVar.f103935d = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f103934c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f103935d;
                x j10 = this.f103936e.f103912m;
                String N10 = this.f103936e.N();
                this.f103935d = q11;
                this.f103934c = 1;
                if (j10.b(N10, this) == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                q10 = (Q) this.f103935d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
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
                    String a10 = C11818a.a("Payment session cleared", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = q10.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$g */
    /* synthetic */ class g extends C17540p implements C17642l<String, Boolean> {
        g(Object obj) {
            super(1, obj, a.b.C1860a.C1862b.class, "validateInput", "validateInput(Ljava/lang/String;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(String str) {
            C17542s.j(str, "p0");
            return Boolean.valueOf(((a.b.C1860a.C1862b) this.receiver).c(str));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.presentation.viewmodel.CheckoutV2ViewModel$initiateExpressCheckout$1", f = "CheckoutV2ViewModel.kt", l = {193}, m = "invokeSuspend")
    /* renamed from: uo.a$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f103937c;

        /* renamed from: d  reason: collision with root package name */
        int f103938d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f103939e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12069a f103940f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f103941g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11970v0.a f103942h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C12069a aVar, String str, C11970v0.a aVar2, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f103940f = aVar;
            this.f103941g = str;
            this.f103942h = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            h hVar = new h(this.f103940f, this.f103941g, this.f103942h, eVar);
            hVar.f103939e = obj;
            return hVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f103938d;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f103939e;
                this.f103940f.f103914o.q(a.C1085a.C1086a.f63198a);
                qo.c E10 = this.f103940f.f103915p;
                String N10 = this.f103940f.N();
                String str = this.f103941g;
                List<C11996a> a10 = this.f103942h.a();
                List<C11997b> b10 = this.f103942h.b();
                e eVar = (e) this.f103940f.f103925z.getValue();
                w b11 = eVar != null ? eVar.b() : null;
                this.f103939e = q11;
                this.f103937c = eVar;
                this.f103938d = 1;
                obj2 = E10.a(N10, str, a10, b10, b11, this);
                if (obj2 == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                e eVar2 = (e) this.f103937c;
                q10 = (Q) this.f103939e;
                y.b(obj);
                obj2 = ((XH.x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C12069a aVar = this.f103940f;
            Throwable e10 = XH.x.e(obj2);
            if (e10 == null) {
                C16807N n10 = (C16807N) obj2;
                aVar.f103921v.setValue(new B.c.C2455c(aVar.N()));
            } else {
                qv.e eVar3 = qv.e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar3, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a11 = C11818a.a("Unable to initiate express payment", e10);
                        if (a11 == null) {
                            break;
                        }
                        str2 = C11820c.a(a11);
                    }
                    if (str3 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    bVar.a(eVar3, str3, false, e10, str2);
                }
                aVar.f103922w.setValue(C13026h.a(C11849b.f102309j1));
            }
            this.f103940f.f103923x.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNn/f;", "checkout", "", "showTotalExclTax", "Lto/B$a$a;", "<anonymous>", "(LNn/f;Z)Lto/B$a$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.presentation.viewmodel.CheckoutV2ViewModel$selectedCheckoutDetails$1", f = "CheckoutV2ViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: uo.a$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements q<C10803f, Boolean, C17164e<? super B.a.C2452a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f103943c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f103944d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f103945e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C12069a f103946f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C12069a aVar, C17164e<? super i> eVar) {
            super(3, eVar);
            this.f103946f = aVar;
        }

        public final Object i(C10803f fVar, boolean z10, C17164e<? super B.a.C2452a> eVar) {
            i iVar = new i(this.f103946f, eVar);
            iVar.f103944d = fVar;
            iVar.f103945e = z10;
            return iVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((C10803f) obj, ((Boolean) obj2).booleanValue(), (C17164e) obj3);
        }

        /* JADX WARNING: Removed duplicated region for block: B:65:0x01b4  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x01be  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x01ca  */
        /* JADX WARNING: Removed duplicated region for block: B:72:0x01d1  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                r25 = this;
                r0 = r25
                eI.C17187b.f()
                int r1 = r0.f103943c
                if (r1 != 0) goto L_0x01d3
                XH.y.b(r26)
                java.lang.Object r1 = r0.f103944d
                Nn.f r1 = (Nn.C10803f) r1
                boolean r2 = r0.f103945e
                if (r1 == 0) goto L_0x0019
                Nn.K r4 = r1.i()
                goto L_0x001a
            L_0x0019:
                r4 = 0
            L_0x001a:
                java.lang.String r5 = "|"
                java.lang.String r6 = "b"
                java.lang.String r7 = "m"
                java.lang.String r9 = "main"
                java.lang.String r10 = "Kt"
                r13 = 0
                r14 = 2
                if (r1 != 0) goto L_0x00e3
                uo.a r4 = r0.f103946f
                qv.e r15 = qv.e.DEBUG
                qv.d r16 = qv.d.f102012a
                java.util.List r16 = r16.a()
                java.lang.Iterable r16 = (java.lang.Iterable) r16
                java.util.ArrayList r8 = new java.util.ArrayList
                r8.<init>()
                java.util.Iterator r16 = r16.iterator()
            L_0x003d:
                boolean r17 = r16.hasNext()
                if (r17 == 0) goto L_0x0054
                java.lang.Object r11 = r16.next()
                r3 = r11
                qv.b r3 = (qv.C11819b) r3
                boolean r3 = r3.b(r15, r13)
                if (r3 == 0) goto L_0x003d
                r8.add(r11)
                goto L_0x003d
            L_0x0054:
                java.util.Iterator r3 = r8.iterator()
                r8 = 0
                r11 = 0
            L_0x005a:
                boolean r13 = r3.hasNext()
                if (r13 == 0) goto L_0x00e0
                java.lang.Object r13 = r3.next()
                qv.b r13 = (qv.C11819b) r13
                r12 = 0
                if (r8 != 0) goto L_0x0077
                java.lang.String r8 = "Checkout is null"
                java.lang.String r8 = qv.C11818a.a(r8, r12)
                if (r8 != 0) goto L_0x0073
                goto L_0x00e0
            L_0x0073:
                java.lang.String r8 = qv.C11820c.a(r8)
            L_0x0077:
                if (r11 != 0) goto L_0x00c5
                java.lang.Class r11 = r4.getClass()
                java.lang.String r11 = r11.getName()
                kotlin.jvm.internal.C17542s.g(r11)
                r23 = r3
                r24 = r4
                r3 = 36
                r12 = 0
                java.lang.String r4 = HJ.C15854t.s1(r11, r3, r12, r14, r12)
                r3 = 46
                java.lang.String r4 = HJ.C15854t.o1(r4, r3, r12, r14, r12)
                int r3 = r4.length()
                if (r3 != 0) goto L_0x009c
                goto L_0x00a0
            L_0x009c:
                java.lang.String r11 = HJ.C15854t.P0(r4, r10)
            L_0x00a0:
                java.lang.Thread r3 = java.lang.Thread.currentThread()
                java.lang.String r3 = r3.getName()
                r4 = 1
                boolean r3 = HJ.C15854t.b0(r3, r9, r4)
                if (r3 == 0) goto L_0x00b1
                r3 = r7
                goto L_0x00b2
            L_0x00b1:
                r3 = r6
            L_0x00b2:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r3)
                r4.append(r5)
                r4.append(r11)
                java.lang.String r11 = r4.toString()
                goto L_0x00c9
            L_0x00c5:
                r23 = r3
                r24 = r4
            L_0x00c9:
                r18 = 0
                r3 = r15
                r15 = r13
                r16 = r3
                r17 = r11
                r4 = 0
                r19 = r4
                r20 = r8
                r15.a(r16, r17, r18, r19, r20)
                r15 = r3
                r3 = r23
                r4 = r24
                goto L_0x005a
            L_0x00e0:
                r14 = 0
                goto L_0x01aa
            L_0x00e3:
                if (r4 != 0) goto L_0x00e0
                uo.a r3 = r0.f103946f
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r8 = "Selected delivery service holder is null"
                r4.<init>(r8)
                qv.e r8 = qv.e.ERROR
                qv.d r11 = qv.d.f102012a
                java.util.List r11 = r11.a()
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r11 = r11.iterator()
            L_0x0101:
                boolean r15 = r11.hasNext()
                if (r15 == 0) goto L_0x0119
                java.lang.Object r15 = r11.next()
                r14 = r15
                qv.b r14 = (qv.C11819b) r14
                boolean r14 = r14.b(r8, r13)
                if (r14 == 0) goto L_0x0117
                r12.add(r15)
            L_0x0117:
                r14 = 2
                goto L_0x0101
            L_0x0119:
                java.util.Iterator r11 = r12.iterator()
                r12 = 0
                r13 = 0
            L_0x011f:
                boolean r14 = r11.hasNext()
                if (r14 == 0) goto L_0x00e0
                java.lang.Object r14 = r11.next()
                r15 = r14
                qv.b r15 = (qv.C11819b) r15
                r14 = 0
                if (r12 != 0) goto L_0x013b
                java.lang.String r12 = qv.C11818a.a(r14, r4)
                if (r12 != 0) goto L_0x0137
                goto L_0x01aa
            L_0x0137:
                java.lang.String r12 = qv.C11820c.a(r12)
            L_0x013b:
                if (r13 != 0) goto L_0x018e
                java.lang.Class r13 = r3.getClass()
                java.lang.String r13 = r13.getName()
                kotlin.jvm.internal.C17542s.g(r13)
                r21 = r3
                r22 = r6
                r23 = r7
                r3 = 36
                r6 = 2
                java.lang.String r7 = HJ.C15854t.s1(r13, r3, r14, r6, r14)
                r3 = 46
                java.lang.String r7 = HJ.C15854t.o1(r7, r3, r14, r6, r14)
                int r16 = r7.length()
                if (r16 != 0) goto L_0x0162
                goto L_0x0166
            L_0x0162:
                java.lang.String r13 = HJ.C15854t.P0(r7, r10)
            L_0x0166:
                java.lang.Thread r7 = java.lang.Thread.currentThread()
                java.lang.String r7 = r7.getName()
                r3 = 1
                boolean r7 = HJ.C15854t.b0(r7, r9, r3)
                if (r7 == 0) goto L_0x0178
                r7 = r23
                goto L_0x017a
            L_0x0178:
                r7 = r22
            L_0x017a:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r7)
                r3.append(r5)
                r3.append(r13)
                java.lang.String r3 = r3.toString()
                r13 = r3
                goto L_0x0195
            L_0x018e:
                r21 = r3
                r22 = r6
                r23 = r7
                r6 = 2
            L_0x0195:
                r18 = 0
                r16 = r8
                r17 = r13
                r19 = r4
                r20 = r12
                r15.a(r16, r17, r18, r19, r20)
                r3 = r21
                r6 = r22
                r7 = r23
                goto L_0x011f
            L_0x01aa:
                uo.a r3 = r0.f103946f
                if (r1 == 0) goto L_0x01be
                java.util.List r4 = r1.g()
                if (r4 == 0) goto L_0x01be
                uo.a$a r12 = new uo.a$a
                java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)
                r12.<init>(r4, r5)
                goto L_0x01bf
            L_0x01be:
                r12 = r14
            L_0x01bf:
                r3.f103919t = r12
                if (r1 == 0) goto L_0x01d1
                Nn.K r1 = r1.i()
                if (r1 == 0) goto L_0x01d1
                uo.a r3 = r0.f103946f
                to.B$a$a r3 = r3.M(r1, r2)
                goto L_0x01d2
            L_0x01d1:
                r3 = r14
            L_0x01d2:
                return r3
            L_0x01d3:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: uo.C12069a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$j */
    public static final class j implements C16532g<B> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f103947a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C12069a f103948b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: uo.a$j$a  reason: collision with other inner class name */
        static final class C2472a extends C17544u implements C17631a<Object[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f103949c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2472a(C16532g[] gVarArr) {
                super(0);
                this.f103949c = gVarArr;
            }

            /* renamed from: b */
            public final Object[] invoke() {
                return new Object[this.f103949c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.presentation.viewmodel.CheckoutV2ViewModel$special$$inlined$combine$1$3", f = "CheckoutV2ViewModel.kt", l = {238}, m = "invokeSuspend")
        /* renamed from: uo.a$j$b */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super B>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f103950c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f103951d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f103952e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C12069a f103953f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17164e eVar, C12069a aVar) {
                super(3, eVar);
                this.f103953f = aVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super B> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar, this.f103953f);
                bVar.f103951d = hVar;
                bVar.f103952e = objArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object obj2;
                Object f10 = C17187b.f();
                int i10 = this.f103950c;
                if (i10 == 0) {
                    y.b(obj);
                    C16533h hVar = (C16533h) this.f103951d;
                    Object[] objArr = (Object[]) this.f103952e;
                    Object obj3 = objArr[0];
                    Object obj4 = objArr[1];
                    Object obj5 = objArr[2];
                    Object obj6 = objArr[3];
                    Object obj7 = objArr[4];
                    Object obj8 = objArr[5];
                    a.b bVar = (a.b) objArr[6];
                    boolean booleanValue = ((Boolean) obj8).booleanValue();
                    C13023e eVar = (C13023e) obj7;
                    B.c cVar = (B.c) obj6;
                    boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                    c cVar2 = (c) obj4;
                    B.a.C2452a aVar = (B.a.C2452a) obj3;
                    if (aVar == null) {
                        C12069a aVar2 = this.f103953f;
                        qv.e eVar2 = qv.e.DEBUG;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        for (Object next : qv.d.f102012a.a()) {
                            if (((C11819b) next).b(eVar2, false)) {
                                arrayList.add(next);
                            }
                        }
                        String str = null;
                        String str2 = null;
                        for (C11819b bVar2 : arrayList) {
                            if (str == null) {
                                String a10 = C11818a.a("Selected delivery is null, close view", (Throwable) null);
                                if (a10 == null) {
                                    break;
                                }
                                str = C11820c.a(a10);
                            }
                            String str3 = str;
                            if (str2 == null) {
                                String name = aVar2.getClass().getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str4 = str2;
                            bVar2.a(eVar2, str4, false, (Throwable) null, str3);
                            str = str3;
                            str2 = str4;
                        }
                        obj2 = new B.b(B.c.a.f102988a);
                    } else {
                        obj2 = this.f103953f.O(aVar, cVar2, booleanValue2, bVar, eVar, cVar, booleanValue);
                    }
                    this.f103950c = 1;
                    if (hVar.emit(obj2, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return C16807N.f139792a;
            }
        }

        public j(C16532g[] gVarArr, C12069a aVar) {
            this.f103947a = gVarArr;
            this.f103948b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f103947a;
            Object a10 = C16619l.a(hVar, gVarArr, new C2472a(gVarArr), new b((C17164e) null, this.f103948b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$k */
    public static final class k implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f103954a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: uo.a$k$a  reason: collision with other inner class name */
        public static final class C2473a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f103955a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.presentation.viewmodel.CheckoutV2ViewModel$special$$inlined$map$1$2", f = "CheckoutV2ViewModel.kt", l = {50}, m = "emit")
            /* renamed from: uo.a$k$a$a  reason: collision with other inner class name */
            public static final class C2474a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f103956c;

                /* renamed from: d  reason: collision with root package name */
                int f103957d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2473a f103958e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2474a(C2473a aVar, C17164e eVar) {
                    super(eVar);
                    this.f103958e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f103956c = obj;
                    this.f103957d |= Integer.MIN_VALUE;
                    return this.f103958e.emit((Object) null, this);
                }
            }

            public C2473a(C16533h hVar) {
                this.f103955a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof uo.C12069a.k.C2473a.C2474a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    uo.a$k$a$a r0 = (uo.C12069a.k.C2473a.C2474a) r0
                    int r1 = r0.f103957d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f103957d = r1
                    goto L_0x0018
                L_0x0013:
                    uo.a$k$a$a r0 = new uo.a$k$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f103956c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f103957d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004d
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f103955a
                    com.ingka.ikea.mcomsettings.MComConfig r5 = (com.ingka.ikea.mcomsettings.MComConfig) r5
                    if (r5 == 0) goto L_0x003f
                    boolean r5 = r5.r()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f103957d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004d
                    return r1
                L_0x004d:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: uo.C12069a.k.C2473a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public k(C16532g gVar) {
            this.f103954a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f103954a.collect(new C2473a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$l */
    public static final class l implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f103959a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: uo.a$l$a  reason: collision with other inner class name */
        public static final class C2475a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f103960a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.presentation.viewmodel.CheckoutV2ViewModel$special$$inlined$map$2$2", f = "CheckoutV2ViewModel.kt", l = {50}, m = "emit")
            /* renamed from: uo.a$l$a$a  reason: collision with other inner class name */
            public static final class C2476a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f103961c;

                /* renamed from: d  reason: collision with root package name */
                int f103962d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2475a f103963e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2476a(C2475a aVar, C17164e eVar) {
                    super(eVar);
                    this.f103963e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f103961c = obj;
                    this.f103962d |= Integer.MIN_VALUE;
                    return this.f103963e.emit((Object) null, this);
                }
            }

            public C2475a(C16533h hVar) {
                this.f103960a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof uo.C12069a.l.C2475a.C2476a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    uo.a$l$a$a r0 = (uo.C12069a.l.C2475a.C2476a) r0
                    int r1 = r0.f103962d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f103962d = r1
                    goto L_0x0018
                L_0x0013:
                    uo.a$l$a$a r0 = new uo.a$l$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f103961c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f103962d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0061
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f103960a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r6 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r6
                    if (r6 == 0) goto L_0x003f
                    boolean r2 = r6.z()
                    goto L_0x0040
                L_0x003f:
                    r2 = r3
                L_0x0040:
                    r4 = 0
                    if (r6 == 0) goto L_0x004e
                    java.lang.Boolean r6 = r6.p()
                    if (r6 == 0) goto L_0x004e
                    boolean r6 = r6.booleanValue()
                    goto L_0x004f
                L_0x004e:
                    r6 = r4
                L_0x004f:
                    if (r2 == 0) goto L_0x0054
                    if (r6 == 0) goto L_0x0054
                    r4 = r3
                L_0x0054:
                    java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.b.a(r4)
                    r0.f103962d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0061
                    return r1
                L_0x0061:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: uo.C12069a.l.C2475a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public l(C16532g gVar) {
            this.f103959a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f103959a.collect(new C2475a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uo.a$m */
    public static final class m implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f103964a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: uo.a$m$a  reason: collision with other inner class name */
        public static final class C2477a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f103965a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.presentation.viewmodel.CheckoutV2ViewModel$special$$inlined$map$3$2", f = "CheckoutV2ViewModel.kt", l = {50}, m = "emit")
            /* renamed from: uo.a$m$a$a  reason: collision with other inner class name */
            public static final class C2478a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f103966c;

                /* renamed from: d  reason: collision with root package name */
                int f103967d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2477a f103968e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2478a(C2477a aVar, C17164e eVar) {
                    super(eVar);
                    this.f103968e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f103966c = obj;
                    this.f103967d |= Integer.MIN_VALUE;
                    return this.f103968e.emit((Object) null, this);
                }
            }

            public C2477a(C16533h hVar) {
                this.f103965a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof uo.C12069a.m.C2477a.C2478a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    uo.a$m$a$a r0 = (uo.C12069a.m.C2477a.C2478a) r0
                    int r1 = r0.f103967d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f103967d = r1
                    goto L_0x0018
                L_0x0013:
                    uo.a$m$a$a r0 = new uo.a$m$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f103966c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f103967d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x004f
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f103965a
                    uo.e r5 = (uo.e) r5
                    r2 = 0
                    if (r5 == 0) goto L_0x0042
                    boolean r5 = r5.a()
                    if (r5 != r3) goto L_0x0042
                    r2 = r3
                L_0x0042:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)
                    r0.f103967d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: uo.C12069a.m.C2477a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public m(C16532g gVar) {
            this.f103964a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f103964a.collect(new C2477a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C12069a(U u10, x xVar, Ur.a aVar, C10253a aVar2, C11892a aVar3, Il.a aVar4, Wn.b bVar, qo.c cVar, C12294e eVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(aVar, "googlePayUseCase");
        C17542s.j(aVar2, "killsSwitch");
        C17542s.j(aVar3, "mCommerceConfigRepository");
        C17542s.j(aVar4, "appConfigApi");
        C17542s.j(bVar, "checkoutAnalytics");
        C17542s.j(cVar, "initiateExpressPaymentUseCase");
        C17542s.j(eVar, "trackOnlinePurchaseUseCase");
        this.f103912m = xVar;
        this.f103913n = aVar4;
        this.f103914o = bVar;
        this.f103915p = cVar;
        this.f103916q = eVar;
        Object f10 = u10.f("checkoutId");
        if (f10 != null) {
            String str = (String) f10;
            this.f103917r = str;
            k kVar = new k(C11892a.C2450a.a(aVar3, false, 1, (Object) null));
            this.f103918s = kVar;
            C16505B<a.C1858a> a10 = C16521S.a(null);
            this.f103920u = a10;
            C16505B<B.c> a11 = C16521S.a(null);
            this.f103921v = a11;
            C16505B<C13023e> a12 = C16521S.a(null);
            this.f103922w = a12;
            C16505B<Boolean> a13 = C16521S.a(Boolean.FALSE);
            this.f103923x = a13;
            C16505B<c> a14 = C16521S.a(new c(false, false));
            this.f103924y = a14;
            C16505B<e> a15 = C16521S.a(null);
            this.f103925z = a15;
            l lVar = new l(aVar2.I());
            this.f103907A = lVar;
            C16532g<C10803f> R10 = C16534i.R(xVar.q(str), new d(this, (C17164e<? super d>) null));
            this.f103909C = R10;
            C16532g<B.a.C2452a> n10 = C16534i.n(R10, kVar, new i(this, (C17164e<? super i>) null));
            this.f103910D = n10;
            this.f103911E = C16534i.c0(new j(new C16532g[]{n10, a14, C16534i.s(new m(a15)), a11, a12, a13, aVar.a(lVar, a10)}, this), g0.a(this), ip.f.a(), new B.b((B.c) null, 1, (DefaultConstructorMarker) null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void L() {
        F0 unused = C16314k.d(g0.a(this), new e(N.f137593c0, this), (T) null, new f(this, (C17164e<? super f>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final B.a.C2452a M(K k10, boolean z10) {
        int f10 = Co.c.f(k10.c());
        n P10 = P(k10, z10);
        Iterable<K.b> a10 = k10.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (K.b bVar : a10) {
            C13023e a11 = C13026h.a(Co.c.g(k10.c(), k10.e(), bVar.f()));
            String b10 = bVar.c().b();
            String str = "";
            if (b10 == null) {
                b10 = str;
            }
            String c10 = bVar.c().c();
            if (c10 != null) {
                str = c10;
            }
            int S10 = E.S(k10.c(), k10.e(), C11374a.C2202a.CHECKOUT);
            List<Nn.N> c11 = bVar.e().c();
            if (c11 == null) {
                c11 = C16877v.n();
            }
            arrayList.add(new B.a.C2452a.C2453a(bVar.a(), new B.a.C2452a.C2453a.C2454a(a11, C13026h.c(b10), f10), new B.a.C2452a.C2453a.C2454a(C13026h.c(str), C13026h.a(S10), C18146a.f148290W0), c11));
        }
        return new B.a.C2452a(P10, arrayList);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v0, resolved type: to.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: to.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: to.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: to.C0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: to.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v5, resolved type: to.C0} */
    /* JADX WARNING: type inference failed for: r13v4, types: [to.C0$b] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final to.B O(to.B.a.C2452a r22, uo.C12069a.c r23, boolean r24, Ur.a.b r25, IC.C13023e r26, to.B.c r27, boolean r28) {
        /*
            r21 = this;
            r0 = r25
            r1 = r28
            Ur.a$b$c r2 = Ur.a.b.c.f88441a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
            java.lang.String r3 = "|"
            java.lang.String r4 = "b"
            java.lang.String r5 = "m"
            java.lang.String r6 = "main"
            java.lang.String r7 = "Kt"
            r8 = 46
            r9 = 36
            java.lang.Class<uo.a> r10 = uo.C12069a.class
            r11 = 2
            r13 = 0
            if (r2 == 0) goto L_0x00ca
            qv.e r0 = qv.e.DEBUG
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0031:
            boolean r14 = r1.hasNext()
            r15 = 0
            if (r14 == 0) goto L_0x0049
            java.lang.Object r14 = r1.next()
            r12 = r14
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r0, r15)
            if (r12 == 0) goto L_0x0031
            r2.add(r14)
            goto L_0x0031
        L_0x0049:
            java.util.Iterator r1 = r2.iterator()
            r2 = r13
            r12 = r2
        L_0x004f:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x00c0
            java.lang.Object r14 = r1.next()
            qv.b r14 = (qv.C11819b) r14
            r15 = 0
            if (r2 != 0) goto L_0x006b
            java.lang.String r2 = "GooglePay pending"
            java.lang.String r2 = qv.C11818a.a(r2, r15)
            if (r2 != 0) goto L_0x0067
            goto L_0x00c0
        L_0x0067:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x006b:
            if (r12 != 0) goto L_0x00ab
            java.lang.String r12 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r12)
            java.lang.String r15 = HJ.C15854t.s1(r12, r9, r13, r11, r13)
            java.lang.String r15 = HJ.C15854t.o1(r15, r8, r13, r11, r13)
            int r17 = r15.length()
            if (r17 != 0) goto L_0x0083
            goto L_0x0087
        L_0x0083:
            java.lang.String r12 = HJ.C15854t.P0(r15, r7)
        L_0x0087:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r8 = 1
            boolean r15 = HJ.C15854t.b0(r15, r6, r8)
            if (r15 == 0) goto L_0x0098
            r8 = r5
            goto L_0x0099
        L_0x0098:
            r8 = r4
        L_0x0099:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r8)
            r15.append(r3)
            r15.append(r12)
            java.lang.String r12 = r15.toString()
        L_0x00ab:
            r22 = r14
            r23 = r0
            r24 = r12
            r8 = 0
            r25 = r8
            r14 = 0
            r26 = r14
            r27 = r2
            r22.a(r23, r24, r25, r26, r27)
            r15 = r8
            r8 = 46
            goto L_0x004f
        L_0x00c0:
            to.B$b r0 = new to.B$b
            r1 = 1
            r0.<init>(r13, r1, r13)
        L_0x00c6:
            r6 = r21
            goto L_0x0272
        L_0x00ca:
            Ur.a$b$b r2 = Ur.a.b.C1863b.f88440a
            boolean r2 = kotlin.jvm.internal.C17542s.e(r0, r2)
            if (r2 == 0) goto L_0x017d
            qv.e r0 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x00e5:
            boolean r8 = r1.hasNext()
            r12 = 0
            if (r8 == 0) goto L_0x00fd
            java.lang.Object r8 = r1.next()
            r14 = r8
            qv.b r14 = (qv.C11819b) r14
            boolean r12 = r14.b(r0, r12)
            if (r12 == 0) goto L_0x00e5
            r2.add(r8)
            goto L_0x00e5
        L_0x00fd:
            java.util.Iterator r1 = r2.iterator()
            r2 = r13
            r8 = r2
        L_0x0103:
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x0174
            java.lang.Object r14 = r1.next()
            qv.b r14 = (qv.C11819b) r14
            r15 = 0
            if (r2 != 0) goto L_0x011f
            java.lang.String r2 = "GooglePay disabled, should not happen since it is checked earlier"
            java.lang.String r2 = qv.C11818a.a(r2, r15)
            if (r2 != 0) goto L_0x011b
            goto L_0x0174
        L_0x011b:
            java.lang.String r2 = qv.C11820c.a(r2)
        L_0x011f:
            if (r8 != 0) goto L_0x0161
            java.lang.String r8 = r10.getName()
            kotlin.jvm.internal.C17542s.g(r8)
            java.lang.String r15 = HJ.C15854t.s1(r8, r9, r13, r11, r13)
            r9 = 46
            java.lang.String r15 = HJ.C15854t.o1(r15, r9, r13, r11, r13)
            int r17 = r15.length()
            if (r17 != 0) goto L_0x0139
            goto L_0x013d
        L_0x0139:
            java.lang.String r8 = HJ.C15854t.P0(r15, r7)
        L_0x013d:
            java.lang.Thread r15 = java.lang.Thread.currentThread()
            java.lang.String r15 = r15.getName()
            r9 = 1
            boolean r15 = HJ.C15854t.b0(r15, r6, r9)
            if (r15 == 0) goto L_0x014e
            r9 = r5
            goto L_0x014f
        L_0x014e:
            r9 = r4
        L_0x014f:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r9)
            r15.append(r3)
            r15.append(r8)
            java.lang.String r8 = r15.toString()
        L_0x0161:
            r22 = r14
            r23 = r0
            r24 = r8
            r25 = r12
            r9 = 0
            r26 = r9
            r27 = r2
            r22.a(r23, r24, r25, r26, r27)
            r9 = 36
            goto L_0x0103
        L_0x0174:
            to.B$b r0 = new to.B$b
            to.B$c$a r1 = to.B.c.a.f102988a
            r0.<init>(r1)
            goto L_0x00c6
        L_0x017d:
            boolean r2 = r0 instanceof Ur.a.b.C1860a
            if (r2 == 0) goto L_0x027b
            r2 = 1
            if (r1 != r2) goto L_0x018b
            to.B$d r0 = new to.B$d
            r0.<init>(r13, r2, r13)
            goto L_0x00c6
        L_0x018b:
            if (r1 != 0) goto L_0x0273
            Ur.a$b$a r0 = (Ur.a.b.C1860a) r0
            Ur.a$b$a$d r1 = r0.h()
            java.lang.String r1 = r1.b()
            Ur.a$b$a$d r3 = r0.h()
            java.lang.String r3 = r3.a()
            boolean r4 = r23.c()
            boolean r5 = r23.b()
            r6 = r21
            java.util.List r16 = r6.Q(r1, r3, r4, r5)
            java.util.List r1 = r0.g()
            if (r1 == 0) goto L_0x0254
            to.z0 r11 = to.j1.a(r1)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r9 = new java.util.ArrayList
            r3 = 10
            int r4 = YH.C16877v.y(r1, r3)
            r9.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        L_0x01c8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01ed
            java.lang.Object r4 = r1.next()
            Ur.a$b$a$c r4 = (Ur.a.b.C1860a.c) r4
            to.C0$c r5 = new to.C0$c
            java.lang.String r7 = r4.a()
            java.lang.String r8 = r4.d()
            boolean r10 = r4.b()
            boolean r4 = r4.c()
            r5.<init>(r7, r8, r10, r4)
            r9.add(r5)
            goto L_0x01c8
        L_0x01ed:
            java.util.List r1 = r0.d()
            if (r1 == 0) goto L_0x0221
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            int r3 = YH.C16877v.y(r1, r3)
            r4.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0202:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x021f
            java.lang.Object r3 = r1.next()
            Ur.a$b$a$a r3 = (Ur.a.b.C1860a.C1861a) r3
            to.C0$a r5 = new to.C0$a
            java.lang.String r7 = r3.b()
            java.lang.String r3 = r3.a()
            r5.<init>(r7, r3)
            r4.add(r5)
            goto L_0x0202
        L_0x021f:
            r10 = r4
            goto L_0x0226
        L_0x0221:
            java.util.List r1 = YH.C16877v.n()
            r10 = r1
        L_0x0226:
            Ur.a$b$a$b r1 = r0.e()
            if (r1 == 0) goto L_0x023e
            to.C0$b r13 = new to.C0$b
            java.lang.String r3 = r1.b()
            java.lang.String r4 = r1.a()
            uo.a$g r5 = new uo.a$g
            r5.<init>(r1)
            r13.<init>(r3, r4, r5)
        L_0x023e:
            r8 = r13
            Co.e r1 = Co.e.f79654a
            Ur.a$b$a$b r3 = r0.e()
            if (r3 == 0) goto L_0x0249
            r12 = r2
            goto L_0x024a
        L_0x0249:
            r12 = 0
        L_0x024a:
            IC.e r12 = r1.a(r12)
            to.C0 r13 = new to.C0
            r7 = r13
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x0254:
            r17 = r13
            Co.e r1 = Co.e.f79654a
            boolean r2 = r23.c()
            boolean r3 = r23.b()
            r4 = r24
            to.v0 r18 = r1.b(r2, r3, r4, r0)
            to.B$a r0 = new to.B$a
            r14 = r0
            r15 = r22
            r19 = r26
            r20 = r27
            r14.<init>(r15, r16, r17, r18, r19, r20)
        L_0x0272:
            return r0
        L_0x0273:
            r6 = r21
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x027b:
            r6 = r21
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.C12069a.O(to.B$a$a, uo.a$c, boolean, Ur.a$b, IC.e, to.B$c, boolean):to.B");
    }

    private final n P(K k10, boolean z10) {
        Double a10 = z10 ? k10.b().a() : k10.b().b();
        if (a10 == null) {
            return null;
        }
        return C17542s.a(a10, 0.0d) ? new n.b(C13026h.a(C11849b.f102312k0)) : new n.a(C14957b.a(a10.doubleValue(), this.f103913n.s()), this.f103913n.s());
    }

    private final List<C11938f> Q(String str, String str2, boolean z10, boolean z11) {
        List c10 = C16877v.c();
        c10.add(new C11938f(f103906I, z10, C13026h.a(C11849b.f102219O0), str));
        if (str2 != null) {
            c10.add(new C11938f(f103905H, z11, C13026h.a(C11849b.f102215N0), str2));
        }
        return C16877v.a(c10);
    }

    private final void V() {
        this.f103921v.setValue(new B.c.b(this.f103917r));
        C2471a aVar = this.f103919t;
        Boolean bool = null;
        List<C10804g> a10 = aVar != null ? aVar.a() : null;
        Collection collection = a10;
        if (collection == null || collection.isEmpty()) {
            IllegalStateException illegalStateException = new IllegalStateException("No items when tracking purchase event, analyticsData: " + this.f103919t);
            qv.e eVar = qv.e.ERROR;
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
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 == null) {
                        break;
                    }
                    str = C11820c.a(a11);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C12069a.class.getName();
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
        C12294e eVar2 = this.f103916q;
        String str5 = this.f103917r;
        if (a10 == null) {
            a10 = C16877v.n();
        }
        a.C1085a.C1086a aVar2 = a.C1085a.C1086a.f63198a;
        C2471a aVar3 = this.f103919t;
        if (aVar3 != null) {
            bool = aVar3.b();
        }
        eVar2.a(str5, aVar2, a10, bool);
    }

    /* access modifiers changed from: private */
    public final void W(C10803f fVar) {
        this.f103908B = true;
        Wn.b bVar = this.f103914o;
        String b10 = this.f103913n.s().b();
        double d10 = fVar.h().i().d();
        Iterable<C10804g> g10 = fVar.g();
        ArrayList arrayList = new ArrayList(C16877v.y(g10, 10));
        for (C10804g gVar : g10) {
            String b11 = gVar.b();
            int c10 = gVar.c();
            Double e10 = gVar.e();
            arrayList.add(new Mn.a(b11, c10, e10 != null ? e10.doubleValue() : gVar.d()));
        }
        bVar.A(b10, arrayList, d10);
    }

    public final String N() {
        return this.f103917r;
    }

    public final void R(C11970v0.a aVar, String str) {
        C17542s.j(aVar, "data");
        C17542s.j(str, "shopperResultUrlString");
        this.f103923x.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new h(this, str, aVar, (C17164e<? super h>) null), 3, (Object) null);
    }

    public final void S() {
        this.f103921v.setValue(null);
    }

    public final void T(int i10) {
        String str;
        char c10;
        Class<C12069a> cls;
        int i11;
        int i12 = i10;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = C12069a.class;
            i11 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Payment activity result: " + i12, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        if (i12 != 0) {
            switch (i12) {
                case 3333:
                    IllegalStateException illegalStateException = new IllegalStateException("Regular payment success not expected here");
                    qv.e eVar2 = qv.e.ERROR;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    for (Object next2 : qv.d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar2, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str6 = null;
                    String str7 = null;
                    for (C11819b bVar2 : arrayList2) {
                        if (str6 == null) {
                            String a11 = C11818a.a("Unexpected success callback, start confirmation anyway", illegalStateException);
                            if (a11 == null) {
                                V();
                                C16807N n10 = C16807N.f139792a;
                                return;
                            }
                            str6 = C11820c.a(a11);
                        }
                        if (str7 == null) {
                            String name2 = cls.getName();
                            C17542s.g(name2);
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                        }
                        bVar2.a(eVar2, str7, false, illegalStateException, str6);
                    }
                    V();
                    C16807N n102 = C16807N.f139792a;
                    return;
                case 3334:
                    qv.e eVar3 = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList3 = new ArrayList<>();
                    for (Object next3 : qv.d.f102012a.a()) {
                        if (((C11819b) next3).b(eVar3, false)) {
                            arrayList3.add(next3);
                        }
                    }
                    String str8 = null;
                    String str9 = null;
                    for (C11819b bVar3 : arrayList3) {
                        if (str8 == null) {
                            String a12 = C11818a.a("Express payment completed. Start confirmation", (Throwable) null);
                            if (a12 == null) {
                                V();
                                C16807N n11 = C16807N.f139792a;
                                return;
                            }
                            str8 = C11820c.a(a12);
                        }
                        if (str9 == null) {
                            String name3 = cls.getName();
                            C17542s.g(name3);
                            String o14 = C15854t.o1(C15854t.s1(name3, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o14.length() != 0) {
                                name3 = C15854t.P0(o14, "Kt");
                            }
                            str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                        }
                        bVar3.a(eVar3, str9, false, (Throwable) null, str8);
                        c10 = '$';
                    }
                    V();
                    C16807N n112 = C16807N.f139792a;
                    return;
                case 3335:
                case 3336:
                    qv.e eVar4 = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList4 = new ArrayList<>();
                    for (Object next4 : qv.d.f102012a.a()) {
                        if (((C11819b) next4).b(eVar4, false)) {
                            arrayList4.add(next4);
                        }
                    }
                    String str10 = null;
                    String str11 = null;
                    for (C11819b bVar4 : arrayList4) {
                        if (str10 == null) {
                            String a13 = C11818a.a("Error in payment. Return to cart", (Throwable) null);
                            if (a13 == null) {
                                L();
                                this.f103921v.setValue(B.c.a.f102988a);
                                C16807N n12 = C16807N.f139792a;
                                return;
                            }
                            str10 = C11820c.a(a13);
                        }
                        if (str11 == null) {
                            String name4 = cls.getName();
                            C17542s.g(name4);
                            String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o15.length() != 0) {
                                name4 = C15854t.P0(o15, "Kt");
                            }
                            str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name4;
                        }
                        bVar4.a(eVar4, str11, false, (Throwable) null, str10);
                    }
                    L();
                    this.f103921v.setValue(B.c.a.f102988a);
                    C16807N n122 = C16807N.f139792a;
                    return;
                default:
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unexpected result code: " + i12);
                    qv.e eVar5 = qv.e.ERROR;
                    ArrayList<C11819b> arrayList5 = new ArrayList<>();
                    for (Object next5 : qv.d.f102012a.a()) {
                        if (((C11819b) next5).b(eVar5, false)) {
                            arrayList5.add(next5);
                        }
                    }
                    String str12 = null;
                    String str13 = null;
                    for (C11819b bVar5 : arrayList5) {
                        if (str12 == null) {
                            String a14 = C11818a.a((String) null, illegalArgumentException);
                            if (a14 == null) {
                                C16807N n13 = C16807N.f139792a;
                                return;
                            }
                            str12 = C11820c.a(a14);
                        }
                        if (str13 == null) {
                            String name5 = cls.getName();
                            C17542s.g(name5);
                            String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o16.length() != 0) {
                                name5 = C15854t.P0(o16, "Kt");
                            }
                            str13 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name5;
                        }
                        bVar5.a(eVar5, str13, false, illegalArgumentException, str12);
                    }
                    C16807N n132 = C16807N.f139792a;
                    return;
            }
        } else {
            qv.e eVar6 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList6 = new ArrayList<>();
            for (Object next6 : qv.d.f102012a.a()) {
                if (((C11819b) next6).b(eVar6, false)) {
                    arrayList6.add(next6);
                }
            }
            String str14 = null;
            String str15 = null;
            for (C11819b bVar6 : arrayList6) {
                if (str14 == null) {
                    String a15 = C11818a.a("User canceled the payment view", (Throwable) null);
                    if (a15 == null) {
                        break;
                    }
                    str14 = C11820c.a(a15);
                }
                if (str15 == null) {
                    String name6 = cls.getName();
                    C17542s.g(name6);
                    String o17 = C15854t.o1(C15854t.s1(name6, '$', (String) null, i11, (Object) null), '.', (String) null, i11, (Object) null);
                    if (o17.length() != 0) {
                        name6 = C15854t.P0(o17, "Kt");
                    }
                    str15 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name6;
                }
                bVar6.a(eVar6, str15, false, (Throwable) null, str14);
                i11 = 2;
            }
            L();
            C16807N n14 = C16807N.f139792a;
        }
    }

    public final void U() {
        this.f103922w.setValue(null);
    }

    public final void X(String str, boolean z10) {
        c value;
        c cVar;
        C17542s.j(str, "id");
        C16505B<c> b10 = this.f103924y;
        do {
            value = b10.getValue();
            cVar = value;
        } while (!b10.e(value, cVar.a(C17542s.e(str, f103905H) ? z10 : cVar.b(), C17542s.e(str, f103906I) ? z10 : cVar.c())));
    }

    public final void Y(to.F0 f02) {
        e value;
        String b10;
        String i10;
        String d10;
        C0.a a10;
        C17542s.j(f02, "selection");
        C16505B<e> b11 = this.f103925z;
        do {
            value = b11.getValue();
            e eVar = value;
            b10 = f02.b();
            C0.c c10 = f02.c();
            i10 = c10 != null ? c10.i() : null;
            d10 = f02.d();
            a10 = f02.a();
        } while (!b11.e(value, new e(b10, i10, d10, a10 != null ? a10.f() : null, f02.e())));
    }

    public final C16519P<B> m() {
        return this.f103911E;
    }
}
