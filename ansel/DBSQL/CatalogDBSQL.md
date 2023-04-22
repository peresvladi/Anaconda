
-) Какие задачи решает база даных

<details>

<summary></summary>



```javascript

- Хранение данных
- Получение данных
- Обработка


```
</details>

-) Что такое СУБД (DBMS)

<details>

<summary></summary>



```javascript

Система управления базами данных


```
</details>

-) Что такое реляционые базы даных.

<details>

<summary></summary>



```javascript

реляционые базы даных - базы данных, в которых данные распределены по отдельным, но связанным между собой таблицам

```
</details>

-) Что такое Кортеж (Tuple).
<details>

<summary></summary>



```javascript

Кортеж (Tuple) - это множестов пар (имя атрибута, значени - фактически это строка таблицы, где имена атрибутов - это стобцы таблицы)


```
</details>

-) Что такое отношение (relation)

<details>

<summary></summary>



```javascript

Отношение (relation) - это множестов кортежей, соотвествующих одной схеме (На прикладном уровне это соотносится с таблицей)


```
</details>

-) Первичный ключ (Primari key)

<details>

<summary></summary>



```javascript

Поле или набор полей позволяющиее однозначно идентифицирова запись в БД. Если ключ состоит из нескольких полей, он называется составным.



```
</details>

-) Что такое суррогатный ключ

<details>

<summary></summary>



```javascript

автоматически сгенирированное поле, никак не связанное с информационным содержанием записи


```
</details>

-) Что такое естественный ключ..

<details>

<summary></summary>



```javascript

Естественный ключ, это ключ состоящий из информационных полей таблицы


```
</details>

-) Что такое декларативное программирование

<details>

<summary></summary>



```javascript

парадигма программирования, в которой задается спецификация решения задачи, то есть описывается ожидаемый результат, а не способ его получения.


```
</details>

-) Как какому типу относится язык программирования SQL

<details>

<summary></summary>



```javascript

декларативному


```

</details>

-) Диалекты SQL

<details>

<summary></summary>



```javascript

PL/SQL (Procedural Language SQL)
Oracle

Т/SQL (Transact SQL)
MSSQL

PL/pgSQL (Procedural Language PostGres SQL)
Postgresql

Множество других
в каждой СУБД, свой диалект


```

</details>

-) Транзакция

<details>

<summary></summary>



```javascript

это набор команд или инструкций которые выполняются как единый блок


```

</details>



-) Основные операторы SQL

<details>

<summary></summary>

![SQLCommands](SQLCommands)

```javascript





Data Definition Language (DDL) - группа операторов определения данных:
- create (создание новых объектов базы данных - таблиц)
- alter (изменение существующих объектов - заполнение таблиц)
- drop (удаление объектов)

Data Manipulation Language (DML) - группа операторов для манипуляции с данными:

- insert (добавление новых данных)
- update (изменение данных)
- delete (удаление данных)
- select (выборка данных)

Data Control Language (DCL) - группа операторов определения доступа к данным:

- grant (предоставить  права на объект базы)
- revoke (отозвать у пользователя права на объект)
- deny (запрет на объект, имеет более высокий приоритет чем grant)

Transaction Control Language (TCL) - группа операций для управления транзакциями:

- begin transacton (определяем начало транзакции)
- commit transaction (применяет транзакцию, конечная точка)
- rollback transaction (откатывает все изменения транзакции)
- save transaction (устанавливает промежуточную точку сохранения внутри транзакции)


```

</details>


-) Основные компоненты СУБД

<details>

<summary></summary>



```javascript

- Storage tngine (подсистема хранения даных)
- Query parser (парсер и транслятор запросов)
- Query optimizer (оптимизатор запросов)
- Query executor (подисистема выполнения)
- Buffer cache (подсистема кэширования данных )

```

</details>

-) Подключение к СУБД, компоненты доступа

<details>

<summary></summary>



```javascript

ODBC (Open Database Connectivity)
програмный интерфейс (API) доступа к базам данных

JDBC (Java DataBase Connectivity)
программный интерфейс (API) доступа к базам данных в среде Java

Другие провайдеры


```
</details>

-) Клиентские приложения для работы с СУБД



<details>

<summary></summary>



```javascript

- Dbeaver (open-source, поддержка более 20-ти различных СУБД)

- Azure Data Dtudio (Microsoft, поддержка различных СУБД за счет плагинов)

- dbForge (компания Devart, трубуется покупка лицензии)

- DataGrip (компания JetBrain, требуется покупка лицензии)

- MSMS (компания Microsoft, только для MSSQL)

- PGAdmin (open-source, только для Postgres)


```
</details>

