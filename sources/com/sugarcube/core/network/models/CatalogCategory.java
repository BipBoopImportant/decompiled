package com.sugarcube.core.network.models;

import android.net.Uri;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BI\u0012\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JK\u0010\u0019\u001a\u00020\u00002\u0010\b\u0003\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lcom/sugarcube/core/network/models/CatalogCategory;", "", "subcategories", "", "categoryId", "", "name", "region", "imageUrl", "Landroid/net/Uri;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;)V", "getSubcategories", "()Ljava/util/List;", "getCategoryId", "()Ljava/lang/String;", "getName", "getRegion", "getImageUrl", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogCategory {
    private final String categoryId;
    private final Uri imageUrl;
    private final String name;
    private final String region;
    private final List<CatalogCategory> subcategories;

    public CatalogCategory() {
        this((List) null, (String) null, (String) null, (String) null, (Uri) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogCategory copy$default(CatalogCategory catalogCategory, List<CatalogCategory> list, String str, String str2, String str3, Uri uri, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = catalogCategory.subcategories;
        }
        if ((i10 & 2) != 0) {
            str = catalogCategory.categoryId;
        }
        String str4 = str;
        if ((i10 & 4) != 0) {
            str2 = catalogCategory.name;
        }
        String str5 = str2;
        if ((i10 & 8) != 0) {
            str3 = catalogCategory.region;
        }
        String str6 = str3;
        if ((i10 & 16) != 0) {
            uri = catalogCategory.imageUrl;
        }
        return catalogCategory.copy(list, str4, str5, str6, uri);
    }

    public final List<CatalogCategory> component1() {
        return this.subcategories;
    }

    public final String component2() {
        return this.categoryId;
    }

    public final String component3() {
        return this.name;
    }

    public final String component4() {
        return this.region;
    }

    public final Uri component5() {
        return this.imageUrl;
    }

    public final CatalogCategory copy(@e(name = "subCategories") List<CatalogCategory> list, String str, String str2, String str3, Uri uri) {
        return new CatalogCategory(list, str, str2, str3, uri);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCategory)) {
            return false;
        }
        CatalogCategory catalogCategory = (CatalogCategory) obj;
        return C17542s.e(this.subcategories, catalogCategory.subcategories) && C17542s.e(this.categoryId, catalogCategory.categoryId) && C17542s.e(this.name, catalogCategory.name) && C17542s.e(this.region, catalogCategory.region) && C17542s.e(this.imageUrl, catalogCategory.imageUrl);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final Uri getImageUrl() {
        return this.imageUrl;
    }

    public final String getName() {
        return this.name;
    }

    public final String getRegion() {
        return this.region;
    }

    public final List<CatalogCategory> getSubcategories() {
        return this.subcategories;
    }

    public int hashCode() {
        List<CatalogCategory> list = this.subcategories;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.categoryId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.region;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Uri uri = this.imageUrl;
        if (uri != null) {
            i10 = uri.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        List<CatalogCategory> list = this.subcategories;
        String str = this.categoryId;
        String str2 = this.name;
        String str3 = this.region;
        Uri uri = this.imageUrl;
        return "CatalogCategory(subcategories=" + list + ", categoryId=" + str + ", name=" + str2 + ", region=" + str3 + ", imageUrl=" + uri + ")";
    }

    public CatalogCategory(@e(name = "subCategories") List<CatalogCategory> list, String str, String str2, String str3, Uri uri) {
        this.subcategories = list;
        this.categoryId = str;
        this.name = str2;
        this.region = str3;
        this.imageUrl = uri;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CatalogCategory(java.util.List r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, android.net.Uri r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r3 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0008
            java.util.List r4 = YH.C16877v.n()
        L_0x0008:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L_0x0010
            r10 = r0
            goto L_0x0011
        L_0x0010:
            r10 = r5
        L_0x0011:
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0017
            r1 = r0
            goto L_0x0018
        L_0x0017:
            r1 = r6
        L_0x0018:
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r0 = r7
        L_0x001e:
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0023
            r8 = 0
        L_0x0023:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r1
            r9 = r0
            r10 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.CatalogCategory.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, android.net.Uri, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
