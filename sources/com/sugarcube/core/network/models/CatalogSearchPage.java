package com.sugarcube.core.network.models;

import YH.C16877v;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogSearchPage;", "", "moreToken", "", "pageItems", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getMoreToken", "()Ljava/lang/String;", "getPageItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogSearchPage {
    private final String moreToken;
    private final List<CatalogItem> pageItems;

    public CatalogSearchPage() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogSearchPage copy$default(CatalogSearchPage catalogSearchPage, String str, List<CatalogItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = catalogSearchPage.moreToken;
        }
        if ((i10 & 2) != 0) {
            list = catalogSearchPage.pageItems;
        }
        return catalogSearchPage.copy(str, list);
    }

    public final String component1() {
        return this.moreToken;
    }

    public final List<CatalogItem> component2() {
        return this.pageItems;
    }

    public final CatalogSearchPage copy(@e(name = "moreToken") String str, @e(name = "results") List<CatalogItem> list) {
        return new CatalogSearchPage(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogSearchPage)) {
            return false;
        }
        CatalogSearchPage catalogSearchPage = (CatalogSearchPage) obj;
        return C17542s.e(this.moreToken, catalogSearchPage.moreToken) && C17542s.e(this.pageItems, catalogSearchPage.pageItems);
    }

    public final String getMoreToken() {
        return this.moreToken;
    }

    public final List<CatalogItem> getPageItems() {
        return this.pageItems;
    }

    public int hashCode() {
        String str = this.moreToken;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CatalogItem> list = this.pageItems;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.moreToken;
        List<CatalogItem> list = this.pageItems;
        return "CatalogSearchPage(moreToken=" + str + ", pageItems=" + list + ")";
    }

    public CatalogSearchPage(@e(name = "moreToken") String str, @e(name = "results") List<CatalogItem> list) {
        this.moreToken = str;
        this.pageItems = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogSearchPage(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? C16877v.n() : list);
    }
}
