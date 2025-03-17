package Oc;

import IJ.C15906b;
import IJ.C15908d;
import IJ.C15909e;
import Oc.h;
import XH.C16807N;
import android.content.Context;
import android.os.Bundle;
import dI.C17164e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068\u0002X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u0012\u0004\b\n\u0010\u000bR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u000eR\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00108VX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"LOc/b;", "LOc/h;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "a", "Landroid/os/Bundle;", "getMetadata$annotations", "()V", "metadata", "", "()Ljava/lang/Boolean;", "sessionEnabled", "LIJ/b;", "b", "()LIJ/b;", "sessionRestartTimeout", "", "c", "()Ljava/lang/Double;", "samplingRate", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b implements h {

    /* renamed from: b  reason: collision with root package name */
    private static final a f62058b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f62059a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"LOc/b$a;", "", "<init>", "()V", "", "SAMPLING_RATE", "Ljava/lang/String;", "SESSIONS_ENABLED", "SESSION_RESTART_TIMEOUT", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(Context context) {
        C17542s.j(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f62059a = bundle == null ? Bundle.EMPTY : bundle;
    }

    public Boolean a() {
        if (this.f62059a.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(this.f62059a.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public C15906b b() {
        if (this.f62059a.containsKey("firebase_sessions_sessions_restart_timeout")) {
            return C15906b.v(C15908d.s(this.f62059a.getInt("firebase_sessions_sessions_restart_timeout"), C15909e.SECONDS));
        }
        return null;
    }

    public Double c() {
        if (this.f62059a.containsKey("firebase_sessions_sampling_rate")) {
            return Double.valueOf(this.f62059a.getDouble("firebase_sessions_sampling_rate"));
        }
        return null;
    }

    public Object d(C17164e<? super C16807N> eVar) {
        return h.a.a(this, eVar);
    }
}
