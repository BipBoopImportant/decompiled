package LF;

import HJ.C15854t;
import YH.C16877v;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljava/util/UUID;", "", "a", "(Ljava/util/UUID;)Ljava/lang/String;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: LF.b  reason: case insensitive filesystem */
public final class C13186b {
    public static final String a(UUID uuid) {
        C17542s.j(uuid, "<this>");
        String uuid2 = uuid.toString();
        C17542s.i(uuid2, "toString(...)");
        return (String) C16877v.w0(C15854t.Y0(uuid2, new String[]{"-"}, false, 0, 6, (Object) null));
    }
}
