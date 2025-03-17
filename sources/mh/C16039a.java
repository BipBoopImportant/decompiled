package MH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "name", "Lorg/slf4j/Logger;", "Lio/ktor/util/logging/Logger;", "a", "(Ljava/lang/String;)Lorg/slf4j/Logger;", "ktor-utils"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: MH.a  reason: case insensitive filesystem */
public final class C16039a {
    public static final Logger a(String str) {
        C17542s.j(str, "name");
        Logger logger = LoggerFactory.getLogger(str);
        C17542s.i(logger, "getLogger(name)");
        return logger;
    }
}
