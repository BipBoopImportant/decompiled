package P3;

import kb.C9967v;
import q3.C5807s;
import t3.B;
import t3.N;
import t3.q;

final class g implements C6684a {

    /* renamed from: a  reason: collision with root package name */
    public final C5807s f39364a;

    public g(C5807s sVar) {
        this.f39364a = sVar;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static C6684a c(B b10) {
        b10.X(4);
        int u10 = b10.u();
        int u11 = b10.u();
        b10.X(4);
        int u12 = b10.u();
        String a10 = a(u12);
        if (a10 == null) {
            q.h("StreamFormatChunk", "Ignoring track with unsupported compression " + u12);
            return null;
        }
        C5807s.b bVar = new C5807s.b();
        bVar.x0(u10).c0(u11).s0(a10);
        return new g(bVar.M());
    }

    public static C6684a d(int i10, B b10) {
        if (i10 == 2) {
            return c(b10);
        }
        if (i10 == 1) {
            return e(b10);
        }
        q.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + N.r0(i10));
        return null;
    }

    private static C6684a e(B b10) {
        int z10 = b10.z();
        String b11 = b(z10);
        if (b11 == null) {
            q.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + z10);
            return null;
        }
        int z11 = b10.z();
        int u10 = b10.u();
        b10.X(6);
        int f02 = N.f0(b10.z());
        int z12 = b10.a() > 0 ? b10.z() : 0;
        byte[] bArr = new byte[z12];
        b10.l(bArr, 0, z12);
        C5807s.b bVar = new C5807s.b();
        bVar.s0(b11).Q(z11).t0(u10);
        if ("audio/raw".equals(b11) && f02 != 0) {
            bVar.m0(f02);
        }
        if ("audio/mp4a-latm".equals(b11) && z12 > 0) {
            bVar.f0(C9967v.F(bArr));
        }
        return new g(bVar.M());
    }

    public int getType() {
        return 1718776947;
    }
}
