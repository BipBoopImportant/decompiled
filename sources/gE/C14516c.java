package gE;

import kotlin.Metadata;
import x4.C8951o;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LgE/c;", "", "Lx4/o;", "navController", "", "allowSamePostalCode", "", "interactionValue", "LXH/N;", "a", "(Lx4/o;ZLjava/lang/String;)V", "zipselector_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gE.c  reason: case insensitive filesystem */
public interface C14516c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: gE.c$a */
    public static final class a {
        public static /* synthetic */ void a(C14516c cVar, C8951o oVar, boolean z10, String str, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str = "";
                }
                cVar.a(oVar, z10, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openManualPostalCodeBottomSheet");
        }
    }

    void a(C8951o oVar, boolean z10, String str);
}
