package com.company;

/** @page Passports
 * @file Passport.java
 * @brief Класс для хранения персональных данных гражданина
 *
 *  Содержит данные паспорта и осуществляет доступ к ним.
 * @author Goi
 * @author Dementov
 * @author Kharitonov
 * @date 15.10.2017
 * @version init
 */
public class Passport {
    /** @brief Поле с серией и номером паспорта.
     */
    private String id;
    /** @brief Поле с именем гражданина.
     */
    private String name;
    /** @brief Поле с фамилией гражданина.
     */
    private String address;
    /** @brief Поле с данными о регистрации гражданина.
     */
    private String registry;
    /** @brief Поле с остальными сведениями о гражданине.
     */
    private String theRest;

    /** @brief Конструктор
     *
     */
    public Passport() {
        // some actions
    }

    /** @brief Метод, возвращающий форматированные данные о гражданине.
     *
     * Данная функция делает выборку из базы данных по имени пользователя
     * и возвращает структуру с информацией о нем.
     * @param id Серия и номер паспорта
     * @return Массив данных
     * @throw NotFoundException Бросается, если пользователь не найден
     */
    public String[] getInfo(String id) {
        // some actions
        return new String[] {};
    }
}
