package uG;

import KJ.C15987c;
import OE.n;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.QuickFilter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LuG/l;", "", "<init>", "()V", "b", "a", "LuG/l$a;", "LuG/l$b;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: uG.l  reason: case insensitive filesystem */
public abstract class C18048l {

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LuG/l$a;", "LuG/l;", "", "messageRes", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uG.l$a */
    public static final class a extends C18048l {

        /* renamed from: a  reason: collision with root package name */
        private final int f147715a;

        public a() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        public final int a() {
            return this.f147715a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f147715a == ((a) obj).f147715a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f147715a);
        }

        public String toString() {
            int i10 = this.f147715a;
            return "Error(messageRes=" + i10 + ")";
        }

        public a(int i10) {
            super((DefaultConstructorMarker) null);
            this.f147715a = i10;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? n.f113336b5 : i10);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0017\b\b\u0018\u00002\u00020\u0001Bo\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013Jx\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010\u0017R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010\u0017R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b\u000f\u0010$R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b&\u0010/\u001a\u0004\b0\u0010\u0019¨\u00061"}, d2 = {"LuG/l$b;", "LuG/l;", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "items", "", "isLoading", "isPaging", "", "country", "language", "LKJ/c;", "Lcom/sugarcube/core/network/models/QuickFilter;", "filters", "selectedFilter", "isError", "", "errorMessageRes", "<init>", "(Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;LKJ/c;Lcom/sugarcube/core/network/models/QuickFilter;ZI)V", "a", "(Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;LKJ/c;Lcom/sugarcube/core/network/models/QuickFilter;ZI)LuG/l$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "e", "()Ljava/util/List;", "b", "Z", "h", "()Z", "c", "i", "d", "Ljava/lang/String;", "f", "LKJ/c;", "()LKJ/c;", "g", "Lcom/sugarcube/core/network/models/QuickFilter;", "()Lcom/sugarcube/core/network/models/QuickFilter;", "I", "getErrorMessageRes", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: uG.l$b */
    public static final class b extends C18048l {

        /* renamed from: a  reason: collision with root package name */
        private final List<CachedCatalogItem> f147716a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f147717b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f147718c;

        /* renamed from: d  reason: collision with root package name */
        private final String f147719d;

        /* renamed from: e  reason: collision with root package name */
        private final String f147720e;

        /* renamed from: f  reason: collision with root package name */
        private final C15987c<QuickFilter> f147721f;

        /* renamed from: g  reason: collision with root package name */
        private final QuickFilter f147722g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f147723h;

        /* renamed from: i  reason: collision with root package name */
        private final int f147724i;

