package E3;

import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import ob.C10102f;
import t3.C5950a;

/* renamed from: E3.o  reason: case insensitive filesystem */
public final class C6467o {

    /* renamed from: a  reason: collision with root package name */
    private final HashSet<MediaCodec> f34809a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f34810b;

    /* renamed from: c  reason: collision with root package name */
    private LoudnessCodecController f34811c;

    /* renamed from: E3.o$a */
    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return C6467o.this.f34810b.a(bundle);
        }
    }

    /* renamed from: E3.o$b */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34813a = new p();

        /* access modifiers changed from: private */
        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }

        Bundle a(Bundle bundle);
    }

    public C6467o() {
        this(b.f34813a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f34811c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C5950a.g(this.f34809a.add(mediaCodec));
        }
    }

    public void c() {
        this.f34809a.clear();
        LoudnessCodecController loudnessCodecController = this.f34811c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (this.f34809a.remove(mediaCodec) && (loudnessCodecController = this.f34811c) != null) {
            loudnessCodecController.removeMediaCodec(mediaCodec);
        }
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f34811c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f34811c = null;
        }
        LoudnessCodecController a10 = LoudnessCodecController.create(i10, C10102f.a(), new a());
        this.f34811c = a10;
        Iterator<MediaCodec> it = this.f34809a.iterator();
        while (it.hasNext()) {
            if (!a10.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public C6467o(b bVar) {
        this.f34809a = new HashSet<>();
        this.f34810b = bVar;
    }
}
