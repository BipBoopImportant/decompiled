package K9;

import G9.C6521b;
import K9.C6613k;
import L9.a;
import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* renamed from: K9.g  reason: case insensitive filesystem */
public class C6609g extends a {
    public static final Parcelable.Creator<C6609g> CREATOR = new q0();

    /* renamed from: o  reason: collision with root package name */
    static final Scope[] f37848o = new Scope[0];

    /* renamed from: p  reason: collision with root package name */
    static final C6521b[] f37849p = new C6521b[0];

    /* renamed from: a  reason: collision with root package name */
    final int f37850a;

    /* renamed from: b  reason: collision with root package name */
    final int f37851b;

    /* renamed from: c  reason: collision with root package name */
    final int f37852c;

    /* renamed from: d  reason: collision with root package name */
    String f37853d;

    /* renamed from: e  reason: collision with root package name */
    IBinder f37854e;

    /* renamed from: f  reason: collision with root package name */
    Scope[] f37855f;

    /* renamed from: g  reason: collision with root package name */
    Bundle f37856g;

    /* renamed from: h  reason: collision with root package name */
    Account f37857h;

    /* renamed from: i  reason: collision with root package name */
    C6521b[] f37858i;

    /* renamed from: j  reason: collision with root package name */
    C6521b[] f37859j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f37860k;

    /* renamed from: l  reason: collision with root package name */
    final int f37861l;

    /* renamed from: m  reason: collision with root package name */
    boolean f37862m;

    /* renamed from: n  reason: collision with root package name */
    private final String f37863n;

    C6609g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, C6521b[] bVarArr, C6521b[] bVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f37848o : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        bVarArr = bVarArr == null ? f37849p : bVarArr;
        bVarArr2 = bVarArr2 == null ? f37849p : bVarArr2;
        this.f37850a = i10;
        this.f37851b = i11;
        this.f37852c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f37853d = "com.google.android.gms";
        } else {
            this.f37853d = str;
        }
        if (i10 < 2) {
            this.f37857h = iBinder != null ? C6600a.K3(C6613k.a.J3(iBinder)) : null;
        } else {
            this.f37854e = iBinder;
            this.f37857h = account;
        }
        this.f37855f = scopeArr;
        this.f37856g = bundle;
        this.f37858i = bVarArr;
        this.f37859j = bVarArr2;
        this.f37860k = z10;
        this.f37861l = i13;
        this.f37862m = z11;
        this.f37863n = str2;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        q0.a(this, parcel, i10);
    }

    public String x() {
        return this.f37863n;
    }
}
