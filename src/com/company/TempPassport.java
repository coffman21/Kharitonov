package com.company;


import java.util.Date;

/** @page TempPassports
 * @file TempPassport.java
 * @brief Класс для хранения персональных данных гражданина
 *
 *
 *  Содержит данные паспорта и осуществляет доступ к ним.
 * @author Goi
 * @date 19.10.2017
 * @version 1.1
 */
public class TempPassport extends Passport {
    /** @brief Поле с серией и номером паспорта.
     */
   private Date expiredDate;

    /** @brief Конструктор
     *
     * @param params Массив с персональными данными
     */
    TempPassport(String[] params) {
        super();
        // some actions
    }
    /** @brief Геттер
     *
     * Возвращает дату окончания действия временного паспорта
     * @return expiredDate
     */
    public Date getExpiredDate() {
        return expiredDate;
    }
    /** @brief Сеттер
     *
     * Изменяет дату окончания действия временного паспорта
     * @return request
     */
    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
    /** @brief Получить документ
     *
     * Дает данные о гражданине
     * @param name имя гражданина
     * @return document
     */
    public Object getDocument(String name) {
      return new Object();
    }
}
