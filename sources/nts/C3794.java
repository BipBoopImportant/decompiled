package nts;

/* renamed from: nts.ᆇ  reason: contains not printable characters */
public class C3794 extends C4029 {

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f1327 = C3596.f365;

    public C3794() {
        this.f2779 = 64;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 241, 14, 3));
        sb2.append(C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 255, 6, 81) + this.f2778 + ") ");
        sb2.append(C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 261, 12, 24) + ((this.f2779 & 4) >> 2) + ")");
        m2637(sb2);
        return sb2.toString();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m1307(C4042 r42, C3647 r52) {
        int i10 = r42.f1610;
        int i11 = this.f2779 | (r52.f655 << 2);
        this.f2779 = i11;
        r42.m1745((byte) i11);
        r42.m1752(this.f1327);
        try {
            r52.m647();
        } catch (Exception unused) {
        }
        C3558 r53 = r52.f652;
        byte[] r12 = m2643();
        int length = r12.length;
        try {
            m2641(r42, i10, r12, r53);
            this.f2777 = r42.f1610 - i10;
        } catch (Exception e10) {
            throw new C3625(e10, C3625.m591(e10), C3625.m589(e10));
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m1308() {
        return 2;
    }
}
