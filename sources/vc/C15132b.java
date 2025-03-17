package vC;

import am.h;
import com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotRemoteData;
import ep.C11256b;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uC.C15115c;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013¨\u0006\u0015"}, d2 = {"LvC/b;", "", "Lep/b;", "localizedDateTimeFormatter", "Lam/h;", "timeProvider", "<init>", "(Lep/b;Lam/h;)V", "", "dateTime", "a", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData;", "remoteData", "LuC/c;", "b", "(Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRemoteData;)LuC/c;", "Lam/h;", "Ljava/time/format/DateTimeFormatter;", "Ljava/time/format/DateTimeFormatter;", "timeFormatter", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vC.b  reason: case insensitive filesystem */
public final class C15132b {

    /* renamed from: a  reason: collision with root package name */
    private final h f131423a;

    /* renamed from: b  reason: collision with root package name */
    private final DateTimeFormatter f131424b;

    public C15132b(C11256b bVar, h hVar) {
        C17542s.j(bVar, "localizedDateTimeFormatter");
        C17542s.j(hVar, "timeProvider");
        this.f131423a = hVar;
        this.f131424b = bVar.d();
    }

    private final String a(String str) {
        String format = this.f131424b.format(ZonedDateTime.parse(str).toOffsetDateTime().atZoneSameInstant(this.f131423a.b()));
        C17542s.i(format, "format(...)");
        return format;
    }

    public final C15115c b(TimeslotRemoteData timeslotRemoteData) {
        C17542s.j(timeslotRemoteData, "remoteData");
        return new C15115c(timeslotRemoteData.c(), a(timeslotRemoteData.e()), a(timeslotRemoteData.a()), a(timeslotRemoteData.d()), a(timeslotRemoteData.b()));
    }
}
