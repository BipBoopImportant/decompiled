package wK;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LwK/d7;", "", "<init>", "()V", "b", "a", "LwK/d7$a;", "LwK/d7$b;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.d7  reason: case insensitive filesystem */
public abstract class C18301d7 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f150728a = 0;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LwK/d7$a;", "LwK/d7;", "LwK/a7;", "size", "<init>", "(LwK/a7;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "LwK/a7;", "a", "()LwK/a7;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.d7$a */
    public static final class a extends C18301d7 {

        /* renamed from: b  reason: collision with root package name */
        private final C18265a7 f150729b;

        public a() {
            this((C18265a7) null, 1, (DefaultConstructorMarker) null);
        }

        public final C18265a7 a() {
            return this.f150729b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f150729b == ((a) obj).f150729b;
        }

        public int hashCode() {
            return this.f150729b.hashCode();
        }

        public String toString() {
            C18265a7 a7Var = this.f150729b;
            return "List(size=" + a7Var + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C18265a7 a7Var) {
            super((DefaultConstructorMarker) null);
            C17542s.j(a7Var, "size");
            this.f150729b = a7Var;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C18265a7 a7Var, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C18265a7.Small : a7Var);
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"LwK/d7$b;", "LwK/d7;", "LwK/b7;", "size", "", "placeholder", "", "completePriceLabel", "<init>", "(LwK/b7;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "LwK/b7;", "c", "()LwK/b7;", "Z", "()Z", "d", "Ljava/lang/String;", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.d7$b */
    public static final class b extends C18301d7 {

        /* renamed from: e  reason: collision with root package name */
        public static final int f150730e = 0;

        /* renamed from: b  reason: collision with root package name */
        private final C18277b7 f150731b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f150732c;

        /* renamed from: d  reason: collision with root package name */
        private final String f150733d;

        public b() {
            this((C18277b7) null, false, (String) null, 7, (DefaultConstructorMarker) null);
        }

        public final String a() {
            return this.f150733d;
        }

        public final boolean b() {
            return this.f150732c;
        }

        public final C18277b7 c() {
            return this.f150731b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f150731b == bVar.f150731b && this.f150732c == bVar.f150732c && C17542s.e(this.f150733d, bVar.f150733d);
        }

        public int hashCode() {
            int hashCode = ((this.f150731b.hashCode() * 31) + Boolean.hashCode(this.f150732c)) * 31;
            String str = this.f150733d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C18277b7 b7Var = this.f150731b;
            boolean z10 = this.f150732c;
            String str = this.f150733d;
            return "Regular(size=" + b7Var + ", placeholder=" + z10 + ", completePriceLabel=" + str + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(C18277b7 b7Var, boolean z10, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? C18277b7.Medium : b7Var, (i10 & 2) != 0 ? false : z10, (i10 & 4) != 0 ? null : str);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C18277b7 b7Var, boolean z10, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(b7Var, "size");
            this.f150731b = b7Var;
            this.f150732c = z10;
            this.f150733d = str;
        }
    }

    public /* synthetic */ C18301d7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18301d7() {
    }
}
