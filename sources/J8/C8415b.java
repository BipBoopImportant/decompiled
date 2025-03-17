package j8;

import D8.c;
import HJ.C15854t;
import XH.C16824o;
import XH.C16825p;
import android.annotation.SuppressLint;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.contentsquare.android.sdk.H;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\n2\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\fR\u001b\u0010%\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lj8/b;", "", "<init>", "()V", "Landroid/webkit/WebView;", "webView", "Lcom/contentsquare/android/sdk/H;", "jsInterface", "", "jsInterfaceName", "LXH/N;", "j", "(Landroid/webkit/WebView;Lcom/contentsquare/android/sdk/H;Ljava/lang/String;)V", "k", "(Lcom/contentsquare/android/sdk/H;Ljava/lang/String;)Ljava/lang/String;", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "jsBuilder", "c", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "i", "(Landroid/webkit/WebView;Lcom/contentsquare/android/sdk/H;)V", "Landroid/webkit/WebMessage;", "webMessage", "h", "(Landroid/webkit/WebMessage;Lcom/contentsquare/android/sdk/H;)V", "methodName", "Lorg/json/JSONArray;", "jsonArgs", "f", "(Ljava/lang/String;Lorg/json/JSONArray;Lcom/contentsquare/android/sdk/H;)V", "d", "LD8/c;", "b", "LXH/o;", "g", "()LD8/c;", "logger", "library_release"}, k = 1, mv = {1, 8, 0})
/* renamed from: j8.b  reason: case insensitive filesystem */
public final class C8415b {

    /* renamed from: a  reason: collision with root package name */
    public static final C8415b f54071a = new C8415b();

    /* renamed from: b  reason: collision with root package name */
    private static final C16824o f54072b = C16825p.b(a.f54073c);

    /* renamed from: j8.b$a */
    public static final class a extends C17544u implements C17631a<c> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f54073c = new a();

        public a() {
            super(0);
        }

