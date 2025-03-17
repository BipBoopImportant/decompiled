package EE;

import com.optimizely.ab.config.parser.MissingJsonParserException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: EE.a  reason: case insensitive filesystem */
public final class C12846a {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f109415a = LoggerFactory.getLogger((Class<?>) C12846a.class);

    /* renamed from: EE.a$a  reason: collision with other inner class name */
    private static class C2615a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final C12852g f109416a = C12846a.b();
    }

    private C12846a() {
    }

    /* access modifiers changed from: private */
    public static C12852g b() {
        C12852g gVar;
        if (d("com.fasterxml.jackson.databind.ObjectMapper")) {
            gVar = new C12848c();
        } else if (d("com.google.gson.Gson")) {
            gVar = new C12847b();
        } else if (d("org.json.simple.JSONObject")) {
            gVar = new C12850e();
        } else if (d("org.json.JSONObject")) {
            gVar = new C12849d();
        } else {
            throw new MissingJsonParserException("unable to locate a JSON parser. Please see <link> for more information");
        }
        f109415a.debug("using json serializer: {}", (Object) gVar.getClass().getSimpleName());
        return gVar;
    }

    public static C12852g c() {
        return C2615a.f109416a;
    }

    private static boolean d(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
