package com.google.ar.core;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;

public class AugmentedImageDatabase {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public AugmentedImageDatabase(Session session2) {
        this(session2, nativeCreate(session2.nativeWrapperHandle));
    }

    static ByteBuffer convertBitmapToGrayscaleDirectBuffer(Bitmap bitmap) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter(colorMatrix);
        Paint paint = new Paint();
        paint.setColorFilter(colorMatrixColorFilter);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, 0.0f, 0.0f, paint);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bitmap.getWidth() * bitmap.getHeight());
        for (int i10 = 0; i10 < bitmap.getHeight(); i10++) {
            for (int i11 = 0; i11 < bitmap.getWidth(); i11++) {
                allocateDirect.put((bitmap.getWidth() * i10) + i11, (byte) Color.red(createBitmap.getPixel(i11, i10)));
            }
        }
        return allocateDirect;
    }

    public static AugmentedImageDatabase deserialize(Session session2, InputStream inputStream) {
        return new AugmentedImageDatabase(session2, nativeDeserialize(session2.nativeWrapperHandle, loadDirectByteBuffer(inputStream)));
    }

    private static ByteBuffer loadDirectByteBuffer(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(32, inputStream.available()));
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(byteArray.length);
                allocateDirect.put(byteArray);
                return allocateDirect;
            }
        }
    }

    private native int nativeAddImage(long j10, long j11, String str, ByteBuffer byteBuffer, int i10, int i11, int i12);

    private native int nativeAddImageWithPhysicalSize(long j10, long j11, String str, ByteBuffer byteBuffer, int i10, int i11, int i12, float f10);

    private static native long nativeCreate(long j10);

    private static native long nativeDeserialize(long j10, ByteBuffer byteBuffer);

    private native int nativeGetNumImages(long j10, long j11);

    private native void nativeReleaseDatabase(long j10, long j11);

    private native ByteBuffer nativeSerialize(long j10, long j11);

    public int addImage(String str, Bitmap bitmap) {
        Session session2 = this.session;
        return nativeAddImage(session2.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth());
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeHandle;
        if (j10 != 0) {
            nativeReleaseDatabase(this.nativeSymbolTableHandle, j10);
        }
        super.finalize();
    }

    public int getNumImages() {
        return nativeGetNumImages(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void serialize(OutputStream outputStream) {
        Channels.newChannel(outputStream).write(nativeSerialize(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    AugmentedImageDatabase(Session session2, long j10) {
        this.session = session2;
        this.nativeHandle = j10;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }

    public int addImage(String str, Bitmap bitmap, float f10) {
        Session session2 = this.session;
        return nativeAddImageWithPhysicalSize(session2.nativeWrapperHandle, this.nativeHandle, str, convertBitmapToGrayscaleDirectBuffer(bitmap), bitmap.getWidth(), bitmap.getHeight(), bitmap.getWidth(), f10);
    }
}
