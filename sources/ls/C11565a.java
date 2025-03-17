package ls;

import Ps.c;
import com.ingka.ikea.core.model.Image;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import js.C11451a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lls/a;", "", "<init>", "()V", "", "date", "", "b", "(Ljava/lang/String;)J", "Ljs/a;", "post", "", "data", "LPs/c;", "a", "(Ljs/a;Ljava/util/Map;)LPs/c;", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ls.a  reason: case insensitive filesystem */
public final class C11565a {
    private final long b(String str) {
        return ZonedDateTime.parse(str, DateTimeFormatter.ISO_OFFSET_DATE_TIME).toInstant().toEpochMilli();
    }

    public final c a(C11451a aVar, Map<String, String> map) {
        C17542s.j(aVar, "post");
        C17542s.j(map, "data");
        return new c(aVar.c(), aVar.e(), aVar.a(), b(aVar.b()), map, new Image(aVar.d().getUrl(), aVar.d().A0()));
    }
}
