package lK;

import HJ.C15854t;
import XH.x;
import XH.y;
import com.sugarcube.app.base.network.models.UploadKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002¨\u0006\u0004"}, d2 = {"", "a", "I", "MAX_CHARS_IN_POOL", "kotlinx-serialization-json"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.g  reason: case insensitive filesystem */
public final class C17576g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final int f144515a;

    static {
        Object obj;
        Integer num = null;
        try {
            x.a aVar = x.f139812b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            obj = x.b(property != null ? C15854t.t(property) : null);
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        if (!x.g(obj)) {
            num = obj;
        }
        Integer num2 = num;
        f144515a = num2 != null ? num2.intValue() : UploadKt.MAX_CHUNK_SIZE;
    }
}
