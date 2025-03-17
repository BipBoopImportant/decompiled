package N8;

import J8.b;
import M8.a;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import y8.C8993b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a5\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly8/b;", "LM8/a;", "aggregatedRules", "LJ8/b;", "symmetricCryptor", "LJ8/a;", "asymmetricCryptor", "Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;", "config", "a", "(Ly8/b;LM8/a;LJ8/b;LJ8/a;Lcom/contentsquare/android/core/features/config/model/JsonConfig$ProjectConfiguration;)Ly8/b;", "error-analysis_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class c {
    public static final C8993b a(C8993b bVar, a aVar, b bVar2, J8.a aVar2, JsonConfig.ProjectConfiguration projectConfiguration) {
        Integer i10;
        J8.a aVar3 = aVar2;
        C17542s.j(bVar, "<this>");
        C17542s.j(aVar, "aggregatedRules");
        C17542s.j(bVar2, "symmetricCryptor");
        C17542s.j(aVar3, "asymmetricCryptor");
        boolean a10 = aVar.a();
        List<String> d10 = aVar.d();
        return C8993b.b(bVar, 0, (String) null, (String) null, 0, 0, 0, (byte[]) null, (Integer) null, (byte[]) null, (Integer) null, (Map) null, (Map) null, (byte[]) null, (byte[]) null, (byte[]) null, a10 ? bVar2.e().getIV() : null, a10 ? aVar3.a(bVar2.f().getEncoded()) : null, (!a10 || projectConfiguration == null || (i10 = projectConfiguration.i()) == null) ? null : Long.valueOf((long) i10.intValue()), (Map) null, (Map) null, "native", d10.isEmpty() ? null : d10, (Map) null, (byte[]) null, (Map) null, (byte[]) null, (Map) null, (Map) null, 265060351, (Object) null);
    }
}
