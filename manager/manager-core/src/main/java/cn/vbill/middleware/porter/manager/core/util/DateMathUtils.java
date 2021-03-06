/*
 * Copyright ©2018 vbill.cn.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package cn.vbill.middleware.porter.manager.core.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author fuzizheng[fu_zz@suixingpay.com]
 */
public class DateMathUtils {

    /**
     * 获取当前日期
     * @return
     */
    public static Date getDate() {
        return new Date();
    }

    /**
     * 日期运算
     *
     * @param date
     * @param calendarType
     * @param account
     * @return
     */
    public static Date mathDate(Date date, int calendarType, int account) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(calendarType, account);
        return calendar.getTime();
    }

    /**
     * 获取加减年份后的日期 Date
     *
     * @param date
     * @param year
     * @return
     */
    public static Date dateAddYears(Date date, int year) {
        return mathDate(date, Calendar.YEAR, year);
    }

    /**
     * 获取加减月份后的日期 Date
     *
     * @param date
     * @param month
     * @return
     */
    public static Date dateAddMonths(Date date, int month) {
        return mathDate(date, Calendar.MONTH, month);
    }

    /**
     * 获取加减天数后的日期 Date
     *
     * @param date
     * @param day
     * @return
     */
    public static Date dateAddDays(Date date, int day) {
        return mathDate(date, Calendar.DAY_OF_YEAR, day);
    }

    /**
     * 获取加减分钟后的日期 Date
     *
     * @param date
     * @param minute
     * @return
     */
    public static Date dateAddMinutes(Date date, int minute) {
        return mathDate(date, Calendar.MINUTE, minute);
    }

//    public static void main(String[] args) {
//        Date date = DateMathUtils.dateAddDays(new Date(), -30);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//        String newDate = sdf.format(date);
//        System.out.println(newDate);
//    }
}
