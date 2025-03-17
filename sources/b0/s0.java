package B0;

import N1.C4669d;
import T1.H;
import T1.Z;
import T1.b0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a%\u0010\n\u001a\u00020\t*\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u000f\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LT1/b0;", "LN1/d;", "text", "LT1/Z;", "c", "(LT1/b0;LN1/d;)LT1/Z;", "", "originalLength", "limit", "LXH/N;", "e", "(LT1/Z;II)V", "originalOffset", "offset", "h", "(III)V", "transformedOffset", "transformedLength", "g", "LT1/H;", "a", "LT1/H;", "d", "()LT1/H;", "ValidatingEmptyOffsetMappingIdentity", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final H f5133a = new r0(H.f13514a.a(), 0, 0);

    public static final Z c(b0 b0Var, C4669d dVar) {
        Z a10 = b0Var.a(dVar);
        f(a10, dVar.length(), 0, 2, (Object) null);
        return new Z(a10.b(), new r0(a10.a(), dVar.length(), a10.b().length()));
    }

    public static final H d() {
        return f5133a;
    }

    public static final void e(Z z10, int i10, int i11) {
        int length = z10.b().length();
        int min = Math.min(i10, i11);
        for (int i12 = 0; i12 < min; i12++) {
            g(z10.a().b(i12), length, i12);
        }
        g(z10.a().b(i10), length, i10);
        int min2 = Math.min(length, i11);
        for (int i13 = 0; i13 < min2; i13++) {
            h(z10.a().a(i13), i10, i13);
        }
        h(z10.a().a(length), i10, length);
    }

    public static /* synthetic */ void f(Z z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i11 = 100;
        }
        e(z10, i10, i11);
    }

    /* access modifiers changed from: private */
    public static final void g(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(("OffsetMapping.originalToTransformed returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of transformed text [0, " + i11 + ']').toString());
        }
    }

    /* access modifiers changed from: private */
    public static final void h(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i11) {
            throw new IllegalStateException(("OffsetMapping.transformedToOriginal returned invalid mapping: " + i12 + " -> " + i10 + " is not in range of original text [0, " + i11 + ']').toString());
        }
    }
}
