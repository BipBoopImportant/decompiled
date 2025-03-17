package org.maplibre.android.maps;

import androidx.annotation.Keep;

@Keep
public class Image {
    private final byte[] buffer;
    private final float[] content;
    private final int height;
    private final String name;
    private final float pixelRatio;
    private final boolean sdf;
    private final float[] stretchX;
    private final float[] stretchY;
    private final int width;

    public Image(byte[] bArr, float f10, String str, int i10, int i11, boolean z10) {
        this(bArr, f10, str, i10, i11, z10, (float[]) null, (float[]) null, (float[]) null);
    }

    public Image(byte[] bArr, float f10, String str, int i10, int i11, boolean z10, float[] fArr, float[] fArr2, float[] fArr3) {
        this.buffer = bArr;
        this.pixelRatio = f10;
        this.name = str;
        this.width = i10;
        this.height = i11;
        this.sdf = z10;
        this.content = fArr3;
        this.stretchX = fArr;
        this.stretchY = fArr2;
    }
}
