package am;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bR\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lam/h;", "", "", "c", "()J", "nowInMillis", "Ljava/time/LocalDateTime;", "d", "()Ljava/time/LocalDateTime;", "nowDateTime", "Ljava/time/ZonedDateTime;", "a", "()Ljava/time/ZonedDateTime;", "nowZonedDateTime", "Ljava/time/ZoneId;", "b", "()Ljava/time/ZoneId;", "zoneId", "appservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h {

    /* renamed from: a  reason: collision with root package name */
    public static final a f90337a = a.f90338b;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lam/h$a;", "Lam/h;", "<init>", "()V", "Ljava/time/ZoneId;", "c", "Ljava/time/ZoneId;", "b", "()Ljava/time/ZoneId;", "zoneId", "", "()J", "nowInMillis", "Ljava/time/LocalDateTime;", "d", "()Ljava/time/LocalDateTime;", "nowDateTime", "Ljava/time/ZonedDateTime;", "a", "()Ljava/time/ZonedDateTime;", "nowZonedDateTime", "appservice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements h {

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ a f90338b = new a();

        /* renamed from: c  reason: collision with root package name */
        private static final ZoneId f90339c;

        static {
            ZoneId systemDefault = ZoneId.systemDefault();
            C17542s.i(systemDefault, "systemDefault(...)");
            f90339c = systemDefault;
        }

        private a() {
        }

        public ZonedDateTime a() {
            ZonedDateTime now = ZonedDateTime.now();
            C17542s.i(now, "now(...)");
            return now;
        }

        public ZoneId b() {
            return f90339c;
        }

        public long c() {
            return System.currentTimeMillis();
        }

        public LocalDateTime d() {
            LocalDateTime now = LocalDateTime.now();
            C17542s.i(now, "now(...)");
            return now;
        }
    }

    ZonedDateTime a();

    ZoneId b();

    long c();

    LocalDateTime d();
}
