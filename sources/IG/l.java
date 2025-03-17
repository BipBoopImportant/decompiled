package ig;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Op.B0;
import Op.d1;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import hg.q;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.t;
import tf.C10253a;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 )2\u00020\u0001:\u000302-B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJA\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aH@¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b!\u0010\"J;\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$*\b\u0012\u0004\u0012\u00020#0\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010*J:\u0010-\u001a\b\u0012\u0004\u0012\u00020 0+2\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100+2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120+H\u0002¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010/R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u00106R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e078\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u00108¨\u0006:"}, d2 = {"Lig/l;", "Lig/k;", "LjB/b;", "shoppingListRepository", "LAx/c;", "productRemoteDataSource", "Ltf/a;", "killSwitchRepository", "LIl/a;", "appConfigApi", "LaA/a;", "sessionManager", "<init>", "(LjB/b;LAx/c;Ltf/a;LIl/a;LaA/a;)V", "Lig/l$c;", "listUpsell", "Lhg/q$g;", "cartUpsell", "", "", "itemNosAddingToCart", "", "allProductNumbersInShoppingLists", "Lig/l$b;", "h", "(Lig/l$c;Lhg/q$g;Ljava/util/List;Ljava/util/Set;)Lig/l$b;", "LXH/N;", "i", "(LdI/e;)Ljava/lang/Object;", "", "isLoggedIn", "upsell", "Lhg/q$c$b;", "f", "(ZLig/l$b;)Lhg/q$c$b;", "Lcom/ingka/ikea/core/model/product/ProductItem;", "LKJ/c;", "LOp/d1;", "e", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)LKJ/c;", "LIC/e;", "g", "(Lig/l$b;Z)LIC/e;", "LTJ/g;", "cartUpsellUiState", "a", "(LTJ/g;LTJ/g;)LTJ/g;", "LjB/b;", "b", "LAx/c;", "c", "Ltf/a;", "d", "LIl/a;", "LaA/a;", "LTJ/B;", "LTJ/B;", "shoppingListUpsell", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l implements k {

    /* renamed from: g  reason: collision with root package name */
    public static final a f74436g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f74437h = 8;

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f74438a;

    /* renamed from: b  reason: collision with root package name */
    private final Ax.c f74439b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f74440c;

    /* renamed from: d  reason: collision with root package name */
    private final Il.a f74441d;

    /* renamed from: e  reason: collision with root package name */
    private final C13909a f74442e;

    /* renamed from: f  reason: collision with root package name */
    private final C16505B<c> f74443f = C16521S.a(c.b.f74449a);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lig/l$a;", "", "<init>", "()V", "", "MAX_NUMBER_OF_UPSELL_ITEMS", "I", "SHOPPING_LIST_QUERY_LIMIT", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lig/l$b;", "", "<init>", "()V", "a", "b", "d", "c", "Lig/l$b$a;", "Lig/l$b$b;", "Lig/l$b$c;", "Lig/l$b$d;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig/l$b$a;", "Lig/l$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f74444a = new a();

            private a() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 577493874;
            }

            public String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig/l$b$b;", "Lig/l$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ig.l$b$b  reason: collision with other inner class name */
        public static final class C1334b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C1334b f74445a = new C1334b();

            private C1334b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1334b);
            }

            public int hashCode() {
                return 1065302062;
            }

            public String toString() {
                return "NoContent";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lig/l$b$c;", "Lig/l$b;", "LKJ/c;", "LOp/d1;", "items", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C15987c<d1> f74446a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(C15987c<d1> cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, "items");
                this.f74446a = cVar;
            }

            public final C15987c<d1> a() {
                return this.f74446a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && C17542s.e(this.f74446a, ((c) obj).f74446a);
            }

            public int hashCode() {
                return this.f74446a.hashCode();
            }

            public String toString() {
                C15987c<d1> cVar = this.f74446a;
                return "Popular(items=" + cVar + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lig/l$b$d;", "Lig/l$b;", "LKJ/c;", "LOp/d1;", "items", "<init>", "(LKJ/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            private final C15987c<d1> f74447a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(C15987c<d1> cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, "items");
                this.f74447a = cVar;
            }

            public final C15987c<d1> a() {
                return this.f74447a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f74447a, ((d) obj).f74447a);
            }

            public int hashCode() {
                return this.f74447a.hashCode();
            }

            public String toString() {
                C15987c<d1> cVar = this.f74447a;
                return "ShoppingList(items=" + cVar + ")";
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lig/l$c;", "", "<init>", "()V", "b", "a", "Lig/l$c$a;", "Lig/l$c$b;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static abstract class c {

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lig/l$c$a;", "Lig/l$c;", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "items", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: a  reason: collision with root package name */
            private final List<ProductItem> f74448a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(List<ProductItem> list) {
                super((DefaultConstructorMarker) null);
                C17542s.j(list, "items");
                this.f74448a = list;
            }

            public final List<ProductItem> a() {
                return this.f74448a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f74448a, ((a) obj).f74448a);
            }

            public int hashCode() {
                return this.f74448a.hashCode();
            }

            public String toString() {
                List<ProductItem> list = this.f74448a;
                return "Content(items=" + list + ")";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lig/l$c$b;", "Lig/l$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b extends c {

            /* renamed from: a  reason: collision with root package name */
            public static final b f74449a = new b();

            private b() {
                super((DefaultConstructorMarker) null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -188222483;
            }

            public String toString() {
                return "Loading";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lig/l$c;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetEmptyCartUiStateUseCaseImpl$invoke$1", f = "GetEmptyCartUiStateUseCase.kt", l = {53}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super c>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74450c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ l f74451d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(l lVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f74451d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f74451d, eVar);
        }

        public final Object invoke(C16533h<? super c> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74450c;
            if (i10 == 0) {
                y.b(obj);
                l lVar = this.f74451d;
                this.f74450c = 1;
                if (lVar.i(this) == f10) {
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

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lig/l$c;", "listUpsell", "Lhg/q$g;", "cartUpsell", "", "isLoggedIn", "", "", "itemsAddingToCart", "", "allProductNumbersInShoppingLists", "Lhg/q$c$b;", "<anonymous>", "(Lig/l$c;Lhg/q$g;ZLjava/util/List;Ljava/util/Set;)Lhg/q$c$b;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetEmptyCartUiStateUseCaseImpl$invoke$2", f = "GetEmptyCartUiStateUseCase.kt", l = {}, m = "invokeSuspend")
    static final class e extends kotlin.coroutines.jvm.internal.l implements t<c, q.g, Boolean, List<? extends String>, Set<? extends String>, C17164e<? super q.c.b>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74452c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f74453d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74454e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ boolean f74455f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f74456g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f74457h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ l f74458i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(l lVar, C17164e<? super e> eVar) {
            super(6, eVar);
            this.f74458i = lVar;
        }

        public final Object i(c cVar, q.g gVar, boolean z10, List<String> list, Set<String> set, C17164e<? super q.c.b> eVar) {
            e eVar2 = new e(this.f74458i, eVar);
            eVar2.f74453d = cVar;
            eVar2.f74454e = gVar;
            eVar2.f74455f = z10;
            eVar2.f74456g = list;
            eVar2.f74457h = set;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f74452c == 0) {
                y.b(obj);
                return this.f74458i.f(this.f74455f, this.f74458i.h((c) this.f74453d, (q.g) this.f74454e, (List) this.f74456g, (Set) this.f74457h));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return i((c) obj, (q.g) obj2, ((Boolean) obj3).booleanValue(), (List) obj4, (Set) obj5, (C17164e) obj6);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.viewmodel.usecase.GetEmptyCartUiStateUseCaseImpl", f = "GetEmptyCartUiStateUseCase.kt", l = {112, 119}, m = "loadRandomShoppingListItems")
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f74459c;

        /* renamed from: d  reason: collision with root package name */
        Object f74460d;

        /* renamed from: e  reason: collision with root package name */
        Object f74461e;

        /* renamed from: f  reason: collision with root package name */
        Object f74462f;

        /* renamed from: g  reason: collision with root package name */
        Object f74463g;

        /* renamed from: h  reason: collision with root package name */
        Object f74464h;

        /* renamed from: i  reason: collision with root package name */
        Object f74465i;

        /* renamed from: j  reason: collision with root package name */
        Object f74466j;

        /* renamed from: k  reason: collision with root package name */
        Object f74467k;

        /* renamed from: l  reason: collision with root package name */
        Object f74468l;

        /* renamed from: m  reason: collision with root package name */
        Object f74469m;

        /* renamed from: n  reason: collision with root package name */
        Object f74470n;

        /* renamed from: o  reason: collision with root package name */
        int f74471o;

        /* renamed from: p  reason: collision with root package name */
        int f74472p;

        /* renamed from: q  reason: collision with root package name */
        int f74473q;

        /* renamed from: r  reason: collision with root package name */
        int f74474r;

        /* renamed from: s  reason: collision with root package name */
        int f74475s;

        /* renamed from: t  reason: collision with root package name */
        int f74476t;

        /* renamed from: u  reason: collision with root package name */
        /* synthetic */ Object f74477u;

        /* renamed from: v  reason: collision with root package name */
        final /* synthetic */ l f74478v;

        /* renamed from: w  reason: collision with root package name */
        int f74479w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(l lVar, C17164e<? super f> eVar) {
            super(eVar);
            this.f74478v = lVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f74477u = obj;
            this.f74479w |= Integer.MIN_VALUE;
            return this.f74478v.i(this);
        }
    }

    public l(C14613b bVar, Ax.c cVar, C10253a aVar, Il.a aVar2, C13909a aVar3) {
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(cVar, "productRemoteDataSource");
        C17542s.j(aVar, "killSwitchRepository");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(aVar3, "sessionManager");
        this.f74438a = bVar;
        this.f74439b = cVar;
        this.f74440c = aVar;
        this.f74441d = aVar2;
        this.f74442e = aVar3;
    }

    private final C15987c<d1> e(List<ProductItem> list, List<String> list2, Set<String> set) {
        Iterable<ProductItem> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (ProductItem o10 : iterable) {
            List<String> list3 = list2;
            Set<String> set2 = set;
            arrayList.add(B0.o(o10, list3, set2, this.f74441d.s(), this.f74441d.w(), this.f74440c.b(), true, false, false, false, 448, (Object) null));
        }
        return C15985a.h(arrayList);
    }

    /* access modifiers changed from: private */
    public final q.c.b f(boolean z10, b bVar) {
        q.c.b.a aVar;
        if (C17542s.e(bVar, b.a.f74444a)) {
            aVar = q.c.b.a.C1303b.f73803a;
        } else if (bVar instanceof b.c) {
            aVar = new q.c.b.a.C1302a(C13026h.a(Oo.b.f84576Z8), ((b.c) bVar).a(), Lf.a.EVERYDAY_ESSENTIALS.b());
        } else if (bVar instanceof b.d) {
            aVar = new q.c.b.a.C1302a((C13023e) null, ((b.d) bVar).a(), Lf.a.FAVORITES.b());
        } else if (C17542s.e(bVar, b.C1334b.f74445a) || bVar == null) {
            aVar = null;
        } else {
            throw new XH.t();
        }
        return new q.c.b(g(bVar, z10), aVar, !z10);
    }

    private final C13023e g(b bVar, boolean z10) {
        if (!z10) {
            return C13026h.a(Oo.b.f84811v2);
        }
        if (!z10) {
            throw new XH.t();
        } else if (bVar == null || C17542s.e(bVar, b.C1334b.f74445a) || C17542s.e(bVar, b.a.f74444a) || (bVar instanceof b.c)) {
            return null;
        } else {
            if (bVar instanceof b.d) {
                return C13026h.a(Oo.b.f84457O);
            }
            throw new XH.t();
        }
    }

    /* access modifiers changed from: private */
    public final b h(c cVar, q.g gVar, List<String> list, Set<String> set) {
        if (cVar instanceof c.a) {
            return new b.d(e(((c.a) cVar).a(), list, set));
        }
        if (C17542s.e(cVar, c.b.f74449a)) {
            return b.a.f74444a;
        }
        if (cVar == null) {
            b.c cVar2 = null;
            if (gVar != null && !gVar.g().isEmpty()) {
                cVar2 = new b.c(gVar.g());
            }
            return cVar2;
        }
        throw new XH.t();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v18, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: ig.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0324, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x006d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006e, code lost:
        r25 = r7;
        r26 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0074, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x021a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x021b, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:11:0x0064, B:58:0x01b5] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x01a4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0074 A[ExcHandler: CancellationException (r0v14 'e' java.util.concurrent.CancellationException A[CUSTOM_DECLARE]), Splitter:B:11:0x0064] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01b5 A[SYNTHETIC, Splitter:B:58:0x01b5] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01fc A[Catch:{ CancellationException -> 0x0074, all -> 0x020d }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x022c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x025a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0260  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0033  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object i(dI.C17164e<? super XH.C16807N> r29) {
        /*
            r28 = this;
            r1 = r28
            r0 = r29
            boolean r2 = r0 instanceof ig.l.f
            if (r2 == 0) goto L_0x0017
            r2 = r0
            ig.l$f r2 = (ig.l.f) r2
            int r3 = r2.f74479w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f74479w = r3
            goto L_0x001c
        L_0x0017:
            ig.l$f r2 = new ig.l$f
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r3 = r2.f74477u
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f74479w
            java.lang.String r6 = "|"
            java.lang.String r7 = "b"
            java.lang.String r8 = "m"
            java.lang.String r9 = "main"
            java.lang.String r10 = "Kt"
            r13 = 1
            r14 = 2
            r15 = 0
            if (r5 == 0) goto L_0x0093
            if (r5 == r13) goto L_0x007f
            if (r5 != r14) goto L_0x0077
            java.lang.Object r0 = r2.f74469m
            java.util.Iterator r0 = (java.util.Iterator) r0
            java.lang.Object r0 = r2.f74468l
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.lang.Object r0 = r2.f74467k
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f74466j
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r2.f74465i
            qv.e r0 = (qv.e) r0
            java.lang.Object r0 = r2.f74464h
            ig.l r0 = (ig.l) r0
            java.lang.Object r0 = r2.f74463g
            ig.l r0 = (ig.l) r0
            java.lang.Object r0 = r2.f74462f
            ig.l r0 = (ig.l) r0
            java.lang.Object r0 = r2.f74461e
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r2.f74460d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r0 = r2.f74459c
            r2 = r0
            ig.l r2 = (ig.l) r2
            XH.y.b(r3)     // Catch:{ CancellationException -> 0x0074, all -> 0x006d }
            r25 = r7
            r26 = r8
            goto L_0x01eb
        L_0x006d:
            r0 = move-exception
            r25 = r7
            r26 = r8
            goto L_0x021c
        L_0x0074:
            r0 = move-exception
            goto L_0x0324
        L_0x0077:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x007f:
            java.lang.Object r0 = r2.f74463g
            ig.l$c r0 = (ig.l.c) r0
            java.lang.Object r0 = r2.f74461e
            TJ.B r0 = (TJ.C16505B) r0
            java.lang.Object r0 = r2.f74460d
            dI.e r0 = (dI.C17164e) r0
            java.lang.Object r5 = r2.f74459c
            ig.l r5 = (ig.l) r5
            XH.y.b(r3)
            goto L_0x00c4
        L_0x0093:
            XH.y.b(r3)
            TJ.B<ig.l$c> r3 = r1.f74443f
        L_0x0098:
            java.lang.Object r5 = r3.getValue()
            r16 = r5
            ig.l$c r16 = (ig.l.c) r16
            ig.l$c$b r11 = ig.l.c.b.f74449a
            boolean r17 = r3.e(r5, r11)
            if (r17 == 0) goto L_0x0338
            jB.b r12 = r1.f74438a
            r2.f74459c = r1
            r2.f74460d = r0
            r2.f74461e = r3
            r2.f74462f = r5
            r2.f74463g = r11
            r2.f74471o = r15
            r2.f74472p = r15
            r2.f74479w = r13
            r3 = 20
            java.lang.Object r3 = r12.t(r3, r2)
            if (r3 != r4) goto L_0x00c3
            return r4
        L_0x00c3:
            r5 = r1
        L_0x00c4:
            java.util.List r3 = (java.util.List) r3
            qv.e r11 = qv.e.DEBUG
            qv.d r12 = qv.d.f102012a
            java.util.List r12 = r12.a()
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r12 = r12.iterator()
        L_0x00d9:
            boolean r18 = r12.hasNext()
            if (r18 == 0) goto L_0x00f3
            java.lang.Object r14 = r12.next()
            r1 = r14
            qv.b r1 = (qv.C11819b) r1
            boolean r1 = r1.b(r11, r15)
            if (r1 == 0) goto L_0x00ef
            r13.add(r14)
        L_0x00ef:
            r1 = r28
            r14 = 2
            goto L_0x00d9
        L_0x00f3:
            java.util.Iterator r1 = r13.iterator()
            r18 = r13
            r12 = 0
            r14 = 0
        L_0x00fb:
            boolean r19 = r1.hasNext()
            if (r19 == 0) goto L_0x01a4
            java.lang.Object r24 = r1.next()
            r18 = r24
            qv.b r18 = (qv.C11819b) r18
            if (r12 != 0) goto L_0x0133
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r25 = r7
            java.lang.String r7 = "Fetch random product details for: "
            r15.append(r7)
            r15.append(r3)
            java.lang.String r7 = r15.toString()
            r15 = 0
            java.lang.String r7 = qv.C11818a.a(r7, r15)
            if (r7 != 0) goto L_0x012d
            r27 = r4
            r26 = r8
            r4 = r24
            goto L_0x01ac
        L_0x012d:
            java.lang.String r7 = qv.C11820c.a(r7)
            r12 = r7
            goto L_0x0135
        L_0x0133:
            r25 = r7
        L_0x0135:
            if (r14 != 0) goto L_0x0187
            java.lang.Class r7 = r5.getClass()
            java.lang.String r7 = r7.getName()
            kotlin.jvm.internal.C17542s.g(r7)
            r27 = r4
            r26 = r8
            r8 = 0
            r14 = 36
            r15 = 2
            java.lang.String r4 = HJ.C15854t.s1(r7, r14, r8, r15, r8)
            r14 = 46
            java.lang.String r4 = HJ.C15854t.o1(r4, r14, r8, r15, r8)
            int r8 = r4.length()
            if (r8 != 0) goto L_0x015b
            goto L_0x015f
        L_0x015b:
            java.lang.String r7 = HJ.C15854t.P0(r4, r10)
        L_0x015f:
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r8 = 1
            boolean r4 = HJ.C15854t.b0(r4, r9, r8)
            if (r4 == 0) goto L_0x0171
            r4 = r26
            goto L_0x0173
        L_0x0171:
            r4 = r25
        L_0x0173:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r4)
            r8.append(r6)
            r8.append(r7)
            java.lang.String r4 = r8.toString()
            r14 = r4
            goto L_0x018b
        L_0x0187:
            r27 = r4
            r26 = r8
        L_0x018b:
            r21 = 0
            r19 = r11
            r20 = r14
            r4 = 0
            r22 = r4
            r23 = r12
            r18.a(r19, r20, r21, r22, r23)
            r18 = r24
            r7 = r25
            r8 = r26
            r4 = r27
            r15 = 0
            goto L_0x00fb
        L_0x01a4:
            r27 = r4
            r25 = r7
            r26 = r8
            r4 = r18
        L_0x01ac:
            r7 = r3
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L_0x0325
            XH.x$a r7 = XH.x.f139812b     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            Ax.c r7 = r5.f74439b     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74459c = r5     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74460d = r0     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74461e = r3     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74462f = r5     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74463g = r5     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74464h = r5     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74465i = r11     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74466j = r12     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74467k = r14     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74468l = r13     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74469m = r1     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74470n = r4     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r1 = 0
            r2.f74471o = r1     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74472p = r1     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74473q = r1     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74474r = r1     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74475s = r1     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r2.f74476t = r1     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r1 = 2
            r2.f74479w = r1     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            java.lang.Object r3 = r7.e(r3, r2)     // Catch:{ CancellationException -> 0x0074, all -> 0x021a }
            r1 = r27
            if (r3 != r1) goto L_0x01ea
            return r1
        L_0x01ea:
            r2 = r5
        L_0x01eb:
            java.lang.Iterable r3 = (java.lang.Iterable) r3     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            r0.<init>()     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
        L_0x01f6:
            boolean r3 = r1.hasNext()     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            if (r3 == 0) goto L_0x020f
            java.lang.Object r3 = r1.next()     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            r4 = r3
            com.ingka.ikea.core.model.product.ProductItem r4 = (com.ingka.ikea.core.model.product.ProductItem) r4     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            boolean r4 = r4.j()     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            if (r4 == 0) goto L_0x01f6
            r0.add(r3)     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            goto L_0x01f6
        L_0x020d:
            r0 = move-exception
            goto L_0x021c
        L_0x020f:
            r1 = 8
            java.util.List r0 = YH.C16877v.k1(r0, r1)     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            java.lang.Object r0 = XH.x.b(r0)     // Catch:{ CancellationException -> 0x0074, all -> 0x020d }
            goto L_0x0226
        L_0x021a:
            r0 = move-exception
            r2 = r5
        L_0x021c:
            XH.x$a r1 = XH.x.f139812b
            java.lang.Object r0 = XH.y.a(r0)
            java.lang.Object r0 = XH.x.b(r0)
        L_0x0226:
            boolean r1 = XH.x.h(r0)
            if (r1 == 0) goto L_0x025a
            r1 = r0
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0246
            TJ.B<ig.l$c> r3 = r2.f74443f
        L_0x0237:
            java.lang.Object r1 = r3.getValue()
            r4 = r1
            ig.l$c r4 = (ig.l.c) r4
            r4 = 0
            boolean r1 = r3.e(r1, r4)
            if (r1 == 0) goto L_0x0237
            goto L_0x025a
        L_0x0246:
            TJ.B<ig.l$c> r3 = r2.f74443f
        L_0x0248:
            java.lang.Object r4 = r3.getValue()
            r5 = r4
            ig.l$c r5 = (ig.l.c) r5
            ig.l$c$a r5 = new ig.l$c$a
            r5.<init>(r1)
            boolean r4 = r3.e(r4, r5)
            if (r4 == 0) goto L_0x0248
        L_0x025a:
            java.lang.Throwable r1 = XH.x.e(r0)
            if (r1 == 0) goto L_0x0320
            qv.e r1 = qv.e.DEBUG
            qv.d r3 = qv.d.f102012a
            java.util.List r3 = r3.a()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0273:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x028b
            java.lang.Object r5 = r3.next()
            r7 = r5
            qv.b r7 = (qv.C11819b) r7
            r8 = 0
            boolean r7 = r7.b(r1, r8)
            if (r7 == 0) goto L_0x0273
            r4.add(r5)
            goto L_0x0273
        L_0x028b:
            java.util.Iterator r3 = r4.iterator()
            r4 = 0
            r5 = 0
        L_0x0291:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0310
            java.lang.Object r7 = r3.next()
            r18 = r7
            qv.b r18 = (qv.C11819b) r18
            r7 = 0
            if (r4 != 0) goto L_0x02af
            java.lang.String r4 = "Failed to fetch product details"
            java.lang.String r4 = qv.C11818a.a(r4, r7)
            if (r4 != 0) goto L_0x02ab
            goto L_0x0310
        L_0x02ab:
            java.lang.String r4 = qv.C11820c.a(r4)
        L_0x02af:
            if (r5 != 0) goto L_0x02fc
            java.lang.Class r5 = r2.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r8 = 0
            r11 = 36
            r12 = 2
            java.lang.String r13 = HJ.C15854t.s1(r5, r11, r8, r12, r8)
            r14 = 46
            java.lang.String r13 = HJ.C15854t.o1(r13, r14, r8, r12, r8)
            int r8 = r13.length()
            if (r8 != 0) goto L_0x02d1
            goto L_0x02d5
        L_0x02d1:
            java.lang.String r5 = HJ.C15854t.P0(r13, r10)
        L_0x02d5:
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            r13 = 1
            boolean r8 = HJ.C15854t.b0(r8, r9, r13)
            if (r8 == 0) goto L_0x02e7
            r8 = r26
            goto L_0x02e9
        L_0x02e7:
            r8 = r25
        L_0x02e9:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r8)
            r15.append(r6)
            r15.append(r5)
            java.lang.String r5 = r15.toString()
            goto L_0x0302
        L_0x02fc:
            r11 = 36
            r12 = 2
            r13 = 1
            r14 = 46
        L_0x0302:
            r21 = 0
            r19 = r1
            r20 = r5
            r22 = r7
            r23 = r4
            r18.a(r19, r20, r21, r22, r23)
            goto L_0x0291
        L_0x0310:
            TJ.B<ig.l$c> r1 = r2.f74443f
        L_0x0312:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            ig.l$c r3 = (ig.l.c) r3
            r3 = 0
            boolean r2 = r1.e(r2, r3)
            if (r2 == 0) goto L_0x0312
        L_0x0320:
            XH.x.a(r0)
            goto L_0x0335
        L_0x0324:
            throw r0
        L_0x0325:
            TJ.B<ig.l$c> r4 = r5.f74443f
        L_0x0327:
            java.lang.Object r0 = r4.getValue()
            r1 = r0
            ig.l$c r1 = (ig.l.c) r1
            r5 = 0
            boolean r0 = r4.e(r0, r5)
            if (r0 == 0) goto L_0x0327
        L_0x0335:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        L_0x0338:
            r26 = r8
            r1 = r28
            goto L_0x0098
        */
        throw new UnsupportedOperationException("Method not decompiled: ig.l.i(dI.e):java.lang.Object");
    }

    public C16532g<q.c.b> a(C16532g<q.g> gVar, C16532g<? extends List<String>> gVar2) {
        C17542s.j(gVar, "cartUpsellUiState");
        C17542s.j(gVar2, "itemNosAddingToCart");
        return C16534i.k(C16534i.S(this.f74443f, new d(this, (C17164e<? super d>) null)), gVar, this.f74442e.n(), gVar2, this.f74438a.f(), new e(this, (C17164e<? super e>) null));
    }
}
