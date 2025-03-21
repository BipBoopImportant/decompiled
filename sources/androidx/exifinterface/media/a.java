package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.location.Location;
import android.media.MediaDataSource;
import android.system.OsConstants;
import android.util.Log;
import androidx.exifinterface.media.b;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

public class a {

    /* renamed from: A  reason: collision with root package name */
    public static final int[] f21638A = {8};

    /* renamed from: B  reason: collision with root package name */
    static final byte[] f21639B = {-1, -40, -1};

    /* renamed from: C  reason: collision with root package name */
    private static final byte[] f21640C = {102, 116, 121, 112};

    /* renamed from: D  reason: collision with root package name */
    private static final byte[] f21641D = {109, 105, 102, 49};

    /* renamed from: E  reason: collision with root package name */
    private static final byte[] f21642E = {104, 101, 105, 99};

    /* renamed from: F  reason: collision with root package name */
    private static final byte[] f21643F = {79, 76, 89, 77, 80, 0};

    /* renamed from: G  reason: collision with root package name */
    private static final byte[] f21644G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};

    /* renamed from: H  reason: collision with root package name */
    private static final byte[] f21645H = {-119, 80, 78, 71, 13, 10, 26, 10};

    /* renamed from: I  reason: collision with root package name */
    private static final byte[] f21646I = {101, 88, 73, 102};

    /* renamed from: J  reason: collision with root package name */
    private static final byte[] f21647J = {73, 72, 68, 82};

    /* renamed from: K  reason: collision with root package name */
    private static final byte[] f21648K = {73, 69, 78, 68};

    /* renamed from: L  reason: collision with root package name */
    private static final byte[] f21649L = {82, 73, 70, 70};

    /* renamed from: M  reason: collision with root package name */
    private static final byte[] f21650M = {87, 69, 66, 80};

    /* renamed from: N  reason: collision with root package name */
    private static final byte[] f21651N = {69, 88, 73, 70};

    /* renamed from: O  reason: collision with root package name */
    private static final byte[] f21652O = {-99, 1, 42};

    /* renamed from: P  reason: collision with root package name */
    private static final byte[] f21653P = "VP8X".getBytes(Charset.defaultCharset());

    /* renamed from: Q  reason: collision with root package name */
    private static final byte[] f21654Q = "VP8L".getBytes(Charset.defaultCharset());

    /* renamed from: R  reason: collision with root package name */
    private static final byte[] f21655R = "VP8 ".getBytes(Charset.defaultCharset());

    /* renamed from: S  reason: collision with root package name */
    private static final byte[] f21656S = "ANIM".getBytes(Charset.defaultCharset());

    /* renamed from: T  reason: collision with root package name */
    private static final byte[] f21657T = "ANMF".getBytes(Charset.defaultCharset());

    /* renamed from: U  reason: collision with root package name */
    private static SimpleDateFormat f21658U;

    /* renamed from: V  reason: collision with root package name */
    private static SimpleDateFormat f21659V;

    /* renamed from: W  reason: collision with root package name */
    static final String[] f21660W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};

    /* renamed from: X  reason: collision with root package name */
    static final int[] f21661X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};

    /* renamed from: Y  reason: collision with root package name */
    static final byte[] f21662Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* renamed from: Z  reason: collision with root package name */
    private static final e[] f21663Z;

    /* renamed from: a0  reason: collision with root package name */
    private static final e[] f21664a0;

    /* renamed from: b0  reason: collision with root package name */
    private static final e[] f21665b0;

    /* renamed from: c0  reason: collision with root package name */
    private static final e[] f21666c0;

    /* renamed from: d0  reason: collision with root package name */
    private static final e[] f21667d0;

    /* renamed from: e0  reason: collision with root package name */
    private static final e f21668e0 = new e("StripOffsets", 273, 3);

    /* renamed from: f0  reason: collision with root package name */
    private static final e[] f21669f0;

    /* renamed from: g0  reason: collision with root package name */
    private static final e[] f21670g0;

    /* renamed from: h0  reason: collision with root package name */
    private static final e[] f21671h0;

    /* renamed from: i0  reason: collision with root package name */
    private static final e[] f21672i0;

    /* renamed from: j0  reason: collision with root package name */
    static final e[][] f21673j0;

    /* renamed from: k0  reason: collision with root package name */
    private static final e[] f21674k0 = {new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};

    /* renamed from: l0  reason: collision with root package name */
    private static final HashMap<Integer, e>[] f21675l0;

    /* renamed from: m0  reason: collision with root package name */
    private static final HashMap<String, e>[] f21676m0;

    /* renamed from: n0  reason: collision with root package name */
    private static final HashSet<String> f21677n0 = new HashSet<>(Arrays.asList(new String[]{"FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"}));

    /* renamed from: o0  reason: collision with root package name */
    private static final HashMap<Integer, Integer> f21678o0 = new HashMap<>();

    /* renamed from: p0  reason: collision with root package name */
    static final Charset f21679p0;

    /* renamed from: q0  reason: collision with root package name */
    static final byte[] f21680q0;

    /* renamed from: r0  reason: collision with root package name */
    private static final byte[] f21681r0;

    /* renamed from: s0  reason: collision with root package name */
    private static final Pattern f21682s0 = Pattern.compile(".*[1-9].*");

    /* renamed from: t0  reason: collision with root package name */
    private static final Pattern f21683t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: u0  reason: collision with root package name */
    private static final Pattern f21684u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: v  reason: collision with root package name */
    private static final boolean f21685v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: v0  reason: collision with root package name */
    private static final Pattern f21686v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");

    /* renamed from: w  reason: collision with root package name */
    private static final List<Integer> f21687w = Arrays.asList(new Integer[]{1, 6, 3, 8});

    /* renamed from: x  reason: collision with root package name */
    private static final List<Integer> f21688x = Arrays.asList(new Integer[]{2, 7, 4, 5});

    /* renamed from: y  reason: collision with root package name */
    public static final int[] f21689y = {8, 8, 8};

    /* renamed from: z  reason: collision with root package name */
    public static final int[] f21690z = {4};

    /* renamed from: a  reason: collision with root package name */
    private String f21691a;

    /* renamed from: b  reason: collision with root package name */
    private FileDescriptor f21692b;

    /* renamed from: c  reason: collision with root package name */
    private AssetManager.AssetInputStream f21693c;

    /* renamed from: d  reason: collision with root package name */
    private int f21694d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f21695e;

    /* renamed from: f  reason: collision with root package name */
    private final HashMap<String, d>[] f21696f;

    /* renamed from: g  reason: collision with root package name */
    private Set<Integer> f21697g;

    /* renamed from: h  reason: collision with root package name */
    private ByteOrder f21698h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f21699i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f21700j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f21701k;

    /* renamed from: l  reason: collision with root package name */
    private int f21702l;

    /* renamed from: m  reason: collision with root package name */
    private int f21703m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f21704n;

    /* renamed from: o  reason: collision with root package name */
    private int f21705o;

    /* renamed from: p  reason: collision with root package name */
    private int f21706p;

    /* renamed from: q  reason: collision with root package name */
    private int f21707q;

    /* renamed from: r  reason: collision with root package name */
    private int f21708r;

    /* renamed from: s  reason: collision with root package name */
    private int f21709s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f21710t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f21711u;

    /* renamed from: androidx.exifinterface.media.a$a  reason: collision with other inner class name */
    class C0336a extends MediaDataSource {

        /* renamed from: a  reason: collision with root package name */
        long f21712a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ g f21713b;

        C0336a(g gVar) {
            this.f21713b = gVar;
        }

        public void close() {
        }

        public long getSize() {
            return -1;
        }

        public int readAt(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f21712a;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + ((long) this.f21713b.available())) {
                        return -1;
                    }
                    this.f21713b.h(j10);
                    this.f21712a = j10;
                }
                if (i11 > this.f21713b.available()) {
                    i11 = this.f21713b.available();
                }
                int read = this.f21713b.read(bArr, i10, i11);
                if (read >= 0) {
                    this.f21712a += (long) read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f21712a = -1;
            return -1;
        }
    }

    private static class c extends FilterOutputStream {

        /* renamed from: a  reason: collision with root package name */
        final OutputStream f21720a;

        /* renamed from: b  reason: collision with root package name */
        private ByteOrder f21721b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f21720a = outputStream;
            this.f21721b = byteOrder;
        }

        public void c(ByteOrder byteOrder) {
            this.f21721b = byteOrder;
        }

        public void d(int i10) {
            this.f21720a.write(i10);
        }

        public void e(int i10) {
            ByteOrder byteOrder = this.f21721b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f21720a.write(i10 & 255);
                this.f21720a.write((i10 >>> 8) & 255);
                this.f21720a.write((i10 >>> 16) & 255);
                this.f21720a.write((i10 >>> 24) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f21720a.write((i10 >>> 24) & 255);
                this.f21720a.write((i10 >>> 16) & 255);
                this.f21720a.write((i10 >>> 8) & 255);
                this.f21720a.write(i10 & 255);
            }
        }

        public void f(short s10) {
            ByteOrder byteOrder = this.f21721b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f21720a.write(s10 & 255);
                this.f21720a.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f21720a.write((s10 >>> 8) & 255);
                this.f21720a.write(s10 & 255);
            }
        }

        public void g(long j10) {
            if (j10 <= 4294967295L) {
                e((int) j10);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
        }

        public void h(int i10) {
            if (i10 <= 65535) {
                f((short) i10);
                return;
            }
            throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
        }

        public void write(byte[] bArr) {
            this.f21720a.write(bArr);
        }

        public void write(byte[] bArr, int i10, int i11) {
            this.f21720a.write(bArr, i10, i11);
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        public final int f21722a;

        /* renamed from: b  reason: collision with root package name */
        public final int f21723b;

        /* renamed from: c  reason: collision with root package name */
        public final long f21724c;

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f21725d;

        d(int i10, int i11, byte[] bArr) {
            this(i10, i11, -1, bArr);
        }

        public static d a(String str) {
            if (str.length() != 1 || str.charAt(0) < '0' || str.charAt(0) > '1') {
                byte[] bytes = str.getBytes(a.f21679p0);
                return new d(1, bytes.length, bytes);
            }
            return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f21661X[12] * dArr.length)]);
            wrap.order(byteOrder);
            for (double putDouble : dArr) {
                wrap.putDouble(putDouble);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f21661X[9] * iArr.length)]);
            wrap.order(byteOrder);
            for (int putInt : iArr) {
                wrap.putInt(putInt);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f21661X[10] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f21730a);
                wrap.putInt((int) fVar.f21731b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + 0).getBytes(a.f21679p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j10, ByteOrder byteOrder) {
            return g(new long[]{j10}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f21661X[4] * jArr.length)]);
            wrap.order(byteOrder);
            for (long j10 : jArr) {
                wrap.putInt((int) j10);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f21661X[5] * fVarArr.length)]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f21730a);
                wrap.putInt((int) fVar.f21731b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i10, ByteOrder byteOrder) {
            return k(new int[]{i10}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[(a.f21661X[3] * iArr.length)]);
            wrap.order(byteOrder);
            for (int i10 : iArr) {
                wrap.putShort((short) i10);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            } else if (o10 instanceof String) {
                return Double.parseDouble((String) o10);
            } else {
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return (double) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return (double) iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof double[]) {
                    double[] dArr = (double[]) o10;
                    if (dArr.length == 1) {
                        return dArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof f[]) {
                    f[] fVarArr = (f[]) o10;
                    if (fVarArr.length == 1) {
                        return fVarArr[0].a();
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a double value");
                }
            }
        }

        public int m(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            } else if (o10 instanceof String) {
                return Integer.parseInt((String) o10);
            } else {
                if (o10 instanceof long[]) {
                    long[] jArr = (long[]) o10;
                    if (jArr.length == 1) {
                        return (int) jArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else if (o10 instanceof int[]) {
                    int[] iArr = (int[]) o10;
                    if (iArr.length == 1) {
                        return iArr[0];
                    }
                    throw new NumberFormatException("There are more than one component");
                } else {
                    throw new NumberFormatException("Couldn't find a integer value");
                }
            }
        }

        public String n(ByteOrder byteOrder) {
            Object o10 = o(byteOrder);
            if (o10 == null) {
                return null;
            }
            if (o10 instanceof String) {
                return (String) o10;
            }
            StringBuilder sb2 = new StringBuilder();
            int i10 = 0;
            if (o10 instanceof long[]) {
                long[] jArr = (long[]) o10;
                while (i10 < jArr.length) {
                    sb2.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o10 instanceof int[]) {
                int[] iArr = (int[]) o10;
                while (i10 < iArr.length) {
                    sb2.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (o10 instanceof double[]) {
                double[] dArr = (double[]) o10;
                while (i10 < dArr.length) {
                    sb2.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            } else if (!(o10 instanceof f[])) {
                return null;
            } else {
                f[] fVarArr = (f[]) o10;
                while (i10 < fVarArr.length) {
                    sb2.append(fVarArr[i10].f21730a);
                    sb2.append('/');
                    sb2.append(fVarArr[i10].f21731b);
                    i10++;
                    if (i10 != fVarArr.length) {
                        sb2.append(",");
                    }
                }
                return sb2.toString();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:162:0x018f A[SYNTHETIC, Splitter:B:162:0x018f] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object o(java.nio.ByteOrder r12) {
            /*
                r11 = this;
                r0 = 0
                r1 = 1
                java.lang.String r2 = "IOException occurred while closing InputStream"
                java.lang.String r3 = "ExifInterface"
                r4 = 0
                androidx.exifinterface.media.a$b r5 = new androidx.exifinterface.media.a$b     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                byte[] r6 = r11.f21725d     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                r5.<init>((byte[]) r6)     // Catch:{ IOException -> 0x017b, all -> 0x0179 }
                r5.f(r12)     // Catch:{ IOException -> 0x0033 }
                int r12 = r11.f21722a     // Catch:{ IOException -> 0x0033 }
                switch(r12) {
                    case 1: goto L_0x0149;
                    case 2: goto L_0x0103;
                    case 3: goto L_0x00ea;
                    case 4: goto L_0x00d1;
                    case 5: goto L_0x00af;
                    case 6: goto L_0x0149;
                    case 7: goto L_0x0103;
                    case 8: goto L_0x0096;
                    case 9: goto L_0x007d;
                    case 10: goto L_0x0059;
                    case 11: goto L_0x003f;
                    case 12: goto L_0x001f;
                    default: goto L_0x0016;
                }
            L_0x0016:
                r5.close()     // Catch:{ IOException -> 0x001a }
                goto L_0x001e
            L_0x001a:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x001e:
                return r4
            L_0x001f:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                double[] r12 = new double[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0023:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0036
                double r6 = r5.readDouble()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0023
            L_0x002f:
                r12 = move-exception
                r4 = r5
                goto L_0x018d
            L_0x0033:
                r12 = move-exception
                goto L_0x017d
            L_0x0036:
                r5.close()     // Catch:{ IOException -> 0x003a }
                goto L_0x003e
            L_0x003a:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x003e:
                return r12
            L_0x003f:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                double[] r12 = new double[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0043:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0050
                float r6 = r5.readFloat()     // Catch:{ IOException -> 0x0033 }
                double r6 = (double) r6     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0043
            L_0x0050:
                r5.close()     // Catch:{ IOException -> 0x0054 }
                goto L_0x0058
            L_0x0054:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0058:
                return r12
            L_0x0059:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.a$f[] r12 = new androidx.exifinterface.media.a.f[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x005d:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x0074
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                long r6 = (long) r6     // Catch:{ IOException -> 0x0033 }
                int r8 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                long r8 = (long) r8     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.a$f r10 = new androidx.exifinterface.media.a$f     // Catch:{ IOException -> 0x0033 }
                r10.<init>(r6, r8)     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r10     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x005d
            L_0x0074:
                r5.close()     // Catch:{ IOException -> 0x0078 }
                goto L_0x007c
            L_0x0078:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x007c:
                return r12
            L_0x007d:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x0081:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x008d
                int r6 = r5.readInt()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x0081
            L_0x008d:
                r5.close()     // Catch:{ IOException -> 0x0091 }
                goto L_0x0095
            L_0x0091:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0095:
                return r12
            L_0x0096:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x009a:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00a6
                short r6 = r5.readShort()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x009a
            L_0x00a6:
                r5.close()     // Catch:{ IOException -> 0x00aa }
                goto L_0x00ae
            L_0x00aa:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00ae:
                return r12
            L_0x00af:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.a$f[] r12 = new androidx.exifinterface.media.a.f[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00b3:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00c8
                long r6 = r5.e()     // Catch:{ IOException -> 0x0033 }
                long r8 = r5.e()     // Catch:{ IOException -> 0x0033 }
                androidx.exifinterface.media.a$f r10 = new androidx.exifinterface.media.a$f     // Catch:{ IOException -> 0x0033 }
                r10.<init>(r6, r8)     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r10     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00b3
            L_0x00c8:
                r5.close()     // Catch:{ IOException -> 0x00cc }
                goto L_0x00d0
            L_0x00cc:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00d0:
                return r12
            L_0x00d1:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                long[] r12 = new long[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00d5:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00e1
                long r6 = r5.e()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00d5
            L_0x00e1:
                r5.close()     // Catch:{ IOException -> 0x00e5 }
                goto L_0x00e9
            L_0x00e5:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x00e9:
                return r12
            L_0x00ea:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                int[] r12 = new int[r12]     // Catch:{ IOException -> 0x0033 }
            L_0x00ee:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x00fa
                int r6 = r5.readUnsignedShort()     // Catch:{ IOException -> 0x0033 }
                r12[r0] = r6     // Catch:{ IOException -> 0x0033 }
                int r0 = r0 + r1
                goto L_0x00ee
            L_0x00fa:
                r5.close()     // Catch:{ IOException -> 0x00fe }
                goto L_0x0102
            L_0x00fe:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0102:
                return r12
            L_0x0103:
                int r12 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                byte[] r6 = androidx.exifinterface.media.a.f21662Y     // Catch:{ IOException -> 0x0033 }
                int r6 = r6.length     // Catch:{ IOException -> 0x0033 }
                if (r12 < r6) goto L_0x011c
                r12 = r0
            L_0x010b:
                byte[] r6 = androidx.exifinterface.media.a.f21662Y     // Catch:{ IOException -> 0x0033 }
                int r7 = r6.length     // Catch:{ IOException -> 0x0033 }
                if (r12 >= r7) goto L_0x011b
                byte[] r7 = r11.f21725d     // Catch:{ IOException -> 0x0033 }
                byte r7 = r7[r12]     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r12]     // Catch:{ IOException -> 0x0033 }
                if (r7 == r6) goto L_0x0119
                goto L_0x011c
            L_0x0119:
                int r12 = r12 + r1
                goto L_0x010b
            L_0x011b:
                int r0 = r6.length     // Catch:{ IOException -> 0x0033 }
            L_0x011c:
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0033 }
                r12.<init>()     // Catch:{ IOException -> 0x0033 }
            L_0x0121:
                int r6 = r11.f21723b     // Catch:{ IOException -> 0x0033 }
                if (r0 >= r6) goto L_0x013c
                byte[] r6 = r11.f21725d     // Catch:{ IOException -> 0x0033 }
                byte r6 = r6[r0]     // Catch:{ IOException -> 0x0033 }
                if (r6 != 0) goto L_0x012c
                goto L_0x013c
            L_0x012c:
                r7 = 32
                if (r6 < r7) goto L_0x0135
                char r6 = (char) r6     // Catch:{ IOException -> 0x0033 }
                r12.append(r6)     // Catch:{ IOException -> 0x0033 }
                goto L_0x013a
            L_0x0135:
                r6 = 63
                r12.append(r6)     // Catch:{ IOException -> 0x0033 }
            L_0x013a:
                int r0 = r0 + r1
                goto L_0x0121
            L_0x013c:
                java.lang.String r12 = r12.toString()     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0144 }
                goto L_0x0148
            L_0x0144:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0148:
                return r12
            L_0x0149:
                byte[] r12 = r11.f21725d     // Catch:{ IOException -> 0x0033 }
                int r6 = r12.length     // Catch:{ IOException -> 0x0033 }
                if (r6 != r1) goto L_0x0169
                byte r6 = r12[r0]     // Catch:{ IOException -> 0x0033 }
                if (r6 < 0) goto L_0x0169
                if (r6 > r1) goto L_0x0169
                java.lang.String r12 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                int r6 = r6 + 48
                char r6 = (char) r6     // Catch:{ IOException -> 0x0033 }
                char[] r1 = new char[r1]     // Catch:{ IOException -> 0x0033 }
                r1[r0] = r6     // Catch:{ IOException -> 0x0033 }
                r12.<init>(r1)     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0164 }
                goto L_0x0168
            L_0x0164:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0168:
                return r12
            L_0x0169:
                java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x0033 }
                java.nio.charset.Charset r1 = androidx.exifinterface.media.a.f21679p0     // Catch:{ IOException -> 0x0033 }
                r0.<init>(r12, r1)     // Catch:{ IOException -> 0x0033 }
                r5.close()     // Catch:{ IOException -> 0x0174 }
                goto L_0x0178
            L_0x0174:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x0178:
                return r0
            L_0x0179:
                r12 = move-exception
                goto L_0x018d
            L_0x017b:
                r12 = move-exception
                r5 = r4
            L_0x017d:
                java.lang.String r0 = "IOException occurred during reading a value"
                android.util.Log.w(r3, r0, r12)     // Catch:{ all -> 0x002f }
                if (r5 == 0) goto L_0x018c
                r5.close()     // Catch:{ IOException -> 0x0188 }
                goto L_0x018c
            L_0x0188:
                r12 = move-exception
                android.util.Log.e(r3, r2, r12)
            L_0x018c:
                return r4
            L_0x018d:
                if (r4 == 0) goto L_0x0197
                r4.close()     // Catch:{ IOException -> 0x0193 }
                goto L_0x0197
            L_0x0193:
                r0 = move-exception
                android.util.Log.e(r3, r2, r0)
            L_0x0197:
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.f21661X[this.f21722a] * this.f21723b;
        }

        public String toString() {
            return "(" + a.f21660W[this.f21722a] + ", data length:" + this.f21725d.length + ")";
        }

        d(int i10, int i11, long j10, byte[] bArr) {
            this.f21722a = i10;
            this.f21723b = i11;
            this.f21724c = j10;
            this.f21725d = bArr;
        }
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        public final long f21730a;

        /* renamed from: b  reason: collision with root package name */
        public final long f21731b;

        f(double d10) {
            this((long) (d10 * 10000.0d), 10000);
        }

        public double a() {
            return ((double) this.f21730a) / ((double) this.f21731b);
        }

        public String toString() {
            return this.f21730a + "/" + this.f21731b;
        }

        f(long j10, long j11) {
            if (j11 == 0) {
                this.f21730a = 0;
                this.f21731b = 1;
                return;
            }
            this.f21730a = j10;
            this.f21731b = j11;
        }
    }

    static {
        e eVar = r12;
        e eVar2 = new e("NewSubfileType", 254, 4);
        e eVar3 = r6;
        e eVar4 = new e("SubfileType", 255, 4);
        e eVar5 = r6;
        e eVar6 = new e("ImageWidth", 256, 3, 4);
        e eVar7 = r6;
        e eVar8 = new e("ImageLength", 257, 3, 4);
        e eVar9 = r6;
        e eVar10 = new e("BitsPerSample", 258, 3);
        e eVar11 = r6;
        e eVar12 = new e("Compression", 259, 3);
        e eVar13 = r6;
        e eVar14 = new e("PhotometricInterpretation", 262, 3);
        e eVar15 = r6;
        e eVar16 = new e("ImageDescription", 270, 2);
        e eVar17 = r6;
        e eVar18 = new e("Make", 271, 2);
        e eVar19 = r6;
        e eVar20 = new e("Model", 272, 2);
        e eVar21 = r6;
        e eVar22 = new e("StripOffsets", 273, 3, 4);
        e eVar23 = r6;
        e eVar24 = new e("Orientation", 274, 3);
        e eVar25 = r0;
        e eVar26 = new e("SamplesPerPixel", 277, 3);
        e eVar27 = r0;
        e eVar28 = new e("RowsPerStrip", 278, 3, 4);
        e eVar29 = r0;
        e eVar30 = new e("StripByteCounts", 279, 3, 4);
        e eVar31 = r0;
        e eVar32 = new e("XResolution", 282, 5);
        e eVar33 = r0;
        e eVar34 = new e("YResolution", 283, 5);
        e eVar35 = r0;
        e eVar36 = new e("PlanarConfiguration", 284, 3);
        e eVar37 = r0;
        e eVar38 = new e("ResolutionUnit", 296, 3);
        e eVar39 = r0;
        e eVar40 = new e("TransferFunction", 301, 3);
        e eVar41 = r0;
        e eVar42 = new e("Software", 305, 2);
        e eVar43 = r0;
        e eVar44 = new e("DateTime", 306, 2);
        e eVar45 = r0;
        e eVar46 = new e("Artist", 315, 2);
        e eVar47 = r0;
        e eVar48 = new e("WhitePoint", 318, 5);
        e eVar49 = r0;
        e eVar50 = new e("PrimaryChromaticities", 319, 5);
        e eVar51 = r0;
        e eVar52 = new e("SubIFDPointer", 330, 4);
        e eVar53 = r0;
        e eVar54 = new e("JPEGInterchangeFormat", 513, 4);
        e eVar55 = r0;
        e eVar56 = new e("JPEGInterchangeFormatLength", 514, 4);
        e eVar57 = r0;
        e eVar58 = new e("YCbCrCoefficients", 529, 5);
        e eVar59 = r0;
        e eVar60 = new e("YCbCrSubSampling", 530, 3);
        e eVar61 = r0;
        e eVar62 = new e("YCbCrPositioning", 531, 3);
        e eVar63 = r0;
        e eVar64 = new e("ReferenceBlackWhite", 532, 5);
        e eVar65 = r0;
        e eVar66 = new e("Copyright", 33432, 2);
        e eVar67 = r0;
        e eVar68 = new e("ExifIFDPointer", 34665, 4);
        e eVar69 = r0;
        e eVar70 = new e("GPSInfoIFDPointer", 34853, 4);
        e eVar71 = r0;
        e eVar72 = new e("SensorTopBorder", 4, 4);
        e eVar73 = r0;
        e eVar74 = new e("SensorLeftBorder", 5, 4);
        e eVar75 = r0;
        e eVar76 = new e("SensorBottomBorder", 6, 4);
        e eVar77 = r0;
        e eVar78 = new e("SensorRightBorder", 7, 4);
        e eVar79 = r0;
        e eVar80 = new e("ISO", 23, 3);
        e eVar81 = r0;
        e eVar82 = new e("JpgFromRaw", 46, 7);
        e eVar83 = r0;
        e eVar84 = new e("Xmp", 700, 1);
        e[] eVarArr = {eVar, eVar3, eVar5, eVar7, eVar9, eVar11, eVar13, eVar15, eVar17, eVar19, eVar21, eVar23, eVar25, eVar27, eVar29, eVar31, eVar33, eVar35, eVar37, eVar39, eVar41, eVar43, eVar45, eVar47, eVar49, eVar51, eVar53, eVar55, eVar57, eVar59, eVar61, eVar63, eVar65, eVar67, eVar69, eVar71, eVar73, eVar75, eVar77, eVar79, eVar81, eVar83};
        f21663Z = eVarArr;
        e eVar85 = r0;
        e eVar86 = new e("ExposureTime", 33434, 5);
        e eVar87 = r0;
        e eVar88 = new e("FNumber", 33437, 5);
        e eVar89 = r0;
        e eVar90 = new e("ExposureProgram", 34850, 3);
        e eVar91 = r0;
        e eVar92 = new e("SpectralSensitivity", 34852, 2);
        e eVar93 = r0;
        e eVar94 = new e("PhotographicSensitivity", 34855, 3);
        e eVar95 = r0;
        e eVar96 = new e("OECF", 34856, 7);
        e eVar97 = r0;
        e eVar98 = new e("SensitivityType", 34864, 3);
        e eVar99 = r0;
        e eVar100 = new e("StandardOutputSensitivity", 34865, 4);
        e eVar101 = r0;
        e eVar102 = new e("RecommendedExposureIndex", 34866, 4);
        e eVar103 = r0;
        e eVar104 = new e("ISOSpeed", 34867, 4);
        e eVar105 = r0;
        e eVar106 = new e("ISOSpeedLatitudeyyy", 34868, 4);
        e eVar107 = r0;
        e eVar108 = new e("ISOSpeedLatitudezzz", 34869, 4);
        e eVar109 = r0;
        e eVar110 = new e("ExifVersion", 36864, 2);
        e eVar111 = r0;
        e eVar112 = new e("DateTimeOriginal", 36867, 2);
        e eVar113 = r0;
        e eVar114 = new e("DateTimeDigitized", 36868, 2);
        e eVar115 = r0;
        e eVar116 = new e("OffsetTime", 36880, 2);
        e eVar117 = r0;
        e eVar118 = new e("OffsetTimeOriginal", 36881, 2);
        e eVar119 = r0;
        e eVar120 = new e("OffsetTimeDigitized", 36882, 2);
        e eVar121 = r0;
        e eVar122 = new e("ComponentsConfiguration", 37121, 7);
        e eVar123 = r0;
        e eVar124 = new e("CompressedBitsPerPixel", 37122, 5);
        e eVar125 = r0;
        e eVar126 = new e("ShutterSpeedValue", 37377, 10);
        e eVar127 = r0;
        e eVar128 = new e("ApertureValue", 37378, 5);
        e eVar129 = r0;
        e eVar130 = new e("BrightnessValue", 37379, 10);
        e eVar131 = r0;
        e eVar132 = new e("ExposureBiasValue", 37380, 10);
        e eVar133 = r0;
        e eVar134 = new e("MaxApertureValue", 37381, 5);
        e eVar135 = r0;
        e eVar136 = new e("SubjectDistance", 37382, 5);
        e eVar137 = r0;
        e eVar138 = new e("MeteringMode", 37383, 3);
        e eVar139 = r0;
        e eVar140 = new e("LightSource", 37384, 3);
        e eVar141 = r0;
        e eVar142 = new e("Flash", 37385, 3);
        e eVar143 = r0;
        e eVar144 = new e("FocalLength", 37386, 5);
        e eVar145 = r0;
        e eVar146 = new e("SubjectArea", 37396, 3);
        e eVar147 = r0;
        e eVar148 = new e("MakerNote", 37500, 7);
        e eVar149 = r0;
        e eVar150 = new e("UserComment", 37510, 7);
        e eVar151 = r0;
        e eVar152 = new e("SubSecTime", 37520, 2);
        e eVar153 = r0;
        e eVar154 = new e("SubSecTimeOriginal", 37521, 2);
        e eVar155 = r0;
        e eVar156 = new e("SubSecTimeDigitized", 37522, 2);
        e eVar157 = r0;
        e eVar158 = new e("FlashpixVersion", 40960, 7);
        e eVar159 = r0;
        e eVar160 = new e("ColorSpace", 40961, 3);
        e eVar161 = r0;
        e eVar162 = new e("PixelXDimension", 40962, 3, 4);
        e eVar163 = r0;
        e eVar164 = new e("PixelYDimension", 40963, 3, 4);
        e eVar165 = r0;
        e eVar166 = new e("RelatedSoundFile", 40964, 2);
        e eVar167 = r0;
        e eVar168 = new e("InteroperabilityIFDPointer", 40965, 4);
        e eVar169 = r0;
        e eVar170 = new e("FlashEnergy", 41483, 5);
        e eVar171 = r0;
        e eVar172 = new e("SpatialFrequencyResponse", 41484, 7);
        e eVar173 = r0;
        e eVar174 = new e("FocalPlaneXResolution", 41486, 5);
        e eVar175 = r0;
        e eVar176 = new e("FocalPlaneYResolution", 41487, 5);
        e eVar177 = r0;
        e eVar178 = new e("FocalPlaneResolutionUnit", 41488, 3);
        e eVar179 = r0;
        e eVar180 = new e("SubjectLocation", 41492, 3);
        e eVar181 = r0;
        e eVar182 = new e("ExposureIndex", 41493, 5);
        e eVar183 = r0;
        e eVar184 = new e("SensingMethod", 41495, 3);
        e eVar185 = r0;
        e eVar186 = new e("FileSource", 41728, 7);
        e eVar187 = r0;
        e eVar188 = new e("SceneType", 41729, 7);
        e eVar189 = r0;
        e eVar190 = new e("CFAPattern", 41730, 7);
        e eVar191 = r0;
        e eVar192 = new e("CustomRendered", 41985, 3);
        e eVar193 = r0;
        e eVar194 = new e("ExposureMode", 41986, 3);
        e eVar195 = r0;
        e eVar196 = new e("WhiteBalance", 41987, 3);
        e eVar197 = r0;
        e eVar198 = new e("DigitalZoomRatio", 41988, 5);
        e eVar199 = r0;
        e eVar200 = new e("FocalLengthIn35mmFilm", 41989, 3);
        e eVar201 = r0;
        e eVar202 = new e("SceneCaptureType", 41990, 3);
        e eVar203 = r0;
        e eVar204 = new e("GainControl", 41991, 3);
        e eVar205 = r0;
        e eVar206 = new e("Contrast", 41992, 3);
        e eVar207 = r0;
        e eVar208 = new e("Saturation", 41993, 3);
        e eVar209 = r0;
        e eVar210 = new e("Sharpness", 41994, 3);
        e eVar211 = r0;
        e eVar212 = new e("DeviceSettingDescription", 41995, 7);
        e eVar213 = r0;
        e eVar214 = new e("SubjectDistanceRange", 41996, 3);
        e eVar215 = r0;
        e eVar216 = new e("ImageUniqueID", 42016, 2);
        e eVar217 = r0;
        e eVar218 = new e("CameraOwnerName", 42032, 2);
        e eVar219 = r0;
        e eVar220 = new e("BodySerialNumber", 42033, 2);
        e eVar221 = r0;
        e eVar222 = new e("LensSpecification", 42034, 5);
        e eVar223 = r0;
        e eVar224 = new e("LensMake", 42035, 2);
        e eVar225 = r0;
        e eVar226 = new e("LensModel", 42036, 2);
        e eVar227 = r0;
        e eVar228 = new e("Gamma", 42240, 5);
        e eVar229 = r0;
        e eVar230 = new e("DNGVersion", 50706, 1);
        e eVar231 = r0;
        e eVar232 = new e("DefaultCropSize", 50720, 3, 4);
        e[] eVarArr2 = {eVar85, eVar87, eVar89, eVar91, eVar93, eVar95, eVar97, eVar99, eVar101, eVar103, eVar105, eVar107, eVar109, eVar111, eVar113, eVar115, eVar117, eVar119, eVar121, eVar123, eVar125, eVar127, eVar129, eVar131, eVar133, eVar135, eVar137, eVar139, eVar141, eVar143, eVar145, eVar147, eVar149, eVar151, eVar153, eVar155, eVar157, eVar159, eVar161, eVar163, eVar165, eVar167, eVar169, eVar171, eVar173, eVar175, eVar177, eVar179, eVar181, eVar183, eVar185, eVar187, eVar189, eVar191, eVar193, eVar195, eVar197, eVar199, eVar201, eVar203, eVar205, eVar207, eVar209, eVar211, eVar213, eVar215, eVar217, eVar219, eVar221, eVar223, eVar225, eVar227, eVar229, eVar231};
        f21664a0 = eVarArr2;
        e eVar233 = r0;
        e eVar234 = new e("GPSVersionID", 0, 1);
        e eVar235 = r0;
        e eVar236 = new e("GPSLatitudeRef", 1, 2);
        e eVar237 = r0;
        e eVar238 = new e("GPSLatitude", 2, 5, 10);
        e eVar239 = r0;
        e eVar240 = new e("GPSLongitudeRef", 3, 2);
        e eVar241 = r0;
        e eVar242 = new e("GPSLongitude", 4, 5, 10);
        e eVar243 = r0;
        e eVar244 = new e("GPSAltitudeRef", 5, 1);
        e eVar245 = r0;
        e eVar246 = new e("GPSAltitude", 6, 5);
        e eVar247 = r0;
        e eVar248 = new e("GPSTimeStamp", 7, 5);
        e eVar249 = r0;
        e eVar250 = new e("GPSSatellites", 8, 2);
        e eVar251 = r0;
        e eVar252 = new e("GPSStatus", 9, 2);
        e eVar253 = r0;
        e eVar254 = new e("GPSMeasureMode", 10, 2);
        e eVar255 = r0;
        e eVar256 = new e("GPSDOP", 11, 5);
        e eVar257 = r0;
        e eVar258 = new e("GPSSpeedRef", 12, 2);
        e eVar259 = r0;
        e eVar260 = new e("GPSSpeed", 13, 5);
        e eVar261 = r0;
        e eVar262 = new e("GPSTrackRef", 14, 2);
        e eVar263 = r0;
        e eVar264 = new e("GPSTrack", 15, 5);
        e eVar265 = r0;
        e eVar266 = new e("GPSImgDirectionRef", 16, 2);
        e eVar267 = r0;
        e eVar268 = new e("GPSImgDirection", 17, 5);
        e eVar269 = r0;
        e eVar270 = new e("GPSMapDatum", 18, 2);
        e eVar271 = r0;
        e eVar272 = new e("GPSDestLatitudeRef", 19, 2);
        e eVar273 = r0;
        e eVar274 = new e("GPSDestLatitude", 20, 5);
        e eVar275 = r0;
        e eVar276 = new e("GPSDestLongitudeRef", 21, 2);
        e eVar277 = r0;
        e eVar278 = new e("GPSDestLongitude", 22, 5);
        e eVar279 = r0;
        e eVar280 = new e("GPSDestBearingRef", 23, 2);
        e eVar281 = r0;
        e eVar282 = new e("GPSDestBearing", 24, 5);
        e eVar283 = r0;
        e eVar284 = new e("GPSDestDistanceRef", 25, 2);
        e eVar285 = r0;
        e eVar286 = new e("GPSDestDistance", 26, 5);
        e eVar287 = r0;
        e eVar288 = new e("GPSProcessingMethod", 27, 7);
        e eVar289 = r0;
        e eVar290 = new e("GPSAreaInformation", 28, 7);
        e eVar291 = r0;
        e eVar292 = new e("GPSDateStamp", 29, 2);
        e eVar293 = r0;
        e eVar294 = new e("GPSDifferential", 30, 3);
        e eVar295 = r0;
        e eVar296 = new e("GPSHPositioningError", 31, 5);
        e[] eVarArr3 = {eVar233, eVar235, eVar237, eVar239, eVar241, eVar243, eVar245, eVar247, eVar249, eVar251, eVar253, eVar255, eVar257, eVar259, eVar261, eVar263, eVar265, eVar267, eVar269, eVar271, eVar273, eVar275, eVar277, eVar279, eVar281, eVar283, eVar285, eVar287, eVar289, eVar291, eVar293, eVar295};
        f21665b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f21666c0 = eVarArr4;
        e eVar297 = r0;
        e eVar298 = new e("NewSubfileType", 254, 4);
        e eVar299 = r0;
        e eVar300 = new e("SubfileType", 255, 4);
        e eVar301 = r0;
        e eVar302 = new e("ThumbnailImageWidth", 256, 3, 4);
        e eVar303 = r0;
        e eVar304 = new e("ThumbnailImageLength", 257, 3, 4);
        e eVar305 = r0;
        e eVar306 = new e("BitsPerSample", 258, 3);
        e eVar307 = r0;
        e eVar308 = new e("Compression", 259, 3);
        e eVar309 = r0;
        e eVar310 = new e("PhotometricInterpretation", 262, 3);
        e eVar311 = r0;
        e eVar312 = new e("ImageDescription", 270, 2);
        e eVar313 = r0;
        e eVar314 = new e("Make", 271, 2);
        e eVar315 = r0;
        e eVar316 = new e("Model", 272, 2);
        e eVar317 = r0;
        e eVar318 = new e("StripOffsets", 273, 3, 4);
        e eVar319 = r0;
        e eVar320 = new e("ThumbnailOrientation", 274, 3);
        e eVar321 = r0;
        e eVar322 = new e("SamplesPerPixel", 277, 3);
        e eVar323 = r0;
        e eVar324 = new e("RowsPerStrip", 278, 3, 4);
        e eVar325 = r0;
        e eVar326 = new e("StripByteCounts", 279, 3, 4);
        e eVar327 = r0;
        e eVar328 = new e("XResolution", 282, 5);
        e eVar329 = r0;
        e eVar330 = new e("YResolution", 283, 5);
        e eVar331 = r0;
        e eVar332 = new e("PlanarConfiguration", 284, 3);
        e eVar333 = r0;
        e eVar334 = new e("ResolutionUnit", 296, 3);
        e eVar335 = r0;
        e eVar336 = new e("TransferFunction", 301, 3);
        e eVar337 = r0;
        e eVar338 = new e("Software", 305, 2);
        e eVar339 = r0;
        e eVar340 = new e("DateTime", 306, 2);
        e eVar341 = r0;
        e eVar342 = new e("Artist", 315, 2);
        e eVar343 = r0;
        e eVar344 = new e("WhitePoint", 318, 5);
        e eVar345 = r0;
        e eVar346 = new e("PrimaryChromaticities", 319, 5);
        e eVar347 = r0;
        e eVar348 = new e("SubIFDPointer", 330, 4);
        e eVar349 = r0;
        e eVar350 = new e("JPEGInterchangeFormat", 513, 4);
        e eVar351 = r0;
        e eVar352 = new e("JPEGInterchangeFormatLength", 514, 4);
        e eVar353 = r0;
        e eVar354 = new e("YCbCrCoefficients", 529, 5);
        e eVar355 = r0;
        e eVar356 = new e("YCbCrSubSampling", 530, 3);
        e eVar357 = r0;
        e eVar358 = new e("YCbCrPositioning", 531, 3);
        e eVar359 = r0;
        e eVar360 = new e("ReferenceBlackWhite", 532, 5);
        e eVar361 = r0;
        e eVar362 = new e("Copyright", 33432, 2);
        e eVar363 = r0;
        e eVar364 = new e("ExifIFDPointer", 34665, 4);
        e eVar365 = r0;
        e eVar366 = new e("GPSInfoIFDPointer", 34853, 4);
        e eVar367 = r0;
        e eVar368 = new e("DNGVersion", 50706, 1);
        e eVar369 = r0;
        e eVar370 = new e("DefaultCropSize", 50720, 3, 4);
        e[] eVarArr5 = {eVar297, eVar299, eVar301, eVar303, eVar305, eVar307, eVar309, eVar311, eVar313, eVar315, eVar317, eVar319, eVar321, eVar323, eVar325, eVar327, eVar329, eVar331, eVar333, eVar335, eVar337, eVar339, eVar341, eVar343, eVar345, eVar347, eVar349, eVar351, eVar353, eVar355, eVar357, eVar359, eVar361, eVar363, eVar365, eVar367, eVar369};
        f21667d0 = eVarArr5;
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f21669f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f21670g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f21671h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f21672i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f21673j0 = eVarArr10;
        f21675l0 = new HashMap[eVarArr10.length];
        f21676m0 = new HashMap[eVarArr10.length];
        Charset forName = Charset.forName("US-ASCII");
        f21679p0 = forName;
        f21680q0 = "Exif\u0000\u0000".getBytes(forName);
        f21681r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        f21658U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        f21659V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr11 = f21673j0;
            if (i10 < eVarArr11.length) {
                f21675l0[i10] = new HashMap<>();
                f21676m0[i10] = new HashMap<>();
                for (e eVar371 : eVarArr11[i10]) {
                    f21675l0[i10].put(Integer.valueOf(eVar371.f21726a), eVar371);
                    f21676m0[i10].put(eVar371.f21727b, eVar371);
                }
                i10++;
            } else {
                HashMap<Integer, Integer> hashMap = f21678o0;
                e[] eVarArr12 = f21674k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f21726a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f21726a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f21726a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f21726a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f21726a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f21726a), 8);
                return;
            }
        }
    }

    public a(String str) {
        e[][] eVarArr = f21673j0;
        this.f21696f = new HashMap[eVarArr.length];
        this.f21697g = new HashSet(eVarArr.length);
        this.f21698h = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            B(str);
            return;
        }
        throw new NullPointerException("filename cannot be null");
    }

    private void A(b bVar, HashMap hashMap) {
        byte[] bArr;
        b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        d dVar = (d) hashMap2.get("StripOffsets");
        d dVar2 = (d) hashMap2.get("StripByteCounts");
        if (dVar != null && dVar2 != null) {
            long[] c10 = b.c(dVar.o(this.f21698h));
            long[] c11 = b.c(dVar2.o(this.f21698h));
            if (c10 == null || c10.length == 0) {
                Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            } else if (c11 == null || c11.length == 0) {
                Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            } else if (c10.length != c11.length) {
                Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            } else {
                long j10 = 0;
                for (long j11 : c11) {
                    j10 += j11;
                }
                int i10 = (int) j10;
                byte[] bArr2 = new byte[i10];
                this.f21701k = true;
                this.f21700j = true;
                this.f21699i = true;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i11 < c10.length) {
                    int i14 = (int) c10[i11];
                    int i15 = (int) c11[i11];
                    if (i11 < c10.length - 1) {
                        bArr = bArr2;
                        if (((long) (i14 + i15)) != c10[i11 + 1]) {
                            this.f21701k = false;
                        }
                    } else {
                        bArr = bArr2;
                    }
                    int i16 = i14 - i12;
                    if (i16 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    try {
                        bVar2.g(i16);
                        int i17 = i12 + i16;
                        byte[] bArr3 = new byte[i15];
                        try {
                            bVar2.readFully(bArr3);
                            i12 = i17 + i15;
                            byte[] bArr4 = bArr;
                            System.arraycopy(bArr3, 0, bArr4, i13, i15);
                            i13 += i15;
                            i11++;
                            bArr2 = bArr4;
                        } catch (EOFException unused) {
                            Log.d("ExifInterface", "Failed to read " + i15 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d("ExifInterface", "Failed to skip " + i16 + " bytes.");
                        return;
                    }
                }
                this.f21704n = bArr2;
                if (this.f21701k) {
                    this.f21702l = (int) c10[0];
                    this.f21703m = i10;
                }
            }
        }
    }

    private void B(String str) {
        if (str != null) {
            FileInputStream fileInputStream = null;
            this.f21693c = null;
            this.f21691a = str;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    if (K(fileInputStream2.getFD())) {
                        this.f21692b = fileInputStream2.getFD();
                    } else {
                        this.f21692b = null;
                    }
                    P(fileInputStream2);
                    b.b(fileInputStream2);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    b.b(fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                b.b(fileInputStream);
                throw th;
            }
        } else {
            throw new NullPointerException("filename cannot be null");
        }
    }

    private static boolean C(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f21680q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f21680q0;
            if (i10 >= bArr3.length) {
                return true;
            }
            if (bArr2[i10] != bArr3[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0090 A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean E(byte[] r15) {
        /*
            r14 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x008b }
            r2.<init>((byte[]) r15)     // Catch:{ Exception -> 0x008b }
            int r1 = r2.readInt()     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r3 = (long) r1     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r1 = 4
            byte[] r5 = new byte[r1]     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r2.readFully(r5)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            byte[] r6 = f21640C     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r5 != 0) goto L_0x001e
            r2.close()
            return r0
        L_0x001e:
            r5 = 1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 8
            if (r7 != 0) goto L_0x003b
            long r3 = r2.readLong()     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r10 = 16
            int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x003c
            r2.close()
            return r0
        L_0x0034:
            r15 = move-exception
            r1 = r2
            goto L_0x009d
        L_0x0038:
            r15 = move-exception
            r1 = r2
            goto L_0x008c
        L_0x003b:
            r10 = r8
        L_0x003c:
            int r7 = r15.length     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r12 = (long) r7     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            int r7 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r7 <= 0) goto L_0x0044
            int r15 = r15.length     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            long r3 = (long) r15
        L_0x0044:
            long r3 = r3 - r10
            int r15 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r15 >= 0) goto L_0x004d
            r2.close()
            return r0
        L_0x004d:
            byte[] r15 = new byte[r1]     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r7 = 0
            r1 = r0
            r9 = r1
        L_0x0053:
            r10 = 4
            long r10 = r3 / r10
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 >= 0) goto L_0x0085
            r2.readFully(r15)     // Catch:{ EOFException -> 0x0081 }
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x0063
            goto L_0x007f
        L_0x0063:
            byte[] r10 = f21641D     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r10 = java.util.Arrays.equals(r15, r10)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            r11 = 1
            if (r10 == 0) goto L_0x006e
            r1 = r11
            goto L_0x0077
        L_0x006e:
            byte[] r10 = f21642E     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            boolean r10 = java.util.Arrays.equals(r15, r10)     // Catch:{ Exception -> 0x0038, all -> 0x0034 }
            if (r10 == 0) goto L_0x0077
            r9 = r11
        L_0x0077:
            if (r1 == 0) goto L_0x007f
            if (r9 == 0) goto L_0x007f
            r2.close()
            return r11
        L_0x007f:
            long r7 = r7 + r5
            goto L_0x0053
        L_0x0081:
            r2.close()
            return r0
        L_0x0085:
            r2.close()
            goto L_0x009c
        L_0x0089:
            r15 = move-exception
            goto L_0x009d
        L_0x008b:
            r15 = move-exception
        L_0x008c:
            boolean r2 = f21685v     // Catch:{ all -> 0x0089 }
            if (r2 == 0) goto L_0x0097
            java.lang.String r2 = "ExifInterface"
            java.lang.String r3 = "Exception parsing HEIF file type box."
            android.util.Log.d(r2, r3, r15)     // Catch:{ all -> 0x0089 }
        L_0x0097:
            if (r1 == 0) goto L_0x009c
            r1.close()
        L_0x009c:
            return r0
        L_0x009d:
            if (r1 == 0) goto L_0x00a2
            r1.close()
        L_0x00a2:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.E(byte[]):boolean");
    }

    private static boolean F(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f21639B;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean G(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x002d, all -> 0x0026 }
            java.nio.ByteOrder r4 = r3.S(r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r3.f21698h = r4     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r2.f(r4)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            r1 = 20306(0x4f52, float:2.8455E-41)
            if (r4 == r1) goto L_0x001c
            r1 = 21330(0x5352, float:2.989E-41)
            if (r4 != r1) goto L_0x001d
        L_0x001c:
            r0 = 1
        L_0x001d:
            r2.close()
            return r0
        L_0x0021:
            r4 = move-exception
            r1 = r2
            goto L_0x0027
        L_0x0024:
            r1 = r2
            goto L_0x002d
        L_0x0026:
            r4 = move-exception
        L_0x0027:
            if (r1 == 0) goto L_0x002c
            r1.close()
        L_0x002c:
            throw r4
        L_0x002d:
            if (r1 == 0) goto L_0x0032
            r1.close()
        L_0x0032:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.G(byte[]):boolean");
    }

    private boolean H(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f21645H;
            if (i10 >= bArr2.length) {
                return true;
            }
            if (bArr[i10] != bArr2[i10]) {
                return false;
            }
            i10++;
        }
    }

    private boolean I(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i10 = 0; i10 < bytes.length; i10++) {
            if (bArr[i10] != bytes[i10]) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean J(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            androidx.exifinterface.media.a$b r2 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r2.<init>((byte[]) r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            java.nio.ByteOrder r4 = r3.S(r2)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r3.f21698h = r4     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r2.f(r4)     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            short r4 = r2.readShort()     // Catch:{ Exception -> 0x0020, all -> 0x001d }
            r1 = 85
            if (r4 != r1) goto L_0x0019
            r0 = 1
        L_0x0019:
            r2.close()
            return r0
        L_0x001d:
            r4 = move-exception
            r1 = r2
            goto L_0x0023
        L_0x0020:
            r1 = r2
            goto L_0x0029
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r1 == 0) goto L_0x0028
            r1.close()
        L_0x0028:
            throw r4
        L_0x0029:
            if (r1 == 0) goto L_0x002e
            r1.close()
        L_0x002e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.J(byte[]):boolean");
    }

    private static boolean K(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f21685v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean L(HashMap hashMap) {
        d dVar;
        int m10;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f21698h);
            int[] iArr2 = f21689y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f21694d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m10 = dVar.m(this.f21698h)) == 1 && Arrays.equals(iArr, f21638A)) || (m10 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f21685v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean M(int i10) {
        return i10 == 4 || i10 == 13 || i10 == 14;
    }

    private boolean N(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f21698h) <= 512 && dVar2.m(this.f21698h) <= 512;
    }

    private boolean O(byte[] bArr) {
        int i10 = 0;
        while (true) {
            byte[] bArr2 = f21649L;
            if (i10 >= bArr2.length) {
                int i11 = 0;
                while (true) {
                    byte[] bArr3 = f21650M;
                    if (i11 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[f21649L.length + i11 + 4] != bArr3[i11]) {
                        return false;
                    }
                    i11++;
                }
            } else if (bArr[i10] != bArr2[i10]) {
                return false;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x009f A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void P(java.io.InputStream r5) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x00b8
            r0 = 0
            r1 = r0
        L_0x0004:
            androidx.exifinterface.media.a$e[][] r2 = f21673j0     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r2 = r2.length     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 >= r2) goto L_0x001e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r4.f21696f     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r3.<init>()     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2[r1] = r3     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r1 = r1 + 1
            goto L_0x0004
        L_0x0015:
            r5 = move-exception
            goto L_0x00ad
        L_0x0018:
            r5 = move-exception
            goto L_0x009b
        L_0x001b:
            r5 = move-exception
            goto L_0x009b
        L_0x001e:
            boolean r1 = r4.f21695e     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 != 0) goto L_0x0030
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2 = 5000(0x1388, float:7.006E-42)
            r1.<init>(r5, r2)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r5 = r4.n(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r4.f21694d = r5     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r5 = r1
        L_0x0030:
            int r1 = r4.f21694d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            boolean r1 = h0(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r1 == 0) goto L_0x006b
            androidx.exifinterface.media.a$g r0 = new androidx.exifinterface.media.a$g     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r0.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            boolean r5 = r4.f21695e     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            if (r5 == 0) goto L_0x0045
            r4.u(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x0045:
            int r5 = r4.f21694d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r1 = 12
            if (r5 != r1) goto L_0x004f
            r4.k(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x004f:
            r1 = 7
            if (r5 != r1) goto L_0x0056
            r4.o(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x0056:
            r1 = 10
            if (r5 != r1) goto L_0x005e
            r4.t(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0061
        L_0x005e:
            r4.r(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
        L_0x0061:
            int r5 = r4.f21706p     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            long r1 = (long) r5     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r0.h(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r4.g0(r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x006b:
            androidx.exifinterface.media.a$b r1 = new androidx.exifinterface.media.a$b     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r1.<init>((java.io.InputStream) r5)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            int r5 = r4.f21694d     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            r2 = 4
            if (r5 != r2) goto L_0x0079
            r4.l(r1, r0, r0)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0079:
            r0 = 13
            if (r5 != r0) goto L_0x0081
            r4.p(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0081:
            r0 = 9
            if (r5 != r0) goto L_0x0089
            r4.q(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
            goto L_0x0090
        L_0x0089:
            r0 = 14
            if (r5 != r0) goto L_0x0090
            r4.x(r1)     // Catch:{ IOException -> 0x001b, UnsupportedOperationException -> 0x0018 }
        L_0x0090:
            r4.a()
            boolean r5 = f21685v
            if (r5 == 0) goto L_0x00ac
        L_0x0097:
            r4.R()
            goto L_0x00ac
        L_0x009b:
            boolean r0 = f21685v     // Catch:{ all -> 0x0015 }
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "ExifInterface"
            java.lang.String r2 = "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface."
            android.util.Log.w(r1, r2, r5)     // Catch:{ all -> 0x0015 }
        L_0x00a6:
            r4.a()
            if (r0 == 0) goto L_0x00ac
            goto L_0x0097
        L_0x00ac:
            return
        L_0x00ad:
            r4.a()
            boolean r0 = f21685v
            if (r0 == 0) goto L_0x00b7
            r4.R()
        L_0x00b7:
            throw r5
        L_0x00b8:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "inputstream shouldn't be null"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.P(java.io.InputStream):void");
    }

    private void Q(b bVar) {
        ByteOrder S10 = S(bVar);
        this.f21698h = S10;
        bVar.f(S10);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i10 = this.f21694d;
        if (i10 == 7 || i10 == 10 || readUnsignedShort == 42) {
            int readInt = bVar.readInt();
            if (readInt >= 8) {
                int i11 = readInt - 8;
                if (i11 > 0) {
                    bVar.g(i11);
                    return;
                }
                return;
            }
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
    }

    private void R() {
        for (int i10 = 0; i10 < this.f21696f.length; i10++) {
            Log.d("ExifInterface", "The size of tag group[" + i10 + "]: " + this.f21696f[i10].size());
            for (Map.Entry next : this.f21696f[i10].entrySet()) {
                d dVar = (d) next.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) next.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f21698h) + "'");
            }
        }
    }

    private ByteOrder S(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f21685v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        } else if (readShort == 19789) {
            if (f21685v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        } else {
            throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
        }
    }

    private void T(byte[] bArr, int i10) {
        g gVar = new g(bArr);
        Q(gVar);
        U(gVar, i10);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0219  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0244  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0280  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void U(androidx.exifinterface.media.a.g r26, int r27) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            java.util.Set<java.lang.Integer> r3 = r0.f21697g
            int r4 = r26.d()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r3.add(r4)
            short r3 = r26.readShort()
            boolean r4 = f21685v
            java.lang.String r5 = "ExifInterface"
            if (r4 == 0) goto L_0x0031
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "numberOfDirectoryEntry: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r4 = r4.toString()
            android.util.Log.d(r5, r4)
        L_0x0031:
            if (r3 > 0) goto L_0x0034
            return
        L_0x0034:
            r6 = 0
        L_0x0035:
            if (r6 >= r3) goto L_0x0341
            int r10 = r26.readUnsignedShort()
            int r11 = r26.readUnsignedShort()
            int r14 = r26.readInt()
            int r12 = r26.d()
            long r12 = (long) r12
            r15 = 4
            long r12 = r12 + r15
            java.util.HashMap<java.lang.Integer, androidx.exifinterface.media.a$e>[] r17 = f21675l0
            r4 = r17[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r10)
            java.lang.Object r4 = r4.get(r9)
            androidx.exifinterface.media.a$e r4 = (androidx.exifinterface.media.a.e) r4
            boolean r9 = f21685v
            if (r9 == 0) goto L_0x0086
            java.lang.Integer r15 = java.lang.Integer.valueOf(r27)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r10)
            if (r4 == 0) goto L_0x006c
            java.lang.String r8 = r4.f21727b
        L_0x0069:
            r20 = r3
            goto L_0x006e
        L_0x006c:
            r8 = 0
            goto L_0x0069
        L_0x006e:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r21 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r3 = new java.lang.Object[]{r15, r7, r8, r3, r6}
            java.lang.String r6 = "ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d"
            java.lang.String r3 = java.lang.String.format(r6, r3)
            android.util.Log.d(r5, r3)
            goto L_0x008a
        L_0x0086:
            r20 = r3
            r21 = r6
        L_0x008a:
            r3 = 7
            if (r4 != 0) goto L_0x00a7
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since tag number is not defined: "
            r6.append(r7)
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x00a3:
            r22 = r4
            goto L_0x0125
        L_0x00a7:
            if (r11 <= 0) goto L_0x00ae
            int[] r6 = f21661X
            int r7 = r6.length
            if (r11 < r7) goto L_0x00b1
        L_0x00ae:
            r22 = r4
            goto L_0x010f
        L_0x00b1:
            boolean r7 = r4.a(r11)
            if (r7 != 0) goto L_0x00dc
            if (r9 == 0) goto L_0x00a3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since data format ("
            r6.append(r7)
            java.lang.String[] r7 = f21660W
            r7 = r7[r11]
            r6.append(r7)
            java.lang.String r7 = ") is unexpected for tag: "
            r6.append(r7)
            java.lang.String r7 = r4.f21727b
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
            goto L_0x00a3
        L_0x00dc:
            if (r11 != r3) goto L_0x00e0
            int r11 = r4.f21728c
        L_0x00e0:
            long r7 = (long) r14
            r6 = r6[r11]
            r22 = r4
            long r3 = (long) r6
            long r3 = r3 * r7
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x00f7
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f5
            goto L_0x00f7
        L_0x00f5:
            r6 = 1
            goto L_0x0128
        L_0x00f7:
            if (r9 == 0) goto L_0x010d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Skip the tag entry since the number of components is invalid: "
            r6.append(r7)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x010d:
            r6 = 0
            goto L_0x0128
        L_0x010f:
            if (r9 == 0) goto L_0x0125
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Skip the tag entry since data format is invalid: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r5, r3)
        L_0x0125:
            r3 = 0
            goto L_0x010d
        L_0x0128:
            if (r6 != 0) goto L_0x012f
            r1.h(r12)
            goto L_0x0338
        L_0x012f:
            r6 = 4
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = "Compression"
            if (r6 <= 0) goto L_0x01bb
            int r6 = r26.readInt()
            if (r9 == 0) goto L_0x0151
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r15 = "seek to data offset: "
            r8.append(r15)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r5, r8)
        L_0x0151:
            int r8 = r0.f21694d
            r15 = 7
            if (r8 != r15) goto L_0x01b0
            r8 = r22
            java.lang.String r15 = r8.f21727b
            r18 = r12
            java.lang.String r12 = "MakerNote"
            boolean r12 = r12.equals(r15)
            if (r12 == 0) goto L_0x0169
            r0.f21707q = r6
        L_0x0166:
            r16 = r14
            goto L_0x01b6
        L_0x0169:
            r12 = 6
            if (r2 != r12) goto L_0x0166
            java.lang.String r13 = "ThumbnailImage"
            java.lang.String r15 = r8.f21727b
            boolean r13 = r13.equals(r15)
            if (r13 == 0) goto L_0x0166
            r0.f21708r = r6
            r0.f21709s = r14
            java.nio.ByteOrder r13 = r0.f21698h
            androidx.exifinterface.media.a$d r12 = androidx.exifinterface.media.a.d.j(r12, r13)
            int r13 = r0.f21708r
            r15 = r14
            long r13 = (long) r13
            java.nio.ByteOrder r2 = r0.f21698h
            androidx.exifinterface.media.a$d r2 = androidx.exifinterface.media.a.d.f(r13, r2)
            int r13 = r0.f21709s
            long r13 = (long) r13
            r16 = r15
            java.nio.ByteOrder r15 = r0.f21698h
            androidx.exifinterface.media.a$d r13 = androidx.exifinterface.media.a.d.f(r13, r15)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r14 = r0.f21696f
            r15 = 4
            r14 = r14[r15]
            r14.put(r7, r12)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r12 = r0.f21696f
            r12 = r12[r15]
            java.lang.String r14 = "JPEGInterchangeFormat"
            r12.put(r14, r2)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r0.f21696f
            r2 = r2[r15]
            java.lang.String r12 = "JPEGInterchangeFormatLength"
            r2.put(r12, r13)
            goto L_0x01b6
        L_0x01b0:
            r18 = r12
            r16 = r14
            r8 = r22
        L_0x01b6:
            long r12 = (long) r6
            r1.h(r12)
            goto L_0x01c1
        L_0x01bb:
            r18 = r12
            r16 = r14
            r8 = r22
        L_0x01c1:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r2 = f21678o0
            java.lang.Integer r6 = java.lang.Integer.valueOf(r10)
            java.lang.Object r2 = r2.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r9 == 0) goto L_0x01eb
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "nextIfdType: "
            r6.append(r10)
            r6.append(r2)
            java.lang.String r10 = " byteCount: "
            r6.append(r10)
            r6.append(r3)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r5, r6)
        L_0x01eb:
            r6 = 8
            r10 = 3
            if (r2 == 0) goto L_0x02bd
            if (r11 == r10) goto L_0x0212
            r3 = 4
            if (r11 == r3) goto L_0x020d
            if (r11 == r6) goto L_0x0208
            r3 = 9
            if (r11 == r3) goto L_0x0202
            r3 = 13
            if (r11 == r3) goto L_0x0202
            r3 = -1
            goto L_0x0217
        L_0x0202:
            int r3 = r26.readInt()
        L_0x0206:
            long r3 = (long) r3
            goto L_0x0217
        L_0x0208:
            short r3 = r26.readShort()
            goto L_0x0206
        L_0x020d:
            long r3 = r26.e()
            goto L_0x0217
        L_0x0212:
            int r3 = r26.readUnsignedShort()
            goto L_0x0206
        L_0x0217:
            if (r9 == 0) goto L_0x022c
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            java.lang.String r7 = r8.f21727b
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "Offset: %d, tagName: %s"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            android.util.Log.d(r5, r6)
        L_0x022c:
            r6 = 0
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            java.lang.String r7 = ")"
            r8 = -1
            if (r6 <= 0) goto L_0x0280
            int r6 = r26.c()
            if (r6 == r8) goto L_0x0244
            int r6 = r26.c()
            long r10 = (long) r6
            int r6 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0280
        L_0x0244:
            java.util.Set<java.lang.Integer> r6 = r0.f21697g
            int r8 = (int) r3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            boolean r6 = r6.contains(r8)
            if (r6 != 0) goto L_0x025e
            r1.h(r3)
            int r2 = r2.intValue()
            r0.U(r1, r2)
        L_0x025b:
            r12 = r18
            goto L_0x02b8
        L_0x025e:
            if (r9 == 0) goto L_0x025b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = "Skip jump into the IFD since it has already been read: IfdType "
            r6.append(r8)
            r6.append(r2)
            java.lang.String r2 = " (at "
            r6.append(r2)
            r6.append(r3)
            r6.append(r7)
            java.lang.String r2 = r6.toString()
            android.util.Log.d(r5, r2)
            goto L_0x025b
        L_0x0280:
            if (r9 == 0) goto L_0x025b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r6 = "Skip jump into the IFD since its offset is invalid: "
            r2.append(r6)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            int r3 = r26.c()
            if (r3 == r8) goto L_0x02b4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " (total length: "
            r3.append(r2)
            int r2 = r26.c()
            r3.append(r2)
            r3.append(r7)
            java.lang.String r2 = r3.toString()
        L_0x02b4:
            android.util.Log.d(r5, r2)
            goto L_0x025b
        L_0x02b8:
            r1.h(r12)
            goto L_0x0338
        L_0x02bd:
            r12 = r18
            int r2 = r26.d()
            int r9 = r0.f21706p
            int r2 = r2 + r9
            int r3 = (int) r3
            byte[] r3 = new byte[r3]
            r1.readFully(r3)
            androidx.exifinterface.media.a$d r4 = new androidx.exifinterface.media.a$d
            long r14 = (long) r2
            r23 = r12
            r12 = r4
            r13 = r11
            r18 = r14
            r14 = r16
            r15 = r18
            r17 = r3
            r12.<init>(r13, r14, r15, r17)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r0.f21696f
            r2 = r2[r27]
            java.lang.String r3 = r8.f21727b
            r2.put(r3, r4)
            java.lang.String r2 = "DNGVersion"
            java.lang.String r3 = r8.f21727b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02f3
            r0.f21694d = r10
        L_0x02f3:
            java.lang.String r2 = "Make"
            java.lang.String r3 = r8.f21727b
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0307
            java.lang.String r2 = "Model"
            java.lang.String r3 = r8.f21727b
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0315
        L_0x0307:
            java.nio.ByteOrder r2 = r0.f21698h
            java.lang.String r2 = r4.n(r2)
            java.lang.String r3 = "PENTAX"
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0328
        L_0x0315:
            java.lang.String r2 = r8.f21727b
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L_0x032a
            java.nio.ByteOrder r2 = r0.f21698h
            int r2 = r4.m(r2)
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 != r3) goto L_0x032a
        L_0x0328:
            r0.f21694d = r6
        L_0x032a:
            int r2 = r26.d()
            long r2 = (long) r2
            r12 = r23
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x0338
            r1.h(r12)
        L_0x0338:
            int r6 = r21 + 1
            short r6 = (short) r6
            r2 = r27
            r3 = r20
            goto L_0x0035
        L_0x0341:
            int r2 = r26.readInt()
            boolean r3 = f21685v
            if (r3 == 0) goto L_0x035a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r6 = "nextIfdOffset: %d"
            java.lang.String r4 = java.lang.String.format(r6, r4)
            android.util.Log.d(r5, r4)
        L_0x035a:
            long r6 = (long) r2
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 <= 0) goto L_0x03a5
            java.util.Set<java.lang.Integer> r4 = r0.f21697g
            java.lang.Integer r8 = java.lang.Integer.valueOf(r2)
            boolean r4 = r4.contains(r8)
            if (r4 != 0) goto L_0x038e
            r1.h(r6)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r0.f21696f
            r3 = 4
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x037f
            r0.U(r1, r3)
            goto L_0x03bb
        L_0x037f:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r2 = r0.f21696f
            r3 = 5
            r2 = r2[r3]
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x03bb
            r0.U(r1, r3)
            goto L_0x03bb
        L_0x038e:
            if (r3 == 0) goto L_0x03bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since re-reading an IFD may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
            goto L_0x03bb
        L_0x03a5:
            if (r3 == 0) goto L_0x03bb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Stop reading file since a wrong offset may cause an infinite loop: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r5, r1)
        L_0x03bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.U(androidx.exifinterface.media.a$g, int):void");
    }

    private void V(String str) {
        for (int i10 = 0; i10 < f21673j0.length; i10++) {
            this.f21696f[i10].remove(str);
        }
    }

    private void W(int i10, String str, String str2) {
        if (!this.f21696f[i10].isEmpty() && this.f21696f[i10].get(str) != null) {
            HashMap<String, d> hashMap = this.f21696f[i10];
            hashMap.put(str2, hashMap.get(str));
            this.f21696f[i10].remove(str);
        }
    }

    private void X(g gVar, int i10) {
        d dVar = this.f21696f[i10].get("ImageLength");
        d dVar2 = this.f21696f[i10].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = this.f21696f[i10].get("JPEGInterchangeFormat");
            d dVar4 = this.f21696f[i10].get("JPEGInterchangeFormatLength");
            if (dVar3 != null && dVar4 != null) {
                int m10 = dVar3.m(this.f21698h);
                int m11 = dVar3.m(this.f21698h);
                gVar.h((long) m10);
                byte[] bArr = new byte[m11];
                gVar.readFully(bArr);
                l(new b(bArr), m10, i10);
            }
        }
    }

    private void Z(InputStream inputStream, OutputStream outputStream) {
        if (f21685v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() == -1) {
            cVar.d(-1);
            if (bVar.readByte() == -40) {
                cVar.d(-40);
                d remove = (g("Xmp") == null || !this.f21711u) ? null : this.f21696f[0].remove("Xmp");
                cVar.d(-1);
                cVar.d(-31);
                l0(cVar);
                if (remove != null) {
                    this.f21696f[0].put("Xmp", remove);
                }
                byte[] bArr = new byte[RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT];
                while (bVar.readByte() == -1) {
                    byte readByte = bVar.readByte();
                    if (readByte == -39 || readByte == -38) {
                        cVar.d(-1);
                        cVar.d(readByte);
                        b.d(bVar, cVar);
                        return;
                    } else if (readByte != -31) {
                        cVar.d(-1);
                        cVar.d(readByte);
                        int readUnsignedShort = bVar.readUnsignedShort();
                        cVar.h(readUnsignedShort);
                        int i10 = readUnsignedShort - 2;
                        if (i10 >= 0) {
                            while (i10 > 0) {
                                int read = bVar.read(bArr, 0, Math.min(i10, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT));
                                if (read < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read);
                                i10 -= read;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    } else {
                        int readUnsignedShort2 = bVar.readUnsignedShort();
                        int i11 = readUnsignedShort2 - 2;
                        if (i11 >= 0) {
                            byte[] bArr2 = new byte[6];
                            if (i11 >= 6) {
                                bVar.readFully(bArr2);
                                if (Arrays.equals(bArr2, f21680q0)) {
                                    bVar.g(readUnsignedShort2 - 8);
                                }
                            }
                            cVar.d(-1);
                            cVar.d(readByte);
                            cVar.h(readUnsignedShort2);
                            if (i11 >= 6) {
                                i11 = readUnsignedShort2 - 8;
                                cVar.write(bArr2);
                            }
                            while (i11 > 0) {
                                int read2 = bVar.read(bArr, 0, Math.min(i11, RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT));
                                if (read2 < 0) {
                                    break;
                                }
                                cVar.write(bArr, 0, read2);
                                i11 -= read2;
                            }
                        } else {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                throw new IOException("Invalid marker");
            }
            throw new IOException("Invalid marker");
        }
        throw new IOException("Invalid marker");
    }

    private void a() {
        String g10 = g("DateTimeOriginal");
        if (g10 != null && g("DateTime") == null) {
            this.f21696f[0].put("DateTime", d.e(g10));
        }
        if (g("ImageWidth") == null) {
            this.f21696f[0].put("ImageWidth", d.f(0, this.f21698h));
        }
        if (g("ImageLength") == null) {
            this.f21696f[0].put("ImageLength", d.f(0, this.f21698h));
        }
        if (g("Orientation") == null) {
            this.f21696f[0].put("Orientation", d.f(0, this.f21698h));
        }
        if (g("LightSource") == null) {
            this.f21696f[1].put("LightSource", d.f(0, this.f21698h));
        }
    }

    private void a0(InputStream inputStream, OutputStream outputStream) {
        if (f21685v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = f21645H;
        b.e(bVar, cVar, bArr.length);
        int i10 = this.f21706p;
        if (i10 == 0) {
            int readInt = bVar.readInt();
            cVar.e(readInt);
            b.e(bVar, cVar, readInt + 8);
        } else {
            b.e(bVar, cVar, (i10 - bArr.length) - 8);
            bVar.g(bVar.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                l0(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f21720a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.e((int) crc32.getValue());
                b.b(byteArrayOutputStream2);
                b.d(bVar, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                b.b(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            b.b(byteArrayOutputStream);
            throw th;
        }
    }

    private String b(double d10) {
        long j10 = (long) d10;
        double d11 = d10 - ((double) j10);
        long j11 = (long) (d11 * 60.0d);
        long round = Math.round((d11 - (((double) j11) / 60.0d)) * 3600.0d * 1.0E7d);
        return j10 + "/1," + j11 + "/1," + round + "/10000000";
    }

    private void b0(InputStream inputStream, OutputStream outputStream) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        InputStream inputStream2 = inputStream;
        OutputStream outputStream2 = outputStream;
        if (f21685v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream2 + ", outputStream: " + outputStream2 + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream2, byteOrder);
        c cVar = new c(outputStream2, byteOrder);
        byte[] bArr = f21649L;
        b.e(bVar, cVar, bArr.length);
        byte[] bArr2 = f21650M;
        bVar.g(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                int i13 = this.f21706p;
                if (i13 != 0) {
                    b.e(bVar, cVar2, (i13 - ((bArr.length + 4) + bArr2.length)) - 8);
                    bVar.g(4);
                    int readInt = bVar.readInt();
                    if (readInt % 2 != 0) {
                        readInt++;
                    }
                    bVar.g(readInt);
                    l0(cVar2);
                } else {
                    byte[] bArr3 = new byte[4];
                    bVar.readFully(bArr3);
                    byte[] bArr4 = f21653P;
                    boolean z11 = false;
                    boolean z12 = true;
                    if (Arrays.equals(bArr3, bArr4)) {
                        int readInt2 = bVar.readInt();
                        byte[] bArr5 = new byte[(readInt2 % 2 == 1 ? readInt2 + 1 : readInt2)];
                        bVar.readFully(bArr5);
                        byte b10 = (byte) (8 | bArr5[0]);
                        bArr5[0] = b10;
                        if (((b10 >> 1) & 1) == 1) {
                            z11 = true;
                        }
                        cVar2.write(bArr4);
                        cVar2.e(readInt2);
                        cVar2.write(bArr5);
                        if (z11) {
                            d(bVar, cVar2, f21656S, (byte[]) null);
                            while (true) {
                                byte[] bArr6 = new byte[4];
                                try {
                                    bVar.readFully(bArr6);
                                    z10 = !Arrays.equals(bArr6, f21657T);
                                } catch (EOFException unused) {
                                    z10 = true;
                                }
                                if (z10) {
                                    break;
                                }
                                e(bVar, cVar2, bArr6);
                            }
                            l0(cVar2);
                        } else {
                            d(bVar, cVar2, f21655R, f21654Q);
                            l0(cVar2);
                        }
                    } else {
                        byte[] bArr7 = f21655R;
                        if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, f21654Q)) {
                            int readInt3 = bVar.readInt();
                            int i14 = readInt3 % 2 == 1 ? readInt3 + 1 : readInt3;
                            byte[] bArr8 = new byte[3];
                            if (Arrays.equals(bArr3, bArr7)) {
                                bVar.readFully(bArr8);
                                byte[] bArr9 = new byte[3];
                                bVar.readFully(bArr9);
                                if (Arrays.equals(f21652O, bArr9)) {
                                    int readInt4 = bVar.readInt();
                                    i10 = (readInt4 << 2) >> 18;
                                    i14 -= 10;
                                    i12 = (readInt4 << 18) >> 18;
                                    i11 = readInt4;
                                    z12 = false;
                                } else {
                                    throw new IOException("Error checking VP8 signature");
                                }
                            } else if (!Arrays.equals(bArr3, f21654Q)) {
                                i12 = 0;
                                z12 = false;
                                i11 = 0;
                                i10 = 0;
                            } else if (bVar.readByte() == 47) {
                                i11 = bVar.readInt();
                                i12 = (i11 & 16383) + 1;
                                i10 = ((i11 & 268419072) >>> 14) + 1;
                                if ((i11 & 268435456) == 0) {
                                    z12 = false;
                                }
                                i14 -= 5;
                            } else {
                                throw new IOException("Error checking VP8L signature");
                            }
                            cVar2.write(bArr4);
                            cVar2.e(10);
                            byte[] bArr10 = new byte[10];
                            if (z12) {
                                bArr10[0] = (byte) (bArr10[0] | 16);
                            }
                            bArr10[0] = (byte) (bArr10[0] | 8);
                            int i15 = i12 - 1;
                            int i16 = i10 - 1;
                            bArr10[4] = (byte) i15;
                            bArr10[5] = (byte) (i15 >> 8);
                            bArr10[6] = (byte) (i15 >> 16);
                            bArr10[7] = (byte) i16;
                            bArr10[8] = (byte) (i16 >> 8);
                            bArr10[9] = (byte) (i16 >> 16);
                            cVar2.write(bArr10);
                            cVar2.write(bArr3);
                            cVar2.e(readInt3);
                            if (Arrays.equals(bArr3, bArr7)) {
                                cVar2.write(bArr8);
                                cVar2.write(f21652O);
                                cVar2.e(i11);
                            } else if (Arrays.equals(bArr3, f21654Q)) {
                                cVar2.write(47);
                                cVar2.e(i11);
                            }
                            b.e(bVar, cVar2, i14);
                            l0(cVar2);
                        }
                    }
                }
                b.d(bVar, cVar2);
                int size = byteArrayOutputStream2.size();
                byte[] bArr11 = f21650M;
                cVar.e(size + bArr11.length);
                cVar.write(bArr11);
                byteArrayOutputStream2.writeTo(cVar);
                b.b(byteArrayOutputStream2);
            } catch (Exception e10) {
                e = e10;
                byteArrayOutputStream = byteArrayOutputStream2;
                try {
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th2) {
                    th = th2;
                    b.b(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = byteArrayOutputStream2;
                b.b(byteArrayOutputStream);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            throw new IOException("Failed to save WebP file", e);
        }
    }

    private static double c(String str, String str2) {
        try {
            String[] split = str.split(",", -1);
            String[] split2 = split[0].split("/", -1);
            String[] split3 = split[1].split("/", -1);
            String[] split4 = split[2].split("/", -1);
            double parseDouble = (Double.parseDouble(split2[0].trim()) / Double.parseDouble(split2[1].trim())) + ((Double.parseDouble(split3[0].trim()) / Double.parseDouble(split3[1].trim())) / 60.0d) + ((Double.parseDouble(split4[0].trim()) / Double.parseDouble(split4[1].trim())) / 3600.0d);
            if (!str2.equals("S")) {
                if (!str2.equals("W")) {
                    if (!str2.equals("N")) {
                        if (!str2.equals("E")) {
                            throw new IllegalArgumentException();
                        }
                    }
                    return parseDouble;
                }
            }
            return -parseDouble;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    private void d(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        while (true) {
            byte[] bArr3 = new byte[4];
            bVar.readFully(bArr3);
            e(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void e(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.e(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        b.e(bVar, cVar, readInt);
    }

    private void g0(b bVar) {
        HashMap<String, d> hashMap = this.f21696f[4];
        d dVar = hashMap.get("Compression");
        if (dVar != null) {
            int m10 = dVar.m(this.f21698h);
            this.f21705o = m10;
            if (m10 != 1) {
                if (m10 == 6) {
                    z(bVar, hashMap);
                    return;
                } else if (m10 != 7) {
                    return;
                }
            }
            if (L(hashMap)) {
                A(bVar, hashMap);
                return;
            }
            return;
        }
        this.f21705o = 6;
        z(bVar, hashMap);
    }

    private static boolean h0(int i10) {
        return (i10 == 4 || i10 == 9 || i10 == 13 || i10 == 14) ? false : true;
    }

    private void i0(int i10, int i11) {
        if (!this.f21696f[i10].isEmpty() && !this.f21696f[i11].isEmpty()) {
            d dVar = this.f21696f[i10].get("ImageLength");
            d dVar2 = this.f21696f[i10].get("ImageWidth");
            d dVar3 = this.f21696f[i11].get("ImageLength");
            d dVar4 = this.f21696f[i11].get("ImageWidth");
            if (dVar == null || dVar2 == null) {
                if (f21685v) {
                    Log.d("ExifInterface", "First image does not contain valid size information");
                }
            } else if (dVar3 != null && dVar4 != null) {
                int m10 = dVar.m(this.f21698h);
                int m11 = dVar2.m(this.f21698h);
                int m12 = dVar3.m(this.f21698h);
                int m13 = dVar4.m(this.f21698h);
                if (m10 < m12 && m11 < m13) {
                    HashMap<String, d>[] hashMapArr = this.f21696f;
                    HashMap<String, d> hashMap = hashMapArr[i10];
                    hashMapArr[i10] = hashMapArr[i11];
                    hashMapArr[i11] = hashMap;
                }
            } else if (f21685v) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
            }
        } else if (f21685v) {
            Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
        }
    }

    private d j(String str) {
        if (str != null) {
            if ("ISOSpeedRatings".equals(str)) {
                if (f21685v) {
                    Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
                }
                str = "PhotographicSensitivity";
            }
            for (int i10 = 0; i10 < f21673j0.length; i10++) {
                d dVar = this.f21696f[i10].get(str);
                if (dVar != null) {
                    return dVar;
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    private void j0(g gVar, int i10) {
        d dVar;
        d dVar2;
        d dVar3 = this.f21696f[i10].get("DefaultCropSize");
        d dVar4 = this.f21696f[i10].get("SensorTopBorder");
        d dVar5 = this.f21696f[i10].get("SensorLeftBorder");
        d dVar6 = this.f21696f[i10].get("SensorBottomBorder");
        d dVar7 = this.f21696f[i10].get("SensorRightBorder");
        if (dVar3 != null) {
            if (dVar3.f21722a == 5) {
                f[] fVarArr = (f[]) dVar3.o(this.f21698h);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                }
                dVar2 = d.h(fVarArr[0], this.f21698h);
                dVar = d.h(fVarArr[1], this.f21698h);
            } else {
                int[] iArr = (int[]) dVar3.o(this.f21698h);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVar2 = d.j(iArr[0], this.f21698h);
                dVar = d.j(iArr[1], this.f21698h);
            }
            this.f21696f[i10].put("ImageWidth", dVar2);
            this.f21696f[i10].put("ImageLength", dVar);
        } else if (dVar4 == null || dVar5 == null || dVar6 == null || dVar7 == null) {
            X(gVar, i10);
        } else {
            int m10 = dVar4.m(this.f21698h);
            int m11 = dVar6.m(this.f21698h);
            int m12 = dVar7.m(this.f21698h);
            int m13 = dVar5.m(this.f21698h);
            if (m11 > m10 && m12 > m13) {
                d j10 = d.j(m11 - m10, this.f21698h);
                d j11 = d.j(m12 - m13, this.f21698h);
                this.f21696f[i10].put("ImageLength", j10);
                this.f21696f[i10].put("ImageWidth", j11);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:47|48|49) */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x012c, code lost:
        throw new java.lang.UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x012d, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0046, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0125 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void k(androidx.exifinterface.media.a.g r13) {
        /*
            r12 = this;
            java.lang.String r0 = "yes"
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L_0x0131
            android.media.MediaMetadataRetriever r1 = new android.media.MediaMetadataRetriever
            r1.<init>()
            androidx.exifinterface.media.a$a r2 = new androidx.exifinterface.media.a$a     // Catch:{ RuntimeException -> 0x0125 }
            r2.<init>(r13)     // Catch:{ RuntimeException -> 0x0125 }
            androidx.exifinterface.media.b.C0337b.a(r1, r2)     // Catch:{ RuntimeException -> 0x0125 }
            r2 = 33
            java.lang.String r2 = r1.extractMetadata(r2)     // Catch:{ RuntimeException -> 0x0125 }
            r3 = 34
            java.lang.String r3 = r1.extractMetadata(r3)     // Catch:{ RuntimeException -> 0x0125 }
            r4 = 26
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0125 }
            r5 = 17
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0125 }
            boolean r4 = r0.equals(r4)     // Catch:{ RuntimeException -> 0x0125 }
            if (r4 == 0) goto L_0x0049
            r0 = 29
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0125 }
            r4 = 30
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0125 }
            r5 = 31
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0125 }
            goto L_0x0065
        L_0x0046:
            r13 = move-exception
            goto L_0x012d
        L_0x0049:
            boolean r0 = r0.equals(r5)     // Catch:{ RuntimeException -> 0x0125 }
            if (r0 == 0) goto L_0x0062
            r0 = 18
            java.lang.String r0 = r1.extractMetadata(r0)     // Catch:{ RuntimeException -> 0x0125 }
            r4 = 19
            java.lang.String r4 = r1.extractMetadata(r4)     // Catch:{ RuntimeException -> 0x0125 }
            r5 = 24
            java.lang.String r5 = r1.extractMetadata(r5)     // Catch:{ RuntimeException -> 0x0125 }
            goto L_0x0065
        L_0x0062:
            r0 = 0
            r4 = r0
            r5 = r4
        L_0x0065:
            r6 = 0
            if (r0 == 0) goto L_0x007b
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r12.f21696f     // Catch:{ RuntimeException -> 0x0125 }
            r7 = r7[r6]     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r8 = "ImageWidth"
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ RuntimeException -> 0x0125 }
            java.nio.ByteOrder r10 = r12.f21698h     // Catch:{ RuntimeException -> 0x0125 }
            androidx.exifinterface.media.a$d r9 = androidx.exifinterface.media.a.d.j(r9, r10)     // Catch:{ RuntimeException -> 0x0125 }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x0125 }
        L_0x007b:
            if (r4 == 0) goto L_0x0090
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r7 = r12.f21696f     // Catch:{ RuntimeException -> 0x0125 }
            r7 = r7[r6]     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r8 = "ImageLength"
            int r9 = java.lang.Integer.parseInt(r4)     // Catch:{ RuntimeException -> 0x0125 }
            java.nio.ByteOrder r10 = r12.f21698h     // Catch:{ RuntimeException -> 0x0125 }
            androidx.exifinterface.media.a$d r9 = androidx.exifinterface.media.a.d.j(r9, r10)     // Catch:{ RuntimeException -> 0x0125 }
            r7.put(r8, r9)     // Catch:{ RuntimeException -> 0x0125 }
        L_0x0090:
            r7 = 6
            if (r5 == 0) goto L_0x00ba
            int r8 = java.lang.Integer.parseInt(r5)     // Catch:{ RuntimeException -> 0x0125 }
            r9 = 90
            if (r8 == r9) goto L_0x00aa
            r9 = 180(0xb4, float:2.52E-43)
            if (r8 == r9) goto L_0x00a8
            r9 = 270(0x10e, float:3.78E-43)
            if (r8 == r9) goto L_0x00a5
            r8 = 1
            goto L_0x00ab
        L_0x00a5:
            r8 = 8
            goto L_0x00ab
        L_0x00a8:
            r8 = 3
            goto L_0x00ab
        L_0x00aa:
            r8 = r7
        L_0x00ab:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r9 = r12.f21696f     // Catch:{ RuntimeException -> 0x0125 }
            r9 = r9[r6]     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r10 = "Orientation"
            java.nio.ByteOrder r11 = r12.f21698h     // Catch:{ RuntimeException -> 0x0125 }
            androidx.exifinterface.media.a$d r8 = androidx.exifinterface.media.a.d.j(r8, r11)     // Catch:{ RuntimeException -> 0x0125 }
            r9.put(r10, r8)     // Catch:{ RuntimeException -> 0x0125 }
        L_0x00ba:
            if (r2 == 0) goto L_0x00f7
            if (r3 == 0) goto L_0x00f7
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ RuntimeException -> 0x0125 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ RuntimeException -> 0x0125 }
            if (r3 <= r7) goto L_0x00ef
            long r8 = (long) r2     // Catch:{ RuntimeException -> 0x0125 }
            r13.h(r8)     // Catch:{ RuntimeException -> 0x0125 }
            byte[] r8 = new byte[r7]     // Catch:{ RuntimeException -> 0x0125 }
            r13.readFully(r8)     // Catch:{ RuntimeException -> 0x0125 }
            int r2 = r2 + r7
            int r3 = r3 + -6
            byte[] r7 = f21680q0     // Catch:{ RuntimeException -> 0x0125 }
            boolean r7 = java.util.Arrays.equals(r8, r7)     // Catch:{ RuntimeException -> 0x0125 }
            if (r7 == 0) goto L_0x00e7
            byte[] r3 = new byte[r3]     // Catch:{ RuntimeException -> 0x0125 }
            r13.readFully(r3)     // Catch:{ RuntimeException -> 0x0125 }
            r12.f21706p = r2     // Catch:{ RuntimeException -> 0x0125 }
            r12.T(r3, r6)     // Catch:{ RuntimeException -> 0x0125 }
            goto L_0x00f7
        L_0x00e7:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = "Invalid identifier"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0125 }
            throw r13     // Catch:{ RuntimeException -> 0x0125 }
        L_0x00ef:
            java.io.IOException r13 = new java.io.IOException     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = "Invalid exif length"
            r13.<init>(r0)     // Catch:{ RuntimeException -> 0x0125 }
            throw r13     // Catch:{ RuntimeException -> 0x0125 }
        L_0x00f7:
            boolean r13 = f21685v     // Catch:{ RuntimeException -> 0x0125 }
            if (r13 == 0) goto L_0x0121
            java.lang.String r13 = "ExifInterface"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0125 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r3 = "Heif meta: "
            r2.append(r3)     // Catch:{ RuntimeException -> 0x0125 }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = "x"
            r2.append(r0)     // Catch:{ RuntimeException -> 0x0125 }
            r2.append(r4)     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = ", rotation "
            r2.append(r0)     // Catch:{ RuntimeException -> 0x0125 }
            r2.append(r5)     // Catch:{ RuntimeException -> 0x0125 }
            java.lang.String r0 = r2.toString()     // Catch:{ RuntimeException -> 0x0125 }
            android.util.Log.d(r13, r0)     // Catch:{ RuntimeException -> 0x0125 }
        L_0x0121:
            r1.release()
            return
        L_0x0125:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0046 }
            java.lang.String r0 = "Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported."
            r13.<init>(r0)     // Catch:{ all -> 0x0046 }
            throw r13     // Catch:{ all -> 0x0046 }
        L_0x012d:
            r1.release()
            throw r13
        L_0x0131:
            java.lang.UnsupportedOperationException r13 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reading EXIF from HEIF files is supported from SDK 28 and above"
            r13.<init>(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.k(androidx.exifinterface.media.a$g):void");
    }

    private void k0() {
        i0(0, 5);
        i0(0, 4);
        i0(5, 4);
        d dVar = this.f21696f[1].get("PixelXDimension");
        d dVar2 = this.f21696f[1].get("PixelYDimension");
        if (!(dVar == null || dVar2 == null)) {
            this.f21696f[0].put("ImageWidth", dVar);
            this.f21696f[0].put("ImageLength", dVar2);
        }
        if (this.f21696f[4].isEmpty() && N(this.f21696f[5])) {
            HashMap<String, d>[] hashMapArr = this.f21696f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap<>();
        }
        if (!N(this.f21696f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        W(0, "ThumbnailOrientation", "Orientation");
        W(0, "ThumbnailImageLength", "ImageLength");
        W(0, "ThumbnailImageWidth", "ImageWidth");
        W(5, "ThumbnailOrientation", "Orientation");
        W(5, "ThumbnailImageLength", "ImageLength");
        W(5, "ThumbnailImageWidth", "ImageWidth");
        W(4, "Orientation", "ThumbnailOrientation");
        W(4, "ImageLength", "ThumbnailImageLength");
        W(4, "ImageWidth", "ThumbnailImageWidth");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0170 A[LOOP:0: B:8:0x0037->B:56:0x0170, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0177 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void l(androidx.exifinterface.media.a.b r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            boolean r3 = f21685v
            java.lang.String r4 = "ExifInterface"
            if (r3 == 0) goto L_0x0020
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "getJpegAttributes starting with: "
            r3.append(r5)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r4, r3)
        L_0x0020:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            r1.f(r3)
            byte r3 = r22.readByte()
            java.lang.String r5 = "Invalid marker: "
            r6 = -1
            if (r3 != r6) goto L_0x01c4
            byte r7 = r22.readByte()
            r8 = -40
            if (r7 != r8) goto L_0x01a9
            r3 = 2
        L_0x0037:
            byte r5 = r22.readByte()
            if (r5 != r6) goto L_0x018c
            byte r5 = r22.readByte()
            boolean r7 = f21685v
            if (r7 == 0) goto L_0x005f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Found JPEG segment indicator: "
            r8.append(r9)
            r9 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r9 = java.lang.Integer.toHexString(r9)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r4, r8)
        L_0x005f:
            r8 = -39
            if (r5 == r8) goto L_0x0186
            r8 = -38
            if (r5 != r8) goto L_0x0069
            goto L_0x0186
        L_0x0069:
            int r8 = r22.readUnsignedShort()
            int r9 = r8 + -2
            r10 = 4
            int r3 = r3 + r10
            if (r7 == 0) goto L_0x009a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "JPEG segment: "
            r7.append(r11)
            r11 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r11 = java.lang.Integer.toHexString(r11)
            r7.append(r11)
            java.lang.String r11 = " (length: "
            r7.append(r11)
            r7.append(r8)
            java.lang.String r11 = ")"
            r7.append(r11)
            java.lang.String r7 = r7.toString()
            android.util.Log.d(r4, r7)
        L_0x009a:
            java.lang.String r7 = "Invalid length"
            if (r9 < 0) goto L_0x017f
            r11 = -31
            r12 = 1
            r13 = 0
            if (r5 == r11) goto L_0x0112
            r11 = -2
            if (r5 == r11) goto L_0x00ef
            switch(r5) {
                case -64: goto L_0x00b7;
                case -63: goto L_0x00b7;
                case -62: goto L_0x00b7;
                case -61: goto L_0x00b7;
                default: goto L_0x00aa;
            }
        L_0x00aa:
            switch(r5) {
                case -59: goto L_0x00b7;
                case -58: goto L_0x00b7;
                case -57: goto L_0x00b7;
                default: goto L_0x00ad;
            }
        L_0x00ad:
            switch(r5) {
                case -55: goto L_0x00b7;
                case -54: goto L_0x00b7;
                case -53: goto L_0x00b7;
                default: goto L_0x00b0;
            }
        L_0x00b0:
            switch(r5) {
                case -51: goto L_0x00b7;
                case -50: goto L_0x00b7;
                case -49: goto L_0x00b7;
                default: goto L_0x00b3;
            }
        L_0x00b3:
            r20 = r7
            goto L_0x016e
        L_0x00b7:
            r1.g(r12)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r5 = r0.f21696f
            r5 = r5[r2]
            if (r2 == r10) goto L_0x00c3
            java.lang.String r9 = "ImageLength"
            goto L_0x00c5
        L_0x00c3:
            java.lang.String r9 = "ThumbnailImageLength"
        L_0x00c5:
            int r11 = r22.readUnsignedShort()
            long r11 = (long) r11
            java.nio.ByteOrder r13 = r0.f21698h
            androidx.exifinterface.media.a$d r11 = androidx.exifinterface.media.a.d.f(r11, r13)
            r5.put(r9, r11)
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r5 = r0.f21696f
            r5 = r5[r2]
            if (r2 == r10) goto L_0x00dc
            java.lang.String r9 = "ImageWidth"
            goto L_0x00de
        L_0x00dc:
            java.lang.String r9 = "ThumbnailImageWidth"
        L_0x00de:
            int r10 = r22.readUnsignedShort()
            long r10 = (long) r10
            java.nio.ByteOrder r12 = r0.f21698h
            androidx.exifinterface.media.a$d r10 = androidx.exifinterface.media.a.d.f(r10, r12)
            r5.put(r9, r10)
            int r9 = r8 + -7
            goto L_0x00b3
        L_0x00ef:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            java.lang.String r8 = "UserComment"
            java.lang.String r9 = r0.g(r8)
            if (r9 != 0) goto L_0x010e
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r9 = r0.f21696f
            r9 = r9[r12]
            java.lang.String r10 = new java.lang.String
            java.nio.charset.Charset r11 = f21679p0
            r10.<init>(r5, r11)
            androidx.exifinterface.media.a$d r5 = androidx.exifinterface.media.a.d.e(r10)
            r9.put(r8, r5)
        L_0x010e:
            r20 = r7
        L_0x0110:
            r9 = r13
            goto L_0x016e
        L_0x0112:
            byte[] r5 = new byte[r9]
            r1.readFully(r5)
            int r8 = r3 + r9
            byte[] r10 = f21680q0
            boolean r11 = androidx.exifinterface.media.b.f(r5, r10)
            if (r11 == 0) goto L_0x013a
            int r11 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r11, r9)
            int r3 = r23 + r3
            int r9 = r10.length
            int r3 = r3 + r9
            r0.f21706p = r3
            r0.T(r5, r2)
            androidx.exifinterface.media.a$b r3 = new androidx.exifinterface.media.a$b
            r3.<init>((byte[]) r5)
            r0.g0(r3)
        L_0x0137:
            r20 = r7
            goto L_0x016c
        L_0x013a:
            byte[] r10 = f21681r0
            boolean r11 = androidx.exifinterface.media.b.f(r5, r10)
            if (r11 == 0) goto L_0x0137
            int r11 = r10.length
            int r3 = r3 + r11
            int r10 = r10.length
            byte[] r5 = java.util.Arrays.copyOfRange(r5, r10, r9)
            java.lang.String r9 = "Xmp"
            java.lang.String r10 = r0.g(r9)
            if (r10 != 0) goto L_0x0137
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r10 = r0.f21696f
            r10 = r10[r13]
            androidx.exifinterface.media.a$d r11 = new androidx.exifinterface.media.a$d
            int r15 = r5.length
            r20 = r7
            long r6 = (long) r3
            r3 = 1
            r14 = r11
            r16 = r15
            r15 = r3
            r17 = r6
            r19 = r5
            r14.<init>(r15, r16, r17, r19)
            r10.put(r9, r11)
            r0.f21711u = r12
        L_0x016c:
            r3 = r8
            goto L_0x0110
        L_0x016e:
            if (r9 < 0) goto L_0x0177
            r1.g(r9)
            int r3 = r3 + r9
            r6 = -1
            goto L_0x0037
        L_0x0177:
            java.io.IOException r1 = new java.io.IOException
            r2 = r20
            r1.<init>(r2)
            throw r1
        L_0x017f:
            r2 = r7
            java.io.IOException r1 = new java.io.IOException
            r1.<init>(r2)
            throw r1
        L_0x0186:
            java.nio.ByteOrder r2 = r0.f21698h
            r1.f(r2)
            return
        L_0x018c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid marker:"
            r2.append(r3)
            r3 = r5 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a9:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x01c4:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.l(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int l0(c cVar) {
        c cVar2 = cVar;
        e[][] eVarArr = f21673j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f21674k0) {
            V(eVar.f21727b);
        }
        if (this.f21699i) {
            if (this.f21700j) {
                V("StripOffsets");
                V("StripByteCounts");
            } else {
                V("JPEGInterchangeFormat");
                V("JPEGInterchangeFormatLength");
            }
        }
        for (int i10 = 0; i10 < f21673j0.length; i10++) {
            for (Object obj : this.f21696f[i10].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f21696f[i10].remove(entry.getKey());
                }
            }
        }
        if (!this.f21696f[1].isEmpty()) {
            this.f21696f[0].put(f21674k0[1].f21727b, d.f(0, this.f21698h));
        }
        if (!this.f21696f[2].isEmpty()) {
            this.f21696f[0].put(f21674k0[2].f21727b, d.f(0, this.f21698h));
        }
        if (!this.f21696f[3].isEmpty()) {
            this.f21696f[1].put(f21674k0[3].f21727b, d.f(0, this.f21698h));
        }
        if (this.f21699i) {
            if (this.f21700j) {
                this.f21696f[4].put("StripOffsets", d.j(0, this.f21698h));
                this.f21696f[4].put("StripByteCounts", d.j(this.f21703m, this.f21698h));
            } else {
                this.f21696f[4].put("JPEGInterchangeFormat", d.f(0, this.f21698h));
                this.f21696f[4].put("JPEGInterchangeFormatLength", d.f((long) this.f21703m, this.f21698h));
            }
        }
        for (int i11 = 0; i11 < f21673j0.length; i11++) {
            int i12 = 0;
            for (Map.Entry<String, d> value : this.f21696f[i11].entrySet()) {
                int p10 = ((d) value.getValue()).p();
                if (p10 > 4) {
                    i12 += p10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < f21673j0.length; i14++) {
            if (!this.f21696f[i14].isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f21696f[i14].size() * 12) + 6 + iArr2[i14];
            }
        }
        if (this.f21699i) {
            if (this.f21700j) {
                this.f21696f[4].put("StripOffsets", d.j(i13, this.f21698h));
            } else {
                this.f21696f[4].put("JPEGInterchangeFormat", d.f((long) i13, this.f21698h));
            }
            this.f21702l = i13;
            i13 += this.f21703m;
        }
        if (this.f21694d == 4) {
            i13 += 8;
        }
        if (f21685v) {
            for (int i15 = 0; i15 < f21673j0.length; i15++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", new Object[]{Integer.valueOf(i15), Integer.valueOf(iArr[i15]), Integer.valueOf(this.f21696f[i15].size()), Integer.valueOf(iArr2[i15]), Integer.valueOf(i13)}));
            }
        }
        if (!this.f21696f[1].isEmpty()) {
            this.f21696f[0].put(f21674k0[1].f21727b, d.f((long) iArr[1], this.f21698h));
        }
        if (!this.f21696f[2].isEmpty()) {
            this.f21696f[0].put(f21674k0[2].f21727b, d.f((long) iArr[2], this.f21698h));
        }
        if (!this.f21696f[3].isEmpty()) {
            this.f21696f[1].put(f21674k0[3].f21727b, d.f((long) iArr[3], this.f21698h));
        }
        int i16 = this.f21694d;
        if (i16 != 4) {
            if (i16 == 13) {
                cVar2.e(i13);
                cVar2.write(f21646I);
            } else if (i16 == 14) {
                cVar2.write(f21651N);
                cVar2.e(i13);
            }
        } else if (i13 <= 65535) {
            cVar2.h(i13);
            cVar2.write(f21680q0);
        } else {
            throw new IllegalStateException("Size of exif data (" + i13 + " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)");
        }
        cVar2.f(this.f21698h == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        cVar2.c(this.f21698h);
        cVar2.h(42);
        cVar2.g(8);
        for (int i17 = 0; i17 < f21673j0.length; i17++) {
            if (!this.f21696f[i17].isEmpty()) {
                cVar2.h(this.f21696f[i17].size());
                int size = iArr[i17] + 2 + (this.f21696f[i17].size() * 12) + 4;
                for (Map.Entry next : this.f21696f[i17].entrySet()) {
                    int i18 = f21676m0[i17].get(next.getKey()).f21726a;
                    d dVar = (d) next.getValue();
                    int p11 = dVar.p();
                    cVar2.h(i18);
                    cVar2.h(dVar.f21722a);
                    cVar2.e(dVar.f21723b);
                    if (p11 > 4) {
                        cVar2.g((long) size);
                        size += p11;
                    } else {
                        cVar2.write(dVar.f21725d);
                        if (p11 < 4) {
                            while (p11 < 4) {
                                cVar2.d(0);
                                p11++;
                            }
                        }
                    }
                }
                if (i17 != 0 || this.f21696f[4].isEmpty()) {
                    cVar2.g(0);
                } else {
                    cVar2.g((long) iArr[4]);
                }
                for (Map.Entry<String, d> value2 : this.f21696f[i17].entrySet()) {
                    byte[] bArr = ((d) value2.getValue()).f21725d;
                    if (bArr.length > 4) {
                        cVar2.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f21699i) {
            cVar2.write(w());
        }
        if (this.f21694d == 14 && i13 % 2 == 1) {
            cVar2.d(0);
        }
        cVar2.c(ByteOrder.BIG_ENDIAN);
        return i13;
    }

    private int n(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (F(bArr)) {
            return 4;
        }
        if (I(bArr)) {
            return 9;
        }
        if (E(bArr)) {
            return 12;
        }
        if (G(bArr)) {
            return 7;
        }
        if (J(bArr)) {
            return 10;
        }
        if (H(bArr)) {
            return 13;
        }
        return O(bArr) ? 14 : 0;
    }

    private void o(g gVar) {
        int i10;
        int i11;
        r(gVar);
        d dVar = this.f21696f[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f21725d);
            gVar2.f(this.f21698h);
            byte[] bArr = f21643F;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.h(0);
            byte[] bArr3 = f21644G;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.h(8);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.h(12);
            }
            U(gVar2, 6);
            d dVar2 = this.f21696f[7].get("PreviewImageStart");
            d dVar3 = this.f21696f[7].get("PreviewImageLength");
            if (!(dVar2 == null || dVar3 == null)) {
                this.f21696f[5].put("JPEGInterchangeFormat", dVar2);
                this.f21696f[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = this.f21696f[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.o(this.f21698h);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 > i13 && (i10 = iArr[3]) > (i11 = iArr[1])) {
                    int i14 = (i12 - i13) + 1;
                    int i15 = (i10 - i11) + 1;
                    if (i14 < i15) {
                        int i16 = i14 + i15;
                        i15 = i16 - i15;
                        i14 = i16 - i15;
                    }
                    d j10 = d.j(i14, this.f21698h);
                    d j11 = d.j(i15, this.f21698h);
                    this.f21696f[0].put("ImageWidth", j10);
                    this.f21696f[0].put("ImageLength", j11);
                }
            }
        }
    }

    private void p(b bVar) {
        if (f21685v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.BIG_ENDIAN);
        byte[] bArr = f21645H;
        bVar.g(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = bVar.readInt();
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int i10 = length + 8;
                if (i10 == 16) {
                    if (!Arrays.equals(bArr2, f21647J)) {
                        throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                    }
                }
                if (!Arrays.equals(bArr2, f21648K)) {
                    if (Arrays.equals(bArr2, f21646I)) {
                        byte[] bArr3 = new byte[readInt];
                        bVar.readFully(bArr3);
                        int readInt2 = bVar.readInt();
                        CRC32 crc32 = new CRC32();
                        crc32.update(bArr2);
                        crc32.update(bArr3);
                        if (((int) crc32.getValue()) == readInt2) {
                            this.f21706p = i10;
                            T(bArr3, 0);
                            k0();
                            g0(new b(bArr3));
                            return;
                        }
                        throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                    }
                    int i11 = readInt + 4;
                    bVar.g(i11);
                    length = i10 + i11;
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void q(b bVar) {
        boolean z10 = f21685v;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.g(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.readFully(bArr);
        bVar.readFully(bArr2);
        bVar.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        bVar.g(i10 - bVar.d());
        bVar.readFully(bArr4);
        l(new b(bArr4), i10, 5);
        bVar.g(i12 - bVar.d());
        bVar.f(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z10) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i13 = 0; i13 < readInt; i13++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f21668e0.f21726a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j10 = d.j(readShort, this.f21698h);
                d j11 = d.j(readShort2, this.f21698h);
                this.f21696f[0].put("ImageLength", j10);
                this.f21696f[0].put("ImageWidth", j11);
                if (f21685v) {
                    Log.d("ExifInterface", "Updated to length: " + readShort + ", width: " + readShort2);
                    return;
                }
                return;
            }
            bVar.g(readUnsignedShort2);
        }
    }

    private void r(g gVar) {
        d dVar;
        Q(gVar);
        U(gVar, 0);
        j0(gVar, 0);
        j0(gVar, 5);
        j0(gVar, 4);
        k0();
        if (this.f21694d == 8 && (dVar = this.f21696f[1].get("MakerNote")) != null) {
            g gVar2 = new g(dVar.f21725d);
            gVar2.f(this.f21698h);
            gVar2.g(6);
            U(gVar2, 9);
            d dVar2 = this.f21696f[9].get("ColorSpace");
            if (dVar2 != null) {
                this.f21696f[1].put("ColorSpace", dVar2);
            }
        }
    }

    private void t(g gVar) {
        if (f21685v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        r(gVar);
        d dVar = this.f21696f[0].get("JpgFromRaw");
        if (dVar != null) {
            l(new b(dVar.f21725d), (int) dVar.f21724c, 5);
        }
        d dVar2 = this.f21696f[0].get("ISO");
        d dVar3 = this.f21696f[1].get("PhotographicSensitivity");
        if (dVar2 != null && dVar3 == null) {
            this.f21696f[1].put("PhotographicSensitivity", dVar2);
        }
    }

    private void u(g gVar) {
        byte[] bArr = f21680q0;
        gVar.g(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f21706p = bArr.length;
        T(bArr2, 0);
    }

    private void x(b bVar) {
        if (f21685v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.f(ByteOrder.LITTLE_ENDIAN);
        bVar.g(f21649L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = f21650M;
        bVar.g(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                bVar.readFully(bArr2);
                int readInt2 = bVar.readInt();
                int i10 = length + 8;
                if (Arrays.equals(f21651N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    bVar.readFully(bArr3);
                    this.f21706p = i10;
                    T(bArr3, 0);
                    g0(new b(bArr3));
                    return;
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i10 + readInt2;
                if (length != readInt) {
                    if (length <= readInt) {
                        bVar.g(readInt2);
                    } else {
                        throw new IOException("Encountered WebP file with invalid chunk size");
                    }
                } else {
                    return;
                }
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        java.lang.Double.parseDouble(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x014a, code lost:
        return new android.util.Pair<>(12, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0150, code lost:
        return new android.util.Pair<>(2, -1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair<java.lang.Integer, java.lang.Integer> y(java.lang.String r10) {
        /*
            java.lang.String r0 = ","
            boolean r1 = r10.contains(r0)
            r2 = 0
            r3 = 1
            r4 = 2
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = -1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L_0x00a6
            java.lang.String[] r10 = r10.split(r0, r6)
            r0 = r10[r2]
            android.util.Pair r0 = y(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != r4) goto L_0x0029
            return r0
        L_0x0029:
            int r1 = r10.length
            if (r3 >= r1) goto L_0x00a5
            r1 = r10[r3]
            android.util.Pair r1 = y(r1)
            java.lang.Object r2 = r1.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x004d
            java.lang.Object r2 = r1.second
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.Object r4 = r0.first
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x004b
            goto L_0x004d
        L_0x004b:
            r2 = r6
            goto L_0x0055
        L_0x004d:
            java.lang.Object r2 = r0.first
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
        L_0x0055:
            java.lang.Object r4 = r0.second
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 == r6) goto L_0x0080
            java.lang.Object r4 = r1.first
            java.lang.Integer r4 = (java.lang.Integer) r4
            java.lang.Object r8 = r0.second
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x0077
            java.lang.Object r1 = r1.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.Object r4 = r0.second
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0080
        L_0x0077:
            java.lang.Object r1 = r0.second
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            goto L_0x0081
        L_0x0080:
            r1 = r6
        L_0x0081:
            if (r2 != r6) goto L_0x008b
            if (r1 != r6) goto L_0x008b
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x008b:
            if (r2 != r6) goto L_0x0097
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.<init>(r1, r7)
            goto L_0x00a2
        L_0x0097:
            if (r1 != r6) goto L_0x00a2
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.<init>(r1, r7)
        L_0x00a2:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x00a5:
            return r0
        L_0x00a6:
            java.lang.String r0 = "/"
            boolean r1 = r10.contains(r0)
            r8 = 0
            if (r1 == 0) goto L_0x0105
            java.lang.String[] r10 = r10.split(r0, r6)
            int r0 = r10.length
            if (r0 != r4) goto L_0x00ff
            r0 = r10[r2]     // Catch:{ NumberFormatException -> 0x00ff }
            double r0 = java.lang.Double.parseDouble(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            long r0 = (long) r0     // Catch:{ NumberFormatException -> 0x00ff }
            r10 = r10[r3]     // Catch:{ NumberFormatException -> 0x00ff }
            double r2 = java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x00ff }
            long r2 = (long) r2     // Catch:{ NumberFormatException -> 0x00ff }
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r4 = 10
            if (r10 < 0) goto L_0x00f5
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00d0
            goto L_0x00f5
        L_0x00d0:
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r10 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r0 = 5
            if (r10 > 0) goto L_0x00eb
            int r10 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x00dd
            goto L_0x00eb
        L_0x00dd:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r1, r0)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00eb:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00f5:
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x00ff }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ NumberFormatException -> 0x00ff }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x00ff }
            return r10
        L_0x00ff:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        L_0x0105:
            long r0 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x013c }
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            r3 = 4
            if (r2 < 0) goto L_0x0124
            r8 = 65535(0xffff, double:3.23786E-319)
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 > 0) goto L_0x0124
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r2)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0124:
            if (r2 >= 0) goto L_0x0132
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            r1 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x0132:
            android.util.Pair r0 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x013c }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch:{ NumberFormatException -> 0x013c }
            r0.<init>(r1, r7)     // Catch:{ NumberFormatException -> 0x013c }
            return r0
        L_0x013c:
            java.lang.Double.parseDouble(r10)     // Catch:{ NumberFormatException -> 0x014b }
            android.util.Pair r10 = new android.util.Pair     // Catch:{ NumberFormatException -> 0x014b }
            r0 = 12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x014b }
            r10.<init>(r0, r7)     // Catch:{ NumberFormatException -> 0x014b }
            return r10
        L_0x014b:
            android.util.Pair r10 = new android.util.Pair
            r10.<init>(r5, r7)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.y(java.lang.String):android.util.Pair");
    }

    private void z(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar != null && dVar2 != null) {
            int m10 = dVar.m(this.f21698h);
            int m11 = dVar2.m(this.f21698h);
            if (this.f21694d == 7) {
                m10 += this.f21707q;
            }
            if (m10 > 0 && m11 > 0) {
                this.f21699i = true;
                if (this.f21691a == null && this.f21693c == null && this.f21692b == null) {
                    byte[] bArr = new byte[m11];
                    bVar.g(m10);
                    bVar.readFully(bArr);
                    this.f21704n = bArr;
                }
                this.f21702l = m10;
                this.f21703m = m11;
            }
            if (f21685v) {
                Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m10 + ", length: " + m11);
            }
        }
    }

    public boolean D() {
        int i10 = i("Orientation", 1);
        return i10 == 2 || i10 == 7 || i10 == 4 || i10 == 5;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v24, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v25, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.io.OutputStream, java.io.Closeable, java.io.FileOutputStream] */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0152, code lost:
        r2.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0084, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        r7 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0089, code lost:
        r8 = null;
        r9 = null;
        r1 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00de, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x00df, code lost:
        r9 = null;
        r1 = r6;
        r6 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00f1, code lost:
        androidx.exifinterface.media.b.a.c(r13.f21692b, 0, android.system.OsConstants.SEEK_SET);
        r1 = new java.io.FileOutputStream(r13.f21692b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0106, code lost:
        r1 = new java.io.FileOutputStream(r13.f21691a);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0084 A[Catch:{ Exception -> 0x0088, all -> 0x0084 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:31:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f1 A[Catch:{ Exception -> 0x0104, all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0106 A[Catch:{ Exception -> 0x0104, all -> 0x0101 }] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Y() {
        /*
            r13 = this;
            int r0 = r13.f21694d
            boolean r0 = M(r0)
            if (r0 == 0) goto L_0x0172
            java.io.FileDescriptor r0 = r13.f21692b
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = r13.f21691a
            if (r0 == 0) goto L_0x0011
            goto L_0x0019
        L_0x0011:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes for the current input."
            r0.<init>(r1)
            throw r0
        L_0x0019:
            boolean r0 = r13.f21699i
            if (r0 == 0) goto L_0x002e
            boolean r0 = r13.f21700j
            if (r0 == 0) goto L_0x002e
            boolean r0 = r13.f21701k
            if (r0 == 0) goto L_0x0026
            goto L_0x002e
        L_0x0026:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips"
            r0.<init>(r1)
            throw r0
        L_0x002e:
            r0 = 1
            r13.f21710t = r0
            byte[] r1 = r13.v()
            r13.f21704n = r1
            r1 = 0
            java.lang.String r2 = "temp"
            java.lang.String r3 = "tmp"
            java.io.File r2 = java.io.File.createTempFile(r2, r3)     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            java.lang.String r3 = r13.f21691a     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            r4 = 0
            if (r3 == 0) goto L_0x0056
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            java.lang.String r6 = r13.f21691a     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            goto L_0x0064
        L_0x004e:
            r0 = move-exception
            r6 = r1
            goto L_0x016b
        L_0x0052:
            r0 = move-exception
            r6 = r1
            goto L_0x0162
        L_0x0056:
            java.io.FileDescriptor r3 = r13.f21692b     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            int r6 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            androidx.exifinterface.media.b.a.c(r3, r4, r6)     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            java.io.FileDescriptor r6 = r13.f21692b     // Catch:{ Exception -> 0x0052, all -> 0x004e }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0052, all -> 0x004e }
        L_0x0064:
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            r6.<init>(r2)     // Catch:{ Exception -> 0x015f, all -> 0x015c }
            androidx.exifinterface.media.b.d(r3, r6)     // Catch:{ Exception -> 0x0159, all -> 0x0156 }
            androidx.exifinterface.media.b.b(r3)
            androidx.exifinterface.media.b.b(r6)
            r3 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00e4, all -> 0x0084 }
            r6.<init>(r2)     // Catch:{ Exception -> 0x00e4, all -> 0x0084 }
            java.lang.String r7 = r13.f21691a     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            if (r7 == 0) goto L_0x0090
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            java.lang.String r8 = r13.f21691a     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            goto L_0x009e
        L_0x0084:
            r0 = move-exception
            r9 = r1
            goto L_0x014a
        L_0x0088:
            r7 = move-exception
            r8 = r1
            r9 = r8
            r1 = r6
        L_0x008c:
            r6 = r7
            r7 = r9
            goto L_0x00e8
        L_0x0090:
            java.io.FileDescriptor r7 = r13.f21692b     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            int r8 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            androidx.exifinterface.media.b.a.c(r7, r4, r8)     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            java.io.FileDescriptor r8 = r13.f21692b     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0088, all -> 0x0084 }
        L_0x009e:
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00de, all -> 0x0084 }
            r8.<init>(r6)     // Catch:{ Exception -> 0x00de, all -> 0x0084 }
            java.io.BufferedOutputStream r9 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            r9.<init>(r7)     // Catch:{ Exception -> 0x00d8, all -> 0x00d5 }
            int r10 = r13.f21694d     // Catch:{ Exception -> 0x00b5 }
            r11 = 4
            if (r10 != r11) goto L_0x00ba
            r13.Z(r8, r9)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00c9
        L_0x00b1:
            r0 = move-exception
        L_0x00b2:
            r1 = r8
            goto L_0x014a
        L_0x00b5:
            r1 = move-exception
            r12 = r6
            r6 = r1
            r1 = r12
            goto L_0x00e8
        L_0x00ba:
            r11 = 13
            if (r10 != r11) goto L_0x00c2
            r13.a0(r8, r9)     // Catch:{ Exception -> 0x00b5 }
            goto L_0x00c9
        L_0x00c2:
            r11 = 14
            if (r10 != r11) goto L_0x00c9
            r13.b0(r8, r9)     // Catch:{ Exception -> 0x00b5 }
        L_0x00c9:
            androidx.exifinterface.media.b.b(r8)
            androidx.exifinterface.media.b.b(r9)
            r2.delete()
            r13.f21704n = r1
            return
        L_0x00d5:
            r0 = move-exception
            r9 = r1
            goto L_0x00b2
        L_0x00d8:
            r9 = move-exception
            r12 = r9
            r9 = r1
            r1 = r6
            r6 = r12
            goto L_0x00e8
        L_0x00de:
            r8 = move-exception
            r9 = r1
            r1 = r6
            r6 = r8
            r8 = r9
            goto L_0x00e8
        L_0x00e4:
            r7 = move-exception
            r8 = r1
            r9 = r8
            goto L_0x008c
        L_0x00e8:
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            r10.<init>(r2)     // Catch:{ Exception -> 0x0121, all -> 0x011f }
            java.lang.String r1 = r13.f21691a     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            if (r1 != 0) goto L_0x0106
            java.io.FileDescriptor r1 = r13.f21692b     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            int r11 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            androidx.exifinterface.media.b.a.c(r1, r4, r11)     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            java.io.FileDescriptor r4 = r13.f21692b     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
        L_0x00ff:
            r7 = r1
            goto L_0x010e
        L_0x0101:
            r0 = move-exception
        L_0x0102:
            r1 = r10
            goto L_0x0143
        L_0x0104:
            r1 = move-exception
            goto L_0x0124
        L_0x0106:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            java.lang.String r4 = r13.f21691a     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            goto L_0x00ff
        L_0x010e:
            androidx.exifinterface.media.b.d(r10, r7)     // Catch:{ Exception -> 0x0104, all -> 0x0101 }
            androidx.exifinterface.media.b.b(r10)     // Catch:{ all -> 0x00b1 }
            androidx.exifinterface.media.b.b(r7)     // Catch:{ all -> 0x00b1 }
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00b1 }
            java.lang.String r1 = "Failed to save new file"
            r0.<init>(r1, r6)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x011f:
            r0 = move-exception
            goto L_0x0143
        L_0x0121:
            r3 = move-exception
            r10 = r1
            r1 = r3
        L_0x0124:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ all -> 0x013f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x013f }
            r4.<init>()     // Catch:{ all -> 0x013f }
            java.lang.String r5 = "Failed to save new file. Original file is stored in "
            r4.append(r5)     // Catch:{ all -> 0x013f }
            java.lang.String r5 = r2.getAbsolutePath()     // Catch:{ all -> 0x013f }
            r4.append(r5)     // Catch:{ all -> 0x013f }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x013f }
            r3.<init>(r4, r1)     // Catch:{ all -> 0x013f }
            throw r3     // Catch:{ all -> 0x013f }
        L_0x013f:
            r1 = move-exception
            r3 = r0
            r0 = r1
            goto L_0x0102
        L_0x0143:
            androidx.exifinterface.media.b.b(r1)     // Catch:{ all -> 0x00b1 }
            androidx.exifinterface.media.b.b(r7)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x014a:
            androidx.exifinterface.media.b.b(r1)
            androidx.exifinterface.media.b.b(r9)
            if (r3 != 0) goto L_0x0155
            r2.delete()
        L_0x0155:
            throw r0
        L_0x0156:
            r0 = move-exception
        L_0x0157:
            r1 = r3
            goto L_0x016b
        L_0x0159:
            r0 = move-exception
        L_0x015a:
            r1 = r3
            goto L_0x0162
        L_0x015c:
            r0 = move-exception
            r6 = r1
            goto L_0x0157
        L_0x015f:
            r0 = move-exception
            r6 = r1
            goto L_0x015a
        L_0x0162:
            java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x016a }
            java.lang.String r3 = "Failed to copy original file to temp file"
            r2.<init>(r3, r0)     // Catch:{ all -> 0x016a }
            throw r2     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
        L_0x016b:
            androidx.exifinterface.media.b.b(r1)
            androidx.exifinterface.media.b.b(r6)
            throw r0
        L_0x0172:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.Y():void");
    }

    public void c0(double d10) {
        String str = d10 >= 0.0d ? "0" : "1";
        d0("GPSAltitude", new f(Math.abs(d10)).toString());
        d0("GPSAltitudeRef", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0295, code lost:
        r15 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d0(java.lang.String r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            if (r1 == 0) goto L_0x0365
            java.lang.String r3 = "DateTime"
            boolean r3 = r3.equals(r1)
            java.lang.String r4 = " : "
            java.lang.String r5 = "Invalid value for "
            java.lang.String r6 = "ExifInterface"
            if (r3 != 0) goto L_0x0026
            java.lang.String r3 = "DateTimeOriginal"
            boolean r3 = r3.equals(r1)
            if (r3 != 0) goto L_0x0026
            java.lang.String r3 = "DateTimeDigitized"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x006d
        L_0x0026:
            if (r2 == 0) goto L_0x006d
            java.util.regex.Pattern r3 = f21684u0
            java.util.regex.Matcher r3 = r3.matcher(r2)
            boolean r3 = r3.find()
            java.util.regex.Pattern r7 = f21686v0
            java.util.regex.Matcher r7 = r7.matcher(r2)
            boolean r7 = r7.find()
            int r8 = r19.length()
            r9 = 19
            if (r8 != r9) goto L_0x0054
            if (r3 != 0) goto L_0x0049
            if (r7 != 0) goto L_0x0049
            goto L_0x0054
        L_0x0049:
            if (r7 == 0) goto L_0x006d
            java.lang.String r3 = "-"
            java.lang.String r7 = ":"
            java.lang.String r2 = r2.replaceAll(r3, r7)
            goto L_0x006d
        L_0x0054:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r6, r1)
            return
        L_0x006d:
            java.lang.String r3 = "ISOSpeedRatings"
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0080
            boolean r1 = f21685v
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY."
            android.util.Log.d(r6, r1)
        L_0x007e:
            java.lang.String r1 = "PhotographicSensitivity"
        L_0x0080:
            r3 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0119
            java.util.HashSet<java.lang.String> r8 = f21677n0
            boolean r8 = r8.contains(r1)
            if (r8 == 0) goto L_0x0119
            java.lang.String r8 = "GPSTimeStamp"
            boolean r8 = r1.equals(r8)
            if (r8 == 0) goto L_0x00f2
            java.util.regex.Pattern r8 = f21683t0
            java.util.regex.Matcher r8 = r8.matcher(r2)
            boolean r9 = r8.find()
            if (r9 != 0) goto L_0x00b9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r6, r1)
            return
        L_0x00b9:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r8.group(r7)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1,"
            r2.append(r4)
            java.lang.String r5 = r8.group(r3)
            int r5 = java.lang.Integer.parseInt(r5)
            r2.append(r5)
            r2.append(r4)
            r4 = 3
            java.lang.String r4 = r8.group(r4)
            int r4 = java.lang.Integer.parseInt(r4)
            r2.append(r4)
            java.lang.String r4 = "/1"
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            goto L_0x0119
        L_0x00f2:
            double r8 = java.lang.Double.parseDouble(r2)     // Catch:{ NumberFormatException -> 0x0100 }
            androidx.exifinterface.media.a$f r10 = new androidx.exifinterface.media.a$f     // Catch:{ NumberFormatException -> 0x0100 }
            r10.<init>(r8)     // Catch:{ NumberFormatException -> 0x0100 }
            java.lang.String r2 = r10.toString()     // Catch:{ NumberFormatException -> 0x0100 }
            goto L_0x0119
        L_0x0100:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r1)
            r3.append(r4)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            android.util.Log.w(r6, r1)
            return
        L_0x0119:
            r4 = 0
            r5 = r4
        L_0x011b:
            androidx.exifinterface.media.a$e[][] r8 = f21673j0
            int r8 = r8.length
            if (r5 >= r8) goto L_0x0364
            r8 = 4
            if (r5 != r8) goto L_0x012a
            boolean r8 = r0.f21699i
            if (r8 != 0) goto L_0x012a
        L_0x0127:
            r15 = r7
            goto L_0x035d
        L_0x012a:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$e>[] r8 = f21676m0
            r8 = r8[r5]
            java.lang.Object r8 = r8.get(r1)
            androidx.exifinterface.media.a$e r8 = (androidx.exifinterface.media.a.e) r8
            if (r8 == 0) goto L_0x0127
            if (r2 != 0) goto L_0x0140
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r8 = r0.f21696f
            r8 = r8[r5]
            r8.remove(r1)
            goto L_0x0127
        L_0x0140:
            android.util.Pair r9 = y(r2)
            int r10 = r8.f21728c
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r12 = -1
            if (r10 == r11) goto L_0x0210
            int r10 = r8.f21728c
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x015f
            goto L_0x0210
        L_0x015f:
            int r10 = r8.f21729d
            if (r10 == r12) goto L_0x017d
            java.lang.Object r11 = r9.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 == r11) goto L_0x0179
            int r10 = r8.f21729d
            java.lang.Object r11 = r9.second
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r10 != r11) goto L_0x017d
        L_0x0179:
            int r8 = r8.f21729d
            goto L_0x0212
        L_0x017d:
            int r10 = r8.f21728c
            if (r10 == r7) goto L_0x020e
            r11 = 7
            if (r10 == r11) goto L_0x020e
            if (r10 != r3) goto L_0x0188
            goto L_0x020e
        L_0x0188:
            boolean r10 = f21685v
            if (r10 == 0) goto L_0x0127
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Given tag ("
            r10.append(r11)
            r10.append(r1)
            java.lang.String r11 = ") value didn't match with one of expected formats: "
            r10.append(r11)
            java.lang.String[] r11 = f21660W
            int r13 = r8.f21728c
            r13 = r11[r13]
            r10.append(r13)
            int r13 = r8.f21729d
            java.lang.String r14 = ", "
            java.lang.String r15 = ""
            if (r13 != r12) goto L_0x01b1
            r8 = r15
            goto L_0x01c4
        L_0x01b1:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r14)
            int r8 = r8.f21729d
            r8 = r11[r8]
            r13.append(r8)
            java.lang.String r8 = r13.toString()
        L_0x01c4:
            r10.append(r8)
            java.lang.String r8 = " (guess: "
            r10.append(r8)
            java.lang.Object r8 = r9.first
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r8 = r11[r8]
            r10.append(r8)
            java.lang.Object r8 = r9.second
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            if (r8 != r12) goto L_0x01e4
            goto L_0x01fd
        L_0x01e4:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r14)
            java.lang.Object r9 = r9.second
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r9 = r11[r9]
            r8.append(r9)
            java.lang.String r15 = r8.toString()
        L_0x01fd:
            r10.append(r15)
            java.lang.String r8 = ")"
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            android.util.Log.d(r6, r8)
            goto L_0x0127
        L_0x020e:
            r8 = r10
            goto L_0x0212
        L_0x0210:
            int r8 = r8.f21728c
        L_0x0212:
            java.lang.String r9 = "/"
            java.lang.String r10 = ","
            switch(r8) {
                case 1: goto L_0x0351;
                case 2: goto L_0x0344;
                case 3: goto L_0x031e;
                case 4: goto L_0x02f8;
                case 5: goto L_0x02bc;
                case 6: goto L_0x0219;
                case 7: goto L_0x0344;
                case 8: goto L_0x0219;
                case 9: goto L_0x0298;
                case 10: goto L_0x0258;
                case 11: goto L_0x0219;
                case 12: goto L_0x0233;
                default: goto L_0x0219;
            }
        L_0x0219:
            boolean r9 = f21685v
            if (r9 == 0) goto L_0x0127
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "Data format isn't one of expected formats: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.d(r6, r8)
            goto L_0x0127
        L_0x0233:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r9 = r8.length
            double[] r9 = new double[r9]
            r10 = r4
        L_0x023b:
            int r11 = r8.length
            if (r10 >= r11) goto L_0x0249
            r11 = r8[r10]
            double r11 = java.lang.Double.parseDouble(r11)
            r9[r10] = r11
            int r10 = r10 + 1
            goto L_0x023b
        L_0x0249:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r8 = r0.f21696f
            r8 = r8[r5]
            java.nio.ByteOrder r10 = r0.f21698h
            androidx.exifinterface.media.a$d r9 = androidx.exifinterface.media.a.d.b(r9, r10)
            r8.put(r1, r9)
            goto L_0x0127
        L_0x0258:
            java.lang.String[] r8 = r2.split(r10, r12)
            int r10 = r8.length
            androidx.exifinterface.media.a$f[] r10 = new androidx.exifinterface.media.a.f[r10]
            r11 = r4
        L_0x0260:
            int r13 = r8.length
            if (r11 >= r13) goto L_0x0288
            r13 = r8[r11]
            java.lang.String[] r13 = r13.split(r9, r12)
            androidx.exifinterface.media.a$f r14 = new androidx.exifinterface.media.a$f
            r15 = r13[r4]
            double r3 = java.lang.Double.parseDouble(r15)
            long r3 = (long) r3
            r13 = r13[r7]
            r16 = r8
            double r7 = java.lang.Double.parseDouble(r13)
            long r7 = (long) r7
            r14.<init>(r3, r7)
            r10[r11] = r14
            int r11 = r11 + 1
            r8 = r16
            r3 = 2
            r4 = 0
            r7 = 1
            goto L_0x0260
        L_0x0288:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f21696f
            r3 = r3[r5]
            java.nio.ByteOrder r4 = r0.f21698h
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.a.d.d(r10, r4)
            r3.put(r1, r4)
        L_0x0295:
            r15 = 1
            goto L_0x035d
        L_0x0298:
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x02a0:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02ae
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x02a0
        L_0x02ae:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f21696f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f21698h
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.a.d.c(r4, r7)
            r3.put(r1, r4)
            goto L_0x0295
        L_0x02bc:
            java.lang.String[] r3 = r2.split(r10, r12)
            int r4 = r3.length
            androidx.exifinterface.media.a$f[] r4 = new androidx.exifinterface.media.a.f[r4]
            r7 = 0
        L_0x02c4:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x02e8
            r8 = r3[r7]
            java.lang.String[] r8 = r8.split(r9, r12)
            androidx.exifinterface.media.a$f r10 = new androidx.exifinterface.media.a$f
            r11 = 0
            r13 = r8[r11]
            double r13 = java.lang.Double.parseDouble(r13)
            long r13 = (long) r13
            r15 = 1
            r8 = r8[r15]
            double r11 = java.lang.Double.parseDouble(r8)
            long r11 = (long) r11
            r10.<init>(r13, r11)
            r4[r7] = r10
            int r7 = r7 + 1
            r12 = -1
            goto L_0x02c4
        L_0x02e8:
            r15 = 1
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f21696f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f21698h
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.a.d.i(r4, r7)
            r3.put(r1, r4)
            goto L_0x035d
        L_0x02f8:
            r15 = r7
            r3 = r12
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            long[] r4 = new long[r4]
            r7 = 0
        L_0x0302:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x0310
            r8 = r3[r7]
            long r8 = java.lang.Long.parseLong(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x0302
        L_0x0310:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f21696f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f21698h
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.a.d.g(r4, r7)
            r3.put(r1, r4)
            goto L_0x035d
        L_0x031e:
            r15 = r7
            r3 = r12
            java.lang.String[] r3 = r2.split(r10, r3)
            int r4 = r3.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x0328:
            int r8 = r3.length
            if (r7 >= r8) goto L_0x0336
            r8 = r3[r7]
            int r8 = java.lang.Integer.parseInt(r8)
            r4[r7] = r8
            int r7 = r7 + 1
            goto L_0x0328
        L_0x0336:
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f21696f
            r3 = r3[r5]
            java.nio.ByteOrder r7 = r0.f21698h
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.a.d.k(r4, r7)
            r3.put(r1, r4)
            goto L_0x035d
        L_0x0344:
            r15 = r7
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f21696f
            r3 = r3[r5]
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.a.d.e(r2)
            r3.put(r1, r4)
            goto L_0x035d
        L_0x0351:
            r15 = r7
            java.util.HashMap<java.lang.String, androidx.exifinterface.media.a$d>[] r3 = r0.f21696f
            r3 = r3[r5]
            androidx.exifinterface.media.a$d r4 = androidx.exifinterface.media.a.d.a(r2)
            r3.put(r1, r4)
        L_0x035d:
            int r5 = r5 + 1
            r7 = r15
            r3 = 2
            r4 = 0
            goto L_0x011b
        L_0x0364:
            return
        L_0x0365:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r2 = "tag shouldn't be null"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d0(java.lang.String, java.lang.String):void");
    }

    public void e0(Location location) {
        if (location != null) {
            d0("GPSProcessingMethod", location.getProvider());
            f0(location.getLatitude(), location.getLongitude());
            c0(location.getAltitude());
            d0("GPSSpeedRef", "K");
            d0("GPSSpeed", new f((double) ((location.getSpeed() * ((float) TimeUnit.HOURS.toSeconds(1))) / 1000.0f)).toString());
            String[] split = f21658U.format(new Date(location.getTime())).split("\\s+", -1);
            d0("GPSDateStamp", split[0]);
            d0("GPSTimeStamp", split[1]);
        }
    }

    public double f(double d10) {
        double h10 = h("GPSAltitude", -1.0d);
        int i10 = -1;
        int i11 = i("GPSAltitudeRef", -1);
        if (h10 < 0.0d || i11 < 0) {
            return d10;
        }
        if (i11 != 1) {
            i10 = 1;
        }
        return h10 * ((double) i10);
    }

    public void f0(double d10, double d11) {
        if (d10 < -90.0d || d10 > 90.0d || Double.isNaN(d10)) {
            throw new IllegalArgumentException("Latitude value " + d10 + " is not valid.");
        } else if (d11 < -180.0d || d11 > 180.0d || Double.isNaN(d11)) {
            throw new IllegalArgumentException("Longitude value " + d11 + " is not valid.");
        } else {
            d0("GPSLatitudeRef", d10 >= 0.0d ? "N" : "S");
            d0("GPSLatitude", b(Math.abs(d10)));
            d0("GPSLongitudeRef", d11 >= 0.0d ? "E" : "W");
            d0("GPSLongitude", b(Math.abs(d11)));
        }
    }

    public String g(String str) {
        if (str != null) {
            d j10 = j(str);
            if (j10 != null) {
                if (!f21677n0.contains(str)) {
                    return j10.n(this.f21698h);
                }
                if (str.equals("GPSTimeStamp")) {
                    int i10 = j10.f21722a;
                    if (i10 == 5 || i10 == 10) {
                        f[] fVarArr = (f[]) j10.o(this.f21698h);
                        if (fVarArr == null || fVarArr.length != 3) {
                            Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                            return null;
                        }
                        f fVar = fVarArr[0];
                        Integer valueOf = Integer.valueOf((int) (((float) fVar.f21730a) / ((float) fVar.f21731b)));
                        f fVar2 = fVarArr[1];
                        Integer valueOf2 = Integer.valueOf((int) (((float) fVar2.f21730a) / ((float) fVar2.f21731b)));
                        f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", new Object[]{valueOf, valueOf2, Integer.valueOf((int) (((float) fVar3.f21730a) / ((float) fVar3.f21731b)))});
                    }
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + j10.f21722a);
                    return null;
                }
                try {
                    return Double.toString(j10.l(this.f21698h));
                } catch (NumberFormatException unused) {
                }
            }
            return null;
        }
        throw new NullPointerException("tag shouldn't be null");
    }

    public double h(String str, double d10) {
        if (str != null) {
            d j10 = j(str);
            if (j10 == null) {
                return d10;
            }
            try {
                return j10.l(this.f21698h);
            } catch (NumberFormatException unused) {
                return d10;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    public int i(String str, int i10) {
        if (str != null) {
            d j10 = j(str);
            if (j10 == null) {
                return i10;
            }
            try {
                return j10.m(this.f21698h);
            } catch (NumberFormatException unused) {
                return i10;
            }
        } else {
            throw new NullPointerException("tag shouldn't be null");
        }
    }

    public double[] m() {
        String g10 = g("GPSLatitude");
        String g11 = g("GPSLatitudeRef");
        String g12 = g("GPSLongitude");
        String g13 = g("GPSLongitudeRef");
        if (g10 == null || g11 == null || g12 == null || g13 == null) {
            return null;
        }
        try {
            return new double[]{c(g10, g11), c(g12, g13)};
        } catch (IllegalArgumentException unused) {
            Log.w("ExifInterface", "Latitude/longitude values are not parsable. " + String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", new Object[]{g10, g11, g12, g13}));
            return null;
        }
    }

    public int s() {
        switch (i("Orientation", 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    public byte[] v() {
        int i10 = this.f21705o;
        if (i10 == 6 || i10 == 7) {
            return w();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] w() {
        /*
            r8 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r8.f21699i
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            byte[] r1 = r8.f21704n
            if (r1 == 0) goto L_0x000d
            return r1
        L_0x000d:
            android.content.res.AssetManager$AssetInputStream r1 = r8.f21693c     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            if (r1 == 0) goto L_0x002f
            boolean r3 = r1.markSupported()     // Catch:{ Exception -> 0x0021, all -> 0x001c }
            if (r3 == 0) goto L_0x0026
            r1.reset()     // Catch:{ Exception -> 0x0021, all -> 0x001c }
        L_0x001a:
            r3 = r2
            goto L_0x0058
        L_0x001c:
            r0 = move-exception
            r3 = r2
        L_0x001e:
            r2 = r1
            goto L_0x0090
        L_0x0021:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L_0x0082
        L_0x0026:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch:{ Exception -> 0x0021, all -> 0x001c }
            androidx.exifinterface.media.b.b(r1)
            return r2
        L_0x002f:
            java.lang.String r1 = r8.f21691a     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            if (r1 == 0) goto L_0x0043
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.lang.String r3 = r8.f21691a     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            r1.<init>(r3)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            goto L_0x001a
        L_0x003b:
            r0 = move-exception
            r3 = r2
            goto L_0x0090
        L_0x003e:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
            goto L_0x0082
        L_0x0043:
            java.io.FileDescriptor r1 = r8.f21692b     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            java.io.FileDescriptor r1 = androidx.exifinterface.media.b.a.b(r1)     // Catch:{ Exception -> 0x003e, all -> 0x003b }
            int r3 = android.system.OsConstants.SEEK_SET     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r4 = 0
            androidx.exifinterface.media.b.a.c(r1, r4, r3)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x007e, all -> 0x007b }
            r7 = r3
            r3 = r1
            r1 = r7
        L_0x0058:
            androidx.exifinterface.media.a$b r4 = new androidx.exifinterface.media.a$b     // Catch:{ Exception -> 0x0079 }
            r4.<init>((java.io.InputStream) r1)     // Catch:{ Exception -> 0x0079 }
            int r5 = r8.f21702l     // Catch:{ Exception -> 0x0079 }
            int r6 = r8.f21706p     // Catch:{ Exception -> 0x0079 }
            int r5 = r5 + r6
            r4.g(r5)     // Catch:{ Exception -> 0x0079 }
            int r5 = r8.f21703m     // Catch:{ Exception -> 0x0079 }
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0079 }
            r4.readFully(r5)     // Catch:{ Exception -> 0x0079 }
            r8.f21704n = r5     // Catch:{ Exception -> 0x0079 }
            androidx.exifinterface.media.b.b(r1)
            if (r3 == 0) goto L_0x0076
            androidx.exifinterface.media.b.a(r3)
        L_0x0076:
            return r5
        L_0x0077:
            r0 = move-exception
            goto L_0x001e
        L_0x0079:
            r4 = move-exception
            goto L_0x0082
        L_0x007b:
            r0 = move-exception
            r3 = r1
            goto L_0x0090
        L_0x007e:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
        L_0x0082:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x0077 }
            androidx.exifinterface.media.b.b(r1)
            if (r3 == 0) goto L_0x008f
            androidx.exifinterface.media.b.a(r3)
        L_0x008f:
            return r2
        L_0x0090:
            androidx.exifinterface.media.b.b(r2)
            if (r3 == 0) goto L_0x0098
            androidx.exifinterface.media.b.a(r3)
        L_0x0098:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.w():byte[]");
    }

    private static class b extends InputStream implements DataInput {

        /* renamed from: a  reason: collision with root package name */
        protected final DataInputStream f21715a;

        /* renamed from: b  reason: collision with root package name */
        protected int f21716b;

        /* renamed from: c  reason: collision with root package name */
        private ByteOrder f21717c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f21718d;

        /* renamed from: e  reason: collision with root package name */
        private int f21719e;

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f21719e = bArr.length;
        }

        public int available() {
            return this.f21715a.available();
        }

        public int c() {
            return this.f21719e;
        }

        public int d() {
            return this.f21716b;
        }

        public long e() {
            return ((long) readInt()) & 4294967295L;
        }

        public void f(ByteOrder byteOrder) {
            this.f21717c = byteOrder;
        }

        public void g(int i10) {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                int skip = (int) this.f21715a.skip((long) i12);
                if (skip <= 0) {
                    if (this.f21718d == null) {
                        this.f21718d = new byte[8192];
                    }
                    skip = this.f21715a.read(this.f21718d, 0, Math.min(8192, i12));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i10 + " bytes.");
                    }
                }
                i11 += skip;
            }
            this.f21716b += i11;
        }

        public void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public int read() {
            this.f21716b++;
            return this.f21715a.read();
        }

        public boolean readBoolean() {
            this.f21716b++;
            return this.f21715a.readBoolean();
        }

        public byte readByte() {
            this.f21716b++;
            int read = this.f21715a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        public char readChar() {
            this.f21716b += 2;
            return this.f21715a.readChar();
        }

        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        public void readFully(byte[] bArr, int i10, int i11) {
            this.f21716b += i11;
            this.f21715a.readFully(bArr, i10, i11);
        }

        public int readInt() {
            this.f21716b += 4;
            int read = this.f21715a.read();
            int read2 = this.f21715a.read();
            int read3 = this.f21715a.read();
            int read4 = this.f21715a.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.f21717c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                throw new IOException("Invalid byte order: " + this.f21717c);
            }
            throw new EOFException();
        }

        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        public long readLong() {
            this.f21716b += 8;
            int read = this.f21715a.read();
            int read2 = this.f21715a.read();
            int read3 = this.f21715a.read();
            int read4 = this.f21715a.read();
            int read5 = this.f21715a.read();
            int read6 = this.f21715a.read();
            int read7 = this.f21715a.read();
            int read8 = this.f21715a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
                ByteOrder byteOrder = this.f21717c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
                }
                int i10 = read2;
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (((long) read) << 56) + (((long) i10) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
                }
                throw new IOException("Invalid byte order: " + this.f21717c);
            }
            throw new EOFException();
        }

        public short readShort() {
            this.f21716b += 2;
            int read = this.f21715a.read();
            int read2 = this.f21715a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f21717c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (short) ((read << 8) + read2);
                }
                throw new IOException("Invalid byte order: " + this.f21717c);
            }
            throw new EOFException();
        }

        public String readUTF() {
            this.f21716b += 2;
            return this.f21715a.readUTF();
        }

        public int readUnsignedByte() {
            this.f21716b++;
            return this.f21715a.readUnsignedByte();
        }

        public int readUnsignedShort() {
            this.f21716b += 2;
            int read = this.f21715a.read();
            int read2 = this.f21715a.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.f21717c;
                if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == ByteOrder.BIG_ENDIAN) {
                    return (read << 8) + read2;
                }
                throw new IOException("Invalid byte order: " + this.f21717c);
            }
            throw new EOFException();
        }

        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        public int skipBytes(int i10) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public int read(byte[] bArr, int i10, int i11) {
            int read = this.f21715a.read(bArr, i10, i11);
            this.f21716b += read;
            return read;
        }

        public void readFully(byte[] bArr) {
            this.f21716b += bArr.length;
            this.f21715a.readFully(bArr);
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f21715a = dataInputStream;
            dataInputStream.mark(0);
            this.f21716b = 0;
            this.f21717c = byteOrder;
            this.f21719e = inputStream instanceof b ? ((b) inputStream).c() : -1;
        }
    }

    private static class g extends b {
        g(byte[] bArr) {
            super(bArr);
            this.f21715a.mark(Integer.MAX_VALUE);
        }

        public void h(long j10) {
            int i10 = this.f21716b;
            if (((long) i10) > j10) {
                this.f21716b = 0;
                this.f21715a.reset();
            } else {
                j10 -= (long) i10;
            }
            g((int) j10);
        }

        g(InputStream inputStream) {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f21715a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        public final int f21726a;

        /* renamed from: b  reason: collision with root package name */
        public final String f21727b;

        /* renamed from: c  reason: collision with root package name */
        public final int f21728c;

        /* renamed from: d  reason: collision with root package name */
        public final int f21729d;

        e(String str, int i10, int i11) {
            this.f21727b = str;
            this.f21726a = i10;
            this.f21728c = i11;
            this.f21729d = -1;
        }

        /* access modifiers changed from: package-private */
        public boolean a(int i10) {
            int i11;
            int i12 = this.f21728c;
            if (i12 == 7 || i10 == 7 || i12 == i10 || (i11 = this.f21729d) == i10) {
                return true;
            }
            if ((i12 == 4 || i11 == 4) && i10 == 3) {
                return true;
            }
            if ((i12 == 9 || i11 == 9) && i10 == 8) {
                return true;
            }
            return (i12 == 12 || i11 == 12) && i10 == 11;
        }

        e(String str, int i10, int i11, int i12) {
            this.f21727b = str;
            this.f21726a = i10;
            this.f21728c = i11;
            this.f21729d = i12;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    public a(InputStream inputStream, int i10) {
        e[][] eVarArr = f21673j0;
        this.f21696f = new HashMap[eVarArr.length];
        this.f21697g = new HashSet(eVarArr.length);
        this.f21698h = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f21691a = null;
            if (i10 == 1) {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f21680q0.length);
                if (!C(bufferedInputStream)) {
                    Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                    return;
                }
                this.f21695e = true;
                this.f21693c = null;
                this.f21692b = null;
                inputStream = bufferedInputStream;
            } else if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f21693c = (AssetManager.AssetInputStream) inputStream;
                this.f21692b = null;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (K(fileInputStream.getFD())) {
                        this.f21693c = null;
                        this.f21692b = fileInputStream.getFD();
                    }
                }
                this.f21693c = null;
                this.f21692b = null;
            }
            P(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
