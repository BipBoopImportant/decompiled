package a9;

import A8.b;
import E8.c;
import G8.d;
import com.contentsquare.android.core.features.config.model.JsonConfig;
import kotlin.jvm.internal.C17542s;

public final class E {

    /* renamed from: a  reason: collision with root package name */
    public final c f41973a;

    /* renamed from: b  reason: collision with root package name */
    public final b f41974b;

    /* renamed from: c  reason: collision with root package name */
    public final d f41975c;

    /* renamed from: d  reason: collision with root package name */
    public a f41976d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f41977a;

        /* renamed from: b  reason: collision with root package name */
        public final int f41978b;

        public a(int i10, boolean z10) {
            this.f41977a = z10;
            this.f41978b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f41977a == aVar.f41977a && this.f41978b == aVar.f41978b;
        }

        public final int hashCode() {
            boolean z10 = this.f41977a;
            if (z10) {
                z10 = true;
            }
            return Integer.hashCode(this.f41978b) + ((z10 ? 1 : 0) * true);
        }

        public final String toString() {
            return "RemoteForceMaskingCache(isRemoteForceMaskEnabled=" + this.f41977a + ", hash=" + this.f41978b + ')';
        }
    }

    public E(c cVar, b bVar, d dVar) {
        C17542s.j(cVar, "preferenceStore");
        C17542s.j(bVar, "configuration");
        C17542s.j(dVar, "buildInformation");
        this.f41973a = cVar;
        this.f41974b = bVar;
        this.f41975c = dVar;
    }

    public final boolean a() {
        JsonConfig.SessionReplay o10;
        JsonConfig.ProjectConfiguration b10 = this.f41974b.b();
        if (b10 == null || (o10 = b10.o()) == null) {
            return false;
        }
        return o10.d();
    }
}
