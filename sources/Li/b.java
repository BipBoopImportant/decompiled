package Li;

import Mi.C10772g;
import Mi.C10773h;
import Mi.q;
import TJ.C16519P;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\\\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0006J\u001e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0006R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00190\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"LLi/b;", "", "", "itemNo", "LMi/g;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LLi/c;", "sortingData", "", "pageSize", "pageNumber", "sourceCountryCode", "excludeCountry", "translateTo", "LMi/h;", "c", "(Ljava/lang/String;LLi/c;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "reviewId", "LXH/N;", "d", "LXH/x;", "LMi/q;", "e", "LTJ/P;", "", "f", "()LTJ/P;", "reviewsVotedFor", "b", "reviewedItemNos", "ratingsandreviews-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ Object a(b bVar, String str, c cVar, int i10, int i11, String str2, String str3, String str4, C17164e eVar, int i12, Object obj) {
            if (obj == null) {
                return bVar.c(str, (i12 & 2) != 0 ? null : cVar, (i12 & 4) != 0 ? 5 : i10, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? null : str2, (i12 & 32) != 0 ? null : str3, (i12 & 64) != 0 ? null : str4, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReviews");
        }
    }

    Object a(String str, C17164e<? super C10772g> eVar);

    C16519P<List<String>> b();

    Object c(String str, c cVar, int i10, int i11, String str2, String str3, String str4, C17164e<? super C10773h> eVar);

    Object d(String str, C17164e<? super C16807N> eVar);

    Object e(String str, C17164e<? super x<q>> eVar);

    C16519P<List<String>> f();
}
