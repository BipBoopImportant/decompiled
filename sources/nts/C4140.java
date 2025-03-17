package nts;

import android.app.Activity;
import android.app.ProgressDialog;

/* renamed from: nts.ⱑ  reason: contains not printable characters */
public class C4140 extends ProgressDialog {

    /* renamed from: ϴ  reason: contains not printable characters */
    public boolean f3720 = true;

    /* renamed from: Е  reason: contains not printable characters */
    public final Activity f3721;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public boolean f3722 = true;

    /* renamed from: ખ  reason: contains not printable characters */
    public String f3723 = null;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f3724 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public long f3725;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public boolean f3726 = false;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public boolean f3727 = false;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public boolean f3728 = false;

    public C4140(Activity activity) {
        super(activity);
        this.f3721 = activity;
        setCancelable(false);
        setProgressStyle(0);
        setIndeterminate(true);
    }

    public void dismiss() {
        if (this.f3722) {
            this.f3726 = false;
            if (this.f3724 > 0) {
                while (System.currentTimeMillis() - this.f3725 < ((long) this.f3724)) {
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException unused) {
                    }
                }
            }
            this.f3725 = 0;
            try {
                if (!this.f3721.isDestroyed()) {
                    super.dismiss();
                }
            } catch (Exception e10) {
                C3734 r12 = C3734.f1057;
                r12.m1120(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 494, 35, 96) + e10.getMessage());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0094  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            android.view.Window r9 = r8.getWindow()
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r1 = 0
            r0.<init>(r1)
            r9.setBackgroundDrawable(r0)
            android.view.Window r9 = r8.getWindow()
            r0 = 17
            r9.setGravity(r0)
            boolean r9 = r8.f3720
            if (r9 != 0) goto L_0x0025
            android.view.Window r9 = r8.getWindow()
            r0 = 2
            r9.clearFlags(r0)
        L_0x0025:
            boolean r9 = r8.f3727
            java.lang.String r0 = "wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ"
            if (r9 == 0) goto L_0x0098
            int r9 = qE.C14949i.f130470c
            r8.setContentView(r9)
            android.view.Window r9 = r8.getWindow()
            int r2 = qE.C14948h.f130467z
            android.view.View r9 = r9.findViewById(r2)
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            boolean r2 = r8.f3728
            if (r2 != 0) goto L_0x0043
            r9.setBackgroundColor(r1)
        L_0x0043:
            java.lang.String r2 = r8.f3723
            if (r2 == 0) goto L_0x0081
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 472(0x1d8, float:6.61E-43)
            r4 = 14
            r5 = 53
            java.lang.String r3 = nts.C3727.m1052((java.lang.String) r0, (int) r3, (int) r4, (int) r5)
            r2.append(r3)
            java.lang.String r3 = r8.f3723
            java.lang.String r3 = r3.toLowerCase()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            nts.ഴ r3 = nts.C3734.f1057
            android.content.Context r3 = r3.f1062
            if (r3 == 0) goto L_0x0081
            android.content.res.Resources r4 = r3.getResources()
            r6 = 486(0x1e6, float:6.81E-43)
            r7 = 8
            java.lang.String r5 = nts.C3727.m1052((java.lang.String) r0, (int) r6, (int) r7, (int) r5)
            java.lang.String r3 = r3.getPackageName()
            int r2 = r4.getIdentifier(r2, r5, r3)
            goto L_0x0082
        L_0x0081:
            r2 = r1
        L_0x0082:
            android.view.Window r3 = r8.getWindow()
            int r4 = qE.C14948h.f130448g
            android.view.View r3 = r3.findViewById(r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            if (r2 <= 0) goto L_0x0094
            r3.setImageResource(r2)
            goto L_0x009d
        L_0x0094:
            r9.removeView(r3)
            goto L_0x009d
        L_0x0098:
            int r9 = qE.C14949i.f130471d
            r8.setContentView(r9)
        L_0x009d:
            int r9 = qE.C14948h.f130458q
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ProgressBar r9 = (android.widget.ProgressBar) r9
            if (r9 == 0) goto L_0x00ef
            nts.ഴ r2 = nts.C3734.f1057
            nts.ⶏ r2 = r2.f1067
            java.lang.String r2 = r2.f3876
            java.lang.Integer r2 = nts.C3727.m1033(r2)
            if (r2 == 0) goto L_0x00b8
            int r0 = r2.intValue()
            goto L_0x00e8
        L_0x00b8:
            android.app.Activity r2 = r8.f3721
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            int r3 = r3.data
            int r4 = qE.C14946f.f130435b
            int[] r4 = new int[]{r4}
            android.content.res.TypedArray r3 = r2.obtainStyledAttributes(r3, r4)
            int r1 = r3.getColor(r1, r1)
            r3.recycle()
            android.content.Intent r2 = r2.getIntent()
            if (r2 == 0) goto L_0x00e7
            r3 = 12
            r4 = 112(0x70, float:1.57E-43)
            r5 = 533(0x215, float:7.47E-43)
            java.lang.String r0 = nts.C3727.m1052((java.lang.String) r0, (int) r5, (int) r3, (int) r4)
            int r0 = r2.getIntExtra(r0, r1)
            goto L_0x00e8
        L_0x00e7:
            r0 = r1
        L_0x00e8:
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r9.setIndeterminateTintList(r0)
        L_0x00ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4140.onCreate(android.os.Bundle):void");
    }

    public void show() {
        if (this.f3722 && !this.f3726) {
            this.f3726 = true;
            this.f3725 = System.currentTimeMillis();
            super.show();
        }
    }
}
