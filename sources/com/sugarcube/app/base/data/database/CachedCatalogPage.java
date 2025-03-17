package com.sugarcube.app.base.data.database;

import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rJ\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0000HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0000HÆ\u0003JS\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0003HÖ\u0001J\t\u0010-\u001a\u00020.HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0000X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001f¨\u0006/"}, d2 = {"Lcom/sugarcube/app/base/data/database/CachedCatalogPage;", "", "totalCount", "", "pageItems", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "prevUrl", "Landroid/net/Uri;", "nextUrl", "nextPage", "prevPage", "<init>", "(ILjava/util/List;Landroid/net/Uri;Landroid/net/Uri;Lcom/sugarcube/app/base/data/database/CachedCatalogPage;Lcom/sugarcube/app/base/data/database/CachedCatalogPage;)V", "getTotalCount", "()I", "setTotalCount", "(I)V", "getPageItems", "()Ljava/util/List;", "setPageItems", "(Ljava/util/List;)V", "getPrevUrl", "()Landroid/net/Uri;", "setPrevUrl", "(Landroid/net/Uri;)V", "getNextUrl", "setNextUrl", "getNextPage", "()Lcom/sugarcube/app/base/data/database/CachedCatalogPage;", "setNextPage", "(Lcom/sugarcube/app/base/data/database/CachedCatalogPage;)V", "getPrevPage", "setPrevPage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CachedCatalogPage {
    public static final int $stable = 8;
    private CachedCatalogPage nextPage;
    private Uri nextUrl;
    private List<CachedCatalogItem> pageItems;
    private CachedCatalogPage prevPage;
    private Uri prevUrl;
    private int totalCount;

    public CachedCatalogPage() {
        this(0, (List) null, (Uri) null, (Uri) null, (CachedCatalogPage) null, (CachedCatalogPage) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CachedCatalogPage copy$default(CachedCatalogPage cachedCatalogPage, int i10, List<CachedCatalogItem> list, Uri uri, Uri uri2, CachedCatalogPage cachedCatalogPage2, CachedCatalogPage cachedCatalogPage3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = cachedCatalogPage.totalCount;
        }
        if ((i11 & 2) != 0) {
            list = cachedCatalogPage.pageItems;
        }
        List<CachedCatalogItem> list2 = list;
        if ((i11 & 4) != 0) {
            uri = cachedCatalogPage.prevUrl;
        }
        Uri uri3 = uri;
        if ((i11 & 8) != 0) {
            uri2 = cachedCatalogPage.nextUrl;
        }
        Uri uri4 = uri2;
        if ((i11 & 16) != 0) {
            cachedCatalogPage2 = cachedCatalogPage.nextPage;
        }
        CachedCatalogPage cachedCatalogPage4 = cachedCatalogPage2;
        if ((i11 & 32) != 0) {
            cachedCatalogPage3 = cachedCatalogPage.prevPage;
        }
        return cachedCatalogPage.copy(i10, list2, uri3, uri4, cachedCatalogPage4, cachedCatalogPage3);
    }

    public final int component1() {
        return this.totalCount;
    }

    public final List<CachedCatalogItem> component2() {
        return this.pageItems;
    }

    public final Uri component3() {
        return this.prevUrl;
    }

    public final Uri component4() {
        return this.nextUrl;
    }

    public final CachedCatalogPage component5() {
        return this.nextPage;
    }

    public final CachedCatalogPage component6() {
        return this.prevPage;
    }

    public final CachedCatalogPage copy(int i10, List<CachedCatalogItem> list, Uri uri, Uri uri2, CachedCatalogPage cachedCatalogPage, CachedCatalogPage cachedCatalogPage2) {
        C17542s.j(list, "pageItems");
        return new CachedCatalogPage(i10, list, uri, uri2, cachedCatalogPage, cachedCatalogPage2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CachedCatalogPage)) {
            return false;
        }
        CachedCatalogPage cachedCatalogPage = (CachedCatalogPage) obj;
        return this.totalCount == cachedCatalogPage.totalCount && C17542s.e(this.pageItems, cachedCatalogPage.pageItems) && C17542s.e(this.prevUrl, cachedCatalogPage.prevUrl) && C17542s.e(this.nextUrl, cachedCatalogPage.nextUrl) && C17542s.e(this.nextPage, cachedCatalogPage.nextPage) && C17542s.e(this.prevPage, cachedCatalogPage.prevPage);
    }

    public final CachedCatalogPage getNextPage() {
        return this.nextPage;
    }

    public final Uri getNextUrl() {
        return this.nextUrl;
    }

    public final List<CachedCatalogItem> getPageItems() {
        return this.pageItems;
    }

    public final CachedCatalogPage getPrevPage() {
        return this.prevPage;
    }

    public final Uri getPrevUrl() {
        return this.prevUrl;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.totalCount) * 31) + this.pageItems.hashCode()) * 31;
        Uri uri = this.prevUrl;
        int i10 = 0;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.nextUrl;
        int hashCode3 = (hashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        CachedCatalogPage cachedCatalogPage = this.nextPage;
        int hashCode4 = (hashCode3 + (cachedCatalogPage == null ? 0 : cachedCatalogPage.hashCode())) * 31;
        CachedCatalogPage cachedCatalogPage2 = this.prevPage;
        if (cachedCatalogPage2 != null) {
            i10 = cachedCatalogPage2.hashCode();
        }
        return hashCode4 + i10;
    }

    public final void setNextPage(CachedCatalogPage cachedCatalogPage) {
        this.nextPage = cachedCatalogPage;
    }

    public final void setNextUrl(Uri uri) {
        this.nextUrl = uri;
    }

    public final void setPageItems(List<CachedCatalogItem> list) {
        C17542s.j(list, "<set-?>");
        this.pageItems = list;
    }

    public final void setPrevPage(CachedCatalogPage cachedCatalogPage) {
        this.prevPage = cachedCatalogPage;
    }

    public final void setPrevUrl(Uri uri) {
        this.prevUrl = uri;
    }

    public final void setTotalCount(int i10) {
        this.totalCount = i10;
    }

    public String toString() {
        int i10 = this.totalCount;
        List<CachedCatalogItem> list = this.pageItems;
        Uri uri = this.prevUrl;
        Uri uri2 = this.nextUrl;
        CachedCatalogPage cachedCatalogPage = this.nextPage;
        CachedCatalogPage cachedCatalogPage2 = this.prevPage;
        return "CachedCatalogPage(totalCount=" + i10 + ", pageItems=" + list + ", prevUrl=" + uri + ", nextUrl=" + uri2 + ", nextPage=" + cachedCatalogPage + ", prevPage=" + cachedCatalogPage2 + ")";
    }

    public CachedCatalogPage(int i10, List<CachedCatalogItem> list, Uri uri, Uri uri2, CachedCatalogPage cachedCatalogPage, CachedCatalogPage cachedCatalogPage2) {
        C17542s.j(list, "pageItems");
        this.totalCount = i10;
        this.pageItems = list;
        this.prevUrl = uri;
        this.nextUrl = uri2;
        this.nextPage = cachedCatalogPage;
        this.prevPage = cachedCatalogPage2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CachedCatalogPage(int r5, java.util.List r6, android.net.Uri r7, android.net.Uri r8, com.sugarcube.app.base.data.database.CachedCatalogPage r9, com.sugarcube.app.base.data.database.CachedCatalogPage r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0005
            r5 = 0
        L_0x0005:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000d
            java.util.List r6 = YH.C16877v.n()
        L_0x000d:
            r12 = r6
            r6 = r11 & 4
            r0 = 0
            if (r6 == 0) goto L_0x0015
            r1 = r0
            goto L_0x0016
        L_0x0015:
            r1 = r7
        L_0x0016:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001c
            r2 = r0
            goto L_0x001d
        L_0x001c:
            r2 = r8
        L_0x001d:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0023
            r3 = r0
            goto L_0x0024
        L_0x0023:
            r3 = r9
        L_0x0024:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = r10
        L_0x002a:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.CachedCatalogPage.<init>(int, java.util.List, android.net.Uri, android.net.Uri, com.sugarcube.app.base.data.database.CachedCatalogPage, com.sugarcube.app.base.data.database.CachedCatalogPage, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
