package Bs;

import java.time.Duration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J8\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H¦\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LBs/o;", "", "Ljava/time/Duration;", "repeatInterval", "flexInterval", "", "hourOfDay", "minuteOfHour", "LXH/N;", "a", "(Ljava/time/Duration;Ljava/time/Duration;II)V", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface o {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(o oVar, Duration duration, Duration duration2, int i10, int i11, int i12, Object obj) {
            if (obj == null) {
                if ((i12 & 1) != 0) {
                    duration = Duration.ofHours(24);
                }
                if ((i12 & 2) != 0) {
                    duration2 = Duration.ofHours(2);
                }
                if ((i12 & 4) != 0) {
                    i10 = 12;
                }
                if ((i12 & 8) != 0) {
                    i11 = 0;
                }
                oVar.a(duration, duration2, i10, i11);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    void a(Duration duration, Duration duration2, int i10, int i11);
}
