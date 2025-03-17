package FE;

/* renamed from: FE.c  reason: case insensitive filesystem */
public enum C12871c {
    BOT_FILTERING_ATTRIBUTE("$opt_bot_filtering"),
    USER_AGENT_ATTRIBUTE("$opt_user_agent"),
    BUCKETING_ATTRIBUTE("$opt_bucketing_id");
    
    private final String key;

    private C12871c(String str) {
        this.key = str;
    }

    public String toString() {
        return this.key;
    }
}
