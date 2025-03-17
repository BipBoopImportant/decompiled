package a6;

import WK.C16772g;
import WK.C16773h;
import X5.C6723h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\u0005\u001a\u0019\u0010\t\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\t\u0010\u0005\"\u0014\u0010\f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b\"\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000b\"\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b\"\u0014\u0010\u0010\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b\"\u0014\u0010\u0012\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000b\"\u0014\u0010\u0014\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000b\"\u0014\u0010\u0016\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000b\"\u0014\u0010\u0018\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, d2 = {"LX5/h;", "LWK/g;", "source", "", "c", "(LX5/h;LWK/g;)Z", "e", "b", "d", "a", "LWK/h;", "LWK/h;", "GIF_HEADER_87A", "GIF_HEADER_89A", "WEBP_HEADER_RIFF", "WEBP_HEADER_WEBP", "WEBP_HEADER_VPX8", "f", "HEIF_HEADER_FTYP", "g", "HEIF_HEADER_MSF1", "h", "HEIF_HEADER_HEVC", "i", "HEIF_HEADER_HEVX", "coil-gif_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final C16773h f41473a;

    /* renamed from: b  reason: collision with root package name */
    private static final C16773h f41474b;

    /* renamed from: c  reason: collision with root package name */
    private static final C16773h f41475c;

    /* renamed from: d  reason: collision with root package name */
    private static final C16773h f41476d;

    /* renamed from: e  reason: collision with root package name */
    private static final C16773h f41477e;

    /* renamed from: f  reason: collision with root package name */
    private static final C16773h f41478f;

    /* renamed from: g  reason: collision with root package name */
    private static final C16773h f41479g;

    /* renamed from: h  reason: collision with root package name */
    private static final C16773h f41480h;

    /* renamed from: i  reason: collision with root package name */
    private static final C16773h f41481i;

    static {
        C16773h.a aVar = C16773h.f139664d;
        f41473a = aVar.d("GIF87a");
        f41474b = aVar.d("GIF89a");
        f41475c = aVar.d("RIFF");
        f41476d = aVar.d("WEBP");
        f41477e = aVar.d("VP8X");
        f41478f = aVar.d("ftyp");
        f41479g = aVar.d("msf1");
        f41480h = aVar.d("hevc");
        f41481i = aVar.d("hevx");
    }

    public static final boolean a(C6723h hVar, C16772g gVar) {
        return d(hVar, gVar) && (gVar.h3(8, f41479g) || gVar.h3(8, f41480h) || gVar.h3(8, f41481i));
    }

    public static final boolean b(C6723h hVar, C16772g gVar) {
        return e(hVar, gVar) && gVar.h3(12, f41477e) && gVar.V0(21) && ((byte) (gVar.p().u(20) & 2)) > 0;
    }

    public static final boolean c(C6723h hVar, C16772g gVar) {
        return gVar.h3(0, f41474b) || gVar.h3(0, f41473a);
    }

    public static final boolean d(C6723h hVar, C16772g gVar) {
        return gVar.h3(4, f41478f);
    }

    public static final boolean e(C6723h hVar, C16772g gVar) {
        return gVar.h3(0, f41475c) && gVar.h3(8, f41476d);
    }
}
