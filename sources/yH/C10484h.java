package yh;

import Ah.t;
import M6.A;
import M6.C6654b;
import M6.d;
import M6.k;
import M6.w;
import Q6.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zh.v;
import zh.x;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0014\b\u0011B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lyh/h;", "LM6/A;", "Lyh/h$b;", "LBh/b;", "itemPresentation", "<init>", "(LBh/b;)V", "", "c", "()Ljava/lang/String;", "d", "name", "LQ6/g;", "writer", "LM6/k;", "customScalarAdapters", "LXH/N;", "a", "(LQ6/g;LM6/k;)V", "LM6/b;", "b", "()LM6/b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LBh/b;", "e", "()LBh/b;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yh.h  reason: case insensitive filesystem */
public final class C10484h implements A<b> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f78105b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Bh.b f78106a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lyh/h$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.h$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query ListsAndItemsQuery($itemPresentation: ItemPresentation!) { lists(itemPresentation: $itemPresentation) { __typename ...ListDetail } }  fragment ProductDetailsFragment on Product { name description type technicalDetails { imageUrl labelUrl } measurements { metric imperial } category images { quality url } displayUnit { imperial { unit value } metric { unit value } type } }  fragment PriceFragment on Price { exclTax inclTax }  fragment ItemContent on Item { itemNo type quantity isBuyableOnline isCommunicatedOnline isBreathTakingItem isNew isFamilyItem totalPackages updatedAt articles { itemNo packages { id } quantityPerItem product { __typename ...ProductDetailsFragment } } prices { online { fees { eco weee } regular { unit { inclTax exclTax tax isLowerPrice previousPrice { __typename ...PriceFragment } validFrom validTo lowestPreviousPrice { __typename ...PriceFragment } } } family { unit { inclTax exclTax tax validFrom validTo lowestPreviousPrice { __typename ...PriceFragment } } } } } product { __typename ...ProductDetailsFragment } }  fragment ListDetail on List { quantity name listId items { __typename ...ItemContent } updated }";
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lyh/h$b;", "", "", "Lyh/h$c;", "lists", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.h$b */
    public static final class b implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final List<c> f78107a;

        public b(List<c> list) {
            C17542s.j(list, "lists");
            this.f78107a = list;
        }

        public final List<c> a() {
            return this.f78107a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f78107a, ((b) obj).f78107a);
        }

        public int hashCode() {
            return this.f78107a.hashCode();
        }

        public String toString() {
            List<c> list = this.f78107a;
            return "Data(lists=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lyh/h$c;", "", "", "__typename", "LAh/t;", "listDetail", "<init>", "(Ljava/lang/String;LAh/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LAh/t;", "()LAh/t;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.h$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f78108a;

        /* renamed from: b  reason: collision with root package name */
        private final t f78109b;

        public c(String str, t tVar) {
            C17542s.j(str, "__typename");
            C17542s.j(tVar, "listDetail");
            this.f78108a = str;
            this.f78109b = tVar;
        }

        public final t a() {
            return this.f78109b;
        }

        public final String b() {
            return this.f78108a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f78108a, cVar.f78108a) && C17542s.e(this.f78109b, cVar.f78109b);
        }

        public int hashCode() {
            return (this.f78108a.hashCode() * 31) + this.f78109b.hashCode();
        }

        public String toString() {
            String str = this.f78108a;
            t tVar = this.f78109b;
            return "List(__typename=" + str + ", listDetail=" + tVar + ")";
        }
    }

    public C10484h(Bh.b bVar) {
        C17542s.j(bVar, "itemPresentation");
        this.f78106a = bVar;
    }

    public void a(g gVar, k kVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        x.f78425a.b(gVar, kVar, this);
    }

    public C6654b<b> b() {
        return d.d(v.f78421a, false, 1, (Object) null);
    }

    public String c() {
        return "a667f7ee9c362a326903b40ce7b1e64626a73d95994625cafd809bf0164b1162";
    }

    public String d() {
        return f78105b.a();
    }

    public final Bh.b e() {
        return this.f78106a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10484h) && C17542s.e(this.f78106a, ((C10484h) obj).f78106a);
    }

    public int hashCode() {
        return this.f78106a.hashCode();
    }

    public String name() {
        return "ListsAndItemsQuery";
    }

    public String toString() {
        Bh.b bVar = this.f78106a;
        return "ListsAndItemsQuery(itemPresentation=" + bVar + ")";
    }
}
