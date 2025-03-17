package dc;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

public final class j extends L9.a {
    public static final Parcelable.Creator<j> CREATOR = new k();

    /* renamed from: a  reason: collision with root package name */
    private final Uri f72390a;

    /* renamed from: b  reason: collision with root package name */
    private final Uri f72391b;

    /* renamed from: c  reason: collision with root package name */
    private final List<a> f72392c;

    public static class a extends L9.a {
        public static final Parcelable.Creator<a> CREATOR = new l();

        /* renamed from: a  reason: collision with root package name */
        private final String f72393a;

        public a(String str) {
            this.f72393a = str;
        }

        public void writeToParcel(Parcel parcel, int i10) {
            l.c(this, parcel, i10);
        }

        public String x() {
            return this.f72393a;
        }
    }

    public j(Uri uri, Uri uri2, List<a> list) {
        this.f72390a = uri;
        this.f72391b = uri2;
        this.f72392c = list == null ? new ArrayList<>() : list;
    }

    public Uri B() {
        return this.f72390a;
    }

    public List<a> F() {
        return this.f72392c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        k.c(this, parcel, i10);
    }

    public Uri x() {
        return this.f72391b;
    }
}
