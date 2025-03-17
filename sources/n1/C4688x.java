package N1;

import N1.C4669d;
import S1.C4820m;
import V1.f;
import YH.C16877v;
import c2.d;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000V\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\u001ax\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a4\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0013\u0010\u001c\u001a\u00020\u0010*\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"", "text", "LN1/Y;", "style", "Lc2/b;", "constraints", "Lc2/d;", "density", "LS1/m$b;", "fontFamilyResolver", "", "LN1/d$c;", "LN1/G;", "spanStyles", "LN1/A;", "placeholders", "", "maxLines", "", "ellipsis", "LN1/s;", "a", "(Ljava/lang/String;LN1/Y;JLc2/d;LS1/m$b;Ljava/util/List;Ljava/util/List;IZ)LN1/s;", "LN1/v;", "paragraphIntrinsics", "c", "(LN1/v;JIZ)LN1/s;", "", "d", "(F)I", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: N1.x  reason: case insensitive filesystem */
public final class C4688x {
    public static final C4683s a(String str, Y y10, long j10, d dVar, C4820m.b bVar, List<C4669d.c<G>> list, List<C4669d.c<A>> list2, int i10, boolean z10) {
        return f.b(str, y10, list, list2, i10, z10, j10, dVar, bVar);
    }

    public static /* synthetic */ C4683s b(String str, Y y10, long j10, d dVar, C4820m.b bVar, List list, List list2, int i10, boolean z10, int i11, Object obj) {
        int i12 = i11;
        return a(str, y10, j10, dVar, bVar, (i12 & 32) != 0 ? C16877v.n() : list, (i12 & 64) != 0 ? C16877v.n() : list2, (i12 & 128) != 0 ? Integer.MAX_VALUE : i10, (i12 & 256) != 0 ? false : z10);
    }

    public static final C4683s c(C4686v vVar, long j10, int i10, boolean z10) {
        return f.a(vVar, i10, z10, j10);
    }

    public static final int d(float f10) {
        return (int) ((float) Math.ceil((double) f10));
    }
}
