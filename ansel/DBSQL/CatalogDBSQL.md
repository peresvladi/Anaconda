
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

-) операторо запроса выборки данных.

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

</details>

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
