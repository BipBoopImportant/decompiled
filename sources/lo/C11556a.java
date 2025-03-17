package lo;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Il.a;
import Nn.C10800c;
import Nn.C10803f;
import Nn.K;
import Nn.M;
import Nn.P;
import Nn.x;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XC.C13802a;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.checkout.impl.delivery.fragments.ChangeDeliveryTimeSlotFragment;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.C11437c;
import jo.C11438d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import nI.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qx.C14956a;
import rv.C11849b;
import sf.C10242c;
import sv.C11892a;

@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 }2\u00020\u00012\u00020\u0002:\b~\u0001\u0001\u0001BI\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010#\u001a\u00020\"2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J%\u0010(\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u00152\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0018H\u0002¢\u0006\u0004\b(\u0010)J3\u0010/\u001a\u00020.2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u00152\b\u0010-\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b/\u00100J1\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00182\u0006\u0010\u001a\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u00152\b\u00101\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b3\u00104J5\u00108\u001a\u0004\u0018\u0001072\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u00182\u0006\u0010\u0017\u001a\u00020\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0002¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u001dH\u0002¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0015H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u001d2\u0006\u0010<\u001a\u00020\u0015H\u0016¢\u0006\u0004\b?\u0010>J\u000f\u0010@\u001a\u00020\u001dH\u0016¢\u0006\u0004\b@\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010KR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010MR\u0016\u0010R\u001a\u0004\u0018\u00010O8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010V\u001a\u0004\u0018\u00010S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020*0W8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020[0Z8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001d\u0010d\u001a\b\u0012\u0004\u0012\u00020[0_8\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u001e\u0010f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150W8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\be\u0010YR\u001c\u00101\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150W8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010YR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010l\u001a\u00020i8\u0002X\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020 0m8\u0002X\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\"\u0010r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00180W8\u0002X\u0004¢\u0006\u0006\n\u0004\bq\u0010YR\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"0m8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010oR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010vR \u0010|\u001a\b\u0012\u0004\u0012\u00020.0x8\u0016X\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\bA\u0010{¨\u0006\u0001"}, d2 = {"Llo/a;", "Landroidx/lifecycle/f0;", "LXC/a;", "Landroidx/lifecycle/U;", "savedStateHandle", "Lsv/a;", "mCommerceConfigRepository", "LNn/x;", "checkoutRepo", "Lko/e;", "getTimeSlotDatesUseCase", "Lko/g;", "saveTimeSlotUseCase", "LWn/b;", "checkoutAnalytics", "LIl/a;", "appConfigApi", "Lsf/c;", "userDataRepository", "<init>", "(Landroidx/lifecycle/U;Lsv/a;LNn/x;Lko/e;Lko/g;LWn/b;LIl/a;Lsf/c;)V", "", "checkoutId", "deliveryArrangementId", "", "LNn/M;", "availableTimeSlots", "LNn/K;", "selectedDeliveryServiceHolder", "LXH/N;", "Q", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;LNn/K;)V", "Llo/a$c;", "config", "Llo/a$b;", "O", "(LNn/K;Ljava/util/List;Llo/a$c;)Llo/a$b;", "timeSlotId", "LNn/c;", "capabilities", "R", "(Ljava/lang/String;Ljava/util/List;)V", "Llo/z;", "loadingState", "userSelectedGroupId", "userSelectedSlotId", "LXC/a$a;", "L", "(Llo/z;Llo/a$b;Ljava/lang/String;Ljava/lang/String;)LXC/a$a;", "selectedSlotId", "Ljo/c;", "N", "(Llo/a$b;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "LNn/K$b;", "deliveries", "Llo/a$e;", "P", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)Llo/a$e;", "S", "()V", "id", "A", "(Ljava/lang/String;)V", "f", "r", "m", "LNn/x;", "n", "Lko/e;", "o", "Lko/g;", "p", "LWn/b;", "q", "LIl/a;", "Lsf/c;", "s", "Ljava/lang/String;", "t", "Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment$a;", "u", "Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment$a;", "timeWindowData", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "v", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "LTJ/B;", "w", "LTJ/B;", "Lip/b;", "Llo/a$a;", "x", "Lip/b;", "_action", "Landroidx/lifecycle/F;", "y", "Landroidx/lifecycle/F;", "M", "()Landroidx/lifecycle/F;", "action", "z", "selectedGroupId", "B", "LNn/K;", "LIC/e;", "C", "LIC/e;", "title", "LTJ/g;", "D", "LTJ/g;", "timeSlotConfig", "E", "timeSlots", "F", "Llo/a$b$a;", "G", "Llo/a$b$a;", "bookedSlot", "LTJ/P;", "H", "LTJ/P;", "()LTJ/P;", "uiState", "I", "b", "e", "c", "a", "d", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lo.a  reason: case insensitive filesystem */
public final class C11556a extends f0 implements C13802a {

    /* renamed from: I  reason: collision with root package name */
    public static final d f99240I = new d((DefaultConstructorMarker) null);

    /* renamed from: J  reason: collision with root package name */
    public static final int f99241J = 8;
    /* access modifiers changed from: private */

    /* renamed from: K  reason: collision with root package name */
    public static final c.C2268a f99242K = new c.C2268a("d", "MMM", "EEE", "HH:mm", "EEE, d MMM", "d MMM");

    /* renamed from: A  reason: collision with root package name */
    private final C16505B<String> f99243A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final K f99244B;

    /* renamed from: C  reason: collision with root package name */
    private final C13023e f99245C;

    /* renamed from: D  reason: collision with root package name */
    private final C16532g<c> f99246D;
    /* access modifiers changed from: private */

    /* renamed from: E  reason: collision with root package name */
    public final C16505B<List<M>> f99247E;

    /* renamed from: F  reason: collision with root package name */
    private final C16532g<b> f99248F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public b.C2266a f99249G;

    /* renamed from: H  reason: collision with root package name */
    private final C16519P<C13802a.C2911a> f99250H;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final x f99251m;

    /* renamed from: n  reason: collision with root package name */
    private final ko.e f99252n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final ko.g f99253o;

    /* renamed from: p  reason: collision with root package name */
    private final Wn.b f99254p;

    /* renamed from: q  reason: collision with root package name */
    private final a f99255q;

