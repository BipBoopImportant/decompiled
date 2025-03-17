package com.sugarcube.app.base.ui.capturev2;

import PE.C13341c;
import QJ.C16311i0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YE.C13868b;
import YH.C16877v;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import android.util.Log;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.google.ar.core.Pose;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.Session;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import com.sugarcube.app.base.ui.capturev2.ArControl;
import com.sugarcube.core.logger.AnyKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 Ë\u00012\u00020\u0001:\u0001dB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r\u0012\u0014\b\u0002\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u0012\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0 *\b\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J'\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0 *\b\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010$J'\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0 *\b\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b&\u0010$J\u0019\u0010)\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b+\u0010*J\u0019\u0010,\u001a\u00020\u00102\b\u0010(\u001a\u0004\u0018\u00010'H\u0016¢\u0006\u0004\b,\u0010*J\u0019\u0010/\u001a\u00020\u00102\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0018H\u0016¢\u0006\u0004\b2\u0010\u001bJ\u0017\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J)\u0010;\u001a\u0002032\u0006\u0010(\u001a\u00020'2\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<J#\u0010?\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J)\u0010G\u001a\u00020\u00102\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\b\u0010F\u001a\u0004\u0018\u00010EH\u0016¢\u0006\u0004\bG\u0010HJ#\u0010I\u001a\u00020\u00102\b\u0010=\u001a\u0004\u0018\u00010\b2\b\u0010\u001a\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bI\u0010@J\u0017\u0010=\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\bH\u0016¢\u0006\u0004\b=\u0010KJ\r\u0010L\u001a\u00020\u0010¢\u0006\u0004\bL\u0010MJ\u0015\u0010P\u001a\u00020\u00102\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ%\u0010U\u001a\u00020\u00102\u0016\u0010T\u001a\u0012\u0012\u0004\u0012\u00020R\u0012\u0004\u0012\u00020\u00100\u0012j\u0002`S¢\u0006\u0004\bU\u0010VJ\u001a\u0010Y\u001a\u00020\u00102\b\u0010X\u001a\u0004\u0018\u00010WH@¢\u0006\u0004\bY\u0010ZJ\u001d\u0010^\u001a\u00020[2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020\u0018¢\u0006\u0004\b^\u0010_R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001a\u0010\f\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\bU\u0010q\u001a\u0004\bt\u0010sR)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r8\u0006¢\u0006\f\n\u0004\bP\u0010u\u001a\u0004\bv\u0010wR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00100\u00128\u0006¢\u0006\f\n\u0004\b#\u0010x\u001a\u0004\by\u0010zR\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u00148\u0006¢\u0006\f\n\u0004\b{\u0010|\u001a\u0004\b}\u0010~R\u001d\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000e08\u0002X\u0004¢\u0006\b\n\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u0002032\u0007\u0010\u0001\u001a\u0002038\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00020\u000e2\u0007\u0010\u0001\u001a\u00020\u000e8\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00020\u000f2\u0007\u0010\u0001\u001a\u00020\u000f8\u0006@BX\u000e¢\u0006\u000f\n\u0005\by\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R,\u0010\u0001\u001a\u00030\u00012\b\u0010\u0001\u001a\u00030\u00018\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R*\u0010\u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020\u00188\u0006@BX\u000e¢\u0006\u0010\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00020!2\u0007\u0010\u0001\u001a\u00020!8\u0006@BX\u000e¢\u0006\u000f\n\u0005\bv\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R)\u0010 \u0001\u001a\u00020\u00182\u0007\u0010\u0001\u001a\u00020\u00188\u0006@BX\u000e¢\u0006\u000f\n\u0005\b}\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001R\u0017\u0010]\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b%\u0010\u0001R\u0019\u0010£\u0001\u001a\u00030¡\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010¢\u0001R\u001a\u0010¥\u0001\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u001a\u0010¤\u0001R\u001b\u0010¦\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bL\u0010¢\u0001R\u001b\u0010§\u0001\u001a\u0005\u0018\u00010¡\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b^\u0010¢\u0001R\u0018\u0010¨\u0001\u001a\u00020!8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0001R\u001b\u0010«\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010­\u0001\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¬\u0001\u0010\u0001R\u0018\u0010®\u0001\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\bY\u0010\u0001R\u001e\u0010²\u0001\u001a\t\u0012\u0004\u0012\u00020\u001c0¯\u00018\u0002X\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0019\u0010´\u0001\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b³\u0001\u0010\u0001R\u001c\u0010¸\u0001\u001a\u0005\u0018\u00010µ\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R \u0010¼\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180¹\u00018\u0002@\u0002X\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0019\u0010¾\u0001\u001a\u0002038\u0002@\u0002X\u000e¢\u0006\b\n\u0006\b½\u0001\u0010\u0001R\u0018\u0010¿\u0001\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010qR\u0016\u0010Á\u0001\u001a\u00020\n8VX\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010sR\u0016\u0010Ã\u0001\u001a\u00020\n8VX\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010sR\u001a\u0010Æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u000e0Ä\u00018F¢\u0006\u0007\u001a\u0005\b{\u0010Å\u0001R)\u0010Ç\u0001\u001a\u0002032\u0007\u0010\u0001\u001a\u0002038F@FX\u000e¢\u0006\u000f\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b©\u0001\u00106R)\u0010È\u0001\u001a\u0002032\u0007\u0010\u0001\u001a\u0002038F@FX\u000e¢\u0006\u000f\u001a\u0006\b\u0001\u0010\u0001\"\u0005\b¬\u0001\u00106R)\u0010Ê\u0001\u001a\u0002032\u0007\u0010\u0001\u001a\u0002038F@FX\u000e¢\u0006\u000f\u001a\u0006\b\u0001\u0010\u0001\"\u0005\bÉ\u0001\u00106¨\u0006Ì\u0001"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/d;", "Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "LQJ/Q;", "scope", "Lcom/sugarcube/app/base/ui/capturev2/S0;", "data", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "firebase", "", "recordingPath", "", "useImageFormatJPEG", "useVideoEncoder", "Lkotlin/Function2;", "Lcom/google/ar/core/TrackingState;", "Lcom/google/ar/core/TrackingFailureReason;", "LXH/N;", "trackingCallback", "Lkotlin/Function1;", "pixelIntensityCallback", "Lkotlin/Function0;", "updateCallback", "<init>", "(LQJ/Q;Lcom/sugarcube/app/base/ui/capturev2/S0;Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;Ljava/lang/String;ZZLnI/p;LnI/l;LnI/a;)V", "", "pixelIntensity", "t", "(F)V", "Lcom/sugarcube/app/base/ui/capturev2/V;", "frameData", "s", "(Lcom/sugarcube/app/base/ui/capturev2/V;)V", "", "", "timestamp", "h", "(Ljava/util/List;J)Ljava/util/List;", "r", "w", "Lcom/google/ar/core/Session;", "session", "onResume", "(Lcom/google/ar/core/Session;)V", "onPause", "onDestroy", "Lcom/sugarcube/app/base/ui/capturev2/W;", "intrinsics", "onArCameraIntrinsics", "(Lcom/sugarcube/app/base/ui/capturev2/W;)V", "scale", "onSharedImageScale", "", "orientation", "onSensorOrientation", "(I)V", "Lcom/google/ar/core/Frame;", "frame", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "sensorData", "onDrawFrame", "(Lcom/google/ar/core/Session;Lcom/google/ar/core/Frame;Lcom/sugarcube/app/base/ui/capturev2/R0;)I", "log", "", "onError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Landroid/content/Context;", "context", "Landroid/media/Image;", "image", "Landroid/hardware/camera2/TotalCaptureResult;", "lastCaptureResult", "onImageAvailable", "(Landroid/content/Context;Landroid/media/Image;Landroid/hardware/camera2/TotalCaptureResult;)V", "onImageError", "msg", "(Ljava/lang/String;)V", "u", "()V", "", "angles", "g", "([F)V", "Lcom/sugarcube/app/base/ui/capturev2/a;", "Lcom/sugarcube/app/base/ui/capturev2/ImageResultCallback;", "callback", "f", "(LnI/l;)V", "Lcom/sugarcube/app/base/ui/capturev2/q;", "arSurface", "z", "(Lcom/sugarcube/app/base/ui/capturev2/q;LdI/e;)Ljava/lang/Object;", "Landroid/graphics/Bitmap;", "bitmap", "sensorOrientation", "v", "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;", "a", "LQJ/Q;", "getScope", "()LQJ/Q;", "b", "Lcom/sugarcube/app/base/ui/capturev2/S0;", "getData", "()Lcom/sugarcube/app/base/ui/capturev2/S0;", "c", "Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "getFirebase", "()Lcom/sugarcube/app/base/external/interactions/FirebaseInteractions;", "d", "Ljava/lang/String;", "getRecordingPath", "()Ljava/lang/String;", "e", "Z", "getUseImageFormatJPEG", "()Z", "getUseVideoEncoder", "LnI/p;", "p", "()LnI/p;", "LnI/l;", "m", "()LnI/l;", "i", "LnI/a;", "q", "()LnI/a;", "Landroidx/lifecycle/K;", "j", "Landroidx/lifecycle/K;", "_arTracking", "value", "k", "I", "getFrameCount", "()I", "frameCount", "l", "Lcom/google/ar/core/TrackingState;", "()Lcom/google/ar/core/TrackingState;", "lastTrackingState", "Lcom/google/ar/core/TrackingFailureReason;", "()Lcom/google/ar/core/TrackingFailureReason;", "lastTrackingReason", "Lcom/google/ar/core/RecordingStatus;", "n", "Lcom/google/ar/core/RecordingStatus;", "getLastRecordingStatus", "()Lcom/google/ar/core/RecordingStatus;", "lastRecordingStatus", "o", "F", "getLastPixelIntensity", "()F", "lastPixelIntensity", "J", "getLastTimestamp", "()J", "lastTimestamp", "getSharedImageScale", "sharedImageScale", "Lcom/google/ar/core/Pose;", "Lcom/google/ar/core/Pose;", "physicalPose", "Lcom/sugarcube/app/base/ui/capturev2/a;", "imageRequest", "anchorPose", "lastPose", "lastPoseTs", "x", "Lcom/sugarcube/app/base/ui/capturev2/W;", "arCameraIntrinsics", "y", "lastQueuedFrameCount", "lastProcessFrameCount", "LTJ/A;", "A", "LTJ/A;", "queue", "B", "framerateSkipCount", "Lcom/sugarcube/app/base/ui/capturev2/r;", "C", "Lcom/sugarcube/app/base/ui/capturev2/r;", "avcEncoder", "", "D", "Ljava/util/List;", "pixelIntensityList", "E", "pixelIntensityIndex", "previousIntensityLow", "getUseSharedCamera", "useSharedCamera", "getUseRecording", "useRecording", "Landroidx/lifecycle/F;", "()Landroidx/lifecycle/F;", "arTracking", "recordingStartIdx", "recordingStopIdx", "setFramerateSkip", "framerateSkip", "G", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.capturev2.d  reason: case insensitive filesystem */
public final class C14202d implements ArControl {

    /* renamed from: G  reason: collision with root package name */
    public static final b f123693G = new b((DefaultConstructorMarker) null);

    /* renamed from: H  reason: collision with root package name */
    public static final int f123694H = 8;

    /* renamed from: A  reason: collision with root package name */
    private final C16504A<V> f123695A;

    /* renamed from: B  reason: collision with root package name */
    private int f123696B;

    /* renamed from: C  reason: collision with root package name */
    private r f123697C;

    /* renamed from: D  reason: collision with root package name */
    private List<Float> f123698D;

    /* renamed from: E  reason: collision with root package name */
    private int f123699E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f123700F;

    /* renamed from: a  reason: collision with root package name */
    private final Q f123701a;

    /* renamed from: b  reason: collision with root package name */
    private final S0 f123702b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInteractions f123703c;

    /* renamed from: d  reason: collision with root package name */
    private final String f123704d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f123705e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f123706f;

    /* renamed from: g  reason: collision with root package name */
    private final p<TrackingState, TrackingFailureReason, C16807N> f123707g;

    /* renamed from: h  reason: collision with root package name */
    private final C17642l<Boolean, C16807N> f123708h;

    /* renamed from: i  reason: collision with root package name */
    private final C17631a<C16807N> f123709i;

    /* renamed from: j  reason: collision with root package name */
    private final K<TrackingState> f123710j = new K<>(null);

    /* renamed from: k  reason: collision with root package name */
    private int f123711k;

    /* renamed from: l  reason: collision with root package name */
    private TrackingState f123712l;

    /* renamed from: m  reason: collision with root package name */
    private TrackingFailureReason f123713m;

    /* renamed from: n  reason: collision with root package name */
    private RecordingStatus f123714n;

    /* renamed from: o  reason: collision with root package name */
    private float f123715o;

    /* renamed from: p  reason: collision with root package name */
    private long f123716p;

    /* renamed from: q  reason: collision with root package name */
    private float f123717q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public float f123718r;

    /* renamed from: s  reason: collision with root package name */
    private Pose f123719s;

    /* renamed from: t  reason: collision with root package name */
    private C14196a f123720t;

    /* renamed from: u  reason: collision with root package name */
    private Pose f123721u;

    /* renamed from: v  reason: collision with root package name */
    private Pose f123722v;

    /* renamed from: w  reason: collision with root package name */
    private long f123723w;

    /* renamed from: x  reason: collision with root package name */
    private W f123724x;

    /* renamed from: y  reason: collision with root package name */
    private int f123725y;

    /* renamed from: z  reason: collision with root package name */
    private int f123726z;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/V;", "it", "LXH/N;", "<anonymous>", "(Lcom/sugarcube/app/base/ui/capturev2/V;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ArControlImpl$4", f = "ArControlImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.d$a */
    static final class a extends l implements p<V, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123727c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f123728d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14202d f123729e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C14202d dVar, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f123729e = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f123729e, eVar);
            aVar.f123728d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(V v10, C17164e<? super C16807N> eVar) {
            return ((a) create(v10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123727c == 0) {
                y.b(obj);
                this.f123729e.s((V) this.f123728d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/d$b;", "", "<init>", "()V", "", "PIXEL_INTENSITY_THRESHOLD", "F", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.d$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ArControlImpl$onDrawFrame$1", f = "ArControlImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.d$c */
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123730c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14202d f123731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C14202d dVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f123731d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f123731d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123730c == 0) {
                y.b(obj);
                this.f123731d.p().invoke(this.f123731d.l(), this.f123731d.k());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ArControlImpl$onDrawFrame$2", f = "ArControlImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.d$d  reason: collision with other inner class name */
    static final class C3038d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123732c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14202d f123733d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3038d(C14202d dVar, C17164e<? super C3038d> eVar) {
            super(2, eVar);
            this.f123733d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C3038d(this.f123733d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3038d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123732c == 0) {
                y.b(obj);
                this.f123733d.p().invoke(this.f123733d.l(), this.f123733d.k());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ArControlImpl$onDrawFrame$4$1", f = "ArControlImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.d$e */
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123734c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14196a f123735d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C14202d f123736e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ V f123737f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C14196a aVar, C14202d dVar, V v10, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f123735d = aVar;
            this.f123736e = dVar;
            this.f123737f = v10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f123735d, this.f123736e, this.f123737f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Bitmap bitmap;
            C17187b.f();
            if (this.f123734c == 0) {
                y.b(obj);
                C14196a aVar = this.f123735d;
                Bitmap a10 = aVar.a();
                if (a10 != null) {
                    C14202d dVar = this.f123736e;
                    bitmap = dVar.v(a10, dVar.f123718r);
                } else {
                    bitmap = null;
                }
                aVar.e(bitmap);
                C14202d dVar2 = this.f123736e;
                int a11 = this.f123737f.a();
                List a12 = this.f123736e.h(this.f123735d.c(), this.f123735d.d());
                List c10 = this.f123736e.r(this.f123735d.c(), this.f123735d.d());
                List e10 = this.f123736e.w(this.f123735d.c(), this.f123735d.d());
                String name = Thread.currentThread().getName();
                dVar2.log("AcquiredRequest done " + a11 + " " + a12 + " " + c10 + " " + e10 + " " + name);
                this.f123735d.b().invoke(this.f123735d);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ArControlImpl$onDrawFrame$5", f = "ArControlImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.d$f */
    static final class f extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123738c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14202d f123739d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C14202d dVar, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f123739d = dVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new f(this.f123739d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((f) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123738c == 0) {
                y.b(obj);
                this.f123739d.q().invoke();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ArControlImpl$processPixelIntensity$1$1", f = "ArControlImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.d$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f123740c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C14202d f123741d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f123742e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C14202d dVar, boolean z10, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f123741d = dVar;
            this.f123742e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f123741d, this.f123742e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f123740c == 0) {
                y.b(obj);
                this.f123741d.m().invoke(kotlin.coroutines.jvm.internal.b.a(this.f123742e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.sugarcube.app.base.ui.capturev2.ArControlImpl", f = "ArControlImpl.kt", l = {548}, m = "waitForDataFlush")
    /* renamed from: com.sugarcube.app.base.ui.capturev2.d$h */
    static final class h extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f123743c;

        /* renamed from: d  reason: collision with root package name */
        Object f123744d;

        /* renamed from: e  reason: collision with root package name */
        Object f123745e;

        /* renamed from: f  reason: collision with root package name */
        long f123746f;

        /* renamed from: g  reason: collision with root package name */
        long f123747g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f123748h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C14202d f123749i;

        /* renamed from: j  reason: collision with root package name */
        int f123750j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        h(C14202d dVar, C17164e<? super h> eVar) {
            super(eVar);
            this.f123749i = dVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f123748h = obj;
            this.f123750j |= Integer.MIN_VALUE;
            return this.f123749i.z((C14228q) null, this);
        }
    }

    public C14202d(Q q10, S0 s02, FirebaseInteractions firebaseInteractions, String str, boolean z10, boolean z11, p<? super TrackingState, ? super TrackingFailureReason, C16807N> pVar, C17642l<? super Boolean, C16807N> lVar, C17631a<C16807N> aVar) {
        C17542s.j(q10, "scope");
        C17542s.j(s02, "data");
        C17542s.j(firebaseInteractions, "firebase");
        C17542s.j(str, "recordingPath");
        C17542s.j(pVar, "trackingCallback");
        C17542s.j(lVar, "pixelIntensityCallback");
        C17542s.j(aVar, "updateCallback");
        this.f123701a = q10;
        this.f123702b = s02;
        this.f123703c = firebaseInteractions;
        this.f123704d = str;
        this.f123705e = z10;
        this.f123706f = z11;
        this.f123707g = pVar;
        this.f123708h = lVar;
        this.f123709i = aVar;
        int c10 = s02.b().c();
        log("initial frameCount=" + c10);
        this.f123711k = c10;
        this.f123712l = TrackingState.STOPPED;
        this.f123713m = TrackingFailureReason.NONE;
        this.f123714n = RecordingStatus.NONE;
        this.f123717q = 1.0f;
        Pose pose = Pose.IDENTITY;
        C17542s.i(pose, "IDENTITY");
        this.f123719s = pose;
        this.f123726z = this.f123711k - 1;
        this.f123695A = C16511H.b(0, Integer.MAX_VALUE, (C16428d) null, 5, (Object) null);
        this.f123696B = j();
        this.f123697C = getUseVideoEncoder() ? new r(getRecordingPath(), s02.g().c(), s02.g().a()) : null;
        ArrayList arrayList = new ArrayList(30);
        for (int i10 = 0; i10 < 30; i10++) {
            arrayList.add(Float.valueOf(1.0f));
        }
        this.f123698D = arrayList;
        C16534i.M(C16534i.L(C16534i.R(this.f123695A, new a(this, (C17164e<? super a>) null)), C16311i0.a()), this.f123701a);
    }

    /* access modifiers changed from: private */
    public final List<String> h(List<V> list, long j10) {
        Iterable<V> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (V v10 : iterable) {
            double abs = Math.abs(((double) (v10.o() - j10)) / 1000000.0d);
            int a10 = v10.a();
            arrayList.add("[" + a10 + "] " + abs);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final List<String> r(List<V> list, long j10) {
        Iterable<V> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (V v10 : iterable) {
            R0 n10 = v10.n();
            double abs = Math.abs(((double) ((n10 != null ? n10.a() : 0) - j10)) / 1000000.0d);
            int a10 = v10.a();
            arrayList.add("[" + a10 + "] " + abs);
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final void s(V v10) {
        int i10;
        int i11;
        v10.t(System.nanoTime());
        synchronized (this.f123695A) {
            i10 = this.f123711k;
            i11 = this.f123726z;
            this.f123726z = v10.a();
            C16807N n10 = C16807N.f139792a;
        }
        if (v10.a() != i11 + 1) {
            int a10 = v10.a();
            String name = Thread.currentThread().getName();
            log("process frame[" + a10 + "] out of order[" + i11 + "] " + name);
        }
        if (v10.a() - i10 > 2) {
            int a11 = v10.a();
            String name2 = Thread.currentThread().getName();
            log("process frame[" + a11 + "] " + i10 + " " + name2);
        }
        if (getUseRecording()) {
            v10.s(System.nanoTime());
            C14237v f10 = v10.f();
            if (f10 != null) {
                try {
                    r rVar = this.f123697C;
                    if (rVar != null) {
                        rVar.g(f10);
                    }
                } catch (Throwable th2) {
                    onError("offerEncoder error", th2);
                }
                if (n() <= 0) {
                    x(v10.a());
                }
                y(v10.a());
            }
            v10.u(System.nanoTime());
            this.f123702b.b().a(v10);
            return;
        }
        v10.v(System.nanoTime());
    }

    private final void t(float f10) {
        List<Float> list = this.f123698D;
        int i10 = this.f123699E;
        this.f123699E = i10 + 1;
        list.set(i10, Float.valueOf(f10));
        boolean z10 = false;
        if (this.f123699E >= this.f123698D.size()) {
            this.f123699E = 0;
        }
        if (C16877v.i0(this.f123698D) <= 0.25d) {
            z10 = true;
        }
        if (z10 != this.f123700F) {
            this.f123700F = z10;
            F0 unused = C16314k.d(this.f123701a, (C17168i) null, (T) null, new g(this, z10, (C17164e<? super g>) null), 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public final List<String> w(List<V> list, long j10) {
        Iterable<V> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (V v10 : iterable) {
            R0 n10 = v10.n();
            double abs = Math.abs(((double) ((n10 != null ? n10.a() : 0) - j10)) / 1000000.0d);
            int a10 = v10.a();
            arrayList.add("[" + a10 + "] " + abs);
        }
        return arrayList;
    }

    public final void f(C17642l<? super C14196a, C16807N> lVar) {
        C17542s.j(lVar, "callback");
        int i10 = this.f123711k;
        long j10 = this.f123716p;
        String name = Thread.currentThread().getName();
        log("AcquiredImage  start [" + i10 + "] " + j10 + " " + name);
        this.f123720t = new C14196a(0, 0, 0, (Bitmap) null, (TotalCaptureResult) null, new ArrayList(), lVar);
    }

    public final void g(float[] fArr) {
        Pose pose;
        Pose inverse;
        Pose compose;
        float[] fArr2 = fArr;
        C17542s.j(fArr2, "angles");
        synchronized (this) {
            Pose pose2 = this.f123722v;
            if (!(pose2 == null || (pose = this.f123721u) == null || (inverse = pose.inverse()) == null || (compose = inverse.compose(pose2)) == null)) {
                double qx2 = (double) compose.qx();
                double qy2 = (double) compose.qy();
                double qz2 = (double) compose.qz();
                double qw2 = (double) compose.qw();
                double sqrt = ((double) 1.0f) / Math.sqrt((((qx2 * qx2) + (qy2 * qy2)) + (qz2 * qz2)) + (qw2 * qw2));
                double d10 = qx2 * sqrt;
                double d11 = qy2 * sqrt;
                double d12 = qz2 * sqrt;
                double d13 = qw2 * sqrt;
                double d14 = d13 * d13;
                double d15 = d10 * d10;
                double d16 = d11 * d11;
                double d17 = d12 * d12;
                fArr2[0] = (float) Math.toDegrees(Math.atan2(((d11 * d12) + (d13 * d10)) * 2.0d, ((d14 - d15) - d16) + d17));
                fArr2[1] = (float) Math.toDegrees(Math.asin(((double) -2.0f) * ((d10 * d12) - (d13 * d11))));
                fArr2[2] = (float) Math.toDegrees(Math.atan2(((d10 * d11) + (d13 * d12)) * 2.0d, ((d14 + d15) - d16) - d17));
                C16807N n10 = C16807N.f139792a;
            }
        }
    }

    public String getRecordingPath() {
        return this.f123704d;
    }

    public boolean getUseImageFormatJPEG() {
        return this.f123705e;
    }

    public boolean getUseRecording() {
        return this.f123702b.c() == N.Scan;
    }

    public boolean getUseSharedCamera() {
        return this.f123702b.c() == N.ArPano;
    }

    public boolean getUseVideoEncoder() {
        return this.f123706f;
    }

    public final F<TrackingState> i() {
        return this.f123710j;
    }

    public final int j() {
        return this.f123702b.g().c();
    }

    public final TrackingFailureReason k() {
        return this.f123713m;
    }

    public final TrackingState l() {
        return this.f123712l;
    }

    public void log(String str) {
        C17542s.j(str, "msg");
        String str2 = "[" + this.f123702b.getUuid() + "] " + str;
        Log.d(AnyKt.SUGARCUBE_TAG, str2);
        C13868b.f118106a.b(str2, YE.e.Capture);
    }

    public final C17642l<Boolean, C16807N> m() {
        return this.f123708h;
    }

    public final int n() {
        return this.f123702b.g().e();
    }

    public final int o() {
        return this.f123702b.g().f();
    }

    public void onArCameraIntrinsics(W w10) {
        int i10 = this.f123711k;
        String name = Thread.currentThread().getName();
        log("ArControl.onArCameraIntrinsics [" + i10 + "] " + w10 + " " + name);
        this.f123724x = w10;
    }

    public void onCreate(Session session) {
        ArControl.a.a(this, session);
    }

    public void onDestroy(Session session) {
        int i10 = this.f123711k;
        String name = Thread.currentThread().getName();
        log("ArControl.onDestroy [" + i10 + "] " + session + " " + name);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0211  */
    public int onDrawFrame(com.google.ar.core.Session r23, com.google.ar.core.Frame r24, com.sugarcube.app.base.ui.capturev2.R0 r25) {
        /*
            r22 = this;
            r1 = r22
            r11 = r24
            r12 = 1
            java.lang.String r0 = "session"
            r3 = r23
            kotlin.jvm.internal.C17542s.j(r3, r0)
            java.lang.String r0 = "frame"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            long r13 = java.lang.System.nanoTime()
            com.google.ar.core.Camera r0 = r24.getCamera()
            com.google.ar.core.TrackingState r0 = r0.getTrackingState()
            com.google.ar.core.TrackingState r2 = r1.f123712l
            r15 = 0
            if (r0 == r2) goto L_0x0086
            com.google.ar.core.Camera r0 = r24.getCamera()
            com.google.ar.core.TrackingState r0 = r0.getTrackingState()
            r1.f123712l = r0
            com.google.ar.core.Camera r0 = r24.getCamera()
            com.google.ar.core.TrackingFailureReason r0 = r0.getTrackingFailureReason()
            r1.f123713m = r0
            QJ.Q r4 = r1.f123701a
            com.sugarcube.app.base.ui.capturev2.d$c r7 = new com.sugarcube.app.base.ui.capturev2.d$c
            r7.<init>(r1, r15)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            QJ.F0 unused = QJ.C16314k.d(r4, r5, r6, r7, r8, r9)
            androidx.lifecycle.K<com.google.ar.core.TrackingState> r0 = r1.f123710j
            com.google.ar.core.TrackingState r2 = r1.f123712l
            r0.postValue(r2)
            int r0 = r1.f123711k
            com.google.ar.core.TrackingState r2 = r1.f123712l
            com.google.ar.core.TrackingFailureReason r4 = r1.f123713m
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Tracking changed ["
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = "]("
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = ","
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = ") "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            r1.log(r0)
            goto L_0x00e4
        L_0x0086:
            com.google.ar.core.Camera r0 = r24.getCamera()
            com.google.ar.core.TrackingFailureReason r0 = r0.getTrackingFailureReason()
            com.google.ar.core.TrackingFailureReason r2 = r1.f123713m
            if (r0 == r2) goto L_0x00e4
            com.google.ar.core.Camera r0 = r24.getCamera()
            com.google.ar.core.TrackingFailureReason r0 = r0.getTrackingFailureReason()
            r1.f123713m = r0
            QJ.Q r4 = r1.f123701a
            com.sugarcube.app.base.ui.capturev2.d$d r7 = new com.sugarcube.app.base.ui.capturev2.d$d
            r7.<init>(r1, r15)
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            QJ.F0 unused = QJ.C16314k.d(r4, r5, r6, r7, r8, r9)
            int r0 = r1.f123711k
            com.google.ar.core.TrackingState r2 = r1.f123712l
            com.google.ar.core.TrackingFailureReason r4 = r1.f123713m
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Tracking reason changed ["
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = "]("
            r6.append(r0)
            r6.append(r2)
            java.lang.String r0 = ","
            r6.append(r0)
            r6.append(r4)
            java.lang.String r0 = ") "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = r6.toString()
            r1.log(r0)
        L_0x00e4:
            com.google.ar.core.RecordingStatus r0 = r23.getRecordingStatus()
            com.google.ar.core.RecordingStatus r2 = r1.f123714n
            if (r0 == r2) goto L_0x0173
            com.google.ar.core.RecordingStatus r0 = r23.getRecordingStatus()
            r1.f123714n = r0
            int r2 = r1.f123711k
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Recording status changed ["
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "]("
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = ")"
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r1.log(r0)
            int r0 = r22.n()
            if (r0 > 0) goto L_0x0141
            com.google.ar.core.RecordingStatus r0 = r1.f123714n
            com.google.ar.core.RecordingStatus r2 = com.google.ar.core.RecordingStatus.OK
            if (r0 != r2) goto L_0x0141
            int r0 = r1.f123711k
            r1.x(r0)
            int r0 = r1.f123711k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Recording started ["
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.log(r0)
        L_0x0141:
            int r0 = r22.n()
            if (r0 <= 0) goto L_0x0173
            int r0 = r22.o()
            if (r0 > 0) goto L_0x0173
            com.google.ar.core.RecordingStatus r0 = r1.f123714n
            com.google.ar.core.RecordingStatus r2 = com.google.ar.core.RecordingStatus.OK
            if (r0 == r2) goto L_0x0173
            int r0 = r1.f123711k
            r1.y(r0)
            int r0 = r1.f123711k
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "Recording stopped ["
            r2.append(r4)
            r2.append(r0)
            java.lang.String r0 = "]"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.log(r0)
        L_0x0173:
            com.google.ar.core.LightEstimate r0 = r24.getLightEstimate()
            float r0 = r0.getPixelIntensity()
            r1.f123715o = r0
            r1.t(r0)
            long r4 = r24.getTimestamp()
            r1.f123716p = r4
            com.sugarcube.app.base.ui.capturev2.V$a r2 = com.sugarcube.app.base.ui.capturev2.V.f123632v
            com.google.ar.core.Camera r0 = r24.getCamera()
            com.google.ar.core.Pose r0 = r0.getPose()
            com.google.ar.core.Pose r4 = r1.f123719s
            com.google.ar.core.Pose r6 = r0.compose(r4)
            java.lang.String r0 = "compose(...)"
            kotlin.jvm.internal.C17542s.i(r6, r0)
            float r7 = r1.f123717q
            int r8 = r1.f123711k
            boolean r0 = r22.getUseRecording()
            if (r0 == 0) goto L_0x01f5
            com.sugarcube.app.base.ui.capturev2.r r0 = r1.f123697C
            if (r0 == 0) goto L_0x01f5
            int r0 = r1.f123696B
            int r4 = r22.j()
            if (r0 < r4) goto L_0x01f0
            com.sugarcube.app.base.ui.capturev2.v$a r0 = com.sugarcube.app.base.ui.capturev2.C14237v.f124058f     // Catch:{ all -> 0x01bc }
            com.sugarcube.app.base.ui.capturev2.v r0 = r0.b(r11)     // Catch:{ all -> 0x01bc }
            r1.f123696B = r12     // Catch:{ all -> 0x01bc }
            XH.N r4 = XH.C16807N.f139792a     // Catch:{ all -> 0x01bc }
            goto L_0x01ee
        L_0x01bc:
            r0 = move-exception
            int r4 = r1.f123711k
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r9 = "toBufferedImage error ["
            r5.append(r9)
            r5.append(r4)
            java.lang.String r4 = "]"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r1.onError(r4, r0)
            com.sugarcube.app.base.ui.capturev2.S0 r0 = r1.f123702b
            com.sugarcube.app.base.ui.capturev2.w1 r0 = r0.g()
            java.util.List r0 = r0.b()
            int r4 = r1.f123711k
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.add(r4)
            r1.f123696B = r12
            r0 = r15
        L_0x01ee:
            r10 = r0
            goto L_0x01f6
        L_0x01f0:
            int r0 = r1.f123696B
            int r0 = r0 + r12
            r1.f123696B = r0
        L_0x01f5:
            r10 = r15
        L_0x01f6:
            r9 = 1
            r3 = r23
            r4 = r24
            r5 = r25
            com.sugarcube.app.base.ui.capturev2.V r0 = r2.a(r3, r4, r5, r6, r7, r8, r9, r10)
            r0.w(r13)
            long r2 = java.lang.System.nanoTime()
            r0.y(r2)
            boolean r2 = r22.getUseRecording()
            if (r2 == 0) goto L_0x0247
            int r2 = r0.a()
            r1.f123725y = r2
            TJ.A<com.sugarcube.app.base.ui.capturev2.V> r2 = r1.f123695A
            boolean r2 = r2.a(r0)
            if (r2 != 0) goto L_0x0247
            int r2 = r0.a()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "queue frame["
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = "] tryEmit=false "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.log(r2)
        L_0x0247:
            monitor-enter(r22)
            com.google.ar.core.Camera r2 = r24.getCamera()     // Catch:{ all -> 0x0267 }
            com.google.ar.core.Pose r2 = r2.getPose()     // Catch:{ all -> 0x0267 }
            com.google.ar.core.Pose r3 = r1.f123719s     // Catch:{ all -> 0x0267 }
            com.google.ar.core.Pose r2 = r2.compose(r3)     // Catch:{ all -> 0x0267 }
            r1.f123722v = r2     // Catch:{ all -> 0x0267 }
            long r2 = r24.getTimestamp()     // Catch:{ all -> 0x0267 }
            r1.f123723w = r2     // Catch:{ all -> 0x0267 }
            com.google.ar.core.Pose r2 = r1.f123721u     // Catch:{ all -> 0x0267 }
            if (r2 != 0) goto L_0x0269
            com.google.ar.core.Pose r2 = r1.f123722v     // Catch:{ all -> 0x0267 }
            r1.f123721u = r2     // Catch:{ all -> 0x0267 }
            goto L_0x0269
        L_0x0267:
            r0 = move-exception
            goto L_0x02bf
        L_0x0269:
            XH.N r2 = XH.C16807N.f139792a     // Catch:{ all -> 0x0267 }
            monitor-exit(r22)
            com.sugarcube.app.base.ui.capturev2.a r2 = r1.f123720t
            if (r2 == 0) goto L_0x029c
            java.util.List r3 = r2.c()
            r3.add(r0)
            android.graphics.Bitmap r3 = r2.a()
            if (r3 == 0) goto L_0x029c
            java.util.List r3 = r2.c()
            int r3 = r3.size()
            r4 = 9
            if (r3 <= r4) goto L_0x029c
            r1.f123720t = r15
            QJ.Q r5 = r1.f123701a
            QJ.M r6 = QJ.C16311i0.b()
            com.sugarcube.app.base.ui.capturev2.d$e r8 = new com.sugarcube.app.base.ui.capturev2.d$e
            r8.<init>(r2, r1, r0, r15)
            r9 = 2
            r10 = 0
            r7 = 0
            QJ.F0 unused = QJ.C16314k.d(r5, r6, r7, r8, r9, r10)
        L_0x029c:
            QJ.Q r2 = r1.f123701a
            com.sugarcube.app.base.ui.capturev2.d$f r3 = new com.sugarcube.app.base.ui.capturev2.d$f
            r3.<init>(r1, r15)
            r20 = 3
            r21 = 0
            r17 = 0
            r18 = 0
            r16 = r2
            r19 = r3
            QJ.F0 unused = QJ.C16314k.d(r16, r17, r18, r19, r20, r21)
            long r2 = java.lang.System.nanoTime()
            r0.x(r2)
            int r0 = r1.f123711k
            int r12 = r12 + r0
            r1.f123711k = r12
            return r0
        L_0x02bf:
            monitor-exit(r22)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.C14202d.onDrawFrame(com.google.ar.core.Session, com.google.ar.core.Frame, com.sugarcube.app.base.ui.capturev2.R0):int");
    }

    public void onError(String str, Throwable th2) {
        UUID uuid = this.f123702b.getUuid();
        String message = th2 != null ? th2.getMessage() : null;
        log("[" + uuid + "] onError " + str + " " + message);
        if (str != null) {
            FirebaseInteractions firebaseInteractions = this.f123703c;
            UUID uuid2 = this.f123702b.getUuid();
            firebaseInteractions.log("[" + uuid2 + "] " + str);
        }
        if (th2 != null) {
            this.f123703c.recordException(th2);
        }
    }

    public void onImageAvailable(Context context, Image image, TotalCaptureResult totalCaptureResult) {
        Bitmap bitmap;
        C17542s.j(context, "context");
        C17542s.j(image, "image");
        C14196a aVar = this.f123720t;
        if (aVar != null && aVar.a() == null && aVar.c().size() > 4) {
            V v10 = (V) C16877v.I0(aVar.c());
            aVar.h(this.f123711k);
            if (image.getFormat() == 35) {
                bitmap = C13341c.b(image, context);
            } else {
                ByteBuffer buffer = image.getPlanes()[0].getBuffer();
                C17542s.i(buffer, "getBuffer(...)");
                int remaining = buffer.remaining();
                byte[] bArr = new byte[remaining];
                buffer.get(bArr);
                bitmap = BitmapFactory.decodeByteArray(bArr, 0, remaining);
            }
            if (bitmap != null) {
                aVar.e(bitmap);
                aVar.g(image.getFormat());
                aVar.i(image.getTimestamp());
                aVar.f(totalCaptureResult);
                double o10 = ((double) (v10.o() - image.getTimestamp())) / 1000000.0d;
                R0 n10 = v10.n();
                double a10 = n10 != null ? ((double) (n10.a() - image.getTimestamp())) / 1000000.0d : 0.0d;
                int a11 = v10.a();
                int width = image.getWidth();
                int height = image.getHeight();
                int format = image.getFormat();
                String name = Thread.currentThread().getName();
                log("onImageAvailable [" + a11 + "] [" + width + "x" + height + "] type=" + format + " f=" + o10 + "ms s=" + a10 + "ms " + name);
            }
        }
    }

    public void onImageError(String str, Throwable th2) {
        UUID uuid = this.f123702b.getUuid();
        String message = th2 != null ? th2.getMessage() : null;
        log("[" + uuid + "] onImageError " + str + " " + message);
        if (str != null) {
            FirebaseInteractions firebaseInteractions = this.f123703c;
            UUID uuid2 = this.f123702b.getUuid();
            firebaseInteractions.log("[" + uuid2 + "] " + str);
        }
        if (th2 != null) {
            this.f123703c.recordException(th2);
        }
    }

    public void onPause(Session session) {
        int i10 = this.f123711k;
        String name = Thread.currentThread().getName();
        log("ArControl.onPause [" + i10 + "] " + session + " " + name);
    }

    public void onResume(Session session) {
        int i10 = this.f123711k;
        String name = Thread.currentThread().getName();
        log("ArControl.onResume [" + i10 + "] " + session + " " + name);
    }

    public void onSensorOrientation(int i10) {
        float f10 = (float) i10;
        this.f123718r = f10;
        float f11 = (f10 - 90.0f) / 90.0f;
        Pose makeInterpolated = Pose.makeInterpolated(Pose.IDENTITY, Pose.makeRotation(0.0f, 0.0f, -((float) Math.sqrt(0.5d)), (float) Math.sqrt(0.5d)), f11);
        this.f123719s = makeInterpolated;
        int i11 = this.f123711k;
        float f12 = this.f123718r;
        String name = Thread.currentThread().getName();
        log("ArControl.onSensorOrientation [" + i11 + "] sensorOrientation=" + f12 + " t=" + f11 + " physicalPose=" + makeInterpolated + " " + name);
    }

    public void onSharedImageScale(float f10) {
        int i10 = this.f123711k;
        String name = Thread.currentThread().getName();
        log("ArControl.onSharedImageScale [" + i10 + "] " + f10 + " " + name);
        this.f123717q = f10;
    }

    public final p<TrackingState, TrackingFailureReason, C16807N> p() {
        return this.f123707g;
    }

    public final C17631a<C16807N> q() {
        return this.f123709i;
    }

    public final void u() {
        synchronized (this) {
            this.f123721u = null;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public final Bitmap v(Bitmap bitmap, float f10) {
        Bitmap createBitmap;
        C17542s.j(bitmap, "bitmap");
        if (f10 == 0.0f) {
            return bitmap;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null || (createBitmap = Bitmap.createBitmap(height, width, config)) == null) {
            return bitmap;
        }
        Canvas canvas = new Canvas(createBitmap);
        Rect rect = new Rect(0, 0, height, width);
        Matrix matrix = new Matrix();
        float exactCenterX = rect.exactCenterX();
        float exactCenterY = rect.exactCenterY();
        matrix.postTranslate((float) ((-bitmap.getWidth()) / 2), (float) ((-bitmap.getHeight()) / 2));
        matrix.postRotate(f10);
        matrix.postTranslate(exactCenterX, exactCenterY);
        canvas.drawBitmap(bitmap, matrix, new Paint(7));
        matrix.reset();
        return createBitmap;
    }

    public final void x(int i10) {
        this.f123702b.g().l(System.nanoTime());
        this.f123702b.g().k(i10);
    }

    public final void y(int i10) {
        this.f123702b.g().n(System.nanoTime());
        this.f123702b.g().m(i10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b3, code lost:
        if (r12 <= 5000) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object z(com.sugarcube.app.base.ui.capturev2.C14228q r17, dI.C17164e<? super XH.C16807N> r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof com.sugarcube.app.base.ui.capturev2.C14202d.h
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.sugarcube.app.base.ui.capturev2.d$h r2 = (com.sugarcube.app.base.ui.capturev2.C14202d.h) r2
            int r3 = r2.f123750j
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.f123750j = r3
            goto L_0x001c
        L_0x0017:
            com.sugarcube.app.base.ui.capturev2.d$h r2 = new com.sugarcube.app.base.ui.capturev2.d$h
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r3 = r2.f123748h
            java.lang.Object r4 = eI.C17187b.f()
            int r5 = r2.f123750j
            java.lang.String r6 = " processed="
            java.lang.String r7 = "] queued="
            r8 = 1
            if (r5 == 0) goto L_0x004a
            if (r5 != r8) goto L_0x0042
            long r9 = r2.f123746f
            java.lang.Object r1 = r2.f123745e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r5 = r2.f123744d
            com.sugarcube.app.base.ui.capturev2.q r5 = (com.sugarcube.app.base.ui.capturev2.C14228q) r5
            java.lang.Object r11 = r2.f123743c
            com.sugarcube.app.base.ui.capturev2.d r11 = (com.sugarcube.app.base.ui.capturev2.C14202d) r11
            XH.y.b(r3)
            r3 = r2
            r2 = r1
            r1 = r5
            goto L_0x00aa
        L_0x0042:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x004a:
            XH.y.b(r3)
            int r3 = r0.f123711k
            int r5 = r0.f123725y
            int r9 = r0.f123726z
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            java.lang.String r10 = r10.getName()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "waitForDataFlush start ["
            r11.append(r12)
            r11.append(r3)
            r11.append(r7)
            r11.append(r5)
            r11.append(r6)
            r11.append(r9)
            java.lang.String r3 = " "
            r11.append(r3)
            r11.append(r10)
            java.lang.String r3 = r11.toString()
            r0.log(r3)
            long r9 = java.lang.System.currentTimeMillis()
            r11 = 0
            r3 = r2
            r12 = r11
            r11 = r0
            r2 = r1
            r1 = r17
        L_0x008f:
            int r5 = r11.f123726z
            int r14 = r11.f123725y
            if (r5 >= r14) goto L_0x00b5
            r3.f123743c = r11
            r3.f123744d = r1
            r3.f123745e = r2
            r3.f123746f = r9
            r3.f123747g = r12
            r3.f123750j = r8
            r12 = 200(0xc8, double:9.9E-322)
            java.lang.Object r5 = QJ.C16297b0.b(r12, r3)
            if (r5 != r4) goto L_0x00aa
            return r4
        L_0x00aa:
            long r12 = java.lang.System.currentTimeMillis()
            long r12 = r12 - r9
            r14 = 5000(0x1388, double:2.4703E-320)
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 <= 0) goto L_0x008f
        L_0x00b5:
            int r1 = r11.f123711k
            int r2 = r11.f123725y
            int r3 = r11.f123726z
            double r4 = (double) r12
            r8 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r8
            java.lang.Thread r8 = java.lang.Thread.currentThread()
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "waitForDataFlush stop  ["
            r9.append(r10)
            r9.append(r1)
            r9.append(r7)
            r9.append(r2)
            r9.append(r6)
            r9.append(r3)
            java.lang.String r1 = " elapsed="
            r9.append(r1)
            r9.append(r4)
            java.lang.String r1 = "s "
            r9.append(r1)
            r9.append(r8)
            java.lang.String r1 = r9.toString()
            r11.log(r1)
            com.sugarcube.app.base.ui.capturev2.r r1 = r11.f123697C
            if (r1 == 0) goto L_0x0127
            r1.h()
            com.sugarcube.app.base.ui.capturev2.S0 r2 = r11.f123702b
            com.sugarcube.app.base.ui.capturev2.w1 r2 = r2.g()
            com.sugarcube.app.base.data.model.OwnVideoSpecs r10 = new com.sugarcube.app.base.data.model.OwnVideoSpecs
            int r4 = r1.e()
            int r5 = r1.b()
            long r6 = r1.f()
            int r8 = r1.d()
            int r9 = r1.c()
            r3 = r10
            r3.<init>(r4, r5, r6, r8, r9)
            r2.j(r10)
            r1 = 0
            r11.f123697C = r1
        L_0x0127:
            XH.N r1 = XH.C16807N.f139792a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.C14202d.z(com.sugarcube.app.base.ui.capturev2.q, dI.e):java.lang.Object");
    }
}
