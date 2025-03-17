package GD;

import IC.C13023e;
import IC.C13026h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0003\u0010\r\t\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0001\u0005\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"LGD/e;", "", "", "c", "()Z", "showInvalidInputMessage", "a", "isLoading", "", "b", "()Ljava/lang/String;", "redemptionCode", "LIC/e;", "d", "()LIC/e;", "userMessage", "e", "LGD/e$a;", "LGD/e$b;", "LGD/e$c;", "LGD/e$d;", "LGD/e$e;", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GD.e  reason: case insensitive filesystem */
public interface C12932e {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0010\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"LGD/e$a;", "LGD/e;", "", "redemptionCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "showInvalidInputMessage", "isLoading", "LIC/e;", "d", "LIC/e;", "()LIC/e;", "userMessage", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GD.e$a */
    public static final class a implements C12932e {

        /* renamed from: a  reason: collision with root package name */
        private final String f110342a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f110343b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f110344c;

        /* renamed from: d  reason: collision with root package name */
        private final C13023e f110345d;

        public a(String str) {
            C17542s.j(str, "redemptionCode");
            this.f110342a = str;
        }

        public boolean a() {
            return this.f110344c;
        }

        public String b() {
            return this.f110342a;
        }

        public boolean c() {
            return this.f110343b;
        }

        public C13023e d() {
            return this.f110345d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && C17542s.e(this.f110342a, ((a) obj).f110342a);
        }

        public int hashCode() {
            return this.f110342a.hashCode();
        }

        public String toString() {
            String str = this.f110342a;
            return "Attached(redemptionCode=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0010\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"LGD/e$b;", "LGD/e;", "", "redemptionCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "showInvalidInputMessage", "isLoading", "LIC/e;", "d", "LIC/e;", "()LIC/e;", "userMessage", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GD.e$b */
    public static final class b implements C12932e {

        /* renamed from: a  reason: collision with root package name */
        private final String f110346a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f110347b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f110348c;

        /* renamed from: d  reason: collision with root package name */
        private final C13023e f110349d = C13026h.a(Oo.b.f84853z3);

        public b(String str) {
            C17542s.j(str, "redemptionCode");
            this.f110346a = str;
        }

        public boolean a() {
            return this.f110348c;
        }

        public String b() {
            return this.f110346a;
        }

        public boolean c() {
            return this.f110347b;
        }

        public C13023e d() {
            return this.f110349d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && C17542s.e(this.f110346a, ((b) obj).f110346a);
        }

        public int hashCode() {
            return this.f110346a.hashCode();
        }

        public String toString() {
            String str = this.f110346a;
            return "Failure(redemptionCode=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0015\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"LGD/e$c;", "LGD/e;", "", "redemptionCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "()Z", "isLoading", "c", "showInvalidInputMessage", "LIC/e;", "d", "LIC/e;", "()LIC/e;", "userMessage", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GD.e$c */
    public static final class c implements C12932e {

        /* renamed from: a  reason: collision with root package name */
        private final String f110350a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f110351b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f110352c;

        /* renamed from: d  reason: collision with root package name */
        private final C13023e f110353d;

        public c() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public boolean a() {
            return this.f110351b;
        }

        public String b() {
            return this.f110350a;
        }

        public boolean c() {
            return this.f110352c;
        }

        public C13023e d() {
            return this.f110353d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && C17542s.e(this.f110350a, ((c) obj).f110350a);
        }

        public int hashCode() {
            return this.f110350a.hashCode();
        }

        public String toString() {
            String str = this.f110350a;
            return "InputCode(redemptionCode=" + str + ")";
        }

        public c(String str) {
            C17542s.j(str, "redemptionCode");
            this.f110350a = str;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0010\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"LGD/e$d;", "LGD/e;", "", "redemptionCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "showInvalidInputMessage", "isLoading", "LIC/e;", "d", "LIC/e;", "()LIC/e;", "userMessage", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GD.e$d */
    public static final class d implements C12932e {

        /* renamed from: a  reason: collision with root package name */
        private final String f110354a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f110355b = true;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f110356c;

        /* renamed from: d  reason: collision with root package name */
        private final C13023e f110357d;

        public d(String str) {
            C17542s.j(str, "redemptionCode");
            this.f110354a = str;
        }

        public boolean a() {
            return this.f110356c;
        }

        public String b() {
            return this.f110354a;
        }

        public boolean c() {
            return this.f110355b;
        }

        public C13023e d() {
            return this.f110357d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && C17542s.e(this.f110354a, ((d) obj).f110354a);
        }

        public int hashCode() {
            return this.f110354a.hashCode();
        }

        public String toString() {
            String str = this.f110354a;
            return "InvalidInput(redemptionCode=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0007R\u001a\u0010\u0016\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\r8\u0016XD¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0010\u0010\u0015R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"LGD/e$e;", "LGD/e;", "", "redemptionCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "showInvalidInputMessage", "isLoading", "LIC/e;", "d", "LIC/e;", "()LIC/e;", "userMessage", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GD.e$e  reason: collision with other inner class name */
    public static final class C2645e implements C12932e {

        /* renamed from: a  reason: collision with root package name */
        private final String f110358a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f110359b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f110360c = true;

        /* renamed from: d  reason: collision with root package name */
        private final C13023e f110361d;

        public C2645e(String str) {
            C17542s.j(str, "redemptionCode");
            this.f110358a = str;
        }

        public boolean a() {
            return this.f110360c;
        }

        public String b() {
            return this.f110358a;
        }

        public boolean c() {
            return this.f110359b;
        }

        public C13023e d() {
            return this.f110361d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2645e) && C17542s.e(this.f110358a, ((C2645e) obj).f110358a);
        }

        public int hashCode() {
            return this.f110358a.hashCode();
        }

        public String toString() {
            String str = this.f110358a;
            return "Loading(redemptionCode=" + str + ")";
        }
    }

    boolean a();

    String b();

    boolean c();

    C13023e d();
}
