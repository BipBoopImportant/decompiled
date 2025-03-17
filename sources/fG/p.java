package FG;

import HJ.C15854t;
import OE.n;
import XH.v;
import YH.C16877v;
import com.sugarcube.core.network.models.CatalogItem;
import com.sugarcube.core.network.models.VariantRepresentable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \"2\u00020\u0001:\u0004\"\u0019\u0007\u0010B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001eR\u0014\u0010$\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u001c\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00040\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010&\u0001\u0003*+,¨\u0006-"}, d2 = {"LFG/p;", "", "<init>", "()V", "Lcom/sugarcube/core/network/models/VariantRepresentable;", "variant", "Lcom/sugarcube/core/network/models/CatalogItem;", "a", "(Lcom/sugarcube/core/network/models/VariantRepresentable;)Lcom/sugarcube/core/network/models/CatalogItem;", "", "", "", "e", "(Lcom/sugarcube/core/network/models/VariantRepresentable;)Ljava/util/Map;", "", "index", "c", "(I)Lcom/sugarcube/core/network/models/CatalogItem;", "item", "LXH/N;", "k", "(Lcom/sugarcube/core/network/models/CatalogItem;)V", "j", "(I)Z", "", "d", "(Lcom/sugarcube/core/network/models/VariantRepresentable;)Ljava/lang/Float;", "value", "I", "f", "()I", "selectedIndex", "h", "title", "b", "()Lcom/sugarcube/core/network/models/CatalogItem;", "catalogItem", "i", "()Ljava/util/List;", "variants", "g", "selectedVariants", "LFG/p$a;", "LFG/p$b;", "LFG/p$d;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class p {

    /* renamed from: b  reason: collision with root package name */
    public static final c f134368b = new c((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f134369c = 8;

    /* renamed from: a  reason: collision with root package name */
    private int f134370a;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 $2\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r0\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u001a\u0010%\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006'"}, d2 = {"LFG/p$a;", "LFG/p;", "Lcom/sugarcube/core/network/models/CatalogItem;", "catalogItem", "", "Lcom/sugarcube/core/network/models/VariantRepresentable;", "variants", "selectedVariants", "<init>", "(Lcom/sugarcube/core/network/models/CatalogItem;Ljava/util/List;Ljava/util/List;)V", "LXH/v;", "", "", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/ui/productinfo/variant/VariantAndCost;", "l", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lcom/sugarcube/core/network/models/CatalogItem;", "b", "()Lcom/sugarcube/core/network/models/CatalogItem;", "e", "Ljava/util/List;", "i", "f", "g", "I", "h", "title", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends p {

        /* renamed from: h  reason: collision with root package name */
        public static final C3306a f134371h = new C3306a((DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        public static final int f134372i = 8;

        /* renamed from: d  reason: collision with root package name */
        private final CatalogItem f134373d;

        /* renamed from: e  reason: collision with root package name */
        private final List<VariantRepresentable> f134374e;

        /* renamed from: f  reason: collision with root package name */
        private final List<VariantRepresentable> f134375f;

        /* renamed from: g  reason: collision with root package name */
        private final int f134376g = n.f113295V1;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LFG/p$a$a;", "", "<init>", "()V", "", "categoryKey", "", "a", "(Ljava/lang/String;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: FG.p$a$a  reason: collision with other inner class name */
        public static final class C3306a {
            public /* synthetic */ C3306a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(String str) {
                C17542s.j(str, "categoryKey");
                return C17542s.e(str, "slatted bed base");
            }

            private C3306a() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(CatalogItem catalogItem, List<VariantRepresentable> list, List<VariantRepresentable> list2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(catalogItem, "catalogItem");
            C17542s.j(list2, "selectedVariants");
            this.f134373d = catalogItem;
            this.f134374e = list;
            this.f134375f = list2;
        }

        public CatalogItem b() {
            return this.f134373d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f134373d, aVar.f134373d) && C17542s.e(this.f134374e, aVar.f134374e) && C17542s.e(this.f134375f, aVar.f134375f);
        }

        public List<VariantRepresentable> g() {
            return this.f134375f;
        }

        public int h() {
            return this.f134376g;
        }

        public int hashCode() {
            int hashCode = this.f134373d.hashCode() * 31;
            List<VariantRepresentable> list = this.f134374e;
            return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f134375f.hashCode();
        }

        public List<VariantRepresentable> i() {
            return this.f134374e;
        }

        public List<v<String, Float>> l() {
            List<VariantRepresentable> i10 = i();
            if (i10 == null) {
                return C16877v.n();
            }
            Iterable<VariantRepresentable> iterable = i10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (VariantRepresentable variantRepresentable : iterable) {
                String name = variantRepresentable.getName();
                if (name == null || C17542s.e(name, "-")) {
                    name = null;
                }
                Float d10 = p.super.d(variantRepresentable);
                arrayList.add(new v(name, Float.valueOf(d10 != null ? d10.floatValue() : 0.0f)));
            }
            return arrayList;
        }

        public String toString() {
            CatalogItem catalogItem = this.f134373d;
            List<VariantRepresentable> list = this.f134374e;
            List<VariantRepresentable> list2 = this.f134375f;
            return "BedBaseVariantSubSectionUIState(catalogItem=" + catalogItem + ", variants=" + list + ", selectedVariants=" + list2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 \"2\u00020\u0001:\u0001$B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\fR\u001a\u0010#\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0012¨\u0006%"}, d2 = {"LFG/p$b;", "LFG/p;", "Lcom/sugarcube/core/network/models/CatalogItem;", "catalogItem", "", "Lcom/sugarcube/core/network/models/VariantRepresentable;", "variants", "selectedVariants", "<init>", "(Lcom/sugarcube/core/network/models/CatalogItem;Ljava/util/List;Ljava/util/List;)V", "LFG/a;", "l", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lcom/sugarcube/core/network/models/CatalogItem;", "b", "()Lcom/sugarcube/core/network/models/CatalogItem;", "e", "Ljava/util/List;", "i", "f", "g", "I", "h", "title", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p {

        /* renamed from: h  reason: collision with root package name */
        public static final a f134377h = new a((DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        public static final int f134378i = 8;

        /* renamed from: d  reason: collision with root package name */
        private final CatalogItem f134379d;

        /* renamed from: e  reason: collision with root package name */
        private final List<VariantRepresentable> f134380e;

        /* renamed from: f  reason: collision with root package name */
        private final List<VariantRepresentable> f134381f;

        /* renamed from: g  reason: collision with root package name */
        private final int f134382g = n.f113460t3;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LFG/p$b$a;", "", "<init>", "()V", "", "categoryKey", "", "a", "(Ljava/lang/String;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(String str) {
                C17542s.j(str, "categoryKey");
                return C17542s.e(str, "color") || C17542s.e(str, "colour") || C17542s.e(str, "cover");
            }

            private a() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(CatalogItem catalogItem, List<VariantRepresentable> list, List<VariantRepresentable> list2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(catalogItem, "catalogItem");
            C17542s.j(list2, "selectedVariants");
            this.f134379d = catalogItem;
            this.f134380e = list;
            this.f134381f = list2;
        }

        public CatalogItem b() {
            return this.f134379d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f134379d, bVar.f134379d) && C17542s.e(this.f134380e, bVar.f134380e) && C17542s.e(this.f134381f, bVar.f134381f);
        }

        public List<VariantRepresentable> g() {
            return this.f134381f;
        }

        public int h() {
            return this.f134382g;
        }

        public int hashCode() {
            int hashCode = this.f134379d.hashCode() * 31;
            List<VariantRepresentable> list = this.f134380e;
            return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f134381f.hashCode();
        }

        public List<VariantRepresentable> i() {
            return this.f134380e;
        }

        public List<C15678a> l() {
            C15678a aVar;
            CatalogItem catalogItem;
            List<VariantRepresentable> i10 = i();
            if (i10 == null) {
                return C16877v.n();
            }
            ArrayList arrayList = new ArrayList();
            for (VariantRepresentable variantRepresentable : i10) {
                List<CatalogItem> items = variantRepresentable.getItems();
                if (items == null || (catalogItem = (CatalogItem) C16877v.y0(items)) == null) {
                    aVar = null;
                } else {
                    String name = variantRepresentable.getName();
                    if (name == null) {
                        name = "";
                    }
                    aVar = new C15678a(name, catalogItem.getThumbUrl());
                }
                if (aVar != null) {
                    arrayList.add(aVar);
                }
            }
            return arrayList;
        }

        public String toString() {
            CatalogItem catalogItem = this.f134379d;
            List<VariantRepresentable> list = this.f134380e;
            List<VariantRepresentable> list2 = this.f134381f;
            return "ColorVariantSubSectionUIState(catalogItem=" + catalogItem + ", variants=" + list + ", selectedVariants=" + list2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LFG/p$c;", "", "<init>", "()V", "", "Lcom/sugarcube/core/network/models/VariantCategory;", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "item", "LFG/k;", "a", "(Ljava/util/List;Lcom/sugarcube/app/base/data/database/CachedCatalogItem;)LFG/k;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: FG.p$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: FG.p$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: FG.p$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: FG.p$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: FG.p$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: com.sugarcube.core.network.models.VariantRepresentable} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: FG.p$a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: FG.p$a} */
        /* JADX WARNING: type inference failed for: r4v5, types: [com.sugarcube.core.network.models.VariantRepresentable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final FG.k a(java.util.List<com.sugarcube.core.network.models.VariantCategory> r12, com.sugarcube.app.base.data.database.CachedCatalogItem r13) {
            /*
                r11 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.C17542s.j(r12, r0)
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C17542s.j(r13, r0)
                java.lang.Iterable r12 = (java.lang.Iterable) r12
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r1 = r12.iterator()
            L_0x0015:
                boolean r2 = r1.hasNext()
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L_0x0077
                java.lang.Object r2 = r1.next()
                com.sugarcube.core.network.models.VariantCategory r2 = (com.sugarcube.core.network.models.VariantCategory) r2
                java.util.List r2 = r2.getVariants()
                if (r2 == 0) goto L_0x0071
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
            L_0x002f:
                boolean r5 = r2.hasNext()
                if (r5 == 0) goto L_0x006f
                java.lang.Object r5 = r2.next()
                r6 = r5
                com.sugarcube.core.network.models.VariantRepresentable r6 = (com.sugarcube.core.network.models.VariantRepresentable) r6
                java.util.List r6 = r6.getItems()
                if (r6 == 0) goto L_0x002f
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.Iterator r7 = r6.iterator()
            L_0x0048:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L_0x0067
                java.lang.Object r8 = r7.next()
                r9 = r8
                com.sugarcube.core.network.models.CatalogItem r9 = (com.sugarcube.core.network.models.CatalogItem) r9
                java.lang.Integer r9 = r9.getId()
                int r10 = r13.getId()
                if (r9 != 0) goto L_0x0060
                goto L_0x0048
            L_0x0060:
                int r9 = r9.intValue()
                if (r9 != r10) goto L_0x0048
                goto L_0x0068
            L_0x0067:
                r8 = r4
            L_0x0068:
                boolean r6 = YH.C16877v.l0(r6, r8)
                if (r6 != r3) goto L_0x002f
                r4 = r5
            L_0x006f:
                com.sugarcube.core.network.models.VariantRepresentable r4 = (com.sugarcube.core.network.models.VariantRepresentable) r4
            L_0x0071:
                if (r4 == 0) goto L_0x0015
                r0.add(r4)
                goto L_0x0015
            L_0x0077:
                kotlin.jvm.internal.O r1 = new kotlin.jvm.internal.O
                r1.<init>()
                kotlin.jvm.internal.O r2 = new kotlin.jvm.internal.O
                r2.<init>()
                kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
                r5.<init>()
                java.util.Iterator r12 = r12.iterator()
            L_0x008a:
                boolean r6 = r12.hasNext()
                if (r6 == 0) goto L_0x00ef
                java.lang.Object r6 = r12.next()
                com.sugarcube.core.network.models.VariantCategory r6 = (com.sugarcube.core.network.models.VariantCategory) r6
                java.lang.String r7 = r6.component1()
                java.util.List r6 = r6.component3()
                FG.p$b$a r8 = FG.p.b.f134377h
                boolean r8 = r8.a(r7)
                if (r8 == 0) goto L_0x00b9
                FG.p$b r7 = new FG.p$b
                com.sugarcube.core.network.models.CatalogItem r8 = r13.getCatalogItem()
                r7.<init>(r8, r6, r0)
                com.sugarcube.core.network.models.CatalogItem r6 = r13.getCatalogItem()
                r7.k(r6)
                r1.f144348a = r7
                goto L_0x008a
            L_0x00b9:
                FG.p$d$a r8 = FG.p.d.f134383h
                boolean r8 = r8.a(r7)
                if (r8 == 0) goto L_0x00d4
                FG.p$d r7 = new FG.p$d
                com.sugarcube.core.network.models.CatalogItem r8 = r13.getCatalogItem()
                r7.<init>(r8, r6, r0)
                com.sugarcube.core.network.models.CatalogItem r6 = r13.getCatalogItem()
                r7.k(r6)
                r2.f144348a = r7
                goto L_0x008a
            L_0x00d4:
                FG.p$a$a r8 = FG.p.a.f134371h
                boolean r7 = r8.a(r7)
                if (r7 == 0) goto L_0x008a
                FG.p$a r7 = new FG.p$a
                com.sugarcube.core.network.models.CatalogItem r8 = r13.getCatalogItem()
                r7.<init>(r8, r6, r0)
                com.sugarcube.core.network.models.CatalogItem r6 = r13.getCatalogItem()
                r7.k(r6)
                r5.f144348a = r7
                goto L_0x008a
            L_0x00ef:
                T r12 = r1.f144348a
                FG.p$b r12 = (FG.p.b) r12
                if (r12 == 0) goto L_0x0102
                java.util.List r13 = r12.i()
                if (r13 == 0) goto L_0x0102
                int r13 = r13.size()
                if (r13 <= r3) goto L_0x0102
                goto L_0x0103
            L_0x0102:
                r12 = r4
            L_0x0103:
                T r13 = r2.f144348a
                FG.p$d r13 = (FG.p.d) r13
                if (r13 == 0) goto L_0x0116
                java.util.List r0 = r13.i()
                if (r0 == 0) goto L_0x0116
                int r0 = r0.size()
                if (r0 <= r3) goto L_0x0116
                goto L_0x0117
            L_0x0116:
                r13 = r4
            L_0x0117:
                T r0 = r5.f144348a
                FG.p$a r0 = (FG.p.a) r0
                if (r0 == 0) goto L_0x012a
                java.util.List r1 = r0.i()
                if (r1 == 0) goto L_0x012a
                int r1 = r1.size()
                if (r1 <= r3) goto L_0x012a
                r4 = r0
            L_0x012a:
                FG.k r0 = new FG.k
                r0.<init>(r12, r13, r4)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: FG.p.c.a(java.util.List, com.sugarcube.app.base.data.database.CachedCatalogItem):FG.k");
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 $2\u00020\u0001:\u0001&B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000e\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r0\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000fR\u001a\u0010%\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0014¨\u0006'"}, d2 = {"LFG/p$d;", "LFG/p;", "Lcom/sugarcube/core/network/models/CatalogItem;", "catalogItem", "", "Lcom/sugarcube/core/network/models/VariantRepresentable;", "variants", "selectedVariants", "<init>", "(Lcom/sugarcube/core/network/models/CatalogItem;Ljava/util/List;Ljava/util/List;)V", "LXH/v;", "", "", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/ui/productinfo/variant/VariantAndCost;", "l", "()Ljava/util/List;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lcom/sugarcube/core/network/models/CatalogItem;", "b", "()Lcom/sugarcube/core/network/models/CatalogItem;", "e", "Ljava/util/List;", "i", "f", "g", "I", "h", "title", "a", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends p {

        /* renamed from: h  reason: collision with root package name */
        public static final a f134383h = new a((DefaultConstructorMarker) null);

        /* renamed from: i  reason: collision with root package name */
        public static final int f134384i = 8;

        /* renamed from: d  reason: collision with root package name */
        private final CatalogItem f134385d;

        /* renamed from: e  reason: collision with root package name */
        private final List<VariantRepresentable> f134386e;

        /* renamed from: f  reason: collision with root package name */
        private final List<VariantRepresentable> f134387f;

        /* renamed from: g  reason: collision with root package name */
        private final int f134388g = n.f113289U1;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LFG/p$d$a;", "", "<init>", "()V", "", "categoryKey", "", "a", "(Ljava/lang/String;)Z", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final boolean a(String str) {
                C17542s.j(str, "categoryKey");
                return C17542s.e(str, "size");
            }

            private a() {
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(CatalogItem catalogItem, List<VariantRepresentable> list, List<VariantRepresentable> list2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(catalogItem, "catalogItem");
            C17542s.j(list2, "selectedVariants");
            this.f134385d = catalogItem;
            this.f134386e = list;
            this.f134387f = list2;
        }

        public CatalogItem b() {
            return this.f134385d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f134385d, dVar.f134385d) && C17542s.e(this.f134386e, dVar.f134386e) && C17542s.e(this.f134387f, dVar.f134387f);
        }

        public List<VariantRepresentable> g() {
            return this.f134387f;
        }

        public int h() {
            return this.f134388g;
        }

        public int hashCode() {
            int hashCode = this.f134385d.hashCode() * 31;
            List<VariantRepresentable> list = this.f134386e;
            return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f134387f.hashCode();
        }

        public List<VariantRepresentable> i() {
            return this.f134386e;
        }

        public List<v<String, Float>> l() {
            List<VariantRepresentable> i10 = i();
            if (i10 == null) {
                return C16877v.n();
            }
            Iterable<VariantRepresentable> iterable = i10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (VariantRepresentable variantRepresentable : iterable) {
                String name = variantRepresentable.getName();
                if (name == null || C17542s.e(name, "-")) {
                    name = null;
                }
                Float d10 = p.super.d(variantRepresentable);
                arrayList.add(new v(name, Float.valueOf(d10 != null ? d10.floatValue() : 0.0f)));
            }
            return arrayList;
        }

        public String toString() {
            CatalogItem catalogItem = this.f134385d;
            List<VariantRepresentable> list = this.f134386e;
            List<VariantRepresentable> list2 = this.f134387f;
            return "SizeVariantSubSectionUIState(catalogItem=" + catalogItem + ", variants=" + list + ", selectedVariants=" + list2 + ")";
        }
    }

    public /* synthetic */ p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final CatalogItem a(VariantRepresentable variantRepresentable) {
        Object obj;
        CatalogItem catalogItem;
        Iterator it = e(variantRepresentable).entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                ArrayList arrayList = new ArrayList();
                for (Object next : (Iterable) ((Map.Entry) obj).getValue()) {
                    if (((Boolean) next).booleanValue()) {
                        arrayList.add(next);
                    }
                }
                int size = arrayList.size();
                do {
                    Object next2 = it.next();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object next3 : (Iterable) ((Map.Entry) next2).getValue()) {
                        if (((Boolean) next3).booleanValue()) {
                            arrayList2.add(next3);
                        }
                    }
                    int size2 = arrayList2.size();
                    if (size < size2) {
                        obj = next2;
                        size = size2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null && (catalogItem = (CatalogItem) entry.getKey()) != null) {
            return catalogItem;
        }
        List<CatalogItem> items = variantRepresentable.getItems();
        if (items != null) {
            return (CatalogItem) C16877v.y0(items);
        }
        return null;
    }

    private final Map<CatalogItem, List<Boolean>> e(VariantRepresentable variantRepresentable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<VariantRepresentable> arrayList = new ArrayList<>();
        for (Object next : g()) {
            if (!C17542s.e(((VariantRepresentable) next).getCategoryKey(), variantRepresentable.getCategoryKey())) {
                arrayList.add(next);
            }
        }
        List<CatalogItem> items = variantRepresentable.getItems();
        if (items != null) {
            for (CatalogItem catalogItem : items) {
                for (VariantRepresentable variantRepresentable2 : arrayList) {
                    List list = (List) linkedHashMap.get(catalogItem);
                    if (list == null) {
                        list = C16877v.n();
                    }
                    Collection collection = list;
                    List<CatalogItem> items2 = variantRepresentable2.getItems();
                    boolean z10 = false;
                    if (items2 != null && items2.contains(catalogItem)) {
                        z10 = true;
                    }
                    linkedHashMap.put(catalogItem, C16877v.V0(collection, C16877v.e(Boolean.valueOf(z10))));
                }
            }
        }
        return linkedHashMap;
    }

    public abstract CatalogItem b();

    public final CatalogItem c(int i10) {
        VariantRepresentable variantRepresentable;
        CatalogItem a10;
        List<VariantRepresentable> i11 = i();
        if (i11 != null && (variantRepresentable = (VariantRepresentable) C16877v.z0(i11, i10)) != null && (a10 = a(variantRepresentable)) != null) {
            return a10;
        }
        throw new IndexOutOfBoundsException();
    }

    /* access modifiers changed from: protected */
    public final Float d(VariantRepresentable variantRepresentable) {
        String priceNumeral;
        C17542s.j(variantRepresentable, "variant");
        String priceNumeral2 = b().getPriceNumeral();
        Float r10 = priceNumeral2 != null ? C15854t.r(priceNumeral2) : null;
        CatalogItem a10 = a(variantRepresentable);
        Float r11 = (a10 == null || (priceNumeral = a10.getPriceNumeral()) == null) ? null : C15854t.r(priceNumeral);
        if (r10 == null || r11 == null) {
            return null;
        }
        return Float.valueOf(r11.floatValue() - r10.floatValue());
    }

    public final int f() {
        return this.f134370a;
    }

    public abstract List<VariantRepresentable> g();

    public abstract int h();

    public abstract List<VariantRepresentable> i();

    public final boolean j(int i10) {
        VariantRepresentable variantRepresentable;
        Object obj;
        if (g().size() <= 1) {
            return false;
        }
        List<VariantRepresentable> i11 = i();
        if (i11 == null || (variantRepresentable = (VariantRepresentable) C16877v.z0(i11, i10)) == null) {
            throw new IndexOutOfBoundsException();
        } else if (g().contains(variantRepresentable)) {
            return false;
        } else {
            Iterator it = e(variantRepresentable).entrySet().iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                Iterable iterable = (Iterable) ((Map.Entry) obj).getValue();
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    break;
                }
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break loop0;
                    } else if (!((Boolean) it2.next()).booleanValue()) {
                    }
                }
            }
            return obj == null;
        }
    }

    public final void k(CatalogItem catalogItem) {
        C17542s.j(catalogItem, "item");
        List<VariantRepresentable> i10 = i();
        if (i10 != null) {
            Iterator<VariantRepresentable> it = i10.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                }
                List<CatalogItem> component3 = it.next().component3();
                if (component3 != null && component3.contains(catalogItem)) {
                    break;
                }
                i11++;
            }
            Integer valueOf = Integer.valueOf(i11);
            if (valueOf.intValue() < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                this.f134370a = valueOf.intValue();
            }
        }
    }

    private p() {
    }
}
