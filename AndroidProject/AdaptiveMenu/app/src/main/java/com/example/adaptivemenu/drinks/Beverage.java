package com.example.adaptivemenu.drinks;

public interface Beverage {

    String getDescription();

    double cost();
}

/*
інтерфейс напою
для створення напою потрібно об'явити змінну типу Beverage
і в цю змінну записати об'єкт певного напою
наприклад Espresso:

 - Beverage espresso = new Espresso;

якщо до напою потрібно додати приправи
наприклад молоко тоді беремо вже створений напій
і записуємо в його змінну новий об'єкт приправи передавши в її параметри
існуючий об'єкт напою

 - espresso = new Milk(espresso);

якщо потрібна більша кількість приправ просто продовжуємо
обновлювати об'єкт напою наприклад

 - Beverage espresso = new Espresso;
 - espresso = new Milk(espresso);
 - espresso = new Chocolate(espresso);
 - espresso = new Chocolate(espresso);
 - espresso = new Whip(espresso);

після виконання даного коду в змінній espresso
буде знаходитись еспрессо з молоком, двійним шоколадом та кремом
*/
