package oj;

import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\t\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\n\u0001\u0002\u000e\u000f¨\u0006\u0010"}, d2 = {"Loj/a;", "", "<init>", "()V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "a", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "b", "()Ljava/lang/String;", "itemNo", "c", "storeId", "Loj/a$a;", "Loj/a$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oj.a  reason: case insensitive filesystem */
public abstract class C11680a {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"Loj/a$a;", "Loj/a;", "", "itemNo", "storeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/ingka/ikea/analytics/Interaction$Component;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oj.a$a  reason: collision with other inner class name */
    public static final class C2338a extends C11680a {

        /* renamed from: a  reason: collision with root package name */
        private final String f100403a;

        /* renamed from: b  reason: collision with root package name */
        private final String f100404b;

        /* renamed from: c  reason: collision with root package name */
        private final Interaction$Component f100405c = Interaction$Component.MULTIPLE_PACKAGE_BOTTOM_SHEET;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2338a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "storeId");
            this.f100403a = str;
            this.f100404b = str2;
        }

        public Interaction$Component a() {
            return this.f100405c;
        }

        public String b() {
            return this.f100403a;
        }

        public String c() {
            return this.f100404b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2338a)) {
                return false;
            }
            C2338a aVar = (C2338a) obj;
            return C17542s.e(this.f100403a, aVar.f100403a) && C17542s.e(this.f100404b, aVar.f100404b);
        }

        public int hashCode() {
            return (this.f100403a.hashCode() * 31) + this.f100404b.hashCode();
        }

        public String toString() {
            String str = this.f100403a;
            String str2 = this.f100404b;
            return "MultiPackageShownEvent(itemNo=" + str + ", storeId=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"Loj/a$b;", "Loj/a;", "", "itemNo", "storeId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Lcom/ingka/ikea/analytics/Interaction$Component;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: oj.a$b */
    public static final class b extends C11680a {

        /* renamed from: a  reason: collision with root package name */
        private final String f100406a;

        /* renamed from: b  reason: collision with root package name */
        private final String f100407b;

        /* renamed from: c  reason: collision with root package name */
        private final Interaction$Component f100408c = Interaction$Component.MUST_HAVE_BOTTOM_SHEET;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "storeId");
            this.f100406a = str;
            this.f100407b = str2;
        }

        public Interaction$Component a() {
            return this.f100408c;
        }

        public String b() {
            return this.f100406a;
        }

        public String c() {
            return this.f100407b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f100406a, bVar.f100406a) && C17542s.e(this.f100407b, bVar.f100407b);
        }

        public int hashCode() {
            return (this.f100406a.hashCode() * 31) + this.f100407b.hashCode();
        }

        public String toString() {
            String str = this.f100406a;
            String str2 = this.f100407b;
            return "MustHavesShownEvent(itemNo=" + str + ", storeId=" + str2 + ")";
        }
    }

    public /* synthetic */ C11680a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract Interaction$Component a();

    public abstract String b();

    public abstract String c();

    private C11680a() {
    }
}
