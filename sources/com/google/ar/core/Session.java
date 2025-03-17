package com.google.ar.core;

import android.content.Context;
import android.net.Uri;
import com.google.ar.core.Anchor;
import com.google.ar.core.Config;
import com.google.ar.core.HostCloudAnchorFuture;
import com.google.ar.core.ResolveCloudAnchorFuture;
import com.google.ar.core.VpsAvailabilityFuture;
import com.google.ar.core.annotations.UsedByNative;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Session {
    private static final String TAG = "ARCore-Session";
    final O faceCache;
    final long nativeSymbolTableHandle;
    long nativeWrapperHandle;
    private SharedCamera sharedCamera;

    public enum Feature {
        FRONT_CAMERA(1),
        SHARED_CAMERA(1000);
        
        final int nativeCode;

        private Feature(int i10) {
            this.nativeCode = i10;
        }
    }

    public enum FeatureMapQuality {
        INSUFFICIENT(0),
        SUFFICIENT(1),
        GOOD(2);
        
        final int nativeCode;

        private FeatureMapQuality(int i10) {
            this.nativeCode = i10;
        }

        static FeatureMapQuality forNumber(int i10) {
            for (FeatureMapQuality featureMapQuality : values()) {
                if (featureMapQuality.nativeCode == i10) {
                    return featureMapQuality;
                }
            }
            throw new FatalException(O.b((byte) 53, i10, "Unexpected value for native FeatureMapQuality, value="));
        }
    }

    protected Session() {
        this.faceCache = new O();
        this.sharedCamera = null;
        this.nativeWrapperHandle = 0;
        this.nativeSymbolTableHandle = 0;
    }

    @Deprecated
    public static Session createForSharedCamera(Context context) {
        return new Session(context, EnumSet.of(Feature.SHARED_CAMERA));
    }

    static ByteBuffer directByteBufferOrDefault(ByteBuffer byteBuffer) {
        return byteBuffer == null ? ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder()) : byteBuffer.order(ByteOrder.nativeOrder());
    }

    static void loadDynamicSymbolsAfterSessionCreate() {
        ArImage.nativeLoadSymbols();
        ImageMetadata.nativeLoadSymbols();
    }

    private native long[] nativeAcquireAllAnchors(long j10);

    private native long nativeAcquireEarth(long j10);

    private native int nativeCheckModuleAvailability(long j10, int i10);

    private native void nativeCloseSession(long j10);

    private native void nativeConfigure(long j10, long j11);

    private native long nativeCreateAnchor(long j10, Pose pose);

    private static native long nativeCreateSessionAndWrapperWithFeatures(Context context, int[] iArr);

    static native long nativeCreateSessionWrapperFromHandle(long j10, long j11);

    private native int nativeEstimateFeatureMapQualityForHosting(long j10, Pose pose);

    private native long nativeGetCameraConfig(long j10);

    private native void nativeGetConfig(long j10, long j11);

    private native int nativeGetPlaybackStatus(long j10);

    private native void nativeGetRandomAccessStats(long j10, long j11);

    private native int nativeGetRecordingStatus(long j10);

    private native long[] nativeGetSupportedCameraConfigs(long j10);

    private native long[] nativeGetSupportedCameraConfigsWithFilter(long j10, long j11);

    private native long nativeGetSymbolTable(long j10);

    private native long nativeHostCloudAnchor(long j10, long j11);

    private native long[] nativeHostCloudAnchorAsync(long j10, long j11, int i10, HostCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native long nativeHostCloudAnchorWithTtl(long j10, long j11, int i10);

    private native boolean nativeIsSupported(long j10, long j11);

    private native void nativePause(long j10);

    private native void nativeRequestModuleInstallDeferred(long j10, int[] iArr);

    private native void nativeRequestModuleInstallImmediate(long j10, int[] iArr);

    private native long nativeResolveCloudAnchor(long j10, String str);

    private native long[] nativeResolveCloudAnchorAsync(long j10, String str, ResolveCloudAnchorFuture.CallbackWrapper callbackWrapper);

    private native void nativeResume(long j10);

    private native int nativeSetCameraConfig(long j10, long j11);

    private native void nativeSetCameraTextureName(long j10, int i10);

    private native void nativeSetCameraTextureNames(long j10, int[] iArr);

    private native void nativeSetDisplayGeometry(long j10, int i10, int i11, int i12);

    private native void nativeSetPlaybackDataset(long j10, String str);

    private native void nativeSetPlaybackDatasetUri(long j10, String str);

    private native void nativeStartRecording(long j10, long j11);

    private native void nativeStopRecording(long j10);

    private native void nativeUpdate(long j10, long j11);

    private void pauseSharedCameraIfInUse() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            sharedCamera2.pause();
        }
    }

    static void throwExceptionFromArStatus(int i10) {
        throwExceptionFromArStatus((String) null, i10, (String[]) null, (int[]) null);
    }

    public VpsAvailabilityFuture checkVpsAvailabilityAsync(double d10, double d11, Consumer<VpsAvailability> consumer) {
        long[] nativeCheckVpsAvailabilityAsync = nativeCheckVpsAvailabilityAsync(this.nativeWrapperHandle, d10, d11, consumer != null ? new VpsAvailabilityFuture.CallbackWrapper(consumer) : null);
        return new VpsAvailabilityFuture(this, nativeCheckVpsAvailabilityAsync[0], nativeCheckVpsAvailabilityAsync[1]);
    }

    public void close() {
        nativeCloseSession(this.nativeWrapperHandle);
    }

    public void configure(Config config) {
        nativeConfigure(this.nativeWrapperHandle, config.nativeHandle);
    }

    /* access modifiers changed from: package-private */
    public Collection<Anchor> convertNativeAnchorsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long anchor : jArr) {
            arrayList.add(new Anchor(anchor, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public List<CameraConfig> convertNativeCameraConfigsToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long cameraConfig : jArr) {
            arrayList.add(new CameraConfig(this, cameraConfig));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public Collection<TrackData> convertNativeTrackDataToCollection(long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long trackData : jArr) {
            arrayList.add(new TrackData(trackData, this));
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* access modifiers changed from: package-private */
    public <T extends Trackable> Collection<T> convertNativeTrackablesToCollection(Class<T> cls, long[] jArr) {
        ArrayList arrayList = new ArrayList(r1);
        for (long createTrackable : jArr) {
            Trackable createTrackable2 = createTrackable(createTrackable);
            if (createTrackable2 != null) {
                arrayList.add((Trackable) cls.cast(createTrackable2));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Anchor createAnchor(Pose pose) {
        return new Anchor(nativeCreateAnchor(this.nativeWrapperHandle, pose), this);
    }

    /* access modifiers changed from: package-private */
    public Trackable createTrackable(long j10) {
        C9503k kVar;
        int internalGetType = TrackableBase.internalGetType(this.nativeWrapperHandle, j10);
        C9503k[] values = C9503k.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                kVar = null;
                break;
            }
            kVar = values[i10];
            if (kVar.f67811k == internalGetType) {
                break;
            }
            i10++;
        }
        if (kVar == null) {
            TrackableBase.internalReleaseNativeHandle(this.nativeSymbolTableHandle, j10);
            return null;
        }
        switch (kVar.ordinal()) {
            case 0:
            case 1:
                return null;
            case 2:
                return new Plane(j10, this);
            case 3:
                return new Point(j10, this);
            case 4:
                return new AugmentedImage(j10, this);
            case 5:
                return this.faceCache.a(j10, this);
            case 6:
                return new StreetscapeGeometry(j10, this);
            case 7:
                return getEarth();
            case 8:
                return new DepthPoint(j10, this);
            case 9:
                return new InstantPlacementPoint(j10, this);
            default:
                throw null;
        }
    }

    public FeatureMapQuality estimateFeatureMapQualityForHosting(Pose pose) {
        return FeatureMapQuality.forNumber(nativeEstimateFeatureMapQualityForHosting(this.nativeWrapperHandle, pose));
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        long j10 = this.nativeWrapperHandle;
        if (j10 != 0) {
            nativeDestroySessionWrapper(j10);
            this.nativeWrapperHandle = 0;
        }
        super.finalize();
    }

    public Collection<Anchor> getAllAnchors() {
        return convertNativeAnchorsToCollection(nativeAcquireAllAnchors(this.nativeWrapperHandle));
    }

    public <T extends Trackable> Collection<T> getAllTrackables(Class<T> cls) {
        C9503k a10 = C9503k.a(cls);
        return a10 == C9503k.UNKNOWN_TO_JAVA ? Collections.emptyList() : convertNativeTrackablesToCollection(cls, nativeAcquireAllTrackables(this.nativeWrapperHandle, a10.f67811k));
    }

    public CameraConfig getCameraConfig() {
        return new CameraConfig(this, nativeGetCameraConfig(this.nativeWrapperHandle));
    }

    public Config getConfig() {
        Config config = new Config(this);
        getConfig(config);
        return config;
    }

    public Earth getEarth() {
        long nativeAcquireEarth = nativeAcquireEarth(this.nativeWrapperHandle);
        if (nativeAcquireEarth != 0) {
            return new Earth(nativeAcquireEarth, this);
        }
        return null;
    }

    public PlaybackStatus getPlaybackStatus() {
        return PlaybackStatus.forNumber(nativeGetPlaybackStatus(this.nativeWrapperHandle));
    }

    public RecordingStatus getRecordingStatus() {
        return RecordingStatus.forNumber(nativeGetRecordingStatus(this.nativeWrapperHandle));
    }

    public SharedCamera getSharedCamera() {
        SharedCamera sharedCamera2 = this.sharedCamera;
        if (sharedCamera2 != null) {
            return sharedCamera2;
        }
        throw new IllegalStateException("Shared camera is not in use, please create session using new Session(context, EnumSet.of(Session.Feature.SHARED_CAMERA)).");
    }

    @Deprecated
    public List<CameraConfig> getSupportedCameraConfigs() {
        return convertNativeCameraConfigsToCollection(nativeGetSupportedCameraConfigs(this.nativeWrapperHandle));
    }

    @Deprecated
    public Anchor hostCloudAnchor(Anchor anchor) {
        return new Anchor(nativeHostCloudAnchor(this.nativeWrapperHandle, anchor.nativeHandle), this);
    }

    public HostCloudAnchorFuture hostCloudAnchorAsync(Anchor anchor, int i10, BiConsumer<String, Anchor.CloudAnchorState> biConsumer) {
        long[] nativeHostCloudAnchorAsync = nativeHostCloudAnchorAsync(this.nativeWrapperHandle, anchor.nativeHandle, i10, biConsumer != null ? new HostCloudAnchorFuture.CallbackWrapper(biConsumer) : null);
        return new HostCloudAnchorFuture(this, nativeHostCloudAnchorAsync[0], nativeHostCloudAnchorAsync[1]);
    }

    @Deprecated
    public Anchor hostCloudAnchorWithTtl(Anchor anchor, int i10) {
        return new Anchor(nativeHostCloudAnchorWithTtl(this.nativeWrapperHandle, anchor.nativeHandle, i10), this);
    }

    public boolean isDepthModeSupported(Config.DepthMode depthMode) {
        return nativeIsDepthModeSupported(this.nativeWrapperHandle, depthMode.nativeCode);
    }

    public boolean isGeospatialModeSupported(Config.GeospatialMode geospatialMode) {
        return nativeIsGeospatialModeSupported(this.nativeWrapperHandle, geospatialMode.nativeCode);
    }

    public boolean isImageStabilizationModeSupported(Config.ImageStabilizationMode imageStabilizationMode) {
        return nativeIsImageStabilizationModeSupported(this.nativeWrapperHandle, imageStabilizationMode.nativeCode);
    }

    public boolean isSemanticModeSupported(Config.SemanticMode semanticMode) {
        return nativeIsSemanticModeSupported(this.nativeWrapperHandle, semanticMode.nativeCode);
    }

    /* access modifiers changed from: package-private */
    public boolean isSharedCameraUsed() {
        return this.sharedCamera != null;
    }

    @Deprecated
    public boolean isSupported(Config config) {
        return nativeIsSupported(this.nativeWrapperHandle, config.nativeHandle);
    }

    /* access modifiers changed from: package-private */
    public native long[] nativeAcquireAllTrackables(long j10, int i10);

    /* access modifiers changed from: package-private */
    public native long[] nativeCheckVpsAvailabilityAsync(long j10, double d10, double d11, VpsAvailabilityFuture.CallbackWrapper callbackWrapper);

    /* access modifiers changed from: package-private */
    public native void nativeDestroySessionWrapper(long j10);

    /* access modifiers changed from: package-private */
    public native long nativeGetSessionNativeHandle(long j10);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsDepthModeSupported(long j10, int i10);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsGeospatialModeSupported(long j10, int i10);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsImageStabilizationModeSupported(long j10, int i10);

    /* access modifiers changed from: package-private */
    public native boolean nativeIsSemanticModeSupported(long j10, int i10);

    /* access modifiers changed from: package-private */
    public native long nativeReleaseSessionOwnership(long j10);

    public void pause() {
        pauseSharedCameraIfInUse();
        nativePause(this.nativeWrapperHandle);
    }

    @Deprecated
    public Anchor resolveCloudAnchor(String str) {
        return new Anchor(nativeResolveCloudAnchor(this.nativeWrapperHandle, str), this);
    }

    public ResolveCloudAnchorFuture resolveCloudAnchorAsync(String str, BiConsumer<Anchor, Anchor.CloudAnchorState> biConsumer) {
        long[] nativeResolveCloudAnchorAsync = nativeResolveCloudAnchorAsync(this.nativeWrapperHandle, str, biConsumer != null ? new ResolveCloudAnchorFuture.CallbackWrapper(this, biConsumer) : null);
        return new ResolveCloudAnchorFuture(this, nativeResolveCloudAnchorAsync[0], nativeResolveCloudAnchorAsync[1]);
    }

    public void resume() {
        nativeResume(this.nativeWrapperHandle);
    }

    public void setCameraConfig(CameraConfig cameraConfig) {
        nativeSetCameraConfig(this.nativeWrapperHandle, cameraConfig.nativeHandle);
    }

    public void setCameraTextureName(int i10) {
        nativeSetCameraTextureName(this.nativeWrapperHandle, i10);
    }

    public void setCameraTextureNames(int[] iArr) {
        if (iArr == null || iArr.length == 0) {
            throw new IllegalArgumentException("textureIds must be an array with at least 1 entry.");
        }
        nativeSetCameraTextureNames(this.nativeWrapperHandle, iArr);
    }

    public void setDisplayGeometry(int i10, int i11, int i12) {
        nativeSetDisplayGeometry(this.nativeWrapperHandle, i10, i11, i12);
    }

    @Deprecated
    public void setPlaybackDataset(String str) {
        nativeSetPlaybackDataset(this.nativeWrapperHandle, str);
    }

    public void setPlaybackDatasetUri(Uri uri) {
        nativeSetPlaybackDatasetUri(this.nativeWrapperHandle, uri.toString());
    }

    public void startRecording(RecordingConfig recordingConfig) {
        if (recordingConfig != null) {
            nativeStartRecording(this.nativeWrapperHandle, recordingConfig.nativeHandle);
            return;
        }
        throw new IllegalArgumentException();
    }

    public void stopRecording() {
        nativeStopRecording(this.nativeWrapperHandle);
    }

    public Frame update() {
        Frame frame = new Frame(this);
        nativeUpdate(this.nativeWrapperHandle, frame.nativeHandle);
        return frame;
    }

    Session(long j10) {
        this.faceCache = new O();
        this.sharedCamera = null;
        this.nativeWrapperHandle = j10;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(j10);
    }

    @UsedByNative("session_jni.cc")
    static void throwExceptionFromArStatus(String str, int i10, String[] strArr, int[] iArr) {
        int i11;
        for (C9502j jVar : C9502j.values()) {
            if (jVar.f67797G == i10) {
                Class cls = jVar.f67798H;
                if (cls != null) {
                    if (strArr == null || iArr == null || (i11 = strArr.length) != iArr.length) {
                        i11 = 0;
                    }
                    String str2 = jVar.f67799I;
                    if (str2 == null && str == null) {
                        throw ((Exception) cls.getConstructor((Class[]) null).newInstance((Object[]) null));
                    }
                    if (str2 != null) {
                        if (str == null) {
                            str = str2;
                        } else {
                            str = str2.concat(str);
                        }
                    }
                    Exception exc = (Exception) jVar.f67798H.getConstructor(new Class[]{String.class}).newInstance(new Object[]{str});
                    StackTraceElement[] stackTrace = exc.getStackTrace();
                    StackTraceElement[] stackTraceElementArr = new StackTraceElement[(stackTrace.length + i11)];
                    int i12 = 0;
                    while (i12 < i11) {
                        stackTraceElementArr[i12] = new StackTraceElement("ARCore", "native", strArr[i12], iArr[i12]);
                        i12++;
                    }
                    for (StackTraceElement stackTraceElement : stackTrace) {
                        stackTraceElementArr[i12] = stackTraceElement;
                        i12++;
                    }
                    exc.setStackTrace(stackTraceElementArr);
                    throw exc;
                }
                return;
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 23);
        sb2.append("Unexpected error code: ");
        sb2.append(i10);
        throw new FatalException(sb2.toString());
    }

    public void getConfig(Config config) {
        nativeGetConfig(this.nativeWrapperHandle, config.nativeHandle);
    }

    public List<CameraConfig> getSupportedCameraConfigs(CameraConfigFilter cameraConfigFilter) {
        if (cameraConfigFilter != null) {
            ArrayList arrayList = new ArrayList(r1);
            for (long cameraConfig : nativeGetSupportedCameraConfigsWithFilter(this.nativeWrapperHandle, cameraConfigFilter.nativeHandle)) {
                arrayList.add(new CameraConfig(this, cameraConfig));
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public Session(Context context) {
        this(context, EnumSet.noneOf(Feature.class));
    }

    public Session(Context context, Set<Feature> set) {
        this.faceCache = new O();
        this.sharedCamera = null;
        System.loadLibrary("arcore_sdk_jni");
        int[] iArr = new int[(set.size() + 1)];
        int i10 = 0;
        for (Feature feature : set) {
            iArr[i10] = feature.nativeCode;
            i10++;
        }
        iArr[i10] = 0;
        long nativeCreateSessionAndWrapperWithFeatures = nativeCreateSessionAndWrapperWithFeatures(context, iArr);
        this.nativeWrapperHandle = nativeCreateSessionAndWrapperWithFeatures;
        this.nativeSymbolTableHandle = nativeGetSymbolTable(nativeCreateSessionAndWrapperWithFeatures);
        if (set.contains(Feature.SHARED_CAMERA)) {
            this.sharedCamera = new SharedCamera(this);
        }
        loadDynamicSymbolsAfterSessionCreate();
    }
}
