package nts;

import java.io.IOException;

/* renamed from: nts.ړ  reason: contains not printable characters */
public class C3648 extends Thread {

    /* renamed from: ગ  reason: contains not printable characters */
    public final /* synthetic */ C3988 f669;

    /* renamed from: ഇ  reason: contains not printable characters */
    public final /* synthetic */ boolean[] f670;

    public C3648(C3988 r12, boolean[] zArr) {
        this.f669 = r12;
        this.f670 = zArr;
    }

    public void run() {
        try {
            this.f669.f2608.startHandshake();
            synchronized (this.f669.f375) {
                this.f669.m2403((C3625) null, this.f670);
            }
        } catch (IOException e10) {
            synchronized (this.f669.f375) {
                this.f669.m2403(new C3625((Throwable) null, 13003, C3727.m1052("Be}J $.ppk5,06/3\u0017WvosW\u0017\t\u0015\u0013\n\u00162rlsxa}Y\u0019\u0007\u0019bcD\u000667+\u0010S(\u0006\u000e\u0001\u0003jc~byoPYDXCUOGY^HVUO^CAAqyg`vhkq`}hdfczgee\u0001\r\u000f\n\u0013\u000e\f\feu\u0007kppr\\L>RIIKSC7(8L--8^]3,,\"ÒÒÇ¡¢ÌÓÓÝ··¢¯´´¶¢ÔÖÁÊÑÓÓÆÛÙÙîìûðëééüáããÞÄËÇÚÎäèêãçãë£ðäñòãöðþþ¹ûöîõùá²âåþâðçñ¤­¡¡©í¤¢¬¥³¯§®¡û©¼©ª»³¿¶üñ²±º Î¾¿¯ÂÅÞ8\u000f\u0005\r\f\u001a\b\bC6-3G0\u0000\u0016\b\u0013\u0016\u0016E^Ysr{g{pdzz=OHV9hftdifvdr|4-\\ye}gTYY\u000e\u0013k\t 8'+?vc\tkBZEI]\u000eRTQGKCSN\u0003\u0018j\u0003):&ulV?\u0015\u0006\u001aS#\u0005\f\u001a\u0012\u001a\u000e\u0013BYºÐýà¾úäþúòþöó­´þ¹¤ú¾ º¾¶º²·ó£¥¼ª¢ª¾£òé°±­®¸ª«·´·§¦º¹º´ÄÅÙÚöõþäöÿéùÿÑüáÔïÿá§¤¯µ§®¸¨®­°¯·½³½·´./30\u001c\u001f\u0014\u000e\u001c\u0015\u0003\u0013\u0015;\u0016\u000b(\u0014\f\u0006\b\u0006\f\u000f6\r\u001d\u0003pznxf1rxf=cbz9GFFXgjejx# 2\u000601.*/,:&''\u001a9;!94?=.\u0006\n\u0001\u0011\u000b\u0001\n\u000bO\n\f\u0003\u0007\r\rXW{]KYXD@H\u0000ICM@VNFS\\\u001aHYLKZ^RW\u001d¡­¬ª°ç¥¦¦¨¦¸¨ªî¢£¿ò½µ¹²ª°º±¸òÿßÄøÛ×ÖÐÊßÜÜÒÜÂÒÐØÙÅÇÏÃÈÐÊÀËÂçúïêý¥¾¿ÐÊË", 649, 38, 110) + e10.getMessage() + "."), this.f670);
            }
        }
    }
}