    /* renamed from: r  reason: collision with root package name */
    private final C10242c f99256r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final String f99257s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final String f99258t;

    /* renamed from: u  reason: collision with root package name */
    private final ChangeDeliveryTimeSlotFragment.a f99259u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final UserPostalCodeAddress f99260v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C16505B<z> f99261w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final C11410b<C2264a> f99262x;

    /* renamed from: y  reason: collision with root package name */
    private final F<C2264a> f99263y;

    /* renamed from: z  reason: collision with root package name */
    private C16505B<String> f99264z;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Llo/a$a;", "", "<init>", "()V", "a", "c", "b", "Llo/a$a$a;", "Llo/a$a$b;", "Llo/a$a$c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$a  reason: collision with other inner class name */
    public static abstract class C2264a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llo/a$a$a;", "Llo/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.a$a$a  reason: collision with other inner class name */
        public static final class C2265a extends C2264a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2265a f99265a = new C2265a();

            private C2265a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2265a);
            }

            public int hashCode() {
                return -1509282879;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llo/a$a$b;", "Llo/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.a$a$b */
        public static final class b extends C2264a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f99266a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -248178568;
            }

            public String toString() {
                return "NoChange";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llo/a$a$c;", "Llo/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.a$a$c */
        public static final class c extends C2264a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f99267a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 889917308;
            }

            public String toString() {
                return "Success";
            }
        }

        public /* synthetic */ C2264a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2264a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Llo/a$b;", "", "<init>", "()V", "Llo/a$b$a;", "a", "()Llo/a$b$a;", "bookedSlot", "b", "c", "Llo/a$b$b;", "Llo/a$b$c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0016\u0010\u000e¨\u0006\u001b"}, d2 = {"Llo/a$b$a;", "", "", "timeSlotId", "LIC/e;", "label", "text", "", "leadingIconRes", "<init>", "(Ljava/lang/String;LIC/e;LIC/e;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "LIC/e;", "()LIC/e;", "c", "I", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.a$b$a  reason: collision with other inner class name */
        public static final class C2266a {

            /* renamed from: e  reason: collision with root package name */
            public static final int f99268e = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final String f99269a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f99270b;

            /* renamed from: c  reason: collision with root package name */
            private final C13023e f99271c;

            /* renamed from: d  reason: collision with root package name */
            private final int f99272d;

            public C2266a(String str, C13023e eVar, C13023e eVar2, int i10) {
                C17542s.j(str, "timeSlotId");
                C17542s.j(eVar, "label");
                C17542s.j(eVar2, "text");
                this.f99269a = str;
                this.f99270b = eVar;
                this.f99271c = eVar2;
                this.f99272d = i10;
            }

            public final C13023e a() {
                return this.f99270b;
            }

            public final int b() {
                return this.f99272d;
            }

            public final C13023e c() {
                return this.f99271c;
            }

            public final String d() {
                return this.f99269a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2266a)) {
                    return false;
                }
                C2266a aVar = (C2266a) obj;
                return C17542s.e(this.f99269a, aVar.f99269a) && C17542s.e(this.f99270b, aVar.f99270b) && C17542s.e(this.f99271c, aVar.f99271c) && this.f99272d == aVar.f99272d;
            }

            public int hashCode() {
                return (((((this.f99269a.hashCode() * 31) + this.f99270b.hashCode()) * 31) + this.f99271c.hashCode()) * 31) + Integer.hashCode(this.f99272d);
            }

            public String toString() {
                String str = this.f99269a;
                C13023e eVar = this.f99270b;
                C13023e eVar2 = this.f99271c;
                int i10 = this.f99272d;
                return "BookedSlot(timeSlotId=" + str + ", label=" + eVar + ", text=" + eVar2 + ", leadingIconRes=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Llo/a$b$b;", "Llo/a$b;", "Llo/a$b$a;", "bookedSlot", "", "Ljo/c;", "availableSlotGroups", "<init>", "(Llo/a$b$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llo/a$b$a;", "()Llo/a$b$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.a$b$b  reason: collision with other inner class name */
        public static final class C2267b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C2266a f99273a;

            /* renamed from: b  reason: collision with root package name */
            private final List<C11437c> f99274b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2267b(C2266a aVar, List<C11437c> list) {
                super((DefaultConstructorMarker) null);
                C17542s.j(list, "availableSlotGroups");
                this.f99273a = aVar;
                this.f99274b = list;
            }

            public C2266a a() {
                return this.f99273a;
            }

            public final List<C11437c> b() {
                return this.f99274b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2267b)) {
                    return false;
                }
                C2267b bVar = (C2267b) obj;
                return C17542s.e(this.f99273a, bVar.f99273a) && C17542s.e(this.f99274b, bVar.f99274b);
            }

            public int hashCode() {
                C2266a aVar = this.f99273a;
                return ((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f99274b.hashCode();
            }

            public String toString() {
                C2266a aVar = this.f99273a;
                List<C11437c> list = this.f99274b;
                return "Default(bookedSlot=" + aVar + ", availableSlotGroups=" + list + ")";
            }
        }

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Llo/a$b$c;", "Llo/a$b;", "Llo/a$b$a;", "bookedSlot", "", "Ljo/d;", "availableSlots", "<init>", "(Llo/a$b$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Llo/a$b$a;", "()Llo/a$b$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.a$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C2266a f99275a;

            /* renamed from: b  reason: collision with root package name */
            private final List<C11438d> f99276b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(C2266a aVar, List<C11438d> list) {
                super((DefaultConstructorMarker) null);
                C17542s.j(list, "availableSlots");
                this.f99275a = aVar;
                this.f99276b = list;
            }

            public C2266a a() {
                return this.f99275a;
            }

            public final List<C11438d> b() {
                return this.f99276b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f99275a, cVar.f99275a) && C17542s.e(this.f99276b, cVar.f99276b);
            }

            public int hashCode() {
                C2266a aVar = this.f99275a;
                return ((aVar == null ? 0 : aVar.hashCode()) * 31) + this.f99276b.hashCode();
            }

            public String toString() {
                C2266a aVar = this.f99275a;
                List<C11438d> list = this.f99276b;
                return "RangeOfDays(bookedSlot=" + aVar + ", availableSlots=" + list + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract C2266a a();

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Llo/a$c;", "", "Llo/a$c$a;", "dateConfig", "", "showTotalExclTaxInCartAndCheckout", "<init>", "(Llo/a$c$a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Llo/a$c$a;", "()Llo/a$c$a;", "b", "Z", "()Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final C2268a f99277a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f99278b;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0014\u0010\f¨\u0006\u001b"}, d2 = {"Llo/a$c$a;", "", "", "dayPattern", "monthPattern", "weekdayPattern", "timePattern", "weekdayAndDate", "dateAndMonth", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "f", "d", "e", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.a$c$a  reason: collision with other inner class name */
        public static final class C2268a {

            /* renamed from: a  reason: collision with root package name */
            private final String f99279a;

            /* renamed from: b  reason: collision with root package name */
            private final String f99280b;

            /* renamed from: c  reason: collision with root package name */
            private final String f99281c;

            /* renamed from: d  reason: collision with root package name */
            private final String f99282d;

            /* renamed from: e  reason: collision with root package name */
            private final String f99283e;

            /* renamed from: f  reason: collision with root package name */
            private final String f99284f;

            public C2268a(String str, String str2, String str3, String str4, String str5, String str6) {
                C17542s.j(str, "dayPattern");
                C17542s.j(str2, "monthPattern");
                C17542s.j(str3, "weekdayPattern");
                C17542s.j(str4, "timePattern");
                C17542s.j(str5, "weekdayAndDate");
                C17542s.j(str6, "dateAndMonth");
                this.f99279a = str;
                this.f99280b = str2;
                this.f99281c = str3;
                this.f99282d = str4;
                this.f99283e = str5;
                this.f99284f = str6;
            }

            public final String a() {
                return this.f99284f;
            }

            public final String b() {
                return this.f99279a;
            }

            public final String c() {
                return this.f99280b;
            }

            public final String d() {
                return this.f99282d;
            }

            public final String e() {
                return this.f99283e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2268a)) {
                    return false;
                }
                C2268a aVar = (C2268a) obj;
                return C17542s.e(this.f99279a, aVar.f99279a) && C17542s.e(this.f99280b, aVar.f99280b) && C17542s.e(this.f99281c, aVar.f99281c) && C17542s.e(this.f99282d, aVar.f99282d) && C17542s.e(this.f99283e, aVar.f99283e) && C17542s.e(this.f99284f, aVar.f99284f);
            }

            public final String f() {
                return this.f99281c;
            }

            public int hashCode() {
                return (((((((((this.f99279a.hashCode() * 31) + this.f99280b.hashCode()) * 31) + this.f99281c.hashCode()) * 31) + this.f99282d.hashCode()) * 31) + this.f99283e.hashCode()) * 31) + this.f99284f.hashCode();
            }

            public String toString() {
                String str = this.f99279a;
                String str2 = this.f99280b;
                String str3 = this.f99281c;
                String str4 = this.f99282d;
                String str5 = this.f99283e;
                String str6 = this.f99284f;
                return "DateConfig(dayPattern=" + str + ", monthPattern=" + str2 + ", weekdayPattern=" + str3 + ", timePattern=" + str4 + ", weekdayAndDate=" + str5 + ", dateAndMonth=" + str6 + ")";
            }
        }

        public c(C2268a aVar, boolean z10) {
            C17542s.j(aVar, "dateConfig");
            this.f99277a = aVar;
            this.f99278b = z10;
        }

        public final C2268a a() {
            return this.f99277a;
        }

        public final boolean b() {
            return this.f99278b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f99277a, cVar.f99277a) && this.f99278b == cVar.f99278b;
        }

        public int hashCode() {
            return (this.f99277a.hashCode() * 31) + Boolean.hashCode(this.f99278b);
        }

        public String toString() {
            C2268a aVar = this.f99277a;
            boolean z10 = this.f99278b;
            return "ChangeTimeSlotConfig(dateConfig=" + aVar + ", showTotalExclTaxInCartAndCheckout=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llo/a$d;", "", "<init>", "()V", "", "FROM_TO_TIME_FORMAT", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Llo/a$e;", "", "LNn/P;", "transportMethod", "LNn/M;", "timeSlot", "<init>", "(LNn/P;LNn/M;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LNn/P;", "b", "()LNn/P;", "LNn/M;", "()LNn/M;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final P f99285a;

        /* renamed from: b  reason: collision with root package name */
        private final M f99286b;

        public e(P p10, M m10) {
            C17542s.j(p10, "transportMethod");
            C17542s.j(m10, "timeSlot");
            this.f99285a = p10;
            this.f99286b = m10;
        }

        public final M a() {
            return this.f99286b;
        }

        public final P b() {
            return this.f99285a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f99285a == eVar.f99285a && C17542s.e(this.f99286b, eVar.f99286b);
        }

        public int hashCode() {
            return (this.f99285a.hashCode() * 31) + this.f99286b.hashCode();
        }

        public String toString() {
            P p10 = this.f99285a;
            M m10 = this.f99286b;
            return "SelectedTimeSlot(transportMethod=" + p10 + ", timeSlot=" + m10 + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$f */
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f99287a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                lo.z[] r0 = lo.z.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                lo.z r1 = lo.z.GET_TIME_SLOTS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                lo.z r1 = lo.z.SAVE_TIME_SLOT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                lo.z r1 = lo.z.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f99287a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: lo.C11556a.f.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "LNn/M;", "timeSlots", "Llo/a$c;", "config", "Llo/a$b;", "<anonymous>", "(Ljava/util/List;Llo/a$c;)Llo/a$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangeDeliveryTimeSlotViewModel$availableTimeSlots$1", f = "ChangeDeliveryTimeSlotViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lo.a$g */
    static final class g extends kotlin.coroutines.jvm.internal.l implements q<List<? extends M>, c, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99288c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f99289d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99290e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11556a f99291f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C11556a aVar, C17164e<? super g> eVar) {
            super(3, eVar);
            this.f99291f = aVar;
        }

        /* renamed from: i */
        public final Object invoke(List<M> list, c cVar, C17164e<? super b> eVar) {
            g gVar = new g(this.f99291f, eVar);
            gVar.f99289d = list;
            gVar.f99290e = cVar;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f99288c == 0) {
                y.b(obj);
                List list = (List) this.f99289d;
                c cVar = (c) this.f99290e;
                if (this.f99291f.f99244B == null) {
                    C11556a aVar = this.f99291f;
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No selected delivery service holder");
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
                            String a10 = C11818a.a((String) null, illegalArgumentException);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
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
                        bVar.a(eVar, str4, false, illegalArgumentException, str3);
                        str = str3;
                        str2 = str4;
                    }
                    this.f99291f.f99262x.d(C2264a.C2265a.f99265a);
                    return null;
                }
                C11556a aVar2 = this.f99291f;
                return aVar2.O(aVar2.f99244B, list, cVar);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"lo/a$h", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$h */
    public static final class h extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11556a f99292a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(N.a aVar, C11556a aVar2) {
            super(aVar);
            this.f99292a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            C11556a aVar = this.f99292a;
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
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
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
            C16505B E10 = this.f99292a.f99261w;
            do {
                value = E10.getValue();
                z zVar = (z) value;
            } while (!E10.e(value, z.NONE));
            this.f99292a.f99262x.d(C2264a.C2265a.f99265a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangeDeliveryTimeSlotViewModel$getTimeWindows$2", f = "ChangeDeliveryTimeSlotViewModel.kt", l = {228}, m = "invokeSuspend")
    /* renamed from: lo.a$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f99293c;

        /* renamed from: d  reason: collision with root package name */
        Object f99294d;

        /* renamed from: e  reason: collision with root package name */
        Object f99295e;

        /* renamed from: f  reason: collision with root package name */
        Object f99296f;

        /* renamed from: g  reason: collision with root package name */
        Object f99297g;

        /* renamed from: h  reason: collision with root package name */
        Object f99298h;

        /* renamed from: i  reason: collision with root package name */
        Object f99299i;

        /* renamed from: j  reason: collision with root package name */
        Object f99300j;

        /* renamed from: k  reason: collision with root package name */
        Object f99301k;

        /* renamed from: l  reason: collision with root package name */
        Object f99302l;

        /* renamed from: m  reason: collision with root package name */
        Object f99303m;

        /* renamed from: n  reason: collision with root package name */
        Object f99304n;

        /* renamed from: o  reason: collision with root package name */
        Object f99305o;

        /* renamed from: p  reason: collision with root package name */
        int f99306p;

        /* renamed from: q  reason: collision with root package name */
        int f99307q;

        /* renamed from: r  reason: collision with root package name */
        final /* synthetic */ C11556a f99308r;

        /* renamed from: s  reason: collision with root package name */
        final /* synthetic */ K f99309s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ List<M> f99310t;

        /* renamed from: u  reason: collision with root package name */
        final /* synthetic */ String f99311u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ String f99312v;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C11556a aVar, K k10, List<M> list, String str, String str2, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f99308r = aVar;
            this.f99309s = k10;
            this.f99310t = list;
            this.f99311u = str;
            this.f99312v = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f99308r, this.f99309s, this.f99310t, this.f99311u, this.f99312v, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: Nn.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: Nn.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: Nn.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: Nn.q} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v1, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: Nn.G} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: java.lang.Iterable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: java.lang.Iterable} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x00e5 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r6 = r17
                java.lang.Object r7 = eI.C17187b.f()
                int r0 = r6.f99307q
                r1 = 1
                r8 = 0
                if (r0 == 0) goto L_0x0049
                if (r0 != r1) goto L_0x0041
                java.lang.Object r0 = r6.f99304n
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f99303m
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f99302l
                Nn.x r0 = (Nn.x) r0
                java.lang.Object r0 = r6.f99301k
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r0 = r6.f99300j
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.Object r0 = r6.f99299i
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f99297g
                Nn.K$b r0 = (Nn.K.b) r0
                java.lang.Object r0 = r6.f99296f
                lo.z r0 = (lo.z) r0
                java.lang.Object r0 = r6.f99295e
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r6.f99294d
                Nn.J$b r0 = (Nn.J.b) r0
                java.lang.Object r0 = r6.f99293c
                java.util.List r0 = (java.util.List) r0
                XH.y.b(r18)
                r0 = r18
                goto L_0x00e6
            L_0x0041:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L_0x0049:
                XH.y.b(r18)
                lo.a r0 = r6.f99308r
                TJ.B r0 = r0.f99261w
            L_0x0052:
                java.lang.Object r2 = r0.getValue()
                r3 = r2
                lo.z r3 = (lo.z) r3
                lo.z r3 = lo.z.GET_TIME_SLOTS
                boolean r2 = r0.e(r2, r3)
                if (r2 == 0) goto L_0x0052
                Nn.K r0 = r6.f99309s
                java.util.List r0 = r0.a()
                Nn.K r2 = r6.f99309s
                Nn.p r2 = r2.c()
                Nn.J$b r4 = Co.c.j(r2)
                Nn.K r2 = r6.f99309s
                java.lang.String r2 = r2.f()
                java.util.List<Nn.M> r5 = r6.f99310t
                if (r5 == 0) goto L_0x007d
                goto L_0x012e
            L_0x007d:
                lo.a r5 = r6.f99308r
                Nn.x r5 = r5.f99251m
                java.lang.String r9 = r6.f99311u
                r10 = r0
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.lang.String r11 = r6.f99312v
                java.util.Iterator r12 = r10.iterator()
            L_0x008e:
                boolean r13 = r12.hasNext()
                if (r13 == 0) goto L_0x00a6
                java.lang.Object r13 = r12.next()
                r14 = r13
                Nn.K$b r14 = (Nn.K.b) r14
                java.lang.String r14 = r14.a()
                boolean r14 = kotlin.jvm.internal.C17542s.e(r14, r11)
                if (r14 == 0) goto L_0x008e
                goto L_0x00a7
            L_0x00a6:
                r13 = r8
            L_0x00a7:
                r14 = r13
                Nn.K$b r14 = (Nn.K.b) r14
                if (r14 == 0) goto L_0x00b7
                Nn.G r15 = r14.d()
                if (r15 == 0) goto L_0x00b8
                java.lang.String r16 = r15.g()
                goto L_0x00ba
            L_0x00b7:
                r15 = r10
            L_0x00b8:
                r16 = r8
            L_0x00ba:
                r6.f99293c = r0
                r6.f99294d = r4
                r6.f99295e = r2
                r6.f99296f = r3
                r6.f99297g = r14
                r6.f99298h = r15
                r6.f99299i = r11
                r6.f99300j = r10
                r6.f99301k = r12
                r6.f99302l = r5
                r6.f99303m = r9
                r6.f99304n = r2
                r6.f99305o = r13
                r0 = 0
                r6.f99306p = r0
                r6.f99307q = r1
                r0 = r5
                r1 = r9
                r3 = r16
                r5 = r17
                java.lang.Object r0 = r0.B(r1, r2, r3, r4, r5)
                if (r0 != r7) goto L_0x00e6
                return r7
            L_0x00e6:
                java.util.List r0 = (java.util.List) r0
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.lang.String r1 = r6.f99312v
                java.util.Iterator r0 = r0.iterator()
            L_0x00f0:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0108
                java.lang.Object r2 = r0.next()
                r3 = r2
                Nn.q r3 = (Nn.C10814q) r3
                java.lang.String r3 = r3.b()
                boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r1)
                if (r3 == 0) goto L_0x00f0
                r8 = r2
            L_0x0108:
                Nn.q r8 = (Nn.C10814q) r8
                if (r8 != 0) goto L_0x011a
                lo.a r0 = r6.f99308r
                ip.b r0 = r0.f99262x
                lo.a$a$a r1 = lo.C11556a.C2264a.C2265a.f99265a
                r0.d(r1)
                XH.N r0 = XH.C16807N.f139792a
                return r0
            L_0x011a:
                Nn.M r0 = r8.c()
                java.util.List r0 = YH.C16877v.e(r0)
                java.util.Collection r0 = (java.util.Collection) r0
                java.util.List r1 = r8.d()
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.List r5 = YH.C16877v.V0(r0, r1)
            L_0x012e:
                lo.a r0 = r6.f99308r
                TJ.B r2 = r0.f99247E
            L_0x0134:
                java.lang.Object r0 = r2.getValue()
                r1 = r0
                java.util.List r1 = (java.util.List) r1
                boolean r0 = r2.e(r0, r5)
                if (r0 == 0) goto L_0x0134
                lo.a r0 = r6.f99308r
                TJ.B r0 = r0.f99261w
            L_0x0147:
                java.lang.Object r1 = r0.getValue()
                r2 = r1
                lo.z r2 = (lo.z) r2
                lo.z r2 = lo.z.NONE
                boolean r1 = r0.e(r1, r2)
                if (r1 == 0) goto L_0x0147
                XH.N r0 = XH.C16807N.f139792a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: lo.C11556a.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"lo/a$j", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$j */
    public static final class j extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11556a f99313a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(N.a aVar, C11556a aVar2) {
            super(aVar);
            this.f99313a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C11556a aVar = this.f99313a;
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
                    String a10 = C11818a.a("Error putting delivery time slot", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
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
            this.f99313a.f99262x.d(C2264a.C2265a.f99265a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangeDeliveryTimeSlotViewModel$saveTimeSlot$3", f = "ChangeDeliveryTimeSlotViewModel.kt", l = {287}, m = "invokeSuspend")
    /* renamed from: lo.a$k */
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f99314c;

        /* renamed from: d  reason: collision with root package name */
        Object f99315d;

        /* renamed from: e  reason: collision with root package name */
        int f99316e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11556a f99317f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f99318g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ List<C10800c> f99319h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C11556a aVar, String str, List<C10800c> list, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f99317f = aVar;
            this.f99318g = str;
            this.f99319h = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f99317f, this.f99318g, this.f99319h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f99316e;
            if (i10 == 0) {
                y.b(obj);
                K H10 = this.f99317f.f99244B;
                if (H10 != null) {
                    ko.g G10 = this.f99317f.f99253o;
                    String j10 = this.f99317f.f99257s;
                    String D10 = this.f99317f.f99258t;
                    String str = this.f99318g;
                    UserPostalCodeAddress F10 = this.f99317f.f99260v;
                    Map<String, String> b10 = F10 != null ? F10.b() : null;
                    List<C10800c> list = this.f99319h;
                    this.f99314c = H10;
                    this.f99315d = F10;
                    this.f99316e = 1;
                    if (G10.a(j10, D10, str, H10, b10, list, this) == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalStateException("No selected delivery service holder");
                }
            } else if (i10 == 1) {
                UserPostalCodeAddress userPostalCodeAddress = (UserPostalCodeAddress) this.f99315d;
                K k10 = (K) this.f99314c;
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    C16505B E10 = this.f99317f.f99261w;
                    do {
                        value2 = E10.getValue();
                        z zVar = (z) value2;
                    } while (!E10.e(value2, z.NONE));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f99317f.f99262x.d(C2264a.c.f99267a);
            C16505B E11 = this.f99317f.f99261w;
            do {
                value = E11.getValue();
                z zVar2 = (z) value;
            } while (!E11.e(value, z.NONE));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: lo.a$l */
    public static final class l implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f99320a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: lo.a$l$a  reason: collision with other inner class name */
        public static final class C2269a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f99321a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangeDeliveryTimeSlotViewModel$special$$inlined$map$1$2", f = "ChangeDeliveryTimeSlotViewModel.kt", l = {50}, m = "emit")
            /* renamed from: lo.a$l$a$a  reason: collision with other inner class name */
            public static final class C2270a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f99322c;

                /* renamed from: d  reason: collision with root package name */
                int f99323d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2269a f99324e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2270a(C2269a aVar, C17164e eVar) {
                    super(eVar);
                    this.f99324e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f99322c = obj;
                    this.f99323d |= Integer.MIN_VALUE;
                    return this.f99324e.emit((Object) null, this);
                }
            }

            public C2269a(C16533h hVar) {
                this.f99321a = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
                r2 = r13.g();
             */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r13, dI.C17164e r14) {
                /*
                    r12 = this;
                    boolean r0 = r14 instanceof lo.C11556a.l.C2269a.C2270a
                    if (r0 == 0) goto L_0x0013
                    r0 = r14
                    lo.a$l$a$a r0 = (lo.C11556a.l.C2269a.C2270a) r0
                    int r1 = r0.f99323d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f99323d = r1
                    goto L_0x0018
                L_0x0013:
                    lo.a$l$a$a r0 = new lo.a$l$a$a
                    r0.<init>(r12, r14)
                L_0x0018:
                    java.lang.Object r14 = r0.f99322c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f99323d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r14)
                    goto L_0x0079
                L_0x0029:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L_0x0031:
                    XH.y.b(r14)
                    TJ.h r14 = r12.f99321a
                    com.ingka.ikea.mcomsettings.MComConfig r13 = (com.ingka.ikea.mcomsettings.MComConfig) r13
                    if (r13 == 0) goto L_0x005f
                    com.ingka.ikea.mcomsettings.MComConfig$d r2 = r13.g()
                    if (r2 == 0) goto L_0x005f
                    lo.a$c$a r11 = new lo.a$c$a
                    java.lang.String r5 = r2.b()
                    java.lang.String r6 = r2.c()
                    java.lang.String r7 = r2.f()
                    java.lang.String r8 = r2.d()
                    java.lang.String r9 = r2.e()
                    java.lang.String r10 = r2.a()
                    r4 = r11
                    r4.<init>(r5, r6, r7, r8, r9, r10)
                    goto L_0x0063
                L_0x005f:
                    lo.a$c$a r11 = lo.C11556a.f99242K
                L_0x0063:
                    if (r13 == 0) goto L_0x006a
                    boolean r13 = r13.r()
                    goto L_0x006b
                L_0x006a:
                    r13 = 0
                L_0x006b:
                    lo.a$c r2 = new lo.a$c
                    r2.<init>(r11, r13)
                    r0.f99323d = r3
                    java.lang.Object r13 = r14.emit(r2, r0)
                    if (r13 != r1) goto L_0x0079
                    return r1
                L_0x0079:
                    XH.N r13 = XH.C16807N.f139792a
                    return r13
                */
                throw new UnsupportedOperationException("Method not decompiled: lo.C11556a.l.C2269a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public l(C16532g gVar) {
            this.f99320a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f99320a.collect(new C2269a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Llo/z;", "loadingState", "Llo/a$b;", "availableTimeSlots", "", "selectedGroupId", "selectedSlotId", "LXC/a$a;", "<anonymous>", "(Llo/z;Llo/a$b;Ljava/lang/String;Ljava/lang/String;)LXC/a$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangeDeliveryTimeSlotViewModel$uiState$1", f = "ChangeDeliveryTimeSlotViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lo.a$m */
    static final class m extends kotlin.coroutines.jvm.internal.l implements s<z, b, String, String, C17164e<? super C13802a.C2911a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99325c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f99326d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99327e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f99328f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f99329g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11556a f99330h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C11556a aVar, C17164e<? super m> eVar) {
            super(5, eVar);
            this.f99330h = aVar;
        }

        /* renamed from: i */
        public final Object z(z zVar, b bVar, String str, String str2, C17164e<? super C13802a.C2911a> eVar) {
            m mVar = new m(this.f99330h, eVar);
            mVar.f99326d = zVar;
            mVar.f99327e = bVar;
            mVar.f99328f = str;
            mVar.f99329g = str2;
            return mVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f99325c == 0) {
                y.b(obj);
                b bVar = (b) this.f99327e;
                this.f99330h.f99249G = bVar.a();
                return this.f99330h.L((z) this.f99326d, bVar, (String) this.f99328f, (String) this.f99329g);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LTJ/h;", "LXC/a$a;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.viewmodels.ChangeDeliveryTimeSlotViewModel$uiState$2", f = "ChangeDeliveryTimeSlotViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: lo.a$n */
    static final class n extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super C13802a.C2911a>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f99331c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f99332d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f99333e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11556a f99334f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        n(C11556a aVar, C17164e<? super n> eVar) {
            super(3, eVar);
            this.f99334f = aVar;
        }

        public final Object invoke(C16533h<? super C13802a.C2911a> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            n nVar = new n(this.f99334f, eVar);
            nVar.f99332d = hVar;
            nVar.f99333e = th2;
            return nVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f99331c == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f99332d;
                Throwable th2 = (Throwable) this.f99333e;
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
                        String a10 = C11818a.a("Error getting time slot ui state", th2);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = hVar.getClass().getName();
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
                this.f99334f.f99262x.d(C2264a.C2265a.f99265a);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11556a(U u10, C11892a aVar, x xVar, ko.e eVar, ko.g gVar, Wn.b bVar, a aVar2, C10242c cVar) {
        String str;
        String b10;
        String str2;
        U u11 = u10;
        C11892a aVar3 = aVar;
        x xVar2 = xVar;
        ko.e eVar2 = eVar;
        ko.g gVar2 = gVar;
        Wn.b bVar2 = bVar;
        a aVar4 = aVar2;
        C10242c cVar2 = cVar;
        C17542s.j(u11, "savedStateHandle");
        C17542s.j(aVar3, "mCommerceConfigRepository");
        C17542s.j(xVar2, "checkoutRepo");
        C17542s.j(eVar2, "getTimeSlotDatesUseCase");
        C17542s.j(gVar2, "saveTimeSlotUseCase");
        C17542s.j(bVar2, "checkoutAnalytics");
        C17542s.j(aVar4, "appConfigApi");
        C17542s.j(cVar2, "userDataRepository");
        this.f99251m = xVar2;
        this.f99252n = eVar2;
        this.f99253o = gVar2;
        this.f99254p = bVar2;
        this.f99255q = aVar4;
        this.f99256r = cVar2;
        Object f10 = u11.f("checkoutId");
        if (f10 != null) {
            this.f99257s = (String) f10;
            Object f11 = u11.f("deliveryId");
            if (f11 != null) {
                this.f99258t = (String) f11;
                this.f99259u = (ChangeDeliveryTimeSlotFragment.a) u11.f("time_window_data");
                UserPostalCodeAddress userPostalCodeAddress = (UserPostalCodeAddress) u11.f("postal_code_address_id");
                String str3 = DslKt.INDICATOR_BACKGROUND;
                Class<C11556a> cls = C11556a.class;
                int i10 = 2;
                List<M> list = null;
                if (userPostalCodeAddress == null) {
                    qv.e eVar3 = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar3, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str4 = null;
                    String str5 = null;
                    for (C11819b bVar3 : arrayList) {
                        if (str4 == null) {
                            String a10 = C11818a.a("No postal code address provided, fetching from user repo", (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str4 = C11820c.a(a10);
                        }
                        if (str5 == null) {
                            String name = cls.getName();
                            C17542s.g(name);
                            str2 = str3;
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            name = o12.length() != 0 ? C15854t.P0(o12, "Kt") : name;
                            str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name;
                        } else {
                            str2 = str3;
                        }
                        bVar3.a(eVar3, str5, false, (Throwable) null, str4);
                        str3 = str2;
                    }
                    str = str3;
                    userPostalCodeAddress = this.f99256r.l();
                } else {
                    str = str3;
                }
                this.f99260v = userPostalCodeAddress;
                C16505B<z> a11 = C16521S.a(z.NONE);
                this.f99261w = a11;
                C11410b<C2264a> bVar4 = new C11410b<>();
                this.f99262x = bVar4;
                this.f99263y = bVar4;
                this.f99264z = C16521S.a(null);
                C16505B<String> a12 = C16521S.a(null);
                this.f99243A = a12;
                C10803f s10 = this.f99251m.s(this.f99257s);
                K i11 = s10 != null ? s10.i() : null;
                this.f99244B = i11;
                C13023e a13 = C13026h.a(C11849b.f102272b0);
                this.f99245C = a13;
                l lVar = new l(C11892a.C2450a.a(aVar3, false, 1, (Object) null));
                this.f99246D = lVar;
                C16505B<List<M>> a14 = C16521S.a(null);
                this.f99247E = a14;
                C16532g<b> n10 = C16534i.n(C16534i.A(a14), lVar, new g(this, (C17164e<? super g>) null));
                this.f99248F = n10;
                C16532g<R> g10 = C16534i.g(C16534i.l(a11, C16534i.A(n10), this.f99264z, a12, new m(this, (C17164e<? super m>) null)), new n(this, (C17164e<? super n>) null));
                Q a15 = g0.a(this);
                C16515L a16 = ip.f.a();
                ChangeDeliveryTimeSlotFragment.a aVar5 = this.f99259u;
                this.f99250H = C16534i.c0(g10, a15, a16, new C13802a.C2911a.c(a13, (aVar5 == null || (b10 = aVar5.b()) == null) ? null : C13026h.c(b10)));
                if (i11 != null) {
                    String str6 = this.f99257s;
                    String str7 = this.f99258t;
                    ChangeDeliveryTimeSlotFragment.a aVar6 = this.f99259u;
                    Q(str6, str7, aVar6 != null ? aVar6.a() : list, i11);
                    return;
                }
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No selected delivery service holder");
                qv.e eVar4 = qv.e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar4, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar5 : arrayList2) {
                    if (str8 == null) {
                        String a17 = C11818a.a((String) null, illegalArgumentException);
                        if (a17 != null) {
                            str8 = C11820c.a(a17);
                        } else {
                            return;
                        }
                    }
                    if (str9 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                        name2 = o13.length() != 0 ? C15854t.P0(o13, "Kt") : name2;
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar5.a(eVar4, str9, false, illegalArgumentException, str8);
                    i10 = 2;
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final C13802a.C2911a L(z zVar, b bVar, String str, String str2) {
        String b10;
        List<C11438d> list;
        Iterator it;
        String str3;
        String b11;
        Object obj;
        b bVar2 = bVar;
        String str4 = str2;
        int i10 = f.f99287a[zVar.ordinal()];
        if (i10 != 1) {
            int i11 = 2;
            if (i10 == 2 || i10 == 3) {
                b.C2266a a10 = bVar.a();
                String d10 = a10 != null ? a10.d() : null;
                String str5 = str;
                String str6 = str4 == null ? d10 : str4;
                List<C11437c> N10 = N(bVar2, str5, str6);
                if (bVar2 instanceof b.C2267b) {
                    Iterator it2 = N10.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (((C11437c) obj).f()) {
                            break;
                        }
                    }
                    C11437c cVar = (C11437c) obj;
                    if (cVar == null || (list = cVar.g()) == null) {
                        list = C16877v.n();
                    }
                } else if (bVar2 instanceof b.c) {
                    list = ((b.c) bVar2).b();
                } else {
                    throw new t();
                }
                Iterable<C11438d> iterable = list;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (C11438d dVar : iterable) {
                    arrayList.add(C11438d.b(dVar, (C11438d.a) null, C17542s.e(dVar.e().c(), str6), (String) null, 5, (Object) null));
                }
                boolean z10 = zVar == z.SAVE_TIME_SLOT;
                C13023e c10 = z10 ? C13026h.c("") : C13026h.a(C11849b.f102234S);
                boolean z11 = str4 != null && !C17542s.e(str4, d10);
                C13023e eVar = this.f99245C;
                ChangeDeliveryTimeSlotFragment.a aVar = this.f99259u;
                C13023e c11 = (aVar == null || (b11 = aVar.b()) == null) ? null : C13026h.c(b11);
                b.C2266a a11 = bVar.a();
                C13802a.C2911a.C2912a.C2913a aVar2 = a11 != null ? new C13802a.C2911a.C2912a.C2913a(a11.a(), a11.c(), a11.b()) : null;
                Iterable<C11437c> iterable2 = N10;
                ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
                for (C11437c cVar2 : iterable2) {
                    String e10 = cVar2.e();
                    boolean f10 = cVar2.f();
                    String d11 = cVar2.d();
                    String c12 = cVar2.c();
                    Collection g10 = cVar2.g();
                    arrayList2.add(new C13802a.C2911a.C2912a.d(e10, !(g10 == null || g10.isEmpty()), f10, d11, c12));
                }
                ArrayList arrayList3 = new ArrayList(C16877v.y(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    C11438d dVar2 = (C11438d) it3.next();
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dVar2.d(), this.f99255q.A());
                    String format = String.format("%s-%s", Arrays.copyOf(new Object[]{simpleDateFormat.format(dVar2.e().b()), simpleDateFormat.format(dVar2.e().d())}, i11));
                    C17542s.i(format, "format(...)");
                    String c13 = dVar2.e().c();
                    boolean c14 = dVar2.c();
                    Double a12 = dVar2.e().a();
                    if (a12 != null) {
                        it = it3;
                        str3 = C14956a.f130484a.b(a12.doubleValue(), this.f99255q.s());
                    } else {
                        it = it3;
                        str3 = null;
                    }
                    arrayList3.add(new C13802a.C2911a.C2912a.c(c13, c14, format, str3));
                    it3 = it;
                    i11 = 2;
                }
                return new C13802a.C2911a.C2912a(eVar, c11, aVar2, arrayList2, arrayList3, z11 ? new C13802a.C2911a.C2912a.b(z10, c10) : null);
            }
            throw new t();
        }
        C13023e eVar2 = this.f99245C;
        ChangeDeliveryTimeSlotFragment.a aVar3 = this.f99259u;
        return new C13802a.C2911a.c(eVar2, (aVar3 == null || (b10 = aVar3.b()) == null) ? null : C13026h.c(b10));
    }

    private final List<C11437c> N(b bVar, String str, String str2) {
        Object obj;
        C11438d dVar;
        Object obj2;
        if (bVar instanceof b.C2267b) {
            if (str == null) {
                b.C2267b bVar2 = (b.C2267b) bVar;
                b.C2266a a10 = bVar2.a();
                if (!(a10 == null || a10.d() == null)) {
                    Iterator it = bVar2.b().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        List<C11438d> g10 = ((C11437c) obj).g();
                        if (g10 != null) {
                            Iterator it2 = g10.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = it2.next();
                                if (C17542s.e(((C11438d) obj2).e().c(), str2)) {
                                    break;
                                }
                            }
                            dVar = (C11438d) obj2;
                            continue;
                        } else {
                            dVar = null;
                            continue;
                        }
                        if (dVar != null) {
                            break;
                        }
                    }
                    C11437c cVar = (C11437c) obj;
                    if (cVar != null) {
                        str = cVar.e();
                    }
                }
                str = null;
            }
            Iterable<C11437c> b10 = ((b.C2267b) bVar).b();
            ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
            for (C11437c cVar2 : b10) {
                arrayList.add(C11437c.b(cVar2, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, C17542s.e(cVar2.e(), str), 127, (Object) null));
            }
            return arrayList;
        } else if (bVar instanceof b.c) {
            return C16877v.n();
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final b O(K k10, List<M> list, c cVar) {
        return this.f99252n.a(k10.e(), P(k10.a(), this.f99258t, list), list, cVar);
    }

    private final e P(List<K.b> list, String str, List<M> list2) {
        Object obj;
        Object obj2;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((K.b) obj).a(), str)) {
                break;
            }
        }
        K.b bVar = (K.b) obj;
        K.b.c e10 = bVar != null ? bVar.e() : null;
        Iterator it2 = list2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (C17542s.e(((M) obj2).e(), e10 != null ? e10.b() : null)) {
                break;
            }
        }
        M m10 = (M) obj2;
        if (bVar == null) {
            return null;
        }
        P f10 = bVar.f();
        if (m10 != null) {
            return new e(f10, m10);
        }
        return null;
    }

    private final void Q(String str, String str2, List<M> list, K k10) {
        F0 unused = C16314k.d(g0.a(this), new h(N.f137593c0, this), (T) null, new i(this, k10, list, str, str2, (C17164e<? super i>) null), 2, (Object) null);
    }

    private final void R(String str, List<C10800c> list) {
        z value;
        C16505B<z> b10 = this.f99261w;
        do {
            value = b10.getValue();
            z zVar = value;
        } while (!b10.e(value, z.SAVE_TIME_SLOT));
        F0 unused = C16314k.d(g0.a(this), new j(N.f137593c0, this), (T) null, new k(this, str, list, (C17164e<? super k>) null), 2, (Object) null);
    }

    private final void S() {
        List<K.b> a10;
        Object obj;
        P f10;
        String name;
        K k10 = this.f99244B;
        if (k10 != null && (a10 = k10.a()) != null) {
            Iterator it = a10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C17542s.e(((K.b) obj).a(), this.f99258t)) {
                    break;
                }
            }
            K.b bVar = (K.b) obj;
            if (bVar != null && (f10 = bVar.f()) != null && (name = f10.name()) != null) {
                this.f99254p.x(name);
            }
        }
    }

    public void A(String str) {
        String value;
        C17542s.j(str, "id");
        C16505B<String> b10 = this.f99243A;
        do {
            value = b10.getValue();
            String str2 = value;
        } while (!b10.e(value, str));
    }

    public final F<C2264a> M() {
        return this.f99263y;
    }

    public void f(String str) {
        String value;
        C17542s.j(str, "id");
        C16505B<String> b10 = this.f99264z;
        do {
            value = b10.getValue();
            String str2 = value;
        } while (!b10.e(value, str));
    }

    public C16519P<C13802a.C2911a> m() {
        return this.f99250H;
    }

    public void r() {
        boolean z10;
        String str;
        String value = this.f99243A.getValue();
        String str2 = DslKt.INDICATOR_BACKGROUND;
        char c10 = '$';
        Class<C11556a> cls = C11556a.class;
        if (value == null) {
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a("User didn't select any time slot. Just close", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str4 = str6;
                str3 = str5;
                c10 = '$';
            }
            this.f99262x.d(C2264a.b.f99266a);
            return;
        }
        b.C2266a aVar = this.f99249G;
        if (C17542s.e(value, aVar != null ? aVar.d() : null)) {
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            Iterator it = qv.d.f102012a.a().iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str7 == null) {
                    String a11 = C11818a.a("User selected same timeslot as already set. Just close", (Throwable) null);
                    if (a11 == null) {
                        break;
                    }
                    str7 = C11820c.a(a11);
                }
                if (str8 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    str = str2;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str = str2;
                }
                boolean z11 = z10;
                bVar2.a(eVar2, str8, z11, (Throwable) null, str7);
                str2 = str;
                z10 = z11;
            }
            this.f99262x.d(C2264a.b.f99266a);
            return;
        }
        R(value, C16877v.n());
        S();
    }
}
