package gi;

import KJ.C15987c;
import Th.c;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import xB.C15201a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lgi/k;", "LxB/a;", "LKJ/c;", "LTh/c;", "images", "", "imageIndex", "<init>", "(LKJ/c;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "h", "()LKJ/c;", "b", "I", "g", "", "c", "J", "f", "()J", "stableId", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.k  reason: case insensitive filesystem */
public final class C9756k implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<c> f73428a;

    /* renamed from: b  reason: collision with root package name */
    private final int f73429b;

    /* renamed from: c  reason: collision with root package name */
    private final long f73430c;

    public C9756k(C15987c<c> cVar, int i10) {
        C17542s.j(cVar, "images");
        this.f73428a = cVar;
        this.f73429b = i10;
        this.f73430c = (long) Arrays.hashCode(cVar.toArray(new c[0]));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9756k)) {
            return false;
        }
        C9756k kVar = (C9756k) obj;
        return C17542s.e(this.f73428a, kVar.f73428a) && this.f73429b == kVar.f73429b;
    }

    public long f() {
        return this.f73430c;
    }

    public final int g() {
        return this.f73429b;
    }

    public final C15987c<c> h() {
        return this.f73428a;
    }

    public int hashCode() {
        return (this.f73428a.hashCode() * 31) + Integer.hashCode(this.f73429b);
    }

    public String toString() {
        C15987c<c> cVar = this.f73428a;
        int i10 = this.f73429b;
        return "ImageViewModel(images=" + cVar + ", imageIndex=" + i10 + ")";
    }
}
