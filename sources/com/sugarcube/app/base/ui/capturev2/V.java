package com.sugarcube.app.base.ui.capturev2;

import XH.C16807N;
import com.google.ar.core.Camera;
import com.google.ar.core.CameraIntrinsics;
import com.google.ar.core.Frame;
import com.google.ar.core.Pose;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.sugarcube.app.base.ui.capturev2.L;
import com.sugarcube.app.base.ui.capturev2.W;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b5\b\b\u0018\u0000 ]2\u00020\u0001:\u0001-BÇ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0013\u0012\b\b\u0002\u0010 \u001a\u00020\u0013\u0012\b\b\u0002\u0010!\u001a\u00020\u0013¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bC\u0010@\u001a\u0004\bD\u0010BR\u0017\u0010\u000f\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\bE\u0010@\u001a\u0004\bF\u0010BR\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bC\u0010IR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bJ\u0010<\u001a\u0004\bK\u0010>R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bA\u0010P\u001a\u0004\bL\u0010QR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\bF\u0010R\u001a\u0004\bS\u0010TR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bS\u0010U\u001a\u0004\b?\u0010VR\"\u0010\u001b\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bN\u0010M\u001a\u0004\bE\u0010O\"\u0004\bW\u0010XR\"\u0010\u001c\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010M\u001a\u0004\bJ\u0010O\"\u0004\bY\u0010XR\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010M\u001a\u0004\bG\u0010O\"\u0004\bZ\u0010XR\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bD\u0010M\u001a\u0004\b3\u0010O\"\u0004\b[\u0010XR\"\u0010\u001f\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\\\u0010M\u001a\u0004\b;\u0010O\"\u0004\b]\u0010XR\"\u0010 \u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010M\u001a\u0004\b/\u0010O\"\u0004\b\\\u0010XR\"\u0010!\u001a\u00020\u00138\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b^\u0010M\u001a\u0004\b7\u0010O\"\u0004\b^\u0010X¨\u0006_"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/V;", "", "", "frameCount", "Lcom/google/ar/core/TrackingState;", "trackingState", "Lcom/google/ar/core/TrackingFailureReason;", "trackingFailureReason", "Lcom/google/ar/core/RecordingStatus;", "recordingStatus", "", "pixelIntensity", "", "poseMatrix", "viewMatrix", "projectionMatrix", "Lcom/sugarcube/app/base/ui/capturev2/W;", "intrinsics", "imageScale", "", "timestamp", "Lcom/sugarcube/app/base/ui/capturev2/m0;", "pointCloud", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "sensorData", "Lcom/sugarcube/app/base/ui/capturev2/v;", "imageForEncoder", "onDrawBeginNano", "onDrawEndNano", "onDrawEnd2Nano", "handleBeginNano", "handleEndNano", "handleBeginEncodeNano", "handleEndEncodeNano", "<init>", "(ILcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;Lcom/google/ar/core/RecordingStatus;F[F[F[FLcom/sugarcube/app/base/ui/capturev2/W;FJLcom/sugarcube/app/base/ui/capturev2/m0;Lcom/sugarcube/app/base/ui/capturev2/R0;Lcom/sugarcube/app/base/ui/capturev2/v;JJJJJJJ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lcom/google/ar/core/TrackingState;", "q", "()Lcom/google/ar/core/TrackingState;", "c", "Lcom/google/ar/core/TrackingFailureReason;", "p", "()Lcom/google/ar/core/TrackingFailureReason;", "d", "Lcom/google/ar/core/RecordingStatus;", "getRecordingStatus", "()Lcom/google/ar/core/RecordingStatus;", "e", "F", "getPixelIntensity", "()F", "f", "[F", "l", "()[F", "g", "r", "h", "m", "i", "Lcom/sugarcube/app/base/ui/capturev2/W;", "()Lcom/sugarcube/app/base/ui/capturev2/W;", "j", "getImageScale", "k", "J", "o", "()J", "Lcom/sugarcube/app/base/ui/capturev2/m0;", "()Lcom/sugarcube/app/base/ui/capturev2/m0;", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "n", "()Lcom/sugarcube/app/base/ui/capturev2/R0;", "Lcom/sugarcube/app/base/ui/capturev2/v;", "()Lcom/sugarcube/app/base/ui/capturev2/v;", "w", "(J)V", "y", "x", "t", "s", "v", "u", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class V {

    /* renamed from: v  reason: collision with root package name */
    public static final a f123632v = new a((DefaultConstructorMarker) null);

    /* renamed from: w  reason: collision with root package name */
    public static final int f123633w = 8;

    /* renamed from: a  reason: collision with root package name */
    private final int f123634a;

    /* renamed from: b  reason: collision with root package name */
    private final TrackingState f123635b;

    /* renamed from: c  reason: collision with root package name */
    private final TrackingFailureReason f123636c;

    /* renamed from: d  reason: collision with root package name */
    private final RecordingStatus f123637d;

    /* renamed from: e  reason: collision with root package name */
    private final float f123638e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f123639f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f123640g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f123641h;

    /* renamed from: i  reason: collision with root package name */
    private final W f123642i;

    /* renamed from: j  reason: collision with root package name */
    private final float f123643j;

    /* renamed from: k  reason: collision with root package name */
    private final long f123644k;

    /* renamed from: l  reason: collision with root package name */
    private final C14221m0 f123645l;

    /* renamed from: m  reason: collision with root package name */
    private final R0 f123646m;

    /* renamed from: n  reason: collision with root package name */
    private final C14237v f123647n;

    /* renamed from: o  reason: collision with root package name */
    private long f123648o;

    /* renamed from: p  reason: collision with root package name */
    private long f123649p;

    /* renamed from: q  reason: collision with root package name */
    private long f123650q;

    /* renamed from: r  reason: collision with root package name */
    private long f123651r;

    /* renamed from: s  reason: collision with root package name */
    private long f123652s;

    /* renamed from: t  reason: collision with root package name */
    private long f123653t;

    /* renamed from: u  reason: collision with root package name */
    private long f123654u;

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/V$a;", "", "<init>", "()V", "Lcom/google/ar/core/Session;", "session", "Lcom/google/ar/core/Frame;", "frame", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "sensorData", "Lcom/google/ar/core/Pose;", "physicalPose", "", "scale", "", "count", "", "acquirePointCloud", "Lcom/sugarcube/app/base/ui/capturev2/v;", "imageForEncoder", "Lcom/sugarcube/app/base/ui/capturev2/V;", "a", "(Lcom/google/ar/core/Session;Lcom/google/ar/core/Frame;Lcom/sugarcube/app/base/ui/capturev2/R0;Lcom/google/ar/core/Pose;FIZLcom/sugarcube/app/base/ui/capturev2/v;)Lcom/sugarcube/app/base/ui/capturev2/V;", "Lcom/google/ar/core/Camera;", "camera", "", "c", "(Lcom/google/ar/core/Camera;)[F", "Lcom/sugarcube/app/base/ui/capturev2/m0;", "b", "(Lcom/google/ar/core/Frame;)Lcom/sugarcube/app/base/ui/capturev2/m0;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final V a(Session session, Frame frame, R0 r02, Pose pose, float f10, int i10, boolean z10, C14237v vVar) {
            Frame frame2 = frame;
            Pose pose2 = pose;
            C17542s.j(session, "session");
            C17542s.j(frame2, "frame");
            C17542s.j(pose2, "physicalPose");
            TrackingState trackingState = frame.getCamera().getTrackingState();
            C17542s.i(trackingState, "getTrackingState(...)");
            TrackingFailureReason trackingFailureReason = frame.getCamera().getTrackingFailureReason();
            C17542s.i(trackingFailureReason, "getTrackingFailureReason(...)");
            RecordingStatus recordingStatus = session.getRecordingStatus();
            C17542s.i(recordingStatus, "getRecordingStatus(...)");
            float pixelIntensity = frame.getLightEstimate().getPixelIntensity();
            float[] fArr = new float[16];
            pose2.toMatrix(fArr, 0);
            L.a aVar = L.f123507r;
            aVar.b(fArr);
            C16807N n10 = C16807N.f139792a;
            float[] fArr2 = new float[16];
            frame.getCamera().getViewMatrix(fArr2, 0);
            aVar.b(fArr2);
            a aVar2 = V.f123632v;
            Camera camera = frame.getCamera();
            C17542s.i(camera, "getCamera(...)");
            float[] c10 = aVar2.c(camera);
            W.a aVar3 = W.f123656f;
            CameraIntrinsics imageIntrinsics = frame.getCamera().getImageIntrinsics();
            C17542s.i(imageIntrinsics, "getImageIntrinsics(...)");
            return new V(i10, trackingState, trackingFailureReason, recordingStatus, pixelIntensity, fArr, fArr2, c10, aVar3.c(imageIntrinsics, f10), f10, frame.getTimestamp(), z10 ? aVar2.b(frame2) : null, r02, vVar, 0, 0, 0, 0, 0, 0, 0, 2080768, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            jI.C17416c.a(r7, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0046, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.sugarcube.app.base.ui.capturev2.C14221m0 b(com.google.ar.core.Frame r7) {
            /*
                r6 = this;
                java.lang.String r0 = "frame"
                kotlin.jvm.internal.C17542s.j(r7, r0)
                r0 = 0
                com.google.ar.core.PointCloud r7 = r7.acquirePointCloud()     // Catch:{ all -> 0x003e }
                java.nio.FloatBuffer r1 = r7.getPoints()     // Catch:{ all -> 0x0040 }
                int r2 = r1.remaining()     // Catch:{ all -> 0x0040 }
                float[] r2 = new float[r2]     // Catch:{ all -> 0x0040 }
                r1.mark()     // Catch:{ all -> 0x0040 }
                r1.get(r2)     // Catch:{ all -> 0x0040 }
                r1.reset()     // Catch:{ all -> 0x0040 }
                java.nio.IntBuffer r1 = r7.getIds()     // Catch:{ all -> 0x0040 }
                int r3 = r1.remaining()     // Catch:{ all -> 0x0040 }
                int[] r3 = new int[r3]     // Catch:{ all -> 0x0040 }
                r1.mark()     // Catch:{ all -> 0x0040 }
                r1.get(r3)     // Catch:{ all -> 0x0040 }
                r1.reset()     // Catch:{ all -> 0x0040 }
                com.sugarcube.app.base.ui.capturev2.m0 r1 = new com.sugarcube.app.base.ui.capturev2.m0     // Catch:{ all -> 0x0040 }
                long r4 = r7.getTimestamp()     // Catch:{ all -> 0x0040 }
                r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0040 }
                jI.C17416c.a(r7, r0)     // Catch:{ all -> 0x003e }
                r0 = r1
                goto L_0x004e
            L_0x003e:
                r7 = move-exception
                goto L_0x0047
            L_0x0040:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0042 }
            L_0x0042:
                r2 = move-exception
                jI.C17416c.a(r7, r1)     // Catch:{ all -> 0x003e }
                throw r2     // Catch:{ all -> 0x003e }
            L_0x0047:
                java.lang.String r1 = "Sugarcube"
                java.lang.String r2 = "point cloud error"
                android.util.Log.e(r1, r2, r7)
            L_0x004e:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.V.a.b(com.google.ar.core.Frame):com.sugarcube.app.base.ui.capturev2.m0");
        }

        public final float[] c(Camera camera) {
            C17542s.j(camera, "camera");
            float[] fArr = new float[16];
            camera.getProjectionMatrix(fArr, 0, 0.1f, 100.0f);
            L.f123507r.b(fArr);
            return fArr;
        }

        private a() {
        }
    }

    public V(int i10, TrackingState trackingState, TrackingFailureReason trackingFailureReason, RecordingStatus recordingStatus, float f10, float[] fArr, float[] fArr2, float[] fArr3, W w10, float f11, long j10, C14221m0 m0Var, R0 r02, C14237v vVar, long j11, long j12, long j13, long j14, long j15, long j16, long j17) {
        float[] fArr4 = fArr2;
        float[] fArr5 = fArr3;
        W w11 = w10;
        C17542s.j(trackingState, "trackingState");
        C17542s.j(trackingFailureReason, "trackingFailureReason");
        C17542s.j(recordingStatus, "recordingStatus");
        C17542s.j(fArr, "poseMatrix");
        C17542s.j(fArr4, "viewMatrix");
        C17542s.j(fArr5, "projectionMatrix");
        C17542s.j(w11, "intrinsics");
        this.f123634a = i10;
        this.f123635b = trackingState;
        this.f123636c = trackingFailureReason;
        this.f123637d = recordingStatus;
        this.f123638e = f10;
        this.f123639f = fArr;
        this.f123640g = fArr4;
        this.f123641h = fArr5;
        this.f123642i = w11;
        this.f123643j = f11;
        this.f123644k = j10;
        this.f123645l = m0Var;
        this.f123646m = r02;
        this.f123647n = vVar;
        this.f123648o = j11;
        this.f123649p = j12;
        this.f123650q = j13;
        this.f123651r = j14;
        this.f123652s = j15;
        this.f123653t = j16;
        this.f123654u = j17;
    }

    public final int a() {
        return this.f123634a;
    }

    public final long b() {
        return this.f123653t;
    }

    public final long c() {
        return this.f123651r;
    }

    public final long d() {
        return this.f123654u;
    }

    public final long e() {
        return this.f123652s;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v10 = (V) obj;
        return this.f123634a == v10.f123634a && this.f123635b == v10.f123635b && this.f123636c == v10.f123636c && this.f123637d == v10.f123637d && Float.compare(this.f123638e, v10.f123638e) == 0 && C17542s.e(this.f123639f, v10.f123639f) && C17542s.e(this.f123640g, v10.f123640g) && C17542s.e(this.f123641h, v10.f123641h) && C17542s.e(this.f123642i, v10.f123642i) && Float.compare(this.f123643j, v10.f123643j) == 0 && this.f123644k == v10.f123644k && C17542s.e(this.f123645l, v10.f123645l) && C17542s.e(this.f123646m, v10.f123646m) && C17542s.e(this.f123647n, v10.f123647n) && this.f123648o == v10.f123648o && this.f123649p == v10.f123649p && this.f123650q == v10.f123650q && this.f123651r == v10.f123651r && this.f123652s == v10.f123652s && this.f123653t == v10.f123653t && this.f123654u == v10.f123654u;
    }

    public final C14237v f() {
        return this.f123647n;
    }

    public final W g() {
        return this.f123642i;
    }

    public final long h() {
        return this.f123648o;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((Integer.hashCode(this.f123634a) * 31) + this.f123635b.hashCode()) * 31) + this.f123636c.hashCode()) * 31) + this.f123637d.hashCode()) * 31) + Float.hashCode(this.f123638e)) * 31) + Arrays.hashCode(this.f123639f)) * 31) + Arrays.hashCode(this.f123640g)) * 31) + Arrays.hashCode(this.f123641h)) * 31) + this.f123642i.hashCode()) * 31) + Float.hashCode(this.f123643j)) * 31) + Long.hashCode(this.f123644k)) * 31;
        C14221m0 m0Var = this.f123645l;
        int i10 = 0;
        int hashCode2 = (hashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31;
        R0 r02 = this.f123646m;
        int hashCode3 = (hashCode2 + (r02 == null ? 0 : r02.hashCode())) * 31;
        C14237v vVar = this.f123647n;
        if (vVar != null) {
            i10 = vVar.hashCode();
        }
        return ((((((((((((((hashCode3 + i10) * 31) + Long.hashCode(this.f123648o)) * 31) + Long.hashCode(this.f123649p)) * 31) + Long.hashCode(this.f123650q)) * 31) + Long.hashCode(this.f123651r)) * 31) + Long.hashCode(this.f123652s)) * 31) + Long.hashCode(this.f123653t)) * 31) + Long.hashCode(this.f123654u);
    }

    public final long i() {
        return this.f123650q;
    }

    public final long j() {
        return this.f123649p;
    }

    public final C14221m0 k() {
        return this.f123645l;
    }

    public final float[] l() {
        return this.f123639f;
    }

    public final float[] m() {
        return this.f123641h;
    }

    public final R0 n() {
        return this.f123646m;
    }

    public final long o() {
        return this.f123644k;
    }

    public final TrackingFailureReason p() {
        return this.f123636c;
    }

    public final TrackingState q() {
        return this.f123635b;
    }

    public final float[] r() {
        return this.f123640g;
    }

    public final void s(long j10) {
        this.f123653t = j10;
    }

    public final void t(long j10) {
        this.f123651r = j10;
    }

    public String toString() {
        int i10 = this.f123634a;
        TrackingState trackingState = this.f123635b;
        TrackingFailureReason trackingFailureReason = this.f123636c;
        RecordingStatus recordingStatus = this.f123637d;
        float f10 = this.f123638e;
        String arrays = Arrays.toString(this.f123639f);
        String arrays2 = Arrays.toString(this.f123640g);
        String arrays3 = Arrays.toString(this.f123641h);
        W w10 = this.f123642i;
        float f11 = this.f123643j;
        long j10 = this.f123644k;
        C14221m0 m0Var = this.f123645l;
        R0 r02 = this.f123646m;
        long j11 = this.f123648o;
        long j12 = this.f123649p;
        long j13 = this.f123650q;
        long j14 = this.f123651r;
        long j15 = this.f123652s;
        long j16 = this.f123653t;
        long j17 = this.f123654u;
        return "FrameData(frameCount=" + i10 + ", trackingState=" + trackingState + ", trackingFailureReason=" + trackingFailureReason + ", recordingStatus=" + recordingStatus + ", pixelIntensity=" + f10 + ", poseMatrix=" + arrays + ", viewMatrix=" + arrays2 + ", projectionMatrix=" + arrays3 + ", intrinsics=" + w10 + ", imageScale=" + f11 + ", timestamp=" + j10 + ", pointCloud=" + m0Var + ", sensorData=" + r02 + ", imageForEncoder=" + this.f123647n + ", onDrawBeginNano=" + j11 + ", onDrawEndNano=" + j12 + ", onDrawEnd2Nano=" + j13 + ", handleBeginNano=" + j14 + ", handleEndNano=" + j15 + ", handleBeginEncodeNano=" + j16 + ", handleEndEncodeNano=" + j17 + ")";
    }

    public final void u(long j10) {
        this.f123654u = j10;
    }

    public final void v(long j10) {
        this.f123652s = j10;
    }

    public final void w(long j10) {
        this.f123648o = j10;
    }

    public final void x(long j10) {
        this.f123650q = j10;
    }

    public final void y(long j10) {
        this.f123649p = j10;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ V(int r34, com.google.ar.core.TrackingState r35, com.google.ar.core.TrackingFailureReason r36, com.google.ar.core.RecordingStatus r37, float r38, float[] r39, float[] r40, float[] r41, com.sugarcube.app.base.ui.capturev2.W r42, float r43, long r44, com.sugarcube.app.base.ui.capturev2.C14221m0 r46, com.sugarcube.app.base.ui.capturev2.R0 r47, com.sugarcube.app.base.ui.capturev2.C14237v r48, long r49, long r51, long r53, long r55, long r57, long r59, long r61, int r63, kotlin.jvm.internal.DefaultConstructorMarker r64) {
        /*
            r33 = this;
            r0 = r63
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            r17 = r2
            goto L_0x000c
        L_0x000a:
            r17 = r47
        L_0x000c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0013
            r18 = r2
            goto L_0x0015
        L_0x0013:
            r18 = r48
        L_0x0015:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            r2 = 0
            if (r1 == 0) goto L_0x001e
            r19 = r2
            goto L_0x0020
        L_0x001e:
            r19 = r49
        L_0x0020:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0029
            r21 = r2
            goto L_0x002b
        L_0x0029:
            r21 = r51
        L_0x002b:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0033
            r23 = r2
            goto L_0x0035
        L_0x0033:
            r23 = r53
        L_0x0035:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x003d
            r25 = r2
            goto L_0x003f
        L_0x003d:
            r25 = r55
        L_0x003f:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0047
            r27 = r2
            goto L_0x0049
        L_0x0047:
            r27 = r57
        L_0x0049:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0051
            r29 = r2
            goto L_0x0053
        L_0x0051:
            r29 = r59
        L_0x0053:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x005b
            r31 = r2
            goto L_0x005d
        L_0x005b:
            r31 = r61
        L_0x005d:
            r3 = r33
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r10 = r40
            r11 = r41
            r12 = r42
            r13 = r43
            r14 = r44
            r16 = r46
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18, r19, r21, r23, r25, r27, r29, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.V.<init>(int, com.google.ar.core.TrackingState, com.google.ar.core.TrackingFailureReason, com.google.ar.core.RecordingStatus, float, float[], float[], float[], com.sugarcube.app.base.ui.capturev2.W, float, long, com.sugarcube.app.base.ui.capturev2.m0, com.sugarcube.app.base.ui.capturev2.R0, com.sugarcube.app.base.ui.capturev2.v, long, long, long, long, long, long, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
