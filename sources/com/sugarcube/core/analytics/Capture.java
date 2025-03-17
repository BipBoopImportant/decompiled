package com.sugarcube.core.analytics;

import com.sugarcube.core.analytics.Event;
import fI.C17220a;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u001b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0015\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/core/analytics/Capture;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Result", "Open", "Start", "Warning", "ExitPrompt", "CameraPermissions", "SelectRoom", "ScanningTips", "SelectScanType", "LearnMore", "Tutorial", "TutorialVideo", "Pano", "Snap", "Init", "Align", "Step", "PanoPreview", "Scan", "FloorPoint", "End", "Upload", "Feedback", "PrivacyPolicy", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum Capture implements Event {
    Result,
    Open,
    Start;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Align;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Continue", "End", "Exit", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Align implements Event {
        Start,
        Continue,
        End,
        Exit;

        static {
            Align[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Align> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$CameraPermissions;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Allow", "DontAllow", "Denied", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum CameraPermissions implements Event {
        Allow,
        DontAllow,
        Denied;

        static {
            CameraPermissions[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<CameraPermissions> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$End;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Exit", "End", "Login", "Signup", "MaybeLater", "GoToRooms", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum End implements Event {
        Start,
        Exit,
        End,
        Login,
        Signup,
        MaybeLater,
        GoToRooms;

        static {
            End[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<End> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$ExitPrompt;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Exit", "Continue", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ExitPrompt implements Event {
        Exit,
        Continue;

        static {
            ExitPrompt[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<ExitPrompt> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Feedback;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Submit", "Exit", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Feedback implements Event {
        Submit,
        Exit;

        static {
            Feedback[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Feedback> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$FloorPoint;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Exit", "End", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum FloorPoint implements Event {
        Start,
        Exit,
        End;

        static {
            FloorPoint[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<FloorPoint> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Init;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Continue", "End", "Exit", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Init implements Event {
        Start,
        Continue,
        End,
        Exit;

        static {
            Init[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Init> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$LearnMore;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Dismiss", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum LearnMore implements Event {
        Dismiss;

        static {
            LearnMore[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<LearnMore> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Pano;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Continue", "Exit", "Target", "End", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Pano implements Event {
        Start,
        Continue,
        Exit,
        Target,
        End;

        static {
            Pano[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Pano> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$PanoPreview;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End", "Exit", "Continue", "Retry", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum PanoPreview implements Event {
        Start,
        End,
        Exit,
        Continue,
        Retry;

        static {
            PanoPreview[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<PanoPreview> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$PrivacyPolicy;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Agree", "MaybeLater", "Check", "UnCheck", "PrivacyLink", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum PrivacyPolicy implements Event {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Scan;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Exit", "End", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Scan implements Event {
        Start,
        Exit,
        End;

        static {
            Scan[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Scan> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$ScanningTips;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "LearnMore", "KitchenPlanner", "GoBack", "Continue", "Start", "End", "Exit", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum ScanningTips implements Event {
        LearnMore,
        KitchenPlanner,
        GoBack,
        Continue,
        Start,
        End,
        Exit;

        static {
            ScanningTips[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<ScanningTips> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$SelectRoom;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Enter", "Start", "End", "Exit", "Selected", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum SelectRoom implements Event {
        Enter,
        Start,
        End,
        Exit,
        Selected;

        static {
            SelectRoom[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<SelectRoom> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$SelectScanType;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Back", "Select", "Continue", "Exit", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum SelectScanType implements Event {
        Back,
        Select,
        Continue,
        Exit;

        static {
            SelectScanType[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<SelectScanType> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Snap;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Continue", "Exit", "End", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Snap implements Event {
        Start,
        Continue,
        Exit,
        End;

        static {
            Snap[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Snap> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Step;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Continue", "End", "Exit", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Step implements Event {
        Start,
        Continue,
        End,
        Exit;

        static {
            Step[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Step> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Tutorial;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Exit", "End", "Skip", "Next", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Tutorial implements Event {
        Start,
        Exit,
        End,
        Skip,
        Next;

        static {
            Tutorial[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Tutorial> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$TutorialVideo;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "Exit", "End", "Skip", "Next", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum TutorialVideo implements Event {
        Start,
        Exit,
        End,
        Skip,
        Next;

        static {
            TutorialVideo[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<TutorialVideo> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Upload;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End", "TasksScheduled", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Upload implements Event {
        Start,
        End,
        TasksScheduled;

        static {
            Upload[] $values;
            $ENTRIES = C17221b.a($values);
        }

        public static C17220a<Upload> getEntries() {
            return $ENTRIES;
        }

        public String eventName() {
            return Event.DefaultImpls.eventName(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\b\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/core/analytics/Capture$Warning;", "Lcom/sugarcube/core/analytics/Event;", "", "<init>", "(Ljava/lang/String;I)V", "Lighting", "LightingScan", "LightingForceContinue", "BatteryLevel", "ExcessiveMotion", "ExcessiveMotionDevice", "ForcedInterruption", "LowDiskSpace", "Rotation", "TargetTooFar", "TargetDistanceUnexpected", "NoMovementDetected", "BadFrames", "BadGravity", "CoreMotionError", "NoFloorPlane", "LowMemory", "CompleteWithoutSession", "AVCaptureError", "PrincipalPoint", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum Warning implements Event {
        Lighting,
        LightingScan,
        LightingForceContinue,
        BatteryLevel,
        ExcessiveMotion,
        ExcessiveMotionDevice,
        ForcedInterruption,
        LowDiskSpace,
        Rotation,
        TargetTooFar,
        TargetDistanceUnexpected,
        NoMovementDetected,
        BadFrames,
        BadGravity,
        CoreMotionError,
        NoFloorPlane,
        LowMemory,
        CompleteWithoutSession,
        AVCaptureError,
        PrincipalPoint;

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
        Capture[] $values;
        $ENTRIES = C17221b.a($values);
    }

    public static C17220a<Capture> getEntries() {
        return $ENTRIES;
    }

    public String eventName() {
        return Event.DefaultImpls.eventName(this);
    }
}
