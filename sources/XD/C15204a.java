package xD;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u0019"}, d2 = {"LxD/a;", "", "Lkotlin/Function0;", "LXH/N;", "onClick", "", "accessibilityString", "iconResource", "<init>", "(LnI/a;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LnI/a;", "c", "()LnI/a;", "b", "I", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xD.a  reason: case insensitive filesystem */
public final class C15204a {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<C16807N> f131847a;

    /* renamed from: b  reason: collision with root package name */
    private final int f131848b;

    /* renamed from: c  reason: collision with root package name */
    private final int f131849c;

    public C15204a(C17631a<C16807N> aVar, int i10, int i11) {
        C17542s.j(aVar, "onClick");
        this.f131847a = aVar;
        this.f131848b = i10;
        this.f131849c = i11;
    }

    public final int a() {
        return this.f131848b;
    }

    public final int b() {
        return this.f131849c;
    }

    public final C17631a<C16807N> c() {
        return this.f131847a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15204a)) {
            return false;
        }
        C15204a aVar = (C15204a) obj;
        return C17542s.e(this.f131847a, aVar.f131847a) && this.f131848b == aVar.f131848b && this.f131849c == aVar.f131849c;
    }

    public int hashCode() {
        return (((this.f131847a.hashCode() * 31) + Integer.hashCode(this.f131848b)) * 31) + Integer.hashCode(this.f131849c);
    }

    public String toString() {
        C17631a<C16807N> aVar = this.f131847a;
        int i10 = this.f131848b;
        int i11 = this.f131849c;
        return "CardTopBarAction(onClick=" + aVar + ", accessibilityString=" + i10 + ", iconResource=" + i11 + ")";
    }
}
