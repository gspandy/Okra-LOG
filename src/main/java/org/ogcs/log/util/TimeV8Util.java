/*
 *     Copyright 2016-2026 TinyZ
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.ogcs.log.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author TinyZ
 * @since 1.0
 */
public class TimeV8Util {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private TimeV8Util() {
        //  no-op
    }

    public static String date() {
        return date(LocalDate.now());
    }

    public static String date(LocalDate date) {
        return date.format(DATE_FORMATTER);
    }

    public static String date(LocalDate date, String pattern) {
        return date.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static String dateTime() {
        return dateTime(LocalDateTime.now());
    }

    public static String dateTime(LocalDateTime dateTime) {
        return dateTime.format(DATE_TIME_FORMATTER);
    }

    public static String dateTime(LocalDateTime dateTime, String pattern) {
        return dateTime.format(DateTimeFormatter.ofPattern(pattern));
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        String s1 = dateTime(now);

//        now.with(TemporalAdjusters.firstInMonth(DayOfWeek.of()))

        LocalDateTime localDateTime = now.plusDays(1);
        String s2 = dateTime(localDateTime);
        System.out.println();
    }
}
