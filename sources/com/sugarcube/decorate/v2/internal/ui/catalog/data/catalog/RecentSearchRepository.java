package com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog;

import XH.C16807N;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H¦@¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H¦@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/RecentSearchRepository;", "", "", "", "fetchRecentSearchTerms", "(LdI/e;)Ljava/lang/Object;", "searchTerm", "LXH/N;", "saveSearchTerm", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "clearAll", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RecentSearchRepository {
    Object clearAll(C17164e<? super C16807N> eVar);

    Object fetchRecentSearchTerms(C17164e<? super List<String>> eVar);

    Object saveSearchTerm(String str, C17164e<? super C16807N> eVar);
}
