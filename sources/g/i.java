package G;

import G.h;
import com.google.ar.core.ImageMetadata;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;

public final class i extends FilterOutputStream {

    /* renamed from: g  reason: collision with root package name */
    private static final byte[] f6091g = "Exif\u0000\u0000".getBytes(g.f6061e);

    /* renamed from: a  reason: collision with root package name */
    private final h f6092a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f6093b = new byte[1];

    /* renamed from: c  reason: collision with root package name */
    private final ByteBuffer f6094c = ByteBuffer.allocate(4);

    /* renamed from: d  reason: collision with root package name */
    private int f6095d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f6096e;

    /* renamed from: f  reason: collision with root package name */
    private int f6097f;

    static final class a {
        public static boolean a(short s10) {
            return (s10 < -64 || s10 > -49 || s10 == -60 || s10 == -56 || s10 == -52) ? false : true;
        }
    }

    public i(OutputStream outputStream, h hVar) {
        super(new BufferedOutputStream(outputStream, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE));
        this.f6092a = hVar;
    }

    private int c(int i10, byte[] bArr, int i11, int i12) {
        int min = Math.min(i12, i10 - this.f6094c.position());
        this.f6094c.put(bArr, i11, min);
        return min;
    }

    private void d(b bVar) {
        j[][] jVarArr = h.f6075i;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (j jVar : h.f6073g) {
            for (int i10 = 0; i10 < h.f6075i.length; i10++) {
                this.f6092a.c(i10).remove(jVar.f6099b);
            }
        }
        if (!this.f6092a.c(1).isEmpty()) {
            this.f6092a.c(0).put(h.f6073g[1].f6099b, g.f(0, this.f6092a.d()));
        }
        if (!this.f6092a.c(2).isEmpty()) {
            this.f6092a.c(0).put(h.f6073g[2].f6099b, g.f(0, this.f6092a.d()));
        }
        if (!this.f6092a.c(3).isEmpty()) {
            this.f6092a.c(1).put(h.f6073g[3].f6099b, g.f(0, this.f6092a.d()));
        }
        for (int i11 = 0; i11 < h.f6075i.length; i11++) {
            int i12 = 0;
            for (Map.Entry<String, g> value : this.f6092a.c(i11).entrySet()) {
                int j10 = ((g) value.getValue()).j();
                if (j10 > 4) {
                    i12 += j10;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int i13 = 8;
        for (int i14 = 0; i14 < h.f6075i.length; i14++) {
            if (!this.f6092a.c(i14).isEmpty()) {
                iArr[i14] = i13;
                i13 += (this.f6092a.c(i14).size() * 12) + 6 + iArr2[i14];
            }
        }
        int i15 = i13 + 8;
        if (!this.f6092a.c(1).isEmpty()) {
            this.f6092a.c(0).put(h.f6073g[1].f6099b, g.f((long) iArr[1], this.f6092a.d()));
        }
        if (!this.f6092a.c(2).isEmpty()) {
            this.f6092a.c(0).put(h.f6073g[2].f6099b, g.f((long) iArr[2], this.f6092a.d()));
        }
        if (!this.f6092a.c(3).isEmpty()) {
            this.f6092a.c(1).put(h.f6073g[3].f6099b, g.f((long) iArr[3], this.f6092a.d()));
        }
        bVar.h(i15);
        bVar.write(f6091g);
        bVar.f(this.f6092a.d() == ByteOrder.BIG_ENDIAN ? (short) 19789 : 18761);
        bVar.c(this.f6092a.d());
        bVar.h(42);
        bVar.g(8);
        for (int i16 = 0; i16 < h.f6075i.length; i16++) {
            if (!this.f6092a.c(i16).isEmpty()) {
                bVar.h(this.f6092a.c(i16).size());
                int size = iArr[i16] + 2 + (this.f6092a.c(i16).size() * 12) + 4;
                for (Map.Entry next : this.f6092a.c(i16).entrySet()) {
                    int i17 = ((j) H2.i.h((j) h.b.f6083f.get(i16).get(next.getKey()), "Tag not supported: " + ((String) next.getKey()) + ". Tag needs to be ported from ExifInterface to ExifData.")).f6098a;
                    g gVar = (g) next.getValue();
                    int j11 = gVar.j();
                    bVar.h(i17);
                    bVar.h(gVar.f6065a);
                    bVar.e(gVar.f6066b);
                    if (j11 > 4) {
                        bVar.g((long) size);
                        size += j11;
                    } else {
                        bVar.write(gVar.f6068d);
                        if (j11 < 4) {
                            while (j11 < 4) {
                                bVar.d(0);
                                j11++;
                            }
                        }
                    }
                }
                bVar.g(0);
                for (Map.Entry<String, g> value2 : this.f6092a.c(i16).entrySet()) {
                    byte[] bArr = ((g) value2.getValue()).f6068d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.c(ByteOrder.BIG_ENDIAN);
    }

    public void write(byte[] bArr, int i10, int i11) {
        while (true) {
            int i12 = this.f6096e;
            if ((i12 > 0 || this.f6097f > 0 || this.f6095d != 2) && i11 > 0) {
                if (i12 > 0) {
                    int min = Math.min(i11, i12);
                    i11 -= min;
                    this.f6096e -= min;
                    i10 += min;
                }
                int i13 = this.f6097f;
                if (i13 > 0) {
                    int min2 = Math.min(i11, i13);
                    this.out.write(bArr, i10, min2);
                    i11 -= min2;
                    this.f6097f -= min2;
                    i10 += min2;
                }
                if (i11 != 0) {
                    int i14 = this.f6095d;
                    if (i14 == 0) {
                        int c10 = c(2, bArr, i10, i11);
                        i10 += c10;
                        i11 -= c10;
                        if (this.f6094c.position() >= 2) {
                            this.f6094c.rewind();
                            if (this.f6094c.getShort() == -40) {
                                this.out.write(this.f6094c.array(), 0, 2);
                                this.f6095d = 1;
                                this.f6094c.rewind();
                                b bVar = new b(this.out, ByteOrder.BIG_ENDIAN);
                                bVar.f(-31);
                                d(bVar);
                            } else {
                                throw new IOException("Not a valid jpeg image, cannot write exif");
                            }
                        } else {
                            return;
                        }
                    } else if (i14 != 1) {
                        continue;
                    } else {
                        int c11 = c(4, bArr, i10, i11);
                        i10 += c11;
                        i11 -= c11;
                        if (this.f6094c.position() == 2 && this.f6094c.getShort() == -39) {
                            this.out.write(this.f6094c.array(), 0, 2);
                            this.f6094c.rewind();
                        }
                        if (this.f6094c.position() >= 4) {
                            this.f6094c.rewind();
                            short s10 = this.f6094c.getShort();
                            if (s10 == -31) {
                                this.f6096e = (this.f6094c.getShort() & 65535) - 2;
                                this.f6095d = 2;
                            } else if (!a.a(s10)) {
                                this.out.write(this.f6094c.array(), 0, 4);
                                this.f6097f = (this.f6094c.getShort() & 65535) - 2;
                            } else {
                                this.out.write(this.f6094c.array(), 0, 4);
                                this.f6095d = 2;
                            }
                            this.f6094c.rewind();
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (i11 > 0) {
            this.out.write(bArr, i10, i11);
        }
    }

    public void write(int i10) {
        byte[] bArr = this.f6093b;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}
