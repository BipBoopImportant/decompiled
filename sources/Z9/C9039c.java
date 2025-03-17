package z9;

import K9.C6619q;
import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* renamed from: z9.c  reason: case insensitive filesystem */
public final class C9039c implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final C9039c f58567b = new C9039c(new Bundle(), (i) null);

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f58568a;

    /* synthetic */ C9039c(Bundle bundle, i iVar) {
        this.f58568a = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f58568a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C9039c)) {
            return false;
        }
        return C6619q.a(this.f58568a, ((C9039c) obj).f58568a);
    }

    public final int hashCode() {
        return C6619q.c(this.f58568a);
    }
}
