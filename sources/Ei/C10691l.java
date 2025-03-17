package Ei;

import HJ.C15854t;
import Kf.C9133b;
import Op.a1;
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
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.product.ProductItem;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.U;
import kp.C11522d;
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import tf.C10253a;
import xB.C15201a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002HIB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020#0'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010.R \u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010028\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R \u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002060\u0010028\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00104R\"\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020:\u0018\u00010\u0010098\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020?0>8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b\u001a\u0010BR\u0014\u0010G\u001a\u00020D8BX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006J"}, d2 = {"LEi/l;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LIl/a;", "appConfigApi", "Ltf/a;", "killSwitchRepository", "LKf/b;", "cartApi", "LAx/c;", "productRemoteDataSource", "LGx/a;", "purchaseHistoryRepository", "<init>", "(Landroidx/lifecycle/U;LIl/a;Ltf/a;LKf/b;LAx/c;LGx/a;)V", "", "", "productNumbers", "LXH/N;", "J", "(Ljava/util/List;)V", "productNumber", "productName", "I", "(Ljava/lang/String;Ljava/lang/String;)V", "m", "LIl/a;", "n", "Ltf/a;", "o", "LKf/b;", "p", "LAx/c;", "Lip/b;", "LEi/l$b;", "q", "Lip/b;", "_sideEffect", "Landroidx/lifecycle/F;", "r", "Landroidx/lifecycle/F;", "K", "()Landroidx/lifecycle/F;", "sideEffect", "s", "Ljava/lang/String;", "orderId", "t", "deliveryMethodId", "LTJ/B;", "u", "LTJ/B;", "itemsAddingToCart", "Lcom/ingka/ikea/core/model/product/ProductItem;", "v", "additionalProductDetails", "LTJ/g;", "LHx/b;", "w", "LTJ/g;", "productData", "LTJ/P;", "LEi/l$a;", "x", "LTJ/P;", "()LTJ/P;", "uiState", "", "L", "()Z", "isAddToCartSupported", "a", "b", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Ei.l  reason: case insensitive filesystem */
public final class C10691l extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Il.a f80503m;

    /* renamed from: n  reason: collision with root package name */
    private final C10253a f80504n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C9133b f80505o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final Ax.c f80506p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final C11410b<b> f80507q;

    /* renamed from: r  reason: collision with root package name */
    private final F<b> f80508r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final String f80509s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final String f80510t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<List<String>> f80511u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<List<ProductItem>> f80512v;

    /* renamed from: w  reason: collision with root package name */
    private final C16532g<List<Hx.b>> f80513w;

    /* renamed from: x  reason: collision with root package name */
    private final C16519P<a> f80514x;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"LEi/l$a;", "", "", "orderNumber", "", "LEi/l$a$a;", "productsDetails", "", "orderNotFound", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Z", "()Z", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.l$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f80515a;

        /* renamed from: b  reason: collision with root package name */
        private final List<C1528a> f80516b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f80517c;

        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\u00020\u001c8\u0016X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"LEi/l$a$a;", "LxB/a;", "", "id", "itemNumber", "LOp/a1;", "uiState", "<init>", "(Ljava/lang/String;Ljava/lang/String;LOp/a1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "b", "g", "c", "LOp/a1;", "h", "()LOp/a1;", "", "d", "J", "f", "()J", "stableId", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.l$a$a  reason: collision with other inner class name */
        public static final class C1528a implements C15201a {

            /* renamed from: a  reason: collision with root package name */
            private final String f80518a;

            /* renamed from: b  reason: collision with root package name */
            private final String f80519b;

            /* renamed from: c  reason: collision with root package name */
            private final a1 f80520c;

            /* renamed from: d  reason: collision with root package name */
            private final long f80521d;

            public C1528a(String str, String str2, a1 a1Var) {
                C17542s.j(str, "id");
                C17542s.j(str2, "itemNumber");
                C17542s.j(a1Var, "uiState");
                this.f80518a = str;
                this.f80519b = str2;
                this.f80520c = a1Var;
                U u10 = new U(3);
                u10.a(P.b(C1528a.class));
                u10.a(str);
                u10.b(new Object[]{str2});
                this.f80521d = (long) Objects.hash(u10.d(new Object[u10.c()]));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1528a)) {
                    return false;
                }
                C1528a aVar = (C1528a) obj;
                return C17542s.e(this.f80518a, aVar.f80518a) && C17542s.e(this.f80519b, aVar.f80519b) && C17542s.e(this.f80520c, aVar.f80520c);
            }

            public long f() {
                return this.f80521d;
            }

            public final String g() {
                return this.f80519b;
            }

            public final a1 h() {
                return this.f80520c;
            }

            public int hashCode() {
                return (((this.f80518a.hashCode() * 31) + this.f80519b.hashCode()) * 31) + this.f80520c.hashCode();
            }

            public String toString() {
                String str = this.f80518a;
                String str2 = this.f80519b;
                a1 a1Var = this.f80520c;
                return "ProductDetails(id=" + str + ", itemNumber=" + str2 + ", uiState=" + a1Var + ")";
            }
        }

        public a(String str, List<C1528a> list, boolean z10) {
            C17542s.j(str, "orderNumber");
            C17542s.j(list, "productsDetails");
            this.f80515a = str;
            this.f80516b = list;
            this.f80517c = z10;
        }

        public final boolean a() {
            return this.f80517c;
        }

        public final String b() {
            return this.f80515a;
        }

        public final List<C1528a> c() {
            return this.f80516b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f80515a, aVar.f80515a) && C17542s.e(this.f80516b, aVar.f80516b) && this.f80517c == aVar.f80517c;
        }

        public int hashCode() {
            return (((this.f80515a.hashCode() * 31) + this.f80516b.hashCode()) * 31) + Boolean.hashCode(this.f80517c);
        }

        public String toString() {
            String str = this.f80515a;
            List<C1528a> list = this.f80516b;
            boolean z10 = this.f80517c;
            return "ProductListUiState(orderNumber=" + str + ", productsDetails=" + list + ", orderNotFound=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LEi/l$b;", "", "<init>", "()V", "a", "b", "LEi/l$b$a;", "LEi/l$b$b;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.l$b */
    public static abstract class b {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\t¨\u0006\u0017"}, d2 = {"LEi/l$b$a;", "LEi/l$b;", "", "throwable", "", "productName", "<init>", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Ljava/lang/String;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.l$b$a */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f80522a;

            /* renamed from: b  reason: collision with root package name */
            private final String f80523b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Throwable th2, String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(th2, "throwable");
                C17542s.j(str, "productName");
                this.f80522a = th2;
                this.f80523b = str;
            }

            public final String a() {
                return this.f80523b;
            }

            public final Throwable b() {
                return this.f80522a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f80522a, aVar.f80522a) && C17542s.e(this.f80523b, aVar.f80523b);
            }

            public int hashCode() {
                return (this.f80522a.hashCode() * 31) + this.f80523b.hashCode();
            }

            public String toString() {
                Throwable th2 = this.f80522a;
                String str = this.f80523b;
                return "AddToCartError(throwable=" + th2 + ", productName=" + str + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"LEi/l$b$b;", "LEi/l$b;", "", "productName", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.l$b$b  reason: collision with other inner class name */
        public static final class C1529b extends b {

            /* renamed from: a  reason: collision with root package name */
            private final String f80524a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1529b(String str) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "productName");
                this.f80524a = str;
            }

            public final String a() {
                return this.f80524a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1529b) && C17542s.e(this.f80524a, ((C1529b) obj).f80524a);
            }

            public int hashCode() {
                return this.f80524a.hashCode();
            }

            public String toString() {
                String str = this.f80524a;
                return "AddedToCart(productName=" + str + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/l$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.l$c */
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10691l f80525a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f80526b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, C10691l lVar, String str) {
            super(aVar);
            this.f80525a = lVar;
            this.f80526b = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10691l lVar = this.f80525a;
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
                    String a10 = C11818a.a("Unable to add to cart", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = lVar.getClass().getName();
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
            this.f80525a.f80507q.setValue(new b.a(th2, this.f80526b));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ProductListBottomSheetViewModel$addToCart$3", f = "ProductListBottomSheetViewModel.kt", l = {174}, m = "invokeSuspend")
    /* renamed from: Ei.l$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80527c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10691l f80528d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f80529e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f80530f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C10691l lVar, String str, String str2, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f80528d = lVar;
            this.f80529e = str;
            this.f80530f = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f80528d, this.f80529e, this.f80530f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object f10 = C17187b.f();
            int i10 = this.f80527c;
            if (i10 == 0) {
                y.b(obj);
                C9133b k10 = this.f80528d.f80505o;
                List e10 = C16877v.e(new Kf.y(this.f80529e, 1));
                Interaction$Component interaction$Component = Interaction$Component.PURCHASE_HISTORY_ADD_TO_CART_BUTTON;
                this.f80527c = 1;
                if (C9133b.C1020b.a(k10, e10, interaction$Component, (String) null, this, 4, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    C16505B D10 = this.f80528d.f80511u;
                    String str = this.f80529e;
                    do {
                        value2 = D10.getValue();
                    } while (!D10.e(value2, C16877v.S0((List) value2, str)));
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f80528d.f80507q.setValue(new b.C1529b(this.f80530f));
            C16505B D11 = this.f80528d.f80511u;
            String str2 = this.f80529e;
            do {
                value = D11.getValue();
            } while (!D11.e(value, C16877v.S0((List) value, str2)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ei/l$e", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.l$e */
    public static final class e extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10691l f80531a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(N.a aVar, C10691l lVar) {
            super(aVar);
            this.f80531a = lVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C10691l lVar = this.f80531a;
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
                    String a10 = C11818a.a("Unable to fetch product details", th2);
                    if (a10 != null) {
                        str = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str3 = str;
                if (str2 == null) {
                    String name = lVar.getClass().getName();
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
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ProductListBottomSheetViewModel$fetchProductDetails$2", f = "ProductListBottomSheetViewModel.kt", l = {203}, m = "invokeSuspend")
    /* renamed from: Ei.l$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80532c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C10691l f80533d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ List<String> f80534e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C10691l lVar, List<String> list, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f80533d = lVar;
            this.f80534e = list;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f80533d, this.f80534e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f80532c;
            if (i10 == 0) {
                y.b(obj);
                this.f80533d.f80512v.setValue(C16877v.n());
                Ax.c F10 = this.f80533d.f80506p;
                List<String> list = this.f80534e;
                this.f80532c = 1;
                obj = F10.e(list, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f80533d.f80512v.setValue((List) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "LHx/b;", "articles", "LXH/N;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ProductListBottomSheetViewModel$productData$2", f = "ProductListBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ei.l$g */
    static final class g extends l implements p<List<? extends Hx.b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80535c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f80536d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C10691l f80537e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C10691l lVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f80537e = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            g gVar = new g(this.f80537e, eVar);
            gVar.f80536d = obj;
            return gVar;
        }

        /* renamed from: i */
        public final Object invoke(List<Hx.b> list, C17164e<? super C16807N> eVar) {
            return ((g) create(list, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f80535c == 0) {
                y.b(obj);
                List list = (List) this.f80536d;
                Collection collection = list;
                if (collection != null && !collection.isEmpty()) {
                    C10691l lVar = this.f80537e;
                    Iterable<Hx.b> iterable = list;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (Hx.b b10 : iterable) {
                        arrayList.add(b10.b());
                    }
                    lVar.J(arrayList);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ei.l$h */
    public static final class h implements C16532g<List<? extends Hx.b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f80538a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C10691l f80539b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ei.l$h$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f80540a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C10691l f80541b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ProductListBottomSheetViewModel$special$$inlined$map$1$2", f = "ProductListBottomSheetViewModel.kt", l = {50}, m = "emit")
            /* renamed from: Ei.l$h$a$a  reason: collision with other inner class name */
            public static final class C1530a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f80542c;

                /* renamed from: d  reason: collision with root package name */
                int f80543d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f80544e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1530a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f80544e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f80542c = obj;
                    this.f80543d |= Integer.MIN_VALUE;
                    return this.f80544e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C10691l lVar) {
                this.f80540a = hVar;
                this.f80541b = lVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:123:0x032b  */
            /* JADX WARNING: Removed duplicated region for block: B:12:0x0036  */
            /* JADX WARNING: Removed duplicated region for block: B:68:0x0175  */
            /* JADX WARNING: Removed duplicated region for block: B:69:0x0179  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r30, dI.C17164e r31) {
                /*
                    r29 = this;
                    r0 = r29
                    r1 = r31
                    boolean r2 = r1 instanceof Ei.C10691l.h.a.C1530a
                    if (r2 == 0) goto L_0x0017
                    r2 = r1
                    Ei.l$h$a$a r2 = (Ei.C10691l.h.a.C1530a) r2
                    int r3 = r2.f80543d
                    r4 = -2147483648(0xffffffff80000000, float:-0.0)
                    r5 = r3 & r4
                    if (r5 == 0) goto L_0x0017
                    int r3 = r3 - r4
                    r2.f80543d = r3
                    goto L_0x001c
                L_0x0017:
                    Ei.l$h$a$a r2 = new Ei.l$h$a$a
                    r2.<init>(r0, r1)
                L_0x001c:
                    java.lang.Object r1 = r2.f80542c
                    java.lang.Object r3 = eI.C17187b.f()
                    int r4 = r2.f80543d
                    r5 = 1
                    if (r4 == 0) goto L_0x0036
                    if (r4 != r5) goto L_0x002e
                    XH.y.b(r1)
                    goto L_0x0340
                L_0x002e:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                    r1.<init>(r2)
                    throw r1
                L_0x0036:
                    XH.y.b(r1)
                    TJ.h r1 = r0.f80540a
                    r4 = r30
                    Hx.c r4 = (Hx.c) r4
                    r6 = 0
                    if (r4 == 0) goto L_0x0044
                    r7 = r5
                    goto L_0x0045
                L_0x0044:
                    r7 = r6
                L_0x0045:
                    Ei.l r8 = r0.f80541b
                    qv.e r15 = qv.e.DEBUG
                    qv.d r9 = qv.d.f102012a
                    java.util.List r9 = r9.a()
                    java.lang.Iterable r9 = (java.lang.Iterable) r9
                    java.util.ArrayList r10 = new java.util.ArrayList
                    r10.<init>()
                    java.util.Iterator r9 = r9.iterator()
                L_0x005a:
                    boolean r11 = r9.hasNext()
                    if (r11 == 0) goto L_0x0071
                    java.lang.Object r11 = r9.next()
                    r12 = r11
                    qv.b r12 = (qv.C11819b) r12
                    boolean r12 = r12.b(r15, r6)
                    if (r12 == 0) goto L_0x005a
                    r10.add(r11)
                    goto L_0x005a
                L_0x0071:
                    java.util.Iterator r16 = r10.iterator()
                    r9 = 0
                    r10 = 0
                L_0x0077:
                    boolean r11 = r16.hasNext()
                    java.lang.String r12 = "|"
                    java.lang.String r13 = "b"
                    java.lang.String r17 = "m"
                    java.lang.String r6 = "main"
                    java.lang.String r5 = "Kt"
                    if (r11 == 0) goto L_0x00a7
                    java.lang.Object r11 = r16.next()
                    qv.b r11 = (qv.C11819b) r11
                    if (r9 != 0) goto L_0x00ae
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r14 = "Order exists in cache: "
                    r9.append(r14)
                    r9.append(r7)
                    java.lang.String r9 = r9.toString()
                    r14 = 0
                    java.lang.String r9 = qv.C11818a.a(r9, r14)
                    if (r9 != 0) goto L_0x00aa
                L_0x00a7:
                    r8 = 0
                    goto L_0x011a
                L_0x00aa:
                    java.lang.String r9 = qv.C11820c.a(r9)
                L_0x00ae:
                    r21 = r9
                    if (r10 != 0) goto L_0x0101
                    java.lang.Class r9 = r8.getClass()
                    java.lang.String r9 = r9.getName()
                    kotlin.jvm.internal.C17542s.g(r9)
                    r18 = r8
                    r8 = 2
                    r10 = 36
                    r14 = 0
                    java.lang.String r10 = HJ.C15854t.s1(r9, r10, r14, r8, r14)
                    r19 = r9
                    r9 = 46
                    java.lang.String r8 = HJ.C15854t.o1(r10, r9, r14, r8, r14)
                    int r9 = r8.length()
                    if (r9 != 0) goto L_0x00d8
                    r9 = r19
                    goto L_0x00dc
                L_0x00d8:
                    java.lang.String r9 = HJ.C15854t.P0(r8, r5)
                L_0x00dc:
                    java.lang.Thread r5 = java.lang.Thread.currentThread()
                    java.lang.String r5 = r5.getName()
                    r8 = 1
                    boolean r5 = HJ.C15854t.b0(r5, r6, r8)
                    if (r5 == 0) goto L_0x00ed
                    r13 = r17
                L_0x00ed:
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    r5.append(r13)
                    r5.append(r12)
                    r5.append(r9)
                    java.lang.String r10 = r5.toString()
                L_0x00ff:
                    r5 = r10
                    goto L_0x0105
                L_0x0101:
                    r18 = r8
                    r14 = 0
                    goto L_0x00ff
                L_0x0105:
                    r12 = 0
                    r9 = r11
                    r10 = r15
                    r11 = r5
                    r6 = 0
                    r13 = r6
                    r8 = r14
                    r14 = r21
                    r9.a(r10, r11, r12, r13, r14)
                    r10 = r5
                    r8 = r18
                    r9 = r21
                    r5 = 1
                    r6 = 0
                    goto L_0x0077
                L_0x011a:
                    if (r7 == 0) goto L_0x0331
                    Ei.l r7 = r0.f80541b
                    java.lang.String r7 = r7.f80510t
                    if (r7 == 0) goto L_0x0163
                    int r7 = r7.length()
                    if (r7 != 0) goto L_0x012b
                    goto L_0x0163
                L_0x012b:
                    if (r4 == 0) goto L_0x0161
                    java.util.List r7 = r4.g()
                    if (r7 == 0) goto L_0x0161
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L_0x0139:
                    boolean r9 = r7.hasNext()
                    if (r9 == 0) goto L_0x0157
                    java.lang.Object r14 = r7.next()
                    r9 = r14
                    Hx.c$c r9 = (Hx.c.C2661c) r9
                    java.lang.String r9 = r9.g()
                    Ei.l r10 = r0.f80541b
                    java.lang.String r10 = r10.f80510t
                    boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
                    if (r9 == 0) goto L_0x0139
                    goto L_0x0158
                L_0x0157:
                    r14 = r8
                L_0x0158:
                    Hx.c$c r14 = (Hx.c.C2661c) r14
                    if (r14 == 0) goto L_0x0161
                    java.util.List r14 = r14.a()
                    goto L_0x0169
                L_0x0161:
                    r14 = r8
                    goto L_0x0169
                L_0x0163:
                    if (r4 == 0) goto L_0x0161
                    java.util.List r14 = r4.d()
                L_0x0169:
                    r7 = r14
                    java.util.Collection r7 = (java.util.Collection) r7
                    if (r7 == 0) goto L_0x0179
                    boolean r7 = r7.isEmpty()
                    if (r7 == 0) goto L_0x0175
                    goto L_0x0179
                L_0x0175:
                    r27 = r3
                    goto L_0x0329
                L_0x0179:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r9 = "No items available for order"
                    r7.<init>(r9)
                    Ei.l r9 = r0.f80541b
                    qv.e r10 = qv.e.ERROR
                    qv.d r11 = qv.d.f102012a
                    java.util.List r11 = r11.a()
                    java.lang.Iterable r11 = (java.lang.Iterable) r11
                    java.util.ArrayList r15 = new java.util.ArrayList
                    r15.<init>()
                    java.util.Iterator r11 = r11.iterator()
                L_0x0195:
                    boolean r16 = r11.hasNext()
                    if (r16 == 0) goto L_0x01b6
                    java.lang.Object r8 = r11.next()
                    r16 = r11
                    r11 = r8
                    qv.b r11 = (qv.C11819b) r11
                    r26 = r13
                    r13 = 1
                    boolean r11 = r11.b(r10, r13)
                    if (r11 == 0) goto L_0x01b0
                    r15.add(r8)
                L_0x01b0:
                    r11 = r16
                    r13 = r26
                    r8 = 0
                    goto L_0x0195
                L_0x01b6:
                    r26 = r13
                    java.util.Iterator r8 = r15.iterator()
                    r11 = 0
                    r13 = 0
                L_0x01be:
                    boolean r15 = r8.hasNext()
                    if (r15 == 0) goto L_0x0278
                    java.lang.Object r15 = r8.next()
                    r20 = r15
                    qv.b r20 = (qv.C11819b) r20
                    if (r11 != 0) goto L_0x020d
                    Ei.l r11 = r0.f80541b
                    java.lang.String r11 = r11.f80509s
                    Ei.l r15 = r0.f80541b
                    java.lang.String r15 = r15.f80510t
                    r16 = r8
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r27 = r3
                    java.lang.String r3 = "No items available for, orderId: "
                    r8.append(r3)
                    r8.append(r11)
                    java.lang.String r3 = ", deliveryMethodId: "
                    r8.append(r3)
                    r8.append(r15)
                    java.lang.String r3 = ", found details: "
                    r8.append(r3)
                    r8.append(r4)
                    java.lang.String r3 = r8.toString()
                    java.lang.String r3 = qv.C11818a.a(r3, r7)
                    if (r3 != 0) goto L_0x0207
                    goto L_0x027a
                L_0x0207:
                    java.lang.String r3 = qv.C11820c.a(r3)
                    r11 = r3
                    goto L_0x0211
                L_0x020d:
                    r27 = r3
                    r16 = r8
                L_0x0211:
                    if (r13 != 0) goto L_0x0261
                    java.lang.Class r3 = r9.getClass()
                    java.lang.String r3 = r3.getName()
                    kotlin.jvm.internal.C17542s.g(r3)
                    r28 = r4
                    r8 = 0
                    r13 = 36
                    r15 = 2
                    java.lang.String r4 = HJ.C15854t.s1(r3, r13, r8, r15, r8)
                    r13 = 46
                    java.lang.String r4 = HJ.C15854t.o1(r4, r13, r8, r15, r8)
                    int r8 = r4.length()
                    if (r8 != 0) goto L_0x0235
                    goto L_0x0239
                L_0x0235:
                    java.lang.String r3 = HJ.C15854t.P0(r4, r5)
                L_0x0239:
                    java.lang.Thread r4 = java.lang.Thread.currentThread()
                    java.lang.String r4 = r4.getName()
                    r8 = 1
                    boolean r4 = HJ.C15854t.b0(r4, r6, r8)
                    if (r4 == 0) goto L_0x024b
                    r4 = r17
                    goto L_0x024d
                L_0x024b:
                    r4 = r26
                L_0x024d:
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    r8.append(r4)
                    r8.append(r12)
                    r8.append(r3)
                    java.lang.String r3 = r8.toString()
                    r13 = r3
                    goto L_0x0263
                L_0x0261:
                    r28 = r4
                L_0x0263:
                    r23 = 1
                    r21 = r10
                    r22 = r13
                    r24 = r7
                    r25 = r11
                    r20.a(r21, r22, r23, r24, r25)
                    r8 = r16
                    r3 = r27
                    r4 = r28
                    goto L_0x01be
                L_0x0278:
                    r27 = r3
                L_0x027a:
                    Ei.l r3 = r0.f80541b
                    qv.e r4 = qv.e.ERROR
                    qv.d r8 = qv.d.f102012a
                    java.util.List r8 = r8.a()
                    java.lang.Iterable r8 = (java.lang.Iterable) r8
                    java.util.ArrayList r9 = new java.util.ArrayList
                    r9.<init>()
                    java.util.Iterator r8 = r8.iterator()
                L_0x028f:
                    boolean r10 = r8.hasNext()
                    if (r10 == 0) goto L_0x02a7
                    java.lang.Object r10 = r8.next()
                    r11 = r10
                    qv.b r11 = (qv.C11819b) r11
                    r13 = 0
                    boolean r11 = r11.b(r4, r13)
                    if (r11 == 0) goto L_0x028f
                    r9.add(r10)
                    goto L_0x028f
                L_0x02a7:
                    java.util.Iterator r8 = r9.iterator()
                    r9 = 0
                    r10 = 0
                L_0x02ad:
                    boolean r11 = r8.hasNext()
                    if (r11 == 0) goto L_0x0329
                    java.lang.Object r11 = r8.next()
                    r20 = r11
                    qv.b r20 = (qv.C11819b) r20
                    r11 = 0
                    if (r9 != 0) goto L_0x02c9
                    java.lang.String r9 = qv.C11818a.a(r11, r7)
                    if (r9 != 0) goto L_0x02c5
                    goto L_0x0329
                L_0x02c5:
                    java.lang.String r9 = qv.C11820c.a(r9)
                L_0x02c9:
                    if (r10 != 0) goto L_0x0316
                    java.lang.Class r10 = r3.getClass()
                    java.lang.String r10 = r10.getName()
                    kotlin.jvm.internal.C17542s.g(r10)
                    r13 = 36
                    r15 = 2
                    java.lang.String r0 = HJ.C15854t.s1(r10, r13, r11, r15, r11)
                    r13 = 46
                    java.lang.String r0 = HJ.C15854t.o1(r0, r13, r11, r15, r11)
                    int r16 = r0.length()
                    if (r16 != 0) goto L_0x02ea
                    goto L_0x02ee
                L_0x02ea:
                    java.lang.String r10 = HJ.C15854t.P0(r0, r5)
                L_0x02ee:
                    java.lang.Thread r0 = java.lang.Thread.currentThread()
                    java.lang.String r0 = r0.getName()
                    r11 = 1
                    boolean r0 = HJ.C15854t.b0(r0, r6, r11)
                    if (r0 == 0) goto L_0x0300
                    r0 = r17
                    goto L_0x0302
                L_0x0300:
                    r0 = r26
                L_0x0302:
                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                    r11.<init>()
                    r11.append(r0)
                    r11.append(r12)
                    r11.append(r10)
                    java.lang.String r0 = r11.toString()
                    r10 = r0
                    goto L_0x0319
                L_0x0316:
                    r13 = 46
                    r15 = 2
                L_0x0319:
                    r23 = 0
                    r21 = r4
                    r22 = r10
                    r24 = r7
                    r25 = r9
                    r20.a(r21, r22, r23, r24, r25)
                    r0 = r29
                    goto L_0x02ad
                L_0x0329:
                    if (r14 != 0) goto L_0x032f
                    java.util.List r14 = YH.C16877v.n()
                L_0x032f:
                    r0 = 1
                    goto L_0x0335
                L_0x0331:
                    r27 = r3
                    r0 = 1
                    r14 = 0
                L_0x0335:
                    r2.f80543d = r0
                    java.lang.Object r0 = r1.emit(r14, r2)
                    r1 = r27
                    if (r0 != r1) goto L_0x0340
                    return r1
                L_0x0340:
                    XH.N r0 = XH.C16807N.f139792a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: Ei.C10691l.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar, C10691l lVar) {
            this.f80538a = gVar;
            this.f80539b = lVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f80538a.collect(new a(hVar, this.f80539b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "LHx/b;", "productData", "", "itemsAddingToCart", "Lcom/ingka/ikea/core/model/product/ProductItem;", "additionalProductDetails", "LEi/l$a;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)LEi/l$a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ProductListBottomSheetViewModel$uiState$1", f = "ProductListBottomSheetViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Ei.l$i */
    static final class i extends l implements r<List<? extends Hx.b>, List<? extends String>, List<? extends ProductItem>, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f80545c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f80546d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f80547e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f80548f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C10691l f80549g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(C10691l lVar, C17164e<? super i> eVar) {
            super(4, eVar);
            this.f80549g = lVar;
        }

        /* renamed from: i */
        public final Object l(List<Hx.b> list, List<String> list2, List<ProductItem> list3, C17164e<? super a> eVar) {
            i iVar = new i(this.f80549g, eVar);
            iVar.f80546d = list;
            iVar.f80547e = list2;
            iVar.f80548f = list3;
            return iVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            List list;
            boolean z10;
            Object obj2;
            C17187b.f();
            if (this.f80545c == 0) {
                y.b(obj);
                List list2 = (List) this.f80546d;
                List list3 = (List) this.f80547e;
                List list4 = (List) this.f80548f;
                String E10 = this.f80549g.f80509s;
                if (list2 != null) {
                    Iterable iterable = list2;
                    C10691l lVar = this.f80549g;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    int i10 = 0;
                    for (Object next : iterable) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            C16877v.x();
                        }
                        Hx.b bVar = (Hx.b) next;
                        String valueOf = String.valueOf(i10);
                        C11522d s10 = lVar.f80503m.s();
                        Iterable iterable2 = list3;
                        if (!(iterable2 instanceof Collection) || !((Collection) iterable2).isEmpty()) {
                            Iterator it = iterable2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (C17542s.e((String) it.next(), bVar.b())) {
                                        z10 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                        }
                        z10 = false;
                        Iterator it2 = list4.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it2.next();
                            if (C17542s.e(((ProductItem) obj2).f(), bVar.b())) {
                                break;
                            }
                        }
                        ProductItem productItem = (ProductItem) obj2;
                        arrayList.add(new a.C1528a(valueOf, bVar.b(), C10692m.a(bVar, s10, z10, productItem != null ? kotlin.coroutines.jvm.internal.b.a(productItem.j()) : null, lVar.L(), lVar.f80503m.w())));
                        i10 = i11;
                    }
                    list = arrayList;
                } else {
                    list = null;
                }
                if (list == null) {
                    list = C16877v.n();
                }
                return new a(E10, list, list2 == null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C10691l(androidx.lifecycle.U u10, Il.a aVar, C10253a aVar2, C9133b bVar, Ax.c cVar, Gx.a aVar3) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(bVar, "cartApi");
        C17542s.j(cVar, "productRemoteDataSource");
        C17542s.j(aVar3, "purchaseHistoryRepository");
        this.f80503m = aVar;
        this.f80504n = aVar2;
        this.f80505o = bVar;
        this.f80506p = cVar;
        C11410b<b> bVar2 = new C11410b<>();
        this.f80507q = bVar2;
        this.f80508r = bVar2;
        Object f10 = u10.f("orderId");
        if (f10 != null) {
            String str = (String) f10;
            this.f80509s = str;
            this.f80510t = (String) u10.f("deliveryMethodId");
            C16505B<List<String>> a10 = C16521S.a(C16877v.n());
            this.f80511u = a10;
            C16505B<List<ProductItem>> a11 = C16521S.a(C16877v.n());
            this.f80512v = a11;
            C16532g<List<Hx.b>> R10 = C16534i.R(new h(aVar3.j(str), this), new g(this, (C17164e<? super g>) null));
            this.f80513w = R10;
            this.f80514x = C16534i.c0(C16534i.m(R10, a10, a11, new i(this, (C17164e<? super i>) null)), g0.a(this), ip.f.a(), new a(str, C16877v.n(), false));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final void J(List<String> list) {
        F0 unused = C16314k.d(g0.a(this), new e(N.f137593c0, this), (T) null, new f(this, list, (C17164e<? super f>) null), 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public final boolean L() {
        return this.f80504n.b();
    }

    public final void I(String str, String str2) {
        List<String> value;
        C17542s.j(str, "productNumber");
        C17542s.j(str2, "productName");
        C16505B<List<String>> b10 = this.f80511u;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C16877v.W0(value, str)));
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this, str2), (T) null, new d(this, str, str2, (C17164e<? super d>) null), 2, (Object) null);
    }

    public final F<b> K() {
        return this.f80508r;
    }

    public final C16519P<a> m() {
        return this.f80514x;
    }
}
