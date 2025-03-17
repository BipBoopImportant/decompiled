package oG;

import com.sugarcube.app.base.network.AutocompleteClient;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.SearchSuggestionsRepository;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LoG/d;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/SearchSuggestionsRepository;", "Lcom/sugarcube/app/base/network/AutocompleteClient;", "autocompleteClient", "<init>", "(Lcom/sugarcube/app/base/network/AutocompleteClient;)V", "", "searchTerm", "", "fetchSuggestions", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "Lcom/sugarcube/app/base/network/AutocompleteClient;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: oG.d  reason: case insensitive filesystem */
public final class C17690d implements SearchSuggestionsRepository {

    /* renamed from: b  reason: collision with root package name */
    public static final int f145249b = AutocompleteClient.$stable;

    /* renamed from: a  reason: collision with root package name */
    private final AutocompleteClient f145250a;

    public C17690d(AutocompleteClient autocompleteClient) {
        C17542s.j(autocompleteClient, "autocompleteClient");
        this.f145250a = autocompleteClient;
    }

    public Object fetchSuggestions(String str, C17164e<? super List<String>> eVar) {
        return this.f145250a.getPartialSearch(str, eVar);
    }
}
