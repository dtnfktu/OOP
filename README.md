# Объектно-ориентированное программирование

## Занятие 1
**Задание.**
*Создать новый продукт на основе Product, сделать ему хотя одно свойства (например, шоколад и каллории) и включить в список продуктов в вендинг машину. Переопределить toString, для вывода нового поля.*  
**Решение**  
Модули [***Product.java***](https://github.com/dtnfktu/OOP/blob/main/lesson01/Product.java) и [***VendingMachine.java***](https://github.com/dtnfktu/OOP/blob/main/lesson01/VendingMachine.java) взяты с практического занятия, оставлены без изменений. На основе класса Product создан класс [***Chocolate***](https://github.com/dtnfktu/OOP/blob/main/lesson01/Chocolate.java) (Шоколад), в свойства добавлены калории (Double calories) и цвет (String color). Переопределён метод toString() - к унаследованным параметрам от продукта добавлены новые параметры, шоколадные.  
На основе класса Chocolat создан класс [***ChocolatePaste***](https://github.com/dtnfktu/OOP/blob/main/lesson01/ChocolatePaste.java) (Шоколадная паста), в свойства добавлен вес нетто. Переопределен метод toString().