package com.sugarcube.app.base.ui.hybrid;

import HJ.C15838d;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import XH.y;
import YE.C13868b;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.display.DisplayManager;
import android.media.Image;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.util.Log;
import android.view.WindowManager;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.google.ar.core.Config;
import com.google.ar.core.Frame;
import com.google.ar.core.RecordingConfig;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.Session;
import com.google.ar.core.Track;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.RecordingFailedException;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import eI.C17187b;
import fF.C14450b;
import fF.C14451c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.UUID;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.M;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bB\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0002\u0001\b\u0007\u0018\u0000 Y2\u00020\u0001:\u0001;B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J8\u0010!\u001a\u00020 2&\u0010\u001f\u001a\"\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001aj\u0004\u0018\u0001`\u001eH@¢\u0006\u0004\b!\u0010\"J7\u0010(\u001a\u00020\u000f2(\u0010'\u001a$\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u001aj\u0004\u0018\u0001`&¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020 ¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u0016¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u000f¢\u0006\u0004\b/\u0010\u0013J\r\u00100\u001a\u00020\u000f¢\u0006\u0004\b0\u0010\u0013J\r\u00101\u001a\u00020\u000f¢\u0006\u0004\b1\u0010\u0013J\r\u00102\u001a\u00020\u000f¢\u0006\u0004\b2\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\"\u0010D\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010\f\"\u0004\bB\u0010CR\"\u0010H\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bE\u0010@\u001a\u0004\bF\u0010\f\"\u0004\bG\u0010CR\"\u0010O\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010S\u001a\u00020\u00148\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bP\u0010J\u001a\u0004\bQ\u0010L\"\u0004\bR\u0010NR\"\u0010V\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bT\u0010@\u001a\u0004\bU\u0010\f\"\u0004\bJ\u0010CR\"\u0010Z\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bW\u0010@\u001a\u0004\bX\u0010\f\"\u0004\bY\u0010CR$\u0010a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R$\u0010h\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\"\u0010o\u001a\u00020i8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bj\u0010\u000b\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\"\u0010w\u001a\u00020p8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bq\u0010r\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vR\u001f\u0010}\u001a\n y*\u0004\u0018\u00010x0x8\u0006¢\u0006\f\n\u0004\b0\u0010z\u001a\u0004\b{\u0010|R5\u0010\u0001\u001a\u0010\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020i\u0018\u00010~8\u0006@\u0006X\u000e¢\u0006\u0016\n\u0004\b\u0010\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R8\u0010\u0001\u001a\"\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u001aj\u0004\u0018\u0001`\u001e8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b1\u0010\u0001R!\u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0012\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b2\u0010\u0001R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b5\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bX\u0010\u0001R\u001a\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u001a\u0010 \u0001\u001a\u0005\u0018\u00010\u00018\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R\u0018\u0010¡\u0001\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010JR\u0017\u0010¢\u0001\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010JR\u0017\u0010£\u0001\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bs\u0010JR\u0019\u0010¦\u0001\u001a\u00030¤\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b]\u0010¥\u0001R\u0017\u0010§\u0001\u001a\u00020\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bd\u0010JR\u0017\u0010ª\u0001\u001a\u00030¨\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bk\u0010©\u0001R)\u0010±\u0001\u001a\u00030«\u00018\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b9\u0010¬\u0001\u001a\u0006\b­\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R*\u0010´\u0001\u001a\u00030«\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010¬\u0001\u001a\u0006\b²\u0001\u0010®\u0001\"\u0006\b³\u0001\u0010°\u0001R\u0016\u0010¶\u0001\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000b\u0010µ\u0001R\u0016\u0010·\u0001\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010µ\u0001¨\u0006¸\u0001"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/o;", "", "Lcom/sugarcube/app/base/ui/hybrid/HybridActivity;", "activity", "Landroid/opengl/GLSurfaceView;", "surface", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebase", "<init>", "(Lcom/sugarcube/app/base/ui/hybrid/HybridActivity;Landroid/opengl/GLSurfaceView;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "", "F", "()Z", "Ljavax/microedition/khronos/egl/EGLConfig;", "config", "LXH/N;", "o", "(Ljavax/microedition/khronos/egl/EGLConfig;)V", "r", "()V", "", "type", "", "shaderCode", "G", "(ILjava/lang/String;)I", "Lkotlin/Function3;", "Lcom/google/ar/core/Session;", "Lcom/google/ar/core/Frame;", "Lcom/sugarcube/app/base/ui/hybrid/K0;", "Lcom/sugarcube/app/base/ui/hybrid/OnFrameUpdateListener;", "frameListener", "LQJ/F0;", "R", "(LnI/q;LdI/e;)Ljava/lang/Object;", "Lcom/sugarcube/app/base/ui/hybrid/M0;", "Landroid/media/Image;", "Landroid/hardware/camera2/TotalCaptureResult;", "Lcom/sugarcube/app/base/ui/hybrid/OnImageReadyListener;", "listener", "J", "(LnI/q;)V", "T", "()LQJ/F0;", "recordingPath", "S", "(Ljava/lang/String;)V", "U", "n", "p", "s", "a", "Lcom/sugarcube/app/base/ui/hybrid/HybridActivity;", "t", "()Lcom/sugarcube/app/base/ui/hybrid/HybridActivity;", "b", "Landroid/opengl/GLSurfaceView;", "D", "()Landroid/opengl/GLSurfaceView;", "c", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "y", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "d", "Z", "getSurfaceCreated", "N", "(Z)V", "surfaceCreated", "e", "getViewportChanged", "O", "viewportChanged", "f", "I", "getViewportWidth", "()I", "Q", "(I)V", "viewportWidth", "g", "getViewportHeight", "P", "viewportHeight", "h", "getHasSetTextureNames", "hasSetTextureNames", "i", "u", "H", "arcoreActive", "j", "Lcom/google/ar/core/Session;", "A", "()Lcom/google/ar/core/Session;", "K", "(Lcom/google/ar/core/Session;)V", "session", "k", "Lcom/sugarcube/app/base/ui/hybrid/M0;", "B", "()Lcom/sugarcube/app/base/ui/hybrid/M0;", "L", "(Lcom/sugarcube/app/base/ui/hybrid/M0;)V", "sharedCameraSession", "", "l", "C", "()F", "M", "(F)V", "sharedImageScale", "Lcom/sugarcube/app/base/ui/hybrid/i0;", "m", "Lcom/sugarcube/app/base/ui/hybrid/i0;", "z", "()Lcom/sugarcube/app/base/ui/hybrid/i0;", "setHybridSensor", "(Lcom/sugarcube/app/base/ui/hybrid/i0;)V", "hybridSensor", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "Ljava/util/UUID;", "getTrackUUID", "()Ljava/util/UUID;", "trackUUID", "LXH/v;", "LXH/v;", "v", "()LXH/v;", "setCameraFOV", "(LXH/v;)V", "cameraFOV", "LnI/q;", "onFrameUpdateListener", "Landroid/view/WindowManager;", "q", "LXH/o;", "E", "()Landroid/view/WindowManager;", "windowManager", "Landroid/hardware/display/DisplayManager;", "x", "()Landroid/hardware/display/DisplayManager;", "displayManager", "com/sugarcube/app/base/ui/hybrid/o$d", "Lcom/sugarcube/app/base/ui/hybrid/o$d;", "displayListener", "Landroid/hardware/camera2/CameraManager;", "w", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lcom/google/ar/core/TrackingState;", "Lcom/google/ar/core/TrackingState;", "previousTrackingState", "LfF/c;", "LfF/c;", "pointCloudRenderer", "LfF/b;", "LfF/b;", "planeRenderer", "program", "quadPositionParam", "quadTexCoordParam", "", "[I", "texture", "textureId", "", "[F", "quadCoords", "Ljava/nio/FloatBuffer;", "Ljava/nio/FloatBuffer;", "getQuadCoordsBuffer", "()Ljava/nio/FloatBuffer;", "setQuadCoordsBuffer", "(Ljava/nio/FloatBuffer;)V", "quadCoordsBuffer", "getQuadTexCoordsBuffer", "setQuadTexCoordsBuffer", "quadTexCoordsBuffer", "Ljava/lang/String;", "vertexShaderCode", "fragmentShaderCode", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.hybrid.o  reason: case insensitive filesystem */
public final class C14275o {

