package nts;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputLayout;
import com.nsoftware.ipworks3ds.sdk.core.ClientMultiSelectChallengeListener;
import com.nsoftware.ipworks3ds.sdk.core.ClientOutOfBandChallengeListener;
import com.nsoftware.ipworks3ds.sdk.core.ClientSingleSelectorChallengeListener;
import com.nsoftware.ipworks3ds.sdk.core.SDKToolbarLayout;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import qE.C14943c;
import qE.C14947g;
import qE.C14948h;
import qE.C14949i;
import qE.C14950j;
import rE.C14998c;
import rE.C14999d;
import rE.C15001f;
import tE.C15075d;
import u2.C6012a;

/* renamed from: nts.ⵜ  reason: contains not printable characters */
public class C4158 extends AppCompatActivity implements ComponentCallbacks2 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static final String f3793 = C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 9, 13, 23);

    /* renamed from: ગ  reason: contains not printable characters */
    public static final Map<String, Bitmap> f3794 = new HashMap();

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final LinearLayout.LayoutParams f3795 = new LinearLayout.LayoutParams(-2, -2);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final String f3796 = C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 0, 9, 9);

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static final String f3797 = System.getProperty(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 458, 14, 30));

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f3798 = false;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public boolean f3799 = true;

    /* renamed from: ખ  reason: contains not printable characters */
    public Timer f3800 = null;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public final Handler f3801 = new C4167(this);

    /* renamed from: ⶏ  reason: contains not printable characters */
    public C4140 f3802;

    /* renamed from: nts.ⵜ$ϴ  reason: contains not printable characters */
    public class C4159 implements View.OnClickListener {

        /* renamed from: ગ  reason: contains not printable characters */
        public final /* synthetic */ C3730 f3803;

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ AppCompatActivity f3804;

        public C4159(AppCompatActivity appCompatActivity, C3730 r32) {
            this.f3804 = appCompatActivity;
            this.f3803 = r32;
        }

        public void onClick(View view) {
            C4158.this.m3481(this.f3804, this.f3803);
        }
    }

    /* renamed from: nts.ⵜ$Е  reason: contains not printable characters */
    public class C4160 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ C3730 f3806;

        public C4160(C4158 r12, C3730 r22) {
            this.f3806 = r22;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            try {
                C4208 r12 = this.f3806.f1036;
                if (r12 != null) {
                    r12.f4076.f688 = z10;
                }
            } catch (C3625 e10) {
                throw new C3675(e10);
            } catch (C3675 unused) {
            }
        }
    }

    /* renamed from: nts.ⵜ$ࡏ  reason: contains not printable characters */
    public class C4161 implements View.OnClickListener {

        /* renamed from: ϴ  reason: contains not printable characters */
        public final /* synthetic */ int f3807;

        /* renamed from: ગ  reason: contains not printable characters */
        public final /* synthetic */ TextView f3808;

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ TextView f3809;

        /* renamed from: ᐳ  reason: contains not printable characters */
        public final /* synthetic */ Drawable f3810;

        /* renamed from: ⶊ  reason: contains not printable characters */
        public final /* synthetic */ Drawable f3811;

        public C4161(TextView textView, TextView textView2, Drawable drawable, int i10, Drawable drawable2) {
            this.f3809 = textView;
            this.f3808 = textView2;
            this.f3810 = drawable;
            this.f3807 = i10;
            this.f3811 = drawable2;
        }

        public void onClick(View view) {
            if (this.f3809.getVisibility() == 0) {
                C4158.this.m3488(this.f3808, this.f3810, this.f3807);
                this.f3809.setVisibility(8);
            } else if (this.f3809.getVisibility() == 8) {
                C4158.this.m3488(this.f3808, this.f3811, this.f3807);
                this.f3809.setVisibility(0);
            }
        }
    }

    /* renamed from: nts.ⵜ$ખ  reason: contains not printable characters */
    public class C4162 implements View.OnClickListener {

        /* renamed from: ϴ  reason: contains not printable characters */
        public final /* synthetic */ int f3813;

        /* renamed from: ગ  reason: contains not printable characters */
        public final /* synthetic */ TextView f3814;

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ TextView f3815;

        /* renamed from: ᐳ  reason: contains not printable characters */
        public final /* synthetic */ Drawable f3816;

        /* renamed from: ⶊ  reason: contains not printable characters */
        public final /* synthetic */ Drawable f3817;

        public C4162(TextView textView, TextView textView2, Drawable drawable, int i10, Drawable drawable2) {
            this.f3815 = textView;
            this.f3814 = textView2;
            this.f3816 = drawable;
            this.f3813 = i10;
            this.f3817 = drawable2;
        }

        public void onClick(View view) {
            if (this.f3815.getVisibility() == 0) {
                C4158.this.m3488(this.f3814, this.f3816, this.f3813);
                this.f3815.setVisibility(8);
            } else if (this.f3815.getVisibility() == 8) {
                C4158.this.m3488(this.f3814, this.f3817, this.f3813);
                this.f3815.setVisibility(0);
            }
        }
    }

    /* renamed from: nts.ⵜ$ગ  reason: contains not printable characters */
    public class C4163 extends TimerTask {

        /* renamed from: ગ  reason: contains not printable characters */
        public final /* synthetic */ C3730 f3819;

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ AppCompatActivity f3820;

        public C4163(AppCompatActivity appCompatActivity, C3730 r32) {
            this.f3820 = appCompatActivity;
            this.f3819 = r32;
        }

        public void run() {
            C4158.this.m3494(this.f3820, this.f3819);
        }
    }

    /* renamed from: nts.ⵜ$ഇ  reason: contains not printable characters */
    public class C4164 extends Thread {

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ AppCompatActivity f3823;

        public C4164(AppCompatActivity appCompatActivity) {
            this.f3823 = appCompatActivity;
        }

        public void run() {
            try {
                C3734 r12 = C3734.f1057;
                r12.m1121();
                try {
                    r12.f1064.m1095(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 234, 33, 37));
                    if (!C4158.m3479(C4158.this.f3801)) {
                        r12.m1125(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 267, 50, 3));
                        C4158.m3478(C4158.this);
                        this.f3823.finish();
                        return;
                    }
                    C3581 r02 = r12.m1119();
                    r02.getClass();
                    C14943c cVar = r02.f313;
                    if (cVar != null) {
                        cVar.cancelled();
                    }
                    C4158.m3478(C4158.this);
                    this.f3823.finish();
                } catch (C3675 e10) {
                    C3734.f1057.m1124(e10);
                    C4158.m3478(C4158.this);
                    this.f3823.finish();
                }
            } catch (NullPointerException e11) {
                C3734.f1057.m1123(e11.getMessage());
            } catch (Throwable th2) {
                C4158.m3478(C4158.this);
                this.f3823.finish();
                throw th2;
            }
        }
    }

    /* renamed from: nts.ⵜ$ᅯ  reason: contains not printable characters */
    public class C4165 extends Thread {

        /* renamed from: ϴ  reason: contains not printable characters */
        public final /* synthetic */ int f3824;

        /* renamed from: ગ  reason: contains not printable characters */
        public final /* synthetic */ int f3826;

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ C3730 f3827;

        /* renamed from: ᐳ  reason: contains not printable characters */
        public final /* synthetic */ String f3828;

        /* renamed from: ⶊ  reason: contains not printable characters */
        public final /* synthetic */ String f3829;

        /* renamed from: ⶏ  reason: contains not printable characters */
        public final /* synthetic */ AppCompatActivity f3830;

        public C4165(C3730 r22, int i10, String str, int i11, String str2, AppCompatActivity appCompatActivity) {
            this.f3827 = r22;
            this.f3826 = i10;
            this.f3828 = str;
            this.f3824 = i11;
            this.f3829 = str2;
            this.f3830 = appCompatActivity;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:59|60|61|(2:63|64)|65|66|67) */
        /* JADX WARNING: Can't wrap try/catch for region: R(7:68|69|100|(2:102|103)|104|105|106) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:70|(2:72|73)|74|75|(1:77)(1:78)|(8:80|(1:82)(2:83|84)|85|86|87|(1:89)|93|(1:95))(1:96)|97|(2:99|112)(1:111)) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:104:0x0160 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x00bd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:74:0x00d8 */
        /* JADX WARNING: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x00ab A[Catch:{ all -> 0x00c8, Exception -> 0x001c }] */
        /* JADX WARNING: Removed duplicated region for block: B:70:0x00cb A[Catch:{ all -> 0x00c8, Exception -> 0x001c }] */
        /* JADX WARNING: Removed duplicated region for block: B:77:0x00ed A[Catch:{ all -> 0x00c8, Exception -> 0x001c }] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x00ef A[Catch:{ all -> 0x00c8, Exception -> 0x001c }] */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x00f5 A[Catch:{ all -> 0x00c8, Exception -> 0x001c }] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x013e A[Catch:{ all -> 0x00c8, Exception -> 0x001c }] */
        /* JADX WARNING: Removed duplicated region for block: B:99:0x014d A[Catch:{ all -> 0x00c8, Exception -> 0x001c }] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:104:0x0160=Splitter:B:104:0x0160, B:74:0x00d8=Splitter:B:74:0x00d8, B:65:0x00bd=Splitter:B:65:0x00bd} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.String r0 = "wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ"
                nts.ഗ r1 = r8.f3827     // Catch:{ Exception -> 0x001c }
                nts.વ r1 = r1.m1107()     // Catch:{ Exception -> 0x001c }
                int r2 = r8.f3826     // Catch:{ ࢧ -> 0x001f }
                r3 = 2
                if (r2 != r3) goto L_0x0035
                nts.વ r2 = nts.C3709.HTML     // Catch:{ ࢧ -> 0x001f }
                if (r1 != r2) goto L_0x0035
                java.lang.String r2 = r8.f3828     // Catch:{ ࢧ -> 0x001f }
                if (r2 == 0) goto L_0x0022
                int r2 = r2.length()     // Catch:{ ࢧ -> 0x001f }
                if (r2 != 0) goto L_0x0035
                goto L_0x0022
            L_0x001c:
                r1 = move-exception
                goto L_0x017b
            L_0x001f:
                r1 = move-exception
                goto L_0x016b
            L_0x0022:
                nts.ഗ r2 = r8.f3827     // Catch:{ ࢧ -> 0x001f }
                nts.チ r2 = r2.f1036     // Catch:{ ࢧ -> 0x001f }
                java.lang.String r4 = "}\u000b\u001f\u0012\u0006\u0004\t\u0016\u0015\u0003\u000f\u001a\f\u0010\u000f\u0007\u0001onmiki\u0006fglef6*5=(*?-5\u0002\u0016\u0018\u0004'31-;/%/(=rjnwmun/waNcs}Td{CM]EAXBZA\u0000XNaL\\Rl^VVOHNRJNWMUN\u000fWAnQGFcQYY@GA+37.4,7v.8\u0017?/#%)3'9>8§´¨¨¾²ª¹Ô°­±¯¶¦»¤¹ ÕÈÖÊÒûÑÛ×ÐØÐØÕåÛÞÑçÓÚÉÀÄÂÂÊÁ×ÁßÅÂýàööüÕÏÊÄîÆÑÑÏÉÕÀáÙØÆÚ§¬¨¦¦á´ î¬¨¯ê÷ôµ½£ðJlgcmm*k%ubt!FP<~{mlp|rwtbr0w}a\f~XSWYY\u001eK_\u0011AV@\u0015r^ZLI_C_W|ESTFVnC^Q}:}so>GLGT/\t\u0002\u0006\b\bO\u001a\u000e@\u0013\u0003\u0017\u0017\u0002F:\u0017\u0015\u001c\u0014\u001b/\u001f\u0003\u0011\u001e\u0017\u0001\u0011\u0005Li\u000b\u001d\u0011\t9;;-5?16\u001a ;5-;wÚøóÙ÷åõýÊ÷ù½éÿóØæçÝñ²úã±ãàèäìâíí¨§µ«ÚâÄÏËÅÅ×ÃÉÊÆÌØÊÀÐäÄÞÀÖøÜÊÞîØÖÒàäòîïï¬½»¿¹ ºõ ®ºæý÷ÙßÒÞÅöÎÏÑÍá"
                r5 = 28
                r6 = 127(0x7f, float:1.78E-43)
                r7 = 208(0xd0, float:2.91E-43)
                java.lang.String r4 = nts.C3727.m1052((java.lang.String) r4, (int) r7, (int) r5, (int) r6)     // Catch:{ ࢧ -> 0x001f }
                r2.m3767(r4)     // Catch:{ ࢧ -> 0x001f }
            L_0x0035:
                nts.ഗ r2 = r8.f3827     // Catch:{ ࢧ -> 0x001f }
                int r4 = r8.f3824     // Catch:{ ࢧ -> 0x001f }
                r5 = 0
                r6 = 1
                if (r4 != r3) goto L_0x003f
                r4 = r6
                goto L_0x0040
            L_0x003f:
                r4 = r5
            L_0x0040:
                nts.チ r7 = r2.f1036     // Catch:{ ࢧ -> 0x001f }
                if (r7 == 0) goto L_0x0050
                nts.ڨ r7 = r7.f4076     // Catch:{ Ԕ -> 0x0049 }
                r7.f700 = r4     // Catch:{ Ԕ -> 0x0049 }
                goto L_0x0050
            L_0x0049:
                r1 = move-exception
                nts.ࢧ r2 = new nts.ࢧ     // Catch:{ ࢧ -> 0x001f }
                r2.<init>(r1)     // Catch:{ ࢧ -> 0x001f }
                throw r2     // Catch:{ ࢧ -> 0x001f }
            L_0x0050:
                java.lang.String r4 = r8.f3828     // Catch:{ ࢧ -> 0x001f }
                r2.m1108(r4)     // Catch:{ ࢧ -> 0x001f }
                java.lang.String r2 = r8.f3829     // Catch:{ ࢧ -> 0x001f }
                if (r2 == 0) goto L_0x005e
                nts.ഗ r4 = r8.f3827     // Catch:{ ࢧ -> 0x001f }
                r4.m1089(r2)     // Catch:{ ࢧ -> 0x001f }
            L_0x005e:
                nts.વ r2 = nts.C3709.OOB     // Catch:{ ࢧ -> 0x001f }
                if (r1 == r2) goto L_0x0091
                nts.વ r2 = nts.C3709.HTML_OOB     // Catch:{ ࢧ -> 0x001f }
                if (r1 != r2) goto L_0x0067
                goto L_0x0091
            L_0x0067:
                nts.વ r2 = nts.C3709.INFORMATION     // Catch:{ ࢧ -> 0x001f }
                if (r1 != r2) goto L_0x007d
                nts.ഗ r2 = r8.f3827     // Catch:{ ࢧ -> 0x001f }
                nts.チ r2 = r2.f1036     // Catch:{ ࢧ -> 0x001f }
                if (r2 == 0) goto L_0x009b
                nts.ڨ r2 = r2.f4076     // Catch:{ Ԕ -> 0x0076 }
                r2.f716 = r6     // Catch:{ Ԕ -> 0x0076 }
                goto L_0x009b
            L_0x0076:
                r1 = move-exception
                nts.ࢧ r2 = new nts.ࢧ     // Catch:{ ࢧ -> 0x001f }
                r2.<init>(r1)     // Catch:{ ࢧ -> 0x001f }
                throw r2     // Catch:{ ࢧ -> 0x001f }
            L_0x007d:
                int r2 = r8.f3824     // Catch:{ ࢧ -> 0x001f }
                if (r2 != r6) goto L_0x009b
                nts.ഗ r2 = r8.f3827     // Catch:{ ࢧ -> 0x001f }
                r3 = 181(0xb5, float:2.54E-43)
                r4 = 24
                r7 = 100
                java.lang.String r3 = nts.C3727.m1052((java.lang.String) r0, (int) r3, (int) r4, (int) r7)     // Catch:{ ࢧ -> 0x001f }
                r2.m1095((java.lang.String) r3)     // Catch:{ ࢧ -> 0x001f }
                goto L_0x009b
            L_0x0091:
                int r2 = r8.f3824     // Catch:{ ࢧ -> 0x001f }
                if (r2 != 0) goto L_0x0096
                r3 = r6
            L_0x0096:
                nts.ഗ r2 = r8.f3827     // Catch:{ ࢧ -> 0x001f }
                r2.m1097((int) r3)     // Catch:{ ࢧ -> 0x001f }
            L_0x009b:
                r2 = 95
                r3 = 25
                r4 = 205(0xcd, float:2.87E-43)
                nts.ⵜ r7 = nts.C4158.this     // Catch:{ all -> 0x00c8 }
                android.os.Handler r7 = r7.f3801     // Catch:{ all -> 0x00c8 }
                boolean r7 = nts.C4158.m3479((android.os.Handler) r7)     // Catch:{ all -> 0x00c8 }
                if (r7 != 0) goto L_0x00cb
                androidx.appcompat.app.AppCompatActivity r1 = r8.f3830     // Catch:{ all -> 0x00c8 }
                r1.finish()     // Catch:{ all -> 0x00c8 }
                int r1 = r8.f3824     // Catch:{ Exception -> 0x001c }
                if (r1 != r6) goto L_0x00bd
                nts.ഗ r1 = r8.f3827     // Catch:{ Exception -> 0x00bd }
                java.lang.String r2 = nts.C3727.m1052((java.lang.String) r0, (int) r4, (int) r3, (int) r2)     // Catch:{ Exception -> 0x00bd }
                r1.m1095((java.lang.String) r2)     // Catch:{ Exception -> 0x00bd }
            L_0x00bd:
                nts.ഗ r1 = r8.f3827     // Catch:{ Exception -> 0x001c }
                r1.m1097((int) r5)     // Catch:{ Exception -> 0x001c }
                nts.ഗ r1 = r8.f3827     // Catch:{ Exception -> 0x001c }
                r1.m1100((int) r5)     // Catch:{ Exception -> 0x001c }
                return
            L_0x00c8:
                r1 = move-exception
                goto L_0x0153
            L_0x00cb:
                int r7 = r8.f3824     // Catch:{ Exception -> 0x001c }
                if (r7 != r6) goto L_0x00d8
                nts.ഗ r7 = r8.f3827     // Catch:{ Exception -> 0x00d8 }
                java.lang.String r2 = nts.C3727.m1052((java.lang.String) r0, (int) r4, (int) r3, (int) r2)     // Catch:{ Exception -> 0x00d8 }
                r7.m1095((java.lang.String) r2)     // Catch:{ Exception -> 0x00d8 }
            L_0x00d8:
                nts.ഗ r2 = r8.f3827     // Catch:{ Exception -> 0x001c }
                r2.m1097((int) r5)     // Catch:{ Exception -> 0x001c }
                nts.ഗ r2 = r8.f3827     // Catch:{ Exception -> 0x001c }
                r2.m1100((int) r5)     // Catch:{ Exception -> 0x001c }
                nts.ⵜ r2 = nts.C4158.this     // Catch:{ Exception -> 0x001c }
                nts.C4158.m3478((nts.C4158) r2)     // Catch:{ Exception -> 0x001c }
                nts.ഗ r2 = r8.f3827     // Catch:{ Exception -> 0x001c }
                nts.チ r3 = r2.f1036     // Catch:{ Exception -> 0x001c }
                if (r3 != 0) goto L_0x00ef
                r3 = r6
                goto L_0x00f3
            L_0x00ef:
                nts.ڨ r3 = r3.f4076     // Catch:{ Exception -> 0x001c }
                boolean r3 = r3.f691     // Catch:{ Exception -> 0x001c }
            L_0x00f3:
                if (r3 == 0) goto L_0x013e
                nts.ⵜ r3 = nts.C4158.this     // Catch:{ Exception -> 0x001c }
                java.lang.String r2 = r2.m1110()     // Catch:{ Exception -> 0x001c }
                nts.ഗ r4 = r8.f3827     // Catch:{ Exception -> 0x001c }
                nts.チ r4 = r4.f1036     // Catch:{ Exception -> 0x001c }
                if (r4 != 0) goto L_0x0104
                java.lang.String r4 = ""
                goto L_0x010e
            L_0x0104:
                nts.ڨ r4 = r4.f4076     // Catch:{ Exception -> 0x001c }
                nts.ᚃ r4 = r4.f3222     // Catch:{ Exception -> 0x001c }
                java.lang.StringBuffer r4 = r4.f2269     // Catch:{ Exception -> 0x001c }
                java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x001c }
            L_0x010e:
                r3.getClass()     // Catch:{ Exception -> 0x001c }
                nts.ഴ r3 = nts.C3734.f1057     // Catch:{ Exception -> 0x001c }
                nts.ϴ r3 = r3.m1119()     // Catch:{ Exception -> 0x001c }
                nts.ⶊ r5 = new nts.ⶊ     // Catch:{ Exception -> 0x001c }
                r5.<init>(r2, r4)     // Catch:{ Exception -> 0x001c }
                r3.getClass()     // Catch:{ Exception -> 0x001c }
                nts.C3952.m2192(r6)     // Catch:{ Exception -> 0x001c }
                qE.c r2 = r3.f313     // Catch:{ NullPointerException -> 0x012a }
                if (r2 == 0) goto L_0x0134
                r2.completed(r5)     // Catch:{ NullPointerException -> 0x012a }
                goto L_0x0134
            L_0x012a:
                r2 = move-exception
                nts.ഴ r3 = nts.C3734.f1057     // Catch:{ Exception -> 0x001c }
                java.lang.String r2 = r2.getMessage()     // Catch:{ Exception -> 0x001c }
                r3.m1123((java.lang.String) r2)     // Catch:{ Exception -> 0x001c }
            L_0x0134:
                nts.વ r2 = nts.C3709.OOB     // Catch:{ Exception -> 0x001c }
                if (r1 != r2) goto L_0x0149
                androidx.appcompat.app.AppCompatActivity r2 = r8.f3830     // Catch:{ Exception -> 0x001c }
                r2.finish()     // Catch:{ Exception -> 0x001c }
                goto L_0x0149
            L_0x013e:
                androidx.appcompat.app.AppCompatActivity r3 = r8.f3830     // Catch:{ Exception -> 0x001c }
                android.content.Intent r2 = nts.C3727.m1047((nts.C3730) r2, (android.app.Activity) r3)     // Catch:{ Exception -> 0x001c }
                androidx.appcompat.app.AppCompatActivity r3 = r8.f3830     // Catch:{ Exception -> 0x001c }
                r3.startActivity(r2)     // Catch:{ Exception -> 0x001c }
            L_0x0149:
                nts.વ r2 = nts.C3709.OOB     // Catch:{ Exception -> 0x001c }
                if (r1 == r2) goto L_0x0196
                androidx.appcompat.app.AppCompatActivity r1 = r8.f3830     // Catch:{ Exception -> 0x001c }
                r1.finish()     // Catch:{ Exception -> 0x001c }
                goto L_0x0196
            L_0x0153:
                int r7 = r8.f3824     // Catch:{ Exception -> 0x001c }
                if (r7 != r6) goto L_0x0160
                nts.ഗ r6 = r8.f3827     // Catch:{ Exception -> 0x0160 }
                java.lang.String r2 = nts.C3727.m1052((java.lang.String) r0, (int) r4, (int) r3, (int) r2)     // Catch:{ Exception -> 0x0160 }
                r6.m1095((java.lang.String) r2)     // Catch:{ Exception -> 0x0160 }
            L_0x0160:
                nts.ഗ r2 = r8.f3827     // Catch:{ Exception -> 0x001c }
                r2.m1097((int) r5)     // Catch:{ Exception -> 0x001c }
                nts.ഗ r2 = r8.f3827     // Catch:{ Exception -> 0x001c }
                r2.m1100((int) r5)     // Catch:{ Exception -> 0x001c }
                throw r1     // Catch:{ Exception -> 0x001c }
            L_0x016b:
                nts.ഴ r2 = nts.C3734.f1057     // Catch:{ Exception -> 0x001c }
                r2.m1124((nts.C3675) r1)     // Catch:{ Exception -> 0x001c }
                nts.ⵜ r1 = nts.C4158.this     // Catch:{ Exception -> 0x001c }
                nts.C4158.m3478((nts.C4158) r1)     // Catch:{ Exception -> 0x001c }
                androidx.appcompat.app.AppCompatActivity r1 = r8.f3830     // Catch:{ Exception -> 0x001c }
                r1.finish()     // Catch:{ Exception -> 0x001c }
                return
            L_0x017b:
                nts.ഴ r2 = nts.C3734.f1057
                nts.ϴ r2 = r2.m1119()
                nts.ภ r3 = new nts.ภ
                r4 = 4
                r5 = 35
                r6 = 230(0xe6, float:3.22E-43)
                java.lang.String r0 = nts.C3727.m1052((java.lang.String) r0, (int) r6, (int) r4, (int) r5)
                java.lang.String r1 = nts.C3727.m1051((java.lang.Exception) r1)
                r3.<init>(r0, r1)
                r2.runtimeError(r3)
            L_0x0196:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nts.C4158.C4165.run():void");
        }
    }

    /* renamed from: nts.ⵜ$ᐳ  reason: contains not printable characters */
    public class C4166 implements Runnable {

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ AppCompatActivity f3832;

        public C4166(AppCompatActivity appCompatActivity) {
            this.f3832 = appCompatActivity;
        }

        public void run() {
            C4158.this.m3489(this.f3832);
        }
    }

    /* renamed from: nts.ⵜ$ᘺ  reason: contains not printable characters */
    public static class C4167 extends Handler {

        /* renamed from: ഇ  reason: contains not printable characters */
        public WeakReference<C4158> f3833;

        public C4167(C4158 r22) {
            this.f3833 = new WeakReference<>(r22);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
            r2 = r2.get();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r2) {
            /*
                r1 = this;
                super.handleMessage(r2)
                java.lang.ref.WeakReference<nts.ⵜ> r2 = r1.f3833
                if (r2 == 0) goto L_0x001f
                java.lang.Object r2 = r2.get()
                nts.ⵜ r2 = (nts.C4158) r2
                nts.ⱑ r0 = r2.f3802
                if (r0 == 0) goto L_0x001f
                boolean r0 = r0.isShowing()
                if (r0 == 0) goto L_0x001c
                nts.ⱑ r0 = r2.f3802     // Catch:{ Exception -> 0x001c }
                r0.dismiss()     // Catch:{ Exception -> 0x001c }
            L_0x001c:
                r0 = 0
                r2.f3802 = r0
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nts.C4158.C4167.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: nts.ⵜ$ⴸ  reason: contains not printable characters */
    public class C4168 implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ C3730 f3834;

        public C4168(C4158 r12, C3730 r22) {
            this.f3834 = r22;
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            try {
                C4208 r12 = this.f3834.f1036;
                if (r12 != null) {
                    r12.f4076.f733 = z10;
                }
            } catch (C3625 e10) {
                throw new C3675(e10);
            } catch (C3675 unused) {
            }
        }
    }

    /* renamed from: nts.ⵜ$ⶊ  reason: contains not printable characters */
    public class C4169 implements View.OnClickListener {

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ AppCompatActivity f3836;

        public C4169(AppCompatActivity appCompatActivity) {
            this.f3836 = appCompatActivity;
        }

        public void onClick(View view) {
            C4158.this.m3496((String) null, (String) null, this.f3836, 1);
        }
    }

    /* renamed from: nts.ⵜ$ⶏ  reason: contains not printable characters */
    public class C4170 implements View.OnClickListener {

        /* renamed from: ഇ  reason: contains not printable characters */
        public final /* synthetic */ AppCompatActivity f3838;

        public C4170(AppCompatActivity appCompatActivity) {
            this.f3838 = appCompatActivity;
        }

        public void onClick(View view) {
            C4158.this.m3496((String) null, (String) null, this.f3838, 2);
        }
    }

    public void onBackPressed() {
        this.f3799 = false;
        m3480(this);
        new C4164(this).start();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m3497();
    }

    public void onDestroy() {
        Timer timer = this.f3800;
        if (timer != null) {
            timer.cancel();
            this.f3800 = null;
        }
        SDKToolbarLayout.f120794B = null;
        super.onDestroy();
    }

    public void onPause() {
        Context context;
        if (this.f3799 && !isChangingConfigurations() && (context = C3734.f1057.f1062) != null) {
            String string = context.getResources().getString(C14950j.f130473a);
            if (string.length() > 0) {
                Toast.makeText(this, string, 1).show();
            }
        }
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (!m3497()) {
            C3734 r02 = C3734.f1057;
            r02.m1121();
            m3494((AppCompatActivity) this, r02.f1064);
        }
    }

    public void onTrimMemory(int i10) {
        f3794.clear();
        super.onTrimMemory(i10);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3481(AppCompatActivity appCompatActivity, C3730 r82) {
        String str;
        try {
            C4208 r12 = r82.f1036;
            if (r12 == null) {
                str = "";
            } else {
                str = r12.f4076.f728.f2269.toString();
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            intent.setAction(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 317, 26, 45));
            appCompatActivity.startActivity(intent);
        } catch (Exception unused) {
            r82.m1100(1);
            m3496("", (String) null, appCompatActivity, 3);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m3497() {
        if (C3734.f1057.f1066) {
            return false;
        }
        Log.e(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 22, 10, 37), C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 32, 35, 107));
        C3734.f1056 = true;
        finish();
        return true;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public void m3498(AppCompatActivity appCompatActivity, C3730 r92) {
        if (this.f3800 == null) {
            int r02 = r92.m1092();
            if (r02 <= 0) {
                m3494(appCompatActivity, r92);
                return;
            }
            Timer timer = new Timer();
            this.f3800 = timer;
            timer.schedule(new C4163(appCompatActivity, r92), 1000 * ((long) r02), 1000);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3490(AppCompatActivity appCompatActivity, Context context, View.OnClickListener onClickListener) {
        Integer r22;
        C3734 r02 = C3734.f1057;
        if (r02.f1066) {
            try {
                r02.m1121();
                C3730 r12 = r02.f1064;
                C3709 r82 = r12.m1107();
                if (r82 != C3709.HTML) {
                    if (r02.f1068 == null) {
                        r02.f1068 = new C15001f();
                    }
                    C15001f fVar = r02.f1068;
                    C14998c d10 = fVar.d();
                    appCompatActivity.getWindow().setFlags(8192, 8192);
                    appCompatActivity.setContentView(C14949i.f130469b);
                    C3727.m1060(appCompatActivity.getWindow(), appCompatActivity.getIntent());
                    SDKToolbarLayout.getCancelButton().setOnClickListener(new C3922(this, appCompatActivity));
                    String a10 = fVar.a();
                    if (!(a10 == null || (r22 = C3727.m1033(a10)) == null)) {
                        appCompatActivity.findViewById(C14948h.f130446e).setBackgroundColor(r22.intValue());
                    }
                    String r23 = r12.m1111();
                    ImageView imageView = (ImageView) appCompatActivity.findViewById(C14948h.f130459r);
                    if (r23.length() > 0) {
                        new C3913(imageView, f3794).execute(new String[]{r23});
                    }
                    String r24 = r12.m1090();
                    ImageView imageView2 = (ImageView) appCompatActivity.findViewById(C14948h.f130457p);
                    if (r24.length() > 0) {
                        new C3913(imageView2, f3794).execute(new String[]{r24});
                    }
                    LinearLayout linearLayout = (LinearLayout) appCompatActivity.findViewById(C14948h.f130445d);
                    m3491(appCompatActivity, context, linearLayout, r12, fVar);
                    m3495(appCompatActivity, d10, r12);
                    m3493(appCompatActivity, linearLayout, r12, onClickListener, fVar, r82);
                    m3492(appCompatActivity, context, r12, fVar);
                    appCompatActivity.getWindow().setSoftInputMode(2);
                    m3498(appCompatActivity, r12);
                }
            } catch (Exception e10) {
                C3734.f1057.m1119().runtimeError(new C3752(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 67, 4, 7), C3727.m1051(e10)));
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m3482() {
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        return point.x > point.y;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public final void m3480(AppCompatActivity appCompatActivity) {
        C4140 r02 = new C4140(appCompatActivity);
        if (C3734.f1057.f1067.f3870) {
            r02.f3724 = 1000;
        }
        this.f3802 = r02;
        r02.show();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3491(AppCompatActivity appCompatActivity, Context context, LinearLayout linearLayout, C3730 r25, C15001f fVar) {
        String str;
        String str2;
        boolean z10;
        String str3;
        C3894 r15;
        C3894 r152;
        C3563 r62;
        C3563 r153;
        LinearLayout linearLayout2;
        C3719 r42;
        C3719 r52;
        AppCompatActivity appCompatActivity2 = appCompatActivity;
        Context context2 = context;
        LinearLayout linearLayout3 = linearLayout;
        C3730 r43 = r25;
        C14998c d10 = fVar.d();
        C3709 r63 = r25.m1107();
        int r72 = r25.m1106();
        boolean z11 = true;
        int i10 = 0;
        boolean z12 = r72 == 2;
        TextView textView = (TextView) linearLayout3.findViewById(C14948h.f130452k);
        C4208 r12 = r43.f1036;
        String str4 = "";
        if (r12 == null) {
            str = str4;
        } else {
            str = r12.f4076.f686.f2269.toString();
        }
        m3476(textView, str);
        C15001f.b bVar = C15001f.b.INFO_HEADER;
        String m10 = d10.m(bVar);
        if (m10 == null) {
            m10 = d10.i();
        }
        String g10 = d10.g(bVar);
        String n10 = d10.n(bVar);
        if (n10 == null) {
            n10 = d10.j();
        }
        C3727.m1061(textView, m10, g10, n10, C3727.m1046(d10, bVar), d10.h(), d10.l(bVar));
        LinearLayout linearLayout4 = (LinearLayout) appCompatActivity2.findViewById(C14948h.f130456o);
        TextView textView2 = (TextView) linearLayout4.findViewById(C14948h.f130455n);
        C4208 r14 = r43.f1036;
        if (r14 == null) {
            str2 = str4;
        } else {
            str2 = r14.f4076.f720.f2269.toString();
        }
        m3477(textView2, str2, z12);
        C3727.m1069(d10, textView2, C15001f.b.INFO_TEXT);
        C4208 r142 = r43.f1036;
        if (r142 == null) {
            z10 = false;
        } else {
            z10 = r142.f4076.f713;
        }
        if (!z10) {
            linearLayout4.removeView((ImageView) appCompatActivity2.findViewById(C14948h.f130466y));
        }
        TextView textView3 = (TextView) linearLayout3.findViewById(C14948h.f130453l);
        if (!z12 || r63 != C3709.TEXT) {
            C4208 r11 = r43.f1036;
            if (r11 != null) {
                str4 = r11.f4076.f705.f2269.toString();
            }
            str3 = str4;
        } else {
            str3 = null;
        }
        if (str3 == null || str3.length() == 0) {
            linearLayout3.removeView(textView3);
        } else {
            textView3.setText(str3.replace("\\n", f3797));
            C3727.m1069(d10, textView3, C15001f.b.INFO_LABEL);
        }
        LinearLayout linearLayout5 = (LinearLayout) appCompatActivity2.findViewById(C14948h.f130444c);
        if (r63 == C3709.TEXT) {
            if (r72 == 2) {
                C14998c d11 = fVar.d();
                C4208 r44 = r43.f1036;
                if (r44 == null || (r52 = r44.f4076.f682) == null) {
                    r62 = null;
                } else {
                    r62 = new C3563(r52);
                }
                if (r44 == null || (r42 = r44.f4076.f717) == null) {
                    r153 = null;
                } else {
                    r153 = new C3563(r42);
                }
                boolean r45 = m3482();
                if (!r45 || r153 == null) {
                    linearLayout2 = linearLayout5;
                } else {
                    LinearLayout linearLayout6 = new LinearLayout(context2);
                    linearLayout6.setOrientation(0);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
                    layoutParams.setMargins(16, 0, 16, 0);
                    LinearLayout linearLayout7 = new LinearLayout(context2);
                    linearLayout7.setOrientation(1);
                    linearLayout7.setLayoutParams(layoutParams);
                    linearLayout2 = new LinearLayout(context2);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setLayoutParams(layoutParams);
                    linearLayout6.addView(linearLayout7);
                    linearLayout6.addView(linearLayout2);
                    linearLayout5.addView(linearLayout6);
                    linearLayout5 = linearLayout7;
                }
                TextView r53 = m3484(context2, r62.f137.f970.f2269.toString(), false);
                C3727.m1069(d11, r53, C15001f.b.DATA_ENTRY_LABEL);
                linearLayout5.addView(r53);
                m3485(context2, linearLayout5, fVar.e(), r62);
                if (r153 != null) {
                    if (r45 || r62.f137.f972 > 0) {
                        z11 = false;
                    }
                    TextView r32 = m3484(context2, r153.f137.f970.f2269.toString(), z11);
                    C3727.m1069(d11, r32, C15001f.b.DATA_ENTRY_LABEL_2);
                    linearLayout2.addView(r32);
                    m3485(context2, linearLayout2, fVar.f(), r153);
                    return;
                }
                return;
            }
            EditText r13 = m3483(context2);
            C3727.m1070(fVar.e(), r13);
            linearLayout5.addView(r13);
        } else if (r63 == C3709.SINGLE_SELECT) {
            ClientSingleSelectorChallengeListener clientSingleSelectorChallengeListener = (ClientSingleSelectorChallengeListener) appCompatActivity2;
            C4208 r46 = r43.f1036;
            if (r46 == null) {
                r152 = null;
            } else {
                r152 = new C3894(r46.f4076.f679, true);
            }
            C3875 r47 = new C3875(r152);
            clientSingleSelectorChallengeListener.f120788v = r47;
            String[] strArr = r47.f1731;
            if (strArr != null) {
                RadioGroup radioGroup = new RadioGroup(context2);
                radioGroup.setLayoutParams(f3795);
                Integer r64 = C3727.m1033(d10.g(C15001f.b.SELECTION_LIST));
                if (r64 != null) {
                    linearLayout5.setBackgroundColor(r64.intValue());
                }
                while (i10 < strArr.length) {
                    String str5 = strArr[i10];
                    RadioButton radioButton = new RadioButton(context2);
                    radioButton.setLayoutParams(f3795);
                    m3476((TextView) radioButton, str5);
                    radioButton.setId(i10 + 5000);
                    C3727.m1069(d10, (TextView) radioButton, C15001f.b.SELECTION_LIST);
                    radioGroup.addView(radioButton);
                    i10++;
                }
                linearLayout5.addView(radioGroup);
                return;
            }
            throw new C15075d(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 71, 55, 27));
        } else if (r63 == C3709.MULTI_SELECT) {
            ClientMultiSelectChallengeListener clientMultiSelectChallengeListener = (ClientMultiSelectChallengeListener) appCompatActivity2;
            C4208 r48 = r43.f1036;
            if (r48 == null) {
                r15 = null;
            } else {
                r15 = new C3894(r48.f4076.f679, true);
            }
            C3875 r49 = new C3875(r15);
            clientMultiSelectChallengeListener.f120783v = r49;
            String[] strArr2 = r49.f1731;
            if (strArr2 != null) {
                CheckBox[] checkBoxArr = new CheckBox[strArr2.length];
                while (i10 < strArr2.length) {
                    CheckBox checkBox = new CheckBox(context2);
                    checkBoxArr[i10] = checkBox;
                    checkBox.setLayoutParams(f3795);
                    m3476((TextView) checkBoxArr[i10], strArr2[i10]);
                    C3727.m1069(d10, (TextView) checkBoxArr[i10], C15001f.b.SELECTION_LIST);
                    linearLayout5.addView(checkBoxArr[i10]);
                    i10++;
                }
                Integer r16 = C3727.m1033(d10.g(C15001f.b.SELECTION_LIST));
                if (r16 != null) {
                    linearLayout5.setBackgroundColor(r16.intValue());
                    return;
                }
                return;
            }
            throw new C15075d(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 126, 55, 69));
        } else if (r63 == C3709.OOB) {
            ClientOutOfBandChallengeListener clientOutOfBandChallengeListener = (ClientOutOfBandChallengeListener) appCompatActivity2;
            if (r72 == 0 && clientOutOfBandChallengeListener.f120787v && r25.m1112().length() > 0) {
                m3476(textView2, r25.m1112());
                if (linearLayout4.findViewById(C14948h.f130466y) != null) {
                    linearLayout4.removeView((ImageView) appCompatActivity2.findViewById(C14948h.f130466y));
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0144  */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m3493(androidx.appcompat.app.AppCompatActivity r9, android.widget.LinearLayout r10, nts.C3730 r11, android.view.View.OnClickListener r12, rE.C15001f r13, nts.C3709 r14) {
        /*
            r8 = this;
            int r0 = qE.C14948h.f130462u
            android.view.View r0 = r10.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            nts.વ r1 = nts.C3709.OOB
            r2 = 1
            java.lang.String r3 = ""
            r4 = 0
            if (r14 != r1) goto L_0x002c
            nts.チ r5 = r11.f1036
            if (r5 != 0) goto L_0x0016
            r5 = r3
            goto L_0x0020
        L_0x0016:
            nts.ڨ r5 = r5.f4076
            nts.ᚃ r5 = r5.f701
            java.lang.StringBuffer r5 = r5.f2269
            java.lang.String r5 = r5.toString()
        L_0x0020:
            rE.f$a r6 = rE.C15001f.a.CONTINUE
            int r7 = r5.length()
            if (r7 != 0) goto L_0x002a
            r7 = r2
            goto L_0x003f
        L_0x002a:
            r7 = r4
            goto L_0x003f
        L_0x002c:
            nts.チ r5 = r11.f1036
            if (r5 != 0) goto L_0x0032
            r5 = r3
            goto L_0x003c
        L_0x0032:
            nts.ڨ r5 = r5.f4076
            nts.ᚃ r5 = r5.f722
            java.lang.StringBuffer r5 = r5.f2269
            java.lang.String r5 = r5.toString()
        L_0x003c:
            rE.f$a r6 = rE.C15001f.a.SUBMIT
            goto L_0x002a
        L_0x003f:
            if (r7 == 0) goto L_0x004d
            int r12 = qE.C14948h.f130447f
            android.view.View r12 = r9.findViewById(r12)
            android.widget.LinearLayout r12 = (android.widget.LinearLayout) r12
            r12.removeView(r0)
            goto L_0x005a
        L_0x004d:
            m3476((android.widget.TextView) r0, (java.lang.String) r5)
            rE.a r6 = r13.b(r6)
            nts.C3727.m1068((rE.C14996a) r6, (android.widget.Button) r0)
            r0.setOnClickListener(r12)
        L_0x005a:
            int r12 = qE.C14948h.f130460s
            android.view.View r12 = r10.findViewById(r12)
            android.widget.Button r12 = (android.widget.Button) r12
            boolean r6 = r11.m1109()
            java.lang.String r7 = "\\n"
            if (r6 == 0) goto L_0x00ca
            if (r14 != r1) goto L_0x00ca
            int r14 = r5.length()
            if (r14 <= 0) goto L_0x0084
            android.view.ViewParent r14 = r12.getParent()
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r14.removeView(r0)
            r14.removeView(r12)
            r14.addView(r12, r4)
            r14.addView(r0, r2)
        L_0x0084:
            nts.チ r14 = r11.f1036
            if (r14 != 0) goto L_0x008a
            r14 = r3
            goto L_0x0094
        L_0x008a:
            nts.ڨ r14 = r14.f4076
            nts.ᚃ r14 = r14.f712
            java.lang.StringBuffer r14 = r14.f2269
            java.lang.String r14 = r14.toString()
        L_0x0094:
            nts.チ r0 = r11.f1036
            if (r0 != 0) goto L_0x0099
            goto L_0x00a3
        L_0x0099:
            nts.ڨ r0 = r0.f4076
            nts.ᚃ r0 = r0.f728
            java.lang.StringBuffer r0 = r0.f2269
            java.lang.String r3 = r0.toString()
        L_0x00a3:
            int r0 = r14.length()
            if (r0 <= 0) goto L_0x00fe
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x00fe
            java.lang.String r0 = f3797
            java.lang.String r14 = r14.replace(r7, r0)
            r12.setText(r14)
            nts.ⵜ$ϴ r14 = new nts.ⵜ$ϴ
            r14.<init>(r9, r11)
            r12.setOnClickListener(r14)
            rE.f$a r14 = rE.C15001f.a.OOB_OPEN_APP
            rE.a r14 = r13.b(r14)
            nts.C3727.m1068((rE.C14996a) r14, (android.widget.Button) r12)
            goto L_0x0109
        L_0x00ca:
            nts.チ r0 = r11.f1036
            if (r0 != 0) goto L_0x00cf
            goto L_0x00d9
        L_0x00cf:
            nts.ڨ r0 = r0.f4076
            nts.ᚃ r0 = r0.f730
            java.lang.StringBuffer r0 = r0.f2269
            java.lang.String r3 = r0.toString()
        L_0x00d9:
            nts.વ r0 = nts.C3709.TEXT
            if (r14 != r0) goto L_0x00fe
            int r14 = r3.length()
            if (r14 <= 0) goto L_0x00fe
            java.lang.String r14 = f3797
            java.lang.String r14 = r3.replace(r7, r14)
            r12.setText(r14)
            nts.ⵜ$ⶊ r14 = new nts.ⵜ$ⶊ
            r14.<init>(r9)
            r12.setOnClickListener(r14)
            rE.f$a r14 = rE.C15001f.a.RESEND
            rE.a r14 = r13.b(r14)
            nts.C3727.m1068((rE.C14996a) r14, (android.widget.Button) r12)
            goto L_0x0109
        L_0x00fe:
            int r14 = qE.C14948h.f130447f
            android.view.View r14 = r9.findViewById(r14)
            android.widget.LinearLayout r14 = (android.widget.LinearLayout) r14
            r14.removeView(r12)
        L_0x0109:
            int r12 = qE.C14948h.f130442a
            android.view.View r10 = r10.findViewById(r12)
            android.widget.Button r10 = (android.widget.Button) r10
            boolean r12 = r11.m1109()
            if (r12 == 0) goto L_0x0144
            java.lang.String r12 = r11.m1114()
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x0144
            java.lang.String r12 = r11.m1114()
            int r12 = r12.length()
            if (r12 <= 0) goto L_0x014f
            java.lang.String r11 = r11.m1114()
            m3476((android.widget.TextView) r10, (java.lang.String) r11)
            nts.ⵜ$ⶏ r11 = new nts.ⵜ$ⶏ
            r11.<init>(r9)
            r10.setOnClickListener(r11)
            rE.f$a r9 = rE.C15001f.a.ADDITIONAL
            rE.a r9 = r13.b(r9)
            nts.C3727.m1068((rE.C14996a) r9, (android.widget.Button) r10)
            goto L_0x014f
        L_0x0144:
            int r11 = qE.C14948h.f130447f
            android.view.View r9 = r9.findViewById(r11)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r9.removeView(r10)
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4158.m3493(androidx.appcompat.app.AppCompatActivity, android.widget.LinearLayout, nts.ഗ, android.view.View$OnClickListener, rE.f, nts.વ):void");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3492(AppCompatActivity appCompatActivity, Context context, C3730 r22, C15001f fVar) {
        int i10;
        int i11;
        int i12;
        C14998c cVar;
        boolean z10;
        int i13;
        TextView textView;
        TextView textView2;
        String str;
        C3730 r82 = r22;
        C14998c d10 = fVar.d();
        LinearLayout linearLayout = (LinearLayout) appCompatActivity.findViewById(C14948h.f130440B);
        TextView textView3 = (TextView) linearLayout.findViewById(C14948h.f130439A);
        TextView textView4 = (TextView) linearLayout.findViewById(C14948h.f130441C);
        int c10 = fVar.c();
        Drawable drawable = context.getResources().getDrawable(C14947g.f130437b);
        Drawable drawable2 = context.getResources().getDrawable(C14947g.f130438c);
        boolean z11 = r22.m1106() == 2;
        int i14 = 30;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            i10 = bitmap.getWidth();
            i11 = bitmap.getHeight();
        } else {
            i11 = 30;
            i10 = 30;
        }
        if (drawable2 instanceof BitmapDrawable) {
            Bitmap bitmap2 = ((BitmapDrawable) drawable2).getBitmap();
            int width = bitmap2.getWidth();
            i12 = bitmap2.getHeight();
            i14 = width;
        } else {
            i12 = 30;
        }
        drawable.setBounds(0, 0, i10, i11);
        drawable2.setBounds(0, 0, i14, i12);
        String str2 = "";
        if (r22.m1091().length() > 0) {
            m3488(textView3, drawable, c10);
            m3476(textView3, r22.m1091());
            cVar = d10;
            C4161 r92 = r0;
            z10 = z11;
            C4161 r02 = new C4161(textView4, textView3, drawable, c10, drawable2);
            textView3.setOnClickListener(r92);
            C4208 r03 = r82.f1036;
            if (r03 == null) {
                str = str2;
            } else {
                str = r03.f4076.f727.f2269.toString();
            }
            m3477(textView4, str, z10);
            i13 = 8;
            textView4.setVisibility(8);
        } else {
            i13 = 8;
            z10 = z11;
            cVar = d10;
            linearLayout.removeView(textView3);
            linearLayout.removeView(textView4);
        }
        TextView textView5 = (TextView) linearLayout.findViewById(C14948h.f130449h);
        TextView textView6 = (TextView) linearLayout.findViewById(C14948h.f130450i);
        if (r22.m1094().length() > 0) {
            m3488(textView5, drawable, c10);
            m3476(textView5, r22.m1094());
            textView = textView4;
            int i15 = i13;
            int i16 = c10;
            textView2 = textView6;
            textView5.setOnClickListener(new C4162(textView6, textView5, drawable, i16, drawable2));
            C4208 r04 = r82.f1036;
            if (r04 != null) {
                str2 = r04.f4076.f726.f2269.toString();
            }
            m3477(textView2, str2, z10);
            textView2.setVisibility(i15);
            textView3.setGravity(16);
            textView5.setGravity(16);
            textView3.setCompoundDrawablePadding(20);
            textView5.setCompoundDrawablePadding(20);
        } else {
            textView2 = textView6;
            textView = textView4;
            linearLayout.removeView(textView5);
            linearLayout.removeView(textView2);
        }
        C14998c cVar2 = cVar;
        C3727.m1069(cVar2, textView3, C15001f.b.WHY_INFO);
        C3727.m1069(cVar2, textView, C15001f.b.WHY_INFO_TEXT);
        C3727.m1069(cVar2, textView5, C15001f.b.EXPANDABLE_INFO);
        C3727.m1069(cVar2, textView2, C15001f.b.EXPANDABLE_INFO_TEXT);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3495(AppCompatActivity appCompatActivity, C14998c cVar, C3730 r92) {
        int i10;
        boolean z10;
        String str;
        C4208 r02 = r92.f1036;
        if (r02 == null) {
            i10 = 0;
        } else {
            i10 = r02.f4076.f677;
        }
        boolean z11 = true;
        boolean z12 = r92.m1106() == 2;
        LinearLayout linearLayout = (LinearLayout) appCompatActivity.findViewById(C14948h.f130445d);
        if (!z12 || i10 != 1) {
            if (r92.m1093().length() <= 0) {
                C4208 r03 = r92.f1036;
                if (r03 == null) {
                    str = "";
                } else {
                    str = r03.f4076.f725.f2269.toString();
                }
                if (str.length() <= 0) {
                    z10 = false;
                    if (r92.m1091().length() <= 0 && r92.m1094().length() <= 0) {
                        z11 = false;
                    }
                    if (z12 || !z10 || !z11 || !m3482()) {
                        m3487(linearLayout, cVar, -1, r92);
                        return;
                    }
                    LinearLayout linearLayout2 = (LinearLayout) ((LinearLayout) appCompatActivity.findViewById(C14948h.f130454m)).findViewById(C14948h.f130465x);
                    linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    m3487(linearLayout2, cVar, -1, r92);
                    return;
                }
            }
            z10 = true;
            z11 = false;
            if (z12) {
            }
            m3487(linearLayout, cVar, -1, r92);
            return;
        }
        m3487(linearLayout, cVar, linearLayout.indexOfChild(linearLayout.findViewById(C14948h.f130447f)), r92);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final TextView m3484(Context context, String str, boolean z10) {
        TextView textView = new TextView(context);
        textView.setText(str.replace("\\n", f3797));
        textView.setTypeface(textView.getTypeface(), 1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        if (z10) {
            layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin + 20, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3485(Context context, LinearLayout linearLayout, C14999d dVar, C3563 r92) {
        int i10;
        EditText r02 = m3483(context);
        C3719 r12 = r92.f137;
        if (r12.f966 == 1) {
            i10 = r12.f969 ? 18 : 2;
        } else {
            i10 = r12.f969 ? 129 : 1;
        }
        r02.setInputType(i10);
        C3719 r13 = r92.f137;
        if (r13.f968) {
            int i11 = r13.f971;
            if (i11 == 1) {
                r02.setAutofillHints(new String[]{"smsOTPCode"});
            } else if (i11 == 2) {
                r02.setAutofillHints(new String[]{"password"});
            }
            r02.setImportantForAutofill(1);
        }
        C3727.m1070(dVar, r02);
        TextInputLayout textInputLayout = new TextInputLayout(context);
        textInputLayout.setPasswordVisibilityToggleEnabled(r92.f137.f967);
        int i12 = r92.f137.f972;
        if (i12 > 0) {
            textInputLayout.setCounterEnabled(true);
            textInputLayout.setCounterMaxLength(i12);
        }
        if (i12 <= 0) {
            i12 = 45;
        }
        r02.setFilters(new InputFilter[]{new InputFilter.LengthFilter(i12)});
        textInputLayout.addView(r02);
        linearLayout.addView(textInputLayout);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final EditText m3483(Context context) {
        EditText editText = new EditText(context);
        editText.setText("");
        editText.setMaxLines(1);
        editText.setSingleLine();
        editText.setPadding(20, editText.getPaddingTop(), editText.getPaddingRight(), editText.getPaddingBottom());
        editText.setBackground(C6012a.e(context, C14947g.f130436a));
        editText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return editText;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3487(LinearLayout linearLayout, C14998c cVar, int i10, C3730 r13) {
        String stringBuffer;
        if (r13.m1093().length() > 0) {
            LinearLayout linearLayout2 = linearLayout;
            C14998c cVar2 = cVar;
            m3486(linearLayout2, r13.m1093(), f3796, cVar2, C15001f.b.WHITELIST, i10, new C4160(this, r13));
            if (i10 >= 0) {
                i10++;
            }
        }
        int i11 = i10;
        if (r13.m1109()) {
            C4208 r12 = r13.f1036;
            if (r12 == null) {
                stringBuffer = "";
            } else {
                stringBuffer = r12.f4076.f725.f2269.toString();
            }
            String str = stringBuffer;
            if (str.length() > 0) {
                LinearLayout linearLayout3 = linearLayout;
                C14998c cVar3 = cVar;
                m3486(linearLayout3, str, f3793, cVar3, C15001f.b.DEVICE_BINDING, i11, new C4168(this, r13));
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3486(LinearLayout linearLayout, String str, String str2, C14998c cVar, C15001f.b bVar, int i10, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        CheckBox checkBox = new CheckBox(linearLayout.getContext());
        checkBox.setTag(str2);
        checkBox.setText(str.replace("\\n", f3797));
        checkBox.setOnCheckedChangeListener(onCheckedChangeListener);
        checkBox.setMinimumHeight(40);
        linearLayout.addView(checkBox, i10);
        C3727.m1069(cVar, (TextView) checkBox, bVar);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m3477(TextView textView, String str, boolean z10) {
        int indexOf;
        if (z10) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            int length = str.length();
            int i10 = 0;
            boolean z11 = false;
            do {
                indexOf = str.indexOf("**", i10);
                if (indexOf == -1) {
                    indexOf = str.length();
                    if (z11) {
                        i10 -= 2;
                    }
                    spannableStringBuilder.append(str.substring(i10, indexOf));
                    continue;
                } else {
                    String substring = str.substring(i10, indexOf);
                    if (z11) {
                        spannableStringBuilder.append(substring, new StyleSpan(1), 0);
                    } else {
                        spannableStringBuilder.append(substring);
                    }
                    z11 = !z11;
                    i10 = indexOf + 2;
                    continue;
                }
            } while (indexOf < length);
            textView.setText(spannableStringBuilder);
            return;
        }
        textView.setText(str.replace("\\n", f3797));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3496(String str, String str2, AppCompatActivity appCompatActivity, int i10) {
        Button button;
        C3734 r02 = C3734.f1057;
        r02.m1121();
        C3730 r32 = r02.f1064;
        int r42 = r32.m1106();
        this.f3799 = false;
        LinearLayout linearLayout = (LinearLayout) appCompatActivity.findViewById(C14948h.f130445d);
        if (linearLayout != null) {
            Button button2 = (Button) linearLayout.findViewById(C14948h.f130462u);
            if (button2 != null) {
                button2.setEnabled(false);
                button2.setClickable(false);
            }
            C3709 r52 = C3709.TEXT;
            r02.m1121();
            if (r52 == r02.f1064.m1107() && (button = (Button) linearLayout.findViewById(C14948h.f130460s)) != null) {
                button.setEnabled(false);
                button.setClickable(false);
            }
        }
        m3480(appCompatActivity);
        C3952.m2192(4);
        C3952.m2192(1);
        new C4165(r32, r42, str, i10, str2, appCompatActivity).start();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3489(AppCompatActivity appCompatActivity) {
        this.f3799 = false;
        m3480(appCompatActivity);
        new C4164(appCompatActivity).start();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3494(AppCompatActivity appCompatActivity, C3730 r62) {
        if (!this.f3798) {
            C4140 r02 = this.f3802;
            if ((r02 == null || !r02.isShowing()) && r62.m1092() <= 0) {
                this.f3798 = true;
                C3734.f1057.m1120(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 343, 54, 117));
                appCompatActivity.runOnUiThread(new C4166(appCompatActivity));
                Timer timer = this.f3800;
                if (timer != null) {
                    timer.cancel();
                }
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m3478(C4158 r12) {
        r12.f3801.sendEmptyMessage(0);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3488(TextView textView, Drawable drawable, int i10) {
        if (i10 == 1) {
            textView.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        } else if (i10 == 0) {
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        } else {
            textView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a4  */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m3479(android.os.Handler r10) {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ"
            nts.ഴ r2 = nts.C3734.f1057
            r2.m1121()
            nts.ഗ r2 = r2.f1064
            r3 = 1
            nts.チ r4 = r2.f1036     // Catch:{ ࢧ -> 0x001a }
            if (r4 == 0) goto L_0x002a
            boolean r5 = r4.f4073     // Catch:{ Ԕ -> 0x001c }
            if (r5 != 0) goto L_0x001e
            r4.m3768()     // Catch:{ Ԕ -> 0x001c }
            r4.f4073 = r3     // Catch:{ Ԕ -> 0x001c }
            goto L_0x001e
        L_0x001a:
            r4 = move-exception
            goto L_0x002b
        L_0x001c:
            r4 = move-exception
            goto L_0x0024
        L_0x001e:
            nts.ڨ r4 = r4.f4076     // Catch:{ Ԕ -> 0x001c }
            r4.m678()     // Catch:{ Ԕ -> 0x001c }
            goto L_0x002a
        L_0x0024:
            nts.ࢧ r5 = new nts.ࢧ     // Catch:{ ࢧ -> 0x001a }
            r5.<init>(r4)     // Catch:{ ࢧ -> 0x001a }
            throw r5     // Catch:{ ࢧ -> 0x001a }
        L_0x002a:
            return r3
        L_0x002b:
            nts.ഴ r5 = nts.C3734.f1057
            java.lang.String r6 = nts.C3727.m1051((java.lang.Exception) r4)
            r5.m1123((java.lang.String) r6)
            r6 = 0
            if (r10 == 0) goto L_0x003a
            r10.sendEmptyMessage(r6)
        L_0x003a:
            nts.ϴ r10 = r5.m1119()
            if (r10 != 0) goto L_0x0041
            return r6
        L_0x0041:
            int r5 = r4.f805
            r7 = 1000(0x3e8, float:1.401E-42)
            if (r5 <= r7) goto L_0x00de
            r5 = 397(0x18d, float:5.56E-43)
            r7 = 22
            r8 = 13
            java.lang.String r5 = nts.C3727.m1052((java.lang.String) r1, (int) r5, (int) r7, (int) r8)     // Catch:{ Exception -> 0x0061 }
            java.lang.String r5 = r2.m1095((java.lang.String) r5)     // Catch:{ Exception -> 0x0061 }
            if (r5 == 0) goto L_0x0061
            int r7 = r5.length()     // Catch:{ Exception -> 0x0061 }
            if (r7 <= 0) goto L_0x0061
            int r3 = java.lang.Integer.parseInt(r5)     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            if (r3 > 0) goto L_0x006e
            int r3 = r4.f805
            r5 = 1402(0x57a, float:1.965E-42)
            if (r3 != r5) goto L_0x006e
            r10.timedout()
            goto L_0x00e6
        L_0x006e:
            r3 = 419(0x1a3, float:5.87E-43)
            r5 = 9
            r7 = 18
            java.lang.String r3 = nts.C3727.m1052((java.lang.String) r1, (int) r3, (int) r5, (int) r7)     // Catch:{ ࢧ -> 0x009b }
            java.lang.String r3 = r2.m1095((java.lang.String) r3)     // Catch:{ ࢧ -> 0x009b }
            r5 = 428(0x1ac, float:6.0E-43)
            r7 = 16
            r8 = 86
            java.lang.String r5 = nts.C3727.m1052((java.lang.String) r1, (int) r5, (int) r7, (int) r8)     // Catch:{ ࢧ -> 0x0099 }
            java.lang.String r5 = r2.m1095((java.lang.String) r5)     // Catch:{ ࢧ -> 0x0099 }
            r7 = 444(0x1bc, float:6.22E-43)
            r8 = 11
            r9 = 26
            java.lang.String r1 = nts.C3727.m1052((java.lang.String) r1, (int) r7, (int) r8, (int) r9)     // Catch:{ ࢧ -> 0x009d }
            java.lang.String r1 = r2.m1095((java.lang.String) r1)     // Catch:{ ࢧ -> 0x009d }
            goto L_0x009e
        L_0x0099:
            r5 = r0
            goto L_0x009d
        L_0x009b:
            r3 = r0
            r5 = r3
        L_0x009d:
            r1 = r0
        L_0x009e:
            int r7 = r3.length()
            if (r7 != 0) goto L_0x00c8
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            int r0 = r4.f805
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = nts.C3727.m1051((java.lang.Exception) r4)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
        L_0x00c8:
            nts.ᜇ r0 = new nts.ᜇ
            java.lang.String r4 = r2.m1110()
            r0.<init>(r4, r3, r5, r1)
            nts.ṧ r1 = new nts.ṧ
            java.lang.String r2 = r2.m1110()
            r1.<init>(r2, r0)
            r10.protocolError(r1)
            goto L_0x00e6
        L_0x00de:
            nts.ภ r0 = new nts.ภ
            r0.<init>(r4)
            r10.runtimeError(r0)
        L_0x00e6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4158.m3479(android.os.Handler):boolean");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m3476(TextView textView, String str) {
        textView.setText(str.replace("\\n", f3797));
    }
}
