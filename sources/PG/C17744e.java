package pG;

import XH.C16807N;
import com.sugarcube.decorate.v2.internal.ui.catalog.data.catalog.RecentSearchRepository;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HB¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H@¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000bH@¢\u0006\u0004\b\u000e\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LpG/e;", "", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/RecentSearchRepository;", "recentSearchRepository", "<init>", "(Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/RecentSearchRepository;)V", "", "", "b", "(LdI/e;)Ljava/lang/Object;", "searchTerm", "LXH/N;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "Lcom/sugarcube/decorate/v2/internal/ui/catalog/data/catalog/RecentSearchRepository;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pG.e  reason: case insensitive filesystem */
public final class C17744e {

    /* renamed from: a  reason: collision with root package name */
    private final RecentSearchRepository f146272a;

    public C17744e(RecentSearchRepository recentSearchRepository) {
        C17542s.j(recentSearchRepository, "recentSearchRepository");
        this.f146272a = recentSearchRepository;
    }

    public final Object a(C17164e<? super C16807N> eVar) {
        Object clearAll = this.f146272a.clearAll(eVar);
        return clearAll == C17187b.f() ? clearAll : C16807N.f139792a;
    }

    public final Object b(C17164e<? super List<String>> eVar) {
        return this.f146272a.fetchRecentSearchTerms(eVar);
    }

    public final Object c(String str, C17164e<? super C16807N> eVar) {
        Object saveSearchTerm = this.f146272a.saveSearchTerm(str, eVar);
        return saveSearchTerm == C17187b.f() ? saveSearchTerm : C16807N.f139792a;
    }
}
