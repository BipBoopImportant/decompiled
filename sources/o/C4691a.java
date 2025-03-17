package O;

import O.C4709t;
import androidx.concurrent.futures.c;

/* renamed from: O.a  reason: case insensitive filesystem */
final class C4691a extends C4709t.b {

    /* renamed from: a  reason: collision with root package name */
    private final int f9596a;

    /* renamed from: b  reason: collision with root package name */
    private final int f9597b;

    /* renamed from: c  reason: collision with root package name */
    private final c.a<Void> f9598c;

    C4691a(int i10, int i11, c.a<Void> aVar) {
        this.f9596a = i10;
        this.f9597b = i11;
        if (aVar != null) {
            this.f9598c = aVar;
            return;
        }
        throw new NullPointerException("Null completer");
    }

    /* access modifiers changed from: package-private */
    public c.a<Void> a() {
        return this.f9598c;
    }

    /* access modifiers changed from: package-private */
    public int b() {
        return this.f9596a;
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.f9597b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4709t.b)) {
            return false;
        }
        C4709t.b bVar = (C4709t.b) obj;
        return this.f9596a == bVar.b() && this.f9597b == bVar.c() && this.f9598c.equals(bVar.a());
    }

    public int hashCode() {
        return ((((this.f9596a ^ 1000003) * 1000003) ^ this.f9597b) * 1000003) ^ this.f9598c.hashCode();
    }

    public String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f9596a + ", rotationDegrees=" + this.f9597b + ", completer=" + this.f9598c + "}";
    }
}
