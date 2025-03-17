package Tw;

import HJ.C15854t;
import IC.C13023e;
import KC.r;
import Nn.C10805h;
import Nn.x;
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
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.q;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11849b;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0003()*B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010\u001dR\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0015\u0010&¨\u0006+"}, d2 = {"LTw/b;", "Landroidx/lifecycle/f0;", "LNn/x;", "checkoutRepository", "Landroidx/lifecycle/U;", "savedStateHandle", "<init>", "(LNn/x;Landroidx/lifecycle/U;)V", "", "error", "LXH/N;", "F", "(Ljava/lang/Throwable;)V", "", "cardNumber", "pin", "G", "(Ljava/lang/String;Ljava/lang/String;)V", "D", "()V", "E", "m", "LNn/x;", "n", "Ljava/lang/String;", "checkoutId", "LTJ/B;", "", "o", "LTJ/B;", "isLoading", "LTw/b$b;", "p", "uiData", "LTJ/P;", "LTw/b$c;", "q", "LTJ/P;", "()LTJ/P;", "uiState", "b", "c", "a", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tw.b  reason: case insensitive filesystem */
public final class C13689b extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final x f116764m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final String f116765n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C16505B<Boolean> f116766o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C16505B<C2870b> f116767p;

    /* renamed from: q  reason: collision with root package name */
    private final C16519P<c> f116768q;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LTw/b$a;", "", "<init>", "()V", "b", "a", "LTw/b$a$a;", "LTw/b$a$b;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.b$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTw/b$a$a;", "LTw/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tw.b$a$a  reason: collision with other inner class name */
        public static final class C2868a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2868a f116769a = new C2868a();

            private C2868a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2868a);
            }

            public int hashCode() {
                return 1612108595;
            }

            public String toString() {
                return "FatalError";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LTw/b$a$b;", "LTw/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tw.b$a$b  reason: collision with other inner class name */
        public static final class C2869b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C2869b f116770a = new C2869b();

            private C2869b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C2869b);
            }

            public int hashCode() {
                return 771382936;
            }

            public String toString() {
                return "GiftCardAddedSuccessfully";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LTw/b$b;", "", "LIC/e;", "snackbarMessage", "LKC/r;", "error", "LTw/b$a;", "result", "<init>", "(LIC/e;LKC/r;LTw/b$a;)V", "a", "(LIC/e;LKC/r;LTw/b$a;)LTw/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LIC/e;", "e", "()LIC/e;", "b", "LKC/r;", "c", "()LKC/r;", "LTw/b$a;", "d", "()LTw/b$a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.b$b  reason: collision with other inner class name */
    private static final class C2870b {

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f116771a;

        /* renamed from: b  reason: collision with root package name */
        private final r f116772b;

        /* renamed from: c  reason: collision with root package name */
        private final a f116773c;

        public C2870b() {
            this((C13023e) null, (r) null, (a) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ C2870b b(C2870b bVar, C13023e eVar, r rVar, a aVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                eVar = bVar.f116771a;
            }
            if ((i10 & 2) != 0) {
                rVar = bVar.f116772b;
            }
            if ((i10 & 4) != 0) {
                aVar = bVar.f116773c;
            }
            return bVar.a(eVar, rVar, aVar);
        }

        public final C2870b a(C13023e eVar, r rVar, a aVar) {
            return new C2870b(eVar, rVar, aVar);
        }

        public final r c() {
            return this.f116772b;
        }

        public final a d() {
            return this.f116773c;
        }

        public final C13023e e() {
            return this.f116771a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2870b)) {
                return false;
            }
            C2870b bVar = (C2870b) obj;
            return C17542s.e(this.f116771a, bVar.f116771a) && C17542s.e(this.f116772b, bVar.f116772b) && C17542s.e(this.f116773c, bVar.f116773c);
        }

        public int hashCode() {
            C13023e eVar = this.f116771a;
            int i10 = 0;
            int hashCode = (eVar == null ? 0 : eVar.hashCode()) * 31;
            r rVar = this.f116772b;
            int hashCode2 = (hashCode + (rVar == null ? 0 : rVar.hashCode())) * 31;
            a aVar = this.f116773c;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            C13023e eVar = this.f116771a;
            r rVar = this.f116772b;
            a aVar = this.f116773c;
            return "State(snackbarMessage=" + eVar + ", error=" + rVar + ", result=" + aVar + ")";
        }

        public C2870b(C13023e eVar, r rVar, a aVar) {
            this.f116771a = eVar;
            this.f116772b = rVar;
            this.f116773c = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C2870b(C13023e eVar, r rVar, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : eVar, (i10 & 2) != 0 ? null : rVar, (i10 & 4) != 0 ? null : aVar);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0015\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u0019\u0010 ¨\u0006!"}, d2 = {"LTw/b$c;", "", "", "isLoading", "LIC/e;", "snackbarMessage", "LKC/r;", "error", "LTw/b$a;", "result", "<init>", "(ZLIC/e;LKC/r;LTw/b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "LIC/e;", "c", "()LIC/e;", "LKC/r;", "()LKC/r;", "LTw/b$a;", "()LTw/b$a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.b$c */
    public static final class c {

        /* renamed from: e  reason: collision with root package name */
        public static final int f116774e = (r.f111614a | C13023e.f110931a);

        /* renamed from: a  reason: collision with root package name */
        private final boolean f116775a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f116776b;

        /* renamed from: c  reason: collision with root package name */
        private final r f116777c;

        /* renamed from: d  reason: collision with root package name */
        private final a f116778d;

        public c() {
            this(false, (C13023e) null, (r) null, (a) null, 15, (DefaultConstructorMarker) null);
        }

        public final r a() {
            return this.f116777c;
        }

        public final a b() {
            return this.f116778d;
        }

        public final C13023e c() {
            return this.f116776b;
        }

        public final boolean d() {
            return this.f116775a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f116775a == cVar.f116775a && C17542s.e(this.f116776b, cVar.f116776b) && C17542s.e(this.f116777c, cVar.f116777c) && C17542s.e(this.f116778d, cVar.f116778d);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.f116775a) * 31;
            C13023e eVar = this.f116776b;
            int i10 = 0;
            int hashCode2 = (hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            r rVar = this.f116777c;
            int hashCode3 = (hashCode2 + (rVar == null ? 0 : rVar.hashCode())) * 31;
            a aVar = this.f116778d;
            if (aVar != null) {
                i10 = aVar.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            boolean z10 = this.f116775a;
            C13023e eVar = this.f116776b;
            r rVar = this.f116777c;
            a aVar = this.f116778d;
            return "UiState(isLoading=" + z10 + ", snackbarMessage=" + eVar + ", error=" + rVar + ", result=" + aVar + ")";
        }

        public c(boolean z10, C13023e eVar, r rVar, a aVar) {
            this.f116775a = z10;
            this.f116776b = eVar;
            this.f116777c = rVar;
            this.f116778d = aVar;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(boolean z10, C13023e eVar, r rVar, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : eVar, (i10 & 4) != 0 ? null : rVar, (i10 & 8) != 0 ? null : aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.b$d */
    public /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f116779a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Nn.h$b$a[] r0 = Nn.C10805h.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.h$b$a r1 = Nn.C10805h.b.a.GIFT_CARD_BAD_CARD_NR     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Nn.h$b$a r1 = Nn.C10805h.b.a.GIFT_CARD_BAD_PIN_NR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nn.h$b$a r1 = Nn.C10805h.b.a.GIFT_CARD_GENERAL_ERROR     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f116779a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tw.C13689b.d.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Tw/b$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.b$e */
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C13689b f116780a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, C13689b bVar) {
            super(aVar);
            this.f116780a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C13689b bVar = this.f116780a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar2 : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Error adding gift card", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = bVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar2.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f116780a.F(th2);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.GiftCardViewModel$trySubmitGiftCard$2", f = "GiftCardViewModel.kt", l = {70}, m = "invokeSuspend")
    /* renamed from: Tw.b$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116781c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f116782d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13689b f116783e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f116784f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f116785g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C13689b bVar, String str, String str2, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f116783e = bVar;
            this.f116784f = str;
            this.f116785g = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f116783e, this.f116784f, this.f116785g, eVar);
            fVar.f116782d = obj;
            return fVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f116781c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f116782d;
                x i11 = this.f116783e.f116764m;
                String h10 = this.f116783e.f116765n;
                String str = this.f116784f;
                String str2 = this.f116785g;
                this.f116782d = q11;
                this.f116781c = 1;
                if (i11.v(h10, str, str2, this) == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                q10 = (Q) this.f116782d;
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f116783e.f116766o.setValue(b.a(false));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
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
                    String a10 = C11818a.a("Gift card added", (Throwable) null);
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
            this.f116783e.f116767p.setValue(new C2870b((C13023e) null, (r) null, a.C2869b.f116770a, 3, (DefaultConstructorMarker) null));
            this.f116783e.f116766o.setValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "loading", "LTw/b$b;", "states", "LTw/b$c;", "<anonymous>", "(ZLTw/b$b;)LTw/b$c;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.onlinepayment.impl.presentation.viewmodel.GiftCardViewModel$uiState$1", f = "GiftCardViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Tw.b$g */
    static final class g extends l implements q<Boolean, C2870b, C17164e<? super c>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f116786c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ boolean f116787d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f116788e;

        g(C17164e<? super g> eVar) {
            super(3, eVar);
        }

        public final Object i(boolean z10, C2870b bVar, C17164e<? super c> eVar) {
            g gVar = new g(eVar);
            gVar.f116787d = z10;
            gVar.f116788e = bVar;
            return gVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i(((Boolean) obj).booleanValue(), (C2870b) obj2, (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f116786c == 0) {
                y.b(obj);
                boolean z10 = this.f116787d;
                C2870b bVar = (C2870b) this.f116788e;
                return new c(z10, bVar.e(), bVar.c(), bVar.d());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C13689b(x xVar, U u10) {
        C17542s.j(xVar, "checkoutRepository");
        C17542s.j(u10, "savedStateHandle");
        this.f116764m = xVar;
        Object f10 = u10.f(AsyncPaymentActivity.EXTRA_CHECKOUT_ID);
        if (f10 != null) {
            this.f116765n = (String) f10;
            C16505B<Boolean> a10 = C16521S.a(Boolean.FALSE);
            this.f116766o = a10;
            C16505B<C2870b> a11 = C16521S.a(new C2870b((C13023e) null, (r) null, (a) null, 7, (DefaultConstructorMarker) null));
            this.f116767p = a11;
            this.f116768q = C16534i.c0(C16534i.n(a10, a11, new g((C17164e<? super g>) null)), g0.a(this), ip.f.a(), new c(false, (C13023e) null, (r) null, (a) null, 15, (DefaultConstructorMarker) null));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final void F(Throwable th2) {
        C10805h hVar = th2 instanceof C10805h ? (C10805h) th2 : null;
        if (hVar instanceof C10805h.b) {
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
                    String a10 = C11818a.a("Received " + ((C10805h.b) hVar).a(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = C13689b.class.getName();
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
            int i10 = d.f116779a[((C10805h.b) hVar).a().ordinal()];
            if (i10 == 1) {
                this.f116767p.setValue(new C2870b((C13023e) null, new r.a(C11849b.f102338q2), (a) null, 5, (DefaultConstructorMarker) null));
            } else if (i10 == 2) {
                this.f116767p.setValue(new C2870b((C13023e) null, new r.b(C11849b.f102342r2), (a) null, 5, (DefaultConstructorMarker) null));
            } else if (i10 == 3) {
                C16505B<C2870b> b10 = this.f116767p;
                b10.setValue(C2870b.b(b10.getValue(), new C13023e.d(Oo.b.f84722n1, (List) null, 2, (DefaultConstructorMarker) null), (r) null, (a) null, 6, (Object) null));
            } else {
                throw new t();
            }
        } else if (C17542s.e(hVar, C10805h.c.f84071a)) {
            C16505B<C2870b> b11 = this.f116767p;
            b11.setValue(C2870b.b(b11.getValue(), (C13023e) null, (r) null, a.C2868a.f116769a, 3, (Object) null));
        } else if (C17542s.e(hVar, C10805h.a.f84069a) || (hVar instanceof C10805h.d) || C17542s.e(hVar, C10805h.e.f84074a) || hVar == null) {
            C16505B<C2870b> b12 = this.f116767p;
            b12.setValue(C2870b.b(b12.getValue(), new C13023e.d(Oo.b.f84722n1, (List) null, 2, (DefaultConstructorMarker) null), (r) null, (a) null, 6, (Object) null));
        } else {
            throw new t();
        }
    }

    public final void D() {
        C16505B<C2870b> b10 = this.f116767p;
        b10.setValue(C2870b.b(b10.getValue(), (C13023e) null, (r) null, (a) null, 5, (Object) null));
    }

    public final void E() {
        C16505B<C2870b> b10 = this.f116767p;
        b10.setValue(C2870b.b(b10.getValue(), (C13023e) null, (r) null, (a) null, 6, (Object) null));
    }

    public final void G(String str, String str2) {
        C17542s.j(str, "cardNumber");
        C17542s.j(str2, "pin");
        this.f116766o.setValue(Boolean.TRUE);
        F0 unused = C16314k.d(g0.a(this), new e(N.f137593c0, this), (T) null, new f(this, str, str2, (C17164e<? super f>) null), 2, (Object) null);
    }

    public final C16519P<c> m() {
        return this.f116768q;
    }
}
