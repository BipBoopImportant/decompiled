package fF;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import com.google.ar.core.Plane;
import com.google.ar.core.Pose;
import com.google.ar.core.TrackingState;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: fF.b  reason: case insensitive filesystem */
public class C14450b {

    /* renamed from: t  reason: collision with root package name */
    private static final String f126891t = "b";

    /* renamed from: u  reason: collision with root package name */
    private static final float f126892u = ((float) (1.0d / Math.sqrt(3.0d)));

    /* renamed from: v  reason: collision with root package name */
    private static final float[] f126893v = {0.2f, 0.4f, 2.0f, 1.5f};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f126894a = new int[1];

    /* renamed from: b  reason: collision with root package name */
    private final float[] f126895b = new float[16];

    /* renamed from: c  reason: collision with root package name */
    private final float[] f126896c = new float[16];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f126897d = new float[16];

    /* renamed from: e  reason: collision with root package name */
    private final float[] f126898e = {1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: f  reason: collision with root package name */
    private final float[] f126899f = new float[4];

    /* renamed from: g  reason: collision with root package name */
    private final Map<Plane, Integer> f126900g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private int f126901h;

    /* renamed from: i  reason: collision with root package name */
    private int f126902i;

    /* renamed from: j  reason: collision with root package name */
    private int f126903j;

    /* renamed from: k  reason: collision with root package name */
    private int f126904k;

    /* renamed from: l  reason: collision with root package name */
    private int f126905l;

    /* renamed from: m  reason: collision with root package name */
    private int f126906m;

    /* renamed from: n  reason: collision with root package name */
    private int f126907n;

    /* renamed from: o  reason: collision with root package name */
    private int f126908o;

    /* renamed from: p  reason: collision with root package name */
    private int f126909p;

    /* renamed from: q  reason: collision with root package name */
    private int f126910q;

    /* renamed from: r  reason: collision with root package name */
    private FloatBuffer f126911r = ByteBuffer.allocateDirect(1536).order(ByteOrder.nativeOrder()).asFloatBuffer();

    /* renamed from: s  reason: collision with root package name */
    private ShortBuffer f126912s = ByteBuffer.allocateDirect(1152).order(ByteOrder.nativeOrder()).asShortBuffer();

    /* renamed from: fF.b$a */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        final float f126913a;

        /* renamed from: b  reason: collision with root package name */
        final Plane f126914b;

        a(float f10, Plane plane) {
            this.f126913a = f10;
            this.f126914b = plane;
        }
    }

    public static float b(Pose pose, Pose pose2) {
        float[] fArr = new float[3];
        float tx2 = pose2.tx();
        float ty2 = pose2.ty();
        float tz2 = pose2.tz();
        pose.getTransformedAxis(1, 1.0f, fArr, 0);
        return ((tx2 - pose.tx()) * fArr[0]) + ((ty2 - pose.ty()) * fArr[1]) + ((tz2 - pose.tz()) * fArr[2]);
    }

    private void d(float[] fArr, float[] fArr2, float[] fArr3) {
        Matrix.multiplyMM(this.f126896c, 0, fArr, 0, this.f126895b, 0);
        Matrix.multiplyMM(this.f126897d, 0, fArr2, 0, this.f126896c, 0);
        this.f126911r.rewind();
        GLES20.glVertexAttribPointer(this.f126902i, 3, 5126, false, 12, this.f126911r);
        GLES20.glUniformMatrix4fv(this.f126903j, 1, false, this.f126895b, 0);
        GLES20.glUniform3f(this.f126904k, fArr3[0], fArr3[1], fArr3[2]);
        GLES20.glUniformMatrix4fv(this.f126905l, 1, false, this.f126897d, 0);
        this.f126912s.rewind();
        GLES20.glDrawElements(5, this.f126912s.limit(), 5123, this.f126912s);
        C14452d.a(f126891t, "Drawing plane");
    }

