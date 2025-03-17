package vm;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vm.C12190a;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"Lvm/f;", "Lvm/a;", "", "lineWidth", "<init>", "(F)V", "", "widthInPixel", "heightInPixel", "Landroid/graphics/Bitmap;", "b", "(II)Landroid/graphics/Bitmap;", "", "value", "Lvm/a$a;", "format", "", "trimBoundaries", "margin", "useHighLevelErrorCorrection", "a", "(Ljava/lang/String;Lvm/a$a;IIZIZ)Landroid/graphics/Bitmap;", "F", "barcode_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: vm.f  reason: case insensitive filesystem */
public final class C12195f implements C12190a {

    /* renamed from: a  reason: collision with root package name */
    private final float f105216a;

    public C12195f(float f10) {
        this.f105216a = f10;
    }

    private final Bitmap b(int i10, int i11) {
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        C17542s.i(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        float f10 = this.f105216a / 2.0f;
        Paint paint = new Paint();
        paint.setColor(-16777216);
        paint.setStrokeWidth(this.f105216a);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawColor(-65281);
        float f11 = (float) i10;
        float f12 = (float) i11;
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        canvas2.drawRect(f10, f10, f11 - f10, f12 - f10, paint2);
        float f13 = f11 / 2.0f;
        canvas2.drawLine(f13, 0.0f, f13, f12, paint2);
        return createBitmap;
    }

    public Bitmap a(String str, C12190a.C2496a aVar, int i10, int i11, boolean z10, int i12, boolean z11) {
        C17542s.j(str, "value");
        C17542s.j(aVar, "format");
        return b(i10, i11);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12195f(float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 1.0f : f10);
    }
}
