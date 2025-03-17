package nts;

import com.google.ar.core.ImageMetadata;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmProcessorActivity;
import java.util.Hashtable;
import java.util.Vector;
import nts.C4012;
import nts.C4100;

/* renamed from: nts.ҡ  reason: contains not printable characters */
public class C3607 extends C3987 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public long f467;

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f468;

    /* renamed from: и  reason: contains not printable characters */
    public long f469;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f470;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f471;

    /* renamed from: ખ  reason: contains not printable characters */
    public boolean f472;

    /* renamed from: ഗ  reason: contains not printable characters */
    public boolean f473;

    /* renamed from: ภ  reason: contains not printable characters */
    public C4131 f474;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public Vector f475;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public boolean f476;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public Hashtable f477;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public boolean f478;

    /* renamed from: ᢼ  reason: contains not printable characters */
    public C3660 f479;

    /* renamed from: ṧ  reason: contains not printable characters */
    public C3831 f480;

    /* renamed from: ⱑ  reason: contains not printable characters */
    public long f481;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public C4012 f482;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f483;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public boolean f484;

    public C3607(C4131 r13, long j10) {
        this.f467 = 0;
        this.f483 = 0;
        this.f484 = false;
        this.f470 = 0;
        this.f472 = false;
        this.f468 = false;
        this.f482 = new C4012();
        this.f475 = new Vector();
        this.f477 = new Hashtable();
        this.f471 = 0;
        this.f469 = 0;
        this.f476 = false;
        this.f478 = false;
        this.f479 = new C3660();
        this.f473 = false;
        this.f481 = 0;
        this.f480 = null;
        this.f483 = (int) (3 & j10);
        this.f467 = j10;
        this.f474 = r13;
        C3783 r14 = r13.m3331().m645();
        long j11 = (long) r14.f1278;
        int i10 = this.f483;
        if (i10 == 0 || i10 == 1) {
            j11 = (long) (i10 == 0 ? r14.f1276 : r14.f1288);
        }
        this.f480 = new C3831(r13, this.f467, r13.m3370(), r13.m3335(), j11);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public long m464() {
        long j10;
        long r02 = this.f480.m1674();
        int i10 = this.f482.f2704;
        if (this.f475.size() > 0) {
            for (int i11 = 0; i11 < this.f475.size(); i11++) {
                i10 += ((C3997) this.f475.get(i11)).f2653.length;
            }
        }
        int i12 = ImageMetadata.SHADING_MODE - this.f471;
        C4131 r32 = this.f474;
        if (!r32.f3638) {
            j10 = 0;
        } else {
            C3537 r52 = r32.f3621;
            j10 = Math.min(r52.f23 - r52.f22, r32.f3596.m2032());
        }
        return Math.max(Math.min(Math.min(r02, j10) - ((long) i10), (long) i12), 0);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m466(C3997 r11) {
        this.f472 = true;
        this.f473 = r11.m2456();
        long j10 = r11.m2459() ? r11.f2652 : 0;
        int r32 = this.f479.m711(j10, r11.f2653);
        if (r32 == -1) {
            C4131 r02 = this.f474;
            r02.m3363(C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 22, 45, 59) + r11.f2651 + C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 67, 10, 27) + j10 + C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 77, 19, 3) + this.f479.f766);
        } else if (r32 == 1) {
            C4131 r03 = this.f474;
            r03.m3363(C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 96, 47, 78) + r11.f2651 + C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 143, 10, 46) + j10 + C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 153, 19, 15) + this.f479.f766);
        }
        return this.f479.f767;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean m467() {
        return this.f482.f2704 > 0 || this.f475.size() > 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m465(byte[] bArr, int i10, int i11, boolean z10) {
        if (this.f484) {
            throw new C3625((Throwable) null, AffirmProcessorActivity.RESULT_CODE_ERROR, C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 172, 31, 121));
        } else if (!this.f476) {
            int i12 = this.f483;
            if (i12 == 2) {
                this.f474.getClass();
            } else if (i12 == 3) {
                this.f474.getClass();
            }
            int min = (int) Math.min((long) i11, m464());
            this.f470 = min;
            if (min > 0) {
                C4012 r42 = this.f482;
                r42.getClass();
                C4012.C4013 r52 = new C4012.C4013(r42);
                byte[] bArr2 = new byte[min];
                r52.f2708 = bArr2;
                System.arraycopy(bArr, i10, bArr2, 0, min);
                C4100 r82 = r42.f2705;
                C4100.C4101 r92 = r82.f3501;
                if (r92 == null) {
                    C4100.C4101 r93 = new C4100.C4101(r82, r52);
                    r82.f3502 = r93;
                    r82.f3501 = r93;
                } else {
                    r82.m3251(r92, r52);
                }
                r42.f2704 += min;
            }
            int i13 = this.f471;
            int i14 = this.f470;
            this.f471 = i13 + i14;
            boolean z11 = true;
            if (i14 < i11) {
                if (this.f474.f1662 != 0) {
                    z11 = false;
                }
                this.f468 = z11;
                throw new C3625((Throwable) null, 135, C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 0, 22, 99));
            }
            this.f472 = true;
            this.f478 = z10;
            return i14;
        } else {
            throw new C3625((Throwable) null, AffirmProcessorActivity.RESULT_CODE_ERROR, C3727.m1052(":\u0004\u0012\u0004\u0010\u0004\u001a\u001d\u0013\\\b\u0011\f\u0014\u001fZ\u0007\b\b\u0005\nNDtromfgsmm*Xxkn}1Tauxs7j|y~uk{{\u001a\u0001QWV@GJ\b@N\u0011\f~s?70$1!`{q|:&)=8.00w976 79voNuw\"jb'i{lnx-_{|tq~2Sfv{|8i~yvhDD\u0019\u0002VPUCHE\u000bCI\u0016\u000fÆÎÉÝÈØ©¤âþñåàöèè¯áïîøïá®·ª¦§¡»ìº°ª´¤æ³«å»û»µ±¬¹¹ò ¤£³¶¹õÖÚÛÝÇÆÌÖÈØÏ×Ç×ÑÍÓÒËÁÈÄÄÌÚâåñôÿÛìøýéÿ®ìáïììð¥ñõñíÿ»èò¾þ°ÒþúñûâºáÇÃßÅÌÚÊÄ÷ÍÍÁÏÕÝÚÎÒÓÓßÓâÆÁÑÔÛAoidhs$fkeffz/{{gu1bx4t:H}khzn0kMIUOFP@N\u000b}GGKE_WPDXYYUY\u001ahLK[^Q", 203, 37, 88));
        }
    }

    public C3607() {
        this.f467 = 0;
        this.f483 = 0;
        this.f484 = false;
        this.f470 = 0;
        this.f472 = false;
        this.f468 = false;
        this.f482 = new C4012();
        this.f475 = new Vector();
        this.f477 = new Hashtable();
        this.f471 = 0;
        this.f469 = 0;
        this.f476 = false;
        this.f478 = false;
        this.f479 = new C3660();
        this.f473 = false;
        this.f481 = 0;
        this.f480 = null;
        this.f474 = null;
    }
}
