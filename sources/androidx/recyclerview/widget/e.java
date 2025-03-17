package androidx.recyclerview.widget;

import android.annotation.SuppressLint;

public class e implements r {

    /* renamed from: a  reason: collision with root package name */
    final r f43968a;

    /* renamed from: b  reason: collision with root package name */
    int f43969b = 0;

    /* renamed from: c  reason: collision with root package name */
    int f43970c = -1;

    /* renamed from: d  reason: collision with root package name */
    int f43971d = -1;

    /* renamed from: e  reason: collision with root package name */
    Object f43972e = null;

    public e(r rVar) {
        this.f43968a = rVar;
    }

    public void a(int i10, int i11) {
        int i12;
        if (this.f43969b == 1 && i10 >= (i12 = this.f43970c)) {
            int i13 = this.f43971d;
            if (i10 <= i12 + i13) {
                this.f43971d = i13 + i11;
                this.f43970c = Math.min(i10, i12);
                return;
            }
        }
        e();
        this.f43970c = i10;
        this.f43971d = i11;
        this.f43969b = 1;
    }

    public void b(int i10, int i11) {
        int i12;
        if (this.f43969b != 2 || (i12 = this.f43970c) < i10 || i12 > i10 + i11) {
            e();
            this.f43970c = i10;
            this.f43971d = i11;
            this.f43969b = 2;
            return;
        }
        this.f43971d += i11;
        this.f43970c = i10;
    }

    @SuppressLint({"UnknownNullness"})
    public void c(int i10, int i11, Object obj) {
        int i12;
        if (this.f43969b == 3) {
            int i13 = this.f43970c;
            int i14 = this.f43971d;
            if (i10 <= i13 + i14 && (i12 = i10 + i11) >= i13 && this.f43972e == obj) {
                this.f43970c = Math.min(i10, i13);
                this.f43971d = Math.max(i14 + i13, i12) - this.f43970c;
                return;
            }
        }
        e();
        this.f43970c = i10;
        this.f43971d = i11;
        this.f43972e = obj;
        this.f43969b = 3;
    }

    public void d(int i10, int i11) {
        e();
        this.f43968a.d(i10, i11);
    }

    public void e() {
        int i10 = this.f43969b;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f43968a.a(this.f43970c, this.f43971d);
            } else if (i10 == 2) {
                this.f43968a.b(this.f43970c, this.f43971d);
            } else if (i10 == 3) {
                this.f43968a.c(this.f43970c, this.f43971d, this.f43972e);
            }
            this.f43972e = null;
            this.f43969b = 0;
        }
    }
}
