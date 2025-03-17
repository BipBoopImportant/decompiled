package com.sugarcube.app.base.data.database;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b$\b\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003JU\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0006HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u0011R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u000f\"\u0004\b!\u0010\u0011¨\u0006."}, d2 = {"Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPageQuery;", "", "searchTerm", "", "region", "pageSize", "", "categoryId", "subcategoryId", "stacks", "", "geometryType", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getSearchTerm", "()Ljava/lang/String;", "setSearchTerm", "(Ljava/lang/String;)V", "getRegion", "setRegion", "getPageSize", "()I", "setPageSize", "(I)V", "getCategoryId", "setCategoryId", "getSubcategoryId", "setSubcategoryId", "getStacks", "()Z", "setStacks", "(Z)V", "getGeometryType", "setGeometryType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CachedCatalogSearchPageQuery {
    public static final int $stable = 8;
    private String categoryId;
    private String geometryType;
    private int pageSize;
    private String region;
    private String searchTerm;
    private boolean stacks;
    private String subcategoryId;

    public CachedCatalogSearchPageQuery() {
        this((String) null, (String) null, 0, (String) null, (String) null, false, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CachedCatalogSearchPageQuery copy$default(CachedCatalogSearchPageQuery cachedCatalogSearchPageQuery, String str, String str2, int i10, String str3, String str4, boolean z10, String str5, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cachedCatalogSearchPageQuery.searchTerm;
        }
        if ((i11 & 2) != 0) {
            str2 = cachedCatalogSearchPageQuery.region;
        }
        String str6 = str2;
        if ((i11 & 4) != 0) {
            i10 = cachedCatalogSearchPageQuery.pageSize;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str3 = cachedCatalogSearchPageQuery.categoryId;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = cachedCatalogSearchPageQuery.subcategoryId;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            z10 = cachedCatalogSearchPageQuery.stacks;
        }
        boolean z11 = z10;
        if ((i11 & 64) != 0) {
            str5 = cachedCatalogSearchPageQuery.geometryType;
        }
        return cachedCatalogSearchPageQuery.copy(str, str6, i12, str7, str8, z11, str5);
    }

    public final String component1() {
        return this.searchTerm;
    }

    public final String component2() {
        return this.region;
    }

    public final int component3() {
        return this.pageSize;
    }

    public final String component4() {
        return this.categoryId;
    }

    public final String component5() {
        return this.subcategoryId;
    }

    public final boolean component6() {
        return this.stacks;
    }

    public final String component7() {
        return this.geometryType;
    }

    public final CachedCatalogSearchPageQuery copy(String str, String str2, int i10, String str3, String str4, boolean z10, String str5) {
        C17542s.j(str, "searchTerm");
        C17542s.j(str2, "region");
        return new CachedCatalogSearchPageQuery(str, str2, i10, str3, str4, z10, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedCatalogSearchPageQuery)) {
            return false;
        }
        CachedCatalogSearchPageQuery cachedCatalogSearchPageQuery = (CachedCatalogSearchPageQuery) obj;
        return C17542s.e(this.searchTerm, cachedCatalogSearchPageQuery.searchTerm) && C17542s.e(this.region, cachedCatalogSearchPageQuery.region) && this.pageSize == cachedCatalogSearchPageQuery.pageSize && C17542s.e(this.categoryId, cachedCatalogSearchPageQuery.categoryId) && C17542s.e(this.subcategoryId, cachedCatalogSearchPageQuery.subcategoryId) && this.stacks == cachedCatalogSearchPageQuery.stacks && C17542s.e(this.geometryType, cachedCatalogSearchPageQuery.geometryType);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final String getGeometryType() {
        return this.geometryType;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getSearchTerm() {
        return this.searchTerm;
    }

    public final boolean getStacks() {
        return this.stacks;
    }

    public final String getSubcategoryId() {
        return this.subcategoryId;
    }

    public int hashCode() {
        int hashCode = ((((this.searchTerm.hashCode() * 31) + this.region.hashCode()) * 31) + Integer.hashCode(this.pageSize)) * 31;
        String str = this.categoryId;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subcategoryId;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.stacks)) * 31;
        String str3 = this.geometryType;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setCategoryId(String str) {
        this.categoryId = str;
    }

    public final void setGeometryType(String str) {
        this.geometryType = str;
    }

    public final void setPageSize(int i10) {
        this.pageSize = i10;
    }

    public final void setRegion(String str) {
        C17542s.j(str, "<set-?>");
        this.region = str;
    }

    public final void setSearchTerm(String str) {
        C17542s.j(str, "<set-?>");
        this.searchTerm = str;
    }

    public final void setStacks(boolean z10) {
        this.stacks = z10;
    }

    public final void setSubcategoryId(String str) {
        this.subcategoryId = str;
    }

    public String toString() {
        String str = this.searchTerm;
        String str2 = this.region;
        int i10 = this.pageSize;
        String str3 = this.categoryId;
        String str4 = this.subcategoryId;
        boolean z10 = this.stacks;
        String str5 = this.geometryType;
        return "CachedCatalogSearchPageQuery(searchTerm=" + str + ", region=" + str2 + ", pageSize=" + i10 + ", categoryId=" + str3 + ", subcategoryId=" + str4 + ", stacks=" + z10 + ", geometryType=" + str5 + ")";
    }

    public CachedCatalogSearchPageQuery(String str, String str2, int i10, String str3, String str4, boolean z10, String str5) {
        C17542s.j(str, "searchTerm");
        C17542s.j(str2, "region");
        this.searchTerm = str;
        this.region = str2;
        this.pageSize = i10;
        this.categoryId = str3;
        this.subcategoryId = str4;
        this.stacks = z10;
        this.geometryType = str5;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CachedCatalogSearchPageQuery(java.lang.String r6, java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, boolean r11, java.lang.String r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
        /*
            r5 = this;
            r14 = r13 & 1
            java.lang.String r0 = ""
            if (r14 == 0) goto L_0x0008
            r14 = r0
            goto L_0x0009
        L_0x0008:
            r14 = r6
        L_0x0009:
            r6 = r13 & 2
            if (r6 == 0) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r0 = r7
        L_0x000f:
            r6 = r13 & 4
            r7 = 0
            if (r6 == 0) goto L_0x0016
            r1 = r7
            goto L_0x0017
        L_0x0016:
            r1 = r8
        L_0x0017:
            r6 = r13 & 8
            r8 = 0
            if (r6 == 0) goto L_0x001e
            r2 = r8
            goto L_0x001f
        L_0x001e:
            r2 = r9
        L_0x001f:
            r6 = r13 & 16
            if (r6 == 0) goto L_0x0025
            r3 = r8
            goto L_0x0026
        L_0x0025:
            r3 = r10
        L_0x0026:
            r6 = r13 & 32
            if (r6 == 0) goto L_0x002c
            r4 = r7
            goto L_0x002d
        L_0x002c:
            r4 = r11
        L_0x002d:
            r6 = r13 & 64
            if (r6 == 0) goto L_0x0033
            r13 = r8
            goto L_0x0034
        L_0x0033:
            r13 = r12
        L_0x0034:
            r6 = r5
            r7 = r14
            r8 = r0
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogSearchPageQuery.<init>(java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
