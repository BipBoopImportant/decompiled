package yG;

import KJ.C15987c;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.core.network.models.CatalogCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b#\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0001\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00078\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b$\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b1\u00100R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b+\u00102\u001a\u0004\b)\u0010\u0018R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00102\u001a\u0004\b-\u0010\u0018¨\u00063"}, d2 = {"LyG/r;", "", "", "screenTitleResId", "Lcom/sugarcube/core/network/models/CatalogCategory;", "selectedCategory", "selectedFilter", "", "categories", "LKJ/c;", "subCategories", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "catalogItems", "", "isLoading", "isPaging", "", "country", "language", "<init>", "(ILcom/sugarcube/core/network/models/CatalogCategory;Lcom/sugarcube/core/network/models/CatalogCategory;Ljava/util/List;LKJ/c;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)V", "a", "(ILcom/sugarcube/core/network/models/CatalogCategory;Lcom/sugarcube/core/network/models/CatalogCategory;Ljava/util/List;LKJ/c;Ljava/util/List;ZZLjava/lang/String;Ljava/lang/String;)LyG/r;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getScreenTitleResId", "b", "Lcom/sugarcube/core/network/models/CatalogCategory;", "g", "()Lcom/sugarcube/core/network/models/CatalogCategory;", "c", "h", "d", "Ljava/util/List;", "()Ljava/util/List;", "e", "LKJ/c;", "i", "()LKJ/c;", "f", "Z", "j", "()Z", "k", "Ljava/lang/String;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final int f152660a;

    /* renamed from: b  reason: collision with root package name */
    private final CatalogCategory f152661b;

    /* renamed from: c  reason: collision with root package name */
    private final CatalogCategory f152662c;

    /* renamed from: d  reason: collision with root package name */
    private final List<CatalogCategory> f152663d;

    /* renamed from: e  reason: collision with root package name */
    private final C15987c<CatalogCategory> f152664e;

    /* renamed from: f  reason: collision with root package name */
    private final List<CachedCatalogItem> f152665f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f152666g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f152667h;

    /* renamed from: i  reason: collision with root package name */
    private final String f152668i;

    /* renamed from: j  reason: collision with root package name */
    private final String f152669j;

    public r() {
        this(0, (CatalogCategory) null, (CatalogCategory) null, (List) null, (C15987c) null, (List) null, false, false, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ r b(r rVar, int i10, CatalogCategory catalogCategory, CatalogCategory catalogCategory2, List list, C15987c cVar, List list2, boolean z10, boolean z11, String str, String str2, int i11, Object obj) {
        r rVar2 = rVar;
        int i12 = i11;
        return rVar.a((i12 & 1) != 0 ? rVar2.f152660a : i10, (i12 & 2) != 0 ? rVar2.f152661b : catalogCategory, (i12 & 4) != 0 ? rVar2.f152662c : catalogCategory2, (i12 & 8) != 0 ? rVar2.f152663d : list, (i12 & 16) != 0 ? rVar2.f152664e : cVar, (i12 & 32) != 0 ? rVar2.f152665f : list2, (i12 & 64) != 0 ? rVar2.f152666g : z10, (i12 & 128) != 0 ? rVar2.f152667h : z11, (i12 & 256) != 0 ? rVar2.f152668i : str, (i12 & 512) != 0 ? rVar2.f152669j : str2);
    }

    public final r a(int i10, CatalogCategory catalogCategory, CatalogCategory catalogCategory2, List<CatalogCategory> list, C15987c<CatalogCategory> cVar, List<CachedCatalogItem> list2, boolean z10, boolean z11, String str, String str2) {
        List<CatalogCategory> list3 = list;
        C17542s.j(list3, "categories");
        C15987c<CatalogCategory> cVar2 = cVar;
        C17542s.j(cVar2, "subCategories");
        List<CachedCatalogItem> list4 = list2;
        C17542s.j(list4, "catalogItems");
        String str3 = str;
        C17542s.j(str3, PlaceTypes.COUNTRY);
        String str4 = str2;
        C17542s.j(str4, "language");
        return new r(i10, catalogCategory, catalogCategory2, list3, cVar2, list4, z10, z11, str3, str4);
    }

    public final List<CachedCatalogItem> c() {
        return this.f152665f;
    }

    public final List<CatalogCategory> d() {
        return this.f152663d;
    }

    public final String e() {
        return this.f152668i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f152660a == rVar.f152660a && C17542s.e(this.f152661b, rVar.f152661b) && C17542s.e(this.f152662c, rVar.f152662c) && C17542s.e(this.f152663d, rVar.f152663d) && C17542s.e(this.f152664e, rVar.f152664e) && C17542s.e(this.f152665f, rVar.f152665f) && this.f152666g == rVar.f152666g && this.f152667h == rVar.f152667h && C17542s.e(this.f152668i, rVar.f152668i) && C17542s.e(this.f152669j, rVar.f152669j);
    }

    public final String f() {
        return this.f152669j;
    }

    public final CatalogCategory g() {
        return this.f152661b;
    }

    public final CatalogCategory h() {
        return this.f152662c;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f152660a) * 31;
        CatalogCategory catalogCategory = this.f152661b;
        int i10 = 0;
        int hashCode2 = (hashCode + (catalogCategory == null ? 0 : catalogCategory.hashCode())) * 31;
        CatalogCategory catalogCategory2 = this.f152662c;
        if (catalogCategory2 != null) {
            i10 = catalogCategory2.hashCode();
        }
        return ((((((((((((((hashCode2 + i10) * 31) + this.f152663d.hashCode()) * 31) + this.f152664e.hashCode()) * 31) + this.f152665f.hashCode()) * 31) + Boolean.hashCode(this.f152666g)) * 31) + Boolean.hashCode(this.f152667h)) * 31) + this.f152668i.hashCode()) * 31) + this.f152669j.hashCode();
    }

    public final C15987c<CatalogCategory> i() {
        return this.f152664e;
    }

    public final boolean j() {
        return this.f152666g;
    }

    public final boolean k() {
        return this.f152667h;
    }

    public String toString() {
        int i10 = this.f152660a;
        CatalogCategory catalogCategory = this.f152661b;
        CatalogCategory catalogCategory2 = this.f152662c;
        List<CatalogCategory> list = this.f152663d;
        C15987c<CatalogCategory> cVar = this.f152664e;
        List<CachedCatalogItem> list2 = this.f152665f;
        boolean z10 = this.f152666g;
        boolean z11 = this.f152667h;
        String str = this.f152668i;
        String str2 = this.f152669j;
        return "CategoriesUIState(screenTitleResId=" + i10 + ", selectedCategory=" + catalogCategory + ", selectedFilter=" + catalogCategory2 + ", categories=" + list + ", subCategories=" + cVar + ", catalogItems=" + list2 + ", isLoading=" + z10 + ", isPaging=" + z11 + ", country=" + str + ", language=" + str2 + ")";
    }

    public r(int i10, CatalogCategory catalogCategory, CatalogCategory catalogCategory2, List<CatalogCategory> list, C15987c<CatalogCategory> cVar, List<CachedCatalogItem> list2, boolean z10, boolean z11, String str, String str2) {
        C17542s.j(list, "categories");
        C17542s.j(cVar, "subCategories");
        C17542s.j(list2, "catalogItems");
        C17542s.j(str, PlaceTypes.COUNTRY);
        C17542s.j(str2, "language");
        this.f152660a = i10;
        this.f152661b = catalogCategory;
        this.f152662c = catalogCategory2;
        this.f152663d = list;
        this.f152664e = cVar;
        this.f152665f = list2;
        this.f152666g = z10;
        this.f152667h = z11;
        this.f152668i = str;
        this.f152669j = str2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ r(int r12, com.sugarcube.core.network.models.CatalogCategory r13, com.sugarcube.core.network.models.CatalogCategory r14, java.util.List r15, KJ.C15987c r16, java.util.List r17, boolean r18, boolean r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            int r1 = OE.n.f113175B1
            goto L_0x000a
        L_0x0009:
            r1 = r12
        L_0x000a:
            r2 = r0 & 2
            r3 = 0
            if (r2 == 0) goto L_0x0011
            r2 = r3
            goto L_0x0012
        L_0x0011:
            r2 = r13
        L_0x0012:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r3 = r14
        L_0x0018:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0021
            java.util.List r4 = YH.C16877v.n()
            goto L_0x0022
        L_0x0021:
            r4 = r15
        L_0x0022:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x002b
            KJ.f r5 = KJ.C15985a.a()
            goto L_0x002d
        L_0x002b:
            r5 = r16
        L_0x002d:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0036
            java.util.List r6 = YH.C16877v.n()
            goto L_0x0038
        L_0x0036:
            r6 = r17
        L_0x0038:
            r7 = r0 & 64
            r8 = 0
            if (r7 == 0) goto L_0x003f
            r7 = r8
            goto L_0x0041
        L_0x003f:
            r7 = r18
        L_0x0041:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r8 = r19
        L_0x0048:
            r9 = r0 & 256(0x100, float:3.59E-43)
            java.lang.String r10 = ""
            if (r9 == 0) goto L_0x0050
            r9 = r10
            goto L_0x0052
        L_0x0050:
            r9 = r20
        L_0x0052:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r10 = r21
        L_0x0059:
            r12 = r11
            r13 = r1
            r14 = r2
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yG.r.<init>(int, com.sugarcube.core.network.models.CatalogCategory, com.sugarcube.core.network.models.CatalogCategory, java.util.List, KJ.c, java.util.List, boolean, boolean, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
