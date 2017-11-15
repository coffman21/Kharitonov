package com.company;

import java.awt.*;
import java.util.Date;

/**
 * @page АРМ изготовления паспортов
 * @file Maker.java
 * @brief Седьмой вариант третьей лабораторной работы по ТРПО.
 *
 * Данный класс содержит реализацию работы АРМ изготовления паспортов
 * (заказы, состояния, мастер печати)

 * @author Kharitonov
 * @date 19.10.2017
 * @version init
 * @par Использует классы из пакета com.company:
 *  @ref Passport
 * @par Использует зависимости: java.utils.Date, java.awt
 */
public class Maker {
    /** @brief Персональные данные о гражданине
     */
    private Passport passport;
    /** @brief Состояние готовности нового удостоверения личности
     */
    private boolean isDone;
    /** @brief Файл, содержащий данные для печати документа
     */
    private Object document;
    /** @brief Файл, содержащий заявление гражданина
     */
    private Object request;
    /** @brief Дата начала работы над паспортом
     */
    private Date dateRequested;
    /** @brief Файл с фотографией
     */
    private Image photo;
    /**
     * @brief Конструктор
     * @param params Данные для обработки
     */
    Maker(Object[] params) {
        // some actions
    }

    /** @brief Метод, производит обработку персональных данных гражданина
     * @param isDone Состояние готовности паспорта
     * @param document Файл для печати паспорта
     * @param p Паспортные данные
     * @param dateRequested Дата начала работы
     */
    public void makePassport(boolean isDone, Object document, Passport p, Date dateRequested) {
        // some actions
    }

    /**
     * @brief Метод, возвращает состояние готовности паспорта
     * @return Boolean состояние готовности
     */
    public boolean getState() {
        return this.isDone;
    }

    /** @brief Метод, передает информацию для печати на принтер
     * @param document Файл для печати паспорта
     * @param photo Файл с фотографией
     */
    public void print(Object document, Image photo) {
        // some actions
    }
}
