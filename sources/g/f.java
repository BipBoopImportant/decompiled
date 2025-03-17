package G;

import C.C4391e0;
import android.location.Location;
import androidx.camera.core.n;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final String f6052c = "f";

    /* renamed from: d  reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f6053d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f6054e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f6055f = new c();

    /* renamed from: g  reason: collision with root package name */
    private static final List<String> f6056g = n();

    /* renamed from: h  reason: collision with root package name */
    private static final List<String> f6057h = Arrays.asList(new String[]{"ImageWidth", "ImageLength", "PixelXDimension", "PixelYDimension", "Compression", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation"});

    /* renamed from: a  reason: collision with root package name */
    private final androidx.exifinterface.media.a f6058a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f6059b = false;

    class a extends ThreadLocal<SimpleDateFormat> {
        a() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
        }
    }

    class b extends ThreadLocal<SimpleDateFormat> {
        b() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("HH:mm:ss", Locale.US);
        }
    }

    class c extends ThreadLocal<SimpleDateFormat> {
        c() {
        }

        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
        }
    }

    private static final class d {

        static final class a {

            /* renamed from: a  reason: collision with root package name */
            final double f6060a;

            a(double d10) {
                this.f6060a = d10;
            }

            /* access modifiers changed from: package-private */
            public double a() {
                return this.f6060a / 2.23694d;
            }
        }

        static a a(double d10) {
            return new a(d10 * 0.621371d);
        }

        static a b(double d10) {
            return new a(d10 * 1.15078d);
        }

        static a c(double d10) {
            return new a(d10);
        }
    }

    private f(androidx.exifinterface.media.a aVar) {
        this.f6058a = aVar;
    }

    private void a() {
        long currentTimeMillis = System.currentTimeMillis();
        String f10 = f(currentTimeMillis);
        this.f6058a.d0("DateTime", f10);
        try {
            this.f6058a.d0("SubSecTime", Long.toString(currentTimeMillis - d(f10).getTime()));
        } catch (ParseException unused) {
        }
    }

    private static Date c(String str) {
        return f6053d.get().parse(str);
    }

    private static Date d(String str) {
        return f6055f.get().parse(str);
    }

    private static Date e(String str) {
        return f6054e.get().parse(str);
    }

    private static String f(long j10) {
        return f6055f.get().format(new Date(j10));
    }

    public static f h(File file) {
        return i(file.toString());
    }

    public static f i(String str) {
        return new f(new androidx.exifinterface.media.a(str));
    }

    public static f j(n nVar) {
        ByteBuffer p10 = nVar.A1()[0].p();
        p10.rewind();
        byte[] bArr = new byte[p10.capacity()];
        p10.get(bArr);
        return k(new ByteArrayInputStream(bArr));
    }

    public static f k(InputStream inputStream) {
        return new f(new androidx.exifinterface.media.a(inputStream));
    }

    public static List<String> n() {
        return Arrays.asList(new String[]{"ImageWidth", "ImageLength", "BitsPerSample", "Compression", "PhotometricInterpretation", "Orientation", "SamplesPerPixel", "PlanarConfiguration", "YCbCrSubSampling", "YCbCrPositioning", "XResolution", "YResolution", "ResolutionUnit", "StripOffsets", "RowsPerStrip", "StripByteCounts", "JPEGInterchangeFormat", "JPEGInterchangeFormatLength", "TransferFunction", "WhitePoint", "PrimaryChromaticities", "YCbCrCoefficients", "ReferenceBlackWhite", "DateTime", "ImageDescription", "Make", "Model", "Software", "Artist", "Copyright", "ExifVersion", "FlashpixVersion", "ColorSpace", "Gamma", "PixelXDimension", "PixelYDimension", "ComponentsConfiguration", "CompressedBitsPerPixel", "MakerNote", "UserComment", "RelatedSoundFile", "DateTimeOriginal", "DateTimeDigitized", "OffsetTime", "OffsetTimeOriginal", "OffsetTimeDigitized", "SubSecTime", "SubSecTimeOriginal", "SubSecTimeDigitized", "ExposureTime", "FNumber", "ExposureProgram", "SpectralSensitivity", "PhotographicSensitivity", "OECF", "SensitivityType", "StandardOutputSensitivity", "RecommendedExposureIndex", "ISOSpeed", "ISOSpeedLatitudeyyy", "ISOSpeedLatitudezzz", "ShutterSpeedValue", "ApertureValue", "BrightnessValue", "ExposureBiasValue", "MaxApertureValue", "SubjectDistance", "MeteringMode", "LightSource", "Flash", "SubjectArea", "FocalLength", "FlashEnergy", "SpatialFrequencyResponse", "FocalPlaneXResolution", "FocalPlaneYResolution", "FocalPlaneResolutionUnit", "SubjectLocation", "ExposureIndex", "SensingMethod", "FileSource", "SceneType", "CFAPattern", "CustomRendered", "ExposureMode", "WhiteBalance", "DigitalZoomRatio", "FocalLengthIn35mmFilm", "SceneCaptureType", "GainControl", "Contrast", "Saturation", "Sharpness", "DeviceSettingDescription", "SubjectDistanceRange", "ImageUniqueID", "CameraOwnerName", "BodySerialNumber", "LensSpecification", "LensMake", "LensModel", "LensSerialNumber", "GPSVersionID", "GPSLatitudeRef", "GPSLatitude", "GPSLongitudeRef", "GPSLongitude", "GPSAltitudeRef", "GPSAltitude", "GPSTimeStamp", "GPSSatellites", "GPSStatus", "GPSMeasureMode", "GPSDOP", "GPSSpeedRef", "GPSSpeed", "GPSTrackRef", "GPSTrack", "GPSImgDirectionRef", "GPSImgDirection", "GPSMapDatum", "GPSDestLatitudeRef", "GPSDestLatitude", "GPSDestLongitudeRef", "GPSDestLongitude", "GPSDestBearingRef", "GPSDestBearing", "GPSDestDistanceRef", "GPSDestDistance", "GPSProcessingMethod", "GPSAreaInformation", "GPSDateStamp", "GPSDifferential", "GPSHPositioningError", "InteroperabilityIndex", "ThumbnailImageLength", "ThumbnailImageWidth", "ThumbnailOrientation", "DNGVersion", "DefaultCropSize", "ThumbnailImage", "PreviewImageStart", "PreviewImageLength", "AspectFrame", "SensorBottomBorder", "SensorLeftBorder", "SensorRightBorder", "SensorTopBorder", "ISO", "JpgFromRaw", "Xmp", "NewSubfileType", "SubfileType"});
    }

    private long x(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return d(str).getTime();
        } catch (ParseException unused) {
            return -1;
        }
    }

    private long y(String str, String str2) {
        if (str == null && str2 == null) {
            return -1;
        }
        if (str2 == null) {
            try {
                return c(str).getTime();
            } catch (ParseException unused) {
                return -1;
            }
        } else if (str == null) {
            try {
                return e(str2).getTime();
            } catch (ParseException unused2) {
                return -1;
            }
        } else {
            return x(str + " " + str2);
        }
    }

    public void A() {
        if (!this.f6059b) {
            a();
        }
        this.f6058a.Y();
    }

    public void b(Location location) {
        this.f6058a.e0(location);
    }

    public void g(f fVar) {
        ArrayList<String> arrayList = new ArrayList<>(f6056g);
        arrayList.removeAll(f6057h);
        for (String str : arrayList) {
            String g10 = this.f6058a.g(str);
            String g11 = fVar.f6058a.g(str);
            if (g10 != null && !g10.equals(g11)) {
                fVar.f6058a.d0(str, g10);
            }
        }
    }

    public void l() {
        int i10;
        switch (r()) {
            case 2:
                i10 = 1;
                break;
            case 3:
                i10 = 4;
                break;
            case 4:
                i10 = 3;
                break;
            case 5:
                i10 = 6;
                break;
            case 6:
                i10 = 5;
                break;
            case 7:
                i10 = 8;
                break;
            case 8:
                i10 = 7;
                break;
            default:
                i10 = 2;
                break;
        }
        this.f6058a.d0("Orientation", String.valueOf(i10));
    }

    public void m() {
        int i10;
        switch (r()) {
            case 2:
                i10 = 3;
                break;
            case 3:
                i10 = 2;
                break;
            case 4:
                i10 = 1;
                break;
            case 5:
                i10 = 8;
                break;
            case 6:
                i10 = 7;
                break;
            case 7:
                i10 = 6;
                break;
            case 8:
                i10 = 5;
                break;
            default:
                i10 = 4;
                break;
        }
        this.f6058a.d0("Orientation", String.valueOf(i10));
    }

    public String o() {
        return this.f6058a.g("ImageDescription");
    }

    public int p() {
        return this.f6058a.i("ImageLength", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.location.Location q() {
        /*
            r16 = this;
            r0 = r16
            androidx.exifinterface.media.a r1 = r0.f6058a
            java.lang.String r2 = "GPSProcessingMethod"
            java.lang.String r1 = r1.g(r2)
            androidx.exifinterface.media.a r2 = r0.f6058a
            double[] r2 = r2.m()
            androidx.exifinterface.media.a r3 = r0.f6058a
            r4 = 0
            double r6 = r3.f(r4)
            androidx.exifinterface.media.a r3 = r0.f6058a
            java.lang.String r8 = "GPSSpeed"
            double r8 = r3.h(r8, r4)
            androidx.exifinterface.media.a r3 = r0.f6058a
            java.lang.String r10 = "GPSSpeedRef"
            java.lang.String r3 = r3.g(r10)
            java.lang.String r10 = "K"
            if (r3 != 0) goto L_0x002d
            r3 = r10
        L_0x002d:
            androidx.exifinterface.media.a r11 = r0.f6058a
            java.lang.String r12 = "GPSDateStamp"
            java.lang.String r11 = r11.g(r12)
            androidx.exifinterface.media.a r12 = r0.f6058a
            java.lang.String r13 = "GPSTimeStamp"
            java.lang.String r12 = r12.g(r13)
            long r11 = r0.y(r11, r12)
            if (r2 != 0) goto L_0x0045
            r1 = 0
            return r1
        L_0x0045:
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = f6052c
        L_0x0049:
            android.location.Location r13 = new android.location.Location
            r13.<init>(r1)
            r1 = 0
            r14 = r2[r1]
            r13.setLatitude(r14)
            r14 = 1
            r1 = r2[r14]
            r13.setLongitude(r1)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0061
            r13.setAltitude(r6)
        L_0x0061:
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x00b5
            int r1 = r3.hashCode()
            r2 = 75
            if (r1 == r2) goto L_0x008a
            r2 = 77
            if (r1 == r2) goto L_0x0080
            r2 = 78
            if (r1 == r2) goto L_0x0076
            goto L_0x0092
        L_0x0076:
            java.lang.String r1 = "N"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0092
            r1 = r14
            goto L_0x0093
        L_0x0080:
            java.lang.String r1 = "M"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0092
            r1 = 0
            goto L_0x0093
        L_0x008a:
            boolean r1 = r3.equals(r10)
            if (r1 == 0) goto L_0x0092
            r1 = 2
            goto L_0x0093
        L_0x0092:
            r1 = -1
        L_0x0093:
            if (r1 == 0) goto L_0x00a9
            if (r1 == r14) goto L_0x00a0
            G.f$d$a r1 = G.f.d.a(r8)
            double r1 = r1.a()
            goto L_0x00b1
        L_0x00a0:
            G.f$d$a r1 = G.f.d.b(r8)
            double r1 = r1.a()
            goto L_0x00b1
        L_0x00a9:
            G.f$d$a r1 = G.f.d.c(r8)
            double r1 = r1.a()
        L_0x00b1:
            float r1 = (float) r1
            r13.setSpeed(r1)
        L_0x00b5:
            r1 = -1
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x00be
            r13.setTime(r11)
        L_0x00be:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: G.f.q():android.location.Location");
    }

    public int r() {
        return this.f6058a.i("Orientation", 0);
    }

    public int s() {
        switch (r()) {
            case 3:
            case 4:
                return 180;
            case 5:
                return 270;
            case 6:
            case 7:
                return 90;
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public long t() {
        long x10 = x(this.f6058a.g("DateTimeOriginal"));
        if (x10 == -1) {
            return -1;
        }
        String g10 = this.f6058a.g("SubSecTimeOriginal");
        if (g10 == null) {
            return x10;
        }
        try {
            long parseLong = Long.parseLong(g10);
            while (parseLong > 1000) {
                parseLong /= 10;
            }
            return x10 + parseLong;
        } catch (NumberFormatException unused) {
            return x10;
        }
    }

    public String toString() {
        return String.format(Locale.ENGLISH, "Exif{width=%s, height=%s, rotation=%d, isFlippedVertically=%s, isFlippedHorizontally=%s, location=%s, timestamp=%s, description=%s}", new Object[]{Integer.valueOf(u()), Integer.valueOf(p()), Integer.valueOf(s()), Boolean.valueOf(w()), Boolean.valueOf(v()), q(), Long.valueOf(t()), o()});
    }

    public int u() {
        return this.f6058a.i("ImageWidth", 0);
    }

    public boolean v() {
        return r() == 2;
    }

    public boolean w() {
        int r10 = r();
        return r10 == 4 || r10 == 5 || r10 == 7;
    }

    public void z(int i10) {
        int i11;
        if (i10 % 90 != 0) {
            C4391e0.l(f6052c, String.format(Locale.US, "Can only rotate in right angles (eg. 0, 90, 180, 270). %d is unsupported.", new Object[]{Integer.valueOf(i10)}));
            this.f6058a.d0("Orientation", String.valueOf(0));
            return;
        }
        int i12 = i10 % 360;
        int r10 = r();
        while (i12 < 0) {
            i12 += 90;
            switch (r10) {
                case 2:
                    r10 = 5;
                    break;
                case 3:
                case 8:
                    r10 = 6;
                    break;
                case 4:
                    r10 = 7;
                    break;
                case 5:
                    r10 = 4;
                    break;
                case 6:
                    r10 = 1;
                    break;
                case 7:
                    r10 = 2;
                    break;
                default:
                    r10 = 8;
                    break;
            }
        }
        while (i12 > 0) {
            i12 -= 90;
            switch (r10) {
                case 2:
                    i11 = 7;
                    break;
                case 3:
                    i11 = 8;
                    break;
                case 4:
                    i11 = 5;
                    break;
                case 5:
                    i11 = 2;
                    break;
                case 6:
                    i11 = 3;
                    break;
                case 7:
                    i11 = 4;
                    break;
                case 8:
                    i11 = 1;
                    break;
                default:
                    i11 = 6;
                    break;
            }
        }
        this.f6058a.d0("Orientation", String.valueOf(r10));
    }
}
