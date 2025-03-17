package t5;

import YH.C16877v;
import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0006\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0003¨\u0006\u0007"}, d2 = {"Landroid/net/NetworkRequest;", "", "b", "(Landroid/net/NetworkRequest;)[I", "transportTypesCompat", "a", "capabilitiesCompat", "work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: t5.A  reason: case insensitive filesystem */
public final class C8790A {
    public static final int[] a(NetworkRequest networkRequest) {
        C17542s.j(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C8830y.f56627a.a(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 29; i10++) {
            int i11 = iArr[i10];
            if (C8827v.f56626a.c(networkRequest, i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return C16877v.s1(arrayList);
    }

    public static final int[] b(NetworkRequest networkRequest) {
        C17542s.j(networkRequest, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C8830y.f56627a.b(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < 9; i10++) {
            int i11 = iArr[i10];
            if (C8827v.f56626a.d(networkRequest, i11)) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        return C16877v.s1(arrayList);
    }
}
