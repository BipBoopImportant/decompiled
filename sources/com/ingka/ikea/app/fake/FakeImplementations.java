package com.ingka.ikea.app.fake;

import Zj.b;
import androidx.annotation.Keep;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001:\u0001\u0011R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\fX¦\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/app/fake/FakeImplementations;", "", "useFakeFamilyRewardsRepository", "", "getUseFakeFamilyRewardsRepository", "()Z", "setUseFakeFamilyRewardsRepository", "(Z)V", "fakeFoodMobile", "getFakeFoodMobile", "setFakeFoodMobile", "fakeMobileUrl", "", "getFakeMobileUrl", "()Ljava/lang/String;", "setFakeMobileUrl", "(Ljava/lang/String;)V", "Key", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public interface FakeImplementations {

    @Keep
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/app/fake/FakeImplementations$Key;", "LZj/b;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "FAKE_FAMILY_REWARDS_REPOSITORY", "FAKE_FOOD_MOBILE", "FAKE_FOOD_MOBILE_URL", "FAKE_STORE_MODE_ENABLED", "featureflags_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Key implements b {
        FAKE_FAMILY_REWARDS_REPOSITORY("fake_family_rewards_repository"),
        FAKE_FOOD_MOBILE("fake_food_mobile"),
        FAKE_FOOD_MOBILE_URL("fake_food_mobile_url"),
        FAKE_STORE_MODE_ENABLED("fake_store_mode_enabled");
        
        private final String key;

        static {
            Key[] $values;
            $ENTRIES = C17221b.a($values);
        }

        private Key(String str) {
            this.key = str;
        }

        public static C17220a<Key> getEntries() {
            return $ENTRIES;
        }

        public String getKey() {
            return this.key;
        }
    }

    boolean getFakeFoodMobile();

    String getFakeMobileUrl();

    boolean getUseFakeFamilyRewardsRepository();

    void setFakeFoodMobile(boolean z10);

    void setFakeMobileUrl(String str);

    void setUseFakeFamilyRewardsRepository(boolean z10);
}
