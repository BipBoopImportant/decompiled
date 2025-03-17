package fF;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.media.Image;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015R\u001c\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00170\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\"8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b&\u0010$¨\u0006("}, d2 = {"LfF/e;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/media/Image;", "image", "Landroid/graphics/Rect;", "cropRect", "", "outputBuffer", "LXH/N;", "a", "(Landroid/media/Image;Landroid/graphics/Rect;[B)V", "Landroid/graphics/Bitmap;", "output", "b", "(Landroid/media/Image;Landroid/graphics/Rect;Landroid/graphics/Bitmap;)V", "Landroid/renderscript/RenderScript;", "kotlin.jvm.PlatformType", "Landroid/renderscript/RenderScript;", "rs", "Landroid/renderscript/ScriptIntrinsicYuvToRGB;", "Landroid/renderscript/ScriptIntrinsicYuvToRGB;", "scriptYuvToRgb", "", "c", "I", "pixelCount", "Ljava/nio/ByteBuffer;", "d", "Ljava/nio/ByteBuffer;", "yuvBuffer", "Landroid/renderscript/Allocation;", "e", "Landroid/renderscript/Allocation;", "inputAllocation", "f", "outputAllocation", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: fF.e  reason: case insensitive filesystem */
public final class C14453e {

    /* renamed from: a  reason: collision with root package name */
    private final RenderScript f126925a;

    /* renamed from: b  reason: collision with root package name */
    private final ScriptIntrinsicYuvToRGB f126926b;

    /* renamed from: c  reason: collision with root package name */
    private int f126927c = -1;

    /* renamed from: d  reason: collision with root package name */
    private ByteBuffer f126928d;

    /* renamed from: e  reason: collision with root package name */
    private Allocation f126929e;

    /* renamed from: f  reason: collision with root package name */
    private Allocation f126930f;

    public C14453e(Context context) {
        C17542s.j(context, "context");
        RenderScript create = RenderScript.create(context);
        this.f126925a = create;
        this.f126926b = ScriptIntrinsicYuvToRGB.create(create, Element.U8_4(create));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(android.media.Image r20, android.graphics.Rect r21, byte[] r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            android.media.Image$Plane[] r3 = r20.getPlanes()
            kotlin.jvm.internal.C17542s.g(r3)
            int r4 = r3.length
            r6 = 0
            r7 = 0
        L_0x0010:
            if (r6 >= r4) goto L_0x00ae
            r8 = r3[r6]
            int r9 = r7 + 1
            r10 = 2
            r11 = 1
            if (r7 == 0) goto L_0x002d
            if (r7 == r11) goto L_0x0029
            if (r7 == r10) goto L_0x0025
            r16 = r3
            r17 = r4
        L_0x0022:
            r8 = 0
            goto L_0x00a1
        L_0x0025:
            int r12 = r0.f126927c
        L_0x0027:
            r13 = r10
            goto L_0x002f
        L_0x0029:
            int r12 = r0.f126927c
            int r12 = r12 + r11
            goto L_0x0027
        L_0x002d:
            r13 = r11
            r12 = 0
        L_0x002f:
            java.nio.ByteBuffer r14 = r8.getBuffer()
            int r15 = r8.getRowStride()
            int r5 = r8.getPixelStride()
            if (r7 != 0) goto L_0x0043
            r7 = r1
            r16 = r3
            r17 = r4
            goto L_0x0058
        L_0x0043:
            android.graphics.Rect r7 = new android.graphics.Rect
            int r11 = r1.left
            int r11 = r11 / r10
            int r0 = r1.top
            int r0 = r0 / r10
            r16 = r3
            int r3 = r1.right
            int r3 = r3 / r10
            r17 = r4
            int r4 = r1.bottom
            int r4 = r4 / r10
            r7.<init>(r11, r0, r3, r4)
        L_0x0058:
            int r0 = r7.width()
            int r3 = r7.height()
            int r4 = r8.getRowStride()
            byte[] r4 = new byte[r4]
            r8 = 1
            if (r5 != r8) goto L_0x006d
            if (r13 != r8) goto L_0x006d
            r10 = r0
            goto L_0x0071
        L_0x006d:
            int r10 = r0 + -1
            int r10 = r10 * r5
            int r10 = r10 + r8
        L_0x0071:
            r11 = 0
        L_0x0072:
            if (r11 >= r3) goto L_0x0022
            int r8 = r7.top
            int r8 = r8 + r11
            int r8 = r8 * r15
            int r1 = r7.left
            int r1 = r1 * r5
            int r8 = r8 + r1
            r14.position(r8)
            r1 = 1
            if (r5 != r1) goto L_0x008a
            if (r13 != r1) goto L_0x008a
            r14.get(r2, r12, r10)
            int r12 = r12 + r10
            r8 = 0
            goto L_0x009b
        L_0x008a:
            r8 = 0
            r14.get(r4, r8, r10)
            r1 = r8
        L_0x008f:
            if (r1 >= r0) goto L_0x009b
            int r18 = r1 * r5
            byte r18 = r4[r18]
            r2[r12] = r18
            int r12 = r12 + r13
            int r1 = r1 + 1
            goto L_0x008f
        L_0x009b:
            int r11 = r11 + 1
            r1 = r21
            r8 = 1
            goto L_0x0072
        L_0x00a1:
            int r6 = r6 + 1
            r0 = r19
            r1 = r21
            r7 = r9
            r3 = r16
            r4 = r17
            goto L_0x0010
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fF.C14453e.a(android.media.Image, android.graphics.Rect, byte[]):void");
    }

    public final synchronized void b(Image image, Rect rect, Bitmap bitmap) {
        try {
            C17542s.j(image, "image");
            C17542s.j(rect, "cropRect");
            C17542s.j(bitmap, "output");
            if (this.f126928d == null) {
                this.f126927c = (rect.right - rect.left) * (rect.bottom - rect.top);
                this.f126928d = ByteBuffer.allocateDirect((this.f126927c * ImageFormat.getBitsPerPixel(35)) / 8);
            }
            ByteBuffer byteBuffer = this.f126928d;
            Allocation allocation = null;
            if (byteBuffer == null) {
                C17542s.z("yuvBuffer");
                byteBuffer = null;
            }
            byteBuffer.rewind();
            ByteBuffer byteBuffer2 = this.f126928d;
            if (byteBuffer2 == null) {
                C17542s.z("yuvBuffer");
                byteBuffer2 = null;
            }
            byte[] array = byteBuffer2.array();
            C17542s.i(array, "array(...)");
            a(image, rect, array);
            if (this.f126929e == null) {
                RenderScript renderScript = this.f126925a;
                Type create = new Type.Builder(renderScript, Element.YUV(renderScript)).setYuvFormat(17).create();
                RenderScript renderScript2 = this.f126925a;
                Element element = create.getElement();
                ByteBuffer byteBuffer3 = this.f126928d;
                if (byteBuffer3 == null) {
                    C17542s.z("yuvBuffer");
                    byteBuffer3 = null;
                }
                this.f126929e = Allocation.createSized(renderScript2, element, byteBuffer3.array().length);
            }
            if (this.f126930f == null) {
                this.f126930f = Allocation.createFromBitmap(this.f126925a, bitmap);
            }
            Allocation allocation2 = this.f126929e;
            if (allocation2 == null) {
                C17542s.z("inputAllocation");
                allocation2 = null;
            }
            ByteBuffer byteBuffer4 = this.f126928d;
            if (byteBuffer4 == null) {
                C17542s.z("yuvBuffer");
                byteBuffer4 = null;
            }
            allocation2.copyFrom(byteBuffer4.array());
            ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB = this.f126926b;
            Allocation allocation3 = this.f126929e;
            if (allocation3 == null) {
                C17542s.z("inputAllocation");
                allocation3 = null;
            }
            scriptIntrinsicYuvToRGB.setInput(allocation3);
            ScriptIntrinsicYuvToRGB scriptIntrinsicYuvToRGB2 = this.f126926b;
            Allocation allocation4 = this.f126930f;
            if (allocation4 == null) {
                C17542s.z("outputAllocation");
                allocation4 = null;
            }
            scriptIntrinsicYuvToRGB2.forEach(allocation4);
            Allocation allocation5 = this.f126930f;
            if (allocation5 == null) {
                C17542s.z("outputAllocation");
                allocation5 = null;
            }
            allocation5.copyTo(bitmap);
            this.f126926b.destroy();
            Allocation allocation6 = this.f126930f;
            if (allocation6 == null) {
                C17542s.z("outputAllocation");
                allocation6 = null;
            }
            allocation6.destroy();
            Allocation allocation7 = this.f126929e;
            if (allocation7 == null) {
                C17542s.z("inputAllocation");
            } else {
                allocation = allocation7;
            }
            allocation.destroy();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }
}
