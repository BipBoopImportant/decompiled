package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/core/network/models/PartialSearchResponse;", "", "usergroup", "", "searchBox", "Lcom/sugarcube/core/network/models/PartialSearchBox;", "<init>", "(Ljava/lang/String;Lcom/sugarcube/core/network/models/PartialSearchBox;)V", "getUsergroup", "()Ljava/lang/String;", "getSearchBox", "()Lcom/sugarcube/core/network/models/PartialSearchBox;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PartialSearchResponse {
    private final PartialSearchBox searchBox;
    private final String usergroup;

    public PartialSearchResponse() {
        this((String) null, (PartialSearchBox) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PartialSearchResponse copy$default(PartialSearchResponse partialSearchResponse, String str, PartialSearchBox partialSearchBox, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = partialSearchResponse.usergroup;
        }
        if ((i10 & 2) != 0) {
            partialSearchBox = partialSearchResponse.searchBox;
        }
        return partialSearchResponse.copy(str, partialSearchBox);
    }

    public final String component1() {
        return this.usergroup;
    }

    public final PartialSearchBox component2() {
        return this.searchBox;
    }

    public final PartialSearchResponse copy(String str, PartialSearchBox partialSearchBox) {
        return new PartialSearchResponse(str, partialSearchBox);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialSearchResponse)) {
            return false;
        }
        PartialSearchResponse partialSearchResponse = (PartialSearchResponse) obj;
        return C17542s.e(this.usergroup, partialSearchResponse.usergroup) && C17542s.e(this.searchBox, partialSearchResponse.searchBox);
    }

    public final PartialSearchBox getSearchBox() {
        return this.searchBox;
    }

    public final String getUsergroup() {
        return this.usergroup;
    }

    public int hashCode() {
        String str = this.usergroup;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        PartialSearchBox partialSearchBox = this.searchBox;
        if (partialSearchBox != null) {
            i10 = partialSearchBox.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.usergroup;
        PartialSearchBox partialSearchBox = this.searchBox;
        return "PartialSearchResponse(usergroup=" + str + ", searchBox=" + partialSearchBox + ")";
    }

    public PartialSearchResponse(String str, PartialSearchBox partialSearchBox) {
        this.usergroup = str;
        this.searchBox = partialSearchBox;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PartialSearchResponse(String str, PartialSearchBox partialSearchBox, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : partialSearchBox);
    }
}
