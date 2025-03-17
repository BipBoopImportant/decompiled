package Ei;

import Ae.e;
import Ae.j;
import Fi.i;
import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import aA.C13909a;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tf.C10253a;
import wi.C12272a;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0002FGB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u001d\u0010'\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0010¢\u0006\u0004\b'\u0010(J\r\u0010)\u001a\u00020\u0015¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00108\u001a\u0004\u0018\u00010\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u0015098\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018098\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010;R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a098\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010;R\u001c\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c098\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010;R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00020A0@8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b+\u0010D¨\u0006H"}, d2 = {"LEi/h;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LGx/a;", "purchaseHistoryRepository", "Ltf/a;", "killSwitchRepository", "LaA/a;", "sessionManager", "LFi/i;", "getUserIdUseCase", "LAe/e;", "analytics", "<init>", "(Landroidx/lifecycle/U;LGx/a;Ltf/a;LaA/a;LFi/i;LAe/e;)V", "", "orderId", "LXH/N;", "I", "(Ljava/lang/String;)V", "", "isLoggedIn", "loading", "LEi/h$b$c;", "navigationAction", "LIC/e;", "message", "LEi/h$b$a$a;", "prefillDetails", "LEi/h$b$a;", "K", "(ZZLEi/h$b$c;LIC/e;LEi/h$b$a$a;)LEi/h$b$a;", "LEi/h$a;", "action", "L", "(LEi/h$a;)V", "orderNumber", "emailOrPhoneNumber", "J", "(Ljava/lang/String;Ljava/lang/String;)V", "M", "()Z", "m", "LGx/a;", "n", "Ltf/a;", "o", "LaA/a;", "p", "LFi/i;", "q", "LAe/e;", "r", "Ljava/lang/String;", "s", "liteId", "LTJ/B;", "t", "LTJ/B;", "u", "v", "w", "prefill", "LTJ/P;", "LEi/h$b;", "x", "LTJ/P;", "()LTJ/P;", "uiState", "a", "b", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.h  reason: case insensitive filesystem */
public final class C10687h extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Gx.a f80457m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final C10253a f80458n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C13909a f80459o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final i f80460p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Ae.e f80461q;

    /* renamed from: r  reason: collision with root package name */
    private final String f80462r;

    /* renamed from: s  reason: collision with root package name */
    private final String f80463s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<Boolean> f80464t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<b.c> f80465u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<C13023e> f80466v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C16505B<b.a.C1525a> f80467w;

    /* renamed from: x  reason: collision with root package name */
    private final C16519P<b> f80468x;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEi/h$a;", "", "<init>", "()V", "a", "b", "LEi/h$a$a;", "LEi/h$a$b;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.h$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/h$a$a;", "LEi/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.h$a$a  reason: collision with other inner class name */
        public static final class C1524a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1524a f80469a = new C1524a();

            private C1524a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1524a);
            }

            public int hashCode() {
                return 1443635908;
            }

            public String toString() {
                return "MessageDisplayed";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/h$a$b;", "LEi/h$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.h$a$b */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f80470a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -36504162;
            }

            public String toString() {
                return "NavigationHandled";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"LEi/h$b;", "", "<init>", "()V", "b", "a", "c", "LEi/h$b$a;", "LEi/h$b$b;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.h$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001:\u0001\u0019BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u001d\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010#\u001a\u0004\b%\u0010$R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b\"\u0010'¨\u0006("}, d2 = {"LEi/h$b$a;", "LEi/h$b;", "LIC/e;", "title", "description", "LEi/h$b$a$a;", "prefillDetails", "", "loading", "message", "showPurchaseHistoryDisabledWarning", "LEi/h$b$c;", "navigationAction", "<init>", "(LIC/e;LIC/e;LEi/h$b$a$a;ZLIC/e;ZLEi/h$b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "g", "()LIC/e;", "b", "c", "LEi/h$b$a$a;", "e", "()LEi/h$b$a$a;", "d", "Z", "()Z", "f", "LEi/h$b$c;", "()LEi/h$b$c;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.h$b$a */
        public static final class a extends b {

            /* renamed from: h  reason: collision with root package name */
            public static final int f80471h = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f80472a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f80473b;

            /* renamed from: c  reason: collision with root package name */
            private final C1525a f80474c;

            /* renamed from: d  reason: collision with root package name */
            private final boolean f80475d;

            /* renamed from: e  reason: collision with root package name */
            private final C13023e f80476e;

            /* renamed from: f  reason: collision with root package name */
            private final boolean f80477f;

            /* renamed from: g  reason: collision with root package name */
            private final c f80478g;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ a(C13023e eVar, C13023e eVar2, C1525a aVar, boolean z10, C13023e eVar3, boolean z11, c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(eVar, eVar2, (i10 & 4) != 0 ? null : aVar, (i10 & 8) != 0 ? false : z10, (i10 & 16) != 0 ? null : eVar3, (i10 & 32) != 0 ? false : z11, (i10 & 64) != 0 ? null : cVar);
            }

            public final C13023e a() {
                return this.f80473b;
            }

            public final boolean b() {
                return this.f80475d;
            }

            public final C13023e c() {
                return this.f80476e;
            }

            public final c d() {
                return this.f80478g;
            }

            public final C1525a e() {
                return this.f80474c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f80472a, aVar.f80472a) && C17542s.e(this.f80473b, aVar.f80473b) && C17542s.e(this.f80474c, aVar.f80474c) && this.f80475d == aVar.f80475d && C17542s.e(this.f80476e, aVar.f80476e) && this.f80477f == aVar.f80477f && C17542s.e(this.f80478g, aVar.f80478g);
            }

            public final boolean f() {
                return this.f80477f;
            }

            public final C13023e g() {
                return this.f80472a;
            }

            public int hashCode() {
                int hashCode = ((this.f80472a.hashCode() * 31) + this.f80473b.hashCode()) * 31;
                C1525a aVar = this.f80474c;
                int i10 = 0;
                int hashCode2 = (((hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.f80475d)) * 31;
                C13023e eVar = this.f80476e;
                int hashCode3 = (((hashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31) + Boolean.hashCode(this.f80477f)) * 31;
                c cVar = this.f80478g;
                if (cVar != null) {
                    i10 = cVar.hashCode();
                }
                return hashCode3 + i10;
            }

            public String toString() {
                C13023e eVar = this.f80472a;
                C13023e eVar2 = this.f80473b;
                C1525a aVar = this.f80474c;
                boolean z10 = this.f80475d;
                C13023e eVar3 = this.f80476e;
                boolean z11 = this.f80477f;
                c cVar = this.f80478g;
                return "Content(title=" + eVar + ", description=" + eVar2 + ", prefillDetails=" + aVar + ", loading=" + z10 + ", message=" + eVar3 + ", showPurchaseHistoryDisabledWarning=" + z11 + ", navigationAction=" + cVar + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C13023e eVar, C13023e eVar2, C1525a aVar, boolean z10, C13023e eVar3, boolean z11, c cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(eVar, "title");
                C17542s.j(eVar2, "description");
                this.f80472a = eVar;
                this.f80473b = eVar2;
                this.f80474c = aVar;
                this.f80475d = z10;
                this.f80476e = eVar3;
                this.f80477f = z11;
                this.f80478g = cVar;
            }

            @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"LEi/h$b$a$a;", "", "", "orderId", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ei.h$b$a$a  reason: collision with other inner class name */
            public static final class C1525a {

                /* renamed from: a  reason: collision with root package name */
                private final String f80479a;

                /* renamed from: b  reason: collision with root package name */
                private final String f80480b;

                public C1525a(String str, String str2) {
                    C17542s.j(str, "orderId");
                    this.f80479a = str;
                    this.f80480b = str2;
                }

                public final String a() {
                    return this.f80479a;
                }

                public final String b() {
                    return this.f80480b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1525a)) {
                        return false;
                    }
                    C1525a aVar = (C1525a) obj;
                    return C17542s.e(this.f80479a, aVar.f80479a) && C17542s.e(this.f80480b, aVar.f80480b);
                }

                public int hashCode() {
                    int hashCode = this.f80479a.hashCode() * 31;
                    String str = this.f80480b;
                    return hashCode + (str == null ? 0 : str.hashCode());
                }

                public String toString() {
                    String str = this.f80479a;
                    String str2 = this.f80480b;
                    return "PrefillDetails(orderId=" + str + ", userId=" + str2 + ")";
                }

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C1525a(String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                    this(str, (i10 & 2) != 0 ? null : str2);
                }
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/h$b$b;", "LEi/h$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.h$b$b  reason: collision with other inner class name */
        public static final class C1526b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1526b f80481a = new C1526b();

            private C1526b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1526b);
            }

            public int hashCode() {
                return -1311220249;
            }

            public String toString() {
                return "Disabled";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEi/h$b$c;", "", "<init>", "()V", "a", "b", "LEi/h$b$c$a;", "LEi/h$b$c$b;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.h$b$c */
        public static abstract class c {

            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/h$b$c$a;", "LEi/h$b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ei.h$b$c$a */
            public static final class a extends c {

                /* renamed from: a  reason: collision with root package name */
                public static final a f80482a = new a();

                private a() {
                    super((DefaultConstructorMarker) null);
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof a);
                }

                public int hashCode() {
                    return 1221100671;
                }

                public String toString() {
                    return "Close";
                }
            }

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\n¨\u0006\u0019"}, d2 = {"LEi/h$b$c$b;", "LEi/h$b$c;", "", "orderId", "LHx/f;", "type", "liteId", "<init>", "(Ljava/lang/String;LHx/f;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LHx/f;", "c", "()LHx/f;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ei.h$b$c$b  reason: collision with other inner class name */
            public static final class C1527b extends c {

                /* renamed from: a  reason: collision with root package name */
                private final String f80483a;

                /* renamed from: b  reason: collision with root package name */
                private final Hx.f f80484b;

                /* renamed from: c  reason: collision with root package name */
                private final String f80485c;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1527b(String str, Hx.f fVar, String str2) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(str, "orderId");
                    C17542s.j(fVar, "type");
                    C17542s.j(str2, "liteId");
                    this.f80483a = str;
                    this.f80484b = fVar;
                    this.f80485c = str2;
                }

                public final String a() {
                    return this.f80485c;
                }

                public final String b() {
                    return this.f80483a;
                }

                public final Hx.f c() {
                    return this.f80484b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1527b)) {
                        return false;
                    }
                    C1527b bVar = (C1527b) obj;
                    return C17542s.e(this.f80483a, bVar.f80483a) && this.f80484b == bVar.f80484b && C17542s.e(this.f80485c, bVar.f80485c);
                }

                public int hashCode() {
                    return (((this.f80483a.hashCode() * 31) + this.f80484b.hashCode()) * 31) + this.f80485c.hashCode();
                }

                public String toString() {
                    String str = this.f80483a;
                    Hx.f fVar = this.f80484b;
                    String str2 = this.f80485c;
                    return "ShowOrderDetails(orderId=" + str + ", type=" + fVar + ", liteId=" + str2 + ")";
                }
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private c() {
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.OrderLookupViewModel$autofillUserIdAndLookup$1", f = "OrderLookupViewModel.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: Ei.h$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80486c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10687h f80487d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f80488e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C10687h hVar, String str, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f80487d = hVar;
            this.f80488e = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f80487d, this.f80488e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80486c;
            if (i10 == 0) {
                y.b(obj);
                i i11 = this.f80487d.f80460p;
                this.f80486c = 1;
                obj = i11.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str = (String) obj;
            if (!(str == null || str.length() == 0)) {
                this.f80487d.f80467w.setValue(new b.a.C1525a(this.f80488e, str));
                this.f80487d.J(this.f80488e, str);
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/h$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.h$d */
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10687h f80489a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, C10687h hVar) {
            super(aVar);
            this.f80489a = hVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10687h hVar = this.f80489a;
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
                    String a10 = C11818a.a("Error finding order", th2);
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
            this.f80489a.f80466v.setValue(C13026h.a(C12272a.f105810e));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.OrderLookupViewModel$findOrder$2", f = "OrderLookupViewModel.kt", l = {138}, m = "invokeSuspend")
    /* renamed from: Ei.h$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80490c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f80491d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C10687h f80492e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f80493f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f80494g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C10687h hVar, String str, String str2, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f80492e = hVar;
            this.f80493f = str;
            this.f80494g = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(this.f80492e, this.f80493f, this.f80494g, eVar);
            eVar2.f80491d = obj;
            return eVar2;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f80490c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f80491d;
                e.c.c(this.f80492e.f80461q, j.ACTION_TAP.b(), (Map) null, Interaction$Component.PURCHASE_HISTORY_FIND_ORDER, (e.b) null, 10, (Object) null);
                Gx.a F10 = this.f80492e.f80457m;
                String str = this.f80493f;
                String str2 = this.f80494g;
                this.f80491d = q11;
                this.f80490c = 1;
                Object e10 = F10.e(str, str2, this);
                if (e10 == f10) {
                    return f10;
                }
                q10 = q11;
                obj = e10;
            } else if (i10 == 1) {
                q10 = (Q) this.f80491d;
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f80492e.f80464t.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Hx.c cVar = (Hx.c) obj;
            qv.e eVar = qv.e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            Iterator it = arrayList.iterator();
            String str3 = null;
            String str4 = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C11819b bVar = (C11819b) it.next();
                if (str3 == null) {
                    String a10 = C11818a.a("Found purchase, with status: " + cVar.k(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = q10.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str3 = str5;
                str4 = str6;
            }
            this.f80492e.f80465u.setValue(new b.c.C1527b(cVar.h(), cVar.l(), this.f80494g));
            this.f80492e.f80464t.setValue(kotlin.coroutines.jvm.internal.b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "loading", "LEi/h$b$c;", "navigation", "LIC/e;", "message", "LEi/h$b$a$a;", "prefill", "LEi/h$b;", "<anonymous>", "(ZLEi/h$b$c;LIC/e;LEi/h$b$a$a;)LEi/h$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.OrderLookupViewModel$uiState$1", f = "OrderLookupViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ei.h$f */
    static final class f extends l implements s<Boolean, b.c, C13023e, b.a.C1525a, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80495c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f80496d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80497e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f80498f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f80499g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C10687h f80500h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C10687h hVar, C17164e<? super f> eVar) {
            super(5, eVar);
            this.f80500h = hVar;
        }

        public final Object i(boolean z10, b.c cVar, C13023e eVar, b.a.C1525a aVar, C17164e<? super b> eVar2) {
            f fVar = new f(this.f80500h, eVar2);
            fVar.f80496d = z10;
            fVar.f80497e = cVar;
            fVar.f80498f = eVar;
            fVar.f80499g = aVar;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f80495c == 0) {
                y.b(obj);
                boolean z10 = this.f80496d;
                b.c cVar = (b.c) this.f80497e;
                C13023e eVar = (C13023e) this.f80498f;
                b.a.C1525a aVar = (b.a.C1525a) this.f80499g;
                if (!this.f80500h.f80458n.u()) {
                    return b.C1526b.f80481a;
                }
                C10687h hVar = this.f80500h;
                return hVar.K(hVar.f80459o.isLoggedIn(), z10, cVar, eVar, aVar);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object z(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return i(((Boolean) obj).booleanValue(), (b.c) obj2, (C13023e) obj3, (b.a.C1525a) obj4, (C17164e) obj5);
        }
    }

    public C10687h(U u10, Gx.a aVar, C10253a aVar2, C13909a aVar3, i iVar, Ae.e eVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "purchaseHistoryRepository");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(aVar3, "sessionManager");
        C17542s.j(iVar, "getUserIdUseCase");
        C17542s.j(eVar, "analytics");
        this.f80457m = aVar;
        this.f80458n = aVar2;
        this.f80459o = aVar3;
        this.f80460p = iVar;
        this.f80461q = eVar;
        String str = (String) u10.f("orderId");
        this.f80462r = str;
        String str2 = (String) u10.f("liteId");
        this.f80463s = str2;
        C16505B<Boolean> a10 = C16521S.a(Boolean.FALSE);
        this.f80464t = a10;
        C16505B<b.c> a11 = C16521S.a(null);
        this.f80465u = a11;
        C16505B<C13023e> a12 = C16521S.a(null);
        this.f80466v = a12;
        C16505B<b.a.C1525a> a13 = C16521S.a(null);
        this.f80467w = a13;
        this.f80468x = C16534i.c0(C16534i.l(a10, a11, a12, a13, new f(this, (C17164e<? super f>) null)), g0.a(this), ip.f.a(), K(aVar3.isLoggedIn(), false, (b.c) null, (C13023e) null, (b.a.C1525a) null));
        if (str != null && str.length() != 0) {
            a13.setValue(new b.a.C1525a(str, (String) null, 2, (DefaultConstructorMarker) null));
            if (!(str2 == null || str2.length() == 0)) {
                I(str);
            }
        }
    }

    private final void I(String str) {
        F0 unused = C16314k.d(g0.a(this), (C17168i) null, (T) null, new c(this, str, (C17164e<? super c>) null), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public final b.a K(boolean z10, boolean z11, b.c cVar, C13023e eVar, b.a.C1525a aVar) {
        return new b.a(C13026h.a(z10 ? C12272a.f105825j : C12272a.f105819h), C13026h.a(z10 ? C12272a.f105822i : C12272a.f105816g), aVar, z11, eVar, this.f80459o.isLoggedIn() && !this.f80458n.l(), cVar);
    }

    public final void J(String str, String str2) {
        C17542s.j(str, "orderNumber");
        C17542s.j(str2, "emailOrPhoneNumber");
        this.f80464t.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, str, str2, (C17164e<? super e>) null), 2, (Object) null);
    }

    public final void L(a aVar) {
        C17542s.j(aVar, "action");
        if (C17542s.e(aVar, a.C1524a.f80469a)) {
            this.f80466v.setValue(null);
        } else if (C17542s.e(aVar, a.b.f80470a)) {
            this.f80465u.setValue(null);
        } else {
            throw new t();
        }
    }

    public final boolean M() {
        b.a.C1525a e10;
        b value = this.f80468x.getValue();
        String str = null;
        b.a aVar = value instanceof b.a ? (b.a) value : null;
        if (!(aVar == null || (e10 = aVar.e()) == null)) {
            str = e10.b();
        }
        return str != null;
    }

    public final C16519P<b> m() {
        return this.f80468x;
    }
}
