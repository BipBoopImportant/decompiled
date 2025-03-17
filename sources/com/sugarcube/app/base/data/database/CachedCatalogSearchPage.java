package com.sugarcube.app.base.data.database;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010'\u001a\u00020\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0000HÆ\u0003JQ\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0000HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\nHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010 \"\u0004\b$\u0010\"¨\u00061"}, d2 = {"Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPage;", "", "totalCount", "", "pageItems", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "query", "Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPageQuery;", "nextPageToken", "", "nextPage", "prevPage", "<init>", "(ILjava/util/List;Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPageQuery;Ljava/lang/String;Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPage;Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPage;)V", "getTotalCount", "()I", "setTotalCount", "(I)V", "getPageItems", "()Ljava/util/List;", "setPageItems", "(Ljava/util/List;)V", "getQuery", "()Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPageQuery;", "setQuery", "(Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPageQuery;)V", "getNextPageToken", "()Ljava/lang/String;", "setNextPageToken", "(Ljava/lang/String;)V", "getNextPage", "()Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPage;", "setNextPage", "(Lcom/sugarcube/app/base/data/database/CachedCatalogSearchPage;)V", "getPrevPage", "setPrevPage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CachedCatalogSearchPage {
    public static final int $stable = 8;
    private CachedCatalogSearchPage nextPage;
    private String nextPageToken;
    private List<CachedCatalogItem> pageItems;
    private CachedCatalogSearchPage prevPage;
    private CachedCatalogSearchPageQuery query;
    private int totalCount;

    public CachedCatalogSearchPage() {
        this(0, (List) null, (CachedCatalogSearchPageQuery) null, (String) null, (CachedCatalogSearchPage) null, (CachedCatalogSearchPage) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CachedCatalogSearchPage copy$default(CachedCatalogSearchPage cachedCatalogSearchPage, int i10, List<CachedCatalogItem> list, CachedCatalogSearchPageQuery cachedCatalogSearchPageQuery, String str, CachedCatalogSearchPage cachedCatalogSearchPage2, CachedCatalogSearchPage cachedCatalogSearchPage3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cachedCatalogSearchPage.totalCount;
        }
        if ((i11 & 2) != 0) {
            list = cachedCatalogSearchPage.pageItems;
        }
        List<CachedCatalogItem> list2 = list;
        if ((i11 & 4) != 0) {
            cachedCatalogSearchPageQuery = cachedCatalogSearchPage.query;
        }
        CachedCatalogSearchPageQuery cachedCatalogSearchPageQuery2 = cachedCatalogSearchPageQuery;
        if ((i11 & 8) != 0) {
            str = cachedCatalogSearchPage.nextPageToken;
        }
        String str2 = str;
        if ((i11 & 16) != 0) {
            cachedCatalogSearchPage2 = cachedCatalogSearchPage.nextPage;
        }
        CachedCatalogSearchPage cachedCatalogSearchPage4 = cachedCatalogSearchPage2;
        if ((i11 & 32) != 0) {
            cachedCatalogSearchPage3 = cachedCatalogSearchPage.prevPage;
        }
        return cachedCatalogSearchPage.copy(i10, list2, cachedCatalogSearchPageQuery2, str2, cachedCatalogSearchPage4, cachedCatalogSearchPage3);
    }

    public final int component1() {
        return this.totalCount;
    }

    public final List<CachedCatalogItem> component2() {
        return this.pageItems;
    }

    public final CachedCatalogSearchPageQuery component3() {
        return this.query;
    }

    public final String component4() {
        return this.nextPageToken;
    }

    public final CachedCatalogSearchPage component5() {
        return this.nextPage;
    }

    public final CachedCatalogSearchPage component6() {
        return this.prevPage;
    }

    public final CachedCatalogSearchPage copy(int i10, List<CachedCatalogItem> list, CachedCatalogSearchPageQuery cachedCatalogSearchPageQuery, String str, CachedCatalogSearchPage cachedCatalogSearchPage, CachedCatalogSearchPage cachedCatalogSearchPage2) {
        C17542s.j(list, "pageItems");
        C17542s.j(cachedCatalogSearchPageQuery, "query");
        return new CachedCatalogSearchPage(i10, list, cachedCatalogSearchPageQuery, str, cachedCatalogSearchPage, cachedCatalogSearchPage2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedCatalogSearchPage)) {
            return false;
        }
        CachedCatalogSearchPage cachedCatalogSearchPage = (CachedCatalogSearchPage) obj;
        return this.totalCount == cachedCatalogSearchPage.totalCount && C17542s.e(this.pageItems, cachedCatalogSearchPage.pageItems) && C17542s.e(this.query, cachedCatalogSearchPage.query) && C17542s.e(this.nextPageToken, cachedCatalogSearchPage.nextPageToken) && C17542s.e(this.nextPage, cachedCatalogSearchPage.nextPage) && C17542s.e(this.prevPage, cachedCatalogSearchPage.prevPage);
    }

    public final CachedCatalogSearchPage getNextPage() {
        return this.nextPage;
    }

    public final String getNextPageToken() {
        return this.nextPageToken;
    }

    public final List<CachedCatalogItem> getPageItems() {
        return this.pageItems;
    }

    public final CachedCatalogSearchPage getPrevPage() {
        return this.prevPage;
    }

    public final CachedCatalogSearchPageQuery getQuery() {
        return this.query;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.totalCount) * 31) + this.pageItems.hashCode()) * 31) + this.query.hashCode()) * 31;
        String str = this.nextPageToken;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        CachedCatalogSearchPage cachedCatalogSearchPage = this.nextPage;
        int hashCode3 = (hashCode2 + (cachedCatalogSearchPage == null ? 0 : cachedCatalogSearchPage.hashCode())) * 31;
        CachedCatalogSearchPage cachedCatalogSearchPage2 = this.prevPage;
        if (cachedCatalogSearchPage2 != null) {
            i10 = cachedCatalogSearchPage2.hashCode();
        }
        return hashCode3 + i10;
    }

    public final void setNextPage(CachedCatalogSearchPage cachedCatalogSearchPage) {
        this.nextPage = cachedCatalogSearchPage;
    }

    public final void setNextPageToken(String str) {
        this.nextPageToken = str;
    }

    public final void setPageItems(List<CachedCatalogItem> list) {
        C17542s.j(list, "<set-?>");
        this.pageItems = list;
    }

    public final void setPrevPage(CachedCatalogSearchPage cachedCatalogSearchPage) {
        this.prevPage = cachedCatalogSearchPage;
    }

    public final void setQuery(CachedCatalogSearchPageQuery cachedCatalogSearchPageQuery) {
        C17542s.j(cachedCatalogSearchPageQuery, "<set-?>");
        this.query = cachedCatalogSearchPageQuery;
    }

    public final void setTotalCount(int i10) {
        this.totalCount = i10;
    }

    public String toString() {
        int i10 = this.totalCount;
        List<CachedCatalogItem> list = this.pageItems;
        CachedCatalogSearchPageQuery cachedCatalogSearchPageQuery = this.query;
        String str = this.nextPageToken;
        CachedCatalogSearchPage cachedCatalogSearchPage = this.nextPage;
        CachedCatalogSearchPage cachedCatalogSearchPage2 = this.prevPage;
        return "CachedCatalogSearchPage(totalCount=" + i10 + ", pageItems=" + list + ", query=" + cachedCatalogSearchPageQuery + ", nextPageToken=" + str + ", nextPage=" + cachedCatalogSearchPage + ", prevPage=" + cachedCatalogSearchPage2 + ")";
    }

    public CachedCatalogSearchPage(int i10, List<CachedCatalogItem> list, CachedCatalogSearchPageQuery cachedCatalogSearchPageQuery, String str, CachedCatalogSearchPage cachedCatalogSearchPage, CachedCatalogSearchPage cachedCatalogSearchPage2) {
        C17542s.j(list, "pageItems");
        C17542s.j(cachedCatalogSearchPageQuery, "query");
        this.totalCount = i10;
        this.pageItems = list;
        this.query = cachedCatalogSearchPageQuery;
        this.nextPageToken = str;
        this.nextPage = cachedCatalogSearchPage;
        this.prevPage = cachedCatalogSearchPage2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CachedCatalogSearchPage(int r14, java.util.List r15, com.sugarcube.app.base.data.database.CachedCatalogSearchPageQuery r16, java.lang.String r17, com.sugarcube.app.base.data.database.CachedCatalogSearchPage r18, com.sugarcube.app.base.data.database.CachedCatalogSearchPage r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
        /*
            r13 = this;
            r0 = r20 & 1
            if (r0 == 0) goto L_0x0006
            r0 = 0
            goto L_0x0007
        L_0x0006:
            r0 = r14
        L_0x0007:
            r1 = r20 & 2
            if (r1 == 0) goto L_0x0010
            java.util.List r1 = YH.C16877v.n()
            goto L_0x0011
        L_0x0010:
            r1 = r15
        L_0x0011:
            r2 = r20 & 4
            if (r2 == 0) goto L_0x0026
            com.sugarcube.app.base.data.database.CachedCatalogSearchPageQuery r2 = new com.sugarcube.app.base.data.database.CachedCatalogSearchPageQuery
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0028
        L_0x0026:
            r2 = r16
        L_0x0028:
            r3 = r20 & 8
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3 = r4
            goto L_0x0031
        L_0x002f:
            r3 = r17
        L_0x0031:
            r5 = r20 & 16
            if (r5 == 0) goto L_0x0037
            r5 = r4
            goto L_0x0039
        L_0x0037:
            r5 = r18
        L_0x0039:
            r6 = r20 & 32
            if (r6 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r4 = r19
        L_0x0040:
            r14 = r13
            r15 = r0
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r5
            r20 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogSearchPage.<init>(int, java.util.List, com.sugarcube.app.base.data.database.CachedCatalogSearchPageQuery, java.lang.String, com.sugarcube.app.base.data.database.CachedCatalogSearchPage, com.sugarcube.app.base.data.database.CachedCatalogSearchPage, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
