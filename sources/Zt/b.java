package Zt;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001:\u0003\b\u0017\u0015B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LZt/b;", "", "LZt/b$a;", "content", "LZt/b$c;", "registrationResult", "<init>", "(LZt/b$a;LZt/b$c;)V", "a", "(LZt/b$a;LZt/b$c;)LZt/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "LZt/b$a;", "c", "()LZt/b$a;", "b", "LZt/b$c;", "d", "()LZt/b$c;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static final int f90204c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final a f90205a;

    /* renamed from: b  reason: collision with root package name */
    private final c f90206b;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b#\b\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0011\u0010\u0012Jz\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001c\u001a\u0004\b\u001d\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u0018R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b*\u0010)\u001a\u0004\b*\u0010\u0018R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-R\u0017\u0010\u0010\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"LZt/b$a;", "", "", "eventName", "LIC/e;", "date", "customerName", "contactInfo", "", "sendSmsReminder", "sendEmailReminder", "", "extraAdultsAmount", "extraChildrenAmount", "LZt/b$b;", "participantsSettings", "isJoiningWaitingList", "<init>", "(Ljava/lang/String;LIC/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;IILZt/b$b;Z)V", "a", "(Ljava/lang/String;LIC/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;IILZt/b$b;Z)LZt/b$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "LIC/e;", "e", "()LIC/e;", "c", "d", "Ljava/lang/Boolean;", "k", "()Ljava/lang/Boolean;", "j", "g", "I", "h", "i", "LZt/b$b;", "()LZt/b$b;", "Z", "l", "()Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: k  reason: collision with root package name */
        public static final int f90207k = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final String f90208a;

        /* renamed from: b  reason: collision with root package name */
        private final C13023e f90209b;

        /* renamed from: c  reason: collision with root package name */
        private final String f90210c;

        /* renamed from: d  reason: collision with root package name */
        private final String f90211d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f90212e;

        /* renamed from: f  reason: collision with root package name */
        private final Boolean f90213f;

        /* renamed from: g  reason: collision with root package name */
        private final int f90214g;

        /* renamed from: h  reason: collision with root package name */
        private final int f90215h;

        /* renamed from: i  reason: collision with root package name */
        private final C1947b f90216i;

        /* renamed from: j  reason: collision with root package name */
        private final boolean f90217j;

        public a(String str, C13023e eVar, String str2, String str3, Boolean bool, Boolean bool2, int i10, int i11, C1947b bVar, boolean z10) {
            C17542s.j(str, "eventName");
            C17542s.j(eVar, "date");
            C17542s.j(str2, "customerName");
            C17542s.j(str3, "contactInfo");
            this.f90208a = str;
            this.f90209b = eVar;
            this.f90210c = str2;
            this.f90211d = str3;
            this.f90212e = bool;
            this.f90213f = bool2;
            this.f90214g = i10;
            this.f90215h = i11;
            this.f90216i = bVar;
            this.f90217j = z10;
        }

        public static /* synthetic */ a b(a aVar, String str, C13023e eVar, String str2, String str3, Boolean bool, Boolean bool2, int i10, int i11, C1947b bVar, boolean z10, int i12, Object obj) {
            a aVar2 = aVar;
            int i13 = i12;
            return aVar.a((i13 & 1) != 0 ? aVar2.f90208a : str, (i13 & 2) != 0 ? aVar2.f90209b : eVar, (i13 & 4) != 0 ? aVar2.f90210c : str2, (i13 & 8) != 0 ? aVar2.f90211d : str3, (i13 & 16) != 0 ? aVar2.f90212e : bool, (i13 & 32) != 0 ? aVar2.f90213f : bool2, (i13 & 64) != 0 ? aVar2.f90214g : i10, (i13 & 128) != 0 ? aVar2.f90215h : i11, (i13 & 256) != 0 ? aVar2.f90216i : bVar, (i13 & 512) != 0 ? aVar2.f90217j : z10);
        }

        public final a a(String str, C13023e eVar, String str2, String str3, Boolean bool, Boolean bool2, int i10, int i11, C1947b bVar, boolean z10) {
            C17542s.j(str, "eventName");
            C17542s.j(eVar, "date");
            C17542s.j(str2, "customerName");
            String str4 = str3;
            C17542s.j(str4, "contactInfo");
            return new a(str, eVar, str2, str4, bool, bool2, i10, i11, bVar, z10);
        }

        public final String c() {
            return this.f90211d;
        }

        public final String d() {
            return this.f90210c;
        }

        public final C13023e e() {
            return this.f90209b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f90208a, aVar.f90208a) && C17542s.e(this.f90209b, aVar.f90209b) && C17542s.e(this.f90210c, aVar.f90210c) && C17542s.e(this.f90211d, aVar.f90211d) && C17542s.e(this.f90212e, aVar.f90212e) && C17542s.e(this.f90213f, aVar.f90213f) && this.f90214g == aVar.f90214g && this.f90215h == aVar.f90215h && C17542s.e(this.f90216i, aVar.f90216i) && this.f90217j == aVar.f90217j;
        }

        public final String f() {
            return this.f90208a;
        }

        public final int g() {
            return this.f90214g;
        }

        public final int h() {
            return this.f90215h;
        }

        public int hashCode() {
            int hashCode = ((((((this.f90208a.hashCode() * 31) + this.f90209b.hashCode()) * 31) + this.f90210c.hashCode()) * 31) + this.f90211d.hashCode()) * 31;
            Boolean bool = this.f90212e;
            int i10 = 0;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f90213f;
            int hashCode3 = (((((hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31) + Integer.hashCode(this.f90214g)) * 31) + Integer.hashCode(this.f90215h)) * 31;
            C1947b bVar = this.f90216i;
            if (bVar != null) {
                i10 = bVar.hashCode();
            }
            return ((hashCode3 + i10) * 31) + Boolean.hashCode(this.f90217j);
        }

        public final C1947b i() {
            return this.f90216i;
        }

        public final Boolean j() {
            return this.f90213f;
        }

        public final Boolean k() {
            return this.f90212e;
        }

        public final boolean l() {
            return this.f90217j;
        }

        public String toString() {
            String str = this.f90208a;
            C13023e eVar = this.f90209b;
            String str2 = this.f90210c;
            String str3 = this.f90211d;
            Boolean bool = this.f90212e;
            Boolean bool2 = this.f90213f;
            int i10 = this.f90214g;
            int i11 = this.f90215h;
            C1947b bVar = this.f90216i;
            boolean z10 = this.f90217j;
            return "Content(eventName=" + str + ", date=" + eVar + ", customerName=" + str2 + ", contactInfo=" + str3 + ", sendSmsReminder=" + bool + ", sendEmailReminder=" + bool2 + ", extraAdultsAmount=" + i10 + ", extraChildrenAmount=" + i11 + ", participantsSettings=" + bVar + ", isJoiningWaitingList=" + z10 + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001b"}, d2 = {"LZt/b$b;", "", "", "extraAdultsAllowed", "extraChildrenAllowed", "", "maxAdultsAllowed", "maxChildrenAllowed", "<init>", "(ZZII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "c", "I", "d", "e", "isParticipantsAllowed", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Zt.b$b  reason: collision with other inner class name */
    public static final class C1947b {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f90218a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f90219b;

        /* renamed from: c  reason: collision with root package name */
        private final int f90220c;

        /* renamed from: d  reason: collision with root package name */
        private final int f90221d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f90222e;

        public C1947b(boolean z10, boolean z11, int i10, int i11) {
            this.f90218a = z10;
            this.f90219b = z11;
            this.f90220c = i10;
            this.f90221d = i11;
            this.f90222e = z10 || z11;
        }

        public final boolean a() {
            return this.f90218a;
        }

        public final boolean b() {
            return this.f90219b;
        }

        public final int c() {
            return this.f90220c;
        }

        public final int d() {
            return this.f90221d;
        }

        public final boolean e() {
            return this.f90222e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1947b)) {
                return false;
            }
            C1947b bVar = (C1947b) obj;
            return this.f90218a == bVar.f90218a && this.f90219b == bVar.f90219b && this.f90220c == bVar.f90220c && this.f90221d == bVar.f90221d;
        }

        public int hashCode() {
            return (((((Boolean.hashCode(this.f90218a) * 31) + Boolean.hashCode(this.f90219b)) * 31) + Integer.hashCode(this.f90220c)) * 31) + Integer.hashCode(this.f90221d);
        }

        public String toString() {
            boolean z10 = this.f90218a;
            boolean z11 = this.f90219b;
            int i10 = this.f90220c;
            int i11 = this.f90221d;
            return "ParticipantsSettings(extraAdultsAllowed=" + z10 + ", extraChildrenAllowed=" + z11 + ", maxAdultsAllowed=" + i10 + ", maxChildrenAllowed=" + i11 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"LZt/b$c;", "", "c", "a", "b", "LZt/b$c$a;", "LZt/b$c$b;", "LZt/b$c$c;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface c {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZt/b$c$a;", "LZt/b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final a f90223a = new a();

            private a() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 180258455;
            }

            public String toString() {
                return "Failure";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZt/b$c$b;", "LZt/b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zt.b$c$b  reason: collision with other inner class name */
        public static final class C1948b implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1948b f90224a = new C1948b();

            private C1948b() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1948b);
            }

            public int hashCode() {
                return -1013075387;
            }

            public String toString() {
                return "InProgress";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LZt/b$c$c;", "LZt/b$c;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Zt.b$c$c  reason: collision with other inner class name */
        public static final class C1949c implements c {

            /* renamed from: a  reason: collision with root package name */
            public static final C1949c f90225a = new C1949c();

            private C1949c() {
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C1949c);
            }

            public int hashCode() {
                return -600337136;
            }

            public String toString() {
                return "Success";
            }
        }
    }

    public b() {
        this((a) null, (c) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ b b(b bVar, a aVar, c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = bVar.f90205a;
        }
        if ((i10 & 2) != 0) {
            cVar = bVar.f90206b;
        }
        return bVar.a(aVar, cVar);
    }

    public final b a(a aVar, c cVar) {
        return new b(aVar, cVar);
    }

    public final a c() {
        return this.f90205a;
    }

    public final c d() {
        return this.f90206b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return C17542s.e(this.f90205a, bVar.f90205a) && C17542s.e(this.f90206b, bVar.f90206b);
    }

    public int hashCode() {
        a aVar = this.f90205a;
        int i10 = 0;
        int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        c cVar = this.f90206b;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        a aVar = this.f90205a;
        c cVar = this.f90206b;
        return "State(content=" + aVar + ", registrationResult=" + cVar + ")";
    }

    public b(a aVar, c cVar) {
        this.f90205a = aVar;
        this.f90206b = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(a aVar, c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : aVar, (i10 & 2) != 0 ? null : cVar);
    }
}
