package com.google.android.gms.auth.api.signin;

import L9.b;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

public final class c implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Uri uri = null;
        String str5 = null;
        String str6 = null;
        ArrayList<Scope> arrayList = null;
        String str7 = null;
        String str8 = null;
        long j10 = 0;
        int i10 = 0;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
                case 1:
                    i10 = b.w(parcel2, u10);
                    break;
                case 2:
                    str = b.g(parcel2, u10);
                    break;
                case 3:
                    str2 = b.g(parcel2, u10);
                    break;
                case 4:
                    str3 = b.g(parcel2, u10);
                    break;
                case 5:
                    str4 = b.g(parcel2, u10);
                    break;
                case 6:
                    uri = (Uri) b.f(parcel2, u10, Uri.CREATOR);
                    break;
                case 7:
                    str5 = b.g(parcel2, u10);
                    break;
                case 8:
                    j10 = b.y(parcel2, u10);
                    break;
                case 9:
                    str6 = b.g(parcel2, u10);
                    break;
                case 10:
                    arrayList = b.k(parcel2, u10, Scope.CREATOR);
                    break;
                case 11:
                    str7 = b.g(parcel2, u10);
                    break;
                case 12:
                    str8 = b.g(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new GoogleSignInAccount(i10, str, str2, str3, str4, uri, str5, j10, str6, arrayList, str7, str8);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new GoogleSignInAccount[i10];
    }
}
