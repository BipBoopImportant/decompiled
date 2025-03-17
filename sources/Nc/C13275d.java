package NC;

import SC.H0;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"LNC/d;", "", "<init>", "()V", "b", "a", "c", "LNC/d$a;", "LNC/d$b;", "LNC/d$c;", "overflow-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: NC.d  reason: case insensitive filesystem */
public abstract class C13275d {

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\r¨\u0006\u001f"}, d2 = {"LNC/d$c;", "LNC/d;", "Lkotlin/Function0;", "LXH/N;", "onClick", "", "enabled", "", "label", "contentDescription", "<init>", "(LnI/a;ZLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/a;", "c", "()LnI/a;", "b", "Z", "()Z", "Ljava/lang/String;", "d", "getContentDescription", "overflow-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NC.d$c */
    public static final class c extends C13275d {

        /* renamed from: e  reason: collision with root package name */
        public static final int f112404e = 0;

        /* renamed from: a  reason: collision with root package name */
        private final C17631a<C16807N> f112405a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f112406b;

        /* renamed from: c  reason: collision with root package name */
        private final String f112407c;

        /* renamed from: d  reason: collision with root package name */
        private final String f112408d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ c(C17631a aVar, boolean z10, String str, String str2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i10 & 2) != 0 ? true : z10, str, (i10 & 8) != 0 ? null : str2);
        }

        public final boolean a() {
            return this.f112406b;
        }

        public final String b() {
            return this.f112407c;
        }

