package za;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;

public class a extends L9.a {
    @RecentlyNonNull
    public static final Parcelable.Creator<a> CREATOR = new d();

    /* renamed from: a  reason: collision with root package name */
    public int f58575a;
    @RecentlyNonNull

    /* renamed from: b  reason: collision with root package name */
    public String f58576b;
    @RecentlyNonNull

    /* renamed from: c  reason: collision with root package name */
    public String f58577c;

    /* renamed from: d  reason: collision with root package name */
    public int f58578d;
    @RecentlyNonNull

    /* renamed from: e  reason: collision with root package name */
    public Point[] f58579e;
    @RecentlyNonNull

    /* renamed from: f  reason: collision with root package name */
    public f f58580f;
    @RecentlyNonNull

    /* renamed from: g  reason: collision with root package name */
    public i f58581g;
    @RecentlyNonNull

    /* renamed from: h  reason: collision with root package name */
    public j f58582h;
    @RecentlyNonNull

    /* renamed from: i  reason: collision with root package name */
    public l f58583i;
    @RecentlyNonNull

    /* renamed from: j  reason: collision with root package name */
    public k f58584j;
    @RecentlyNonNull

    /* renamed from: k  reason: collision with root package name */
    public g f58585k;
    @RecentlyNonNull

    /* renamed from: l  reason: collision with root package name */
    public c f58586l;
    @RecentlyNonNull

    /* renamed from: m  reason: collision with root package name */
    public d f58587m;
    @RecentlyNonNull

    /* renamed from: n  reason: collision with root package name */
    public e f58588n;
    @RecentlyNonNull

    /* renamed from: o  reason: collision with root package name */
    public byte[] f58589o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f58590p;

    /* renamed from: za.a$a  reason: collision with other inner class name */
    public static class C0955a extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<C0955a> CREATOR = new c();

        /* renamed from: a  reason: collision with root package name */
        public int f58591a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String[] f58592b;

