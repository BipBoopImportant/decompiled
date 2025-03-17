package PB;

import EB.C12829a;
import IC.C13023e;
import KJ.C15987c;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fI.C17221b;
import gC.C14508a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0019\b\b\u0018\u00002\u00020\u0001:\u0002\u0014 Be\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jx\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b\"\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b+\u0010*R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b'\u0010.R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b+\u0010/\u001a\u0004\b#\u00100¨\u00061"}, d2 = {"LPB/g;", "", "", "storeId", "name", "address", "LIC/e;", "distanceLabel", "", "isShopAndGoEnabled", "stockDiffers", "LKJ/c;", "LPB/g$a;", "childStores", "LPB/g$b;", "extras", "LEB/a;", "buCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LIC/e;ZZLKJ/c;LKJ/c;LEB/a;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LIC/e;ZZLKJ/c;LKJ/c;LEB/a;)LPB/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "j", "b", "h", "c", "d", "LIC/e;", "f", "()LIC/e;", "e", "Z", "k", "()Z", "i", "g", "LKJ/c;", "()LKJ/c;", "LEB/a;", "()LEB/a;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* renamed from: j  reason: collision with root package name */
    public static final int f113865j = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final String f113866a;

    /* renamed from: b  reason: collision with root package name */
    private final String f113867b;

    /* renamed from: c  reason: collision with root package name */
    private final String f113868c;

    /* renamed from: d  reason: collision with root package name */
    private final C13023e f113869d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f113870e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f113871f;

    /* renamed from: g  reason: collision with root package name */
    private final C15987c<a> f113872g;

    /* renamed from: h  reason: collision with root package name */
    private final C15987c<b> f113873h;

    /* renamed from: i  reason: collision with root package name */
    private final C12829a f113874i;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"LPB/g$a;", "", "", "name", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f113875a;

        public a(String str) {
            C17542s.j(str, "name");
            this.f113875a = str;
        }

        public final String a() {
            return this.f113875a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f113875a, ((a) obj).f113875a);
        }

        public int hashCode() {
            return this.f113875a.hashCode();
        }

        public String toString() {
            String str = this.f113875a;
            return "ChildStore(name=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LPB/g$b;", "", "b", "a", "c", "d", "LPB/g$b$a;", "LPB/g$b$b;", "LPB/g$b$c;", "LPB/g$b$d;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"LPB/g$b$a;", "LPB/g$b;", "", "title", "LPB/g$b$a$a;", "status", "<init>", "(Ljava/lang/String;LPB/g$b$a$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LPB/g$b$a$a;", "()LPB/g$b$a$a;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements b {

            /* renamed from: a  reason: collision with root package name */
            private final String f113876a;

            /* renamed from: b  reason: collision with root package name */
            private final C2801a f113877b;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"LPB/g$b$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "IN_STOCK", "LOW_STOCK", "OUT_OF_STOCK", "INDETERMINATE", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: PB.g$b$a$a  reason: collision with other inner class name */
            public enum C2801a {
                IN_STOCK,
                LOW_STOCK,
                OUT_OF_STOCK,
                INDETERMINATE;

                static {
                    C2801a[] a10;
                    $ENTRIES = C17221b.a(a10);
                }
            }

            public a(String str, C2801a aVar) {
                C17542s.j(str, "title");
                C17542s.j(aVar, "status");
                this.f113876a = str;
                this.f113877b = aVar;
            }

            public final C2801a a() {
                return this.f113877b;
            }

            public final String b() {
                return this.f113876a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f113876a, aVar.f113876a) && this.f113877b == aVar.f113877b;
            }

            public int hashCode() {
                return (this.f113876a.hashCode() * 31) + this.f113877b.hashCode();
            }

            public String toString() {
                String str = this.f113876a;
                C2801a aVar = this.f113877b;
                return "InStoreStock(title=" + str + ", status=" + aVar + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LPB/g$b$b;", "LPB/g$b;", "", "lines", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: PB.g$b$b  reason: collision with other inner class name */
        public static final class C2802b implements b {

            /* renamed from: a  reason: collision with root package name */
            private final int f113878a;

            public C2802b(int i10) {
                this.f113878a = i10;
            }

            public final int a() {
                return this.f113878a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2802b) && this.f113878a == ((C2802b) obj).f113878a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f113878a);
            }

            public String toString() {
                int i10 = this.f113878a;
                return "Loading(lines=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"LPB/g$b$c;", "LPB/g$b;", "LIC/e;", "title", "", "available", "<init>", "(LIC/e;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "Z", "()Z", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class c implements b {

            /* renamed from: c  reason: collision with root package name */
            public static final int f113879c = C13023e.f110931a;

            /* renamed from: a  reason: collision with root package name */
            private final C13023e f113880a;

            /* renamed from: b  reason: collision with root package name */
            private final boolean f113881b;

            public c(C13023e eVar, boolean z10) {
                C17542s.j(eVar, "title");
                this.f113880a = eVar;
                this.f113881b = z10;
            }

            public final boolean a() {
                return this.f113881b;
            }

            public final C13023e b() {
                return this.f113880a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f113880a, cVar.f113880a) && this.f113881b == cVar.f113881b;
            }

            public int hashCode() {
                return (this.f113880a.hashCode() * 31) + Boolean.hashCode(this.f113881b);
            }

            public String toString() {
                C13023e eVar = this.f113880a;
                boolean z10 = this.f113881b;
                return "OnlineStock(title=" + eVar + ", available=" + z10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LPB/g$b$d;", "LPB/g$b;", "LgC/a$a;", "header", "<init>", "(LgC/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LgC/a$a;", "()LgC/a$a;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class d implements b {

            /* renamed from: b  reason: collision with root package name */
            public static final int f113882b = C14508a.C3116a.f127298d;

            /* renamed from: a  reason: collision with root package name */
            private final C14508a.C3116a f113883a;

            public d(C14508a.C3116a aVar) {
                C17542s.j(aVar, "header");
                this.f113883a = aVar;
            }

            public final C14508a.C3116a a() {
                return this.f113883a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && C17542s.e(this.f113883a, ((d) obj).f113883a);
            }

            public int hashCode() {
                return this.f113883a.hashCode();
            }

            public String toString() {
                C14508a.C3116a aVar = this.f113883a;
                return "OpeningHours(header=" + aVar + ")";
            }
        }
    }

    public g(String str, String str2, String str3, C13023e eVar, boolean z10, boolean z11, C15987c<a> cVar, C15987c<? extends b> cVar2, C12829a aVar) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "name");
        C17542s.j(str3, PlaceTypes.ADDRESS);
        C17542s.j(cVar, "childStores");
        C17542s.j(cVar2, "extras");
        C17542s.j(aVar, "buCode");
        this.f113866a = str;
        this.f113867b = str2;
        this.f113868c = str3;
        this.f113869d = eVar;
        this.f113870e = z10;
        this.f113871f = z11;
        this.f113872g = cVar;
        this.f113873h = cVar2;
        this.f113874i = aVar;
    }

    public static /* synthetic */ g b(g gVar, String str, String str2, String str3, C13023e eVar, boolean z10, boolean z11, C15987c cVar, C15987c cVar2, C12829a aVar, int i10, Object obj) {
        g gVar2 = gVar;
        int i11 = i10;
        return gVar.a((i11 & 1) != 0 ? gVar2.f113866a : str, (i11 & 2) != 0 ? gVar2.f113867b : str2, (i11 & 4) != 0 ? gVar2.f113868c : str3, (i11 & 8) != 0 ? gVar2.f113869d : eVar, (i11 & 16) != 0 ? gVar2.f113870e : z10, (i11 & 32) != 0 ? gVar2.f113871f : z11, (i11 & 64) != 0 ? gVar2.f113872g : cVar, (i11 & 128) != 0 ? gVar2.f113873h : cVar2, (i11 & 256) != 0 ? gVar2.f113874i : aVar);
    }

    public final g a(String str, String str2, String str3, C13023e eVar, boolean z10, boolean z11, C15987c<a> cVar, C15987c<? extends b> cVar2, C12829a aVar) {
        C17542s.j(str, "storeId");
        C17542s.j(str2, "name");
        C17542s.j(str3, PlaceTypes.ADDRESS);
        C15987c<a> cVar3 = cVar;
        C17542s.j(cVar3, "childStores");
        C15987c<? extends b> cVar4 = cVar2;
        C17542s.j(cVar4, "extras");
        C12829a aVar2 = aVar;
        C17542s.j(aVar2, "buCode");
        return new g(str, str2, str3, eVar, z10, z11, cVar3, cVar4, aVar2);
    }

    public final String c() {
        return this.f113868c;
    }

    public final C12829a d() {
        return this.f113874i;
    }

    public final C15987c<a> e() {
        return this.f113872g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return C17542s.e(this.f113866a, gVar.f113866a) && C17542s.e(this.f113867b, gVar.f113867b) && C17542s.e(this.f113868c, gVar.f113868c) && C17542s.e(this.f113869d, gVar.f113869d) && this.f113870e == gVar.f113870e && this.f113871f == gVar.f113871f && C17542s.e(this.f113872g, gVar.f113872g) && C17542s.e(this.f113873h, gVar.f113873h) && this.f113874i == gVar.f113874i;
    }

    public final C13023e f() {
        return this.f113869d;
    }

    public final C15987c<b> g() {
        return this.f113873h;
    }

    public final String h() {
        return this.f113867b;
    }

    public int hashCode() {
        int hashCode = ((((this.f113866a.hashCode() * 31) + this.f113867b.hashCode()) * 31) + this.f113868c.hashCode()) * 31;
        C13023e eVar = this.f113869d;
        return ((((((((((hashCode + (eVar == null ? 0 : eVar.hashCode())) * 31) + Boolean.hashCode(this.f113870e)) * 31) + Boolean.hashCode(this.f113871f)) * 31) + this.f113872g.hashCode()) * 31) + this.f113873h.hashCode()) * 31) + this.f113874i.hashCode();
    }

    public final boolean i() {
        return this.f113871f;
    }

    public final String j() {
        return this.f113866a;
    }

    public final boolean k() {
        return this.f113870e;
    }

    public String toString() {
        String str = this.f113866a;
        String str2 = this.f113867b;
        String str3 = this.f113868c;
        C13023e eVar = this.f113869d;
        boolean z10 = this.f113870e;
        boolean z11 = this.f113871f;
        C15987c<a> cVar = this.f113872g;
        C15987c<b> cVar2 = this.f113873h;
        C12829a aVar = this.f113874i;
        return "StoreItem(storeId=" + str + ", name=" + str2 + ", address=" + str3 + ", distanceLabel=" + eVar + ", isShopAndGoEnabled=" + z10 + ", stockDiffers=" + z11 + ", childStores=" + cVar + ", extras=" + cVar2 + ", buCode=" + aVar + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ g(java.lang.String r13, java.lang.String r14, java.lang.String r15, IC.C13023e r16, boolean r17, boolean r18, KJ.C15987c r19, KJ.C15987c r20, EB.C12829a r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r8 = r1
            goto L_0x000b
        L_0x0009:
            r8 = r18
        L_0x000b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0015
            KJ.f r1 = KJ.C15985a.a()
            r9 = r1
            goto L_0x0017
        L_0x0015:
            r9 = r19
        L_0x0017:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0021
            KJ.f r1 = KJ.C15985a.a()
            r10 = r1
            goto L_0x0023
        L_0x0021:
            r10 = r20
        L_0x0023:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x002b
            EB.a r0 = EB.C12829a.STORE
            r11 = r0
            goto L_0x002d
        L_0x002b:
            r11 = r21
        L_0x002d:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: PB.g.<init>(java.lang.String, java.lang.String, java.lang.String, IC.e, boolean, boolean, KJ.c, KJ.c, EB.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
