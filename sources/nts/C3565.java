package nts;

/* renamed from: nts.Ι  reason: contains not printable characters */
public class C3565 extends C4029 {

    /* renamed from: ࡏ  reason: contains not printable characters */
    public byte[] f140;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public long f141 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f142;

    public C3565() {
        byte[] bArr = C3596.f365;
        this.f142 = bArr;
        this.f140 = bArr;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m209(C4042 r52) {
        this.f2779 = r52.m1761() & 255;
        this.f141 = ((long) r52.m1733()) & 4294967295L;
        byte r02 = r52.m1761() & 255;
        if (r02 == 0) {
            this.f142 = C3596.f365;
        } else {
            this.f142 = r52.m1732(r02);
        }
        byte r03 = r52.m1761() & 255;
        if (r03 == 0) {
            this.f140 = C3596.f365;
        } else {
            this.f140 = r52.m1732(r03);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m210(C4042 r42) {
        r42.m1745((byte) this.f2779);
        r42.m1749(this.f141, 4);
        r42.m1745((byte) this.f142.length);
        r42.m1752(this.f142);
        r42.m1745((byte) this.f140.length);
        r42.m1752(this.f140);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m208(StringBuilder sb2) {
        sb2.append(C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 32, 6, 77) + C3823.m1608(this.f141, 4) + C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 38, 7, 30) + C3589.m345(this.f140) + C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 45, 8, 10) + C3589.m345(this.f142) + ")");
    }
}
