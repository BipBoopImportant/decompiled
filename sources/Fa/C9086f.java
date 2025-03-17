package Fa;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: Fa.f  reason: case insensitive filesystem */
public class C9086f extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f60380a = new Matrix();

    public C9086f() {
        super(Matrix.class, "imageMatrixProperty");
    }

    /* renamed from: a */
    public Matrix get(ImageView imageView) {
        this.f60380a.set(imageView.getImageMatrix());
        return this.f60380a;
    }

    /* renamed from: b */
    public void set(ImageView imageView, Matrix matrix) {
        imageView.setImageMatrix(matrix);
    }
}
