package Ei;

import Ae.e;
import Ae.j;
import Gx.a;
import HJ.C15854t;
import Hx.c;
import KJ.C15985a;
import KJ.C15987c;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16519P;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u000223B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020$0#8\u0006¢\u0006\f\n\u0004\b(\u0010&\u001a\u0004\b\u0011\u0010)R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00064"}, d2 = {"LEi/a;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LGx/a;", "purchaseHistoryRepository", "LAe/e;", "analytics", "<init>", "(Landroidx/lifecycle/U;LGx/a;LAe/e;)V", "", "orderId", "cancelToken", "reasonCode", "LXH/N;", "C", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "m", "LGx/a;", "n", "LAe/e;", "o", "Ljava/lang/String;", "cancelOrderId", "Landroidx/lifecycle/K;", "LEi/a$a;", "p", "Landroidx/lifecycle/K;", "_sideEffect", "Landroidx/lifecycle/F;", "q", "Landroidx/lifecycle/F;", "E", "()Landroidx/lifecycle/F;", "sideEffect", "LTJ/P;", "LEi/a$b;", "r", "LTJ/P;", "_uiState", "s", "()LTJ/P;", "uiState", "Lip/b;", "", "t", "Lip/b;", "D", "()Lip/b;", "orderCancelled", "a", "b", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.a  reason: case insensitive filesystem */
public final class C10680a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final a f80428m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Ae.e f80429n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final String f80430o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final K<C1520a> f80431p;

    /* renamed from: q  reason: collision with root package name */
    private final F<C1520a> f80432q;

    /* renamed from: r  reason: collision with root package name */
    private final C16519P<b> f80433r;

    /* renamed from: s  reason: collision with root package name */
    private final C16519P<b> f80434s;

    /* renamed from: t  reason: collision with root package name */
    private final C11410b<Boolean> f80435t;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LEi/a$a;", "", "<init>", "()V", "c", "b", "a", "LEi/a$a$a;", "LEi/a$a$b;", "LEi/a$a$c;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.a$a  reason: collision with other inner class name */
    public static abstract class C1520a {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LEi/a$a$a;", "LEi/a$a;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.a$a$a  reason: collision with other inner class name */
        public static final class C1521a extends C1520a {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f80436a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1521a(Throwable th2) {
                super((DefaultConstructorMarker) null);
                C17542s.j(th2, "throwable");
                this.f80436a = th2;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1521a) && C17542s.e(this.f80436a, ((C1521a) obj).f80436a);
            }

            public int hashCode() {
                return this.f80436a.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f80436a;
                return "Error(throwable=" + th2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/a$a$b;", "LEi/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.a$a$b */
        public static final class b extends C1520a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f80437a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2008838692;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/a$a$c;", "LEi/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.a$a$c */
        public static final class c extends C1520a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f80438a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1754531664;
            }

            public String toString() {
                return "None";
            }
        }

        public /* synthetic */ C1520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1520a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LEi/a$b;", "", "<init>", "()V", "b", "c", "a", "LEi/a$b$a;", "LEi/a$b$b;", "LEi/a$b$c;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.a$b */
    public static abstract class b {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"LEi/a$b$a;", "LEi/a$b;", "", "orderId", "cancelToken", "LKJ/c;", "LHx/c$d$b$a;", "reasons", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LKJ/c;", "()LKJ/c;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.a$b$a  reason: collision with other inner class name */
        public static final class C1522a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f80439a;

            /* renamed from: b  reason: collision with root package name */
            private final String f80440b;

            /* renamed from: c  reason: collision with root package name */
            private final C15987c<c.d.b.a> f80441c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1522a(String str, String str2, C15987c<c.d.b.a> cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "orderId");
                C17542s.j(str2, "cancelToken");
                C17542s.j(cVar, "reasons");
                this.f80439a = str;
                this.f80440b = str2;
                this.f80441c = cVar;
            }

            public final String a() {
                return this.f80440b;
            }

            public final String b() {
                return this.f80439a;
            }

            public final C15987c<c.d.b.a> c() {
                return this.f80441c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1522a)) {
                    return false;
                }
                C1522a aVar = (C1522a) obj;
                return C17542s.e(this.f80439a, aVar.f80439a) && C17542s.e(this.f80440b, aVar.f80440b) && C17542s.e(this.f80441c, aVar.f80441c);
            }

            public int hashCode() {
                return (((this.f80439a.hashCode() * 31) + this.f80440b.hashCode()) * 31) + this.f80441c.hashCode();
            }

            public String toString() {
                String str = this.f80439a;
                String str2 = this.f80440b;
                C15987c<c.d.b.a> cVar = this.f80441c;
                return "Content(orderId=" + str + ", cancelToken=" + str2 + ", reasons=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/a$b$b;", "LEi/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.a$b$b  reason: collision with other inner class name */
        public static final class C1523b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1523b f80442a = new C1523b();

            private C1523b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1523b);
            }

            public int hashCode() {
                return 497610461;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LEi/a$b$c;", "LEi/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.a$b$c */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f80443a = new c();

            private c() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -1017045807;
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LHx/c;", "details", "LEi/a$b;", "<anonymous>", "(LHx/c;)LEi/a$b;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.CancelOrderViewModel$_uiState$1", f = "CancelOrderViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ei.a$c */
    static final class c extends l implements p<Hx.c, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80444c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f80445d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C10680a f80446e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C10680a aVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f80446e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f80446e, eVar);
            cVar.f80445d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(Hx.c cVar, C17164e<? super b> eVar) {
            return ((c) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            c.d.b bVar;
            C10680a aVar;
            char c10;
            C10680a aVar2;
            C10680a aVar3;
            List<c.d> c11;
            C17187b.f();
            if (this.f80444c == 0) {
                y.b(obj);
                Hx.c cVar = (Hx.c) this.f80445d;
                if (cVar == null || (c11 = cVar.c()) == null) {
                    bVar = null;
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (Object next : c11) {
                        if (next instanceof c.d.b) {
                            arrayList.add(next);
                        }
                    }
                    bVar = (c.d.b) C16877v.y0(arrayList);
                }
                if (cVar == null) {
                    C10680a aVar4 = this.f80446e;
                    IllegalStateException illegalStateException = new IllegalStateException("Cancel order opened without cache, id: " + this.f80446e.f80430o);
                    qv.e eVar = qv.e.ERROR;
                    ArrayList<C11819b> arrayList2 = new ArrayList<>();
                    for (Object next2 : qv.d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar, false)) {
                            arrayList2.add(next2);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar2 : arrayList2) {
                        if (str == null) {
                            String a10 = C11818a.a((String) null, illegalStateException);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        if (str2 == null) {
                            String name = aVar4.getClass().getName();
                            C17542s.g(name);
                            aVar3 = aVar4;
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        } else {
                            aVar3 = aVar4;
                        }
                        bVar2.a(eVar, str2, false, illegalStateException, str);
                        aVar4 = aVar3;
                    }
                    return b.C1523b.f80442a;
                } else if (bVar == null) {
                    C10680a aVar5 = this.f80446e;
                    IllegalStateException illegalStateException2 = new IllegalStateException("Cancel order opened without a cancel action");
                    qv.e eVar2 = qv.e.ERROR;
                    ArrayList<C11819b> arrayList3 = new ArrayList<>();
                    for (Object next3 : qv.d.f102012a.a()) {
                        if (((C11819b) next3).b(eVar2, false)) {
                            arrayList3.add(next3);
                        }
                    }
                    String str3 = null;
                    String str4 = null;
                    for (C11819b bVar3 : arrayList3) {
                        if (str3 == null) {
                            String a11 = C11818a.a((String) null, illegalStateException2);
                            if (a11 == null) {
                                break;
                            }
                            str3 = C11820c.a(a11);
                        }
                        if (str4 == null) {
                            String name2 = aVar5.getClass().getName();
                            C17542s.g(name2);
                            aVar2 = aVar5;
                            String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o13.length() != 0) {
                                name2 = C15854t.P0(o13, "Kt");
                            }
                            str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                        } else {
                            aVar2 = aVar5;
                        }
                        bVar3.a(eVar2, str4, false, illegalStateException2, str3);
                        aVar5 = aVar2;
                    }
                    return b.C1523b.f80442a;
                } else {
                    String b10 = bVar.b();
                    List<c.d.b.a> c12 = bVar.c();
                    if (b10 != null && !C15854t.v0(b10) && !c12.isEmpty()) {
                        return new b.C1522a(cVar.h(), b10, C15985a.h(c12));
                    }
                    C10680a aVar6 = this.f80446e;
                    IllegalStateException illegalStateException3 = new IllegalStateException("Cancel order opened with invalid token or reasons: " + c12);
                    qv.e eVar3 = qv.e.ERROR;
                    ArrayList<C11819b> arrayList4 = new ArrayList<>();
                    for (Object next4 : qv.d.f102012a.a()) {
                        if (((C11819b) next4).b(eVar3, false)) {
                            arrayList4.add(next4);
                        }
                    }
                    String str5 = null;
                    String str6 = null;
                    for (C11819b bVar4 : arrayList4) {
                        if (str5 == null) {
                            String a12 = C11818a.a((String) null, illegalStateException3);
                            if (a12 == null) {
                                break;
                            }
                            str5 = C11820c.a(a12);
                        }
                        if (str6 == null) {
                            String name3 = aVar6.getClass().getName();
                            C17542s.g(name3);
                            c10 = '$';
                            aVar = aVar6;
                            String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o14.length() != 0) {
                                name3 = C15854t.P0(o14, "Kt");
                            }
                            str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                        } else {
                            aVar = aVar6;
                            c10 = '$';
                        }
                        char c13 = c10;
                        bVar4.a(eVar3, str6, false, illegalStateException3, str5);
                        aVar6 = aVar;
                    }
                    return b.C1523b.f80442a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/a$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.a$d */
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10680a f80447a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, C10680a aVar2) {
            super(aVar);
            this.f80447a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10680a aVar = this.f80447a;
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
                    String a10 = C11818a.a("Unable to cancel order", th2);
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
            this.f80447a.f80431p.setValue(new C1520a.C1521a(th2));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.CancelOrderViewModel$cancelOrder$2", f = "CancelOrderViewModel.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: Ei.a$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80448c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10680a f80449d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f80450e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f80451f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f80452g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C10680a aVar, String str, String str2, String str3, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f80449d = aVar;
            this.f80450e = str;
            this.f80451f = str2;
            this.f80452g = str3;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f80449d, this.f80450e, this.f80451f, this.f80452g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80448c;
            if (i10 == 0) {
                y.b(obj);
                this.f80449d.f80431p.setValue(C1520a.b.f80437a);
                e.c.c(this.f80449d.f80429n, j.ACTION_TAP.b(), (Map) null, Interaction$Component.PURCHASE_HISTORY_CANCEL_ORDER, (e.b) null, 10, (Object) null);
                a j10 = this.f80449d.f80428m;
                String str = this.f80450e;
                String str2 = this.f80451f;
                String str3 = this.f80452g;
                this.f80448c = 1;
                if (j10.b(str, str2, str3, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f80449d.D().e(kotlin.coroutines.jvm.internal.b.a(true));
            this.f80449d.f80431p.setValue(C1520a.c.f80438a);
            return C16807N.f139792a;
        }
    }

    public C10680a(U u10, a aVar, Ae.e eVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "purchaseHistoryRepository");
        C17542s.j(eVar, "analytics");
        this.f80428m = aVar;
        this.f80429n = eVar;
        Object f10 = u10.f("cancelOrderId");
        if (f10 != null) {
            String str = (String) f10;
            this.f80430o = str;
            K<C1520a> k10 = new K<>();
            this.f80431p = k10;
            this.f80432q = k10;
            C16519P<b> c02 = C16534i.c0(C16534i.N(aVar.j(str), new c(this, (C17164e<? super c>) null)), g0.a(this), ip.f.a(), b.c.f80443a);
            this.f80433r = c02;
            this.f80434s = c02;
            this.f80435t = new C11410b<>();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void C(String str, String str2, String str3) {
        C17542s.j(str, "orderId");
        C17542s.j(str2, "cancelToken");
        C17542s.j(str3, "reasonCode");
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, str, str2, str3, (C17164e<? super e>) null), 2, (Object) null);
    }

    public final C11410b<Boolean> D() {
        return this.f80435t;
    }

    public final F<C1520a> E() {
        return this.f80432q;
    }

    public final C16519P<b> m() {
        return this.f80434s;
    }
}
