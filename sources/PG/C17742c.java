package pG;

import YH.C16877v;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.SearchSuggestionsRepository;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"LpG/c;", "", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/SearchSuggestionsRepository;", "searchSuggestionsRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/SearchSuggestionsRepository;)V", "", "searchTerm", "", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/SearchSuggestionsRepository;", "b", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pG.c  reason: case insensitive filesystem */
public final class C17742c {

    /* renamed from: b  reason: collision with root package name */
    public static final a f146260b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f146261c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final SearchSuggestionsRepository f146262a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LpG/c$a;", "", "<init>", "()V", "", "MIN_SEARCH_TERM_CHARS", "I", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pG.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C17742c(SearchSuggestionsRepository searchSuggestionsRepository) {
        C17542s.j(searchSuggestionsRepository, "searchSuggestionsRepository");
        this.f146262a = searchSuggestionsRepository;
    }

    public final Object a(String str, C17164e<? super List<String>> eVar) {
        return str.length() < 3 ? C16877v.n() : this.f146262a.fetchSuggestions(str, eVar);
    }
}