    /* renamed from: H  reason: collision with root package name */
    public static final c f125054H = new c((DefaultConstructorMarker) null);

    /* renamed from: I  reason: collision with root package name */
    public static final int f125055I = 8;

    /* renamed from: A  reason: collision with root package name */
    private int[] f125056A;

    /* renamed from: B  reason: collision with root package name */
    private int f125057B;

    /* renamed from: C  reason: collision with root package name */
    private final float[] f125058C;

    /* renamed from: D  reason: collision with root package name */
    private FloatBuffer f125059D;

    /* renamed from: E  reason: collision with root package name */
    private FloatBuffer f125060E;

    /* renamed from: F  reason: collision with root package name */
    private final String f125061F;

    /* renamed from: G  reason: collision with root package name */
    private final String f125062G;

    /* renamed from: a  reason: collision with root package name */
    private final HybridActivity f125063a;

    /* renamed from: b  reason: collision with root package name */
    private final GLSurfaceView f125064b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInteractions f125065c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f125066d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f125067e;

    /* renamed from: f  reason: collision with root package name */
    private int f125068f;

    /* renamed from: g  reason: collision with root package name */
    private int f125069g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f125070h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f125071i;

    /* renamed from: j  reason: collision with root package name */
    private Session f125072j;

    /* renamed from: k  reason: collision with root package name */
    private M0 f125073k;

    /* renamed from: l  reason: collision with root package name */
    private float f125074l = 1.0f;

    /* renamed from: m  reason: collision with root package name */
    private C14264i0 f125075m;

    /* renamed from: n  reason: collision with root package name */
    private final UUID f125076n;

    /* renamed from: o  reason: collision with root package name */
    private v<Float, Float> f125077o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public q<? super Session, ? super Frame, ? super K0, Integer> f125078p;

    /* renamed from: q  reason: collision with root package name */
    private final C16824o f125079q;

    /* renamed from: r  reason: collision with root package name */
    private final C16824o f125080r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final d f125081s;

    /* renamed from: t  reason: collision with root package name */
    private final C16824o f125082t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public TrackingState f125083u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C14451c f125084v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C14450b f125085w;

    /* renamed from: x  reason: collision with root package name */
    private int f125086x;

    /* renamed from: y  reason: collision with root package name */
    private int f125087y;

