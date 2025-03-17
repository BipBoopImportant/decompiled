package Zp;

import Es.a;
import HJ.C15854t;
import KJ.C15985a;
import KJ.C15987c;
import Op.B0;
import Op.c1;
import Op.d1;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import Qr.b;
import TJ.C16505B;
import TJ.C16515L;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import YH.C16877v;
import Zp.e;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import aq.C11079a;
import aq.C11080b;
import bq.C11118a;
import bq.C11119b;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.discover.impl.ui.i;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import is.C11414a;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.t;
import pe.C10137a;
import qe.C10188a;
import qe.C10189b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sB.C15035a;
import ug.k;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002RSBY\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u00020\u001c*\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020$¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020$¢\u0006\u0004\b(\u0010&J\u0015\u0010+\u001a\u00020$2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\u0015\u0010/\u001a\u00020$2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020$2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001d\u0010K\u001a\b\u0012\u0004\u0012\u00020G0F8\u0006¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b5\u0010JR\u001c\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0A8\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010DR\u001f\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0F8\u0006¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bP\u0010J¨\u0006T"}, d2 = {"LZp/a;", "Landroidx/lifecycle/f0;", "LTp/b;", "discoverRepository", "Lbq/b;", "recommendationsOnSaleUseCase", "LVp/a;", "discoverAnalytics", "Lpe/a;", "alertMessageAnalytics", "LIl/a;", "appConfigApi", "LCx/b;", "publisherTokenManager", "Lug/k;", "labsFeatures", "Lqe/a;", "alertMessageIntegration", "Lis/a;", "inboxIntegration", "LQr/b;", "getKreativEntryPointModelUseCase", "<init>", "(LTp/b;Lbq/b;LVp/a;Lpe/a;LIl/a;LCx/b;Lug/k;Lqe/a;Lis/a;LQr/b;)V", "Lcom/ingka/ikea/core/model/product/ProductCarousel;", "", "", "itemNosInShoppingList", "LZp/a$b$c$a;", "K", "(Lcom/ingka/ikea/core/model/product/ProductCarousel;Ljava/util/Set;)LZp/a$b$c$a;", "Lbq/a;", "recommendationsState", "LZp/a$b$c$b;", "D", "(Lbq/a;)LZp/a$b$c$b;", "LXH/N;", "E", "()V", "I", "J", "Lcom/ingka/ikea/discover/impl/ui/i;", "screenUiEvent", "G", "(Lcom/ingka/ikea/discover/impl/ui/i;)V", "LOp/c1;", "event", "F", "(LOp/c1;)V", "LsB/a;", "action", "H", "(LsB/a;)V", "m", "LTp/b;", "n", "LVp/a;", "o", "Lpe/a;", "p", "LIl/a;", "q", "LCx/b;", "r", "Lug/k;", "LTJ/B;", "LZp/a$a;", "s", "LTJ/B;", "discoverState", "LTJ/P;", "LZp/a$b;", "t", "LTJ/P;", "()LTJ/P;", "uiState", "LZp/e;", "u", "_uiEvent", "v", "y", "uiEvent", "a", "b", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Tp.b f90093m;

    /* renamed from: n  reason: collision with root package name */
    private final Vp.a f90094n;

    /* renamed from: o  reason: collision with root package name */
    private final C10137a f90095o;

    /* renamed from: p  reason: collision with root package name */
    private final Il.a f90096p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final Cx.b f90097q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final k f90098r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<C1932a> f90099s;

    /* renamed from: t  reason: collision with root package name */
    private final C16519P<b> f90100t;

    /* renamed from: u  reason: collision with root package name */
    private final C16505B<e> f90101u;

    /* renamed from: v  reason: collision with root package name */
    private final C16519P<e> f90102v;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZp/a$a;", "", "b", "c", "a", "LZp/a$a$a;", "LZp/a$a$b;", "LZp/a$a$c;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zp.a$a  reason: collision with other inner class name */
    public interface C1932a {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZp/a$a$a;", "LZp/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zp.a$a$a  reason: collision with other inner class name */
        public static final class C1933a implements C1932a {

            /* renamed from: a  reason: collision with root package name */
            public static final C1933a f90103a = new C1933a();

            private C1933a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1933a);
            }

            public int hashCode() {
                return 321886703;
            }

            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZp/a$a$b;", "LZp/a$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zp.a$a$b */
        public static final class b implements C1932a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f90104a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 1911114595;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LZp/a$a$c;", "LZp/a$a;", "Laq/b;", "discoveries", "<init>", "(Laq/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Laq/b;", "()Laq/b;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zp.a$a$c */
        public static final class c implements C1932a {

            /* renamed from: a  reason: collision with root package name */
            private final C11080b f90105a;

            public c(C11080b bVar) {
                C17542s.j(bVar, "discoveries");
                this.f90105a = bVar;
            }

            public final C11080b a() {
                return this.f90105a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f90105a, ((c) obj).f90105a);
            }

            public int hashCode() {
                return this.f90105a.hashCode();
            }

            public String toString() {
                C11080b bVar = this.f90105a;
                return "OnSuccess(discoveries=" + bVar + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0003\n\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"LZp/a$b;", "", "LEs/a;", "b", "()LEs/a;", "inboxState", "Lqe/b;", "a", "()Lqe/b;", "alertMessageState", "c", "LZp/a$b$a;", "LZp/a$b$b;", "LZp/a$b$c;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LZp/a$b$a;", "LZp/a$b;", "LEs/a;", "inboxState", "Lqe/b;", "alertMessageState", "<init>", "(LEs/a;Lqe/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEs/a;", "b", "()LEs/a;", "Lqe/b;", "()Lqe/b;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zp.a$b$a  reason: collision with other inner class name */
        public static final class C1934a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final Es.a f90106a;

            /* renamed from: b  reason: collision with root package name */
            private final C10189b f90107b;

            public C1934a(Es.a aVar, C10189b bVar) {
                C17542s.j(aVar, "inboxState");
                C17542s.j(bVar, "alertMessageState");
                this.f90106a = aVar;
                this.f90107b = bVar;
            }

            public C10189b a() {
                return this.f90107b;
            }

            public Es.a b() {
                return this.f90106a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1934a)) {
                    return false;
                }
                C1934a aVar = (C1934a) obj;
                return C17542s.e(this.f90106a, aVar.f90106a) && C17542s.e(this.f90107b, aVar.f90107b);
            }

            public int hashCode() {
                return (this.f90106a.hashCode() * 31) + this.f90107b.hashCode();
            }

            public String toString() {
                Es.a aVar = this.f90106a;
                C10189b bVar = this.f90107b;
                return "Error(inboxState=" + aVar + ", alertMessageState=" + bVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"LZp/a$b$b;", "LZp/a$b;", "LEs/a;", "inboxState", "Lqe/b;", "alertMessageState", "LZp/a$b$c$b;", "recommendationsUiState", "<init>", "(LEs/a;Lqe/b;LZp/a$b$c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LEs/a;", "b", "()LEs/a;", "Lqe/b;", "()Lqe/b;", "c", "LZp/a$b$c$b;", "()LZp/a$b$c$b;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zp.a$b$b  reason: collision with other inner class name */
        public static final class C1935b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final Es.a f90108a;

            /* renamed from: b  reason: collision with root package name */
            private final C10189b f90109b;

            /* renamed from: c  reason: collision with root package name */
            private final c.C1937b f90110c;

            public C1935b(Es.a aVar, C10189b bVar, c.C1937b bVar2) {
                C17542s.j(aVar, "inboxState");
                C17542s.j(bVar, "alertMessageState");
                this.f90108a = aVar;
                this.f90109b = bVar;
                this.f90110c = bVar2;
            }

            public C10189b a() {
                return this.f90109b;
            }

            public Es.a b() {
                return this.f90108a;
            }

            public final c.C1937b c() {
                return this.f90110c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1935b)) {
                    return false;
                }
                C1935b bVar = (C1935b) obj;
                return C17542s.e(this.f90108a, bVar.f90108a) && C17542s.e(this.f90109b, bVar.f90109b) && C17542s.e(this.f90110c, bVar.f90110c);
            }

            public int hashCode() {
                int hashCode = ((this.f90108a.hashCode() * 31) + this.f90109b.hashCode()) * 31;
                c.C1937b bVar = this.f90110c;
                return hashCode + (bVar == null ? 0 : bVar.hashCode());
            }

            public String toString() {
                Es.a aVar = this.f90108a;
                C10189b bVar = this.f90109b;
                c.C1937b bVar2 = this.f90110c;
                return "Loading(inboxState=" + aVar + ", alertMessageState=" + bVar + ", recommendationsUiState=" + bVar2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001:\u0002\u001f\u001bBI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u001f\u0010\"R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001b\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b#\u0010*¨\u0006+"}, d2 = {"LZp/a$b$c;", "LZp/a$b;", "LKJ/c;", "Laq/a;", "data", "", "publisherDiagnostics", "LEs/a;", "inboxState", "Lqe/b;", "alertMessageState", "LZp/a$b$c$b;", "recommendationsUiState", "LQr/b$c;", "kreativModel", "<init>", "(LKJ/c;LKJ/c;LEs/a;Lqe/b;LZp/a$b$c$b;LQr/b$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "c", "()LKJ/c;", "b", "e", "LEs/a;", "()LEs/a;", "d", "Lqe/b;", "()Lqe/b;", "LZp/a$b$c$b;", "f", "()LZp/a$b$c$b;", "LQr/b$c;", "()LQr/b$c;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: a  reason: collision with root package name */
            private final C15987c<C11079a> f90111a;

            /* renamed from: b  reason: collision with root package name */
            private final C15987c<String> f90112b;

            /* renamed from: c  reason: collision with root package name */
            private final Es.a f90113c;

            /* renamed from: d  reason: collision with root package name */
            private final C10189b f90114d;

            /* renamed from: e  reason: collision with root package name */
            private final C1937b f90115e;

            /* renamed from: f  reason: collision with root package name */
            private final b.c f90116f;

            @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"LZp/a$b$c$a;", "", "", "id", "title", "LKJ/c;", "LOp/d1;", "products", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LKJ/c;", "()LKJ/c;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Zp.a$b$c$a  reason: collision with other inner class name */
            public static final class C1936a {

                /* renamed from: a  reason: collision with root package name */
                private final String f90117a;

                /* renamed from: b  reason: collision with root package name */
                private final String f90118b;

                /* renamed from: c  reason: collision with root package name */
                private final C15987c<d1> f90119c;

                public C1936a(String str, String str2, C15987c<d1> cVar) {
                    C17542s.j(str, "id");
                    C17542s.j(str2, "title");
                    C17542s.j(cVar, "products");
                    this.f90117a = str;
                    this.f90118b = str2;
                    this.f90119c = cVar;
                }

                public final String a() {
                    return this.f90117a;
                }

                public final C15987c<d1> b() {
                    return this.f90119c;
                }

                public final String c() {
                    return this.f90118b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1936a)) {
                        return false;
                    }
                    C1936a aVar = (C1936a) obj;
                    return C17542s.e(this.f90117a, aVar.f90117a) && C17542s.e(this.f90118b, aVar.f90118b) && C17542s.e(this.f90119c, aVar.f90119c);
                }

                public int hashCode() {
                    return (((this.f90117a.hashCode() * 31) + this.f90118b.hashCode()) * 31) + this.f90119c.hashCode();
                }

                public String toString() {
                    String str = this.f90117a;
                    String str2 = this.f90118b;
                    C15987c<d1> cVar = this.f90119c;
                    return "ProductCarouselUiModel(id=" + str + ", title=" + str2 + ", products=" + cVar + ")";
                }
            }

            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LZp/a$b$c$b;", "", "a", "b", "LZp/a$b$c$b$a;", "LZp/a$b$c$b$b;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Zp.a$b$c$b  reason: collision with other inner class name */
            public interface C1937b {

                @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZp/a$b$c$b$a;", "LZp/a$b$c$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Zp.a$b$c$b$a  reason: collision with other inner class name */
                public static final class C1938a implements C1937b {

                    /* renamed from: a  reason: collision with root package name */
                    public static final C1938a f90120a = new C1938a();

                    private C1938a() {
                    }

                    public boolean equals(Object obj) {
                        return this == obj || (obj instanceof C1938a);
                    }

                    public int hashCode() {
                        return -753754311;
                    }

                    public String toString() {
                        return "Loading";
                    }
                }

                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LZp/a$b$c$b$b;", "LZp/a$b$c$b;", "LZp/a$b$c$a;", "data", "<init>", "(LZp/a$b$c$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LZp/a$b$c$a;", "()LZp/a$b$c$a;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                /* renamed from: Zp.a$b$c$b$b  reason: collision with other inner class name */
                public static final class C1939b implements C1937b {

                    /* renamed from: a  reason: collision with root package name */
                    private final C1936a f90121a;

                    public C1939b(C1936a aVar) {
                        C17542s.j(aVar, "data");
                        this.f90121a = aVar;
                    }

                    public final C1936a a() {
                        return this.f90121a;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof C1939b) && C17542s.e(this.f90121a, ((C1939b) obj).f90121a);
                    }

                    public int hashCode() {
                        return this.f90121a.hashCode();
                    }

                    public String toString() {
                        C1936a aVar = this.f90121a;
                        return "Success(data=" + aVar + ")";
                    }
                }
            }

            public c(C15987c<? extends C11079a> cVar, C15987c<String> cVar2, Es.a aVar, C10189b bVar, C1937b bVar2, b.c cVar3) {
                C17542s.j(cVar, "data");
                C17542s.j(aVar, "inboxState");
                C17542s.j(bVar, "alertMessageState");
                this.f90111a = cVar;
                this.f90112b = cVar2;
                this.f90113c = aVar;
                this.f90114d = bVar;
                this.f90115e = bVar2;
                this.f90116f = cVar3;
            }

            public C10189b a() {
                return this.f90114d;
            }

            public Es.a b() {
                return this.f90113c;
            }

            public final C15987c<C11079a> c() {
                return this.f90111a;
            }

            public final b.c d() {
                return this.f90116f;
            }

            public final C15987c<String> e() {
                return this.f90112b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f90111a, cVar.f90111a) && C17542s.e(this.f90112b, cVar.f90112b) && C17542s.e(this.f90113c, cVar.f90113c) && C17542s.e(this.f90114d, cVar.f90114d) && C17542s.e(this.f90115e, cVar.f90115e) && C17542s.e(this.f90116f, cVar.f90116f);
            }

            public final C1937b f() {
                return this.f90115e;
            }

            public int hashCode() {
                int hashCode = this.f90111a.hashCode() * 31;
                C15987c<String> cVar = this.f90112b;
                int i10 = 0;
                int hashCode2 = (((((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f90113c.hashCode()) * 31) + this.f90114d.hashCode()) * 31;
                C1937b bVar = this.f90115e;
                int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
                b.c cVar2 = this.f90116f;
                if (cVar2 != null) {
                    i10 = cVar2.hashCode();
                }
                return hashCode3 + i10;
            }

            public String toString() {
                C15987c<C11079a> cVar = this.f90111a;
                C15987c<String> cVar2 = this.f90112b;
                Es.a aVar = this.f90113c;
                C10189b bVar = this.f90114d;
                C1937b bVar2 = this.f90115e;
                b.c cVar3 = this.f90116f;
                return "OnSuccess(data=" + cVar + ", publisherDiagnostics=" + cVar2 + ", inboxState=" + aVar + ", alertMessageState=" + bVar + ", recommendationsUiState=" + bVar2 + ", kreativModel=" + cVar3 + ")";
            }
        }

        C10189b a();

        Es.a b();
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Zp/a$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f90122a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, a aVar2) {
            super(aVar);
            this.f90122a = aVar2;
        }

        public void handleException(C17168i iVar, Throwable th2) {
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
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Unable to fetch discovery";
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            this.f90122a.f90099s.setValue(C1932a.C1933a.f90103a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.discover.impl.viewmodel.DiscoverViewModel$loadData$2", f = "DiscoverViewModel.kt", l = {138}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90123c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f90124d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zp.a$d$a  reason: collision with other inner class name */
        static final class C1940a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f90125a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.discover.impl.viewmodel.DiscoverViewModel$loadData$2$1", f = "DiscoverViewModel.kt", l = {140}, m = "emit")
            /* renamed from: Zp.a$d$a$a  reason: collision with other inner class name */
            static final class C1941a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                Object f90126c;

                /* renamed from: d  reason: collision with root package name */
                Object f90127d;

                /* renamed from: e  reason: collision with root package name */
                Object f90128e;

                /* renamed from: f  reason: collision with root package name */
                /* synthetic */ Object f90129f;

                /* renamed from: g  reason: collision with root package name */
                final /* synthetic */ C1940a<T> f90130g;

                /* renamed from: h  reason: collision with root package name */
                int f90131h;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C1941a(C1940a<? super T> aVar, C17164e<? super C1941a> eVar) {
                    super(eVar);
                    this.f90130g = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f90129f = obj;
                    this.f90131h |= Integer.MIN_VALUE;
                    return this.f90130g.emit((String) null, this);
                }
            }

            C1940a(a aVar) {
                this.f90125a = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* renamed from: c */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.String r6, dI.C17164e<? super XH.C16807N> r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Zp.a.d.C1940a.C1941a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    Zp.a$d$a$a r0 = (Zp.a.d.C1940a.C1941a) r0
                    int r1 = r0.f90131h
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f90131h = r1
                    goto L_0x0018
                L_0x0013:
                    Zp.a$d$a$a r0 = new Zp.a$d$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r1 = r0.f90129f
                    java.lang.Object r2 = eI.C17187b.f()
                    int r3 = r0.f90131h
                    r4 = 1
                    if (r3 == 0) goto L_0x003d
                    if (r3 != r4) goto L_0x0035
                    java.lang.Object r6 = r0.f90128e
                    dI.e r6 = (dI.C17164e) r6
                    java.lang.Object r6 = r0.f90127d
                    java.lang.String r6 = (java.lang.String) r6
                    java.lang.Object r6 = r0.f90126c
                    Zp.a$d$a r6 = (Zp.a.d.C1940a) r6
                    XH.y.b(r1)
                    goto L_0x0062
                L_0x0035:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x003d:
                    XH.y.b(r1)
                    Zp.a r1 = r5.f90125a
                    TJ.B r1 = r1.f90099s
                    Zp.a$a$b r3 = Zp.a.C1932a.b.f90104a
                    r1.setValue(r3)
                    Zp.a r1 = r5.f90125a
                    Tp.b r1 = r1.f90093m
                    r0.f90126c = r5
                    r0.f90127d = r6
                    r0.f90128e = r7
                    r0.f90131h = r4
                    r6 = 0
                    java.lang.Object r1 = Tp.b.a.a(r1, r6, r0, r4, r6)
                    if (r1 != r2) goto L_0x0061
                    return r2
                L_0x0061:
                    r6 = r5
                L_0x0062:
                    aq.b r1 = (aq.C11080b) r1
                    Zp.a r6 = r6.f90125a
                    TJ.B r6 = r6.f90099s
                    Zp.a$a$c r7 = new Zp.a$a$c
                    r7.<init>(r1)
                    r6.setValue(r7)
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Zp.a.d.C1940a.emit(java.lang.String, dI.e):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f90124d = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f90124d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f90123c;
            if (i10 == 0) {
                y.b(obj);
                C16519P<String> b10 = this.f90124d.f90097q.b();
                C1940a aVar = new C1940a(this.f90124d);
                this.f90123c = 1;
                if (b10.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"LZp/a$a;", "discoverState", "Lbq/a;", "recommendationsState", "Lqe/b;", "alertMessageState", "LEs/a;", "inboxState", "LQr/b$c;", "kreativModel", "LZp/a$b;", "<anonymous>", "(LZp/a$a;Lbq/a;Lqe/b;LEs/a;LQr/b$c;)LZp/a$b;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.discover.impl.viewmodel.DiscoverViewModel$uiState$1", f = "DiscoverViewModel.kt", l = {}, m = "invokeSuspend")
    static final class e extends l implements t<C1932a, C11118a, C10189b, Es.a, b.c, C17164e<? super b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90132c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90133d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f90134e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f90135f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f90136g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f90137h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ a f90138i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(a aVar, C17164e<? super e> eVar) {
            super(6, eVar);
            this.f90138i = aVar;
        }

        /* renamed from: i */
        public final Object o(C1932a aVar, C11118a aVar2, C10189b bVar, Es.a aVar3, b.c cVar, C17164e<? super b> eVar) {
            e eVar2 = new e(this.f90138i, eVar);
            eVar2.f90133d = aVar;
            eVar2.f90134e = aVar2;
            eVar2.f90135f = bVar;
            eVar2.f90136g = aVar3;
            eVar2.f90137h = cVar;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90132c == 0) {
                y.b(obj);
                C1932a aVar = (C1932a) this.f90133d;
                C10189b bVar = (C10189b) this.f90135f;
                Es.a aVar2 = (Es.a) this.f90136g;
                b.c cVar = (b.c) this.f90137h;
                b.c.C1937b C10 = this.f90138i.D((C11118a) this.f90134e);
                if (C17542s.e(aVar, C1932a.C1933a.f90103a)) {
                    return new b.C1934a(aVar2, bVar);
                }
                if (C17542s.e(aVar, C1932a.b.f90104a)) {
                    return new b.C1935b(aVar2, bVar, C10);
                }
                if (aVar instanceof C1932a.c) {
                    C1932a.c cVar2 = (C1932a.c) aVar;
                    C15987c<C11079a> a10 = cVar2.a().a();
                    a aVar3 = this.f90138i;
                    ArrayList arrayList = new ArrayList();
                    for (T next : a10) {
                        C11079a aVar4 = (C11079a) next;
                        boolean z10 = true;
                        if (!(aVar4 instanceof C11079a.C1960a) && !(aVar4 instanceof C11079a.b) && !(aVar4 instanceof C11079a.c) && !C17542s.e(aVar4, C11079a.f.f90400a) && !(aVar4 instanceof C11079a.g) && !(aVar4 instanceof C11079a.h) && !(aVar4 instanceof C11079a.i)) {
                            if (C17542s.e(aVar4, C11079a.d.f90398a)) {
                                if (cVar == null) {
                                    z10 = false;
                                }
                            } else if (C17542s.e(aVar4, C11079a.e.f90399a)) {
                                z10 = aVar3.f90098r.l();
                            } else {
                                throw new XH.t();
                            }
                        }
                        if (z10) {
                            arrayList.add(next);
                        }
                    }
                    return new b.c(C15985a.h(arrayList), cVar2.a().b(), aVar2, bVar, C10, cVar);
                }
                throw new XH.t();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public a(Tp.b bVar, C11119b bVar2, Vp.a aVar, C10137a aVar2, Il.a aVar3, Cx.b bVar3, k kVar, C10188a aVar4, C11414a aVar5, Qr.b bVar4) {
        C17542s.j(bVar, "discoverRepository");
        C17542s.j(bVar2, "recommendationsOnSaleUseCase");
        C17542s.j(aVar, "discoverAnalytics");
        C17542s.j(aVar2, "alertMessageAnalytics");
        C17542s.j(aVar3, "appConfigApi");
        C17542s.j(bVar3, "publisherTokenManager");
        C17542s.j(kVar, "labsFeatures");
        C17542s.j(aVar4, "alertMessageIntegration");
        C17542s.j(aVar5, "inboxIntegration");
        C17542s.j(bVar4, "getKreativEntryPointModelUseCase");
        this.f90093m = bVar;
        this.f90094n = aVar;
        this.f90095o = aVar2;
        this.f90096p = aVar3;
        this.f90097q = bVar3;
        this.f90098r = kVar;
        C16505B<C1932a> a10 = C16521S.a(C1932a.b.f90104a);
        this.f90099s = a10;
        this.f90100t = C16534i.c0(C16534i.k(a10, bVar2.a(), aVar4.a(), aVar5.getState(), bVar4.a(), new e(this, (C17164e<? super e>) null)), g0.a(this), C16515L.f138570a.d(), new b.C1935b(a.b.f80780a, C10189b.c.f76050a, b.c.C1937b.C1938a.f90120a));
        C16505B<e> a11 = C16521S.a(null);
        this.f90101u = a11;
        this.f90102v = a11;
        E();
    }

    /* access modifiers changed from: private */
    public final b.c.C1937b D(C11118a aVar) {
        if (C17542s.e(aVar, C11118a.c.f90610a)) {
            return b.c.C1937b.C1938a.f90120a;
        }
        if (aVar instanceof C11118a.d) {
            C11118a.d dVar = (C11118a.d) aVar;
            return new b.c.C1937b.C1939b(K(dVar.d(), dVar.c()));
        } else if (C17542s.e(aVar, C11118a.C1975a.f90608a) || C17542s.e(aVar, C11118a.b.f90609a)) {
            return null;
        } else {
            throw new XH.t();
        }
    }

    private final b.c.C1936a K(ProductCarousel productCarousel, Set<String> set) {
        String b10 = productCarousel.b();
        String e10 = productCarousel.e();
        Iterable<ProductItem> c10 = productCarousel.c();
        ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
        for (ProductItem o10 : c10) {
            arrayList.add(B0.o(o10, C16877v.n(), set, this.f90096p.s(), this.f90096p.w(), false, true, false, false, false, 448, (Object) null));
        }
        return new b.c.C1936a(b10, e10, C15985a.h(arrayList));
    }

    public final void E() {
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this), (T) null, new d(this, (C17164e<? super d>) null), 2, (Object) null);
    }

    public final void F(c1 c1Var) {
        C17542s.j(c1Var, "event");
        if (c1Var instanceof c1.e) {
            this.f90094n.i(((c1.e) c1Var).a());
        }
    }

    public final void G(i iVar) {
        C17542s.j(iVar, "screenUiEvent");
        if (iVar instanceof i.k) {
            i.k kVar = (i.k) iVar;
            this.f90094n.k(kVar.a(), kVar.b());
        } else if (iVar instanceof i.c) {
            this.f90094n.c(((i.c) iVar).a().getId());
        } else if (iVar instanceof i.f) {
            this.f90094n.g(((i.f) iVar).a());
        } else if (C17542s.e(iVar, i.b.f95639a)) {
            this.f90094n.h();
        } else if (iVar instanceof i.g) {
            this.f90094n.l();
        } else if (C17542s.e(iVar, i.a.f95638a)) {
            this.f90095o.b();
        } else if (C17542s.e(iVar, i.h.f95647a)) {
            this.f90094n.f();
        } else if (iVar instanceof i.j) {
            i.j jVar = (i.j) iVar;
            this.f90094n.e(jVar.b(), jVar.d(), jVar.e());
        } else if (iVar instanceof i.l) {
            i.l lVar = (i.l) iVar;
            this.f90094n.j(lVar.a(), lVar.c());
        } else if (iVar instanceof i.d) {
            i.d dVar = (i.d) iVar;
            this.f90094n.d(dVar.a(), dVar.b());
        } else if (!C17542s.e(iVar, i.e.f95643a) && !(iVar instanceof i.C2126i) && !(iVar instanceof i.n) && !C17542s.e(iVar, i.m.f95659a)) {
            throw new XH.t();
        }
    }

    public final void H(C15035a aVar) {
        e value;
        C17542s.j(aVar, "action");
        C16505B<e> b10 = this.f90101u;
        do {
            value = b10.getValue();
            e eVar = value;
        } while (!b10.e(value, new e.b(aVar)));
    }

    public final void I() {
        this.f90101u.setValue(null);
    }

    public final void J() {
        this.f90101u.setValue(e.a.f90141a);
    }

    public final C16519P<b> m() {
        return this.f90100t;
    }

    public final C16519P<e> y() {
        return this.f90102v;
    }
}
