package pn;

import D4.M;
import TJ.C16532g;
import kotlin.Metadata;
import un.C12068a;
import un.d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001J\u0001\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0002H&¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lpn/b;", "", "", "type", "id", "", "useIdAsGroupParameter", "fallbackTitle", "sortBy", "filters", "", "nbrOfProductsPerRow", "includedProductNos", "prioritiser", "Lun/a;", "availabilityParams", "LTJ/g;", "LD4/M;", "Lun/d;", "d", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lun/a;)LTJ/g;", "LXH/N;", "e", "(Lun/a;)V", "filterId", "filterValueId", "a", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "(Ljava/lang/String;)V", "b", "()V", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: pn.b  reason: case insensitive filesystem */
public interface C11762b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: pn.b$a */
    public static final class a {
        public static /* synthetic */ C16532g a(C11762b bVar, String str, String str2, boolean z10, String str3, String str4, String str5, int i10, String str6, String str7, C12068a aVar, int i11, Object obj) {
            int i12 = i11;
            if (obj == null) {
                return bVar.d(str, str2, (i12 & 4) != 0 ? false : z10, str3, (i12 & 16) != 0 ? null : str4, (i12 & 32) != 0 ? null : str5, i10, (i12 & 128) != 0 ? null : str6, (i12 & 256) != 0 ? null : str7, (i12 & 512) != 0 ? null : aVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlpContentPaged");
        }
    }

    void a(String str, String str2);

    void b();

    void c(String str);

    C16532g<M<d>> d(String str, String str2, boolean z10, String str3, String str4, String str5, int i10, String str6, String str7, C12068a aVar);

    void e(C12068a aVar);
}
