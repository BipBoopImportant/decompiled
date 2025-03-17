package YC;

import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LYC/b;", "", "LYC/e;", "uiModeType", "LYC/a;", "a", "(LYC/e;)LYC/a;", "", "", "b", "(LYC/e;)Ljava/util/Map;", "ui-mode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: YC.b  reason: case insensitive filesystem */
public interface C13857b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: YC.b$a */
    public static final class a {
        public static /* synthetic */ C13856a a(C13857b bVar, C13860e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    eVar = C13860e.AUTO;
                }
                return bVar.a(eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUiModeWebParameters");
        }

        public static /* synthetic */ Map b(C13857b bVar, C13860e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    eVar = C13860e.AUTO;
                }
                return bVar.b(eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUiModeWebParametersAsMap");
        }
    }

    C13856a a(C13860e eVar);

    Map<String, String> b(C13860e eVar);
}
