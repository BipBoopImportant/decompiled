package yh;

import Ah.t;
import M6.A;
import M6.C6654b;
import M6.d;
import M6.k;
import M6.w;
import Q6.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zh.i;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\t\u0012B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nJ\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b!\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lyh/c;", "LM6/A;", "Lyh/c$b;", "", "listId", "LBh/b;", "itemPresentation", "<init>", "(Ljava/lang/String;LBh/b;)V", "c", "()Ljava/lang/String;", "d", "name", "LQ6/g;", "writer", "LM6/k;", "customScalarAdapters", "LXH/N;", "a", "(LQ6/g;LM6/k;)V", "LM6/b;", "b", "()LM6/b;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "LBh/b;", "e", "()LBh/b;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yh.c  reason: case insensitive filesystem */
public final class C10479c implements A<b> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f78076c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f78077a;

    /* renamed from: b  reason: collision with root package name */
    private final Bh.b f78078b;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lyh/c$a;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "OPERATION_DOCUMENT", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a() {
            return "query ListDetailsQuery($listId: ID!, $itemPresentation: ItemPresentation!) { list(listId: $listId, itemPresentation: $itemPresentation) { __typename ...ListDetail } }  fragment ProductDetailsFragment on Product { name description type technicalDetails { imageUrl labelUrl } measurements { metric imperial } category images { quality url } displayUnit { imperial { unit value } metric { unit value } type } }  fragment PriceFragment on Price { exclTax inclTax }  fragment ItemContent on Item { itemNo type quantity isBuyableOnline isCommunicatedOnline isBreathTakingItem isNew isFamilyItem totalPackages updatedAt articles { itemNo packages { id } quantityPerItem product { __typename ...ProductDetailsFragment } } prices { online { fees { eco weee } regular { unit { inclTax exclTax tax isLowerPrice previousPrice { __typename ...PriceFragment } validFrom validTo lowestPreviousPrice { __typename ...PriceFragment } } } family { unit { inclTax exclTax tax validFrom validTo lowestPreviousPrice { __typename ...PriceFragment } } } } } product { __typename ...ProductDetailsFragment } }  fragment ListDetail on List { quantity name listId items { __typename ...ItemContent } updated }";
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lyh/c$b;", "", "Lyh/c$c;", "list", "<init>", "(Lyh/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyh/c$c;", "()Lyh/c$c;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.c$b */
    public static final class b implements w.a {

        /* renamed from: a  reason: collision with root package name */
        private final C1446c f78079a;

        public b(C1446c cVar) {
            C17542s.j(cVar, "list");
            this.f78079a = cVar;
        }

        public final C1446c a() {
            return this.f78079a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f78079a, ((b) obj).f78079a);
        }

        public int hashCode() {
            return this.f78079a.hashCode();
        }

        public String toString() {
            C1446c cVar = this.f78079a;
            return "Data(list=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015¨\u0006\u0016"}, d2 = {"Lyh/c$c;", "", "", "__typename", "LAh/t;", "listDetail", "<init>", "(Ljava/lang/String;LAh/t;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LAh/t;", "()LAh/t;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yh.c$c  reason: collision with other inner class name */
    public static final class C1446c {

        /* renamed from: a  reason: collision with root package name */
        private final String f78080a;

        /* renamed from: b  reason: collision with root package name */
        private final t f78081b;

        public C1446c(String str, t tVar) {
            C17542s.j(str, "__typename");
            C17542s.j(tVar, "listDetail");
            this.f78080a = str;
            this.f78081b = tVar;
        }

        public final t a() {
            return this.f78081b;
        }

        public final String b() {
            return this.f78080a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1446c)) {
                return false;
            }
            C1446c cVar = (C1446c) obj;
            return C17542s.e(this.f78080a, cVar.f78080a) && C17542s.e(this.f78081b, cVar.f78081b);
        }

        public int hashCode() {
            return (this.f78080a.hashCode() * 31) + this.f78081b.hashCode();
        }

        public String toString() {
            String str = this.f78080a;
            t tVar = this.f78081b;
            return "List(__typename=" + str + ", listDetail=" + tVar + ")";
        }
    }

    public C10479c(String str, Bh.b bVar) {
        C17542s.j(str, "listId");
        C17542s.j(bVar, "itemPresentation");
        this.f78077a = str;
        this.f78078b = bVar;
    }

    public void a(g gVar, k kVar) {
        C17542s.j(gVar, "writer");
        C17542s.j(kVar, "customScalarAdapters");
        i.f78400a.b(gVar, kVar, this);
    }

    public C6654b<b> b() {
        return d.d(zh.g.f78396a, false, 1, (Object) null);
    }

    public String c() {
        return "3969250ad954b2824c9f926aa2c48791296707ba64f2e7d4441f4ca2daa3b161";
    }

    public String d() {
        return f78076c.a();
    }

    public final Bh.b e() {
        return this.f78078b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10479c)) {
            return false;
        }
        C10479c cVar = (C10479c) obj;
        return C17542s.e(this.f78077a, cVar.f78077a) && C17542s.e(this.f78078b, cVar.f78078b);
    }

    public final String f() {
        return this.f78077a;
    }

    public int hashCode() {
        return (this.f78077a.hashCode() * 31) + this.f78078b.hashCode();
    }

    public String name() {
        return "ListDetailsQuery";
    }

    public String toString() {
        String str = this.f78077a;
        Bh.b bVar = this.f78078b;
        return "ListDetailsQuery(listId=" + str + ", itemPresentation=" + bVar + ")";
    }
}
