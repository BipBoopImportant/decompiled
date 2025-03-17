package K9;

import android.os.Bundle;
import com.google.android.gms.common.api.a;

/* renamed from: K9.z  reason: case insensitive filesystem */
public class C6627z implements a.d {

    /* renamed from: b  reason: collision with root package name */
    public static final C6627z f37945b = a().a();

    /* renamed from: a  reason: collision with root package name */
    private final String f37946a;

    /* renamed from: K9.z$a */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f37947a;

        /* synthetic */ a(C c10) {
        }

        public C6627z a() {
            return new C6627z(this.f37947a, (D) null);
        }

        public a b(String str) {
            this.f37947a = str;
            return this;
        }
    }

    /* synthetic */ C6627z(String str, D d10) {
        this.f37946a = str;
    }

    public static a a() {
        return new a((C) null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f37946a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6627z)) {
            return false;
        }
        return C6619q.b(this.f37946a, ((C6627z) obj).f37946a);
    }

    public final int hashCode() {
        return C6619q.c(this.f37946a);
    }
}
