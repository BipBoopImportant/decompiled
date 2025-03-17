package com.sugarcube.app.base.ui.ultrawide;

import HJ.C15838d;
import QJ.C16297b0;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.y;
import YE.C13868b;
import YH.g0;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
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
import com.google.ar.core.Camera;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.google.ar.core.CameraIntrinsics;
import com.google.ar.core.Config;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.Frame;
import com.google.ar.core.Plane;
import com.google.ar.core.PointCloud;
import com.google.ar.core.RecordingConfig;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.Session;
import com.google.ar.core.Track;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.google.ar.core.exceptions.RecordingFailedException;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.ui.ultrawide.C14286a;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fF.C14450b;
import fF.C14451c;
import jI.C17416c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.UUID;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000Ñ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r*\u0001~\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u00015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001f\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\u0019JD\u0010(\u001a\u00020'2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2&\u0010&\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"j\u0004\u0018\u0001`%H@¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020'¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u000e¢\u0006\u0004\b,\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\"\u0010>\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0013\"\u0004\b<\u0010=R\"\u0010B\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b?\u0010:\u001a\u0004\b@\u0010\u0013\"\u0004\bA\u0010=R\"\u0010I\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010M\u001a\u00020\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bJ\u0010D\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR\"\u0010Q\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bN\u0010:\u001a\u0004\bO\u0010\u0013\"\u0004\bP\u0010=R\"\u0010T\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bR\u0010:\u001a\u0004\bS\u0010\u0013\"\u0004\bD\u0010=R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bU\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\"\u0010b\u001a\u00020[8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u001f\u0010i\u001a\n d*\u0004\u0018\u00010c0c8\u0006¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR6\u0010t\u001a\"\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"j\u0004\u0018\u0001`%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0002¢\u0006\f\n\u0004\b\u001a\u0010v\u001a\u0004\bw\u0010xR\u001b\u0010}\u001a\u00020z8BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010v\u001a\u0004\b{\u0010|R\u0015\u0010\u0001\u001a\u00020~8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010R \u0010\u0001\u001a\u00030\u00018BX\u0002¢\u0006\u000f\n\u0005\b\u0001\u0010v\u001a\u0006\b\u0001\u0010\u0001R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u0001R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b!\u0010\u0001R\u0019\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b/\u0010\u0001R\u0019\u0010\u0001\u001a\u0005\u0018\u00010\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bm\u0010DR\u0018\u0010\u0001\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010DR\u0017\u0010\u0001\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b{\u0010DR\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b7\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b^\u0010DR\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\bW\u0010\u0001R)\u0010¢\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b3\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b \u0001\u0010¡\u0001R)\u0010¥\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b;\u0010\u0001\u001a\u0006\b£\u0001\u0010\u0001\"\u0006\b¤\u0001\u0010¡\u0001R\u0016\u0010§\u0001\u001a\u00020\f8\u0002X\u0004¢\u0006\u0007\n\u0005\bw\u0010¦\u0001R\u0016\u0010¨\u0001\u001a\u00020\f8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u000f\u0010¦\u0001¨\u0006©\u0001"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/j;", "", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideActivity;", "activity", "Landroid/opengl/GLSurfaceView;", "surface", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebase", "<init>", "(Lcom/sugarcube/app/base/ui/ultrawide/UltrawideActivity;Landroid/opengl/GLSurfaceView;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;)V", "Lcom/google/ar/core/Session;", "session", "", "recordingPath", "LXH/N;", "F", "(Lcom/google/ar/core/Session;Ljava/lang/String;)V", "", "G", "()Z", "Ljavax/microedition/khronos/egl/EGLConfig;", "config", "p", "(Ljavax/microedition/khronos/egl/EGLConfig;)V", "s", "()V", "o", "q", "", "type", "shaderCode", "H", "(ILjava/lang/String;)I", "t", "Lkotlin/Function3;", "Lcom/google/ar/core/Frame;", "Lcom/sugarcube/app/base/ui/ultrawide/e;", "Lcom/sugarcube/app/base/ui/ultrawide/OnFrameUpdateListener;", "frameListener", "LQJ/F0;", "P", "(Ljava/lang/String;LnI/q;LdI/e;)Ljava/lang/Object;", "Q", "()LQJ/F0;", "R", "a", "Lcom/sugarcube/app/base/ui/ultrawide/UltrawideActivity;", "u", "()Lcom/sugarcube/app/base/ui/ultrawide/UltrawideActivity;", "b", "Landroid/opengl/GLSurfaceView;", "C", "()Landroid/opengl/GLSurfaceView;", "c", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "z", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "d", "Z", "D", "L", "(Z)V", "surfaceCreated", "e", "getViewportChanged", "M", "viewportChanged", "f", "I", "getViewportWidth", "()I", "O", "(I)V", "viewportWidth", "g", "getViewportHeight", "N", "viewportHeight", "h", "getHasSetTextureNames", "J", "hasSetTextureNames", "i", "v", "arcoreActive", "j", "Lcom/google/ar/core/Session;", "B", "()Lcom/google/ar/core/Session;", "K", "(Lcom/google/ar/core/Session;)V", "Lcom/sugarcube/app/base/ui/ultrawide/p0;", "k", "Lcom/sugarcube/app/base/ui/ultrawide/p0;", "A", "()Lcom/sugarcube/app/base/ui/ultrawide/p0;", "setSensor$base_release", "(Lcom/sugarcube/app/base/ui/ultrawide/p0;)V", "sensor", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "l", "Ljava/util/UUID;", "getTrackUUID", "()Ljava/util/UUID;", "trackUUID", "Lcom/sugarcube/app/base/ui/ultrawide/a;", "m", "Lcom/sugarcube/app/base/ui/ultrawide/a;", "w", "()Lcom/sugarcube/app/base/ui/ultrawide/a;", "setCameraIntrinsics", "(Lcom/sugarcube/app/base/ui/ultrawide/a;)V", "cameraIntrinsics", "n", "LnI/q;", "onFrameUpdateListener", "Landroid/view/WindowManager;", "LXH/o;", "E", "()Landroid/view/WindowManager;", "windowManager", "Landroid/hardware/display/DisplayManager;", "y", "()Landroid/hardware/display/DisplayManager;", "displayManager", "com/sugarcube/app/base/ui/ultrawide/j$d", "Lcom/sugarcube/app/base/ui/ultrawide/j$d;", "displayListener", "Landroid/hardware/camera2/CameraManager;", "r", "x", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "Lcom/google/ar/core/TrackingState;", "Lcom/google/ar/core/TrackingState;", "previousTrackingState", "Lcom/google/ar/core/RecordingStatus;", "Lcom/google/ar/core/RecordingStatus;", "previousRecordingStatus", "LfF/c;", "LfF/c;", "pointCloudRenderer", "LfF/b;", "LfF/b;", "planeRenderer", "program", "quadPositionParam", "quadTexCoordParam", "", "[I", "texture", "textureId", "", "[F", "quadCoords", "Ljava/nio/FloatBuffer;", "Ljava/nio/FloatBuffer;", "getQuadCoordsBuffer", "()Ljava/nio/FloatBuffer;", "setQuadCoordsBuffer", "(Ljava/nio/FloatBuffer;)V", "quadCoordsBuffer", "getQuadTexCoordsBuffer", "setQuadTexCoordsBuffer", "quadTexCoordsBuffer", "Ljava/lang/String;", "vertexShaderCode", "fragmentShaderCode", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.ultrawide.j  reason: case insensitive filesystem */
public final class C14304j {

    /* renamed from: G  reason: collision with root package name */
    public static final c f125617G = new c((DefaultConstructorMarker) null);

    /* renamed from: H  reason: collision with root package name */
    public static final int f125618H = 8;

    /* renamed from: A  reason: collision with root package name */
    private int f125619A;

    /* renamed from: B  reason: collision with root package name */
    private final float[] f125620B;

    /* renamed from: C  reason: collision with root package name */
    private FloatBuffer f125621C;

    /* renamed from: D  reason: collision with root package name */
    private FloatBuffer f125622D;

    /* renamed from: E  reason: collision with root package name */
    private final String f125623E;

    /* renamed from: F  reason: collision with root package name */
    private final String f125624F;

    /* renamed from: a  reason: collision with root package name */
    private final UltrawideActivity f125625a;

    /* renamed from: b  reason: collision with root package name */
    private final GLSurfaceView f125626b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInteractions f125627c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f125628d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f125629e;

    /* renamed from: f  reason: collision with root package name */
    private int f125630f;

    /* renamed from: g  reason: collision with root package name */
    private int f125631g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f125632h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f125633i;

    /* renamed from: j  reason: collision with root package name */
    private Session f125634j;

    /* renamed from: k  reason: collision with root package name */
    private p0 f125635k;

    /* renamed from: l  reason: collision with root package name */
    private final UUID f125636l = UUID.fromString("bb2ac08f-d497-4b04-aa2e-72162dd539c5");

    /* renamed from: m  reason: collision with root package name */
    private C14286a f125637m = new C14286a(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, (DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public q<? super Session, ? super Frame, ? super C14294e, Integer> f125638n;

    /* renamed from: o  reason: collision with root package name */
    private final C16824o f125639o = C16825p.b(new C14298g(this));

    /* renamed from: p  reason: collision with root package name */
    private final C16824o f125640p = C16825p.b(new C14300h(this));
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final d f125641q = new d(this);

    /* renamed from: r  reason: collision with root package name */
    private final C16824o f125642r = C16825p.b(new C14302i(this));

    /* renamed from: s  reason: collision with root package name */
    private TrackingState f125643s = TrackingState.TRACKING;

    /* renamed from: t  reason: collision with root package name */
    private RecordingStatus f125644t = RecordingStatus.NONE;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C14451c f125645u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C14450b f125646v;

    /* renamed from: w  reason: collision with root package name */
    private int f125647w;

    /* renamed from: x  reason: collision with root package name */
    private int f125648x;

    /* renamed from: y  reason: collision with root package name */
    private int f125649y;

    /* renamed from: z  reason: collision with root package name */
    private int[] f125650z;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/j$a", "Landroid/opengl/GLSurfaceView$Renderer;", "Ljavax/microedition/khronos/opengles/GL10;", "gl", "Ljavax/microedition/khronos/egl/EGLConfig;", "config", "LXH/N;", "onSurfaceCreated", "(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V", "", "width", "height", "onSurfaceChanged", "(Ljavax/microedition/khronos/opengles/GL10;II)V", "onDrawFrame", "(Ljavax/microedition/khronos/opengles/GL10;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$a */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14304j f125651a;

        a(C14304j jVar) {
            this.f125651a = jVar;
        }

        public void onDrawFrame(GL10 gl10) {
            C17542s.j(gl10, "gl");
            GLES20.glClear(16640);
            if (this.f125651a.v()) {
                this.f125651a.s();
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            C17542s.j(gl10, "gl");
            this.f125651a.O(i10);
            this.f125651a.N(i11);
            this.f125651a.M(true);
            GLES20.glViewport(0, 0, i10, i11);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C17542s.j(gl10, "gl");
            C17542s.j(eGLConfig, "config");
            GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
            this.f125651a.p(eGLConfig);
            this.f125651a.o();
            C14451c k10 = this.f125651a.f125645u;
            if (k10 != null) {
                k10.a(this.f125651a.u());
            }
            C14450b j10 = this.f125651a.f125646v;
            if (j10 != null) {
                j10.c(this.f125651a.u(), "models/trigrid.png");
            }
            this.f125651a.L(true);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/j$b", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onResume", "(Landroidx/lifecycle/y;)V", "onPause", "onDestroy", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$b */
    public static final class b implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14304j f125652a;

        b(C14304j jVar) {
            this.f125652a = jVar;
        }

        public void onDestroy(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f125652a.q();
            super.onDestroy(yVar);
        }

        public void onPause(C5221y yVar) {
            C17542s.j(yVar, "owner");
            Log.d(AnyKt.SUGARCUBE_TAG, "UltrawideARSurface onPause");
            this.f125652a.C().onPause();
            if (this.f125652a.v()) {
                Session B10 = this.f125652a.B();
                if (B10 != null) {
                    B10.pause();
                }
                this.f125652a.I(false);
            }
            this.f125652a.A().v();
            this.f125652a.y().unregisterDisplayListener(this.f125652a.f125641q);
        }

        public void onResume(C5221y yVar) {
            C17542s.j(yVar, "owner");
            Log.d(AnyKt.SUGARCUBE_TAG, "UltrawideARSurface onResume");
            this.f125652a.J(false);
            Session B10 = this.f125652a.B();
            if (B10 != null) {
                C14304j jVar = this.f125652a;
                if (!jVar.v()) {
                    B10.resume();
                    jVar.I(true);
                }
            }
            this.f125652a.C().onResume();
            p0.t(this.f125652a.A(), 0, (C17631a) null, 3, (Object) null);
            this.f125652a.y().registerDisplayListener(this.f125652a.f125641q, (Handler) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/sugarcube/app/base/ui/ultrawide/j$c;", "", "<init>", "()V", "", "COORDS_PER_VERTEX", "I", "TEXCOORDS_PER_VERTEX", "FLOAT_SIZE", "NUMBER_VERTICES", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/ultrawide/j$d", "Landroid/hardware/display/DisplayManager$DisplayListener;", "", "displayId", "LXH/N;", "onDisplayAdded", "(I)V", "onDisplayRemoved", "onDisplayChanged", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$d */
    public static final class d implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14304j f125653a;

        d(C14304j jVar) {
            this.f125653a = jVar;
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            this.f125653a.M(true);
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$drawARFrame$2$3", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$e */
    static final class e extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125654c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125655d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(String str, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f125655d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f125655d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125654c == 0) {
                y.b(obj);
                C13868b.f118106a.b(this.f125655d, YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$drawARFrame$2$7", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(String str, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f125657d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f125657d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125656c == 0) {
                y.b(obj);
                C13868b.f118106a.b(this.f125657d, YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$drawARFrame$2$8", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$g */
    static final class g extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125658c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125659d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(String str, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f125659d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f125659d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125658c == 0) {
                y.b(obj);
                C13868b.f118106a.b(this.f125659d, YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$drawARFrame$2$9", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$h */
    static final class h extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125660c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125661d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(String str, C17164e<? super h> eVar) {
            super(2, eVar);
            this.f125661d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new h(this.f125661d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((h) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125660c == 0) {
                y.b(obj);
                C13868b.f118106a.b(this.f125661d, YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$drawARFrame$3", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125662c;

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
            if (this.f125662c == 0) {
                y.b(obj);
                C13868b.f118106a.b("error processing frame", YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$initRecording$1$1", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$j  reason: collision with other inner class name */
    static final class C3074j extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125663c;

        C3074j(C17164e<? super C3074j> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3074j(eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3074j) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125663c == 0) {
                y.b(obj);
                C13868b.f118106a.b("error startRecording", YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$isCameraRotated$1$1$1", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$k */
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f125665d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(String str, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f125665d = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new k(this.f125665d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((k) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125664c == 0) {
                y.b(obj);
                C13868b.f118106a.b(this.f125665d, YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$startAR$2", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$l */
    static final class l extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125666c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14304j f125667d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ q<Session, Frame, C14294e, Integer> f125668e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f125669f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$startAR$2$2", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$l$a */
        static final class a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f125670c;

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
                if (this.f125670c == 0) {
                    y.b(obj);
                    C13868b.f118106a.b("error startAR", YE.e.Capture);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        l(C14304j jVar, q<? super Session, ? super Frame, ? super C14294e, Integer> qVar, String str, C17164e<? super l> eVar) {
            super(2, eVar);
            this.f125667d = jVar;
            this.f125668e = qVar;
            this.f125669f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new l(this.f125667d, this.f125668e, this.f125669f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((l) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125666c == 0) {
                y.b(obj);
                boolean v10 = this.f125667d.v();
                Session B10 = this.f125667d.B();
                Log.d(AnyKt.SUGARCUBE_TAG, "startAR " + v10 + " " + B10);
                this.f125667d.I(false);
                Session B11 = this.f125667d.B();
                if (B11 != null) {
                    this.f125667d.K((Session) null);
                    B11.close();
                }
                this.f125667d.f125638n = this.f125668e;
                try {
                    C14304j jVar = this.f125667d;
                    jVar.K(new Session(jVar.u(), g0.d()));
                } catch (Exception e10) {
                    F0 unused = C16314k.d(C5222z.a(this.f125667d.u()), C16311i0.b(), (T) null, new a((C17164e<? super a>) null), 2, (Object) null);
                    FirebaseInteractions z10 = this.f125667d.z();
                    UUID x12 = this.f125667d.u().L0().x1();
                    z10.log("error startAR(uw) " + x12);
                    this.f125667d.z().recordException(e10);
                    I0 L02 = this.f125667d.u().L0();
                    String message = e10.getMessage();
                    L02.B1("startAR(uw) exception " + message);
                }
                Session B12 = this.f125667d.B();
                if (B12 != null) {
                    C14304j jVar2 = this.f125667d;
                    String str = this.f125669f;
                    boolean v11 = jVar2.v();
                    Log.d(AnyKt.SUGARCUBE_TAG, "create session " + v11 + " " + B12);
                    Config config = B12.getConfig();
                    config.setFocusMode(Config.FocusMode.AUTO);
                    B12.configure(config);
                    if (B12.getCameraConfig().getFpsRange().getLower().intValue() > 30) {
                        CameraConfigFilter targetFps = new CameraConfigFilter(B12).setTargetFps(EnumSet.of(CameraConfig.TargetFps.TARGET_FPS_30));
                        C17542s.i(targetFps, "setTargetFps(...)");
                        Iterator<CameraConfig> it = B12.getSupportedCameraConfigs(targetFps).iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            CameraConfig next = it.next();
                            if (C17542s.e(next.getTextureSize(), B12.getCameraConfig().getTextureSize()) && C17542s.e(next.getImageSize(), B12.getCameraConfig().getImageSize())) {
                                B12.setCameraConfig(next);
                                break;
                            }
                        }
                    }
                    if (str != null) {
                        jVar2.F(B12, str);
                    }
                    jVar2.J(false);
                    B12.resume();
                    jVar2.I(true);
                }
                boolean v12 = this.f125667d.v();
                Session B13 = this.f125667d.B();
                Log.d(AnyKt.SUGARCUBE_TAG, "create session done " + v12 + " " + B13);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$stopAR$1", f = "UltrawideARSurface.kt", l = {239}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$m */
    static final class m extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14304j f125672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        m(C14304j jVar, C17164e<? super m> eVar) {
            super(2, eVar);
            this.f125672d = jVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new m(this.f125672d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((m) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f125671c;
            if (i10 == 0) {
                y.b(obj);
                boolean v10 = this.f125672d.v();
                Session B10 = this.f125672d.B();
                Log.d(AnyKt.SUGARCUBE_TAG, "stopAR " + v10 + " " + B10);
                this.f125672d.I(false);
                this.f125671c = 1;
                if (C16297b0.b(200, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Session B11 = this.f125672d.B();
            if (B11 != null) {
                this.f125672d.K((Session) null);
                B11.close();
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.ultrawide.UltrawideARSurface$stopRecording$1$1", f = "UltrawideARSurface.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.ultrawide.j$n */
    static final class n extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f125673c;

        n(C17164e<? super n> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new n(eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((n) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f125673c == 0) {
                y.b(obj);
                C13868b.f118106a.b("error stopRecording", YE.e.Capture);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C14304j(UltrawideActivity ultrawideActivity, GLSurfaceView gLSurfaceView, FirebaseInteractions firebaseInteractions) {
        C17542s.j(ultrawideActivity, "activity");
        C17542s.j(gLSurfaceView, "surface");
        C17542s.j(firebaseInteractions, "firebase");
        this.f125625a = ultrawideActivity;
        this.f125626b = gLSurfaceView;
        this.f125627c = firebaseInteractions;
        this.f125635k = new p0(ultrawideActivity);
        C14450b bVar = null;
        this.f125645u = ultrawideActivity.L0().d1() ? new C14451c() : null;
        this.f125646v = ultrawideActivity.L0().c1() ? new C14450b() : bVar;
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        gLSurfaceView.setRenderer(new a(this));
        gLSurfaceView.setRenderMode(1);
        gLSurfaceView.setWillNotDraw(false);
        ultrawideActivity.getLifecycle().c(new b(this));
        this.f125650z = new int[1];
        this.f125619A = -1;
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f125620B = fArr;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        C17542s.i(asFloatBuffer, "run(...)");
        this.f125621C = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.position(0);
        C17542s.i(asFloatBuffer2, "run(...)");
        this.f125622D = asFloatBuffer2;
        this.f125623E = "attribute vec4 a_Position;attribute vec2 a_TexCoord;varying vec2 v_TexCoord;void main() {  gl_Position = a_Position;  v_TexCoord = a_TexCoord;}";
        this.f125624F = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 v_TexCoord;uniform samplerExternalOES sTexture;void main() {  gl_FragColor = texture2D(sTexture, v_TexCoord);}";
    }

    private final WindowManager E() {
        return (WindowManager) this.f125639o.getValue();
    }

    /* access modifiers changed from: private */
    public final void F(Session session, String str) {
        RecordingConfig recordingConfig = new RecordingConfig(session);
        UUID uuid = this.f125636l;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = this.f125636l.getMostSignificantBits();
        Log.d(AnyKt.SUGARCUBE_TAG, "initRecording " + uuid + "  " + leastSignificantBits + " " + mostSignificantBits);
        Track id2 = new Track(session).setId(this.f125636l);
        C17542s.i(id2, "setId(...)");
        byte[] bytes = "frame-count".getBytes(C15838d.f135279b);
        C17542s.i(bytes, "getBytes(...)");
        id2.setMetadata(ByteBuffer.wrap(bytes));
        recordingConfig.addTrack(id2);
        recordingConfig.setMp4DatasetUri(Uri.fromFile(new File(str)));
        recordingConfig.setAutoStopOnPause(true);
        try {
            session.startRecording(recordingConfig);
        } catch (RecordingFailedException e10) {
            F0 unused = C16314k.d(C5222z.a(this.f125625a), C16311i0.b(), (T) null, new C3074j((C17164e<? super C3074j>) null), 2, (Object) null);
            FirebaseInteractions firebaseInteractions = this.f125627c;
            UUID x12 = this.f125625a.L0().x1();
            firebaseInteractions.log("error startRecording(uw) " + x12);
            this.f125627c.recordException(e10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0079 A[Catch:{ CameraAccessException -> 0x0029 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean G() {
        /*
            r9 = this;
            com.google.ar.core.Session r0 = r9.f125634j
            r1 = 0
            if (r0 == 0) goto L_0x00d9
            com.google.ar.core.CameraConfig r0 = r0.getCameraConfig()     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.String r0 = r0.getCameraId()     // Catch:{ CameraAccessException -> 0x0029 }
            android.hardware.camera2.CameraManager r2 = r9.x()     // Catch:{ CameraAccessException -> 0x0029 }
            android.hardware.camera2.CameraCharacteristics r0 = r2.getCameraCharacteristics(r0)     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.String r2 = "getCameraCharacteristics(...)"
            kotlin.jvm.internal.C17542s.i(r0, r2)     // Catch:{ CameraAccessException -> 0x0029 }
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.Object r0 = r0.get(r2)     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ CameraAccessException -> 0x0029 }
            if (r0 == 0) goto L_0x002c
            int r0 = r0.intValue()     // Catch:{ CameraAccessException -> 0x0029 }
            goto L_0x002d
        L_0x0029:
            r0 = move-exception
            goto L_0x00b2
        L_0x002c:
            r0 = r1
        L_0x002d:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ CameraAccessException -> 0x0029 }
            r3 = 30
            if (r2 < r3) goto L_0x0040
            android.view.WindowManager r2 = r9.E()     // Catch:{ CameraAccessException -> 0x0029 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ CameraAccessException -> 0x0029 }
            int r2 = r2.getRotation()     // Catch:{ CameraAccessException -> 0x0029 }
            goto L_0x004c
        L_0x0040:
            android.view.WindowManager r2 = r9.E()     // Catch:{ CameraAccessException -> 0x0029 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ CameraAccessException -> 0x0029 }
            int r2 = r2.getRotation()     // Catch:{ CameraAccessException -> 0x0029 }
        L_0x004c:
            r3 = 1
            if (r2 == 0) goto L_0x006d
            if (r2 == r3) goto L_0x0075
            r4 = 2
            if (r2 == r4) goto L_0x0072
            r4 = 3
            if (r2 == r4) goto L_0x006f
            java.lang.String r4 = "Sugarcube"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0029 }
            r5.<init>()     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.String r6 = "Invalid value, display rotation="
            r5.append(r6)     // Catch:{ CameraAccessException -> 0x0029 }
            r5.append(r2)     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.String r2 = r5.toString()     // Catch:{ CameraAccessException -> 0x0029 }
            android.util.Log.d(r4, r2)     // Catch:{ CameraAccessException -> 0x0029 }
        L_0x006d:
            r2 = r1
            goto L_0x0077
        L_0x006f:
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x0077
        L_0x0072:
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x0077
        L_0x0075:
            r2 = 90
        L_0x0077:
            if (r0 != r2) goto L_0x007a
            r1 = r3
        L_0x007a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0029 }
            r3.<init>()     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.String r4 = "isCameraRotated("
            r3.append(r4)     // Catch:{ CameraAccessException -> 0x0029 }
            r3.append(r1)     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.String r4 = ") "
            r3.append(r4)     // Catch:{ CameraAccessException -> 0x0029 }
            r3.append(r2)     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.String r2 = " "
            r3.append(r2)     // Catch:{ CameraAccessException -> 0x0029 }
            r3.append(r0)     // Catch:{ CameraAccessException -> 0x0029 }
            java.lang.String r0 = r3.toString()     // Catch:{ CameraAccessException -> 0x0029 }
            com.sugarcube.app.base.ui.ultrawide.UltrawideActivity r2 = r9.f125625a     // Catch:{ CameraAccessException -> 0x0029 }
            androidx.lifecycle.s r3 = androidx.lifecycle.C5222z.a(r2)     // Catch:{ CameraAccessException -> 0x0029 }
            QJ.M r4 = QJ.C16311i0.b()     // Catch:{ CameraAccessException -> 0x0029 }
            com.sugarcube.app.base.ui.ultrawide.j$k r6 = new com.sugarcube.app.base.ui.ultrawide.j$k     // Catch:{ CameraAccessException -> 0x0029 }
            r2 = 0
            r6.<init>(r0, r2)     // Catch:{ CameraAccessException -> 0x0029 }
            r7 = 2
            r8 = 0
            r5 = 0
            QJ.F0 unused = QJ.C16314k.d(r3, r4, r5, r6, r7, r8)     // Catch:{ CameraAccessException -> 0x0029 }
            goto L_0x00d9
        L_0x00b2:
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r2 = r9.f125627c
            com.sugarcube.app.base.ui.ultrawide.UltrawideActivity r3 = r9.f125625a
            com.sugarcube.app.base.ui.ultrawide.I0 r3 = r3.L0()
            java.util.UUID r3 = r3.x1()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "error isCameraRotated "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.log(r3)
            com.sugarcube.app.base.external.interactions.FirebaseInteractions r2 = r9.f125627c
            r2.recordException(r0)
            XH.N r0 = XH.C16807N.f139792a
        L_0x00d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.ultrawide.C14304j.G():boolean");
    }

    private final int H(int i10, String str) {
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
    public static final WindowManager S(C14304j jVar) {
        Object systemService = jVar.f125625a.getSystemService("window");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    /* access modifiers changed from: private */
    public static final CameraManager n(C14304j jVar) {
        Object systemService = jVar.f125625a.getSystemService("camera");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    /* access modifiers changed from: private */
    public final void o() {
        Log.d(AnyKt.SUGARCUBE_TAG, "createOnGlThread");
        GLES20.glGenTextures(1, this.f125650z, 0);
        int i10 = this.f125650z[0];
        this.f125619A = i10;
        GLES20.glBindTexture(36197, i10);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        int H10 = H(35633, this.f125623E);
        int H11 = H(35632, this.f125624F);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, H10);
        GLES20.glAttachShader(glCreateProgram, H11);
        GLES20.glLinkProgram(glCreateProgram);
        this.f125648x = GLES20.glGetAttribLocation(glCreateProgram, "a_Position");
        this.f125649y = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoord");
        this.f125647w = glCreateProgram;
    }

    /* access modifiers changed from: private */
    public final void p(EGLConfig eGLConfig) {
        try {
            EGL egl = EGLContext.getEGL();
            C17542s.h(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            int[] iArr = new int[2];
            egl10.eglGetConfigAttrib(egl10.eglGetCurrentDisplay(), eGLConfig, 12328, iArr);
            EGL14.eglChooseConfig(EGL14.eglGetCurrentDisplay(), new int[]{12328, iArr[0], 12344}, 0, new android.opengl.EGLConfig[1], 0, 1, iArr, 1);
        } catch (IOException e10) {
            FirebaseInteractions firebaseInteractions = this.f125627c;
            UUID x12 = this.f125625a.L0().x1();
            firebaseInteractions.log("error createOnGlThread(uw) " + x12);
            Log.e(AnyKt.SUGARCUBE_TAG, "Failed to read an asset file", e10);
        }
    }

    /* access modifiers changed from: private */
    public final synchronized void q() {
        try {
            Log.d(AnyKt.SUGARCUBE_TAG, "UltrawideARSurface destroy");
            if (!(this.f125650z.length == 0)) {
                Log.d(AnyKt.SUGARCUBE_TAG, "UltrawideARSurface destroy: delete texture");
                GLES20.glDeleteTextures(1, this.f125650z, 0);
                this.f125650z = new int[0];
                this.f125619A = -1;
            }
            this.f125633i = false;
            Session session = this.f125634j;
            if (session != null) {
                this.f125634j = null;
                session.close();
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: private */
    public static final DisplayManager r(C14304j jVar) {
        Object systemService = jVar.f125625a.getSystemService("display");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        return (DisplayManager) systemService;
    }

    /* access modifiers changed from: private */
    public final void s() {
        int i10;
        Throwable th2;
        if (!this.f125633i) {
            Session session = this.f125634j;
            if (session != null) {
                Log.d(AnyKt.SUGARCUBE_TAG, "drop ARFrame - arcoreActive (" + session.getRecordingStatus() + ")");
                return;
            }
            return;
        }
        Session session2 = this.f125634j;
        if (session2 != null) {
            try {
                if (this.f125629e) {
                    session2.setDisplayGeometry(E().getDefaultDisplay().getRotation(), this.f125630f, this.f125631g);
                    this.f125629e = false;
                }
                if (!this.f125632h) {
                    Log.d(AnyKt.SUGARCUBE_TAG, "Set Camera Texture name " + this.f125619A);
                    session2.setCameraTextureName(this.f125619A);
                    this.f125632h = true;
                }
                Frame update = session2.update();
                if (update.hasDisplayGeometryChanged()) {
                    update.transformCoordinates2d(Coordinates2d.OPENGL_NORMALIZED_DEVICE_COORDINATES, this.f125621C, Coordinates2d.TEXTURE_NORMALIZED, this.f125622D);
                    Camera camera = update.getCamera();
                    boolean G10 = G();
                    CameraIntrinsics imageIntrinsics = camera.getImageIntrinsics();
                    C14286a.C3073a aVar = C14286a.f125581f;
                    C17542s.g(imageIntrinsics);
                    C14286a c10 = aVar.c(imageIntrinsics);
                    String arrays = Arrays.toString(c10.a());
                    C17542s.i(arrays, "toString(...)");
                    String arrays2 = Arrays.toString(imageIntrinsics.getImageDimensions());
                    C17542s.i(arrays2, "toString(...)");
                    String str = "imageIntrinsics(" + G10 + ") " + c10 + " " + arrays + " " + arrays2;
                    Log.d(AnyKt.SUGARCUBE_TAG, str);
                    C13868b bVar = C13868b.f118106a;
                    YE.e eVar = YE.e.Capture;
                    bVar.b(str, eVar);
                    CameraIntrinsics textureIntrinsics = camera.getTextureIntrinsics();
                    C17542s.g(textureIntrinsics);
                    C14286a c11 = aVar.c(textureIntrinsics);
                    this.f125637m = c11;
                    String arrays3 = Arrays.toString(c11.a());
                    C17542s.i(arrays3, "toString(...)");
                    String arrays4 = Arrays.toString(textureIntrinsics.getImageDimensions());
                    C17542s.i(arrays4, "toString(...)");
                    String str2 = "textureIntrinsics(" + G10 + ") " + c11 + " " + arrays3 + " " + arrays4;
                    Log.d(AnyKt.SUGARCUBE_TAG, str2);
                    bVar.b(str2, eVar);
                    update.getCamera().getTextureIntrinsics();
                }
                if (update.getTimestamp() == 0) {
                    String str3 = "drop ARFrame - timestamp == 0L (" + session2.getRecordingStatus() + ", " + update.getCamera().getTrackingState() + ")";
                    Log.d(AnyKt.SUGARCUBE_TAG, str3);
                    F0 unused = C16314k.d(C5222z.a(this.f125625a), (C17168i) null, (T) null, new e(str3, (C17164e<? super e>) null), 3, (Object) null);
                    return;
                }
                t();
                float[] fArr = new float[16];
                update.getCamera().getProjectionMatrix(fArr, 0, 0.1f, 100.0f);
                C14451c cVar = this.f125645u;
                if (cVar != null) {
                    float[] fArr2 = new float[16];
                    update.getCamera().getViewMatrix(fArr2, 0);
                    PointCloud acquirePointCloud = update.acquirePointCloud();
                    try {
                        cVar.c(acquirePointCloud);
                        cVar.b(fArr2, fArr);
                        C16807N n10 = C16807N.f139792a;
                        C17416c.a(acquirePointCloud, (Throwable) null);
                    } catch (Throwable th3) {
                        Throwable th4 = th3;
                        C17416c.a(acquirePointCloud, th2);
                        throw th4;
                    }
                }
                C14450b bVar2 = this.f125646v;
                if (bVar2 != null) {
                    bVar2.e(session2.getAllTrackables(Plane.class), update.getCamera().getDisplayOrientedPose(), fArr);
                }
                RecordingStatus recordingStatus = session2.getRecordingStatus();
                C17542s.i(recordingStatus, "getRecordingStatus(...)");
                q<? super Session, ? super Frame, ? super C14294e, Integer> qVar = this.f125638n;
                if (qVar != null) {
                    C17542s.g(update);
                    i10 = qVar.invoke(session2, update, this.f125635k.l()).intValue();
                } else {
                    i10 = 0;
                }
                if (recordingStatus == RecordingStatus.OK) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    allocate.putInt(i10);
                    update.recordTrackData(this.f125636l, allocate);
                }
                if (recordingStatus != this.f125644t) {
                    this.f125644t = recordingStatus;
                    String str4 = "RecordingStatus changed [" + i10 + "](" + recordingStatus + ")";
                    Log.d(AnyKt.SUGARCUBE_TAG, str4);
                    F0 unused2 = C16314k.d(C5222z.a(this.f125625a), (C17168i) null, (T) null, new g(str4, (C17164e<? super g>) null), 3, (Object) null);
                }
                this.f125625a.G0(update.getLightEstimate().getPixelIntensity());
                if (update.getCamera().getTrackingState() != this.f125643s) {
                    this.f125643s = update.getCamera().getTrackingState();
                    TrackingState trackingState = update.getCamera().getTrackingState();
                    C17542s.i(trackingState, "getTrackingState(...)");
                    TrackingFailureReason trackingFailureReason = update.getCamera().getTrackingFailureReason();
                    C17542s.i(trackingFailureReason, "getTrackingFailureReason(...)");
                    this.f125625a.W0(trackingState, trackingFailureReason);
                    String str5 = "Tracking changed [" + i10 + "](" + this.f125643s + "," + trackingFailureReason + ")";
                    Log.d(AnyKt.SUGARCUBE_TAG, str5);
                    F0 unused3 = C16314k.d(C5222z.a(this.f125625a), C16311i0.b(), (T) null, new h(str5, (C17164e<? super h>) null), 2, (Object) null);
                }
                C17542s.g(update);
            } catch (IllegalStateException e10) {
                String str6 = "could not recordTrackData [" + i10 + "] " + e10;
                Log.d(AnyKt.SUGARCUBE_TAG, str6);
                F0 unused4 = C16314k.d(C5222z.a(this.f125625a), (C17168i) null, (T) null, new f(str6, (C17164e<? super f>) null), 3, (Object) null);
            } catch (Throwable th5) {
                F0 unused5 = C16314k.d(C5222z.a(this.f125625a), C16311i0.b(), (T) null, new i((C17164e<? super i>) null), 2, (Object) null);
                this.f125627c.log("error processing frame(uw) " + this.f125625a.L0().x1());
                this.f125627c.recordException(th5);
            }
        }
    }

    private final void t() {
        this.f125622D.position(0);
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f125619A);
        GLES20.glUseProgram(this.f125647w);
        GLES20.glVertexAttribPointer(this.f125648x, 2, 5126, false, 0, this.f125621C);
        GLES20.glVertexAttribPointer(this.f125649y, 2, 5126, false, 0, this.f125622D);
        GLES20.glEnableVertexAttribArray(this.f125648x);
        GLES20.glEnableVertexAttribArray(this.f125649y);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f125648x);
        GLES20.glDisableVertexAttribArray(this.f125649y);
        GLES20.glDepthMask(true);
        GLES20.glEnable(2929);
    }

    private final CameraManager x() {
        return (CameraManager) this.f125642r.getValue();
    }

    /* access modifiers changed from: private */
    public final DisplayManager y() {
        return (DisplayManager) this.f125640p.getValue();
    }

    public final p0 A() {
        return this.f125635k;
    }

    public final Session B() {
        return this.f125634j;
    }

    public final GLSurfaceView C() {
        return this.f125626b;
    }

    public final boolean D() {
        return this.f125628d;
    }

    public final void I(boolean z10) {
        this.f125633i = z10;
    }

    public final void J(boolean z10) {
        this.f125632h = z10;
    }

    public final void K(Session session) {
        this.f125634j = session;
    }

    public final void L(boolean z10) {
        this.f125628d = z10;
    }

    public final void M(boolean z10) {
        this.f125629e = z10;
    }

    public final void N(int i10) {
        this.f125631g = i10;
    }

    public final void O(int i10) {
        this.f125630f = i10;
    }

    public final Object P(String str, q<? super Session, ? super Frame, ? super C14294e, Integer> qVar, C17164e<? super F0> eVar) {
        return C16314k.d(C5222z.a(this.f125625a), C16311i0.c(), (T) null, new l(this, qVar, str, (C17164e<? super l>) null), 2, (Object) null);
    }

    public final F0 Q() {
        return C16314k.d(C5222z.a(this.f125625a), C16311i0.c(), (T) null, new m(this, (C17164e<? super m>) null), 2, (Object) null);
    }

    public final void R() {
        boolean z10 = this.f125633i;
        Session session = this.f125634j;
        Log.d(AnyKt.SUGARCUBE_TAG, "stopRecording " + z10 + " " + session);
        Session session2 = this.f125634j;
        if (session2 != null && session2.getRecordingStatus() == RecordingStatus.OK) {
            try {
                session2.stopRecording();
            } catch (RecordingFailedException e10) {
                F0 unused = C16314k.d(C5222z.a(this.f125625a), C16311i0.b(), (T) null, new n((C17164e<? super n>) null), 2, (Object) null);
                FirebaseInteractions firebaseInteractions = this.f125627c;
                UUID x12 = this.f125625a.L0().x1();
                firebaseInteractions.log("error stopRecording(uw) " + x12);
                this.f125627c.recordException(e10);
            }
        }
    }

    public final UltrawideActivity u() {
        return this.f125625a;
    }

    public final boolean v() {
        return this.f125633i;
    }

    public final C14286a w() {
        return this.f125637m;
    }

    public final FirebaseInteractions z() {
        return this.f125627c;
    }
}