        public final C17631a<C16807N> c() {
            return this.f112405a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f112405a, cVar.f112405a) && this.f112406b == cVar.f112406b && C17542s.e(this.f112407c, cVar.f112407c) && C17542s.e(this.f112408d, cVar.f112408d);
        }

        public int hashCode() {
            int hashCode = ((((this.f112405a.hashCode() * 31) + Boolean.hashCode(this.f112406b)) * 31) + this.f112407c.hashCode()) * 31;
            String str = this.f112408d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            C17631a<C16807N> aVar = this.f112405a;
            boolean z10 = this.f112406b;
            String str = this.f112407c;
            String str2 = this.f112408d;
            return "TextMenuItem(onClick=" + aVar + ", enabled=" + z10 + ", label=" + str + ", contentDescription=" + str2 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a<C16807N> aVar, boolean z10, String str, String str2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "onClick");
            C17542s.j(str, "label");
            this.f112405a = aVar;
            this.f112406b = z10;
            this.f112407c = str;
            this.f112408d = str2;
        }
    }

    public /* synthetic */ C13275d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJR\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b!\u0010\u0013R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b(\u0010 ¨\u0006)"}, d2 = {"LNC/d$a;", "LNC/d;", "Lkotlin/Function0;", "LXH/N;", "onClick", "", "enabled", "", "iconResource", "", "contentDescription", "LSC/H0;", "variant", "showBadge", "<init>", "(LnI/a;ZILjava/lang/String;LSC/H0;Z)V", "a", "(LnI/a;ZILjava/lang/String;LSC/H0;Z)LNC/d$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "LnI/a;", "f", "()LnI/a;", "b", "Z", "d", "()Z", "c", "I", "e", "Ljava/lang/String;", "LSC/H0;", "h", "()LSC/H0;", "g", "overflow-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NC.d$a */
    public static final class a extends C13275d {

        /* renamed from: g  reason: collision with root package name */
        public static final int f112392g = 0;

        /* renamed from: a  reason: collision with root package name */
        private final C17631a<C16807N> f112393a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f112394b;

        /* renamed from: c  reason: collision with root package name */
        private final int f112395c;

        /* renamed from: d  reason: collision with root package name */
        private final String f112396d;

        /* renamed from: e  reason: collision with root package name */
        private final H0 f112397e;

        /* renamed from: f  reason: collision with root package name */
        private final boolean f112398f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(C17631a aVar, boolean z10, int i10, String str, H0 h02, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar, (i11 & 2) != 0 ? true : z10, i10, str, (i11 & 16) != 0 ? H0.Tertiary : h02, (i11 & 32) != 0 ? false : z11);
        }

        public static /* synthetic */ a b(a aVar, C17631a<C16807N> aVar2, boolean z10, int i10, String str, H0 h02, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                aVar2 = aVar.f112393a;
            }
            if ((i11 & 2) != 0) {
                z10 = aVar.f112394b;
            }
            boolean z12 = z10;
            if ((i11 & 4) != 0) {
                i10 = aVar.f112395c;
            }
            int i12 = i10;
            if ((i11 & 8) != 0) {
                str = aVar.f112396d;
            }
            String str2 = str;
            if ((i11 & 16) != 0) {
                h02 = aVar.f112397e;
            }
            H0 h03 = h02;
            if ((i11 & 32) != 0) {
                z11 = aVar.f112398f;
            }
            return aVar.a(aVar2, z12, i12, str2, h03, z11);
        }

        public final a a(C17631a<C16807N> aVar, boolean z10, int i10, String str, H0 h02, boolean z11) {
            C17542s.j(aVar, "onClick");
            C17542s.j(str, "contentDescription");
            C17542s.j(h02, "variant");
            return new a(aVar, z10, i10, str, h02, z11);
        }

        public final String c() {
            return this.f112396d;
        }

        public final boolean d() {
            return this.f112394b;
        }

        public final int e() {
            return this.f112395c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f112393a, aVar.f112393a) && this.f112394b == aVar.f112394b && this.f112395c == aVar.f112395c && C17542s.e(this.f112396d, aVar.f112396d) && this.f112397e == aVar.f112397e && this.f112398f == aVar.f112398f;
        }

        public final C17631a<C16807N> f() {
            return this.f112393a;
        }

        public final boolean g() {
            return this.f112398f;
        }

        public final H0 h() {
            return this.f112397e;
        }

        public int hashCode() {
            return (((((((((this.f112393a.hashCode() * 31) + Boolean.hashCode(this.f112394b)) * 31) + Integer.hashCode(this.f112395c)) * 31) + this.f112396d.hashCode()) * 31) + this.f112397e.hashCode()) * 31) + Boolean.hashCode(this.f112398f);
        }

        public String toString() {
            C17631a<C16807N> aVar = this.f112393a;
            boolean z10 = this.f112394b;
            int i10 = this.f112395c;
            String str = this.f112396d;
            H0 h02 = this.f112397e;
            boolean z11 = this.f112398f;
            return "IconMenuItem(onClick=" + aVar + ", enabled=" + z10 + ", iconResource=" + i10 + ", contentDescription=" + str + ", variant=" + h02 + ", showBadge=" + z11 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17631a<C16807N> aVar, boolean z10, int i10, String str, H0 h02, boolean z11) {
            super((DefaultConstructorMarker) null);
            C17542s.j(aVar, "onClick");
            C17542s.j(str, "contentDescription");
            C17542s.j(h02, "variant");
            this.f112393a = aVar;
            this.f112394b = z10;
            this.f112395c = i10;
            this.f112396d = str;
            this.f112397e = h02;
            this.f112398f = z11;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"LNC/d$b;", "LNC/d;", "", "iconResource", "", "enabled", "", "contentDescription", "LSC/H0;", "variant", "<init>", "(IZLjava/lang/String;LSC/H0;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "I", "c", "b", "Z", "()Z", "Ljava/lang/String;", "d", "LSC/H0;", "()LSC/H0;", "overflow-menu_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NC.d$b */
    public static final class b extends C13275d {

        /* renamed from: e  reason: collision with root package name */
        public static final int f112399e = 0;

        /* renamed from: a  reason: collision with root package name */
        private final int f112400a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f112401b;

        /* renamed from: c  reason: collision with root package name */
        private final String f112402c;

        /* renamed from: d  reason: collision with root package name */
        private final H0 f112403d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, boolean z10, String str, H0 h02, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, (i11 & 2) != 0 ? true : z10, str, (i11 & 8) != 0 ? H0.Tertiary : h02);
        }

        public final String a() {
            return this.f112402c;
        }

        public final boolean b() {
            return this.f112401b;
        }

        public final int c() {
            return this.f112400a;
        }

        public final H0 d() {
            return this.f112403d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f112400a == bVar.f112400a && this.f112401b == bVar.f112401b && C17542s.e(this.f112402c, bVar.f112402c) && this.f112403d == bVar.f112403d;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f112400a) * 31) + Boolean.hashCode(this.f112401b)) * 31) + this.f112402c.hashCode()) * 31) + this.f112403d.hashCode();
        }

        public String toString() {
            int i10 = this.f112400a;
            boolean z10 = this.f112401b;
            String str = this.f112402c;
            H0 h02 = this.f112403d;
            return "OverflowMenu(iconResource=" + i10 + ", enabled=" + z10 + ", contentDescription=" + str + ", variant=" + h02 + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i10, boolean z10, String str, H0 h02) {
            super((DefaultConstructorMarker) null);
            C17542s.j(str, "contentDescription");
            C17542s.j(h02, "variant");
            this.f112400a = i10;
            this.f112401b = z10;
            this.f112402c = str;
            this.f112403d = h02;
        }
    }

    private C13275d() {
    }
}
