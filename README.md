# Объектно-ориентированное программирование

## [Занятие 1](https://github.com/dtnfktu/OOP/tree/main/lesson01)
**Задание.**
*Создать новый продукт на основе Product, сделать ему хотя одно свойства (например, шоколад и каллории) и включить в список продуктов в вендинг машину. Переопределить toString, для вывода нового поля.*  
**Решение**  
Модули [***Product.java***](https://github.com/dtnfktu/OOP/blob/main/lesson01/Product.java) и [***VendingMachine.java***](https://github.com/dtnfktu/OOP/blob/main/lesson01/VendingMachine.java) взяты с практического занятия, оставлены без изменений. На основе класса Product создан класс [***Chocolate***](https://github.com/dtnfktu/OOP/blob/main/lesson01/Chocolate.java) (Шоколад), в свойства добавлены калории (Double calories) и цвет (String color). Переопределён метод toString() - к унаследованным параметрам от продукта добавлены новые параметры, шоколадные.  
На основе класса Chocolat создан класс [***ChocolatePaste***](https://github.com/dtnfktu/OOP/blob/main/lesson01/ChocolatePaste.java) (Шоколадная паста), в свойства добавлен вес нетто. Переопределен метод toString().  
## [Занятие 2](https://github.com/dtnfktu/OOP/tree/main/lesson02)
**Задание.** *Создать интерфейс, скорость плавания. Добавить новое животное, способное плавать. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре*  
**Решение**  
Созданы два класса: класс [***Fish***](https://github.com/dtnfktu/OOP/blob/main/lesson02/Fish.java) (Рыба) и класс [***Turtle***](https://github.com/dtnfktu/OOP/blob/main/lesson02/Turtle.java) (Черепаха). Оба класса используют интерфейс [***SwimAble***](https://github.com/dtnfktu/OOP/blob/main/lesson02/SwimAble.java) (плавающие). У плавающих добавлен атрибут - ***velocity***(скорость плавания).