        public b() {
            this((List) null, false, false, (String) null, (String) null, (C15987c) null, (QuickFilter) null, false, 0, 511, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ b b(b bVar, List list, boolean z10, boolean z11, String str, String str2, C15987c cVar, QuickFilter quickFilter, boolean z12, int i10, int i11, Object obj) {
            b bVar2 = bVar;
            int i12 = i11;
            return bVar.a((i12 & 1) != 0 ? bVar2.f147716a : list, (i12 & 2) != 0 ? bVar2.f147717b : z10, (i12 & 4) != 0 ? bVar2.f147718c : z11, (i12 & 8) != 0 ? bVar2.f147719d : str, (i12 & 16) != 0 ? bVar2.f147720e : str2, (i12 & 32) != 0 ? bVar2.f147721f : cVar, (i12 & 64) != 0 ? bVar2.f147722g : quickFilter, (i12 & 128) != 0 ? bVar2.f147723h : z12, (i12 & 256) != 0 ? bVar2.f147724i : i10);
        }

        public final b a(List<CachedCatalogItem> list, boolean z10, boolean z11, String str, String str2, C15987c<QuickFilter> cVar, QuickFilter quickFilter, boolean z12, int i10) {
            C17542s.j(list, "items");
            C17542s.j(str, PlaceTypes.COUNTRY);
            String str3 = str2;
            C17542s.j(str3, "language");
            C15987c<QuickFilter> cVar2 = cVar;
            C17542s.j(cVar2, "filters");
            return new b(list, z10, z11, str, str3, cVar2, quickFilter, z12, i10);
        }

        public final String c() {
            return this.f147719d;
        }

        public final C15987c<QuickFilter> d() {
            return this.f147721f;
        }

        public final List<CachedCatalogItem> e() {
            return this.f147716a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return C17542s.e(this.f147716a, bVar.f147716a) && this.f147717b == bVar.f147717b && this.f147718c == bVar.f147718c && C17542s.e(this.f147719d, bVar.f147719d) && C17542s.e(this.f147720e, bVar.f147720e) && C17542s.e(this.f147721f, bVar.f147721f) && C17542s.e(this.f147722g, bVar.f147722g) && this.f147723h == bVar.f147723h && this.f147724i == bVar.f147724i;
        }

        public final String f() {
            return this.f147720e;
        }

        public final QuickFilter g() {
            return this.f147722g;
        }

        public final boolean h() {
            return this.f147717b;
        }

        public int hashCode() {
            int hashCode = ((((((((((this.f147716a.hashCode() * 31) + Boolean.hashCode(this.f147717b)) * 31) + Boolean.hashCode(this.f147718c)) * 31) + this.f147719d.hashCode()) * 31) + this.f147720e.hashCode()) * 31) + this.f147721f.hashCode()) * 31;
            QuickFilter quickFilter = this.f147722g;
            return ((((hashCode + (quickFilter == null ? 0 : quickFilter.hashCode())) * 31) + Boolean.hashCode(this.f147723h)) * 31) + Integer.hashCode(this.f147724i);
        }

        public final boolean i() {
            return this.f147718c;
        }

        public String toString() {
            List<CachedCatalogItem> list = this.f147716a;
            boolean z10 = this.f147717b;
            boolean z11 = this.f147718c;
            String str = this.f147719d;
            String str2 = this.f147720e;
            C15987c<QuickFilter> cVar = this.f147721f;
            QuickFilter quickFilter = this.f147722g;
            boolean z12 = this.f147723h;
            int i10 = this.f147724i;
            return "Success(items=" + list + ", isLoading=" + z10 + ", isPaging=" + z11 + ", country=" + str + ", language=" + str2 + ", filters=" + cVar + ", selectedFilter=" + quickFilter + ", isError=" + z12 + ", errorMessageRes=" + i10 + ")";
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ b(java.util.List r11, boolean r12, boolean r13, java.lang.String r14, java.lang.String r15, KJ.C15987c r16, com.sugarcube.core.network.models.QuickFilter r17, boolean r18, int r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r0 = r20
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000b
                java.util.List r1 = YH.C16877v.n()
                goto L_0x000c
            L_0x000b:
                r1 = r11
            L_0x000c:
                r2 = r0 & 2
                r3 = 0
                if (r2 == 0) goto L_0x0013
                r2 = r3
                goto L_0x0014
            L_0x0013:
                r2 = r12
            L_0x0014:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x001a
                r4 = r3
                goto L_0x001b
            L_0x001a:
                r4 = r13
            L_0x001b:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x0022
                java.lang.String r5 = "us"
                goto L_0x0023
            L_0x0022:
                r5 = r14
            L_0x0023:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x002a
                java.lang.String r6 = "en"
                goto L_0x002b
            L_0x002a:
                r6 = r15
            L_0x002b:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0034
                KJ.f r7 = KJ.C15985a.a()
                goto L_0x0036
            L_0x0034:
                r7 = r16
            L_0x0036:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x003c
                r8 = 0
                goto L_0x003e
            L_0x003c:
                r8 = r17
            L_0x003e:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0043
                goto L_0x0045
            L_0x0043:
                r3 = r18
            L_0x0045:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x004c
                int r0 = OE.n.f113336b5
                goto L_0x004e
            L_0x004c:
                r0 = r19
            L_0x004e:
                r11 = r10
                r12 = r1
                r13 = r2
                r14 = r4
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r8
                r19 = r3
                r20 = r0
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: uG.C18048l.b.<init>(java.util.List, boolean, boolean, java.lang.String, java.lang.String, KJ.c, com.sugarcube.core.network.models.QuickFilter, boolean, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(List<CachedCatalogItem> list, boolean z10, boolean z11, String str, String str2, C15987c<QuickFilter> cVar, QuickFilter quickFilter, boolean z12, int i10) {
            super((DefaultConstructorMarker) null);
            C17542s.j(list, "items");
            C17542s.j(str, PlaceTypes.COUNTRY);
            C17542s.j(str2, "language");
            C17542s.j(cVar, "filters");
            this.f147716a = list;
            this.f147717b = z10;
            this.f147718c = z11;
            this.f147719d = str;
            this.f147720e = str2;
            this.f147721f = cVar;
            this.f147722g = quickFilter;
            this.f147723h = z12;
            this.f147724i = i10;
        }
    }

    public /* synthetic */ C18048l(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private C18048l() {
    }
}
