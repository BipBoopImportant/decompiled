package nts;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import com.nsoftware.ipworks3ds.sdk.core.ClientWebChallengeListener;
import java.io.ByteArrayInputStream;

/* renamed from: nts.ᬥ  reason: contains not printable characters */
public class C4019 extends WebViewClient {

    /* renamed from: ഇ  reason: contains not printable characters */
    public final ClientWebChallengeListener f2741;

    public C4019(ClientWebChallengeListener clientWebChallengeListener) {
        this.f2741 = clientWebChallengeListener;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str == null) {
            return null;
        }
        return m2594(Uri.parse(str));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        Uri parse = Uri.parse(str);
        if (!m2593(parse)) {
            C3734 r62 = C3734.f1057;
            r62.m1125(C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 182, 34, 91) + str);
            return true;
        } else if (C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 171, 11, 65).equalsIgnoreCase(parse.getPath())) {
            ClientWebChallengeListener clientWebChallengeListener = this.f2741;
            C3734 r72 = C3734.f1057;
            r72.m1121();
            clientWebChallengeListener.m3481(clientWebChallengeListener, r72.f1064);
            return true;
        } else {
            String query = parse.getQuery();
            ClientWebChallengeListener clientWebChallengeListener2 = this.f2741;
            clientWebChallengeListener2.m3496(query, (String) null, (AppCompatActivity) clientWebChallengeListener2, 0);
            return true;
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public final boolean m2592(Uri uri) {
        return uri.getPath() == null || uri.getPath().equals(C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 159, 12, 76));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public boolean m2593(Uri uri) {
        return C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 127, 6, 103).equalsIgnoreCase(uri.getHost()) && C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 133, 5, 79).equalsIgnoreCase(uri.getScheme()) && (C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 138, 10, 15).equalsIgnoreCase(uri.getPath()) || C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 148, 11, 60).equalsIgnoreCase(uri.getPath()));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public final WebResourceResponse m2594(Uri uri) {
        if (!m2593(uri) && !m2592(uri)) {
            C3734 r02 = C3734.f1057;
            r02.m1125(C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 69, 34, 11) + uri.toString());
        }
        return new WebResourceResponse(C3727.m1052("QA_R\u000eHWOAFFW=/>).<* \t%=\u000e&0 \u00021+9;:\u0001/,/(98!+/+-1;ABAFWVOEAEC_Uy\\NFT@@UY)\u0015\u001a\n\u001a\u0007\u000b\u0007D04.@\b\u0011C\u0012\u0012\n_\u0019\u0015\u0016\u0014\u0003\u0010\u0012VP$ :vmjzdi5sltz,4vzrbbk{1x~m%1[RJ.^H§º¹¼¸ íåíçæìæàãÍÑÅÉÉÊÆêÚÙð¸¼ª²¹¶¶ù¿¶»Î¨¶¹©¹¤¨¤çã«²à±±©üº¶µ· ³±õóÕÎ", 103, 24, 97), C3734.f1058.toString(), new ByteArrayInputStream(new byte[0]));
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return m2594(webResourceRequest.getUrl());
    }
}
