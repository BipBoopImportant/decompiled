package Op;

import IC.C13023e;
import SC.H0;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\t\f\r\u000e\u000f\u0010\u0005\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048 X \u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"LOp/o;", "", "<init>", "()V", "", "b", "()I", "order", "LOp/o$d;", "a", "()LOp/o$d;", "alignment", "h", "f", "g", "e", "c", "d", "LOp/o$a;", "LOp/o$b;", "LOp/o$c;", "LOp/o$e;", "LOp/o$f;", "LOp/o$g;", "LOp/o$h;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Op.o  reason: case insensitive filesystem */
public abstract class C10850o {

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u000b8\u0010XD¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0016\u0010\r¨\u0006\u001b"}, d2 = {"LOp/o$a;", "LOp/o;", "", "isAddingToCart", "LOp/o$d;", "alignment", "<init>", "(ZLOp/o$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "LOp/o$d;", "()LOp/o$d;", "I", "order", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.o$a */
    public static final class a extends C10850o {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f85236a;

        /* renamed from: b  reason: collision with root package name */
        private final d f85237b;

        /* renamed from: c  reason: collision with root package name */
        private final int f85238c;

        public a() {
            this(false, (d) null, 3, (DefaultConstructorMarker) null);
        }

        public d a() {
            return this.f85237b;
        }

        public int b() {
            return this.f85238c;
        }

        public final boolean c() {
            return this.f85236a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f85236a == aVar.f85236a && this.f85237b == aVar.f85237b;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f85236a) * 31) + this.f85237b.hashCode();
        }

