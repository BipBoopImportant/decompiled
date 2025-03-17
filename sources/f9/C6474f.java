package F9;

import android.content.Intent;
import android.os.Bundle;
import xa.C8962c;
import xa.C8971l;

/* renamed from: F9.f  reason: case insensitive filesystem */
public final /* synthetic */ class C6474f implements C8962c {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ C6474f f35574a = new C6474f();

    private /* synthetic */ C6474f() {
    }

    public final Object then(C8971l lVar) {
        Intent intent = (Intent) ((Bundle) lVar.m()).getParcelable("notification_data");
        if (intent != null) {
            return new C6469a(intent);
        }
        return null;
    }
}
