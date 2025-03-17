package L8;

import R8.a;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y8.C8993b;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LL8/b;", "", "<init>", "()V", "T", "", "collectionEnabled", "any", "b", "(Ljava/lang/Boolean;Ljava/lang/Object;)Ljava/lang/Object;", "Ly8/b;", "rawEvent", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;", "conf", "a", "(Ly8/b;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ApiErrors;)Ly8/b;", "error-analysis_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {
    private final <T> T b(Boolean bool, T t10) {
        if (C17542s.e(bool, Boolean.TRUE)) {
            return t10;
        }
        return null;
    }

    public final C8993b a(C8993b bVar, JsonConfig.ApiErrors apiErrors) {
        byte[] bArr;
        byte[] bArr2;
        C17542s.j(bVar, "rawEvent");
        String E10 = bVar.E();
        Boolean bool = null;
        byte[] bArr3 = (byte[]) b(apiErrors != null ? Boolean.valueOf(apiErrors.c()) : null, bVar.p());
        byte[] bArr4 = (byte[]) b(apiErrors != null ? Boolean.valueOf(apiErrors.d()) : null, bVar.u());
        Boolean valueOf = apiErrors != null ? Boolean.valueOf(apiErrors.e()) : null;
        Map<String, String> s10 = bVar.s();
        Map map = (Map) b(valueOf, s10 != null ? a.c(s10, I8.a.f37083a.c()) : null);
        Boolean valueOf2 = apiErrors != null ? Boolean.valueOf(apiErrors.e()) : null;
        Map<String, String> x10 = bVar.x();
        Map map2 = (Map) b(valueOf2, x10 != null ? a.c(x10, I8.a.f37083a.c()) : null);
        List<String> f10 = apiErrors != null ? apiErrors.f() : null;
        boolean z10 = false;
        Boolean valueOf3 = Boolean.valueOf(!(f10 == null || f10.isEmpty()));
        Map<String, String> s11 = bVar.s();
        if (s11 != null) {
            bArr = a.b(s11, apiErrors != null ? apiErrors.f() : null);
        } else {
            bArr = null;
        }
        byte[] bArr5 = (byte[]) b(valueOf3, bArr);
        List<String> f11 = apiErrors != null ? apiErrors.f() : null;
        if (f11 == null || f11.isEmpty()) {
            z10 = true;
        }
        Boolean valueOf4 = Boolean.valueOf(!z10);
        Map<String, String> x11 = bVar.x();
        if (x11 != null) {
            bArr2 = a.b(x11, apiErrors != null ? apiErrors.f() : null);
        } else {
            bArr2 = null;
        }
        byte[] bArr6 = (byte[]) b(valueOf4, bArr2);
        if (apiErrors != null) {
            bool = Boolean.valueOf(apiErrors.b());
        }
        return C8993b.b(bVar, 0, (String) null, E10, 0, 0, 0, bArr3, (Integer) null, bArr4, (Integer) null, map, map2, bArr5, bArr6, (byte[]) b(bool, bVar.o()), (byte[]) null, (byte[]) null, (Long) null, (Map) null, (Map) null, (String) null, (List) null, (Map) null, (byte[]) null, (Map) null, (byte[]) null, (Map) null, (Map) null, 268403387, (Object) null);
    }
}
