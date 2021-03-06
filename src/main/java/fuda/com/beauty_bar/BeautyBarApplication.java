/*
 * Class name :  BeautyBarApplication
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

package fuda.com.beauty_bar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BeautyBarApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeautyBarApplication.class, args);
    }

}
