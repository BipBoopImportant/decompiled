package com.sugarcube.app.base.ui.capturev2;

import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.util.Log;
import android.view.Surface;
import com.sugarcube.core.logger.AnyKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 42\u00020\u0001:\u0001\fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b'\u0010(R\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b*\u0010(R\u0014\u0010,\u001a\u00020\u001e8\u0002XD¢\u0006\u0006\n\u0004\b\u0012\u0010 R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u00101\u001a\u00020.8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\u0014\u001a\u0004\b&\u0010\u0016¨\u00065"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/r;", "", "", "videoPath", "", "frameRateSkip", "bitRate", "<init>", "(Ljava/lang/String;II)V", "", "endOfStream", "LXH/N;", "a", "(Z)V", "h", "()V", "Lcom/sugarcube/app/base/ui/capturev2/v;", "bufferedImage", "g", "(Lcom/sugarcube/app/base/ui/capturev2/v;)I", "I", "b", "()I", "Landroid/media/MediaCodec;", "Landroid/media/MediaCodec;", "mediaCodec", "Landroid/media/MediaMuxer;", "c", "Landroid/media/MediaMuxer;", "muxer", "", "d", "J", "f", "()J", "setPresentationTimeUs", "(J)V", "presentationTimeUs", "e", "setFrameProcessCount", "(I)V", "frameProcessCount", "setFrameDrainedCount", "frameDrainedCount", "timeoutUs", "trackIndex", "Landroid/media/MediaCodec$BufferInfo;", "i", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "j", "frameRate", "k", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* renamed from: k  reason: collision with root package name */
    public static final a f124017k = new a((DefaultConstructorMarker) null);

    /* renamed from: l  reason: collision with root package name */
    public static final int f124018l = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f124019a;

    /* renamed from: b  reason: collision with root package name */
    private final MediaCodec f124020b;

    /* renamed from: c  reason: collision with root package name */
    private final MediaMuxer f124021c;

    /* renamed from: d  reason: collision with root package name */
    private long f124022d;

    /* renamed from: e  reason: collision with root package name */
    private int f124023e;

    /* renamed from: f  reason: collision with root package name */
    private int f124024f;

    /* renamed from: g  reason: collision with root package name */
    private final long f124025g = 10000;

    /* renamed from: h  reason: collision with root package name */
    private int f124026h = -1;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.BufferInfo f124027i = new MediaCodec.BufferInfo();

    /* renamed from: j  reason: collision with root package name */
    private final int f124028j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/r$a;", "", "<init>", "()V", "", "DEFAULT_BITRATE", "I", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public r(String str, int i10, int i11) {
        C17542s.j(str, "videoPath");
        this.f124019a = i11;
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType("video/avc");
        C17542s.i(createEncoderByType, "createEncoderByType(...)");
        this.f124020b = createEncoderByType;
        this.f124021c = new MediaMuxer(str, 0);
        int i12 = i10 > 0 ? 30 / i10 : 30;
        this.f124028j = i12;
        MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", 640, 480);
        C17542s.i(createVideoFormat, "createVideoFormat(...)");
        createVideoFormat.setInteger("color-format", 2135033992);
        createVideoFormat.setFloat("i-frame-interval", 0.0f);
        createVideoFormat.setInteger("frame-rate", i12);
        createVideoFormat.setInteger("capture-rate", i12);
        createVideoFormat.setInteger("bitrate", i11);
        createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
        createEncoderByType.start();
    }

    private final void a(boolean z10) {
        do {
            try {
                int dequeueOutputBuffer = this.f124020b.dequeueOutputBuffer(this.f124027i, this.f124025g);
                if (dequeueOutputBuffer >= 0) {
                    ByteBuffer outputBuffer = this.f124020b.getOutputBuffer(dequeueOutputBuffer);
                    if (outputBuffer != null) {
                        long round = Math.round((1000000.0d / ((double) this.f124028j)) * ((double) this.f124024f));
                        this.f124024f++;
                        MediaCodec.BufferInfo bufferInfo = this.f124027i;
                        bufferInfo.presentationTimeUs = round;
                        this.f124021c.writeSampleData(this.f124026h, outputBuffer, bufferInfo);
                        this.f124022d += (long) (1000000 / this.f124028j);
                    }
                    this.f124020b.releaseOutputBuffer(dequeueOutputBuffer, false);
                    if ((this.f124027i.flags & 4) != 0) {
                        return;
                    }
                } else if (dequeueOutputBuffer == -1) {
                    if (!z10) {
                        return;
                    }
                } else if (dequeueOutputBuffer == -2) {
                    this.f124026h = this.f124021c.addTrack(this.f124020b.getOutputFormat());
                    this.f124021c.start();
                    Log.d(AnyKt.SUGARCUBE_TAG, "drainEncoder(" + z10 + ") muxer start " + this.f124026h);
                    continue;
                } else {
                    continue;
                }
            } catch (Throwable th2) {
                Log.d(AnyKt.SUGARCUBE_TAG, "drain error", th2);
                th2.printStackTrace();
                return;
            }
        } while (!z10);
    }

    public final int b() {
        return this.f124019a;
    }

    public final int c() {
        return this.f124024f;
    }

    public final int d() {
        return this.f124023e;
    }

    public final int e() {
        return this.f124028j;
    }

    public final long f() {
        return this.f124022d;
    }

    public final int g(C14237v vVar) {
        Image inputImage;
        C17542s.j(vVar, "bufferedImage");
        int i10 = 0;
        a(false);
        try {
            int dequeueInputBuffer = this.f124020b.dequeueInputBuffer(-1);
            if (dequeueInputBuffer >= 0 && (inputImage = this.f124020b.getInputImage(dequeueInputBuffer)) != null) {
                i10 = vVar.b(inputImage);
                this.f124020b.queueInputBuffer(dequeueInputBuffer, 0, i10, vVar.a() / ((long) 1000), 0);
            }
            this.f124023e++;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return i10;
    }

    public final void h() {
        Log.d(AnyKt.SUGARCUBE_TAG, "avcEncoder stop");
        try {
            a(true);
        } catch (Throwable th2) {
            Log.d(AnyKt.SUGARCUBE_TAG, "drainEncoder error", th2);
            th2.printStackTrace();
        }
        try {
            this.f124020b.stop();
            this.f124020b.release();
            this.f124021c.stop();
            this.f124021c.release();
        } catch (Throwable th3) {
            Log.d(AnyKt.SUGARCUBE_TAG, "stop error", th3);
            th3.printStackTrace();
        }
        Log.d(AnyKt.SUGARCUBE_TAG, "avcEncoder stopped");
    }
}
