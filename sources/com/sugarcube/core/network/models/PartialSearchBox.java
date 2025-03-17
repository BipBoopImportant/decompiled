package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/core/network/models/PartialSearchBox;", "", "partialSearchResults", "", "Lcom/sugarcube/core/network/models/PartialSearchResult;", "<init>", "(Ljava/util/List;)V", "getPartialSearchResults", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PartialSearchBox {
    @e(name = "universal")
    private final List<PartialSearchResult> partialSearchResults;

    public PartialSearchBox() {
        this((List) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PartialSearchBox copy$default(PartialSearchBox partialSearchBox, List<PartialSearchResult> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = partialSearchBox.partialSearchResults;
        }
        return partialSearchBox.copy(list);
    }

    public final List<PartialSearchResult> component1() {
        return this.partialSearchResults;
    }

    public final PartialSearchBox copy(List<PartialSearchResult> list) {
        return new PartialSearchBox(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PartialSearchBox) && C17542s.e(this.partialSearchResults, ((PartialSearchBox) obj).partialSearchResults);
    }

    public final List<PartialSearchResult> getPartialSearchResults() {
        return this.partialSearchResults;
    }

    public int hashCode() {
        List<PartialSearchResult> list = this.partialSearchResults;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        List<PartialSearchResult> list = this.partialSearchResults;
        return "PartialSearchBox(partialSearchResults=" + list + ")";
    }

    public PartialSearchBox(List<PartialSearchResult> list) {
        this.partialSearchResults = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PartialSearchBox(List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list);
    }
}
