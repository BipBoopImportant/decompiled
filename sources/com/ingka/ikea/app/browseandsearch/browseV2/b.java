package com.ingka.ikea.app.browseandsearch.browseV2;

import KJ.C15987c;
import Op.d1;
import Qr.b;
import com.ingka.ikea.core.model.Category;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qe.C10189b;
import yf.g;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b$\b\b\u0018\u00002\u00020\u0001:\u0004')*#B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u00022\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b#\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b*\u0010/R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b'\u00106R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u00107\u001a\u0004\b0\u00108R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b9\u0010;R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u0010$\u001a\u0004\b<\u0010&R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b(\u0010=\u001a\u0004\b4\u0010\u001cR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010$\u001a\u0004\b>\u0010&R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b%\u0010?\u001a\u0004\b-\u0010@¨\u0006A"}, d2 = {"Lcom/ingka/ikea/app/browseandsearch/browseV2/b;", "", "", "isLoading", "showOfferHubEntryLoading", "error", "Lqe/b;", "alertMessageState", "LEs/a;", "inboxState", "LKJ/c;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$b;", "recentProducts", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a;", "categoriesAndRoomSection", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "lastChanceProducts", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$d;", "recommendations", "showLoginPromotion", "", "legalInformationFooter", "showScannerButton", "LQr/b$c;", "kreativEntryPointModel", "<init>", "(ZZZLqe/b;LEs/a;LKJ/c;Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a;Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;Lcom/ingka/ikea/app/browseandsearch/browseV2/b$d;ZLjava/lang/String;ZLQr/b$c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "m", "()Z", "b", "k", "c", "d", "Lqe/b;", "()Lqe/b;", "e", "LEs/a;", "()LEs/a;", "f", "LKJ/c;", "h", "()LKJ/c;", "g", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a;", "()Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "()Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "i", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$d;", "()Lcom/ingka/ikea/app/browseandsearch/browseV2/b$d;", "j", "Ljava/lang/String;", "l", "LQr/b$c;", "()LQr/b$c;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f70277a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f70278b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f70279c;

    /* renamed from: d  reason: collision with root package name */
    private final C10189b f70280d;

    /* renamed from: e  reason: collision with root package name */
    private final Es.a f70281e;

    /* renamed from: f  reason: collision with root package name */
    private final C15987c<C1213b> f70282f;

    /* renamed from: g  reason: collision with root package name */
    private final a f70283g;

    /* renamed from: h  reason: collision with root package name */
    private final c f70284h;

    /* renamed from: i  reason: collision with root package name */
    private final d f70285i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f70286j;

    /* renamed from: k  reason: collision with root package name */
    private final String f70287k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f70288l;

    /* renamed from: m  reason: collision with root package name */
    private final b.c f70289m;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001:\u0001\u0017B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001c\u0010\u001eR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a;", "", "LKJ/c;", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a$a;", "tabs", "Lcom/ingka/ikea/core/model/Category;", "categories", "", "showMoreCategoriesButton", "showOfferHubEntry", "LBf/a;", "staticImagesState", "<init>", "(LKJ/c;LKJ/c;ZZLBf/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "e", "()LKJ/c;", "b", "c", "Z", "()Z", "d", "LBf/a;", "()LBf/a;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<C1212a> f70290a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<Category> f70291b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f70292c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f70293d;

        /* renamed from: e  reason: collision with root package name */
        private final Bf.a f70294e;

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/ingka/ikea/app/browseandsearch/browseV2/b$a$a;", "", "", "title", "", "isSelected", "Lyf/g;", "type", "<init>", "(IZLyf/g;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Z", "c", "()Z", "Lyf/g;", "()Lyf/g;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.browseandsearch.browseV2.b$a$a  reason: collision with other inner class name */
        public static final class C1212a {

            /* renamed from: a  reason: collision with root package name */
            private final int f70295a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f70296b;

            /* renamed from: c  reason: collision with root package name */
            private final g f70297c;

            public C1212a(int i10, boolean z10, g gVar) {
                C17542s.j(gVar, "type");
                this.f70295a = i10;
                this.f70296b = z10;
                this.f70297c = gVar;
            }

            public final int a() {
                return this.f70295a;
            }

            public final g b() {
                return this.f70297c;
            }

            public final boolean c() {
                return this.f70296b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1212a)) {
                    return false;
                }
                C1212a aVar = (C1212a) obj;
                return this.f70295a == aVar.f70295a && this.f70296b == aVar.f70296b && this.f70297c == aVar.f70297c;
            }

            public int hashCode() {
                return (((Integer.hashCode(this.f70295a) * 31) + Boolean.hashCode(this.f70296b)) * 31) + this.f70297c.hashCode();
            }

            public String toString() {
                int i10 = this.f70295a;
                boolean z10 = this.f70296b;
                g gVar = this.f70297c;
                return "Tab(title=" + i10 + ", isSelected=" + z10 + ", type=" + gVar + ")";
            }
        }

        public a(C15987c<C1212a> cVar, C15987c<Category> cVar2, boolean z10, boolean z11, Bf.a aVar) {
            C17542s.j(cVar, "tabs");
            C17542s.j(cVar2, "categories");
            C17542s.j(aVar, "staticImagesState");
            this.f70290a = cVar;
            this.f70291b = cVar2;
            this.f70292c = z10;
            this.f70293d = z11;
            this.f70294e = aVar;
        }

        public final C15987c<Category> a() {
            return this.f70291b;
        }

        public final boolean b() {
            return this.f70292c;
        }

        public final boolean c() {
            return this.f70293d;
        }

        public final Bf.a d() {
            return this.f70294e;
        }

        public final C15987c<C1212a> e() {
            return this.f70290a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f70290a, aVar.f70290a) && C17542s.e(this.f70291b, aVar.f70291b) && this.f70292c == aVar.f70292c && this.f70293d == aVar.f70293d && C17542s.e(this.f70294e, aVar.f70294e);
        }

        public int hashCode() {
            return (((((((this.f70290a.hashCode() * 31) + this.f70291b.hashCode()) * 31) + Boolean.hashCode(this.f70292c)) * 31) + Boolean.hashCode(this.f70293d)) * 31) + this.f70294e.hashCode();
        }

        public String toString() {
            C15987c<C1212a> cVar = this.f70290a;
            C15987c<Category> cVar2 = this.f70291b;
            boolean z10 = this.f70292c;
            boolean z11 = this.f70293d;
            Bf.a aVar = this.f70294e;
            return "CategoriesAndRoomSection(tabs=" + cVar + ", categories=" + cVar2 + ", showMoreCategoriesButton=" + z10 + ", showOfferHubEntry=" + z11 + ", staticImagesState=" + aVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/ingka/ikea/app/browseandsearch/browseV2/b$b;", "", "", "itemNo", "imageUrl", "productName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.app.browseandsearch.browseV2.b$b  reason: collision with other inner class name */
    public static final class C1213b {

        /* renamed from: a  reason: collision with root package name */
        private final String f70298a;

        /* renamed from: b  reason: collision with root package name */
        private final String f70299b;

        /* renamed from: c  reason: collision with root package name */
        private final String f70300c;

        public C1213b(String str, String str2, String str3) {
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "imageUrl");
            C17542s.j(str3, "productName");
            this.f70298a = str;
            this.f70299b = str2;
            this.f70300c = str3;
        }

        public final String a() {
            return this.f70299b;
        }

        public final String b() {
            return this.f70298a;
        }

        public final String c() {
            return this.f70300c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1213b)) {
                return false;
            }
            C1213b bVar = (C1213b) obj;
            return C17542s.e(this.f70298a, bVar.f70298a) && C17542s.e(this.f70299b, bVar.f70299b) && C17542s.e(this.f70300c, bVar.f70300c);
        }

        public int hashCode() {
            return (((this.f70298a.hashCode() * 31) + this.f70299b.hashCode()) * 31) + this.f70300c.hashCode();
        }

        public String toString() {
            String str = this.f70298a;
            String str2 = this.f70299b;
            String str3 = this.f70300c;
            return "LocalRecentProduct(itemNo=" + str + ", imageUrl=" + str2 + ", productName=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "", "", "id", "title", "LKJ/c;", "LOp/d1;", "products", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LKJ/c;", "()LKJ/c;", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f70301a;

        /* renamed from: b  reason: collision with root package name */
        private final String f70302b;

        /* renamed from: c  reason: collision with root package name */
        private final C15987c<d1> f70303c;

        public c(String str, String str2, C15987c<d1> cVar) {
            C17542s.j(str, "id");
            C17542s.j(str2, "title");
            C17542s.j(cVar, "products");
            this.f70301a = str;
            this.f70302b = str2;
            this.f70303c = cVar;
        }

        public final String a() {
            return this.f70301a;
        }

        public final C15987c<d1> b() {
            return this.f70303c;
        }

        public final String c() {
            return this.f70302b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f70301a, cVar.f70301a) && C17542s.e(this.f70302b, cVar.f70302b) && C17542s.e(this.f70303c, cVar.f70303c);
        }

        public int hashCode() {
            return (((this.f70301a.hashCode() * 31) + this.f70302b.hashCode()) * 31) + this.f70303c.hashCode();
        }

        public String toString() {
            String str = this.f70301a;
            String str2 = this.f70302b;
            C15987c<d1> cVar = this.f70303c;
            return "ProductSection(id=" + str + ", title=" + str2 + ", products=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B/\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/ingka/ikea/app/browseandsearch/browseV2/b$d;", "", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "productSection", "", "", "currentItemNos", "", "isLoading", "<init>", "(Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;Ljava/util/List;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "b", "()Lcom/ingka/ikea/app/browseandsearch/browseV2/b$c;", "Ljava/util/List;", "()Ljava/util/List;", "c", "Z", "()Z", "browse-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {

        /* renamed from: a  reason: collision with root package name */
        private final c f70304a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f70305b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f70306c;

        public d() {
            this((c) null, (List) null, false, 7, (DefaultConstructorMarker) null);
        }

        public final List<String> a() {
            return this.f70305b;
        }

        public final c b() {
            return this.f70304a;
        }

        public final boolean c() {
            return this.f70306c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return C17542s.e(this.f70304a, dVar.f70304a) && C17542s.e(this.f70305b, dVar.f70305b) && this.f70306c == dVar.f70306c;
        }

        public int hashCode() {
            c cVar = this.f70304a;
            int i10 = 0;
            int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
            List<String> list = this.f70305b;
            if (list != null) {
                i10 = list.hashCode();
            }
            return ((hashCode + i10) * 31) + Boolean.hashCode(this.f70306c);
        }

        public String toString() {
            c cVar = this.f70304a;
            List<String> list = this.f70305b;
            boolean z10 = this.f70306c;
            return "RecommendationsSection(productSection=" + cVar + ", currentItemNos=" + list + ", isLoading=" + z10 + ")";
        }

        public d(c cVar, List<String> list, boolean z10) {
            this.f70304a = cVar;
            this.f70305b = list;
            this.f70306c = z10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ d(c cVar, List list, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? null : cVar, (i10 & 2) != 0 ? null : list, (i10 & 4) != 0 ? false : z10);
        }
    }

    public b() {
        this(false, false, false, (C10189b) null, (Es.a) null, (C15987c) null, (a) null, (c) null, (d) null, false, (String) null, false, (b.c) null, 8191, (DefaultConstructorMarker) null);
    }

    public final C10189b a() {
        return this.f70280d;
    }

    public final a b() {
        return this.f70283g;
    }

    public final boolean c() {
        return this.f70279c;
    }

    public final Es.a d() {
        return this.f70281e;
    }

    public final b.c e() {
        return this.f70289m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f70277a == bVar.f70277a && this.f70278b == bVar.f70278b && this.f70279c == bVar.f70279c && C17542s.e(this.f70280d, bVar.f70280d) && C17542s.e(this.f70281e, bVar.f70281e) && C17542s.e(this.f70282f, bVar.f70282f) && C17542s.e(this.f70283g, bVar.f70283g) && C17542s.e(this.f70284h, bVar.f70284h) && C17542s.e(this.f70285i, bVar.f70285i) && this.f70286j == bVar.f70286j && C17542s.e(this.f70287k, bVar.f70287k) && this.f70288l == bVar.f70288l && C17542s.e(this.f70289m, bVar.f70289m);
    }

    public final c f() {
        return this.f70284h;
    }

    public final String g() {
        return this.f70287k;
    }

    public final C15987c<C1213b> h() {
        return this.f70282f;
    }

    public int hashCode() {
        int hashCode = ((((((((((Boolean.hashCode(this.f70277a) * 31) + Boolean.hashCode(this.f70278b)) * 31) + Boolean.hashCode(this.f70279c)) * 31) + this.f70280d.hashCode()) * 31) + this.f70281e.hashCode()) * 31) + this.f70282f.hashCode()) * 31;
        a aVar = this.f70283g;
        int i10 = 0;
        int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        c cVar = this.f70284h;
        int hashCode3 = (((((((((hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f70285i.hashCode()) * 31) + Boolean.hashCode(this.f70286j)) * 31) + this.f70287k.hashCode()) * 31) + Boolean.hashCode(this.f70288l)) * 31;
        b.c cVar2 = this.f70289m;
        if (cVar2 != null) {
            i10 = cVar2.hashCode();
        }
        return hashCode3 + i10;
    }

    public final d i() {
        return this.f70285i;
    }

    public final boolean j() {
        return this.f70286j;
    }

    public final boolean k() {
        return this.f70278b;
    }

    public final boolean l() {
        return this.f70288l;
    }

    public final boolean m() {
        return this.f70277a;
    }

    public String toString() {
        boolean z10 = this.f70277a;
        boolean z11 = this.f70278b;
        boolean z12 = this.f70279c;
        C10189b bVar = this.f70280d;
        Es.a aVar = this.f70281e;
        C15987c<C1213b> cVar = this.f70282f;
        a aVar2 = this.f70283g;
        c cVar2 = this.f70284h;
        d dVar = this.f70285i;
        boolean z13 = this.f70286j;
        String str = this.f70287k;
        boolean z14 = this.f70288l;
        b.c cVar3 = this.f70289m;
        return "BrowseV2UiState(isLoading=" + z10 + ", showOfferHubEntryLoading=" + z11 + ", error=" + z12 + ", alertMessageState=" + bVar + ", inboxState=" + aVar + ", recentProducts=" + cVar + ", categoriesAndRoomSection=" + aVar2 + ", lastChanceProducts=" + cVar2 + ", recommendations=" + dVar + ", showLoginPromotion=" + z13 + ", legalInformationFooter=" + str + ", showScannerButton=" + z14 + ", kreativEntryPointModel=" + cVar3 + ")";
    }

    public b(boolean z10, boolean z11, boolean z12, C10189b bVar, Es.a aVar, C15987c<C1213b> cVar, a aVar2, c cVar2, d dVar, boolean z13, String str, boolean z14, b.c cVar3) {
        C17542s.j(bVar, "alertMessageState");
        C17542s.j(aVar, "inboxState");
        C17542s.j(cVar, "recentProducts");
        C17542s.j(dVar, "recommendations");
        C17542s.j(str, "legalInformationFooter");
        this.f70277a = z10;
        this.f70278b = z11;
        this.f70279c = z12;
        this.f70280d = bVar;
        this.f70281e = aVar;
        this.f70282f = cVar;
        this.f70283g = aVar2;
        this.f70284h = cVar2;
        this.f70285i = dVar;
        this.f70286j = z13;
        this.f70287k = str;
        this.f70288l = z14;
        this.f70289m = cVar3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ b(boolean r18, boolean r19, boolean r20, qe.C10189b r21, Es.a r22, KJ.C15987c r23, com.ingka.ikea.app.browseandsearch.browseV2.b.a r24, com.ingka.ikea.app.browseandsearch.browseV2.b.c r25, com.ingka.ikea.app.browseandsearch.browseV2.b.d r26, boolean r27, java.lang.String r28, boolean r29, Qr.b.c r30, int r31, kotlin.jvm.internal.DefaultConstructorMarker r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000b
        L_0x0009:
            r1 = r18
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0011
            r3 = r2
            goto L_0x0013
        L_0x0011:
            r3 = r19
        L_0x0013:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0019
            r4 = r2
            goto L_0x001b
        L_0x0019:
            r4 = r20
        L_0x001b:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x0022
            qe.b$c r5 = qe.C10189b.c.f76050a
            goto L_0x0024
        L_0x0022:
            r5 = r21
        L_0x0024:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x002b
            Es.a$b r6 = Es.a.b.f80780a
            goto L_0x002d
        L_0x002b:
            r6 = r22
        L_0x002d:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x0036
            KJ.f r7 = KJ.C15985a.a()
            goto L_0x0038
        L_0x0036:
            r7 = r23
        L_0x0038:
            r8 = r0 & 64
            r9 = 0
            if (r8 == 0) goto L_0x003f
            r8 = r9
            goto L_0x0041
        L_0x003f:
            r8 = r24
        L_0x0041:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0047
            r10 = r9
            goto L_0x0049
        L_0x0047:
            r10 = r25
        L_0x0049:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0065
            com.ingka.ikea.app.browseandsearch.browseV2.b$d r11 = new com.ingka.ikea.app.browseandsearch.browseV2.b$d
            r12 = 7
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r18 = r11
            r19 = r14
            r20 = r15
            r21 = r16
            r22 = r12
            r23 = r13
            r18.<init>(r19, r20, r21, r22, r23)
            goto L_0x0067
        L_0x0065:
            r11 = r26
        L_0x0067:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x006d
            r12 = r2
            goto L_0x006f
        L_0x006d:
            r12 = r27
        L_0x006f:
            r13 = r0 & 1024(0x400, float:1.435E-42)
            if (r13 == 0) goto L_0x0076
            java.lang.String r13 = ""
            goto L_0x0078
        L_0x0076:
            r13 = r28
        L_0x0078:
            r14 = r0 & 2048(0x800, float:2.87E-42)
            if (r14 == 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r2 = r29
        L_0x007f:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0084
            goto L_0x0086
        L_0x0084:
            r9 = r30
        L_0x0086:
            r18 = r17
            r19 = r1
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r10
            r27 = r11
            r28 = r12
            r29 = r13
            r30 = r2
            r31 = r9
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.browseandsearch.browseV2.b.<init>(boolean, boolean, boolean, qe.b, Es.a, KJ.c, com.ingka.ikea.app.browseandsearch.browseV2.b$a, com.ingka.ikea.app.browseandsearch.browseV2.b$c, com.ingka.ikea.app.browseandsearch.browseV2.b$d, boolean, java.lang.String, boolean, Qr.b$c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
