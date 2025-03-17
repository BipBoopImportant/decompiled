package com.noveogroup.android.log;

import com.noveogroup.android.log.Logger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;

public abstract class Pattern {
    private final int count;
    private final int length;

    public static class CallerPattern extends Pattern {
        private int callerCount;
        private int callerLength;

        public CallerPattern(int i10, int i11, int i12, int i13) {
            super(i10, i11);
            this.callerCount = i12;
            this.callerLength = i13;
        }

        /* access modifiers changed from: protected */
        public String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
            if (stackTraceElement != null) {
                return Utils.shortenClassName(stackTraceElement.getLineNumber() < 0 ? String.format("%s#%s", new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName()}) : String.format("%s#%s:%d", new Object[]{stackTraceElement.getClassName(), stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())}), this.callerCount, this.callerLength);
            }
            throw new IllegalArgumentException("Caller not found");
        }

        /* access modifiers changed from: protected */
        public boolean isCallerNeeded() {
            return true;
        }
    }

    public static class Compiler {
        private final java.util.regex.Pattern CALLER_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?caller(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        private final java.util.regex.Pattern CALLER_PATTERN_SHORT = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?C(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        private final java.util.regex.Pattern CONCATENATE_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?\\(");
        private final java.util.regex.Pattern DATE_PATTERN = java.util.regex.Pattern.compile("%date(\\{(.*?)\\})?");
        private final java.util.regex.Pattern DATE_PATTERN_SHORT = java.util.regex.Pattern.compile("%d(\\{(.*?)\\})?");
        private final java.util.regex.Pattern LEVEL_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?level");
        private final java.util.regex.Pattern LEVEL_PATTERN_SHORT = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?p");
        private final java.util.regex.Pattern LOGGER_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?logger(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        private final java.util.regex.Pattern LOGGER_PATTERN_SHORT = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?c(\\{([+-]?\\d+)?(\\.([+-]?\\d+))?\\})?");
        private final java.util.regex.Pattern NEWLINE_PATTERN = java.util.regex.Pattern.compile("%n");
        private final java.util.regex.Pattern PERCENT_PATTERN = java.util.regex.Pattern.compile("%%");
        private final java.util.regex.Pattern SOURCE_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?source");
        private final java.util.regex.Pattern SOURCE_PATTERN_SHORT = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?s");
        private final java.util.regex.Pattern THREAD_NAME_PATTERN = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?thread");
        private final java.util.regex.Pattern THREAD_NAME_PATTERN_SHORT = java.util.regex.Pattern.compile("%([+-]?\\d+)?(\\.([+-]?\\d+))?t");
        private String patternString;
        private int position;
        private List<ConcatenatePattern> queue;

        private Matcher findPattern(java.util.regex.Pattern pattern) {
            Matcher matcher = pattern.matcher(this.patternString);
            if (!matcher.find(this.position) || matcher.start() != this.position) {
                return null;
            }
            return matcher;
        }

        private void parse() {
            Matcher findPattern = findPattern(this.PERCENT_PATTERN);
            if (findPattern != null) {
                List<ConcatenatePattern> list = this.queue;
                list.get(list.size() - 1).addPattern(new PlainPattern(0, 0, "%"));
                this.position = findPattern.end();
                return;
            }
            Matcher findPattern2 = findPattern(this.NEWLINE_PATTERN);
            if (findPattern2 != null) {
                List<ConcatenatePattern> list2 = this.queue;
                list2.get(list2.size() - 1).addPattern(new PlainPattern(0, 0, "\n"));
                this.position = findPattern2.end();
                return;
            }
            Matcher findPattern3 = findPattern(this.LEVEL_PATTERN);
            String str = "0";
            if (findPattern3 == null && (findPattern3 = findPattern(this.LEVEL_PATTERN_SHORT)) == null) {
                Matcher findPattern4 = findPattern(this.CALLER_PATTERN);
                if (findPattern4 == null && (findPattern4 = findPattern(this.CALLER_PATTERN_SHORT)) == null) {
                    Matcher findPattern5 = findPattern(this.SOURCE_PATTERN);
                    if (findPattern5 == null && (findPattern5 = findPattern(this.SOURCE_PATTERN_SHORT)) == null) {
                        Matcher findPattern6 = findPattern(this.LOGGER_PATTERN);
                        if (findPattern6 == null && (findPattern6 = findPattern(this.LOGGER_PATTERN_SHORT)) == null) {
                            Matcher findPattern7 = findPattern(this.DATE_PATTERN);
                            if (findPattern7 == null && (findPattern7 = findPattern(this.DATE_PATTERN_SHORT)) == null) {
                                Matcher findPattern8 = findPattern(this.THREAD_NAME_PATTERN);
                                if (findPattern8 == null && (findPattern8 = findPattern(this.THREAD_NAME_PATTERN_SHORT)) == null) {
                                    Matcher findPattern9 = findPattern(this.CONCATENATE_PATTERN);
                                    if (findPattern9 != null) {
                                        int parseInt = Integer.parseInt(findPattern9.group(1) == null ? str : findPattern9.group(1));
                                        if (findPattern9.group(3) != null) {
                                            str = findPattern9.group(3);
                                        }
                                        this.queue.add(new ConcatenatePattern(parseInt, Integer.parseInt(str), new ArrayList()));
                                        this.position = findPattern9.end();
                                        return;
                                    }
                                    throw new IllegalArgumentException();
                                }
                                int parseInt2 = Integer.parseInt(findPattern8.group(1) == null ? str : findPattern8.group(1));
                                if (findPattern8.group(3) != null) {
                                    str = findPattern8.group(3);
                                }
                                int parseInt3 = Integer.parseInt(str);
                                List<ConcatenatePattern> list3 = this.queue;
                                list3.get(list3.size() - 1).addPattern(new ThreadNamePattern(parseInt2, parseInt3));
                                this.position = findPattern8.end();
                                return;
                            }
                            String group = findPattern7.group(2);
                            List<ConcatenatePattern> list4 = this.queue;
                            list4.get(list4.size() - 1).addPattern(new DatePattern(0, 0, group));
                            this.position = findPattern7.end();
                            return;
                        }
                        int parseInt4 = Integer.parseInt(findPattern6.group(1) == null ? str : findPattern6.group(1));
                        int parseInt5 = Integer.parseInt(findPattern6.group(3) == null ? str : findPattern6.group(3));
                        int parseInt6 = Integer.parseInt(findPattern6.group(5) == null ? str : findPattern6.group(5));
                        if (findPattern6.group(7) != null) {
                            str = findPattern6.group(7);
                        }
                        int parseInt7 = Integer.parseInt(str);
                        List<ConcatenatePattern> list5 = this.queue;
                        list5.get(list5.size() - 1).addPattern(new LoggerPattern(parseInt4, parseInt5, parseInt6, parseInt7));
                        this.position = findPattern6.end();
                        return;
                    }
                    int parseInt8 = Integer.parseInt(findPattern5.group(1) == null ? str : findPattern5.group(1));
                    if (findPattern5.group(3) != null) {
                        str = findPattern5.group(3);
                    }
                    int parseInt9 = Integer.parseInt(str);
                    List<ConcatenatePattern> list6 = this.queue;
                    list6.get(list6.size() - 1).addPattern(new SourcePattern(parseInt8, parseInt9));
                    this.position = findPattern5.end();
                    return;
                }
                int parseInt10 = Integer.parseInt(findPattern4.group(1) == null ? str : findPattern4.group(1));
                int parseInt11 = Integer.parseInt(findPattern4.group(3) == null ? str : findPattern4.group(3));
                int parseInt12 = Integer.parseInt(findPattern4.group(5) == null ? str : findPattern4.group(5));
                if (findPattern4.group(7) != null) {
                    str = findPattern4.group(7);
                }
                int parseInt13 = Integer.parseInt(str);
                List<ConcatenatePattern> list7 = this.queue;
                list7.get(list7.size() - 1).addPattern(new CallerPattern(parseInt10, parseInt11, parseInt12, parseInt13));
                this.position = findPattern4.end();
                return;
            }
            int parseInt14 = Integer.parseInt(findPattern3.group(1) == null ? str : findPattern3.group(1));
            if (findPattern3.group(3) != null) {
                str = findPattern3.group(3);
            }
            int parseInt15 = Integer.parseInt(str);
            List<ConcatenatePattern> list8 = this.queue;
            list8.get(list8.size() - 1).addPattern(new LevelPattern(parseInt14, parseInt15));
            this.position = findPattern3.end();
        }

        public Pattern compile(String str) {
            if (str == null) {
                return null;
            }
            this.position = 0;
            this.patternString = str;
            ArrayList arrayList = new ArrayList();
            this.queue = arrayList;
            arrayList.add(new ConcatenatePattern(0, 0, new ArrayList()));
            while (true) {
                int length = str.length();
                int i10 = this.position;
                if (length <= i10) {
                    break;
                }
                int indexOf = str.indexOf("%", i10);
                int indexOf2 = str.indexOf(")", this.position);
                if (this.queue.size() > 1 && indexOf2 < indexOf) {
                    List<ConcatenatePattern> list = this.queue;
                    list.get(list.size() - 1).addPattern(new PlainPattern(0, 0, str.substring(this.position, indexOf2)));
                    List<ConcatenatePattern> list2 = this.queue;
                    List<ConcatenatePattern> list3 = this.queue;
                    list2.get(list2.size() - 2).addPattern(list3.remove(list3.size() - 1));
                    this.position = indexOf2 + 1;
                }
                if (indexOf == -1) {
                    List<ConcatenatePattern> list4 = this.queue;
                    list4.get(list4.size() - 1).addPattern(new PlainPattern(0, 0, str.substring(this.position)));
                    break;
                }
                List<ConcatenatePattern> list5 = this.queue;
                list5.get(list5.size() - 1).addPattern(new PlainPattern(0, 0, str.substring(this.position, indexOf)));
                this.position = indexOf;
                parse();
            }
            return this.queue.get(0);
        }
    }

    public static class ConcatenatePattern extends Pattern {
        private final List<Pattern> patternList;

        public ConcatenatePattern(int i10, int i11, List<Pattern> list) {
            super(i10, i11);
            this.patternList = new ArrayList(list);
        }

        public void addPattern(Pattern pattern) {
            this.patternList.add(pattern);
        }

        /* access modifiers changed from: protected */
        public String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
            StringBuilder sb2 = new StringBuilder();
            for (Pattern apply : this.patternList) {
                sb2.append(apply.apply(stackTraceElement, str, level));
            }
            return sb2.toString();
        }

        /* access modifiers changed from: protected */
        public boolean isCallerNeeded() {
            for (Pattern isCallerNeeded : this.patternList) {
                if (isCallerNeeded.isCallerNeeded()) {
                    return true;
                }
            }
            return false;
        }
    }

    public static class DatePattern extends Pattern {
        private final SimpleDateFormat dateFormat;

        public DatePattern(int i10, int i11, String str) {
            super(i10, i11);
            if (str != null) {
                this.dateFormat = new SimpleDateFormat(str);
            } else {
                this.dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            }
        }

        /* access modifiers changed from: protected */
        public String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
            return this.dateFormat.format(new Date());
        }
    }

    public static class LevelPattern extends Pattern {
        public LevelPattern(int i10, int i11) {
            super(i10, i11);
        }

        /* access modifiers changed from: protected */
        public String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
            return level.toString();
        }
    }

    public static class LoggerPattern extends Pattern {
        private int loggerCount;
        private int loggerLength;

        public LoggerPattern(int i10, int i11, int i12, int i13) {
            super(i10, i11);
            this.loggerCount = i12;
            this.loggerLength = i13;
        }

        /* access modifiers changed from: protected */
        public String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
            return Utils.shortenClassName(str, this.loggerCount, this.loggerLength);
        }
    }

    public static class PlainPattern extends Pattern {
        private final String string;

        public PlainPattern(int i10, int i11, String str) {
            super(i10, i11);
            this.string = str;
        }

        /* access modifiers changed from: protected */
        public String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
            return this.string;
        }
    }

    public static class SourcePattern extends Pattern {
        public SourcePattern(int i10, int i11) {
            super(i10, i11);
        }

        /* access modifiers changed from: protected */
        public String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
            if (stackTraceElement != null) {
                StringBuilder sb2 = new StringBuilder();
                if (stackTraceElement.isNativeMethod()) {
                    sb2.append("(native)");
                } else if (stackTraceElement.getFileName() == null) {
                    sb2.append("(unknown)");
                } else if (stackTraceElement.getLineNumber() >= 0) {
                    sb2.append(String.format("(%s:%d)", new Object[]{stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber())}));
                } else {
                    sb2.append(String.format("(%s)", new Object[]{stackTraceElement.getFileName()}));
                }
                return sb2.toString();
            }
            throw new IllegalArgumentException("Caller not found");
        }

        /* access modifiers changed from: protected */
        public boolean isCallerNeeded() {
            return true;
        }
    }

    public static class ThreadNamePattern extends Pattern {
        public ThreadNamePattern(int i10, int i11) {
            super(i10, i11);
        }

        /* access modifiers changed from: protected */
        public String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
            return Thread.currentThread().getName();
        }
    }

    public static Pattern compile(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new Compiler().compile(str);
        } catch (Exception e10) {
            LoggerManager.getLogger("ROOT").e(e10, "cannot parse pattern: '%s'", str);
            return new PlainPattern(0, 0, str);
        }
    }

    public final String apply(StackTraceElement stackTraceElement, String str, Logger.Level level) {
        return Utils.shorten(doApply(stackTraceElement, str, level), this.count, this.length);
    }

    /* access modifiers changed from: protected */
    public abstract String doApply(StackTraceElement stackTraceElement, String str, Logger.Level level);

    /* access modifiers changed from: protected */
    public boolean isCallerNeeded() {
        return false;
    }

    private Pattern(int i10, int i11) {
        this.count = i10;
        this.length = i11;
    }
}
