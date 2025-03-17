package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/core/network/models/PartialSearchResult;", "", "completion", "Lcom/sugarcube/core/network/models/PartialSearchCompletion;", "label", "", "metadata", "actionTokens", "", "<init>", "(Lcom/sugarcube/core/network/models/PartialSearchCompletion;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCompletion", "()Lcom/sugarcube/core/network/models/PartialSearchCompletion;", "getLabel", "()Ljava/lang/String;", "getMetadata", "getActionTokens", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PartialSearchResult {
    private final List<Object> actionTokens;
    private final PartialSearchCompletion completion;
    private final String label;
    private final String metadata;

    public PartialSearchResult() {
        this((PartialSearchCompletion) null, (String) null, (String) null, (List) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PartialSearchResult copy$default(PartialSearchResult partialSearchResult, PartialSearchCompletion partialSearchCompletion, String str, String str2, List<Object> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            partialSearchCompletion = partialSearchResult.completion;
        }
        if ((i10 & 2) != 0) {
            str = partialSearchResult.label;
        }
        if ((i10 & 4) != 0) {
            str2 = partialSearchResult.metadata;
        }
        if ((i10 & 8) != 0) {
            list = partialSearchResult.actionTokens;
        }
        return partialSearchResult.copy(partialSearchCompletion, str, str2, list);
    }

    public final PartialSearchCompletion component1() {
        return this.completion;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.metadata;
    }

    public final List<Object> component4() {
        return this.actionTokens;
    }

    public final PartialSearchResult copy(PartialSearchCompletion partialSearchCompletion, String str, String str2, List<? extends Object> list) {
        return new PartialSearchResult(partialSearchCompletion, str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PartialSearchResult)) {
            return false;
        }
        PartialSearchResult partialSearchResult = (PartialSearchResult) obj;
        return C17542s.e(this.completion, partialSearchResult.completion) && C17542s.e(this.label, partialSearchResult.label) && C17542s.e(this.metadata, partialSearchResult.metadata) && C17542s.e(this.actionTokens, partialSearchResult.actionTokens);
    }

    public final List<Object> getActionTokens() {
        return this.actionTokens;
    }

    public final PartialSearchCompletion getCompletion() {
        return this.completion;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        PartialSearchCompletion partialSearchCompletion = this.completion;
        int i10 = 0;
        int hashCode = (partialSearchCompletion == null ? 0 : partialSearchCompletion.hashCode()) * 31;
        String str = this.label;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.metadata;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Object> list = this.actionTokens;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        PartialSearchCompletion partialSearchCompletion = this.completion;
        String str = this.label;
        String str2 = this.metadata;
        List<Object> list = this.actionTokens;
        return "PartialSearchResult(completion=" + partialSearchCompletion + ", label=" + str + ", metadata=" + str2 + ", actionTokens=" + list + ")";
    }

    public PartialSearchResult(PartialSearchCompletion partialSearchCompletion, String str, String str2, List<? extends Object> list) {
        this.completion = partialSearchCompletion;
        this.label = str;
        this.metadata = str2;
        this.actionTokens = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PartialSearchResult(PartialSearchCompletion partialSearchCompletion, String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : partialSearchCompletion, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : list);
    }
}
