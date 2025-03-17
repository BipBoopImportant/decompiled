package ny;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ny.C14862h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\b\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lny/a;", "", "<init>", "()V", "Lny/h$b;", "a", "()Lny/h$b;", "event", "b", "Lny/a$a;", "Lny/a$b;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ny.a  reason: case insensitive filesystem */
public abstract class C14855a {

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001:\u0003\u0010\u001c!BG\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJZ\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010)\u001a\u0004\b\u001c\u0010*¨\u0006+"}, d2 = {"Lny/a$a;", "Lny/a;", "LKJ/c;", "Lny/a$a$b;", "markets", "Lny/a$a$a;", "languages", "Lny/a$a$c;", "selection", "", "isButtonEnabled", "loading", "Lny/h$b;", "event", "<init>", "(LKJ/c;LKJ/c;Lny/a$a$c;ZZLny/h$b;)V", "b", "(LKJ/c;LKJ/c;Lny/a$a$c;ZZLny/h$b;)Lny/a$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "f", "()LKJ/c;", "d", "c", "Lny/a$a$c;", "g", "()Lny/a$a$c;", "Z", "h", "()Z", "e", "Lny/h$b;", "()Lny/h$b;", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.a$a  reason: collision with other inner class name */
    public static final class C3195a extends C14855a {

        /* renamed from: a  reason: collision with root package name */
        private final C15987c<b> f129826a;

        /* renamed from: b  reason: collision with root package name */
        private final C15987c<C3196a> f129827b;

        /* renamed from: c  reason: collision with root package name */
        private final c f129828c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f129829d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f129830e;

        /* renamed from: f  reason: collision with root package name */
        private final C14862h.b f129831f;

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lny/a$a$a;", "", "", "displayName", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.a$a$a  reason: collision with other inner class name */
        public static final class C3196a {

            /* renamed from: a  reason: collision with root package name */
            private final String f129832a;

            /* renamed from: b  reason: collision with root package name */
            private final String f129833b;

            public C3196a(String str, String str2) {
                C17542s.j(str, "displayName");
                C17542s.j(str2, "code");
                this.f129832a = str;
                this.f129833b = str2;
            }

            public final String a() {
                return this.f129833b;
            }

            public final String b() {
                return this.f129832a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3196a)) {
                    return false;
                }
                C3196a aVar = (C3196a) obj;
                return C17542s.e(this.f129832a, aVar.f129832a) && C17542s.e(this.f129833b, aVar.f129833b);
            }

            public int hashCode() {
                return (this.f129832a.hashCode() * 31) + this.f129833b.hashCode();
            }

            public String toString() {
                String str = this.f129832a;
                String str2 = this.f129833b;
                return "LanguageUiState(displayName=" + str + ", code=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lny/a$a$b;", "", "", "displayName", "code", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.a$a$b */
        public static final class b {

            /* renamed from: a  reason: collision with root package name */
            private final String f129834a;

            /* renamed from: b  reason: collision with root package name */
            private final String f129835b;

            public b(String str, String str2) {
                C17542s.j(str, "displayName");
                C17542s.j(str2, "code");
                this.f129834a = str;
                this.f129835b = str2;
            }

            public final String a() {
                return this.f129835b;
            }

            public final String b() {
                return this.f129834a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return C17542s.e(this.f129834a, bVar.f129834a) && C17542s.e(this.f129835b, bVar.f129835b);
            }

            public int hashCode() {
                return (this.f129834a.hashCode() * 31) + this.f129835b.hashCode();
            }

            public String toString() {
                String str = this.f129834a;
                String str2 = this.f129835b;
                return "MarketUiState(displayName=" + str + ", code=" + str2 + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\b¨\u0006\u0013"}, d2 = {"Lny/a$a$c;", "", "", "marketName", "languageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ny.a$a$c */
        public static final class c {

            /* renamed from: a  reason: collision with root package name */
            private final String f129836a;

            /* renamed from: b  reason: collision with root package name */
            private final String f129837b;

            public c(String str, String str2) {
                C17542s.j(str, "marketName");
                C17542s.j(str2, "languageName");
                this.f129836a = str;
                this.f129837b = str2;
            }

            public final String a() {
                return this.f129837b;
            }

            public final String b() {
                return this.f129836a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return C17542s.e(this.f129836a, cVar.f129836a) && C17542s.e(this.f129837b, cVar.f129837b);
            }

            public int hashCode() {
                return (this.f129836a.hashCode() * 31) + this.f129837b.hashCode();
            }

            public String toString() {
                String str = this.f129836a;
                String str2 = this.f129837b;
                return "Selection(marketName=" + str + ", languageName=" + str2 + ")";
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C3195a(C15987c cVar, C15987c cVar2, c cVar3, boolean z10, boolean z11, C14862h.b bVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(cVar, cVar2, cVar3, z10, z11, (i10 & 32) != 0 ? null : bVar);
        }

        public static /* synthetic */ C3195a c(C3195a aVar, C15987c<b> cVar, C15987c<C3196a> cVar2, c cVar3, boolean z10, boolean z11, C14862h.b bVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                cVar = aVar.f129826a;
            }
            if ((i10 & 2) != 0) {
                cVar2 = aVar.f129827b;
            }
            C15987c<C3196a> cVar4 = cVar2;
            if ((i10 & 4) != 0) {
                cVar3 = aVar.f129828c;
            }
            c cVar5 = cVar3;
            if ((i10 & 8) != 0) {
                z10 = aVar.f129829d;
            }
            boolean z12 = z10;
            if ((i10 & 16) != 0) {
                z11 = aVar.f129830e;
            }
            boolean z13 = z11;
            if ((i10 & 32) != 0) {
                bVar = aVar.f129831f;
            }
            return aVar.b(cVar, cVar4, cVar5, z12, z13, bVar);
        }

        public C14862h.b a() {
            return this.f129831f;
        }

        public final C3195a b(C15987c<b> cVar, C15987c<C3196a> cVar2, c cVar3, boolean z10, boolean z11, C14862h.b bVar) {
            C17542s.j(cVar, "markets");
            C17542s.j(cVar2, "languages");
            C17542s.j(cVar3, "selection");
            return new C3195a(cVar, cVar2, cVar3, z10, z11, bVar);
        }

        public final C15987c<C3196a> d() {
            return this.f129827b;
        }

        public final boolean e() {
            return this.f129830e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3195a)) {
                return false;
            }
            C3195a aVar = (C3195a) obj;
            return C17542s.e(this.f129826a, aVar.f129826a) && C17542s.e(this.f129827b, aVar.f129827b) && C17542s.e(this.f129828c, aVar.f129828c) && this.f129829d == aVar.f129829d && this.f129830e == aVar.f129830e && C17542s.e(this.f129831f, aVar.f129831f);
        }

        public final C15987c<b> f() {
            return this.f129826a;
        }

        public final c g() {
            return this.f129828c;
        }

        public final boolean h() {
            return this.f129829d;
        }

        public int hashCode() {
            int hashCode = ((((((((this.f129826a.hashCode() * 31) + this.f129827b.hashCode()) * 31) + this.f129828c.hashCode()) * 31) + Boolean.hashCode(this.f129829d)) * 31) + Boolean.hashCode(this.f129830e)) * 31;
            C14862h.b bVar = this.f129831f;
            return hashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            C15987c<b> cVar = this.f129826a;
            C15987c<C3196a> cVar2 = this.f129827b;
            c cVar3 = this.f129828c;
            boolean z10 = this.f129829d;
            boolean z11 = this.f129830e;
            C14862h.b bVar = this.f129831f;
            return "Content(markets=" + cVar + ", languages=" + cVar2 + ", selection=" + cVar3 + ", isButtonEnabled=" + z10 + ", loading=" + z11 + ", event=" + bVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3195a(C15987c<b> cVar, C15987c<C3196a> cVar2, c cVar3, boolean z10, boolean z11, C14862h.b bVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "markets");
            C17542s.j(cVar2, "languages");
            C17542s.j(cVar3, "selection");
            this.f129826a = cVar;
            this.f129827b = cVar2;
            this.f129828c = cVar3;
            this.f129829d = z10;
            this.f129830e = z11;
            this.f129831f = bVar;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lny/a$b;", "Lny/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lny/h$b;", "b", "Lny/h$b;", "a", "()Lny/h$b;", "event", "regionsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ny.a$b */
    public static final class b extends C14855a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f129838a = new b();

        /* renamed from: b  reason: collision with root package name */
        private static final C14862h.b f129839b = null;

        private b() {
            super((DefaultConstructorMarker) null);
        }

        public C14862h.b a() {
            return f129839b;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -432804111;
        }

        public String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ C14855a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract C14862h.b a();

    private C14855a() {
    }
}