    private void g(float[] fArr, float f10, float f11, FloatBuffer floatBuffer) {
        int i10;
        System.arraycopy(fArr, 0, this.f126895b, 0, 16);
        if (floatBuffer == null) {
            this.f126911r.limit(0);
            this.f126912s.limit(0);
            return;
        }
        floatBuffer.rewind();
        int limit = floatBuffer.limit() / 2;
        int i11 = limit * 3;
        int i12 = limit * 6;
        if (this.f126911r.capacity() < i12) {
            int capacity = this.f126911r.capacity();
            while (capacity < i12) {
                capacity *= 2;
            }
            this.f126911r = ByteBuffer.allocateDirect(capacity * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        this.f126911r.rewind();
        this.f126911r.limit(i12);
        if (this.f126912s.capacity() < i11) {
            int capacity2 = this.f126912s.capacity();
            while (capacity2 < i11) {
                capacity2 *= 2;
            }
            this.f126912s = ByteBuffer.allocateDirect(capacity2 * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        }
        this.f126912s.rewind();
        this.f126912s.limit(i11);
        float max = Math.max((f10 - 0.5f) / f10, 0.0f);
        float max2 = Math.max((f11 - 0.5f) / f11, 0.0f);
        while (floatBuffer.hasRemaining()) {
            float f12 = floatBuffer.get();
            float f13 = floatBuffer.get();
            this.f126911r.put(f12);
            this.f126911r.put(f13);
            this.f126911r.put(0.0f);
            this.f126911r.put(f12 * max);
            this.f126911r.put(f13 * max2);
            this.f126911r.put(1.0f);
        }
        int i13 = limit - 1;
        this.f126912s.put((short) (i13 * 2));
        for (int i14 = 0; i14 < limit; i14++) {
            int i15 = i14 * 2;
            this.f126912s.put((short) i15);
            this.f126912s.put((short) (i15 + 1));
        }
        this.f126912s.put(1);
        int i16 = 1;
        while (true) {
            i10 = limit / 2;
            if (i16 >= i10) {
                break;
            }
            this.f126912s.put((short) (((i13 - i16) * 2) + 1));
            this.f126912s.put((short) ((i16 * 2) + 1));
            i16++;
        }
        if (limit % 2 != 0) {
            this.f126912s.put((short) ((i10 * 2) + 1));
        }
    }

    public void c(Context context, String str) {
        String str2 = f126891t;
        int b10 = C14452d.b(str2, context, 35633, "shaders/plane.vert");
        int b11 = C14452d.b(str2, context, 35632, "shaders/plane.frag");
        int glCreateProgram = GLES20.glCreateProgram();
        this.f126901h = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, b10);
        GLES20.glAttachShader(this.f126901h, b11);
        GLES20.glLinkProgram(this.f126901h);
        GLES20.glUseProgram(this.f126901h);
        C14452d.a(str2, "Program creation");
        Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(str));
        GLES20.glActiveTexture(33984);
        int[] iArr = this.f126894a;
        GLES20.glGenTextures(iArr.length, iArr, 0);
        GLES20.glBindTexture(3553, this.f126894a[0]);
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLUtils.texImage2D(3553, 0, decodeStream, 0);
        GLES20.glGenerateMipmap(3553);
        GLES20.glBindTexture(3553, 0);
        C14452d.a(str2, "Texture loading");
        this.f126902i = GLES20.glGetAttribLocation(this.f126901h, "a_XZPositionAlpha");
        this.f126903j = GLES20.glGetUniformLocation(this.f126901h, "u_Model");
        this.f126904k = GLES20.glGetUniformLocation(this.f126901h, "u_Normal");
        this.f126905l = GLES20.glGetUniformLocation(this.f126901h, "u_ModelViewProjection");
        this.f126906m = GLES20.glGetUniformLocation(this.f126901h, "u_Texture");
        this.f126907n = GLES20.glGetUniformLocation(this.f126901h, "u_lineColor");
        this.f126908o = GLES20.glGetUniformLocation(this.f126901h, "u_dotColor");
        this.f126909p = GLES20.glGetUniformLocation(this.f126901h, "u_gridControl");
        this.f126910q = GLES20.glGetUniformLocation(this.f126901h, "u_PlaneUvMatrix");
        C14452d.a(str2, "Program parameters");
    }

    public void e(Collection<Plane> collection, Pose pose, float[] fArr) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (Plane next : collection) {
            next.getCenterPose();
            if (next.getTrackingState() != TrackingState.TRACKING) {
                Pose pose2 = pose;
            } else if (next.getSubsumedBy() == null) {
                float b10 = b(next.getCenterPose(), pose);
                if (b10 >= 0.0f) {
                    arrayList.add(new a(b10, next));
                }
            }
        }
        Pose pose3 = pose;
        arrayList.sort(new C14449a());
        int i10 = 16;
        float[] fArr2 = new float[16];
        int i11 = 0;
        pose.inverse().toMatrix(fArr2, 0);
        float f10 = 1.0f;
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 1.0f);
        GLES20.glColorMask(false, false, false, true);
        GLES20.glClear(16384);
        GLES20.glColorMask(true, true, true, true);
        GLES20.glDepthMask(false);
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(772, 1, 0, 771);
        GLES20.glUseProgram(this.f126901h);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f126894a[0]);
        GLES20.glUniform1i(this.f126906m, 0);
        GLES20.glUniform4fv(this.f126909p, 1, f126893v, 0);
        GLES20.glEnableVertexAttribArray(this.f126902i);
        C14452d.a(f126891t, "Setting up to draw planes");
        for (a aVar : arrayList) {
            Plane plane = aVar.f126914b;
            float[] fArr3 = new float[i10];
            plane.getCenterPose().toMatrix(fArr3, i11);
            float[] fArr4 = new float[3];
            plane.getCenterPose().getTransformedAxis(1, f10, fArr4, i11);
            g(fArr3, plane.getExtentX(), plane.getExtentZ(), plane.getPolygon());
            Integer num = this.f126900g.get(plane);
            if (num == null) {
                num = Integer.valueOf(this.f126900g.size());
                this.f126900g.put(plane, num);
            }
            GLES20.glUniform4fv(this.f126907n, 1, this.f126898e, i11);
            GLES20.glUniform4fv(this.f126908o, 1, this.f126898e, i11);
            float f11 = f126892u * 10.0f;
            double intValue = (double) (((float) num.intValue()) * 0.144f);
            this.f126899f[i11] = ((float) Math.cos(intValue)) * 10.0f;
            this.f126899f[1] = (-((float) Math.sin(intValue))) * f11;
            this.f126899f[2] = ((float) Math.sin(intValue)) * 10.0f;
            this.f126899f[3] = ((float) Math.cos(intValue)) * f11;
            i11 = 0;
            GLES20.glUniformMatrix2fv(this.f126910q, 1, false, this.f126899f, 0);
            float[] fArr5 = fArr2;
            d(fArr5, fArr, fArr4);
            fArr2 = fArr5;
            i10 = 16;
            f10 = 1.0f;
        }
        GLES20.glDisableVertexAttribArray(this.f126902i);
        GLES20.glBindTexture(3553, i11);
        GLES20.glDisable(3042);
        GLES20.glDepthMask(true);
        GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
        C14452d.a(f126891t, "Cleaning up after drawing planes");
    }
}
