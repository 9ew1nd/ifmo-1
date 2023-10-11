package Utils;

import java.util.Scanner;

public class Utils {
    /** Проверяет, является ли число целым
     * @param str
     * @return bool
     */
    public static Boolean isInt(String str){
        try{
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    /** Проверяет, является ли число целым и лонгом
     * @param str
     * @return bool
     */
    public static Boolean isLong(String str){
        try{
            Long.parseLong(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    /** Проверяет, является ли число вещественным
     * @param str
     * @return bool
     */
    public static Boolean isFloat(String str){
        try{
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    /** Проверяет, является ли число вещественным
     * @param str
     * @return bool
     */
    public static Boolean isDouble(String str){
        try{
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
    /**
     * Конвертирует String в long
     * @param number String
     * @return Long
     */
    public static Long longConverter(Integer number){
        Long converted = null;
        try {
            converted = Long.valueOf(number);
        } catch (NumberFormatException e) {
            System.err.println("При загрузке данных произошла ошибка. Ошибка типов данных.");
        }
        return converted;
    }
    /**
     * Конвертирует String в Float
     * @param number String
     * @return Float
     */
    public static Float floatConverter(String number){
        float converted = 0;
        try {
            converted = Float.valueOf(number);
        }catch (NumberFormatException e){
            System.err.println("При загрузке данных произошла ошибка. Проверьте формат формат ввода, вы должы ввести число c плавающей точкой.");
        }
        return converted;
    }
    /**
     * Конвертирует String в Integer
     * @param number String
     * @return Integer
     */
    public static Integer integerConverter(String number){
        Integer converted=null;
        try {
            converted = Integer.valueOf(number);
        }catch (NumberFormatException e){
            System.err.println("При загрузке данных произошла ошибка. Проверьте формат формат ввода, вы должы ввести целое число.");
        }
        return converted;
    }
    /**
     * Конвертирует String в Double
     * @param number String
     * @return Double
     */
    public static Double doubleConverter(String number){
        Double converted=null;
        try {
            converted = Double.valueOf(number);
        } catch (NumberFormatException e) {
            System.err.println("При загрузке данных произошла ошибка. Проверьте формат формат ввода, вы должы ввести число с плавающей точкой.");
        }
        return converted;
    }
}