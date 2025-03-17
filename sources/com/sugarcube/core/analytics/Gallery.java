package com.sugarcube.core.analytics;

import com.sugarcube.core.analytics.Event;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\n\u0006\u0007\b\t\n\u000b\f\r\u000e\u000fB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0010"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Open", "RoomList", "Showrooms", "KreativMarketing", "KreativHome", "DesignList", "DesignFeedback", "Designs", "DesignSheet", "PrivacyPolicy", "Warning", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum Gallery implements Event {
    Open;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$DesignFeedback;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Exit", "Submit", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum DesignFeedback implements Event {
        Exit,
        Submit;

        static {
            DesignFeedback[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<DesignFeedback> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$DesignList;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "ViewDesign", "DesktopLink", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum DesignList implements Event {
        ViewDesign,
        DesktopLink;

        static {
            DesignList[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<DesignList> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$DesignSheet;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "AddToBag", "AddAllToBag", "CopyDesign", "DeleteDesign", "ShareDesign", "ShareDesignResult", "RenameDesign", "DesktopLink", "DesktopLinkResult", "DiscardDesign", "SaveDesign", "Login", "SignUp", "EditDesign", "Favorite", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum DesignSheet implements Event {
        AddToBag,
        AddAllToBag,
        CopyDesign,
        DeleteDesign,
        ShareDesign,
        ShareDesignResult,
        RenameDesign,
        DesktopLink,
        DesktopLinkResult,
        DiscardDesign,
        SaveDesign,
        Login,
        SignUp,
        EditDesign,
        Favorite;

        static {
            DesignSheet[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<DesignSheet> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$Designs;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "AddToBag", "AddAllToBag", "CopyDesign", "DeleteDesign", "ShareDesign", "ShareDesignResult", "RenameDesign", "DesktopLink", "DesktopLinkResult", "DiscardDesign", "SaveDesign", "Login", "SignUp", "EditDesign", "NewDesign", "Options", "Favorite", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Designs implements Event {
        AddToBag,
        AddAllToBag,
        CopyDesign,
        DeleteDesign,
        ShareDesign,
        ShareDesignResult,
        RenameDesign,
        DesktopLink,
        DesktopLinkResult,
        DiscardDesign,
        SaveDesign,
        Login,
        SignUp,
        EditDesign,
        NewDesign,
        Options,
        Favorite;

        static {
            Designs[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Designs> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$KreativHome;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "SelectTab", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum KreativHome implements Event {
        SelectTab;

        static {
            KreativHome[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<KreativHome> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$KreativMarketing;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "NewCapture", "ViewShowrooms", "Help", "Login", "SignUp", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum KreativMarketing implements Event {
        NewCapture,
        ViewShowrooms,
        Help,
        Login,
        SignUp;

        static {
            KreativMarketing[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<KreativMarketing> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$PrivacyPolicy;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Continue", "Agree", "MaybeLater", "Check", "UnCheck", "PrivacyLink", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum PrivacyPolicy implements Event {
        Continue,
        Agree,
        MaybeLater,
        Check,
        UnCheck,
        PrivacyLink;

        static {
            PrivacyPolicy[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<PrivacyPolicy> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$RoomList;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "NewDesign", "ViewDesigns", "NewCapture", "Login", "SignUp", "UploadRetry", "Help", "RoomOptions", "DeleteCapture", "DesktopLink", "DesktopLinkResult", "ViewAll", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum RoomList implements Event {
        NewDesign,
        ViewDesigns,
        NewCapture,
        Login,
        SignUp,
        UploadRetry,
        Help,
        RoomOptions,
        DeleteCapture,
        DesktopLink,
        DesktopLinkResult,
        ViewAll;

        static {
            RoomList[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<RoomList> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$Showrooms;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "NewDesign", "ViewDesigns", "Help", "Login", "SignUp", "NavShortcut", "ViewAll", "RoomFilter", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Showrooms implements Event {
        NewDesign,
        ViewDesigns,
        Help,
        Login,
        SignUp,
        NavShortcut,
        ViewAll,
        RoomFilter;

        static {
            Showrooms[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Showrooms> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/analytics/Gallery$Warning;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "OutageDetected", "Upgrade", "DeviceIncompatible", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Warning implements Event {
        OutageDetected,
        Upgrade,
        DeviceIncompatible;

        static {
            Warning[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Warning> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    static {
        Gallery[] $values;
        $ENTRIES = C17221b.a($values);
    }

    public static C17220a<Gallery> getEntries() {
        return $ENTRIES;
    }

    public String eventName() {
        return Event.DefaultImpls.eventName(this);
    }
}
