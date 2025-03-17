package com.sugarcube.core.network.models;

import YH.C16877v;
import android.net.Uri;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/CatalogPage;", "", "totalCount", "", "next", "Landroid/net/Uri;", "previous", "pageItems", "", "Lcom/sugarcube/core/network/models/CatalogItem;", "<init>", "(Ljava/lang/Integer;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)V", "getTotalCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "()Landroid/net/Uri;", "getPrevious", "getPageItems", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/List;)Lcom/sugarcube/core/network/models/CatalogPage;", "equals", "", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogPage {
    private final Uri next;
    private final List<CatalogItem> pageItems;
    private final Uri previous;
    private final Integer totalCount;

    public CatalogPage() {
        this((Integer) null, (Uri) null, (Uri) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogPage copy$default(CatalogPage catalogPage, Integer num, Uri uri, Uri uri2, List<CatalogItem> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = catalogPage.totalCount;
        }
        if ((i10 & 2) != 0) {
            uri = catalogPage.next;
        }
        if ((i10 & 4) != 0) {
            uri2 = catalogPage.previous;
        }
        if ((i10 & 8) != 0) {
            list = catalogPage.pageItems;
        }
        return catalogPage.copy(num, uri, uri2, list);
    }

    public final Integer component1() {
        return this.totalCount;
    }

    public final Uri component2() {
        return this.next;
    }

    public final Uri component3() {
        return this.previous;
    }

    public final List<CatalogItem> component4() {
        return this.pageItems;
    }

    public final CatalogPage copy(@e(name = "count") Integer num, Uri uri, Uri uri2, @e(name = "results") List<CatalogItem> list) {
        return new CatalogPage(num, uri, uri2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogPage)) {
            return false;
        }
        CatalogPage catalogPage = (CatalogPage) obj;
        return C17542s.e(this.totalCount, catalogPage.totalCount) && C17542s.e(this.next, catalogPage.next) && C17542s.e(this.previous, catalogPage.previous) && C17542s.e(this.pageItems, catalogPage.pageItems);
    }

    public final Uri getNext() {
        return this.next;
    }

    public final List<CatalogItem> getPageItems() {
        return this.pageItems;
    }

    public final Uri getPrevious() {
        return this.previous;
    }

    public final Integer getTotalCount() {
        return this.totalCount;
    }

    public int hashCode() {
        Integer num = this.totalCount;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Uri uri = this.next;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.previous;
        int hashCode3 = (hashCode2 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        List<CatalogItem> list = this.pageItems;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        Integer num = this.totalCount;
        Uri uri = this.next;
        Uri uri2 = this.previous;
        List<CatalogItem> list = this.pageItems;
        return "CatalogPage(totalCount=" + num + ", next=" + uri + ", previous=" + uri2 + ", pageItems=" + list + ")";
    }

    public CatalogPage(@e(name = "count") Integer num, Uri uri, Uri uri2, @e(name = "results") List<CatalogItem> list) {
        this.totalCount = num;
        this.next = uri;
        this.previous = uri2;
        this.pageItems = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogPage(Integer num, Uri uri, Uri uri2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0 : num, (i10 & 2) != 0 ? null : uri, (i10 & 4) != 0 ? null : uri2, (i10 & 8) != 0 ? C16877v.n() : list);
    }
}
