-) Пример заголовков

<details>

<summary></summary>


```javascript

# Всем приятного вечера
## Завтра пятница
### **Планы на пятницу**

в браузере:
```
# Всем приятного вечера
## Завтра пятница
### **Планы на пятницу**

</details>


-) Пример  сложных списков

<details>

<summary></summary>


```javascript

* Работа
* Спорт
    * футбол
    * баскетбол
* Учить ДЗ
* Торт

В браузере:

```

* Работа
* Спорт
    * футбол
    * баскетбол
* Учить ДЗ
* Торт

</details>


-) Зачеркнутый текст

<details>

<summary></summary>


```javascript
Обрамление тильдами выводит зачеркнутый текст:
 ~~зачеркнутый текст ~~

В браузере:

```

 ~~зачеркнутый текст ~~

</details>



-) Создание таблицы

<details>

<summary></summary>


```javascript

    |№|имя|возраст|
    |-|---|-------|
    |1|Камила|23|
    |2|Адам|27|
    |3|Роланд|25|

В браузере:

```

|№|имя|возраст|
|-|---|-------|
|1|Камила|23|
|2|Адам|27|
|3|Роланд|25|

</details>


-) Рисунок

<details>

<summary></summary>


```javascript

![альтернативный текст](путь к рисунку)

```

</details>



-)  Таблицы с "чеками"

<details>

<summary></summary>



```javascript

### Студенты которые сдали зачет:
* [x] Камила|23|
* [ ] Адам|27|
* [x] Роланд|25|

В браузере:

```

### Студенты которые сдали зачет:
* [x] Камила
* [ ] Адам
* [x] Роланд

</details>

-) Линия

<details>

<summary></summary>


```javascript

---
в браузере:
```
---
</details>


-) ЦИТАТЫ 

<details>

<summary></summary>


```javascript
# Цитаты
(здесь мы будем цетировать)

> # Все будет хорошо
> ## Никода не ошиибается тот кто ничего не делает
> ### Если все идет хорощо - значит вы чего - то не знаете 
>> ### Ученье свет, а не ученье тьма


в браузере:
```
# Цитаты
(здесь мы будем цетировать)

> # Все ! будет хорошо !
> ## Никода не ошиибается тот кто ничего не делает
> ### Если все идет хорощо - значит вы чего - то не знаете 
>> ### Ученье свет, а не ученье тьма

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) Самый простой раскрывающийся блок

<details>

<summary></summary>



```javascript

<details>
  <summary>Легенда</summary>
  <p>Раскрывающийся текст</p>
</details>


```

</details>


-) Детали раскрывающугося блока

<details>

<summary></summary>



```javascript

https://doka.guide/html/details/

01.06.2023

Иногда нужно скрывать какую-то информацию на странице в специальном блоке. Чтобы в любой момент можно было кликнуть на этот блок и развернуть информацию. И свернуть обратно таким же кликом. Такой блок ещё называют «аккордеоном».

Как пишется Скопировать ссылку "Как пишется"
Тег <details> — это интерактивный элемент, при нажатии на который открывается блок с информацией — текстом или картинками. Нередко такие элементы можно встретить на страницах с часто задаваемыми вопросами (FAQ), где в заголовке (или легенде) написан вопрос, а ответом является содержимое «аккордеона».

Тег <summary> — это заголовок «аккордеона», так называемая легенда. Он необязателен — без него в качестве легенды будет написан текст «Подробнее», «Details» или нечто подобное — в зависимости от выбранного языка и браузера.

Собирается «аккордеон» очень просто: в <details> вкладываем <summary> и теги с информацией, которая будет показываться при нажатии.

По умолчанию «аккордеон» закрыт, но если мы хотим, чтобы его содержание показывалось сразу при загрузке страницы или открывать его из JavaScript, нужно добавить к нему атрибут open.

Подсказки:
💡 Можно вкладывать <details> в <details>.

💡 <details> — это интерактивный элемент, но вкладывать другие интерактивные элементы в него можно.

💡 В HTML-стандарте написано, что <summary> должен быть первым ребёнком в <details>, но на деле всё прекрасно работает, даже если <summary> находится между тегами содержательной части «аккордеона».

💡 Вёрстка не ломается, если вложить <summary> в <summary> — в таком случае будет только один элемент ::marker (треугольник перед легендой).

💡 Если в «аккордеоне» будет несколько <summary> подряд, браузер будет реагировать только на первый, а остальные даже не отобразятся, хотя будут стоять в разметке.

💡 Если указать просто <summary> без <details>, то он будет вести себя как обычный <div> — блочный элемент без интерактивности.

На практике:
Лена Райан советует:
🛠 Если присутствует тег <summary>, то псевдоэлемент ::marker можно стилизовать — правда, он реагирует не на все свойства, но как минимум вы сможете поменять цвет и размер шрифта. Раньше для его стилизации нужно было использовать ::-webkit-details-marker.

Татьяна Фокина советует:
🛠 Можно заменить иконку по умолчанию с помощью <img>. В этом случае оставьте значение атрибута alt пустым, так как это декоративное изображение.

<details open>
  <summary>
    <img src="images/arrow-down.svg" alt="">
    Сроки доставки
  </summary>
  <p>Если закажите экспресс-доставку голубями, она займёт от 6 до 8 дней. Обычная доставка улиткой занимает примерно 20 дней.</p>
</details>

```

</details>



-) Образец HTML-плеера (для запуска в бразере) c js ограничивающим видеозапись ее одним определенным фрагментом.

<details>

<summary></summary>


```javascript

<!DOCTYPE html> 
<html> 


<body> 
  <details>
    <summary> -) Введние. Рассматриваемые в лекции темы:</summary>
    <p>
      <h4>Что такое структуры данных, зачем они нужны при разработке программ. Особенности массивов, их плюсы и минусы, в каких случаях их можно продуктивно использовать. Оценка сложности популярных алгоритмов. </h4>
<video id="myVideo" width="95%" height="95%" controls ontimeupdate = "setCurTime()">
<source src="file:///C:/Users/Vladi/Documents/EDUCATION/Поименованные/аlgorithms/Lesson/2/Урок%202.%20Структуры%20данных.%20Массивы.%20Алгоритмы%20массивов%20(720p).mp4#t=s,f" type="video/mp4">
  Your browser does not support the video tag.
</video><br>

<p id="demo"></p>

<script>
// Get the video element with id="myVideo"
var vid = document.getElementById("myVideo");
var s = 93; 
var f = 130;
// Attach a "timeupdate" event to the video
vid.addEventListener("timeupdate", getCurTime);

// Display the current playback position of the video in a p element with id="demo"
function getCurTime() { 
    document.getElementById("demo").innerHTML = "The current playback position is " + vid.currentTime + " seconds.";
} 

// Set the current playback position to 5 seconds
function setCurTime() {
    if (vid.currentTime < s || vid.currentTime > f){
    vid.currentTime = s;
    } 
 } 
</script> 
</p>
</details>
</body> 
</html>

```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>


-) 

<details>

<summary></summary>


```javascript


```

</details>

