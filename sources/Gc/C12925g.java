package GC;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15990f;
import Op.C10828d;
import Op.a1;
import Op.b1;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import qx.C14957b;
import qx.c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\b\u0018\u0000 $2\u00020\u0001:\u0002\u0017\u001bB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010 \u001a\u0004\b\u001f\u0010!R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b\u0017\u0010#¨\u0006%"}, d2 = {"LGC/g;", "", "", "loading", "LIC/e;", "title", "description", "", "LOp/a1;", "items", "LGC/g$a;", "basePriceDetails", "<init>", "(ZLIC/e;LIC/e;Ljava/util/List;LGC/g$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "d", "()Z", "b", "LIC/e;", "e", "()LIC/e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "LGC/g$a;", "()LGC/g$a;", "f", "assemblyservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GC.g  reason: case insensitive filesystem */
public final class C12925g {

    /* renamed from: f  reason: collision with root package name */
    public static final b f110316f = new b((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f110317g = 8;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f110318a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f110319b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f110320c;

    /* renamed from: d  reason: collision with root package name */
    private final List<a1> f110321d;

    /* renamed from: e  reason: collision with root package name */
    private final a f110322e;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0011\u0010\t¨\u0006\u0016"}, d2 = {"LGC/g$a;", "", "LIC/e;", "label", "", "formattedPrice", "<init>", "(LIC/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "Ljava/lang/String;", "assemblyservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GC.g$a */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        public static final int f110323c = C13023e.f110931a;

        /* renamed from: a  reason: collision with root package name */
        private final C13023e f110324a;

        /* renamed from: b  reason: collision with root package name */
        private final String f110325b;

        public a(C13023e eVar, String str) {
            C17542s.j(eVar, "label");
            C17542s.j(str, "formattedPrice");
            this.f110324a = eVar;
            this.f110325b = str;
        }

        public final String a() {
            return this.f110325b;
        }

        public final C13023e b() {
            return this.f110324a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f110324a, aVar.f110324a) && C17542s.e(this.f110325b, aVar.f110325b);
        }

        public int hashCode() {
            return (this.f110324a.hashCode() * 31) + this.f110325b.hashCode();
        }

        public String toString() {
            C13023e eVar = this.f110324a;
            String str = this.f110325b;
            return "BasePriceDetails(label=" + eVar + ", formattedPrice=" + str + ")";
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LGC/g$b;", "", "<init>", "()V", "", "itemNo", "itemType", "", "quantity", "imageUrl", "productName", "description", "", "assemblySubTotalPrice", "Lkp/d;", "currencyConfig", "LOp/a1;", "a", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;DLkp/d;)LOp/a1;", "assemblyservices_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: GC.g$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a1 a(String str, String str2, int i10, String str3, String str4, String str5, double d10, C11522d dVar) {
            C17542s.j(str, "itemNo");
            C17542s.j(str2, "itemType");
            C17542s.j(str4, "productName");
            C17542s.j(str5, "description");
            C17542s.j(dVar, "currencyConfig");
            C10828d.l.f fVar = new C10828d.l.f(new C10828d.l.e((c) null, C14957b.a(d10, dVar), C16877v.n(), (String) null));
            C15990f b10 = C15985a.b(new C10828d.m.b(new C10828d.C1720d(str3 == null ? "" : str3, (String) null)));
            return new a1((a1.a) null, new C10828d(str, str2, (C10828d.b) null, b10, new C10828d.h((C10828d.i) null, (C13023e) null, str4, str5, (C13023e) null, fVar, (C10828d.c) null, C15985a.a(), (String) null, 19, (DefaultConstructorMarker) null), C15985a.a(), C15985a.a(), false), dVar, new b1.c(C13026h.b(Oo.b.f84585a7, Integer.valueOf(i10))), false, false, false);
        }

        private b() {
        }
    }

    public C12925g(boolean z10, C13023e eVar, C13023e eVar2, List<a1> list, a aVar) {
        C17542s.j(eVar, "title");
        C17542s.j(eVar2, "description");
        C17542s.j(list, "items");
        this.f110318a = z10;
        this.f110319b = eVar;
        this.f110320c = eVar2;
        this.f110321d = list;
        this.f110322e = aVar;
    }

    public final a a() {
        return this.f110322e;
    }

    public final C13023e b() {
        return this.f110320c;
    }

    public final List<a1> c() {
        return this.f110321d;
    }

    public final boolean d() {
        return this.f110318a;
    }

    public final C13023e e() {
        return this.f110319b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12925g)) {
            return false;
        }
        C12925g gVar = (C12925g) obj;
        return this.f110318a == gVar.f110318a && C17542s.e(this.f110319b, gVar.f110319b) && C17542s.e(this.f110320c, gVar.f110320c) && C17542s.e(this.f110321d, gVar.f110321d) && C17542s.e(this.f110322e, gVar.f110322e);
    }

    public int hashCode() {
        int hashCode = ((((((Boolean.hashCode(this.f110318a) * 31) + this.f110319b.hashCode()) * 31) + this.f110320c.hashCode()) * 31) + this.f110321d.hashCode()) * 31;
        a aVar = this.f110322e;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        boolean z10 = this.f110318a;
        C13023e eVar = this.f110319b;
        C13023e eVar2 = this.f110320c;
        List<a1> list = this.f110321d;
        a aVar = this.f110322e;
        return "AssemblyDetailsUiState(loading=" + z10 + ", title=" + eVar + ", description=" + eVar2 + ", items=" + list + ", basePriceDetails=" + aVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12925g(boolean z10, C13023e eVar, C13023e eVar2, List list, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, (i10 & 2) != 0 ? C13026h.a(Oo.b.f84600c0) : eVar, (i10 & 4) != 0 ? C13026h.a(Oo.b.f84611d0) : eVar2, (i10 & 8) != 0 ? C16877v.n() : list, (i10 & 16) != 0 ? null : aVar);
    }
}
