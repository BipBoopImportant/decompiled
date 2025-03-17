package SC;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LSC/x1;", "", "<init>", "()V", "b", "a", "c", "LSC/x1$a;", "LSC/x1$b;", "LSC/x1$c;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.x1  reason: case insensitive filesystem */
public abstract class C13656x1 {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LSC/x1$a;", "LSC/x1;", "LSC/y1;", "trailingAction", "leadingAction", "<init>", "(LSC/y1;LSC/y1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LSC/y1;", "b", "()LSC/y1;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.x1$a */
    public static final class a extends C13656x1 {

        /* renamed from: c  reason: collision with root package name */
        public static final int f116491c = 0;

        /* renamed from: a  reason: collision with root package name */
        private final C13660y1 f116492a;

        /* renamed from: b  reason: collision with root package name */
        private final C13660y1 f116493b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C13660y1 y1Var, C13660y1 y1Var2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(y1Var, "trailingAction");
            this.f116492a = y1Var;
            this.f116493b = y1Var2;
        }

        public final C13660y1 a() {
            return this.f116493b;
        }

        public final C13660y1 b() {
            return this.f116492a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f116492a, aVar.f116492a) && C17542s.e(this.f116493b, aVar.f116493b);
        }

        public int hashCode() {
            int hashCode = this.f116492a.hashCode() * 31;
            C13660y1 y1Var = this.f116493b;
            return hashCode + (y1Var == null ? 0 : y1Var.hashCode());
        }

        public String toString() {
            C13660y1 y1Var = this.f116492a;
            C13660y1 y1Var2 = this.f116493b;
            return "Floating(trailingAction=" + y1Var + ", leadingAction=" + y1Var2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LSC/x1$b;", "LSC/x1;", "", "title", "LSC/y1;", "trailingAction", "leadingAction", "<init>", "(Ljava/lang/String;LSC/y1;LSC/y1;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LSC/y1;", "c", "()LSC/y1;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.x1$b */
    public static final class b extends C13656x1 {

        /* renamed from: d  reason: collision with root package name */
        public static final int f116494d = 0;

        /* renamed from: a  reason: collision with root package name */
        private final String f116495a;

        /* renamed from: b  reason: collision with root package name */
        private final C13660y1 f116496b;

        /* renamed from: c  reason: collision with root package name */
        private final C13660y1 f116497c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, C13660y1 y1Var, C13660y1 y1Var2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(y1Var, "trailingAction");
            this.f116495a = str;
            this.f116496b = y1Var;
            this.f116497c = y1Var2;
        }

        public final C13660y1 a() {
            return this.f116497c;
        }

        public final String b() {
            return this.f116495a;
        }

        public final C13660y1 c() {
            return this.f116496b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f116495a, bVar.f116495a) && C17542s.e(this.f116496b, bVar.f116496b) && C17542s.e(this.f116497c, bVar.f116497c);
        }

        public int hashCode() {
            String str = this.f116495a;
            int i10 = 0;
            int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f116496b.hashCode()) * 31;
            C13660y1 y1Var = this.f116497c;
            if (y1Var != null) {
                i10 = y1Var.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            String str = this.f116495a;
            C13660y1 y1Var = this.f116496b;
            C13660y1 y1Var2 = this.f116497c;
            return "Regular(title=" + str + ", trailingAction=" + y1Var + ", leadingAction=" + y1Var2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSC/x1$c;", "LSC/x1;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: SC.x1$c */
    public static final class c extends C13656x1 {

        /* renamed from: a  reason: collision with root package name */
        public static final c f116498a = new c();

        /* renamed from: b  reason: collision with root package name */
        public static final int f116499b = 0;

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -901119301;
        }

        public String toString() {
            return "Resizeable";
        }
    }

    public /* synthetic */ C13656x1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C13656x1() {
    }
}
