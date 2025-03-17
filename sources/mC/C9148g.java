package Mc;

import HJ.C15838d;
import android.util.Log;
import com.optimizely.ab.config.FeatureVariable;
import j9.c;
import j9.d;
import j9.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mc.C10036b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"LMc/g;", "LMc/h;", "Lmc/b;", "Lj9/j;", "transportFactoryProvider", "<init>", "(Lmc/b;)V", "LMc/z;", "value", "", "c", "(LMc/z;)[B", "sessionEvent", "LXH/N;", "a", "(LMc/z;)V", "Lmc/b;", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: Mc.g  reason: case insensitive filesystem */
public final class C9148g implements C9149h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f61811b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C10036b<j> f61812a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LMc/g$a;", "", "<init>", "()V", "", "AQS_LOG_SOURCE", "Ljava/lang/String;", "TAG", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: Mc.g$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C9148g(C10036b<j> bVar) {
        C17542s.j(bVar, "transportFactoryProvider");
        this.f61812a = bVar;
    }

    /* access modifiers changed from: private */
    public final byte[] c(z zVar) {
        String b10 = A.f61711a.c().b(zVar);
        C17542s.i(b10, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event Type: " + zVar.b().name());
        byte[] bytes = b10.getBytes(C15838d.f135279b);
        C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public void a(z zVar) {
        C17542s.j(zVar, "sessionEvent");
        this.f61812a.get().b("FIREBASE_APPQUALITY_SESSION", z.class, c.b(FeatureVariable.JSON_TYPE), new C9147f(this)).b(d.f(zVar));
    }
}
