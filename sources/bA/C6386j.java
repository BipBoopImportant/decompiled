package Ba;

import K9.C6620s;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: Ba.j  reason: case insensitive filesystem */
public final class C6386j extends L9.a {
    public static final Parcelable.Creator<C6386j> CREATOR = new x();

    /* renamed from: a  reason: collision with root package name */
    boolean f33346a;

    /* renamed from: b  reason: collision with root package name */
    boolean f33347b;

    /* renamed from: c  reason: collision with root package name */
    C6379c f33348c;

    /* renamed from: d  reason: collision with root package name */
    boolean f33349d;

    /* renamed from: e  reason: collision with root package name */
    C6394s f33350e;

    /* renamed from: f  reason: collision with root package name */
    ArrayList f33351f;

    /* renamed from: g  reason: collision with root package name */
    C6388l f33352g;

    /* renamed from: h  reason: collision with root package name */
    C6395t f33353h;

    /* renamed from: i  reason: collision with root package name */
    boolean f33354i;

    /* renamed from: j  reason: collision with root package name */
    String f33355j;

    /* renamed from: k  reason: collision with root package name */
    byte[] f33356k;

    /* renamed from: l  reason: collision with root package name */
    Bundle f33357l;

    @Deprecated
    /* renamed from: Ba.j$a */
    public final class a {
        /* synthetic */ a(w wVar) {
        }

        public C6386j a() {
            C6386j jVar = C6386j.this;
            if (jVar.f33355j == null && jVar.f33356k == null) {
                C6620s.m(jVar.f33351f, "Allowed payment methods must be set! You can set it through addAllowedPaymentMethod() or addAllowedPaymentMethods() in the PaymentDataRequest Builder.");
                C6620s.m(C6386j.this.f33348c, "Card requirements must be set!");
                C6386j jVar2 = C6386j.this;
                if (jVar2.f33352g != null) {
                    C6620s.m(jVar2.f33353h, "Transaction info must be set if paymentMethodTokenizationParameters is set!");
                }
            }
            return C6386j.this;
        }
    }

    private C6386j() {
        this.f33354i = true;
    }

    @Deprecated
    public static a B() {
        return new a((w) null);
    }

    public static C6386j x(String str) {
        a B10 = B();
        C6386j.this.f33355j = (String) C6620s.m(str, "paymentDataRequestJson cannot be null!");
        return B10.a();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.c(parcel, 1, this.f33346a);
        c.c(parcel, 2, this.f33347b);
        c.t(parcel, 3, this.f33348c, i10, false);
        c.c(parcel, 4, this.f33349d);
        c.t(parcel, 5, this.f33350e, i10, false);
        c.p(parcel, 6, this.f33351f, false);
        c.t(parcel, 7, this.f33352g, i10, false);
        c.t(parcel, 8, this.f33353h, i10, false);
        c.c(parcel, 9, this.f33354i);
        c.u(parcel, 10, this.f33355j, false);
        c.e(parcel, 11, this.f33357l, false);
        c.g(parcel, 12, this.f33356k, false);
        c.b(parcel, a10);
    }

    C6386j(boolean z10, boolean z11, C6379c cVar, boolean z12, C6394s sVar, ArrayList arrayList, C6388l lVar, C6395t tVar, boolean z13, String str, byte[] bArr, Bundle bundle) {
        this.f33346a = z10;
        this.f33347b = z11;
        this.f33348c = cVar;
        this.f33349d = z12;
        this.f33350e = sVar;
        this.f33351f = arrayList;
        this.f33352g = lVar;
        this.f33353h = tVar;
        this.f33354i = z13;
        this.f33355j = str;
        this.f33356k = bArr;
        this.f33357l = bundle;
    }
}
