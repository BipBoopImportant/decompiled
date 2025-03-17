package fF;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.google.ar.core.PointCloud;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* renamed from: fF.c  reason: case insensitive filesystem */
public class C14451c {

    /* renamed from: j  reason: collision with root package name */
    private static final String f126915j = PointCloud.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    private int f126916a;

    /* renamed from: b  reason: collision with root package name */
    private int f126917b;

    /* renamed from: c  reason: collision with root package name */
    private int f126918c;

    /* renamed from: d  reason: collision with root package name */
    private int f126919d;

    /* renamed from: e  reason: collision with root package name */
    private int f126920e;

    /* renamed from: f  reason: collision with root package name */
    private int f126921f;

    /* renamed from: g  reason: collision with root package name */
    private int f126922g;

    /* renamed from: h  reason: collision with root package name */
    private int f126923h = 0;

    /* renamed from: i  reason: collision with root package name */
    private long f126924i = 0;

    public void a(Context context) {
        String str = f126915j;
        C14452d.a(str, "before create");
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        int i10 = iArr[0];
        this.f126916a = i10;
        GLES20.glBindBuffer(34962, i10);
        this.f126917b = 16000;
        GLES20.glBufferData(34962, 16000, (Buffer) null, 35048);
        GLES20.glBindBuffer(34962, 0);
        C14452d.a(str, "buffer alloc");
        int b10 = C14452d.b(str, context, 35633, "shaders/point_cloud.vert");
        int b11 = C14452d.b(str, context, 35632, "shaders/point_cloud.frag");
        int glCreateProgram = GLES20.glCreateProgram();
        this.f126918c = glCreateProgram;
        GLES20.glAttachShader(glCreateProgram, b10);
        GLES20.glAttachShader(this.f126918c, b11);
        GLES20.glLinkProgram(this.f126918c);
        GLES20.glUseProgram(this.f126918c);
        C14452d.a(str, "program");
        this.f126919d = GLES20.glGetAttribLocation(this.f126918c, "a_Position");
        this.f126921f = GLES20.glGetUniformLocation(this.f126918c, "u_Color");
        this.f126920e = GLES20.glGetUniformLocation(this.f126918c, "u_ModelViewProjection");
        this.f126922g = GLES20.glGetUniformLocation(this.f126918c, "u_PointSize");
        C14452d.a(str, "program  params");
    }

    public void b(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        Matrix.multiplyMM(fArr3, 0, fArr2, 0, fArr, 0);
        String str = f126915j;
        C14452d.a(str, "Before draw");
        GLES20.glUseProgram(this.f126918c);
        GLES20.glEnableVertexAttribArray(this.f126919d);
        GLES20.glBindBuffer(34962, this.f126916a);
        GLES20.glVertexAttribPointer(this.f126919d, 4, 5126, false, 16, 0);
        GLES20.glUniform4f(this.f126921f, 0.12156863f, 0.7372549f, 0.8235294f, 1.0f);
        GLES20.glUniformMatrix4fv(this.f126920e, 1, false, fArr3, 0);
        GLES20.glUniform1f(this.f126922g, 5.0f);
        GLES20.glDrawArrays(0, 0, this.f126923h);
        GLES20.glDisableVertexAttribArray(this.f126919d);
        GLES20.glBindBuffer(34962, 0);
        C14452d.a(str, "Draw");
    }

    public int c(PointCloud pointCloud) {
        int i10;
        if (pointCloud.getTimestamp() == this.f126924i) {
            return this.f126923h;
        }
        C14452d.a(f126915j, "before update");
        GLES20.glBindBuffer(34962, this.f126916a);
        this.f126924i = pointCloud.getTimestamp();
        int remaining = pointCloud.getPoints().remaining() / 4;
        this.f126923h = remaining;
        if (remaining * 16 > this.f126917b) {
            while (true) {
                int i11 = this.f126923h * 16;
                i10 = this.f126917b;
                if (i11 <= i10) {
                    break;
                }
                this.f126917b = i10 * 2;
            }
            GLES20.glBufferData(34962, i10, (Buffer) null, 35048);
        }
        FloatBuffer points = pointCloud.getPoints();
        int i12 = 0;
        while (true) {
            int i13 = this.f126923h;
            if (i12 < i13) {
                int i14 = i12 * 4;
                points.get(i14);
                points.get(i14 + 1);
                points.get(i14 + 2);
                points.get(i14 + 3);
                i12++;
            } else {
                GLES20.glBufferSubData(34962, 0, i13 * 16, points);
                GLES20.glBindBuffer(34962, 0);
                C14452d.a(f126915j, "after update");
                return this.f126923h;
            }
        }
    }
}
