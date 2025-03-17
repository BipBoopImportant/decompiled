package Iz;

import EB.C12831c;
import com.google.android.libraries.places.api.model.PlaceTypes;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\n\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"LIz/t;", "", "<init>", "()V", "", "c", "()Ljava/lang/String;", "marketCode", "b", "languageCode", "a", "additionalInfo", "d", "storeId", "e", "storeName", "LIz/t$a;", "LIz/t$b;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.t  reason: case insensitive filesystem */
public abstract class C13053t {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001c\u0010\u000b¨\u0006\u001f"}, d2 = {"LIz/t$a;", "LIz/t;", "", "marketCode", "languageCode", "additionalInfo", "LEB/c;", "store", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LEB/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "LEB/c;", "f", "()LEB/c;", "e", "storeId", "storeName", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iz.t$a */
    public static final class a extends C13053t {

        /* renamed from: a  reason: collision with root package name */
        private final String f111161a;

        /* renamed from: b  reason: collision with root package name */
        private final String f111162b;

        /* renamed from: c  reason: collision with root package name */
        private final String f111163c;

        /* renamed from: d  reason: collision with root package name */
        private final C12831c f111164d;

        /* renamed from: e  reason: collision with root package name */
        private final String f111165e;

        /* renamed from: f  reason: collision with root package name */
        private final String f111166f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, C12831c cVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "marketCode");
            C17542s.j(str2, "languageCode");
            C17542s.j(str3, "additionalInfo");
            C17542s.j(cVar, PlaceTypes.STORE);
            this.f111161a = str;
            this.f111162b = str2;
            this.f111163c = str3;
            this.f111164d = cVar;
            this.f111165e = cVar.g();
            this.f111166f = cVar.h();
        }

        public String a() {
            return this.f111163c;
        }

        public String b() {
            return this.f111162b;
        }

        public String c() {
            return this.f111161a;
        }

        public String d() {
            return this.f111165e;
        }

        public String e() {
            return this.f111166f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f111161a, aVar.f111161a) && C17542s.e(this.f111162b, aVar.f111162b) && C17542s.e(this.f111163c, aVar.f111163c) && C17542s.e(this.f111164d, aVar.f111164d);
        }

        public final C12831c f() {
            return this.f111164d;
        }

        public int hashCode() {
            return (((((this.f111161a.hashCode() * 31) + this.f111162b.hashCode()) * 31) + this.f111163c.hashCode()) * 31) + this.f111164d.hashCode();
        }

        public String toString() {
            String str = this.f111161a;
            String str2 = this.f111162b;
            String str3 = this.f111163c;
            C12831c cVar = this.f111164d;
            return "WithStoreDetails(marketCode=" + str + ", languageCode=" + str2 + ", additionalInfo=" + str3 + ", store=" + cVar + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"LIz/t$b;", "LIz/t;", "", "marketCode", "languageCode", "additionalInfo", "storeId", "storeName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "d", "e", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iz.t$b */
    public static final class b extends C13053t {

        /* renamed from: a  reason: collision with root package name */
        private final String f111167a;

        /* renamed from: b  reason: collision with root package name */
        private final String f111168b;

        /* renamed from: c  reason: collision with root package name */
        private final String f111169c;

        /* renamed from: d  reason: collision with root package name */
        private final String f111170d;

        /* renamed from: e  reason: collision with root package name */
        private final String f111171e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, String str3, String str4, String str5) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "marketCode");
            C17542s.j(str2, "languageCode");
            C17542s.j(str3, "additionalInfo");
            C17542s.j(str4, "storeId");
            C17542s.j(str5, "storeName");
            this.f111167a = str;
            this.f111168b = str2;
            this.f111169c = str3;
            this.f111170d = str4;
            this.f111171e = str5;
        }

        public String a() {
            return this.f111169c;
        }

        public String b() {
            return this.f111168b;
        }

        public String c() {
            return this.f111167a;
        }

        public String d() {
            return this.f111170d;
        }

        public String e() {
            return this.f111171e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f111167a, bVar.f111167a) && C17542s.e(this.f111168b, bVar.f111168b) && C17542s.e(this.f111169c, bVar.f111169c) && C17542s.e(this.f111170d, bVar.f111170d) && C17542s.e(this.f111171e, bVar.f111171e);
        }

        public int hashCode() {
            return (((((((this.f111167a.hashCode() * 31) + this.f111168b.hashCode()) * 31) + this.f111169c.hashCode()) * 31) + this.f111170d.hashCode()) * 31) + this.f111171e.hashCode();
        }

        public String toString() {
            String str = this.f111167a;
            String str2 = this.f111168b;
            String str3 = this.f111169c;
            String str4 = this.f111170d;
            String str5 = this.f111171e;
            return "WithStoreId(marketCode=" + str + ", languageCode=" + str2 + ", additionalInfo=" + str3 + ", storeId=" + str4 + ", storeName=" + str5 + ")";
        }
    }

    public /* synthetic */ C13053t(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();

    private C13053t() {
    }
}
