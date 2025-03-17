package wm;

import android.graphics.Bitmap;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import vm.C12190a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lwm/a;", "Lvm/a;", "<init>", "()V", "", "value", "Lvm/a$a;", "format", "", "widthInPixel", "heightInPixel", "", "trimBoundaries", "margin", "useHighLevelErrorCorrection", "Landroid/graphics/Bitmap;", "a", "(Ljava/lang/String;Lvm/a$a;IIZIZ)Landroid/graphics/Bitmap;", "barcode-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wm.a  reason: case insensitive filesystem */
public final class C12280a implements C12190a {
    public Bitmap a(String str, C12190a.C2496a aVar, int i10, int i11, boolean z10, int i12, boolean z11) {
        C17542s.j(str, "value");
        C12190a.C2496a aVar2 = aVar;
        C17542s.j(aVar, "format");
        return C12285f.f105878a.a(str, C12281b.b(aVar), i10, i11, z10, i12, z11);
    }
}
