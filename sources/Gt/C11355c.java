package gt;

import YH.C16877v;
import com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.List;
import jt.C11453a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\u000b\u001a\u00020\u0007*\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a#\u0010\u000e\u001a\u00020\u0007*\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ljava/time/ZonedDateTime;", "", "c", "(Ljava/time/ZonedDateTime;)Ljava/lang/String;", "Ljt/a$c;", "creationTime", "languageCode", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "b", "(Ljt/a$c;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "Ljt/a$a;", "a", "(Ljt/a$a;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "Ljt/a$b;", "d", "(Ljt/a$b;Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "datalayer-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: gt.c  reason: case insensitive filesystem */
public final class C11355c {
    public static final RegistrationRemote a(C11453a.C2232a aVar, String str, String str2) {
        C17542s.j(aVar, "<this>");
        C17542s.j(str, "languageCode");
        C17542s.j(str2, "creationTime");
        return new RegistrationRemote((Integer) null, 0, RegistrationRemote.d.Cancelled.b(), C16877v.n(), str2, str, RegistrationRemote.c.Individual);
    }

    public static final RegistrationRemote b(C11453a.c cVar, String str, String str2) {
        C17542s.j(cVar, "<this>");
        C17542s.j(str, "creationTime");
        C17542s.j(str2, "languageCode");
        List c10 = C16877v.c();
        if (cVar.a()) {
            c10.add(RegistrationRemote.b.Email);
        }
        if (cVar.b()) {
            c10.add(RegistrationRemote.b.Sms);
        }
        return new RegistrationRemote(Integer.valueOf(cVar.c()), Integer.valueOf(cVar.d()), RegistrationRemote.d.Registered.b(), C16877v.a(c10), str, str2, RegistrationRemote.c.Individual);
    }

    public static final String c(ZonedDateTime zonedDateTime) {
        C17542s.j(zonedDateTime, "<this>");
        String zonedDateTime2 = zonedDateTime.truncatedTo(ChronoUnit.SECONDS).withZoneSameInstant(ZoneOffset.UTC).toString();
        C17542s.i(zonedDateTime2, "toString(...)");
        return zonedDateTime2;
    }

    public static final RegistrationRemote d(C11453a.b bVar, String str, String str2) {
        C17542s.j(bVar, "<this>");
        C17542s.j(str, "languageCode");
        C17542s.j(str2, "creationTime");
        return new RegistrationRemote(1, 0, RegistrationRemote.d.WaitingList.b(), C16877v.n(), str2, str, RegistrationRemote.c.Individual);
    }
}
