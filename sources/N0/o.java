package N0;

import U0.C4889m;
import XH.C16814e;
import kotlin.Metadata;
import p1.C5747v0;
import p1.C5751x0;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0015\u0010\u0003\u001a\u00020\u0002H'ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H'¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0002\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"LN0/o;", "", "Lp1/v0;", "b", "(LU0/m;I)J", "LN0/g;", "a", "(LU0/m;I)LN0/g;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public interface o {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9249a = a.f9250a;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"LN0/o$a;", "", "<init>", "()V", "Lp1/v0;", "contentColor", "", "lightTheme", "b", "(JZ)J", "LN0/g;", "a", "(JZ)LN0/g;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f9250a = new a();

        private a() {
        }

        @C16814e
        public final g a(long j10, boolean z10) {
            return z10 ? ((double) C5751x0.j(j10)) > 0.5d ? p.f9252b : p.f9253c : p.f9254d;
        }

        @C16814e
        public final long b(long j10, boolean z10) {
            return (z10 || ((double) C5751x0.j(j10)) >= 0.5d) ? j10 : C5747v0.f27350b.j();
        }
    }

    @C16814e
    g a(C4889m mVar, int i10);

    @C16814e
    long b(C4889m mVar, int i10);
}