    /* renamed from: z  reason: collision with root package name */
    private int f125088z;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/sugarcube/app/base/ui/hybrid/o$a", "Landroid/opengl/GLSurfaceView$Renderer;", "Ljavax/microedition/khronos/opengles/GL10;", "gl", "Ljavax/microedition/khronos/egl/EGLConfig;", "config", "LXH/N;", "onSurfaceCreated", "(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V", "", "width", "height", "onSurfaceChanged", "(Ljavax/microedition/khronos/opengles/GL10;II)V", "onDrawFrame", "(Ljavax/microedition/khronos/opengles/GL10;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$a */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14275o f125089a;

        a(C14275o oVar) {
            this.f125089a = oVar;
        }

        public void onDrawFrame(GL10 gl10) {
            C17542s.j(gl10, "gl");
            GLES20.glClear(16640);
            if (this.f125089a.u()) {
                this.f125089a.r();
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            C17542s.j(gl10, "gl");
            this.f125089a.Q(i10);
            this.f125089a.P(i11);
            this.f125089a.O(true);
            GLES20.glViewport(0, 0, i10, i11);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C17542s.j(gl10, "gl");
            C17542s.j(eGLConfig, "config");
            GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
            this.f125089a.o(eGLConfig);
            this.f125089a.n();
            C14451c j10 = this.f125089a.f125084v;
            if (j10 != null) {
                j10.a(this.f125089a.t());
            }
            C14450b i10 = this.f125089a.f125085w;
            if (i10 != null) {
                i10.c(this.f125089a.t(), "models/trigrid.png");
            }
            this.f125089a.N(true);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/hybrid/o$b", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onResume", "(Landroidx/lifecycle/y;)V", "onPause", "onDestroy", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$b */
    public static final class b implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14275o f125090a;

        b(C14275o oVar) {
            this.f125090a = oVar;
        }

        public void onDestroy(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f125090a.p();
            super.onDestroy(yVar);
        }

        public void onPause(C5221y yVar) {
            C17542s.j(yVar, "owner");
            Log.d(AnyKt.SUGARCUBE_TAG, "HybridSurface onPause");
            this.f125090a.D().onPause();
            if (this.f125090a.u()) {
                Session A10 = this.f125090a.A();
                if (A10 != null) {
                    A10.pause();
                }
                this.f125090a.H(false);
                M0 B10 = this.f125090a.B();
                if (B10 != null) {
                    B10.j();
                }
            }
            this.f125090a.z().y();
            this.f125090a.x().unregisterDisplayListener(this.f125090a.f125081s);
        }

        public void onResume(C5221y yVar) {
            C17542s.j(yVar, "owner");
            Log.d(AnyKt.SUGARCUBE_TAG, "HybridSurface onResume");
            this.f125090a.I(false);
            Session A10 = this.f125090a.A();
            if (A10 != null) {
                C14275o oVar = this.f125090a;
                if (!oVar.u()) {
                    A10.resume();
                    oVar.H(true);
                    M0 B10 = oVar.B();
                    if (B10 != null) {
                        B10.k();
                    }
                }
            }
            this.f125090a.D().onResume();
            C14264i0.w(this.f125090a.z(), 0, (C17631a) null, 3, (Object) null);
            this.f125090a.x().registerDisplayListener(this.f125090a.f125081s, (Handler) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/sugarcube/app/base/ui/hybrid/o$c;", "", "<init>", "()V", "", "COORDS_PER_VERTEX", "I", "TEXCOORDS_PER_VERTEX", "FLOAT_SIZE", "NUMBER_VERTICES", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/hybrid/o$d", "Landroid/hardware/display/DisplayManager$DisplayListener;", "", "displayId", "LXH/N;", "onDisplayAdded", "(I)V", "onDisplayRemoved", "onDisplayChanged", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$d */
    public static final class d implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14275o f125091a;

        d(C14275o oVar) {
            this.f125091a = oVar;
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            this.f125091a.O(true);
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$drawARFrame$1$5", f = "HybridARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125092c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ M f125093d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14275o f125094e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ TrackingFailureReason f125095f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(M m10, C14275o oVar, TrackingFailureReason trackingFailureReason, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f125093d = m10;
            this.f125094e = oVar;
            this.f125095f = trackingFailureReason;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f125093d, this.f125094e, this.f125095f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125092c == 0) {
                y.b(obj);
                C13868b bVar = C13868b.f118106a;
                int i10 = this.f125093d.f144346a;
                TrackingState k10 = this.f125094e.f125083u;
                TrackingFailureReason trackingFailureReason = this.f125095f;
                bVar.b("Tracking changed [" + i10 + "](" + k10 + "," + trackingFailureReason + ")", YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$drawARFrame$2", f = "HybridARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125096c;

        f(C17164e<? super f> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125096c == 0) {
                y.b(obj);
                C13868b.f118106a.b("error processing frame", YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$isCameraRotated$1$1$1", f = "HybridARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125097c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f125098d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f125099e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f125100f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(boolean z10, int i10, int i11, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f125098d = z10;
            this.f125099e = i10;
            this.f125100f = i11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f125098d, this.f125099e, this.f125100f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125097c == 0) {
                y.b(obj);
                C13868b bVar = C13868b.f118106a;
                boolean z10 = this.f125098d;
                int i10 = this.f125099e;
                int i11 = this.f125100f;
                bVar.b("isCameraRotated(" + z10 + ") " + i10 + " " + i11, YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$startAR$2", f = "HybridARSurface.kt", l = {235}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$h */
    static final class h extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f125101c;

        /* renamed from: d  reason: collision with root package name */
        Object f125102d;

        /* renamed from: e  reason: collision with root package name */
        Object f125103e;

        /* renamed from: f  reason: collision with root package name */
        Object f125104f;

        /* renamed from: g  reason: collision with root package name */
        Object f125105g;

        /* renamed from: h  reason: collision with root package name */
        Object f125106h;

        /* renamed from: i  reason: collision with root package name */
        Object f125107i;

        /* renamed from: j  reason: collision with root package name */
        Object f125108j;

        /* renamed from: k  reason: collision with root package name */
        int f125109k;

        /* renamed from: l  reason: collision with root package name */
        int f125110l;

        /* renamed from: m  reason: collision with root package name */
        int f125111m;

        /* renamed from: n  reason: collision with root package name */
        final /* synthetic */ C14275o f125112n;

        /* renamed from: o  reason: collision with root package name */
        final /* synthetic */ q<Session, Frame, K0, Integer> f125113o;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$startAR$2$2", f = "HybridARSurface.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.hybrid.o$h$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f125114c;

            a(C17164e<? super a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f125114c == 0) {
                    y.b(obj);
                    C13868b.f118106a.b("error startAR", YE.e.Capture);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$startAR$2$3$3", f = "HybridARSurface.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.hybrid.o$h$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f125115c;

            b(C17164e<? super b> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f125115c == 0) {
                    y.b(obj);
                    C13868b.f118106a.b("error sharedcamera", YE.e.Capture);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C14275o oVar, q<? super Session, ? super Frame, ? super K0, Integer> qVar, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f125112n = oVar;
            this.f125113o = qVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f125112n, this.f125113o, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C14275o oVar;
            Session session;
            C14275o oVar2;
            Object obj2;
            M0 m02;
            C14275o oVar3;
            C14275o oVar4;
            Object f10 = C17187b.f();
            int i10 = this.f125111m;
            if (i10 == 0) {
                y.b(obj);
                boolean u10 = this.f125112n.u();
                Session A10 = this.f125112n.A();
                Log.d(AnyKt.SUGARCUBE_TAG, "startAR " + u10 + " " + A10);
                this.f125112n.H(false);
                Session A11 = this.f125112n.A();
                if (A11 != null) {
                    this.f125112n.K((Session) null);
                    A11.close();
                }
                this.f125112n.f125078p = this.f125113o;
                try {
                    C14275o oVar5 = this.f125112n;
                    oVar5.K(new Session(oVar5.t(), EnumSet.of(Session.Feature.SHARED_CAMERA)));
                } catch (Exception e10) {
                    F0 unused = C16314k.d(C5222z.a(this.f125112n.t()), C16311i0.b(), (T) null, new a((C17164e<? super a>) null), 2, (Object) null);
                    FirebaseInteractions y10 = this.f125112n.y();
                    UUID y12 = this.f125112n.t().K0().y1();
                    y10.log("error startAR " + y12);
                    this.f125112n.y().recordException(e10);
                    E0 K02 = this.f125112n.t().K0();
                    String message = e10.getMessage();
                    K02.D1("startAR exception " + message);
                }
                session = this.f125112n.A();
                if (session != null) {
                    C14275o oVar6 = this.f125112n;
                    boolean u11 = oVar6.u();
                    Log.d(AnyKt.SUGARCUBE_TAG, "create session " + u11 + " " + session);
                    Config config = session.getConfig();
                    config.setFocusMode(Config.FocusMode.AUTO);
                    session.configure(config);
                    if (session.getCameraConfig().getFpsRange().getLower().intValue() > 30) {
                        CameraConfigFilter targetFps = new CameraConfigFilter(session).setTargetFps(EnumSet.of(CameraConfig.TargetFps.TARGET_FPS_30));
                        C17542s.i(targetFps, "setTargetFps(...)");
                        Iterator<CameraConfig> it = session.getSupportedCameraConfigs(targetFps).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            CameraConfig next = it.next();
                            if (C17542s.e(next.getTextureSize(), session.getCameraConfig().getTextureSize()) && C17542s.e(next.getImageSize(), session.getCameraConfig().getImageSize())) {
                                session.setCameraConfig(next);
                                break;
                            }
                        }
                    }
                    boolean u12 = oVar6.u();
                    Log.d(AnyKt.SUGARCUBE_TAG, "create shared camera session " + u12 + " " + session);
                    try {
                        M0 m03 = new M0(session, oVar6.w(), oVar6.y());
                        this.f125101c = session;
                        this.f125102d = session;
                        this.f125103e = oVar6;
                        this.f125104f = session;
                        this.f125105g = m03;
                        this.f125106h = m03;
                        this.f125107i = oVar6;
                        this.f125108j = oVar6;
                        this.f125109k = 0;
                        this.f125110l = 0;
                        this.f125111m = 1;
                        obj2 = m03.g(this);
                        if (obj2 == f10) {
                            return f10;
                        }
                        oVar3 = oVar6;
                        oVar = oVar3;
                        m02 = m03;
                        oVar4 = oVar;
                    } catch (Throwable th2) {
                        th = th2;
                        oVar2 = oVar6;
                        F0 unused2 = C16314k.d(C5222z.a(oVar2.t()), C16311i0.b(), (T) null, new b((C17164e<? super b>) null), 2, (Object) null);
                        FirebaseInteractions y11 = oVar2.y();
                        UUID y13 = oVar2.t().K0().y1();
                        y11.log("error sharedcamera " + y13);
                        oVar2.y().recordException(th);
                        E0 K03 = oVar2.t().K0();
                        String message2 = th.getMessage();
                        K03.D1("startAR throwable " + message2);
                        oVar = oVar2;
                        oVar.I(false);
                        session.resume();
                        oVar.H(true);
                        boolean u13 = this.f125112n.u();
                        Session A12 = this.f125112n.A();
                        Log.d(AnyKt.SUGARCUBE_TAG, "create session done " + u13 + " " + A12);
                        return C16807N.f139792a;
                    }
                }
                boolean u132 = this.f125112n.u();
                Session A122 = this.f125112n.A();
                Log.d(AnyKt.SUGARCUBE_TAG, "create session done " + u132 + " " + A122);
                return C16807N.f139792a;
            } else if (i10 == 1) {
                oVar4 = (C14275o) this.f125108j;
                oVar3 = (C14275o) this.f125107i;
                M0 m04 = (M0) this.f125106h;
                m02 = (M0) this.f125105g;
                session = (Session) this.f125104f;
                oVar2 = (C14275o) this.f125103e;
                Session session2 = (Session) this.f125102d;
                Session session3 = (Session) this.f125101c;
                try {
                    y.b(obj);
                    oVar = oVar2;
                    obj2 = obj;
                } catch (Throwable th3) {
                    th = th3;
                    F0 unused3 = C16314k.d(C5222z.a(oVar2.t()), C16311i0.b(), (T) null, new b((C17164e<? super b>) null), 2, (Object) null);
                    FirebaseInteractions y112 = oVar2.y();
                    UUID y132 = oVar2.t().K0().y1();
                    y112.log("error sharedcamera " + y132);
                    oVar2.y().recordException(th);
                    E0 K032 = oVar2.t().K0();
                    String message22 = th.getMessage();
                    K032.D1("startAR throwable " + message22);
                    oVar = oVar2;
                    oVar.I(false);
                    session.resume();
                    oVar.H(true);
                    boolean u1322 = this.f125112n.u();
                    Session A1222 = this.f125112n.A();
                    Log.d(AnyKt.SUGARCUBE_TAG, "create session done " + u1322 + " " + A1222);
                    return C16807N.f139792a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                oVar4.M(((Number) obj2).floatValue());
                oVar3.L(m02);
            } catch (Throwable th4) {
                th = th4;
                oVar2 = oVar;
            }
            oVar.I(false);
            session.resume();
            oVar.H(true);
            boolean u13222 = this.f125112n.u();
            Session A12222 = this.f125112n.A();
            Log.d(AnyKt.SUGARCUBE_TAG, "create session done " + u13222 + " " + A12222);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$startRecording$1$1", f = "HybridARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$i */
    static final class i extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125116c;

        i(C17164e<? super i> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125116c == 0) {
                y.b(obj);
                C13868b.f118106a.b("error startRecording", YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$stopAR$1", f = "HybridARSurface.kt", l = {280, 285}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$j */
    static final class j extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f125117c;

        /* renamed from: d  reason: collision with root package name */
        int f125118d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14275o f125119e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(C14275o oVar, C17164e<? super j> eVar) {
            super(2, eVar);
            this.f125119e = oVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new j(this.f125119e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0084  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f125118d
                r2 = 0
                r3 = 200(0xc8, double:9.9E-322)
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r6) goto L_0x0021
                if (r1 != r5) goto L_0x0019
                java.lang.Object r0 = r9.f125117c
                com.sugarcube.app.base.ui.hybrid.M0 r0 = (com.sugarcube.app.base.ui.hybrid.M0) r0
                XH.y.b(r10)
                goto L_0x007c
            L_0x0019:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x0021:
                XH.y.b(r10)
                goto L_0x0061
            L_0x0025:
                XH.y.b(r10)
                com.sugarcube.app.base.ui.hybrid.o r10 = r9.f125119e
                boolean r10 = r10.u()
                com.sugarcube.app.base.ui.hybrid.o r1 = r9.f125119e
                com.google.ar.core.Session r1 = r1.A()
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = "stopAR "
                r7.append(r8)
                r7.append(r10)
                java.lang.String r10 = " "
                r7.append(r10)
                r7.append(r1)
                java.lang.String r10 = r7.toString()
                java.lang.String r1 = "Sugarcube"
                android.util.Log.d(r1, r10)
                com.sugarcube.app.base.ui.hybrid.o r10 = r9.f125119e
                r1 = 0
                r10.H(r1)
                r9.f125118d = r6
                java.lang.Object r10 = QJ.C16297b0.b(r3, r9)
                if (r10 != r0) goto L_0x0061
                return r0
            L_0x0061:
                com.sugarcube.app.base.ui.hybrid.o r10 = r9.f125119e
                com.sugarcube.app.base.ui.hybrid.M0 r10 = r10.B()
                if (r10 == 0) goto L_0x0071
                com.sugarcube.app.base.ui.hybrid.o r1 = r9.f125119e
                r1.L(r2)
                r10.d()
            L_0x0071:
                r9.f125117c = r10
                r9.f125118d = r5
                java.lang.Object r10 = QJ.C16297b0.b(r3, r9)
                if (r10 != r0) goto L_0x007c
                return r0
            L_0x007c:
                com.sugarcube.app.base.ui.hybrid.o r10 = r9.f125119e
                com.google.ar.core.Session r10 = r10.A()
                if (r10 == 0) goto L_0x008c
                com.sugarcube.app.base.ui.hybrid.o r0 = r9.f125119e
                r0.K(r2)
                r10.close()
            L_0x008c:
                XH.N r10 = XH.C16807N.f139792a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.C14275o.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.hybrid.HybridARSurface$stopRecording$1$1", f = "HybridARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.hybrid.o$k */
    static final class k extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125120c;

        k(C17164e<? super k> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125120c == 0) {
                y.b(obj);
                C13868b.f118106a.b("error stopRecording", YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C14275o(HybridActivity hybridActivity, GLSurfaceView gLSurfaceView, FirebaseInteractions firebaseInteractions) {
        C17542s.j(hybridActivity, "activity");
        C17542s.j(gLSurfaceView, "surface");
        C17542s.j(firebaseInteractions, "firebase");
        this.f125063a = hybridActivity;
        this.f125064b = gLSurfaceView;
        this.f125065c = firebaseInteractions;
        this.f125075m = new C14264i0(hybridActivity);
        this.f125076n = UUID.fromString("bb2ac08f-d497-4b04-aa2e-72162dd539c5");
        this.f125079q = C16825p.b(new C14269l(this));
        this.f125080r = C16825p.b(new C14271m(this));
        this.f125081s = new d(this);
        this.f125082t = C16825p.b(new C14273n(this));
        this.f125083u = TrackingState.TRACKING;
        C14450b bVar = null;
        this.f125084v = hybridActivity.K0().h1() ? new C14451c() : null;
        this.f125085w = hybridActivity.K0().g1() ? new C14450b() : bVar;
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        gLSurfaceView.setRenderer(new a(this));
        gLSurfaceView.setRenderMode(1);
        gLSurfaceView.setWillNotDraw(false);
        hybridActivity.getLifecycle().c(new b(this));
        this.f125056A = new int[1];
        this.f125057B = -1;
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f125058C = fArr;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        C17542s.i(asFloatBuffer, "run(...)");
        this.f125059D = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.position(0);
        C17542s.i(asFloatBuffer2, "run(...)");
        this.f125060E = asFloatBuffer2;
        this.f125061F = "attribute vec4 a_Position;attribute vec2 a_TexCoord;varying vec2 v_TexCoord;void main() {  gl_Position = a_Position;  v_TexCoord = a_TexCoord;}";
        this.f125062G = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 v_TexCoord;uniform samplerExternalOES sTexture;void main() {  gl_FragColor = texture2D(sTexture, v_TexCoord);}";
    }

    private final WindowManager E() {
        return (WindowManager) this.f125079q.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079 A[Catch:{ CameraAccessException -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[Catch:{ CameraAccessException -> 0x002a }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean F() {
        /*
            r12 = this;
            com.google.ar.core.Session r0 = r12.f125072j
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00bc
            com.google.ar.core.CameraConfig r0 = r0.getCameraConfig()     // Catch:{ CameraAccessException -> 0x002a }
            java.lang.String r0 = r0.getCameraId()     // Catch:{ CameraAccessException -> 0x002a }
            android.hardware.camera2.CameraManager r3 = r12.w()     // Catch:{ CameraAccessException -> 0x002a }
            android.hardware.camera2.CameraCharacteristics r0 = r3.getCameraCharacteristics(r0)     // Catch:{ CameraAccessException -> 0x002a }
            java.lang.String r3 = "getCameraCharacteristics(...)"
            kotlin.jvm.internal.C17542s.i(r0, r3)     // Catch:{ CameraAccessException -> 0x002a }
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ CameraAccessException -> 0x002a }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ CameraAccessException -> 0x002a }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ CameraAccessException -> 0x002a }
            if (r0 == 0) goto L_0x002d
            int r0 = r0.intValue()     // Catch:{ CameraAccessException -> 0x002a }
            goto L_0x002e
        L_0x002a:
            r0 = move-exception
            goto L_0x0093
        L_0x002d:
            r0 = r2
        L_0x002e:
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ CameraAccessException -> 0x002a }
            r4 = 30
            if (r3 < r4) goto L_0x0041
            android.view.WindowManager r3 = r12.E()     // Catch:{ CameraAccessException -> 0x002a }
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ CameraAccessException -> 0x002a }
            int r3 = r3.getRotation()     // Catch:{ CameraAccessException -> 0x002a }
            goto L_0x004d
        L_0x0041:
            android.view.WindowManager r3 = r12.E()     // Catch:{ CameraAccessException -> 0x002a }
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ CameraAccessException -> 0x002a }
            int r3 = r3.getRotation()     // Catch:{ CameraAccessException -> 0x002a }
        L_0x004d:
            if (r3 == 0) goto L_0x006d
            if (r3 == r1) goto L_0x0075
            r4 = 2
            if (r3 == r4) goto L_0x0072
            r4 = 3
            if (r3 == r4) goto L_0x006f
            java.lang.String r4 = "Sugarcube"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x002a }
            r5.<init>()     // Catch:{ CameraAccessException -> 0x002a }
            java.lang.String r6 = "Invalid value, display rotation="
            r5.append(r6)     // Catch:{ CameraAccessException -> 0x002a }
            r5.append(r3)     // Catch:{ CameraAccessException -> 0x002a }
            java.lang.String r3 = r5.toString()     // Catch:{ CameraAccessException -> 0x002a }
            android.util.Log.d(r4, r3)     // Catch:{ CameraAccessException -> 0x002a }
        L_0x006d:
            r3 = r2
            goto L_0x0077
        L_0x006f:
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x0077
        L_0x0072:
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x0077
        L_0x0075:
            r3 = 90
        L_0x0077:
            if (r0 == r3) goto L_0x007b
            r4 = r1
            goto L_0x007c
        L_0x007b:
            r4 = r2
        L_0x007c:
            com.sugarcube.app.base.ui.hybrid.HybridActivity r5 = r12.f125063a     // Catch:{ CameraAccessException -> 0x002a }
            androidx.lifecycle.s r6 = androidx.lifecycle.C5222z.a(r5)     // Catch:{ CameraAccessException -> 0x002a }
            QJ.M r7 = QJ.C16311i0.b()     // Catch:{ CameraAccessException -> 0x002a }
            com.sugarcube.app.base.ui.hybrid.o$g r9 = new com.sugarcube.app.base.ui.hybrid.o$g     // Catch:{ CameraAccessException -> 0x002a }
            r5 = 0
            r9.<init>(r4, r3, r0, r5)     // Catch:{ CameraAccessException -> 0x002a }
            r10 = 2
            r11 = 0
            r8 = 0
            QJ.F0 unused = QJ.C16314k.d(r6, r7, r8, r9, r10, r11)     // Catch:{ CameraAccessException -> 0x002a }
            goto L_0x00b9
        L_0x0093:
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r3 = r12.f125065c
            com.sugarcube.app.base.ui.hybrid.HybridActivity r4 = r12.f125063a
            com.sugarcube.app.base.ui.hybrid.E0 r4 = r4.K0()
            java.util.UUID r4 = r4.y1()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "error isCameraRotated "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.log(r4)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r3 = r12.f125065c
            r3.recordException(r0)
            r4 = r1
        L_0x00b9:
            if (r4 != 0) goto L_0x00bc
            r2 = r1
        L_0x00bc:
            r0 = r2 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.C14275o.F():boolean");
    }

    private final int G(int i10, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.d(AnyKt.SUGARCUBE_TAG, "compile error");
        }
        return glCreateShader;
    }

    /* access modifiers changed from: private */
    public static final WindowManager V(C14275o oVar) {
        Object systemService = oVar.f125063a.getSystemService("window");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    /* access modifiers changed from: private */
    public static final CameraManager m(C14275o oVar) {
        Object systemService = oVar.f125063a.getSystemService("camera");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    /* access modifiers changed from: private */
    public final void o(EGLConfig eGLConfig) {
        try {
            EGL egl = EGLContext.getEGL();
            C17542s.h(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            int[] iArr = new int[2];
            egl10.eglGetConfigAttrib(egl10.eglGetCurrentDisplay(), eGLConfig, 12328, iArr);
            EGL14.eglChooseConfig(EGL14.eglGetCurrentDisplay(), new int[]{12328, iArr[0], 12344}, 0, new android.opengl.EGLConfig[1], 0, 1, iArr, 1);
        } catch (IOException e10) {
            FirebaseInteractions firebaseInteractions = this.f125065c;
            UUID y12 = this.f125063a.K0().y1();
            firebaseInteractions.log("error createOnGlThread " + y12);
            Log.e(AnyKt.SUGARCUBE_TAG, "Failed to read an asset file", e10);
        }
    }

    /* access modifiers changed from: private */
    public static final DisplayManager q(C14275o oVar) {
        Object systemService = oVar.f125063a.getSystemService("display");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        return (DisplayManager) systemService;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:24|(7:26|27|28|29|30|31|32)|40|41|(1:43)|44|(1:46)|47|(3:49|50|51)|55|(1:57)|58|61) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b6, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        jI.C17416c.a(r3, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ba, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00bb */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf A[Catch:{ IllegalStateException -> 0x0106, all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00d9 A[Catch:{ IllegalStateException -> 0x0106, all -> 0x0026 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0142 A[Catch:{ IllegalStateException -> 0x0106, all -> 0x0026 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r() {
        /*
            r11 = this;
            boolean r0 = r11.f125071i
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.google.ar.core.Session r0 = r11.f125072j
            if (r0 != 0) goto L_0x000a
            return
        L_0x000a:
            r1 = 0
            boolean r2 = r11.f125067e     // Catch:{ all -> 0x0026 }
            r3 = 0
            if (r2 == 0) goto L_0x0029
            android.view.WindowManager r2 = r11.E()     // Catch:{ all -> 0x0026 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ all -> 0x0026 }
            int r2 = r2.getRotation()     // Catch:{ all -> 0x0026 }
            int r4 = r11.f125068f     // Catch:{ all -> 0x0026 }
            int r5 = r11.f125069g     // Catch:{ all -> 0x0026 }
            r0.setDisplayGeometry(r2, r4, r5)     // Catch:{ all -> 0x0026 }
            r11.f125067e = r3     // Catch:{ all -> 0x0026 }
            goto L_0x0029
        L_0x0026:
            r0 = move-exception
            goto L_0x0188
        L_0x0029:
            boolean r2 = r11.f125070h     // Catch:{ all -> 0x0026 }
            java.lang.String r4 = "Sugarcube"
            if (r2 != 0) goto L_0x004d
            int r2 = r11.f125057B     // Catch:{ all -> 0x0026 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r5.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "Set Camera Texture name "
            r5.append(r6)     // Catch:{ all -> 0x0026 }
            r5.append(r2)     // Catch:{ all -> 0x0026 }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x0026 }
            android.util.Log.d(r4, r2)     // Catch:{ all -> 0x0026 }
            int r2 = r11.f125057B     // Catch:{ all -> 0x0026 }
            r0.setCameraTextureName(r2)     // Catch:{ all -> 0x0026 }
            r2 = 1
            r11.f125070h = r2     // Catch:{ all -> 0x0026 }
        L_0x004d:
            com.google.ar.core.Frame r2 = r0.update()     // Catch:{ all -> 0x0026 }
            boolean r5 = r2.hasDisplayGeometryChanged()     // Catch:{ all -> 0x0026 }
            if (r5 == 0) goto L_0x0079
            com.google.ar.core.Coordinates2d r5 = com.google.ar.core.Coordinates2d.OPENGL_NORMALIZED_DEVICE_COORDINATES     // Catch:{ all -> 0x0026 }
            java.nio.FloatBuffer r6 = r11.f125059D     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Coordinates2d r7 = com.google.ar.core.Coordinates2d.TEXTURE_NORMALIZED     // Catch:{ all -> 0x0026 }
            java.nio.FloatBuffer r8 = r11.f125060E     // Catch:{ all -> 0x0026 }
            r2.transformCoordinates2d((com.google.ar.core.Coordinates2d) r5, (java.nio.FloatBuffer) r6, (com.google.ar.core.Coordinates2d) r7, (java.nio.FloatBuffer) r8)     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Camera r5 = r2.getCamera()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.CameraIntrinsics r5 = r5.getTextureIntrinsics()     // Catch:{ all -> 0x0026 }
            java.lang.String r6 = "getTextureIntrinsics(...)"
            kotlin.jvm.internal.C17542s.i(r5, r6)     // Catch:{ all -> 0x0026 }
            boolean r6 = r11.F()     // Catch:{ all -> 0x0026 }
            XH.v r5 = PE.C13341c.c(r5, r6)     // Catch:{ all -> 0x0026 }
            r11.f125077o = r5     // Catch:{ all -> 0x0026 }
        L_0x0079:
            long r5 = r2.getTimestamp()     // Catch:{ all -> 0x0026 }
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L_0x0084
            return
        L_0x0084:
            r11.s()     // Catch:{ all -> 0x0026 }
            r5 = 16
            float[] r6 = new float[r5]     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Camera r7 = r2.getCamera()     // Catch:{ all -> 0x0026 }
            r8 = 1036831949(0x3dcccccd, float:0.1)
            r9 = 1120403456(0x42c80000, float:100.0)
            r7.getProjectionMatrix(r6, r3, r8, r9)     // Catch:{ all -> 0x0026 }
            fF.c r7 = r11.f125084v     // Catch:{ all -> 0x0026 }
            if (r7 == 0) goto L_0x00bb
            float[] r5 = new float[r5]     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Camera r8 = r2.getCamera()     // Catch:{ all -> 0x0026 }
            r8.getViewMatrix(r5, r3)     // Catch:{ all -> 0x0026 }
            com.google.ar.core.PointCloud r3 = r2.acquirePointCloud()     // Catch:{ Exception -> 0x00bb }
            r7.c(r3)     // Catch:{ all -> 0x00b4 }
            r7.b(r5, r6)     // Catch:{ all -> 0x00b4 }
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ all -> 0x00b4 }
            jI.C17416c.a(r3, r1)     // Catch:{ Exception -> 0x00bb }
            goto L_0x00bb
        L_0x00b4:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r7 = move-exception
            jI.C17416c.a(r3, r5)     // Catch:{ Exception -> 0x00bb }
            throw r7     // Catch:{ Exception -> 0x00bb }
        L_0x00bb:
            fF.b r3 = r11.f125085w     // Catch:{ all -> 0x0026 }
            if (r3 == 0) goto L_0x00d0
            java.lang.Class<com.google.ar.core.Plane> r5 = com.google.ar.core.Plane.class
            java.util.Collection r5 = r0.getAllTrackables(r5)     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Camera r7 = r2.getCamera()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Pose r7 = r7.getDisplayOrientedPose()     // Catch:{ all -> 0x0026 }
            r3.e(r5, r7, r6)     // Catch:{ all -> 0x0026 }
        L_0x00d0:
            kotlin.jvm.internal.M r3 = new kotlin.jvm.internal.M     // Catch:{ all -> 0x0026 }
            r3.<init>()     // Catch:{ all -> 0x0026 }
            nI.q<? super com.google.ar.core.Session, ? super com.google.ar.core.Frame, ? super com.sugarcube.app.base.ui.hybrid.K0, java.lang.Integer> r5 = r11.f125078p     // Catch:{ all -> 0x0026 }
            if (r5 == 0) goto L_0x00ee
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ all -> 0x0026 }
            com.sugarcube.app.base.ui.hybrid.i0 r6 = r11.f125075m     // Catch:{ all -> 0x0026 }
            com.sugarcube.app.base.ui.hybrid.K0 r6 = r6.o()     // Catch:{ all -> 0x0026 }
            java.lang.Object r5 = r5.invoke(r0, r2, r6)     // Catch:{ all -> 0x0026 }
            java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0026 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0026 }
            r3.f144346a = r5     // Catch:{ all -> 0x0026 }
        L_0x00ee:
            com.google.ar.core.RecordingStatus r0 = r0.getRecordingStatus()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.RecordingStatus r5 = com.google.ar.core.RecordingStatus.OK     // Catch:{ all -> 0x0026 }
            if (r0 != r5) goto L_0x0125
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ IllegalStateException -> 0x0106 }
            int r5 = r3.f144346a     // Catch:{ IllegalStateException -> 0x0106 }
            r0.putInt(r5)     // Catch:{ IllegalStateException -> 0x0106 }
            java.util.UUID r5 = r11.f125076n     // Catch:{ IllegalStateException -> 0x0106 }
            r2.recordTrackData(r5, r0)     // Catch:{ IllegalStateException -> 0x0106 }
            goto L_0x0125
        L_0x0106:
            r0 = move-exception
            int r5 = r3.f144346a     // Catch:{ all -> 0x0026 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r6.<init>()     // Catch:{ all -> 0x0026 }
            java.lang.String r7 = "could not recordTrackData ["
            r6.append(r7)     // Catch:{ all -> 0x0026 }
            r6.append(r5)     // Catch:{ all -> 0x0026 }
            java.lang.String r5 = "] "
            r6.append(r5)     // Catch:{ all -> 0x0026 }
            r6.append(r0)     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0026 }
            android.util.Log.d(r4, r0)     // Catch:{ all -> 0x0026 }
        L_0x0125:
            com.sugarcube.app.base.ui.hybrid.HybridActivity r0 = r11.f125063a     // Catch:{ all -> 0x0026 }
            com.sugarcube.app.base.ui.hybrid.E0 r0 = r0.K0()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.LightEstimate r4 = r2.getLightEstimate()     // Catch:{ all -> 0x0026 }
            float r4 = r4.getPixelIntensity()     // Catch:{ all -> 0x0026 }
            r0.F(r4)     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Camera r0 = r2.getCamera()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.TrackingState r0 = r0.getTrackingState()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.TrackingState r4 = r11.f125083u     // Catch:{ all -> 0x0026 }
            if (r0 == r4) goto L_0x0184
            com.google.ar.core.Camera r0 = r2.getCamera()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.TrackingState r0 = r0.getTrackingState()     // Catch:{ all -> 0x0026 }
            r11.f125083u = r0     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Camera r0 = r2.getCamera()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.TrackingState r0 = r0.getTrackingState()     // Catch:{ all -> 0x0026 }
            java.lang.String r4 = "getTrackingState(...)"
            kotlin.jvm.internal.C17542s.i(r0, r4)     // Catch:{ all -> 0x0026 }
            com.google.ar.core.Camera r4 = r2.getCamera()     // Catch:{ all -> 0x0026 }
            com.google.ar.core.TrackingFailureReason r4 = r4.getTrackingFailureReason()     // Catch:{ all -> 0x0026 }
            java.lang.String r5 = "getTrackingFailureReason(...)"
            kotlin.jvm.internal.C17542s.i(r4, r5)     // Catch:{ all -> 0x0026 }
            com.sugarcube.app.base.ui.hybrid.HybridActivity r5 = r11.f125063a     // Catch:{ all -> 0x0026 }
            com.sugarcube.app.base.ui.hybrid.E0 r5 = r5.K0()     // Catch:{ all -> 0x0026 }
            r5.X(r0, r4)     // Catch:{ all -> 0x0026 }
            com.sugarcube.app.base.ui.hybrid.HybridActivity r0 = r11.f125063a     // Catch:{ all -> 0x0026 }
            androidx.lifecycle.s r5 = androidx.lifecycle.C5222z.a(r0)     // Catch:{ all -> 0x0026 }
            QJ.M r6 = QJ.C16311i0.b()     // Catch:{ all -> 0x0026 }
            com.sugarcube.app.base.ui.hybrid.o$e r8 = new com.sugarcube.app.base.ui.hybrid.o$e     // Catch:{ all -> 0x0026 }
            r8.<init>(r3, r11, r4, r1)     // Catch:{ all -> 0x0026 }
            r9 = 2
            r10 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0026 }
        L_0x0184:
            kotlin.jvm.internal.C17542s.g(r2)     // Catch:{ all -> 0x0026 }
            goto L_0x01c2
        L_0x0188:
            com.sugarcube.app.base.ui.hybrid.HybridActivity r2 = r11.f125063a
            androidx.lifecycle.s r3 = androidx.lifecycle.C5222z.a(r2)
            QJ.M r4 = QJ.C16311i0.b()
            com.sugarcube.app.base.ui.hybrid.o$f r6 = new com.sugarcube.app.base.ui.hybrid.o$f
            r6.<init>(r1)
            r7 = 2
            r8 = 0
            r5 = 0
            QJ.F0 unused = QJ.C16314k.d(r3, r4, r5, r6, r7, r8)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r1 = r11.f125065c
            com.sugarcube.app.base.ui.hybrid.HybridActivity r2 = r11.f125063a
            com.sugarcube.app.base.ui.hybrid.E0 r2 = r2.K0()
            java.util.UUID r2 = r2.y1()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "error processing frame "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.log(r2)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r1 = r11.f125065c
            r1.recordException(r0)
        L_0x01c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.hybrid.C14275o.r():void");
    }

    /* access modifiers changed from: private */
    public final CameraManager w() {
        return (CameraManager) this.f125082t.getValue();
    }

    /* access modifiers changed from: private */
    public final DisplayManager x() {
        return (DisplayManager) this.f125080r.getValue();
    }

    public final Session A() {
        return this.f125072j;
    }

    public final M0 B() {
        return this.f125073k;
    }

    public final float C() {
        return this.f125074l;
    }

    public final GLSurfaceView D() {
        return this.f125064b;
    }

    public final void H(boolean z10) {
        this.f125071i = z10;
    }

    public final void I(boolean z10) {
        this.f125070h = z10;
    }

    public final void J(q<? super M0, ? super Image, ? super TotalCaptureResult, C16807N> qVar) {
        M0 m02 = this.f125073k;
        if (m02 != null) {
            m02.l(qVar);
        }
    }

    public final void K(Session session) {
        this.f125072j = session;
    }

    public final void L(M0 m02) {
        this.f125073k = m02;
    }

    public final void M(float f10) {
        this.f125074l = f10;
    }

    public final void N(boolean z10) {
        this.f125066d = z10;
    }

    public final void O(boolean z10) {
        this.f125067e = z10;
    }

    public final void P(int i10) {
        this.f125069g = i10;
    }

    public final void Q(int i10) {
        this.f125068f = i10;
    }

    public final Object R(q<? super Session, ? super Frame, ? super K0, Integer> qVar, C17164e<? super F0> eVar) {
        return C16314k.d(C5222z.a(this.f125063a), C16311i0.c(), (T) null, new h(this, qVar, (C17164e<? super h>) null), 2, (Object) null);
    }

    public final void S(String str) {
        C17542s.j(str, "recordingPath");
        boolean z10 = this.f125071i;
        Session session = this.f125072j;
        Log.d(AnyKt.SUGARCUBE_TAG, "startRecording " + z10 + " " + session + " " + str);
        Session session2 = this.f125072j;
        if (session2 != null) {
            RecordingConfig recordingConfig = new RecordingConfig(session2);
            UUID uuid = this.f125076n;
            long leastSignificantBits = uuid.getLeastSignificantBits();
            long mostSignificantBits = this.f125076n.getMostSignificantBits();
            Log.d(AnyKt.SUGARCUBE_TAG, uuid + "  " + leastSignificantBits + " " + mostSignificantBits);
            Track id2 = new Track(session2).setId(this.f125076n);
            C17542s.i(id2, "setId(...)");
            byte[] bytes = "frame-count".getBytes(C15838d.f135279b);
            C17542s.i(bytes, "getBytes(...)");
            id2.setMetadata(ByteBuffer.wrap(bytes));
            recordingConfig.addTrack(id2);
            recordingConfig.setMp4DatasetUri(Uri.fromFile(new File(str)));
            recordingConfig.setAutoStopOnPause(true);
            try {
                session2.startRecording(recordingConfig);
            } catch (RecordingFailedException e10) {
                F0 unused = C16314k.d(C5222z.a(this.f125063a), C16311i0.b(), (T) null, new i((C17164e<? super i>) null), 2, (Object) null);
                FirebaseInteractions firebaseInteractions = this.f125065c;
                UUID y12 = this.f125063a.K0().y1();
                firebaseInteractions.log("error startRecording " + y12);
                this.f125065c.recordException(e10);
            }
        }
    }

    public final F0 T() {
        return C16314k.d(C5222z.a(this.f125063a), C16311i0.c(), (T) null, new j(this, (C17164e<? super j>) null), 2, (Object) null);
    }

    public final void U() {
        boolean z10 = this.f125071i;
        Session session = this.f125072j;
        Log.d(AnyKt.SUGARCUBE_TAG, "stopRecording " + z10 + " " + session);
        Session session2 = this.f125072j;
        if (session2 != null && session2.getRecordingStatus() == RecordingStatus.OK) {
            try {
                session2.stopRecording();
            } catch (RecordingFailedException e10) {
                F0 unused = C16314k.d(C5222z.a(this.f125063a), C16311i0.b(), (T) null, new k((C17164e<? super k>) null), 2, (Object) null);
                FirebaseInteractions firebaseInteractions = this.f125065c;
                UUID y12 = this.f125063a.K0().y1();
                firebaseInteractions.log("error stopRecording " + y12);
                this.f125065c.recordException(e10);
            }
        }
    }

    public final void n() {
        Log.d(AnyKt.SUGARCUBE_TAG, "createOnGlThread");
        GLES20.glGenTextures(1, this.f125056A, 0);
        int i10 = this.f125056A[0];
        this.f125057B = i10;
        GLES20.glBindTexture(36197, i10);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        int G10 = G(35633, this.f125061F);
        int G11 = G(35632, this.f125062G);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, G10);
        GLES20.glAttachShader(glCreateProgram, G11);
        GLES20.glLinkProgram(glCreateProgram);
        this.f125087y = GLES20.glGetAttribLocation(glCreateProgram, "a_Position");
        this.f125088z = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoord");
        this.f125086x = glCreateProgram;
    }

    public final synchronized void p() {
        try {
            Log.d(AnyKt.SUGARCUBE_TAG, "HybridSurface destroy");
            if (!(this.f125056A.length == 0)) {
                Log.d(AnyKt.SUGARCUBE_TAG, "HybridSurface destroy: delete texture");
                GLES20.glDeleteTextures(1, this.f125056A, 0);
                this.f125056A = new int[0];
                this.f125057B = -1;
            }
            this.f125071i = false;
            Session session = this.f125072j;
            if (session != null) {
                this.f125072j = null;
                session.close();
            }
            M0 m02 = this.f125073k;
            if (m02 != null) {
                this.f125073k = null;
                m02.d();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public final void s() {
        this.f125060E.position(0);
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f125057B);
        GLES20.glUseProgram(this.f125086x);
        GLES20.glVertexAttribPointer(this.f125087y, 2, 5126, false, 0, this.f125059D);
        GLES20.glVertexAttribPointer(this.f125088z, 2, 5126, false, 0, this.f125060E);
        GLES20.glEnableVertexAttribArray(this.f125087y);
        GLES20.glEnableVertexAttribArray(this.f125088z);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f125087y);
        GLES20.glDisableVertexAttribArray(this.f125088z);
        GLES20.glDepthMask(true);
        GLES20.glEnable(2929);
    }

    public final HybridActivity t() {
        return this.f125063a;
    }

    public final boolean u() {
        return this.f125071i;
    }

    public final v<Float, Float> v() {
        return this.f125077o;
    }

    public final FirebaseInteractions y() {
        return this.f125065c;
    }

    public final C14264i0 z() {
        return this.f125075m;
    }
}
