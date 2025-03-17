package com.google.ar.core;

import com.google.ar.core.dependencies.a;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;

final class M extends a {

    /* renamed from: a  reason: collision with root package name */
    private final long f67692a;

    /* renamed from: b  reason: collision with root package name */
    private final int f67693b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ArImage f67694c;

    public M(ArImage arImage, long j10, int i10) {
        this.f67694c = arImage;
        this.f67692a = j10;
        this.f67693b = i10;
    }

    public final ByteBuffer getBuffer() {
        ArImage arImage = this.f67694c;
        return arImage.e(arImage.f().nativeWrapperHandle, this.f67692a, this.f67693b).asReadOnlyBuffer();
    }

    public final int getPixelStride() {
        ArImage arImage = this.f67694c;
        int d10 = arImage.d(arImage.f().nativeWrapperHandle, this.f67692a, this.f67693b);
        if (d10 != -1) {
            return d10;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    public final int getRowStride() {
        ArImage arImage = this.f67694c;
        int c10 = arImage.c(arImage.f().nativeWrapperHandle, this.f67692a, this.f67693b);
        if (c10 != -1) {
            return c10;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }
}
