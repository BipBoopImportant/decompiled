package androidx.recyclerview.widget;

import android.view.View;

class z {

    /* renamed from: a  reason: collision with root package name */
    final b f44194a;

    /* renamed from: b  reason: collision with root package name */
    a f44195b = new a();

    static class a {

        /* renamed from: a  reason: collision with root package name */
        int f44196a = 0;

        /* renamed from: b  reason: collision with root package name */
        int f44197b;

        /* renamed from: c  reason: collision with root package name */
        int f44198c;

        /* renamed from: d  reason: collision with root package name */
        int f44199d;

        /* renamed from: e  reason: collision with root package name */
        int f44200e;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a(int i10) {
            this.f44196a = i10 | this.f44196a;
        }

        /* access modifiers changed from: package-private */
        public boolean b() {
            int i10 = this.f44196a;
            if ((i10 & 7) != 0 && (i10 & c(this.f44199d, this.f44197b)) == 0) {
                return false;
            }
            int i11 = this.f44196a;
            if ((i11 & 112) != 0 && (i11 & (c(this.f44199d, this.f44198c) << 4)) == 0) {
                return false;
            }
            int i12 = this.f44196a;
            if ((i12 & 1792) != 0 && (i12 & (c(this.f44200e, this.f44197b) << 8)) == 0) {
                return false;
            }
            int i13 = this.f44196a;
            return (i13 & 28672) == 0 || (i13 & (c(this.f44200e, this.f44198c) << 12)) != 0;
        }

        /* access modifiers changed from: package-private */
        public int c(int i10, int i11) {
            if (i10 > i11) {
                return 1;
            }
            return i10 == i11 ? 2 : 4;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            this.f44196a = 0;
        }

        /* access modifiers changed from: package-private */
        public void e(int i10, int i11, int i12, int i13) {
            this.f44197b = i10;
            this.f44198c = i11;
            this.f44199d = i12;
            this.f44200e = i13;
        }
    }

    interface b {
        View a(int i10);

        int b(View view);

        int c();

        int d();

        int e(View view);
    }

    z(b bVar) {
        this.f44194a = bVar;
    }

    /* access modifiers changed from: package-private */
    public View a(int i10, int i11, int i12, int i13) {
        int c10 = this.f44194a.c();
        int d10 = this.f44194a.d();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View a10 = this.f44194a.a(i10);
            this.f44195b.e(c10, d10, this.f44194a.b(a10), this.f44194a.e(a10));
            if (i12 != 0) {
                this.f44195b.d();
                this.f44195b.a(i12);
                if (this.f44195b.b()) {
                    return a10;
                }
            }
            if (i13 != 0) {
                this.f44195b.d();
                this.f44195b.a(i13);
                if (this.f44195b.b()) {
                    view = a10;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* access modifiers changed from: package-private */
    public boolean b(View view, int i10) {
        this.f44195b.e(this.f44194a.c(), this.f44194a.d(), this.f44194a.b(view), this.f44194a.e(view));
        if (i10 == 0) {
            return false;
        }
        this.f44195b.d();
        this.f44195b.a(i10);
        return this.f44195b.b();
    }
}
