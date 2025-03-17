package tg;

import Zj.b;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u000eR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001e\u0010\r\u001a\u0004\u0018\u00010\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Ltg/d;", "", "", "getFakeFoodMobile", "()Z", "setFakeFoodMobile", "(Z)V", "fakeFoodMobile", "", "getFakeMobileUrl", "()Ljava/lang/String;", "setFakeMobileUrl", "(Ljava/lang/String;)V", "fakeMobileUrl", "a", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface d {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Ltg/d$a;", "LZj/b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "FAKE_FAMILY_REWARDS_REPOSITORY", "FAKE_FOOD_MOBILE", "FAKE_FOOD_MOBILE_URL", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a implements b {
        FAKE_FAMILY_REWARDS_REPOSITORY("fake_family_rewards_repository"),
        FAKE_FOOD_MOBILE("fake_food_mobile"),
        FAKE_FOOD_MOBILE_URL("fake_food_mobile_url");
        
        private final String key;

        static {
            a[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private a(String str) {
            this.key = str;
        }

        public String getKey() {
            return this.key;
        }
    }

    boolean getFakeFoodMobile();

    String getFakeMobileUrl();
}
