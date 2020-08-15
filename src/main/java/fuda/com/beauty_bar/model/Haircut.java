/*
 * Class name :  Haircut
 *
 * @author Dmitriy Futsur
 *
 * @version 1.0.0 15-Aug-2020
 *
 * Copyright (c) Dmitriy Futsur
 *
 * Description:
   28. Перукарня
    Опис предметної області
        Ви працюєте в перукарні, що обслуговує клієнтів відповідно до їх
        побажань і деяких каталогів різних видів стрижки. Так, для кожної
        стрижки визначені назва, приналежність статі (чоловіча, жіноча),
        вартість роботи. Для наведення порядку ви, у міру можливості, створююте
        базу даних клієнтів, запам’ятовуючи їх анкетні дані (прізвище, ім’я,
        по батькові). Починаючи з п’ятої стрижки клієнт переходить у категорію
        постійних і одержує знижку в 3% при кожній наступній стрижці.
        Після того як закінчена чергова робота, документом фіксуються стрижка,
        клієнт і дата провадження робіт.
    Можливий набір сутностей
        Стрижки (Код стрижки, Назва, Стать, Вартість).
        Клієнти (Код клієнта, Прізвище, Ім’я, По батькові, Стать,
                 Ознака постійного клієнта).
        Робота (Код роботи, Код стрижки, Код клієнта, Дата).
    Розширення постановки завдання
        Тепер ситуація змінилася. У перукарні з’явилася філія, і ви хотіли б
        бачити, у тому числі, і роздільну статистику по філіях. Крім того,
        вартість стрижки може мінятися із часом. Потрібно зберігати не тільки
        останню ціну, але й всі дані по зміни ціни стрижки.
        Внести в структуру таблиць зміни, що враховують ці факти,
        і змінити існуючі запити.
        Додати нові запити.
 */

package fuda.com.beauty_bar.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;

@Document
public class Haircut {

    @Id
    private String id;
    private String name;
    private String genderType;
    private double cost;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Haircut() {}

    public Haircut(String id, String name, String genderType, double cost,
                   LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.genderType = genderType;
        this.cost = cost;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Haircut(String name, String genderType, double cost,
                   LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.name = name;
        this.genderType = genderType;
        this.cost = cost;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenderType() {
        return genderType;
    }

    public void setGenderType(String genderType) {
        this.genderType = genderType;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Haircut haircut = (Haircut) o;
        return Objects.equals(getId(), haircut.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
