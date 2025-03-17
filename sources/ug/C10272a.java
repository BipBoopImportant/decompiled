package ug;

import Zj.b;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\bf\u0018\u00002\u00020\u0001:\u0001\u0003R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001c\u0010\u0013\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lug/a;", "", "", "a", "()Ljava/lang/String;", "setBackendUrl", "(Ljava/lang/String;)V", "backendUrl", "", "b", "()Z", "setBarcodeRenderingEnabled", "(Z)V", "barcodeRenderingEnabled", "c", "setBlockBarcodeProcessing", "blockBarcodeProcessing", "d", "setBypassAccountHlp", "bypassAccountHlp", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ug.a  reason: case insensitive filesystem */
public interface C10272a {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lug/a$a;", "LZj/b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "BACKEND_PREFERENCE_KEY", "LEAK_CANARY_KEY", "STRICT_MODE", "BARCODE_RENDERING", "BARCODE_BLOCK_PROCESSING", "BYPASS_ACCOUNT_HLP", "TEST_TOOL_HEADER_VALUE", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ug.a$a  reason: collision with other inner class name */
    public enum C1421a implements b {
        BACKEND_PREFERENCE_KEY("backend"),
        LEAK_CANARY_KEY("LeakCanary"),
        STRICT_MODE("Strict_mode"),
        BARCODE_RENDERING("Barcode_Rendering"),
        BARCODE_BLOCK_PROCESSING("Barcode_Block_Processing"),
        BYPASS_ACCOUNT_HLP("bypass_account_hlp"),
        TEST_TOOL_HEADER_VALUE("test_tool_header_value");
        
        private final String key;

        static {
            C1421a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private C1421a(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }
    }

    String a();

    boolean b();

    boolean c();

    boolean d();
}
