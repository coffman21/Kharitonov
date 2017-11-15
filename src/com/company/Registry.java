package com.company;

import java.util.Date;

/**
 * @page АРМ приема и выдачи документов
 * @file Registry.java
 * @brief Седьмой вариант третьей лабораторной работы по ТРПО.
 *
 * Данный класс содержит реализацию работы АРМ приема и выдачи документов.
 * @author Goi
 * @date 16.10.2017
 * @version 1.0
 * @par Использует классы из пакета com.company:
 *  @ref Passport
 * @par Использует зависимости: java.utils.Date
 */
public class Registry {
    /** @brief Персональные данные о гражданине
     */
    private Passport passport;
    /** @brief Файл, содержащий заявление гражданина
     */
    private Object request;
    /** @brief Дата окончания работы над паспортом
     */
    private Date doneDate;
    /** @brief Номер телефона гражданина
     */
    private String phone;
    /** @brief Состояние получения паспорта
     */
    private boolean isReceived;

    /** @brief Конструктор
     *
     * @param r Файл, содержащий заявление гражданина
     * @param p Состояние готовности нового удостоверения личности
     * @param d Файл, содержащий заявление гражданина
     */
    Registry(Object r, Passport p, Date d) {
        this.request = r;
        this.passport = p;
        this.doneDate = d;
    }

    /** @brief Геттер
     *
     * Возвращает дату окончания работы над паспортом
     * @return doneDate
     */
    Date getDoneDate() {
        return doneDate;
    }

    /** @brief Геттер
     *
     * Возвращает персональные данные о гражданине
     * @return passport
     */
    Passport getPassport() {
        return passport;
    }

    /** @brief Геттер
     *
     * Возвращает файл с заявлением гражданина
     * @return request
     */

    Object getRequest() {
        return request;
    }

    /** @brief Метод
     *
     * Оповещает внутренний отдел о необходимости создания нового документа
     * @param passport Персональные данные гражданина
     * @param request Заявление гражданина
     */
    void makeInternalNotification(Passport passport, Object request) {}

    /** @brief Метод
     *
     * Оповещает гражданина о готовности его паспорта
     * @param phone Номер телефона гражданина
     */
    void makeClientNotification(String phone) {}
}
