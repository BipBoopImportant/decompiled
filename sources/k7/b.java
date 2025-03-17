package k7;

import C7.h;
import C7.i;
import C7.j;
import L7.m;
import L7.n;
import L7.s;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;

public final class b implements ImageDecoder.OnHeaderDecodedListener {

    private final s f37740a = s.b();

    private final int f37741b;

    private final int f37742c;

    private final C7.b f37743d;

    private final m f37744e;

    private final boolean f37745f;

    private final j f37746g;

    class a implements ImageDecoder.OnPartialImageListener {
        a() {
        }

        public boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
            return false;
        }
    }

    public b(int i, int i2, i iVar) {
        this.f37741b = i;
        this.f37742c = i2;
        this.f37743d = (C7.b) iVar.c(n.f38405f);
        this.f37744e = (m) iVar.c(m.f38403h);
        h hVar = n.f38409j;
        this.f37745f = iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue();
        this.f37746g = (j) iVar.c(n.f38406g);
    }

    public void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        if (this.f37740a.f(this.f37741b, this.f37742c, this.f37745f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.f37743d == C7.b.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new a());
        Size a = imageInfo.getSize();
        int i = this.f37741b;
        if (i == Integer.MIN_VALUE) {
            i = a.getWidth();
        }
        int i2 = this.f37742c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = a.getHeight();
        }
        float b = this.f37744e.b(a.getWidth(), a.getHeight(), i, i2);
        int round = Math.round(((float) a.getWidth()) * b);
        int round2 = Math.round(((float) a.getHeight()) * b);
        if (Log.isLoggable("ImageDecoder", 2)) {
            Log.v("ImageDecoder", "Resizing from [" + a.getWidth() + "x" + a.getHeight() + "] to [" + round + "x" + round2 + "] scaleFactor: " + b);
        }
        imageDecoder.setTargetSize(round, round2);
        j jVar = this.f37746g;
        if (jVar == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            imageDecoder.setTargetColorSpace(ColorSpace.get((jVar != j.DISPLAY_P3 || imageInfo.getColorSpace() == null || !imageInfo.getColorSpace().isWideGamut()) ? ColorSpace.Named.SRGB : ColorSpace.Named.DISPLAY_P3));
        } else {
            imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
        }
    }
}
