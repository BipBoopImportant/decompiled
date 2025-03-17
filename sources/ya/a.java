package ya;

import K9.C6620s;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.WindowManager;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public Context f58037a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f58038b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Camera f58039c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f58040d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f58041e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public J9.a f58042f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public float f58043g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f58044h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f58045i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public boolean f58046j;

    /* renamed from: k  reason: collision with root package name */
    private String f58047k;

    /* renamed from: l  reason: collision with root package name */
    private SurfaceTexture f58048l;

    /* renamed from: m  reason: collision with root package name */
    private Thread f58049m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public b f58050n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final IdentityHashMap<byte[], ByteBuffer> f58051o;

    /* renamed from: ya.a$a  reason: collision with other inner class name */
    public static class C0936a {

        /* renamed from: a  reason: collision with root package name */
        private final b<?> f58052a;

        /* renamed from: b  reason: collision with root package name */
        private a f58053b;

        public C0936a(@RecentlyNonNull Context context, @RecentlyNonNull b<?> bVar) {
            a aVar = new a();
            this.f58053b = aVar;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (bVar != null) {
                this.f58052a = bVar;
                Context unused = aVar.f58037a = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        @RecentlyNonNull
        public a a() {
            a aVar = this.f58053b;
            aVar.getClass();
            b unused = aVar.f58050n = new b(this.f58052a);
            return this.f58053b;
        }

        @RecentlyNonNull
        public C0936a b(boolean z10) {
            boolean unused = this.f58053b.f58046j = z10;
            return this;
        }

        @RecentlyNonNull
        public C0936a c(int i10) {
            if (i10 == 0 || i10 == 1) {
                int unused = this.f58053b.f58040d = i10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(27);
            sb2.append("Invalid camera: ");
            sb2.append(i10);
            throw new IllegalArgumentException(sb2.toString());
        }

        @RecentlyNonNull
        public C0936a d(float f10) {
            if (f10 > 0.0f) {
                float unused = this.f58053b.f58043g = f10;
                return this;
            }
            StringBuilder sb2 = new StringBuilder(28);
            sb2.append("Invalid fps: ");
            sb2.append(f10);
            throw new IllegalArgumentException(sb2.toString());
        }

        @RecentlyNonNull
        public C0936a e(int i10, int i11) {
            if (i10 <= 0 || i10 > 1000000 || i11 <= 0 || i11 > 1000000) {
                StringBuilder sb2 = new StringBuilder(45);
                sb2.append("Invalid preview size: ");
                sb2.append(i10);
                sb2.append("x");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            int unused = this.f58053b.f58044h = i10;
            int unused2 = this.f58053b.f58045i = i11;
            return this;
        }
    }

    private class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private b<?> f58054a;

        /* renamed from: b  reason: collision with root package name */
        private long f58055b = SystemClock.elapsedRealtime();

        /* renamed from: c  reason: collision with root package name */
        private final Object f58056c = new Object();

        /* renamed from: d  reason: collision with root package name */
        private boolean f58057d = true;

        /* renamed from: e  reason: collision with root package name */
        private long f58058e;

        /* renamed from: f  reason: collision with root package name */
        private int f58059f = 0;

        /* renamed from: g  reason: collision with root package name */
        private ByteBuffer f58060g;

        b(b<?> bVar) {
            this.f58054a = bVar;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"Assert"})
        public final void a() {
            b<?> bVar = this.f58054a;
            if (bVar != null) {
                bVar.d();
                this.f58054a = null;
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(boolean z10) {
            synchronized (this.f58056c) {
                this.f58057d = z10;
                this.f58056c.notifyAll();
            }
        }

        /* access modifiers changed from: package-private */
        public final void c(byte[] bArr, Camera camera) {
            synchronized (this.f58056c) {
                try {
                    ByteBuffer byteBuffer = this.f58060g;
                    if (byteBuffer != null) {
                        camera.addCallbackBuffer(byteBuffer.array());
                        this.f58060g = null;
                    }
                    if (!a.this.f58051o.containsKey(bArr)) {
                        Log.d("CameraSource", "Skipping frame. Could not find ByteBuffer associated with the image data from the camera.");
                        return;
                    }
                    this.f58058e = SystemClock.elapsedRealtime() - this.f58055b;
                    this.f58059f++;
                    this.f58060g = (ByteBuffer) a.this.f58051o.get(bArr);
                    this.f58056c.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            ((ya.b) K9.C6620s.l(r6.f58054a)).c(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0091, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
            android.util.Log.e("CameraSource", "Exception thrown from receiver.", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b4, code lost:
            ((android.hardware.Camera) K9.C6620s.l(ya.a.m(r6.f58061h))).addCallbackBuffer(((java.nio.ByteBuffer) K9.C6620s.l(r2)).array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
            throw r0;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0022 A[Catch:{ InterruptedException -> 0x0014 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x0020 A[SYNTHETIC] */
        @android.annotation.SuppressLint({"InlinedApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r6 = this;
            L_0x0000:
                java.lang.Object r0 = r6.f58056c
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r6.f58057d     // Catch:{ all -> 0x0011 }
                if (r1 == 0) goto L_0x001e
                java.nio.ByteBuffer r2 = r6.f58060g     // Catch:{ all -> 0x0011 }
                if (r2 != 0) goto L_0x001e
                java.lang.Object r1 = r6.f58056c     // Catch:{ InterruptedException -> 0x0014 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0014 }
                goto L_0x0003
            L_0x0011:
                r1 = move-exception
                goto L_0x00ce
            L_0x0014:
                r1 = move-exception
                java.lang.String r2 = "CameraSource"
                java.lang.String r3 = "Frame processing loop terminated."
                android.util.Log.d(r2, r3, r1)     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x001e:
                if (r1 != 0) goto L_0x0022
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x0022:
                ya.c$a r1 = new ya.c$a     // Catch:{ all -> 0x0011 }
                r1.<init>()     // Catch:{ all -> 0x0011 }
                java.nio.ByteBuffer r2 = r6.f58060g     // Catch:{ all -> 0x0011 }
                java.lang.Object r2 = K9.C6620s.l(r2)     // Catch:{ all -> 0x0011 }
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2     // Catch:{ all -> 0x0011 }
                ya.a r3 = ya.a.this     // Catch:{ all -> 0x0011 }
                J9.a r3 = r3.f58042f     // Catch:{ all -> 0x0011 }
                int r3 = r3.b()     // Catch:{ all -> 0x0011 }
                ya.a r4 = ya.a.this     // Catch:{ all -> 0x0011 }
                J9.a r4 = r4.f58042f     // Catch:{ all -> 0x0011 }
                int r4 = r4.a()     // Catch:{ all -> 0x0011 }
                r5 = 17
                ya.c$a r1 = r1.c(r2, r3, r4, r5)     // Catch:{ all -> 0x0011 }
                int r2 = r6.f58059f     // Catch:{ all -> 0x0011 }
                ya.c$a r1 = r1.b(r2)     // Catch:{ all -> 0x0011 }
                long r2 = r6.f58058e     // Catch:{ all -> 0x0011 }
                ya.c$a r1 = r1.e(r2)     // Catch:{ all -> 0x0011 }
                ya.a r2 = ya.a.this     // Catch:{ all -> 0x0011 }
                int r2 = r2.f58041e     // Catch:{ all -> 0x0011 }
                ya.c$a r1 = r1.d(r2)     // Catch:{ all -> 0x0011 }
                ya.c r1 = r1.a()     // Catch:{ all -> 0x0011 }
                java.nio.ByteBuffer r2 = r6.f58060g     // Catch:{ all -> 0x0011 }
                r3 = 0
                r6.f58060g = r3     // Catch:{ all -> 0x0011 }
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                ya.b<?> r0 = r6.f58054a     // Catch:{ Exception -> 0x0091 }
                java.lang.Object r0 = K9.C6620s.l(r0)     // Catch:{ Exception -> 0x0091 }
                ya.b r0 = (ya.b) r0     // Catch:{ Exception -> 0x0091 }
                r0.c(r1)     // Catch:{ Exception -> 0x0091 }
                ya.a r0 = ya.a.this
                android.hardware.Camera r0 = r0.f58039c
                java.lang.Object r0 = K9.C6620s.l(r0)
                android.hardware.Camera r0 = (android.hardware.Camera) r0
                java.lang.Object r1 = K9.C6620s.l(r2)
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                byte[] r1 = r1.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x008f:
                r0 = move-exception
                goto L_0x00b4
            L_0x0091:
                r0 = move-exception
                java.lang.String r1 = "CameraSource"
                java.lang.String r3 = "Exception thrown from receiver."
                android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x008f }
                ya.a r0 = ya.a.this
                android.hardware.Camera r0 = r0.f58039c
                java.lang.Object r0 = K9.C6620s.l(r0)
                android.hardware.Camera r0 = (android.hardware.Camera) r0
                java.lang.Object r1 = K9.C6620s.l(r2)
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                byte[] r1 = r1.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x00b4:
                ya.a r1 = ya.a.this
                android.hardware.Camera r1 = r1.f58039c
                java.lang.Object r1 = K9.C6620s.l(r1)
                android.hardware.Camera r1 = (android.hardware.Camera) r1
                java.lang.Object r2 = K9.C6620s.l(r2)
                java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
                byte[] r2 = r2.array()
                r1.addCallbackBuffer(r2)
                throw r0
            L_0x00ce:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ya.a.b.run():void");
        }
    }

    private class c implements Camera.PreviewCallback {
        private c() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            a.this.f58050n.c(bArr, camera);
        }
    }

    @VisibleForTesting
    static class d {

        /* renamed from: a  reason: collision with root package name */
        private J9.a f58063a;

        /* renamed from: b  reason: collision with root package name */
        private J9.a f58064b;

        public d(Camera.Size size, Camera.Size size2) {
            this.f58063a = new J9.a(size.width, size.height);
            if (size2 != null) {
                this.f58064b = new J9.a(size2.width, size2.height);
            }
        }

        public final J9.a a() {
            return this.f58063a;
        }

        public final J9.a b() {
            return this.f58064b;
        }
    }

    private a() {
        this.f58038b = new Object();
        this.f58040d = 0;
        this.f58043g = 30.0f;
        this.f58044h = 1024;
        this.f58045i = 768;
        this.f58046j = false;
        this.f58051o = new IdentityHashMap<>();
    }

    @SuppressLint({"InlinedApi"})
    private final Camera h() {
        int i10;
        int i11;
        int i12 = this.f58040d;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i14 >= Camera.getNumberOfCameras()) {
                i14 = -1;
                break;
            }
            Camera.getCameraInfo(i14, cameraInfo);
            if (cameraInfo.facing == i12) {
                break;
            }
            i14++;
        }
        if (i14 != -1) {
            Camera open = Camera.open(i14);
            int i15 = this.f58044h;
            int i16 = this.f58045i;
            Camera.Parameters parameters = open.getParameters();
            List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
            List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Camera.Size next : supportedPreviewSizes) {
                float f10 = ((float) next.width) / ((float) next.height);
                Iterator<Camera.Size> it = supportedPictureSizes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Camera.Size next2 = it.next();
                    if (Math.abs(f10 - (((float) next2.width) / ((float) next2.height))) < 0.01f) {
                        arrayList.add(new d(next, next2));
                        break;
                    }
                }
            }
            if (arrayList.size() == 0) {
                Log.w("CameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
                for (Camera.Size dVar : supportedPreviewSizes) {
                    arrayList.add(new d(dVar, (Camera.Size) null));
                }
            }
            int size = arrayList.size();
            int i17 = Integer.MAX_VALUE;
            int i18 = 0;
            int i19 = Integer.MAX_VALUE;
            d dVar2 = null;
            while (i18 < size) {
                Object obj = arrayList.get(i18);
                i18++;
                d dVar3 = (d) obj;
                J9.a a10 = dVar3.a();
                int abs = Math.abs(a10.b() - i15) + Math.abs(a10.a() - i16);
                if (abs < i19) {
                    dVar2 = dVar3;
                    i19 = abs;
                }
            }
            d dVar4 = (d) C6620s.l(dVar2);
            if (dVar4 != null) {
                J9.a b10 = dVar4.b();
                this.f58042f = dVar4.a();
                int i20 = (int) (this.f58043g * 1000.0f);
                int[] iArr = null;
                for (int[] next3 : open.getParameters().getSupportedPreviewFpsRange()) {
                    int abs2 = Math.abs(i20 - next3[0]) + Math.abs(i20 - next3[1]);
                    if (abs2 < i17) {
                        iArr = next3;
                        i17 = abs2;
                    }
                }
                int[] iArr2 = (int[]) C6620s.l(iArr);
                if (iArr2 != null) {
                    Camera.Parameters parameters2 = open.getParameters();
                    if (b10 != null) {
                        parameters2.setPictureSize(b10.b(), b10.a());
                    }
                    parameters2.setPreviewSize(this.f58042f.b(), this.f58042f.a());
                    parameters2.setPreviewFpsRange(iArr2[0], iArr2[1]);
                    parameters2.setPreviewFormat(17);
                    int rotation = ((WindowManager) C6620s.l((WindowManager) this.f58037a.getSystemService("window"))).getDefaultDisplay().getRotation();
                    if (rotation != 0) {
                        if (rotation == 1) {
                            i13 = 90;
                        } else if (rotation == 2) {
                            i13 = 180;
                        } else if (rotation != 3) {
                            StringBuilder sb2 = new StringBuilder(31);
                            sb2.append("Bad rotation value: ");
                            sb2.append(rotation);
                            Log.e("CameraSource", sb2.toString());
                        } else {
                            i13 = 270;
                        }
                    }
                    Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
                    Camera.getCameraInfo(i14, cameraInfo2);
                    if (cameraInfo2.facing == 1) {
                        i11 = (cameraInfo2.orientation + i13) % 360;
                        i10 = (360 - i11) % 360;
                    } else {
                        i11 = ((cameraInfo2.orientation - i13) + 360) % 360;
                        i10 = i11;
                    }
                    this.f58041e = i11 / 90;
                    open.setDisplayOrientation(i10);
                    parameters2.setRotation(i11);
                    if (this.f58047k != null) {
                        if (parameters2.getSupportedFocusModes().contains(this.f58047k)) {
                            parameters2.setFocusMode((String) C6620s.l(this.f58047k));
                        } else {
                            Log.w("CameraSource", String.format("FocusMode %s is not supported on this device.", new Object[]{this.f58047k}));
                            this.f58047k = null;
                        }
                    }
                    if (this.f58047k == null && this.f58046j) {
                        if (parameters2.getSupportedFocusModes().contains("continuous-video")) {
                            parameters2.setFocusMode("continuous-video");
                            this.f58047k = "continuous-video";
                        } else {
                            Log.i("CameraSource", "Camera auto focus is not supported on this device.");
                        }
                    }
                    open.setParameters(parameters2);
                    open.setPreviewCallbackWithBuffer(new c());
                    open.addCallbackBuffer(k(this.f58042f));
                    open.addCallbackBuffer(k(this.f58042f));
                    open.addCallbackBuffer(k(this.f58042f));
                    open.addCallbackBuffer(k(this.f58042f));
                    return open;
                }
                throw new IOException("Could not find suitable preview frames per second range.");
            }
            throw new IOException("Could not find suitable preview size.");
        }
        throw new IOException("Could not find requested camera.");
    }

    @SuppressLint({"InlinedApi"})
    private final byte[] k(J9.a aVar) {
        byte[] bArr = new byte[(((int) Math.ceil(((double) ((((long) aVar.a()) * ((long) aVar.b())) * ((long) ImageFormat.getBitsPerPixel(17)))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.f58051o.put(bArr, wrap);
        return bArr;
    }

    @RecentlyNonNull
    public J9.a a() {
        return this.f58042f;
    }

    public void b() {
        synchronized (this.f58038b) {
            d();
            this.f58050n.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        return r2;
     */
    @androidx.annotation.RecentlyNonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ya.a c(@androidx.annotation.RecentlyNonNull android.view.SurfaceHolder r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f58038b
            monitor-enter(r0)
            android.hardware.Camera r1 = r2.f58039c     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return r2
        L_0x0009:
            r3 = move-exception
            goto L_0x0031
        L_0x000b:
            android.hardware.Camera r1 = r2.h()     // Catch:{ all -> 0x0009 }
            r2.f58039c = r1     // Catch:{ all -> 0x0009 }
            r1.setPreviewDisplay(r3)     // Catch:{ all -> 0x0009 }
            android.hardware.Camera r3 = r2.f58039c     // Catch:{ all -> 0x0009 }
            r3.startPreview()     // Catch:{ all -> 0x0009 }
            java.lang.Thread r3 = new java.lang.Thread     // Catch:{ all -> 0x0009 }
            ya.a$b r1 = r2.f58050n     // Catch:{ all -> 0x0009 }
            r3.<init>(r1)     // Catch:{ all -> 0x0009 }
            r2.f58049m = r3     // Catch:{ all -> 0x0009 }
            ya.a$b r3 = r2.f58050n     // Catch:{ all -> 0x0009 }
            r1 = 1
            r3.b(r1)     // Catch:{ all -> 0x0009 }
            java.lang.Thread r3 = r2.f58049m     // Catch:{ all -> 0x0009 }
            if (r3 == 0) goto L_0x002f
            r3.start()     // Catch:{ all -> 0x0009 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return r2
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ya.a.c(android.view.SurfaceHolder):ya.a");
    }

    public void d() {
        synchronized (this.f58038b) {
            this.f58050n.b(false);
            Thread thread = this.f58049m;
            if (thread != null) {
                try {
                    thread.join();
                } catch (InterruptedException unused) {
                    Log.d("CameraSource", "Frame processing thread interrupted on release.");
                }
                this.f58049m = null;
            }
            Camera camera = this.f58039c;
            if (camera != null) {
                camera.stopPreview();
                this.f58039c.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                try {
                    this.f58039c.setPreviewTexture((SurfaceTexture) null);
                    this.f58048l = null;
                    this.f58039c.setPreviewDisplay((SurfaceHolder) null);
                } catch (Exception e10) {
                    String valueOf = String.valueOf(e10);
                    StringBuilder sb2 = new StringBuilder(valueOf.length() + 32);
                    sb2.append("Failed to clear camera preview: ");
                    sb2.append(valueOf);
                    Log.e("CameraSource", sb2.toString());
                }
                ((Camera) C6620s.l(this.f58039c)).release();
                this.f58039c = null;
            }
            this.f58051o.clear();
        }
    }
}
