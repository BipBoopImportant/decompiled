package androidx.media3.exoplayer;

import G3.C6479C;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmProcessorActivity;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayProcessorActivity;
import java.io.IOException;
import q3.C;
import q3.C5807s;
import t3.C5950a;
import t3.N;

/* renamed from: androidx.media3.exoplayer.j  reason: case insensitive filesystem */
public final class C5233j extends C {

    /* renamed from: q  reason: collision with root package name */
    private static final String f22777q = N.A0(1001);

    /* renamed from: r  reason: collision with root package name */
    private static final String f22778r = N.A0(CashAppPayProcessorActivity.RESULT_ERROR);

    /* renamed from: s  reason: collision with root package name */
    private static final String f22779s = N.A0(AffirmProcessorActivity.RESULT_CODE_ERROR);

    /* renamed from: t  reason: collision with root package name */
    private static final String f22780t = N.A0(1004);

    /* renamed from: u  reason: collision with root package name */
    private static final String f22781u = N.A0(1005);

    /* renamed from: v  reason: collision with root package name */
    private static final String f22782v = N.A0(1006);

    /* renamed from: j  reason: collision with root package name */
    public final int f22783j;

    /* renamed from: k  reason: collision with root package name */
    public final String f22784k;

    /* renamed from: l  reason: collision with root package name */
    public final int f22785l;

    /* renamed from: m  reason: collision with root package name */
    public final C5807s f22786m;

    /* renamed from: n  reason: collision with root package name */
    public final int f22787n;

    /* renamed from: o  reason: collision with root package name */
    public final C6479C.b f22788o;

    /* renamed from: p  reason: collision with root package name */
    final boolean f22789p;

    private C5233j(int i10, Throwable th2, int i11) {
        this(i10, th2, (String) null, i11, (String) null, -1, (C5807s) null, 4, false);
    }

    public static C5233j b(Throwable th2, String str, int i10, C5807s sVar, int i11, boolean z10, int i12) {
        return new C5233j(1, th2, (String) null, i12, str, i10, sVar, sVar == null ? 4 : i11, z10);
    }

    public static C5233j c(IOException iOException, int i10) {
        return new C5233j(0, iOException, i10);
    }

    public static C5233j d(RuntimeException runtimeException, int i10) {
        return new C5233j(2, runtimeException, i10);
    }

    private static String e(int i10, String str, String str2, int i11, C5807s sVar, int i12) {
        String str3;
        if (i10 == 0) {
            str3 = "Source error";
        } else if (i10 != 1) {
            str3 = i10 != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i11 + ", format=" + sVar + ", format_supported=" + N.a0(i12);
        }
        if (TextUtils.isEmpty(str)) {
            return str3;
        }
        return str3 + ": " + str;
    }

    /* access modifiers changed from: package-private */
    public C5233j a(C6479C.b bVar) {
        return new C5233j((String) N.i(getMessage()), getCause(), this.f27853a, this.f22783j, this.f22784k, this.f22785l, this.f22786m, this.f22787n, bVar, this.f27854b, this.f22789p);
    }

    private C5233j(int i10, Throwable th2, String str, int i11, String str2, int i12, C5807s sVar, int i13, boolean z10) {
        this(e(i10, str, str2, i12, sVar, i13), th2, i11, i10, str2, i12, sVar, i13, (C6479C.b) null, SystemClock.elapsedRealtime(), z10);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C5233j(String str, Throwable th2, int i10, int i11, String str2, int i12, C5807s sVar, int i13, C6479C.b bVar, long j10, boolean z10) {
        super(str, th2, i10, Bundle.EMPTY, j10);
        int i14 = i11;
        boolean z11 = z10;
        boolean z12 = false;
        C5950a.a(!z11 || i14 == 1);
        C5950a.a((th2 != null || i14 == 3) ? true : z12);
        this.f22783j = i14;
        this.f22784k = str2;
        this.f22785l = i12;
        this.f22786m = sVar;
        this.f22787n = i13;
        this.f22788o = bVar;
        this.f22789p = z11;
    }
}
