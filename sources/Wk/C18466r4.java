package wK;

import com.google.android.libraries.places.api.model.PlaceTypes;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p1.C5747v0;
import t1.C5942c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LwK/r4;", "", "<init>", "()V", "b", "c", "e", "a", "d", "LwK/r4$a;", "LwK/r4$b;", "LwK/r4$c;", "LwK/r4$d;", "LwK/r4$e;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wK.r4  reason: case insensitive filesystem */
public abstract class C18466r4 {

    /* renamed from: a  reason: collision with root package name */
    public static final int f151493a = 0;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0011\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LwK/r4$a;", "LwK/r4;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LwK/F;", "b", "LwK/F;", "()LwK/F;", "variant", "LwK/D;", "c", "LwK/D;", "a", "()LwK/D;", "style", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.r4$a */
    public static final class a extends C18466r4 {

        /* renamed from: b  reason: collision with root package name */
        private final C18237F f151494b;

        /* renamed from: c  reason: collision with root package name */
        private final C18235D f151495c;

        public final C18235D a() {
            return this.f151495c;
        }

        public final C18237F b() {
            return this.f151494b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f151494b, aVar.f151494b) && this.f151495c == aVar.f151495c;
        }

        public int hashCode() {
            return (this.f151494b.hashCode() * 31) + this.f151495c.hashCode();
        }

        public String toString() {
            C18237F f10 = this.f151494b;
            C18235D d10 = this.f151495c;
            return "Avatar(variant=" + f10 + ", style=" + d10 + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001f¨\u0006 "}, d2 = {"LwK/r4$b;", "LwK/r4;", "", "resource", "", "contentDescription", "Li1/c$c;", "alignment", "Lp1/v0;", "tint", "<init>", "(ILjava/lang/String;Li1/c$c;Lp1/v0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "I", "c", "Ljava/lang/String;", "d", "Li1/c$c;", "a", "()Li1/c$c;", "e", "Lp1/v0;", "()Lp1/v0;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.r4$b */
    public static final class b extends C18466r4 {

        /* renamed from: b  reason: collision with root package name */
        private final int f151496b;

        /* renamed from: c  reason: collision with root package name */
        private final String f151497c;

        /* renamed from: d  reason: collision with root package name */
        private final C5437c.C0386c f151498d;

        /* renamed from: e  reason: collision with root package name */
        private final C5747v0 f151499e;

        public /* synthetic */ b(int i10, String str, C5437c.C0386c cVar, C5747v0 v0Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, str, cVar, v0Var);
        }

        public final C5437c.C0386c a() {
            return this.f151498d;
        }

        public final String b() {
            return this.f151497c;
        }

        public final int c() {
            return this.f151496b;
        }

        public final C5747v0 d() {
            return this.f151499e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f151496b == bVar.f151496b && C17542s.e(this.f151497c, bVar.f151497c) && C17542s.e(this.f151498d, bVar.f151498d) && C17542s.e(this.f151499e, bVar.f151499e);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.f151496b) * 31;
            String str = this.f151497c;
            int i10 = 0;
            int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f151498d.hashCode()) * 31;
            C5747v0 v0Var = this.f151499e;
            if (v0Var != null) {
                i10 = C5747v0.w(v0Var.y());
            }
            return hashCode2 + i10;
        }

        public String toString() {
            int i10 = this.f151496b;
            String str = this.f151497c;
            C5437c.C0386c cVar = this.f151498d;
            C5747v0 v0Var = this.f151499e;
            return "Icon(resource=" + i10 + ", contentDescription=" + str + ", alignment=" + cVar + ", tint=" + v0Var + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        private b(int i10, String str, C5437c.C0386c cVar, C5747v0 v0Var) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, "alignment");
            this.f151496b = i10;
            this.f151497c = str;
            this.f151498d = cVar;
            this.f151499e = v0Var;
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"LwK/r4$c;", "LwK/r4;", "Lt1/c;", "painter", "", "contentDescription", "<init>", "(Lt1/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lt1/c;", "()Lt1/c;", "c", "Ljava/lang/String;", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.r4$c */
    public static final class c extends C18466r4 {

        /* renamed from: b  reason: collision with root package name */
        private final C5942c f151500b;

        /* renamed from: c  reason: collision with root package name */
        private final String f151501c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5942c cVar, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, PlaceTypes.PAINTER);
            this.f151500b = cVar;
            this.f151501c = str;
        }

        public final String a() {
            return this.f151501c;
        }

        public final C5942c b() {
            return this.f151500b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f151500b, cVar.f151500b) && C17542s.e(this.f151501c, cVar.f151501c);
        }

        public int hashCode() {
            int hashCode = this.f151500b.hashCode() * 31;
            String str = this.f151501c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C5942c cVar = this.f151500b;
            String str = this.f151501c;
            return "ImageView(painter=" + cVar + ", contentDescription=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LwK/r4$d;", "LwK/r4;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.r4$d */
    public static final class d extends C18466r4 {

        /* renamed from: b  reason: collision with root package name */
        public static final d f151502b = new d();

        private d() {
            super((DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return 1987541234;
        }

        public String toString() {
            return "None";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\t¨\u0006\u0018"}, d2 = {"LwK/r4$e;", "LwK/r4;", "Lt1/c;", "painter", "", "contentDescription", "<init>", "(Lt1/c;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lt1/c;", "()Lt1/c;", "c", "Ljava/lang/String;", "a", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: wK.r4$e */
    public static final class e extends C18466r4 {

        /* renamed from: b  reason: collision with root package name */
        private final C5942c f151503b;

        /* renamed from: c  reason: collision with root package name */
        private final String f151504c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5942c cVar, String str) {
            super((DefaultConstructorMarker) null);
            C17542s.j(cVar, PlaceTypes.PAINTER);
            this.f151503b = cVar;
            this.f151504c = str;
        }

        public final String a() {
            return this.f151504c;
        }

        public final C5942c b() {
            return this.f151503b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f151503b, eVar.f151503b) && C17542s.e(this.f151504c, eVar.f151504c);
        }

        public int hashCode() {
            int hashCode = this.f151503b.hashCode() * 31;
            String str = this.f151504c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C5942c cVar = this.f151503b;
            String str = this.f151504c;
            return "PaymentLogo(painter=" + cVar + ", contentDescription=" + str + ")";
        }
    }

    public /* synthetic */ C18466r4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18466r4() {
    }
}
