package androidx.work;

import android.app.Notification;

/* renamed from: androidx.work.l  reason: case insensitive filesystem */
public final class C7043l {

    /* renamed from: a  reason: collision with root package name */
    private final int f45304a;

    /* renamed from: b  reason: collision with root package name */
    private final int f45305b;

    /* renamed from: c  reason: collision with root package name */
    private final Notification f45306c;

    public C7043l(int i10, Notification notification, int i11) {
        this.f45304a = i10;
        this.f45306c = notification;
        this.f45305b = i11;
    }

    public int a() {
        return this.f45305b;
    }

    public Notification b() {
        return this.f45306c;
    }

    public int c() {
        return this.f45304a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7043l.class != obj.getClass()) {
            return false;
        }
        C7043l lVar = (C7043l) obj;
        if (this.f45304a == lVar.f45304a && this.f45305b == lVar.f45305b) {
            return this.f45306c.equals(lVar.f45306c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f45304a * 31) + this.f45305b) * 31) + this.f45306c.hashCode();
    }

    public String toString() {
        return "ForegroundInfo{" + "mNotificationId=" + this.f45304a + ", mForegroundServiceType=" + this.f45305b + ", mNotification=" + this.f45306c + '}';
    }
}
