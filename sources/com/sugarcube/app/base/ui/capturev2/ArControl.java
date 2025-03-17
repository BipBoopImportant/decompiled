package com.sugarcube.app.base.ui.capturev2;

import android.content.Context;
import android.hardware.camera2.TotalCaptureResult;
import android.media.Image;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H&¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010 \u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b \u0010!J)\u0010(\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H&¢\u0006\u0004\b(\u0010)J'\u0010*\u001a\u00020\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001eH&¢\u0006\u0004\b*\u0010!J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001cH&¢\u0006\u0004\b\u001d\u0010,R\u0014\u00100\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0014\u00104\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0014\u00107\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00109\u001a\u00020-8&X¦\u0004¢\u0006\u0006\u001a\u0004\b8\u0010/¨\u0006:"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "", "Lcom/google/ar/core/Session;", "session", "LXH/N;", "onCreate", "(Lcom/google/ar/core/Session;)V", "onResume", "onPause", "onDestroy", "Lcom/sugarcube/app/base/ui/capturev2/W;", "intrinsics", "onArCameraIntrinsics", "(Lcom/sugarcube/app/base/ui/capturev2/W;)V", "", "scale", "onSharedImageScale", "(F)V", "", "orientation", "onSensorOrientation", "(I)V", "Lcom/google/ar/core/Frame;", "frame", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "sensorData", "onDrawFrame", "(Lcom/google/ar/core/Session;Lcom/google/ar/core/Frame;Lcom/sugarcube/app/base/ui/capturev2/R0;)I", "", "log", "", "t", "onError", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "Landroid/content/Context;", "context", "Landroid/media/Image;", "image", "Landroid/hardware/camera2/TotalCaptureResult;", "lastCaptureResult", "onImageAvailable", "(Landroid/content/Context;Landroid/media/Image;Landroid/hardware/camera2/TotalCaptureResult;)V", "onImageError", "msg", "(Ljava/lang/String;)V", "", "getUseSharedCamera", "()Z", "useSharedCamera", "getUseRecording", "useRecording", "getUseVideoEncoder", "useVideoEncoder", "getRecordingPath", "()Ljava/lang/String;", "recordingPath", "getUseImageFormatJPEG", "useImageFormatJPEG", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ArControl {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static void a(ArControl arControl, Session session) {
        }

        public static /* synthetic */ void b(ArControl arControl, String str, Throwable th2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                if ((i10 & 2) != 0) {
                    th2 = null;
                }
                arControl.onImageError(str, th2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onImageError");
        }
    }

    String getRecordingPath();

    boolean getUseImageFormatJPEG();

    boolean getUseRecording();

    boolean getUseSharedCamera();

    boolean getUseVideoEncoder();

    void log(String str);

    void onArCameraIntrinsics(W w10);

    void onCreate(Session session);

    void onDestroy(Session session);

    int onDrawFrame(Session session, Frame frame, R0 r02);

    void onError(String str, Throwable th2);

    void onImageAvailable(Context context, Image image, TotalCaptureResult totalCaptureResult);

    void onImageError(String str, Throwable th2);

    void onPause(Session session);

    void onResume(Session session);

    void onSensorOrientation(int i10);

    void onSharedImageScale(float f10);
}
