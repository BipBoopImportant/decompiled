package com.sugarcube.app.base.ui.capturev2;

import NE.C13286b;
import XH.C16807N;
import android.opengl.Matrix;
import com.squareup.moshi.t;
import jI.C17416c;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\b\b\b\u0018\u0000 Z2\u00020\u0001:\u0001 B\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0016H\u0016¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\b1\u00100R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u00100\"\u0004\b4\u00105R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u00100R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010.\u001a\u0004\b8\u00100R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\b9\u00100R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010.\u001a\u0004\b:\u00100R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010.\u001a\u0004\b<\u00100R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010.\u001a\u0004\b>\u00100R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010.\u001a\u0004\b@\u00100R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010.\u001a\u0004\bB\u00100R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bD\u00100R$\u0010H\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u00138\u0006@BX\u000e¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b2\u0010)R$\u0010M\u001a\u00020I2\u0006\u0010E\u001a\u00020I8\u0006@BX\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\b6\u0010LR\u001c\u0010R\u001a\n O*\u0004\u0018\u00010N0N8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010V\u001a\u00020S8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bW\u0010X¨\u0006["}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/L;", "", "Ljava/lang/StringBuffer;", "poses", "viewMatrix", "projectionMatrix", "intrinsicsMatrix", "timestampsColor", "timestampsDepth", "pointCloud", "pointId", "trackingState", "state", "gravity", "timestampsGravity", "<init>", "(Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;Ljava/lang/StringBuffer;)V", "Lcom/sugarcube/app/base/ui/capturev2/V;", "frameData", "", "g", "(Lcom/sugarcube/app/base/ui/capturev2/V;)I", "", "LXH/N;", "f", "(Ljava/lang/String;)V", "Lcom/sugarcube/app/base/ui/capturev2/R0;", "sensorData", "Lcom/sugarcube/app/base/ui/capturev2/W;", "intrinsics", "b", "(Lcom/sugarcube/app/base/ui/capturev2/R0;Lcom/sugarcube/app/base/ui/capturev2/W;)V", "a", "(Lcom/sugarcube/app/base/ui/capturev2/V;)V", "Ljava/io/File;", "file", "e", "(Ljava/io/File;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/StringBuffer;", "getPoses", "()Ljava/lang/StringBuffer;", "getViewMatrix", "c", "getProjectionMatrix", "setProjectionMatrix", "(Ljava/lang/StringBuffer;)V", "d", "getIntrinsicsMatrix", "getTimestampsColor", "getTimestampsDepth", "getPointCloud", "h", "getPointId", "i", "getTrackingState", "j", "getState", "k", "getGravity", "l", "getTimestampsGravity", "value", "m", "I", "count", "Lcom/sugarcube/app/base/ui/capturev2/M;", "n", "Lcom/sugarcube/app/base/ui/capturev2/M;", "()Lcom/sugarcube/app/base/ui/capturev2/M;", "metaStats", "Lcom/squareup/moshi/t;", "kotlin.jvm.PlatformType", "o", "Lcom/squareup/moshi/t;", "moshi", "", "p", "[F", "transform16", "q", "Ljava/lang/String;", "nextState", "r", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class L {

    /* renamed from: r  reason: collision with root package name */
    public static final a f123507r;

    /* renamed from: s  reason: collision with root package name */
    public static final int f123508s = 8;

    /* renamed from: t  reason: collision with root package name */
    private static final float[] f123509t;

    /* renamed from: a  reason: collision with root package name */
    private final StringBuffer f123510a;

    /* renamed from: b  reason: collision with root package name */
    private final StringBuffer f123511b;

    /* renamed from: c  reason: collision with root package name */
    private StringBuffer f123512c;

    /* renamed from: d  reason: collision with root package name */
    private final StringBuffer f123513d;

    /* renamed from: e  reason: collision with root package name */
    private final StringBuffer f123514e;

    /* renamed from: f  reason: collision with root package name */
    private final StringBuffer f123515f;

    /* renamed from: g  reason: collision with root package name */
    private final StringBuffer f123516g;

    /* renamed from: h  reason: collision with root package name */
    private final StringBuffer f123517h;

    /* renamed from: i  reason: collision with root package name */
    private final StringBuffer f123518i;

    /* renamed from: j  reason: collision with root package name */
    private final StringBuffer f123519j;

    /* renamed from: k  reason: collision with root package name */
    private final StringBuffer f123520k;

    /* renamed from: l  reason: collision with root package name */
    private final StringBuffer f123521l;

    /* renamed from: m  reason: collision with root package name */
    private int f123522m;

    /* renamed from: n  reason: collision with root package name */
    private M f123523n;

    /* renamed from: o  reason: collision with root package name */
    private final t f123524o;

    /* renamed from: p  reason: collision with root package name */
    private final float[] f123525p;

    /* renamed from: q  reason: collision with root package name */
    private String f123526q;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/L$a;", "", "<init>", "()V", "", "b", "([F)[F", "Ljava/io/BufferedWriter;", "Ljava/lang/StringBuffer;", "sb", "", "buffer", "LXH/N;", "c", "(Ljava/io/BufferedWriter;Ljava/lang/StringBuffer;[C)V", "a", "rotationTransform", "[F", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float[] a(float[] fArr) {
            C17542s.j(fArr, "<this>");
            float[] fArr2 = new float[3];
            float f10 = fArr[0];
            if (f10 != Float.NaN) {
                float f11 = fArr[1];
                if (f11 != Float.NaN) {
                    float f12 = fArr[2];
                    if (f12 != Float.NaN) {
                        float sqrt = (float) Math.sqrt((double) ((f10 * f10) + (f11 * f11) + (f12 * f12)));
                        float f13 = 1.0f;
                        if (sqrt != 0.0f) {
                            f13 = 1.0f / sqrt;
                        }
                        fArr2[0] = (-fArr[0]) * f13;
                        fArr2[1] = (-fArr[1]) * f13;
                        fArr2[2] = (-fArr[2]) * f13;
                        return fArr2;
                    }
                }
            }
            fArr2[0] = Float.NaN;
            fArr2[1] = Float.NaN;
            fArr2[2] = Float.NaN;
            return fArr2;
        }

        public final float[] b(float[] fArr) {
            C17542s.j(fArr, "<this>");
            float f10 = fArr[1];
            fArr[1] = fArr[4];
            fArr[4] = f10;
            float f11 = fArr[2];
            fArr[2] = fArr[8];
            fArr[8] = f11;
            float f12 = fArr[3];
            fArr[3] = fArr[12];
            fArr[12] = f12;
            float f13 = fArr[6];
            fArr[6] = fArr[9];
            fArr[9] = f13;
            float f14 = fArr[7];
            fArr[7] = fArr[13];
            fArr[13] = f14;
            float f15 = fArr[11];
            fArr[11] = fArr[14];
            fArr[14] = f15;
            return fArr;
        }

        public final void c(BufferedWriter bufferedWriter, StringBuffer stringBuffer, char[] cArr) {
            C17542s.j(bufferedWriter, "<this>");
            C17542s.j(stringBuffer, "sb");
            C17542s.j(cArr, "buffer");
            int i10 = 0;
            while (i10 < stringBuffer.length()) {
                int min = Math.min(cArr.length + i10, stringBuffer.length());
                stringBuffer.getChars(i10, min, cArr, 0);
                bufferedWriter.write(cArr, 0, min - i10);
                i10 = min;
            }
        }

        private a() {
        }
    }

    static {
        a aVar = new a((DefaultConstructorMarker) null);
        f123507r = aVar;
        f123509t = aVar.b(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f});
    }

    public L() {
        this((StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, (StringBuffer) null, 4095, (DefaultConstructorMarker) null);
    }

    private final int g(V v10) {
        return m1.Companion.a(v10).b();
    }

    public final void a(V v10) {
        C17542s.j(v10, "frameData");
        synchronized (this) {
            try {
                String str = this.f123522m == 0 ? "[" : ",";
                StringBuffer stringBuffer = this.f123510a;
                stringBuffer.append(str);
                stringBuffer.append(this.f123524o.c(float[].class).toJson(v10.l()));
                StringBuffer stringBuffer2 = this.f123511b;
                stringBuffer2.append(str);
                stringBuffer2.append(this.f123524o.c(float[].class).toJson(v10.r()));
                StringBuffer stringBuffer3 = this.f123512c;
                stringBuffer3.append(str);
                stringBuffer3.append(this.f123524o.c(float[].class).toJson(v10.m()));
                StringBuffer stringBuffer4 = this.f123513d;
                stringBuffer4.append(str);
                stringBuffer4.append(this.f123524o.c(float[].class).toJson(v10.g().f()));
                StringBuffer stringBuffer5 = this.f123514e;
                stringBuffer5.append(str);
                t tVar = this.f123524o;
                Class cls = Long.TYPE;
                stringBuffer5.append(tVar.c(cls).toJson(Long.valueOf(v10.o())));
                C14221m0 k10 = v10.k();
                if (k10 == null) {
                    k10 = new C14221m0(0, (float[]) null, (int[]) null, 7, (DefaultConstructorMarker) null);
                }
                StringBuffer stringBuffer6 = this.f123515f;
                stringBuffer6.append(str);
                stringBuffer6.append(this.f123524o.c(cls).toJson(Long.valueOf(k10.c())));
                StringBuffer stringBuffer7 = this.f123516g;
                stringBuffer7.append(str);
                stringBuffer7.append(this.f123524o.c(float[].class).toJson(k10.b()));
                StringBuffer stringBuffer8 = this.f123517h;
                stringBuffer8.append(str);
                stringBuffer8.append(this.f123524o.c(int[].class).toJson(k10.a()));
                int g10 = g(v10);
                StringBuffer stringBuffer9 = this.f123518i;
                stringBuffer9.append(str);
                stringBuffer9.append(this.f123524o.c(Integer.TYPE).toJson(Integer.valueOf(g10)));
                if (this.f123526q.length() > 0) {
                    String str2 = this.f123519j.length() == 0 ? "[" : ",";
                    Object[] objArr = {Integer.valueOf(this.f123522m), this.f123526q};
                    StringBuffer stringBuffer10 = this.f123519j;
                    stringBuffer10.append(str2);
                    stringBuffer10.append(this.f123524o.c(Object[].class).toJson(objArr));
                    this.f123526q = "";
                }
                R0 n10 = v10.n();
                if (n10 != null) {
                    float[] a10 = f123507r.a(n10.b());
                    StringBuffer stringBuffer11 = this.f123520k;
                    stringBuffer11.append(str);
                    stringBuffer11.append(this.f123524o.c(float[].class).toJson(a10));
                    StringBuffer stringBuffer12 = this.f123521l;
                    stringBuffer12.append(str);
                    stringBuffer12.append(this.f123524o.c(cls).toJson(Long.valueOf(n10.a())));
                }
                this.f123522m++;
                if (v10.e() == 0) {
                    v10.v(System.nanoTime());
                }
                this.f123523n.b(v10);
                C16807N n11 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(R0 r02, W w10) {
        C17542s.j(r02, "sensorData");
        C17542s.j(w10, "intrinsics");
        synchronized (this) {
            try {
                String str = this.f123522m == 0 ? "[" : ",";
                float[] fArr = new float[16];
                Matrix.multiplyMM(fArr, 0, f123509t, 0, r02.c(), 0);
                StringBuffer stringBuffer = this.f123510a;
                stringBuffer.append(str);
                stringBuffer.append(this.f123524o.c(float[].class).toJson(fArr));
                for (int i10 = 0; i10 < 16; i10++) {
                    this.f123525p[i10] = 0.0f;
                }
                StringBuffer stringBuffer2 = this.f123511b;
                stringBuffer2.append(str);
                stringBuffer2.append(this.f123524o.c(float[].class).toJson(this.f123525p));
                StringBuffer stringBuffer3 = this.f123512c;
                stringBuffer3.append(str);
                stringBuffer3.append(this.f123524o.c(float[].class).toJson(this.f123525p));
                StringBuffer stringBuffer4 = this.f123513d;
                stringBuffer4.append(str);
                stringBuffer4.append(this.f123524o.c(float[].class).toJson(w10.f()));
                long d10 = r02.d();
                StringBuffer stringBuffer5 = this.f123514e;
                stringBuffer5.append(str);
                t tVar = this.f123524o;
                Class cls = Long.TYPE;
                stringBuffer5.append(tVar.c(cls).toJson(Long.valueOf(d10)));
                StringBuffer stringBuffer6 = this.f123515f;
                stringBuffer6.append(str);
                stringBuffer6.append(this.f123524o.c(cls).toJson(Long.valueOf(d10)));
                StringBuffer stringBuffer7 = this.f123516g;
                stringBuffer7.append(str);
                stringBuffer7.append(this.f123524o.c(float[].class).toJson(new float[0]));
                StringBuffer stringBuffer8 = this.f123517h;
                stringBuffer8.append(str);
                stringBuffer8.append(this.f123524o.c(int[].class).toJson(new int[0]));
                StringBuffer stringBuffer9 = this.f123518i;
                stringBuffer9.append(str);
                stringBuffer9.append(this.f123524o.c(Integer.TYPE).toJson(0));
                float[] a10 = f123507r.a(r02.b());
                StringBuffer stringBuffer10 = this.f123520k;
                stringBuffer10.append(str);
                stringBuffer10.append(this.f123524o.c(float[].class).toJson(a10));
                StringBuffer stringBuffer11 = this.f123521l;
                stringBuffer11.append(str);
                stringBuffer11.append(this.f123524o.c(cls).toJson(Long.valueOf(r02.a())));
                if (this.f123526q.length() > 0) {
                    String str2 = this.f123519j.length() == 0 ? "[" : ",";
                    Object[] objArr = {Integer.valueOf(this.f123522m), this.f123526q};
                    StringBuffer stringBuffer12 = this.f123519j;
                    stringBuffer12.append(str2);
                    stringBuffer12.append(this.f123524o.c(Object[].class).toJson(objArr));
                    this.f123526q = "";
                }
                this.f123522m++;
                this.f123523n.a();
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int c() {
        return this.f123522m;
    }

    public final M d() {
        return this.f123523n;
    }

    public final void e(File file) {
        C17542s.j(file, "file");
        synchronized (this) {
            try {
                if (this.f123519j.length() == 0) {
                    this.f123519j.append("[");
                }
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    char[] cArr = new char[32768];
                    bufferedWriter.write("{\"poses\":");
                    a aVar = f123507r;
                    aVar.c(bufferedWriter, this.f123510a, cArr);
                    bufferedWriter.write("],\"viewMatrix\":");
                    aVar.c(bufferedWriter, this.f123511b, cArr);
                    bufferedWriter.write("],\"projectionMatrix\":");
                    aVar.c(bufferedWriter, this.f123512c, cArr);
                    bufferedWriter.write("],\"intrinsicsMatrix\":");
                    aVar.c(bufferedWriter, this.f123513d, cArr);
                    bufferedWriter.write("],\"timestampsColor\":");
                    aVar.c(bufferedWriter, this.f123514e, cArr);
                    bufferedWriter.write("],\"timestampsDepth\":");
                    aVar.c(bufferedWriter, this.f123515f, cArr);
                    bufferedWriter.write("],\"pointCloud\":");
                    aVar.c(bufferedWriter, this.f123516g, cArr);
                    bufferedWriter.write("],\"pointId\":");
                    aVar.c(bufferedWriter, this.f123517h, cArr);
                    bufferedWriter.write("],\"trackingState\":");
                    aVar.c(bufferedWriter, this.f123518i, cArr);
                    bufferedWriter.write("],\"state\":");
                    aVar.c(bufferedWriter, this.f123519j, cArr);
                    if (this.f123520k.length() > 0) {
                        bufferedWriter.write("],\"gravity\":");
                        aVar.c(bufferedWriter, this.f123520k, cArr);
                        bufferedWriter.write("],\"timestampsGravity\":");
                        aVar.c(bufferedWriter, this.f123521l, cArr);
                    }
                    bufferedWriter.write("]}");
                    C16807N n10 = C16807N.f139792a;
                    C17416c.a(bufferedWriter, (Throwable) null);
                } catch (Throwable th2) {
                    C17416c.a(bufferedWriter, th);
                    throw th2;
                }
            } finally {
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return C17542s.e(this.f123510a, l10.f123510a) && C17542s.e(this.f123511b, l10.f123511b) && C17542s.e(this.f123512c, l10.f123512c) && C17542s.e(this.f123513d, l10.f123513d) && C17542s.e(this.f123514e, l10.f123514e) && C17542s.e(this.f123515f, l10.f123515f) && C17542s.e(this.f123516g, l10.f123516g) && C17542s.e(this.f123517h, l10.f123517h) && C17542s.e(this.f123518i, l10.f123518i) && C17542s.e(this.f123519j, l10.f123519j) && C17542s.e(this.f123520k, l10.f123520k) && C17542s.e(this.f123521l, l10.f123521l);
    }

    public final void f(String str) {
        C17542s.j(str, "state");
        synchronized (this) {
            this.f123526q = str;
            C16807N n10 = C16807N.f139792a;
        }
    }

    public int hashCode() {
        return (((((((((((((((((((((this.f123510a.hashCode() * 31) + this.f123511b.hashCode()) * 31) + this.f123512c.hashCode()) * 31) + this.f123513d.hashCode()) * 31) + this.f123514e.hashCode()) * 31) + this.f123515f.hashCode()) * 31) + this.f123516g.hashCode()) * 31) + this.f123517h.hashCode()) * 31) + this.f123518i.hashCode()) * 31) + this.f123519j.hashCode()) * 31) + this.f123520k.hashCode()) * 31) + this.f123521l.hashCode();
    }

    public String toString() {
        int i10 = this.f123522m;
        M m10 = this.f123523n;
        return "CaptureMetaBuilder(count=" + i10 + ", metaStats=" + m10 + ")";
    }

    public L(StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, StringBuffer stringBuffer4, StringBuffer stringBuffer5, StringBuffer stringBuffer6, StringBuffer stringBuffer7, StringBuffer stringBuffer8, StringBuffer stringBuffer9, StringBuffer stringBuffer10, StringBuffer stringBuffer11, StringBuffer stringBuffer12) {
        C17542s.j(stringBuffer, "poses");
        C17542s.j(stringBuffer2, "viewMatrix");
        C17542s.j(stringBuffer3, "projectionMatrix");
        C17542s.j(stringBuffer4, "intrinsicsMatrix");
        C17542s.j(stringBuffer5, "timestampsColor");
        C17542s.j(stringBuffer6, "timestampsDepth");
        C17542s.j(stringBuffer7, "pointCloud");
        C17542s.j(stringBuffer8, "pointId");
        C17542s.j(stringBuffer9, "trackingState");
        C17542s.j(stringBuffer10, "state");
        C17542s.j(stringBuffer11, "gravity");
        C17542s.j(stringBuffer12, "timestampsGravity");
        this.f123510a = stringBuffer;
        this.f123511b = stringBuffer2;
        this.f123512c = stringBuffer3;
        this.f123513d = stringBuffer4;
        this.f123514e = stringBuffer5;
        this.f123515f = stringBuffer6;
        this.f123516g = stringBuffer7;
        this.f123517h = stringBuffer8;
        this.f123518i = stringBuffer9;
        this.f123519j = stringBuffer10;
        this.f123520k = stringBuffer11;
        this.f123521l = stringBuffer12;
        this.f123523n = new M((Map) null, 0, 0, 0, 0, 0, 63, (DefaultConstructorMarker) null);
        this.f123524o = new t.b().c(new C13286b()).d();
        this.f123525p = new float[16];
        this.f123526q = "";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ L(java.lang.StringBuffer r13, java.lang.StringBuffer r14, java.lang.StringBuffer r15, java.lang.StringBuffer r16, java.lang.StringBuffer r17, java.lang.StringBuffer r18, java.lang.StringBuffer r19, java.lang.StringBuffer r20, java.lang.StringBuffer r21, java.lang.StringBuffer r22, java.lang.StringBuffer r23, java.lang.StringBuffer r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r12 = this;
            r0 = r25
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000c
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            goto L_0x000d
        L_0x000c:
            r1 = r13
        L_0x000d:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0017
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            goto L_0x0018
        L_0x0017:
            r2 = r14
        L_0x0018:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0022
            java.lang.StringBuffer r3 = new java.lang.StringBuffer
            r3.<init>()
            goto L_0x0023
        L_0x0022:
            r3 = r15
        L_0x0023:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x002d
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            r4.<init>()
            goto L_0x002f
        L_0x002d:
            r4 = r16
        L_0x002f:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0039
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            goto L_0x003b
        L_0x0039:
            r5 = r17
        L_0x003b:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0045
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            r6.<init>()
            goto L_0x0047
        L_0x0045:
            r6 = r18
        L_0x0047:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0051
            java.lang.StringBuffer r7 = new java.lang.StringBuffer
            r7.<init>()
            goto L_0x0053
        L_0x0051:
            r7 = r19
        L_0x0053:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x005d
            java.lang.StringBuffer r8 = new java.lang.StringBuffer
            r8.<init>()
            goto L_0x005f
        L_0x005d:
            r8 = r20
        L_0x005f:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0069
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>()
            goto L_0x006b
        L_0x0069:
            r9 = r21
        L_0x006b:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0075
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            goto L_0x0077
        L_0x0075:
            r10 = r22
        L_0x0077:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0081
            java.lang.StringBuffer r11 = new java.lang.StringBuffer
            r11.<init>()
            goto L_0x0083
        L_0x0081:
            r11 = r23
        L_0x0083:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x008d
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            goto L_0x008f
        L_0x008d:
            r0 = r24
        L_0x008f:
            r13 = r12
            r14 = r1
            r15 = r2
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.L.<init>(java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, java.lang.StringBuffer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