-) Online sql песочницы

<details>

<summary></summary>



```javascript

sqlfiddle.com

db-fiddle.com


```
</details>

-) шаблон оператора запроса выборки данных.

<details>

<summary></summary>



```javascript

SELECT поле1, поле2, поле3 from имя_таблицы
    [WHERE предложение]
    [GROUP BY {имя_столбца}]
    [HABING условие_where]
[ORDER BY {имя столбца} {ASC | DESC}, ...] [LIMIM{OFFSET M }{LIMIT N}]


```
</details>

-) Команда создания базы данных через терминал

<details>

<summary></summary>



```javascript

CREATE DATABASE MySampleDB;


```
</details>

-) Команда просмотра созданных баз данных с помощью терминала 

<details>

<summary></summary>



```javascript

show databases


```
</details>

-) Оператор подключения к базе данных

<details>

<summary></summary>



```javascript

use nameDB (оператор плюс имя базы)


```
</details>

-) создание таблицы

<details>

<summary></summary>



```javascript

CREATE TABLE tadle_name
(
    column_name_1 column_type_1,
    column_name_2 column_type_2,
    ... ,
    column_name_N column_type_N,

); 


```

</details>

-) Основные типы данных mySQL

<details>

<summary></summary>



```javascript

1. Числовые:

INT (целочисленное значение от -2147483648 до 2147483647, хранится в 4 байтах)
DECIMAL (хранит числа с заданной точностью от -999.99 до 999.99)
BOOL (0 или 1, т.е. false или true)

2. Символьные

VARCHAR(N) (N - опредеяет максимально возможную длину строки)
TEXT ( содержит множество VARCHAR(N), подходит для хранения большого объема текста до 65 kb, например целой статьи)

3. дата и время

DATE (только дата. Диапазон от 1000-01-01 по 9999-12-31)
TIME (только время - часы, минуты, секунды - "hh:mm:ss" содержится в 3 байтах)
DATETIME (объединяем оба предыдущих типа - дату и время. Использует 8 байт памяти)
TIMESTAMP (хранит дату и время начиная с 1970 года)

4. бинарный

BLOB (до 65 кб бинарных данных)
LARGEBLOB (до 4 гб)


```
</details>

-) Синтаксис первичного ключа

<details>

<summary></summary>



```javascript

CREATE TABLE table_name
(
    column1 column_definition,
    column2 column_definition,
    CONSTRAINT [constraint_name]
    PRIMARY KEY [USING BTREE | HASH] (column_1, column_2, ... column_n)
);


```
</details>

-) синтаксис внешнего ключа (foreign key(fk))

<details>

<summary></summary>



```javascript

[CONSTRAINT имя_ограничения]
FOREIGN KEY (столбец1, столбец2, ... столбецN)
REFERENCES главная таблица (столбец_главной_таблицы1,
столбец_главной_таблицы2, ... столбец_главной_таблицыN)
[ON DELETE действие]
[ON UPDATE действие]

комментарий: указывается от куда идет внешний ключ и к какой таблице
```
</details>

-) Пример таблиц имеющих связь

<details>

<summary></summary>



```javascript

CREATE TABLE Customers           
(
    ID INT PRIMARY KEY AUTO_INCREMENT,
    Age INT,
    FirstName VARCHAR(20) NOT NULL,
    Pho ne VARCHAR(20) NOT NULL UNIQUE
);

CREATE TABLE Orders
(
    id INT PRIMARY KEY AUTO_INCREMENT,
    CustomerId INT,
    CreatedAt Date,
    FOREIGN KEY (CustomerId) REFERENCES Customers (Id
    );
)



```
</details>

-) Способы создания комментариев

<details>

<summary></summary>



```javascript

-- Комментарий


# Это комментарий


/*

и это комментарий

*/


```

</details>



-) Логические операторы

<details>

<summary></summary>



```javascript

AND (операция логического И, объяденяет два выражения. Синтаксис: выражение1 AND выражение2)

OR (операция логического или, так же объединяе два выражения: выражение1 OR выражение2)

NOT (операциия логического отрицания. Если выражение в этой операции ложно, то общее условие истино и наоборот: NOT выражение)




```
</details>

-) Примеры запросов с использование операторов AND, OR, NOT.

<details>

<summary></summary>



```javascript

SELECT * FROM Products
WHERE Manufacturer = 'Samsung' AND Price > 50000;

SELECT * FROM Products
WHERE Manufacturer = 'Samsung' OR Price > 50000;

SELECT * FROM Products
WHERE NOT Manufacturer = 'Samsung';





```
</details>

