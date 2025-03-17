package Qr;

import KJ.C15987c;
import TJ.C16532g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0003\u0006\u0004\u0007J\u0017\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"LQr/b;", "", "LTJ/g;", "LQr/b$c;", "a", "()LTJ/g;", "c", "b", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0017\u0010\u001b¨\u0006\u001c"}, d2 = {"LQr/b$a;", "", "", "id", "title", "LQr/b$b;", "media", "body", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;LQr/b$b;Ljava/lang/String;LQr/b$b;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "LQr/b$b;", "d", "()LQr/b$b;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final String f86218a;

        /* renamed from: b  reason: collision with root package name */
        private final String f86219b;

        /* renamed from: c  reason: collision with root package name */
        private final C1772b f86220c;

        /* renamed from: d  reason: collision with root package name */
        private final String f86221d;

        /* renamed from: e  reason: collision with root package name */
        private final C1772b f86222e;

        public a(String str, String str2, C1772b bVar, String str3, C1772b bVar2) {
            C17542s.j(str, "id");
            C17542s.j(str2, "title");
            C17542s.j(bVar, "media");
            this.f86218a = str;
            this.f86219b = str2;
            this.f86220c = bVar;
            this.f86221d = str3;
            this.f86222e = bVar2;
        }

        public final String a() {
            return this.f86221d;
        }

        public final C1772b b() {
            return this.f86222e;
        }

        public final String c() {
            return this.f86218a;
        }

        public final C1772b d() {
            return this.f86220c;
        }

        public final String e() {
            return this.f86219b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f86218a, aVar.f86218a) && C17542s.e(this.f86219b, aVar.f86219b) && C17542s.e(this.f86220c, aVar.f86220c) && C17542s.e(this.f86221d, aVar.f86221d) && C17542s.e(this.f86222e, aVar.f86222e);
        }

        public int hashCode() {
            int hashCode = ((((this.f86218a.hashCode() * 31) + this.f86219b.hashCode()) * 31) + this.f86220c.hashCode()) * 31;
            String str = this.f86221d;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            C1772b bVar = this.f86222e;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f86218a;
            String str2 = this.f86219b;
            C1772b bVar = this.f86220c;
            String str3 = this.f86221d;
            C1772b bVar2 = this.f86222e;
            return "CarouselItem(id=" + str + ", title=" + str2 + ", media=" + bVar + ", body=" + str3 + ", icon=" + bVar2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LQr/b$b;", "", "<init>", "()V", "b", "a", "LQr/b$b$a;", "LQr/b$b$b;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Qr.b$b  reason: collision with other inner class name */
    public static abstract class C1772b {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"LQr/b$b$a;", "LQr/b$b;", "", "url", "contentDescription", "", "placeholderImageResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qr.b$b$a */
        public static final class a extends C1772b {

            /* renamed from: a  reason: collision with root package name */
            private final String f86223a;

            /* renamed from: b  reason: collision with root package name */
            private final String f86224b;

            /* renamed from: c  reason: collision with root package name */
            private final int f86225c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, int i10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "url");
                C17542s.j(str2, "contentDescription");
                this.f86223a = str;
                this.f86224b = str2;
                this.f86225c = i10;
            }

            public String a() {
                return this.f86224b;
            }

            public int b() {
                return this.f86225c;
            }

            public String c() {
                return this.f86223a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return C17542s.e(this.f86223a, aVar.f86223a) && C17542s.e(this.f86224b, aVar.f86224b) && this.f86225c == aVar.f86225c;
            }

            public int hashCode() {
                return (((this.f86223a.hashCode() * 31) + this.f86224b.hashCode()) * 31) + Integer.hashCode(this.f86225c);
            }

            public String toString() {
                String str = this.f86223a;
                String str2 = this.f86224b;
                int i10 = this.f86225c;
                return "Image(url=" + str + ", contentDescription=" + str2 + ", placeholderImageResId=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"LQr/b$b$b;", "LQr/b$b;", "", "url", "contentDescription", "", "placeholderImageResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "I", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qr.b$b$b  reason: collision with other inner class name */
        public static final class C1773b extends C1772b {

            /* renamed from: a  reason: collision with root package name */
            private final String f86226a;

            /* renamed from: b  reason: collision with root package name */
            private final String f86227b;

            /* renamed from: c  reason: collision with root package name */
            private final int f86228c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1773b(String str, String str2, int i10) {
                super((DefaultConstructorMarker) null);
                C17542s.j(str, "url");
                C17542s.j(str2, "contentDescription");
                this.f86226a = str;
                this.f86227b = str2;
                this.f86228c = i10;
            }

            public String a() {
                return this.f86227b;
            }

            public int b() {
                return this.f86228c;
            }

            public String c() {
                return this.f86226a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1773b)) {
                    return false;
                }
                C1773b bVar = (C1773b) obj;
                return C17542s.e(this.f86226a, bVar.f86226a) && C17542s.e(this.f86227b, bVar.f86227b) && this.f86228c == bVar.f86228c;
            }

            public int hashCode() {
                return (((this.f86226a.hashCode() * 31) + this.f86227b.hashCode()) * 31) + Integer.hashCode(this.f86228c);
            }

            public String toString() {
                String str = this.f86226a;
                String str2 = this.f86227b;
                int i10 = this.f86228c;
                return "Video(url=" + str + ", contentDescription=" + str2 + ", placeholderImageResId=" + i10 + ")";
            }
        }

        public /* synthetic */ C1772b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1772b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LQr/b$c;", "", "<init>", "()V", "a", "b", "LQr/b$c$a;", "LQr/b$c$b;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class c {

        /* renamed from: a  reason: collision with root package name */
        public static final int f86229a = 0;

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LQr/b$c$a;", "LQr/b$c;", "LQr/b$b;", "media", "<init>", "(LQr/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LQr/b$b;", "a", "()LQr/b$b;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a extends c {

            /* renamed from: b  reason: collision with root package name */
            private final C1772b f86230b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(C1772b bVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(bVar, "media");
                this.f86230b = bVar;
            }

            public final C1772b a() {
                return this.f86230b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && C17542s.e(this.f86230b, ((a) obj).f86230b);
            }

            public int hashCode() {
                return this.f86230b.hashCode();
            }

            public String toString() {
                C1772b bVar = this.f86230b;
                return "Banner(media=" + bVar + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LQr/b$c$b;", "LQr/b$c;", "", "label", "title", "LKJ/c;", "LQr/b$a;", "carouselItems", "<init>", "(Ljava/lang/String;Ljava/lang/String;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "c", "d", "LKJ/c;", "a", "()LKJ/c;", "geomagical_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Qr.b$c$b  reason: collision with other inner class name */
        public static final class C1774b extends c {

            /* renamed from: b  reason: collision with root package name */
            private final String f86231b;

            /* renamed from: c  reason: collision with root package name */
            private final String f86232c;

            /* renamed from: d  reason: collision with root package name */
            private final C15987c<a> f86233d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C1774b(String str, String str2, C15987c<a> cVar) {
                super((DefaultConstructorMarker) null);
                C17542s.j(cVar, "carouselItems");
                this.f86231b = str;
                this.f86232c = str2;
                this.f86233d = cVar;
            }

            public final C15987c<a> a() {
                return this.f86233d;
            }

            public final String b() {
                return this.f86231b;
            }

            public final String c() {
                return this.f86232c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1774b)) {
                    return false;
                }
                C1774b bVar = (C1774b) obj;
                return C17542s.e(this.f86231b, bVar.f86231b) && C17542s.e(this.f86232c, bVar.f86232c) && C17542s.e(this.f86233d, bVar.f86233d);
            }

            public int hashCode() {
                String str = this.f86231b;
                int i10 = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f86232c;
                if (str2 != null) {
                    i10 = str2.hashCode();
                }
                return ((hashCode + i10) * 31) + this.f86233d.hashCode();
            }

            public String toString() {
                String str = this.f86231b;
                String str2 = this.f86232c;
                C15987c<a> cVar = this.f86233d;
                return "Carousel(label=" + str + ", title=" + str2 + ", carouselItems=" + cVar + ")";
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    C16532g<c> a();
}
