package AF;

import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"LAF/x;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "HEADER", "LOGIN", "SCENE_UPLOADING_PENDING", "SCENE_UPLOADING_PENDING_LOGIN", "SCENE_UPLOAD_FAILED", "SCENE_PROCESSING", "SCENE_FAILED", "SCENE_READY", "SCENE_EXISTING", "CAPTURE", "CAPTURE_AGAIN", "NEED_HELP", "SHOWROOM_READY", "SHOWROOM_EXISTING", "DESIGN_DETAILS", "DESIGN_ON_WEB", "PRIVACY_POLICY_CONSENT", "UNKNOWN", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.x  reason: case insensitive filesystem */
public enum C12603x {
    HEADER,
    LOGIN,
    SCENE_UPLOADING_PENDING,
    SCENE_UPLOADING_PENDING_LOGIN,
    SCENE_UPLOAD_FAILED,
    SCENE_PROCESSING,
    SCENE_FAILED,
    SCENE_READY,
    SCENE_EXISTING,
    CAPTURE,
    CAPTURE_AGAIN,
    NEED_HELP,
    SHOWROOM_READY,
    SHOWROOM_EXISTING,
    DESIGN_DETAILS,
    DESIGN_ON_WEB,
    PRIVACY_POLICY_CONSENT,
    UNKNOWN;
    
    public static final a Companion = null;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LAF/x$a;", "", "<init>", "()V", "", "type", "LAF/x;", "a", "(I)LAF/x;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: AF.x$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C12603x a(int i10) {
            for (C12603x xVar : C12603x.values()) {
                if (xVar.ordinal() == i10) {
                    return xVar;
                }
            }
            return null;
        }

        private a() {
        }
    }

    static {
        C12603x[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }
}
