package ro;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Nn.w;
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
import Ur.a;
import XH.C16807N;
import XH.x;
import XH.y;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.oppwa.mobile.connect.provider.AsyncPaymentActivity;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
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
import rv.C11849b;
import tf.C10253a;
import to.C0;
import to.C11938f;
import to.C11970v0;
import tv.C11996a;
import tv.C11997b;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 >2\u00020\u0001:\u0003?@AB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001d\u0010&\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u00192\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u001c¢\u0006\u0004\b(\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u001c\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120/8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00101R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0/8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00101R\u001c\u00107\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001050/8\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00101R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140/8\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00101R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\u0016098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b*\u0010<¨\u0006B"}, d2 = {"Lro/a;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LUr/a;", "googlePayUseCase", "Ltf/a;", "killSwitch", "Lqo/c;", "initiateExpressPaymentUseCase", "<init>", "(Landroidx/lifecycle/U;LUr/a;Ltf/a;Lqo/c;)V", "LUr/a$b;", "googlePay", "Lro/a$b;", "termsInput", "", "taxIdSelectionValid", "LIC/e;", "errorMessage", "Lro/a$c$c;", "navigationEvent", "Lro/a$c;", "F", "(LUr/a$b;Lro/a$b;ZLIC/e;Lro/a$c$c;)Lro/a$c;", "", "id", "checked", "LXH/N;", "I", "(Ljava/lang/String;Z)V", "Lto/F0;", "selection", "J", "(Lto/F0;)V", "shopperResultUrlString", "Lto/v0$a;", "data", "G", "(Ljava/lang/String;Lto/v0$a;)V", "H", "()V", "m", "Lqo/c;", "n", "Ljava/lang/String;", "checkoutId", "LTJ/B;", "o", "LTJ/B;", "isLoading", "p", "q", "Luo/e;", "r", "taxIdSelectionInput", "s", "LTJ/P;", "t", "LTJ/P;", "()LTJ/P;", "uiState", "u", "b", "c", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ro.a  reason: case insensitive filesystem */
public final class C11835a extends f0 {

    /* renamed from: u  reason: collision with root package name */
    public static final C2425a f102065u = new C2425a((DefaultConstructorMarker) null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f102066v = 8;

    /* renamed from: w  reason: collision with root package name */
    private static final String f102067w = "PRIVACY_POLICY_ID";

    /* renamed from: x  reason: collision with root package name */
    private static final String f102068x = "TERMS_AND_CONDITIONS_ID";
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final qo.c f102069m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final String f102070n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<Boolean> f102071o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<C13023e> f102072p;

    /* renamed from: q  reason: collision with root package name */
    private final C16505B<b> f102073q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<uo.e> f102074r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<c.C2427c> f102075s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<c> f102076t;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lro/a$a;", "", "<init>", "()V", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ro.a$a  reason: collision with other inner class name */
    public static final class C2425a {
        public /* synthetic */ C2425a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2425a() {
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lro/a$b;", "", "", "isPrivacyPolicyChecked", "isTermsAndConditionsChecked", "<init>", "(ZZ)V", "a", "(ZZ)Lro/a$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "()Z", "c", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ro.a$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f102077a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f102078b;

        public b(boolean z10, boolean z11) {
            this.f102077a = z10;
            this.f102078b = z11;
        }

        public final b a(boolean z10, boolean z11) {
            return new b(z10, z11);
        }

        public final boolean b() {
            return this.f102077a;
        }

        public final boolean c() {
            return this.f102078b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f102077a == bVar.f102077a && this.f102078b == bVar.f102078b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f102077a) * 31) + Boolean.hashCode(this.f102078b);
        }

        public String toString() {
            boolean z10 = this.f102077a;
            boolean z11 = this.f102078b;
            return "TermsState(isPrivacyPolicyChecked=" + z10 + ", isTermsAndConditionsChecked=" + z11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lro/a$c;", "", "<init>", "()V", "Lro/a$c$c;", "a", "()Lro/a$c$c;", "navigationEvent", "b", "c", "Lro/a$c$a;", "Lro/a$c$b;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ro.a$c */
    public static abstract class c {

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001e\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b \u0010'R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010(\u001a\u0004\b\u001a\u0010)¨\u0006*"}, d2 = {"Lro/a$c$a;", "Lro/a$c;", "Lto/f;", "termsAndConditions", "privacyPolicy", "Lto/C0;", "taxIdOptions", "Lto/v0;", "checkoutButton", "LIC/e;", "errorMessage", "Lro/a$c$c;", "navigationEvent", "<init>", "(Lto/f;Lto/f;Lto/C0;Lto/v0;LIC/e;Lro/a$c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lto/f;", "f", "()Lto/f;", "b", "d", "c", "Lto/C0;", "e", "()Lto/C0;", "Lto/v0;", "()Lto/v0;", "LIC/e;", "()LIC/e;", "Lro/a$c$c;", "()Lro/a$c$c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ro.a$c$a  reason: collision with other inner class name */
        public static final class C2426a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final C11938f f102079a;

            /* renamed from: b  reason: collision with root package name */
            private final C11938f f102080b;

            /* renamed from: c  reason: collision with root package name */
            private final C0 f102081c;

            /* renamed from: d  reason: collision with root package name */
            private final C11970v0 f102082d;

            /* renamed from: e  reason: collision with root package name */
            private final C13023e f102083e;

            /* renamed from: f  reason: collision with root package name */
            private final C2427c f102084f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2426a(C11938f fVar, C11938f fVar2, C0 c02, C11970v0 v0Var, C13023e eVar, C2427c cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(fVar, "termsAndConditions");
                C17542s.j(v0Var, "checkoutButton");
                this.f102079a = fVar;
                this.f102080b = fVar2;
                this.f102081c = c02;
                this.f102082d = v0Var;
                this.f102083e = eVar;
                this.f102084f = cVar;
            }

            public C2427c a() {
                return this.f102084f;
            }

            public final C11970v0 b() {
                return this.f102082d;
            }

            public final C13023e c() {
                return this.f102083e;
            }

            public final C11938f d() {
                return this.f102080b;
            }

            public final C0 e() {
                return this.f102081c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C2426a)) {
                    return false;
                }
                C2426a aVar = (C2426a) obj;
                return C17542s.e(this.f102079a, aVar.f102079a) && C17542s.e(this.f102080b, aVar.f102080b) && C17542s.e(this.f102081c, aVar.f102081c) && C17542s.e(this.f102082d, aVar.f102082d) && C17542s.e(this.f102083e, aVar.f102083e) && C17542s.e(this.f102084f, aVar.f102084f);
            }

            public final C11938f f() {
                return this.f102079a;
            }

            public int hashCode() {
                int hashCode = this.f102079a.hashCode() * 31;
                C11938f fVar = this.f102080b;
                int i10 = 0;
                int hashCode2 = (hashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
                C0 c02 = this.f102081c;
                int hashCode3 = (((hashCode2 + (c02 == null ? 0 : c02.hashCode())) * 31) + this.f102082d.hashCode()) * 31;
                C13023e eVar = this.f102083e;
                int hashCode4 = (hashCode3 + (eVar == null ? 0 : eVar.hashCode())) * 31;
                C2427c cVar = this.f102084f;
                if (cVar != null) {
                    i10 = cVar.hashCode();
                }
                return hashCode4 + i10;
            }

            public String toString() {
                C11938f fVar = this.f102079a;
                C11938f fVar2 = this.f102080b;
                C0 c02 = this.f102081c;
                C11970v0 v0Var = this.f102082d;
                C13023e eVar = this.f102083e;
                C2427c cVar = this.f102084f;
                return "Content(termsAndConditions=" + fVar + ", privacyPolicy=" + fVar2 + ", taxIdOptions=" + c02 + ", checkoutButton=" + v0Var + ", errorMessage=" + eVar + ", navigationEvent=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lro/a$c$b;", "Lro/a$c;", "Lro/a$c$c;", "navigationEvent", "<init>", "(Lro/a$c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lro/a$c$c;", "()Lro/a$c$c;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ro.a$c$b */
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            private final C2427c f102085a;

            public b() {
                this((C2427c) null, 1, (DefaultConstructorMarker) null);
            }

            public C2427c a() {
                return this.f102085a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && C17542s.e(this.f102085a, ((b) obj).f102085a);
            }

            public int hashCode() {
                C2427c cVar = this.f102085a;
                if (cVar == null) {
                    return 0;
                }
                return cVar.hashCode();
            }

            public String toString() {
                C2427c cVar = this.f102085a;
                return "Loading(navigationEvent=" + cVar + ")";
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ b(C2427c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this((i10 & 1) != 0 ? null : cVar);
            }

            public b(C2427c cVar) {
                super((DefaultConstructorMarker) null);
                this.f102085a = cVar;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lro/a$c$c;", "", "<init>", "()V", "a", "Lro/a$c$c$a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ro.a$c$c  reason: collision with other inner class name */
        public static abstract class C2427c {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lro/a$c$c$a;", "Lro/a$c$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: ro.a$c$c$a  reason: collision with other inner class name */
            public static final class C2428a extends C2427c {

                /* renamed from: a  reason: collision with root package name */
                public static final C2428a f102086a = new C2428a();

                private C2428a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof C2428a);
                }

                public int hashCode() {
                    return 1634812087;
                }

                public String toString() {
                    return "Completed";
                }
            }

            public /* synthetic */ C2427c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C2427c() {
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract C2427c a();

        private c() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ro.a$d */
    /* synthetic */ class d extends C17540p implements C17642l<String, Boolean> {
        d(Object obj) {
            super(1, obj, a.b.C1860a.C1862b.class, "validateInput", "validateInput(Ljava/lang/String;)Z", 0);
        }

        /* renamed from: t */
        public final Boolean invoke(String str) {
            C17542s.j(str, "p0");
            return Boolean.valueOf(((a.b.C1860a.C1862b) this.receiver).c(str));
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"ro/a$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ro.a$e */
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11835a f102087a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, C11835a aVar2) {
            super(aVar);
            this.f102087a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C11835a aVar = this.f102087a;
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
                    String a10 = C11818a.a("Unable to initiate express payment", th2);
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
            this.f102087a.f102072p.setValue(C13026h.a(C11849b.f102326n2));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.payment.viewmodel.ExpressCheckoutViewModel$initiateExpressCheckout$2", f = "ExpressCheckoutViewModel.kt", l = {220}, m = "invokeSuspend")
    /* renamed from: ro.a$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f102088c;

        /* renamed from: d  reason: collision with root package name */
        int f102089d;

        /* renamed from: e  reason: collision with root package name */
        private /* synthetic */ Object f102090e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11835a f102091f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f102092g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C11970v0.a f102093h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C11835a aVar, String str, C11970v0.a aVar2, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f102091f = aVar;
            this.f102092g = str;
            this.f102093h = aVar2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f102091f, this.f102092g, this.f102093h, eVar);
            fVar.f102090e = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f102089d;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f102090e;
                qo.c j10 = this.f102091f.f102069m;
                String h10 = this.f102091f.f102070n;
                String str = this.f102092g;
                List<C11996a> a10 = this.f102093h.a();
                List<C11997b> b10 = this.f102093h.b();
                uo.e eVar = (uo.e) this.f102091f.f102074r.getValue();
                w b11 = eVar != null ? eVar.b() : null;
                this.f102090e = q11;
                this.f102088c = eVar;
                this.f102089d = 1;
                obj2 = j10.a(h10, str, a10, b10, b11, this);
                if (obj2 == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                uo.e eVar2 = (uo.e) this.f102088c;
                q10 = (Q) this.f102090e;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11835a aVar = this.f102091f;
            Throwable e10 = x.e(obj2);
            if (e10 == null) {
                C16807N n10 = (C16807N) obj2;
                aVar.f102075s.setValue(c.C2427c.C2428a.f102086a);
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
                aVar.f102072p.setValue(C13026h.a(C11849b.f102326n2));
            }
            this.f102091f.f102071o.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ro.a$g */
    public static final class g implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g[] f102094a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11835a f102095b;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u0002\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "R", "", "b", "()[Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0})
        /* renamed from: ro.a$g$a  reason: collision with other inner class name */
        static final class C2429a extends C17544u implements C17631a<Object[]> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16532g[] f102096c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2429a(C16532g[] gVarArr) {
                super(0);
                this.f102096c = gVarArr;
            }

            /* renamed from: b */
            public final Object[] invoke() {
                return new Object[this.f102096c.length];
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "R", "LTJ/h;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Lkotlin/Array;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.payment.viewmodel.ExpressCheckoutViewModel$special$$inlined$combine$1$3", f = "ExpressCheckoutViewModel.kt", l = {238}, m = "invokeSuspend")
        /* renamed from: ro.a$g$b */
        public static final class b extends l implements q<C16533h<? super c>, Object[], C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f102097c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f102098d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f102099e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C11835a f102100f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(C17164e eVar, C11835a aVar) {
                super(3, eVar);
                this.f102100f = aVar;
            }

            /* renamed from: i */
            public final Object invoke(C16533h<? super c> hVar, Object[] objArr, C17164e<? super C16807N> eVar) {
                b bVar = new b(eVar, this.f102100f);
                bVar.f102098d = hVar;
                bVar.f102099e = objArr;
                return bVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f102097c;
                if (i10 == 0) {
                    y.b(obj);
                    C16533h hVar = (C16533h) this.f102098d;
                    Object[] objArr = (Object[]) this.f102099e;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    Object obj6 = objArr[4];
                    c.C2427c cVar = (c.C2427c) objArr[5];
                    Object bVar = ((Boolean) obj5).booleanValue() ? new c.b(cVar) : this.f102100f.F((a.b) obj2, (b) obj3, ((Boolean) obj4).booleanValue(), (C13023e) obj6, cVar);
                    this.f102097c = 1;
                    if (hVar.emit(bVar, this) == f10) {
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

        public g(C16532g[] gVarArr, C11835a aVar) {
            this.f102094a = gVarArr;
            this.f102095b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            C16532g[] gVarArr = this.f102094a;
            Object a10 = C16619l.a(hVar, gVarArr, new C2429a(gVarArr), new b((C17164e) null, this.f102095b), eVar);
            return a10 == C17187b.f() ? a10 : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ro.a$h */
    public static final class h implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f102101a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ro.a$h$a  reason: collision with other inner class name */
        public static final class C2430a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f102102a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.payment.viewmodel.ExpressCheckoutViewModel$special$$inlined$map$1$2", f = "ExpressCheckoutViewModel.kt", l = {50}, m = "emit")
            /* renamed from: ro.a$h$a$a  reason: collision with other inner class name */
            public static final class C2431a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f102103c;

                /* renamed from: d  reason: collision with root package name */
                int f102104d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2430a f102105e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2431a(C2430a aVar, C17164e eVar) {
                    super(eVar);
                    this.f102105e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f102103c = obj;
                    this.f102104d |= Integer.MIN_VALUE;
                    return this.f102105e.emit((Object) null, this);
                }
            }

            public C2430a(C16533h hVar) {
                this.f102102a = hVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
                r5 = r5.q();
             */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ro.C11835a.h.C2430a.C2431a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ro.a$h$a$a r0 = (ro.C11835a.h.C2430a.C2431a) r0
                    int r1 = r0.f102104d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f102104d = r1
                    goto L_0x0018
                L_0x0013:
                    ro.a$h$a$a r0 = new ro.a$h$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f102103c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f102104d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f102102a
                    com.ingka.ikea.killswitch.model.KillSwitchConfig r5 = (com.ingka.ikea.killswitch.model.KillSwitchConfig) r5
                    if (r5 == 0) goto L_0x0045
                    java.lang.Boolean r5 = r5.q()
                    if (r5 == 0) goto L_0x0045
                    boolean r5 = r5.booleanValue()
                    goto L_0x0046
                L_0x0045:
                    r5 = 0
                L_0x0046:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r5)
                    r0.f102104d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ro.C11835a.h.C2430a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar) {
            this.f102101a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f102101a.collect(new C2430a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ro.a$i */
    public static final class i implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f102106a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ro.a$i$a  reason: collision with other inner class name */
        public static final class C2432a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f102107a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.payment.viewmodel.ExpressCheckoutViewModel$special$$inlined$map$2$2", f = "ExpressCheckoutViewModel.kt", l = {50}, m = "emit")
            /* renamed from: ro.a$i$a$a  reason: collision with other inner class name */
            public static final class C2433a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f102108c;

                /* renamed from: d  reason: collision with root package name */
                int f102109d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C2432a f102110e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2433a(C2432a aVar, C17164e eVar) {
                    super(eVar);
                    this.f102110e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f102108c = obj;
                    this.f102109d |= Integer.MIN_VALUE;
                    return this.f102110e.emit((Object) null, this);
                }
            }

            public C2432a(C16533h hVar) {
                this.f102107a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof ro.C11835a.i.C2432a.C2433a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    ro.a$i$a$a r0 = (ro.C11835a.i.C2432a.C2433a) r0
                    int r1 = r0.f102109d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f102109d = r1
                    goto L_0x0018
                L_0x0013:
                    ro.a$i$a$a r0 = new ro.a$i$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f102108c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f102109d
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
                    TJ.h r6 = r4.f102107a
                    uo.e r5 = (uo.e) r5
                    r2 = 0
                    if (r5 == 0) goto L_0x0042
                    boolean r5 = r5.a()
                    if (r5 != r3) goto L_0x0042
                    r2 = r3
                L_0x0042:
                    java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.b.a(r2)
                    r0.f102109d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x004f
                    return r1
                L_0x004f:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: ro.C11835a.i.C2432a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public i(C16532g gVar) {
            this.f102106a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f102106a.collect(new C2432a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public C11835a(U u10, a aVar, C10253a aVar2, qo.c cVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "googlePayUseCase");
        C17542s.j(aVar2, "killSwitch");
        C17542s.j(cVar, "initiateExpressPaymentUseCase");
        this.f102069m = cVar;
        Object f10 = u10.f(AsyncPaymentActivity.EXTRA_CHECKOUT_ID);
        if (f10 != null) {
            this.f102070n = (String) f10;
            C16505B<Boolean> a10 = C16521S.a(Boolean.FALSE);
            this.f102071o = a10;
            C16505B<C13023e> a11 = C16521S.a(null);
            this.f102072p = a11;
            C16505B<b> a12 = C16521S.a(new b(false, false));
            this.f102073q = a12;
            C16505B<uo.e> a13 = C16521S.a(null);
            this.f102074r = a13;
            C16505B<c.C2427c> a14 = C16521S.a(null);
            this.f102075s = a14;
            this.f102076t = C16534i.c0(new g(new C16532g[]{aVar.a(new h(aVar2.I()), C16521S.a(null)), a12, C16534i.s(new i(a13)), a10, a11, a14}, this), g0.a(this), ip.f.a(), new c.b((c.C2427c) null, 1, (DefaultConstructorMarker) null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: to.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: to.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: to.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: to.C0$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: to.C0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: to.C0} */
    /* JADX WARNING: type inference failed for: r3v5, types: [to.C0$b] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final ro.C11835a.c F(Ur.a.b r17, ro.C11835a.b r18, boolean r19, IC.C13023e r20, ro.C11835a.c.C2427c r21) {
        /*
            r16 = this;
            r0 = r17
            r6 = r21
            Ur.a$b$c r1 = Ur.a.b.c.f88441a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            if (r1 == 0) goto L_0x0013
            ro.a$c$b r0 = new ro.a$c$b
            r0.<init>(r6)
            goto L_0x01c5
        L_0x0013:
            Ur.a$b$b r1 = Ur.a.b.C1863b.f88440a
            boolean r1 = kotlin.jvm.internal.C17542s.e(r0, r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x00c7
            qv.e r0 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0030:
            boolean r5 = r1.hasNext()
            r13 = 0
            if (r5 == 0) goto L_0x0048
            java.lang.Object r5 = r1.next()
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            boolean r7 = r7.b(r0, r13)
            if (r7 == 0) goto L_0x0030
            r4.add(r5)
            goto L_0x0030
        L_0x0048:
            java.util.Iterator r1 = r4.iterator()
            r4 = r3
            r5 = r4
        L_0x004e:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00c0
            java.lang.Object r7 = r1.next()
            qv.b r7 = (qv.C11819b) r7
            r11 = 0
            if (r4 != 0) goto L_0x006a
            java.lang.String r4 = "Google Pay is disabled"
            java.lang.String r4 = qv.C11818a.a(r4, r11)
            if (r4 != 0) goto L_0x0066
            goto L_0x00c0
        L_0x0066:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x006a:
            if (r5 != 0) goto L_0x00b8
            java.lang.Class<ro.a> r5 = ro.C11835a.class
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r8 = 36
            r9 = 2
            java.lang.String r8 = HJ.C15854t.s1(r5, r8, r3, r9, r3)
            r10 = 46
            java.lang.String r8 = HJ.C15854t.o1(r8, r10, r3, r9, r3)
            int r9 = r8.length()
            if (r9 != 0) goto L_0x0089
            goto L_0x008f
        L_0x0089:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r8, r5)
        L_0x008f:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.String r9 = "main"
            boolean r8 = HJ.C15854t.b0(r8, r9, r2)
            if (r8 == 0) goto L_0x00a2
            java.lang.String r8 = "m"
            goto L_0x00a4
        L_0x00a2:
            java.lang.String r8 = "b"
        L_0x00a4:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)
            java.lang.String r8 = "|"
            r9.append(r8)
            r9.append(r5)
            java.lang.String r5 = r9.toString()
        L_0x00b8:
            r8 = r0
            r9 = r5
            r10 = r13
            r12 = r4
            r7.a(r8, r9, r10, r11, r12)
            goto L_0x004e
        L_0x00c0:
            ro.a$c$b r0 = new ro.a$c$b
            r0.<init>(r6)
            goto L_0x01c5
        L_0x00c7:
            boolean r1 = r0 instanceof Ur.a.b.C1860a
            if (r1 == 0) goto L_0x01c6
            Co.e r1 = Co.e.f79654a
            boolean r4 = r18.c()
            boolean r5 = r18.b()
            Ur.a$b$a r0 = (Ur.a.b.C1860a) r0
            r7 = r19
            to.v0 r4 = r1.b(r4, r5, r7, r0)
            to.f r1 = new to.f
            java.lang.String r5 = f102068x
            boolean r7 = r18.c()
            int r8 = rv.C11849b.f102219O0
            IC.e r8 = IC.C13026h.a(r8)
            Ur.a$b$a$d r9 = r0.h()
            java.lang.String r9 = r9.b()
            r1.<init>(r5, r7, r8, r9)
            Ur.a$b$a$d r5 = r0.h()
            java.lang.String r5 = r5.a()
            if (r5 == 0) goto L_0x0112
            to.f r7 = new to.f
            java.lang.String r8 = f102067w
            boolean r9 = r18.b()
            int r10 = rv.C11849b.f102215N0
            IC.e r10 = IC.C13026h.a(r10)
            r7.<init>(r8, r9, r10, r5)
            goto L_0x0113
        L_0x0112:
            r7 = r3
        L_0x0113:
            java.util.List r5 = r0.g()
            if (r5 == 0) goto L_0x01ba
            to.z0 r12 = to.j1.a(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r10 = new java.util.ArrayList
            r8 = 10
            int r9 = YH.C16877v.y(r5, r8)
            r10.<init>(r9)
            java.util.Iterator r5 = r5.iterator()
        L_0x012e:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L_0x0153
            java.lang.Object r9 = r5.next()
            Ur.a$b$a$c r9 = (Ur.a.b.C1860a.c) r9
            to.C0$c r11 = new to.C0$c
            java.lang.String r13 = r9.a()
            java.lang.String r14 = r9.d()
            boolean r15 = r9.b()
            boolean r9 = r9.c()
            r11.<init>(r13, r14, r15, r9)
            r10.add(r11)
            goto L_0x012e
        L_0x0153:
            java.util.List r5 = r0.d()
            if (r5 == 0) goto L_0x0187
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r9 = new java.util.ArrayList
            int r8 = YH.C16877v.y(r5, r8)
            r9.<init>(r8)
            java.util.Iterator r5 = r5.iterator()
        L_0x0168:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0185
            java.lang.Object r8 = r5.next()
            Ur.a$b$a$a r8 = (Ur.a.b.C1860a.C1861a) r8
            to.C0$a r11 = new to.C0$a
            java.lang.String r13 = r8.b()
            java.lang.String r8 = r8.a()
            r11.<init>(r13, r8)
            r9.add(r11)
            goto L_0x0168
        L_0x0185:
            r11 = r9
            goto L_0x018c
        L_0x0187:
            java.util.List r5 = YH.C16877v.n()
            r11 = r5
        L_0x018c:
            Ur.a$b$a$b r5 = r0.e()
            if (r5 == 0) goto L_0x01a4
            to.C0$b r3 = new to.C0$b
            java.lang.String r8 = r5.b()
            java.lang.String r9 = r5.a()
            ro.a$d r13 = new ro.a$d
            r13.<init>(r5)
            r3.<init>(r8, r9, r13)
        L_0x01a4:
            r9 = r3
            Co.e r3 = Co.e.f79654a
            Ur.a$b$a$b r0 = r0.e()
            if (r0 == 0) goto L_0x01ae
            goto L_0x01af
        L_0x01ae:
            r2 = 0
        L_0x01af:
            IC.e r13 = r3.a(r2)
            to.C0 r0 = new to.C0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13)
            r3 = r0
        L_0x01ba:
            ro.a$c$a r8 = new ro.a$c$a
            r0 = r8
            r2 = r7
            r5 = r20
            r6 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x01c5:
            return r0
        L_0x01c6:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ro.C11835a.F(Ur.a$b, ro.a$b, boolean, IC.e, ro.a$c$c):ro.a$c");
    }

    public final void G(String str, C11970v0.a aVar) {
        C17542s.j(str, "shopperResultUrlString");
        C17542s.j(aVar, "data");
        this.f102071o.setValue(Boolean.TRUE);
        this.f102072p.setValue(null);
        F0 unused = C16314k.d(g0.a(this), new e(N.f137593c0, this), (T) null, new f(this, str, aVar, (C17164e<? super f>) null), 2, (Object) null);
    }

    public final void H() {
        this.f102075s.setValue(null);
    }

    public final void I(String str, boolean z10) {
        b value;
        b bVar;
        C17542s.j(str, "id");
        this.f102072p.setValue(null);
        C16505B<b> b10 = this.f102073q;
        do {
            value = b10.getValue();
            bVar = value;
        } while (!b10.e(value, bVar.a(C17542s.e(str, f102067w) ? z10 : bVar.b(), C17542s.e(str, f102068x) ? z10 : bVar.c())));
    }

    public final void J(to.F0 f02) {
        uo.e value;
        String b10;
        String i10;
        String d10;
        C0.a a10;
        C17542s.j(f02, "selection");
        C16505B<uo.e> b11 = this.f102074r;
        do {
            value = b11.getValue();
            uo.e eVar = value;
            b10 = f02.b();
            C0.c c10 = f02.c();
            i10 = c10 != null ? c10.i() : null;
            d10 = f02.d();
            a10 = f02.a();
        } while (!b11.e(value, new uo.e(b10, i10, d10, a10 != null ? a10.f() : null, f02.e())));
    }

    public final C16519P<c> m() {
        return this.f102076t;
    }
}
