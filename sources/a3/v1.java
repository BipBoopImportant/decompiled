package A3;

import android.media.metrics.LogSessionId;
import java.util.Objects;
import t3.C5950a;
import t3.N;

public final class v1 {

    /* renamed from: d  reason: collision with root package name */
    public static final v1 f32661d = (N.f29462a < 31 ? new v1("") : new v1(a.f32665b, ""));

    /* renamed from: a  reason: collision with root package name */
    public final String f32662a;

    /* renamed from: b  reason: collision with root package name */
    private final a f32663b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f32664c;

    private static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final a f32665b = new a(LogSessionId.LOG_SESSION_ID_NONE);

        /* renamed from: a  reason: collision with root package name */
        public final LogSessionId f32666a;

        public a(LogSessionId logSessionId) {
            this.f32666a = logSessionId;
        }
    }

    public v1(String str) {
        C5950a.g(N.f29462a < 31);
        this.f32662a = str;
        this.f32663b = null;
        this.f32664c = new Object();
    }

    public LogSessionId a() {
        return ((a) C5950a.e(this.f32663b)).f32666a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1)) {
            return false;
        }
        v1 v1Var = (v1) obj;
        return Objects.equals(this.f32662a, v1Var.f32662a) && Objects.equals(this.f32663b, v1Var.f32663b) && Objects.equals(this.f32664c, v1Var.f32664c);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f32662a, this.f32663b, this.f32664c});
    }

    public v1(LogSessionId logSessionId, String str) {
        this(new a(logSessionId), str);
    }

    private v1(a aVar, String str) {
        this.f32663b = aVar;
        this.f32662a = str;
        this.f32664c = new Object();
    }
}
