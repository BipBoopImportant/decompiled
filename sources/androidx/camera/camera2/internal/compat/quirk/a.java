package androidx.camera.camera2.internal.compat.quirk;

import C.C4391e0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.P0;
import androidx.camera.core.impl.R0;
import java.util.ArrayList;
import w.B;

public class a {
    public static R0 a(String str, B b10) {
        O0 a10 = P0.b().a();
        ArrayList arrayList = new ArrayList();
        if (a10.a(AeFpsRangeLegacyQuirk.class, AeFpsRangeLegacyQuirk.h(b10))) {
            arrayList.add(new AeFpsRangeLegacyQuirk(b10));
        }
        if (a10.a(AspectRatioLegacyApi21Quirk.class, AspectRatioLegacyApi21Quirk.g(b10))) {
            arrayList.add(new AspectRatioLegacyApi21Quirk());
        }
        if (a10.a(JpegHalCorruptImageQuirk.class, JpegHalCorruptImageQuirk.f(b10))) {
            arrayList.add(new JpegHalCorruptImageQuirk());
        }
        if (a10.a(JpegCaptureDownsizingQuirk.class, JpegCaptureDownsizingQuirk.f(b10))) {
            arrayList.add(new JpegCaptureDownsizingQuirk());
        }
        if (a10.a(CamcorderProfileResolutionQuirk.class, CamcorderProfileResolutionQuirk.g(b10))) {
            arrayList.add(new CamcorderProfileResolutionQuirk(b10));
        }
        if (a10.a(CaptureNoResponseQuirk.class, CaptureNoResponseQuirk.f(b10))) {
            arrayList.add(new CaptureNoResponseQuirk());
        }
        if (a10.a(LegacyCameraOutputConfigNullPointerQuirk.class, LegacyCameraOutputConfigNullPointerQuirk.f(b10))) {
            arrayList.add(new LegacyCameraOutputConfigNullPointerQuirk());
        }
        if (a10.a(LegacyCameraSurfaceCleanupQuirk.class, LegacyCameraSurfaceCleanupQuirk.g(b10))) {
            arrayList.add(new LegacyCameraSurfaceCleanupQuirk());
        }
        if (a10.a(ImageCaptureWashedOutImageQuirk.class, ImageCaptureWashedOutImageQuirk.f(b10))) {
            arrayList.add(new ImageCaptureWashedOutImageQuirk());
        }
        if (a10.a(CameraNoResponseWhenEnablingFlashQuirk.class, CameraNoResponseWhenEnablingFlashQuirk.f(b10))) {
            arrayList.add(new CameraNoResponseWhenEnablingFlashQuirk());
        }
        if (a10.a(YuvImageOnePixelShiftQuirk.class, YuvImageOnePixelShiftQuirk.l(b10))) {
            arrayList.add(new YuvImageOnePixelShiftQuirk());
        }
        if (a10.a(FlashTooSlowQuirk.class, FlashTooSlowQuirk.g(b10))) {
            arrayList.add(new FlashTooSlowQuirk());
        }
        if (a10.a(AfRegionFlipHorizontallyQuirk.class, AfRegionFlipHorizontallyQuirk.f(b10))) {
            arrayList.add(new AfRegionFlipHorizontallyQuirk());
        }
        if (a10.a(ConfigureSurfaceToSecondarySessionFailQuirk.class, ConfigureSurfaceToSecondarySessionFailQuirk.f(b10))) {
            arrayList.add(new ConfigureSurfaceToSecondarySessionFailQuirk());
        }
        if (a10.a(PreviewOrientationIncorrectQuirk.class, PreviewOrientationIncorrectQuirk.f(b10))) {
            arrayList.add(new PreviewOrientationIncorrectQuirk());
        }
        if (a10.a(CaptureSessionStuckQuirk.class, CaptureSessionStuckQuirk.f(b10))) {
            arrayList.add(new CaptureSessionStuckQuirk());
        }
        if (a10.a(ImageCaptureFlashNotFireQuirk.class, ImageCaptureFlashNotFireQuirk.f(b10))) {
            arrayList.add(new ImageCaptureFlashNotFireQuirk());
        }
        if (a10.a(ImageCaptureWithFlashUnderexposureQuirk.class, ImageCaptureWithFlashUnderexposureQuirk.f(b10))) {
            arrayList.add(new ImageCaptureWithFlashUnderexposureQuirk());
        }
        if (a10.a(ImageCaptureFailWithAutoFlashQuirk.class, ImageCaptureFailWithAutoFlashQuirk.f(b10))) {
            arrayList.add(new ImageCaptureFailWithAutoFlashQuirk());
        }
        if (a10.a(IncorrectCaptureStateQuirk.class, IncorrectCaptureStateQuirk.f(b10))) {
            arrayList.add(new IncorrectCaptureStateQuirk());
        }
        if (a10.a(TorchFlashRequiredFor3aUpdateQuirk.class, TorchFlashRequiredFor3aUpdateQuirk.k(b10))) {
            arrayList.add(new TorchFlashRequiredFor3aUpdateQuirk(b10));
        }
        if (a10.a(PreviewStretchWhenVideoCaptureIsBoundQuirk.class, PreviewStretchWhenVideoCaptureIsBoundQuirk.l())) {
            arrayList.add(new PreviewStretchWhenVideoCaptureIsBoundQuirk());
        }
        if (a10.a(PreviewDelayWhenVideoCaptureIsBoundQuirk.class, PreviewDelayWhenVideoCaptureIsBoundQuirk.f())) {
            arrayList.add(new PreviewDelayWhenVideoCaptureIsBoundQuirk());
        }
        if (a10.a(ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.m())) {
            arrayList.add(new ImageCaptureFailedWhenVideoCaptureIsBoundQuirk());
        }
        if (a10.a(TemporalNoiseQuirk.class, TemporalNoiseQuirk.g(b10))) {
            arrayList.add(new TemporalNoiseQuirk());
        }
        if (a10.a(ImageCaptureFailedForVideoSnapshotQuirk.class, ImageCaptureFailedForVideoSnapshotQuirk.h())) {
            arrayList.add(new ImageCaptureFailedForVideoSnapshotQuirk());
        }
        R0 r02 = new R0(arrayList);
        C4391e0.a("CameraQuirks", "camera2 CameraQuirks = " + R0.d(r02));
        return r02;
    }
}
