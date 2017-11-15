package com.company;

import java.util.ArrayList;

/**
 * @page АРМ руководства
 * @file Guidance.java
 * @brief Седьмой вариант третьей лабораторной работы по ТРПО.
 *
 * Данный класс содержит реализацию работы АРМ руководства
 * (просмотр статистики, поиск документов и заявок)
 * @author Dementov
 * @date 17.10.2017
 * @version 1.0
 * @par Использует классы из пакета com.company:
 *  @ref Passport
 *  @ref Registry
 *  @ref Maker
 * @par Использует зависимости: java.util.ArrayList
 */
public class Guidance {
    /**@brief Статистика по отделам
     */
    private static ArrayList statistic;
    /**@brief Поисковый запрос
     */
    private String searchQuery;
    /**@brief Результат поиска
     */
    private String searchResult;

    /**
     * @brief Конструктор
     *
     * Создает объект, реализующий АРМ руководства.
     * @param params Параметры для создания статистики
     */
    Guidance(ArrayList[] params) {}

    /**@brief Метод
     *
     * Создает статистику при помощи обращения в другие отделы АИС
     */
    public static void getStatistic() {}

    /**@brief Метод
     *
     * Ищет необходимые данные о гражданине
     * @param statistic Статистика работы отделов
     * @param searchQuery Поисковый запрос
     * @return Документы о гражданине
     */
    public Object searchDoc(ArrayList statistic, String searchQuery) {
        return new Object();
    }
    /**@brief Метод
     *
     * Ищет заявки в других отделах АИС
     * @param statistic Статистика работы отделов
     * @param searchQuery Поисковый запрос
     * @return Результат поискового запроса о заявках
     */
    public String getRequests(ArrayList statistic, String searchQuery) {
        return searchResult;
    }

}
