package JF;

import OE.q;
import XH.C16796C;
import XH.v;
import YE.C13868b;
import YE.e;
import YH.C16870n;
import YH.X;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import com.sugarcube.core.logger.AnyKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\r\u001a\u00020\f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0012\u001a\u00020\f*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u0017*\u00020\u000f2\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\b\b\u0002\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001d\u0010\u001b\u001a\f\u0012\b\u0012\u00060\u0014j\u0002`\u00150\u001a*\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u001c*\n\u0010\u001d\"\u00020\u00142\u00020\u0014¨\u0006\u001e"}, d2 = {"Landroid/hardware/camera2/CameraCharacteristics;", "", "isRotated", "", "zoom", "LXH/v;", "a", "(Landroid/hardware/camera2/CameraCharacteristics;ZF)LXH/v;", "", "characteristics", "Landroid/util/Size;", "imageSize", "LXH/N;", "c", "([FLandroid/hardware/camera2/CameraCharacteristics;Landroid/util/Size;F)V", "Landroid/hardware/camera2/CameraManager;", "LOE/q;", "sugarcube", "h", "(Landroid/hardware/camera2/CameraManager;LOE/q;)V", "", "Lcom/sugarcube/app/base/ui/utils/CameraId;", "cameraId", "", "f", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Landroid/hardware/camera2/CameraCharacteristics;)Ljava/util/Map;", "", "e", "(Landroid/hardware/camera2/CameraManager;)Ljava/util/List;", "CameraId", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class r {
    public static final v<Float, Float> a(CameraCharacteristics cameraCharacteristics, boolean z10, float f10) {
        C17542s.j(cameraCharacteristics, "<this>");
        float[] fArr = new float[9];
        Size size = (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        if (size == null) {
            size = new Size(0, 0);
        }
        c(fArr, cameraCharacteristics, size, f10);
        float atan2 = ((float) Math.atan2((double) fArr[2], (double) fArr[0])) * 2.0f * 57.29578f;
        float atan22 = ((float) Math.atan2((double) fArr[5], (double) fArr[4])) * 2.0f * 57.29578f;
        v<Float, Float> vVar = z10 ? new v<>(Float.valueOf(atan22), Float.valueOf(atan2)) : new v<>(Float.valueOf(atan2), Float.valueOf(atan22));
        Float c10 = vVar.c();
        Float d10 = vVar.d();
        String arrays = Arrays.toString(fArr);
        C17542s.i(arrays, "toString(...)");
        String str = "CameraCharacteristics.fov(" + z10 + "," + f10 + ") = [" + c10 + "," + d10 + "] " + arrays;
        Log.d(AnyKt.SUGARCUBE_TAG, str);
        C13868b.f118106a.b(str, e.Capture);
        return vVar;
    }

    public static /* synthetic */ v b(CameraCharacteristics cameraCharacteristics, boolean z10, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            f10 = 1.0f;
        }
        return a(cameraCharacteristics, z10, f10);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00eb, code lost:
        if (r3 > 0.1f) goto L_0x00f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fc, code lost:
        if (r4 > 0.1f) goto L_0x00fe;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0198  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void c(float[] r20, android.hardware.camera2.CameraCharacteristics r21, android.util.Size r22, float r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.C17542s.j(r0, r4)
            java.lang.String r4 = "characteristics"
            kotlin.jvm.internal.C17542s.j(r1, r4)
            java.lang.String r4 = "imageSize"
            kotlin.jvm.internal.C17542s.j(r2, r4)
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_INTRINSIC_CALIBRATION
            java.lang.Object r4 = r1.get(r4)
            float[] r4 = (float[]) r4
            r5 = 0
            if (r4 != 0) goto L_0x0024
            float[] r4 = new float[r5]
        L_0x0024:
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS
            java.lang.Object r6 = r1.get(r6)
            float[] r6 = (float[]) r6
            if (r6 != 0) goto L_0x0030
            float[] r6 = new float[r5]
        L_0x0030:
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE
            java.lang.Object r7 = r1.get(r7)
            android.util.SizeF r7 = (android.util.SizeF) r7
            r8 = 0
            if (r7 != 0) goto L_0x0040
            android.util.SizeF r7 = new android.util.SizeF
            r7.<init>(r8, r8)
        L_0x0040:
            java.lang.String r9 = java.util.Arrays.toString(r4)
            java.lang.String r10 = "toString(...)"
            kotlin.jvm.internal.C17542s.i(r9, r10)
            java.lang.String r11 = java.util.Arrays.toString(r6)
            kotlin.jvm.internal.C17542s.i(r11, r10)
            float r10 = r7.getWidth()
            float r12 = r7.getHeight()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "fromCameraCharacteristics("
            r13.append(r14)
            r13.append(r2)
            java.lang.String r14 = ","
            r13.append(r14)
            r13.append(r3)
            java.lang.String r15 = ") "
            r13.append(r15)
            r13.append(r9)
            java.lang.String r9 = " "
            r13.append(r9)
            r13.append(r11)
            java.lang.String r9 = " ["
            r13.append(r9)
            r13.append(r10)
            r13.append(r14)
            r13.append(r12)
            java.lang.String r9 = "]"
            r13.append(r9)
            java.lang.String r10 = r13.toString()
            java.lang.String r11 = "Sugarcube"
            android.util.Log.d(r11, r10)
            YE.b r12 = YE.C13868b.f118106a
            YE.e r13 = YE.e.Capture
            r12.b(r10, r13)
            int r10 = r6.length
            if (r10 <= 0) goto L_0x00a6
            r10 = r6[r5]
            goto L_0x00a7
        L_0x00a6:
            r10 = r8
        L_0x00a7:
            float r15 = r10 * r3
            int r8 = r22.getWidth()
            float r8 = (float) r8
            float r15 = r15 * r8
            float r8 = r7.getWidth()
            float r15 = r15 / r8
            int r8 = r4.length
            r17 = 1036831949(0x3dcccccd, float:0.1)
            if (r8 <= 0) goto L_0x00c2
            r8 = r4[r5]
            int r18 = (r8 > r17 ? 1 : (r8 == r17 ? 0 : -1))
            if (r18 <= 0) goto L_0x00c2
            float r8 = r8 * r3
            goto L_0x00c3
        L_0x00c2:
            r8 = r15
        L_0x00c3:
            int r5 = r6.length
            r2 = 1
            if (r5 <= r2) goto L_0x00c9
            r10 = r6[r2]
        L_0x00c9:
            float r10 = r10 * r3
            int r5 = r22.getHeight()
            float r5 = (float) r5
            float r10 = r10 * r5
            float r5 = r7.getHeight()
            float r10 = r10 / r5
            int r5 = r4.length
            if (r5 <= r2) goto L_0x00e0
            r5 = r4[r2]
            int r6 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e0
            float r5 = r5 * r3
            goto L_0x00e1
        L_0x00e0:
            r5 = r10
        L_0x00e1:
            int r3 = r4.length
            r6 = 2
            r7 = 1073741824(0x40000000, float:2.0)
            if (r3 <= r6) goto L_0x00ee
            r3 = r4[r6]
            int r19 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r19 <= 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            int r3 = r22.getWidth()
            float r3 = (float) r3
            float r3 = r3 / r7
        L_0x00f4:
            int r6 = r4.length
            r2 = 3
            if (r6 <= r2) goto L_0x0100
            r4 = r4[r2]
            int r6 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r6 <= 0) goto L_0x0100
        L_0x00fe:
            r6 = 0
            goto L_0x0107
        L_0x0100:
            int r4 = r22.getHeight()
            float r4 = (float) r4
            float r4 = r4 / r7
            goto L_0x00fe
        L_0x0107:
            r0[r6] = r8
            r6 = 0
            r16 = 1
            r0[r16] = r6
            r16 = 2
            r0[r16] = r3
            r0[r2] = r6
            r2 = 4
            r0[r2] = r5
            r2 = 5
            r0[r2] = r4
            r2 = 6
            r0[r2] = r6
            r2 = 7
            r0[r2] = r6
            r2 = 8
            r6 = 1065353216(0x3f800000, float:1.0)
            r0[r2] = r6
            double r0 = (double) r3
            r2 = r12
            r6 = r13
            double r12 = (double) r8
            double r0 = java.lang.Math.atan2(r0, r12)
            float r0 = (float) r0
            r1 = 1113927393(0x42652ee1, float:57.29578)
            float r0 = r0 * r1
            float r0 = r0 * r7
            double r12 = (double) r4
            r16 = r8
            double r7 = (double) r5
            double r7 = java.lang.Math.atan2(r12, r7)
            float r7 = (float) r7
            float r7 = r7 * r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r8 = "fromCameraCharacteristics fov=["
            r1.append(r8)
            r1.append(r0)
            r1.append(r14)
            r1.append(r7)
            java.lang.String r0 = "] ["
            r1.append(r0)
            r8 = r16
            r1.append(r8)
            r1.append(r14)
            r1.append(r5)
            r1.append(r14)
            r1.append(r3)
            r1.append(r14)
            r1.append(r4)
            java.lang.String r0 = "] zoomF=["
            r1.append(r0)
            r1.append(r15)
            r1.append(r14)
            r1.append(r10)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            android.util.Log.d(r11, r0)
            r2.b(r0, r6)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_POSE_TRANSLATION
            r1 = r21
            java.lang.Object r0 = r1.get(r0)
            float[] r0 = (float[]) r0
            r2 = 0
            if (r0 != 0) goto L_0x019a
            float[] r0 = new float[r2]
        L_0x019a:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 31
            if (r3 < r4) goto L_0x01ac
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_DISTORTION_MAXIMUM_RESOLUTION
            java.lang.Object r1 = r1.get(r3)
            float[] r1 = (float[]) r1
            if (r1 != 0) goto L_0x01ae
        L_0x01ac:
            float[] r1 = new float[r2]
        L_0x01ae:
            java.util.List r0 = YH.C16870n.Z0(r0)
            java.util.List r1 = YH.C16870n.Z0(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "LENS_POSE_TRANSLATION="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " LENS_DISTORTION_MAXIMUM_RESOLUTION="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: JF.r.c(float[], android.hardware.camera2.CameraCharacteristics, android.util.Size, float):void");
    }

    public static /* synthetic */ void d(float[] fArr, CameraCharacteristics cameraCharacteristics, Size size, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        c(fArr, cameraCharacteristics, size, f10);
    }

    private static final List<String> e(CameraManager cameraManager) {
        int[] iArr;
        String[] cameraIdList = cameraManager.getCameraIdList();
        C17542s.i(cameraIdList, "getCameraIdList(...)");
        ArrayList arrayList = new ArrayList();
        for (String str : cameraIdList) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
            if (num != null && num.intValue() == 1 && (iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES)) != null && C16870n.Y(iArr, 0)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    private static final Map<String, String> f(CameraManager cameraManager, String str, CameraCharacteristics cameraCharacteristics) {
        Range range;
        float[] fArr;
        Integer num;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("cameraId", String.valueOf(str));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            Set a10 = cameraCharacteristics.getPhysicalCameraIds();
            C17542s.g(a10);
            if (!a10.isEmpty()) {
                linkedHashMap.put("cameraPhysicalCameraIds", String.valueOf(a10));
            }
        }
        if (i10 >= 31) {
            List a11 = cameraManager.getCameraExtensionCharacteristics(str).getSupportedExtensions();
            C17542s.g(a11);
            if (!a11.isEmpty()) {
                linkedHashMap.put("cameraSupportedExtensions", String.valueOf(a11));
            }
        }
        float[] fArr2 = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_POSE_ROTATION);
        if (fArr2 != null) {
            String arrays = Arrays.toString(fArr2);
            C17542s.i(arrays, "toString(...)");
            if (arrays != null) {
                String str2 = (String) linkedHashMap.put("LENS_POSE_ROTATION", arrays);
            }
        }
        float[] fArr3 = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_POSE_TRANSLATION);
        if (fArr3 != null) {
            String arrays2 = Arrays.toString(fArr3);
            C17542s.i(arrays2, "toString(...)");
            if (arrays2 != null) {
                String str3 = (String) linkedHashMap.put("LENS_POSE_TRANSLATION", arrays2);
            }
        }
        if (i10 >= 28 && (num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_POSE_REFERENCE)) != null) {
            String str4 = (String) linkedHashMap.put("LENS_POSE_REFERENCE", String.valueOf(num.intValue()));
        }
        float[] fArr4 = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
        if (fArr4 != null) {
            String arrays3 = Arrays.toString(fArr4);
            C17542s.i(arrays3, "toString(...)");
            if (arrays3 != null) {
                String str5 = (String) linkedHashMap.put("LENS_INFO_AVAILABLE_FOCAL_LENGTHS", arrays3);
            }
        }
        Rect rect = (Rect) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect != null) {
            String str6 = (String) linkedHashMap.put("SENSOR_INFO_ACTIVE_ARRAY_SIZE", String.valueOf(rect));
        }
        SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        if (sizeF != null) {
            String str7 = (String) linkedHashMap.put("SENSOR_INFO_PHYSICAL_SIZE", String.valueOf(sizeF));
        }
        Size size = (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        if (size != null) {
            String str8 = (String) linkedHashMap.put("SENSOR_INFO_PIXEL_ARRAY_SIZE", String.valueOf(size));
        }
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            String arrays4 = Arrays.toString(iArr);
            C17542s.i(arrays4, "toString(...)");
            if (arrays4 != null) {
                String str9 = (String) linkedHashMap.put("REQUEST_AVAILABLE_CAPABILITIES", arrays4);
            }
        }
        float[] fArr5 = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INTRINSIC_CALIBRATION);
        if (fArr5 != null) {
            String arrays5 = Arrays.toString(fArr5);
            C17542s.i(arrays5, "toString(...)");
            if (arrays5 != null) {
                String str10 = (String) linkedHashMap.put("LENS_INTRINSIC_CALIBRATION", arrays5);
            }
        }
        int[] iArr2 = (int[]) cameraCharacteristics.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr2 != null) {
            String arrays6 = Arrays.toString(iArr2);
            C17542s.i(arrays6, "toString(...)");
            if (arrays6 != null) {
                String str11 = (String) linkedHashMap.put("CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES", arrays6);
            }
        }
        if (i10 >= 31 && (fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INTRINSIC_CALIBRATION_MAXIMUM_RESOLUTION)) != null) {
            String arrays7 = Arrays.toString(fArr);
            C17542s.i(arrays7, "toString(...)");
            if (arrays7 != null) {
                String str12 = (String) linkedHashMap.put("LENS_INTRINSIC_CALIBRATION_MAXIMUM_RESOLUTION", arrays7);
            }
        }
        if (i10 >= 28) {
            float[] fArr6 = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_RADIAL_DISTORTION);
            if (fArr6 != null) {
                String arrays8 = Arrays.toString(fArr6);
                C17542s.i(arrays8, "toString(...)");
                if (arrays8 != null) {
                    String str13 = (String) linkedHashMap.put("LENS_RADIAL_DISTORTION", arrays8);
                }
            }
            float[] fArr7 = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_DISTORTION);
            if (fArr7 != null) {
                String arrays9 = Arrays.toString(fArr7);
                C17542s.i(arrays9, "toString(...)");
                if (arrays9 != null) {
                    String str14 = (String) linkedHashMap.put("LENS_DISTORTION", arrays9);
                }
            }
        }
        if (i10 >= 30 && (range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) != null) {
            linkedHashMap.put("CONTROL_ZOOM_RATIO_RANGE", String.valueOf(range));
        }
        return linkedHashMap;
    }

    static /* synthetic */ Map g(CameraManager cameraManager, String str, CameraCharacteristics cameraCharacteristics, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
        }
        return f(cameraManager, str, cameraCharacteristics);
    }

    public static final void h(CameraManager cameraManager, q qVar) {
        Range range;
        Float f10;
        C17542s.j(cameraManager, "<this>");
        C17542s.j(qVar, "sugarcube");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : e(cameraManager)) {
            CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            if (fArr == null) {
                fArr = new float[]{0.0f};
            }
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (sizeF == null) {
                sizeF = new SizeF(0.0f, 0.0f);
            }
            int i10 = Build.VERSION.SDK_INT;
            float f11 = 1.0f;
            if (!(i10 < 30 || (range = (Range) cameraCharacteristics.get(CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE)) == null || (f10 = (Float) range.getLower()) == null)) {
                f11 = f10.floatValue();
            }
            C17542s.g(cameraCharacteristics);
            v<Float, Float> a10 = a(cameraCharacteristics, false, f11);
            Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.SENSOR_ORIENTATION);
            int intValue = num != null ? num.intValue() : -1;
            v a11 = C16796C.a("fov", a10.toString());
            String arrays = Arrays.toString(fArr);
            C17542s.i(arrays, "toString(...)");
            String obj = X.l(a11, C16796C.a("focalLengths", arrays), C16796C.a("sensorSize", sizeF.toString()), C16796C.a("zoom", String.valueOf(f11)), C16796C.a("sensorOrientation", String.valueOf(intValue))).toString();
            C17542s.i(obj, "toString(...)");
            linkedHashMap.put("camera_" + str, obj);
            Map<String, String> f12 = f(cameraManager, str, cameraCharacteristics);
            C13868b.f118106a.b("CameraCharacteristics: " + f12, e.Capture);
            Log.d(AnyKt.SUGARCUBE_TAG, "CameraCharacteristics: " + f12);
            if (i10 >= 28) {
                Set<String> a12 = cameraCharacteristics.getPhysicalCameraIds();
                C17542s.i(a12, "getPhysicalCameraIds(...)");
                for (String str2 : a12) {
                    C17542s.g(str2);
                    Map g10 = g(cameraManager, str2, (CameraCharacteristics) null, 2, (Object) null);
                    C13868b.f118106a.b("CameraCharacteristics: " + g10, e.Capture);
                    Log.d(AnyKt.SUGARCUBE_TAG, "CameraCharacteristics: " + g10);
                }
            }
        }
        if (!linkedHashMap.isEmpty()) {
            C13868b.f118106a.b("CameraCharacteristics: " + linkedHashMap, e.Capture);
            qVar.b().captureCameraCharacteristics(new HashMap(linkedHashMap));
        }
    }
}
