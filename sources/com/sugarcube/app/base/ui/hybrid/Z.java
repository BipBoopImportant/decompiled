package com.sugarcube.app.base.ui.hybrid;

import XH.C16807N;
import YE.C13868b;
import YE.e;
import YH.C16870n;
import android.opengl.Matrix;
import android.util.Log;
import com.google.ar.core.Anchor;
import com.google.ar.core.Frame;
import com.google.ar.core.Plane;
import com.google.ar.core.Pose;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.squareup.moshi.t;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.core.logger.AnyKt;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0015\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010!J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010#J\u0017\u0010&\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b&\u0010'J)\u0010*\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(2\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0012¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u000f2\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102JM\u0010<\u001a\u00020\u000f2\b\u00103\u001a\u0004\u0018\u00010\u00122\u0006\u00104\u001a\u00020\u00122\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\b\b\u0002\u00109\u001a\u00020\r2\b\b\u0002\u0010:\u001a\u00020\u00162\b\b\u0002\u0010;\u001a\u00020\u0012¢\u0006\u0004\b<\u0010=J1\u0010>\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(2\u0006\u00108\u001a\u0002072\b\b\u0002\u0010;\u001a\u00020\u0012¢\u0006\u0004\b>\u0010?J\u0015\u0010B\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020@¢\u0006\u0004\bB\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010D\u001a\u0004\bE\u0010FR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b<\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010!R\u0014\u0010Q\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010PR\u0014\u0010R\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010PR\u0016\u0010S\u001a\u00020O8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010PR\u0014\u0010U\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010PR\u0014\u0010W\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010PR\u0014\u0010Y\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010PR\u0014\u0010[\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bZ\u0010PR\u0014\u0010]\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\b\\\u0010PR\u0014\u0010\u001b\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\b^\u0010PR\u0014\u00100\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\b_\u0010PR\u0014\u0010a\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\b`\u0010PR\u0014\u0010c\u001a\u00020O8\u0002X\u0004¢\u0006\u0006\n\u0004\bb\u0010PR\u0014\u0010f\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010h\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bg\u0010eR\u0014\u0010j\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\bi\u0010eR\u0016\u0010m\u001a\u00020/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010q\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0018\u0010s\u001a\u0004\u0018\u00010n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010pR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010uR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010uR\u0016\u0010y\u001a\u0002058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010xR\u0016\u0010z\u001a\u0002058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010xR\"\u0010\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bB\u0010 \u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R$\u0010\u0001\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0013\n\u0004\b\u0018\u0010 \u001a\u0004\bV\u0010|\"\u0005\b\u0001\u0010~R\u001a\u0010\u0001\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010e\u001a\u0005\b_\u0010\u0001R\u0019\u0010\u0001\u001a\u00020\u00128\u0006¢\u0006\r\n\u0004\b1\u0010e\u001a\u0005\b\\\u0010\u0001R(\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000e\n\u0005\b\u001e\u0010\u0001\u001a\u0005\b`\u0010\u0001R&\u0010\u0001\u001a\u00020\u00162\u0007\u0010\u0001\u001a\u00020\u00168\u0006@BX\u000e¢\u0006\f\n\u0004\b \u0010 \u001a\u0004\b^\u0010|R\u001b\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u000e\n\u0005\b$\u0010\u0001\u001a\u0005\bk\u0010\u0001R)\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bi\u0010\u0001R)\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bg\u0010\u0001R\u001b\u0010\u0001\u001a\u00030\u00018\u0006¢\u0006\u000e\n\u0005\bx\u0010\u0001\u001a\u0005\br\u0010\u0001R)\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bo\u0010\u0001R)\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bZ\u0010\u0001R)\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bX\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010 R\u0018\u0010\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010 R)\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bd\u0010\u0001R(\u0010\u000e\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bT\u0010\u0001R\u0013\u0010 \u0001\u001a\u00020\u00128F¢\u0006\u0007\u001a\u0005\bb\u0010\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/Z;", "", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebase", "Lcom/squareup/moshi/t;", "moshi", "", "useAnchors", "useFloorAnchors", "<init>", "(Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;Lcom/squareup/moshi/t;ZZ)V", "Lcom/google/ar/core/Session;", "session", "", "count", "LXH/N;", "g", "(Lcom/google/ar/core/Session;I)V", "", "matrix", "focalLength", "principalPoint", "", "scale", "B", "([F[F[FF)V", "Lcom/google/ar/core/TrackingState;", "trackingState", "Lcom/google/ar/core/TrackingFailureReason;", "trackingFailureReason", "E", "(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)I", "F", "()Z", "y", "()V", "G", "z", "e", "(Lcom/google/ar/core/Session;)I", "Lcom/google/ar/core/Frame;", "frame", "x", "(Lcom/google/ar/core/Session;Lcom/google/ar/core/Frame;F)I", "angles", "f", "([F)V", "", "state", "D", "(Ljava/lang/String;)V", "poseMatrix", "intrinsics", "", "timestamp", "Lcom/sugarcube/app/base/ui/hybrid/K0;", "sensorData", "tracking", "intensity", "angleChangeIn", "b", "([F[FJLcom/sugarcube/app/base/ui/hybrid/K0;IF[F)V", "a", "(Lcom/google/ar/core/Session;Lcom/google/ar/core/Frame;Lcom/sugarcube/app/base/ui/hybrid/K0;[F)I", "Ljava/io/File;", "file", "A", "(Ljava/io/File;)V", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "getFirebase", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "Lcom/squareup/moshi/t;", "getMoshi", "()Lcom/squareup/moshi/t;", "c", "Z", "w", "d", "getUseFloorAnchors", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuffer;", "poses", "viewMatrix", "projectionMatrix", "h", "intrinsicsMatrix", "i", "timestampsColor", "j", "timestampsDepth", "k", "pointCloud", "l", "pointId", "m", "n", "o", "gravity", "p", "rotations", "q", "[F", "out16", "r", "transform16", "s", "out9", "t", "Ljava/lang/String;", "nextState", "Lcom/google/ar/core/Pose;", "u", "Lcom/google/ar/core/Pose;", "anchorPose", "v", "lastPose", "Lcom/google/ar/core/Anchor;", "Lcom/google/ar/core/Anchor;", "anchor", "floorAnchor", "J", "poseAnchorStartTimeMillis", "floorAnchorStartTimeMillis", "getPoseAnchorTimeToDetection", "()F", "setPoseAnchorTimeToDetection", "(F)V", "poseAnchorTimeToDetection", "setFloorAnchorTimeToDetection", "floorAnchorTimeToDetection", "C", "()[F", "latestPose", "latestIntrinsics", "value", "I", "()I", "latestTracking", "latestPixelIntensity", "", "[I", "()[I", "panoTrackingStats", "H", "panoPointsTotal", "panoFramesWithNoPoints", "trackingStats", "K", "pointsTotal", "L", "framesWithNoPoints", "M", "framesWithLowIntensity", "N", "lowIntensityMin", "O", "lowIntensityMax", "P", "panoCount", "Q", "lowIntensityRange", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Z {

    /* renamed from: A  reason: collision with root package name */
    private float f124937A;

    /* renamed from: B  reason: collision with root package name */
    private float f124938B;

    /* renamed from: C  reason: collision with root package name */
    private final float[] f124939C = new float[16];

    /* renamed from: D  reason: collision with root package name */
    private final float[] f124940D = new float[9];

    /* renamed from: E  reason: collision with root package name */
    private int f124941E;

    /* renamed from: F  reason: collision with root package name */
    private float f124942F;

    /* renamed from: G  reason: collision with root package name */
    private final int[] f124943G;

    /* renamed from: H  reason: collision with root package name */
    private int f124944H;

    /* renamed from: I  reason: collision with root package name */
    private int f124945I;

    /* renamed from: J  reason: collision with root package name */
    private final int[] f124946J;

    /* renamed from: K  reason: collision with root package name */
    private int f124947K;

    /* renamed from: L  reason: collision with root package name */
    private int f124948L;

    /* renamed from: M  reason: collision with root package name */
    private int f124949M;

    /* renamed from: N  reason: collision with root package name */
    private float f124950N;

    /* renamed from: O  reason: collision with root package name */
    private float f124951O;

    /* renamed from: P  reason: collision with root package name */
    private int f124952P;

    /* renamed from: Q  reason: collision with root package name */
    private int f124953Q;

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInteractions f124954a;

    /* renamed from: b  reason: collision with root package name */
    private final t f124955b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f124956c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f124957d;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuffer f124958e = new StringBuffer();

    /* renamed from: f  reason: collision with root package name */
    private final StringBuffer f124959f = new StringBuffer();

    /* renamed from: g  reason: collision with root package name */
    private StringBuffer f124960g = new StringBuffer();

    /* renamed from: h  reason: collision with root package name */
    private final StringBuffer f124961h = new StringBuffer();

    /* renamed from: i  reason: collision with root package name */
    private final StringBuffer f124962i = new StringBuffer();

    /* renamed from: j  reason: collision with root package name */
    private final StringBuffer f124963j = new StringBuffer();

    /* renamed from: k  reason: collision with root package name */
    private final StringBuffer f124964k = new StringBuffer();

    /* renamed from: l  reason: collision with root package name */
    private final StringBuffer f124965l = new StringBuffer();

    /* renamed from: m  reason: collision with root package name */
    private final StringBuffer f124966m = new StringBuffer();

    /* renamed from: n  reason: collision with root package name */
    private final StringBuffer f124967n = new StringBuffer();

    /* renamed from: o  reason: collision with root package name */
    private final StringBuffer f124968o = new StringBuffer();

    /* renamed from: p  reason: collision with root package name */
    private final StringBuffer f124969p = new StringBuffer();

    /* renamed from: q  reason: collision with root package name */
    private final float[] f124970q = new float[16];

    /* renamed from: r  reason: collision with root package name */
    private final float[] f124971r = new float[16];

    /* renamed from: s  reason: collision with root package name */
    private final float[] f124972s = new float[9];

    /* renamed from: t  reason: collision with root package name */
    private String f124973t = "";

    /* renamed from: u  reason: collision with root package name */
    private Pose f124974u;

    /* renamed from: v  reason: collision with root package name */
    private Pose f124975v;

    /* renamed from: w  reason: collision with root package name */
    private Anchor f124976w;

    /* renamed from: x  reason: collision with root package name */
    private Anchor f124977x;

    /* renamed from: y  reason: collision with root package name */
    private long f124978y;

    /* renamed from: z  reason: collision with root package name */
    private long f124979z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f124980a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f124981b;

        /* JADX WARNING: Can't wrap try/catch for region: R(22:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|19|20|21|22|23|24|25|27) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0056 */
        static {
            /*
                com.google.ar.core.TrackingFailureReason[] r0 = com.google.ar.core.TrackingFailureReason.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                com.google.ar.core.TrackingFailureReason r2 = com.google.ar.core.TrackingFailureReason.NONE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                com.google.ar.core.TrackingFailureReason r3 = com.google.ar.core.TrackingFailureReason.CAMERA_UNAVAILABLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                com.google.ar.core.TrackingFailureReason r4 = com.google.ar.core.TrackingFailureReason.EXCESSIVE_MOTION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.google.ar.core.TrackingFailureReason r4 = com.google.ar.core.TrackingFailureReason.INSUFFICIENT_FEATURES     // Catch:{ NoSuchFieldError -> 0x002b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r5 = 4
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.google.ar.core.TrackingFailureReason r4 = com.google.ar.core.TrackingFailureReason.INSUFFICIENT_LIGHT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r5 = 5
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.google.ar.core.TrackingFailureReason r4 = com.google.ar.core.TrackingFailureReason.BAD_STATE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r5 = 6
                r0[r4] = r5     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f124980a = r0
                com.google.ar.core.TrackingState[] r0 = com.google.ar.core.TrackingState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.ar.core.TrackingState r4 = com.google.ar.core.TrackingState.PAUSED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r4] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                com.google.ar.core.TrackingState r1 = com.google.ar.core.TrackingState.STOPPED     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                com.google.ar.core.TrackingState r1 = com.google.ar.core.TrackingState.TRACKING     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                f124981b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.Z.a.<clinit>():void");
        }
    }

    public Z(FirebaseInteractions firebaseInteractions, t tVar, boolean z10, boolean z11) {
        C17542s.j(firebaseInteractions, "firebase");
        C17542s.j(tVar, "moshi");
        this.f124954a = firebaseInteractions;
        this.f124955b = tVar;
        this.f124956c = z10;
        this.f124957d = z11;
        int[] iArr = new int[7];
        for (int i10 = 0; i10 < 7; i10++) {
            iArr[i10] = 0;
        }
        this.f124943G = iArr;
        int[] iArr2 = new int[7];
        for (int i11 = 0; i11 < 7; i11++) {
            iArr2[i11] = 0;
        }
        this.f124946J = iArr2;
        this.f124950N = 1.0f;
    }

    private final void B(float[] fArr, float[] fArr2, float[] fArr3, float f10) {
        fArr[0] = fArr2[0] * f10;
        fArr[1] = 0.0f;
        fArr[2] = fArr3[0] * f10;
        fArr[3] = 0.0f;
        fArr[4] = fArr2[1] * f10;
        fArr[5] = fArr3[1] * f10;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    static /* synthetic */ void C(Z z10, float[] fArr, float[] fArr2, float[] fArr3, float f10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        z10.B(fArr, fArr2, fArr3, f10);
    }

    private final int E(TrackingState trackingState, TrackingFailureReason trackingFailureReason) {
        int i10 = a.f124981b[trackingState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            switch (a.f124980a[trackingFailureReason.ordinal()]) {
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
            }
        } else if (i10 == 3) {
            return 1;
        }
        return 0;
    }

    public static /* synthetic */ int c(Z z10, Session session, Frame frame, K0 k02, float[] fArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            fArr = new float[3];
        }
        return z10.a(session, frame, k02, fArr);
    }

    public static /* synthetic */ void d(Z z10, float[] fArr, float[] fArr2, long j10, K0 k02, int i10, float f10, float[] fArr3, int i11, Object obj) {
        z10.b(fArr, fArr2, j10, k02, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? 0.0f : f10, (i11 & 64) != 0 ? new float[3] : fArr3);
    }

    private final void g(Session session, int i10) {
        try {
            Collection<Plane> allTrackables = session.getAllTrackables(Plane.class);
            C17542s.i(allTrackables, "getAllTrackables(...)");
            ArrayList arrayList = new ArrayList();
            for (Object next : allTrackables) {
                if (((Plane) next).getType() == Plane.Type.HORIZONTAL_UPWARD_FACING) {
                    arrayList.add(next);
                }
            }
            if (arrayList.size() > 0) {
                Anchor anchor = this.f124977x;
                if (anchor != null) {
                    anchor.detach();
                }
                this.f124977x = null;
                Pose centerPose = ((Plane) arrayList.get(0)).getCenterPose();
                Anchor createAnchor = session.createAnchor(centerPose);
                this.f124977x = createAnchor;
                if (createAnchor != null) {
                    this.f124938B = ((float) (System.currentTimeMillis() - this.f124979z)) / 1000.0f;
                    String str = "floor createAnchor success (" + ((int) Math.abs(((double) (centerPose != null ? centerPose.ty() : 0.0f)) * 3.281d * ((double) 12))) + " inches,frame=" + i10 + ",planes=" + arrayList.size() + "," + this.f124938B + ")";
                    Log.d(AnyKt.SUGARCUBE_TAG, str);
                    C13868b.f118106a.b(str, e.Capture);
                }
            }
        } catch (Exception e10) {
            Log.e(AnyKt.SUGARCUBE_TAG, "failed to create floor anchor", e10);
            C13868b.f118106a.b("floor createAnchor failure: " + e10, e.Capture);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00af, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        jI.C17416c.a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b3, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(java.io.File r3) {
        /*
            r2 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            monitor-enter(r2)
            java.lang.StringBuffer r0 = r2.f124967n     // Catch:{ all -> 0x0016 }
            int r0 = r0.length()     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0019
            java.lang.StringBuffer r0 = r2.f124967n     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "["
            r0.append(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r3 = move-exception
            goto L_0x00b4
        L_0x0019:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0016 }
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ all -> 0x0016 }
            r1.<init>(r3)     // Catch:{ all -> 0x0016 }
            r0.<init>(r1)     // Catch:{ all -> 0x0016 }
            r3 = 32768(0x8000, float:4.5918E-41)
            char[] r3 = new char[r3]     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "{\"poses\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124958e     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"viewMatrix\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124959f     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"projectionMatrix\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124960g     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"intrinsicsMatrix\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124961h     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"timestampsColor\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124962i     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"timestampsDepth\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124963j     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"pointCloud\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124964k     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"pointId\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124965l     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"trackingState\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124966m     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"state\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124967n     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"gravity\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124968o     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = "],\"rotationMatrix\":"
            r0.write(r1)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuffer r1 = r2.f124969p     // Catch:{ all -> 0x00ad }
            com.sugarcube.app.base.ui.hybrid.C14248a0.e(r0, r1, r3)     // Catch:{ all -> 0x00ad }
            java.lang.String r3 = "]}"
            r0.write(r3)     // Catch:{ all -> 0x00ad }
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x00ad }
            r3 = 0
            jI.C17416c.a(r0, r3)     // Catch:{ all -> 0x0016 }
            monitor-exit(r2)
            return
        L_0x00ad:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x00af }
        L_0x00af:
            r1 = move-exception
            jI.C17416c.a(r0, r3)     // Catch:{ all -> 0x0016 }
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x00b4:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.Z.A(java.io.File):void");
    }

    public final void D(String str) {
        C17542s.j(str, "state");
        synchronized (this) {
            this.f124973t = str;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final boolean F() {
        boolean z10;
        synchronized (this) {
            z10 = this.f124976w != null;
        }
        return z10;
    }

    public final boolean G() {
        boolean z10;
        synchronized (this) {
            z10 = this.f124977x != null;
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0237, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x023e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        jI.C17416c.a(r11, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0242, code lost:
        throw r3;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:45:0x0233, B:51:0x023d] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x028c A[Catch:{ Exception -> 0x003f, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x02ef A[Catch:{ Exception -> 0x003f, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0303 A[Catch:{ Exception -> 0x003f, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0337 A[Catch:{ Exception -> 0x003f, all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.ar.core.Session r11, com.google.ar.core.Frame r12, com.sugarcube.app.base.ui.hybrid.K0 r13, float[] r14) {
        /*
            r10 = this;
            java.lang.String r0 = "frame"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "sensorData"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "angleChangeIn"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            monitor-enter(r10)
            int r14 = r10.f124953Q     // Catch:{ all -> 0x0017 }
            if (r14 != 0) goto L_0x001a
            java.lang.String r14 = "["
            goto L_0x001c
        L_0x0017:
            r11 = move-exception
            goto L_0x0349
        L_0x001a:
            java.lang.String r14 = ","
        L_0x001c:
            com.google.ar.core.Camera r0 = r12.getCamera()     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = "getCamera(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ all -> 0x0017 }
            com.google.ar.core.Pose r1 = r0.getPose()     // Catch:{ all -> 0x0017 }
            r10.f124975v = r1     // Catch:{ all -> 0x0017 }
            com.google.ar.core.Pose r2 = r10.f124974u     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x00e1
            r10.f124974u = r1     // Catch:{ all -> 0x0017 }
            boolean r1 = r10.f124956c     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x00e1
            if (r11 == 0) goto L_0x00e1
            com.google.ar.core.Anchor r1 = r10.f124976w     // Catch:{ Exception -> 0x003f }
            if (r1 == 0) goto L_0x0041
            r1.detach()     // Catch:{ Exception -> 0x003f }
            goto L_0x0041
        L_0x003f:
            r1 = move-exception
            goto L_0x00a7
        L_0x0041:
            com.google.ar.core.Pose r1 = r10.f124974u     // Catch:{ Exception -> 0x003f }
            com.google.ar.core.Anchor r1 = r11.createAnchor(r1)     // Catch:{ Exception -> 0x003f }
            r10.f124976w = r1     // Catch:{ Exception -> 0x003f }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x003f }
            long r3 = r10.f124978y     // Catch:{ Exception -> 0x003f }
            long r1 = r1 - r3
            float r1 = (float) r1     // Catch:{ Exception -> 0x003f }
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r10.f124937A = r1     // Catch:{ Exception -> 0x003f }
            com.google.ar.core.Pose r1 = r10.f124975v     // Catch:{ Exception -> 0x003f }
            if (r1 == 0) goto L_0x005f
            float r1 = r1.ty()     // Catch:{ Exception -> 0x003f }
            goto L_0x0060
        L_0x005f:
            r1 = 0
        L_0x0060:
            double r1 = (double) r1     // Catch:{ Exception -> 0x003f }
            r3 = 4614570573988718707(0x400a3f7ced916873, double:3.281)
            double r1 = r1 * r3
            r3 = 12
            double r3 = (double) r3     // Catch:{ Exception -> 0x003f }
            double r1 = r1 * r3
            double r1 = java.lang.Math.abs(r1)     // Catch:{ Exception -> 0x003f }
            int r1 = (int) r1     // Catch:{ Exception -> 0x003f }
            int r2 = r10.f124953Q     // Catch:{ Exception -> 0x003f }
            float r3 = r10.f124937A     // Catch:{ Exception -> 0x003f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x003f }
            r4.<init>()     // Catch:{ Exception -> 0x003f }
            java.lang.String r5 = "pose.createAnchor ("
            r4.append(r5)     // Catch:{ Exception -> 0x003f }
            r4.append(r1)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = "\","
            r4.append(r1)     // Catch:{ Exception -> 0x003f }
            r4.append(r2)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = ","
            r4.append(r1)     // Catch:{ Exception -> 0x003f }
            r4.append(r3)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch:{ Exception -> 0x003f }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x003f }
            java.lang.String r2 = "Sugarcube"
            android.util.Log.e(r2, r1)     // Catch:{ Exception -> 0x003f }
            YE.b r2 = YE.C13868b.f118106a     // Catch:{ Exception -> 0x003f }
            YE.e r3 = YE.e.Capture     // Catch:{ Exception -> 0x003f }
            r2.b(r1, r3)     // Catch:{ Exception -> 0x003f }
            goto L_0x00e1
        L_0x00a7:
            java.lang.String r2 = "Sugarcube"
            int r3 = r10.f124953Q     // Catch:{ all -> 0x0017 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r4.<init>()     // Catch:{ all -> 0x0017 }
            java.lang.String r5 = "failed to create pose anchor "
            r4.append(r5)     // Catch:{ all -> 0x0017 }
            r4.append(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0017 }
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0017 }
            YE.b r2 = YE.C13868b.f118106a     // Catch:{ all -> 0x0017 }
            int r3 = r10.f124953Q     // Catch:{ all -> 0x0017 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r4.<init>()     // Catch:{ all -> 0x0017 }
            java.lang.String r5 = "createAnchor for pose failure ("
            r4.append(r5)     // Catch:{ all -> 0x0017 }
            r4.append(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "): "
            r4.append(r3)     // Catch:{ all -> 0x0017 }
            r4.append(r1)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x0017 }
            YE.e r3 = YE.e.Capture     // Catch:{ all -> 0x0017 }
            r2.b(r1, r3)     // Catch:{ all -> 0x0017 }
        L_0x00e1:
            boolean r1 = r10.f124957d     // Catch:{ all -> 0x0017 }
            if (r1 == 0) goto L_0x00f0
            com.google.ar.core.Anchor r1 = r10.f124977x     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x00f0
            if (r11 == 0) goto L_0x00f0
            int r1 = r10.f124953Q     // Catch:{ all -> 0x0017 }
            r10.g(r11, r1)     // Catch:{ all -> 0x0017 }
        L_0x00f0:
            com.google.ar.core.Pose r11 = r10.f124975v     // Catch:{ all -> 0x0017 }
            r1 = 0
            if (r11 == 0) goto L_0x00fa
            float[] r2 = r10.f124970q     // Catch:{ all -> 0x0017 }
            r11.toMatrix(r2, r1)     // Catch:{ all -> 0x0017 }
        L_0x00fa:
            float[] r11 = r10.f124970q     // Catch:{ all -> 0x0017 }
            float[] r2 = r10.f124971r     // Catch:{ all -> 0x0017 }
            com.sugarcube.app.base.ui.hybrid.C14248a0.d(r11, r2)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r11 = r10.f124958e     // Catch:{ all -> 0x0017 }
            r11.append(r14)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r2 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r3 = float[].class
            com.squareup.moshi.f r2 = r2.c(r3)     // Catch:{ all -> 0x0017 }
            float[] r3 = r10.f124971r     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = r2.toJson(r3)     // Catch:{ all -> 0x0017 }
            r11.append(r2)     // Catch:{ all -> 0x0017 }
            float[] r3 = r10.f124971r     // Catch:{ all -> 0x0017 }
            float[] r4 = r10.f124939C     // Catch:{ all -> 0x0017 }
            r8 = 14
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            YH.C16870n.p(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0017 }
            float[] r11 = r10.f124970q     // Catch:{ all -> 0x0017 }
            r0.getViewMatrix(r11, r1)     // Catch:{ all -> 0x0017 }
            float[] r11 = r10.f124970q     // Catch:{ all -> 0x0017 }
            float[] r2 = r10.f124971r     // Catch:{ all -> 0x0017 }
            com.sugarcube.app.base.ui.hybrid.C14248a0.d(r11, r2)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r11 = r10.f124959f     // Catch:{ all -> 0x0017 }
            r11.append(r14)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r2 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r3 = float[].class
            com.squareup.moshi.f r2 = r2.c(r3)     // Catch:{ all -> 0x0017 }
            float[] r3 = r10.f124971r     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = r2.toJson(r3)     // Catch:{ all -> 0x0017 }
            r11.append(r2)     // Catch:{ all -> 0x0017 }
            float[] r11 = r10.f124970q     // Catch:{ all -> 0x0017 }
            r2 = 1036831949(0x3dcccccd, float:0.1)
            r3 = 1120403456(0x42c80000, float:100.0)
            r0.getProjectionMatrix(r11, r1, r2, r3)     // Catch:{ all -> 0x0017 }
            float[] r11 = r10.f124970q     // Catch:{ all -> 0x0017 }
            float[] r2 = r10.f124971r     // Catch:{ all -> 0x0017 }
            com.sugarcube.app.base.ui.hybrid.C14248a0.d(r11, r2)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r11 = r10.f124960g     // Catch:{ all -> 0x0017 }
            r11.append(r14)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r2 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r3 = float[].class
            com.squareup.moshi.f r2 = r2.c(r3)     // Catch:{ all -> 0x0017 }
            float[] r3 = r10.f124971r     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = r2.toJson(r3)     // Catch:{ all -> 0x0017 }
            r11.append(r2)     // Catch:{ all -> 0x0017 }
            com.google.ar.core.CameraIntrinsics r11 = r0.getImageIntrinsics()     // Catch:{ all -> 0x0017 }
            float[] r3 = r10.f124940D     // Catch:{ all -> 0x0017 }
            float[] r4 = r11.getFocalLength()     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "getFocalLength(...)"
            kotlin.jvm.internal.C17542s.i(r4, r2)     // Catch:{ all -> 0x0017 }
            float[] r5 = r11.getPrincipalPoint()     // Catch:{ all -> 0x0017 }
            java.lang.String r11 = "getPrincipalPoint(...)"
            kotlin.jvm.internal.C17542s.i(r5, r11)     // Catch:{ all -> 0x0017 }
            r7 = 8
            r8 = 0
            r6 = 0
            r2 = r10
            C(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r11 = r10.f124961h     // Catch:{ all -> 0x0017 }
            r11.append(r14)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r2 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r3 = float[].class
            com.squareup.moshi.f r2 = r2.c(r3)     // Catch:{ all -> 0x0017 }
            float[] r3 = r10.f124940D     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = r2.toJson(r3)     // Catch:{ all -> 0x0017 }
            r11.append(r2)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r11 = r10.f124962i     // Catch:{ all -> 0x0017 }
            r11.append(r14)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r2 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class r3 = java.lang.Long.TYPE     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.f r2 = r2.c(r3)     // Catch:{ all -> 0x0017 }
            long r4 = r12.getTimestamp()     // Catch:{ all -> 0x0017 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = r2.toJson(r4)     // Catch:{ all -> 0x0017 }
            r11.append(r2)     // Catch:{ all -> 0x0017 }
            com.google.ar.core.PointCloud r11 = r12.acquirePointCloud()     // Catch:{ all -> 0x0243 }
            long r4 = r11.getTimestamp()     // Catch:{ all -> 0x023b }
            java.nio.FloatBuffer r2 = r11.getPoints()     // Catch:{ all -> 0x023b }
            int r6 = r2.remaining()     // Catch:{ all -> 0x023b }
            float[] r7 = new float[r6]     // Catch:{ all -> 0x023b }
            r2.mark()     // Catch:{ all -> 0x0239 }
            r2.get(r7)     // Catch:{ all -> 0x0239 }
            r2.reset()     // Catch:{ all -> 0x0239 }
            java.nio.IntBuffer r2 = r11.getIds()     // Catch:{ all -> 0x0239 }
            int r8 = r2.remaining()     // Catch:{ all -> 0x0239 }
            int[] r8 = new int[r8]     // Catch:{ all -> 0x0239 }
            r2.mark()     // Catch:{ all -> 0x0239 }
            java.nio.IntBuffer r9 = r11.getIds()     // Catch:{ all -> 0x0239 }
            r9.get(r8)     // Catch:{ all -> 0x0239 }
            r2.reset()     // Catch:{ all -> 0x0239 }
            r11.release()     // Catch:{ all -> 0x0239 }
            java.lang.StringBuffer r2 = r10.f124963j     // Catch:{ all -> 0x0239 }
            r2.append(r14)     // Catch:{ all -> 0x0239 }
            com.squareup.moshi.t r9 = r10.f124955b     // Catch:{ all -> 0x0239 }
            com.squareup.moshi.f r3 = r9.c(r3)     // Catch:{ all -> 0x0239 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0239 }
            java.lang.String r3 = r3.toJson(r4)     // Catch:{ all -> 0x0239 }
            r2.append(r3)     // Catch:{ all -> 0x0239 }
            java.lang.StringBuffer r2 = r10.f124964k     // Catch:{ all -> 0x0239 }
            r2.append(r14)     // Catch:{ all -> 0x0239 }
            com.squareup.moshi.t r3 = r10.f124955b     // Catch:{ all -> 0x0239 }
            java.lang.Class<float[]> r4 = float[].class
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0239 }
            java.lang.String r3 = r3.toJson(r7)     // Catch:{ all -> 0x0239 }
            r2.append(r3)     // Catch:{ all -> 0x0239 }
            java.lang.StringBuffer r2 = r10.f124965l     // Catch:{ all -> 0x0239 }
            r2.append(r14)     // Catch:{ all -> 0x0239 }
            com.squareup.moshi.t r3 = r10.f124955b     // Catch:{ all -> 0x0239 }
            java.lang.Class<int[]> r4 = int[].class
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0239 }
            java.lang.String r3 = r3.toJson(r8)     // Catch:{ all -> 0x0239 }
            r2.append(r3)     // Catch:{ all -> 0x0239 }
            r2 = 0
            jI.C17416c.a(r11, r2)     // Catch:{ all -> 0x0237 }
            goto L_0x0256
        L_0x0237:
            r11 = move-exception
            goto L_0x0245
        L_0x0239:
            r2 = move-exception
            goto L_0x023d
        L_0x023b:
            r2 = move-exception
            r6 = r1
        L_0x023d:
            throw r2     // Catch:{ all -> 0x023e }
        L_0x023e:
            r3 = move-exception
            jI.C17416c.a(r11, r2)     // Catch:{ all -> 0x0237 }
            throw r3     // Catch:{ all -> 0x0237 }
        L_0x0243:
            r11 = move-exception
            r6 = r1
        L_0x0245:
            java.lang.String r2 = "point cloud error"
            java.lang.String r3 = "Sugarcube"
            android.util.Log.e(r3, r2, r11)     // Catch:{ all -> 0x0017 }
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r3 = r10.f124954a     // Catch:{ all -> 0x0017 }
            r3.log(r2)     // Catch:{ all -> 0x0017 }
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r2 = r10.f124954a     // Catch:{ all -> 0x0017 }
            r2.recordException(r11)     // Catch:{ all -> 0x0017 }
        L_0x0256:
            com.google.ar.core.TrackingState r11 = r0.getTrackingState()     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "getTrackingState(...)"
            kotlin.jvm.internal.C17542s.i(r11, r2)     // Catch:{ all -> 0x0017 }
            com.google.ar.core.TrackingFailureReason r0 = r0.getTrackingFailureReason()     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "getTrackingFailureReason(...)"
            kotlin.jvm.internal.C17542s.i(r0, r2)     // Catch:{ all -> 0x0017 }
            int r11 = r10.E(r11, r0)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r0 = r10.f124966m     // Catch:{ all -> 0x0017 }
            r0.append(r14)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r2 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.f r2 = r2.c(r3)     // Catch:{ all -> 0x0017 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = r2.toJson(r3)     // Catch:{ all -> 0x0017 }
            r0.append(r2)     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = r10.f124973t     // Catch:{ all -> 0x0017 }
            int r0 = r0.length()     // Catch:{ all -> 0x0017 }
            if (r0 <= 0) goto L_0x02b9
            java.lang.StringBuffer r0 = r10.f124967n     // Catch:{ all -> 0x0017 }
            int r0 = r0.length()     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x0297
            java.lang.String r0 = "["
            goto L_0x0299
        L_0x0297:
            java.lang.String r0 = ","
        L_0x0299:
            int r2 = r10.f124953Q     // Catch:{ all -> 0x0017 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r10.f124973t     // Catch:{ all -> 0x0017 }
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r3 = r10.f124967n     // Catch:{ all -> 0x0017 }
            r3.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r0 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class<java.lang.Object[]> r4 = java.lang.Object[].class
            com.squareup.moshi.f r0 = r0.c(r4)     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = r0.toJson(r2)     // Catch:{ all -> 0x0017 }
            r3.append(r0)     // Catch:{ all -> 0x0017 }
        L_0x02b9:
            float[] r0 = r13.b()     // Catch:{ all -> 0x0017 }
            float[] r0 = com.sugarcube.app.base.ui.hybrid.C14266j0.a(r0)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r2 = r10.f124968o     // Catch:{ all -> 0x0017 }
            r2.append(r14)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r3 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r4 = float[].class
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0017 }
            java.lang.String r0 = r3.toJson(r0)     // Catch:{ all -> 0x0017 }
            r2.append(r0)     // Catch:{ all -> 0x0017 }
            float[] r13 = r13.c()     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r0 = r10.f124969p     // Catch:{ all -> 0x0017 }
            r0.append(r14)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r14 = r10.f124955b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r2 = float[].class
            com.squareup.moshi.f r14 = r14.c(r2)     // Catch:{ all -> 0x0017 }
            java.lang.String r13 = r14.toJson(r13)     // Catch:{ all -> 0x0017 }
            r0.append(r13)     // Catch:{ all -> 0x0017 }
            if (r11 < 0) goto L_0x02f4
            r13 = 7
            if (r11 < r13) goto L_0x02f3
            goto L_0x02f4
        L_0x02f3:
            r1 = r11
        L_0x02f4:
            int[] r11 = r10.f124946J     // Catch:{ all -> 0x0017 }
            r13 = r11[r1]     // Catch:{ all -> 0x0017 }
            int r13 = r13 + 1
            r11[r1] = r13     // Catch:{ all -> 0x0017 }
            int r11 = r10.f124947K     // Catch:{ all -> 0x0017 }
            int r11 = r11 + r6
            r10.f124947K = r11     // Catch:{ all -> 0x0017 }
            if (r6 != 0) goto L_0x0309
            int r11 = r10.f124948L     // Catch:{ all -> 0x0017 }
            int r11 = r11 + 1
            r10.f124948L = r11     // Catch:{ all -> 0x0017 }
        L_0x0309:
            float r11 = r10.f124950N     // Catch:{ all -> 0x0017 }
            com.google.ar.core.LightEstimate r13 = r12.getLightEstimate()     // Catch:{ all -> 0x0017 }
            float r13 = r13.getPixelIntensity()     // Catch:{ all -> 0x0017 }
            float r11 = java.lang.Math.min(r11, r13)     // Catch:{ all -> 0x0017 }
            r10.f124950N = r11     // Catch:{ all -> 0x0017 }
            float r11 = r10.f124951O     // Catch:{ all -> 0x0017 }
            com.google.ar.core.LightEstimate r13 = r12.getLightEstimate()     // Catch:{ all -> 0x0017 }
            float r13 = r13.getPixelIntensity()     // Catch:{ all -> 0x0017 }
            float r11 = java.lang.Math.max(r11, r13)     // Catch:{ all -> 0x0017 }
            r10.f124951O = r11     // Catch:{ all -> 0x0017 }
            com.google.ar.core.LightEstimate r11 = r12.getLightEstimate()     // Catch:{ all -> 0x0017 }
            float r11 = r11.getPixelIntensity()     // Catch:{ all -> 0x0017 }
            r12 = 1048576000(0x3e800000, float:0.25)
            int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r11 >= 0) goto L_0x033d
            int r11 = r10.f124949M     // Catch:{ all -> 0x0017 }
            int r11 = r11 + 1
            r10.f124949M = r11     // Catch:{ all -> 0x0017 }
        L_0x033d:
            java.lang.String r11 = ""
            r10.f124973t = r11     // Catch:{ all -> 0x0017 }
            int r11 = r10.f124953Q     // Catch:{ all -> 0x0017 }
            int r11 = r11 + 1
            r10.f124953Q = r11     // Catch:{ all -> 0x0017 }
            monitor-exit(r10)
            return r11
        L_0x0349:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.Z.a(com.google.ar.core.Session, com.google.ar.core.Frame, com.sugarcube.app.base.ui.hybrid.K0, float[]):int");
    }

    public final void b(float[] fArr, float[] fArr2, long j10, K0 k02, int i10, float f10, float[] fArr3) {
        float[] fArr4 = fArr2;
        int i11 = i10;
        C17542s.j(fArr4, "intrinsics");
        C17542s.j(k02, "sensorData");
        C17542s.j(fArr3, "angleChangeIn");
        synchronized (this) {
            try {
                String str = this.f124953Q == 0 ? "[" : ",";
                float[] fArr5 = new float[16];
                Matrix.multiplyMM(fArr5, 0, C14248a0.a(), 0, k02.c(), 0);
                StringBuffer stringBuffer = this.f124958e;
                stringBuffer.append(str);
                stringBuffer.append(this.f124955b.c(float[].class).toJson(fArr == null ? fArr5 : fArr));
                C16870n.p(fArr == null ? fArr5 : fArr, this.f124939C, 0, 0, 0, 14, (Object) null);
                int i12 = 0;
                for (int i13 = 0; i13 < 16; i13++) {
                    this.f124971r[i13] = 0.0f;
                }
                StringBuffer stringBuffer2 = this.f124959f;
                stringBuffer2.append(str);
                stringBuffer2.append(this.f124955b.c(float[].class).toJson(this.f124971r));
                StringBuffer stringBuffer3 = this.f124960g;
                stringBuffer3.append(str);
                stringBuffer3.append(this.f124955b.c(float[].class).toJson(this.f124971r));
                StringBuffer stringBuffer4 = this.f124961h;
                stringBuffer4.append(str);
                stringBuffer4.append(this.f124955b.c(float[].class).toJson(fArr4));
                StringBuffer stringBuffer5 = this.f124962i;
                stringBuffer5.append(str);
                t tVar = this.f124955b;
                Class cls = Long.TYPE;
                stringBuffer5.append(tVar.c(cls).toJson(Long.valueOf(j10)));
                StringBuffer stringBuffer6 = this.f124963j;
                stringBuffer6.append(str);
                stringBuffer6.append(this.f124955b.c(cls).toJson(Long.valueOf(j10)));
                StringBuffer stringBuffer7 = this.f124964k;
                stringBuffer7.append(str);
                stringBuffer7.append(this.f124955b.c(float[].class).toJson(new float[0]));
                StringBuffer stringBuffer8 = this.f124965l;
                stringBuffer8.append(str);
                stringBuffer8.append(this.f124955b.c(int[].class).toJson(new int[0]));
                StringBuffer stringBuffer9 = this.f124966m;
                stringBuffer9.append(str);
                stringBuffer9.append(this.f124955b.c(Integer.TYPE).toJson(Integer.valueOf(i10)));
                if (this.f124973t.length() > 0) {
                    String str2 = this.f124967n.length() == 0 ? "[" : ",";
                    Object[] objArr = {Integer.valueOf(this.f124953Q), this.f124973t};
                    StringBuffer stringBuffer10 = this.f124967n;
                    stringBuffer10.append(str2);
                    stringBuffer10.append(this.f124955b.c(Object[].class).toJson(objArr));
                }
                float[] a10 = C14266j0.a(k02.b());
                StringBuffer stringBuffer11 = this.f124968o;
                stringBuffer11.append(str);
                stringBuffer11.append(this.f124955b.c(float[].class).toJson(a10));
                StringBuffer stringBuffer12 = this.f124969p;
                stringBuffer12.append(str);
                stringBuffer12.append(this.f124955b.c(float[].class).toJson(fArr5));
                if (i11 >= 0) {
                    if (i11 < 7) {
                        i12 = C17978n.e(i11, 0);
                    }
                }
                int[] iArr = this.f124946J;
                iArr[i12] = iArr[i12] + 1;
                this.f124948L++;
                this.f124973t = "";
                this.f124953Q++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int e(Session session) {
        if (this.f124957d && this.f124977x == null && session != null) {
            g(session, this.f124952P);
        }
        return this.f124953Q;
    }

    public final void f(float[] fArr) {
        Pose pose;
        Pose inverse;
        Pose compose;
        C17542s.j(fArr, "angles");
        float[] fArr2 = new float[16];
        synchronized (this) {
            Pose pose2 = this.f124974u;
            if (!(pose2 == null || (pose = this.f124975v) == null || (inverse = pose.inverse()) == null || (compose = inverse.compose(pose2)) == null)) {
                compose.toMatrix(fArr2, 0);
                C16807N n10 = C16807N.f139792a;
            }
        }
        C14248a0.c(fArr2);
        C14248a0.b(fArr2, fArr);
    }

    public final int h() {
        return this.f124953Q;
    }

    public final float i() {
        return this.f124938B;
    }

    public final int j() {
        return this.f124949M;
    }

    public final int k() {
        return this.f124948L;
    }

    public final float[] l() {
        return this.f124940D;
    }

    public final float m() {
        return this.f124942F;
    }

    public final float[] n() {
        return this.f124939C;
    }

    public final int o() {
        return this.f124941E;
    }

    public final float[] p() {
        return new float[]{this.f124950N, this.f124951O};
    }

    public final int q() {
        return this.f124952P;
    }

    public final int r() {
        return this.f124945I;
    }

    public final int s() {
        return this.f124944H;
    }

    public final int[] t() {
        return this.f124943G;
    }

    public final int u() {
        return this.f124947K;
    }

    public final int[] v() {
        return this.f124946J;
    }

    public final boolean w() {
        return this.f124956c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: com.google.ar.core.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.ar.core.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.ar.core.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: com.google.ar.core.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: com.google.ar.core.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: com.google.ar.core.Camera} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.google.ar.core.Camera} */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0133, code lost:
        r11 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x013a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        jI.C17416c.a(r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013e, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:41:0x012f, B:47:0x0139] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x014c A[Catch:{ Exception -> 0x002c, all -> 0x0029 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0160 A[Catch:{ Exception -> 0x002c, all -> 0x0029 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int x(com.google.ar.core.Session r11, com.google.ar.core.Frame r12, float r13) {
        /*
            r10 = this;
            java.lang.String r0 = "frame"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            monitor-enter(r10)
            com.google.ar.core.Camera r0 = r12.getCamera()     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = "getCamera(...)"
            kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ all -> 0x0029 }
            com.google.ar.core.Pose r1 = r0.getPose()     // Catch:{ all -> 0x0029 }
            r10.f124975v = r1     // Catch:{ all -> 0x0029 }
            com.google.ar.core.Pose r2 = r10.f124974u     // Catch:{ all -> 0x0029 }
            if (r2 != 0) goto L_0x00b3
            r10.f124974u = r1     // Catch:{ all -> 0x0029 }
            boolean r1 = r10.f124956c     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x00b3
            if (r11 == 0) goto L_0x00b3
            com.google.ar.core.Anchor r1 = r10.f124976w     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x002e
            r1.detach()     // Catch:{ Exception -> 0x002c }
            goto L_0x002e
        L_0x0029:
            r11 = move-exception
            goto L_0x0170
        L_0x002c:
            r1 = move-exception
            goto L_0x0094
        L_0x002e:
            com.google.ar.core.Pose r1 = r10.f124974u     // Catch:{ Exception -> 0x002c }
            com.google.ar.core.Anchor r1 = r11.createAnchor(r1)     // Catch:{ Exception -> 0x002c }
            r10.f124976w = r1     // Catch:{ Exception -> 0x002c }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x002c }
            long r3 = r10.f124978y     // Catch:{ Exception -> 0x002c }
            long r1 = r1 - r3
            float r1 = (float) r1     // Catch:{ Exception -> 0x002c }
            r2 = 1148846080(0x447a0000, float:1000.0)
            float r1 = r1 / r2
            r10.f124937A = r1     // Catch:{ Exception -> 0x002c }
            com.google.ar.core.Pose r1 = r10.f124975v     // Catch:{ Exception -> 0x002c }
            if (r1 == 0) goto L_0x004c
            float r1 = r1.ty()     // Catch:{ Exception -> 0x002c }
            goto L_0x004d
        L_0x004c:
            r1 = 0
        L_0x004d:
            double r1 = (double) r1     // Catch:{ Exception -> 0x002c }
            r3 = 4614570573988718707(0x400a3f7ced916873, double:3.281)
            double r1 = r1 * r3
            r3 = 12
            double r3 = (double) r3     // Catch:{ Exception -> 0x002c }
            double r1 = r1 * r3
            double r1 = java.lang.Math.abs(r1)     // Catch:{ Exception -> 0x002c }
            int r1 = (int) r1     // Catch:{ Exception -> 0x002c }
            int r2 = r10.f124952P     // Catch:{ Exception -> 0x002c }
            float r3 = r10.f124937A     // Catch:{ Exception -> 0x002c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x002c }
            r4.<init>()     // Catch:{ Exception -> 0x002c }
            java.lang.String r5 = "panoPose.createAnchor ("
            r4.append(r5)     // Catch:{ Exception -> 0x002c }
            r4.append(r1)     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = "\","
            r4.append(r1)     // Catch:{ Exception -> 0x002c }
            r4.append(r2)     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = ","
            r4.append(r1)     // Catch:{ Exception -> 0x002c }
            r4.append(r3)     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = ")"
            r4.append(r1)     // Catch:{ Exception -> 0x002c }
            java.lang.String r1 = r4.toString()     // Catch:{ Exception -> 0x002c }
            java.lang.String r2 = "Sugarcube"
            android.util.Log.e(r2, r1)     // Catch:{ Exception -> 0x002c }
            YE.b r2 = YE.C13868b.f118106a     // Catch:{ Exception -> 0x002c }
            YE.e r3 = YE.e.Capture     // Catch:{ Exception -> 0x002c }
            r2.b(r1, r3)     // Catch:{ Exception -> 0x002c }
            goto L_0x00b3
        L_0x0094:
            java.lang.String r2 = "Sugarcube"
            java.lang.String r3 = "pano failed to create anchor"
            android.util.Log.e(r2, r3, r1)     // Catch:{ all -> 0x0029 }
            YE.b r2 = YE.C13868b.f118106a     // Catch:{ all -> 0x0029 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0029 }
            r3.<init>()     // Catch:{ all -> 0x0029 }
            java.lang.String r4 = "pano createAnchor failure: "
            r3.append(r4)     // Catch:{ all -> 0x0029 }
            r3.append(r1)     // Catch:{ all -> 0x0029 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0029 }
            YE.e r3 = YE.e.Capture     // Catch:{ all -> 0x0029 }
            r2.b(r1, r3)     // Catch:{ all -> 0x0029 }
        L_0x00b3:
            boolean r1 = r10.f124957d     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x00c2
            com.google.ar.core.Anchor r1 = r10.f124977x     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x00c2
            if (r11 == 0) goto L_0x00c2
            int r1 = r10.f124952P     // Catch:{ all -> 0x0029 }
            r10.g(r11, r1)     // Catch:{ all -> 0x0029 }
        L_0x00c2:
            com.google.ar.core.Pose r11 = r10.f124975v     // Catch:{ all -> 0x0029 }
            r1 = 0
            if (r11 == 0) goto L_0x00cc
            float[] r2 = r10.f124970q     // Catch:{ all -> 0x0029 }
            r11.toMatrix(r2, r1)     // Catch:{ all -> 0x0029 }
        L_0x00cc:
            float[] r11 = r10.f124970q     // Catch:{ all -> 0x0029 }
            float[] r2 = r10.f124971r     // Catch:{ all -> 0x0029 }
            com.sugarcube.app.base.ui.hybrid.C14248a0.d(r11, r2)     // Catch:{ all -> 0x0029 }
            float[] r3 = r10.f124971r     // Catch:{ all -> 0x0029 }
            float[] r4 = r10.f124939C     // Catch:{ all -> 0x0029 }
            r8 = 14
            r9 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            YH.C16870n.p(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0029 }
            com.google.ar.core.TrackingState r11 = r0.getTrackingState()     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = "getTrackingState(...)"
            kotlin.jvm.internal.C17542s.i(r11, r2)     // Catch:{ all -> 0x0029 }
            com.google.ar.core.TrackingFailureReason r2 = r0.getTrackingFailureReason()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "getTrackingFailureReason(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)     // Catch:{ all -> 0x0029 }
            int r11 = r10.E(r11, r2)     // Catch:{ all -> 0x0029 }
            r10.f124941E = r11     // Catch:{ all -> 0x0029 }
            com.google.ar.core.LightEstimate r11 = r12.getLightEstimate()     // Catch:{ all -> 0x0029 }
            float r11 = r11.getPixelIntensity()     // Catch:{ all -> 0x0029 }
            r10.f124942F = r11     // Catch:{ all -> 0x0029 }
            com.google.ar.core.CameraIntrinsics r11 = r0.getImageIntrinsics()     // Catch:{ all -> 0x0029 }
            float[] r0 = r10.f124940D     // Catch:{ all -> 0x0029 }
            float[] r2 = r11.getFocalLength()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "getFocalLength(...)"
            kotlin.jvm.internal.C17542s.i(r2, r3)     // Catch:{ all -> 0x0029 }
            float[] r11 = r11.getPrincipalPoint()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "getPrincipalPoint(...)"
            kotlin.jvm.internal.C17542s.i(r11, r3)     // Catch:{ all -> 0x0029 }
            r10.B(r0, r2, r11, r13)     // Catch:{ all -> 0x0029 }
            com.google.ar.core.PointCloud r11 = r12.acquirePointCloud()     // Catch:{ all -> 0x013f }
            java.nio.FloatBuffer r12 = r11.getPoints()     // Catch:{ all -> 0x0137 }
            int r12 = r12.remaining()     // Catch:{ all -> 0x0137 }
            r11.release()     // Catch:{ all -> 0x0135 }
            XH.N r13 = XH.C16807N.f139792a     // Catch:{ all -> 0x0135 }
            r13 = 0
            jI.C17416c.a(r11, r13)     // Catch:{ all -> 0x0133 }
            goto L_0x0148
        L_0x0133:
            r11 = move-exception
            goto L_0x0141
        L_0x0135:
            r13 = move-exception
            goto L_0x0139
        L_0x0137:
            r13 = move-exception
            r12 = r1
        L_0x0139:
            throw r13     // Catch:{ all -> 0x013a }
        L_0x013a:
            r0 = move-exception
            jI.C17416c.a(r11, r13)     // Catch:{ all -> 0x0133 }
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x013f:
            r11 = move-exception
            r12 = r1
        L_0x0141:
            java.lang.String r13 = "pano point cloud error"
            java.lang.String r0 = "Sugarcube"
            android.util.Log.e(r0, r13, r11)     // Catch:{ all -> 0x0029 }
        L_0x0148:
            int r11 = r10.f124941E     // Catch:{ all -> 0x0029 }
            if (r11 < 0) goto L_0x0151
            r13 = 7
            if (r11 < r13) goto L_0x0150
            goto L_0x0151
        L_0x0150:
            r1 = r11
        L_0x0151:
            int[] r11 = r10.f124943G     // Catch:{ all -> 0x0029 }
            r13 = r11[r1]     // Catch:{ all -> 0x0029 }
            int r13 = r13 + 1
            r11[r1] = r13     // Catch:{ all -> 0x0029 }
            int r11 = r10.f124944H     // Catch:{ all -> 0x0029 }
            int r11 = r11 + r12
            r10.f124944H = r11     // Catch:{ all -> 0x0029 }
            if (r12 != 0) goto L_0x0166
            int r11 = r10.f124945I     // Catch:{ all -> 0x0029 }
            int r11 = r11 + 1
            r10.f124945I = r11     // Catch:{ all -> 0x0029 }
        L_0x0166:
            int r11 = r10.f124952P     // Catch:{ all -> 0x0029 }
            int r11 = r11 + 1
            r10.f124952P = r11     // Catch:{ all -> 0x0029 }
            int r11 = r10.f124953Q     // Catch:{ all -> 0x0029 }
            monitor-exit(r10)
            return r11
        L_0x0170:
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.Z.x(com.google.ar.core.Session, com.google.ar.core.Frame, float):int");
    }

    public final void y() {
        Log.d(AnyKt.SUGARCUBE_TAG, "resetAnchor");
        C13868b.f118106a.b("resetAnchor", e.Capture);
        synchronized (this) {
            try {
                Anchor anchor = this.f124976w;
                if (anchor != null) {
                    anchor.detach();
                }
                this.f124976w = null;
                this.f124974u = null;
                this.f124978y = System.currentTimeMillis();
                this.f124937A = 0.0f;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void z() {
        Log.d(AnyKt.SUGARCUBE_TAG, "resetFloorAnchor");
        C13868b.f118106a.b("resetFloorAnchor", e.Capture);
        synchronized (this) {
            try {
                Anchor anchor = this.f124977x;
                if (anchor != null) {
                    anchor.detach();
                }
                this.f124977x = null;
                this.f124979z = System.currentTimeMillis();
                this.f124938B = 0.0f;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
