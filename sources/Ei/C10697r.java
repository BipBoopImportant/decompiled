package Ei;

import Ae.e;
import Ei.C10696q;
import HJ.C15854t;
import Hx.c;
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
import YH.C16877v;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import bI.C17035a;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001:\u0002GHB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\b\b\u0002\u0010#\u001a\u00020\"¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00130/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0019\u00107\u001a\u0004\u0018\u0001028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0019\u0010:\u001a\u0004\u0018\u0001028\u0006¢\u0006\f\n\u0004\b8\u00104\u001a\u0004\b9\u00106R\u0014\u0010<\u001a\u0002028\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u00104R(\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00170=8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b'\u0010@\"\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020\"8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006I"}, d2 = {"LEi/r;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LFi/e;", "getExpressReturnActionUseCase", "LAe/e;", "analytics", "LGx/a;", "purchaseHistoryRepository", "Ltf/a;", "killSwitchRepository", "LFi/g;", "getPurchaseOrderSummaryUseCase", "<init>", "(Landroidx/lifecycle/U;LFi/e;LAe/e;LGx/a;Ltf/a;LFi/g;)V", "LHx/c;", "J", "(LHx/c;)LHx/c;", "LEi/r$a;", "detailsState", "LHx/c$d$c;", "expressReturnAction", "LEi/r$b;", "E", "(LEi/r$a;LHx/c$d$c;)LEi/r$b;", "details", "LEi/q;", "D", "(LHx/c;)LEi/q;", "LHx/c$c;", "LEi/q$a$b;", "H", "(LHx/c$c;)LEi/q$a$b;", "", "isFromOrderConfirmation", "LXH/N;", "F", "(Z)V", "m", "LAe/e;", "n", "LGx/a;", "o", "Ltf/a;", "p", "LFi/g;", "LTJ/B;", "q", "LTJ/B;", "", "r", "Ljava/lang/String;", "G", "()Ljava/lang/String;", "liteId", "s", "I", "type", "t", "id", "LTJ/P;", "u", "LTJ/P;", "()LTJ/P;", "setUiState", "(LTJ/P;)V", "uiState", "v", "Z", "fromConfirmation", "a", "b", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.r  reason: case insensitive filesystem */
public final class C10697r extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ae.e f80598m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Gx.a f80599n;

    /* renamed from: o  reason: collision with root package name */
    private final C10253a f80600o;

    /* renamed from: p  reason: collision with root package name */
    private final Fi.g f80601p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C16505B<a> f80602q;

    /* renamed from: r  reason: collision with root package name */
    private final String f80603r;

    /* renamed from: s  reason: collision with root package name */
    private final String f80604s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final String f80605t;

    /* renamed from: u  reason: collision with root package name */
    private C16519P<? extends b> f80606u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f80607v;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LEi/r$a;", "", "<init>", "()V", "c", "a", "b", "LEi/r$a$a;", "LEi/r$a$b;", "LEi/r$a$c;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.r$a */
    private static abstract class a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LEi/r$a$a;", "LEi/r$a;", "LHx/c;", "details", "<init>", "(LHx/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LHx/c;", "()LHx/c;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.r$a$a  reason: collision with other inner class name */
        public static final class C1534a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final Hx.c f80608a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1534a(Hx.c cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, "details");
                this.f80608a = cVar;
            }

            public final Hx.c a() {
                return this.f80608a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1534a) && C17542s.e(this.f80608a, ((C1534a) obj).f80608a);
            }

            public int hashCode() {
                return this.f80608a.hashCode();
            }

            public String toString() {
                Hx.c cVar = this.f80608a;
                return "Content(details=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"LEi/r$a$b;", "LEi/r$a;", "", "isFromOrderConfirmation", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.r$a$b */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final boolean f80609a;

            public b(boolean z10) {
                super((DefaultConstructorMarker) null);
                this.f80609a = z10;
            }

            public final boolean a() {
                return this.f80609a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f80609a == ((b) obj).f80609a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f80609a);
            }

            public String toString() {
                boolean z10 = this.f80609a;
                return "Error(isFromOrderConfirmation=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/r$a$c;", "LEi/r$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.r$a$c */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f80610a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2086187676;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LEi/r$b;", "", "<init>", "()V", "c", "a", "b", "LEi/r$b$a;", "LEi/r$b$b;", "LEi/r$b$c;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.r$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LEi/r$b$a;", "LEi/r$b;", "LEi/q;", "detailsUiState", "<init>", "(LEi/q;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEi/q;", "()LEi/q;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.r$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C10696q f80611a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C10696q qVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(qVar, "detailsUiState");
                this.f80611a = qVar;
            }

            public final C10696q a() {
                return this.f80611a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f80611a, ((a) obj).f80611a);
            }

            public int hashCode() {
                return this.f80611a.hashCode();
            }

            public String toString() {
                C10696q qVar = this.f80611a;
                return "Content(detailsUiState=" + qVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LEi/r$b$b;", "LEi/r$b;", "", "orderId", "", "isFromOrderConfirmation", "<init>", "(Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.r$b$b  reason: collision with other inner class name */
        public static final class C1535b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f80612a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f80613b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1535b(String str, boolean z10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "orderId");
                this.f80612a = str;
                this.f80613b = z10;
            }

            public final String a() {
                return this.f80612a;
            }

            public final boolean b() {
                return this.f80613b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1535b)) {
                    return false;
                }
                C1535b bVar = (C1535b) obj;
                return C17542s.e(this.f80612a, bVar.f80612a) && this.f80613b == bVar.f80613b;
            }

            public int hashCode() {
                return (this.f80612a.hashCode() * 31) + Boolean.hashCode(this.f80613b);
            }

            public String toString() {
                String str = this.f80612a;
                boolean z10 = this.f80613b;
                return "Error(orderId=" + str + ", isFromOrderConfirmation=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/r$b$c;", "LEi/r$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.r$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f80614a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1637812636;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/r$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.r$c */
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10697r f80615a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f80616b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, C10697r rVar, boolean z10) {
            super(aVar);
            this.f80615a = rVar;
            this.f80616b = z10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10697r rVar = this.f80615a;
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
                    String a10 = C11818a.a("Unable to fetch purchase details", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = rVar.getClass().getName();
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
            this.f80615a.f80602q.setValue(new a.b(this.f80616b));
            if (this.f80616b) {
                e.c.a(this.f80615a.f80598m, Interaction$Component.VIEW_ORDER_STATUS.getValue(), Ae.d.SYS_ERROR, (String) null, (Map) null, 8, (Object) null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.PurchaseDetailsViewModel$fetchDetails$2", f = "PurchaseDetailsViewModel.kt", l = {193, 198}, m = "invokeSuspend")
    /* renamed from: Ei.r$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f80617c;

        /* renamed from: d  reason: collision with root package name */
        Object f80618d;

        /* renamed from: e  reason: collision with root package name */
        int f80619e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10697r f80620f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f80621g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C10697r rVar, boolean z10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f80620f = rVar;
            this.f80621g = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f80620f, this.f80621g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x00a6  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f80619e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002f
                if (r1 == r3) goto L_0x0023
                if (r1 != r2) goto L_0x001b
                java.lang.Object r0 = r7.f80618d
                TJ.B r0 = (TJ.C16505B) r0
                java.lang.Object r1 = r7.f80617c
                java.lang.String r1 = (java.lang.String) r1
                XH.y.b(r8)
                goto L_0x0098
            L_0x001b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x0023:
                java.lang.Object r0 = r7.f80618d
                TJ.B r0 = (TJ.C16505B) r0
                java.lang.Object r1 = r7.f80617c
                java.lang.String r1 = (java.lang.String) r1
                XH.y.b(r8)
                goto L_0x0073
            L_0x002f:
                XH.y.b(r8)
                Ei.r r8 = r7.f80620f
                TJ.B r8 = r8.f80602q
                Ei.r$a$c r1 = Ei.C10697r.a.c.f80610a
                r8.setValue(r1)
                Ei.r r8 = r7.f80620f
                java.lang.String r8 = r8.G()
                Ei.r r1 = r7.f80620f
                TJ.B r1 = r1.f80602q
                if (r8 != 0) goto L_0x007e
                Ei.r r2 = r7.f80620f
                Gx.a r2 = r2.f80599n
                Hx.f$a r4 = Hx.f.Companion
                Ei.r r5 = r7.f80620f
                java.lang.String r5 = r5.I()
                if (r5 == 0) goto L_0x0076
                Hx.f r4 = r4.a(r5)
                Ei.r r5 = r7.f80620f
                java.lang.String r5 = r5.f80605t
                r7.f80617c = r8
                r7.f80618d = r1
                r7.f80619e = r3
                java.lang.Object r8 = r2.l(r4, r5, r7)
                if (r8 != r0) goto L_0x0072
                return r0
            L_0x0072:
                r0 = r1
            L_0x0073:
                Hx.c r8 = (Hx.c) r8
                goto L_0x009a
            L_0x0076:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Required value was null."
                r8.<init>(r0)
                throw r8
            L_0x007e:
                Ei.r r3 = r7.f80620f
                Gx.a r3 = r3.f80599n
                Ei.r r4 = r7.f80620f
                java.lang.String r4 = r4.f80605t
                r7.f80617c = r8
                r7.f80618d = r1
                r7.f80619e = r2
                java.lang.Object r8 = r3.e(r4, r8, r7)
                if (r8 != r0) goto L_0x0097
                return r0
            L_0x0097:
                r0 = r1
            L_0x0098:
                Hx.c r8 = (Hx.c) r8
            L_0x009a:
                Ei.r$a$a r1 = new Ei.r$a$a
                r1.<init>(r8)
                r0.setValue(r1)
                boolean r8 = r7.f80621g
                if (r8 == 0) goto L_0x00bc
                Ei.r r8 = r7.f80620f
                Ae.e r0 = r8.f80598m
                Ae.j r8 = Ae.j.ACTION_SUCCESS
                java.lang.String r1 = r8.b()
                com.ingka.ikea.analytics.Interaction$Component r3 = com.ingka.ikea.analytics.Interaction$Component.VIEW_ORDER_STATUS
                r5 = 10
                r6 = 0
                r2 = 0
                r4 = 0
                Ae.e.c.c(r0, r1, r2, r3, r4, r5, r6)
            L_0x00bc:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: Ei.C10697r.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LEi/r$a;", "detailsState", "LHx/c$d$c;", "expressReturnAction", "LEi/r$b;", "<anonymous>", "(LEi/r$a;LHx/c$d$c;)LEi/r$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.PurchaseDetailsViewModel$uiState$1", f = "PurchaseDetailsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ei.r$e */
    static final class e extends l implements q<a, c.d.C2665c, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80622c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f80623d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80624e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C10697r f80625f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C10697r rVar, C17164e<? super e> eVar) {
            super(3, eVar);
            this.f80625f = rVar;
        }

        /* renamed from: i */
        public final Object invoke(a aVar, c.d.C2665c cVar, C17164e<? super b> eVar) {
            e eVar2 = new e(this.f80625f, eVar);
            eVar2.f80623d = aVar;
            eVar2.f80624e = cVar;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f80622c == 0) {
                y.b(obj);
                return this.f80625f.E((a) this.f80623d, (c.d.C2665c) this.f80624e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.r$f */
    public static final class f<T> implements Comparator {
        public final int compare(T t10, T t11) {
            int i10;
            c.d dVar = (c.d) t10;
            int i11 = 5;
            if (dVar instanceof c.d.a) {
                i10 = 1;
            } else if (dVar instanceof c.d.e) {
                i10 = 2;
            } else if (dVar instanceof c.d.C2665c) {
                i10 = 3;
            } else if (dVar instanceof c.d.b) {
                i10 = 4;
            } else if (dVar instanceof c.d.f) {
                i10 = 5;
            } else {
                throw new t();
            }
            Integer valueOf = Integer.valueOf(i10);
            c.d dVar2 = (c.d) t11;
            if (dVar2 instanceof c.d.a) {
                i11 = 1;
            } else if (dVar2 instanceof c.d.e) {
                i11 = 2;
            } else if (dVar2 instanceof c.d.C2665c) {
                i11 = 3;
            } else if (dVar2 instanceof c.d.b) {
                i11 = 4;
            } else if (!(dVar2 instanceof c.d.f)) {
                throw new t();
            }
            return C17035a.e(valueOf, Integer.valueOf(i11));
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.r$g */
    public static final class g<T> implements Comparator {
        public final int compare(T t10, T t11) {
            int i10;
            boolean a10 = ((c.d) t10).a();
            int i11 = 2;
            if (a10) {
                i10 = 1;
            } else if (!a10) {
                i10 = 2;
            } else {
                throw new t();
            }
            Integer valueOf = Integer.valueOf(i10);
            boolean a11 = ((c.d) t11).a();
            if (a11) {
                i11 = 1;
            } else if (a11) {
                throw new t();
            }
            return C17035a.e(valueOf, Integer.valueOf(i11));
        }
    }

    public C10697r(U u10, Fi.e eVar, Ae.e eVar2, Gx.a aVar, C10253a aVar2, Fi.g gVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(eVar, "getExpressReturnActionUseCase");
        C17542s.j(eVar2, "analytics");
        C17542s.j(aVar, "purchaseHistoryRepository");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(gVar, "getPurchaseOrderSummaryUseCase");
        this.f80598m = eVar2;
        this.f80599n = aVar;
        this.f80600o = aVar2;
        this.f80601p = gVar;
        C16505B<a> a10 = C16521S.a(a.c.f80610a);
        this.f80602q = a10;
        String str = (String) u10.f("liteId");
        this.f80603r = str;
        this.f80604s = (String) u10.f("type");
        Object f10 = u10.f("orderId");
        if (f10 != null) {
            String str2 = (String) f10;
            this.f80605t = str2;
            this.f80606u = C16534i.c0(C16534i.n(a10, eVar.a(g0.a(this), str2, str), new e(this, (C17164e<? super e>) null)), g0.a(this), ip.f.a(), E(a10.getValue(), (c.d.C2665c) null));
            Boolean bool = (Boolean) u10.f("fromConfirmation");
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            this.f80607v = booleanValue;
            F(booleanValue);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: Ei.q$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: Ei.q$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: RC.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: Ei.q$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: Ei.q$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v2, resolved type: Ei.q$a} */
    /* JADX WARNING: type inference failed for: r11v2, types: [RC.m] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final Ei.C10696q D(Hx.c r30) {
        /*
            r29 = this;
            r0 = r29
            java.util.List r1 = r30.g()
            int r1 = r1.size()
            r3 = 1
            if (r1 <= r3) goto L_0x000f
            r4 = r3
            goto L_0x0010
        L_0x000f:
            r4 = 0
        L_0x0010:
            java.util.List r5 = r30.g()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
        L_0x0020:
            boolean r8 = r5.hasNext()
            r9 = 10
            r10 = 2
            r11 = 0
            if (r8 == 0) goto L_0x014c
            java.lang.Object r8 = r5.next()
            int r12 = r7 + 1
            if (r7 >= 0) goto L_0x0035
            YH.C16877v.x()
        L_0x0035:
            Hx.c$c r8 = (Hx.c.C2661c) r8
            Ai.p0$a r7 = Ai.C10599p0.Companion
            Hx.c$c$c r13 = r8.f()
            Ai.p0 r7 = r7.a(r13)
            if (r7 == 0) goto L_0x013f
            Hx.c$c$c r13 = r8.f()
            Hx.f r14 = r30.l()
            Hx.f r15 = Hx.f.RETURN
            if (r14 != r15) goto L_0x0051
            r14 = r3
            goto L_0x0052
        L_0x0051:
            r14 = 0
        L_0x0052:
            int r16 = zi.C12519b.b(r13, r14)
            if (r4 == 0) goto L_0x006d
            int r13 = Oo.b.f84624e2
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r15}
            IC.e r13 = IC.C13026h.b(r13, r14)
            r18 = r13
            goto L_0x006f
        L_0x006d:
            r18 = r11
        L_0x006f:
            IC.e$d r13 = new IC.e$d
            Hx.c$c$c r14 = r8.f()
            Hx.f r15 = r30.l()
            int r14 = zi.C12519b.d(r14, r15)
            r13.<init>(r14, r11, r10, r11)
            Hx.c$c$b r14 = r8.d()
            IC.e r19 = Ei.C10698s.j(r14)
            java.lang.String r14 = r8.b()
            if (r14 == 0) goto L_0x009b
            int r15 = wi.C12272a.f105760H
            java.lang.Object[] r14 = new java.lang.Object[]{r14}
            IC.e r14 = IC.C13026h.b(r15, r14)
            r20 = r14
            goto L_0x009d
        L_0x009b:
            r20 = r11
        L_0x009d:
            Ei.q$a$a r24 = new Ei.q$a$a
            r15 = r24
            r17 = r13
            r15.<init>(r16, r17, r18, r19, r20)
            java.util.List r13 = r8.i()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r14 = new java.util.ArrayList
            int r9 = YH.C16877v.y(r13, r9)
            r14.<init>(r9)
            java.util.Iterator r9 = r13.iterator()
        L_0x00b9:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x011f
            java.lang.Object r13 = r9.next()
            Hx.c$c$d r13 = (Hx.c.C2661c.d) r13
            Hx.c$c$d$b r15 = r13.b()
            Al.d r15 = zi.C12519b.a(r15)
            IC.e$d r2 = new IC.e$d
            Hx.c$c$d$a r3 = r13.a()
            int r3 = zi.C12519b.i(r3, r7)
            r2.<init>(r3, r11, r10, r11)
            Hx.c$c$d$a r3 = r13.a()
            Hx.c$c$d$b r10 = r13.b()
            java.lang.Integer r3 = zi.C12519b.h(r3, r10, r7)
            if (r3 == 0) goto L_0x00f5
            int r3 = r3.intValue()
            IC.e$d r10 = new IC.e$d
            r19 = r1
            r1 = 2
            r10.<init>(r3, r11, r1, r11)
            goto L_0x00f8
        L_0x00f5:
            r19 = r1
            r10 = r11
        L_0x00f8:
            Hx.c$c$d$b r1 = r13.b()
            Al.d r1 = zi.C12519b.a(r1)
            java.util.List r3 = r8.j()
            java.lang.String r13 = r8.b()
            java.util.List r1 = Ei.C10698s.n(r1, r13, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            KJ.c r1 = KJ.C15985a.h(r1)
            Ei.q$a$c r3 = new Ei.q$a$c
            r3.<init>(r15, r2, r10, r1)
            r14.add(r3)
            r1 = r19
            r3 = 1
            r10 = 2
            goto L_0x00b9
        L_0x011f:
            r19 = r1
            Ei.q$a$b r26 = r0.H(r8)
            java.lang.String r22 = r8.g()
            zi.a r23 = zi.C12519b.c(r8)
            java.util.List r27 = r8.a()
            Ei.q$a$d r28 = Ei.C10698s.m(r8, r4)
            Ei.q$a r11 = new Ei.q$a
            r21 = r11
            r25 = r14
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x0141
        L_0x013f:
            r19 = r1
        L_0x0141:
            if (r11 == 0) goto L_0x0146
            r6.add(r11)
        L_0x0146:
            r7 = r12
            r1 = r19
            r3 = 1
            goto L_0x0020
        L_0x014c:
            java.util.List r1 = r30.j()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = YH.C16877v.y(r1, r9)
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x015f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0192
            java.lang.Object r3 = r1.next()
            Hx.e r3 = (Hx.e) r3
            Ei.q$b r4 = new Ei.q$b
            Hx.e$a r5 = r3.b()
            int r5 = Ei.C10698s.l(r5)
            IC.e$d r7 = new IC.e$d
            Hx.e$a r8 = r3.b()
            int r8 = Ei.C10698s.k(r8)
            r9 = 2
            r7.<init>(r8, r11, r9, r11)
            java.lang.String r8 = r3.c()
            java.lang.String r3 = r3.a()
            r4.<init>(r5, r7, r8, r3)
            r2.add(r4)
            goto L_0x015f
        L_0x0192:
            java.lang.String r13 = r30.h()
            Hx.c$e r14 = r30.k()
            Hx.f r15 = r30.l()
            Hx.c$b r1 = r30.f()
            if (r1 == 0) goto L_0x01ab
            java.lang.String r1 = r1.a()
            r19 = r1
            goto L_0x01ad
        L_0x01ab:
            r19 = r11
        L_0x01ad:
            java.lang.String r20 = r30.i()
            Hx.c$a r1 = r30.e()
            if (r1 == 0) goto L_0x01bd
            Fi.g r3 = r0.f80601p
            RC.m r11 = r3.a(r1)
        L_0x01bd:
            r21 = r11
            java.util.List r1 = r30.d()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            KJ.c r17 = KJ.C15985a.h(r1)
            KJ.c r16 = KJ.C15985a.h(r6)
            java.util.List r1 = r30.c()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            KJ.c r18 = KJ.C15985a.h(r1)
            KJ.c r22 = KJ.C15985a.h(r2)
            Ei.q r1 = new Ei.q
            r12 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Ei.C10697r.D(Hx.c):Ei.q");
    }

    /* access modifiers changed from: private */
    public final b E(a aVar, c.d.C2665c cVar) {
        b aVar2;
        if (C17542s.e(aVar, a.c.f80610a)) {
            return b.c.f80614a;
        }
        if (aVar instanceof a.b) {
            aVar2 = new b.C1535b(this.f80605t, ((a.b) aVar).a());
        } else if (aVar instanceof a.C1534a) {
            aVar2 = new b.a(D(J(C10698s.h(C10698s.i(((a.C1534a) aVar).a(), this.f80600o.D()), cVar))));
        } else {
            throw new t();
        }
        return aVar2;
    }

    private final C10696q.a.b H(c.C2661c cVar) {
        c.C2661c.a c10 = cVar.c();
        if (c10 != null) {
            return new C10696q.a.b(C13026h.c(c10.b()), C13026h.c(c10.a()));
        }
        return null;
    }

    private final Hx.c J(Hx.c cVar) {
        return Hx.c.b(cVar, (String) null, (Hx.f) null, (c.e) null, (c.b) null, (String) null, (c.a) null, (List) null, (List) null, (List) null, C16877v.g1(C16877v.g1(cVar.c(), new f()), new g()), 511, (Object) null);
    }

    public final void F(boolean z10) {
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this, z10), (T) null, new d(this, z10, (C17164e<? super d>) null), 2, (Object) null);
    }

    public final String G() {
        return this.f80603r;
    }

    public final String I() {
        return this.f80604s;
    }

    public final C16519P<b> m() {
        return this.f80606u;
    }
}
