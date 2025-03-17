package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/core/network/models/ThumbnailResponse;", "", "url", "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "setUrl", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class ThumbnailResponse {
    private String url;

    public ThumbnailResponse() {
        this((String) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ThumbnailResponse copy$default(ThumbnailResponse thumbnailResponse, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = thumbnailResponse.url;
        }
        return thumbnailResponse.copy(str);
    }

    public final String component1() {
        return this.url;
    }

    public final ThumbnailResponse copy(String str) {
        C17542s.j(str, "url");
        return new ThumbnailResponse(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ThumbnailResponse) && C17542s.e(this.url, ((ThumbnailResponse) obj).url);
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode();
    }

    public final void setUrl(String str) {
        C17542s.j(str, "<set-?>");
        this.url = str;
    }

    public String toString() {
        String str = this.url;
        return "ThumbnailResponse(url=" + str + ")";
    }

    public ThumbnailResponse(String str) {
        C17542s.j(str, "url");
        this.url = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThumbnailResponse(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? "" : str);
    }
}
