package UA;

import java.time.Instant;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LUA/c;", "", "<init>", "()V", "Ljava/time/Instant;", "instant", "", "a", "(Ljava/time/Instant;)Ljava/lang/String;", "rawValue", "b", "(Ljava/lang/String;)Ljava/time/Instant;", "shoppinglist-datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UA.c  reason: case insensitive filesystem */
public final class C13714c {
    public final String a(Instant instant) {
        C17542s.j(instant, "instant");
        String format = DateTimeFormatter.ISO_INSTANT.format(instant);
        C17542s.i(format, "format(...)");
        return format;
    }

    public final Instant b(String str) {
        C17542s.j(str, "rawValue");
        Instant parse = Instant.parse(str);
        C17542s.i(parse, "parse(...)");
        return parse;
    }
}
