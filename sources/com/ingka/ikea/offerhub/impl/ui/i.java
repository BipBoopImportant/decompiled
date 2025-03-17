package com.ingka.ikea.offerhub.impl.ui;

import XH.t;
import com.ingka.ikea.analytics.Interaction$Component;
import fI.C17221b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import on.C11687b;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/i;", "", "c", "d", "e", "f", "g", "h", "a", "Lcom/ingka/ikea/offerhub/impl/ui/i$c;", "Lcom/ingka/ikea/offerhub/impl/ui/i$d;", "Lcom/ingka/ikea/offerhub/impl/ui/i$e;", "Lcom/ingka/ikea/offerhub/impl/ui/i$f;", "Lcom/ingka/ikea/offerhub/impl/ui/i$g;", "Lcom/ingka/ikea/offerhub/impl/ui/i$h;", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/i$a;", "", "<init>", "(Ljava/lang/String;I)V", "CATEGORY_CAROUSEL", "OFFERS_PRODUCT_CAROUSEL", "RECOMMENDATION_CAROUSEL", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        CATEGORY_CAROUSEL,
        OFFERS_PRODUCT_CAROUSEL,
        RECOMMENDATION_CAROUSEL;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public static C11687b.e a(i iVar, a aVar) {
            C17542s.j(aVar, "$receiver");
            int i10 = C2981i.f119224a[aVar.ordinal()];
            if (i10 == 1) {
                return C11687b.e.CATEGORY;
            }
            if (i10 == 2) {
                return C11687b.e.OFFERS;
            }
            if (i10 == 3) {
                return C11687b.e.USER_RECOMMENDATION;
            }
            throw new t();
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/i$c;", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements i {

        /* renamed from: a  reason: collision with root package name */
        public static final c f119210a = new c();

        private c() {
        }

        public C11687b.e a(a aVar) {
            return b.a(this, aVar);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 453056889;
        }

        public String toString() {
            return "OnBackClicked";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/i$d;", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "", "categoryId", "categoryTitle", "Lcom/ingka/ikea/offerhub/impl/ui/i$a;", "categoryType", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/offerhub/impl/ui/i$a;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/ingka/ikea/offerhub/impl/ui/i$a;", "()Lcom/ingka/ikea/offerhub/impl/ui/i$a;", "d", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f119211a;

        /* renamed from: b  reason: collision with root package name */
        private final String f119212b;

        /* renamed from: c  reason: collision with root package name */
        private final a f119213c;

        /* renamed from: d  reason: collision with root package name */
        private final Interaction$Component f119214d;

        public d(String str, String str2, a aVar, Interaction$Component interaction$Component) {
            C17542s.j(str, "categoryId");
            C17542s.j(str2, "categoryTitle");
            C17542s.j(aVar, "categoryType");
            C17542s.j(interaction$Component, "component");
            this.f119211a = str;
            this.f119212b = str2;
            this.f119213c = aVar;
            this.f119214d = interaction$Component;
        }

        public final String a() {
            return this.f119211a;
        }

        public final String b() {
            return this.f119212b;
        }

        public final a c() {
            return this.f119213c;
        }

        public final Interaction$Component d() {
            return this.f119214d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f119211a, dVar.f119211a) && C17542s.e(this.f119212b, dVar.f119212b) && this.f119213c == dVar.f119213c && this.f119214d == dVar.f119214d;
        }

        public int hashCode() {
            return (((((this.f119211a.hashCode() * 31) + this.f119212b.hashCode()) * 31) + this.f119213c.hashCode()) * 31) + this.f119214d.hashCode();
        }

        public String toString() {
            String str = this.f119211a;
            String str2 = this.f119212b;
            a aVar = this.f119213c;
            Interaction$Component interaction$Component = this.f119214d;
            return "OnCategoryClicked(categoryId=" + str + ", categoryTitle=" + str2 + ", categoryType=" + aVar + ", component=" + interaction$Component + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/i$e;", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "", "linkTo", "messageId", "Lcw/c;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcw/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcw/c;", "()Lcw/c;", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f119215a;

        /* renamed from: b  reason: collision with root package name */
        private final String f119216b;

        /* renamed from: c  reason: collision with root package name */
        private final cw.c f119217c;

        public e(String str, String str2, cw.c cVar) {
            C17542s.j(str, "linkTo");
            C17542s.j(str2, "messageId");
            C17542s.j(cVar, "type");
            this.f119215a = str;
            this.f119216b = str2;
            this.f119217c = cVar;
        }

        public final String a() {
            return this.f119215a;
        }

        public final String b() {
            return this.f119216b;
        }

        public final cw.c c() {
            return this.f119217c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f119215a, eVar.f119215a) && C17542s.e(this.f119216b, eVar.f119216b) && this.f119217c == eVar.f119217c;
        }

        public int hashCode() {
            return (((this.f119215a.hashCode() * 31) + this.f119216b.hashCode()) * 31) + this.f119217c.hashCode();
        }

        public String toString() {
            String str = this.f119215a;
            String str2 = this.f119216b;
            cw.c cVar = this.f119217c;
            return "OnCommercialMessageClicked(linkTo=" + str + ", messageId=" + str2 + ", type=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/i$f;", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "", "messageId", "Lcw/c;", "type", "<init>", "(Ljava/lang/String;Lcw/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcw/c;", "()Lcw/c;", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f119218a;

        /* renamed from: b  reason: collision with root package name */
        private final cw.c f119219b;

        public f(String str, cw.c cVar) {
            C17542s.j(str, "messageId");
            C17542s.j(cVar, "type");
            this.f119218a = str;
            this.f119219b = cVar;
        }

        public final String a() {
            return this.f119218a;
        }

        public final cw.c b() {
            return this.f119219b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C17542s.e(this.f119218a, fVar.f119218a) && this.f119219b == fVar.f119219b;
        }

        public int hashCode() {
            return (this.f119218a.hashCode() * 31) + this.f119219b.hashCode();
        }

        public String toString() {
            String str = this.f119218a;
            cw.c cVar = this.f119219b;
            return "OnCommercialMessagesViewed(messageId=" + str + ", type=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0014\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/i$g;", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "", "id", "", "itemNos", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f119220a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f119221b;

        /* renamed from: c  reason: collision with root package name */
        private final Interaction$Component f119222c;

        public g(String str, List<String> list, Interaction$Component interaction$Component) {
            C17542s.j(str, "id");
            C17542s.j(list, "itemNos");
            C17542s.j(interaction$Component, "component");
            this.f119220a = str;
            this.f119221b = list;
            this.f119222c = interaction$Component;
        }

        public final Interaction$Component a() {
            return this.f119222c;
        }

        public final String b() {
            return this.f119220a;
        }

        public final List<String> c() {
            return this.f119221b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return C17542s.e(this.f119220a, gVar.f119220a) && C17542s.e(this.f119221b, gVar.f119221b) && this.f119222c == gVar.f119222c;
        }

        public int hashCode() {
            return (((this.f119220a.hashCode() * 31) + this.f119221b.hashCode()) * 31) + this.f119222c.hashCode();
        }

        public String toString() {
            String str = this.f119220a;
            List<String> list = this.f119221b;
            Interaction$Component interaction$Component = this.f119222c;
            return "OnProductCarouselViewed(id=" + str + ", itemNos=" + list + ", component=" + interaction$Component + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/offerhub/impl/ui/i$h;", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "", "listId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements i {

        /* renamed from: a  reason: collision with root package name */
        private final String f119223a;

        public h(String str) {
            C17542s.j(str, "listId");
            this.f119223a = str;
        }

        public final String a() {
            return this.f119223a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && C17542s.e(this.f119223a, ((h) obj).f119223a);
        }

        public int hashCode() {
            return this.f119223a.hashCode();
        }

        public String toString() {
            String str = this.f119223a;
            return "OpenShoppingList(listId=" + str + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.offerhub.impl.ui.i$i  reason: collision with other inner class name */
    public /* synthetic */ class C2981i {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f119224a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.ingka.ikea.offerhub.impl.ui.i$a[] r0 = com.ingka.ikea.offerhub.impl.ui.i.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.offerhub.impl.ui.i$a r1 = com.ingka.ikea.offerhub.impl.ui.i.a.CATEGORY_CAROUSEL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.offerhub.impl.ui.i$a r1 = com.ingka.ikea.offerhub.impl.ui.i.a.OFFERS_PRODUCT_CAROUSEL     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.offerhub.impl.ui.i$a r1 = com.ingka.ikea.offerhub.impl.ui.i.a.RECOMMENDATION_CAROUSEL     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f119224a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.offerhub.impl.ui.i.C2981i.<clinit>():void");
        }
    }
}
