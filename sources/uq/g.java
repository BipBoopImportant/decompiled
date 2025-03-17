package uq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u000b2\u00020\u0001:\n\u0007\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t\u0001\t\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Luq/g;", "", "", "eventName", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Luq/g$a;", "Luq/g$b;", "Luq/g$c;", "Luq/g$e;", "Luq/g$f;", "Luq/g$g;", "Luq/g$h;", "Luq/g$i;", "Luq/g$j;", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class g {

    /* renamed from: c  reason: collision with root package name */
    public static final d f104008c = new d((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f104009a;

    /* renamed from: b  reason: collision with root package name */
    private final String f104010b;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Luq/g$a;", "Luq/g;", "", "itemNo", "", "quantity", "origin", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "c", "e", "I", "f", "b", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104011d;

        /* renamed from: e  reason: collision with root package name */
        private final int f104012e;

        /* renamed from: f  reason: collision with root package name */
        private final String f104013f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, int i10, String str2) {
            super("add_to_cart", str2, (DefaultConstructorMarker) null);
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "origin");
            this.f104011d = str;
            this.f104012e = i10;
            this.f104013f = str2;
        }

        public String b() {
            return this.f104013f;
        }

        public final String c() {
            return this.f104011d;
        }

        public final int d() {
            return this.f104012e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f104011d, aVar.f104011d) && this.f104012e == aVar.f104012e && C17542s.e(this.f104013f, aVar.f104013f);
        }

        public int hashCode() {
            return (((this.f104011d.hashCode() * 31) + Integer.hashCode(this.f104012e)) * 31) + this.f104013f.hashCode();
        }

        public String toString() {
            String str = this.f104011d;
            int i10 = this.f104012e;
            String str2 = this.f104013f;
            return "AddToCart(itemNo=" + str + ", quantity=" + i10 + ", origin=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Luq/g$b;", "Luq/g;", "", "itemNo", "", "quantity", "origin", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "c", "e", "I", "f", "b", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104014d;

        /* renamed from: e  reason: collision with root package name */
        private final int f104015e;

        /* renamed from: f  reason: collision with root package name */
        private final String f104016f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, int i10, String str2) {
            super("add_to_wishlist", str2, (DefaultConstructorMarker) null);
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "origin");
            this.f104014d = str;
            this.f104015e = i10;
            this.f104016f = str2;
        }

        public String b() {
            return this.f104016f;
        }

        public final String c() {
            return this.f104014d;
        }

        public final int d() {
            return this.f104015e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f104014d, bVar.f104014d) && this.f104015e == bVar.f104015e && C17542s.e(this.f104016f, bVar.f104016f);
        }

        public int hashCode() {
            return (((this.f104014d.hashCode() * 31) + Integer.hashCode(this.f104015e)) * 31) + this.f104016f.hashCode();
        }

        public String toString() {
            String str = this.f104014d;
            int i10 = this.f104015e;
            String str2 = this.f104016f;
            return "AddToWishlist(itemNo=" + str + ", quantity=" + i10 + ", origin=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007¨\u0006\u0013"}, d2 = {"Luq/g$c;", "Luq/g;", "", "deeplinkFullUrl", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "getDeeplinkFullUrl", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104017d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super("app_entry", str, (DefaultConstructorMarker) null);
            C17542s.j(str, "deeplinkFullUrl");
            this.f104017d = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f104017d, ((c) obj).f104017d);
        }

        public int hashCode() {
            return this.f104017d.hashCode();
        }

        public String toString() {
            String str = this.f104017d;
            return "AppEntry(deeplinkFullUrl=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006¨\u0006\u0013"}, d2 = {"Luq/g$d;", "", "<init>", "()V", "", "ADD_TO_CART_EVENT", "Ljava/lang/String;", "ADD_TO_WISHLIST_EVENT", "APP_ENTRY", "DOT_CLICK_EVENT", "EPISOD_ENGINE_ORIGIN", "EVENT_ORIGIN", "INSPIRATION_INTERACTION_CATEGORY", "MODAL_OPENED_EVENT", "REMOVE_FROM_CART_EVENT", "REMOVE_FROM_WISHLIST_EVENT", "SELECT_CONTENT_EVENT", "SESSION_START_EVENT", "VIEW_ITEM_EVENT", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0012\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0004R\u001a\u0010\u0019\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0017\u0010\u000e\u001a\u0004\b\u0018\u0010\u0004¨\u0006\u001a"}, d2 = {"Luq/g$e;", "Luq/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "e", "imageId", "componentType", "f", "label", "g", "b", "origin", "h", "c", "category", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class e extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104018d;

        /* renamed from: e  reason: collision with root package name */
        private final String f104019e;

        /* renamed from: f  reason: collision with root package name */
        private final String f104020f;

        /* renamed from: g  reason: collision with root package name */
        private final String f104021g;

        /* renamed from: h  reason: collision with root package name */
        private final String f104022h;

        public String b() {
            return this.f104021g;
        }

        public final String c() {
            return this.f104022h;
        }

        public final String d() {
            return this.f104019e;
        }

        public final String e() {
            return this.f104018d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f104018d, eVar.f104018d) && C17542s.e(this.f104019e, eVar.f104019e) && C17542s.e(this.f104020f, eVar.f104020f) && C17542s.e(this.f104021g, eVar.f104021g);
        }

        public final String f() {
            return this.f104020f;
        }

        public int hashCode() {
            return (((((this.f104018d.hashCode() * 31) + this.f104019e.hashCode()) * 31) + this.f104020f.hashCode()) * 31) + this.f104021g.hashCode();
        }

        public String toString() {
            String str = this.f104018d;
            String str2 = this.f104019e;
            String str3 = this.f104020f;
            String str4 = this.f104021g;
            return "DotClick(imageId=" + str + ", componentType=" + str2 + ", label=" + str3 + ", origin=" + str4 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0004R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0015\u0010\u000e\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Luq/g$f;", "Luq/g;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "e", "imageId", "componentType", "f", "b", "origin", "g", "c", "category", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104023d;

        /* renamed from: e  reason: collision with root package name */
        private final String f104024e;

        /* renamed from: f  reason: collision with root package name */
        private final String f104025f;

        /* renamed from: g  reason: collision with root package name */
        private final String f104026g;

        public String b() {
            return this.f104025f;
        }

        public final String c() {
            return this.f104026g;
        }

        public final String d() {
            return this.f104024e;
        }

        public final String e() {
            return this.f104023d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return C17542s.e(this.f104023d, fVar.f104023d) && C17542s.e(this.f104024e, fVar.f104024e) && C17542s.e(this.f104025f, fVar.f104025f);
        }

        public int hashCode() {
            return (((this.f104023d.hashCode() * 31) + this.f104024e.hashCode()) * 31) + this.f104025f.hashCode();
        }

        public String toString() {
            String str = this.f104023d;
            String str2 = this.f104024e;
            String str3 = this.f104025f;
            return "ModalOpened(imageId=" + str + ", componentType=" + str2 + ", origin=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Luq/g$g;", "Luq/g;", "", "itemNo", "", "quantity", "origin", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "c", "e", "I", "f", "b", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: uq.g$g  reason: collision with other inner class name */
    public static final class C2481g extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104027d;

        /* renamed from: e  reason: collision with root package name */
        private final int f104028e;

        /* renamed from: f  reason: collision with root package name */
        private final String f104029f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2481g(String str, int i10, String str2) {
            super("remove_from_cart", str2, (DefaultConstructorMarker) null);
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "origin");
            this.f104027d = str;
            this.f104028e = i10;
            this.f104029f = str2;
        }

        public String b() {
            return this.f104029f;
        }

        public final String c() {
            return this.f104027d;
        }

        public final int d() {
            return this.f104028e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2481g)) {
                return false;
            }
            C2481g gVar = (C2481g) obj;
            return C17542s.e(this.f104027d, gVar.f104027d) && this.f104028e == gVar.f104028e && C17542s.e(this.f104029f, gVar.f104029f);
        }

        public int hashCode() {
            return (((this.f104027d.hashCode() * 31) + Integer.hashCode(this.f104028e)) * 31) + this.f104029f.hashCode();
        }

        public String toString() {
            String str = this.f104027d;
            int i10 = this.f104028e;
            String str2 = this.f104029f;
            return "RemoveFromCart(itemNo=" + str + ", quantity=" + i10 + ", origin=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\n¨\u0006\u0019"}, d2 = {"Luq/g$h;", "Luq/g;", "", "itemNo", "", "quantity", "origin", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "c", "e", "I", "f", "b", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class h extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104030d;

        /* renamed from: e  reason: collision with root package name */
        private final int f104031e;

        /* renamed from: f  reason: collision with root package name */
        private final String f104032f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(String str, int i10, String str2) {
            super("remove_from_wishlist", str2, (DefaultConstructorMarker) null);
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "origin");
            this.f104030d = str;
            this.f104031e = i10;
            this.f104032f = str2;
        }

        public String b() {
            return this.f104032f;
        }

        public final String c() {
            return this.f104030d;
        }

        public final int d() {
            return this.f104031e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return C17542s.e(this.f104030d, hVar.f104030d) && this.f104031e == hVar.f104031e && C17542s.e(this.f104032f, hVar.f104032f);
        }

        public int hashCode() {
            return (((this.f104030d.hashCode() * 31) + Integer.hashCode(this.f104031e)) * 31) + this.f104032f.hashCode();
        }

        public String toString() {
            String str = this.f104030d;
            int i10 = this.f104031e;
            String str2 = this.f104032f;
            return "RemoveFromWishlist(itemNo=" + str + ", quantity=" + i10 + ", origin=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u0019\u001a\u00020\u00028\u0006XD¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u001a"}, d2 = {"Luq/g$i;", "Luq/g;", "", "inspirationId", "componentType", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "e", "f", "b", "g", "c", "category", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104033d;

        /* renamed from: e  reason: collision with root package name */
        private final String f104034e;

        /* renamed from: f  reason: collision with root package name */
        private final String f104035f;

        /* renamed from: g  reason: collision with root package name */
        private final String f104036g = "inspiration_interaction";

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, String str3) {
            super("select_content", str3, (DefaultConstructorMarker) null);
            C17542s.j(str, "inspirationId");
            C17542s.j(str2, "componentType");
            C17542s.j(str3, "origin");
            this.f104033d = str;
            this.f104034e = str2;
            this.f104035f = str3;
        }

        public String b() {
            return this.f104035f;
        }

        public final String c() {
            return this.f104036g;
        }

        public final String d() {
            return this.f104034e;
        }

        public final String e() {
            return this.f104033d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return C17542s.e(this.f104033d, iVar.f104033d) && C17542s.e(this.f104034e, iVar.f104034e) && C17542s.e(this.f104035f, iVar.f104035f);
        }

        public int hashCode() {
            return (((this.f104033d.hashCode() * 31) + this.f104034e.hashCode()) * 31) + this.f104035f.hashCode();
        }

        public String toString() {
            String str = this.f104033d;
            String str2 = this.f104034e;
            String str3 = this.f104035f;
            return "SelectContent(inspirationId=" + str + ", componentType=" + str2 + ", origin=" + str3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\b¨\u0006\u0016"}, d2 = {"Luq/g$j;", "Luq/g;", "", "itemNo", "origin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ljava/lang/String;", "c", "e", "b", "episod-events_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class j extends g {

        /* renamed from: d  reason: collision with root package name */
        private final String f104037d;

        /* renamed from: e  reason: collision with root package name */
        private final String f104038e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(String str, String str2) {
            super("view_item", str2, (DefaultConstructorMarker) null);
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "origin");
            this.f104037d = str;
            this.f104038e = str2;
        }

        public String b() {
            return this.f104038e;
        }

        public final String c() {
            return this.f104037d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return C17542s.e(this.f104037d, jVar.f104037d) && C17542s.e(this.f104038e, jVar.f104038e);
        }

        public int hashCode() {
            return (this.f104037d.hashCode() * 31) + this.f104038e.hashCode();
        }

        public String toString() {
            String str = this.f104037d;
            String str2 = this.f104038e;
            return "ViewItem(itemNo=" + str + ", origin=" + str2 + ")";
        }
    }

    public /* synthetic */ g(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f104009a;
    }

    public String b() {
        return this.f104010b;
    }

    private g(String str, String str2) {
        this.f104009a = str;
        this.f104010b = str2;
    }
}
