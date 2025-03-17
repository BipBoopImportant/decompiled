package vr;

import dI.C17164e;
import java.util.List;
import kotlin.Metadata;
import zr.C12550a;
import zr.b;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JL\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH¦@¢\u0006\u0004\b\f\u0010\rJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\bH¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lvr/a;", "", "", "paginationRequestId", "filter", "", "includedInspirationIds", "similarToInspirationId", "", "startIndex", "pageSize", "Lzr/b;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;IILdI/e;)Ljava/lang/Object;", "productNumber", "numberOfItems", "Lzr/a;", "b", "(Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vr.a  reason: case insensitive filesystem */
public interface C12206a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vr.a$a  reason: collision with other inner class name */
    public static final class C2504a {
        public static /* synthetic */ Object a(C12206a aVar, String str, String str2, List list, String str3, int i10, int i11, C17164e eVar, int i12, Object obj) {
            if (obj == null) {
                return aVar.a((i12 & 1) != 0 ? "" : str, str2, list, str3, i10, i11, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInspireFeed");
        }
    }

    Object a(String str, String str2, List<String> list, String str3, int i10, int i11, C17164e<? super b> eVar);

    Object b(String str, int i10, C17164e<? super C12550a> eVar);
}