        public String toString() {
            boolean z10 = this.f85236a;
            d dVar = this.f85237b;
            return "AddToCartState(isAddingToCart=" + z10 + ", alignment=" + dVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z10, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? d.End : dVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(boolean z10, d dVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(dVar, "alignment");
            this.f85236a = z10;
            this.f85237b = dVar;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00078\u0010XD¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\t¨\u0006\u0018"}, d2 = {"LOp/o$c;", "LOp/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LOp/o$d;", "b", "LOp/o$d;", "a", "()LOp/o$d;", "alignment", "c", "I", "order", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.o$c */
    public static final class c extends C10850o {

        /* renamed from: a  reason: collision with root package name */
        public static final c f85245a = new c();

        /* renamed from: b  reason: collision with root package name */
        private static final d f85246b = d.End;

        /* renamed from: c  reason: collision with root package name */
        private static final int f85247c = 3;

        private c() {
            super((DefaultConstructorMarker) null);
        }

        public d a() {
            return f85246b;
        }

        public int b() {
            return f85247c;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 653333426;
        }

        public String toString() {
            return "Delete";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LOp/o$d;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.o$d */
    public enum d {
        Start,
        End;

        static {
            d[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\t8\u0010XD¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u0015\u0010\u000b¨\u0006\u001b"}, d2 = {"LOp/o$e;", "LOp/o;", "", "isInFavourites", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "LOp/o$d;", "b", "LOp/o$d;", "()LOp/o$d;", "alignment", "I", "order", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.o$e */
    public static final class e extends C10850o {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f85248a;

        /* renamed from: b  reason: collision with root package name */
        private final d f85249b;

        /* renamed from: c  reason: collision with root package name */
        private final int f85250c;

        public e() {
            this(false, 1, (DefaultConstructorMarker) null);
        }

        public d a() {
            return this.f85249b;
        }

        public int b() {
            return this.f85250c;
        }

        public final boolean c() {
            return this.f85248a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f85248a == ((e) obj).f85248a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f85248a);
        }

        public String toString() {
            boolean z10 = this.f85248a;
            return "Favorite(isInFavourites=" + z10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ e(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10);
        }

        public e(boolean z10) {
            super((DefaultConstructorMarker) null);
            this.f85248a = z10;
            this.f85249b = d.End;
            this.f85250c = 2;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00078\u0010XD¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\t¨\u0006\u0018"}, d2 = {"LOp/o$f;", "LOp/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LOp/o$d;", "b", "LOp/o$d;", "a", "()LOp/o$d;", "alignment", "c", "I", "order", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.o$f */
    public static final class f extends C10850o {

        /* renamed from: a  reason: collision with root package name */
        public static final f f85251a = new f();

        /* renamed from: b  reason: collision with root package name */
        private static final d f85252b = d.End;

        /* renamed from: c  reason: collision with root package name */
        private static final int f85253c = 0;

        private f() {
            super((DefaultConstructorMarker) null);
        }

        public d a() {
            return f85252b;
        }

        public int b() {
            return f85253c;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return 1732972547;
        }

        public String toString() {
            return "MarkAsCollected";
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u0014\u0010\u001dR\u001a\u0010\u001f\u001a\u00020\r8\u0010XD¢\u0006\f\n\u0004\b\u001a\u0010\u001e\u001a\u0004\b\u0018\u0010\u000f¨\u0006 "}, d2 = {"LOp/o$g;", "LOp/o;", "", "loading", "LOp/o$g$a;", "type", "LOp/o$d;", "alignment", "<init>", "(ZLOp/o$g$a;LOp/o$d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "c", "()Z", "b", "LOp/o$g$a;", "d", "()LOp/o$g$a;", "LOp/o$d;", "()LOp/o$d;", "I", "order", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.o$g */
    public static final class g extends C10850o {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f85254a;

        /* renamed from: b  reason: collision with root package name */
        private final a f85255b;

        /* renamed from: c  reason: collision with root package name */
        private final d f85256c;

        /* renamed from: d  reason: collision with root package name */
        private final int f85257d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LOp/o$g$a;", "", "<init>", "(Ljava/lang/String;I)V", "ICON_BUTTON", "BUTTON", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Op.o$g$a */
        public enum a {
            ICON_BUTTON,
            BUTTON;

            static {
                a[] a10;
                $ENTRIES = C17221b.a(a10);
            }
        }

        public g() {
            this(false, (a) null, (d) null, 7, (DefaultConstructorMarker) null);
        }

        public d a() {
            return this.f85256c;
        }

        public int b() {
            return this.f85257d;
        }

        public final boolean c() {
            return this.f85254a;
        }

        public final a d() {
            return this.f85255b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f85254a == gVar.f85254a && this.f85255b == gVar.f85255b && this.f85256c == gVar.f85256c;
        }

        public int hashCode() {
            return (((Boolean.hashCode(this.f85254a) * 31) + this.f85255b.hashCode()) * 31) + this.f85256c.hashCode();
        }

        public String toString() {
            boolean z10 = this.f85254a;
            a aVar = this.f85255b;
            d dVar = this.f85256c;
            return "NotifyMeState(loading=" + z10 + ", type=" + aVar + ", alignment=" + dVar + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ g(boolean z10, a aVar, d dVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.ICON_BUTTON : aVar, (i10 & 4) != 0 ? d.End : dVar);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(boolean z10, a aVar, d dVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "type");
            C17542s.j(dVar, "alignment");
            this.f85254a = z10;
            this.f85255b = aVar;
            this.f85256c = dVar;
            this.f85257d = 1;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u00078\u0010XD¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0010\u0010\t¨\u0006\u0018"}, d2 = {"LOp/o$h;", "LOp/o;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "LOp/o$d;", "b", "LOp/o$d;", "a", "()LOp/o$d;", "alignment", "c", "I", "order", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.o$h */
    public static final class h extends C10850o {

        /* renamed from: a  reason: collision with root package name */
        public static final h f85258a = new h();

        /* renamed from: b  reason: collision with root package name */
        private static final d f85259b = d.End;

        /* renamed from: c  reason: collision with root package name */
        private static final int f85260c = 0;

        private h() {
            super((DefaultConstructorMarker) null);
        }

        public d a() {
            return f85259b;
        }

        public int b() {
            return f85260c;
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public int hashCode() {
            return -861001513;
        }

        public String toString() {
            return "Scanner";
        }
    }

    public /* synthetic */ C10850o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract d a();

    public abstract int b();

    private C10850o() {
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u00048\u0010X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u0018\u0010%¨\u0006&"}, d2 = {"LOp/o$b;", "LOp/o;", "", "id", "", "drawableRes", "LIC/e;", "contentDescription", "LSC/H0;", "variant", "order", "LOp/o$d;", "alignment", "<init>", "(Ljava/lang/String;ILIC/e;LSC/H0;ILOp/o$d;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "I", "d", "c", "LIC/e;", "()LIC/e;", "LSC/H0;", "f", "()LSC/H0;", "LOp/o$d;", "()LOp/o$d;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.o$b */
    public static final class b extends C10850o {

        /* renamed from: a  reason: collision with root package name */
        private final String f85239a;

        /* renamed from: b  reason: collision with root package name */
        private final int f85240b;

        /* renamed from: c  reason: collision with root package name */
        private final C13023e f85241c;

        /* renamed from: d  reason: collision with root package name */
        private final H0 f85242d;

        /* renamed from: e  reason: collision with root package name */
        private final int f85243e;

        /* renamed from: f  reason: collision with root package name */
        private final d f85244f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(String str, int i10, C13023e eVar, H0 h02, int i11, d dVar, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10, eVar, (i12 & 8) != 0 ? H0.Tertiary : h02, (i12 & 16) != 0 ? 4 : i11, (i12 & 32) != 0 ? d.End : dVar);
        }

        public d a() {
            return this.f85244f;
        }

        public int b() {
            return this.f85243e;
        }

        public final C13023e c() {
            return this.f85241c;
        }

        public final int d() {
            return this.f85240b;
        }

        public final String e() {
            return this.f85239a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f85239a, bVar.f85239a) && this.f85240b == bVar.f85240b && C17542s.e(this.f85241c, bVar.f85241c) && this.f85242d == bVar.f85242d && this.f85243e == bVar.f85243e && this.f85244f == bVar.f85244f;
        }

        public final H0 f() {
            return this.f85242d;
        }

        public int hashCode() {
            return (((((((((this.f85239a.hashCode() * 31) + Integer.hashCode(this.f85240b)) * 31) + this.f85241c.hashCode()) * 31) + this.f85242d.hashCode()) * 31) + Integer.hashCode(this.f85243e)) * 31) + this.f85244f.hashCode();
        }

        public String toString() {
            String str = this.f85239a;
            int i10 = this.f85240b;
            C13023e eVar = this.f85241c;
            H0 h02 = this.f85242d;
            int i11 = this.f85243e;
            d dVar = this.f85244f;
            return "Custom(id=" + str + ", drawableRes=" + i10 + ", contentDescription=" + eVar + ", variant=" + h02 + ", order=" + i11 + ", alignment=" + dVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(String str, int i10, C13023e eVar, H0 h02, int i11, d dVar) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "id");
            C17542s.j(eVar, "contentDescription");
            C17542s.j(h02, "variant");
            C17542s.j(dVar, "alignment");
            this.f85239a = str;
            this.f85240b = i10;
            this.f85241c = eVar;
            this.f85242d = h02;
            this.f85243e = i11;
            this.f85244f = dVar;
        }
    }
}
