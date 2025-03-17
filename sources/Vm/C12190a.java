package vm;

import android.graphics.Bitmap;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u000eJI\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lvm/a;", "", "", "value", "Lvm/a$a;", "format", "", "widthInPixel", "heightInPixel", "", "trimBoundaries", "margin", "useHighLevelErrorCorrection", "Landroid/graphics/Bitmap;", "a", "(Ljava/lang/String;Lvm/a$a;IIZIZ)Landroid/graphics/Bitmap;", "barcode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vm.a  reason: case insensitive filesystem */
public interface C12190a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lvm/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "CODE_39", "CODE_128", "DATA_MATRIX", "ITF", "QR_CODE", "barcode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vm.a$a  reason: collision with other inner class name */
    public enum C2496a {
        CODE_39,
        CODE_128,
        DATA_MATRIX,
        ITF,
        QR_CODE;

        static {
            C2496a[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    Bitmap a(String str, C2496a aVar, int i10, int i11, boolean z10, int i12, boolean z11);
}
