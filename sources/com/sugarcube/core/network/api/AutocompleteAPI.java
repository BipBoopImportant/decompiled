package com.sugarcube.core.network.api;

import QL.x;
import VL.C16704f;
import VL.t;
import com.sugarcube.core.network.models.PartialSearchResponse;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/network/api/AutocompleteAPI;", "", "", "partialSearch", "LQL/x;", "Lcom/sugarcube/core/network/models/PartialSearchResponse;", "searchResultsForPartialQuery", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AutocompleteAPI {
    @C16704f("search-box")
    Object searchResultsForPartialQuery(@t("q") String str, C17164e<? super x<PartialSearchResponse>> eVar);
}
