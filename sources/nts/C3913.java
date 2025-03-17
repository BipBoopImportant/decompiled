package nts;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* renamed from: nts.ᖑ  reason: contains not printable characters */
public class C3913 extends AsyncTask<String, Void, Bitmap> {

    /* renamed from: ગ  reason: contains not printable characters */
    public Map<String, Bitmap> f1864;

    /* renamed from: ഇ  reason: contains not printable characters */
    public WeakReference<ImageView> f1865;

    public C3913(ImageView imageView, Map<String, Bitmap> map) {
        this.f1865 = new WeakReference<>(imageView);
        this.f1864 = map;
    }

    public Object doInBackground(Object[] objArr) {
        String str = ((String[]) objArr)[0];
        if (this.f1864 == null) {
            this.f1864 = new HashMap();
        }
        if (this.f1864.containsKey(str)) {
            return this.f1864.get(str);
        }
        Bitmap bitmap = null;
        try {
            bitmap = BitmapFactory.decodeStream(FirebasePerfUrlConnection.openStream(new URL(str)));
            this.f1864.put(str, bitmap);
        } catch (Exception e10) {
            C3734 r22 = C3734.f1057;
            r22.m1125(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 716, 30, 120) + str + C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 746, 3, 67) + e10.getMessage());
        }
        return bitmap;
    }

    public void onPostExecute(Object obj) {
        ImageView imageView;
        Bitmap bitmap = (Bitmap) obj;
        try {
            WeakReference<ImageView> weakReference = this.f1865;
            if (weakReference != null && (imageView = weakReference.get()) != null) {
                imageView.setImageBitmap(bitmap);
            }
        } catch (Exception e10) {
            C3734 r02 = C3734.f1057;
            r02.m1125(C3727.m1052("wikwaiot|wwgytsW}u~pvxphlUOWL\ruc)\u0019\u001aK\u001b\f\u001dO\u000b\b\u000e\u000f\u0001\u0001HG*\u001c\t\u000f\u001d\u000f\n\u0016\u001e\u0016R\u0012\u0004\u0005V\u0019'>duqrs(\u0002\b\u0004\u0003\u000b\u0003\u000b\u00061\u0004\f\u0002\u0005\u0011-\u0015\u001c\u0016.\u001e\u0012\b\u0019\u0000R\u0018\u0003W\u0018\u0000\u0018'di\u001b'!8 'b//3f-%+*<6::sOeocdldlaVckebvJr{qIyuo~g5d0g@\u0003\u000e|@F_G@\u0005HHT\u0001JBLM[Q]]\u0014­¸¯£¨¦ ¬¯§«£¢·¾´ç©®ª»ÙïúíáêÎäâîíåéáàÍõüö¥ùÿñïöôðóó­¤²ÍÁÿ{U\u0018\\LMSO\u0012\\SRCEFPN\u000b_AGCI\rABNBCKMK};lq{?hos}cpuc}zd%kel{afh#kmtdhs*dyoqvp1JTWDGQ]ZqiFzqxqjl9vrilrfthmm,knkaoo\u001a\u0015u[_BW\u0013HU[\u001f[Q[WH@H@E\u000fÕÿõùþöþöûËõðÿÉýôçîêììäýËÈÔÎþÑÛÕ¯«èÞÝÁÛìÎÞÄÍËÎÂÌ¶²¶¼ð¬¹­³¡±¥¹¥×¶±¿¨¸¯¾¼±¹ëÍÆÂÌÌÞÊÃÏÒÍÊÑÎÏÌÖßÉßÆÇÒØÑßÝê¶¯WCB\t\n\u0007\u0007\u0005\u001f<\u001d\u0007\f\u0001\u0011\u001b\u0012\u0018\f\u001aR\u0011\u001f\u0011\u0017_;\u001d\u0010\u0010\u000e8\u001d\u001d%\r.\u0002\u001b\u0001\u0004\u0012'\u001b\u0007\u0000\u0016\u0013164\u0001\u000b\u001f\tA\u0002\f\u0002\u0004L(\f\u000b\u0003\u0002\u0005\u0017;\u000b\u001f\n\u0013\u0018\u0012\u00077\t\u0013\u0012\u0006\u0001\u001d$$\u001c\u0016\u0002\u0014\\\u001f\u0011\u001f\u0019Q2\b\u0016\u0017(\u0016\u000f\t\u0010\u0000\u0010&\u0018\u0002\u000b\u001f\u0018\u0004\u0005\u0005òøìú²ñÿñ÷¿Üæù÷óåÎæøæíùË÷ãäò÷íêèÚÐÄÒÙ×ÙßéÏÎÔÐØéÏÆÆÜêÓÓçÏèÄÙÃÊÜÕéñöäáÿøöìÊÁÅËËÙÍÄÎÑÉÈÊÛßÐÓÞÛØÕßÃì÷ûÝÖÒÜÜÎÚÄÓÅÚßÌËÊ", 749, 21, 69) + e10.getMessage());
        }
    }
}
