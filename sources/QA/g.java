package qa;

import K9.C6620s;
import L9.a;
import L9.c;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.google.android.gms.common.util.k;
import java.io.IOException;

public final class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new r();

    /* renamed from: a  reason: collision with root package name */
    private final String f55651a;

    public g(String str) {
        C6620s.m(str, "json must not be null");
        this.f55651a = str;
    }

    public static g x(Context context, int i10) {
        try {
            return new g(new String(k.c(context.getResources().openRawResource(i10)), Constants.ENCODING));
        } catch (IOException e10) {
            String obj = e10.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i10 + ": " + obj);
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        String str = this.f55651a;
        int a10 = c.a(parcel);
        c.u(parcel, 2, str, false);
        c.b(parcel, a10);
    }
}
