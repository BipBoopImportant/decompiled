package lm;

import kotlin.Metadata;
import lm.C11550a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Llm/f;", "", "", "itemNo", "Llm/a$c;", "fulfilmentOption", "componentValue", "LXH/N;", "a", "(Ljava/lang/String;Llm/a$c;Ljava/lang/String;)V", "storeId", "b", "(Ljava/lang/String;Ljava/lang/String;Llm/a$c;Ljava/lang/String;)V", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "backinstock_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface f {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(f fVar, String str, String str2, String str3, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    str3 = "PUSH";
                }
                fVar.c(str, str2, str3);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackNotifyMeConfirmation");
        }
    }

    void a(String str, C11550a.c cVar, String str2);

    void b(String str, String str2, C11550a.c cVar, String str3);

    void c(String str, String str2, String str3);
}
