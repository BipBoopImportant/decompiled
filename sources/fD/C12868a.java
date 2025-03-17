package FD;

import HJ.C15854t;
import N1.C4669d;
import T1.H;
import T1.Z;
import T1.b0;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\tB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LFD/a;", "LT1/b0;", "", "groupSize", "<init>", "(I)V", "LN1/d;", "text", "LT1/Z;", "a", "(LN1/d;)LT1/Z;", "b", "I", "LFD/a$a;", "c", "LFD/a$a;", "offsetMapping", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: FD.a  reason: case insensitive filesystem */
public final class C12868a implements b0 {

    /* renamed from: b  reason: collision with root package name */
    private final int f109753b;

    /* renamed from: c  reason: collision with root package name */
    private final C2623a f109754c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"LFD/a$a;", "LT1/H;", "", "groupSize", "<init>", "(I)V", "offset", "b", "(I)I", "a", "I", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: FD.a$a  reason: collision with other inner class name */
    public static final class C2623a implements H {

        /* renamed from: b  reason: collision with root package name */
        private final int f109755b;

        public C2623a(int i10) {
            this.f109755b = i10;
        }

        public int a(int i10) {
            int i11 = this.f109755b;
            return i10 - (i10 <= i11 ? 0 : i10 / (i11 + 1));
        }

        public int b(int i10) {
            int i11 = this.f109755b;
            return i10 + (i10 <= i11 ? 0 : (((i10 - 1) - i11) / i11) + 1);
        }
    }

    public C12868a(int i10) {
        this.f109753b = i10;
        this.f109754c = new C2623a(i10);
    }

    public Z a(C4669d dVar) {
        C17542s.j(dVar, "text");
        return new Z(new C4669d(C16877v.G0(C15854t.D1(dVar.j(), this.f109753b), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null), (List) null, (List) null, 6, (DefaultConstructorMarker) null), this.f109754c);
    }
}
