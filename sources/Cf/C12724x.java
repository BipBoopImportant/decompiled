package CF;

import XH.t;
import androidx.lifecycle.K;
import kF.C14681B;
import kF.C14730z;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LCF/x;", "", "Landroidx/lifecycle/K;", "LkF/z;", "firstPlayerLD", "secondPlayerLD", "<init>", "(Landroidx/lifecycle/K;Landroidx/lifecycle/K;)V", "", "playerIndex", "b", "(I)Landroidx/lifecycle/K;", "LkF/B;", "playbackState", "LXH/N;", "a", "(ILkF/B;)V", "Landroidx/lifecycle/K;", "", "c", "Z", "getHasSecondVideoCompleted", "()Z", "setHasSecondVideoCompleted", "(Z)V", "hasSecondVideoCompleted", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: CF.x  reason: case insensitive filesystem */
public final class C12724x {

    /* renamed from: a  reason: collision with root package name */
    private final K<C14730z> f108450a;

    /* renamed from: b  reason: collision with root package name */
    private final K<C14730z> f108451b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f108452c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"LCF/x$a;", "", "<init>", "()V", "a", "b", "LCF/x$a$a;", "LCF/x$a$b;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: CF.x$a */
    public static abstract class a {

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LCF/x$a$a;", "LCF/x$a;", "", "playerIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: CF.x$a$a  reason: collision with other inner class name */
        public static final class C2594a extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f108453a;

            public C2594a(int i10) {
                super((DefaultConstructorMarker) null);
                this.f108453a = i10;
            }

            public final int a() {
                return this.f108453a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2594a) && this.f108453a == ((C2594a) obj).f108453a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f108453a);
            }

            public String toString() {
                int i10 = this.f108453a;
                return "PausePlayer(playerIndex=" + i10 + ")";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"LCF/x$a$b;", "LCF/x$a;", "", "playerIndex", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: CF.x$a$b */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            private final int f108454a;

            public b(int i10) {
                super((DefaultConstructorMarker) null);
                this.f108454a = i10;
            }

            public final int a() {
                return this.f108454a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f108454a == ((b) obj).f108454a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f108454a);
            }

            public String toString() {
                int i10 = this.f108454a;
                return "ResumePlayer(playerIndex=" + i10 + ")";
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C12724x(K<C14730z> k10, K<C14730z> k11) {
        C17542s.j(k10, "firstPlayerLD");
        C17542s.j(k11, "secondPlayerLD");
        this.f108450a = k10;
        this.f108451b = k11;
    }

    public final void a(int i10, C14681B b10) {
        C17542s.j(b10, "playbackState");
        Object obj = null;
        int i11 = 1;
        if (C17542s.e(b10, C14681B.a.f128658a)) {
            if (i10 != 0) {
                if (i10 == 1) {
                    this.f108452c = true;
                }
            } else if (!this.f108452c) {
                obj = new a.b(1);
            }
        } else if (C17542s.e(b10, C14681B.d.f128661a)) {
            if (i10 != 0) {
                i11 = 0;
            }
            obj = new a.C2594a(i11);
        } else if (!C17542s.e(b10, C14681B.b.f128659a)) {
            if (C17542s.e(b10, C14681B.c.f128660a)) {
                if (i10 != 0) {
                    i11 = 0;
                }
                obj = new a.C2594a(i11);
            } else {
                throw new t();
            }
        }
        if (obj == null) {
            return;
        }
        if (obj instanceof a.b) {
            b(((a.b) obj).a()).setValue(C14730z.c.f128880a);
        } else if (obj instanceof a.C2594a) {
            b(((a.C2594a) obj).a()).setValue(C14730z.b.f128879a);
        } else {
            throw new t();
        }
    }

    public final K<C14730z> b(int i10) {
        return i10 == 0 ? this.f108450a : this.f108451b;
    }
}
