package nts;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: nts.Ⱍ  reason: contains not printable characters */
public class C4132 extends C3897 {

    /* renamed from: ᅯ  reason: contains not printable characters */
    public boolean f3644 = false;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public C3698 f3645 = new C3698();

    public C4132(InputStream inputStream, boolean z10) {
        super(inputStream, new C4023(), RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT);
        if (z10) {
            m3374();
        }
    }

    public int read(byte[] bArr, int i10, int i11) {
        if (!this.f3644) {
            m3374();
        }
        int read = super.read(bArr, i10, i11);
        if (read > 0) {
            this.f3645.m891(bArr, i10, read);
        }
        return read;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3373() {
        byte[] r02 = m1992(4);
        byte[] r12 = this.f3645.m889();
        int i10 = 0;
        while (i10 < r02.length) {
            if (r02[i10] == r12[i10]) {
                i10++;
            } else {
                throw new C3625((Throwable) null, 127, C3727.m1052(";\u0006\bL1& *G\u000e\u0000\u0005\u0007\u0007\u0013@\u0016\r]\u0015\u0015\f\u0018\u0014\u001e\u0012[)\u0014\u001a^#428U\u001c\u0012\u0017\u0015\u0015\u0001R\u0004\u001fO\u0007\u0007\u001e\n\u0006\f\u0000I3\t\u0017\u0010\u0012\u0013\u000f\u0013\u001a\n\bM\t\u0004\u0005\u0019\u0004\u0012\u0007\u0006\u001b\u001c\u001eQ\u001f\u0013\u001b\u0012\b\u0012\f\u0011+kd*0c35<*- j\";i88 u;=p+26>}<4*4GS\na[EB@A]AHXZ\u001ftc\r\f\u0004ROIDNU\u0003_DTJ\u0006¶¿©³´¶¸¤¾±¦ò²¢´î¡£¹ê¸½¹¶¨¶±§§îÕÑÙÕÔÝµâúöìý¿÷î¼êìâïõôàçÿ¤·¹ý¿´¼¤úççò°¸´­¤¿¸§ë¡ºæ®ª¦­±²¤Ò", 207, 35, 50));
            }
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3374() {
        int read = this.f1810.read();
        if (read != -1) {
            int read2 = this.f1810.read();
            if (read2 == -1) {
                throw new IOException(C3727.m1052(";\u0006\bL1& *G\u000e\u0000\u0005\u0007\u0007\u0013@\u0016\r]\u0015\u0015\f\u0018\u0014\u001e\u0012[)\u0014\u001a^#428U\u001c\u0012\u0017\u0015\u0015\u0001R\u0004\u001fO\u0007\u0007\u001e\n\u0006\f\u0000I3\t\u0017\u0010\u0012\u0013\u000f\u0013\u001a\n\bM\t\u0004\u0005\u0019\u0004\u0012\u0007\u0006\u001b\u001c\u001eQ\u001f\u0013\u001b\u0012\b\u0012\f\u0011+kd*0c35<*- j\";i88 u;=p+26>}<4*4GS\na[EB@A]AHXZ\u001ftc\r\f\u0004ROIDNU\u0003_DTJ\u0006¶¿©³´¶¸¤¾±¦ò²¢´î¡£¹ê¸½¹¶¨¶±§§îÕÑÙÕÔÝµâúöìý¿÷î¼êìâïõôàçÿ¤·¹ý¿´¼¤úççò°¸´­¤¿¸§ë¡ºæ®ª¦­±²¤Ò", 27, 27, 125));
            } else if ((read & 15) != 8) {
                throw new IOException(C3727.m1052(";\u0006\bL1& *G\u000e\u0000\u0005\u0007\u0007\u0013@\u0016\r]\u0015\u0015\f\u0018\u0014\u001e\u0012[)\u0014\u001a^#428U\u001c\u0012\u0017\u0015\u0015\u0001R\u0004\u001fO\u0007\u0007\u001e\n\u0006\f\u0000I3\t\u0017\u0010\u0012\u0013\u000f\u0013\u001a\n\bM\t\u0004\u0005\u0019\u0004\u0012\u0007\u0006\u001b\u001c\u001eQ\u001f\u0013\u001b\u0012\b\u0012\f\u0011+kd*0c35<*- j\";i88 u;=p+26>}<4*4GS\na[EB@A]AHXZ\u001ftc\r\f\u0004ROIDNU\u0003_DTJ\u0006¶¿©³´¶¸¤¾±¦ò²¢´î¡£¹ê¸½¹¶¨¶±§§îÕÑÙÕÔÝµâúöìý¿÷î¼êìâïõôàçÿ¤·¹ý¿´¼¤úççò°¸´­¤¿¸§ë¡ºæ®ª¦­±²¤Ò", 54, 67, 19));
            } else if (read > 127) {
                throw new IOException(C3727.m1052(";\u0006\bL1& *G\u000e\u0000\u0005\u0007\u0007\u0013@\u0016\r]\u0015\u0015\f\u0018\u0014\u001e\u0012[)\u0014\u001a^#428U\u001c\u0012\u0017\u0015\u0015\u0001R\u0004\u001fO\u0007\u0007\u001e\n\u0006\f\u0000I3\t\u0017\u0010\u0012\u0013\u000f\u0013\u001a\n\bM\t\u0004\u0005\u0019\u0004\u0012\u0007\u0006\u001b\u001c\u001eQ\u001f\u0013\u001b\u0012\b\u0012\f\u0011+kd*0c35<*- j\";i88 u;=p+26>}<4*4GS\na[EB@A]AHXZ\u001ftc\r\f\u0004ROIDNU\u0003_DTJ\u0006¶¿©³´¶¸¤¾±¦ò²¢´î¡£¹ê¸½¹¶¨¶±§§îÕÑÙÕÔÝµâúöìý¿÷î¼êìâïõôàçÿ¤·¹ý¿´¼¤úççò°¸´­¤¿¸§ë¡ºæ®ª¦­±²¤Ò", 121, 29, 80));
            } else if ((read2 & 32) == 32) {
                throw new IOException(C3727.m1052(";\u0006\bL1& *G\u000e\u0000\u0005\u0007\u0007\u0013@\u0016\r]\u0015\u0015\f\u0018\u0014\u001e\u0012[)\u0014\u001a^#428U\u001c\u0012\u0017\u0015\u0015\u0001R\u0004\u001fO\u0007\u0007\u001e\n\u0006\f\u0000I3\t\u0017\u0010\u0012\u0013\u000f\u0013\u001a\n\bM\t\u0004\u0005\u0019\u0004\u0012\u0007\u0006\u001b\u001c\u001eQ\u001f\u0013\u001b\u0012\b\u0012\f\u0011+kd*0c35<*- j\";i88 u;=p+26>}<4*4GS\na[EB@A]AHXZ\u001ftc\r\f\u0004ROIDNU\u0003_DTJ\u0006¶¿©³´¶¸¤¾±¦ò²¢´î¡£¹ê¸½¹¶¨¶±§§îÕÑÙÕÔÝµâúöìý¿÷î¼êìâïõôàçÿ¤·¹ý¿´¼¤úççò°¸´­¤¿¸§ë¡ºæ®ª¦­±²¤Ò", 150, 31, 87));
            } else if (((read << 8) + read2) % 31 == 0) {
                this.f1815 += 2;
                this.f3644 = true;
            } else {
                throw new IOException(C3727.m1052(";\u0006\bL1& *G\u000e\u0000\u0005\u0007\u0007\u0013@\u0016\r]\u0015\u0015\f\u0018\u0014\u001e\u0012[)\u0014\u001a^#428U\u001c\u0012\u0017\u0015\u0015\u0001R\u0004\u001fO\u0007\u0007\u001e\n\u0006\f\u0000I3\t\u0017\u0010\u0012\u0013\u000f\u0013\u001a\n\bM\t\u0004\u0005\u0019\u0004\u0012\u0007\u0006\u001b\u001c\u001eQ\u001f\u0013\u001b\u0012\b\u0012\f\u0011+kd*0c35<*- j\";i88 u;=p+26>}<4*4GS\na[EB@A]AHXZ\u001ftc\r\f\u0004ROIDNU\u0003_DTJ\u0006¶¿©³´¶¸¤¾±¦ò²¢´î¡£¹ê¸½¹¶¨¶±§§îÕÑÙÕÔÝµâúöìý¿÷î¼êìâïõôàçÿ¤·¹ý¿´¼¤úççò°¸´­¤¿¸§ë¡ºæ®ª¦­±²¤Ò", 181, 26, 60));
            }
        } else {
            throw new IOException(C3727.m1052(";\u0006\bL1& *G\u000e\u0000\u0005\u0007\u0007\u0013@\u0016\r]\u0015\u0015\f\u0018\u0014\u001e\u0012[)\u0014\u001a^#428U\u001c\u0012\u0017\u0015\u0015\u0001R\u0004\u001fO\u0007\u0007\u001e\n\u0006\f\u0000I3\t\u0017\u0010\u0012\u0013\u000f\u0013\u001a\n\bM\t\u0004\u0005\u0019\u0004\u0012\u0007\u0006\u001b\u001c\u001eQ\u001f\u0013\u001b\u0012\b\u0012\f\u0011+kd*0c35<*- j\";i88 u;=p+26>}<4*4GS\na[EB@A]AHXZ\u001ftc\r\f\u0004ROIDNU\u0003_DTJ\u0006¶¿©³´¶¸¤¾±¦ò²¢´î¡£¹ê¸½¹¶¨¶±§§îÕÑÙÕÔÝµâúöìý¿÷î¼êìâïõôàçÿ¤·¹ý¿´¼¤úççò°¸´­¤¿¸§ë¡ºæ®ª¦­±²¤Ò", 0, 27, 116));
        }
    }
}
