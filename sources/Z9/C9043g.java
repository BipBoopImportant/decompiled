package z9;

import K9.C6619q;
import android.os.Bundle;
import com.google.android.gms.common.api.a;

@Deprecated
/* renamed from: z9.g  reason: case insensitive filesystem */
public final class C9043g implements a.d {

    /* renamed from: d  reason: collision with root package name */
    public static final C9043g f58571d = new C9043g(new C9042f());
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f58572a = null;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final boolean f58573b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final String f58574c;

    public C9043g(C9042f fVar) {
        this.f58573b = fVar.f58569a.booleanValue();
        this.f58574c = fVar.f58570b;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", (String) null);
        bundle.putBoolean("force_save_dialog", this.f58573b);
        bundle.putString("log_session_id", this.f58574c);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9043g)) {
            return false;
        }
        C9043g gVar = (C9043g) obj;
        String str = gVar.f58572a;
        return C6619q.b((Object) null, (Object) null) && this.f58573b == gVar.f58573b && C6619q.b(this.f58574c, gVar.f58574c);
    }

    public final int hashCode() {
        return C6619q.c(null, Boolean.valueOf(this.f58573b), this.f58574c);
    }
}
