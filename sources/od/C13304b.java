package OD;

import HJ.C15838d;
import PD.C13337b;
import android.util.Base64;
import com.optimizely.ab.config.FeatureVariable;
import fK.z;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LOD/b;", "LPD/b;", "LkK/c;", "json", "<init>", "(LkK/c;)V", "", "T", "value", "", "invoke", "(Ljava/lang/Object;)Ljava/lang/String;", "a", "LkK/c;", "b", "webview-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: OD.b  reason: case insensitive filesystem */
public final class C13304b implements C13337b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f112779b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f112780a;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"LOD/b$a;", "", "<init>", "()V", "", "VALUE_SAME_SITE_STRICT", "Ljava/lang/String;", "COOKIE_ATTRIBUTE_SAME_SITE", "COOKIE_ATTRIBUTE_SECURE", "", "VALUE_MAX_AGE_SECONDS", "I", "COOKIE_ATTRIBUTE_MAX_AGE", "webview-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: OD.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C13304b(C17514c cVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f112780a = cVar;
    }

    public <T> String invoke(T t10) {
        C17542s.j(t10, "value");
        byte[] bytes = this.f112780a.b(z.b(t10.getClass()), t10).getBytes(C15838d.f135279b);
        C17542s.i(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 2);
        return "ikeaapp-from-app=" + encodeToString + "; SameSite=Strict; Secure; Max-Age=300";
    }
}
