package sv;

import TJ.C16532g;
import com.ingka.ikea.mcomsettings.MComConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lsv/a;", "", "", "fetchConfig", "LTJ/g;", "Lcom/ingka/ikea/mcomsettings/MComConfig;", "a", "(Z)LTJ/g;", "mcomsettings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sv.a  reason: case insensitive filesystem */
public interface C11892a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sv.a$a  reason: collision with other inner class name */
    public static final class C2450a {
        public static /* synthetic */ C16532g a(C11892a aVar, boolean z10, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                return aVar.a(z10);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getConfigFlow");
        }
    }

    C16532g<MComConfig> a(boolean z10);
}
