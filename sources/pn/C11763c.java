package pn;

import dI.C17164e;
import kotlin.Metadata;
import un.C12068a;
import un.b;
import un.c;
import un.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001Jn\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lpn/c;", "", "", "id", "type", "", "isSerpShelvesSubcategory", "Lun/e;", "paginationParams", "Lun/c;", "filterParams", "Lun/a;", "availabilityParams", "includedItemNos", "useIdAsGroupParameter", "includeLocalHistory", "Lun/b;", "a", "(Ljava/lang/String;Ljava/lang/String;ZLun/e;Lun/c;Lun/a;Ljava/lang/String;ZZLdI/e;)Ljava/lang/Object;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pn.c  reason: case insensitive filesystem */
public interface C11763c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pn.c$a */
    public static final class a {
        public static /* synthetic */ Object a(C11763c cVar, String str, String str2, boolean z10, e eVar, c cVar2, C12068a aVar, String str3, boolean z11, boolean z12, C17164e eVar2, int i10, Object obj) {
            int i11 = i10;
            if (obj == null) {
                return cVar.a(str, str2, (i11 & 4) != 0 ? false : z10, (i11 & 8) != 0 ? null : eVar, (i11 & 16) != 0 ? null : cVar2, (i11 & 32) != 0 ? null : aVar, (i11 & 64) != 0 ? null : str3, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? false : z12, eVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlpDetails");
        }
    }

    Object a(String str, String str2, boolean z10, e eVar, c cVar, C12068a aVar, String str3, boolean z11, boolean z12, C17164e<? super b> eVar2);
}
