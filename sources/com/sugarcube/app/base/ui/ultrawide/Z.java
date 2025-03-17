package com.sugarcube.app.base.ui.ultrawide;

import XH.C16807N;
import YE.C13868b;
import YE.e;
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
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0015\n\u0002\b\u0015\b\u0007\u0018\u0000 \u00012\u00020\u0001:\u00016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0006¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010!J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010#J\u0015\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)JC\u00102\u001a\u00020\u000f2\b\u0010*\u001a\u0004\u0018\u00010\u00122\u0006\u0010+\u001a\u00020\u00122\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\r2\b\b\u0002\u00101\u001a\u00020\u0012¢\u0006\u0004\b2\u00103J1\u00106\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u00105\u001a\u0002042\u0006\u0010/\u001a\u00020.2\b\b\u0002\u00101\u001a\u00020\u0012¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b2\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010!R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010!R\u0014\u0010I\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010HR\u0014\u0010K\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u0016\u0010M\u001a\u00020G8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bL\u0010HR\u0014\u0010O\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bN\u0010HR\u0014\u0010Q\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010HR\u0014\u0010S\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010HR\u0014\u0010U\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010HR\u0014\u0010W\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bV\u0010HR\u0014\u0010\u001b\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bX\u0010HR\u0014\u0010'\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010HR\u0014\u0010Y\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010HR\u0014\u0010Z\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010HR\u0014\u0010[\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010HR\u0014\u0010\\\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010HR\u0014\u0010_\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010`\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010^R\u0014\u0010a\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010^R\u0016\u0010c\u001a\u00020&8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010bR\u0018\u0010f\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010eR\u0018\u0010h\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bg\u0010eR\u0018\u0010l\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010kR\u0016\u0010q\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010pR\"\u0010z\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bt\u0010u\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\"\u0010}\u001a\u00020\u00168\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b{\u0010u\u001a\u0004\bL\u0010w\"\u0004\b|\u0010yR\u001a\u0010\u0001\u001a\u00020~8\u0006¢\u0006\u000e\n\u0005\b\u0010\u0001\u001a\u0005\bX\u0010\u0001R(\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000e\n\u0005\bu\u0010\u0001\u001a\u0005\bV\u0010\u0001R)\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bP\u0010\u0001R)\u0010\u0001\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bN\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010uR\u0017\u0010\u0001\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bp\u0010uR(\u0010\u000e\u001a\u00020\r2\u0007\u0010\u0001\u001a\u00020\r8\u0006@BX\u000e¢\u0006\u000f\n\u0006\b\u0001\u0010\u0001\u001a\u0005\bJ\u0010\u0001R\u001a\u0010\u0001\u001a\u00020\u00128\u0006¢\u0006\u000e\n\u0005\b\u0001\u0010^\u001a\u0005\bR\u0010\u0001R\u0013\u0010\u0001\u001a\u00020\u00128F¢\u0006\u0007\u001a\u0005\bT\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/Z;", "", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebase", "Lcom/squareup/moshi/t;", "moshi", "", "useAnchors", "useFloorAnchors", "<init>", "(Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;Lcom/squareup/moshi/t;ZZ)V", "Lcom/google/ar/core/Session;", "session", "", "count", "LXH/N;", "e", "(Lcom/google/ar/core/Session;I)V", "", "matrix", "focalLength", "principalPoint", "", "scale", "r", "([F[F[FF)V", "Lcom/google/ar/core/TrackingState;", "trackingState", "Lcom/google/ar/core/TrackingFailureReason;", "trackingFailureReason", "u", "(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)I", "v", "()Z", "o", "()V", "w", "p", "", "state", "t", "(Ljava/lang/String;)V", "poseMatrix", "intrinsics", "", "timestamp", "Lcom/sugarcube/app/base/ui/ultrawide/e;", "sensorData", "tracking", "angleChangeIn", "b", "([F[FJLcom/sugarcube/app/base/ui/ultrawide/e;I[F)V", "Lcom/google/ar/core/Frame;", "frame", "a", "(Lcom/google/ar/core/Session;Lcom/google/ar/core/Frame;Lcom/sugarcube/app/base/ui/ultrawide/e;[F)I", "Ljava/io/File;", "file", "q", "(Ljava/io/File;)V", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "getFirebase", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "Lcom/squareup/moshi/t;", "getMoshi", "()Lcom/squareup/moshi/t;", "c", "Z", "n", "d", "getUseFloorAnchors", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuffer;", "poses", "f", "viewMatrix", "g", "projectionMatrix", "h", "intrinsicsMatrix", "i", "timestampsColor", "j", "timestampsDepth", "k", "pointCloud", "l", "pointId", "m", "angleChange", "gravity", "timestampsGravity", "rotations", "s", "[F", "out16", "transform16", "out9", "Ljava/lang/String;", "nextState", "Lcom/google/ar/core/Pose;", "Lcom/google/ar/core/Pose;", "anchorPose", "x", "lastPose", "Lcom/google/ar/core/Anchor;", "y", "Lcom/google/ar/core/Anchor;", "anchor", "z", "floorAnchor", "A", "J", "poseAnchorStartTimeMillis", "B", "floorAnchorStartTimeMillis", "C", "F", "getPoseAnchorTimeToDetection", "()F", "setPoseAnchorTimeToDetection", "(F)V", "poseAnchorTimeToDetection", "D", "setFloorAnchorTimeToDetection", "floorAnchorTimeToDetection", "", "E", "[I", "()[I", "trackingStats", "value", "I", "()I", "pointsTotal", "G", "framesWithNoPoints", "H", "framesWithLowIntensity", "lowIntensityMin", "lowIntensityMax", "K", "L", "()[F", "latestIntrinsics", "lowIntensityRange", "M", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Z {

    /* renamed from: M  reason: collision with root package name */
    public static final a f125538M;

    /* renamed from: N  reason: collision with root package name */
    public static final int f125539N = 8;

    /* renamed from: O  reason: collision with root package name */
    private static final float[] f125540O;

    /* renamed from: A  reason: collision with root package name */
    private long f125541A;

    /* renamed from: B  reason: collision with root package name */
    private long f125542B;

    /* renamed from: C  reason: collision with root package name */
    private float f125543C;

    /* renamed from: D  reason: collision with root package name */
    private float f125544D;

    /* renamed from: E  reason: collision with root package name */
    private final int[] f125545E;

    /* renamed from: F  reason: collision with root package name */
    private int f125546F;

    /* renamed from: G  reason: collision with root package name */
    private int f125547G;

    /* renamed from: H  reason: collision with root package name */
    private int f125548H;

    /* renamed from: I  reason: collision with root package name */
    private float f125549I;

    /* renamed from: J  reason: collision with root package name */
    private float f125550J;

    /* renamed from: K  reason: collision with root package name */
    private int f125551K;

    /* renamed from: L  reason: collision with root package name */
    private final float[] f125552L;

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseInteractions f125553a;

    /* renamed from: b  reason: collision with root package name */
    private final t f125554b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f125555c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f125556d;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuffer f125557e = new StringBuffer();

    /* renamed from: f  reason: collision with root package name */
    private final StringBuffer f125558f = new StringBuffer();

    /* renamed from: g  reason: collision with root package name */
    private StringBuffer f125559g = new StringBuffer();

    /* renamed from: h  reason: collision with root package name */
    private final StringBuffer f125560h = new StringBuffer();

    /* renamed from: i  reason: collision with root package name */
    private final StringBuffer f125561i = new StringBuffer();

    /* renamed from: j  reason: collision with root package name */
    private final StringBuffer f125562j = new StringBuffer();

    /* renamed from: k  reason: collision with root package name */
    private final StringBuffer f125563k = new StringBuffer();

    /* renamed from: l  reason: collision with root package name */
    private final StringBuffer f125564l = new StringBuffer();

    /* renamed from: m  reason: collision with root package name */
    private final StringBuffer f125565m = new StringBuffer();

    /* renamed from: n  reason: collision with root package name */
    private final StringBuffer f125566n = new StringBuffer();

    /* renamed from: o  reason: collision with root package name */
    private final StringBuffer f125567o = new StringBuffer();

    /* renamed from: p  reason: collision with root package name */
    private final StringBuffer f125568p = new StringBuffer();

    /* renamed from: q  reason: collision with root package name */
    private final StringBuffer f125569q = new StringBuffer();

    /* renamed from: r  reason: collision with root package name */
    private final StringBuffer f125570r = new StringBuffer();

    /* renamed from: s  reason: collision with root package name */
    private final float[] f125571s = new float[16];

    /* renamed from: t  reason: collision with root package name */
    private final float[] f125572t = new float[16];

    /* renamed from: u  reason: collision with root package name */
    private final float[] f125573u = new float[9];

    /* renamed from: v  reason: collision with root package name */
    private String f125574v = "";

    /* renamed from: w  reason: collision with root package name */
    private Pose f125575w;

    /* renamed from: x  reason: collision with root package name */
    private Pose f125576x;

    /* renamed from: y  reason: collision with root package name */
    private Anchor f125577y;

    /* renamed from: z  reason: collision with root package name */
    private Anchor f125578z;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/Z$a;", "", "<init>", "()V", "", "dest", "e", "([F[F)[F", "d", "([F)[F", "Ljava/io/BufferedWriter;", "Ljava/lang/StringBuffer;", "sb", "", "buffer", "LXH/N;", "f", "(Ljava/io/BufferedWriter;Ljava/lang/StringBuffer;[C)V", "rotationTransform", "[F", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final float[] d(float[] fArr) {
            float f10 = fArr[1];
            fArr[1] = fArr[4];
            fArr[4] = f10;
            float f11 = fArr[2];
            fArr[2] = fArr[8];
            fArr[8] = f11;
            float f12 = fArr[3];
            fArr[3] = fArr[12];
            fArr[12] = f12;
            float f13 = fArr[6];
            fArr[6] = fArr[9];
            fArr[9] = f13;
            float f14 = fArr[7];
            fArr[7] = fArr[13];
            fArr[13] = f14;
            float f15 = fArr[11];
            fArr[11] = fArr[14];
            fArr[14] = f15;
            return fArr;
        }

        /* access modifiers changed from: private */
        public final float[] e(float[] fArr, float[] fArr2) {
            fArr2[0] = fArr[0];
            fArr2[5] = fArr[5];
            fArr2[10] = fArr[10];
            fArr2[15] = fArr[15];
            fArr2[1] = fArr[4];
            fArr2[4] = fArr[1];
            fArr2[2] = fArr[8];
            fArr2[8] = fArr[2];
            fArr2[3] = fArr[12];
            fArr2[12] = fArr[3];
            fArr2[6] = fArr[9];
            fArr2[9] = fArr[6];
            fArr2[7] = fArr[13];
            fArr2[13] = fArr[7];
            fArr2[11] = fArr[14];
            fArr2[14] = fArr[11];
            return fArr2;
        }

        /* access modifiers changed from: private */
        public final void f(BufferedWriter bufferedWriter, StringBuffer stringBuffer, char[] cArr) {
            int i10 = 0;
            while (i10 < stringBuffer.length()) {
                int min = Math.min(cArr.length + i10, stringBuffer.length());
                stringBuffer.getChars(i10, min, cArr, 0);
                bufferedWriter.write(cArr, 0, min - i10);
                i10 = min;
            }
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f125579a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f125580b;

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
                f125579a = r0
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
                f125580b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.Z.b.<clinit>():void");
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f125538M = aVar;
        f125540O = aVar.d(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }

    public Z(FirebaseInteractions firebaseInteractions, t tVar, boolean z10, boolean z11) {
        C17542s.j(firebaseInteractions, "firebase");
        C17542s.j(tVar, "moshi");
        this.f125553a = firebaseInteractions;
        this.f125554b = tVar;
        this.f125555c = z10;
        this.f125556d = z11;
        int[] iArr = new int[7];
        for (int i10 = 0; i10 < 7; i10++) {
            iArr[i10] = 0;
        }
        this.f125545E = iArr;
        this.f125549I = 1.0f;
        this.f125552L = new float[9];
    }

    public static /* synthetic */ int c(Z z10, Session session, Frame frame, C14294e eVar, float[] fArr, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            fArr = new float[3];
        }
        return z10.a(session, frame, eVar, fArr);
    }

    public static /* synthetic */ void d(Z z10, float[] fArr, float[] fArr2, long j10, C14294e eVar, int i10, float[] fArr3, int i11, Object obj) {
        z10.b(fArr, fArr2, j10, eVar, (i11 & 16) != 0 ? 0 : i10, (i11 & 32) != 0 ? new float[3] : fArr3);
    }

    private final void e(Session session, int i10) {
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
                Anchor anchor = this.f125578z;
                if (anchor != null) {
                    anchor.detach();
                }
                this.f125578z = null;
                Pose centerPose = ((Plane) arrayList.get(0)).getCenterPose();
                Anchor createAnchor = session.createAnchor(centerPose);
                this.f125578z = createAnchor;
                if (createAnchor != null) {
                    this.f125544D = ((float) (System.currentTimeMillis() - this.f125542B)) / 1000.0f;
                    String str = "floor createAnchor success (" + ((int) Math.abs(((double) (centerPose != null ? centerPose.ty() : 0.0f)) * 3.281d * ((double) 12))) + " inches,frame=" + i10 + ",planes=" + arrayList.size() + "," + this.f125544D + ")";
                    Log.d(AnyKt.SUGARCUBE_TAG, str);
                    C13868b.f118106a.b(str, e.Capture);
                }
            }
        } catch (Exception e10) {
            Log.e(AnyKt.SUGARCUBE_TAG, "failed to create floor anchor", e10);
            C13868b.f118106a.b("floor createAnchor failure: " + e10, e.Capture);
        }
    }

    private final void r(float[] fArr, float[] fArr2, float[] fArr3, float f10) {
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

    static /* synthetic */ void s(Z z10, float[] fArr, float[] fArr2, float[] fArr3, float f10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f10 = 1.0f;
        }
        z10.r(fArr, fArr2, fArr3, f10);
    }

    private final int u(TrackingState trackingState, TrackingFailureReason trackingFailureReason) {
        int i10 = b.f125580b[trackingState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            switch (b.f125579a[trackingFailureReason.ordinal()]) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0236, code lost:
        r12 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x023d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        jI.C17416c.a(r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0241, code lost:
        throw r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:47:0x0232, B:53:0x023c] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x028b A[Catch:{ Exception -> 0x0049, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x031e A[Catch:{ Exception -> 0x0049, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0332 A[Catch:{ Exception -> 0x0049, all -> 0x0017 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0366 A[Catch:{ Exception -> 0x0049, all -> 0x0017 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.google.ar.core.Session r12, com.google.ar.core.Frame r13, com.sugarcube.app.base.ui.ultrawide.C14294e r14, float[] r15) {
        /*
            r11 = this;
            java.lang.String r0 = "frame"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "sensorData"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            java.lang.String r0 = "angleChangeIn"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            monitor-enter(r11)
            int r0 = r11.f125551K     // Catch:{ all -> 0x0017 }
            if (r0 != 0) goto L_0x001a
            java.lang.String r0 = "["
            goto L_0x001c
        L_0x0017:
            r12 = move-exception
            goto L_0x0378
        L_0x001a:
            java.lang.String r0 = ","
        L_0x001c:
            com.google.ar.core.Camera r1 = r13.getCamera()     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = "getCamera(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)     // Catch:{ all -> 0x0017 }
            com.google.ar.core.Pose r2 = r1.getPose()     // Catch:{ all -> 0x0017 }
            r11.f125576x = r2     // Catch:{ all -> 0x0017 }
            com.google.ar.core.Pose r2 = r11.f125575w     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x00eb
            com.google.ar.core.TrackingState r2 = r1.getTrackingState()     // Catch:{ all -> 0x0017 }
            com.google.ar.core.TrackingState r3 = com.google.ar.core.TrackingState.TRACKING     // Catch:{ all -> 0x0017 }
            if (r2 != r3) goto L_0x00eb
            com.google.ar.core.Pose r2 = r11.f125576x     // Catch:{ all -> 0x0017 }
            r11.f125575w = r2     // Catch:{ all -> 0x0017 }
            boolean r2 = r11.f125555c     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x00eb
            if (r12 == 0) goto L_0x00eb
            com.google.ar.core.Anchor r2 = r11.f125577y     // Catch:{ Exception -> 0x0049 }
            if (r2 == 0) goto L_0x004b
            r2.detach()     // Catch:{ Exception -> 0x0049 }
            goto L_0x004b
        L_0x0049:
            r2 = move-exception
            goto L_0x00b1
        L_0x004b:
            com.google.ar.core.Pose r2 = r11.f125575w     // Catch:{ Exception -> 0x0049 }
            com.google.ar.core.Anchor r2 = r12.createAnchor(r2)     // Catch:{ Exception -> 0x0049 }
            r11.f125577y = r2     // Catch:{ Exception -> 0x0049 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0049 }
            long r4 = r11.f125541A     // Catch:{ Exception -> 0x0049 }
            long r2 = r2 - r4
            float r2 = (float) r2     // Catch:{ Exception -> 0x0049 }
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 / r3
            r11.f125543C = r2     // Catch:{ Exception -> 0x0049 }
            com.google.ar.core.Pose r2 = r11.f125576x     // Catch:{ Exception -> 0x0049 }
            if (r2 == 0) goto L_0x0069
            float r2 = r2.ty()     // Catch:{ Exception -> 0x0049 }
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            double r2 = (double) r2     // Catch:{ Exception -> 0x0049 }
            r4 = 4614570573988718707(0x400a3f7ced916873, double:3.281)
            double r2 = r2 * r4
            r4 = 12
            double r4 = (double) r4     // Catch:{ Exception -> 0x0049 }
            double r2 = r2 * r4
            double r2 = java.lang.Math.abs(r2)     // Catch:{ Exception -> 0x0049 }
            int r2 = (int) r2     // Catch:{ Exception -> 0x0049 }
            int r3 = r11.f125551K     // Catch:{ Exception -> 0x0049 }
            float r4 = r11.f125543C     // Catch:{ Exception -> 0x0049 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0049 }
            r5.<init>()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r6 = "pose.createAnchor ("
            r5.append(r6)     // Catch:{ Exception -> 0x0049 }
            r5.append(r2)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = "\","
            r5.append(r2)     // Catch:{ Exception -> 0x0049 }
            r5.append(r3)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = ","
            r5.append(r2)     // Catch:{ Exception -> 0x0049 }
            r5.append(r4)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = ")"
            r5.append(r2)     // Catch:{ Exception -> 0x0049 }
            java.lang.String r2 = r5.toString()     // Catch:{ Exception -> 0x0049 }
            java.lang.String r3 = "Sugarcube"
            android.util.Log.e(r3, r2)     // Catch:{ Exception -> 0x0049 }
            YE.b r3 = YE.C13868b.f118106a     // Catch:{ Exception -> 0x0049 }
            YE.e r4 = YE.e.Capture     // Catch:{ Exception -> 0x0049 }
            r3.b(r2, r4)     // Catch:{ Exception -> 0x0049 }
            goto L_0x00eb
        L_0x00b1:
            java.lang.String r3 = "Sugarcube"
            int r4 = r11.f125551K     // Catch:{ all -> 0x0017 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r5.<init>()     // Catch:{ all -> 0x0017 }
            java.lang.String r6 = "failed to create pose anchor "
            r5.append(r6)     // Catch:{ all -> 0x0017 }
            r5.append(r4)     // Catch:{ all -> 0x0017 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0017 }
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x0017 }
            YE.b r3 = YE.C13868b.f118106a     // Catch:{ all -> 0x0017 }
            int r4 = r11.f125551K     // Catch:{ all -> 0x0017 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0017 }
            r5.<init>()     // Catch:{ all -> 0x0017 }
            java.lang.String r6 = "createAnchor for pose failure ("
            r5.append(r6)     // Catch:{ all -> 0x0017 }
            r5.append(r4)     // Catch:{ all -> 0x0017 }
            java.lang.String r4 = "): "
            r5.append(r4)     // Catch:{ all -> 0x0017 }
            r5.append(r2)     // Catch:{ all -> 0x0017 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0017 }
            YE.e r4 = YE.e.Capture     // Catch:{ all -> 0x0017 }
            r3.b(r2, r4)     // Catch:{ all -> 0x0017 }
        L_0x00eb:
            boolean r2 = r11.f125556d     // Catch:{ all -> 0x0017 }
            if (r2 == 0) goto L_0x00fa
            com.google.ar.core.Anchor r2 = r11.f125578z     // Catch:{ all -> 0x0017 }
            if (r2 != 0) goto L_0x00fa
            if (r12 == 0) goto L_0x00fa
            int r2 = r11.f125551K     // Catch:{ all -> 0x0017 }
            r11.e(r12, r2)     // Catch:{ all -> 0x0017 }
        L_0x00fa:
            com.google.ar.core.Pose r12 = r11.f125576x     // Catch:{ all -> 0x0017 }
            r2 = 0
            if (r12 == 0) goto L_0x0104
            float[] r3 = r11.f125571s     // Catch:{ all -> 0x0017 }
            r12.toMatrix(r3, r2)     // Catch:{ all -> 0x0017 }
        L_0x0104:
            com.sugarcube.app.base.ui.ultrawide.Z$a r12 = f125538M     // Catch:{ all -> 0x0017 }
            float[] r3 = r11.f125571s     // Catch:{ all -> 0x0017 }
            float[] r4 = r11.f125572t     // Catch:{ all -> 0x0017 }
            float[] unused = r12.e(r3, r4)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r3 = r11.f125557e     // Catch:{ all -> 0x0017 }
            r3.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r4 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r5 = float[].class
            com.squareup.moshi.f r4 = r4.c(r5)     // Catch:{ all -> 0x0017 }
            float[] r5 = r11.f125572t     // Catch:{ all -> 0x0017 }
            java.lang.String r4 = r4.toJson(r5)     // Catch:{ all -> 0x0017 }
            r3.append(r4)     // Catch:{ all -> 0x0017 }
            float[] r3 = r11.f125571s     // Catch:{ all -> 0x0017 }
            r1.getViewMatrix(r3, r2)     // Catch:{ all -> 0x0017 }
            float[] r3 = r11.f125571s     // Catch:{ all -> 0x0017 }
            float[] r4 = r11.f125572t     // Catch:{ all -> 0x0017 }
            float[] unused = r12.e(r3, r4)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r3 = r11.f125558f     // Catch:{ all -> 0x0017 }
            r3.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r4 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r5 = float[].class
            com.squareup.moshi.f r4 = r4.c(r5)     // Catch:{ all -> 0x0017 }
            float[] r5 = r11.f125572t     // Catch:{ all -> 0x0017 }
            java.lang.String r4 = r4.toJson(r5)     // Catch:{ all -> 0x0017 }
            r3.append(r4)     // Catch:{ all -> 0x0017 }
            float[] r3 = r11.f125571s     // Catch:{ all -> 0x0017 }
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r5 = 1120403456(0x42c80000, float:100.0)
            r1.getProjectionMatrix(r3, r2, r4, r5)     // Catch:{ all -> 0x0017 }
            float[] r3 = r11.f125571s     // Catch:{ all -> 0x0017 }
            float[] r4 = r11.f125572t     // Catch:{ all -> 0x0017 }
            float[] unused = r12.e(r3, r4)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r12 = r11.f125559g     // Catch:{ all -> 0x0017 }
            r12.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r3 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r4 = float[].class
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0017 }
            float[] r4 = r11.f125572t     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r3.toJson(r4)     // Catch:{ all -> 0x0017 }
            r12.append(r3)     // Catch:{ all -> 0x0017 }
            com.google.ar.core.CameraIntrinsics r12 = r1.getImageIntrinsics()     // Catch:{ all -> 0x0017 }
            float[] r4 = r11.f125552L     // Catch:{ all -> 0x0017 }
            float[] r5 = r12.getFocalLength()     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "getFocalLength(...)"
            kotlin.jvm.internal.C17542s.i(r5, r3)     // Catch:{ all -> 0x0017 }
            float[] r6 = r12.getPrincipalPoint()     // Catch:{ all -> 0x0017 }
            java.lang.String r12 = "getPrincipalPoint(...)"
            kotlin.jvm.internal.C17542s.i(r6, r12)     // Catch:{ all -> 0x0017 }
            r8 = 8
            r9 = 0
            r7 = 0
            r3 = r11
            s(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r12 = r11.f125560h     // Catch:{ all -> 0x0017 }
            r12.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r3 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r4 = float[].class
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0017 }
            float[] r4 = r11.f125552L     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r3.toJson(r4)     // Catch:{ all -> 0x0017 }
            r12.append(r3)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r12 = r11.f125561i     // Catch:{ all -> 0x0017 }
            r12.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r3 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0017 }
            long r5 = r13.getTimestamp()     // Catch:{ all -> 0x0017 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r3.toJson(r5)     // Catch:{ all -> 0x0017 }
            r12.append(r3)     // Catch:{ all -> 0x0017 }
            com.google.ar.core.PointCloud r12 = r13.acquirePointCloud()     // Catch:{ all -> 0x0242 }
            long r5 = r12.getTimestamp()     // Catch:{ all -> 0x023a }
            java.nio.FloatBuffer r3 = r12.getPoints()     // Catch:{ all -> 0x023a }
            int r7 = r3.remaining()     // Catch:{ all -> 0x023a }
            float[] r8 = new float[r7]     // Catch:{ all -> 0x023a }
            r3.mark()     // Catch:{ all -> 0x0238 }
            r3.get(r8)     // Catch:{ all -> 0x0238 }
            r3.reset()     // Catch:{ all -> 0x0238 }
            java.nio.IntBuffer r3 = r12.getIds()     // Catch:{ all -> 0x0238 }
            int r9 = r3.remaining()     // Catch:{ all -> 0x0238 }
            int[] r9 = new int[r9]     // Catch:{ all -> 0x0238 }
            r3.mark()     // Catch:{ all -> 0x0238 }
            java.nio.IntBuffer r10 = r12.getIds()     // Catch:{ all -> 0x0238 }
            r10.get(r9)     // Catch:{ all -> 0x0238 }
            r3.reset()     // Catch:{ all -> 0x0238 }
            r12.release()     // Catch:{ all -> 0x0238 }
            java.lang.StringBuffer r3 = r11.f125562j     // Catch:{ all -> 0x0238 }
            r3.append(r0)     // Catch:{ all -> 0x0238 }
            com.squareup.moshi.t r10 = r11.f125554b     // Catch:{ all -> 0x0238 }
            com.squareup.moshi.f r4 = r10.c(r4)     // Catch:{ all -> 0x0238 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x0238 }
            java.lang.String r4 = r4.toJson(r5)     // Catch:{ all -> 0x0238 }
            r3.append(r4)     // Catch:{ all -> 0x0238 }
            java.lang.StringBuffer r3 = r11.f125563k     // Catch:{ all -> 0x0238 }
            r3.append(r0)     // Catch:{ all -> 0x0238 }
            com.squareup.moshi.t r4 = r11.f125554b     // Catch:{ all -> 0x0238 }
            java.lang.Class<float[]> r5 = float[].class
            com.squareup.moshi.f r4 = r4.c(r5)     // Catch:{ all -> 0x0238 }
            java.lang.String r4 = r4.toJson(r8)     // Catch:{ all -> 0x0238 }
            r3.append(r4)     // Catch:{ all -> 0x0238 }
            java.lang.StringBuffer r3 = r11.f125564l     // Catch:{ all -> 0x0238 }
            r3.append(r0)     // Catch:{ all -> 0x0238 }
            com.squareup.moshi.t r4 = r11.f125554b     // Catch:{ all -> 0x0238 }
            java.lang.Class<int[]> r5 = int[].class
            com.squareup.moshi.f r4 = r4.c(r5)     // Catch:{ all -> 0x0238 }
            java.lang.String r4 = r4.toJson(r9)     // Catch:{ all -> 0x0238 }
            r3.append(r4)     // Catch:{ all -> 0x0238 }
            r3 = 0
            jI.C17416c.a(r12, r3)     // Catch:{ all -> 0x0236 }
            goto L_0x0255
        L_0x0236:
            r12 = move-exception
            goto L_0x0244
        L_0x0238:
            r3 = move-exception
            goto L_0x023c
        L_0x023a:
            r3 = move-exception
            r7 = r2
        L_0x023c:
            throw r3     // Catch:{ all -> 0x023d }
        L_0x023d:
            r4 = move-exception
            jI.C17416c.a(r12, r3)     // Catch:{ all -> 0x0236 }
            throw r4     // Catch:{ all -> 0x0236 }
        L_0x0242:
            r12 = move-exception
            r7 = r2
        L_0x0244:
            java.lang.String r3 = "point cloud error"
            java.lang.String r4 = "Sugarcube"
            android.util.Log.e(r4, r3, r12)     // Catch:{ all -> 0x0017 }
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r4 = r11.f125553a     // Catch:{ all -> 0x0017 }
            r4.log(r3)     // Catch:{ all -> 0x0017 }
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r3 = r11.f125553a     // Catch:{ all -> 0x0017 }
            r3.recordException(r12)     // Catch:{ all -> 0x0017 }
        L_0x0255:
            com.google.ar.core.TrackingState r12 = r1.getTrackingState()     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "getTrackingState(...)"
            kotlin.jvm.internal.C17542s.i(r12, r3)     // Catch:{ all -> 0x0017 }
            com.google.ar.core.TrackingFailureReason r1 = r1.getTrackingFailureReason()     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = "getTrackingFailureReason(...)"
            kotlin.jvm.internal.C17542s.i(r1, r3)     // Catch:{ all -> 0x0017 }
            int r12 = r11.u(r12, r1)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r1 = r11.f125565m     // Catch:{ all -> 0x0017 }
            r1.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r3 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0017 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r3.toJson(r4)     // Catch:{ all -> 0x0017 }
            r1.append(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r11.f125574v     // Catch:{ all -> 0x0017 }
            int r1 = r1.length()     // Catch:{ all -> 0x0017 }
            if (r1 <= 0) goto L_0x02b8
            java.lang.StringBuffer r1 = r11.f125566n     // Catch:{ all -> 0x0017 }
            int r1 = r1.length()     // Catch:{ all -> 0x0017 }
            if (r1 != 0) goto L_0x0296
            java.lang.String r1 = "["
            goto L_0x0298
        L_0x0296:
            java.lang.String r1 = ","
        L_0x0298:
            int r3 = r11.f125551K     // Catch:{ all -> 0x0017 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x0017 }
            java.lang.String r4 = r11.f125574v     // Catch:{ all -> 0x0017 }
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4}     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r4 = r11.f125566n     // Catch:{ all -> 0x0017 }
            r4.append(r1)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r1 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class<java.lang.Object[]> r5 = java.lang.Object[].class
            com.squareup.moshi.f r1 = r1.c(r5)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r1.toJson(r3)     // Catch:{ all -> 0x0017 }
            r4.append(r1)     // Catch:{ all -> 0x0017 }
        L_0x02b8:
            float[] r1 = r14.b()     // Catch:{ all -> 0x0017 }
            float[] r1 = com.sugarcube.app.base.ui.ultrawide.q0.a(r1)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r3 = r11.f125568p     // Catch:{ all -> 0x0017 }
            r3.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r4 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r5 = float[].class
            com.squareup.moshi.f r4 = r4.c(r5)     // Catch:{ all -> 0x0017 }
            java.lang.String r1 = r4.toJson(r1)     // Catch:{ all -> 0x0017 }
            r3.append(r1)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r1 = r11.f125569q     // Catch:{ all -> 0x0017 }
            r1.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r3 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class r4 = java.lang.Long.TYPE     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0017 }
            long r4 = r14.a()     // Catch:{ all -> 0x0017 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x0017 }
            java.lang.String r3 = r3.toJson(r4)     // Catch:{ all -> 0x0017 }
            r1.append(r3)     // Catch:{ all -> 0x0017 }
            float[] r14 = r14.c()     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r1 = r11.f125570r     // Catch:{ all -> 0x0017 }
            r1.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r3 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r4 = float[].class
            com.squareup.moshi.f r3 = r3.c(r4)     // Catch:{ all -> 0x0017 }
            java.lang.String r14 = r3.toJson(r14)     // Catch:{ all -> 0x0017 }
            r1.append(r14)     // Catch:{ all -> 0x0017 }
            java.lang.StringBuffer r14 = r11.f125567o     // Catch:{ all -> 0x0017 }
            r14.append(r0)     // Catch:{ all -> 0x0017 }
            com.squareup.moshi.t r0 = r11.f125554b     // Catch:{ all -> 0x0017 }
            java.lang.Class<float[]> r1 = float[].class
            com.squareup.moshi.f r0 = r0.c(r1)     // Catch:{ all -> 0x0017 }
            java.lang.String r15 = r0.toJson(r15)     // Catch:{ all -> 0x0017 }
            r14.append(r15)     // Catch:{ all -> 0x0017 }
            if (r12 < 0) goto L_0x0323
            r14 = 7
            if (r12 < r14) goto L_0x0322
            goto L_0x0323
        L_0x0322:
            r2 = r12
        L_0x0323:
            int[] r12 = r11.f125545E     // Catch:{ all -> 0x0017 }
            r14 = r12[r2]     // Catch:{ all -> 0x0017 }
            int r14 = r14 + 1
            r12[r2] = r14     // Catch:{ all -> 0x0017 }
            int r12 = r11.f125546F     // Catch:{ all -> 0x0017 }
            int r12 = r12 + r7
            r11.f125546F = r12     // Catch:{ all -> 0x0017 }
            if (r7 != 0) goto L_0x0338
            int r12 = r11.f125547G     // Catch:{ all -> 0x0017 }
            int r12 = r12 + 1
            r11.f125547G = r12     // Catch:{ all -> 0x0017 }
        L_0x0338:
            float r12 = r11.f125549I     // Catch:{ all -> 0x0017 }
            com.google.ar.core.LightEstimate r14 = r13.getLightEstimate()     // Catch:{ all -> 0x0017 }
            float r14 = r14.getPixelIntensity()     // Catch:{ all -> 0x0017 }
            float r12 = java.lang.Math.min(r12, r14)     // Catch:{ all -> 0x0017 }
            r11.f125549I = r12     // Catch:{ all -> 0x0017 }
            float r12 = r11.f125550J     // Catch:{ all -> 0x0017 }
            com.google.ar.core.LightEstimate r14 = r13.getLightEstimate()     // Catch:{ all -> 0x0017 }
            float r14 = r14.getPixelIntensity()     // Catch:{ all -> 0x0017 }
            float r12 = java.lang.Math.max(r12, r14)     // Catch:{ all -> 0x0017 }
            r11.f125550J = r12     // Catch:{ all -> 0x0017 }
            com.google.ar.core.LightEstimate r12 = r13.getLightEstimate()     // Catch:{ all -> 0x0017 }
            float r12 = r12.getPixelIntensity()     // Catch:{ all -> 0x0017 }
            r13 = 1048576000(0x3e800000, float:0.25)
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 >= 0) goto L_0x036c
            int r12 = r11.f125548H     // Catch:{ all -> 0x0017 }
            int r12 = r12 + 1
            r11.f125548H = r12     // Catch:{ all -> 0x0017 }
        L_0x036c:
            java.lang.String r12 = ""
            r11.f125574v = r12     // Catch:{ all -> 0x0017 }
            int r12 = r11.f125551K     // Catch:{ all -> 0x0017 }
            int r12 = r12 + 1
            r11.f125551K = r12     // Catch:{ all -> 0x0017 }
            monitor-exit(r11)
            return r12
        L_0x0378:
            monitor-exit(r11)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.Z.a(com.google.ar.core.Session, com.google.ar.core.Frame, com.sugarcube.app.base.ui.ultrawide.e, float[]):int");
    }

    public final void b(float[] fArr, float[] fArr2, long j10, C14294e eVar, int i10, float[] fArr3) {
        float[] fArr4 = fArr2;
        int i11 = i10;
        float[] fArr5 = fArr3;
        C17542s.j(fArr4, "intrinsics");
        C17542s.j(eVar, "sensorData");
        C17542s.j(fArr5, "angleChangeIn");
        synchronized (this) {
            try {
                String str = this.f125551K == 0 ? "[" : ",";
                float[] fArr6 = new float[16];
                Matrix.multiplyMM(fArr6, 0, f125540O, 0, eVar.c(), 0);
                StringBuffer stringBuffer = this.f125557e;
                stringBuffer.append(str);
                stringBuffer.append(this.f125554b.c(float[].class).toJson(fArr == null ? fArr6 : fArr));
                for (int i12 = 0; i12 < 16; i12++) {
                    this.f125572t[i12] = 0.0f;
                }
                StringBuffer stringBuffer2 = this.f125558f;
                stringBuffer2.append(str);
                stringBuffer2.append(this.f125554b.c(float[].class).toJson(this.f125572t));
                StringBuffer stringBuffer3 = this.f125559g;
                stringBuffer3.append(str);
                stringBuffer3.append(this.f125554b.c(float[].class).toJson(this.f125572t));
                StringBuffer stringBuffer4 = this.f125560h;
                stringBuffer4.append(str);
                stringBuffer4.append(this.f125554b.c(float[].class).toJson(fArr4));
                StringBuffer stringBuffer5 = this.f125561i;
                stringBuffer5.append(str);
                t tVar = this.f125554b;
                Class cls = Long.TYPE;
                stringBuffer5.append(tVar.c(cls).toJson(Long.valueOf(j10)));
                StringBuffer stringBuffer6 = this.f125562j;
                stringBuffer6.append(str);
                stringBuffer6.append(this.f125554b.c(cls).toJson(Long.valueOf(j10)));
                StringBuffer stringBuffer7 = this.f125563k;
                stringBuffer7.append(str);
                stringBuffer7.append(this.f125554b.c(float[].class).toJson(new float[0]));
                StringBuffer stringBuffer8 = this.f125564l;
                stringBuffer8.append(str);
                stringBuffer8.append(this.f125554b.c(int[].class).toJson(new int[0]));
                StringBuffer stringBuffer9 = this.f125565m;
                stringBuffer9.append(str);
                stringBuffer9.append(this.f125554b.c(Integer.TYPE).toJson(Integer.valueOf(i10)));
                if (this.f125574v.length() > 0) {
                    String str2 = this.f125566n.length() == 0 ? "[" : ",";
                    Object[] objArr = {Integer.valueOf(this.f125551K), this.f125574v};
                    StringBuffer stringBuffer10 = this.f125566n;
                    stringBuffer10.append(str2);
                    stringBuffer10.append(this.f125554b.c(Object[].class).toJson(objArr));
                }
                float[] a10 = q0.a(eVar.b());
                StringBuffer stringBuffer11 = this.f125568p;
                stringBuffer11.append(str);
                stringBuffer11.append(this.f125554b.c(float[].class).toJson(a10));
                StringBuffer stringBuffer12 = this.f125569q;
                stringBuffer12.append(str);
                stringBuffer12.append(this.f125554b.c(cls).toJson(Long.valueOf(eVar.a())));
                StringBuffer stringBuffer13 = this.f125570r;
                stringBuffer13.append(str);
                stringBuffer13.append(this.f125554b.c(float[].class).toJson(fArr6));
                StringBuffer stringBuffer14 = this.f125567o;
                stringBuffer14.append(str);
                stringBuffer14.append(this.f125554b.c(float[].class).toJson(fArr5));
                if (i11 < 0 || i11 >= 7) {
                    i11 = 0;
                }
                int[] iArr = this.f125545E;
                iArr[i11] = iArr[i11] + 1;
                this.f125574v = "";
                this.f125551K++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int f() {
        return this.f125551K;
    }

    public final float g() {
        return this.f125544D;
    }

    public final int h() {
        return this.f125548H;
    }

    public final int i() {
        return this.f125547G;
    }

    public final float[] j() {
        return this.f125552L;
    }

    public final float[] k() {
        return new float[]{this.f125549I, this.f125550J};
    }

    public final int l() {
        return this.f125546F;
    }

    public final int[] m() {
        return this.f125545E;
    }

    public final boolean n() {
        return this.f125555c;
    }

    public final void o() {
        Log.d(AnyKt.SUGARCUBE_TAG, "resetAnchor");
        C13868b.f118106a.b("resetAnchor", e.Capture);
        synchronized (this) {
            try {
                Anchor anchor = this.f125577y;
                if (anchor != null) {
                    anchor.detach();
                }
                this.f125577y = null;
                this.f125575w = null;
                this.f125541A = System.currentTimeMillis();
                this.f125543C = 0.0f;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void p() {
        Log.d(AnyKt.SUGARCUBE_TAG, "resetFloorAnchor");
        C13868b.f118106a.b("resetFloorAnchor", e.Capture);
        synchronized (this) {
            try {
                Anchor anchor = this.f125578z;
                if (anchor != null) {
                    anchor.detach();
                }
                this.f125578z = null;
                this.f125542B = System.currentTimeMillis();
                this.f125544D = 0.0f;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bb, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        jI.C17416c.a(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bf, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(java.io.File r4) {
        /*
            r3 = this;
            java.lang.String r0 = "file"
            kotlin.jvm.internal.C17542s.j(r4, r0)
            monitor-enter(r3)
            java.lang.StringBuffer r0 = r3.f125566n     // Catch:{ all -> 0x0016 }
            int r0 = r0.length()     // Catch:{ all -> 0x0016 }
            if (r0 != 0) goto L_0x0019
            java.lang.StringBuffer r0 = r3.f125566n     // Catch:{ all -> 0x0016 }
            java.lang.String r1 = "["
            r0.append(r1)     // Catch:{ all -> 0x0016 }
            goto L_0x0019
        L_0x0016:
            r4 = move-exception
            goto L_0x00c0
        L_0x0019:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0016 }
            java.io.FileWriter r1 = new java.io.FileWriter     // Catch:{ all -> 0x0016 }
            r1.<init>(r4)     // Catch:{ all -> 0x0016 }
            r0.<init>(r1)     // Catch:{ all -> 0x0016 }
            r4 = 32768(0x8000, float:4.5918E-41)
            char[] r4 = new char[r4]     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = "{\"poses\":"
            r0.write(r1)     // Catch:{ all -> 0x00b9 }
            com.sugarcube.app.base.ui.ultrawide.Z$a r1 = f125538M     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125557e     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"viewMatrix\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125558f     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"projectionMatrix\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125559g     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"intrinsicsMatrix\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125560h     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"timestampsColor\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125561i     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"timestampsDepth\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125562j     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"pointCloud\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125563k     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"pointId\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125564l     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"trackingState\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125565m     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"state\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125566n     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"gravity\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125568p     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"timestampsGravity\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125569q     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "],\"rotationMatrix\":"
            r0.write(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.StringBuffer r2 = r3.f125570r     // Catch:{ all -> 0x00b9 }
            r1.f(r0, r2, r4)     // Catch:{ all -> 0x00b9 }
            java.lang.String r4 = "]}"
            r0.write(r4)     // Catch:{ all -> 0x00b9 }
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x00b9 }
            r4 = 0
            jI.C17416c.a(r0, r4)     // Catch:{ all -> 0x0016 }
            monitor-exit(r3)
            return
        L_0x00b9:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r1 = move-exception
            jI.C17416c.a(r0, r4)     // Catch:{ all -> 0x0016 }
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x00c0:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.Z.q(java.io.File):void");
    }

    public final void t(String str) {
        C17542s.j(str, "state");
        synchronized (this) {
            this.f125574v = str;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final boolean v() {
        boolean z10;
        synchronized (this) {
            z10 = this.f125577y != null;
        }
        return z10;
    }

    public final boolean w() {
        boolean z10;
        synchronized (this) {
            z10 = this.f125578z != null;
        }
        return z10;
    }
}
