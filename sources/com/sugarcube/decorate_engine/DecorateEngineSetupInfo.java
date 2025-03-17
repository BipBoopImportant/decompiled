package com.sugarcube.decorate_engine;

import android.content.Context;
import android.content.res.AssetManager;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 @2\u00020\u0001:\u0001@Bç\u0002\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010$\u001a\u00020\u0011\u0012\b\b\u0002\u0010%\u001a\u00020&\u0012\b\b\u0002\u0010'\u001a\u00020 \u0012\b\b\u0002\u0010(\u001a\u00020 \u0012\b\b\u0002\u0010)\u001a\u00020\u0011\u0012\b\b\u0002\u0010*\u001a\u00020\u0011\u0012\b\b\u0002\u0010+\u001a\u00020\u0011\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\t¢\u0006\u0002\u0010.B\u0003\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u000100\u0012\b\b\u0002\u00101\u001a\u00020\u001e\u0012\b\b\u0002\u0010#\u001a\u00020\u001e\u0012\b\b\u0002\u00102\u001a\u00020\u0011\u0012\b\b\u0002\u00103\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020 \u0012\b\b\u0002\u0010!\u001a\u00020 \u0012\b\b\u0002\u00104\u001a\u00020\u001e\u0012\b\b\u0002\u00105\u001a\u00020\t\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010-\u001a\u00020\t\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\b\b\u0002\u0010'\u001a\u00020 \u0012\b\b\u0002\u0010(\u001a\u00020 \u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\"\u001a\u00020 \u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0011\u0012\b\b\u0002\u0010)\u001a\u00020\u0011\u0012\b\b\u0002\u0010*\u001a\u00020\u0011\u0012\b\b\u0002\u0010+\u001a\u00020\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u00106R\u0014\u0010/\u001a\u0004\u0018\u0001008\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00101\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0012\u0010)\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0015\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0013\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001a\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00104\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010#\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00102\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u00103\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010-\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00020 8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010+\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R$\u0010%\u001a\u00020&2\u0006\u0010;\u001a\u00020&8F@FX\u000e¢\u0006\f\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u0012\u00105\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo;", "", "context", "Landroid/content/Context;", "engineManifest", "Lcom/sugarcube/decorate_engine/DecorateEngineManifest;", "sceneLayout", "Lcom/sugarcube/decorate_engine/SceneLayout;", "backgroundColor", "", "loadingPlaceholderColor", "selectionOutlineColor", "erasableOutlineColor", "erasedOutlineColor", "stackingSurfaceActiveColor", "stackingSurfaceAvailableColor", "enableNewAutoExposure", "", "enableDynamicQuality", "enableNewModelLoader", "enableNewSceneLoader", "enableNewCompositionLoader", "enable3DPanZoomRotational", "enable3DPanZoomPositional", "enableNewMultiViewTonemap", "enableNewSingleViewTonemap", "initialView", "restoreLastCompositionView", "enablePointLightShadows", "sceneModelPath", "", "generatedSceneWidth", "", "generatedSceneDepth", "outlineWidth", "logFilePath", "pipeNativeLogToLogger", "windowFitMode", "Lcom/sugarcube/decorate_engine/WindowFitMode;", "engineThrottleFPS", "renderThrottleFPS", "devRunInShellMode", "runHeadlessUnitTests", "runHeadlessSmokeTests", "maxRenderWidth", "maxRenderHeight", "(Landroid/content/Context;Lcom/sugarcube/decorate_engine/DecorateEngineManifest;Lcom/sugarcube/decorate_engine/SceneLayout;IIIIIIIZZZZZZZZZIZZLjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;FLjava/lang/String;ZLcom/sugarcube/decorate_engine/WindowFitMode;FFZZZII)V", "assetManager", "Landroid/content/res/AssetManager;", "cacheDir", "logIsPipe", "manifestText", "layoutText", "windowFitModeRaw", "(Landroid/content/res/AssetManager;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;FFLjava/lang/String;IIIIFFIIIIIIFZZZZZZZIZZZZZZZLandroid/content/Context;)V", "getContext$decorate_engine_release", "()Landroid/content/Context;", "setContext$decorate_engine_release", "(Landroid/content/Context;)V", "value", "getWindowFitMode", "()Lcom/sugarcube/decorate_engine/WindowFitMode;", "setWindowFitMode", "(Lcom/sugarcube/decorate_engine/WindowFitMode;)V", "Companion", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DecorateEngineSetupInfo {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final float defaultOutlineWidth = 0.0f;
    public static final float defaultThrottleFPS = 0.0f;
    public AssetManager assetManager;
    public int backgroundColor;
    public String cacheDir;
    private Context context;
    public boolean devRunInShellMode;
    public boolean enable3DPanZoomPositional;
    public boolean enable3DPanZoomRotational;
    public boolean enableDynamicQuality;
    public boolean enableNewAutoExposure;
    public boolean enableNewCompositionLoader;
    public boolean enableNewModelLoader;
    public boolean enableNewMultiViewTonemap;
    public boolean enableNewSceneLoader;
    public boolean enableNewSingleViewTonemap;
    public boolean enablePointLightShadows;
    public float engineThrottleFPS;
    public int erasableOutlineColor;
    public int erasedOutlineColor;
    public float generatedSceneDepth;
    public float generatedSceneWidth;
    public int initialView;
    public String layoutText;
    public int loadingPlaceholderColor;
    public String logFilePath;
    public boolean logIsPipe;
    public String manifestText;
    public int maxRenderHeight;
    public int maxRenderWidth;
    public float outlineWidth;
    public float renderThrottleFPS;
    public boolean restoreLastCompositionView;
    public boolean runHeadlessSmokeTests;
    public boolean runHeadlessUnitTests;
    public String sceneModelPath;
    public int selectionOutlineColor;
    public int stackingSurfaceActiveColor;
    public int stackingSurfaceAvailableColor;
    public int windowFitModeRaw;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/DecorateEngineSetupInfo$Companion;", "", "()V", "defaultOutlineWidth", "", "defaultThrottleFPS", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DecorateEngineSetupInfo(AssetManager assetManager2, String str, String str2, boolean z10, String str3, String str4, float f10, float f11, String str5, int i10, int i11, int i12, int i13, float f12, float f13, int i14, int i15, int i16, int i17, int i18, int i19, float f14, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, int i20, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, Context context2) {
        String str6 = str5;
        Context context3 = context2;
        C17542s.j(str, "cacheDir");
        C17542s.j(str2, "logFilePath");
        C17542s.j(str3, "manifestText");
        C17542s.j(str4, "sceneModelPath");
        C17542s.j(str6, "layoutText");
        C17542s.j(context3, "context");
        this.assetManager = assetManager2;
        this.cacheDir = str;
        this.logFilePath = str2;
        this.logIsPipe = z10;
        this.manifestText = str3;
        this.sceneModelPath = str4;
        this.generatedSceneWidth = f10;
        this.generatedSceneDepth = f11;
        this.layoutText = str6;
        this.windowFitModeRaw = i10;
        this.backgroundColor = i11;
        this.maxRenderHeight = i12;
        this.maxRenderWidth = i13;
        this.engineThrottleFPS = f12;
        this.renderThrottleFPS = f13;
        this.loadingPlaceholderColor = i14;
        this.selectionOutlineColor = i15;
        this.erasableOutlineColor = i16;
        this.erasedOutlineColor = i17;
        this.stackingSurfaceActiveColor = i18;
        this.stackingSurfaceAvailableColor = i19;
        this.outlineWidth = f14;
        this.enableDynamicQuality = z11;
        this.enableNewAutoExposure = z12;
        this.enableNewCompositionLoader = z13;
        this.enableNewModelLoader = z14;
        this.enableNewSceneLoader = z15;
        this.enable3DPanZoomRotational = z16;
        this.enable3DPanZoomPositional = z17;
        this.initialView = i20;
        this.restoreLastCompositionView = z18;
        this.enablePointLightShadows = z19;
        this.enableNewMultiViewTonemap = z20;
        this.enableNewSingleViewTonemap = z21;
        this.devRunInShellMode = z22;
        this.runHeadlessUnitTests = z23;
        this.runHeadlessSmokeTests = z24;
        this.context = context3;
    }

    public final Context getContext$decorate_engine_release() {
        return this.context;
    }

    public final WindowFitMode getWindowFitMode() {
        return WindowFitMode.values()[this.windowFitModeRaw];
    }

    public final void setContext$decorate_engine_release(Context context2) {
        C17542s.j(context2, "<set-?>");
        this.context = context2;
    }

    public final void setWindowFitMode(WindowFitMode windowFitMode) {
        C17542s.j(windowFitMode, "value");
        this.windowFitModeRaw = windowFitMode.ordinal();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DecorateEngineSetupInfo(android.content.res.AssetManager r42, java.lang.String r43, java.lang.String r44, boolean r45, java.lang.String r46, java.lang.String r47, float r48, float r49, java.lang.String r50, int r51, int r52, int r53, int r54, float r55, float r56, int r57, int r58, int r59, int r60, int r61, int r62, float r63, boolean r64, boolean r65, boolean r66, boolean r67, boolean r68, boolean r69, boolean r70, int r71, boolean r72, boolean r73, boolean r74, boolean r75, boolean r76, boolean r77, boolean r78, android.content.Context r79, int r80, int r81, kotlin.jvm.internal.DefaultConstructorMarker r82) {
        /*
            r41 = this;
            r0 = r80
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            r3 = r1
            goto L_0x000b
        L_0x0009:
            r3 = r42
        L_0x000b:
            r1 = r0 & 2
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x0013
            r4 = r2
            goto L_0x0015
        L_0x0013:
            r4 = r43
        L_0x0015:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x001b
            r5 = r2
            goto L_0x001d
        L_0x001b:
            r5 = r44
        L_0x001d:
            r1 = r0 & 8
            r6 = 0
            if (r1 == 0) goto L_0x0024
            r1 = r6
            goto L_0x0026
        L_0x0024:
            r1 = r45
        L_0x0026:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002c
            r7 = r2
            goto L_0x002e
        L_0x002c:
            r7 = r46
        L_0x002e:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0034
            r8 = r2
            goto L_0x0036
        L_0x0034:
            r8 = r47
        L_0x0036:
            r9 = r0 & 64
            r10 = 0
            if (r9 == 0) goto L_0x003d
            r9 = r10
            goto L_0x003f
        L_0x003d:
            r9 = r48
        L_0x003f:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x0045
            r11 = r10
            goto L_0x0047
        L_0x0045:
            r11 = r49
        L_0x0047:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x004d
            r12 = r2
            goto L_0x004f
        L_0x004d:
            r12 = r50
        L_0x004f:
            r2 = r0 & 512(0x200, float:7.175E-43)
            if (r2 == 0) goto L_0x0055
            r13 = r6
            goto L_0x0057
        L_0x0055:
            r13 = r51
        L_0x0057:
            r2 = r0 & 1024(0x400, float:1.435E-42)
            if (r2 == 0) goto L_0x005d
            r14 = r6
            goto L_0x005f
        L_0x005d:
            r14 = r52
        L_0x005f:
            r2 = r0 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L_0x0065
            r15 = r6
            goto L_0x0067
        L_0x0065:
            r15 = r53
        L_0x0067:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x006e
            r16 = r6
            goto L_0x0070
        L_0x006e:
            r16 = r54
        L_0x0070:
            r2 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r2 == 0) goto L_0x0077
            r17 = r10
            goto L_0x0079
        L_0x0077:
            r17 = r55
        L_0x0079:
            r2 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L_0x0080
            r18 = r10
            goto L_0x0082
        L_0x0080:
            r18 = r56
        L_0x0082:
            r2 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x008b
            r19 = r6
            goto L_0x008d
        L_0x008b:
            r19 = r57
        L_0x008d:
            r2 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0095
            r20 = r6
            goto L_0x0097
        L_0x0095:
            r20 = r58
        L_0x0097:
            r2 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x009f
            r21 = r6
            goto L_0x00a1
        L_0x009f:
            r21 = r59
        L_0x00a1:
            r2 = 262144(0x40000, float:3.67342E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00a9
            r22 = r6
            goto L_0x00ab
        L_0x00a9:
            r22 = r60
        L_0x00ab:
            r2 = 524288(0x80000, float:7.34684E-40)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00b3
            r23 = r6
            goto L_0x00b5
        L_0x00b3:
            r23 = r61
        L_0x00b5:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00bd
            r24 = r6
            goto L_0x00bf
        L_0x00bd:
            r24 = r62
        L_0x00bf:
            r2 = 2097152(0x200000, float:2.938736E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00c7
            r25 = r10
            goto L_0x00c9
        L_0x00c7:
            r25 = r63
        L_0x00c9:
            r2 = 4194304(0x400000, float:5.877472E-39)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00d1
            r26 = r6
            goto L_0x00d3
        L_0x00d1:
            r26 = r64
        L_0x00d3:
            r2 = 8388608(0x800000, float:1.17549435E-38)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00db
            r27 = r6
            goto L_0x00dd
        L_0x00db:
            r27 = r65
        L_0x00dd:
            r2 = 16777216(0x1000000, float:2.3509887E-38)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00e5
            r28 = r6
            goto L_0x00e7
        L_0x00e5:
            r28 = r66
        L_0x00e7:
            r2 = 33554432(0x2000000, float:9.403955E-38)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00ef
            r29 = r6
            goto L_0x00f1
        L_0x00ef:
            r29 = r67
        L_0x00f1:
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x00f9
            r30 = r6
            goto L_0x00fb
        L_0x00f9:
            r30 = r68
        L_0x00fb:
            r2 = 134217728(0x8000000, float:3.85186E-34)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0103
            r31 = r6
            goto L_0x0105
        L_0x0103:
            r31 = r69
        L_0x0105:
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x010d
            r32 = r6
            goto L_0x010f
        L_0x010d:
            r32 = r70
        L_0x010f:
            r2 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0117
            r33 = r6
            goto L_0x0119
        L_0x0117:
            r33 = r71
        L_0x0119:
            r2 = 1073741824(0x40000000, float:2.0)
            r2 = r2 & r0
            if (r2 == 0) goto L_0x0121
            r34 = r6
            goto L_0x0123
        L_0x0121:
            r34 = r72
        L_0x0123:
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r2
            if (r0 == 0) goto L_0x012a
            r0 = r6
            goto L_0x012c
        L_0x012a:
            r0 = r73
        L_0x012c:
            r2 = r81 & 1
            if (r2 == 0) goto L_0x0133
            r35 = r6
            goto L_0x0135
        L_0x0133:
            r35 = r74
        L_0x0135:
            r2 = r81 & 2
            if (r2 == 0) goto L_0x013c
            r36 = r6
            goto L_0x013e
        L_0x013c:
            r36 = r75
        L_0x013e:
            r2 = r81 & 4
            if (r2 == 0) goto L_0x0145
            r37 = r6
            goto L_0x0147
        L_0x0145:
            r37 = r76
        L_0x0147:
            r2 = r81 & 8
            if (r2 == 0) goto L_0x014e
            r38 = r6
            goto L_0x0150
        L_0x014e:
            r38 = r77
        L_0x0150:
            r2 = r81 & 16
            if (r2 == 0) goto L_0x0157
            r39 = r6
            goto L_0x0159
        L_0x0157:
            r39 = r78
        L_0x0159:
            r2 = r41
            r6 = r1
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            r18 = r19
            r19 = r20
            r20 = r21
            r21 = r22
            r22 = r23
            r23 = r24
            r24 = r25
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r29
            r29 = r30
            r30 = r31
            r31 = r32
            r32 = r33
            r33 = r34
            r34 = r0
            r40 = r79
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngineSetupInfo.<init>(android.content.res.AssetManager, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, float, float, java.lang.String, int, int, int, int, float, float, int, int, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, android.content.Context, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DecorateEngineSetupInfo(android.content.Context r41, com.sugarcube.decorate_engine.DecorateEngineManifest r42, com.sugarcube.decorate_engine.SceneLayout r43, int r44, int r45, int r46, int r47, int r48, int r49, int r50, boolean r51, boolean r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, int r60, boolean r61, boolean r62, java.lang.String r63, java.lang.Float r64, java.lang.Float r65, float r66, java.lang.String r67, boolean r68, com.sugarcube.decorate_engine.WindowFitMode r69, float r70, float r71, boolean r72, boolean r73, boolean r74, int r75, int r76, int r77, int r78, kotlin.jvm.internal.DefaultConstructorMarker r79) {
        /*
            r40 = this;
            r0 = r77
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r14 = r2
            goto L_0x000b
        L_0x0009:
            r14 = r51
        L_0x000b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0011
            r15 = r2
            goto L_0x0013
        L_0x0011:
            r15 = r52
        L_0x0013:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r3 = 1
            if (r1 == 0) goto L_0x001b
            r16 = r3
            goto L_0x001d
        L_0x001b:
            r16 = r53
        L_0x001d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0024
            r17 = r3
            goto L_0x0026
        L_0x0024:
            r17 = r54
        L_0x0026:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x002d
            r18 = r3
            goto L_0x002f
        L_0x002d:
            r18 = r55
        L_0x002f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0038
            r19 = r2
            goto L_0x003a
        L_0x0038:
            r19 = r56
        L_0x003a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0042
            r20 = r2
            goto L_0x0044
        L_0x0042:
            r20 = r57
        L_0x0044:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x004c
            r21 = r2
            goto L_0x004e
        L_0x004c:
            r21 = r58
        L_0x004e:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0056
            r22 = r2
            goto L_0x0058
        L_0x0056:
            r22 = r59
        L_0x0058:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0060
            r23 = r2
            goto L_0x0062
        L_0x0060:
            r23 = r60
        L_0x0062:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006a
            r24 = r2
            goto L_0x006c
        L_0x006a:
            r24 = r61
        L_0x006c:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0074
            r25 = r2
            goto L_0x0076
        L_0x0074:
            r25 = r62
        L_0x0076:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            r3 = 0
            if (r1 == 0) goto L_0x007f
            r26 = r3
            goto L_0x0081
        L_0x007f:
            r26 = r63
        L_0x0081:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0089
            r27 = r3
            goto L_0x008b
        L_0x0089:
            r27 = r64
        L_0x008b:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0093
            r28 = r3
            goto L_0x0095
        L_0x0093:
            r28 = r65
        L_0x0095:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            r4 = 0
            if (r1 == 0) goto L_0x009e
            r29 = r4
            goto L_0x00a0
        L_0x009e:
            r29 = r66
        L_0x00a0:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a8
            r30 = r3
            goto L_0x00aa
        L_0x00a8:
            r30 = r67
        L_0x00aa:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b2
            r31 = r2
            goto L_0x00b4
        L_0x00b2:
            r31 = r68
        L_0x00b4:
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00be
            com.sugarcube.decorate_engine.WindowFitMode r1 = com.sugarcube.decorate_engine.WindowFitMode.LetterBox
            r32 = r1
            goto L_0x00c0
        L_0x00be:
            r32 = r69
        L_0x00c0:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c8
            r33 = r4
            goto L_0x00ca
        L_0x00c8:
            r33 = r70
        L_0x00ca:
            r1 = 1073741824(0x40000000, float:2.0)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00d2
            r34 = r4
            goto L_0x00d4
        L_0x00d2:
            r34 = r71
        L_0x00d4:
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00dc
            r35 = r2
            goto L_0x00de
        L_0x00dc:
            r35 = r72
        L_0x00de:
            r0 = r78 & 1
            if (r0 == 0) goto L_0x00e5
            r36 = r2
            goto L_0x00e7
        L_0x00e5:
            r36 = r73
        L_0x00e7:
            r0 = r78 & 2
            if (r0 == 0) goto L_0x00ee
            r37 = r2
            goto L_0x00f0
        L_0x00ee:
            r37 = r74
        L_0x00f0:
            r0 = r78 & 4
            if (r0 == 0) goto L_0x00f7
            r38 = r2
            goto L_0x00f9
        L_0x00f7:
            r38 = r75
        L_0x00f9:
            r0 = r78 & 8
            if (r0 == 0) goto L_0x0100
            r39 = r2
            goto L_0x0102
        L_0x0100:
            r39 = r76
        L_0x0102:
            r3 = r40
            r4 = r41
            r5 = r42
            r6 = r43
            r7 = r44
            r8 = r45
            r9 = r46
            r10 = r47
            r11 = r48
            r12 = r49
            r13 = r50
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngineSetupInfo.<init>(android.content.Context, com.sugarcube.decorate_engine.DecorateEngineManifest, com.sugarcube.decorate_engine.SceneLayout, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, java.lang.String, java.lang.Float, java.lang.Float, float, java.lang.String, boolean, com.sugarcube.decorate_engine.WindowFitMode, float, float, boolean, boolean, boolean, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DecorateEngineSetupInfo(android.content.Context r43, com.sugarcube.decorate_engine.DecorateEngineManifest r44, com.sugarcube.decorate_engine.SceneLayout r45, int r46, int r47, int r48, int r49, int r50, int r51, int r52, boolean r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, boolean r59, boolean r60, boolean r61, int r62, boolean r63, boolean r64, java.lang.String r65, java.lang.Float r66, java.lang.Float r67, float r68, java.lang.String r69, boolean r70, com.sugarcube.decorate_engine.WindowFitMode r71, float r72, float r73, boolean r74, boolean r75, boolean r76, int r77, int r78) {
        /*
            r42 = this;
            r15 = r43
            r14 = r71
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "windowFitMode"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            android.content.res.AssetManager r1 = r43.getAssets()
            java.io.File r0 = r43.getCacheDir()
            java.lang.String r2 = r0.getAbsolutePath()
            java.lang.String r0 = ""
            if (r69 != 0) goto L_0x0020
            r3 = r0
            goto L_0x0022
        L_0x0020:
            r3 = r69
        L_0x0022:
            if (r44 == 0) goto L_0x002d
            java.lang.String r4 = r44.toJsonOrEmptyString$decorate_engine_release()
            if (r4 != 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r5 = r4
            goto L_0x002e
        L_0x002d:
            r5 = r0
        L_0x002e:
            if (r65 == 0) goto L_0x0042
            r10 = 4
            r11 = 0
            java.lang.String r7 = "file://"
            java.lang.String r8 = ""
            r9 = 0
            r6 = r65
            java.lang.String r4 = HJ.C15854t.Q(r6, r7, r8, r9, r10, r11)
            if (r4 != 0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            r6 = r4
            goto L_0x0043
        L_0x0042:
            r6 = r0
        L_0x0043:
            r13 = 0
            if (r66 == 0) goto L_0x004c
            float r4 = r66.floatValue()
            r7 = r4
            goto L_0x004d
        L_0x004c:
            r7 = r13
        L_0x004d:
            if (r67 == 0) goto L_0x0055
            float r4 = r67.floatValue()
            r8 = r4
            goto L_0x0056
        L_0x0055:
            r8 = r13
        L_0x0056:
            if (r45 == 0) goto L_0x0061
            java.lang.String r4 = r45.toJson$decorate_engine_release()
            if (r4 != 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            r9 = r4
            goto L_0x0062
        L_0x0061:
            r9 = r0
        L_0x0062:
            kotlin.jvm.internal.C17542s.g(r2)
            r40 = 0
            r41 = 0
            r10 = 0
            r39 = 512(0x200, float:7.175E-43)
            r0 = r42
            r4 = r70
            r11 = r46
            r12 = r78
            r13 = r77
            r14 = r72
            r15 = r73
            r16 = r47
            r17 = r48
            r18 = r49
            r19 = r50
            r20 = r51
            r21 = r52
            r22 = r68
            r23 = r54
            r24 = r53
            r25 = r57
            r26 = r55
            r27 = r56
            r28 = r58
            r29 = r59
            r30 = r62
            r31 = r63
            r32 = r64
            r33 = r60
            r34 = r61
            r35 = r74
            r36 = r75
            r37 = r76
            r38 = r43
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1 = r71
            r0.setWindowFitMode(r1)
            int r1 = r77 * r78
            if (r1 > 0) goto L_0x00f7
            java.lang.String r1 = "window"
            r2 = r43
            java.lang.Object r1 = r2.getSystemService(r1)
            java.lang.String r2 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.C17542s.h(r1, r2)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            if (r2 < r3) goto L_0x00e3
            android.view.WindowMetrics r1 = r1.getMaximumWindowMetrics()
            android.graphics.Rect r1 = r1.getBounds()
            java.lang.String r2 = "getBounds(...)"
            kotlin.jvm.internal.C17542s.i(r1, r2)
            int r2 = r1.width()
            r0.maxRenderWidth = r2
            int r1 = r1.height()
            r0.maxRenderHeight = r1
            goto L_0x00f7
        L_0x00e3:
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            android.view.Display r1 = r1.getDefaultDisplay()
            r1.getRealSize(r2)
            int r1 = r2.x
            r0.maxRenderWidth = r1
            int r1 = r2.y
            r0.maxRenderHeight = r1
        L_0x00f7:
            float r1 = r0.generatedSceneWidth
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0104
            float r1 = r0.generatedSceneDepth
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L_0x0108
        L_0x0104:
            r0.generatedSceneWidth = r2
            r0.generatedSceneDepth = r2
        L_0x0108:
            java.lang.String r1 = r0.logFilePath
            int r1 = r1.length()
            r2 = 0
            if (r1 != 0) goto L_0x0143
        L_0x0111:
            r1 = 8
            if (r2 >= r1) goto L_0x0167
            java.lang.String r1 = r0.cacheDir
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            java.lang.String r1 = "/decorate_native_"
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = ".log"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r0.logFilePath = r1
            java.io.File r1 = new java.io.File
            java.lang.String r3 = r0.logFilePath
            r1.<init>(r3)
            boolean r1 = r1.exists()
            if (r1 != 0) goto L_0x0140
            goto L_0x0167
        L_0x0140:
            int r2 = r2 + 1
            goto L_0x0111
        L_0x0143:
            java.lang.String r1 = r0.logFilePath
            r3 = 2
            r4 = 0
            java.lang.String r5 = "/"
            boolean r1 = HJ.C15854t.d0(r1, r5, r2, r3, r4)
            if (r1 != 0) goto L_0x0167
            java.lang.String r1 = r0.cacheDir
            java.lang.String r2 = r0.logFilePath
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r5)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r0.logFilePath = r1
        L_0x0167:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.DecorateEngineSetupInfo.<init>(android.content.Context, com.sugarcube.decorate_engine.DecorateEngineManifest, com.sugarcube.decorate_engine.SceneLayout, int, int, int, int, int, int, int, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, int, boolean, boolean, java.lang.String, java.lang.Float, java.lang.Float, float, java.lang.String, boolean, com.sugarcube.decorate_engine.WindowFitMode, float, float, boolean, boolean, boolean, int, int):void");
    }
}
