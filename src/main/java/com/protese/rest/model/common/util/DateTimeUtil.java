package com.protese.rest.model.common.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class DateTimeUtil {
        private static final String TIME_ZONE = "America/Fortaleza";

        public final static String DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

        public final static String DATE_TIME_FORMAT_NORMAL = "dd-MM-yyyy";

        private static final SimpleDateFormat formatDate = new SimpleDateFormat(DATE_TIME_FORMAT);

        private static final TimeZone timeZoneUTC = TimeZone.getTimeZone("UTC");

        private static final TimeZone timeZonePerfil = TimeZone.getTimeZone(TIME_ZONE);

        public static Calendar dateUTC() {
            return Calendar.getInstance(timeZoneUTC);
        }

        public static Calendar dateUTC(Calendar date) {
            date.setTimeZone(timeZoneUTC);
            return date;
        }

        public static String formatDate(Calendar date) {
            formatDate.setTimeZone(timeZonePerfil);
            return (date.get(Calendar.YEAR) != 1899) ? formatDate.format(date.getTime()) : "";
        }

        private static Calendar novaData(Calendar date) {
            TimeZone timeZoneGMTZERO = TimeZone.getTimeZone("GMT");
            timeZoneGMTZERO.setDefault(TimeZone.getTimeZone("GMT"));
            date.setTimeZone(timeZoneGMTZERO);
            return date;
        }
}
