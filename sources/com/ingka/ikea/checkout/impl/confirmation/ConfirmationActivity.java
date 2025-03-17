package com.ingka.ikea.checkout.impl.confirmation;

import Ae.e;
import Eg.b;
import HJ.C15854t;
import IC.C13023e;
import Nn.M;
import U0.C4889m;
import U0.C4895p;
import U0.r;
import Wn.o;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import YH.C16877v;
import YH.X;
import aA.C13909a;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.h0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.mcomsettings.MComConfig;
import com.sugarcube.core.logger.DslKt;
import e.C5282e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import jo.C11435a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.V;
import lo.j;
import nI.C17631a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import vi.C12127a;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 W2\u00020\u0001:\u0002XYB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0013\u0010\u0003R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010K\u001a\u00020D8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001b\u0010Q\u001a\u00020L8BX\u0002¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0002¢\u0006\f\n\u0004\bS\u0010N\u001a\u0004\bT\u0010U¨\u0006Z"}, d2 = {"Lcom/ingka/ikea/checkout/impl/confirmation/ConfirmationActivity;", "Lcom/ingka/ikea/core/android/activities/BaseLocaleActivity;", "<init>", "()V", "LXH/N;", "T0", "Q0", "Llo/j;", "delivery", "H0", "(Llo/j;)V", "", "orderNumber", "S0", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "LAe/e;", "H", "LAe/e;", "I0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LWn/o;", "I", "LWn/o;", "K0", "()LWn/o;", "setDeliveryDetailsAnalytics$checkout_implementation_release", "(LWn/o;)V", "deliveryDetailsAnalytics", "LaA/a;", "J", "LaA/a;", "getSessionManager", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "Lpw/c;", "K", "Lpw/c;", "P0", "()Lpw/c;", "setWelcomeActivityApi", "(Lpw/c;)V", "welcomeActivityApi", "Lvi/a;", "L", "Lvi/a;", "M0", "()Lvi/a;", "setPurchaseHistoryNavigation", "(Lvi/a;)V", "purchaseHistoryNavigation", "LXn/i;", "M", "LXn/i;", "N0", "()LXn/i;", "setStartActivityInteractor", "(LXn/i;)V", "startActivityInteractor", "LXn/a;", "N", "LXn/a;", "L0", "()LXn/a;", "setDeliveryDetailsInteractor$checkout_implementation_release", "(LXn/a;)V", "deliveryDetailsInteractor", "Lbo/f;", "O", "LXH/o;", "J0", "()Lbo/f;", "confirmationViewModel", "LEg/c;", "P", "O0", "()LEg/c;", "surveyViewModel", "Q", "a", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConfirmationActivity extends Hilt_ConfirmationActivity {

    /* renamed from: Q  reason: collision with root package name */
    public static final b f94397Q = new b((DefaultConstructorMarker) null);

    /* renamed from: R  reason: collision with root package name */
    public static final int f94398R = 8;

    /* renamed from: H  reason: collision with root package name */
    public Ae.e f94399H;

    /* renamed from: I  reason: collision with root package name */
    public o f94400I;

    /* renamed from: J  reason: collision with root package name */
    public C13909a f94401J;

    /* renamed from: K  reason: collision with root package name */
    public pw.c f94402K;

    /* renamed from: L  reason: collision with root package name */
    public C12127a f94403L;

    /* renamed from: M  reason: collision with root package name */
    public Xn.i f94404M;

    /* renamed from: N  reason: collision with root package name */
    public Xn.a f94405N;

    /* renamed from: O  reason: collision with root package name */
    private final C16824o f94406O = new h0(P.b(bo.f.class), new e(this), new d(this), new f((C17631a) null, this));

    /* renamed from: P  reason: collision with root package name */
    private final C16824o f94407P = new h0(P.b(Eg.c.class), new h(this), new g(this), new i((C17631a) null, this));

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/checkout/impl/confirmation/ConfirmationActivity$a;", "Landroid/os/Parcelable;", "", "title", "", "details", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "()Ljava/util/List;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2101a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f94408c = 8;

        /* renamed from: a  reason: collision with root package name */
        private final String f94409a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f94410b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity$a$a  reason: collision with other inner class name */
        public static final class C2101a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                return new a(parcel.readString(), parcel.createStringArrayList());
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(String str, List<String> list) {
            C17542s.j(str, "title");
            C17542s.j(list, "details");
            this.f94409a = str;
            this.f94410b = list;
        }

        public final List<String> a() {
            return this.f94410b;
        }

        public final String b() {
            return this.f94409a;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f94409a, aVar.f94409a) && C17542s.e(this.f94410b, aVar.f94410b);
        }

        public int hashCode() {
            return (this.f94409a.hashCode() * 31) + this.f94410b.hashCode();
        }

        public String toString() {
            String str = this.f94409a;
            List<String> list = this.f94410b;
            return "CollapsedUserDetailsData(title=" + str + ", details=" + list + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94409a);
            parcel.writeStringList(this.f94410b);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/ingka/ikea/checkout/impl/confirmation/ConfirmationActivity$b;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "checkoutId", "Landroid/content/Intent;", "a", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "CHECKOUT_ID_KEY", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(Context context, String str) {
            C17542s.j(context, "context");
            C17542s.j(str, "checkoutId");
            Intent intent = new Intent(context, ConfirmationActivity.class);
            intent.putExtra("CHECKOUT_ID_KEY", str);
            return intent;
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConfirmationActivity f94411a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ConfirmationActivity f94412a;

            a(ConfirmationActivity confirmationActivity) {
                this.f94412a = confirmationActivity;
            }

            /* access modifiers changed from: private */
            public static final C16807N m(ConfirmationActivity confirmationActivity) {
                confirmationActivity.finish();
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N n(ConfirmationActivity confirmationActivity, String str) {
                C17542s.j(str, "contactUsUri");
                Xo.c.c(confirmationActivity, str);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N p(ConfirmationActivity confirmationActivity, String str) {
                C17542s.j(str, "deliveryId");
                Xn.a L02 = confirmationActivity.L0();
                FragmentManager supportFragmentManager = confirmationActivity.getSupportFragmentManager();
                C17542s.i(supportFragmentManager, "getSupportFragmentManager(...)");
                L02.a(supportFragmentManager, confirmationActivity.J0().C(), str);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N q(ConfirmationActivity confirmationActivity, j jVar) {
                C17542s.j(jVar, "it");
                confirmationActivity.H0(jVar);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N s(ConfirmationActivity confirmationActivity) {
                ConfirmationOrderSummaryDialogFragment.f94421R.a(confirmationActivity.J0().C()).show(confirmationActivity.getSupportFragmentManager(), "order_summary_dialog");
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N t(ConfirmationActivity confirmationActivity) {
                confirmationActivity.finish();
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N u(ConfirmationActivity confirmationActivity, String str) {
                confirmationActivity.S0(str);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N v(ConfirmationActivity confirmationActivity, String str) {
                confirmationActivity.S0(str);
                e.c.b(confirmationActivity.I0(), Interaction$Component.ASSEMBLY_SERVICE, (String) null, X.f(C16796C.a("app_location", "order_confirmation")), (e.b) null, 10, (Object) null);
                return C16807N.f139792a;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                k((C4889m) obj, ((Number) obj2).intValue());
                return C16807N.f139792a;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: nI.a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: nI.l} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: nI.l} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void k(U0.C4889m r14, int r15) {
                /*
                    r13 = this;
                    r0 = r15 & 3
                    r1 = 2
                    if (r0 != r1) goto L_0x0011
                    boolean r0 = r14.l()
                    if (r0 != 0) goto L_0x000c
                    goto L_0x0011
                L_0x000c:
                    r14.L()
                    goto L_0x0199
                L_0x0011:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0020
                    r0 = -1
                    java.lang.String r1 = "com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity.onCreate.<anonymous>.<anonymous> (ConfirmationActivity.kt:81)"
                    r2 = 1383020050(0x526f3612, float:2.56851083E11)
                    U0.C4895p.S(r2, r15, r0, r1)
                L_0x0020:
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    bo.f r0 = r15.J0()
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    Eg.c r1 = r15.O0()
                    r15 = -1876614371(0xffffffff9025231d, float:-3.2567563E-29)
                    r14.W(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    boolean r15 = r14.F(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r2 = r13.f94412a
                    java.lang.Object r3 = r14.D()
                    if (r15 != 0) goto L_0x0048
                    U0.m$a r15 = U0.C4889m.f14007a
                    java.lang.Object r15 = r15.a()
                    if (r3 != r15) goto L_0x0050
                L_0x0048:
                    com.ingka.ikea.checkout.impl.confirmation.c r3 = new com.ingka.ikea.checkout.impl.confirmation.c
                    r3.<init>(r2)
                    r14.u(r3)
                L_0x0050:
                    r5 = r3
                    nI.a r5 = (nI.C17631a) r5
                    r14.P()
                    r15 = -1876610467(0xffffffff9025325d, float:-3.257931E-29)
                    r14.W(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    boolean r15 = r14.F(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r2 = r13.f94412a
                    java.lang.Object r3 = r14.D()
                    if (r15 != 0) goto L_0x0072
                    U0.m$a r15 = U0.C4889m.f14007a
                    java.lang.Object r15 = r15.a()
                    if (r3 != r15) goto L_0x007a
                L_0x0072:
                    com.ingka.ikea.checkout.impl.confirmation.d r3 = new com.ingka.ikea.checkout.impl.confirmation.d
                    r3.<init>(r2)
                    r14.u(r3)
                L_0x007a:
                    r6 = r3
                    nI.a r6 = (nI.C17631a) r6
                    r14.P()
                    r15 = -1876597027(0xffffffff902566dd, float:-3.2619755E-29)
                    r14.W(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    boolean r15 = r14.F(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r2 = r13.f94412a
                    java.lang.Object r3 = r14.D()
                    if (r15 != 0) goto L_0x009c
                    U0.m$a r15 = U0.C4889m.f14007a
                    java.lang.Object r15 = r15.a()
                    if (r3 != r15) goto L_0x00a4
                L_0x009c:
                    com.ingka.ikea.checkout.impl.confirmation.e r3 = new com.ingka.ikea.checkout.impl.confirmation.e
                    r3.<init>(r2)
                    r14.u(r3)
                L_0x00a4:
                    r7 = r3
                    nI.a r7 = (nI.C17631a) r7
                    r14.P()
                    r15 = -1876593447(0xffffffff902574d9, float:-3.263053E-29)
                    r14.W(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    boolean r15 = r14.F(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r2 = r13.f94412a
                    java.lang.Object r3 = r14.D()
                    if (r15 != 0) goto L_0x00c6
                    U0.m$a r15 = U0.C4889m.f14007a
                    java.lang.Object r15 = r15.a()
                    if (r3 != r15) goto L_0x00ce
                L_0x00c6:
                    com.ingka.ikea.checkout.impl.confirmation.f r3 = new com.ingka.ikea.checkout.impl.confirmation.f
                    r3.<init>(r2)
                    r14.u(r3)
                L_0x00ce:
                    r8 = r3
                    nI.l r8 = (nI.C17642l) r8
                    r14.P()
                    r15 = -1876565637(0xffffffff9025e17b, float:-3.2714216E-29)
                    r14.W(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    boolean r15 = r14.F(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r2 = r13.f94412a
                    java.lang.Object r3 = r14.D()
                    if (r15 != 0) goto L_0x00f0
                    U0.m$a r15 = U0.C4889m.f14007a
                    java.lang.Object r15 = r15.a()
                    if (r3 != r15) goto L_0x00f8
                L_0x00f0:
                    com.ingka.ikea.checkout.impl.confirmation.g r3 = new com.ingka.ikea.checkout.impl.confirmation.g
                    r3.<init>(r2)
                    r14.u(r3)
                L_0x00f8:
                    r9 = r3
                    nI.l r9 = (nI.C17642l) r9
                    r14.P()
                    r15 = -1876588991(0xffffffff90258641, float:-3.2643938E-29)
                    r14.W(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    boolean r15 = r14.F(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r2 = r13.f94412a
                    java.lang.Object r3 = r14.D()
                    if (r15 != 0) goto L_0x011a
                    U0.m$a r15 = U0.C4889m.f14007a
                    java.lang.Object r15 = r15.a()
                    if (r3 != r15) goto L_0x0122
                L_0x011a:
                    com.ingka.ikea.checkout.impl.confirmation.h r3 = new com.ingka.ikea.checkout.impl.confirmation.h
                    r3.<init>(r2)
                    r14.u(r3)
                L_0x0122:
                    r10 = r3
                    nI.l r10 = (nI.C17642l) r10
                    r14.P()
                    r15 = -1876579562(0xffffffff9025ab16, float:-3.2672312E-29)
                    r14.W(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    boolean r15 = r14.F(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r2 = r13.f94412a
                    java.lang.Object r3 = r14.D()
                    if (r15 != 0) goto L_0x0144
                    U0.m$a r15 = U0.C4889m.f14007a
                    java.lang.Object r15 = r15.a()
                    if (r3 != r15) goto L_0x014c
                L_0x0144:
                    com.ingka.ikea.checkout.impl.confirmation.i r3 = new com.ingka.ikea.checkout.impl.confirmation.i
                    r3.<init>(r2)
                    r14.u(r3)
                L_0x014c:
                    r11 = r3
                    nI.l r11 = (nI.C17642l) r11
                    r14.P()
                    r15 = -1876584175(0xffffffff90259911, float:-3.265843E-29)
                    r14.W(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    boolean r15 = r14.F(r15)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r2 = r13.f94412a
                    java.lang.Object r3 = r14.D()
                    if (r15 != 0) goto L_0x016e
                    U0.m$a r15 = U0.C4889m.f14007a
                    java.lang.Object r15 = r15.a()
                    if (r3 != r15) goto L_0x0176
                L_0x016e:
                    com.ingka.ikea.checkout.impl.confirmation.j r3 = new com.ingka.ikea.checkout.impl.confirmation.j
                    r3.<init>(r2)
                    r14.u(r3)
                L_0x0176:
                    r12 = r3
                    nI.l r12 = (nI.C17642l) r12
                    r14.P()
                    Zn.K r2 = new Zn.K
                    r4 = r2
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                    com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity r15 = r13.f94412a
                    Wn.o r3 = r15.K0()
                    int r15 = Eg.c.f60231w
                    int r5 = r15 << 3
                    r4 = r14
                    Zn.h0.l(r0, r1, r2, r3, r4, r5)
                    boolean r14 = U0.C4895p.J()
                    if (r14 == 0) goto L_0x0199
                    U0.C4895p.R()
                L_0x0199:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity.c.a.k(U0.m, int):void");
            }
        }

        c(ConfirmationActivity confirmationActivity) {
            this.f94411a = confirmationActivity;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-253798088, i10, -1, "com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity.onCreate.<anonymous> (ConfirmationActivity.kt:80)");
                }
                TC.e.e(false, c1.c.e(1383020050, true, new a(this.f94411a), mVar, 54), mVar, 48, 1);
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94413c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(androidx.activity.j jVar) {
            super(0);
            this.f94413c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f94413c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94414c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(androidx.activity.j jVar) {
            super(0);
            this.f94414c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f94414c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94415c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94416d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, androidx.activity.j jVar) {
            super(0);
            this.f94415c = aVar;
            this.f94416d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f94415c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f94416d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity.f.invoke():l3.a");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94417c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(androidx.activity.j jVar) {
            super(0);
            this.f94417c = jVar;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            return this.f94417c.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94418c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(androidx.activity.j jVar) {
            super(0);
            this.f94418c = jVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return this.f94418c.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94419c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ androidx.activity.j f94420d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C17631a aVar, androidx.activity.j jVar) {
            super(0);
            this.f94419c = aVar;
            this.f94420d = jVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
            r0 = (l3.a) r0.invoke();
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final l3.a invoke() {
            /*
                r1 = this;
                nI.a r0 = r1.f94419c
                if (r0 == 0) goto L_0x000c
                java.lang.Object r0 = r0.invoke()
                l3.a r0 = (l3.a) r0
                if (r0 != 0) goto L_0x0012
            L_0x000c:
                androidx.activity.j r0 = r1.f94420d
                l3.a r0 = r0.getDefaultViewModelCreationExtras()
            L_0x0012:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.confirmation.ConfirmationActivity.i.invoke():l3.a");
        }
    }

    /* access modifiers changed from: private */
    public final void H0(j jVar) {
        Date c10;
        Date f10;
        String str;
        String str2;
        C11435a a10 = jVar.a();
        M i10 = a10.i();
        String str3 = DslKt.INDICATOR_BACKGROUND;
        String str4 = DslKt.INDICATOR_MAIN;
        Class<ConfirmationActivity> cls = ConfirmationActivity.class;
        if (i10 == null || (c10 = i10.c()) == null) {
            String str5 = str3;
            String str6 = str4;
            IllegalStateException illegalStateException = new IllegalStateException("SelectedTimeSlot fromDate was null");
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
                    String a11 = C11818a.a((String) null, illegalStateException);
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
                bVar.a(eVar, str8, false, illegalStateException, str7);
            }
            return;
        }
        M i11 = a10.i();
        if (i11 == null || (f10 = i11.f()) == null) {
            String str9 = str3;
            String str10 = str4;
            IllegalStateException illegalStateException2 = new IllegalStateException("SelectedTimeSlot toDate was null");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str11 = null;
            String str12 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str12 == null) {
                    String a12 = C11818a.a((String) null, illegalStateException2);
                    if (a12 != null) {
                        str12 = C11820c.a(a12);
                    } else {
                        return;
                    }
                }
                if (str11 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str10 : str9) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str11, false, illegalStateException2, str12);
            }
            return;
        }
        String string = getString(Co.c.k(jVar.j(), jVar.a().k()));
        C17542s.i(string, "getString(...)");
        String string2 = getString(Oo.b.f84441M3);
        C17542s.i(string2, "getString(...)");
        String string3 = getString(Oo.b.f84613d2);
        C17542s.i(string3, "getString(...)");
        String lowerCase = string3.toLowerCase(v0().A());
        C17542s.i(lowerCase, "toLowerCase(...)");
        V v10 = V.f144353a;
        String format = String.format("%s %s %s", Arrays.copyOf(new Object[]{string2, string, lowerCase}, 3));
        C17542s.i(format, "format(...)");
        qv.e eVar3 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next3 : qv.d.f102012a.a()) {
            if (((C11819b) next3).b(eVar3, false)) {
                arrayList3.add(next3);
            }
        }
        String str13 = null;
        String str14 = null;
        for (C11819b bVar3 : arrayList3) {
            if (str13 == null) {
                String a13 = C11818a.a("Add delivery to calendar: fromDate: " + c10 + ", toDate: " + f10, (Throwable) null);
                if (a13 == null) {
                    break;
                }
                str13 = C11820c.a(a13);
            }
            if (str14 == null) {
                String name3 = cls.getName();
                C17542s.g(name3);
                str2 = str3;
                str = str4;
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str14 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str : str2) + DslKt.INDICATOR_SEPARATOR + name3;
            } else {
                str2 = str3;
                str = str4;
            }
            bVar3.a(eVar3, str14, false, (Throwable) null, str13);
            str3 = str2;
            str4 = str;
        }
        String str15 = str3;
        String str16 = str4;
        Intent intent = new Intent("android.intent.action.INSERT");
        intent.setType("vnd.android.cursor.item/event");
        intent.putExtra("title", format);
        intent.putExtra("beginTime", c10.getTime());
        intent.putExtra("endTime", f10.getTime());
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            ActivityNotFoundException activityNotFoundException = e10;
            qv.e eVar4 = qv.e.WARN;
            ArrayList<C11819b> arrayList4 = new ArrayList<>();
            for (Object next4 : qv.d.f102012a.a()) {
                if (((C11819b) next4).b(eVar4, false)) {
                    arrayList4.add(next4);
                }
            }
            String str17 = null;
            String str18 = null;
            for (C11819b bVar4 : arrayList4) {
                if (str17 == null) {
                    String a14 = C11818a.a("Could not start any activity for adding calendar event", activityNotFoundException);
                    if (a14 != null) {
                        str17 = C11820c.a(a14);
                    } else {
                        return;
                    }
                }
                if (str18 == null) {
                    String name4 = cls.getName();
                    C17542s.g(name4);
                    String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o15.length() != 0) {
                        name4 = C15854t.P0(o15, "Kt");
                    }
                    str18 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? str16 : str15) + DslKt.INDICATOR_SEPARATOR + name4;
                }
                bVar4.a(eVar4, str18, false, activityNotFoundException, str17);
            }
        }
    }

    /* access modifiers changed from: private */
    public final bo.f J0() {
        return (bo.f) this.f94406O.getValue();
    }

    /* access modifiers changed from: private */
    public final Eg.c O0() {
        return (Eg.c) this.f94407P.getValue();
    }

    private final void Q0() {
        ip.j.a(O0().E(), this, new a(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(ConfirmationActivity confirmationActivity, Cg.a aVar) {
        C17542s.j(aVar, "it");
        confirmationActivity.O0().G();
        confirmationActivity.J0().H(new C13023e.d(Oo.b.f84707l8, (List) null, 2, (DefaultConstructorMarker) null));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void S0(String str) {
        e.c.b(I0(), Interaction$Component.VIEW_ORDER_STATUS, (String) null, (Map) null, (e.b) null, 14, (Object) null);
        Uri d10 = M0().d(str);
        Intent a10 = P0().a(this);
        a10.setData(d10);
        N0().a(this, a10);
        finish();
    }

    private final void T0() {
        ip.j.a(J0().F(), this, new b(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N U0(ConfirmationActivity confirmationActivity, MComConfig.f fVar) {
        C17542s.j(fVar, "config");
        Eg.c O02 = confirmationActivity.O0();
        String b10 = fVar.b();
        String d10 = fVar.d();
        String a10 = fVar.a();
        Iterable<MComConfig.f.a> c10 = fVar.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (MComConfig.f.a aVar : c10) {
            arrayList.add(new b.a(aVar.a(), aVar.d(), aVar.c(), aVar.b()));
        }
        O02.K(new Eg.b(b10, (String) null, d10, a10, arrayList, Interaction$Component.CHECKOUT_SURVEY, 0, 66, (DefaultConstructorMarker) null));
        return C16807N.f139792a;
    }

    public final Ae.e I0() {
        Ae.e eVar = this.f94399H;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final o K0() {
        o oVar = this.f94400I;
        if (oVar != null) {
            return oVar;
        }
        C17542s.z("deliveryDetailsAnalytics");
        return null;
    }

    public final Xn.a L0() {
        Xn.a aVar = this.f94405N;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("deliveryDetailsInteractor");
        return null;
    }

    public final C12127a M0() {
        C12127a aVar = this.f94403L;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("purchaseHistoryNavigation");
        return null;
    }

    public final Xn.i N0() {
        Xn.i iVar = this.f94404M;
        if (iVar != null) {
            return iVar;
        }
        C17542s.z("startActivityInteractor");
        return null;
    }

    public final pw.c P0() {
        pw.c cVar = this.f94402K;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("welcomeActivityApi");
        return null;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5282e.b(this, (r) null, c1.c.c(-253798088, true, new c(this)), 1, (Object) null);
        T0();
        Q0();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        I0().e(this, "order_confirmation");
    }
}
