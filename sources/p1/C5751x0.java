package p1;

import XH.C16801H;
import androidx.recyclerview.widget.RecyclerView;
import e2.C5295b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import q1.C5775b;
import q1.C5776c;
import q1.C5780g;
import q1.C5783j;
import q1.x;

@Metadata(d1 = {"\u0000&\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0011\u001a;\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t\u001a;\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\n\u0010\t\u001a\u0019\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0012\u001a\u00020\u00072\b\b\u0001\u0010\u0001\u001a\u00020\u000b2\b\b\u0001\u0010\u0002\u001a\u00020\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u000b2\b\b\u0003\u0010\u0004\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a,\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0016\u001a\u00020\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001e\u0010\u001a\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0016\u0010\u001c\u001a\u00020\u0000*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0016\u0010\u001e\u001a\u00020\u000b*\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"", "red", "green", "blue", "alpha", "Lq1/c;", "colorSpace", "Lp1/v0;", "a", "(FFFFLq1/c;)J", "g", "", "color", "b", "(I)J", "", "d", "(J)J", "c", "(IIII)J", "start", "stop", "fraction", "i", "(JJF)J", "background", "h", "(JJ)J", "j", "(J)F", "k", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: p1.x0  reason: case insensitive filesystem */
public final class C5751x0 {
    public static final long a(float f10, float f11, float f12, float f13, C5776c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        C5776c cVar2 = cVar;
        float f14 = 1.0f;
        float f15 = 0.0f;
        if (cVar.i()) {
            float f16 = f13 < 0.0f ? 0.0f : f13;
            if (f16 > 1.0f) {
                f16 = 1.0f;
            }
            int i20 = ((int) ((f16 * 255.0f) + 0.5f)) << 24;
            float f17 = f10 < 0.0f ? 0.0f : f10;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            int i21 = i20 | (((int) ((f17 * 255.0f) + 0.5f)) << 16);
            float f18 = f11 < 0.0f ? 0.0f : f11;
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            int i22 = i21 | (((int) ((f18 * 255.0f) + 0.5f)) << 8);
            if (f12 >= 0.0f) {
                f15 = f12;
            }
            if (f15 <= 1.0f) {
                f14 = f15;
            }
            return C5747v0.l(C16801H.b(C16801H.b((long) (i22 | ((int) ((f14 * 255.0f) + 0.5f)))) << 32));
        }
        if (!(cVar.c() == 3)) {
            M0.a("Color only works with ColorSpaces with 3 components");
        }
        int d10 = cVar.d();
        if (!(d10 != -1)) {
            M0.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float f19 = cVar2.f(0);
        float e10 = cVar2.e(0);
        if (f10 >= f19) {
            f19 = f10;
        }
        if (f19 <= e10) {
            e10 = f19;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(e10);
        int i23 = floatToRawIntBits >>> 31;
        int i24 = (floatToRawIntBits >>> 23) & 255;
        int i25 = floatToRawIntBits & 8388607;
        int i26 = 512;
        int i27 = 31;
        if (i24 == 255) {
            i11 = i25 != 0 ? 512 : 0;
            i10 = 31;
            i12 = i11 | (i23 << 15) | (i10 << 10);
        } else {
            i10 = i24 - 112;
            if (i10 >= 31) {
                i10 = 49;
                i11 = 0;
            } else if (i10 <= 0) {
                if (i10 >= -10) {
                    int i28 = (i25 | 8388608) >> (1 - i10);
                    if ((i28 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        i28 += 8192;
                    }
                    i19 = i28 >> 13;
                } else {
                    i19 = 0;
                }
                i10 = 0;
            } else {
                int i29 = i25 >> 13;
                if ((floatToRawIntBits & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i12 = (((i10 << 10) | i29) + 1) | (i23 << 15);
                } else {
                    i11 = i29;
                }
            }
            i12 = i11 | (i23 << 15) | (i10 << 10);
        }
        short s10 = (short) i12;
        float f20 = cVar2.f(1);
        float e11 = cVar2.e(1);
        if (f11 >= f20) {
            f20 = f11;
        }
        if (f20 <= e11) {
            e11 = f20;
        }
        int floatToRawIntBits2 = Float.floatToRawIntBits(e11);
        int i30 = floatToRawIntBits2 >>> 31;
        int i31 = (floatToRawIntBits2 >>> 23) & 255;
        int i32 = floatToRawIntBits2 & 8388607;
        if (i31 == 255) {
            i14 = i32 != 0 ? 512 : 0;
            i13 = 31;
            i15 = i14 | (i30 << 15) | (i13 << 10);
        } else {
            i13 = i31 - 112;
            if (i13 >= 31) {
                i13 = 49;
                i14 = 0;
            } else if (i13 <= 0) {
                if (i13 >= -10) {
                    int i33 = (i32 | 8388608) >> (1 - i13);
                    if ((i33 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        i33 += 8192;
                    }
                    i18 = i33 >> 13;
                } else {
                    i18 = 0;
                }
                i13 = 0;
            } else {
                int i34 = i32 >> 13;
                if ((floatToRawIntBits2 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i15 = (((i13 << 10) | i34) + 1) | (i30 << 15);
                } else {
                    i14 = i34;
                }
            }
            i15 = i14 | (i30 << 15) | (i13 << 10);
        }
        short s11 = (short) i15;
        float f21 = cVar2.f(2);
        float e12 = cVar2.e(2);
        if (f12 >= f21) {
            f21 = f12;
        }
        if (f21 <= e12) {
            e12 = f21;
        }
        int floatToRawIntBits3 = Float.floatToRawIntBits(e12);
        int i35 = floatToRawIntBits3 >>> 31;
        int i36 = (floatToRawIntBits3 >>> 23) & 255;
        int i37 = 8388607 & floatToRawIntBits3;
        if (i36 == 255) {
            if (i37 == 0) {
                i26 = 0;
            }
            i16 = i26;
            i17 = (i35 << 15) | (i27 << 10) | i16;
        } else {
            int i38 = i36 - 112;
            if (i38 >= 31) {
                i27 = 49;
            } else {
                if (i38 > 0) {
                    int i39 = i37 >> 13;
                    if ((floatToRawIntBits3 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        i17 = (((i38 << 10) | i39) + 1) | (i35 << 15);
                    } else {
                        i16 = i39;
                        i27 = i38;
                    }
                } else if (i38 >= -10) {
                    int i40 = (i37 | 8388608) >> (1 - i38);
                    if ((i40 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                        i40 += 8192;
                    }
                    i16 = i40 >> 13;
                    i27 = 0;
                } else {
                    i27 = 0;
                }
                i17 = (i35 << 15) | (i27 << 10) | i16;
            }
            i16 = 0;
            i17 = (i35 << 15) | (i27 << 10) | i16;
        }
        short s12 = (short) i17;
        if (f13 >= 0.0f) {
            f15 = f13;
        }
        if (f15 <= 1.0f) {
            f14 = f15;
        }
        return C5747v0.l(C16801H.b((((long) d10) & 63) | ((((long) ((int) ((f14 * 1023.0f) + 0.5f))) & 1023) << 6) | ((((long) s10) & 65535) << 48) | ((((long) s11) & 65535) << 32) | ((65535 & ((long) s12)) << 16)));
    }

    public static final long b(int i10) {
        return C5747v0.l(C16801H.b(C16801H.b((long) i10) << 32));
    }

    public static final long c(int i10, int i11, int i12, int i13) {
        return b(((i10 & 255) << 16) | ((i13 & 255) << 24) | ((i11 & 255) << 8) | (i12 & 255));
    }

    public static final long d(long j10) {
        return C5747v0.l(C16801H.b(j10 << 32));
    }

    public static /* synthetic */ long e(float f10, float f11, float f12, float f13, C5776c cVar, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            f13 = 1.0f;
        }
        if ((i10 & 16) != 0) {
            cVar = C5780g.f27664a.w();
        }
        return a(f10, f11, f12, f13, cVar);
    }

    public static /* synthetic */ long f(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 8) != 0) {
            i13 = 255;
        }
        return c(i10, i11, i12, i13);
    }

    public static final long g(float f10, float f11, float f12, float f13, C5776c cVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        float f14 = f13;
        if (cVar.i()) {
            return C5747v0.l(C16801H.b(C16801H.b((long) ((((((int) ((f14 * 255.0f) + 0.5f)) << 24) | (((int) ((f10 * 255.0f) + 0.5f)) << 16)) | (((int) ((f11 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f12) + 0.5f)))) << 32));
        }
        int floatToRawIntBits = Float.floatToRawIntBits(f10);
        int i18 = floatToRawIntBits >>> 31;
        int i19 = (floatToRawIntBits >>> 23) & 255;
        int i20 = floatToRawIntBits & 8388607;
        int i21 = 512;
        int i22 = 0;
        if (i19 == 255) {
            i11 = i20 != 0 ? 512 : 0;
            i10 = 31;
            i12 = i11 | (i18 << 15) | (i10 << 10);
        } else {
            i10 = i19 - 112;
            if (i10 >= 31) {
                i11 = 0;
                i10 = 49;
            } else if (i10 > 0) {
                int i23 = i20 >> 13;
                if ((floatToRawIntBits & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i12 = (((i10 << 10) | i23) + 1) | (i18 << 15);
                } else {
                    i11 = i23;
                }
            } else if (i10 >= -10) {
                int i24 = (i20 | 8388608) >> (1 - i10);
                if ((i24 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i24 += 8192;
                }
                i11 = i24 >> 13;
                i10 = 0;
            } else {
                i11 = 0;
                i10 = 0;
            }
            i12 = i11 | (i18 << 15) | (i10 << 10);
        }
        short s10 = (short) i12;
        int floatToRawIntBits2 = Float.floatToRawIntBits(f11);
        int i25 = floatToRawIntBits2 >>> 31;
        int i26 = (floatToRawIntBits2 >>> 23) & 255;
        int i27 = floatToRawIntBits2 & 8388607;
        if (i26 == 255) {
            i14 = i27 != 0 ? 512 : 0;
            i13 = 31;
            i15 = i14 | (i25 << 15) | (i13 << 10);
        } else {
            i13 = i26 - 112;
            if (i13 >= 31) {
                i14 = 0;
                i13 = 49;
            } else if (i13 > 0) {
                int i28 = i27 >> 13;
                if ((floatToRawIntBits2 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i15 = (((i13 << 10) | i28) + 1) | (i25 << 15);
                } else {
                    i14 = i28;
                }
            } else if (i13 >= -10) {
                int i29 = (i27 | 8388608) >> (1 - i13);
                if ((i29 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i29 += 8192;
                }
                i14 = i29 >> 13;
                i13 = 0;
            } else {
                i14 = 0;
                i13 = 0;
            }
            i15 = i14 | (i25 << 15) | (i13 << 10);
        }
        short s11 = (short) i15;
        int floatToRawIntBits3 = Float.floatToRawIntBits(f12);
        int i30 = floatToRawIntBits3 >>> 31;
        int i31 = (floatToRawIntBits3 >>> 23) & 255;
        int i32 = 8388607 & floatToRawIntBits3;
        if (i31 == 255) {
            if (i32 == 0) {
                i21 = 0;
            }
            i22 = i21;
            i16 = 31;
            i17 = (i30 << 15) | (i16 << 10) | i22;
        } else {
            i16 = i31 - 112;
            if (i16 >= 31) {
                i16 = 49;
            } else if (i16 > 0) {
                i22 = i32 >> 13;
                if ((floatToRawIntBits3 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i17 = (((i16 << 10) | i22) + 1) | (i30 << 15);
                }
            } else if (i16 >= -10) {
                int i33 = (i32 | 8388608) >> (1 - i16);
                if ((i33 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0) {
                    i33 += 8192;
                }
                i16 = 0;
                i22 = i33 >> 13;
            } else {
                i16 = 0;
            }
            i17 = (i30 << 15) | (i16 << 10) | i22;
        }
        return C5747v0.l(C16801H.b(((((long) s11) & 65535) << 32) | ((((long) s10) & 65535) << 48) | ((((long) ((short) i17)) & 65535) << 16) | ((((long) ((int) ((Math.max(0.0f, Math.min(f14, 1.0f)) * 1023.0f) + 0.5f))) & 1023) << 6) | (((long) cVar.d()) & 63)));
    }

    public static final long h(long j10, long j11) {
        long m10 = C5747v0.m(j10, C5747v0.t(j11));
        float r10 = C5747v0.r(j11);
        float r11 = C5747v0.r(m10);
        float f10 = 1.0f - r11;
        float f11 = (r10 * f10) + r11;
        float f12 = 0.0f;
        int i10 = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
        float v10 = i10 == 0 ? 0.0f : ((C5747v0.v(m10) * r11) + ((C5747v0.v(j11) * r10) * f10)) / f11;
        float u10 = i10 == 0 ? 0.0f : ((C5747v0.u(m10) * r11) + ((C5747v0.u(j11) * r10) * f10)) / f11;
        float s10 = C5747v0.s(m10);
        float s11 = C5747v0.s(j11);
        if (i10 != 0) {
            f12 = ((s10 * r11) + ((s11 * r10) * f10)) / f11;
        }
        return g(v10, u10, f12, f11, C5747v0.t(j11));
    }

    public static final long i(long j10, long j11, float f10) {
        C5776c t10 = C5780g.f27664a.t();
        long m10 = C5747v0.m(j10, t10);
        long m11 = C5747v0.m(j11, t10);
        float r10 = C5747v0.r(m10);
        float v10 = C5747v0.v(m10);
        float u10 = C5747v0.u(m10);
        float s10 = C5747v0.s(m10);
        float r11 = C5747v0.r(m11);
        float v11 = C5747v0.v(m11);
        float u11 = C5747v0.u(m11);
        float s11 = C5747v0.s(m11);
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        return C5747v0.m(g(C5295b.b(v10, v11, f10), C5295b.b(u10, u11, f10), C5295b.b(s10, s11, f10), C5295b.b(r10, r11, f10), t10), C5747v0.t(j11));
    }

    public static final float j(long j10) {
        C5776c t10 = C5747v0.t(j10);
        if (!C5775b.e(t10.g(), C5775b.f27655a.b())) {
            M0.a("The specified color must be encoded in an RGB color space. The supplied color space is " + C5775b.h(t10.g()));
        }
        C17542s.h(t10, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        C5783j I10 = ((x) t10).I();
        float a10 = (float) ((I10.a((double) C5747v0.v(j10)) * 0.2126d) + (I10.a((double) C5747v0.u(j10)) * 0.7152d) + (I10.a((double) C5747v0.s(j10)) * 0.0722d));
        if (a10 < 0.0f) {
            a10 = 0.0f;
        }
        if (a10 > 1.0f) {
            return 1.0f;
        }
        return a10;
    }

    public static final int k(long j10) {
        return (int) C16801H.b(C5747v0.m(j10, C5780g.f27664a.w()) >>> 32);
    }
}