        public C0955a() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.n(parcel, 2, this.f58591a);
            L9.c.v(parcel, 3, this.f58592b, false);
            L9.c.b(parcel, a10);
        }

        public C0955a(int i10, @RecentlyNonNull String[] strArr) {
            this.f58591a = i10;
            this.f58592b = strArr;
        }
    }

    public static class b extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<b> CREATOR = new f();

        /* renamed from: a  reason: collision with root package name */
        public int f58593a;

        /* renamed from: b  reason: collision with root package name */
        public int f58594b;

        /* renamed from: c  reason: collision with root package name */
        public int f58595c;

        /* renamed from: d  reason: collision with root package name */
        public int f58596d;

        /* renamed from: e  reason: collision with root package name */
        public int f58597e;

        /* renamed from: f  reason: collision with root package name */
        public int f58598f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f58599g;
        @RecentlyNonNull

        /* renamed from: h  reason: collision with root package name */
        public String f58600h;

        public b() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.n(parcel, 2, this.f58593a);
            L9.c.n(parcel, 3, this.f58594b);
            L9.c.n(parcel, 4, this.f58595c);
            L9.c.n(parcel, 5, this.f58596d);
            L9.c.n(parcel, 6, this.f58597e);
            L9.c.n(parcel, 7, this.f58598f);
            L9.c.c(parcel, 8, this.f58599g);
            L9.c.u(parcel, 9, this.f58600h, false);
            L9.c.b(parcel, a10);
        }

        public b(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, @RecentlyNonNull String str) {
            this.f58593a = i10;
            this.f58594b = i11;
            this.f58595c = i12;
            this.f58596d = i13;
            this.f58597e = i14;
            this.f58598f = i15;
            this.f58599g = z10;
            this.f58600h = str;
        }
    }

    public static class c extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<c> CREATOR = new h();
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public String f58601a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58602b;
        @RecentlyNonNull

        /* renamed from: c  reason: collision with root package name */
        public String f58603c;
        @RecentlyNonNull

        /* renamed from: d  reason: collision with root package name */
        public String f58604d;
        @RecentlyNonNull

        /* renamed from: e  reason: collision with root package name */
        public String f58605e;
        @RecentlyNonNull

        /* renamed from: f  reason: collision with root package name */
        public b f58606f;
        @RecentlyNonNull

        /* renamed from: g  reason: collision with root package name */
        public b f58607g;

        public c() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.u(parcel, 2, this.f58601a, false);
            L9.c.u(parcel, 3, this.f58602b, false);
            L9.c.u(parcel, 4, this.f58603c, false);
            L9.c.u(parcel, 5, this.f58604d, false);
            L9.c.u(parcel, 6, this.f58605e, false);
            L9.c.t(parcel, 7, this.f58606f, i10, false);
            L9.c.t(parcel, 8, this.f58607g, i10, false);
            L9.c.b(parcel, a10);
        }

        public c(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull b bVar, @RecentlyNonNull b bVar2) {
            this.f58601a = str;
            this.f58602b = str2;
            this.f58603c = str3;
            this.f58604d = str4;
            this.f58605e = str5;
            this.f58606f = bVar;
            this.f58607g = bVar2;
        }
    }

    public static class d extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<d> CREATOR = new g();
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public h f58608a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58609b;
        @RecentlyNonNull

        /* renamed from: c  reason: collision with root package name */
        public String f58610c;
        @RecentlyNonNull

        /* renamed from: d  reason: collision with root package name */
        public i[] f58611d;
        @RecentlyNonNull

        /* renamed from: e  reason: collision with root package name */
        public f[] f58612e;
        @RecentlyNonNull

        /* renamed from: f  reason: collision with root package name */
        public String[] f58613f;
        @RecentlyNonNull

        /* renamed from: g  reason: collision with root package name */
        public C0955a[] f58614g;

        public d() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.t(parcel, 2, this.f58608a, i10, false);
            L9.c.u(parcel, 3, this.f58609b, false);
            L9.c.u(parcel, 4, this.f58610c, false);
            L9.c.x(parcel, 5, this.f58611d, i10, false);
            L9.c.x(parcel, 6, this.f58612e, i10, false);
            L9.c.v(parcel, 7, this.f58613f, false);
            L9.c.x(parcel, 8, this.f58614g, i10, false);
            L9.c.b(parcel, a10);
        }

        public d(@RecentlyNonNull h hVar, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull i[] iVarArr, @RecentlyNonNull f[] fVarArr, @RecentlyNonNull String[] strArr, @RecentlyNonNull C0955a[] aVarArr) {
            this.f58608a = hVar;
            this.f58609b = str;
            this.f58610c = str2;
            this.f58611d = iVarArr;
            this.f58612e = fVarArr;
            this.f58613f = strArr;
            this.f58614g = aVarArr;
        }
    }

    public static class e extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<e> CREATOR = new j();
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public String f58615a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58616b;
        @RecentlyNonNull

        /* renamed from: c  reason: collision with root package name */
        public String f58617c;
        @RecentlyNonNull

        /* renamed from: d  reason: collision with root package name */
        public String f58618d;
        @RecentlyNonNull

        /* renamed from: e  reason: collision with root package name */
        public String f58619e;
        @RecentlyNonNull

        /* renamed from: f  reason: collision with root package name */
        public String f58620f;
        @RecentlyNonNull

        /* renamed from: g  reason: collision with root package name */
        public String f58621g;
        @RecentlyNonNull

        /* renamed from: h  reason: collision with root package name */
        public String f58622h;
        @RecentlyNonNull

        /* renamed from: i  reason: collision with root package name */
        public String f58623i;
        @RecentlyNonNull

        /* renamed from: j  reason: collision with root package name */
        public String f58624j;
        @RecentlyNonNull

        /* renamed from: k  reason: collision with root package name */
        public String f58625k;
        @RecentlyNonNull

        /* renamed from: l  reason: collision with root package name */
        public String f58626l;
        @RecentlyNonNull

        /* renamed from: m  reason: collision with root package name */
        public String f58627m;
        @RecentlyNonNull

        /* renamed from: n  reason: collision with root package name */
        public String f58628n;

        public e() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.u(parcel, 2, this.f58615a, false);
            L9.c.u(parcel, 3, this.f58616b, false);
            L9.c.u(parcel, 4, this.f58617c, false);
            L9.c.u(parcel, 5, this.f58618d, false);
            L9.c.u(parcel, 6, this.f58619e, false);
            L9.c.u(parcel, 7, this.f58620f, false);
            L9.c.u(parcel, 8, this.f58621g, false);
            L9.c.u(parcel, 9, this.f58622h, false);
            L9.c.u(parcel, 10, this.f58623i, false);
            L9.c.u(parcel, 11, this.f58624j, false);
            L9.c.u(parcel, 12, this.f58625k, false);
            L9.c.u(parcel, 13, this.f58626l, false);
            L9.c.u(parcel, 14, this.f58627m, false);
            L9.c.u(parcel, 15, this.f58628n, false);
            L9.c.b(parcel, a10);
        }

        public e(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull String str6, @RecentlyNonNull String str7, @RecentlyNonNull String str8, @RecentlyNonNull String str9, @RecentlyNonNull String str10, @RecentlyNonNull String str11, @RecentlyNonNull String str12, @RecentlyNonNull String str13, @RecentlyNonNull String str14) {
            this.f58615a = str;
            this.f58616b = str2;
            this.f58617c = str3;
            this.f58618d = str4;
            this.f58619e = str5;
            this.f58620f = str6;
            this.f58621g = str7;
            this.f58622h = str8;
            this.f58623i = str9;
            this.f58624j = str10;
            this.f58625k = str11;
            this.f58626l = str12;
            this.f58627m = str13;
            this.f58628n = str14;
        }
    }

    public static class f extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<f> CREATOR = new i();

        /* renamed from: a  reason: collision with root package name */
        public int f58629a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58630b;
        @RecentlyNonNull

        /* renamed from: c  reason: collision with root package name */
        public String f58631c;
        @RecentlyNonNull

        /* renamed from: d  reason: collision with root package name */
        public String f58632d;

        public f() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.n(parcel, 2, this.f58629a);
            L9.c.u(parcel, 3, this.f58630b, false);
            L9.c.u(parcel, 4, this.f58631c, false);
            L9.c.u(parcel, 5, this.f58632d, false);
            L9.c.b(parcel, a10);
        }

        public f(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3) {
            this.f58629a = i10;
            this.f58630b = str;
            this.f58631c = str2;
            this.f58632d = str3;
        }
    }

    public static class g extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<g> CREATOR = new l();

        /* renamed from: a  reason: collision with root package name */
        public double f58633a;

        /* renamed from: b  reason: collision with root package name */
        public double f58634b;

        public g() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.i(parcel, 2, this.f58633a);
            L9.c.i(parcel, 3, this.f58634b);
            L9.c.b(parcel, a10);
        }

        public g(double d10, double d11) {
            this.f58633a = d10;
            this.f58634b = d11;
        }
    }

    public static class h extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<h> CREATOR = new k();
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public String f58635a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58636b;
        @RecentlyNonNull

        /* renamed from: c  reason: collision with root package name */
        public String f58637c;
        @RecentlyNonNull

        /* renamed from: d  reason: collision with root package name */
        public String f58638d;
        @RecentlyNonNull

        /* renamed from: e  reason: collision with root package name */
        public String f58639e;
        @RecentlyNonNull

        /* renamed from: f  reason: collision with root package name */
        public String f58640f;
        @RecentlyNonNull

        /* renamed from: g  reason: collision with root package name */
        public String f58641g;

        public h() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.u(parcel, 2, this.f58635a, false);
            L9.c.u(parcel, 3, this.f58636b, false);
            L9.c.u(parcel, 4, this.f58637c, false);
            L9.c.u(parcel, 5, this.f58638d, false);
            L9.c.u(parcel, 6, this.f58639e, false);
            L9.c.u(parcel, 7, this.f58640f, false);
            L9.c.u(parcel, 8, this.f58641g, false);
            L9.c.b(parcel, a10);
        }

        public h(@RecentlyNonNull String str, @RecentlyNonNull String str2, @RecentlyNonNull String str3, @RecentlyNonNull String str4, @RecentlyNonNull String str5, @RecentlyNonNull String str6, @RecentlyNonNull String str7) {
            this.f58635a = str;
            this.f58636b = str2;
            this.f58637c = str3;
            this.f58638d = str4;
            this.f58639e = str5;
            this.f58640f = str6;
            this.f58641g = str7;
        }
    }

    public static class i extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<i> CREATOR = new n();

        /* renamed from: a  reason: collision with root package name */
        public int f58642a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58643b;

        public i() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.n(parcel, 2, this.f58642a);
            L9.c.u(parcel, 3, this.f58643b, false);
            L9.c.b(parcel, a10);
        }

        public i(int i10, @RecentlyNonNull String str) {
            this.f58642a = i10;
            this.f58643b = str;
        }
    }

    public static class j extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<j> CREATOR = new m();
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public String f58644a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58645b;

        public j() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.u(parcel, 2, this.f58644a, false);
            L9.c.u(parcel, 3, this.f58645b, false);
            L9.c.b(parcel, a10);
        }

        public j(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f58644a = str;
            this.f58645b = str2;
        }
    }

    public static class k extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<k> CREATOR = new p();
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public String f58646a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58647b;

        public k() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.u(parcel, 2, this.f58646a, false);
            L9.c.u(parcel, 3, this.f58647b, false);
            L9.c.b(parcel, a10);
        }

        public k(@RecentlyNonNull String str, @RecentlyNonNull String str2) {
            this.f58646a = str;
            this.f58647b = str2;
        }
    }

    public static class l extends L9.a {
        @RecentlyNonNull
        public static final Parcelable.Creator<l> CREATOR = new o();
        @RecentlyNonNull

        /* renamed from: a  reason: collision with root package name */
        public String f58648a;
        @RecentlyNonNull

        /* renamed from: b  reason: collision with root package name */
        public String f58649b;

        /* renamed from: c  reason: collision with root package name */
        public int f58650c;

        public l() {
        }

        public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
            int a10 = L9.c.a(parcel);
            L9.c.u(parcel, 2, this.f58648a, false);
            L9.c.u(parcel, 3, this.f58649b, false);
            L9.c.n(parcel, 4, this.f58650c);
            L9.c.b(parcel, a10);
        }

        public l(@RecentlyNonNull String str, @RecentlyNonNull String str2, int i10) {
            this.f58648a = str;
            this.f58649b = str2;
            this.f58650c = i10;
        }
    }

    public a() {
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i10) {
        int a10 = L9.c.a(parcel);
        L9.c.n(parcel, 2, this.f58575a);
        L9.c.u(parcel, 3, this.f58576b, false);
        L9.c.u(parcel, 4, this.f58577c, false);
        L9.c.n(parcel, 5, this.f58578d);
        L9.c.x(parcel, 6, this.f58579e, i10, false);
        L9.c.t(parcel, 7, this.f58580f, i10, false);
        L9.c.t(parcel, 8, this.f58581g, i10, false);
        L9.c.t(parcel, 9, this.f58582h, i10, false);
        L9.c.t(parcel, 10, this.f58583i, i10, false);
        L9.c.t(parcel, 11, this.f58584j, i10, false);
        L9.c.t(parcel, 12, this.f58585k, i10, false);
        L9.c.t(parcel, 13, this.f58586l, i10, false);
        L9.c.t(parcel, 14, this.f58587m, i10, false);
        L9.c.t(parcel, 15, this.f58588n, i10, false);
        L9.c.g(parcel, 16, this.f58589o, false);
        L9.c.c(parcel, 17, this.f58590p);
        L9.c.b(parcel, a10);
    }

    @RecentlyNonNull
    public Rect x() {
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = 0;
        int i13 = Integer.MAX_VALUE;
        int i14 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = this.f58579e;
            if (i12 >= pointArr.length) {
                return new Rect(i10, i13, i14, i11);
            }
            Point point = pointArr[i12];
            i10 = Math.min(i10, point.x);
            i14 = Math.max(i14, point.x);
            i13 = Math.min(i13, point.y);
            i11 = Math.max(i11, point.y);
            i12++;
        }
    }

    public a(int i10, @RecentlyNonNull String str, @RecentlyNonNull String str2, int i11, @RecentlyNonNull Point[] pointArr, @RecentlyNonNull f fVar, @RecentlyNonNull i iVar, @RecentlyNonNull j jVar, @RecentlyNonNull l lVar, @RecentlyNonNull k kVar, @RecentlyNonNull g gVar, @RecentlyNonNull c cVar, @RecentlyNonNull d dVar, @RecentlyNonNull e eVar, @RecentlyNonNull byte[] bArr, boolean z10) {
        this.f58575a = i10;
        this.f58576b = str;
        this.f58589o = bArr;
        this.f58577c = str2;
        this.f58578d = i11;
        this.f58579e = pointArr;
        this.f58590p = z10;
        this.f58580f = fVar;
        this.f58581g = iVar;
        this.f58582h = jVar;
        this.f58583i = lVar;
        this.f58584j = kVar;
        this.f58585k = gVar;
        this.f58586l = cVar;
        this.f58587m = dVar;
        this.f58588n = eVar;
    }
}
