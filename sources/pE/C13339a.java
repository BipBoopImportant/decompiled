package PE;

import KF.C13147a;
import KF.C13164r;
import OE.C13309a;
import QJ.Q;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import YE.C13868b;
import YH.C16877v;
import YH.X;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.util.Log;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.app.base.capture.CaptureSession;
import com.sugarcube.app.base.data.AnalyticsManager;
import com.sugarcube.app.base.data.SceneRepository;
import com.sugarcube.app.base.data.database.Media;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.upload.IUploaderV2;
import com.sugarcube.core.analytics.ActionType;
import com.sugarcube.core.analytics.BaseEventProperty;
import com.sugarcube.core.analytics.Capture;
import com.sugarcube.core.analytics.Event;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import eI.C17187b;
import jI.C17423j;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.K;
import nI.p;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0019\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001?BK\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u001eH@¢\u0006\u0004\b%\u0010&J%\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010.J%\u00100\u001a\b\u0012\u0004\u0012\u00020/0+2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b0\u0010.J\u0015\u00101\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b3\u0010&J\u0018\u00104\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH@¢\u0006\u0004\b4\u0010&J\u0015\u00105\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b5\u00106J\u0015\u00107\u001a\u00020)2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b7\u00106J)\u0010:\u001a\u00020$2\u0006\u0010(\u001a\u00020'2\u0006\u00108\u001a\u00020\u00172\n\b\u0002\u00104\u001a\u0004\u0018\u000109¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\b\u0012\u0004\u0012\u00020/0+2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b>\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010ER\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010FR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010GR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010HR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u0010IR.\u0010#\u001a\u0004\u0018\u00010\u001e2\b\u0010J\u001a\u0004\u0018\u00010\u001e8F@FX\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u00102R\u0013\u0010Q\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, d2 = {"LPE/a;", "", "Landroid/content/Context;", "appContext", "LOE/a;", "appEnvironment", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "analyticsManager", "LKF/a;", "files", "Lcom/sugarcube/app/base/data/SceneRepository;", "sceneRepository", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebaseInteractions", "LKF/r;", "uploadVersion", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "uploaderV2", "<init>", "(Landroid/content/Context;LOE/a;Lcom/sugarcube/app/base/data/AnalyticsManager;LKF/a;Lcom/sugarcube/app/base/data/SceneRepository;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;LKF/r;Lcom/sugarcube/app/base/upload/IUploaderV2;)V", "context", "", "fovThreshold", "", "i", "(Landroid/content/Context;F)Ljava/lang/String;", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "j", "(Landroid/hardware/camera2/CameraManager;F)Ljava/lang/String;", "Lcom/sugarcube/app/base/capture/CaptureSession;", "captureSession", "Lcom/sugarcube/core/analytics/Trackable;", "s", "(Lcom/sugarcube/app/base/capture/CaptureSession;)Lcom/sugarcube/core/analytics/Trackable;", "session", "LXH/N;", "d", "(Lcom/sugarcube/app/base/capture/CaptureSession;LdI/e;)Ljava/lang/Object;", "Ljava/util/UUID;", "uuid", "Ljava/io/File;", "sourceDir", "", "Lcom/sugarcube/app/base/data/database/Media;", "f", "(Ljava/util/UUID;Ljava/io/File;)Ljava/util/List;", "Lcom/sugarcube/app/base/data/database/Metadata;", "h", "r", "(Lcom/sugarcube/app/base/capture/CaptureSession;)V", "u", "t", "l", "(Ljava/util/UUID;)Ljava/io/File;", "m", "msg", "", "p", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Throwable;)V", "e", "(Ljava/util/UUID;)Ljava/util/List;", "g", "a", "Landroid/content/Context;", "b", "LOE/a;", "c", "Lcom/sugarcube/app/base/data/AnalyticsManager;", "LKF/a;", "Lcom/sugarcube/app/base/data/SceneRepository;", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "LKF/r;", "Lcom/sugarcube/app/base/upload/IUploaderV2;", "value", "Lcom/sugarcube/app/base/capture/CaptureSession;", "n", "()Lcom/sugarcube/app/base/capture/CaptureSession;", "v", "o", "()Ljava/lang/String;", "ultraWideCameraId", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: PE.a  reason: case insensitive filesystem */
public final class C13339a {

    /* renamed from: j  reason: collision with root package name */
    public static final C2807a f113989j = new C2807a((DefaultConstructorMarker) null);

    /* renamed from: k  reason: collision with root package name */
    public static final int f113990k = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f113991a;

    /* renamed from: b  reason: collision with root package name */
    private final C13309a f113992b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final AnalyticsManager f113993c;

    /* renamed from: d  reason: collision with root package name */
    private final C13147a f113994d;

    /* renamed from: e  reason: collision with root package name */
    private final SceneRepository f113995e;

    /* renamed from: f  reason: collision with root package name */
    private final FirebaseInteractions f113996f;

    /* renamed from: g  reason: collision with root package name */
    private final C13164r f113997g;

    /* renamed from: h  reason: collision with root package name */
    private final IUploaderV2 f113998h;

    /* renamed from: i  reason: collision with root package name */
    private CaptureSession f113999i;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0011\u001a\u00020\u00108\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\u00068\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"LPE/a$a;", "", "<init>", "()V", "", "idx", "", "ext", "a", "(ILjava/lang/String;)Ljava/lang/String;", "CAPTURE_TYPE_HYBRID", "Ljava/lang/String;", "CAPTURE_TYPE_ULTRAWIDE", "CAPTURE_STRATEGY_ARPANO", "CAPTURE_STRATEGY_CAMPANO", "PIPELINE_TYPE_ULTRAWIDE", "", "ULTRAWIDE_FOV_THRESHOLD", "F", "PANO_IMAGE_PREFIX", "PANO_IMAGE_HEIF_EXT", "PANO_IMAGE_JPEG_EXT", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: PE.a$a  reason: collision with other inner class name */
    public static final class C2807a {
        public /* synthetic */ C2807a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ String b(C2807a aVar, int i10, String str, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str = "jpg";
            }
            return aVar.a(i10, str);
        }

        public final String a(int i10, String str) {
            C17542s.j(str, "ext");
            return "colorPano_0_" + i10 + "." + str;
        }

        private C2807a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.CaptureRepository", f = "CaptureRepository.kt", l = {232, 237}, m = "addCapture")
    /* renamed from: PE.a$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f114000c;

        /* renamed from: d  reason: collision with root package name */
        Object f114001d;

        /* renamed from: e  reason: collision with root package name */
        Object f114002e;

        /* renamed from: f  reason: collision with root package name */
        Object f114003f;

        /* renamed from: g  reason: collision with root package name */
        Object f114004g;

        /* renamed from: h  reason: collision with root package name */
        Object f114005h;

        /* renamed from: i  reason: collision with root package name */
        int f114006i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f114007j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C13339a f114008k;

        /* renamed from: l  reason: collision with root package name */
        int f114009l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13339a aVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f114008k = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f114007j = obj;
            this.f114009l |= Integer.MIN_VALUE;
            return this.f114008k.d((CaptureSession) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.CaptureRepository", f = "CaptureRepository.kt", l = {207}, m = "save")
    /* renamed from: PE.a$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f114010c;

        /* renamed from: d  reason: collision with root package name */
        Object f114011d;

        /* renamed from: e  reason: collision with root package name */
        Object f114012e;

        /* renamed from: f  reason: collision with root package name */
        Object f114013f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f114014g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13339a f114015h;

        /* renamed from: i  reason: collision with root package name */
        int f114016i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C13339a aVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f114015h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f114014g = obj;
            this.f114016i |= Integer.MIN_VALUE;
            return this.f114015h.t((CaptureSession) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.CaptureRepository$save$job$1", f = "CaptureRepository.kt", l = {204}, m = "invokeSuspend")
    /* renamed from: PE.a$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f114017c;

        /* renamed from: d  reason: collision with root package name */
        Object f114018d;

        /* renamed from: e  reason: collision with root package name */
        Object f114019e;

        /* renamed from: f  reason: collision with root package name */
        Object f114020f;

        /* renamed from: g  reason: collision with root package name */
        Object f114021g;

        /* renamed from: h  reason: collision with root package name */
        Object f114022h;

        /* renamed from: i  reason: collision with root package name */
        int f114023i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ CaptureSession f114024j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C13339a f114025k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(CaptureSession captureSession, C13339a aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f114024j = captureSession;
            this.f114025k = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f114024j, this.f114025k, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16807N n10;
            Object f10 = C17187b.f();
            int i10 = this.f114023i;
            if (i10 == 0) {
                y.b(obj);
                K k10 = new K();
                CaptureSession captureSession = this.f114024j;
                C13339a aVar = this.f114025k;
                synchronized (captureSession) {
                    try {
                        if (!captureSession.getSaved()) {
                            UUID uuid = captureSession.getUuid();
                            String name = Thread.currentThread().getName();
                            C13339a.q(aVar, uuid, "save: checkFiles " + name, (Throwable) null, 4, (Object) null);
                            if (captureSession.hasRequiredFiles(aVar)) {
                                k10.f144344a = true;
                                captureSession.setSaved(true);
                            } else {
                                captureSession.setHasError(true);
                            }
                            aVar.f113993c.track((Event) Capture.Result, ActionType.Workflow, captureSession, aVar.s(captureSession));
                        }
                        n10 = C16807N.f139792a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (k10.f144344a) {
                    C13339a aVar2 = this.f114025k;
                    UUID uuid2 = this.f114024j.getUuid();
                    String name2 = Thread.currentThread().getName();
                    C13339a.q(aVar2, uuid2, "save: addCapture " + name2, (Throwable) null, 4, (Object) null);
                    C13339a aVar3 = this.f114025k;
                    CaptureSession captureSession2 = this.f114024j;
                    this.f114017c = k10;
                    this.f114018d = captureSession;
                    this.f114019e = captureSession;
                    this.f114020f = aVar;
                    this.f114021g = captureSession;
                    this.f114022h = n10;
                    this.f114023i = 1;
                    if (aVar3.d(captureSession2, this) == f10) {
                        return f10;
                    }
                }
            } else if (i10 == 1) {
                C16807N n11 = (C16807N) this.f114022h;
                CaptureSession captureSession3 = (CaptureSession) this.f114021g;
                C13339a aVar4 = (C13339a) this.f114020f;
                CaptureSession captureSession4 = (CaptureSession) this.f114019e;
                CaptureSession captureSession5 = (CaptureSession) this.f114018d;
                K k11 = (K) this.f114017c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.CaptureRepository", f = "CaptureRepository.kt", l = {171}, m = "saveFiles")
    /* renamed from: PE.a$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f114026c;

        /* renamed from: d  reason: collision with root package name */
        Object f114027d;

        /* renamed from: e  reason: collision with root package name */
        Object f114028e;

        /* renamed from: f  reason: collision with root package name */
        Object f114029f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f114030g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C13339a f114031h;

        /* renamed from: i  reason: collision with root package name */
        int f114032i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C13339a aVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f114031h = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f114030g = obj;
            this.f114032i |= Integer.MIN_VALUE;
            return this.f114031h.u((CaptureSession) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.capture.CaptureRepository$saveFiles$job$1", f = "CaptureRepository.kt", l = {}, m = "invokeSuspend")
    /* renamed from: PE.a$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f114033c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ CaptureSession f114034d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13339a f114035e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(CaptureSession captureSession, C13339a aVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f114034d = captureSession;
            this.f114035e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f114034d, this.f114035e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f114033c == 0) {
                y.b(obj);
                CaptureSession captureSession = this.f114034d;
                C13339a aVar = this.f114035e;
                synchronized (captureSession) {
                    captureSession.saveFiles(aVar);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C13339a(Context context, C13309a aVar, AnalyticsManager analyticsManager, C13147a aVar2, SceneRepository sceneRepository, FirebaseInteractions firebaseInteractions, C13164r rVar, IUploaderV2 iUploaderV2) {
        C17542s.j(context, "appContext");
        C17542s.j(aVar, "appEnvironment");
        C17542s.j(analyticsManager, "analyticsManager");
        C17542s.j(aVar2, "files");
        C17542s.j(sceneRepository, "sceneRepository");
        C17542s.j(firebaseInteractions, "firebaseInteractions");
        C17542s.j(rVar, "uploadVersion");
        C17542s.j(iUploaderV2, "uploaderV2");
        this.f113991a = context;
        this.f113992b = aVar;
        this.f113993c = analyticsManager;
        this.f113994d = aVar2;
        this.f113995e = sceneRepository;
        this.f113996f = firebaseInteractions;
        this.f113997g = rVar;
        this.f113998h = iUploaderV2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object d(com.sugarcube.app.base.capture.CaptureSession r21, dI.C17164e<? super XH.C16807N> r22) {
        /*
            r20 = this;
            r1 = r20
            r0 = r21
            r2 = r22
            boolean r3 = r2 instanceof PE.C13339a.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            PE.a$b r3 = (PE.C13339a.b) r3
            int r4 = r3.f114009l
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f114009l = r4
            goto L_0x001e
        L_0x0019:
            PE.a$b r3 = new PE.a$b
            r3.<init>(r1, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f114007j
            java.lang.Object r15 = eI.C17187b.f()
            int r5 = r3.f114009l
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L_0x0054
            if (r5 == r7) goto L_0x0037
            if (r5 != r6) goto L_0x002f
            goto L_0x0037
        L_0x002f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0037:
            java.lang.Object r0 = r3.f114005h
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r3.f114004g
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r3.f114003f
            com.sugarcube.app.base.capture.CaptureSession r0 = (com.sugarcube.app.base.capture.CaptureSession) r0
            java.lang.Object r2 = r3.f114002e
            dI.e r2 = (dI.C17164e) r2
            java.lang.Object r2 = r3.f114001d
            com.sugarcube.app.base.capture.CaptureSession r2 = (com.sugarcube.app.base.capture.CaptureSession) r2
            java.lang.Object r2 = r3.f114000c
            PE.a r2 = (PE.C13339a) r2
            XH.y.b(r4)
            goto L_0x00be
        L_0x0054:
            XH.y.b(r4)
            java.util.UUID r4 = r21.getUuid()
            java.util.List r4 = r1.g(r4)
            java.util.UUID r5 = r21.getUuid()
            java.util.List r5 = r1.e(r5)
            KF.r r8 = r1.f113997g
            boolean r8 = r8.b()
            r9 = 0
            if (r8 == 0) goto L_0x00c1
            com.sugarcube.app.base.upload.IUploaderV2 r6 = r1.f113998h
            java.util.UUID r8 = r21.getUuid()
            com.sugarcube.core.network.models.RoomType r10 = r21.getRoomType()
            java.lang.String r11 = r21.getRoomTitle()
            java.time.Instant r12 = r21.getCreation()
            r13 = r5
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r13 = YH.C16877v.t1(r13)
            r14 = r4
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r14 = YH.C16877v.t1(r14)
            java.lang.String r16 = r21.getCaptureType()
            java.lang.String r17 = r21.getCaptureStrategy()
            r3.f114000c = r1
            r3.f114001d = r0
            r3.f114002e = r2
            r3.f114003f = r0
            r3.f114004g = r4
            r3.f114005h = r5
            r3.f114006i = r9
            r3.f114009l = r7
            r2 = 1
            r4 = r6
            r5 = r8
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r2
            r12 = r16
            r13 = r17
            r14 = r3
            java.lang.Object r2 = r4.addUpload(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r2 != r15) goto L_0x00bd
            return r15
        L_0x00bd:
            r2 = r1
        L_0x00be:
            r9 = r2
            r2 = r0
            goto L_0x011d
        L_0x00c1:
            com.sugarcube.app.base.data.SceneRepository r7 = r1.f113995e
            java.util.UUID r8 = r21.getUuid()
            com.sugarcube.core.network.models.RoomType r10 = r21.getRoomType()
            java.lang.String r11 = r21.getRoomTitle()
            java.time.Instant r12 = r21.getCreation()
            r13 = r5
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r13 = YH.C16877v.t1(r13)
            r14 = r4
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.List r14 = YH.C16877v.t1(r14)
            java.lang.String r16 = r21.getCaptureType()
            java.lang.String r17 = r21.getCaptureStrategy()
            KF.r r6 = r1.f113997g
            boolean r19 = r6.b()
            r3.f114000c = r1
            r3.f114001d = r0
            r3.f114002e = r2
            r3.f114003f = r0
            r3.f114004g = r4
            r3.f114005h = r5
            r3.f114006i = r9
            r2 = 2
            r3.f114009l = r2
            r2 = 1
            r18 = 0
            r4 = r7
            r5 = r8
            r6 = r10
            r7 = r11
            r8 = r12
            r9 = r13
            r10 = r14
            r11 = r2
            r12 = r16
            r13 = r17
            r14 = r18
            r2 = r15
            r15 = r19
            r16 = r3
            java.lang.Object r3 = r4.addCapture(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            if (r3 != r2) goto L_0x00bd
            return r2
        L_0x011d:
            java.util.UUID r4 = r2.getUuid()
            r7 = 4
            r8 = 0
            java.lang.String r5 = "save: deleteRecursively"
            r6 = 0
            r3 = r9
            q(r3, r4, r5, r6, r7, r8)
            java.util.UUID r0 = r2.getUuid()     // Catch:{ all -> 0x0136 }
            java.io.File r0 = r9.l(r0)     // Catch:{ all -> 0x0136 }
            jI.C17423j.r(r0)     // Catch:{ all -> 0x0136 }
            goto L_0x0140
        L_0x0136:
            r0 = move-exception
            java.util.UUID r2 = r2.getUuid()
            java.lang.String r3 = "save: deleteRecursively error"
            r9.p(r2, r3, r0)
        L_0x0140:
            XH.N r0 = XH.C16807N.f139792a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: PE.C13339a.d(com.sugarcube.app.base.capture.CaptureSession, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        if (r7.equals("jpg") == false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        if (kotlin.jvm.internal.C17542s.e(r6.getName(), "pano_preview.jpg") == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0095, code lost:
        r13 = r6.getName();
        kotlin.jvm.internal.C17542s.i(r13, "getName(...)");
        r14 = android.net.Uri.fromFile(new java.io.File(r2, r6.getName()));
        kotlin.jvm.internal.C17542s.i(r14, "fromFile(...)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b8, code lost:
        if (kotlin.jvm.internal.C17542s.e(r6.getName(), "mosaic.png") == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ba, code lost:
        r6 = com.sugarcube.app.base.data.database.MediaType.MOSAIC;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00bc, code lost:
        r15 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00be, code lost:
        r6 = com.sugarcube.app.base.data.database.MediaType.IMAGE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c1, code lost:
        r6 = com.sugarcube.app.base.ui.hybrid.E0.f124534B1;
        r12 = new com.sugarcube.app.base.data.database.Media(r13, r14, r15, r6.b().getWidth(), r6.b().getHeight());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (r7.equals("heif") != false) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        if (r7.equals("png") == false) goto L_0x00d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List<com.sugarcube.app.base.data.database.Media> f(java.util.UUID r19, java.io.File r20) {
        /*
            r18 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r18
            KF.a r2 = r1.f113994d
            r3 = r19
            java.io.File r2 = r2.e(r3)
            java.io.File[] r3 = r20.listFiles()
            if (r3 == 0) goto L_0x00e0
            int r4 = r3.length
            r5 = 0
        L_0x0017:
            if (r5 >= r4) goto L_0x00e0
            r6 = r3[r5]
            kotlin.jvm.internal.C17542s.g(r6)
            java.lang.String r7 = jI.C17423j.s(r6)
            int r8 = r7.hashCode()
            r9 = 0
            java.lang.String r10 = "fromFile(...)"
            java.lang.String r11 = "getName(...)"
            switch(r8) {
                case 105441: goto L_0x007f;
                case 108273: goto L_0x0043;
                case 111145: goto L_0x0039;
                case 3198682: goto L_0x0030;
                default: goto L_0x002e;
            }
        L_0x002e:
            goto L_0x00d7
        L_0x0030:
            java.lang.String r8 = "heif"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x00d7
            goto L_0x0088
        L_0x0039:
            java.lang.String r8 = "png"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0088
            goto L_0x00d7
        L_0x0043:
            java.lang.String r8 = "mp4"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x004d
            goto L_0x00d7
        L_0x004d:
            com.sugarcube.app.base.data.database.Media r9 = new com.sugarcube.app.base.data.database.Media
            java.lang.String r13 = r6.getName()
            kotlin.jvm.internal.C17542s.i(r13, r11)
            java.io.File r7 = new java.io.File
            java.lang.String r6 = r6.getName()
            r7.<init>(r2, r6)
            android.net.Uri r14 = android.net.Uri.fromFile(r7)
            kotlin.jvm.internal.C17542s.i(r14, r10)
            com.sugarcube.app.base.data.database.MediaType r15 = com.sugarcube.app.base.data.database.MediaType.VIDEO
            com.sugarcube.app.base.ui.hybrid.E0$a r6 = com.sugarcube.app.base.ui.hybrid.E0.f124534B1
            com.sugarcube.app.base.data.model.Dimension r7 = r6.b()
            int r16 = r7.getWidth()
            com.sugarcube.app.base.data.model.Dimension r6 = r6.b()
            int r17 = r6.getHeight()
            r12 = r9
            r12.<init>(r13, r14, r15, r16, r17)
            goto L_0x00d7
        L_0x007f:
            java.lang.String r8 = "jpg"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0088
            goto L_0x00d7
        L_0x0088:
            java.lang.String r7 = r6.getName()
            java.lang.String r8 = "pano_preview.jpg"
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
            if (r7 == 0) goto L_0x0095
            goto L_0x00d7
        L_0x0095:
            com.sugarcube.app.base.data.database.Media r9 = new com.sugarcube.app.base.data.database.Media
            java.lang.String r13 = r6.getName()
            kotlin.jvm.internal.C17542s.i(r13, r11)
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r6.getName()
            r7.<init>(r2, r8)
            android.net.Uri r14 = android.net.Uri.fromFile(r7)
            kotlin.jvm.internal.C17542s.i(r14, r10)
            java.lang.String r6 = r6.getName()
            java.lang.String r7 = "mosaic.png"
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r7)
            if (r6 == 0) goto L_0x00be
            com.sugarcube.app.base.data.database.MediaType r6 = com.sugarcube.app.base.data.database.MediaType.MOSAIC
        L_0x00bc:
            r15 = r6
            goto L_0x00c1
        L_0x00be:
            com.sugarcube.app.base.data.database.MediaType r6 = com.sugarcube.app.base.data.database.MediaType.IMAGE
            goto L_0x00bc
        L_0x00c1:
            com.sugarcube.app.base.ui.hybrid.E0$a r6 = com.sugarcube.app.base.ui.hybrid.E0.f124534B1
            com.sugarcube.app.base.data.model.Dimension r7 = r6.b()
            int r16 = r7.getWidth()
            com.sugarcube.app.base.data.model.Dimension r6 = r6.b()
            int r17 = r6.getHeight()
            r12 = r9
            r12.<init>(r13, r14, r15, r16, r17)
        L_0x00d7:
            if (r9 == 0) goto L_0x00dc
            r0.add(r9)
        L_0x00dc:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x00e0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: PE.C13339a.f(java.util.UUID, java.io.File):java.util.List");
    }

    private final List<com.sugarcube.app.base.data.database.Metadata> h(UUID uuid, File file) {
        ArrayList arrayList = new ArrayList();
        File e10 = this.f113994d.e(uuid);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                C17542s.g(file2);
                if (C17542s.e(C17423j.s(file2), FeatureVariable.JSON_TYPE)) {
                    String name = file2.getName();
                    C17542s.i(name, "getName(...)");
                    Uri fromFile = Uri.fromFile(new File(e10, file2.getName()));
                    C17542s.i(fromFile, "fromFile(...)");
                    arrayList.add(new com.sugarcube.app.base.data.database.Metadata(name, fromFile));
                }
            }
        }
        return arrayList;
    }

    private final String i(Context context, float f10) {
        CameraManager cameraManager = (CameraManager) context.getSystemService("camera");
        if (cameraManager != null) {
            return j(cameraManager, f10);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008b, code lost:
        r8 = (java.lang.Float) (r8 = (android.util.Range) r0.get(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)).getLower();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String j(android.hardware.camera2.CameraManager r15, float r16) {
        /*
            r14 = this;
            r1 = r15
            java.lang.String[] r2 = r15.getCameraIdList()
            java.lang.String r0 = "getCameraIdList(...)"
            kotlin.jvm.internal.C17542s.i(r2, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.length
            r5 = 0
            r6 = r5
        L_0x0012:
            java.lang.String r7 = "findUltrawideCamera "
            if (r6 >= r4) goto L_0x005c
            r0 = r2[r6]
            android.hardware.camera2.CameraCharacteristics r8 = r15.getCameraCharacteristics(r0)     // Catch:{ all -> 0x0042 }
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch:{ all -> 0x0042 }
            java.lang.Object r9 = r8.get(r9)     // Catch:{ all -> 0x0042 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0042 }
            if (r9 != 0) goto L_0x0027
            goto L_0x0059
        L_0x0027:
            int r9 = r9.intValue()     // Catch:{ all -> 0x0042 }
            r10 = 1
            if (r9 != r10) goto L_0x0059
            android.hardware.camera2.CameraCharacteristics$Key r9 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES     // Catch:{ all -> 0x0042 }
            java.lang.Object r8 = r8.get(r9)     // Catch:{ all -> 0x0042 }
            int[] r8 = (int[]) r8     // Catch:{ all -> 0x0042 }
            if (r8 == 0) goto L_0x0059
            boolean r7 = YH.C16870n.Y(r8, r5)     // Catch:{ all -> 0x0042 }
            if (r7 != r10) goto L_0x0059
            r3.add(r0)
            goto L_0x0059
        L_0x0042:
            r0 = move-exception
            YE.b r8 = YE.C13868b.f118106a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            YE.e r7 = YE.e.Capture
            r8.b(r0, r7)
        L_0x0059:
            int r6 = r6 + 1
            goto L_0x0012
        L_0x005c:
            java.util.Iterator r2 = r3.iterator()
            r0 = 0
            r3 = 0
            r4 = r3
            r3 = r0
        L_0x0064:
            boolean r0 = r2.hasNext()
            java.lang.String r5 = "Sugarcube"
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r0 = r2.next()
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            android.hardware.camera2.CameraCharacteristics r0 = r15.getCameraCharacteristics(r6)     // Catch:{ all -> 0x0099 }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0099 }
            r9 = 30
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r8 < r9) goto L_0x009b
            android.hardware.camera2.CameraCharacteristics$Key r8 = android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE     // Catch:{ all -> 0x0099 }
            java.lang.Object r8 = r0.get(r8)     // Catch:{ all -> 0x0099 }
            android.util.Range r8 = (android.util.Range) r8     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x009b
            java.lang.Comparable r8 = r8.getLower()     // Catch:{ all -> 0x0099 }
            java.lang.Float r8 = (java.lang.Float) r8     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x009b
            float r8 = r8.floatValue()     // Catch:{ all -> 0x0099 }
            r11 = r8
            goto L_0x009c
        L_0x0099:
            r0 = move-exception
            goto L_0x00e0
        L_0x009b:
            r11 = r10
        L_0x009c:
            com.sugarcube.app.base.ui.capturev2.W$a r8 = com.sugarcube.app.base.ui.capturev2.W.f123656f     // Catch:{ all -> 0x0099 }
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ all -> 0x0099 }
            r12 = 2
            r13 = 0
            r10 = 0
            r9 = r0
            com.sugarcube.app.base.ui.capturev2.W r8 = com.sugarcube.app.base.ui.capturev2.W.a.b(r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0099 }
            float[] r8 = r8.a()     // Catch:{ all -> 0x0099 }
            float r8 = YH.C16870n.I0(r8)     // Catch:{ all -> 0x0099 }
            int r9 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r9 < 0) goto L_0x00dc
            int r9 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r9 <= 0) goto L_0x00dc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d8 }
            r3.<init>()     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = "ULTRAWIDE supported - "
            r3.append(r4)     // Catch:{ all -> 0x00d8 }
            r3.append(r6)     // Catch:{ all -> 0x00d8 }
            java.lang.String r4 = " "
            r3.append(r4)     // Catch:{ all -> 0x00d8 }
            r3.append(r8)     // Catch:{ all -> 0x00d8 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00d8 }
            android.util.Log.d(r5, r3)     // Catch:{ all -> 0x00d8 }
            r3 = r6
            r4 = r8
            goto L_0x00dc
        L_0x00d8:
            r0 = move-exception
            r3 = r6
            r4 = r8
            goto L_0x00e0
        L_0x00dc:
            kotlin.jvm.internal.C17542s.g(r0)     // Catch:{ all -> 0x0099 }
            goto L_0x0064
        L_0x00e0:
            YE.b r5 = YE.C13868b.f118106a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            YE.e r6 = YE.e.Capture
            r5.b(r0, r6)
            goto L_0x0064
        L_0x00f8:
            if (r3 != 0) goto L_0x00ff
            java.lang.String r0 = "ULTRAWIDE not supported"
            android.util.Log.d(r5, r0)
        L_0x00ff:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: PE.C13339a.j(android.hardware.camera2.CameraManager, float):java.lang.String");
    }

    static /* synthetic */ String k(C13339a aVar, Context context, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = 90.0f;
        }
        return aVar.i(context, f10);
    }

    public static /* synthetic */ void q(C13339a aVar, UUID uuid, String str, Throwable th2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        aVar.p(uuid, str, th2);
    }

    /* access modifiers changed from: private */
    public final Trackable s(CaptureSession captureSession) {
        List<v> list;
        File[] listFiles = m(captureSession.getUuid()).listFiles();
        if (listFiles != null) {
            list = new ArrayList<>(listFiles.length);
            for (File file : listFiles) {
                list.add(new v(file.getName(), Long.valueOf(file.length())));
            }
        } else {
            list = C16877v.n();
        }
        v a10 = C16796C.a(TrackingKey.FileSizeList, list.toString());
        TrackingKey trackingKey = TrackingKey.FilesTotalSize;
        long j10 = 0;
        for (v d10 : list) {
            j10 += ((Number) d10.d()).longValue();
        }
        return new BaseEventProperty(X.l(a10, C16796C.a(trackingKey, String.valueOf(j10)), C16796C.a(TrackingKey.Result, captureSession.getSaved() ? "Success" : "Failed")));
    }

    public final List<Media> e(UUID uuid) {
        C17542s.j(uuid, "uuid");
        return f(uuid, this.f113994d.e(uuid));
    }

    public final List<com.sugarcube.app.base.data.database.Metadata> g(UUID uuid) {
        C17542s.j(uuid, "uuid");
        return h(uuid, this.f113994d.e(uuid));
    }

    public final File l(UUID uuid) {
        C17542s.j(uuid, "uuid");
        return this.f113994d.b(uuid);
    }

    public final File m(UUID uuid) {
        C17542s.j(uuid, "uuid");
        return this.f113994d.e(uuid);
    }

    public final CaptureSession n() {
        CaptureSession captureSession = this.f113999i;
        Log.d(AnyKt.SUGARCUBE_TAG, "CaptureRepository.session.get " + captureSession);
        return this.f113999i;
    }

    public final String o() {
        return k(this, this.f113991a, 0.0f, 2, (Object) null);
    }

    public final void p(UUID uuid, String str, Throwable th2) {
        C17542s.j(uuid, "uuid");
        C17542s.j(str, "msg");
        String str2 = "[" + uuid + "] " + str;
        Log.d(AnyKt.SUGARCUBE_TAG, str2, th2);
        C13868b.f118106a.b(str2, YE.e.Capture);
        if (th2 != null) {
            this.f113996f.log(str2);
            this.f113996f.recordException(th2);
        }
    }

    public final void r(CaptureSession captureSession) {
        C17542s.j(captureSession, "captureSession");
        q(this, captureSession.getUuid(), "restart: deleteRecursively", (Throwable) null, 4, (Object) null);
        try {
            C17423j.r(l(captureSession.getUuid()));
        } catch (Throwable th2) {
            p(captureSession.getUuid(), "restart: deleteRecursively error", th2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object t(com.sugarcube.app.base.capture.CaptureSession r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof PE.C13339a.c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            PE.a$c r0 = (PE.C13339a.c) r0
            int r1 = r0.f114016i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114016i = r1
            goto L_0x0018
        L_0x0013:
            PE.a$c r0 = new PE.a$c
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f114014g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f114016i
            java.lang.String r4 = " "
            r5 = 1
            if (r3 == 0) goto L_0x0044
            if (r3 != r5) goto L_0x003c
            java.lang.Object r13 = r0.f114013f
            QJ.F0 r13 = (QJ.F0) r13
            java.lang.Object r13 = r0.f114012e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f114011d
            com.sugarcube.app.base.capture.CaptureSession r13 = (com.sugarcube.app.base.capture.CaptureSession) r13
            java.lang.Object r14 = r0.f114010c
            PE.a r14 = (PE.C13339a) r14
            XH.y.b(r1)
            r5 = r14
            goto L_0x0093
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0044:
            XH.y.b(r1)
            java.util.UUID r7 = r13.getUuid()
            boolean r1 = r13.getSaved()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "save: begin "
            r6.append(r8)
            r6.append(r1)
            r6.append(r4)
            r6.append(r3)
            java.lang.String r8 = r6.toString()
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r12
            q(r6, r7, r8, r9, r10, r11)
            OE.a r1 = r12.f113992b
            PE.a$d r3 = new PE.a$d
            r6 = 0
            r3.<init>(r13, r12, r6)
            QJ.F0 r1 = OE.C13310b.a(r1, r3)
            r0.f114010c = r12
            r0.f114011d = r13
            r0.f114012e = r14
            r0.f114013f = r1
            r0.f114016i = r5
            java.lang.Object r14 = r1.j0(r0)
            if (r14 != r2) goto L_0x0092
            return r2
        L_0x0092:
            r5 = r12
        L_0x0093:
            java.util.UUID r6 = r13.getUuid()
            boolean r14 = r13.getSaved()
            boolean r13 = r13.getHasError()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r0 = r0.getName()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "save: end s="
            r1.append(r2)
            r1.append(r14)
            java.lang.String r14 = " e="
            r1.append(r14)
            r1.append(r13)
            r1.append(r4)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r9 = 4
            r10 = 0
            r8 = 0
            q(r5, r6, r7, r8, r9, r10)
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: PE.C13339a.t(com.sugarcube.app.base.capture.CaptureSession, dI.e):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object u(com.sugarcube.app.base.capture.CaptureSession r13, dI.C17164e<? super XH.C16807N> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof PE.C13339a.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            PE.a$e r0 = (PE.C13339a.e) r0
            int r1 = r0.f114032i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f114032i = r1
            goto L_0x0018
        L_0x0013:
            PE.a$e r0 = new PE.a$e
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f114030g
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f114032i
            java.lang.String r4 = " "
            r5 = 1
            if (r3 == 0) goto L_0x0044
            if (r3 != r5) goto L_0x003c
            java.lang.Object r13 = r0.f114029f
            QJ.F0 r13 = (QJ.F0) r13
            java.lang.Object r13 = r0.f114028e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f114027d
            com.sugarcube.app.base.capture.CaptureSession r13 = (com.sugarcube.app.base.capture.CaptureSession) r13
            java.lang.Object r14 = r0.f114026c
            PE.a r14 = (PE.C13339a) r14
            XH.y.b(r1)
            r5 = r14
            goto L_0x0093
        L_0x003c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0044:
            XH.y.b(r1)
            java.util.UUID r7 = r13.getUuid()
            boolean r1 = r13.getSaved()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "saveFiles: begin "
            r6.append(r8)
            r6.append(r1)
            r6.append(r4)
            r6.append(r3)
            java.lang.String r8 = r6.toString()
            r10 = 4
            r11 = 0
            r9 = 0
            r6 = r12
            q(r6, r7, r8, r9, r10, r11)
            OE.a r1 = r12.f113992b
            PE.a$f r3 = new PE.a$f
            r6 = 0
            r3.<init>(r13, r12, r6)
            QJ.F0 r1 = OE.C13310b.a(r1, r3)
            r0.f114026c = r12
            r0.f114027d = r13
            r0.f114028e = r14
            r0.f114029f = r1
            r0.f114032i = r5
            java.lang.Object r14 = r1.j0(r0)
            if (r14 != r2) goto L_0x0092
            return r2
        L_0x0092:
            r5 = r12
        L_0x0093:
            java.util.UUID r6 = r13.getUuid()
            boolean r13 = r13.getSaved()
            java.lang.Thread r14 = java.lang.Thread.currentThread()
            java.lang.String r14 = r14.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "saveFiles: end "
            r0.append(r1)
            r0.append(r13)
            r0.append(r4)
            r0.append(r14)
            java.lang.String r7 = r0.toString()
            r9 = 4
            r10 = 0
            r8 = 0
            q(r5, r6, r7, r8, r9, r10)
            XH.N r13 = XH.C16807N.f139792a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: PE.C13339a.u(com.sugarcube.app.base.capture.CaptureSession, dI.e):java.lang.Object");
    }

    public final void v(CaptureSession captureSession) {
        this.f113999i = captureSession;
        Log.d(AnyKt.SUGARCUBE_TAG, "CaptureRepository.session.set " + captureSession);
    }
}