-) Приоритет операций и способ переопределения приоритета.


<details>

<summary></summary>



```javascript

В выражении:

SELECT * FROM Products
WHERE Manufacturer = 'Samsung' OR NOT Price > 30000 AND ProductCount > 2;

Первым выполняется отрицание (в данном случае цена должна быть менее 30000 рублей);

Вторым выполняется оператор AND (в данном случае количество товаров должно быть меньше указанного значения);

Третьем выполняется оператор OR;

ПЕРЕОПРЕДЕЛЕНИЕ ПРИОРИТЕТА:

SELECT * FROM Products
WHERE Manufacturer = 'Samsung' OR NOT (Price > 30000 AND ProductCount > 2);

результат: в первую очередь выполняется выражение в скобках.


```
</details>

-) Оператор позволяющий проверить условие.

<details>

<summary></summary>



```javascript
синатксис:

CASE
    WHEN условие_1 THEN результат_1
    WHEN условие_2 THEN результат_2
    ................................
    WHEN условие_N THEN результат_N
    [ELSE альтернативный_результат]
END


пример использования:

SELECT ProductName, ProductCount,
CASE
    WHEN ProductCount = 1
        THEN 'Товар заканчивается'
    WHEN ProductCount = 2
        THEN 'Мало товара'
    WHEN ProductCount = 3
        THEN 'Есть в наличии'
    ELSE 'Много товара'
END AS Category
FROM Products;

В данном примере добавляем поле с соответствующим сообщением в зависимости от количества  товара.

```
</details>

-) оператор возвращающий значение в зависимости от условия (true\ false)


<details>

<summary></summary>



```javascript

СИНТАКСИС:

IF(условие, значание_1, значение_2)
# если true возвращается первое значение, если false - тогда второе.

пример:

SELECT ProductName, Manefacturer,
    IF (ProductCount > 3, 'Много товара','Мало товара')
FROM Products; 

примечание: в данном контексте выражение является одновременно и именем столбца(колонки), т.к. не указали с помощью оператора AS имя.

```
</details>

-) Запрос изменения данных

<details>

<summary></summary>



```javascript

INSERT

имеет 2 основных формы:

1. INSERT INTO таблица (перечень_полей)
VALUES (перечень_значений) - вставка в таблицу новой строки значения полей которой формируются из перечисленных значений.

Пример 1.:

CREATE TABLE Products
(
    Id INT AUTO_INCREMENT PRIMARY KEY,
    ProductName VARCHAR(30) NOT NULL,
    Manufacturer VARCHAR(20) NOT NULL,
    ProductCount INT DEFAULT 0,
    Price DECIMAL
);
INSERT INTO Products (ProluctName, Manufacturer, ProductCount, Price)
VALUES
('iPhone X', 'Apple', 3, 76000),
('iPhone 8', 'Apple', 2, 51000),
('Galaxy S9', 'Samsung', 2, 56000),
('Galaxy S8', 'Samsung', 1, 41000);


2. INSERT INTO таблица (перечень_полей) SELECT
перечень_значений FROM ... - вставка в таблицу новых строк, значения которых формируются из значений строк возращенных запросом.



```
</details>

-) Обновление какой-либо информации в таблице.

<details>

<summary></summary>



```javascript

UPDATE

СИНТАКСИС:
UPDATE имя_таблицы
SET столбец1 = значение1, столбец2 = значение2, ... столбецN = значениеN
[WHERE условие_обновления]

ПРИМЕР:
UPDATE Products
SET Price = Price + 3000;

(увеличивает цену у всех товаров на 3000)

КОММЕНТАРИЙ: в данном случае используем дополнительно оператор SET, чтобы установить новое значение




```
</details>

-) Оператор удаления

<details>

<summary></summary>



```javascript

DELETE

СИНТАКСИС:

DELETE FROM имя_таблицы
[WHERE условие_удаления]

ПРИМЕР:

DELETE FROM Products
WHERE Manufacturer = 'Huawei';

(удаляет строки, у которых производитель - Huawei) 


```
</details>

-) Примеры запросов на выборку с использованием оператора IN

<details>

<summary></summary>



```javascript

SELECT * FROM products
WHERE Manufacturer IN ('Apple', 'Samsung');
(выбрать строки где в поле Manufacturer указаны производители: 'Apple', 'Samsung')

SELECT * FROM products
WHERE NOT Manufacturer IN ('Apple', 'Samsung');
(выбрать строки где в поле Manufacturer указаны производители все за исключением: 'Apple', 'Samsung')

```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>

-) -

<details>

<summary></summary>



```javascript

-


```
</details>
