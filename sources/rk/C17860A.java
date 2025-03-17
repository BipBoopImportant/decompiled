package rK;

import kotlin.Metadata;
import o1.C5667g;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J:\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nø\u0001\u0001\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"LrK/A;", "", "", "zoomChange", "Lo1/g;", "panChange", "rotationChange", "centroid", "LXH/N;", "b", "(FJFJ)V", "zoomable_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.A  reason: case insensitive filesystem */
public interface C17860A {
    static /* synthetic */ void a(C17860A a10, float f10, long j10, float f11, long j11, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                f10 = 1.0f;
            }
            if ((i10 & 2) != 0) {
                j10 = C5667g.f26701b.c();
            }
            long j12 = j10;
            if ((i10 & 4) != 0) {
                f11 = 0.0f;
            }
            float f12 = f11;
            if ((i10 & 8) != 0) {
                j11 = C5667g.f26701b.c();
            }
            a10.b(f10, j12, f12, j11);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: transformBy-0DeBYlg");
    }

    void b(float f10, long j10, float f11, long j11);
}
