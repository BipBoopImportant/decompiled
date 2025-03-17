package Jy;

import By.C12674m;
import Oo.b;
import fI.C17220a;
import fI.C17221b;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00168\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LJy/j;", "LJy/o;", "LxB/a;", "LJy/j$a;", "selected", "<init>", "(LJy/j$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LJy/j$a;", "g", "()LJy/j$a;", "", "b", "J", "f", "()J", "stableId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j extends o implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final a f111415a;

    /* renamed from: b  reason: collision with root package name */
    private final long f111416b = ((long) Objects.hash(new Object[]{P.b(j.class)}));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"LJy/j$a;", "", "", "resId", "", "analyticsName", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "I", "m", "()I", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "AISLE", "RECENTLY_ADDED", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        AISLE(b.f84537W, "Aisle"),
        RECENTLY_ADDED(C12674m.f108300q0, "Recently_added");
        
        private final String analyticsName;
        private final int resId;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(int i10, String str) {
            this.resId = i10;
            this.analyticsName = str;
        }

        public static C17220a<a> j() {
            return $ENTRIES;
        }

        public final String b() {
            return this.analyticsName;
        }

        public final int m() {
            return this.resId;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(a aVar) {
        super((DefaultConstructorMarker) null);
        C17542s.j(aVar, "selected");
        this.f111415a = aVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f111415a == ((j) obj).f111415a;
    }

    public long f() {
        return this.f111416b;
    }

    public final a g() {
        return this.f111415a;
    }

    public int hashCode() {
        return this.f111415a.hashCode();
    }

    public String toString() {
        a aVar = this.f111415a;
        return "CartSortByModel(selected=" + aVar + ")";
    }
}
