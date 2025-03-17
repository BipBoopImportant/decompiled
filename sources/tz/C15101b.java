package tz;

import Sy.a;
import XH.x;
import dI.C17164e;
import kotlin.Metadata;
import rz.I;
import rz.O;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J^\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fH¦B¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ltz/b;", "", "", "barcode", "Lrz/O;", "scanType", "", "quantity", "productType", "ptagSize", "LSy/a$b;", "productAssortmentSpecialType", "", "useItemNoAsBarcode", "LXH/x;", "Lrz/I;", "a", "(Ljava/lang/String;Lrz/O;ILjava/lang/String;Ljava/lang/String;LSy/a$b;ZLdI/e;)Ljava/lang/Object;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: tz.b  reason: case insensitive filesystem */
public interface C15101b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tz.b$a */
    public static final class a {
        public static /* synthetic */ Object a(C15101b bVar, String str, O o10, int i10, String str2, String str3, a.b bVar2, boolean z10, C17164e eVar, int i11, Object obj) {
            if (obj == null) {
                return bVar.a(str, o10, (i11 & 4) != 0 ? 1 : i10, (i11 & 8) != 0 ? "" : str2, (i11 & 16) != 0 ? "" : str3, (i11 & 32) != 0 ? null : bVar2, (i11 & 64) != 0 ? false : z10, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke-eH_QyT8");
        }
    }

    Object a(String str, O o10, int i10, String str2, String str3, a.b bVar, boolean z10, C17164e<? super x<I>> eVar);
}
