package F9;

import L9.a;
import L9.c;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: F9.a  reason: case insensitive filesystem */
public final class C6469a extends a {
    public static final Parcelable.Creator<C6469a> CREATOR = new C6472d();

    /* renamed from: a  reason: collision with root package name */
    final Intent f35559a;

    public C6469a(Intent intent) {
        this.f35559a = intent;
    }

    public String B() {
        String stringExtra = this.f35559a.getStringExtra("google.message_id");
        return stringExtra == null ? this.f35559a.getStringExtra("message_id") : stringExtra;
    }

    /* access modifiers changed from: package-private */
    public final Integer F() {
        if (this.f35559a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f35559a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f35559a, i10, false);
        c.b(parcel, a10);
    }

    public Intent x() {
        return this.f35559a;
    }
}
