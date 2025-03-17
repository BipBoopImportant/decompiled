package s;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.List;
import u2.C6012a;

/* renamed from: s.g  reason: case insensitive filesystem */
public final class C5828g {

    /* renamed from: a  reason: collision with root package name */
    private final Intent f28705a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Uri> f28706b;

    C5828g(Intent intent, List<Uri> list) {
        this.f28705a = intent;
        this.f28706b = list;
    }

    private void b(Context context) {
        for (Uri grantUriPermission : this.f28706b) {
            context.grantUriPermission(this.f28705a.getPackage(), grantUriPermission, 1);
        }
    }

    public Intent a() {
        return this.f28705a;
    }

    public void c(Context context) {
        b(context);
        C6012a.o(context, this.f28705a, (Bundle) null);
    }
}
