package Tw;

import IC.C13023e;
import IC.C13026h;
import KJ.C15987c;
import Nn.A;
import Nn.D;
import Qw.C13472e0;
import RC.m;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import rv.C11849b;
import xB.C15201a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\b\u0018\u00002\u00020\u0001:\u0004 \"&\u0012BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Jb\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010-\u001a\u0004\b&\u0010.R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b\"\u00100¨\u00061"}, d2 = {"LTw/f;", "", "", "isLoading", "showCompletePurchase", "", "LTw/f$b;", "paymentOptions", "LTw/f$c;", "priceSummary", "LTw/f$d;", "recoverablePaymentError", "LTw/f$a;", "expressPaymentError", "LTw/a;", "action", "<init>", "(ZZLjava/util/List;LTw/f$c;LTw/f$d;LTw/f$a;LTw/a;)V", "a", "(ZZLjava/util/List;LTw/f$c;LTw/f$d;LTw/f$a;LTw/a;)LTw/f;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "i", "()Z", "b", "h", "c", "Ljava/util/List;", "e", "()Ljava/util/List;", "d", "LTw/f$c;", "f", "()LTw/f$c;", "LTw/f$d;", "g", "()LTw/f$d;", "LTw/f$a;", "()LTw/f$a;", "LTw/a;", "()LTw/a;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tw.f  reason: case insensitive filesystem */
public final class C13693f {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f116791a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f116792b;

    /* renamed from: c  reason: collision with root package name */
    private final List<b> f116793c;

    /* renamed from: d  reason: collision with root package name */
    private final c f116794d;

    /* renamed from: e  reason: collision with root package name */
    private final d f116795e;

    /* renamed from: f  reason: collision with root package name */
    private final a f116796f;

    /* renamed from: g  reason: collision with root package name */
    private final C13688a f116797g;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0011R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010)\u001a\u00020$8\u0016X\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"LTw/f$b;", "LxB/a;", "", "rating", "LKJ/c;", "LNn/D;", "paymentOptions", "LNn/A;", "participatingBanks", "LQw/e0;", "state", "<init>", "(ILKJ/c;LKJ/c;LQw/e0;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "i", "b", "LKJ/c;", "h", "()LKJ/c;", "c", "g", "d", "LQw/e0;", "j", "()LQw/e0;", "", "e", "J", "f", "()J", "stableId", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.f$b */
    public static final class b implements C15201a {

        /* renamed from: a  reason: collision with root package name */
        private final int f116801a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<D> f116802b;

        /* renamed from: c  reason: collision with root package name */
        private final C15987c<A> f116803c;

        /* renamed from: d  reason: collision with root package name */
        private final C13472e0 f116804d;

        /* renamed from: e  reason: collision with root package name */
        private final long f116805e;

        public b(int i10, C15987c<? extends D> cVar, C15987c<A> cVar2, C13472e0 e0Var) {
            C17542s.j(cVar, "paymentOptions");
            C17542s.j(cVar2, "participatingBanks");
            C17542s.j(e0Var, "state");
            this.f116801a = i10;
            this.f116802b = cVar;
            this.f116803c = cVar2;
            this.f116804d = e0Var;
            U u10 = new U(3);
            u10.a(P.b(b.class));
            u10.a(cVar);
            u10.b(new Object[0]);
            this.f116805e = (long) Objects.hash(u10.d(new Object[u10.c()]));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f116801a == bVar.f116801a && C17542s.e(this.f116802b, bVar.f116802b) && C17542s.e(this.f116803c, bVar.f116803c) && C17542s.e(this.f116804d, bVar.f116804d);
        }

        public long f() {
            return this.f116805e;
        }

        public final C15987c<A> g() {
            return this.f116803c;
        }

        public final C15987c<D> h() {
            return this.f116802b;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f116801a) * 31) + this.f116802b.hashCode()) * 31) + this.f116803c.hashCode()) * 31) + this.f116804d.hashCode();
        }

        public final int i() {
            return this.f116801a;
        }

        public final C13472e0 j() {
            return this.f116804d;
        }

        public String toString() {
            int i10 = this.f116801a;
            C15987c<D> cVar = this.f116802b;
            C15987c<A> cVar2 = this.f116803c;
            C13472e0 e0Var = this.f116804d;
            return "PaymentOptionUi(rating=" + i10 + ", paymentOptions=" + cVar + ", participatingBanks=" + cVar2 + ", state=" + e0Var + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001c"}, d2 = {"LTw/f$c;", "", "LTw/f$c$a;", "title", "LRC/m;", "priceSummary", "", "expanded", "<init>", "(LTw/f$c$a;LRC/m;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LTw/f$c$a;", "c", "()LTw/f$c$a;", "b", "LRC/m;", "()LRC/m;", "Z", "()Z", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.f$c */
    public static final class c {

        /* renamed from: d  reason: collision with root package name */
        public static final int f116806d;

        /* renamed from: a  reason: collision with root package name */
        private final a f116807a;

        /* renamed from: b  reason: collision with root package name */
        private final m f116808b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f116809c;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"LTw/f$c$a;", "", "LIC/e;", "title", "titleSuffix", "<init>", "(LIC/e;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "()LIC/e;", "b", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Tw.f$c$a */
        public static final class a {

            /* renamed from: c  reason: collision with root package name */
            public static final int f116810c = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f116811a;

            /* renamed from: b  reason: collision with root package name */
            private final C13023e f116812b;

            public a(C13023e eVar, C13023e eVar2) {
                C17542s.j(eVar, "title");
                C17542s.j(eVar2, "titleSuffix");
                this.f116811a = eVar;
                this.f116812b = eVar2;
            }

            public final C13023e a() {
                return this.f116811a;
            }

            public final C13023e b() {
                return this.f116812b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f116811a, aVar.f116811a) && C17542s.e(this.f116812b, aVar.f116812b);
            }

            public int hashCode() {
                return (this.f116811a.hashCode() * 31) + this.f116812b.hashCode();
            }

            public String toString() {
                C13023e eVar = this.f116811a;
                C13023e eVar2 = this.f116812b;
                return "Title(title=" + eVar + ", titleSuffix=" + eVar2 + ")";
            }
        }

        static {
            int i10 = m.f115340m;
            int i11 = C13023e.f110931a;
            f116806d = i10 | i11 | i11;
        }

        public c(a aVar, m mVar, boolean z10) {
            C17542s.j(aVar, "title");
            C17542s.j(mVar, "priceSummary");
            this.f116807a = aVar;
            this.f116808b = mVar;
            this.f116809c = z10;
        }

        public final boolean a() {
            return this.f116809c;
        }

        public final m b() {
            return this.f116808b;
        }

        public final a c() {
            return this.f116807a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f116807a, cVar.f116807a) && C17542s.e(this.f116808b, cVar.f116808b) && this.f116809c == cVar.f116809c;
        }

        public int hashCode() {
            return (((this.f116807a.hashCode() * 31) + this.f116808b.hashCode()) * 31) + Boolean.hashCode(this.f116809c);
        }

        public String toString() {
            a aVar = this.f116807a;
            m mVar = this.f116808b;
            boolean z10 = this.f116809c;
            return "PriceSummaryUiState(title=" + aVar + ", priceSummary=" + mVar + ", expanded=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"LTw/f$d;", "", "LIC/e;", "header", "description", "<init>", "(LIC/e;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.f$d */
    public static final class d {

        /* renamed from: c  reason: collision with root package name */
        public static final int f116813c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f116814a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f116815b;

        public d(C13023e eVar, C13023e eVar2) {
            C17542s.j(eVar, "header");
            C17542s.j(eVar2, "description");
            this.f116814a = eVar;
            this.f116815b = eVar2;
        }

        public final C13023e a() {
            return this.f116815b;
        }

        public final C13023e b() {
            return this.f116814a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f116814a, dVar.f116814a) && C17542s.e(this.f116815b, dVar.f116815b);
        }

        public int hashCode() {
            return (this.f116814a.hashCode() * 31) + this.f116815b.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f116814a;
            C13023e eVar2 = this.f116815b;
            return "RecoverablePaymentError(header=" + eVar + ", description=" + eVar2 + ")";
        }
    }

    public C13693f(boolean z10, boolean z11, List<b> list, c cVar, d dVar, a aVar, C13688a aVar2) {
        C17542s.j(list, "paymentOptions");
        C17542s.j(aVar2, "action");
        this.f116791a = z10;
        this.f116792b = z11;
        this.f116793c = list;
        this.f116794d = cVar;
        this.f116795e = dVar;
        this.f116796f = aVar;
        this.f116797g = aVar2;
    }

    public static /* synthetic */ C13693f b(C13693f fVar, boolean z10, boolean z11, List<b> list, c cVar, d dVar, a aVar, C13688a aVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = fVar.f116791a;
        }
        if ((i10 & 2) != 0) {
            z11 = fVar.f116792b;
        }
        boolean z12 = z11;
        if ((i10 & 4) != 0) {
            list = fVar.f116793c;
        }
        List<b> list2 = list;
        if ((i10 & 8) != 0) {
            cVar = fVar.f116794d;
        }
        c cVar2 = cVar;
        if ((i10 & 16) != 0) {
            dVar = fVar.f116795e;
        }
        d dVar2 = dVar;
        if ((i10 & 32) != 0) {
            aVar = fVar.f116796f;
        }
        a aVar3 = aVar;
        if ((i10 & 64) != 0) {
            aVar2 = fVar.f116797g;
        }
        return fVar.a(z10, z12, list2, cVar2, dVar2, aVar3, aVar2);
    }

    public final C13693f a(boolean z10, boolean z11, List<b> list, c cVar, d dVar, a aVar, C13688a aVar2) {
        C17542s.j(list, "paymentOptions");
        C13688a aVar3 = aVar2;
        C17542s.j(aVar3, "action");
        return new C13693f(z10, z11, list, cVar, dVar, aVar, aVar3);
    }

    public final C13688a c() {
        return this.f116797g;
    }

    public final a d() {
        return this.f116796f;
    }

    public final List<b> e() {
        return this.f116793c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13693f)) {
            return false;
        }
        C13693f fVar = (C13693f) obj;
        return this.f116791a == fVar.f116791a && this.f116792b == fVar.f116792b && C17542s.e(this.f116793c, fVar.f116793c) && C17542s.e(this.f116794d, fVar.f116794d) && C17542s.e(this.f116795e, fVar.f116795e) && C17542s.e(this.f116796f, fVar.f116796f) && C17542s.e(this.f116797g, fVar.f116797g);
    }

    public final c f() {
        return this.f116794d;
    }

    public final d g() {
        return this.f116795e;
    }

    public final boolean h() {
        return this.f116792b;
    }

    public int hashCode() {
        int hashCode = ((((Boolean.hashCode(this.f116791a) * 31) + Boolean.hashCode(this.f116792b)) * 31) + this.f116793c.hashCode()) * 31;
        c cVar = this.f116794d;
        int i10 = 0;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f116795e;
        int hashCode3 = (hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        a aVar = this.f116796f;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((hashCode3 + i10) * 31) + this.f116797g.hashCode();
    }

    public final boolean i() {
        return this.f116791a;
    }

    public String toString() {
        boolean z10 = this.f116791a;
        boolean z11 = this.f116792b;
        List<b> list = this.f116793c;
        c cVar = this.f116794d;
        d dVar = this.f116795e;
        a aVar = this.f116796f;
        C13688a aVar2 = this.f116797g;
        return "PaymentUiState(isLoading=" + z10 + ", showCompletePurchase=" + z11 + ", paymentOptions=" + list + ", priceSummary=" + cVar + ", recoverablePaymentError=" + dVar + ", expressPaymentError=" + aVar + ", action=" + aVar2 + ")";
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\u001a¨\u0006\u001b"}, d2 = {"LTw/f$a;", "", "LIC/e;", "title", "subtitle", "", "LWg/a;", "errorMessages", "<init>", "(LIC/e;LIC/e;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "c", "()LIC/e;", "b", "Ljava/util/List;", "()Ljava/util/List;", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tw.f$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f116798a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f116799b;

        /* renamed from: c  reason: collision with root package name */
        private final List<Wg.a> f116800c;

        public a(C13023e eVar, C13023e eVar2, List<Wg.a> list) {
            C17542s.j(eVar, "title");
            C17542s.j(eVar2, "subtitle");
            C17542s.j(list, "errorMessages");
            this.f116798a = eVar;
            this.f116799b = eVar2;
            this.f116800c = list;
        }

        public final List<Wg.a> a() {
            return this.f116800c;
        }

        public final C13023e b() {
            return this.f116799b;
        }

        public final C13023e c() {
            return this.f116798a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f116798a, aVar.f116798a) && C17542s.e(this.f116799b, aVar.f116799b) && C17542s.e(this.f116800c, aVar.f116800c);
        }

        public int hashCode() {
            return (((this.f116798a.hashCode() * 31) + this.f116799b.hashCode()) * 31) + this.f116800c.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f116798a;
            C13023e eVar2 = this.f116799b;
            List<Wg.a> list = this.f116800c;
            return "ExpressPaymentError(title=" + eVar + ", subtitle=" + eVar2 + ", errorMessages=" + list + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C13023e eVar, C13023e eVar2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C13026h.a(C11849b.f102318l2) : eVar, (i10 & 2) != 0 ? C13026h.a(C11849b.f102310j2) : eVar2, list);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13693f(boolean r7, boolean r8, java.util.List r9, Tw.C13693f.c r10, Tw.C13693f.d r11, Tw.C13693f.a r12, Tw.C13688a r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r0 = r14 & 2
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r8
        L_0x0007:
            r1 = r14 & 4
            if (r1 == 0) goto L_0x0010
            java.util.List r1 = YH.C16877v.n()
            goto L_0x0011
        L_0x0010:
            r1 = r9
        L_0x0011:
            r2 = r14 & 8
            r3 = 0
            if (r2 == 0) goto L_0x0018
            r2 = r3
            goto L_0x0019
        L_0x0018:
            r2 = r10
        L_0x0019:
            r4 = r14 & 16
            if (r4 == 0) goto L_0x001f
            r4 = r3
            goto L_0x0020
        L_0x001f:
            r4 = r11
        L_0x0020:
            r5 = r14 & 32
            if (r5 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r3 = r12
        L_0x0026:
            r5 = r14 & 64
            if (r5 == 0) goto L_0x002d
            Tw.a$c r5 = Tw.C13688a.c.f116761a
            goto L_0x002e
        L_0x002d:
            r5 = r13
        L_0x002e:
            r8 = r6
            r9 = r7
            r10 = r0
            r11 = r1
            r12 = r2
            r13 = r4
            r14 = r3
            r15 = r5
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Tw.C13693f.<init>(boolean, boolean, java.util.List, Tw.f$c, Tw.f$d, Tw.f$a, Tw.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
