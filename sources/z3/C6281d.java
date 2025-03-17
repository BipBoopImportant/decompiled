package z3;

import B3.C6374x;
import B3.C6375y;
import B3.M;
import D3.c;
import D3.f;
import E3.C6462j;
import E3.D;
import E3.q;
import F3.b;
import F3.c;
import H3.h;
import H3.i;
import L3.C6634D;
import M3.C6650b;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.u0;
import java.util.ArrayList;

/* renamed from: z3.d  reason: case insensitive filesystem */
public class C6281d implements I {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32423a;

    /* renamed from: b  reason: collision with root package name */
    private final C6462j f32424b;

    /* renamed from: c  reason: collision with root package name */
    private int f32425c = 0;

    /* renamed from: d  reason: collision with root package name */
    private long f32426d = 5000;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32427e;

    /* renamed from: f  reason: collision with root package name */
    private D f32428f = D.f34744a;

    /* renamed from: g  reason: collision with root package name */
    private boolean f32429g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f32430h;

    public C6281d(Context context) {
        this.f32423a = context;
        this.f32424b = new C6462j(context);
    }

    public u0[] a(Handler handler, C6634D d10, C6374x xVar, h hVar, b bVar) {
        ArrayList arrayList = new ArrayList();
        i(this.f32423a, this.f32425c, this.f32428f, this.f32427e, handler, d10, this.f32426d, arrayList);
        C6375y c10 = c(this.f32423a, this.f32429g, this.f32430h);
        if (c10 != null) {
            b(this.f32423a, this.f32425c, this.f32428f, this.f32427e, c10, handler, xVar, arrayList);
        }
        ArrayList arrayList2 = arrayList;
        h(this.f32423a, hVar, handler.getLooper(), this.f32425c, arrayList2);
        f(this.f32423a, bVar, handler.getLooper(), this.f32425c, arrayList2);
        d(this.f32423a, this.f32425c, arrayList);
        e(arrayList);
        Handler handler2 = handler;
        g(this.f32423a, handler, this.f32425c, arrayList);
        return (u0[]) arrayList.toArray(new u0[0]);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0061, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        throw new java.lang.IllegalStateException("Error instantiating MIDI extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0097, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009b, code lost:
        r1 = r21;
        r3 = r22;
        r4 = r23;
        r6 = r10;
        r5 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        throw new java.lang.IllegalStateException("Error instantiating Opus extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00db, code lost:
        throw new java.lang.IllegalStateException("Error instantiating FLAC extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0100, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0102, code lost:
        r2 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010b, code lost:
        throw new java.lang.IllegalStateException("Error instantiating FFmpeg extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x005f A[ExcHandler: Exception (r0v30 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0097 A[ExcHandler: Exception (r0v24 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:20:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d0 A[ExcHandler: Exception (r0v18 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:38:0x00af] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0100 A[ExcHandler: Exception (r0v12 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:51:0x00df] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(android.content.Context r17, int r18, E3.D r19, boolean r20, B3.C6375y r21, android.os.Handler r22, B3.C6374x r23, java.util.ArrayList<androidx.media3.exoplayer.u0> r24) {
        /*
            r16 = this;
            r0 = r18
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            java.lang.Class<android.content.Context> r13 = android.content.Context.class
            java.lang.Class<B3.y> r14 = B3.C6375y.class
            java.lang.Class<B3.x> r15 = B3.C6374x.class
            java.lang.Class<android.os.Handler> r8 = android.os.Handler.class
            java.lang.String r7 = "DefaultRenderersFactory"
            B3.X r6 = new B3.X
            E3.q$b r3 = r16.j()
            r1 = r6
            r2 = r17
            r4 = r19
            r5 = r20
            r9 = r6
            r6 = r22
            r10 = r7
            r7 = r23
            r11 = r8
            r8 = r21
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r12.add(r9)
            if (r0 != 0) goto L_0x0033
            return
        L_0x0033:
            int r1 = r24.size()
            r2 = 2
            if (r0 != r2) goto L_0x003c
            int r1 = r1 + -1
        L_0x003c:
            java.lang.String r0 = "androidx.media3.decoder.midi.MidiRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x006b, Exception -> 0x005f }
            java.lang.Class[] r2 = new java.lang.Class[]{r13}     // Catch:{ ClassNotFoundException -> 0x006b, Exception -> 0x005f }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x006b, Exception -> 0x005f }
            java.lang.Object[] r2 = new java.lang.Object[]{r17}     // Catch:{ ClassNotFoundException -> 0x006b, Exception -> 0x005f }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x006b, Exception -> 0x005f }
            androidx.media3.exoplayer.u0 r0 = (androidx.media3.exoplayer.u0) r0     // Catch:{ ClassNotFoundException -> 0x006b, Exception -> 0x005f }
            int r2 = r1 + 1
            r12.add(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x005f }
            java.lang.String r0 = "Loaded MidiRenderer."
            t3.q.f(r10, r0)     // Catch:{ ClassNotFoundException -> 0x0061, Exception -> 0x005f }
            goto L_0x006c
        L_0x005f:
            r0 = move-exception
            goto L_0x0063
        L_0x0061:
            r1 = r2
            goto L_0x006b
        L_0x0063:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating MIDI extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x006b:
            r2 = r1
        L_0x006c:
            java.lang.String r0 = "androidx.media3.decoder.opus.LibopusAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x009b, Exception -> 0x0097 }
            java.lang.Class[] r1 = new java.lang.Class[]{r11, r15, r14}     // Catch:{ ClassNotFoundException -> 0x009b, Exception -> 0x0097 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch:{ ClassNotFoundException -> 0x009b, Exception -> 0x0097 }
            r1 = r21
            r3 = r22
            r4 = r23
            r6 = r10
            r5 = r11
            java.lang.Object[] r7 = new java.lang.Object[]{r3, r4, r1}     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x0097 }
            java.lang.Object r0 = r0.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x0097 }
            androidx.media3.exoplayer.u0 r0 = (androidx.media3.exoplayer.u0) r0     // Catch:{ ClassNotFoundException -> 0x00ac, Exception -> 0x0097 }
            int r7 = r2 + 1
            r12.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0099, Exception -> 0x0097 }
            java.lang.String r0 = "Loaded LibopusAudioRenderer."
            t3.q.f(r6, r0)     // Catch:{ ClassNotFoundException -> 0x0099, Exception -> 0x0097 }
            goto L_0x00ad
        L_0x0097:
            r0 = move-exception
            goto L_0x00a4
        L_0x0099:
            r2 = r7
            goto L_0x00ac
        L_0x009b:
            r1 = r21
            r3 = r22
            r4 = r23
            r6 = r10
            r5 = r11
            goto L_0x00ac
        L_0x00a4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating Opus extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00ac:
            r7 = r2
        L_0x00ad:
            java.lang.String r0 = "androidx.media3.decoder.flac.LibflacAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x00dc, Exception -> 0x00d0 }
            java.lang.Class[] r2 = new java.lang.Class[]{r5, r15, r14}     // Catch:{ ClassNotFoundException -> 0x00dc, Exception -> 0x00d0 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x00dc, Exception -> 0x00d0 }
            java.lang.Object[] r2 = new java.lang.Object[]{r3, r4, r1}     // Catch:{ ClassNotFoundException -> 0x00dc, Exception -> 0x00d0 }
            java.lang.Object r0 = r0.newInstance(r2)     // Catch:{ ClassNotFoundException -> 0x00dc, Exception -> 0x00d0 }
            androidx.media3.exoplayer.u0 r0 = (androidx.media3.exoplayer.u0) r0     // Catch:{ ClassNotFoundException -> 0x00dc, Exception -> 0x00d0 }
            int r2 = r7 + 1
            r12.add(r7, r0)     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00d0 }
            java.lang.String r0 = "Loaded LibflacAudioRenderer."
            t3.q.f(r6, r0)     // Catch:{ ClassNotFoundException -> 0x00d2, Exception -> 0x00d0 }
            goto L_0x00dd
        L_0x00d0:
            r0 = move-exception
            goto L_0x00d4
        L_0x00d2:
            r7 = r2
            goto L_0x00dc
        L_0x00d4:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating FLAC extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00dc:
            r2 = r7
        L_0x00dd:
            java.lang.String r0 = "androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x010c, Exception -> 0x0100 }
            java.lang.Class[] r7 = new java.lang.Class[]{r5, r15, r14}     // Catch:{ ClassNotFoundException -> 0x010c, Exception -> 0x0100 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r7)     // Catch:{ ClassNotFoundException -> 0x010c, Exception -> 0x0100 }
            java.lang.Object[] r7 = new java.lang.Object[]{r3, r4, r1}     // Catch:{ ClassNotFoundException -> 0x010c, Exception -> 0x0100 }
            java.lang.Object r0 = r0.newInstance(r7)     // Catch:{ ClassNotFoundException -> 0x010c, Exception -> 0x0100 }
            androidx.media3.exoplayer.u0 r0 = (androidx.media3.exoplayer.u0) r0     // Catch:{ ClassNotFoundException -> 0x010c, Exception -> 0x0100 }
            int r7 = r2 + 1
            r12.add(r2, r0)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x0100 }
            java.lang.String r0 = "Loaded FfmpegAudioRenderer."
            t3.q.f(r6, r0)     // Catch:{ ClassNotFoundException -> 0x0102, Exception -> 0x0100 }
            goto L_0x010d
        L_0x0100:
            r0 = move-exception
            goto L_0x0104
        L_0x0102:
            r2 = r7
            goto L_0x010c
        L_0x0104:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x010c:
            r7 = r2
        L_0x010d:
            java.lang.String r0 = "androidx.media3.decoder.iamf.LibiamfAudioRenderer"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x0139, Exception -> 0x0130 }
            java.lang.Class[] r2 = new java.lang.Class[]{r13, r5, r15, r14}     // Catch:{ ClassNotFoundException -> 0x0139, Exception -> 0x0130 }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch:{ ClassNotFoundException -> 0x0139, Exception -> 0x0130 }
            r2 = r17
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r3, r4, r1}     // Catch:{ ClassNotFoundException -> 0x0139, Exception -> 0x0130 }
            java.lang.Object r0 = r0.newInstance(r1)     // Catch:{ ClassNotFoundException -> 0x0139, Exception -> 0x0130 }
            androidx.media3.exoplayer.u0 r0 = (androidx.media3.exoplayer.u0) r0     // Catch:{ ClassNotFoundException -> 0x0139, Exception -> 0x0130 }
            r12.add(r7, r0)     // Catch:{ ClassNotFoundException -> 0x0139, Exception -> 0x0130 }
            java.lang.String r0 = "Loaded LibiamfAudioRenderer."
            t3.q.f(r6, r0)     // Catch:{ ClassNotFoundException -> 0x0139, Exception -> 0x0130 }
            goto L_0x0139
        L_0x0130:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating IAMF extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0139:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C6281d.b(android.content.Context, int, E3.D, boolean, B3.y, android.os.Handler, B3.x, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public C6375y c(Context context, boolean z10, boolean z11) {
        return new M.g(context).l(z10).k(z11).j();
    }

    /* access modifiers changed from: protected */
    public void d(Context context, int i10, ArrayList<u0> arrayList) {
        arrayList.add(new C6650b());
    }

    /* access modifiers changed from: protected */
    public void e(ArrayList<u0> arrayList) {
        arrayList.add(new f(k(), (ImageOutput) null));
    }

    /* access modifiers changed from: protected */
    public void f(Context context, b bVar, Looper looper, int i10, ArrayList<u0> arrayList) {
        arrayList.add(new c(bVar, looper));
    }

    /* access modifiers changed from: protected */
    public void g(Context context, Handler handler, int i10, ArrayList<u0> arrayList) {
    }

    /* access modifiers changed from: protected */
    public void h(Context context, h hVar, Looper looper, int i10, ArrayList<u0> arrayList) {
        arrayList.add(new i(hVar, looper));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0075, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0078, code lost:
        r2 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        r5 = r23;
        r6 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        throw new java.lang.IllegalStateException("Error instantiating VP9 extension", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        r3 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        throw new java.lang.IllegalStateException("Error instantiating AV1 extension", r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0071 A[ExcHandler: Exception (r0v9 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:7:0x003f] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7 A[ExcHandler: Exception (r0v8 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:31:0x008a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void i(android.content.Context r19, int r20, E3.D r21, boolean r22, android.os.Handler r23, L3.C6634D r24, long r25, java.util.ArrayList<androidx.media3.exoplayer.u0> r27) {
        /*
            r18 = this;
            r0 = r20
            r11 = r23
            r12 = r24
            r13 = r27
            java.lang.String r14 = "DefaultRenderersFactory"
            java.lang.Class<L3.D> r15 = L3.C6634D.class
            java.lang.Class<android.os.Handler> r10 = android.os.Handler.class
            L3.d r9 = new L3.d
            E3.q$b r3 = r18.j()
            r16 = 50
            r1 = r9
            r2 = r19
            r4 = r21
            r5 = r25
            r7 = r22
            r8 = r23
            r17 = r14
            r14 = r9
            r9 = r24
            r11 = r10
            r10 = r16
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10)
            r13.add(r14)
            if (r0 != 0) goto L_0x0032
            return
        L_0x0032:
            int r1 = r27.size()
            r2 = 2
            if (r0 != r2) goto L_0x003b
            int r1 = r1 + -1
        L_0x003b:
            r0 = 50
            java.lang.String r2 = "androidx.media3.decoder.vp9.LibvpxVideoRenderer"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r11, r15, r4}     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.reflect.Constructor r2 = r2.getConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Long r3 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x007b, Exception -> 0x0071 }
            r5 = r23
            r6 = r11
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r5, r12, r4}     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x0071 }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x0071 }
            androidx.media3.exoplayer.u0 r2 = (androidx.media3.exoplayer.u0) r2     // Catch:{ ClassNotFoundException -> 0x0078, Exception -> 0x0071 }
            int r3 = r1 + 1
            r13.add(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0075, Exception -> 0x0071 }
            java.lang.String r1 = "Loaded LibvpxVideoRenderer."
            r2 = r17
            t3.q.f(r2, r1)     // Catch:{ ClassNotFoundException -> 0x0073, Exception -> 0x0071 }
            goto L_0x0088
        L_0x0071:
            r0 = move-exception
            goto L_0x007f
        L_0x0073:
            r1 = r3
            goto L_0x0087
        L_0x0075:
            r2 = r17
            goto L_0x0073
        L_0x0078:
            r2 = r17
            goto L_0x0087
        L_0x007b:
            r5 = r23
            r6 = r11
            goto L_0x0078
        L_0x007f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating VP9 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x0087:
            r3 = r1
        L_0x0088:
            java.lang.String r1 = "androidx.media3.decoder.av1.Libgav1VideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Class[] r4 = new java.lang.Class[]{r4, r6, r15, r7}     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Long r4 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r12, r7}     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            java.lang.Object r1 = r1.newInstance(r4)     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            androidx.media3.exoplayer.u0 r1 = (androidx.media3.exoplayer.u0) r1     // Catch:{ ClassNotFoundException -> 0x00c3, Exception -> 0x00b7 }
            int r4 = r3 + 1
            r13.add(r3, r1)     // Catch:{ ClassNotFoundException -> 0x00b9, Exception -> 0x00b7 }
            java.lang.String r1 = "Loaded Libgav1VideoRenderer."
            t3.q.f(r2, r1)     // Catch:{ ClassNotFoundException -> 0x00b9, Exception -> 0x00b7 }
            goto L_0x00c4
        L_0x00b7:
            r0 = move-exception
            goto L_0x00bb
        L_0x00b9:
            r3 = r4
            goto L_0x00c3
        L_0x00bb:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating AV1 extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00c3:
            r4 = r3
        L_0x00c4:
            java.lang.String r1 = "androidx.media3.decoder.ffmpeg.ExperimentalFfmpegVideoRenderer"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Class[] r3 = new java.lang.Class[]{r3, r6, r15, r7}     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Long r3 = java.lang.Long.valueOf(r25)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r5, r12, r0}     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.Object r0 = r1.newInstance(r0)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            androidx.media3.exoplayer.u0 r0 = (androidx.media3.exoplayer.u0) r0     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            r13.add(r4, r0)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            java.lang.String r0 = "Loaded FfmpegVideoRenderer."
            t3.q.f(r2, r0)     // Catch:{ ClassNotFoundException -> 0x00fa, Exception -> 0x00f1 }
            goto L_0x00fa
        L_0x00f1:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Error instantiating FFmpeg extension"
            r1.<init>(r2, r0)
            throw r1
        L_0x00fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C6281d.i(android.content.Context, int, E3.D, boolean, android.os.Handler, L3.D, long, java.util.ArrayList):void");
    }

    /* access modifiers changed from: protected */
    public q.b j() {
        return this.f32424b;
    }

    /* access modifiers changed from: protected */
    public c.a k() {
        return c.a.f33816a;
    }
}
