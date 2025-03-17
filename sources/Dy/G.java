package Dy;

import By.C12674m;
import IC.C13023e;
import IC.C13026h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\u0006\nB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"LDy/G;", "", "LIC/e;", "text", "<init>", "(LIC/e;)V", "a", "LIC/e;", "()LIC/e;", "b", "c", "LDy/G$a;", "LDy/G$b;", "LDy/G$c;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class G {

    /* renamed from: b  reason: collision with root package name */
    public static final int f109136b = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f109137a;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0016"}, d2 = {"LDy/G$a;", "LDy/G;", "", "enabled", "loading", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Z", "b", "()Z", "d", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends G {

        /* renamed from: c  reason: collision with root package name */
        private final boolean f109138c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f109139d;

        public a() {
            this(false, false, 3, (DefaultConstructorMarker) null);
        }

        public final boolean b() {
            return this.f109138c;
        }

        public final boolean c() {
            return this.f109139d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f109138c == aVar.f109138c && this.f109139d == aVar.f109139d;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f109138c) * 31) + Boolean.hashCode(this.f109139d);
        }

        public String toString() {
            boolean z10 = this.f109138c;
            boolean z11 = this.f109139d;
            return "Default(enabled=" + z10 + ", loading=" + z11 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ a(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? false : z11);
        }

        public a(boolean z10, boolean z11) {
            super(C13026h.a(C12674m.f108246F), (DefaultConstructorMarker) null);
            this.f109138c = z10;
            this.f109139d = z11;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\n¨\u0006\u0013"}, d2 = {"LDy/G$b;", "LDy/G;", "", "icon", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "I", "b", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends G {

        /* renamed from: c  reason: collision with root package name */
        private final int f109140c;

        public b() {
            this(0, 1, (DefaultConstructorMarker) null);
        }

        public final int b() {
            return this.f109140c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f109140c == ((b) obj).f109140c;
        }

        public int hashCode() {
            return Integer.hashCode(this.f109140c);
        }

        public String toString() {
            int i10 = this.f109140c;
            return "EmptyCart(icon=" + i10 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? C18146a.f148610qa : i10);
        }

        public b(int i10) {
            super(C13026h.a(C12674m.f108264X), (DefaultConstructorMarker) null);
            this.f109140c = i10;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LDy/G$c;", "LDy/G;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends G {

        /* renamed from: c  reason: collision with root package name */
        public static final c f109141c = new c();

        private c() {
            super(C13026h.a(C12674m.f108271c), (DefaultConstructorMarker) null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return 553714431;
        }

        public String toString() {
            return "StoreNotSelected";
        }
    }

    public /* synthetic */ G(C13023e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar);
    }

    public final C13023e a() {
        return this.f109137a;
    }

    private G(C13023e eVar) {
        this.f109137a = eVar;
    }
}
