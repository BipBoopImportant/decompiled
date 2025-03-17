package fF;

import android.content.Context;
import android.opengl.GLES20;
import android.util.Log;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: fF.d  reason: case insensitive filesystem */
public class C14452d {
    public static void a(String str, String str2) {
        int i10 = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            Log.e(str, str2 + ": glError " + glGetError);
            i10 = glGetError;
        }
        if (i10 != 0) {
            throw new RuntimeException(str2 + ": glError " + i10);
        }
    }

    public static int b(String str, Context context, int i10, String str2) {
        return c(str, context, i10, str2, new TreeMap());
    }

    public static int c(String str, Context context, int i10, String str2, Map<String, Integer> map) {
        String d10 = d(context, str2);
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry next : map.entrySet()) {
            sb2.append("#define ");
            sb2.append((String) next.getKey());
            sb2.append(" ");
            sb2.append(next.getValue());
            sb2.append("\n");
        }
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, sb2 + d10);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            Log.e(str, "Error compiling shader: " + GLES20.glGetShaderInfoLog(glCreateShader));
            GLES20.glDeleteShader(glCreateShader);
            glCreateShader = 0;
        }
        if (glCreateShader != 0) {
            return glCreateShader;
        }
        throw new RuntimeException("Error creating shader.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r7 = r2.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r0 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0064, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        return r7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String d(android.content.Context r7, java.lang.String r8) {
        /*
            android.content.res.AssetManager r0 = r7.getAssets()
            java.io.InputStream r0 = r0.open(r8)
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0068 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ all -> 0x0068 }
            r2.<init>(r0)     // Catch:{ all -> 0x0068 }
            r1.<init>(r2)     // Catch:{ all -> 0x0068 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0048 }
            r2.<init>()     // Catch:{ all -> 0x0048 }
        L_0x0017:
            java.lang.String r3 = r1.readLine()     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x005b
            java.lang.String r4 = " "
            r5 = -1
            java.lang.String[] r4 = r3.split(r4, r5)     // Catch:{ all -> 0x0048 }
            r5 = 0
            r5 = r4[r5]     // Catch:{ all -> 0x0048 }
            java.lang.String r6 = "#include"
            boolean r5 = r5.equals(r6)     // Catch:{ all -> 0x0048 }
            if (r5 == 0) goto L_0x0052
            r3 = 1
            r3 = r4[r3]     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = "\""
            java.lang.String r5 = ""
            java.lang.String r3 = r3.replace(r4, r5)     // Catch:{ all -> 0x0048 }
            boolean r4 = r3.equals(r8)     // Catch:{ all -> 0x0048 }
            if (r4 != 0) goto L_0x004a
            java.lang.String r3 = d(r7, r3)     // Catch:{ all -> 0x0048 }
            r2.append(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0017
        L_0x0048:
            r7 = move-exception
            goto L_0x006a
        L_0x004a:
            java.io.IOException r7 = new java.io.IOException     // Catch:{ all -> 0x0048 }
            java.lang.String r8 = "Do not include the calling file."
            r7.<init>(r8)     // Catch:{ all -> 0x0048 }
            throw r7     // Catch:{ all -> 0x0048 }
        L_0x0052:
            r2.append(r3)     // Catch:{ all -> 0x0048 }
            java.lang.String r3 = "\n"
            r2.append(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x0017
        L_0x005b:
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0048 }
            r1.close()     // Catch:{ all -> 0x0068 }
            if (r0 == 0) goto L_0x0067
            r0.close()
        L_0x0067:
            return r7
        L_0x0068:
            r7 = move-exception
            goto L_0x0073
        L_0x006a:
            r1.close()     // Catch:{ all -> 0x006e }
            goto L_0x0072
        L_0x006e:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch:{ all -> 0x0068 }
        L_0x0072:
            throw r7     // Catch:{ all -> 0x0068 }
        L_0x0073:
            if (r0 == 0) goto L_0x007d
            r0.close()     // Catch:{ all -> 0x0079 }
            goto L_0x007d
        L_0x0079:
            r8 = move-exception
            r7.addSuppressed(r8)
        L_0x007d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fF.C14452d.d(android.content.Context, java.lang.String):java.lang.String");
    }
}
