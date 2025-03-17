package com.sugarcube.app.base.ui.capturev2;

import XH.t;
import com.google.ar.core.TrackingFailureReason;
import com.google.ar.core.TrackingState;
import fI.C17221b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0010\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/m1;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "b", "()I", "Companion", "a", "Stopped", "Tracking", "CameraUnavailable", "ExcessiveMotion", "InsufficientFeatures", "InsufficientLight", "BadState", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum m1 {
    Stopped(0),
    Tracking(1),
    CameraUnavailable(2),
    ExcessiveMotion(3),
    InsufficientFeatures(4),
    InsufficientLight(5),
    BadState(6);
    
    public static final a Companion = null;
    private final int value;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/m1$a;", "", "<init>", "()V", "Lcom/sugarcube/app/base/ui/capturev2/V;", "frameData", "Lcom/sugarcube/app/base/ui/capturev2/m1;", "a", "(Lcom/sugarcube/app/base/ui/capturev2/V;)Lcom/sugarcube/app/base/ui/capturev2/m1;", "Lcom/google/ar/core/TrackingState;", "trackingState", "Lcom/google/ar/core/TrackingFailureReason;", "trackingFailureReason", "b", "(Lcom/google/ar/core/TrackingState;Lcom/google/ar/core/TrackingFailureReason;)Lcom/sugarcube/app/base/ui/capturev2/m1;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.sugarcube.app.base.ui.capturev2.m1$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C3039a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f123953a = null;

            /* renamed from: b  reason: collision with root package name */
            public static final /* synthetic */ int[] f123954b = null;

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
                    f123953a = r0
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
                    f123954b = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.m1.a.C3039a.<clinit>():void");
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m1 a(V v10) {
            C17542s.j(v10, "frameData");
            return b(v10.q(), v10.p());
        }

        public final m1 b(TrackingState trackingState, TrackingFailureReason trackingFailureReason) {
            C17542s.j(trackingState, "trackingState");
            C17542s.j(trackingFailureReason, "trackingFailureReason");
            int i10 = C3039a.f123954b[trackingState.ordinal()];
            if (i10 == 1 || i10 == 2) {
                switch (C3039a.f123953a[trackingFailureReason.ordinal()]) {
                    case 1:
                        return m1.Stopped;
                    case 2:
                        return m1.CameraUnavailable;
                    case 3:
                        return m1.ExcessiveMotion;
                    case 4:
                        return m1.InsufficientFeatures;
                    case 5:
                        return m1.InsufficientLight;
                    case 6:
                        return m1.BadState;
                    default:
                        throw new t();
                }
            } else if (i10 == 3) {
                return m1.Tracking;
            } else {
                throw new t();
            }
        }

        private a() {
        }
    }

    static {
        m1[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private m1(int i10) {
        this.value = i10;
    }

    public final int b() {
        return this.value;
    }
}
