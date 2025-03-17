package com.google.android.gms.measurement.internal;

import L9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.ar.core.ImageFormat;
import com.oppwa.mobile.connect.BuildConfig;
import d9.M;
import java.util.ArrayList;
import java.util.List;

public final class T5 implements Parcelable.Creator<E5> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int C10 = b.C(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Boolean bool = null;
        ArrayList<String> arrayList = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        long j14 = 0;
        long j15 = 0;
        long j16 = 0;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        int i10 = 0;
        boolean z13 = false;
        boolean z14 = false;
        int i11 = 0;
        int i12 = 0;
        long j17 = -2147483648L;
        String str11 = "";
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        int i13 = 100;
        while (parcel.dataPosition() < C10) {
            int u10 = b.u(parcel);
            switch (b.m(u10)) {
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
                    j10 = b.y(parcel2, u10);
                    break;
                case 7:
                    j11 = b.y(parcel2, u10);
                    break;
                case 8:
                    str5 = b.g(parcel2, u10);
                    break;
                case 9:
                    z10 = b.n(parcel2, u10);
                    break;
                case 10:
                    z12 = b.n(parcel2, u10);
                    break;
                case 11:
                    j17 = b.y(parcel2, u10);
                    break;
                case 12:
                    str6 = b.g(parcel2, u10);
                    break;
                case 14:
                    j12 = b.y(parcel2, u10);
                    break;
                case 15:
                    i10 = b.w(parcel2, u10);
                    break;
                case 16:
                    z11 = b.n(parcel2, u10);
                    break;
                case 18:
                    z13 = b.n(parcel2, u10);
                    break;
                case 19:
                    str7 = b.g(parcel2, u10);
                    break;
                case 21:
                    bool = b.o(parcel2, u10);
                    break;
                case 22:
                    j13 = b.y(parcel2, u10);
                    break;
                case M.RESPONSE_BODY_ATTRIBUTES_FIELD_NUMBER /*23*/:
                    arrayList = b.i(parcel2, u10);
                    break;
                case BuildConfig.MIN_SDK_VERSION /*24*/:
                    str8 = b.g(parcel2, u10);
                    break;
                case 25:
                    str11 = b.g(parcel2, u10);
                    break;
                case 26:
                    str12 = b.g(parcel2, u10);
                    break;
                case 27:
                    str9 = b.g(parcel2, u10);
                    break;
                case 28:
                    z14 = b.n(parcel2, u10);
                    break;
                case 29:
                    j14 = b.y(parcel2, u10);
                    break;
                case 30:
                    i13 = b.w(parcel2, u10);
                    break;
                case 31:
                    str13 = b.g(parcel2, u10);
                    break;
                case 32:
                    i11 = b.w(parcel2, u10);
                    break;
                case 34:
                    j15 = b.y(parcel2, u10);
                    break;
                case ImageFormat.YUV_420_888 /*35*/:
                    str10 = b.g(parcel2, u10);
                    break;
                case 36:
                    str14 = b.g(parcel2, u10);
                    break;
                case 37:
                    j16 = b.y(parcel2, u10);
                    break;
                case 38:
                    i12 = b.w(parcel2, u10);
                    break;
                default:
                    b.B(parcel2, u10);
                    break;
            }
        }
        b.l(parcel2, C10);
        return new E5(str, str2, str3, str4, j10, j11, str5, z10, z12, j17, str6, j12, i10, z11, z13, str7, bool, j13, (List<String>) arrayList, str8, str11, str12, str9, z14, j14, i13, str13, i11, j15, str10, str14, j16, i12);
    }

    public final /* synthetic */ Object[] newArray(int i10) {
        return new E5[i10];
    }
}