        public final Object invoke() {
            return new c("CsJavascriptBridgeInjector");
        }
    }

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"j8/b$b", "Landroid/webkit/WebMessagePort$WebMessageCallback;", "Landroid/webkit/WebMessagePort;", "port", "Landroid/webkit/WebMessage;", "message", "LXH/N;", "onMessage", "(Landroid/webkit/WebMessagePort;Landroid/webkit/WebMessage;)V", "library_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: j8.b$b  reason: collision with other inner class name */
    public static final class C0858b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ H f54074a;

        public C0858b(H h10) {
            this.f54074a = h10;
        }

        public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            super.onMessage(webMessagePort, webMessage);
            if (webMessage != null) {
                C8415b.f54071a.h(webMessage, this.f54074a);
            }
        }
    }

    private C8415b() {
    }

    private final void c(StringBuilder sb2, String str) {
        sb2.append(C15854t.m("\n    var csBridgePort = null;\n    window.addEventListener('message', function(event) {\n        var ports = event.ports;\n        if (Array.isArray(ports) && ports.length > 0 && event.data == 'cs:bridge:initialize') {\n            csBridgePort = ports[0];\n            window.CSJavascriptBridge._sendTemp();\n        }\n    }, false);\n    window." + str + " = {\n        _tempMessages: [],\n        _sendTemp: function() {\n            if (window.CSJavascriptBridge._tempMessages.length > 0) {\n                for (var message of window.CSJavascriptBridge._tempMessages) {\n                    csBridgePort.postMessage(message);\n                }\n                window.CSJavascriptBridge._tempMessages = [];\n            }\n        },\n        _csCall: function(methodName, methodArgs) {\n            var args = new Array();\n            for (var i = 0; i < methodArgs.length; i++) {\n                args.push(methodArgs[i].toString());\n            }\n            var data = { method: methodName, len: args.length, args: args };\n            var json = JSON.stringify(data);\n            if (csBridgePort) {\n                window.CSJavascriptBridge._sendTemp();\n                csBridgePort.postMessage(json);\n            } else {\n                window.CSJavascriptBridge._tempMessages.push(json);\n            }\n        }\n    };\n"));
    }

    /* access modifiers changed from: private */
    public static final void e(WebView webView, H h10, String str, String str2) {
        C17542s.j(webView, "$webView");
        C17542s.j(h10, "$jsInterface");
        C17542s.j(str, "$jsInterfaceName");
        if (TextUtils.isEmpty(str2) || str2.equals("undefined") || str2.equals("null")) {
            C8415b bVar = f54071a;
            bVar.g().j("Injecting Javascript bridge");
            bVar.j(webView, h10, str);
            return;
        }
        f54071a.g().j("Javascript bridge already injected");
    }

    private final void f(String str, JSONArray jSONArray, H h10) {
        Method[] methods = h10.getClass().getMethods();
        C17542s.i(methods, "jsInterface.javaClass.methods");
        for (Method method : methods) {
            if (method.getName().equals(str)) {
                int length = jSONArray.length();
                Object[] objArr = new Object[length];
                for (int i10 = 0; i10 < length; i10++) {
                    objArr[i10] = jSONArray.get(i10);
                }
                method.setAccessible(true);
                method.invoke(h10, Arrays.copyOf(objArr, length));
                return;
            }
        }
    }

    private final c g() {
        return (c) f54072b.getValue();
    }

    /* access modifiers changed from: private */
    public final void h(WebMessage webMessage, H h10) {
        String data = webMessage.getData();
        if (!TextUtils.isEmpty(data)) {
            try {
                JSONObject jSONObject = new JSONObject(data);
                String string = jSONObject.getString("method");
                JSONArray jSONArray = jSONObject.getJSONArray("args");
                C17542s.i(string, "methodName");
                C17542s.i(jSONArray, "jsonArgs");
                f(string, jSONArray, h10);
            } catch (JSONException e10) {
                g().h(e10.getMessage());
            }
        }
    }

    @SuppressLint({"WebViewApiAvailability"})
    private final void i(WebView webView, H h10) {
        WebMessagePort[] createWebMessageChannel = webView.createWebMessageChannel();
        C17542s.i(createWebMessageChannel, "webView.createWebMessageChannel()");
        WebMessagePort webMessagePort = createWebMessageChannel[0];
        WebMessagePort webMessagePort2 = createWebMessageChannel[1];
        webMessagePort.setWebMessageCallback(new C0858b(h10));
        webView.postWebMessage(new WebMessage("cs:bridge:initialize", new WebMessagePort[]{webMessagePort2}), Uri.EMPTY);
    }

    private final void j(WebView webView, H h10, String str) {
        webView.loadUrl("javascript: " + k(h10, str));
        i(webView, h10);
    }

    private final String k(H h10, String str) {
        StringBuilder sb2;
        Object invoke;
        StringBuilder sb3 = new StringBuilder();
        c(sb3, str);
        Method[] methods = h10.getClass().getMethods();
        C17542s.i(methods, "jsInterface.javaClass.methods");
        for (Method method : methods) {
            if (method.isAnnotationPresent(JavascriptInterface.class)) {
                String name = method.getName();
                Object obj = null;
                if (C17542s.e(name, "getVersion")) {
                    obj = method.invoke(h10, (Object[]) null);
                } else if (C17542s.e(name, "getAssetTransformerMode") && (invoke = method.invoke(h10, (Object[]) null)) != null) {
                    obj = invoke.toString();
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("window." + str);
                sb4.append(".");
                sb4.append(method.getName());
                sb4.append(" = function() { this._csCall('");
                sb4.append(method.getName());
                sb4.append("', arguments);");
                if (obj != null) {
                    if (obj instanceof Number) {
                        sb2 = new StringBuilder(" return ");
                        sb2.append(obj);
                        sb2.append(';');
                    } else {
                        sb2 = new StringBuilder(" return '");
                        sb2.append(obj);
                        sb2.append("';");
                    }
                    sb4.append(sb2.toString());
                }
                sb4.append(" };");
                sb3.append(sb4);
            }
        }
        sb3.append("console.log('CSLIB JS Bridge Injected', JSON.stringify(window." + str + "));");
        String sb5 = sb3.toString();
        C17542s.i(sb5, "jsBuilder.toString()");
        return sb5;
    }

    public final void d(WebView webView, H h10, String str) {
        C17542s.j(webView, "webView");
        C17542s.j(h10, "jsInterface");
        C17542s.j(str, "jsInterfaceName");
        webView.evaluateJavascript("window." + str, new C8414a(webView, h10, str));
    }
}
